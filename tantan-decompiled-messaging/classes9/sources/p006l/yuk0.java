package p006l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.api.api.TantanException;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.p004ui.verification.VerificationExecuteAct;
import com.p000p1.mobile.putong.core.p004ui.verification.remind.result.AvatarResultAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.VerificationToken;
import com.p1.mobile.putong.data.VerificationTokenRequestParam;
import com.p1.mobile.putong.facertification.RxFacertification;
import com.p1.mobile.putong.facertification.TTFacertificationClient;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import l.hpd0;
import l.lsi0;
import l.uvf;
import l.vnh0;
import l.vvf;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class yuk0 {

    /* JADX INFO: renamed from: a */
    public boolean f28396a = true;

    /* JADX INFO: renamed from: b */
    public String f28397b;

    /* JADX INFO: renamed from: c */
    public Act f28398c;

    /* JADX INFO: renamed from: d */
    public String f28399d;

    /* JADX INFO: renamed from: e */
    public String f28400e;

    /* JADX INFO: renamed from: f */
    public String f28401f;

    /* JADX INFO: renamed from: g */
    public int f28402g;

    /* JADX INFO: renamed from: h */
    public boolean f28403h;

    /* JADX INFO: renamed from: i */
    public String f28404i;

    /* JADX INFO: renamed from: l.yuk0$a */
    public class C1496a implements TTFacertificationClient.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f28405a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f28406b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f28407c;

        public C1496a(String str, String str2, boolean z) {
            this.f28405a = str;
            this.f28406b = str2;
            this.f28407c = z;
        }

        /* JADX INFO: renamed from: a */
        public void m28404a(VerificationToken verificationToken, RxFacertification.PreDetectException preDetectException) {
            vvf vvfVar = preDetectException.prepareResult;
            String providerNameForTracker = verificationToken.getProviderNameForTracker();
            String str = vvfVar.c;
            xtk0.m27619n(providerNameForTracker, str, this.f28405a, yuk0.this.f28397b);
            yuk0.this.m28403j("prepareCallback failed:" + str + ";" + vvfVar.f + ";" + vvfVar.e + ";userId:" + CoreModule.m1850H().userId(), null);
            if (yuk0.this.m28400g() && yuk0.this.f28402g == 2) {
                xtk0.m27620o(str, providerNameForTracker, this.f28406b);
            } else {
                xtk0.m27621p(str, providerNameForTracker, this.f28406b);
            }
            if (verificationToken.isTencentProvider()) {
                if (tvf.m24832k(yuk0.this.f28398c, str, yuk0.this.f28397b, yuk0.this.f28402g)) {
                    return;
                }
                kwk0.m18288P(yuk0.this.f28398c, str);
            } else {
                if (verificationToken.isTencentIntlProvider() || verificationToken.isTencentIntlProviderV2()) {
                    kwk0.m18287O(yuk0.this.f28398c, str, yuk0.this.f28402g);
                }
                if (verificationToken.isMoMoProvider()) {
                    kwk0.m18285M(yuk0.this.f28398c, str, yuk0.this.f28402g);
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public void m28405b(VerificationToken verificationToken) {
            xtk0.m27617l(verificationToken.getProviderNameForTracker(), this.f28405a, yuk0.this.f28397b);
            if (verificationToken.isMoMoProvider()) {
                vnh0.a().c(TTFacertificationClient.o(verificationToken), yuk0.this.f28398c.string(R$string.f2521g0));
            }
        }

        /* JADX INFO: renamed from: c */
        public void m28406c(VerificationToken verificationToken, vvf vvfVar) {
            xtk0.m27618m(verificationToken.getProviderNameForTracker(), this.f28405a, yuk0.this.f28397b, this.f28406b);
            if ((!verificationToken.isTencentIntlProvider() && !verificationToken.isTencentIntlProviderV2()) || yuk0.this.f28398c == null || yuk0.this.f28398c.isFinishing() || yuk0.this.f28398c.isDestroyed()) {
                return;
            }
            yuk0.this.f28398c.progressDismiss();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: d */
        public void m28407d(Throwable th) {
            if (yuk0.this.m28400g()) {
                p420.m21035s(yuk0.this.f28398c, th, yuk0.this.f28401f, yuk0.this.f28399d, this.f28405a);
            } else {
                if (th instanceof TantanException.Client.CoreService) {
                    TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
                    xtk0.m27616k(yuk0.this.f28399d, String.valueOf(coreService.code), this.f28405a, yuk0.this.f28397b);
                    int i = coreService.code;
                    if (i == 40001) {
                        lsi0.y("审核中");
                        if (yuk0.this.f28398c instanceof VerificationExecuteAct) {
                            yuk0.this.f28398c.finish();
                            return;
                        }
                        return;
                    }
                    if (i == 40005) {
                        lsi0.w(R$string.f1638Cm);
                        if (yuk0.this.f28398c instanceof VerificationExecuteAct) {
                            yuk0.this.f28398c.finish();
                            return;
                        }
                        return;
                    }
                    int i2 = yuk0.this.f28402g;
                    yuk0 yuk0Var = yuk0.this;
                    if (i2 == 3) {
                        kwk0.m18282J(yuk0Var.f28398c, String.valueOf(coreService.code));
                        if (yuk0.this.f28398c instanceof VerificationExecuteAct) {
                            yuk0.this.f28398c.finish();
                            return;
                        }
                        return;
                    }
                    kwk0.m18288P(yuk0Var.f28398c, String.valueOf(coreService.code));
                }
                kwk0.m18283K(yuk0.this.f28398c);
                yuk0.this.f28398c.progressDismiss();
            }
            if (yuk0.this.f28398c instanceof VerificationExecuteAct) {
                yuk0.this.f28398c.finish();
            }
        }

        /* JADX INFO: renamed from: e */
        public void m28408e(VerificationToken verificationToken) {
            xtk0.m27622q(verificationToken.getProviderNameForTracker(), this.f28405a);
            if (yuk0.this.m28400g()) {
                User userM21483na = CoreModule.f1534c.f3628e0.m21483na();
                if (!userM21483na.isIdCardVerified() && !userM21483na.isPicVerificationVerified()) {
                    hpd0 hpd0Var = CoreModule.f1534c.f3541B0.f3736U;
                    Boolean bool = Boolean.TRUE;
                    hpd0Var.put(bool);
                    CoreModule.f1534c.f3541B0.f3733R.put(bool);
                }
                CoreModule.f1534c.f3541B0.m3547p4(CoreModule.m1850H().userId());
                if (!TextUtils.equals(yuk0.this.f28397b, "fromNameVerificationDlg")) {
                    CoreModule.f1534c.f3541B0.f3735T.put(Boolean.TRUE);
                }
                boolean z = this.f28407c;
                yuk0 yuk0Var = yuk0.this;
                if (z) {
                    AvatarResultAct.m9509e2(yuk0Var.f28398c, yuk0.this.f28402g);
                    yuk0.this.f28398c.finish();
                } else {
                    yuk0Var.f28398c.setResult(-1);
                    yuk0.this.f28398c.finish();
                }
            }
        }
    }

    public yuk0(Act act, String str, boolean z, String str2, String str3, int i, String str4) {
        this.f28399d = "";
        this.f28398c = act;
        this.f28397b = str;
        this.f28403h = z;
        this.f28400e = str2;
        this.f28401f = str3;
        this.f28402g = i;
        this.f28399d = swk0.m24377c();
        this.f28404i = str4;
    }

    /* JADX INFO: renamed from: g */
    public boolean m28400g() {
        return (TextUtils.isEmpty(this.f28400e) || TextUtils.isEmpty(this.f28401f) || this.f28402g == 1) ? false : true;
    }

    /* JADX INFO: renamed from: h */
    public VerificationTokenRequestParam m28401h(boolean z, boolean z2) {
        String str;
        VerificationTokenRequestParam verificationTokenRequestParamM24376b;
        String str2 = this.f28397b;
        str2.getClass();
        switch (str2) {
            case "fromPicVerificationDlg":
            case "fromNameVerificationDlg":
                str = "6";
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
        String strC = uvf.c(this.f28398c, true);
        if (TextUtils.equals(this.f28397b, "fromAccountBackH5")) {
            verificationTokenRequestParamM24376b = swk0.m24375a(strC, str, this.f28404i);
        } else {
            int i = this.f28402g;
            if (i == 2) {
                verificationTokenRequestParamM24376b = swk0.m24378d(this.f28400e, this.f28401f, strC, this.f28403h, str);
            } else if (i == 1) {
                verificationTokenRequestParamM24376b = swk0.m24380f(strC, str);
            } else {
                verificationTokenRequestParamM24376b = i == 3 ? swk0.m24376b(strC, str) : null;
            }
        }
        if (NullChecker.a(verificationTokenRequestParamM24376b)) {
            verificationTokenRequestParamM24376b.enableVolcEnginePro = z;
            verificationTokenRequestParamM24376b.newProcess = z2;
        }
        return verificationTokenRequestParamM24376b;
    }

    /* JADX INFO: renamed from: i */
    public TTFacertificationClient.a m28402i(boolean z) {
        return new C1496a(rwk0.m23350i(this.f28397b, this.f28402g), rwk0.m23349h(this.f28402g), z);
    }

    /* JADX INFO: renamed from: j */
    public final void m28403j(String str, Throwable th) {
        CrashHelper.d(th == null ? new Exception(str) : new Exception(str, th), 50);
    }
}
