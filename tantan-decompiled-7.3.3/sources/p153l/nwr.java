package p153l;

import android.os.Build;
import android.text.TextUtils;
import com.google.protobuf.ByteString;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew;
import com.p051p1.mobile.putong.api.ABManager;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.live.base.data.BLiveAuthSendData;
import com.p051p1.mobile.putong.live.base.data.BLiveAuthSendUa;
import com.p051p1.mobile.putong.live.livingroom.other.longlinkbase.auth.AbstractC13048a;
import com.p051p1.mobile.putong.live.livingroom.other.longlinkbase.auth.Auth;
import com.p051p1.mobile.putong.location.Location;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import java.net.URLEncoder;

/* JADX INFO: loaded from: classes5.dex */
public class nwr extends AbstractC13048a {

    /* JADX INFO: renamed from: b */
    public r3w f144007b;

    @Override // com.p051p1.mobile.putong.live.livingroom.other.longlinkbase.auth.AbstractC13048a
    /* JADX INFO: renamed from: b */
    public void mo76671b(smc0 smc0Var) throws Auth.AuthException {
        smc0Var.m186795m().mo204126a("start live connect");
        w6s w6sVar = new w6s(m165043d(), HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT);
        smc0Var.m186783a(w6sVar);
        w6sVar.m205195j();
        smc0Var.m186795m().mo204126a("start live auth");
        mwr mwrVar = new mwr(m165042c(), HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT);
        smc0Var.m186783a(mwrVar);
        mwrVar.m160590j();
    }

    /* JADX INFO: renamed from: c */
    public final liveAuthMessageNew.Msg m165042c() {
        liveAuthMessageNew.UserAgent.Builder builderNewBuilder = liveAuthMessageNew.UserAgent.newBuilder();
        liveAuthMessageNew.ClientSourceEnum clientSourceEnum = liveAuthMessageNew.ClientSourceEnum.CLIENT_SOURCE_ANDROID;
        liveAuthMessageNew.Auth.Builder roomType = liveAuthMessageNew.Auth.newBuilder().setStaySide(m165044e()).setLocale(m165045f()).setSource(clientSourceEnum).setUa(builderNewBuilder.setSource(clientSourceEnum).setSourceVersion(String.valueOf(Build.VERSION.SDK_INT)).setAppVersion(uqb0.f180413s).setBrand(URLEncoder.encode(Build.BRAND)).setModel(URLEncoder.encode(Build.MODEL)).build()).setSessionId(this.f144007b.f161089d).setLiveId(this.f144007b.f161090e).setEnterSource(this.f144007b.f161091f).setRoomId(this.f144007b.f161086a).setXTTClientInfo(ByteString.copyFromUtf8(Network.getXttClientInfo())).setFlag(ByteString.copyFrom(new byte[]{this.f144007b.f161093h ? (byte) 1 : (byte) 0, 1})).setLiveMode(this.f144007b.f161088c).setRoomType(this.f144007b.f161092g);
        if (vxr.m203876d().m170964A0()) {
            roomType.setLinkState(this.f144007b.f161094i).setFirstLinkTime(this.f144007b.f161095j).setCurrentStartLinkTime(this.f144007b.f161096k).setInterruptLinkTime(this.f144007b.f161097l).setIpHost(this.f144007b.f161099n).setCurrentTime(pzi0.m174454o()).setRetryCount(this.f144007b.f161100o);
        }
        Location locationM80048q = uqb0.f180370E.m80048q();
        if (locationM80048q != null) {
            roomType.setLoc(liveAuthMessageNew.Location.newBuilder().setLat((float) locationM80048q.m80014u()).setLon((float) locationM80048q.m80016x()).build());
        }
        if (!TextUtils.isEmpty(ABManager.m30345h())) {
            roomType.setXTestingGroup(ByteString.copyFromUtf8(ABManager.m30345h()));
        }
        if (!TextUtils.isEmpty(zrv.f205799a.m207631D0())) {
            roomType.setUserId(zrv.f205799a.m207631D0());
        }
        return liveAuthMessageNew.Msg.newBuilder().setMsgTypeName("live.client.auth").setData(qq60.m177480a(roomType.build())).build();
    }

    /* JADX INFO: renamed from: d */
    public final BLiveAuthSendData m165043d() {
        hiw hiwVarM135176e = hiw.m135176e();
        hiw.m135177h(zrv.f205803e);
        BLiveAuthSendData bLiveAuthSendData = new BLiveAuthSendData();
        BLiveAuthSendUa bLiveAuthSendUa = new BLiveAuthSendUa();
        bLiveAuthSendUa.source = "android";
        bLiveAuthSendUa.appVersion = uqb0.f180413s;
        bLiveAuthSendUa.sourceVersion = String.valueOf(Build.VERSION.SDK_INT);
        bLiveAuthSendUa.brand = Build.BRAND;
        bLiveAuthSendUa.model = Build.MODEL;
        bLiveAuthSendData.pubKey = hiwVarM135176e.m135182f();
        bLiveAuthSendData.f45183ua = bLiveAuthSendUa;
        return bLiveAuthSendData;
    }

    /* JADX INFO: renamed from: e */
    public final liveAuthMessageNew.AppStaySideEnum m165044e() {
        return Act.foreground_() == null ? liveAuthMessageNew.AppStaySideEnum.APP_STAY_SIDE_BACKGROUND : liveAuthMessageNew.AppStaySideEnum.APP_STAY_SIDE_FOREGROUND;
    }

    /* JADX INFO: renamed from: f */
    public final String m165045f() {
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
    public void m165046g(r3w r3wVar) {
        this.f144007b = r3wVar;
    }
}
