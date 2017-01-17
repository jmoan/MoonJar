<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<script type="text/javascript" src="/resources/js/fileupload.js"></script>
<script type="text/javascript" src="/resources/js/jquery.form.js"></script>

<div class="container-fluid">
	
	<!-- Page Heading -->
	<div class="row">
	    <div class="col-lg-12">
	        <h1 class="page-header">
	  			메인화면 컨텐츠 관리
	        </h1>                        
	    </div>
	</div>
	
	<div id="row">
    	<div class="col-lg-2">
             <div class="panel panel-red">
                 <div class="panel-heading">
                     <h3 class="panel-title"><i class="fa fa-long-arrow-right"></i> 얼굴사진</h3>
                 </div>
                 <div class="panel-body">
                     <div id="face-picture">
                     	<c:if test="${fileName != null }">
                     		<img src="/uploads/picture/${fileName }">
                     	</c:if>
                     </div>
                     <div class="text-right">
                     	<form>
                     		<input type="file" name="uploadPicture" id="uploadPicture"/>
                     	</form>
                        <a id="picture">사진올리기 <i class="fa fa-arrow-circle-right"></i></a>
                     </div>
                 </div>
             </div>
         </div>
    </div>
    <div id="row">
    	<div class="col-lg-12">
             <div class="panel panel-red">
                 <div class="panel-heading">
                     <h3 class="panel-title"><i class="fa fa-long-arrow-right"></i> 메인작품</h3>
                 </div>
                 <div class="panel-body">
                 	 <c:forEach var="pic" items="${workFiles }">
	                     <div class="work-pictures" class="col-lg-2">
	                     	<img src="/uploads/works/${pic }">
	                     </div>
                     </c:forEach>
                     <div class="text-right">
                     	<form>
                     		<input type="file" multiple="multiple" name="uploadWorks[]" id="uploadWorks"/>
                     	</form>
                        <a id="works">사진올리기 <i class="fa fa-arrow-circle-right"></i></a>
                     </div>
                 </div>
             </div>
         </div>
    </div>
</div>