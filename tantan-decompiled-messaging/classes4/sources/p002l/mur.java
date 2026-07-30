package p002l;

import android.os.Build;
import android.text.TextUtils;
import com.google.protobuf.ByteString;
import com.p000p1.mobile.putong.live.livingroom.other.longlinkbase.auth.AbstractC0474a;
import com.p000p1.mobile.putong.live.livingroom.other.longlinkbase.auth.Auth;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew;
import com.p1.mobile.putong.api.ABManager;
import com.p1.mobile.putong.api.api.Network;
import com.p1.mobile.putong.live.base.data.BLiveAuthSendData;
import com.p1.mobile.putong.live.base.data.BLiveAuthSendUa;
import com.p1.mobile.putong.location.Location;
import java.net.URLEncoder;
import l.jgw;
import l.li60;
import l.mqi0;
import l.qib0;
import l.uvr;
import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class mur extends AbstractC0474a {

    /* JADX INFO: renamed from: b */
    public t1w f15664b;

    @Override // com.p000p1.mobile.putong.live.livingroom.other.longlinkbase.auth.AbstractC0474a
    /* JADX INFO: renamed from: b */
    public void mo9123b(lec0 lec0Var) throws Auth.AuthException {
        lec0Var.m17157m().mo26978a("start live connect");
        v4s v4sVar = new v4s(m18204d(), 30000L);
        lec0Var.m17145a(v4sVar);
        v4sVar.m23753j();
        lec0Var.m17157m().mo26978a("start live auth");
        lur lurVar = new lur(m18203c(), 30000L);
        lec0Var.m17145a(lurVar);
        lurVar.m17471j();
    }

    /* JADX INFO: renamed from: c */
    public final liveAuthMessageNew.Msg m18203c() {
        liveAuthMessageNew.UserAgent.Builder builderNewBuilder = liveAuthMessageNew.UserAgent.newBuilder();
        liveAuthMessageNew.ClientSourceEnum clientSourceEnum = liveAuthMessageNew.ClientSourceEnum.CLIENT_SOURCE_ANDROID;
        liveAuthMessageNew.Auth.Builder roomType = liveAuthMessageNew.Auth.newBuilder().setStaySide(m18205e()).setLocale(m18206f()).setSource(clientSourceEnum).setUa(builderNewBuilder.setSource(clientSourceEnum).setSourceVersion(String.valueOf(Build.VERSION.SDK_INT)).setAppVersion(qib0.s).setBrand(URLEncoder.encode(Build.BRAND)).setModel(URLEncoder.encode(Build.MODEL)).build()).setSessionId(this.f15664b.f19369d).setLiveId(this.f15664b.f19370e).setEnterSource(this.f15664b.f19371f).setRoomId(this.f15664b.f19366a).setXTTClientInfo(ByteString.copyFromUtf8(Network.getXttClientInfo())).setFlag(ByteString.copyFrom(new byte[]{this.f15664b.f19373h ? (byte) 1 : (byte) 0, 1})).setLiveMode(this.f15664b.f19368c).setRoomType(this.f15664b.f19372g);
        if (uvr.d().A0()) {
            roomType.setLinkState(this.f15664b.f19374i).setFirstLinkTime(this.f15664b.f19375j).setCurrentStartLinkTime(this.f15664b.f19376k).setInterruptLinkTime(this.f15664b.f19377l).setIpHost(this.f15664b.f19379n).setCurrentTime(mqi0.o()).setRetryCount(this.f15664b.f19380o);
        }
        Location locationQ = qib0.E.q();
        if (locationQ != null) {
            roomType.setLoc(liveAuthMessageNew.Location.newBuilder().setLat((float) locationQ.u()).setLon((float) locationQ.x()).build());
        }
        if (!TextUtils.isEmpty(ABManager.h())) {
            roomType.setXTestingGroup(ByteString.copyFromUtf8(ABManager.h()));
        }
        if (!TextUtils.isEmpty(ypv.a.D0())) {
            roomType.setUserId(ypv.a.D0());
        }
        return liveAuthMessageNew.Msg.newBuilder().setMsgTypeName("live.client.auth").setData(li60.a(roomType.build())).build();
    }

    /* JADX INFO: renamed from: d */
    public final BLiveAuthSendData m18204d() {
        jgw jgwVarE = jgw.e();
        jgw.h(ypv.e);
        BLiveAuthSendData bLiveAuthSendData = new BLiveAuthSendData();
        BLiveAuthSendUa bLiveAuthSendUa = new BLiveAuthSendUa();
        bLiveAuthSendUa.source = "android";
        bLiveAuthSendUa.appVersion = qib0.s;
        bLiveAuthSendUa.sourceVersion = String.valueOf(Build.VERSION.SDK_INT);
        bLiveAuthSendUa.brand = Build.BRAND;
        bLiveAuthSendUa.model = Build.MODEL;
        bLiveAuthSendData.pubKey = jgwVarE.f();
        bLiveAuthSendData.ua = bLiveAuthSendUa;
        return bLiveAuthSendData;
    }

    /* JADX INFO: renamed from: e */
    public final liveAuthMessageNew.AppStaySideEnum m18205e() {
        return Act.foreground_() == null ? liveAuthMessageNew.AppStaySideEnum.APP_STAY_SIDE_BACKGROUND : liveAuthMessageNew.AppStaySideEnum.APP_STAY_SIDE_FOREGROUND;
    }

    /* JADX INFO: renamed from: f */
    public final String m18206f() {
        String strLanguage = Network.language();
        if (strLanguage.startsWith("zh-Hant")) {
            return "zh-TW";
        }
        if (strLanguage.startsWith("zh-Hans")) {
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
    public void m18207g(t1w t1wVar) {
        this.f15664b = t1wVar;
    }
}
