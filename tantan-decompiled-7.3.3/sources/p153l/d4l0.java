package p153l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.meituan.robust.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.newui.appeal.AppealAct;
import com.p051p1.mobile.putong.core.newui.appeal.AppealProgressAct;
import com.p051p1.mobile.putong.core.newui.fake.C7997b;
import com.p051p1.mobile.putong.data.AppealPostData;
import com.p051p1.mobile.putong.data.Channel;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.FaceidLiveData;
import com.p051p1.mobile.putong.data.IdCard;
import com.p051p1.mobile.putong.data.TencentResult;
import com.p051p1.mobile.putong.data.TencentToken;
import com.p051p1.mobile.putong.data.VerificationToken;
import com.p051p1.mobile.putong.facertification.C10895a;
import com.p051p1.mobile.putong.facertification.RxFacertification;
import com.p051p1.mobile.putong.facertification.TTFacertificationClient;
import com.p051p1.mobile.putong.oms.OmsBaseRender;
import com.tantanapp.common.network.ApiExcep;
import com.tantanapp.common.utils.NullChecker;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
public class d4l0 {
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m114215d(String str, String str2, String str3, Act act, Throwable th) {
        if (th instanceof ApiExcep) {
            d3l0.m113866w(str, String.valueOf(((ApiExcep) th).response.m138673q()), str2, str3);
        }
        act.progressDismiss();
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m114216e(String str, String str2, String str3, Act act, Throwable th) {
        if (th instanceof ApiExcep) {
            d3l0.m113853j(str, String.valueOf(((ApiExcep) th).response.m138673q()), str2, str3);
        }
        d3l0.m113869z("post tencent facedetect failed userId:" + CoreModule.m30929H().userId(), th);
        o1j0.m165646t(act.string(R$string.f19412ks)).show();
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m114217f(String str, String str2, String str3, Act act, Envelope envelope) {
        d3l0.m113852i(str, str2, str3);
        OmsBaseRender omsBaseRenderM196480i = uk50.m196472f().m196480i();
        if (NullChecker.m82486a(omsBaseRenderM196480i)) {
            omsBaseRenderM196480i.m80440Q();
        }
        if (!NullChecker.m82486a(act) || act.isFinishing() || TextUtils.equals(str3, "fromPicVerificationDlg")) {
            return;
        }
        hxf.m137596q(act, str3);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m114218g(Act act, uxj0 uxj0Var) {
        C7997b.m37423r().m37436p();
        yc2.m215118e().m215127j(IdCard.new_());
        act.progressDismiss();
        act.startActivity(AppealProgressAct.m37175a2(act, false));
    }

    /* JADX INFO: renamed from: l */
    public static void m114219l(kxf kxfVar, VerificationToken verificationToken, final Act act, String str, int i) {
        if (verificationToken.isVolcProvider()) {
            q5l0.m175472Q(act, kxfVar.f129189b, kxfVar.f129191d);
            return;
        }
        if (verificationToken.isTencentProvider()) {
            if ("41000".equals(kxfVar.f129189b)) {
                return;
            }
            d3l0.m113869z("detectCallback failed:" + kxfVar.f129189b + Constants.PACKNAME_END + kxfVar.f129191d + ";userId:" + CoreModule.m30929H().userId() + ";token:" + kxfVar.f129188a, null);
            if (hxf.m137590k(act, kxfVar.f129189b, str, i)) {
                return;
            }
            q5l0.m175471P(act, kxfVar.f129189b);
            return;
        }
        if (q5l0.m175463H(act, kxfVar, verificationToken, str)) {
            return;
        }
        if (verificationToken.isAliyunIntlProvider()) {
            q5l0.m175464I(act, kxfVar.f129189b);
            return;
        }
        String str2 = kxfVar.f129189b;
        String str3 = kxfVar.f129191d;
        if ("9000".equals(str2)) {
            d3l0.m113869z("detect overtime:userId:" + CoreModule.m30929H().userId(), null);
            o1j0.m165646t(act.string(R$string.f19381js)).show();
            return;
        }
        d3l0.m113869z("detectCallback failed:" + str2 + Constants.PACKNAME_END + str3 + ";userId:" + CoreModule.m30929H().userId() + ";token:" + kxfVar.f129188a, null);
        if ("6000".equals(str2)) {
            if ("DEVICE_NOT_SUPPORT".equals(str3) || "NO_CAMERA_PERMISSION".equals(str3)) {
                l51.m152887G(new Runnable() { // from class: l.a4l0
                    @Override // java.lang.Runnable
                    public final void run() {
                        o1j0.m165646t(act.string(R$string.f19351is)).show();
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m114220h(Act act, VerificationToken verificationToken, String str, kxf kxfVar) {
        FaceidLiveData faceidLiveDataNew_ = FaceidLiveData.new_();
        if (verificationToken.isALiProvider()) {
            faceidLiveDataNew_.aliyun.certifyId = verificationToken.certifyId;
        } else if (verificationToken.isTencentProvider()) {
            TencentResult tencentResult = faceidLiveDataNew_.tencent;
            TencentToken tencentToken = verificationToken.tencentToken;
            tencentResult.orderNo = tencentToken.agreementNo;
            tencentResult.publicUserId = tencentToken.userId;
            tencentResult.providerAppId = TTFacertificationClient.m61386q();
        }
        yc2.m215118e().m215126i(faceidLiveDataNew_);
        OmsBaseRender omsBaseRenderM196480i = uk50.m196472f().m196480i();
        if (NullChecker.m82486a(omsBaseRenderM196480i)) {
            omsBaseRenderM196480i.m80440Q();
        }
        act.startActivity(AppealAct.m37169Z1(act, str, hxf.m137589j(), verificationToken.provider));
    }

    /* JADX INFO: renamed from: i */
    public final String m114221i(boolean z) {
        try {
            Iterator it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
            while (it.hasNext()) {
                for (InetAddress inetAddress : Collections.list(((NetworkInterface) it.next()).getInetAddresses())) {
                    if (!inetAddress.isLoopbackAddress()) {
                        String hostAddress = inetAddress.getHostAddress();
                        boolean z2 = hostAddress.indexOf(58) < 0;
                        if (z) {
                            if (z2) {
                                return hostAddress;
                            }
                        } else if (!z2) {
                            int iIndexOf = hostAddress.indexOf(37);
                            return iIndexOf < 0 ? hostAddress.toUpperCase() : hostAddress.substring(0, iIndexOf).toUpperCase();
                        }
                    }
                }
            }
            return "";
        } catch (NullPointerException | SocketException unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m114222j(final RxFacertification.C10892b c10892b, final Act act, final String str, int i, final kxf kxfVar, @NonNull final VerificationToken verificationToken, final String str2, final String str3, String str4) {
        if (verificationToken.isTencentProvider() && !kxfVar.f129195h && (!verificationToken.isTencentProvider() || (!TextUtils.equals(kxfVar.f129189b, "66660004") && !TextUtils.equals(kxfVar.f129189b, "66660010")))) {
            d3l0.m113846c(kxfVar.f129189b, str3, str2, str);
            m114219l(kxfVar, verificationToken, act, str, i);
            return;
        }
        if (TextUtils.equals(str, "appeal")) {
            if (!verificationToken.isALiProvider() || TextUtils.equals(kxfVar.f129189b, com.tencent.connect.common.Constants.DEFAULT_UIN)) {
                d3l0.m113861r("0", str3, str2, str);
                m114220h(act, verificationToken, "idCard", kxfVar);
                return;
            } else {
                d3l0.m113850g(kxfVar.f129189b, str3, str2, str);
                q5l0.m175463H(act, kxfVar, verificationToken, str);
                return;
            }
        }
        if (verificationToken.isVolcProvider() && !kxfVar.f129195h) {
            d3l0.m113867x(kxfVar.f129189b, str3, str2, str);
            q5l0.m175472Q(act, kxfVar.f129189b, kxfVar.f129191d);
        } else {
            d3l0.m113862s(str3, str2, str4, str);
            act.progress(R$string.f18632L5);
            act.duringCreated(TTFacertificationClient.m61385p().m61394w(c10892b, CoreModule.m30929H().userId(), i)).subscribe(psd0.m173597H(new y20() { // from class: l.y3l0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f197372a.m114223k(act, verificationToken, kxfVar, str3, str2, str, c10892b, (Envelope) obj);
                }
            }, new y20() { // from class: l.z3l0
                @Override // p153l.y20
                public final void call(Object obj) {
                    d4l0.m114215d(str3, str2, str, act, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m114223k(Act act, VerificationToken verificationToken, kxf kxfVar, String str, String str2, String str3, RxFacertification.C10892b c10892b, Envelope envelope) {
        act.progressDismiss();
        if (!verificationToken.isALiProvider()) {
            d3l0.m113865v(str, str2, str3);
            m114227p(act, str3, c10892b.f39692c.newProcess);
        } else if (TextUtils.equals(kxfVar.f129189b, com.tencent.connect.common.Constants.DEFAULT_UIN)) {
            d3l0.m113863t(str, str2, str3);
            m114227p(act, str3, c10892b.f39692c.newProcess);
        } else {
            d3l0.m113864u(kxfVar.f129189b, str, str2, str3);
            q5l0.m175463H(act, kxfVar, verificationToken, str3);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m114224m(RxFacertification.C10892b c10892b, final Act act, final String str, int i, kxf kxfVar, VerificationToken verificationToken, final String str2, final String str3, String str4) {
        if (NullChecker.m82486a(kxfVar)) {
            boolean z = ((TextUtils.equals(kxfVar.f129189b, "2006") && TextUtils.equals(kxfVar.f129194g, "Z5128")) || (TextUtils.equals(kxfVar.f129189b, "1001") && TextUtils.equals(kxfVar.f129194g, "Z5114"))) && verificationToken.isALiProvider();
            boolean zEquals = TextUtils.equals(str, "fakeBatch");
            boolean z2 = kxfVar.f129195h;
            if (zEquals) {
                if (z2 || (verificationToken.isALiProvider() && TextUtils.equals(kxfVar.f129189b, "2006") && !kxfVar.f129195h)) {
                    d3l0.m113868y(str3, str2, str);
                    m114226o(act, verificationToken, kxfVar);
                } else {
                    d3l0.m113867x(kxfVar.f129189b, str3, str2, str);
                    m114219l(kxfVar, verificationToken, act, str, i);
                }
                if (!verificationToken.isALiProvider()) {
                    d3l0.m113865v(str3, str2, str);
                    return;
                } else if (TextUtils.equals(kxfVar.f129189b, com.tencent.connect.common.Constants.DEFAULT_UIN)) {
                    d3l0.m113863t(str3, str2, str);
                    return;
                } else {
                    d3l0.m113864u(kxfVar.f129189b, str3, str2, str);
                    return;
                }
            }
            if (!z2 && !z) {
                d3l0.m113867x(kxfVar.f129189b, str3, str2, str);
                m114219l(kxfVar, verificationToken, act, str, i);
                return;
            }
            if (TextUtils.equals(str, "appeal")) {
                d3l0.m113868y(str3, str2, str);
                m114220h(act, verificationToken, "picture", kxfVar);
                return;
            }
            d3l0.m113851h(str3, str2, str4, str);
            if (i == 3 && !TextUtils.isEmpty(verificationToken.bizSeq)) {
                C10895a.m61401d(act, verificationToken.bizSeq, c10892b);
            } else {
                act.duringCreated(TTFacertificationClient.m61385p().m61394w(c10892b, CoreModule.m30929H().userId(), i)).observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.w3l0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        d4l0.m114217f(str3, str2, str, act, (Envelope) obj);
                    }
                }, new y20() { // from class: l.x3l0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        d4l0.m114216e(str3, str2, str, act, (Throwable) obj);
                    }
                }));
                tx0.m193420J(act);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void m114225n(RxFacertification.C10892b c10892b, Act act, String str, int i) {
        kxf kxfVar = c10892b.f39690a;
        VerificationToken verificationToken = c10892b.f39691b;
        String strM209396i = x5l0.m209396i(str, i);
        String providerNameForTracker = verificationToken.getProviderNameForTracker();
        yc2.m215118e().m215128k(providerNameForTracker);
        yc2.m215118e().m215129l(strM209396i);
        x5l0.m209395h(i);
        String str2 = kxfVar.f129189b;
        Objects.toString(act);
        String strM209395h = x5l0.m209395h(i);
        String str3 = kxfVar.f129189b;
        if (i == 2) {
            d3l0.m113849f(str3, providerNameForTracker, strM209395h);
        } else {
            d3l0.m113848e(str3, providerNameForTracker, strM209395h);
        }
        if (verificationToken.isALiProvider() && TextUtils.equals(kxfVar.f129189b, "1003")) {
            d3l0.m113844a(kxfVar.f129189b, providerNameForTracker, strM209396i, str);
        } else if (i == 2) {
            m114222j(c10892b, act, str, i, kxfVar, verificationToken, strM209396i, providerNameForTracker, strM209395h);
        } else {
            m114224m(c10892b, act, str, i, kxfVar, verificationToken, strM209396i, providerNameForTracker, strM209395h);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m114226o(final Act act, VerificationToken verificationToken, kxf kxfVar) {
        AppealPostData appealPostDataNew_ = AppealPostData.new_();
        appealPostDataNew_.provider = verificationToken.provider;
        appealPostDataNew_.reason = Channel.fake;
        appealPostDataNew_.f39570ip = m114221i(true);
        appealPostDataNew_.verificationMethod = "picture";
        FaceidLiveData faceidLiveDataNew_ = FaceidLiveData.new_();
        if (verificationToken.isALiProvider()) {
            faceidLiveDataNew_.aliyun.certifyId = verificationToken.certifyId;
        } else if (verificationToken.isTencentProvider()) {
            if (NullChecker.m82486a(verificationToken.tencentToken)) {
                TencentResult tencentResult = faceidLiveDataNew_.tencent;
                TencentToken tencentToken = verificationToken.tencentToken;
                tencentResult.orderNo = tencentToken.agreementNo;
                tencentResult.publicUserId = tencentToken.userId;
            }
            faceidLiveDataNew_.tencent.providerAppId = TTFacertificationClient.m61386q();
        }
        appealPostDataNew_.providerData = faceidLiveDataNew_;
        appealPostDataNew_.smsPhone = hxf.m137589j();
        appealPostDataNew_.appeal_type = Channel.fake;
        act.duringCreated(CoreModule.f18264c.f20381e0.m116637ya(appealPostDataNew_, new ArrayList())).subscribe(psd0.m173597H(new y20() { // from class: l.b4l0
            @Override // p153l.y20
            public final void call(Object obj) {
                d4l0.m114218g(act, (uxj0) obj);
            }
        }, new y20() { // from class: l.c4l0
            @Override // p153l.y20
            public final void call(Object obj) {
                act.progressDismiss();
            }
        }));
    }

    /* JADX INFO: renamed from: p */
    public final void m114227p(Act act, String str, boolean z) {
        CoreModule.f18264c.f20381e0.m116593na();
        if (!TextUtils.equals(str, "fromNameVerificationDlg")) {
            CoreModule.f18264c.f20294B0.f20488T.put(Boolean.TRUE);
        }
        OmsBaseRender omsBaseRenderM196480i = uk50.m196472f().m196480i();
        if (NullChecker.m82486a(omsBaseRenderM196480i)) {
            omsBaseRenderM196480i.m80440Q();
        }
        act.setResult(-1);
        act.m68056e2();
    }
}
