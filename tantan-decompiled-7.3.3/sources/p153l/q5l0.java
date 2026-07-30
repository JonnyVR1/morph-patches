package p153l;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.core.p058ui.dlg.CoreDlg;
import com.p051p1.mobile.putong.core.p058ui.verification.ManualFaceVerificationAct;
import com.p051p1.mobile.putong.core.p058ui.verification.VerificationExecuteAct;
import com.p051p1.mobile.putong.data.VerificationToken;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p135ec.Tnaf;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes12.dex */
public class q5l0 {

    /* JADX INFO: renamed from: a */
    public static kcg0 f155732a;

    /* JADX INFO: renamed from: b */
    public static C22508b<String> f155733b = C22508b.m222767b();

    /* JADX INFO: renamed from: c */
    public static final ArrayList<String> f155734c = jyb.m147507f0("4200", "4300");

    /* JADX INFO: renamed from: d */
    public static byd0 f155735d = new byd0("LastFPPErrorTime" + CoreModule.m30929H().userId(), 0L);

    /* JADX INFO: renamed from: e */
    public static vxd0 f155736e = new vxd0("fPPErrorCount" + CoreModule.m30929H().userId(), 0);

    /* JADX INFO: renamed from: f */
    public static final ArrayList<String> f155737f = jyb.m147507f0("21100", "21200", "31100", "31200");

    /* JADX INFO: renamed from: g */
    public static byd0 f155738g = new byd0("LastTxErrorTime" + CoreModule.m30929H().userId(), 0L);

    /* JADX INFO: renamed from: h */
    public static vxd0 f155739h = new vxd0("TxErrorCount" + CoreModule.m30929H().userId(), 0);

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m175457B(Act act, DialogInterface dialogInterface) {
        if (act instanceof VerificationExecuteAct) {
            act.m68056e2();
        }
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m175458C(Act act, DialogInterface dialogInterface) {
        if (act instanceof VerificationExecuteAct) {
            act.m68056e2();
        }
    }

    /* JADX INFO: renamed from: D */
    public static boolean m175459D(Act act, final String str, String str2, int i) {
        if (i == 2 || !jyb.m147520m(f155737f, new qcj() { // from class: l.z4l0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((String) obj).equals(str));
            }
        })) {
            return false;
        }
        if (tzi0.m193670h(pzi0.m174454o(), f155738g.get().longValue(), 1)) {
            f155739h.put(1);
            f155738g.put(Long.valueOf(pzi0.m174454o()));
            return false;
        }
        if (f155739h.get().intValue() >= 2) {
            m175467L(act, str2);
            return true;
        }
        vxd0 vxd0Var = f155739h;
        vxd0Var.put(Integer.valueOf(vxd0Var.get().intValue() + 1));
        return false;
    }

    /* JADX INFO: renamed from: E */
    public static void m175460E(final Act act, final String str) {
        if (CoreModule.m30932N().isCameraSdkLoaded()) {
            act.startActivity(ManualFaceVerificationAct.m57170Z1(act, str));
        } else {
            m175473R(act, new x20() { // from class: l.a5l0
                @Override // p153l.x20
                public final void call() {
                    Act act2 = act;
                    act2.startActivity(ManualFaceVerificationAct.m57170Z1(act2, str));
                }
            });
        }
    }

    /* JADX INFO: renamed from: F */
    public static void m175461F(final Act act, String str, final String str2) {
        act.duringCreated(CoreModule.f18264c.f20294B0.m32618n4(str)).subscribe(psd0.m173597H(new y20() { // from class: l.b5l0
            @Override // p153l.y20
            public final void call(Object obj) {
                q5l0.m175489p(act, str2, (uxj0) obj);
            }
        }, new y20() { // from class: l.c5l0
            @Override // p153l.y20
            public final void call(Object obj) {
                o1j0.m165646t(act.string(R$string.f19412ks)).show();
            }
        }));
    }

    /* JADX INFO: renamed from: G */
    public static void m175462G(final Act act, final String str) {
        i4g0.m138523u("e_avatar_verification_video_guide_button", "p_avatar_verification_video_guide_popup", jyb.m147494Y("verification_video_button", "verification_video_agree"));
        act.progress(R$string.f18632L5);
        act.duringCreated(CoreModule.f18264c.f20294B0.m32598S3()).subscribe(psd0.m173597H(new y20() { // from class: l.j5l0
            @Override // p153l.y20
            public final void call(Object obj) {
                q5l0.m175487n(act, str, (VerificationToken) obj);
            }
        }, new y20() { // from class: l.k5l0
            @Override // p153l.y20
            public final void call(Object obj) {
                q5l0.m175498y(act, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: H */
    public static boolean m175463H(final Act act, kxf kxfVar, VerificationToken verificationToken, String str) {
        String string;
        boolean zIsALiProvider = verificationToken.isALiProvider();
        String str2 = kxfVar.f129189b;
        String str3 = kxfVar.f129194g;
        boolean z = ((TextUtils.equals("2006", str2) && TextUtils.equals("Z5128", str3)) || (TextUtils.equals(kxfVar.f129189b, "1001") && TextUtils.equals(kxfVar.f129194g, "Z5114"))) ? false : true;
        if (!zIsALiProvider || kxfVar.f129195h || !z) {
            if (TextUtils.equals(str, "fakeBatch")) {
                new jl80.C17971a(act).m146051t0(act.getString(R$string.f18406Dr)).m146033b0(act.getString(R$string.f19671t8)).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.n5l0
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        q5l0.m175490q(act, dialogInterface);
                    }
                }).m146049r0();
            }
            return zIsALiProvider;
        }
        if (TextUtils.equals("1001", str2)) {
            if (TextUtils.equals("Z1004", str3)) {
                string = act.getString(R$string.f18592Jr);
            } else if (TextUtils.equals("Z1005", str3)) {
                string = act.getString(R$string.f18623Kr);
            } else if (TextUtils.equals("Z1006", str3)) {
                string = act.getString(R$string.f18437Er);
            } else if (TextUtils.equals("Z6001", str3) || TextUtils.equals("Z1018", str3) || TextUtils.equals("Z1019", str3) || TextUtils.equals("Z1020", str3)) {
                string = act.getString(R$string.f18375Cr);
            } else if (TextUtils.equals("Z6002", str3)) {
                string = act.getString(R$string.f18468Fr);
            } else {
                string = TextUtils.equals("Z1024", str3) ? act.getString(R$string.f18561Ir) : act.getString(R$string.f18406Dr);
            }
        } else if (TextUtils.equals("2002", str2)) {
            string = act.getString(R$string.f18468Fr);
        } else if (TextUtils.equals("2003", str2)) {
            string = act.getString(R$string.f18530Hr);
        } else {
            string = TextUtils.equals("417", str2) ? act.getString(R$string.f18499Gr) : act.getString(R$string.f18406Dr);
        }
        new jl80.C17971a(act).m146051t0(string).m146033b0(act.getString(R$string.f19671t8)).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.m5l0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                q5l0.m175493t(act, dialogInterface);
            }
        }).m146049r0();
        return zIsALiProvider;
    }

    /* JADX INFO: renamed from: I */
    public static void m175464I(Act act, String str) {
        if (Integer.parseInt(str) == 1006) {
            return;
        }
        new jl80.C17971a(act).m146051t0(act.getString(R$string.f18406Dr)).m146033b0(act.getString(R$string.f19671t8)).m146049r0();
    }

    /* JADX INFO: renamed from: J */
    public static void m175465J(Act act, String str) {
        switch (Integer.parseInt(str)) {
            case 40013:
                o1j0.m165624F(act, "当前头像不真实，请修改后再试");
                break;
            case TantanException.Client.AccountService.INVALID_SMS_CODE /* 40014 */:
                o1j0.m165624F(act, "资料审核中，请稍后再试");
                break;
            case TantanException.Client.AccountService.CONF_CODE_EXPIRED /* 40015 */:
                o1j0.m165624F(act, "账号状态异常");
                break;
            default:
                o1j0.m165624F(act, "网络异常");
                break;
        }
    }

    /* JADX INFO: renamed from: K */
    public static void m175466K(Act act) {
        o1j0.m165646t(act.string(R$string.f19290gs)).show();
    }

    /* JADX INFO: renamed from: L */
    public static void m175467L(final Act act, final String str) {
        if (!NullChecker.m82486a(act) || act.isFinishing()) {
            return;
        }
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_avatar_verification_video_guide_popup", "showManualDialog");
        l4g0VarM204399c.m152781p(jyb.m147494Y("tooltips_trigger_mode", Active.TYPE));
        new jl80.C17971a(act).m146024S(dbc0.f86342Ld).m146055x0(R$string.f18919Um, new Object[0]).m146050s0(R$string.f18859Sm, new Object[0]).m146021P(true).m146032a0(R$string.f18949Vm, new Runnable() { // from class: l.n4l0
            @Override // java.lang.Runnable
            public final void run() {
                q5l0.m175462G(act, str);
            }
        }).m146026U(R$string.f18889Tm, new Runnable() { // from class: l.y4l0
            @Override // java.lang.Runnable
            public final void run() {
                i4g0.m138523u("e_avatar_verification_video_guide_button", "p_avatar_verification_video_guide_popup", jyb.m147494Y("verification_video_button", "verification_video_refuse"));
            }
        }).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.i5l0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        }).m146049r0();
        w1e.m204402f(l4g0VarM204399c);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: M */
    public static void m175468M(final Act act, String str, int i) {
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
                new jl80.C17971a(act).m146051t0(act.getString(R$string.f18468Fr)).m146033b0(act.getString(R$string.f19671t8)).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.f5l0
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        q5l0.m175478e(act, dialogInterface);
                    }
                }).m146049r0();
                return;
            case 6:
                new jl80.C17971a(act).m146051t0("操作超时啦，再试一次吧").m146033b0("好的").m146049r0();
                break;
            case 11:
            case 12:
                break;
            default:
                o1j0.m165624F(act, act.getString(R$string.f18334Bh));
                if (act instanceof VerificationExecuteAct) {
                    act.m68056e2();
                    return;
                }
                return;
        }
        new jl80.C17971a(act).m146051t0("认证需要对探探开启相机和存储权限喔，确保权限开启后再试试吧。如仍然无法认证，请在「首页底部消息按钮」-「探探小助手」中反馈，我们会加速为你解决").m146033b0("好的").m146045n0(new DialogInterface.OnDismissListener() { // from class: l.g5l0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                q5l0.m175483j(act, dialogInterface);
            }
        }).m146049r0();
    }

    /* JADX INFO: renamed from: N */
    public static void m175469N(Act act, String str) {
        boolean zEquals = TextUtils.equals(str, "verification_center");
        final l4g0 l4g0VarM204399c = w1e.m204399c(zEquals ? "p_avatar_verification_review_verification_center" : "p_avatar_verification_review_swipe_page", Dialog.class.getName());
        l4g0VarM204399c.m152780o(i6e.m138810b(zEquals ? Active.TYPE : "passive", "alert", "alert_self_definition_basic", zEquals ? "verification_center_avatar_button" : "card", zEquals ? "verification_center" : "swipe_page", zEquals ? "click" : "swipe"));
        CoreDlg.m46164E1(act, act.string(R$string.f19259fs), act.string(R$string.f19228es), dbc0.f87123jk, act.string(R$string.f18894Tr), null, false, null, null, new x20() { // from class: l.h5l0
            @Override // p153l.x20
            public final void call() {
                w1e.m204401e(l4g0VarM204399c);
            }
        });
        w1e.m204402f(l4g0VarM204399c);
    }

    /* JADX INFO: renamed from: O */
    public static void m175470O(Act act, String str, int i) {
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
                new jl80.C17971a(act).m146051t0(act.getString(R$string.f18468Fr)).m146033b0(act.getString(R$string.f19671t8)).m146049r0();
                break;
            case "218":
                new jl80.C17971a(act).m146051t0("认证需要对探探开启相机和存储权限喔，确保权限开启后再试试吧。如仍然无法认证，请在「首页底部消息按钮」-「探探小助手」中反馈，我们会加速为你解决").m146033b0("好的").m146049r0();
                break;
            default:
                o1j0.m165624F(act, act.getString(R$string.f18334Bh));
                break;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: P */
    public static void m175471P(final Act act, String str) {
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
                new jl80.C17971a(act).m146051t0("刷脸时需要漏出你的完整、清晰面部才能通过认证喔。如仍然无法认证，请在「首页底部消息按钮」-「探探小助手」中反馈，我们会加速为你解决").m146033b0("好的").m146045n0(new DialogInterface.OnDismissListener() { // from class: l.s4l0
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        q5l0.m175497x(act, dialogInterface);
                    }
                }).m146049r0();
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
                new jl80.C17971a(act).m146051t0("网络异常啦，请确保手机网络、系统时间设置均正常后重启APP再试试吧。如仍然无法认证，请在「首页底部消息按钮」-「探探小助手」中反馈，我们会加速为你解决").m146033b0("好的").m146045n0(new DialogInterface.OnDismissListener() { // from class: l.q4l0
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        q5l0.m175481h(act, dialogInterface);
                    }
                }).m146049r0();
                break;
            case 18:
            case 19:
            case 20:
                new jl80.C17971a(act).m146051t0("认证需要对探探开启相机和存储权限喔，确保权限开启后再试试吧。如仍然无法认证，请在「首页底部消息按钮」-「探探小助手」中反馈，我们会加速为你解决").m146033b0("好的").m146045n0(new DialogInterface.OnDismissListener() { // from class: l.r4l0
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        q5l0.m175486m(act, dialogInterface);
                    }
                }).m146049r0();
                break;
            case 23:
                new jl80.C17971a(act).m146051t0("操作超时啦，再试一次吧").m146033b0("好的").m146045n0(new DialogInterface.OnDismissListener() { // from class: l.t4l0
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        q5l0.m175475b(act, dialogInterface);
                    }
                }).m146049r0();
                break;
            case 26:
            case 35:
            case 36:
                new jl80.C17971a(act).m146051t0("操作过于频繁，稍等5分钟再试试吧。如仍然无法认证，请在「首页底部消息按钮」-「探探小助手」中反馈，我们会加速为你解决").m146033b0("好的").m146045n0(new DialogInterface.OnDismissListener() { // from class: l.u4l0
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        q5l0.m175457B(act, dialogInterface);
                    }
                }).m146049r0();
                break;
            case 38:
                o1j0.m165624F(act, "验证次数过多，请24小时后再试");
                if (act instanceof VerificationExecuteAct) {
                    act.m68056e2();
                }
                break;
            default:
                o1j0.m165624F(act, act.getString(R$string.f18334Bh));
                if (act instanceof VerificationExecuteAct) {
                    act.m68056e2();
                }
                break;
        }
    }

    /* JADX INFO: renamed from: Q */
    public static void m175472Q(final Act act, String str, String str2) {
        int i = Integer.parseInt(str);
        if (i == -1006 || i == -1007) {
            return;
        }
        if (i == -3003) {
            new jl80.C17971a(act).m146051t0(act.getString(R$string.f18375Cr)).m146033b0(act.getString(R$string.f19671t8)).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.p4l0
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    q5l0.m175479f(act, dialogInterface);
                }
            }).m146049r0();
            return;
        }
        if (i != -3001) {
            if (i == -1003) {
                new jl80.C17971a(act).m146051t0(act.getString(R$string.f18437Er)).m146033b0(act.getString(R$string.f19671t8)).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.o4l0
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        q5l0.m175458C(act, dialogInterface);
                    }
                }).m146049r0();
                return;
            }
            if (i != -1000) {
                if (i == 100006) {
                    new jl80.C17971a(act).m146051t0(act.getString(R$string.f18530Hr)).m146033b0(act.getString(R$string.f19671t8)).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.o5l0
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            q5l0.m175485l(act, dialogInterface);
                        }
                    }).m146049r0();
                    return;
                }
                o1j0.m165624F(act, act.getString(R$string.f18334Bh));
                if (act instanceof VerificationExecuteAct) {
                    act.m68056e2();
                    return;
                }
                return;
            }
        }
        new jl80.C17971a(act).m146051t0(act.getString(R$string.f18468Fr)).m146033b0(act.getString(R$string.f19671t8)).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.p5l0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                q5l0.m175495v(act, dialogInterface);
            }
        }).m146049r0();
    }

    /* JADX INFO: renamed from: R */
    public static void m175473R(final Act act, final x20 x20Var) {
        if (!wzx.m208784k() && !PermissionHelper.m81064b("android.permission.WRITE_EXTERNAL_STORAGE")) {
            PermissionHelper.m81065c().m81083r("android.permission.WRITE_EXTERNAL_STORAGE").m81080o(new x20() { // from class: l.d5l0
                @Override // p153l.x20
                public final void call() {
                    q5l0.m175473R(act, x20Var);
                }
            }).m81088w(false).m81086u(true).m81074i(act);
            return;
        }
        final android.app.Dialog dialogProgress = act.progress("");
        if (NullChecker.m82486a(dialogProgress)) {
            dialogProgress.setCancelable(true);
            dialogProgress.setCanceledOnTouchOutside(true);
        }
        act.duringCreated(CoreModule.m30932N().cameraSdkLoaded()).subscribe(psd0.m173596G(new y20() { // from class: l.e5l0
            @Override // p153l.y20
            public final void call(Object obj) {
                q5l0.m175494u(dialogProgress, x20Var, (uxj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m175474a(final Act act, VerificationToken verificationToken, final String str) {
        m175460E(act, verificationToken.token);
        if (NullChecker.m82486a(f155732a)) {
            f155732a.unsubscribe();
        }
        f155732a = f155733b.distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.v4l0
            @Override // p153l.y20
            public final void call(Object obj) {
                q5l0.m175491r(act, str, (String) obj);
            }
        }));
        act.creates(new y20() { // from class: l.w4l0
            @Override // p153l.y20
            public final void call(Object obj) {
                q5l0.m175482i((Bundle) obj);
            }
        }, new x20() { // from class: l.x4l0
            @Override // p153l.x20
            public final void call() {
                psd0.m173633z(q5l0.f155732a);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m175475b(Act act, DialogInterface dialogInterface) {
        if (act instanceof VerificationExecuteAct) {
            act.m68056e2();
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m175478e(Act act, DialogInterface dialogInterface) {
        if (act instanceof VerificationExecuteAct) {
            act.m68056e2();
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m175479f(Act act, DialogInterface dialogInterface) {
        if (act instanceof VerificationExecuteAct) {
            act.m68056e2();
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m175481h(Act act, DialogInterface dialogInterface) {
        if (act instanceof VerificationExecuteAct) {
            act.m68056e2();
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m175482i(Bundle bundle) {
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m175483j(Act act, DialogInterface dialogInterface) {
        if (act instanceof VerificationExecuteAct) {
            act.m68056e2();
        }
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m175485l(Act act, DialogInterface dialogInterface) {
        if (act instanceof VerificationExecuteAct) {
            act.m68056e2();
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m175486m(Act act, DialogInterface dialogInterface) {
        if (act instanceof VerificationExecuteAct) {
            act.m68056e2();
        }
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m175487n(final Act act, final String str, final VerificationToken verificationToken) {
        act.progressDismiss();
        if (NullChecker.m82486a(verificationToken) && NullChecker.m82486a(verificationToken.token) && verificationToken.token.length() == 4) {
            PermissionHelper.m81065c().m81083r(wzx.m208784k() ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"}).m81088w(false).m81086u(true).m81080o(new x20() { // from class: l.l5l0
                @Override // p153l.x20
                public final void call() {
                    q5l0.m175474a(act, verificationToken, str);
                }
            }).m81074i(act);
        } else {
            o1j0.m165649w(R$string.f19605r4);
        }
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m175489p(Act act, String str, uxj0 uxj0Var) {
        if (!NullChecker.m82486a(act) || act.isFinishing()) {
            return;
        }
        m175469N(act, str);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m175490q(Act act, DialogInterface dialogInterface) {
        if (act instanceof VerificationExecuteAct) {
            act.m68056e2();
        }
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m175491r(Act act, String str, String str2) {
        if (NullChecker.m82486a(str2)) {
            m175461F(act, str2, str);
        } else {
            o1j0.m165646t(act.string(R$string.f19412ks)).show();
        }
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m175493t(Act act, DialogInterface dialogInterface) {
        if (act instanceof VerificationExecuteAct) {
            act.m68056e2();
        }
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m175494u(android.app.Dialog dialog, x20 x20Var, uxj0 uxj0Var) {
        if (NullChecker.m82486a(dialog) && dialog.isShowing()) {
            dialog.dismiss();
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m175495v(Act act, DialogInterface dialogInterface) {
        if (act instanceof VerificationExecuteAct) {
            act.m68056e2();
        }
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m175497x(Act act, DialogInterface dialogInterface) {
        if (act instanceof VerificationExecuteAct) {
            act.m68056e2();
        }
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m175498y(Act act, Throwable th) {
        act.progressDismiss();
        o1j0.m165649w(R$string.f19605r4);
    }
}
