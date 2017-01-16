$().ready(function(){
	$("a#picture").on("click",function(){
		$("input#uploadPicture").click();
	});
	
	$("input#uploadPicture").on("change",function() {
	     var formData = new FormData();
	     formData.append('uploadPicture', $('input#uploadPicture')[0].files[0]);
	     console.log(formData);
	     
	     $.ajax({
	        url : '/admin/uploadPicture',
	        processData : false,
	        contentType : false,
	        data : formData,
	        type : 'post',
	        success : function(data){
	        	alert(data);
	        	$("div#face-picture > img").attr("src","/uploads/picture/"+data);
	        },
	        error : function(){
	        	console.log("error");
	        }
	     });
	});
});