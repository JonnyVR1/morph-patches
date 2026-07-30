package p149l;

import android.R;
import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import com.immomo.mediacore.sink.ijkStreamerUtil;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.android.p048ui.poplevel.C4371a;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.poplevel.CorePopLevel;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.notifications.NotificationCheckerCommon;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Calendar;
import java.util.Date;
import p147v.VButton;
import p147v.VIcon;
import p147v.VImage;
import p147v.VRelative;

/* JADX INFO: loaded from: classes6.dex */
public class uq40 {

    /* JADX INFO: renamed from: a */
    public static final zpd0 f177698a = new zpd0("notification_switch_dialog_first_show", 0L);

    /* JADX INFO: renamed from: b */
    public static final zpd0 f177699b = new zpd0("notification_switch_dialog_second_show", 0L);

    /* JADX INFO: renamed from: c */
    public static final zpd0 f177700c = new zpd0("notification_switch_banner_first_show", 0L);

    /* JADX INFO: renamed from: d */
    public static final zpd0 f177701d = new zpd0("notification_switch_banner_second_show", 0L);

    /* JADX INFO: renamed from: e */
    public static final zpd0 f177702e = new zpd0("notification_switch_dialog_show_banner_time", 0L);

    /* JADX INFO: renamed from: f */
    public static final tpd0 f177703f = new tpd0("notification_switch_dialog_show_banner_cnt", 0);

    /* JADX INFO: renamed from: g */
    @SuppressLint({"SV_USE_DUP_ID"})
    public static final zpd0 f177704g = new zpd0("notification_home_dialog_show_time", 0L);

    /* JADX INFO: renamed from: h */
    @SuppressLint({"SV_USE_DUP_ID"})
    public static final tpd0 f177705h = new tpd0("notification_home_dialog_show_cnt", 0);

    /* JADX INFO: renamed from: i */
    public static l5j0 f177706i = null;

    /* JADX INFO: renamed from: A */
    public static void m194951A() {
        Intent intent = new Intent();
        if (Build.VERSION.SDK_INT >= 26) {
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", CoreModule.f17544b.getPackageName());
            intent.setFlags(268435456);
        } else {
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.setFlags(268435456);
            intent.putExtra("app_package", CoreModule.f17544b.getPackageName());
            intent.putExtra("app_uid", CoreModule.f17544b.getApplicationInfo().uid);
        }
        try {
            CoreModule.f17544b.startActivity(intent);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: B */
    public static boolean m194952B() {
        if (NotificationCheckerCommon.m79220a() != NotificationCheckerCommon.State.closed) {
            return false;
        }
        long jGuessedCurrentServerTime = qib0.f154693H.guessedCurrentServerTime();
        zpd0 zpd0Var = f177700c;
        long jLongValue = zpd0Var.get().longValue();
        if (jLongValue == 0) {
            zpd0Var.put(Long.valueOf(jGuessedCurrentServerTime));
            return true;
        }
        if (Math.abs(jGuessedCurrentServerTime - jLongValue) >= 1209600000) {
            return false;
        }
        long jLongValue2 = f177701d.get().longValue();
        return jLongValue2 == 0 || Math.abs(jGuessedCurrentServerTime - jLongValue2) > 86400000;
    }

    /* JADX INFO: renamed from: C */
    public static void m194953C() {
        f177701d.put(Long.valueOf(qib0.f154693H.guessedCurrentServerTime()));
    }

    /* JADX INFO: renamed from: D */
    public static void m194954D() {
        tpd0 tpd0Var = f177703f;
        tpd0Var.put(Integer.valueOf(tpd0Var.get().intValue() + 1));
        f177702e.put(Long.valueOf(mqi0.m155944o()));
    }

    /* JADX INFO: renamed from: E */
    public static void m194955E(final Act act, final d30 d30Var, final d30 d30Var2) {
        if (NullChecker.m81303a(act)) {
            final boolean[] zArr = {false};
            dd80 dd80VarM110989r0 = new dd80.C16336a(act).m110964S(upa.m194847z() ? x2c0.f190332lh : x2c0.f189561Mt).m110975d0(upa.m194847z() ? x2c0.f189655Q : -1).m110995x0(R$string.f17946Mj, new Object[0]).m110990s0(R$string.f17916Lj, new Object[0]).m110972a0(R$string.f17886Kj, new Runnable() { // from class: l.gq40
                @Override // java.lang.Runnable
                public final void run() {
                    uq40.m194964f(act);
                }
            }).m110967V(R$string.f18491el, new Object[0]).m110989r0();
            dd80VarM110989r0.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.hq40
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    uq40.m194976r(zArr, d30Var, dialogInterface);
                }
            });
            if (NullChecker.m81303a(d30Var2)) {
                dd80VarM110989r0.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.iq40
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        uq40.m194970l(zArr, d30Var2, dialogInterface);
                    }
                });
            }
            ygh0.m214655N();
        }
    }

    /* JADX INFO: renamed from: F */
    public static void m194956F(final Act act, final d30 d30Var, final d30 d30Var2) {
        if (Build.VERSION.SDK_INT < 33 || !PermissionHelper.m79881b("android.permission.POST_NOTIFICATIONS")) {
            f177704g.put(Long.valueOf(mqi0.m155944o()));
            tpd0 tpd0Var = f177705h;
            tpd0Var.put(Integer.valueOf(tpd0Var.get().intValue() + 1));
            final boolean[] zArr = {false};
            dd80 dd80VarM110989r0 = new dd80.C16336a(act).m110964S(upa.m194847z() ? x2c0.f190332lh : x2c0.f189561Mt).m110995x0(TEnum.equals(CoreModule.f17545c.f19639e0.m169527p9().settings.getLookingFor(), "female") ? R$string.f18871r2 : R$string.f18901s2, new Object[0]).m110990s0(R$string.f18961u2, new Object[0]).m110961P(false).m110972a0(R$string.f18931t2, new Runnable() { // from class: l.tq40
                @Override // java.lang.Runnable
                public final void run() {
                    uq40.m194969k(act);
                }
            }).m110966U(R$string.f18841q2, new Runnable() { // from class: l.bq40
                @Override // java.lang.Runnable
                public final void run() {
                    ygh0.m214654M();
                }
            }).m110989r0();
            dd80VarM110989r0.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.cq40
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    uq40.m194977s(zArr, d30Var, dialogInterface);
                }
            });
            if (NullChecker.m81303a(d30Var2)) {
                dd80VarM110989r0.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.dq40
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        uq40.m194972n(zArr, d30Var2, dialogInterface);
                    }
                });
            }
            ygh0.m214655N();
        }
    }

    /* JADX INFO: renamed from: G */
    public static void m194957G(final Act act, final boolean z) {
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_open_push_popup", Dialog.class.getName());
        cwf0VarM133794c.m109040p(j760.m140076a("popoup_page_source", z ? "card" : "message"));
        l5j0 l5j0Var = new l5j0(act);
        f177706i = l5j0Var;
        l5j0Var.setCancelable(true);
        f177706i.setContentView(f6c0.f95728cb);
        VRelative vRelative = (VRelative) f177706i.findViewById(u4c0.f174161a9);
        VRelative vRelative2 = (VRelative) f177706i.findViewById(u4c0.f173750C);
        VIcon vIcon = (VIcon) f177706i.findViewById(u4c0.f174410p4);
        final VImage vImage = (VImage) f177706i.findViewById(u4c0.f174178b9);
        final VImage vImage2 = (VImage) f177706i.findViewById(u4c0.f173767D);
        VButton vButton = (VButton) f177706i.findViewById(u4c0.f174229e9);
        final String[] strArr = {"openWithFriend"};
        xdl0.m208329E0(vRelative, new View.OnClickListener() { // from class: l.aq40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                uq40.m194974p(vImage, vImage2, strArr, view);
            }
        });
        xdl0.m208329E0(vRelative2, new View.OnClickListener() { // from class: l.lq40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                uq40.m194959a(vImage, vImage2, strArr, view);
            }
        });
        xdl0.m208329E0(vButton, new View.OnClickListener() { // from class: l.mq40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                uq40.m194960b(strArr, act, cwf0VarM133794c, view);
            }
        });
        xdl0.m208329E0(vIcon, new View.OnClickListener() { // from class: l.nq40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                uq40.f177706i.m101651T();
            }
        });
        f177706i.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.oq40
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                uq40.m194971m(cwf0VarM133794c, z, dialogInterface);
            }
        });
        f177706i.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.pq40
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                i0e.m133797f(cwf0VarM133794c);
            }
        });
        Window window = f177706i.getWindow();
        window.setDimAmount(0.3f);
        if (NullChecker.m81303a(window)) {
            ((FrameLayout) window.findViewById(R.id.content).findViewById(u4c0.f174391o2)).setBackgroundResource(x2c0.f190182gp);
        }
        if (!z) {
            CoreModule.f17545c.f19639e0.f149397j0.put(Long.valueOf(mqi0.m155944o()));
        }
        if (C4371a.m21100p().m21108I()) {
            C4371a.m21100p().m21103C(CorePopLevel.Notifycation, act, f177706i, ijkStreamerUtil.FFS_PROP_INT64_CREAT_TIME);
        } else {
            wc80.m202636e().m202649q(uc80.m192995a(f177706i));
        }
    }

    /* JADX INFO: renamed from: H */
    public static void m194958H(final Act act, int i, boolean z) {
        int i2;
        String str;
        if (!CoreModule.f17545c.f19639e0.f149351d2.get().booleanValue() || z) {
            CoreModule.f17545c.f19639e0.f149351d2.put(Boolean.TRUE);
            CoreModule.f17545c.f19639e0.f149327a2.put(Long.valueOf(mqi0.m155944o()));
            final cwf0 cwf0VarM133794c = i0e.m133794c("p_notification_permission_popup", Dialog.class.getName());
            cwf0VarM133794c.m109040p(vwb.m200311Y("notify_popup_type", i > 0 ? "match" : "message"));
            i0e.m133797f(cwf0VarM133794c);
            dd80.C16336a c16336a = new dd80.C16336a(act);
            if (upa.m194847z()) {
                i2 = x2c0.f190684wh;
            } else {
                i2 = i > 0 ? x2c0.f190562sn : x2c0.f190594tn;
            }
            dd80.C16336a c16336aM110996y0 = c16336a.m110964S(i2).m110975d0(upa.m194847z() ? x2c0.f189655Q : -1).m110996y0(i > 0 ? "匹配消息通知设置" : "打开动态消息通知");
            if (i > 0) {
                str = String.format("刚刚你喜欢了%s人，打开消息通知，%s们喜欢你后会第一时间通知你", Integer.valueOf(i), CoreModule.f17545c.f19639e0.f149343c2.get().booleanValue() ? "他" : "她");
            } else {
                str = "及时获取私聊、配对、评论等互动消息，不错过任何一次交友机会";
            }
            c16336aM110996y0.m110991t0(str).m110961P(false).m110974c0("去开启", new Runnable() { // from class: l.qq40
                @Override // java.lang.Runnable
                public final void run() {
                    uq40.m194962d(act);
                }
            }).m110969X("暂不设置", new Runnable() { // from class: l.rq40
                @Override // java.lang.Runnable
                public final void run() {
                    zvf0.m220396r("e_notification_permission_popup_later", "p_notification_permission_popup");
                }
            }).m110989r0().setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.sq40
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    i0e.m133796e(cwf0VarM133794c);
                }
            });
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m194959a(VImage vImage, VImage vImage2, String[] strArr, View view) {
        vImage.setImageResource(x2c0.f190762z);
        vImage2.setImageResource(x2c0.f189153A);
        strArr[0] = "openWithAll";
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m194960b(String[] strArr, Act act, cwf0 cwf0Var, View view) {
        zvf0.m220399u("e_open_push_click", "p_open_push_popup", vwb.m200311Y("push_scope_choose", TextUtils.equals("openWithFriend", strArr[0]) ? "friends" : "all"));
        if (NotificationCheckerCommon.m79220a() == NotificationCheckerCommon.State.closed || CoreModule.f17545c.f19639e0.m169527p9().getUserPushAllEnable()) {
            act.duringCreated(CoreModule.f17545c.f19639e0.m169409K9(strArr[0], true, 0, 0)).subscribe(mkd0.m154960L(mkd0.m154950B()));
            if (m194980v()) {
                m194979u(act);
            } else {
                m194951A();
            }
        } else {
            act.duringCreated(CoreModule.f17545c.f19639e0.m169409K9(strArr[0], true, 0, 0)).subscribe(mkd0.m154956H(new e30() { // from class: l.eq40
                @Override // p149l.e30
                public final void call(Object obj) {
                    lsi0.m151595y("已开启消息通知");
                }
            }, new e30() { // from class: l.fq40
                @Override // p149l.e30
                public final void call(Object obj) {
                    yij0.m214926D((Throwable) obj);
                }
            }));
        }
        f177706i.setOnDismissListener(null);
        i0e.m133796e(cwf0Var);
        f177706i.m101651T();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m194962d(Act act) {
        zvf0.m220396r("e_notification_permission_popup_open", "p_notification_permission_popup");
        if (m194980v()) {
            m194979u(act);
        } else {
            m194951A();
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m194964f(Act act) {
        if (m194980v()) {
            m194979u(act);
            ygh0.m214650I();
        } else {
            m194951A();
            ygh0.m214650I();
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m194966h(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m194967i() {
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m194969k(Act act) {
        if (m194980v()) {
            m194979u(act);
            ygh0.m214650I();
        } else {
            m194951A();
            ygh0.m214650I();
        }
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m194970l(boolean[] zArr, d30 d30Var, DialogInterface dialogInterface) {
        if (zArr[0]) {
            return;
        }
        d30Var.call();
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m194971m(cwf0 cwf0Var, boolean z, DialogInterface dialogInterface) {
        i0e.m133796e(cwf0Var);
        zvf0.m220396r("e_close_push_popup", "p_open_push_popup");
        if (z) {
            return;
        }
        hu40.m133026a().m133033h();
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m194972n(boolean[] zArr, d30 d30Var, DialogInterface dialogInterface) {
        if (zArr[0]) {
            return;
        }
        d30Var.call();
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m194974p(VImage vImage, VImage vImage2, String[] strArr, View view) {
        vImage.setImageResource(x2c0.f189153A);
        vImage2.setImageResource(x2c0.f190762z);
        strArr[0] = "openWithFriend";
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m194976r(boolean[] zArr, d30 d30Var, DialogInterface dialogInterface) {
        ygh0.m214654M();
        zArr[0] = true;
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m194977s(boolean[] zArr, d30 d30Var, DialogInterface dialogInterface) {
        zArr[0] = true;
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: t */
    public static int m194978t(long j, long j2) {
        Date date = new Date(j2);
        Date date2 = new Date(j);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);
        int i = calendar.get(6);
        int i2 = calendar2.get(6);
        int i3 = calendar.get(1);
        int i4 = calendar2.get(1);
        if (i3 == i4) {
            return i2 - i;
        }
        int i5 = 0;
        while (i3 < i4) {
            i5 = ((i3 % 4 != 0 || i3 % 100 == 0) && i3 % 400 != 0) ? i5 + 365 : i5 + 366;
            i3++;
        }
        return i5 + (i2 - i);
    }

    /* JADX INFO: renamed from: u */
    public static void m194979u(Act act) {
        PermissionHelper.m79882c().m79900r("android.permission.POST_NOTIFICATIONS").m79905w(false).m79903u(true).m79892j(true).m79895m(new d30() { // from class: l.jq40
            @Override // p149l.d30
            public final void call() {
                uq40.m194967i();
            }
        }, new e30() { // from class: l.kq40
            @Override // p149l.e30
            public final void call(Object obj) {
                uq40.m194966h((PermissionHelper.PermissionDeniedReason) obj);
            }
        }).m79891i(act);
    }

    /* JADX INFO: renamed from: v */
    public static boolean m194980v() {
        return Build.VERSION.SDK_INT >= 33;
    }

    /* JADX INFO: renamed from: w */
    public static boolean m194981w() {
        return NullChecker.m81303a(f177706i) && f177706i.isShowing();
    }

    /* JADX INFO: renamed from: x */
    public static boolean m194982x(Act act) {
        return m194983y(act, false);
    }

    /* JADX INFO: renamed from: y */
    public static boolean m194983y(Act act, boolean z) {
        if (!NullChecker.m81303a(act) || NotificationCheckerCommon.m79220a() != NotificationCheckerCommon.State.closed) {
            return false;
        }
        zpd0 zpd0Var = f177698a;
        long jLongValue = zpd0Var.get().longValue();
        long jGuessedCurrentServerTime = qib0.f154693H.guessedCurrentServerTime();
        if (jLongValue == 0) {
            if (!z) {
                zpd0Var.put(Long.valueOf(jGuessedCurrentServerTime));
            }
            return true;
        }
        zpd0 zpd0Var2 = f177699b;
        if (zpd0Var2.get().longValue() != 0 || Math.abs(jGuessedCurrentServerTime - jLongValue) <= 604800000) {
            return false;
        }
        if (!z) {
            zpd0Var2.put(Long.valueOf(jGuessedCurrentServerTime));
        }
        return true;
    }

    /* JADX INFO: renamed from: z */
    public static boolean m194984z() {
        if (NotificationCheckerCommon.m79220a() == NotificationCheckerCommon.State.closed) {
            long jLongValue = f177702e.get().longValue();
            if (f177703f.get().intValue() < 5 && mqi0.m155944o() - jLongValue > 172800000) {
                return true;
            }
        }
        return false;
    }
}
