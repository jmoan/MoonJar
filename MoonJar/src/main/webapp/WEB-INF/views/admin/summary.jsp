<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    <!-- Morris Charts CSS -->
    <link href="/resources/css/plugins/morris.css" rel="stylesheet">
    <!-- Morris Charts JavaScript -->
    <script src="/resources/js/plugins/morris/raphael.min.js"></script>
    <script src="/resources/js/plugins/morris/morris.min.js"></script>
    <script src="/resources/js/plugins/morris/morris-data.js"></script>
    
<div class="container-fluid">

	<!-- Page Heading -->
	<div class="row">
	    <div class="col-lg-12">
	        <h1 class="page-header">
	  			요약
	        </h1>                        
	    </div>
	</div>
	<!-- /.row -->
	
	<div class="row">
	    <div class="col-lg-3 col-md-6">
	        <div class="panel panel-primary">
	            <div class="panel-heading">
	                <div class="row">
	                    <div class="col-xs-3">
	                        <i class="fa fa-comments fa-5x"></i>
	                    </div>
	                    <div class="col-xs-9 text-right">
	                        <div class="huge">26</div>
	                        <div>새 댓글!</div>
	                    </div>
	                </div>
	            </div>
	            <a href="#">
	                <div class="panel-footer">
	                    <span class="pull-left">View Details</span>
	                    <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
	                    <div class="clearfix"></div>
	                </div>
	            </a>
	        </div>
	    </div>
	    <div class="col-lg-3 col-md-6">
	        <div class="panel panel-green">
	            <div class="panel-heading">
	                <div class="row">
	                    <div class="col-xs-3">
	                        <i class="fa fa-tasks fa-5x"></i>
	                    </div>
	                    <div class="col-xs-9 text-right">
	                        <div class="huge">12</div>
	                        <div>새 글!</div>
	                    </div>
	                </div>
	            </div>
	            <a href="#">
	                <div class="panel-footer">
	                    <span class="pull-left">View Details</span>
	                    <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
	                    <div class="clearfix"></div>
	                </div>
	            </a>
	        </div>
	    </div>                    
	</div>
	<!-- /.row -->
	<div class="row">
         <div class="col-lg-12">
             <div class="panel panel-red">
                 <div class="panel-heading">
                     <h3 class="panel-title"><i class="fa fa-long-arrow-right"></i> 방문자수</h3>
                 </div>
                 <div class="panel-body">
                     <div id="morris-line-chart"></div>
                     <div class="text-right">
                         <a href="#">View Details <i class="fa fa-arrow-circle-right"></i></a>
                     </div>
                 </div>
             </div>
         </div>
	</div>
	<!-- /.row -->
</div>