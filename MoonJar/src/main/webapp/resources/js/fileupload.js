$().ready(function(){
	$("a#picture").on("click",function(){
		$("input#uploadPicture").click();
	});
	
	$("input#uploadPicture").on("change",function() {
		
		if(confirm("사진교체 할까요?")){		
	    	var frm = $("input#uploadPicture").closest("form");
	    	frm.attr("method","post");
	    	frm.attr("action","/admin/uploadPicture");
	    	frm.attr("ENCTYPE","multipart/form-data");
	    	frm.ajaxForm({
	    		success: function(data){
	    			$("div#face-picture > img").attr("src","/uploads/picture/"+data);
	    			alert("업로드 완료");
	    		}	    		
	    	});
	    	frm.submit();
	    }
	});
	
	$("a#works").on("click",function(){
		$("input#uploadWorks").click();
	});
	
	$("input#uploadWorks").on("change",function() {
		
		if(confirm("작품사진 올릴까요?")){		
	    	var frm = $("input#uploadWorks").closest("form");
	    	frm.attr("method","post");
	    	frm.attr("action","/admin/uploadWorks");
	    	frm.attr("ENCTYPE","multipart/form-data");
	    	frm.ajaxForm({
	    		success: function(){
	    			alert("업로드 완료");
	    		}	    		
	    	});
	    	frm.submit();
	    }
	});
});