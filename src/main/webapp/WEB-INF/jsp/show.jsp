<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <title>社員管理</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/jquery-ui.min.css">
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/show.css">
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.css">

    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-ui.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
</head>
<body>
<div id="container" class="panel panel-primary">
    <div id="title" class="panel-heading">
        <h3 class="panel-title">社員情報管理</h3>
    </div>
    <div id="white" class="panel-body">
        <a id="addNew" class="btn btn-primary" href="${pageContext.request.contextPath}/syain/toadd">
            添加社員情報
        </a>
        <form id="search_form" action="${pageContext.request.contextPath }/syain/select" method="post">
        <div id="input" class="input-group">
            <input type="text" class="form-control" name="firstNameKanji" placeholder="" value="">
            <span class="input-group-btn">
						<button class="btn btn-default" type="submit">
							検索
						</button>
            </span>
        </div><!-- /input-group -->
        </form>
    </div>
    <div>
    <table id="table" class="table table-bordered table-condensed">
        <thead>
        <tr id="tr1">
            <th rowspan="2">番号</th>
            <th rowspan="2">社員名（漢字）＿姓</th>
            <th rowspan="2">社員名（漢字）＿名</th>
            <th rowspan="2">社員名（カタカナ）＿姓</th>
            <th rowspan="2">社員名（カタカナ）＿名</th>
            <th rowspan="2">社員名（英語）＿性</th>
            <th rowspan="2">社員名（英語）＿名</th>
            <th rowspan="2">性別</th>
            <th rowspan="2">誕生日</th>
            <th rowspan="2">国籍</th>
            <th rowspan="2">出身地</th>
            <th rowspan="2">配偶者有り無し</th>
            <th rowspan="2">パスポート番号</th>
            <th rowspan="2">パスポート有効日</th>
            <th rowspan="2">ビザ期間</th>
            <th rowspan="2">ビザ有効日</th>
            <th rowspan="2">在留資格</th>
            <th rowspan="2">マイナンバー</th>
            <th rowspan="2">在留番号</th>
            <th rowspan="2">所属会社</th>
            <th rowspan="2">入社日</th>
            <th rowspan="2">退社日</th>
            <th rowspan="2">職業種類</th>
            <th rowspan="2">来日時期</th>
            <th rowspan="2">備考</th>
            <th rowspan="2">日本の住所の郵便</th>
            <th rowspan="2">日本の住所1</th>
            <th rowspan="2">日本の住所2</th>
            <th rowspan="2">最寄駅</th>
            <th rowspan="2">携帯電話</th>
            <th rowspan="2">メールアドレス</th>
            <th rowspan="2">WECHAT</th>
            <th rowspan="2">Line</th>
            <th rowspan="2">母国の住所</th>
            <th rowspan="2">母国の緊急連絡先</th>
            <th rowspan="2">最終学歴</th>
            <th rowspan="2">学校名</th>
            <th rowspan="2">専門名</th>
            <th rowspan="2">卒業年月日</th>
            <th rowspan="2">業務年数</th>
            <th colspan="7">技術経験</th>
            <th rowspan="2">論理削除フラグ</th>
            <th rowspan="2">登録日</th>
            <th rowspan="2">更新日</th>
            <th rowspan="2" colspan="3">社員_職歴</th>
            <th rowspan="2" colspan="3">社員_経歴</th>
            <th rowspan="2" colspan="5">操作</th>
        </tr>
        <tr id="tr2">
            <th>OS</th>
            <th>言語</th>
            <th>DB</th>
            <th>Webサーバ</th>
            <th>FrameWork</th>
            <th>その他</th>
            <th>備考及び自己紹介</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${pageInfo.list}" var="SyainMain">
        <tr>
            <td>${SyainMain.syainId}</td>
            <td>${SyainMain.firstNameKanji}</td>
            <td>${SyainMain.lastNameKanji}</td>
            <td>${SyainMain.firstNameKana}</td>
            <td>${SyainMain.lastNameKana}</td>
            <td>${SyainMain.firstNameEigo}</td>
            <td>${SyainMain.lastNameEigo}</td>
            <td>
                <c:if test="${SyainMain.seibetu==1}">男</c:if>
                <c:if test="${SyainMain.seibetu==0}">女</c:if>
            </td>
            <td><fmt:formatDate value="${SyainMain.tanjyobi}" pattern="yyyy-MM-dd"/></td>
            <td>
                <c:if test="${SyainMain.kokuseki==1}">中国</c:if>
                <c:if test="${SyainMain.kokuseki==2}">日本</c:if>
                <c:if test="${SyainMain.kokuseki==3}">韩国</c:if>
            </td>
            <td>${SyainMain.syussinn}</td>
            <td>
                <c:if test="${SyainMain.haigusya==0}">なし</c:if>
                <c:if test="${SyainMain.haigusya==1}">あり</c:if>
            </td>
            <td>${SyainMain.passportNum}</td>
            <td>
                <fmt:formatDate value="${SyainMain.passportEndDate}" pattern="yyyy-MM-dd"/>
            </td>
            <td>${SyainMain.visaKikan}</td>
            <td><fmt:formatDate value="${SyainMain.visaEndDate}" pattern="yyyy-MM-dd"/></td>
            <td>${SyainMain.zairyuSikaku}</td>
            <td>${SyainMain.kojinNum}</td>
            <td>${SyainMain.zairyuNum}</td>
            <td>
                <c:if test="${SyainMain.syozokuKaisya==1}">株式会社ブライトスター</c:if>
                <c:if test="${SyainMain.syozokuKaisya==2}">株式会社トップクラウド</c:if>
            </td>
            <td><fmt:formatDate value="${SyainMain.nyuusyaDate}" pattern="yyyy-MM-dd"/></td>
            <td><fmt:formatDate value="${SyainMain.taisyaDate}" pattern="yyyy-MM-dd"/></td>
            <td>
                <c:if test="${SyainMain.syokugyoKind==1}">役員</c:if>
                <c:if test="${SyainMain.syokugyoKind==2}">総務</c:if>
                <c:if test="${SyainMain.syokugyoKind==3}">IT営業</c:if>
                <c:if test="${SyainMain.syokugyoKind==4}">ITエンジニア</c:if>
                <c:if test="${SyainMain.syokugyoKind==5}">不動産スタッフ</c:if>
                <c:if test="${SyainMain.syokugyoKind==6}">個人事業主</c:if>
            </td>
            <td><fmt:formatDate value="${SyainMain.rainitiDate}" pattern="yyyy-MM-dd"/></td>
            <td>${SyainMain.bikou}</td>
            <td>${SyainMain.yuubin}</td>
            <td>${SyainMain.jyusyo1}</td>
            <td>${SyainMain.jyusyo2}</td>
            <td>${SyainMain.moyoriEki}</td>
            <td>${SyainMain.tel}</td>
            <td>${SyainMain.email}</td>
            <td>${SyainMain.wechat}</td>
            <td>${SyainMain.line}</td>
            <td>${SyainMain.bokokuJyusyo}</td>
            <td>${SyainMain.bokokuKinnkyuuRennraku}</td>
            <td>
                <c:if test="${SyainMain.saisyuuGakureki==1}">大学院(博士)</c:if>
                <c:if test="${SyainMain.saisyuuGakureki==2}">大学院(修士)</c:if>
                <c:if test="${SyainMain.saisyuuGakureki==3}">大学</c:if>
                <c:if test="${SyainMain.saisyuuGakureki==4}">短期大学</c:if>
                <c:if test="${SyainMain.saisyuuGakureki==5}">専門学校</c:if>
            </td>
            <td>${SyainMain.gakkouName}</td>
            <td>${SyainMain.sennmomName}</td>
            <td><fmt:formatDate value="${SyainMain.sotugyoDate}" pattern="yyyy-MM-dd"/></td>
            <td>${SyainMain.gyumuNensu}</td>
            <td>
                <c:if test="${SyainMain.itOs=='1-1'}">DOS◎</c:if>
                <c:if test="${SyainMain.itOs=='1-2'}">DOS〇</c:if>
                <c:if test="${SyainMain.itOs=='1-3'}">DOS△</c:if>
                <c:if test="${SyainMain.itOs=='2-1'}">Windows◎</c:if>
                <c:if test="${SyainMain.itOs=='2-2'}">Windows〇</c:if>
                <c:if test="${SyainMain.itOs=='2-3'}">Windows△</c:if>
                <c:if test="${SyainMain.itOs=='3-1'}">Unix◎</c:if>
                <c:if test="${SyainMain.itOs=='3-2'}">Unix〇</c:if>
                <c:if test="${SyainMain.itOs=='3-3'}">Unix△</c:if>
            </td>
            <td>
                <c:if test="${fn:contains(SyainMain.itGengo,'1-1')}">JAVA◎</c:if>
                <c:if test="${fn:contains(SyainMain.itGengo,'1-2')}">JAVA〇</c:if>
                <c:if test="${fn:contains(SyainMain.itGengo,'1-3')}">JAVA△</c:if>

                <c:if test="${fn:contains(SyainMain.itGengo,'2-1')}">VB◎</c:if>
                <c:if test="${fn:contains(SyainMain.itGengo,'2-2')}">VB〇</c:if>
                <c:if test="${fn:contains(SyainMain.itGengo,'2-3')}">VB△</c:if>

                <c:if test="${fn:contains(SyainMain.itGengo,'3-1')}">C◎</c:if>
                <c:if test="${fn:contains(SyainMain.itGengo,'3-2')}">C〇</c:if>
                <c:if test="${fn:contains(SyainMain.itGengo,'3-3')}">C△</c:if>

            </td>
            <td>
                <c:if test="${fn:contains(SyainMain.itDb,'1-1')}">Oracle◎</c:if>
                <c:if test="${fn:contains(SyainMain.itDb,'1-2')}">Oracle〇</c:if>
                <c:if test="${fn:contains(SyainMain.itDb,'1-3')}">Oracle△</c:if>

                <c:if test="${fn:contains(SyainMain.itDb,'2-1')}">SQLServer◎</c:if>
                <c:if test="${fn:contains(SyainMain.itDb,'2-2')}">SQLServer〇</c:if>
                <c:if test="${fn:contains(SyainMain.itDb,'2-3')}">SQLServer△</c:if>

                <c:if test="${fn:contains(SyainMain.itDb,'3-1')}">MySql◎</c:if>
                <c:if test="${fn:contains(SyainMain.itDb,'3-2')}">MySql〇</c:if>
                <c:if test="${fn:contains(SyainMain.itDb,'3-3')}">MySql△</c:if>
            </td>
            <td>
                <c:if test="${fn:contains(SyainMain.itWebServer,'1-1')}">WebLogic◎</c:if>
                <c:if test="${fn:contains(SyainMain.itWebServer,'1-2')}">WebLogic〇</c:if>
                <c:if test="${fn:contains(SyainMain.itWebServer,'1-3')}">WebLogic△</c:if>

                <c:if test="${fn:contains(SyainMain.itWebServer,'2-1')}">Apache◎</c:if>
                <c:if test="${fn:contains(SyainMain.itWebServer,'2-2')}">Apache〇</c:if>
                <c:if test="${fn:contains(SyainMain.itWebServer,'2-3')}">Apache△</c:if>

                <c:if test="${fn:contains(SyainMain.itWebServer,'3-1')}">IIS◎</c:if>
                <c:if test="${fn:contains(SyainMain.itWebServer,'3-2')}">IIS〇</c:if>
                <c:if test="${fn:contains(SyainMain.itWebServer,'3-3')}">IIS△</c:if>
            </td>
            <td>
                <c:if test="${fn:contains(SyainMain.itFw,'1-1')}">Struts◎</c:if>
                <c:if test="${fn:contains(SyainMain.itFw,'1-2')}">Struts〇</c:if>
                <c:if test="${fn:contains(SyainMain.itFw,'1-3')}">Struts△</c:if>

                <c:if test="${fn:contains(SyainMain.itFw,'2-1')}">WebWork◎</c:if>
                <c:if test="${fn:contains(SyainMain.itFw,'2-2')}">WebWork〇</c:if>
                <c:if test="${fn:contains(SyainMain.itFw,'2-3')}">WebWork△</c:if>

                <c:if test="${fn:contains(SyainMain.itFw,'3-1')}">Spring◎</c:if>
                <c:if test="${fn:contains(SyainMain.itFw,'3-2')}">Spring〇</c:if>
                <c:if test="${fn:contains(SyainMain.itFw,'3-3')}">Spring△</c:if>
            </td>
            <td>
                <c:if test="${fn:contains(SyainMain.itOther,'1-1')}">Eclipse◎</c:if>
                <c:if test="${fn:contains(SyainMain.itOther,'1-2')}">Eclipse〇</c:if>
                <c:if test="${fn:contains(SyainMain.itOther,'1-3')}">Eclipse△</c:if>

                <c:if test="${fn:contains(SyainMain.itOther,'2-1')}">.NET IDE◎</c:if>
                <c:if test="${fn:contains(SyainMain.itOther,'2-2')}">.NET IDE〇</c:if>
                <c:if test="${fn:contains(SyainMain.itOther,'2-3')}">.NET IDE△</c:if>

                <c:if test="${fn:contains(SyainMain.itOther,'3-1')}">Ultra Edit◎</c:if>
                <c:if test="${fn:contains(SyainMain.itOther,'3-2')}">Ultra Edit〇</c:if>
                <c:if test="${fn:contains(SyainMain.itOther,'3-3')}">Ultra Edit△</c:if>
                    </td>
            <td>${SyainMain.itBikou}</td>
            <td>
                <c:if test="${SyainMain.deleteFlag==0}">有効</c:if>
                <c:if test="${SyainMain.deleteFlag==1}">削除</c:if>
            </td>
            <td><fmt:formatDate value="${SyainMain.tourokubi}" pattern="yyyy-MM-dd"/></td>
            <td><fmt:formatDate value="${SyainMain.kousinnbi}" pattern="yyyy-MM-dd"/></td>
            <td colspan="3"><a  class="btn btn-info">職歴</a></td>
            <td colspan="3"><a  class="btn btn-info">経歴</a></td>
            <td colspan="5">
                <a class="btn btn-danger"  onclick="delete_syainMain(${SyainMain.syainId})">削除</a>
                <a onclick="edit_syainMain(${SyainMain.syainId})" class="btn btn-warning" href="#" data-toggle="modal" data-target="#updateModal">更新</a>
            </td>
        </tr>

        </c:forEach>
        </tbody>
    </table>
    </div>
    <div id="foot">
        <ul class="pagination">
            <li><a href="${pageContext.request.contextPath}/syain/show?page=${pageInfo.navigateFirstPage}" aria-label="Previous">トップ</a></li>
            <li><a href="${pageContext.request.contextPath}/syain/show?page=${pageInfo.prePage}">前へ</a></li>
            <c:forEach begin="1" end="${pageInfo.pages}" var="pageNum">
                <c:choose>
                    <c:when test="${pageInfo.pageNum == pageNum}">
                        <li class="active"><a href="${pageContext.request.contextPath}/syain/show?page=${pageNum}">${pageNum}</a></li>
                    </c:when>
                    <c:otherwise>
                        <li><a href="${pageContext.request.contextPath}/syain/show?page=${pageNum}">${pageNum}</a></li>
                    </c:otherwise>
                </c:choose>
            </c:forEach>
            <li><a href="${pageContext.request.contextPath}/syain/show?page=${pageInfo.nextPage}">次へ</a></li>
            <li><a href="${pageContext.request.contextPath}/syain/show?page=${pageInfo.navigateLastPage}" aria-label="Next">最後</a></li>
        </ul>
    </div>



    <!-- 模态框（Modal） -->
    <div class="modal fade" id="updateModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                        &times;
                    </button>
                    <h4 class="modal-title" id="myModalLabel">
                        更改社员基本信息
                    </h4>
                </div>
                <div class="modal-body">
                    <!-- 表单开始 -->
                    <form id="syainMain_form" class="form-horizontal">

                        <div class="form-group">
                            <label for="firstNameKanji" class="col-sm-2 control-label">社員名（漢字）＿姓</label>
                            <div class="col-sm-10">
                                <input id="syainId" type="hidden" name="syainId">
                                <input type="text" id="firstNameKanji" name="firstNameKanji"  class="form-control"  placeholder="请输入社員名（漢字）＿姓">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="lastNameKanji" class="col-sm-2 control-label">社員名（漢字）＿名</label>
                            <div class="col-sm-10">
                                <input type="text" id="lastNameKanji" name="lastNameKanji"  class="form-control"  placeholder="请输入社員名（漢字）＿名">
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="firstNameKana" class="col-sm-2 control-label">社員名（カタカナ）＿姓</label>
                            <div class="col-sm-10">
                                <input type="text" id="firstNameKana" name="firstNameKana"  class="form-control"  >
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="lastNameKana" class="col-sm-2 control-label">社員名（カタカナ）＿姓</label>
                            <div class="col-sm-10">
                                <input type="text" id="lastNameKana" name="lastNameKana"  class="form-control" >
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="firstNameEigo" class="col-sm-2 control-label">社員名（英語）＿性</label>
                            <div class="col-sm-10">
                                <input type="text" id="firstNameEigo" name="firstNameEigo"  class="form-control"  >
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="lastNameEigo" class="col-sm-2 control-label">社員名（英語）＿名</label>
                            <div class="col-sm-10">
                                <input type="text" id="lastNameEigo" name="lastNameEigo"  class="form-control" >
                            </div>
                        </div>
                        <div class="form-group">
                            <label id="seibetu" class="col-sm-2 control-label">性别</label>
                            <div class="col-sm-10">
                                <input type="radio" name="seibetu" value="1">男
                                <input type="radio" name="seibetu" value="0">女
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="tanjyobi" class="col-sm-2 control-label">誕生日</label>
                            <div class="col-sm-10">
                                <input type="text" id="tanjyobi" name="tanjyobi"  class="form-control"  >
                            </div>
                        </div>

                        <div class="form-group">
                            <label  class="col-sm-2 control-label">国籍</label>
                            <div class="col-sm-10">
                                <input  type="radio" name="kokuseki" value="1" >中国
                                <input  type="radio" name="kokuseki" value="2" >日本
                                <input  type="radio" name="kokuseki" value="3" >韓国
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="syussinn" class="col-sm-2 control-label">出身地</label>
                            <div class="col-sm-10">
                                <input type="text" id="syussinn" name="syussinn"  class="form-control"  >
                            </div>
                        </div>
                        <div class="form-group">
                            <label id="haigusya" class="col-sm-2 control-label">配偶者有り無し</label>
                            <div class="col-sm-10">
                                <input type="radio" name="haigusya" value="0">なし
                                <input type="radio" name="haigusya" value="1">あり
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="passportNum" class="col-sm-2 control-label">パスポート番号</label>
                            <div class="col-sm-10">
                                <input type="text" id="passportNum" name="passportNum"  class="form-control"  >
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="passportEndDate" class="col-sm-2 control-label">パスポート有効日</label>
                            <div class="col-sm-10">
                                <input type="text" id="passportEndDate" name="passportEndDate"  class="form-control"  >
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="visaKikan" class="col-sm-2 control-label">ビザ期間</label>
                            <div class="col-sm-10">
                                <input type="text" id="visaKikan" name="visaKikan"  class="form-control"  >
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="visaEndDate" class="col-sm-2 control-label">ビザ有効日</label>
                            <div class="col-sm-10">
                                <input type="text" id="visaEndDate" name="visaEndDate"  class="form-control"  >
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="zairyuSikaku" class="col-sm-2 control-label">在留資格</label>
                            <div class="col-sm-10">
                                <input type="text" id="zairyuSikaku" name="zairyuSikaku"  class="form-control"  >
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="kojinNum" class="col-sm-2 control-label">マイナンバー</label>
                            <div class="col-sm-10">
                                <input type="text" id="kojinNum" name="kojinNum"  class="form-control"  >
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="zairyuNum" class="col-sm-2 control-label">在留番号</label>
                            <div class="col-sm-10">
                                <input type="text" id="zairyuNum" name="zairyuNum"  class="form-control"  >
                            </div>
                        </div>
                        <div class="form-group">
                            <label id="syozokuKaisya" class="col-sm-2 control-label">所属会社</label>
                            <div class="col-sm-10">
                                <input  type="radio" name="syozokuKaisya" value="1">株式会社ブライトスター
                                <input  type="radio" name="syozokuKaisya" value="2">株式会社トップクラウド
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="nyuusyaDate" class="col-sm-2 control-label">入社日</label>
                            <div class="col-sm-10">
                                <input type="text" id="nyuusyaDate" name="nyuusyaDate"  class="form-control"  >
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="taisyaDate" class="col-sm-2 control-label">退社日</label>
                            <div class="col-sm-10">
                                <input type="text" id="taisyaDate" name="taisyaDate"  class="form-control"  >
                            </div>
                        </div>
                        <div class="form-group">
                            <label id="syokugyoKind" class="col-sm-2 control-label">職業種類</label>
                            <div class="col-sm-10">
                                <input  type="radio" name="syokugyoKind" value="1">役員
                                <input  type="radio" name="syokugyoKind" value="2">総務
                                <input  type="radio" name="syokugyoKind" value="3">IT営業
                                <input  type="radio" name="syokugyoKind" value="4">ITエンジニア
                                <input  type="radio" name="syokugyoKind" value="5">不動産スタッフ
                                <input  type="radio" name="syokugyoKind" value="6">個人事業主
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="rainitiDate" class="col-sm-2 control-label">来日時期</label>
                            <div class="col-sm-10">
                                <input type="text" id="rainitiDate" name="rainitiDate"  class="form-control"  >
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="bikou" class="col-sm-2 control-label">備考</label>
                            <div class="col-sm-10">
                                <input type="text" id="bikou" name="bikou"  class="form-control"  >
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="yuubin" class="col-sm-2 control-label">日本の住所の郵便</label>
                            <div class="col-sm-10">
                                <input type="text" id="yuubin" name="yuubin"  class="form-control"  >
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="jyusyo1" class="col-sm-2 control-label">日本の住所1</label>
                            <div class="col-sm-10">
                                <input type="text" id="jyusyo1" name="jyusyo1"  class="form-control"  >
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="jyusyo2" class="col-sm-2 control-label">日本の住所2</label>
                            <div class="col-sm-10">
                                <input type="text" id="jyusyo2" name="jyusyo2"  class="form-control" >
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="moyoriEki" class="col-sm-2 control-label">最寄駅</label>
                            <div class="col-sm-10">
                                <input type="text" id="moyoriEki" name="moyoriEki"  class="form-control"  >
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="tel" class="col-sm-2 control-label">携帯電話</label>
                            <div class="col-sm-10">
                                <input type="text" id="tel" name="tel"  class="form-control"  >
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="email" class="col-sm-2 control-label">メールアドレス</label>
                            <div class="col-sm-10">
                                <input type="text" id="email" name="email"  class="form-control"  >
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="wechat" class="col-sm-2 control-label">WECHAT</label>
                            <div class="col-sm-10">
                                <input type="text" id="wechat" name="wechat"  class="form-control"  >
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="line" class="col-sm-2 control-label">Line</label>
                            <div class="col-sm-10">
                                <input type="text" id="line" name="line"  class="form-control"  >
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="bokokuJyusyo" class="col-sm-2 control-label">母国の住所</label>
                            <div class="col-sm-10">
                                <input type="text" id="bokokuJyusyo" name="bokokuJyusyo"  class="form-control" >
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="bokokuKinnkyuuRennraku" class="col-sm-2 control-label">母国の緊急連絡先</label>
                            <div class="col-sm-10">
                                <input type="text" id="bokokuKinnkyuuRennraku" name="bokokuKinnkyuuRennraku"  class="form-control">
                            </div>
                        </div>
                        <div class="form-group">
                            <label id="saisyuuGakureki" class="col-sm-2 control-label">最終学歴</label>
                            <div class="col-sm-10">
                                <input  type="radio" name="saisyuuGakureki" value="1">大学院（博士）
                                <input  type="radio" name="saisyuuGakureki" value="2">大学院（修士）
                                <input  type="radio" name="saisyuuGakureki" value="3">大学
                                <input  type="radio" name="saisyuuGakureki" value="4">短期大学
                                <input  type="radio" name="saisyuuGakureki" value="5">専門学校
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="gakkouName" class="col-sm-2 control-label">学校名</label>
                            <div class="col-sm-10">
                                <input type="text" id="gakkouName" name="gakkouName"  class="form-control"  >
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="sennmomName" class="col-sm-2 control-label">専門名</label>
                            <div class="col-sm-10">
                                <input type="text" id="sennmomName" name="sennmomName"  class="form-control"  >
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="sotugyoDate" class="col-sm-2 control-label">卒業年月日</label>
                            <div class="col-sm-10">
                                <input type="text" id="sotugyoDate" name="sotugyoDate"  class="form-control" >
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="gyumuNensu" class="col-sm-2 control-label">業務年数</label>
                            <div class="col-sm-10">
                                <input type="text" id="gyumuNensu" name="gyumuNensu"  class="form-control" >
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="itOs" class="col-sm-2 control-label">OS</label>
                            <div  class="col-sm-10">
                                <input type="hidden" id ="itOs" name="itOs"/>
                                <select name="itOs">
                                    <option value="">DOS</option>
                                    <option value="1-1">DOS△</option>
                                    <option value="1-2">DOS◎</option>
                                    <option value="1-3">DOS〇</option>
                                </select>
                                <select name="itOs">
                                    <option value="">Windows</option>
                                    <option value="2-1">Windows△</option>
                                    <option value="2-2">Windows◎</option>
                                    <option value="2-3">Windows〇</option>
                                </select>
                                <select name="itOs">
                                    <option value="">Unix</option>
                                    <option value="3-1">Unix△</option>
                                    <option value="3-2">Unix◎</option>
                                    <option value="3-3">Unix〇</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="itGengo" class="col-sm-2 control-label">言語</label>
                            <div class="col-sm-10">
                                <input type="hidden" id="itGengo" name="itGengo" />
                                <select name="itGengo">
                                    <option value="">JAVA</option>
                                    <option value="1-1">JAVA△</option>
                                    <option value="1-2">JAVA◎</option>
                                    <option value="1-3">JAVA〇</option>
                                </select>
                                <select name="itGengo">
                                    <option value="">VB</option>
                                    <option value="2-1">VB△</option>
                                    <option value="2-2">VB◎</option>
                                    <option value="2-3">VB〇</option>
                                </select>
                                <select name="itGengo">
                                    <option value="">C</option>
                                    <option value="3-1">C△</option>
                                    <option value="3-2">C◎</option>
                                    <option value="3-3">C〇</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="itDb" class="col-sm-2 control-label">DB</label>
                            <div class="col-sm-10">
                                <input type="hidden" id="itDb" name="itDb"/>
                                <select name="itDb">
                                    <option value="">Oracle</option>
                                    <option value="1-1">Oracle△</option>
                                    <option value="1-2">Oracle◎</option>
                                    <option value="1-3">Oracle〇</option>
                                </select>
                                <select name="itDb">
                                    <option value="">SQLServer</option>
                                    <option value="2-1">SQLServer△</option>
                                    <option value="2-2">SQLServer◎</option>
                                    <option value="2-3">SQLServer〇</option>
                                </select>
                                <select name="itDb">
                                    <option value="">MySql</option>
                                    <option value="3-1">MySql△</option>
                                    <option value="3-2">MySql◎</option>
                                    <option value="3-3">MySql〇</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="itWebServer" class="col-sm-2 control-label">Webサーバ</label>
                            <div class="col-sm-10">
                                <input type="hidden" id="itWebServer" name="itWebServer"/>
                                <select name="itWebServer">
                                    <option value="">WebLogic</option>
                                    <option value="1-1">WebLogic△</option>
                                    <option value="1-2">WebLogic◎</option>
                                    <option value="1-3">WebLogic〇</option>
                                </select>
                                <select name="itWebServer">
                                    <option value="">Apache</option>
                                    <option value="2-1">Apache△</option>
                                    <option value="2-2">Apache◎</option>
                                    <option value="2-3">Apache〇</option>
                                </select>
                                <select name="itWebServer">
                                    <option value="">IIS</option>
                                    <option value="3-1">IIS△</option>
                                    <option value="3-2">IIS◎</option>
                                    <option value="3-3">IIS〇</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="itFw" class="col-sm-2 control-label">FrameWork</label>
                            <div class="col-sm-10">
                                <input type="hidden" id="itFw" name="itFw"/>
                                <select name="itFw">
                                    <option value="">Struts</option>
                                    <option value="1-1">Struts△</option>
                                    <option value="1-2">Struts◎</option>
                                    <option value="1-3">Struts〇</option>
                                </select>
                                <select name="itFw">
                                    <option value="">WebWork</option>
                                    <option value="2-1">WebWork△</option>
                                    <option value="2-2">WebWork◎</option>
                                    <option value="2-3">WebWork〇</option>
                                </select>
                                <select name="itFw">
                                    <option value="">Spring</option>
                                    <option value="3-1">Spring△</option>
                                    <option value="3-2">Spring◎</option>
                                    <option value="3-3">Spring〇</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="itOther" class="col-sm-2 control-label">その他</label>
                            <div class="col-sm-10">
                                <input type="hidden" id ="itOther" name="itOther"/>
                                <select name="itOther">
                                    <option value="">Eclipse</option>
                                    <option value="1-1">Eclipse△</option>
                                    <option value="1-2">Eclipse◎</option>
                                    <option value="1-3">Eclipse〇</option>
                                </select>
                                <select name="itOther">
                                    <option value="">.NET IDE</option>
                                    <option value="2-1">.NET IDE△</option>
                                    <option value="2-2">.NET IDE◎</option>
                                    <option value="2-3">.NET IDE〇</option>
                                </select>
                                <select name="itOther">
                                    <option value="">Ultra Edit</option>
                                    <option value="3-1">Ultra Edit△</option>
                                    <option value="3-2">Ultra Edit◎</option>
                                    <option value="3-3">Ultra Edit〇</option>
                                </select>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="itBikou" class="col-sm-2 control-label">備考及び自己紹介</label>
                            <div class="col-sm-10">
                                <input type="text" id="itBikou" name="itBikou"  class="form-control" >
                            </div>
                        </div>
                        <div class="form-group">
                            <label id="deleteFlag" class="col-sm-2 control-label">論理削除フラグ</label>
                            <div class="col-sm-10">
                                <input  type="radio" name="deleteFlag" value="0">有効
                                <input  type="radio" name="deleteFlag" value="1">削除
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="tourokubi" class="col-sm-2 control-label">登録日</label>
                            <div class="col-sm-10">
                                <input type="text" id="tourokubi" name="tourokubi"  class="form-control"  >
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="kousinnbi" class="col-sm-2 control-label">更新日</label>
                            <div class="col-sm-10">
                                <input type="text" id="kousinnbi" name="kousinnbi"  class="form-control"  >
                            </div>
                        </div>


                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                            <a  onclick="update_syainMain()" class="btn btn-success" >保存</a>
                        </div>

                    </form>
                </div>
            </div><!-- /.modal-content -->
        </div>
    </div><!-- /.modal -->
</div>
</body>
<script type="text/javascript">
    //点击“修改”按钮，打开编辑窗口，回显数据
    function edit_syainMain(id){
        //alert(id);
        $("#syainMain_form")[0].reset();
        $.ajax({
            type:"POST",
            data:{"id":id},
            url:"${pageContext.request.contextPath }/syain/edit",
            dataType:"json",

            success:function(data) {
                //alert(data);
                //alert(data.syainId);
                //alert(data.firstNameKanji);
                //alert($("#syainMain_form").serialize());
                //alert(data.itOs);
                //alert(data.itOther);
                //alert(data.tanjyobi);
                $("#syainId").val(data.syainId);
                $("#firstNameKanji").val(data.firstNameKanji);
                $("#lastNameKanji").val(data.lastNameKanji);
                $("#firstNameKana").val(data.firstNameKana);
                $("#lastNameKana").val(data.lastNameKana);
                $("#firstNameEigo").val(data.firstNameEigo);
                $("#lastNameEigo").val(data.lastNameEigo);

                $("#tanjyobi").val(data.tanjyobi);
                $("#syussinn").val(data.syussinn);
                $("#passportNum").val(data.passportNum);
                $("#passportEndDate").val(data.passportEndDate);
                $("#visaKikan").val(data.visaKikan);
                $("#visaEndDate").val(data.visaEndDate);
                $("#zairyuSikaku").val(data.zairyuSikaku);
                $("#kojinNum").val(data.kojinNum);
                $("#zairyuNum").val(data.zairyuNum);
                $("#nyuusyaDate").val(data.nyuusyaDate);
                $("#taisyaDate").val(data.taisyaDate);
                $("#rainitiDate").val(data.rainitiDate);
                $("#bikou").val(data.bikou);
                $("#yuubin").val(data.yuubin);
                $("#jyusyo1").val(data.jyusyo1);
                $("#jyusyo2").val(data.jyusyo2);
                $("#moyoriEki").val(data.moyoriEki);
                $("#tel").val(data.tel);
                $("#email").val(data.email);
                $("#wechat").val(data.wechat);
                $("#line").val(data.line);
                $("#bokokuJyusyo").val(data.bokokuJyusyo);
                $("#bokokuKinnkyuuRennraku").val(data.bokokuKinnkyuuRennraku);
                $("#saisyuuGakureki").val(data.saisyuuGakureki);
                $("#gakkouName").val(data.gakkouName);
                $("#sennmomName").val(data.sennmomName);
                $("#sotugyoDate").val(data.sotugyoDate);
                $("#gyumuNensu").val(data.gyumuNensu);
                $("#itBikou").val(data.itBikou);
                $("#tourokubi").val(data.tourokubi);
                $("#kousinnbi").val(data.kousinnbi);

                $("input[type='radio'][name='seibetu'][value='" + data.seibetu + "']").attr("checked", true);
                //$("input[name=seibetu][value='"+data.seibetu+"']").attr("checked",true);
                $("input[type='radio'][name='kokuseki'][value='" + data.kokuseki + "']").attr("checked", true);
                $("input[type='radio'][name='haigusya'][value='" + data.haigusya + "']").attr("checked", true);
                $("input[type='radio'][name='syozokuKaisya'][value='" + data.syozokuKaisya + "']").attr("checked", true);
                $("input[type='radio'][name='syokugyoKind'][value='" + data.syokugyoKind + "']").attr("checked", true);
                $("input[type='radio'][name='saisyuuGakureki'][value='" + data.saisyuuGakureki + "']").attr("checked", true);
                $("input[type='radio'][name='deleteFlag'][value='" + data.deleteFlag + "']").attr("checked", true);


                $("select[name='itOs'] option[value='" + data.itOs + "']").attr("selected", "selected");
                $("select[name='itGengo'] option[value='" + data.itGengo + "']").attr("selected", "selected");
                $("select[name='itDb'] option[value='" + data.itDb + "']").attr("selected", "selected");
                $("select[name='itWebServer'] option[value='" + data.itWebServer + "']").attr("selected", "selected");
                $("select[name='itFw'] option[value='" + data.itFw + "']").attr("selected", "selected");
                $("select[name='itOther'] option[value='" + data.itOther + "']").attr("selected", "selected");

                if(data.itFw.indexOf("1-1")!=-1){
                    $("select[name='itFw'] option[value='"+'1-1'+"']").attr("selected", "selected");
                }
                if(data.itFw.indexOf("1-2")!=-1){
                    $("select[name='itFw'] option[value='"+'1-2'+"']").attr("selected", "selected");
                }
                if(data.itFw.indexOf("1-3")!=-1){
                    $("select[name='itFw'] option[value='"+'1-3'+"']").attr("selected", "selected");
                }
                if(data.itFw.indexOf("2-1")!=-1){
                    $("select[name='itFw'] option[value='"+'2-1'+"']").attr("selected", "selected");
                }
                if(data.itFw.indexOf("2-2")!=-1){
                    $("select[name='itFw'] option[value='"+'2-2'+"']").attr("selected", "selected");
                }
                if(data.itFw.indexOf("2-3")!=-1){
                    $("select[name='itFw'] option[value='"+'2-3'+"']").attr("selected", "selected");
                }
                if(data.itFw.indexOf("3-1")!=-1){
                    $("select[name='itFw'] option[value='"+'3-1'+"']").attr("selected", "selected");
                }
                if(data.itFw.indexOf("3-2")!=-1){
                    $("select[name='itFw'] option[value='"+'3-2'+"']").attr("selected", "selected");
                }
                if(data.itFw.indexOf("3-3")!=-1){
                    $("select[name='itFw'] option[value='"+'3-3'+"']").attr("selected", "selected");
                }



                if(data.itOs.indexOf("1-1")!=-1){
                    $("select[name='itOs'] option[value='"+'1-1'+"']").attr("selected", "selected");
                }
                if(data.itOs.indexOf("1-2")!=-1){
                    $("select[name='itOs'] option[value='"+'1-2'+"']").attr("selected", "selected");
                }
                if(data.itOs.indexOf("1-3")!=-1){
                    $("select[name='itOs'] option[value='"+'1-3'+"']").attr("selected", "selected");
                }
                if(data.itOs.indexOf("2-1")!=-1){
                    $("select[name='itOs'] option[value='"+'2-1'+"']").attr("selected", "selected");
                }
                if(data.itOs.indexOf("2-2")!=-1){
                    $("select[name='itOs'] option[value='"+'2-2'+"']").attr("selected", "selected");
                }
                if(data.itOs.indexOf("2-3")!=-1){
                    $("select[name='itOs'] option[value='"+'2-3'+"']").attr("selected", "selected");
                }
                if(data.itOs.indexOf("3-1")!=-1){
                    $("select[name='itOs'] option[value='"+'3-1'+"']").attr("selected", "selected");
                }
                if(data.itOs.indexOf("3-2")!=-1){
                    $("select[name='itOs'] option[value='"+'3-2'+"']").attr("selected", "selected");
                }
                if(data.itOs.indexOf("3-3")!=-1){
                    $("select[name='itOs'] option[value='"+'3-3'+"']").attr("selected", "selected");
                }



                if(data.itGengo.indexOf("1-1")!=-1){
                    $("select[name='itGengo'] option[value='"+'1-1'+"']").attr("selected", "selected");
                }
                if(data.itGengo.indexOf("1-2")!=-1){
                    $("select[name='itGengo'] option[value='"+'1-2'+"']").attr("selected", "selected");
                }
                if(data.itGengo.indexOf("1-3")!=-1){
                    $("select[name='itGengo'] option[value='"+'1-3'+"']").attr("selected", "selected");
                }
                if(data.itGengo.indexOf("2-1")!=-1){
                    $("select[name='itGengo'] option[value='"+'2-1'+"']").attr("selected", "selected");
                }
                if(data.itGengo.indexOf("2-2")!=-1){
                    $("select[name='itGengo'] option[value='"+'2-2'+"']").attr("selected", "selected");
                }
                if(data.itGengo.indexOf("2-3")!=-1){
                    $("select[name='itGengo'] option[value='"+'2-3'+"']").attr("selected", "selected");
                }
                if(data.itGengo.indexOf("3-1")!=-1){
                    $("select[name='itGengo'] option[value='"+'3-1'+"']").attr("selected", "selected");
                }
                if(data.itGengo.indexOf("3-2")!=-1){
                    $("select[name='itGengo'] option[value='"+'3-2'+"']").attr("selected", "selected");
                }
                if(data.itGengo.indexOf("3-3")!=-1){
                    $("select[name='itGengo'] option[value='"+'3-3'+"']").attr("selected", "selected");
                }




                if(data.itDb.indexOf("1-1")!=-1){
                    $("select[name='itDb'] option[value='"+'1-1'+"']").attr("selected", "selected");
                }
                if(data.itDb.indexOf("1-2")!=-1){
                    $("select[name='itDb'] option[value='"+'1-2'+"']").attr("selected", "selected");
                }
                if(data.itDb.indexOf("1-3")!=-1){
                    $("select[name='itDb'] option[value='"+'1-3'+"']").attr("selected", "selected");
                }
                if(data.itDb.indexOf("2-1")!=-1){
                    $("select[name='itDb'] option[value='"+'2-1'+"']").attr("selected", "selected");
                }
                if(data.itDb.indexOf("2-2")!=-1){
                    $("select[name='itDb'] option[value='"+'2-2'+"']").attr("selected", "selected");
                }
                if(data.itDb.indexOf("2-3")!=-1){
                    $("select[name='itDb'] option[value='"+'2-3'+"']").attr("selected", "selected");
                }
                if(data.itDb.indexOf("3-1")!=-1){
                    $("select[name='itDb'] option[value='"+'3-1'+"']").attr("selected", "selected");
                }
                if(data.itDb.indexOf("3-2")!=-1){
                    $("select[name='itDb'] option[value='"+'3-2'+"']").attr("selected", "selected");
                }
                if(data.itDb.indexOf("3-3")!=-1){
                    $("select[name='itDb'] option[value='"+'3-3'+"']").attr("selected", "selected");
                }



                if(data.itWebServer.indexOf("1-1")!=-1){
                    $("select[name='itWebServer'] option[value='"+'1-1'+"']").attr("selected", "selected");
                }
                if(data.itWebServer.indexOf("1-2")!=-1){
                    $("select[name='itWebServer'] option[value='"+'1-2'+"']").attr("selected", "selected");
                }
                if(data.itWebServer.indexOf("1-3")!=-1){
                    $("select[name='itWebServer'] option[value='"+'1-3'+"']").attr("selected", "selected");
                }
                if(data.itWebServer.indexOf("2-1")!=-1){
                    $("select[name='itWebServer'] option[value='"+'2-1'+"']").attr("selected", "selected");
                }
                if(data.itWebServer.indexOf("2-2")!=-1){
                    $("select[name='itWebServer'] option[value='"+'2-2'+"']").attr("selected", "selected");
                }
                if(data.itWebServer.indexOf("2-3")!=-1){
                    $("select[name='itWebServer'] option[value='"+'2-3'+"']").attr("selected", "selected");
                }
                if(data.itWebServer.indexOf("3-1")!=-1){
                    $("select[name='itWebServer'] option[value='"+'3-1'+"']").attr("selected", "selected");
                }
                if(data.itWebServer.indexOf("3-2")!=-1){
                    $("select[name='itWebServer'] option[value='"+'3-2'+"']").attr("selected", "selected");
                }
                if(data.itWebServer.indexOf("3-3")!=-1){
                    $("select[name='itWebServer'] option[value='"+'3-3'+"']").attr("selected", "selected");
                }



                if(data.itOther.indexOf("1-1")!=-1){
                    $("select[name='itOther'] option[value='"+'1-1'+"']").attr("selected", "selected");
                }
                if(data.itOther.indexOf("1-2")!=-1){
                    $("select[name='itOther'] option[value='"+'1-2'+"']").attr("selected", "selected");
                }
                if(data.itOther.indexOf("1-3")!=-1){
                    $("select[name='itOther'] option[value='"+'1-3'+"']").attr("selected", "selected");
                }
                if(data.itOther.indexOf("2-1")!=-1){
                    $("select[name='itOther'] option[value='"+'2-1'+"']").attr("selected", "selected");
                }
                if(data.itOther.indexOf("2-2")!=-1){
                    $("select[name='itOther'] option[value='"+'2-2'+"']").attr("selected", "selected");
                }
                if(data.itOther.indexOf("2-3")!=-1){
                    $("select[name='itOther'] option[value='"+'2-3'+"']").attr("selected", "selected");
                }
                if(data.itOther.indexOf("3-1")!=-1){
                    $("select[name='itOther'] option[value='"+'3-1'+"']").attr("selected", "selected");
                }
                if(data.itOther.indexOf("3-2")!=-1){
                    $("select[name='itOther'] option[value='"+'3-2'+"']").attr("selected", "selected");
                }
                if(data.itOther.indexOf("3-3")!=-1){
                    $("select[name='itOther'] option[value='"+'3-3'+"']").attr("selected", "selected");
                }



            }

        });
    }



    //修改数据后，点击保存，更新数据。
    function update_syainMain(){
        //alert($("#syainMain_form")[0]);
        $.ajax({
            type:"POST",
            data:$("#syainMain_form").serialize(),
            url:"${pageContext.request.contextPath}/syain/update",

            dataType:'text',
            async:true,//默认异步，false-同步
            success:function(data){
                alert("修改成功!");
                window.location.reload();
            },
            error:function(){
                alert("修改错误!");
            }
        });
    }



    //   删除
    function delete_syainMain(id){
        if(confirm("确定要删除该记录吗？")){
            $.post(
                "${pageContext.request.contextPath }/syain/delete",
                {"id":id},
                function(){
                    alert("删除成功！");
                    window.location.reload();
                }
            );
        }
    }

</script>

</html>
