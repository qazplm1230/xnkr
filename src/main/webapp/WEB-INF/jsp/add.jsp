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
    <title>社員添加</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/jquery-ui.min.css">
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.css">

    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-ui.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
</head>
<body>
    <div class="container">
        <div class="panel panel-default">
            <div class="panel-heading text-center">
                <h2>添加社員基本情報</h2>
            </div>
            <div class="panel-body">
                    <!-- 表单开始 -->
                    <form id="syainMain_form" class="form-horizontal">

                        <div class="form-group">
                            <label for="firstNameKanji" class="col-sm-2 control-label">社員名（漢字）＿姓</label>
                            <div class="col-sm-10">
                                <input id="syainId" type="hidden" name="syainId" class="form-control">
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
                            <label id="saisyuuGakureki" class="col-sm-2 control-label"  >最終学歴</label>
                            <div class="col-sm-10">
                                <input  type="radio" name="saisyuuGakureki" value="1" >大学院（博士）
                                <input  type="radio" name="saisyuuGakureki" value="2" >大学院（修士）
                                <input  type="radio" name="saisyuuGakureki" value="3" >大学
                                <input  type="radio" name="saisyuuGakureki" value="4" >短期大学
                                <input  type="radio" name="saisyuuGakureki" value="5" >専門学校
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
                            <div class="col-sm-offset-2 col-sm-10">
                                <a  onclick="insert_syainMain()" class="btn btn-success" >保存</a>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
</body>
<script>
    //输入数据后，点击保存，向后台传输form表单中的数据。
    function insert_syainMain(){
        //alert($("#syainMain_form")[0]);
        //alert($("#syainMain_form").serialize());
        $.ajax({
            type:"POST",
            data:$("#syainMain_form").serialize(),
            url:"${pageContext.request.contextPath}/syain/insert",
            dataType:'text',
            async:true,//默认异步，false-同步
            success:function(){
                alert("添加成功!");
                //window.location.reload();
            },
            error:function(){
                alert("添加失败!");
            }
        });
    }

</script>
</html>
