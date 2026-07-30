package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.android.p053ui.poplevel.C4522a;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.poplevel.CorePopLevel;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.notifications.NotificationCheckerCommon;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.Calendar;
import java.util.Date;
import p151v.VButton;
import p151v.VIcon;
import p151v.VImage;
import p151v.VRelative;

/* JADX INFO: loaded from: classes6.dex */
public class iz40 {

    /* JADX INFO: renamed from: a */
    public static final byd0 f117659a = new byd0("notification_switch_dialog_first_show", 0L);

    /* JADX INFO: renamed from: b */
    public static final byd0 f117660b = new byd0("notification_switch_dialog_second_show", 0L);

    /* JADX INFO: renamed from: c */
    public static final byd0 f117661c = new byd0("notification_switch_banner_first_show", 0L);

    /* JADX INFO: renamed from: d */
    public static final byd0 f117662d = new byd0("notification_switch_banner_second_show", 0L);

    /* JADX INFO: renamed from: e */
    public static final byd0 f117663e = new byd0("notification_switch_dialog_show_banner_time", 0L);

    /* JADX INFO: renamed from: f */
    public static final vxd0 f117664f = new vxd0("notification_switch_dialog_show_banner_cnt", 0);

    /* JADX INFO: renamed from: g */
    @SuppressLint({"SV_USE_DUP_ID"})
    public static final byd0 f117665g = new byd0("notification_home_dialog_show_time", 0L);

    /* JADX INFO: renamed from: h */
    @SuppressLint({"SV_USE_DUP_ID"})
    public static final vxd0 f117666h = new vxd0("notification_home_dialog_show_cnt", 0);

    /* JADX INFO: renamed from: i */
    public static pej0 f117667i = null;

    /* JADX INFO: renamed from: A */
    public static void m142756A() {
        Intent intent = new Intent();
        if (Build.VERSION.SDK_INT >= 26) {
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", CoreModule.f18263b.getPackageName());
            intent.setFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        } else {
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.setFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
            intent.putExtra("app_package", CoreModule.f18263b.getPackageName());
            intent.putExtra("app_uid", CoreModule.f18263b.getApplicationInfo().uid);
        }
        try {
            CoreModule.f18263b.startActivity(intent);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: B */
    public static boolean m142757B() {
        if (NotificationCheckerCommon.m80403a() != NotificationCheckerCommon.State.closed) {
            return false;
        }
        long jGuessedCurrentServerTime = uqb0.f180376H.guessedCurrentServerTime();
        byd0 byd0Var = f117661c;
        long jLongValue = byd0Var.get().longValue();
        if (jLongValue == 0) {
            byd0Var.put(Long.valueOf(jGuessedCurrentServerTime));
            return true;
        }
        if (Math.abs(jGuessedCurrentServerTime - jLongValue) >= 1209600000) {
            return false;
        }
        long jLongValue2 = f117662d.get().longValue();
        return jLongValue2 == 0 || Math.abs(jGuessedCurrentServerTime - jLongValue2) > 86400000;
    }

    /* JADX INFO: renamed from: C */
    public static void m142758C() {
        f117662d.put(Long.valueOf(uqb0.f180376H.guessedCurrentServerTime()));
    }

    /* JADX INFO: renamed from: D */
    public static void m142759D() {
        vxd0 vxd0Var = f117664f;
        vxd0Var.put(Integer.valueOf(vxd0Var.get().intValue() + 1));
        f117663e.put(Long.valueOf(pzi0.m174454o()));
    }

    /* JADX INFO: renamed from: E */
    public static void m142760E(final Act act, final x20 x20Var, final x20 x20Var2) {
        if (NullChecker.m82486a(act)) {
            final boolean[] zArr = {false};
            jl80 jl80VarM146049r0 = new jl80.C17971a(act).m146024S(gra.m131778z() ? dbc0.f86794Zh : dbc0.f86007Au).m146035d0(gra.m131778z() ? dbc0.f86520R : -1).m146055x0(R$string.f19343ik, new Object[0]).m146050s0(R$string.f19313hk, new Object[0]).m146032a0(R$string.f19282gk, new Runnable() { // from class: l.uy40
                @Override // java.lang.Runnable
                public final void run() {
                    iz40.m142769f(act);
                }
            }).m146027V(R$string.f18307Al, new Object[0]).m146049r0();
            jl80VarM146049r0.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.vy40
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    iz40.m142781r(zArr, x20Var, dialogInterface);
                }
            });
            if (NullChecker.m82486a(x20Var2)) {
                jl80VarM146049r0.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.wy40
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        iz40.m142775l(zArr, x20Var2, dialogInterface);
                    }
                });
            }
            fph0.m126643N();
        }
    }

    /* JADX INFO: renamed from: F */
    public static void m142761F(final Act act, final x20 x20Var, final x20 x20Var2) {
        if (Build.VERSION.SDK_INT < 33 || !PermissionHelper.m81064b("android.permission.POST_NOTIFICATIONS")) {
            f117665g.put(Long.valueOf(pzi0.m174454o()));
            vxd0 vxd0Var = f117666h;
            vxd0Var.put(Integer.valueOf(vxd0Var.get().intValue() + 1));
            final boolean[] zArr = {false};
            jl80 jl80VarM146049r0 = new jl80.C17971a(act).m146024S(gra.m131778z() ? dbc0.f86794Zh : dbc0.f86007Au).m146055x0(TEnum.equals(CoreModule.f18264c.f20381e0.m116600p9().settings.getLookingFor(), "female") ? R$string.f19665t2 : R$string.f19696u2, new Object[0]).m146050s0(R$string.f19758w2, new Object[0]).m146021P(false).m146032a0(R$string.f19727v2, new Runnable() { // from class: l.hz40
                @Override // java.lang.Runnable
                public final void run() {
                    iz40.m142774k(act);
                }
            }).m146026U(R$string.f19634s2, new Runnable() { // from class: l.py40
                @Override // java.lang.Runnable
                public final void run() {
                    fph0.m126642M();
                }
            }).m146049r0();
            jl80VarM146049r0.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.qy40
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    iz40.m142782s(zArr, x20Var, dialogInterface);
                }
            });
            if (NullChecker.m82486a(x20Var2)) {
                jl80VarM146049r0.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.ry40
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        iz40.m142777n(zArr, x20Var2, dialogInterface);
                    }
                });
            }
            fph0.m126643N();
        }
    }

    /* JADX INFO: renamed from: G */
    public static void m142762G(final Act act, final boolean z) {
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_open_push_popup", Dialog.class.getName());
        l4g0VarM204399c.m152781p(pf60.m172085a("popoup_page_source", z ? "card" : "message"));
        pej0 pej0Var = new pej0(act);
        f117667i = pej0Var;
        pej0Var.setCancelable(true);
        f117667i.setContentView(kec0.f125900jb);
        VRelative vRelative = (VRelative) f117667i.findViewById(adc0.f70286c9);
        VRelative vRelative2 = (VRelative) f117667i.findViewById(adc0.f69838C);
        VIcon vIcon = (VIcon) f117667i.findViewById(adc0.f70535r4);
        final VImage vImage = (VImage) f117667i.findViewById(adc0.f70303d9);
        final VImage vImage2 = (VImage) f117667i.findViewById(adc0.f69855D);
        VButton vButton = (VButton) f117667i.findViewById(adc0.f70354g9);
        final String[] strArr = {"openWithFriend"};
        bnl0.m105509E0(vRelative, new View.OnClickListener() { // from class: l.oy40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                iz40.m142779p(vImage, vImage2, strArr, view);
            }
        });
        bnl0.m105509E0(vRelative2, new View.OnClickListener() { // from class: l.zy40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                iz40.m142764a(vImage, vImage2, strArr, view);
            }
        });
        bnl0.m105509E0(vButton, new View.OnClickListener() { // from class: l.az40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                iz40.m142765b(strArr, act, l4g0VarM204399c, view);
            }
        });
        bnl0.m105509E0(vIcon, new View.OnClickListener() { // from class: l.bz40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                iz40.f117667i.m176562T();
            }
        });
        f117667i.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.cz40
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                iz40.m142776m(l4g0VarM204399c, z, dialogInterface);
            }
        });
        f117667i.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.dz40
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                w1e.m204402f(l4g0VarM204399c);
            }
        });
        Window window = f117667i.getWindow();
        window.setDimAmount(0.3f);
        if (NullChecker.m82486a(window)) {
            ((FrameLayout) window.findViewById(R.id.content).findViewById(adc0.f70516q2)).setBackgroundResource(dbc0.f86642Up);
        }
        if (!z) {
            CoreModule.f18264c.f20381e0.f89254j0.put(Long.valueOf(pzi0.m174454o()));
        }
        if (C4522a.m22099p().m22107I()) {
            C4522a.m22099p().m22102C(CorePopLevel.Notifycation, act, f117667i, ijkStreamerUtil.FFS_PROP_INT64_CREAT_TIME);
        } else {
            cl80.m110426e().m110439q(al80.m98641a(f117667i));
        }
    }

    /* JADX INFO: renamed from: H */
    public static void m142763H(final Act act, int i, boolean z) {
        int i2;
        String str;
        if (!CoreModule.f18264c.f20381e0.f89208d2.get().booleanValue() || z) {
            CoreModule.f18264c.f20381e0.f89208d2.put(Boolean.TRUE);
            CoreModule.f18264c.f20381e0.f89184a2.put(Long.valueOf(pzi0.m174454o()));
            final l4g0 l4g0VarM204399c = w1e.m204399c("p_notification_permission_popup", Dialog.class.getName());
            l4g0VarM204399c.m152781p(jyb.m147494Y("notify_popup_type", i > 0 ? "match" : "message"));
            w1e.m204402f(l4g0VarM204399c);
            jl80.C17971a c17971a = new jl80.C17971a(act);
            if (gra.m131778z()) {
                i2 = dbc0.f87154ki;
            } else {
                i2 = i > 0 ? dbc0.f87063ho : dbc0.f87095io;
            }
            jl80.C17971a c17971aM146056y0 = c17971a.m146024S(i2).m146035d0(gra.m131778z() ? dbc0.f86520R : -1).m146056y0(i > 0 ? "匹配消息通知设置" : "打开动态消息通知");
            if (i > 0) {
                str = String.format("刚刚你喜欢了%s人，打开消息通知，%s们喜欢你后会第一时间通知你", Integer.valueOf(i), CoreModule.f18264c.f20381e0.f89200c2.get().booleanValue() ? "他" : "她");
            } else {
                str = "及时获取私聊、配对、评论等互动消息，不错过任何一次交友机会";
            }
            c17971aM146056y0.m146051t0(str).m146021P(false).m146034c0("去开启", new Runnable() { // from class: l.ez40
                @Override // java.lang.Runnable
                public final void run() {
                    iz40.m142767d(act);
                }
            }).m146029X("暂不设置", new Runnable() { // from class: l.fz40
                @Override // java.lang.Runnable
                public final void run() {
                    i4g0.m138520r("e_notification_permission_popup_later", "p_notification_permission_popup");
                }
            }).m146049r0().setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.gz40
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    w1e.m204401e(l4g0VarM204399c);
                }
            });
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m142764a(VImage vImage, VImage vImage2, String[] strArr, View view) {
        vImage.setImageResource(dbc0.f85976A);
        vImage2.setImageResource(dbc0.f86008B);
        strArr[0] = "openWithAll";
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m142765b(String[] strArr, Act act, l4g0 l4g0Var, View view) {
        i4g0.m138523u("e_open_push_click", "p_open_push_popup", jyb.m147494Y("push_scope_choose", TextUtils.equals("openWithFriend", strArr[0]) ? "friends" : "all"));
        if (NotificationCheckerCommon.m80403a() == NotificationCheckerCommon.State.closed || CoreModule.f18264c.f20381e0.m116600p9().getUserPushAllEnable()) {
            act.duringCreated(CoreModule.f18264c.f20381e0.m116482K9(strArr[0], true, 0, 0)).subscribe(psd0.m173601L(psd0.m173591B()));
            if (m142785v()) {
                m142784u(act);
            } else {
                m142756A();
            }
        } else {
            act.duringCreated(CoreModule.f18264c.f20381e0.m116482K9(strArr[0], true, 0, 0)).subscribe(psd0.m173597H(new y20() { // from class: l.sy40
                @Override // p153l.y20
                public final void call(Object obj) {
                    o1j0.m165651y("已开启消息通知");
                }
            }, new y20() { // from class: l.ty40
                @Override // p153l.y20
                public final void call(Object obj) {
                    bsj0.m106246D((Throwable) obj);
                }
            }));
        }
        f117667i.setOnDismissListener(null);
        w1e.m204401e(l4g0Var);
        f117667i.m176562T();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m142767d(Act act) {
        i4g0.m138520r("e_notification_permission_popup_open", "p_notification_permission_popup");
        if (m142785v()) {
            m142784u(act);
        } else {
            m142756A();
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m142769f(Act act) {
        if (m142785v()) {
            m142784u(act);
            fph0.m126638I();
        } else {
            m142756A();
            fph0.m126638I();
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m142771h(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m142772i() {
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m142774k(Act act) {
        if (m142785v()) {
            m142784u(act);
            fph0.m126638I();
        } else {
            m142756A();
            fph0.m126638I();
        }
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m142775l(boolean[] zArr, x20 x20Var, DialogInterface dialogInterface) {
        if (zArr[0]) {
            return;
        }
        x20Var.call();
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m142776m(l4g0 l4g0Var, boolean z, DialogInterface dialogInterface) {
        w1e.m204401e(l4g0Var);
        i4g0.m138520r("e_close_push_popup", "p_open_push_popup");
        if (z) {
            return;
        }
        w250.m204531a().m204538h();
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m142777n(boolean[] zArr, x20 x20Var, DialogInterface dialogInterface) {
        if (zArr[0]) {
            return;
        }
        x20Var.call();
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m142779p(VImage vImage, VImage vImage2, String[] strArr, View view) {
        vImage.setImageResource(dbc0.f86008B);
        vImage2.setImageResource(dbc0.f85976A);
        strArr[0] = "openWithFriend";
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m142781r(boolean[] zArr, x20 x20Var, DialogInterface dialogInterface) {
        fph0.m126642M();
        zArr[0] = true;
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m142782s(boolean[] zArr, x20 x20Var, DialogInterface dialogInterface) {
        zArr[0] = true;
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: t */
    public static int m142783t(long j, long j2) {
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
    public static void m142784u(Act act) {
        PermissionHelper.m81065c().m81083r("android.permission.POST_NOTIFICATIONS").m81088w(false).m81086u(true).m81075j(true).m81078m(new x20() { // from class: l.xy40
            @Override // p153l.x20
            public final void call() {
                iz40.m142772i();
            }
        }, new y20() { // from class: l.yy40
            @Override // p153l.y20
            public final void call(Object obj) {
                iz40.m142771h((PermissionHelper.PermissionDeniedReason) obj);
            }
        }).m81074i(act);
    }

    /* JADX INFO: renamed from: v */
    public static boolean m142785v() {
        return Build.VERSION.SDK_INT >= 33;
    }

    /* JADX INFO: renamed from: w */
    public static boolean m142786w() {
        return NullChecker.m82486a(f117667i) && f117667i.isShowing();
    }

    /* JADX INFO: renamed from: x */
    public static boolean m142787x(Act act) {
        return m142788y(act, false);
    }

    /* JADX INFO: renamed from: y */
    public static boolean m142788y(Act act, boolean z) {
        if (!NullChecker.m82486a(act) || NotificationCheckerCommon.m80403a() != NotificationCheckerCommon.State.closed) {
            return false;
        }
        byd0 byd0Var = f117659a;
        long jLongValue = byd0Var.get().longValue();
        long jGuessedCurrentServerTime = uqb0.f180376H.guessedCurrentServerTime();
        if (jLongValue == 0) {
            if (!z) {
                byd0Var.put(Long.valueOf(jGuessedCurrentServerTime));
            }
            return true;
        }
        byd0 byd0Var2 = f117660b;
        if (byd0Var2.get().longValue() != 0 || Math.abs(jGuessedCurrentServerTime - jLongValue) <= 604800000) {
            return false;
        }
        if (!z) {
            byd0Var2.put(Long.valueOf(jGuessedCurrentServerTime));
        }
        return true;
    }

    /* JADX INFO: renamed from: z */
    public static boolean m142789z() {
        if (NotificationCheckerCommon.m80403a() == NotificationCheckerCommon.State.closed) {
            long jLongValue = f117663e.get().longValue();
            if (f117664f.get().intValue() < 5 && pzi0.m174454o() - jLongValue > 172800000) {
                return true;
            }
        }
        return false;
    }
}
