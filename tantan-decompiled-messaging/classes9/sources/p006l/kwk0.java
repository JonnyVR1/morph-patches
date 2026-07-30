package p006l;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.api.api.TantanException;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.p004ui.verification.ManualFaceVerificationAct;
import com.p000p1.mobile.putong.core.p004ui.verification.VerificationExecuteAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.ui.dlg.CoreDlg;
import com.p1.mobile.putong.data.VerificationToken;
import com.p1.mobile.putong.ui.permission.PermissionHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.c4g0;
import l.cwf0;
import l.d30;
import l.dd80;
import l.e30;
import l.i0e;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.mqi0;
import l.qqi0;
import l.roj0;
import l.tpd0;
import l.u4e;
import l.vwb;
import l.w9j;
import l.wvf;
import l.zpd0;
import l.zqx;
import l.zvf0;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class kwk0 {

    /* JADX INFO: renamed from: a */
    public static c4g0 f16028a;

    /* JADX INFO: renamed from: b */
    public static b<String> f16029b = b.b();

    /* JADX INFO: renamed from: c */
    public static final ArrayList<String> f16030c = vwb.f0(new String[]{"4200", "4300"});

    /* JADX INFO: renamed from: d */
    public static zpd0 f16031d = new zpd0("LastFPPErrorTime" + CoreModule.m1850H().userId(), 0L);

    /* JADX INFO: renamed from: e */
    public static tpd0 f16032e = new tpd0("fPPErrorCount" + CoreModule.m1850H().userId(), 0);

    /* JADX INFO: renamed from: f */
    public static final ArrayList<String> f16033f = vwb.f0(new String[]{"21100", "21200", "31100", "31200"});

    /* JADX INFO: renamed from: g */
    public static zpd0 f16034g = new zpd0("LastTxErrorTime" + CoreModule.m1850H().userId(), 0L);

    /* JADX INFO: renamed from: h */
    public static tpd0 f16035h = new tpd0("TxErrorCount" + CoreModule.m1850H().userId(), 0);

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m18274B(Act act, DialogInterface dialogInterface) {
        if (act instanceof VerificationExecuteAct) {
            act.finish();
        }
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m18275C(Act act, DialogInterface dialogInterface) {
        if (act instanceof VerificationExecuteAct) {
            act.finish();
        }
    }

    /* JADX INFO: renamed from: D */
    public static boolean m18276D(Act act, final String str, String str2, int i) {
        if (i == 2 || !vwb.m(f16033f, new w9j() { // from class: l.tvk0
            public final Object call(Object obj) {
                return Boolean.valueOf(((String) obj).equals(str));
            }
        })) {
            return false;
        }
        if (qqi0.h(mqi0.o(), ((Long) f16034g.get()).longValue(), 1)) {
            f16035h.put(1);
            f16034g.put(Long.valueOf(mqi0.o()));
            return false;
        }
        if (((Integer) f16035h.get()).intValue() >= 2) {
            m18284L(act, str2);
            return true;
        }
        tpd0 tpd0Var = f16035h;
        tpd0Var.put(Integer.valueOf(((Integer) tpd0Var.get()).intValue() + 1));
        return false;
    }

    /* JADX INFO: renamed from: E */
    public static void m18277E(final Act act, final String str) {
        if (CoreModule.m1853N().isCameraSdkLoaded()) {
            act.startActivity(ManualFaceVerificationAct.m9407Y1(act, str));
        } else {
            m18290R(act, new d30() { // from class: l.uvk0
                public final void call() {
                    Act act2 = act;
                    act2.startActivity(ManualFaceVerificationAct.m9407Y1(act2, str));
                }
            });
        }
    }

    /* JADX INFO: renamed from: F */
    public static void m18278F(final Act act, String str, final String str2) {
        act.duringCreated(CoreModule.f1534c.f3541B0.m3545n4(str)).subscribe(mkd0.H(new e30() { // from class: l.vvk0
            public final void call(Object obj) {
                kwk0.m18306p(act, str2, (roj0) obj);
            }
        }, new e30() { // from class: l.wvk0
            public final void call(Object obj) {
                lsi0.t(act.string(R$string.f2003Or)).show();
            }
        }));
    }

    /* JADX INFO: renamed from: G */
    public static void m18279G(final Act act, final String str) {
        zvf0.u("e_avatar_verification_video_guide_button", "p_avatar_verification_video_guide_popup", new j760[]{vwb.Y("verification_video_button", "verification_video_agree")});
        act.progress(R$string.f1831J5);
        act.duringCreated(CoreModule.f1534c.f3541B0.m3525S3()).subscribe(mkd0.H(new e30() { // from class: l.dwk0
            public final void call(Object obj) {
                kwk0.m18304n(act, str, (VerificationToken) obj);
            }
        }, new e30() { // from class: l.ewk0
            public final void call(Object obj) {
                kwk0.m18315y(act, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: H */
    public static boolean m18280H(final Act act, wvf wvfVar, VerificationToken verificationToken, String str) {
        String string;
        boolean zIsALiProvider = verificationToken.isALiProvider();
        String str2 = wvfVar.b;
        String str3 = wvfVar.g;
        boolean z = ((TextUtils.equals("2006", str2) && TextUtils.equals("Z5128", str3)) || (TextUtils.equals(wvfVar.b, "1001") && TextUtils.equals(wvfVar.g, "Z5114"))) ? false : true;
        if (!zIsALiProvider || wvfVar.h || !z) {
            if (TextUtils.equals(str, "fakeBatch")) {
                new dd80.a(act).t0(act.getString(R$string.f2579hr)).b0(act.getString(R$string.f2866r8)).n0(new DialogInterface.OnDismissListener() { // from class: l.hwk0
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        kwk0.m18307q(act, dialogInterface);
                    }
                }).r0();
            }
            return zIsALiProvider;
        }
        if (TextUtils.equals("1001", str2)) {
            if (TextUtils.equals("Z1004", str3)) {
                string = act.getString(R$string.f2763nr);
            } else if (TextUtils.equals("Z1005", str3)) {
                string = act.getString(R$string.f2794or);
            } else if (TextUtils.equals("Z1006", str3)) {
                string = act.getString(R$string.f2609ir);
            } else if (TextUtils.equals("Z6001", str3) || TextUtils.equals("Z1018", str3) || TextUtils.equals("Z1019", str3) || TextUtils.equals("Z1020", str3)) {
                string = act.getString(R$string.f2548gr);
            } else if (TextUtils.equals("Z6002", str3)) {
                string = act.getString(R$string.f2639jr);
            } else {
                string = TextUtils.equals("Z1024", str3) ? act.getString(R$string.f2732mr) : act.getString(R$string.f2579hr);
            }
        } else if (TextUtils.equals("2002", str2)) {
            string = act.getString(R$string.f2639jr);
        } else if (TextUtils.equals("2003", str2)) {
            string = act.getString(R$string.f2701lr);
        } else {
            string = TextUtils.equals("417", str2) ? act.getString(R$string.f2670kr) : act.getString(R$string.f2579hr);
        }
        new dd80.a(act).t0(string).b0(act.getString(R$string.f2866r8)).n0(new DialogInterface.OnDismissListener() { // from class: l.gwk0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                kwk0.m18310t(act, dialogInterface);
            }
        }).r0();
        return zIsALiProvider;
    }

    /* JADX INFO: renamed from: I */
    public static void m18281I(Act act, String str) {
        if (Integer.parseInt(str) == 1006) {
            return;
        }
        new dd80.a(act).t0(act.getString(R$string.f2579hr)).b0(act.getString(R$string.f2866r8)).r0();
    }

    /* JADX INFO: renamed from: J */
    public static void m18282J(Act act, String str) {
        switch (Integer.parseInt(str)) {
            case 40013:
                lsi0.F(act, "当前头像不真实，请修改后再试");
                break;
            case TantanException.Client.AccountService.INVALID_SMS_CODE /* 40014 */:
                lsi0.F(act, "资料审核中，请稍后再试");
                break;
            case TantanException.Client.AccountService.CONF_CODE_EXPIRED /* 40015 */:
                lsi0.F(act, "账号状态异常");
                break;
            default:
                lsi0.F(act, "网络异常");
                break;
        }
    }

    /* JADX INFO: renamed from: K */
    public static void m18283K(Act act) {
        lsi0.t(act.string(R$string.f1883Kr)).show();
    }

    /* JADX INFO: renamed from: L */
    public static void m18284L(final Act act, final String str) {
        if (!NullChecker.a(act) || act.isFinishing()) {
            return;
        }
        final cwf0 cwf0VarC = i0e.c("p_avatar_verification_video_guide_popup", "showManualDialog");
        cwf0VarC.p(new j760[]{vwb.Y("tooltips_trigger_mode", "active")});
        new dd80.a(act).S(x2c0.f26019Kd).x0(R$string.f3090ym, new Object[0]).s0(R$string.f3030wm, new Object[0]).P(true).a0(R$string.f3120zm, new Runnable() { // from class: l.hvk0
            @Override // java.lang.Runnable
            public final void run() {
                kwk0.m18279G(act, str);
            }
        }).U(R$string.f3060xm, new Runnable() { // from class: l.svk0
            @Override // java.lang.Runnable
            public final void run() {
                zvf0.u("e_avatar_verification_video_guide_button", "p_avatar_verification_video_guide_popup", new j760[]{vwb.Y("verification_video_button", "verification_video_refuse")});
            }
        }).n0(new DialogInterface.OnDismissListener() { // from class: l.cwk0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        }).r0();
        i0e.f(cwf0VarC);
    }

    /* JADX INFO: renamed from: M */
    public static void m18285M(final Act act, String str, int i) {
        if (i == 2) {
            return;
        }
        str.getClass();
        switch (str) {
            case "1001":
            case "1002":
            case "1003":
            case "1004":
            case "1005":
            case "2001":
            case "2003":
            case "2004":
            case "2005":
            case "2006":
            case "2009":
            case "2010":
            case "3001":
            case "3002":
            case "3003":
                new dd80.a(act).t0(act.getString(R$string.f2639jr)).b0(act.getString(R$string.f2866r8)).n0(new DialogInterface.OnDismissListener() { // from class: l.zvk0
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        kwk0.m18295e(act, dialogInterface);
                    }
                }).r0();
                return;
            case "2002":
                new dd80.a(act).t0("操作超时啦，再试一次吧").b0("好的").r0();
                break;
            case "2007":
            case "2008":
                break;
            default:
                lsi0.F(act, act.getString(R$string.f2538gh));
                if (act instanceof VerificationExecuteAct) {
                    act.finish();
                    return;
                }
                return;
        }
        new dd80.a(act).t0("认证需要对探探开启相机和存储权限喔，确保权限开启后再试试吧。如仍然无法认证，请在「首页底部消息按钮」-「探探小助手」中反馈，我们会加速为你解决").b0("好的").n0(new DialogInterface.OnDismissListener() { // from class: l.awk0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                kwk0.m18300j(act, dialogInterface);
            }
        }).r0();
    }

    /* JADX INFO: renamed from: N */
    public static void m18286N(Act act, String str) {
        boolean zEquals = TextUtils.equals(str, "verification_center");
        final cwf0 cwf0VarC = i0e.c(zEquals ? "p_avatar_verification_review_verification_center" : "p_avatar_verification_review_swipe_page", Dialog.class.getName());
        cwf0VarC.o(u4e.b(zEquals ? "active" : "passive", "alert", "alert_self_definition_basic", zEquals ? "verification_center_avatar_button" : "card", zEquals ? "verification_center" : "swipe_page", zEquals ? "click" : "swipe"));
        CoreDlg.E1(act, act.string(R$string.f1853Jr), act.string(R$string.f1823Ir), x2c0.f27190vj, act.string(R$string.f3065xr), (d30) null, false, (String) null, (d30) null, new d30() { // from class: l.bwk0
            public final void call() {
                i0e.e(cwf0VarC);
            }
        });
        i0e.f(cwf0VarC);
    }

    /* JADX INFO: renamed from: O */
    public static void m18287O(Act act, String str, int i) {
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
                new dd80.a(act).t0(act.getString(R$string.f2639jr)).b0(act.getString(R$string.f2866r8)).r0();
                break;
            case "218":
                new dd80.a(act).t0("认证需要对探探开启相机和存储权限喔，确保权限开启后再试试吧。如仍然无法认证，请在「首页底部消息按钮」-「探探小助手」中反馈，我们会加速为你解决").b0("好的").r0();
                break;
            default:
                lsi0.F(act, act.getString(R$string.f2538gh));
                break;
        }
    }

    /* JADX INFO: renamed from: P */
    public static void m18288P(final Act act, String str) {
        str.getClass();
        switch (str) {
            case "-1102":
            case "-1404":
            case "-5001":
            case "-5005":
            case "-5009":
            case "-5011":
            case "-5020":
            case "-5025":
            case "-5027":
            case "41005":
            case "41008":
            case "400604":
            case "66660023":
            case "66660025":
            case "66660033":
            case "66660035":
            case "66660036":
            case "66660037":
            case "66660041":
            case "66660042":
            case "66660043":
            case "66660045":
            case "66660046":
                new dd80.a(act).t0("刷脸时需要漏出你的完整、清晰面部才能通过认证喔。如仍然无法认证，请在「首页底部消息按钮」-「探探小助手」中反馈，我们会加速为你解决").b0("好的").n0(new DialogInterface.OnDismissListener() { // from class: l.mvk0
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        kwk0.m18314x(act, dialogInterface);
                    }
                }).r0();
                break;
            case "11003":
            case "11004":
            case "11005":
            case "11006":
            case "11007":
            case "21100":
            case "21200":
            case "31100":
            case "31200":
            case "41006":
            case "41009":
            case "41012":
            case "51100":
            case "51200":
            case "400101":
            case "400102":
            case "400103":
            case "400104":
            case "400502":
            case "66660021":
                new dd80.a(act).t0("网络异常啦，请确保手机网络、系统时间设置均正常后重启APP再试试吧。如仍然无法认证，请在「首页底部消息按钮」-「探探小助手」中反馈，我们会加速为你解决").b0("好的").n0(new DialogInterface.OnDismissListener() { // from class: l.kvk0
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        kwk0.m18298h(act, dialogInterface);
                    }
                }).r0();
                break;
            case "41002":
            case "41003":
            case "41004":
                new dd80.a(act).t0("认证需要对探探开启相机和存储权限喔，确保权限开启后再试试吧。如仍然无法认证，请在「首页底部消息按钮」-「探探小助手」中反馈，我们会加速为你解决").b0("好的").n0(new DialogInterface.OnDismissListener() { // from class: l.lvk0
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        kwk0.m18303m(act, dialogInterface);
                    }
                }).r0();
                break;
            case "41007":
                new dd80.a(act).t0("操作超时啦，再试一次吧").b0("好的").n0(new DialogInterface.OnDismissListener() { // from class: l.nvk0
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        kwk0.m18292b(act, dialogInterface);
                    }
                }).r0();
                break;
            case "41010":
            case "400504":
            case "400506":
                new dd80.a(act).t0("操作过于频繁，稍等5分钟再试试吧。如仍然无法认证，请在「首页底部消息按钮」-「探探小助手」中反馈，我们会加速为你解决").b0("好的").n0(new DialogInterface.OnDismissListener() { // from class: l.ovk0
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        kwk0.m18274B(act, dialogInterface);
                    }
                }).r0();
                break;
            case "66660017":
                lsi0.F(act, "验证次数过多，请24小时后再试");
                if (act instanceof VerificationExecuteAct) {
                    act.finish();
                    break;
                }
                break;
            default:
                lsi0.F(act, act.getString(R$string.f2538gh));
                if (act instanceof VerificationExecuteAct) {
                    act.finish();
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: Q */
    public static void m18289Q(final Act act, String str, String str2) {
        int i = Integer.parseInt(str);
        if (i == -1006 || i == -1007) {
            return;
        }
        if (i == -3003) {
            new dd80.a(act).t0(act.getString(R$string.f2548gr)).b0(act.getString(R$string.f2866r8)).n0(new DialogInterface.OnDismissListener() { // from class: l.jvk0
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    kwk0.m18296f(act, dialogInterface);
                }
            }).r0();
            return;
        }
        if (i != -3001) {
            if (i == -1003) {
                new dd80.a(act).t0(act.getString(R$string.f2609ir)).b0(act.getString(R$string.f2866r8)).n0(new DialogInterface.OnDismissListener() { // from class: l.ivk0
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        kwk0.m18275C(act, dialogInterface);
                    }
                }).r0();
                return;
            }
            if (i != -1000) {
                if (i == 100006) {
                    new dd80.a(act).t0(act.getString(R$string.f2701lr)).b0(act.getString(R$string.f2866r8)).n0(new DialogInterface.OnDismissListener() { // from class: l.iwk0
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            kwk0.m18302l(act, dialogInterface);
                        }
                    }).r0();
                    return;
                }
                lsi0.F(act, act.getString(R$string.f2538gh));
                if (act instanceof VerificationExecuteAct) {
                    act.finish();
                    return;
                }
                return;
            }
        }
        new dd80.a(act).t0(act.getString(R$string.f2639jr)).b0(act.getString(R$string.f2866r8)).n0(new DialogInterface.OnDismissListener() { // from class: l.jwk0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                kwk0.m18312v(act, dialogInterface);
            }
        }).r0();
    }

    /* JADX INFO: renamed from: R */
    public static void m18290R(final Act act, final d30 d30Var) {
        if (!zqx.k() && !PermissionHelper.b(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"})) {
            PermissionHelper.c().r(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}).o(new d30() { // from class: l.xvk0
                public final void call() {
                    kwk0.m18290R(act, d30Var);
                }
            }).w(false).u(true).i(act);
            return;
        }
        final android.app.Dialog dialogProgress = act.progress("");
        if (NullChecker.a(dialogProgress)) {
            dialogProgress.setCancelable(true);
            dialogProgress.setCanceledOnTouchOutside(true);
        }
        act.duringCreated(CoreModule.m1853N().cameraSdkLoaded()).subscribe(mkd0.G(new e30() { // from class: l.yvk0
            public final void call(Object obj) {
                kwk0.m18311u(dialogProgress, d30Var, (roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m18291a(final Act act, VerificationToken verificationToken, final String str) {
        m18277E(act, verificationToken.token);
        if (NullChecker.a(f16028a)) {
            f16028a.unsubscribe();
        }
        f16028a = f16029b.distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.pvk0
            public final void call(Object obj) {
                kwk0.m18308r(act, str, (String) obj);
            }
        }));
        act.creates(new e30() { // from class: l.qvk0
            public final void call(Object obj) {
                kwk0.m18299i((Bundle) obj);
            }
        }, new d30() { // from class: l.rvk0
            public final void call() {
                mkd0.z(kwk0.f16028a);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m18292b(Act act, DialogInterface dialogInterface) {
        if (act instanceof VerificationExecuteAct) {
            act.finish();
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m18295e(Act act, DialogInterface dialogInterface) {
        if (act instanceof VerificationExecuteAct) {
            act.finish();
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m18296f(Act act, DialogInterface dialogInterface) {
        if (act instanceof VerificationExecuteAct) {
            act.finish();
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m18298h(Act act, DialogInterface dialogInterface) {
        if (act instanceof VerificationExecuteAct) {
            act.finish();
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m18299i(Bundle bundle) {
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m18300j(Act act, DialogInterface dialogInterface) {
        if (act instanceof VerificationExecuteAct) {
            act.finish();
        }
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m18302l(Act act, DialogInterface dialogInterface) {
        if (act instanceof VerificationExecuteAct) {
            act.finish();
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m18303m(Act act, DialogInterface dialogInterface) {
        if (act instanceof VerificationExecuteAct) {
            act.finish();
        }
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m18304n(final Act act, final String str, final VerificationToken verificationToken) {
        act.progressDismiss();
        if (NullChecker.a(verificationToken) && NullChecker.a(verificationToken.token) && verificationToken.token.length() == 4) {
            PermissionHelper.c().r(zqx.k() ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"}).w(false).u(true).o(new d30() { // from class: l.fwk0
                public final void call() {
                    kwk0.m18291a(act, verificationToken, str);
                }
            }).i(act);
        } else {
            lsi0.w(R$string.f2802p4);
        }
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m18306p(Act act, String str, roj0 roj0Var) {
        if (!NullChecker.a(act) || act.isFinishing()) {
            return;
        }
        m18286N(act, str);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m18307q(Act act, DialogInterface dialogInterface) {
        if (act instanceof VerificationExecuteAct) {
            act.finish();
        }
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m18308r(Act act, String str, String str2) {
        if (NullChecker.a(str2)) {
            m18278F(act, str2, str);
        } else {
            lsi0.t(act.string(R$string.f2003Or)).show();
        }
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m18310t(Act act, DialogInterface dialogInterface) {
        if (act instanceof VerificationExecuteAct) {
            act.finish();
        }
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m18311u(android.app.Dialog dialog, d30 d30Var, roj0 roj0Var) {
        if (NullChecker.a(dialog) && dialog.isShowing()) {
            dialog.dismiss();
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m18312v(Act act, DialogInterface dialogInterface) {
        if (act instanceof VerificationExecuteAct) {
            act.finish();
        }
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m18314x(Act act, DialogInterface dialogInterface) {
        if (act instanceof VerificationExecuteAct) {
            act.finish();
        }
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m18315y(Act act, Throwable th) {
        act.progressDismiss();
        lsi0.w(R$string.f2802p4);
    }
}
