<script src="/resources/js/common.js"></script>

<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="/admin/index/">관리자 페이지</a>
    </div>
    <!-- Top Menu Items -->
    <ul class="nav navbar-right top-nav">
        <li><a href="#" id="logout"><i class="fa fa-fw fa-power-off"></i> Log Out</a></li>
    </ul>
    <!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
    <div class="collapse navbar-collapse navbar-ex1-collapse">
        <ul class="nav navbar-nav side-nav">
            <li class="active">
                <a href="/admin/summary"><i class="fa fa-fw fa-dashboard"></i> 요약</a>
            </li>
            <li>
                <a href="javascript:;" data-toggle="collapse" data-target="#demo"><i class="fa fa-fw fa-arrows-v"></i> 컨텐츠관리 <i class="fa fa-fw fa-caret-down"></i></a>
                <ul id="demo" class="collapse">
                    <li>
                        <a href="/admin/contents-main/">메인화면</a>
                    </li>
                    <li>
                        <a href="/admin/contents-gallery/">갤러리</a>
                    </li>
                    <li>
                        <a href="/admin/contents-exhibition/">전시</a>
                    </li>
                    <li>
                        <a href="/admin/contents-note/">작가노트</a>
                    </li>
                </ul>
            </li>           
        </ul>
    </div>
</nav>