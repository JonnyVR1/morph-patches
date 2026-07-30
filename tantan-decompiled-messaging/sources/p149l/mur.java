package p149l;

import android.os.Build;
import android.text.TextUtils;
import com.google.protobuf.ByteString;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew;
import com.p046p1.mobile.putong.api.ABManager;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.live.base.data.BLiveAuthSendData;
import com.p046p1.mobile.putong.live.base.data.BLiveAuthSendUa;
import com.p046p1.mobile.putong.live.livingroom.other.longlinkbase.auth.AbstractC12885a;
import com.p046p1.mobile.putong.live.livingroom.other.longlinkbase.auth.Auth;
import com.p046p1.mobile.putong.location.Location;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import java.net.URLEncoder;

/* JADX INFO: loaded from: classes4.dex */
public class mur extends AbstractC12885a {

    /* JADX INFO: renamed from: b */
    public t1w f135834b;

    @Override // com.p046p1.mobile.putong.live.livingroom.other.longlinkbase.auth.AbstractC12885a
    /* JADX INFO: renamed from: b */
    public void mo75488b(lec0 lec0Var) throws Auth.AuthException {
        lec0Var.m149499m().mo216485a("start live connect");
        v4s v4sVar = new v4s(m156429d(), HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT);
        lec0Var.m149487a(v4sVar);
        v4sVar.m197061j();
        lec0Var.m149499m().mo216485a("start live auth");
        lur lurVar = new lur(m156428c(), HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT);
        lec0Var.m149487a(lurVar);
        lurVar.m151813j();
    }

    /* JADX INFO: renamed from: c */
    public final liveAuthMessageNew.Msg m156428c() {
        liveAuthMessageNew.UserAgent.Builder builderNewBuilder = liveAuthMessageNew.UserAgent.newBuilder();
        liveAuthMessageNew.ClientSourceEnum clientSourceEnum = liveAuthMessageNew.ClientSourceEnum.CLIENT_SOURCE_ANDROID;
        liveAuthMessageNew.Auth.Builder roomType = liveAuthMessageNew.Auth.newBuilder().setStaySide(m156430e()).setLocale(m156431f()).setSource(clientSourceEnum).setUa(builderNewBuilder.setSource(clientSourceEnum).setSourceVersion(String.valueOf(Build.VERSION.SDK_INT)).setAppVersion(qib0.f154730s).setBrand(URLEncoder.encode(Build.BRAND)).setModel(URLEncoder.encode(Build.MODEL)).build()).setSessionId(this.f135834b.f167377d).setLiveId(this.f135834b.f167378e).setEnterSource(this.f135834b.f167379f).setRoomId(this.f135834b.f167374a).setXTTClientInfo(ByteString.copyFromUtf8(Network.getXttClientInfo())).setFlag(ByteString.copyFrom(new byte[]{this.f135834b.f167381h ? (byte) 1 : (byte) 0, 1})).setLiveMode(this.f135834b.f167376c).setRoomType(this.f135834b.f167380g);
        if (uvr.m196087d().m162657A0()) {
            roomType.setLinkState(this.f135834b.f167382i).setFirstLinkTime(this.f135834b.f167383j).setCurrentStartLinkTime(this.f135834b.f167384k).setInterruptLinkTime(this.f135834b.f167385l).setIpHost(this.f135834b.f167387n).setCurrentTime(mqi0.m155944o()).setRetryCount(this.f135834b.f167388o);
        }
        Location locationM78865q = qib0.f154687E.m78865q();
        if (locationM78865q != null) {
            roomType.setLoc(liveAuthMessageNew.Location.newBuilder().setLat((float) locationM78865q.m78831u()).setLon((float) locationM78865q.m78833x()).build());
        }
        if (!TextUtils.isEmpty(ABManager.m29347h())) {
            roomType.setXTestingGroup(ByteString.copyFromUtf8(ABManager.m29347h()));
        }
        if (!TextUtils.isEmpty(ypv.f199493a.m199309D0())) {
            roomType.setUserId(ypv.f199493a.m199309D0());
        }
        return liveAuthMessageNew.Msg.newBuilder().setMsgTypeName("live.client.auth").setData(li60.m149878a(roomType.build())).build();
    }

    /* JADX INFO: renamed from: d */
    public final BLiveAuthSendData m156429d() {
        jgw jgwVarM141351e = jgw.m141351e();
        jgw.m141352h(ypv.f199497e);
        BLiveAuthSendData bLiveAuthSendData = new BLiveAuthSendData();
        BLiveAuthSendUa bLiveAuthSendUa = new BLiveAuthSendUa();
        bLiveAuthSendUa.source = "android";
        bLiveAuthSendUa.appVersion = qib0.f154730s;
        bLiveAuthSendUa.sourceVersion = String.valueOf(Build.VERSION.SDK_INT);
        bLiveAuthSendUa.brand = Build.BRAND;
        bLiveAuthSendUa.model = Build.MODEL;
        bLiveAuthSendData.pubKey = jgwVarM141351e.m141357f();
        bLiveAuthSendData.f44335ua = bLiveAuthSendUa;
        return bLiveAuthSendData;
    }

    /* JADX INFO: renamed from: e */
    public final liveAuthMessageNew.AppStaySideEnum m156430e() {
        return Act.foreground_() == null ? liveAuthMessageNew.AppStaySideEnum.APP_STAY_SIDE_BACKGROUND : liveAuthMessageNew.AppStaySideEnum.APP_STAY_SIDE_FOREGROUND;
    }

    /* JADX INFO: renamed from: f */
    public final String m156431f() {
        String strLanguage = Network.language();
        if (strLanguage.startsWith(Network.LANGUAGE_ZH_HANT)) {
            return "zh-TW";
        }
        if (strLanguage.startsWith(Network.LANGUAGE_ZH_HANS)) {
            return "zh-CN";
        }
        if (strLanguage.startsWith("en")) {
            return "en-US";
        }
        if (strLanguage.startsWith("ko")) {
            return "ko-KR";
        }
        if (strLanguage.startsWith("ja")) {
            return "ja-JP";
        }
        return strLanguage.startsWith("id") ? "id-ID" : "en-US";
    }

    /* JADX INFO: renamed from: g */
    public void m156432g(t1w t1wVar) {
        this.f135834b = t1wVar;
    }
}
