package p149l;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.core.p053ui.dlg.CoreDlg;
import com.p046p1.mobile.putong.core.p053ui.verification.ManualFaceVerificationAct;
import com.p046p1.mobile.putong.core.p053ui.verification.VerificationExecuteAct;
import com.p046p1.mobile.putong.data.VerificationToken;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p131ec.Tnaf;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes9.dex */
public class kwk0 {

    /* JADX INFO: renamed from: a */
    public static c4g0 f124989a;

    /* JADX INFO: renamed from: b */
    public static C22393b<String> f124990b = C22393b.m221521b();

    /* JADX INFO: renamed from: c */
    public static final ArrayList<String> f124991c = vwb.m200324f0("4200", "4300");

    /* JADX INFO: renamed from: d */
    public static zpd0 f124992d = new zpd0("LastFPPErrorTime" + CoreModule.m29931H().userId(), 0L);

    /* JADX INFO: renamed from: e */
    public static tpd0 f124993e = new tpd0("fPPErrorCount" + CoreModule.m29931H().userId(), 0);

    /* JADX INFO: renamed from: f */
    public static final ArrayList<String> f124994f = vwb.m200324f0("21100", "21200", "31100", "31200");

    /* JADX INFO: renamed from: g */
    public static zpd0 f124995g = new zpd0("LastTxErrorTime" + CoreModule.m29931H().userId(), 0L);

    /* JADX INFO: renamed from: h */
    public static tpd0 f124996h = new tpd0("TxErrorCount" + CoreModule.m29931H().userId(), 0);

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m147551B(Act act, DialogInterface dialogInterface) {
        if (act instanceof VerificationExecuteAct) {
            act.m66873d2();
        }
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m147552C(Act act, DialogInterface dialogInterface) {
        if (act instanceof VerificationExecuteAct) {
            act.m66873d2();
        }
    }

    /* JADX INFO: renamed from: D */
    public static boolean m147553D(Act act, final String str, String str2, int i) {
        if (i == 2 || !vwb.m200337m(f124994f, new w9j() { // from class: l.tvk0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((String) obj).equals(str));
            }
        })) {
            return false;
        }
        if (qqi0.m175940h(mqi0.m155944o(), f124995g.get().longValue(), 1)) {
            f124996h.put(1);
            f124995g.put(Long.valueOf(mqi0.m155944o()));
            return false;
        }
        if (f124996h.get().intValue() >= 2) {
            m147561L(act, str2);
            return true;
        }
        tpd0 tpd0Var = f124996h;
        tpd0Var.put(Integer.valueOf(tpd0Var.get().intValue() + 1));
        return false;
    }

    /* JADX INFO: renamed from: E */
    public static void m147554E(final Act act, final String str) {
        if (CoreModule.m29934N().isCameraSdkLoaded()) {
            act.startActivity(ManualFaceVerificationAct.m55987Y1(act, str));
        } else {
            m147567R(act, new d30() { // from class: l.uvk0
                @Override // p149l.d30
                public final void call() {
                    Act act2 = act;
                    act2.startActivity(ManualFaceVerificationAct.m55987Y1(act2, str));
                }
            });
        }
    }

    /* JADX INFO: renamed from: F */
    public static void m147555F(final Act act, String str, final String str2) {
        act.duringCreated(CoreModule.f17545c.f19552B0.m31615n4(str)).subscribe(mkd0.m154956H(new e30() { // from class: l.vvk0
            @Override // p149l.e30
            public final void call(Object obj) {
                kwk0.m147583p(act, str2, (roj0) obj);
            }
        }, new e30() { // from class: l.wvk0
            @Override // p149l.e30
            public final void call(Object obj) {
                lsi0.m151590t(act.string(R$string.f18014Or)).show();
            }
        }));
    }

    /* JADX INFO: renamed from: G */
    public static void m147556G(final Act act, final String str) {
        zvf0.m220399u("e_avatar_verification_video_guide_button", "p_avatar_verification_video_guide_popup", vwb.m200311Y("verification_video_button", "verification_video_agree"));
        act.progress(R$string.f17842J5);
        act.duringCreated(CoreModule.f17545c.f19552B0.m31595S3()).subscribe(mkd0.m154956H(new e30() { // from class: l.dwk0
            @Override // p149l.e30
            public final void call(Object obj) {
                kwk0.m147581n(act, str, (VerificationToken) obj);
            }
        }, new e30() { // from class: l.ewk0
            @Override // p149l.e30
            public final void call(Object obj) {
                kwk0.m147592y(act, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: H */
    public static boolean m147557H(final Act act, wvf wvfVar, VerificationToken verificationToken, String str) {
        String string;
        boolean zIsALiProvider = verificationToken.isALiProvider();
        String str2 = wvfVar.f188237b;
        String str3 = wvfVar.f188242g;
        boolean z = ((TextUtils.equals("2006", str2) && TextUtils.equals("Z5128", str3)) || (TextUtils.equals(wvfVar.f188237b, "1001") && TextUtils.equals(wvfVar.f188242g, "Z5114"))) ? false : true;
        if (!zIsALiProvider || wvfVar.f188243h || !z) {
            if (TextUtils.equals(str, "fakeBatch")) {
                new dd80.C16336a(act).m110991t0(act.getString(R$string.f18590hr)).m110973b0(act.getString(R$string.f18877r8)).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.hwk0
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        kwk0.m147584q(act, dialogInterface);
                    }
                }).m110989r0();
            }
            return zIsALiProvider;
        }
        if (TextUtils.equals("1001", str2)) {
            if (TextUtils.equals("Z1004", str3)) {
                string = act.getString(R$string.f18774nr);
            } else if (TextUtils.equals("Z1005", str3)) {
                string = act.getString(R$string.f18805or);
            } else if (TextUtils.equals("Z1006", str3)) {
                string = act.getString(R$string.f18620ir);
            } else if (TextUtils.equals("Z6001", str3) || TextUtils.equals("Z1018", str3) || TextUtils.equals("Z1019", str3) || TextUtils.equals("Z1020", str3)) {
                string = act.getString(R$string.f18559gr);
            } else if (TextUtils.equals("Z6002", str3)) {
                string = act.getString(R$string.f18650jr);
            } else {
                string = TextUtils.equals("Z1024", str3) ? act.getString(R$string.f18743mr) : act.getString(R$string.f18590hr);
            }
        } else if (TextUtils.equals("2002", str2)) {
            string = act.getString(R$string.f18650jr);
        } else if (TextUtils.equals("2003", str2)) {
            string = act.getString(R$string.f18712lr);
        } else {
            string = TextUtils.equals("417", str2) ? act.getString(R$string.f18681kr) : act.getString(R$string.f18590hr);
        }
        new dd80.C16336a(act).m110991t0(string).m110973b0(act.getString(R$string.f18877r8)).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.gwk0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                kwk0.m147587t(act, dialogInterface);
            }
        }).m110989r0();
        return zIsALiProvider;
    }

    /* JADX INFO: renamed from: I */
    public static void m147558I(Act act, String str) {
        if (Integer.parseInt(str) == 1006) {
            return;
        }
        new dd80.C16336a(act).m110991t0(act.getString(R$string.f18590hr)).m110973b0(act.getString(R$string.f18877r8)).m110989r0();
    }

    /* JADX INFO: renamed from: J */
    public static void m147559J(Act act, String str) {
        switch (Integer.parseInt(str)) {
            case 40013:
                lsi0.m151568F(act, "当前头像不真实，请修改后再试");
                break;
            case TantanException.Client.AccountService.INVALID_SMS_CODE /* 40014 */:
                lsi0.m151568F(act, "资料审核中，请稍后再试");
                break;
            case TantanException.Client.AccountService.CONF_CODE_EXPIRED /* 40015 */:
                lsi0.m151568F(act, "账号状态异常");
                break;
            default:
                lsi0.m151568F(act, "网络异常");
                break;
        }
    }

    /* JADX INFO: renamed from: K */
    public static void m147560K(Act act) {
        lsi0.m151590t(act.string(R$string.f17894Kr)).show();
    }

    /* JADX INFO: renamed from: L */
    public static void m147561L(final Act act, final String str) {
        if (!NullChecker.m81303a(act) || act.isFinishing()) {
            return;
        }
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_avatar_verification_video_guide_popup", "showManualDialog");
        cwf0VarM133794c.m109040p(vwb.m200311Y("tooltips_trigger_mode", Active.TYPE));
        new dd80.C16336a(act).m110964S(x2c0.f189483Kd).m110995x0(R$string.f19101ym, new Object[0]).m110990s0(R$string.f19041wm, new Object[0]).m110961P(true).m110972a0(R$string.f19131zm, new Runnable() { // from class: l.hvk0
            @Override // java.lang.Runnable
            public final void run() {
                kwk0.m147556G(act, str);
            }
        }).m110966U(R$string.f19071xm, new Runnable() { // from class: l.svk0
            @Override // java.lang.Runnable
            public final void run() {
                zvf0.m220399u("e_avatar_verification_video_guide_button", "p_avatar_verification_video_guide_popup", vwb.m200311Y("verification_video_button", "verification_video_refuse"));
            }
        }).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.cwk0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        }).m110989r0();
        i0e.m133797f(cwf0VarM133794c);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: M */
    public static void m147562M(final Act act, String str, int i) {
        byte b = 2;
        if (i == 2) {
            return;
        }
        str.getClass();
        switch (str.hashCode()) {
            case 1507424:
                b = !str.equals("1001") ? (byte) -1 : (byte) 0;
                break;
            case 1507425:
                b = !str.equals("1002") ? (byte) -1 : (byte) 1;
                break;
            case 1507426:
                if (!str.equals("1003")) {
                    b = -1;
                }
                break;
            case 1507427:
                b = !str.equals("1004") ? (byte) -1 : (byte) 3;
                break;
            case 1507428:
                b = !str.equals("1005") ? (byte) -1 : (byte) 4;
                break;
            case 1537215:
                b = !str.equals("2001") ? (byte) -1 : (byte) 5;
                break;
            case 1537216:
                b = !str.equals("2002") ? (byte) -1 : (byte) 6;
                break;
            case 1537217:
                b = !str.equals("2003") ? (byte) -1 : (byte) 7;
                break;
            case 1537218:
                b = !str.equals("2004") ? (byte) -1 : (byte) 8;
                break;
            case 1537219:
                b = !str.equals("2005") ? (byte) -1 : (byte) 9;
                break;
            case 1537220:
                b = !str.equals("2006") ? (byte) -1 : (byte) 10;
                break;
            case 1537221:
                b = !str.equals("2007") ? (byte) -1 : (byte) 11;
                break;
            case 1537222:
                b = !str.equals("2008") ? (byte) -1 : (byte) 12;
                break;
            case 1537223:
                b = !str.equals("2009") ? (byte) -1 : HttpTokens.CARRIAGE_RETURN;
                break;
            case 1537245:
                b = !str.equals("2010") ? (byte) -1 : (byte) 14;
                break;
            case 1567006:
                b = !str.equals("3001") ? (byte) -1 : (byte) 15;
                break;
            case 1567007:
                b = !str.equals("3002") ? (byte) -1 : Tnaf.POW_2_WIDTH;
                break;
            case 1567008:
                b = !str.equals("3003") ? (byte) -1 : (byte) 17;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                new dd80.C16336a(act).m110991t0(act.getString(R$string.f18650jr)).m110973b0(act.getString(R$string.f18877r8)).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.zvk0
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        kwk0.m147572e(act, dialogInterface);
                    }
                }).m110989r0();
                return;
            case 6:
                new dd80.C16336a(act).m110991t0("操作超时啦，再试一次吧").m110973b0("好的").m110989r0();
                break;
            case 11:
            case 12:
                break;
            default:
                lsi0.m151568F(act, act.getString(R$string.f18549gh));
                if (act instanceof VerificationExecuteAct) {
                    act.m66873d2();
                    return;
                }
                return;
        }
        new dd80.C16336a(act).m110991t0("认证需要对探探开启相机和存储权限喔，确保权限开启后再试试吧。如仍然无法认证，请在「首页底部消息按钮」-「探探小助手」中反馈，我们会加速为你解决").m110973b0("好的").m110985n0(new DialogInterface.OnDismissListener() { // from class: l.awk0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                kwk0.m147577j(act, dialogInterface);
            }
        }).m110989r0();
    }

    /* JADX INFO: renamed from: N */
    public static void m147563N(Act act, String str) {
        boolean zEquals = TextUtils.equals(str, "verification_center");
        final cwf0 cwf0VarM133794c = i0e.m133794c(zEquals ? "p_avatar_verification_review_verification_center" : "p_avatar_verification_review_swipe_page", Dialog.class.getName());
        cwf0VarM133794c.m109039o(u4e.m191727b(zEquals ? Active.TYPE : "passive", "alert", "alert_self_definition_basic", zEquals ? "verification_center_avatar_button" : "card", zEquals ? "verification_center" : "swipe_page", zEquals ? "click" : "swipe"));
        CoreDlg.m44981E1(act, act.string(R$string.f17864Jr), act.string(R$string.f17834Ir), x2c0.f190654vj, act.string(R$string.f19076xr), null, false, null, null, new d30() { // from class: l.bwk0
            @Override // p149l.d30
            public final void call() {
                i0e.m133796e(cwf0VarM133794c);
            }
        });
        i0e.m133797f(cwf0VarM133794c);
    }

    /* JADX INFO: renamed from: O */
    public static void m147564O(Act act, String str, int i) {
        if (i == 2) {
        }
        str.getClass();
        switch (str) {
            case "211":
            case "212":
            case "213":
            case "214":
            case "215":
            case "216":
            case "217":
            case "219":
                new dd80.C16336a(act).m110991t0(act.getString(R$string.f18650jr)).m110973b0(act.getString(R$string.f18877r8)).m110989r0();
                break;
            case "218":
                new dd80.C16336a(act).m110991t0("认证需要对探探开启相机和存储权限喔，确保权限开启后再试试吧。如仍然无法认证，请在「首页底部消息按钮」-「探探小助手」中反馈，我们会加速为你解决").m110973b0("好的").m110989r0();
                break;
            default:
                lsi0.m151568F(act, act.getString(R$string.f18549gh));
                break;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: P */
    public static void m147565P(final Act act, String str) {
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case 43066831:
                if (str.equals("-1102")) {
                    b = 0;
                }
                break;
            case 43069716:
                if (str.equals("-1404")) {
                    b = 1;
                }
                break;
            case 43185033:
                if (str.equals("-5001")) {
                    b = 2;
                }
                break;
            case 43185037:
                if (str.equals("-5005")) {
                    b = 3;
                }
                break;
            case 43185041:
                if (str.equals("-5009")) {
                    b = 4;
                }
                break;
            case 43185064:
                if (str.equals("-5011")) {
                    b = 5;
                }
                break;
            case 43185094:
                if (str.equals("-5020")) {
                    b = 6;
                }
                break;
            case 43185099:
                if (str.equals("-5025")) {
                    b = 7;
                }
                break;
            case 43185101:
                if (str.equals("-5027")) {
                    b = 8;
                }
                break;
            case 46759955:
                if (str.equals("11003")) {
                    b = 9;
                }
                break;
            case 46759956:
                if (str.equals("11004")) {
                    b = 10;
                }
                break;
            case 46759957:
                if (str.equals("11005")) {
                    b = 11;
                }
                break;
            case 46759958:
                if (str.equals("11006")) {
                    b = 12;
                }
                break;
            case 46759959:
                if (str.equals("11007")) {
                    b = HttpTokens.CARRIAGE_RETURN;
                }
                break;
            case 47684434:
                if (str.equals("21100")) {
                    b = 14;
                }
                break;
            case 47685395:
                if (str.equals("21200")) {
                    b = 15;
                }
                break;
            case 48607955:
                if (str.equals("31100")) {
                    b = Tnaf.POW_2_WIDTH;
                }
                break;
            case 48608916:
                if (str.equals("31200")) {
                    b = 17;
                }
                break;
            case 49530517:
                if (str.equals("41002")) {
                    b = 18;
                }
                break;
            case 49530518:
                if (str.equals("41003")) {
                    b = 19;
                }
                break;
            case 49530519:
                if (str.equals("41004")) {
                    b = 20;
                }
                break;
            case 49530520:
                if (str.equals("41005")) {
                    b = 21;
                }
                break;
            case 49530521:
                if (str.equals("41006")) {
                    b = 22;
                }
                break;
            case 49530522:
                if (str.equals("41007")) {
                    b = 23;
                }
                break;
            case 49530523:
                if (str.equals("41008")) {
                    b = 24;
                }
                break;
            case 49530524:
                if (str.equals("41009")) {
                    b = 25;
                }
                break;
            case 49530546:
                if (str.equals("41010")) {
                    b = 26;
                }
                break;
            case 49530548:
                if (str.equals("41012")) {
                    b = 27;
                }
                break;
            case 50454997:
                if (str.equals("51100")) {
                    b = 28;
                }
                break;
            case 50455958:
                if (str.equals("51200")) {
                    b = 29;
                }
                break;
            case 1534523454:
                if (str.equals("400101")) {
                    b = 30;
                }
                break;
            case 1534523455:
                if (str.equals("400102")) {
                    b = 31;
                }
                break;
            case 1534523456:
                if (str.equals("400103")) {
                    b = HttpTokens.SPACE;
                }
                break;
            case 1534523457:
                if (str.equals("400104")) {
                    b = 33;
                }
                break;
            case 1534527299:
                if (str.equals("400502")) {
                    b = 34;
                }
                break;
            case 1534527301:
                if (str.equals("400504")) {
                    b = 35;
                }
                break;
            case 1534527303:
                if (str.equals("400506")) {
                    b = 36;
                }
                break;
            case 1534528262:
                if (str.equals("400604")) {
                    b = 37;
                }
                break;
            case 1900358054:
                if (str.equals("66660017")) {
                    b = 38;
                }
                break;
            case 1900358079:
                if (str.equals("66660021")) {
                    b = 39;
                }
                break;
            case 1900358081:
                if (str.equals("66660023")) {
                    b = 40;
                }
                break;
            case 1900358083:
                if (str.equals("66660025")) {
                    b = 41;
                }
                break;
            case 1900358112:
                if (str.equals("66660033")) {
                    b = 42;
                }
                break;
            case 1900358114:
                if (str.equals("66660035")) {
                    b = 43;
                }
                break;
            case 1900358115:
                if (str.equals("66660036")) {
                    b = 44;
                }
                break;
            case 1900358116:
                if (str.equals("66660037")) {
                    b = 45;
                }
                break;
            case 1900358141:
                if (str.equals("66660041")) {
                    b = 46;
                }
                break;
            case 1900358142:
                if (str.equals("66660042")) {
                    b = 47;
                }
                break;
            case 1900358143:
                if (str.equals("66660043")) {
                    b = 48;
                }
                break;
            case 1900358145:
                if (str.equals("66660045")) {
                    b = 49;
                }
                break;
            case 1900358146:
                if (str.equals("66660046")) {
                    b = 50;
                }
                break;
        }
        switch (b) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 21:
            case 24:
            case 37:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
                new dd80.C16336a(act).m110991t0("刷脸时需要漏出你的完整、清晰面部才能通过认证喔。如仍然无法认证，请在「首页底部消息按钮」-「探探小助手」中反馈，我们会加速为你解决").m110973b0("好的").m110985n0(new DialogInterface.OnDismissListener() { // from class: l.mvk0
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        kwk0.m147591x(act, dialogInterface);
                    }
                }).m110989r0();
                break;
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 22:
            case 25:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 39:
                new dd80.C16336a(act).m110991t0("网络异常啦，请确保手机网络、系统时间设置均正常后重启APP再试试吧。如仍然无法认证，请在「首页底部消息按钮」-「探探小助手」中反馈，我们会加速为你解决").m110973b0("好的").m110985n0(new DialogInterface.OnDismissListener() { // from class: l.kvk0
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        kwk0.m147575h(act, dialogInterface);
                    }
                }).m110989r0();
                break;
            case 18:
            case 19:
            case 20:
                new dd80.C16336a(act).m110991t0("认证需要对探探开启相机和存储权限喔，确保权限开启后再试试吧。如仍然无法认证，请在「首页底部消息按钮」-「探探小助手」中反馈，我们会加速为你解决").m110973b0("好的").m110985n0(new DialogInterface.OnDismissListener() { // from class: l.lvk0
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        kwk0.m147580m(act, dialogInterface);
                    }
                }).m110989r0();
                break;
            case 23:
                new dd80.C16336a(act).m110991t0("操作超时啦，再试一次吧").m110973b0("好的").m110985n0(new DialogInterface.OnDismissListener() { // from class: l.nvk0
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        kwk0.m147569b(act, dialogInterface);
                    }
                }).m110989r0();
                break;
            case 26:
            case 35:
            case 36:
                new dd80.C16336a(act).m110991t0("操作过于频繁，稍等5分钟再试试吧。如仍然无法认证，请在「首页底部消息按钮」-「探探小助手」中反馈，我们会加速为你解决").m110973b0("好的").m110985n0(new DialogInterface.OnDismissListener() { // from class: l.ovk0
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        kwk0.m147551B(act, dialogInterface);
                    }
                }).m110989r0();
                break;
            case 38:
                lsi0.m151568F(act, "验证次数过多，请24小时后再试");
                if (act instanceof VerificationExecuteAct) {
                    act.m66873d2();
                }
                break;
            default:
                lsi0.m151568F(act, act.getString(R$string.f18549gh));
                if (act instanceof VerificationExecuteAct) {
                    act.m66873d2();
                }
                break;
        }
    }

    /* JADX INFO: renamed from: Q */
    public static void m147566Q(final Act act, String str, String str2) {
        int i = Integer.parseInt(str);
        if (i == -1006 || i == -1007) {
            return;
        }
        if (i == -3003) {
            new dd80.C16336a(act).m110991t0(act.getString(R$string.f18559gr)).m110973b0(act.getString(R$string.f18877r8)).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.jvk0
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    kwk0.m147573f(act, dialogInterface);
                }
            }).m110989r0();
            return;
        }
        if (i != -3001) {
            if (i == -1003) {
                new dd80.C16336a(act).m110991t0(act.getString(R$string.f18620ir)).m110973b0(act.getString(R$string.f18877r8)).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.ivk0
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        kwk0.m147552C(act, dialogInterface);
                    }
                }).m110989r0();
                return;
            }
            if (i != -1000) {
                if (i == 100006) {
                    new dd80.C16336a(act).m110991t0(act.getString(R$string.f18712lr)).m110973b0(act.getString(R$string.f18877r8)).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.iwk0
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            kwk0.m147579l(act, dialogInterface);
                        }
                    }).m110989r0();
                    return;
                }
                lsi0.m151568F(act, act.getString(R$string.f18549gh));
                if (act instanceof VerificationExecuteAct) {
                    act.m66873d2();
                    return;
                }
                return;
            }
        }
        new dd80.C16336a(act).m110991t0(act.getString(R$string.f18650jr)).m110973b0(act.getString(R$string.f18877r8)).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.jwk0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                kwk0.m147589v(act, dialogInterface);
            }
        }).m110989r0();
    }

    /* JADX INFO: renamed from: R */
    public static void m147567R(final Act act, final d30 d30Var) {
        if (!zqx.m219898k() && !PermissionHelper.m79881b("android.permission.WRITE_EXTERNAL_STORAGE")) {
            PermissionHelper.m79882c().m79900r("android.permission.WRITE_EXTERNAL_STORAGE").m79897o(new d30() { // from class: l.xvk0
                @Override // p149l.d30
                public final void call() {
                    kwk0.m147567R(act, d30Var);
                }
            }).m79905w(false).m79903u(true).m79891i(act);
            return;
        }
        final android.app.Dialog dialogProgress = act.progress("");
        if (NullChecker.m81303a(dialogProgress)) {
            dialogProgress.setCancelable(true);
            dialogProgress.setCanceledOnTouchOutside(true);
        }
        act.duringCreated(CoreModule.m29934N().cameraSdkLoaded()).subscribe(mkd0.m154955G(new e30() { // from class: l.yvk0
            @Override // p149l.e30
            public final void call(Object obj) {
                kwk0.m147588u(dialogProgress, d30Var, (roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m147568a(final Act act, VerificationToken verificationToken, final String str) {
        m147554E(act, verificationToken.token);
        if (NullChecker.m81303a(f124989a)) {
            f124989a.unsubscribe();
        }
        f124989a = f124990b.distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.pvk0
            @Override // p149l.e30
            public final void call(Object obj) {
                kwk0.m147585r(act, str, (String) obj);
            }
        }));
        act.creates(new e30() { // from class: l.qvk0
            @Override // p149l.e30
            public final void call(Object obj) {
                kwk0.m147576i((Bundle) obj);
            }
        }, new d30() { // from class: l.rvk0
            @Override // p149l.d30
            public final void call() {
                mkd0.m154992z(kwk0.f124989a);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m147569b(Act act, DialogInterface dialogInterface) {
        if (act instanceof VerificationExecuteAct) {
            act.m66873d2();
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m147572e(Act act, DialogInterface dialogInterface) {
        if (act instanceof VerificationExecuteAct) {
            act.m66873d2();
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m147573f(Act act, DialogInterface dialogInterface) {
        if (act instanceof VerificationExecuteAct) {
            act.m66873d2();
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m147575h(Act act, DialogInterface dialogInterface) {
        if (act instanceof VerificationExecuteAct) {
            act.m66873d2();
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m147576i(Bundle bundle) {
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m147577j(Act act, DialogInterface dialogInterface) {
        if (act instanceof VerificationExecuteAct) {
            act.m66873d2();
        }
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m147579l(Act act, DialogInterface dialogInterface) {
        if (act instanceof VerificationExecuteAct) {
            act.m66873d2();
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m147580m(Act act, DialogInterface dialogInterface) {
        if (act instanceof VerificationExecuteAct) {
            act.m66873d2();
        }
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m147581n(final Act act, final String str, final VerificationToken verificationToken) {
        act.progressDismiss();
        if (NullChecker.m81303a(verificationToken) && NullChecker.m81303a(verificationToken.token) && verificationToken.token.length() == 4) {
            PermissionHelper.m79882c().m79900r(zqx.m219898k() ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"}).m79905w(false).m79903u(true).m79897o(new d30() { // from class: l.fwk0
                @Override // p149l.d30
                public final void call() {
                    kwk0.m147568a(act, verificationToken, str);
                }
            }).m79891i(act);
        } else {
            lsi0.m151593w(R$string.f18813p4);
        }
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m147583p(Act act, String str, roj0 roj0Var) {
        if (!NullChecker.m81303a(act) || act.isFinishing()) {
            return;
        }
        m147563N(act, str);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m147584q(Act act, DialogInterface dialogInterface) {
        if (act instanceof VerificationExecuteAct) {
            act.m66873d2();
        }
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m147585r(Act act, String str, String str2) {
        if (NullChecker.m81303a(str2)) {
            m147555F(act, str2, str);
        } else {
            lsi0.m151590t(act.string(R$string.f18014Or)).show();
        }
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m147587t(Act act, DialogInterface dialogInterface) {
        if (act instanceof VerificationExecuteAct) {
            act.m66873d2();
        }
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m147588u(android.app.Dialog dialog, d30 d30Var, roj0 roj0Var) {
        if (NullChecker.m81303a(dialog) && dialog.isShowing()) {
            dialog.dismiss();
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m147589v(Act act, DialogInterface dialogInterface) {
        if (act instanceof VerificationExecuteAct) {
            act.m66873d2();
        }
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m147591x(Act act, DialogInterface dialogInterface) {
        if (act instanceof VerificationExecuteAct) {
            act.m66873d2();
        }
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m147592y(Act act, Throwable th) {
        act.progressDismiss();
        lsi0.m151593w(R$string.f18813p4);
    }
}
