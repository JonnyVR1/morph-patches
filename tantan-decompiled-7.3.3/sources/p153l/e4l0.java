package p153l;

import android.text.TextUtils;
import com.meituan.robust.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.verification.VerificationExecuteAct;
import com.p051p1.mobile.putong.core.p058ui.verification.remind.result.AvatarResultAct;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.VerificationToken;
import com.p051p1.mobile.putong.data.VerificationTokenRequestParam;
import com.p051p1.mobile.putong.facertification.RxFacertification;
import com.p051p1.mobile.putong.facertification.TTFacertificationClient;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes12.dex */
public class e4l0 {

    /* JADX INFO: renamed from: a */
    public boolean f92115a = true;

    /* JADX INFO: renamed from: b */
    public String f92116b;

    /* JADX INFO: renamed from: c */
    public Act f92117c;

    /* JADX INFO: renamed from: d */
    public String f92118d;

    /* JADX INFO: renamed from: e */
    public String f92119e;

    /* JADX INFO: renamed from: f */
    public String f92120f;

    /* JADX INFO: renamed from: g */
    public int f92121g;

    /* JADX INFO: renamed from: h */
    public boolean f92122h;

    /* JADX INFO: renamed from: i */
    public String f92123i;

    /* JADX INFO: renamed from: l.e4l0$a */
    public class C16716a implements TTFacertificationClient.InterfaceC10893a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f92124a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f92125b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f92126c;

        public C16716a(String str, String str2, boolean z) {
            this.f92124a = str;
            this.f92125b = str2;
            this.f92126c = z;
        }

        @Override // com.p051p1.mobile.putong.facertification.TTFacertificationClient.InterfaceC10893a
        /* JADX INFO: renamed from: a */
        public void mo47739a(VerificationToken verificationToken, RxFacertification.PreDetectException preDetectException) {
            jxf jxfVar = preDetectException.prepareResult;
            String providerNameForTracker = verificationToken.getProviderNameForTracker();
            String str = jxfVar.f123025c;
            d3l0.m113857n(providerNameForTracker, str, this.f92124a, e4l0.this.f92116b);
            e4l0.this.m119448j("prepareCallback failed:" + str + Constants.PACKNAME_END + jxfVar.f123028f + Constants.PACKNAME_END + jxfVar.f123027e + ";userId:" + CoreModule.m30929H().userId(), null);
            if (e4l0.this.m119445g() && e4l0.this.f92121g == 2) {
                d3l0.m113858o(str, providerNameForTracker, this.f92125b);
            } else {
                d3l0.m113859p(str, providerNameForTracker, this.f92125b);
            }
            if (verificationToken.isTencentProvider()) {
                if (hxf.m137590k(e4l0.this.f92117c, str, e4l0.this.f92116b, e4l0.this.f92121g)) {
                    return;
                }
                q5l0.m175471P(e4l0.this.f92117c, str);
            } else {
                if (verificationToken.isTencentIntlProvider() || verificationToken.isTencentIntlProviderV2()) {
                    q5l0.m175470O(e4l0.this.f92117c, str, e4l0.this.f92121g);
                }
                if (verificationToken.isMoMoProvider()) {
                    q5l0.m175468M(e4l0.this.f92117c, str, e4l0.this.f92121g);
                }
            }
        }

        @Override // com.p051p1.mobile.putong.facertification.TTFacertificationClient.InterfaceC10893a
        /* JADX INFO: renamed from: b */
        public void mo47740b(VerificationToken verificationToken) {
            d3l0.m113855l(verificationToken.getProviderNameForTracker(), this.f92124a, e4l0.this.f92116b);
            if (verificationToken.isMoMoProvider()) {
                cwh0.m112902a().mo155800c(TTFacertificationClient.m61384o(verificationToken), e4l0.this.f92117c.string(R$string.f19262g0));
            }
        }

        @Override // com.p051p1.mobile.putong.facertification.TTFacertificationClient.InterfaceC10893a
        /* JADX INFO: renamed from: c */
        public void mo47741c(VerificationToken verificationToken, jxf jxfVar) {
            d3l0.m113856m(verificationToken.getProviderNameForTracker(), this.f92124a, e4l0.this.f92116b, this.f92125b);
            if ((!verificationToken.isTencentIntlProvider() && !verificationToken.isTencentIntlProviderV2()) || e4l0.this.f92117c == null || e4l0.this.f92117c.isFinishing() || e4l0.this.f92117c.isDestroyed()) {
                return;
            }
            e4l0.this.f92117c.progressDismiss();
        }

        @Override // com.p051p1.mobile.putong.facertification.TTFacertificationClient.InterfaceC10893a
        /* JADX INFO: renamed from: d */
        public void mo47742d(Throwable th) {
            if (e4l0.this.m119445g()) {
                xc20.m210107s(e4l0.this.f92117c, th, e4l0.this.f92120f, e4l0.this.f92118d, this.f92124a);
            } else {
                if (th instanceof TantanException.Client.CoreService) {
                    TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
                    d3l0.m113854k(e4l0.this.f92118d, String.valueOf(coreService.code), this.f92124a, e4l0.this.f92116b);
                    int i = coreService.code;
                    if (i == 40001) {
                        o1j0.m165651y("审核中");
                        if (e4l0.this.f92117c instanceof VerificationExecuteAct) {
                            e4l0.this.f92117c.m68056e2();
                            return;
                        }
                        return;
                    }
                    if (i == 40005) {
                        o1j0.m165649w(R$string.f19039Ym);
                        if (e4l0.this.f92117c instanceof VerificationExecuteAct) {
                            e4l0.this.f92117c.m68056e2();
                            return;
                        }
                        return;
                    }
                    int i2 = e4l0.this.f92121g;
                    e4l0 e4l0Var = e4l0.this;
                    if (i2 == 3) {
                        q5l0.m175465J(e4l0Var.f92117c, String.valueOf(coreService.code));
                        if (e4l0.this.f92117c instanceof VerificationExecuteAct) {
                            e4l0.this.f92117c.m68056e2();
                            return;
                        }
                        return;
                    }
                    q5l0.m175471P(e4l0Var.f92117c, String.valueOf(coreService.code));
                }
                q5l0.m175466K(e4l0.this.f92117c);
                e4l0.this.f92117c.progressDismiss();
            }
            if (e4l0.this.f92117c instanceof VerificationExecuteAct) {
                e4l0.this.f92117c.m68056e2();
            }
        }

        @Override // com.p051p1.mobile.putong.facertification.TTFacertificationClient.InterfaceC10893a
        /* JADX INFO: renamed from: e */
        public void mo47743e(VerificationToken verificationToken) {
            d3l0.m113860q(verificationToken.getProviderNameForTracker(), this.f92124a);
            if (e4l0.this.m119445g()) {
                User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
                if (!userM116593na.isIdCardVerified() && !userM116593na.isPicVerificationVerified()) {
                    jxd0 jxd0Var = CoreModule.f18264c.f20294B0.f20489U;
                    Boolean bool = Boolean.TRUE;
                    jxd0Var.put(bool);
                    CoreModule.f18264c.f20294B0.f20486R.put(bool);
                }
                CoreModule.f18264c.f20294B0.m32620p4(CoreModule.m30929H().userId());
                if (!TextUtils.equals(e4l0.this.f92116b, "fromNameVerificationDlg")) {
                    CoreModule.f18264c.f20294B0.f20488T.put(Boolean.TRUE);
                }
                boolean z = this.f92126c;
                e4l0 e4l0Var = e4l0.this;
                if (z) {
                    AvatarResultAct.m57267g2(e4l0Var.f92117c, e4l0.this.f92121g);
                    e4l0.this.f92117c.m68056e2();
                } else {
                    e4l0Var.f92117c.setResult(-1);
                    e4l0.this.f92117c.m68056e2();
                }
            }
        }
    }

    public e4l0(Act act, String str, boolean z, String str2, String str3, int i, String str4) {
        this.f92118d = "";
        this.f92117c = act;
        this.f92116b = str;
        this.f92122h = z;
        this.f92119e = str2;
        this.f92120f = str3;
        this.f92121g = i;
        this.f92118d = y5l0.m214309c();
        this.f92123i = str4;
    }

    /* JADX INFO: renamed from: g */
    public boolean m119445g() {
        return (TextUtils.isEmpty(this.f92119e) || TextUtils.isEmpty(this.f92120f) || this.f92121g == 1) ? false : true;
    }

    /* JADX INFO: renamed from: h */
    public VerificationTokenRequestParam m119446h(boolean z, boolean z2) {
        String str;
        VerificationTokenRequestParam verificationTokenRequestParamM214308b;
        String str2 = this.f92116b;
        str2.getClass();
        switch (str2) {
            case "fromPicVerificationDlg":
            case "fromNameVerificationDlg":
                str = com.tencent.connect.common.Constants.VIA_SHARE_TYPE_INFO;
                break;
            case "fromAccountBackH5":
                str = "7";
                break;
            case "appeal":
                str = "4";
                break;
            case "fakeBatch":
                str = "5";
                break;
            default:
                str = "1";
                break;
        }
        String strM142515c = ixf.m142515c(this.f92117c, true);
        if (TextUtils.equals(this.f92116b, "fromAccountBackH5")) {
            verificationTokenRequestParamM214308b = y5l0.m214307a(strM142515c, str, this.f92123i);
        } else {
            int i = this.f92121g;
            if (i == 2) {
                verificationTokenRequestParamM214308b = y5l0.m214310d(this.f92119e, this.f92120f, strM142515c, this.f92122h, str);
            } else if (i == 1) {
                verificationTokenRequestParamM214308b = y5l0.m214312f(strM142515c, str);
            } else {
                verificationTokenRequestParamM214308b = i == 3 ? y5l0.m214308b(strM142515c, str) : null;
            }
        }
        if (NullChecker.m82486a(verificationTokenRequestParamM214308b)) {
            verificationTokenRequestParamM214308b.enableVolcEnginePro = z;
            verificationTokenRequestParamM214308b.newProcess = z2;
        }
        return verificationTokenRequestParamM214308b;
    }

    /* JADX INFO: renamed from: i */
    public TTFacertificationClient.InterfaceC10893a m119447i(boolean z) {
        return new C16716a(x5l0.m209396i(this.f92116b, this.f92121g), x5l0.m209395h(this.f92121g), z);
    }

    /* JADX INFO: renamed from: j */
    public final void m119448j(String str, Throwable th) {
        CrashHelper.m82480d(th == null ? new Exception(str) : new Exception(str, th), 50);
    }
}
