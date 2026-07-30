package p149l;

import android.text.TextUtils;
import com.meituan.robust.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.verification.VerificationExecuteAct;
import com.p046p1.mobile.putong.core.p053ui.verification.remind.result.AvatarResultAct;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.VerificationToken;
import com.p046p1.mobile.putong.data.VerificationTokenRequestParam;
import com.p046p1.mobile.putong.facertification.RxFacertification;
import com.p046p1.mobile.putong.facertification.TTFacertificationClient;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class yuk0 {

    /* JADX INFO: renamed from: a */
    public boolean f200088a = true;

    /* JADX INFO: renamed from: b */
    public String f200089b;

    /* JADX INFO: renamed from: c */
    public Act f200090c;

    /* JADX INFO: renamed from: d */
    public String f200091d;

    /* JADX INFO: renamed from: e */
    public String f200092e;

    /* JADX INFO: renamed from: f */
    public String f200093f;

    /* JADX INFO: renamed from: g */
    public int f200094g;

    /* JADX INFO: renamed from: h */
    public boolean f200095h;

    /* JADX INFO: renamed from: i */
    public String f200096i;

    /* JADX INFO: renamed from: l.yuk0$a */
    public class C21516a implements TTFacertificationClient.InterfaceC10730a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f200097a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f200098b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f200099c;

        public C21516a(String str, String str2, boolean z) {
            this.f200097a = str;
            this.f200098b = str2;
            this.f200099c = z;
        }

        @Override // com.p046p1.mobile.putong.facertification.TTFacertificationClient.InterfaceC10730a
        /* JADX INFO: renamed from: a */
        public void mo46556a(VerificationToken verificationToken, RxFacertification.PreDetectException preDetectException) {
            vvf vvfVar = preDetectException.prepareResult;
            String providerNameForTracker = verificationToken.getProviderNameForTracker();
            String str = vvfVar.f183221c;
            xtk0.m210991n(providerNameForTracker, str, this.f200097a, yuk0.this.f200089b);
            yuk0.this.m216127j("prepareCallback failed:" + str + Constants.PACKNAME_END + vvfVar.f183224f + Constants.PACKNAME_END + vvfVar.f183223e + ";userId:" + CoreModule.m29931H().userId(), null);
            if (yuk0.this.m216124g() && yuk0.this.f200094g == 2) {
                xtk0.m210992o(str, providerNameForTracker, this.f200098b);
            } else {
                xtk0.m210993p(str, providerNameForTracker, this.f200098b);
            }
            if (verificationToken.isTencentProvider()) {
                if (tvf.m190733k(yuk0.this.f200090c, str, yuk0.this.f200089b, yuk0.this.f200094g)) {
                    return;
                }
                kwk0.m147565P(yuk0.this.f200090c, str);
            } else {
                if (verificationToken.isTencentIntlProvider() || verificationToken.isTencentIntlProviderV2()) {
                    kwk0.m147564O(yuk0.this.f200090c, str, yuk0.this.f200094g);
                }
                if (verificationToken.isMoMoProvider()) {
                    kwk0.m147562M(yuk0.this.f200090c, str, yuk0.this.f200094g);
                }
            }
        }

        @Override // com.p046p1.mobile.putong.facertification.TTFacertificationClient.InterfaceC10730a
        /* JADX INFO: renamed from: b */
        public void mo46557b(VerificationToken verificationToken) {
            xtk0.m210989l(verificationToken.getProviderNameForTracker(), this.f200097a, yuk0.this.f200089b);
            if (verificationToken.isMoMoProvider()) {
                vnh0.m199014a().mo211259c(TTFacertificationClient.m60200o(verificationToken), yuk0.this.f200090c.string(R$string.f18532g0));
            }
        }

        @Override // com.p046p1.mobile.putong.facertification.TTFacertificationClient.InterfaceC10730a
        /* JADX INFO: renamed from: c */
        public void mo46558c(VerificationToken verificationToken, vvf vvfVar) {
            xtk0.m210990m(verificationToken.getProviderNameForTracker(), this.f200097a, yuk0.this.f200089b, this.f200098b);
            if ((!verificationToken.isTencentIntlProvider() && !verificationToken.isTencentIntlProviderV2()) || yuk0.this.f200090c == null || yuk0.this.f200090c.isFinishing() || yuk0.this.f200090c.isDestroyed()) {
                return;
            }
            yuk0.this.f200090c.progressDismiss();
        }

        @Override // com.p046p1.mobile.putong.facertification.TTFacertificationClient.InterfaceC10730a
        /* JADX INFO: renamed from: d */
        public void mo46559d(Throwable th) {
            if (yuk0.this.m216124g()) {
                p420.m167353s(yuk0.this.f200090c, th, yuk0.this.f200093f, yuk0.this.f200091d, this.f200097a);
            } else {
                if (th instanceof TantanException.Client.CoreService) {
                    TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
                    xtk0.m210988k(yuk0.this.f200091d, String.valueOf(coreService.code), this.f200097a, yuk0.this.f200089b);
                    int i = coreService.code;
                    if (i == 40001) {
                        lsi0.m151595y("审核中");
                        if (yuk0.this.f200090c instanceof VerificationExecuteAct) {
                            yuk0.this.f200090c.m66873d2();
                            return;
                        }
                        return;
                    }
                    if (i == 40005) {
                        lsi0.m151593w(R$string.f17649Cm);
                        if (yuk0.this.f200090c instanceof VerificationExecuteAct) {
                            yuk0.this.f200090c.m66873d2();
                            return;
                        }
                        return;
                    }
                    int i2 = yuk0.this.f200094g;
                    yuk0 yuk0Var = yuk0.this;
                    if (i2 == 3) {
                        kwk0.m147559J(yuk0Var.f200090c, String.valueOf(coreService.code));
                        if (yuk0.this.f200090c instanceof VerificationExecuteAct) {
                            yuk0.this.f200090c.m66873d2();
                            return;
                        }
                        return;
                    }
                    kwk0.m147565P(yuk0Var.f200090c, String.valueOf(coreService.code));
                }
                kwk0.m147560K(yuk0.this.f200090c);
                yuk0.this.f200090c.progressDismiss();
            }
            if (yuk0.this.f200090c instanceof VerificationExecuteAct) {
                yuk0.this.f200090c.m66873d2();
            }
        }

        @Override // com.p046p1.mobile.putong.facertification.TTFacertificationClient.InterfaceC10730a
        /* JADX INFO: renamed from: e */
        public void mo46560e(VerificationToken verificationToken) {
            xtk0.m210994q(verificationToken.getProviderNameForTracker(), this.f200097a);
            if (yuk0.this.m216124g()) {
                User userM169520na = CoreModule.f17545c.f19639e0.m169520na();
                if (!userM169520na.isIdCardVerified() && !userM169520na.isPicVerificationVerified()) {
                    hpd0 hpd0Var = CoreModule.f17545c.f19552B0.f19747U;
                    Boolean bool = Boolean.TRUE;
                    hpd0Var.put(bool);
                    CoreModule.f17545c.f19552B0.f19744R.put(bool);
                }
                CoreModule.f17545c.f19552B0.m31617p4(CoreModule.m29931H().userId());
                if (!TextUtils.equals(yuk0.this.f200089b, "fromNameVerificationDlg")) {
                    CoreModule.f17545c.f19552B0.f19746T.put(Boolean.TRUE);
                }
                boolean z = this.f200099c;
                yuk0 yuk0Var = yuk0.this;
                if (z) {
                    AvatarResultAct.m56084e2(yuk0Var.f200090c, yuk0.this.f200094g);
                    yuk0.this.f200090c.m66873d2();
                } else {
                    yuk0Var.f200090c.setResult(-1);
                    yuk0.this.f200090c.m66873d2();
                }
            }
        }
    }

    public yuk0(Act act, String str, boolean z, String str2, String str3, int i, String str4) {
        this.f200091d = "";
        this.f200090c = act;
        this.f200089b = str;
        this.f200095h = z;
        this.f200092e = str2;
        this.f200093f = str3;
        this.f200094g = i;
        this.f200091d = swk0.m186327c();
        this.f200096i = str4;
    }

    /* JADX INFO: renamed from: g */
    public boolean m216124g() {
        return (TextUtils.isEmpty(this.f200092e) || TextUtils.isEmpty(this.f200093f) || this.f200094g == 1) ? false : true;
    }

    /* JADX INFO: renamed from: h */
    public VerificationTokenRequestParam m216125h(boolean z, boolean z2) {
        String str;
        VerificationTokenRequestParam verificationTokenRequestParamM186326b;
        String str2 = this.f200089b;
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
        String strM196075c = uvf.m196075c(this.f200090c, true);
        if (TextUtils.equals(this.f200089b, "fromAccountBackH5")) {
            verificationTokenRequestParamM186326b = swk0.m186325a(strM196075c, str, this.f200096i);
        } else {
            int i = this.f200094g;
            if (i == 2) {
                verificationTokenRequestParamM186326b = swk0.m186328d(this.f200092e, this.f200093f, strM196075c, this.f200095h, str);
            } else if (i == 1) {
                verificationTokenRequestParamM186326b = swk0.m186330f(strM196075c, str);
            } else {
                verificationTokenRequestParamM186326b = i == 3 ? swk0.m186326b(strM196075c, str) : null;
            }
        }
        if (NullChecker.m81303a(verificationTokenRequestParamM186326b)) {
            verificationTokenRequestParamM186326b.enableVolcEnginePro = z;
            verificationTokenRequestParamM186326b.newProcess = z2;
        }
        return verificationTokenRequestParamM186326b;
    }

    /* JADX INFO: renamed from: i */
    public TTFacertificationClient.InterfaceC10730a m216126i(boolean z) {
        return new C21516a(rwk0.m181426i(this.f200089b, this.f200094g), rwk0.m181425h(this.f200094g), z);
    }

    /* JADX INFO: renamed from: j */
    public final void m216127j(String str, Throwable th) {
        CrashHelper.m81297d(th == null ? new Exception(str) : new Exception(str, th), 50);
    }
}
