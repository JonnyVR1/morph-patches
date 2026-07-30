package p149l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.meituan.robust.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.newui.appeal.AppealAct;
import com.p046p1.mobile.putong.core.newui.appeal.AppealProgressAct;
import com.p046p1.mobile.putong.core.newui.fake.C7846b;
import com.p046p1.mobile.putong.data.AppealPostData;
import com.p046p1.mobile.putong.data.Channel;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.FaceidLiveData;
import com.p046p1.mobile.putong.data.IdCard;
import com.p046p1.mobile.putong.data.TencentResult;
import com.p046p1.mobile.putong.data.TencentToken;
import com.p046p1.mobile.putong.data.VerificationToken;
import com.p046p1.mobile.putong.facertification.C10732a;
import com.p046p1.mobile.putong.facertification.RxFacertification;
import com.p046p1.mobile.putong.facertification.TTFacertificationClient;
import com.p046p1.mobile.putong.oms.OmsBaseRender;
import com.tantanapp.common.network.ApiExcep;
import com.tantanapp.common.utils.NullChecker;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
public class xuk0 {
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m211103d(String str, String str2, String str3, Act act, Throwable th) {
        if (th instanceof ApiExcep) {
            xtk0.m211000w(str, String.valueOf(((ApiExcep) th).response.m118609q()), str2, str3);
        }
        act.progressDismiss();
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m211104e(String str, String str2, String str3, Act act, Throwable th) {
        if (th instanceof ApiExcep) {
            xtk0.m210987j(str, String.valueOf(((ApiExcep) th).response.m118609q()), str2, str3);
        }
        xtk0.m211003z("post tencent facedetect failed userId:" + CoreModule.m29931H().userId(), th);
        lsi0.m151590t(act.string(R$string.f18014Or)).show();
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m211105f(String str, String str2, String str3, Act act, Envelope envelope) {
        xtk0.m210986i(str, str2, str3);
        OmsBaseRender omsBaseRenderM158920i = nc50.m158912f().m158920i();
        if (NullChecker.m81303a(omsBaseRenderM158920i)) {
            omsBaseRenderM158920i.m79257Q();
        }
        if (!NullChecker.m81303a(act) || act.isFinishing() || TextUtils.equals(str3, "fromPicVerificationDlg")) {
            return;
        }
        tvf.m190739q(act, str3);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m211106g(Act act, roj0 roj0Var) {
        C7846b.m36420r().m36433p();
        rc2.m178723e().m178732j(IdCard.new_());
        act.progressDismiss();
        act.startActivity(AppealProgressAct.m36172Z1(act, false));
    }

    /* JADX INFO: renamed from: l */
    public static void m211107l(wvf wvfVar, VerificationToken verificationToken, final Act act, String str, int i) {
        if (verificationToken.isVolcProvider()) {
            kwk0.m147566Q(act, wvfVar.f188237b, wvfVar.f188239d);
            return;
        }
        if (verificationToken.isTencentProvider()) {
            if ("41000".equals(wvfVar.f188237b)) {
                return;
            }
            xtk0.m211003z("detectCallback failed:" + wvfVar.f188237b + Constants.PACKNAME_END + wvfVar.f188239d + ";userId:" + CoreModule.m29931H().userId() + ";token:" + wvfVar.f188236a, null);
            if (tvf.m190733k(act, wvfVar.f188237b, str, i)) {
                return;
            }
            kwk0.m147565P(act, wvfVar.f188237b);
            return;
        }
        if (kwk0.m147557H(act, wvfVar, verificationToken, str)) {
            return;
        }
        if (verificationToken.isAliyunIntlProvider()) {
            kwk0.m147558I(act, wvfVar.f188237b);
            return;
        }
        String str2 = wvfVar.f188237b;
        String str3 = wvfVar.f188239d;
        if ("9000".equals(str2)) {
            xtk0.m211003z("detect overtime:userId:" + CoreModule.m29931H().userId(), null);
            lsi0.m151590t(act.string(R$string.f17984Nr)).show();
            return;
        }
        xtk0.m211003z("detectCallback failed:" + str2 + Constants.PACKNAME_END + str3 + ";userId:" + CoreModule.m29931H().userId() + ";token:" + wvfVar.f188236a, null);
        if ("6000".equals(str2)) {
            if ("DEVICE_NOT_SUPPORT".equals(str3) || "NO_CAMERA_PERMISSION".equals(str3)) {
                e51.m114742G(new Runnable() { // from class: l.uuk0
                    @Override // java.lang.Runnable
                    public final void run() {
                        lsi0.m151590t(act.string(R$string.f17954Mr)).show();
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m211108h(Act act, VerificationToken verificationToken, String str, wvf wvfVar) {
        FaceidLiveData faceidLiveDataNew_ = FaceidLiveData.new_();
        if (verificationToken.isALiProvider()) {
            faceidLiveDataNew_.aliyun.certifyId = verificationToken.certifyId;
        } else if (verificationToken.isTencentProvider()) {
            TencentResult tencentResult = faceidLiveDataNew_.tencent;
            TencentToken tencentToken = verificationToken.tencentToken;
            tencentResult.orderNo = tencentToken.agreementNo;
            tencentResult.publicUserId = tencentToken.userId;
            tencentResult.providerAppId = TTFacertificationClient.m60202q();
        }
        rc2.m178723e().m178731i(faceidLiveDataNew_);
        OmsBaseRender omsBaseRenderM158920i = nc50.m158912f().m158920i();
        if (NullChecker.m81303a(omsBaseRenderM158920i)) {
            omsBaseRenderM158920i.m79257Q();
        }
        act.startActivity(AppealAct.m36166Y1(act, str, tvf.m190732j(), verificationToken.provider));
    }

    /* JADX INFO: renamed from: i */
    public final String m211109i(boolean z) {
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
    public final void m211110j(final RxFacertification.C10729b c10729b, final Act act, final String str, int i, final wvf wvfVar, @NonNull final VerificationToken verificationToken, final String str2, final String str3, String str4) {
        if (verificationToken.isTencentProvider() && !wvfVar.f188243h && (!verificationToken.isTencentProvider() || (!TextUtils.equals(wvfVar.f188237b, "66660004") && !TextUtils.equals(wvfVar.f188237b, "66660010")))) {
            xtk0.m210980c(wvfVar.f188237b, str3, str2, str);
            m211107l(wvfVar, verificationToken, act, str, i);
            return;
        }
        if (TextUtils.equals(str, "appeal")) {
            if (!verificationToken.isALiProvider() || TextUtils.equals(wvfVar.f188237b, com.tencent.connect.common.Constants.DEFAULT_UIN)) {
                xtk0.m210995r("0", str3, str2, str);
                m211108h(act, verificationToken, "idCard", wvfVar);
                return;
            } else {
                xtk0.m210984g(wvfVar.f188237b, str3, str2, str);
                kwk0.m147557H(act, wvfVar, verificationToken, str);
                return;
            }
        }
        if (verificationToken.isVolcProvider() && !wvfVar.f188243h) {
            xtk0.m211001x(wvfVar.f188237b, str3, str2, str);
            kwk0.m147566Q(act, wvfVar.f188237b, wvfVar.f188239d);
        } else {
            xtk0.m210996s(str3, str2, str4, str);
            act.progress(R$string.f17842J5);
            act.duringCreated(TTFacertificationClient.m60201p().m60210w(c10729b, CoreModule.m29931H().userId(), i)).subscribe(mkd0.m154956H(new e30() { // from class: l.suk0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f166477a.m211111k(act, verificationToken, wvfVar, str3, str2, str, c10729b, (Envelope) obj);
                }
            }, new e30() { // from class: l.tuk0
                @Override // p149l.e30
                public final void call(Object obj) {
                    xuk0.m211103d(str3, str2, str, act, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m211111k(Act act, VerificationToken verificationToken, wvf wvfVar, String str, String str2, String str3, RxFacertification.C10729b c10729b, Envelope envelope) {
        act.progressDismiss();
        if (!verificationToken.isALiProvider()) {
            xtk0.m210999v(str, str2, str3);
            m211115p(act, str3, c10729b.f38844c.newProcess);
        } else if (TextUtils.equals(wvfVar.f188237b, com.tencent.connect.common.Constants.DEFAULT_UIN)) {
            xtk0.m210997t(str, str2, str3);
            m211115p(act, str3, c10729b.f38844c.newProcess);
        } else {
            xtk0.m210998u(wvfVar.f188237b, str, str2, str3);
            kwk0.m147557H(act, wvfVar, verificationToken, str3);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m211112m(RxFacertification.C10729b c10729b, final Act act, final String str, int i, wvf wvfVar, VerificationToken verificationToken, final String str2, final String str3, String str4) {
        if (NullChecker.m81303a(wvfVar)) {
            boolean z = ((TextUtils.equals(wvfVar.f188237b, "2006") && TextUtils.equals(wvfVar.f188242g, "Z5128")) || (TextUtils.equals(wvfVar.f188237b, "1001") && TextUtils.equals(wvfVar.f188242g, "Z5114"))) && verificationToken.isALiProvider();
            boolean zEquals = TextUtils.equals(str, "fakeBatch");
            boolean z2 = wvfVar.f188243h;
            if (zEquals) {
                if (z2 || (verificationToken.isALiProvider() && TextUtils.equals(wvfVar.f188237b, "2006") && !wvfVar.f188243h)) {
                    xtk0.m211002y(str3, str2, str);
                    m211114o(act, verificationToken, wvfVar);
                } else {
                    xtk0.m211001x(wvfVar.f188237b, str3, str2, str);
                    m211107l(wvfVar, verificationToken, act, str, i);
                }
                if (!verificationToken.isALiProvider()) {
                    xtk0.m210999v(str3, str2, str);
                    return;
                } else if (TextUtils.equals(wvfVar.f188237b, com.tencent.connect.common.Constants.DEFAULT_UIN)) {
                    xtk0.m210997t(str3, str2, str);
                    return;
                } else {
                    xtk0.m210998u(wvfVar.f188237b, str3, str2, str);
                    return;
                }
            }
            if (!z2 && !z) {
                xtk0.m211001x(wvfVar.f188237b, str3, str2, str);
                m211107l(wvfVar, verificationToken, act, str, i);
                return;
            }
            if (TextUtils.equals(str, "appeal")) {
                xtk0.m211002y(str3, str2, str);
                m211108h(act, verificationToken, "picture", wvfVar);
                return;
            }
            xtk0.m210985h(str3, str2, str4, str);
            if (i == 3 && !TextUtils.isEmpty(verificationToken.bizSeq)) {
                C10732a.m60217d(act, verificationToken.bizSeq, c10729b);
            } else {
                act.duringCreated(TTFacertificationClient.m60201p().m60210w(c10729b, CoreModule.m29931H().userId(), i)).observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.quk0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        xuk0.m211105f(str3, str2, str, act, (Envelope) obj);
                    }
                }, new e30() { // from class: l.ruk0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        xuk0.m211104e(str3, str2, str, act, (Throwable) obj);
                    }
                }));
                mx0.m156783J(act);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void m211113n(RxFacertification.C10729b c10729b, Act act, String str, int i) {
        wvf wvfVar = c10729b.f38842a;
        VerificationToken verificationToken = c10729b.f38843b;
        String strM181426i = rwk0.m181426i(str, i);
        String providerNameForTracker = verificationToken.getProviderNameForTracker();
        rc2.m178723e().m178733k(providerNameForTracker);
        rc2.m178723e().m178734l(strM181426i);
        rwk0.m181425h(i);
        String str2 = wvfVar.f188237b;
        Objects.toString(act);
        String strM181425h = rwk0.m181425h(i);
        String str3 = wvfVar.f188237b;
        if (i == 2) {
            xtk0.m210983f(str3, providerNameForTracker, strM181425h);
        } else {
            xtk0.m210982e(str3, providerNameForTracker, strM181425h);
        }
        if (verificationToken.isALiProvider() && TextUtils.equals(wvfVar.f188237b, "1003")) {
            xtk0.m210978a(wvfVar.f188237b, providerNameForTracker, strM181426i, str);
        } else if (i == 2) {
            m211110j(c10729b, act, str, i, wvfVar, verificationToken, strM181426i, providerNameForTracker, strM181425h);
        } else {
            m211112m(c10729b, act, str, i, wvfVar, verificationToken, strM181426i, providerNameForTracker, strM181425h);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m211114o(final Act act, VerificationToken verificationToken, wvf wvfVar) {
        AppealPostData appealPostDataNew_ = AppealPostData.new_();
        appealPostDataNew_.provider = verificationToken.provider;
        appealPostDataNew_.reason = Channel.fake;
        appealPostDataNew_.f38722ip = m211109i(true);
        appealPostDataNew_.verificationMethod = "picture";
        FaceidLiveData faceidLiveDataNew_ = FaceidLiveData.new_();
        if (verificationToken.isALiProvider()) {
            faceidLiveDataNew_.aliyun.certifyId = verificationToken.certifyId;
        } else if (verificationToken.isTencentProvider()) {
            if (NullChecker.m81303a(verificationToken.tencentToken)) {
                TencentResult tencentResult = faceidLiveDataNew_.tencent;
                TencentToken tencentToken = verificationToken.tencentToken;
                tencentResult.orderNo = tencentToken.agreementNo;
                tencentResult.publicUserId = tencentToken.userId;
            }
            faceidLiveDataNew_.tencent.providerAppId = TTFacertificationClient.m60202q();
        }
        appealPostDataNew_.providerData = faceidLiveDataNew_;
        appealPostDataNew_.smsPhone = tvf.m190732j();
        appealPostDataNew_.appeal_type = Channel.fake;
        act.duringCreated(CoreModule.f17545c.f19639e0.m169564ya(appealPostDataNew_, new ArrayList())).subscribe(mkd0.m154956H(new e30() { // from class: l.vuk0
            @Override // p149l.e30
            public final void call(Object obj) {
                xuk0.m211106g(act, (roj0) obj);
            }
        }, new e30() { // from class: l.wuk0
            @Override // p149l.e30
            public final void call(Object obj) {
                act.progressDismiss();
            }
        }));
    }

    /* JADX INFO: renamed from: p */
    public final void m211115p(Act act, String str, boolean z) {
        CoreModule.f17545c.f19639e0.m169520na();
        if (!TextUtils.equals(str, "fromNameVerificationDlg")) {
            CoreModule.f17545c.f19552B0.f19746T.put(Boolean.TRUE);
        }
        OmsBaseRender omsBaseRenderM158920i = nc50.m158912f().m158920i();
        if (NullChecker.m81303a(omsBaseRenderM158920i)) {
            omsBaseRenderM158920i.m79257Q();
        }
        act.setResult(-1);
        act.m66873d2();
    }
}
