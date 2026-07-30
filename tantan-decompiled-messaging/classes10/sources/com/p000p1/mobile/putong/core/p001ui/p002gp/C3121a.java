package com.p000p1.mobile.putong.core.p001ui.p002gp;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.view.View;
import com.p000p1.mobile.putong.core.data.Conversation;
import com.p000p1.mobile.putong.core.p001ui.p002gp.C3121a;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.oms.OmsDialog;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import l.a4g0;
import l.cwf0;
import l.dd80;
import l.e30;
import l.i0e;
import l.ic50;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.ogl0;
import l.tpd0;
import l.vuw;
import l.z3g0;
import l.zpd0;
import l.zvf0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.gp.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class C3121a {

    /* JADX INFO: renamed from: p */
    public static volatile C3121a f1691p;

    /* JADX INFO: renamed from: a */
    public final String f1692a = "message_count_";

    /* JADX INFO: renamed from: b */
    public final String f1693b = "_";

    /* JADX INFO: renamed from: c */
    public final String f1694c = "_receive";

    /* JADX INFO: renamed from: d */
    public final String f1695d = "_send";

    /* JADX INFO: renamed from: e */
    public final String f1696e = "_match";

    /* JADX INFO: renamed from: f */
    public final int f1697f = 3;

    /* JADX INFO: renamed from: g */
    public final int f1698g = 10;

    /* JADX INFO: renamed from: h */
    public final int f1699h = 5;

    /* JADX INFO: renamed from: i */
    public final int f1700i = 5;

    /* JADX INFO: renamed from: j */
    @SuppressLint({"SV_USE_DUP_ID"})
    public zpd0 f1701j = new zpd0("rate_popup_last_shown_new", 0L);

    /* JADX INFO: renamed from: k */
    public tpd0 f1702k;

    /* JADX INFO: renamed from: l */
    public tpd0 f1703l;

    /* JADX INFO: renamed from: m */
    public tpd0 f1704m;

    /* JADX INFO: renamed from: n */
    public String f1705n;

    /* JADX INFO: renamed from: o */
    public z3g0 f1706o;

    public C3121a() {
        m2907n();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m2894b(dd80 dd80Var, Runnable runnable, View view, boolean z) {
        dd80Var.dismiss();
        HashMap map = new HashMap();
        map.put("neverask", "no");
        if (z) {
            runnable.run();
            map.put("neverask", "yes");
        }
        zvf0.s("e_intl_5star_dialog_cancel_butto", "p_intl_5star_dialog_view", map);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m2895c(Act act, dd80 dd80Var, Runnable runnable, View view, boolean z) {
        try {
            vuw.d(act);
            e = null;
        } catch (Exception e) {
            e = e;
            CrashHelper.c(e);
        }
        if (NullChecker.a(e)) {
            lsi0.h(R.string.Jl);
        }
        dd80Var.dismiss();
        HashMap map = new HashMap();
        map.put("neverask", "no");
        if (z) {
            runnable.run();
            map.put("neverask", "yes");
        }
        zvf0.s("e_intl_5star_dialog_rating_button", "p_intl_5star_dialog_view", map);
    }

    /* JADX INFO: renamed from: j */
    public static C3121a m2899j() {
        if (f1691p == null) {
            synchronized (C3121a.class) {
                try {
                    if (f1691p == null) {
                        f1691p = new C3121a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f1691p;
    }

    /* JADX INFO: renamed from: q */
    public static void m2900q(final Act act, final Runnable runnable, Runnable runnable2) {
        GpRateGuideDialog gpRateGuideDialog = new GpRateGuideDialog(act);
        final dd80 dd80VarR0 = act.newDialog().R(gpRateGuideDialog).P(true).r0();
        final cwf0 cwf0VarC = i0e.c("p_intl_5star_dialog_view", dd80VarR0.getClass().getName());
        cwf0VarC.p(ic50.j().f().V(OmsDialog.p_intl_5star_dialog_view.getIdentifier(), new j760[]{new j760("tooltips_trigger_mode", "passive")}));
        i0e.f(cwf0VarC);
        dd80VarR0.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.xcc0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        });
        if (NullChecker.a(runnable2)) {
            runnable2.run();
        }
        gpRateGuideDialog.m2891g(new GpRateGuideDialog.InterfaceC3120a() { // from class: l.ycc0
            @Override // com.p000p1.mobile.putong.core.p001ui.p002gp.GpRateGuideDialog.InterfaceC3120a
            /* JADX INFO: renamed from: a */
            public final void mo2892a(View view, boolean z) {
                C3121a.m2895c(act, dd80VarR0, runnable, view, z);
            }
        }, new GpRateGuideDialog.InterfaceC3120a() { // from class: l.zcc0
            @Override // com.p000p1.mobile.putong.core.p001ui.p002gp.GpRateGuideDialog.InterfaceC3120a
            /* JADX INFO: renamed from: a */
            public final void mo2892a(View view, boolean z) {
                C3121a.m2894b(dd80VarR0, runnable, view, z);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public void m2901g() {
        z3g0 z3g0VarA = a4g0.a();
        this.f1706o = z3g0VarA;
        z3g0VarA.b(CoreModule.c.f0.qn().subscribe(mkd0.G(new e30() { // from class: l.adc0
            public final void call(Object obj) {
                this.f2776a.m2904k((List) obj);
            }
        })));
    }

    /* JADX INFO: renamed from: h */
    public synchronized void m2902h() {
        m2903i();
        this.f1705n = "";
        this.f1702k = null;
        this.f1703l = null;
        this.f1704m = null;
    }

    /* JADX INFO: renamed from: i */
    public final void m2903i() {
        if (NullChecker.a(this.f1702k)) {
            this.f1702k.clear();
            this.f1702k.put(0);
        }
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m2904k(List list) {
        Conversation conversation;
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext() && ((conversation = (Conversation) it.next()) == null || User.isTeamAccount(conversation.otherUser) || (i = i + 1) < 5)) {
        }
        m2910r(i);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m2905l() {
        if (ogl0.F()) {
            ic50.j().f().v0(OmsDialog.p_intl_5star_dialog_view.getIdentifier(), Long.MAX_VALUE);
        }
        this.f1701j.put(Long.MAX_VALUE);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m2906m() {
        this.f1701j.put(Long.valueOf(System.currentTimeMillis()));
    }

    /* JADX INFO: renamed from: n */
    public void m2907n() {
        Calendar calendar = Calendar.getInstance();
        String str = "message_count_" + calendar.get(1) + calendar.get(2) + calendar.get(5);
        boolean zEquals = str.equals(this.f1705n);
        if (!zEquals) {
            this.f1705n = str;
            if (NullChecker.a(this.f1703l)) {
                this.f1703l.clear();
            }
            if (NullChecker.a(this.f1702k)) {
                this.f1702k.clear();
            }
            if (NullChecker.a(this.f1704m)) {
                this.f1704m.clear();
            }
        }
        if (this.f1702k == null || this.f1703l == null || this.f1704m == null || !zEquals) {
            this.f1702k = new tpd0(str + "_" + CoreModule.H().userId() + "_receive", 0, true, "MessageCountToday");
            this.f1703l = new tpd0(str + "_" + CoreModule.H().userId() + "_send", 0, true, "MessageCountToday");
            this.f1704m = new tpd0(str + "_" + CoreModule.H().userId() + "_match", 0, true, "MessageCountToday");
        }
    }

    /* JADX INFO: renamed from: o */
    public synchronized void m2908o(Act act) {
        m2907n();
        Long l2 = (Long) this.f1701j.get();
        if (ogl0.F()) {
            if (!ic50.j().f().M(OmsDialog.p_intl_5star_dialog_view.getIdentifier(), true)) {
                return;
            }
        } else if (System.currentTimeMillis() - l2.longValue() < 259200000) {
            return;
        }
        if ((((Integer) this.f1702k.get()).intValue() >= 5 && ((Integer) this.f1703l.get()).intValue() >= 5) || ((Integer) this.f1704m.get()).intValue() >= 5) {
            if (ogl0.F()) {
                ic50.j().f().b0(OmsDialog.p_intl_5star_dialog_view.getIdentifier(), 0, true);
            }
            m2900q(act, new Runnable() { // from class: l.vcc0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7968a.m2905l();
                }
            }, new Runnable() { // from class: l.wcc0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8155a.m2906m();
                }
            });
        }
    }

    /* JADX INFO: renamed from: p */
    public void m2909p() {
        this.f1706o.unsubscribe();
        this.f1706o = a4g0.a();
    }

    /* JADX INFO: renamed from: r */
    public final synchronized void m2910r(int i) {
        m2907n();
        this.f1704m.put(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: s */
    public synchronized void m2911s(int i) {
        m2907n();
        this.f1702k.put(Integer.valueOf(((Integer) this.f1702k.get()).intValue() + i));
    }

    /* JADX INFO: renamed from: t */
    public synchronized void m2912t(int i) {
        m2907n();
        this.f1703l.put(Integer.valueOf(((Integer) this.f1703l.get()).intValue() + i));
    }
}
