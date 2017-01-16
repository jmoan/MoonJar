/**
 * 
 */

var idCheck = false;

function checkDuplicateId(){
		
	$.ajax({
		url: '/checkId',		
		data: {id:$("input[name=id]").val()},
		type: 'post',
		success: function(result){
			if(result == "success"){
				idCheck = true;
				$("span#checkSpanId").html("사용가능").css("color","green");
			}else{
				idCheck = false;
				$("span#checkSpanId").html("사용불가").css("color","red");
			}
		},
		error: function(result){
			console.log(result);
		}
	});
};

function checkPasswordRe(){
	if($("input[name=password]").val() != "" && $("input[name=passwordRe]").val() != ""){
		if($("input[name=password]").val() != $("input[name=passwordRe]").val()){
			$("span#checkSpanPwd").html("비밀번호가 다릅니다").css("color","red");
		}else{
			$("span#checkSpanPwd").empty();
		}
	}
}
function chechInvalidate(){
	
	if(!idCheck){
		alert("아이디 중복체크를 해주세요");		
		return false;
	}
	
	var elements = $("form>input#formValue");
		
	for(var i=0;i<elements.length;i++){
		if($(elements[i]).val() === "" || $(elements[i]).val() === null || $(elements[i]).val() === undefined){
			alert("'" + $(elements[i]).attr("alt") + "' 칸을 입력해주세요.");
			$(elements[i]).focus();
			return false;
		}
	}	
};