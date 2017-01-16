/**
 * 
 */


$(document).ready(function(){
	$(".navbar").find("a").on("click",function(e){
		if($(this).attr("class") != "navbar-brand"){
			$("ul.nav").find("li").removeClass("active");
			$(this).closest("li").addClass("active");
			
			e.preventDefault();
			$('div#page-wrapper').load($(this).attr("href"));
		}
	});
	
	$("#logout").on("click",function(){
		if(confirm("로그아웃 하시겠습니까?")){
			location.href="/logout";
		}
	});
		
	
});