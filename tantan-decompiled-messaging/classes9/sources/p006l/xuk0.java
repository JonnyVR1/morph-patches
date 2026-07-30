package p006l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.newui.appeal.AppealAct;
import com.p1.mobile.putong.core.newui.appeal.AppealProgressAct;
import com.p1.mobile.putong.core.newui.fake.b;
import com.p1.mobile.putong.data.AppealPostData;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.FaceidLiveData;
import com.p1.mobile.putong.data.IdCard;
import com.p1.mobile.putong.data.TencentResult;
import com.p1.mobile.putong.data.TencentToken;
import com.p1.mobile.putong.data.VerificationToken;
import com.p1.mobile.putong.facertification.RxFacertification;
import com.p1.mobile.putong.facertification.TTFacertificationClient;
import com.p1.mobile.putong.facertification.a;
import com.p1.mobile.putong.oms.OmsBaseRender;
import com.tantanapp.common.network.ApiExcep;
import com.tantanapp.common.utils.NullChecker;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import l.e30;
import l.e51;
import l.jo0;
import l.lsi0;
import l.mkd0;
import l.nc50;
import l.rc2;
import l.roj0;
import l.wvf;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class xuk0 {
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m27635d(String str, String str2, String str3, Act act, Throwable th) {
        if (th instanceof ApiExcep) {
            xtk0.m27628w(str, String.valueOf(((ApiExcep) th).response.q()), str2, str3);
        }
        act.progressDismiss();
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m27636e(String str, String str2, String str3, Act act, Throwable th) {
        if (th instanceof ApiExcep) {
            xtk0.m27615j(str, String.valueOf(((ApiExcep) th).response.q()), str2, str3);
        }
        xtk0.m27631z("post tencent facedetect failed userId:" + CoreModule.m1850H().userId(), th);
        lsi0.t(act.string(R$string.f2003Or)).show();
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m27637f(String str, String str2, String str3, Act act, Envelope envelope) {
        xtk0.m27614i(str, str2, str3);
        OmsBaseRender omsBaseRenderI = nc50.f().i();
        if (NullChecker.a(omsBaseRenderI)) {
            omsBaseRenderI.Q();
        }
        if (!NullChecker.a(act) || act.isFinishing() || TextUtils.equals(str3, "fromPicVerificationDlg")) {
            return;
        }
        tvf.m24838q(act, str3);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m27638g(Act act, roj0 roj0Var) {
        b.r().p();
        rc2.e().j(IdCard.new_());
        act.progressDismiss();
        act.startActivity(AppealProgressAct.Z1(act, false));
    }

    /* JADX INFO: renamed from: l */
    public static void m27639l(wvf wvfVar, VerificationToken verificationToken, final Act act, String str, int i) {
        if (verificationToken.isVolcProvider()) {
            kwk0.m18289Q(act, wvfVar.b, wvfVar.d);
            return;
        }
        if (verificationToken.isTencentProvider()) {
            if ("41000".equals(wvfVar.b)) {
                return;
            }
            xtk0.m27631z("detectCallback failed:" + wvfVar.b + ";" + wvfVar.d + ";userId:" + CoreModule.m1850H().userId() + ";token:" + wvfVar.a, null);
            if (tvf.m24832k(act, wvfVar.b, str, i)) {
                return;
            }
            kwk0.m18288P(act, wvfVar.b);
            return;
        }
        if (kwk0.m18280H(act, wvfVar, verificationToken, str)) {
            return;
        }
        if (verificationToken.isAliyunIntlProvider()) {
            kwk0.m18281I(act, wvfVar.b);
            return;
        }
        String str2 = wvfVar.b;
        String str3 = wvfVar.d;
        if ("9000".equals(str2)) {
            xtk0.m27631z("detect overtime:userId:" + CoreModule.m1850H().userId(), null);
            lsi0.t(act.string(R$string.f1973Nr)).show();
            return;
        }
        xtk0.m27631z("detectCallback failed:" + str2 + ";" + str3 + ";userId:" + CoreModule.m1850H().userId() + ";token:" + wvfVar.a, null);
        if ("6000".equals(str2)) {
            if ("DEVICE_NOT_SUPPORT".equals(str3) || "NO_CAMERA_PERMISSION".equals(str3)) {
                e51.G(new Runnable() { // from class: l.uuk0
                    @Override // java.lang.Runnable
                    public final void run() {
                        lsi0.t(act.string(R$string.f1943Mr)).show();
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m27640h(Act act, VerificationToken verificationToken, String str, wvf wvfVar) {
        FaceidLiveData faceidLiveDataNew_ = FaceidLiveData.new_();
        if (verificationToken.isALiProvider()) {
            faceidLiveDataNew_.aliyun.certifyId = verificationToken.certifyId;
        } else if (verificationToken.isTencentProvider()) {
            TencentResult tencentResult = faceidLiveDataNew_.tencent;
            TencentToken tencentToken = verificationToken.tencentToken;
            tencentResult.orderNo = tencentToken.agreementNo;
            tencentResult.publicUserId = tencentToken.userId;
            tencentResult.providerAppId = TTFacertificationClient.q();
        }
        rc2.e().i(faceidLiveDataNew_);
        OmsBaseRender omsBaseRenderI = nc50.f().i();
        if (NullChecker.a(omsBaseRenderI)) {
            omsBaseRenderI.Q();
        }
        act.startActivity(AppealAct.Y1(act, str, tvf.m24831j(), verificationToken.provider));
    }

    /* JADX INFO: renamed from: i */
    public final String m27641i(boolean z) {
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
    public final void m27642j(final RxFacertification.b bVar, final Act act, final String str, int i, final wvf wvfVar, @NonNull final VerificationToken verificationToken, final String str2, final String str3, String str4) {
        if (verificationToken.isTencentProvider() && !wvfVar.h && (!verificationToken.isTencentProvider() || (!TextUtils.equals(wvfVar.b, "66660004") && !TextUtils.equals(wvfVar.b, "66660010")))) {
            xtk0.m27608c(wvfVar.b, str3, str2, str);
            m27639l(wvfVar, verificationToken, act, str, i);
            return;
        }
        if (TextUtils.equals(str, "appeal")) {
            if (!verificationToken.isALiProvider() || TextUtils.equals(wvfVar.b, "1000")) {
                xtk0.m27623r("0", str3, str2, str);
                m27640h(act, verificationToken, "idCard", wvfVar);
                return;
            } else {
                xtk0.m27612g(wvfVar.b, str3, str2, str);
                kwk0.m18280H(act, wvfVar, verificationToken, str);
                return;
            }
        }
        if (verificationToken.isVolcProvider() && !wvfVar.h) {
            xtk0.m27629x(wvfVar.b, str3, str2, str);
            kwk0.m18289Q(act, wvfVar.b, wvfVar.d);
        } else {
            xtk0.m27624s(str3, str2, str4, str);
            act.progress(R$string.f1831J5);
            act.duringCreated(TTFacertificationClient.p().w(bVar, CoreModule.m1850H().userId(), i)).subscribe(mkd0.H(new e30() { // from class: l.suk0
                public final void call(Object obj) {
                    this.f21665a.m27643k(act, verificationToken, wvfVar, str3, str2, str, bVar, (Envelope) obj);
                }
            }, new e30() { // from class: l.tuk0
                public final void call(Object obj) {
                    xuk0.m27635d(str3, str2, str, act, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m27643k(Act act, VerificationToken verificationToken, wvf wvfVar, String str, String str2, String str3, RxFacertification.b bVar, Envelope envelope) {
        act.progressDismiss();
        if (!verificationToken.isALiProvider()) {
            xtk0.m27627v(str, str2, str3);
            m27647p(act, str3, bVar.c.newProcess);
        } else if (TextUtils.equals(wvfVar.b, "1000")) {
            xtk0.m27625t(str, str2, str3);
            m27647p(act, str3, bVar.c.newProcess);
        } else {
            xtk0.m27626u(wvfVar.b, str, str2, str3);
            kwk0.m18280H(act, wvfVar, verificationToken, str3);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m27644m(RxFacertification.b bVar, final Act act, final String str, int i, wvf wvfVar, VerificationToken verificationToken, final String str2, final String str3, String str4) {
        if (NullChecker.a(wvfVar)) {
            boolean z = ((TextUtils.equals(wvfVar.b, "2006") && TextUtils.equals(wvfVar.g, "Z5128")) || (TextUtils.equals(wvfVar.b, "1001") && TextUtils.equals(wvfVar.g, "Z5114"))) && verificationToken.isALiProvider();
            boolean zEquals = TextUtils.equals(str, "fakeBatch");
            boolean z2 = wvfVar.h;
            if (zEquals) {
                if (z2 || (verificationToken.isALiProvider() && TextUtils.equals(wvfVar.b, "2006") && !wvfVar.h)) {
                    xtk0.m27630y(str3, str2, str);
                    m27646o(act, verificationToken, wvfVar);
                } else {
                    xtk0.m27629x(wvfVar.b, str3, str2, str);
                    m27639l(wvfVar, verificationToken, act, str, i);
                }
                if (!verificationToken.isALiProvider()) {
                    xtk0.m27627v(str3, str2, str);
                    return;
                } else if (TextUtils.equals(wvfVar.b, "1000")) {
                    xtk0.m27625t(str3, str2, str);
                    return;
                } else {
                    xtk0.m27626u(wvfVar.b, str3, str2, str);
                    return;
                }
            }
            if (!z2 && !z) {
                xtk0.m27629x(wvfVar.b, str3, str2, str);
                m27639l(wvfVar, verificationToken, act, str, i);
                return;
            }
            if (TextUtils.equals(str, "appeal")) {
                xtk0.m27630y(str3, str2, str);
                m27640h(act, verificationToken, "picture", wvfVar);
                return;
            }
            xtk0.m27613h(str3, str2, str4, str);
            if (i == 3 && !TextUtils.isEmpty(verificationToken.bizSeq)) {
                a.d(act, verificationToken.bizSeq, bVar);
            } else {
                act.duringCreated(TTFacertificationClient.p().w(bVar, CoreModule.m1850H().userId(), i)).observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.quk0
                    public final void call(Object obj) {
                        xuk0.m27637f(str3, str2, str, act, (Envelope) obj);
                    }
                }, new e30() { // from class: l.ruk0
                    public final void call(Object obj) {
                        xuk0.m27636e(str3, str2, str, act, (Throwable) obj);
                    }
                }));
                mx0.m19529J(act);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void m27645n(RxFacertification.b bVar, Act act, String str, int i) {
        wvf wvfVar = bVar.a;
        VerificationToken verificationToken = bVar.b;
        String strM23350i = rwk0.m23350i(str, i);
        String providerNameForTracker = verificationToken.getProviderNameForTracker();
        rc2.e().k(providerNameForTracker);
        rc2.e().l(strM23350i);
        rwk0.m23349h(i);
        String str2 = wvfVar.b;
        Objects.toString(act);
        String strM23349h = rwk0.m23349h(i);
        String str3 = wvfVar.b;
        if (i == 2) {
            xtk0.m27611f(str3, providerNameForTracker, strM23349h);
        } else {
            xtk0.m27610e(str3, providerNameForTracker, strM23349h);
        }
        if (verificationToken.isALiProvider() && TextUtils.equals(wvfVar.b, "1003")) {
            xtk0.m27606a(wvfVar.b, providerNameForTracker, strM23350i, str);
        } else if (i == 2) {
            m27642j(bVar, act, str, i, wvfVar, verificationToken, strM23350i, providerNameForTracker, strM23349h);
        } else {
            m27644m(bVar, act, str, i, wvfVar, verificationToken, strM23350i, providerNameForTracker, strM23349h);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m27646o(final Act act, VerificationToken verificationToken, wvf wvfVar) {
        AppealPostData appealPostDataNew_ = AppealPostData.new_();
        appealPostDataNew_.provider = verificationToken.provider;
        appealPostDataNew_.reason = "fake";
        appealPostDataNew_.ip = m27641i(true);
        appealPostDataNew_.verificationMethod = "picture";
        FaceidLiveData faceidLiveDataNew_ = FaceidLiveData.new_();
        if (verificationToken.isALiProvider()) {
            faceidLiveDataNew_.aliyun.certifyId = verificationToken.certifyId;
        } else if (verificationToken.isTencentProvider()) {
            if (NullChecker.a(verificationToken.tencentToken)) {
                TencentResult tencentResult = faceidLiveDataNew_.tencent;
                TencentToken tencentToken = verificationToken.tencentToken;
                tencentResult.orderNo = tencentToken.agreementNo;
                tencentResult.publicUserId = tencentToken.userId;
            }
            faceidLiveDataNew_.tencent.providerAppId = TTFacertificationClient.q();
        }
        appealPostDataNew_.providerData = faceidLiveDataNew_;
        appealPostDataNew_.smsPhone = tvf.m24831j();
        appealPostDataNew_.appeal_type = "fake";
        act.duringCreated(CoreModule.f1534c.f3628e0.m21527ya(appealPostDataNew_, new ArrayList())).subscribe(mkd0.H(new e30() { // from class: l.vuk0
            public final void call(Object obj) {
                xuk0.m27638g(act, (roj0) obj);
            }
        }, new e30() { // from class: l.wuk0
            public final void call(Object obj) {
                act.progressDismiss();
            }
        }));
    }

    /* JADX INFO: renamed from: p */
    public final void m27647p(Act act, String str, boolean z) {
        CoreModule.f1534c.f3628e0.m21483na();
        if (!TextUtils.equals(str, "fromNameVerificationDlg")) {
            CoreModule.f1534c.f3541B0.f3735T.put(Boolean.TRUE);
        }
        OmsBaseRender omsBaseRenderI = nc50.f().i();
        if (NullChecker.a(omsBaseRenderI)) {
            omsBaseRenderI.Q();
        }
        act.setResult(-1);
        act.finish();
    }
}
