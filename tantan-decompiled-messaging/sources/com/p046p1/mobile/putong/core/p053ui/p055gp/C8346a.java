package com.p046p1.mobile.putong.core.p053ui.p055gp;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.oms.OmsDialog;
import com.p046p1.mobile.putong.core.p053ui.p055gp.C8346a;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p149l.a4g0;
import p149l.cwf0;
import p149l.dd80;
import p149l.e30;
import p149l.i0e;
import p149l.ic50;
import p149l.j760;
import p149l.lsi0;
import p149l.mkd0;
import p149l.ogl0;
import p149l.tpd0;
import p149l.vuw;
import p149l.z3g0;
import p149l.zpd0;
import p149l.zvf0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.gp.a */
/* JADX INFO: loaded from: classes10.dex */
public class C8346a {

    /* JADX INFO: renamed from: p */
    public static volatile C8346a f29297p;

    /* JADX INFO: renamed from: a */
    public final String f29298a = "message_count_";

    /* JADX INFO: renamed from: b */
    public final String f29299b = "_";

    /* JADX INFO: renamed from: c */
    public final String f29300c = "_receive";

    /* JADX INFO: renamed from: d */
    public final String f29301d = "_send";

    /* JADX INFO: renamed from: e */
    public final String f29302e = "_match";

    /* JADX INFO: renamed from: f */
    public final int f29303f = 3;

    /* JADX INFO: renamed from: g */
    public final int f29304g = 10;

    /* JADX INFO: renamed from: h */
    public final int f29305h = 5;

    /* JADX INFO: renamed from: i */
    public final int f29306i = 5;

    /* JADX INFO: renamed from: j */
    @SuppressLint({"SV_USE_DUP_ID"})
    public zpd0 f29307j = new zpd0("rate_popup_last_shown_new", 0L);

    /* JADX INFO: renamed from: k */
    public tpd0 f29308k;

    /* JADX INFO: renamed from: l */
    public tpd0 f29309l;

    /* JADX INFO: renamed from: m */
    public tpd0 f29310m;

    /* JADX INFO: renamed from: n */
    public String f29311n;

    /* JADX INFO: renamed from: o */
    public z3g0 f29312o;

    public C8346a() {
        m45571n();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m45558b(dd80 dd80Var, Runnable runnable, View view, boolean z) {
        dd80Var.dismiss();
        HashMap map = new HashMap();
        map.put("neverask", "no");
        if (z) {
            runnable.run();
            map.put("neverask", "yes");
        }
        zvf0.m220397s("e_intl_5star_dialog_cancel_butto", "p_intl_5star_dialog_view", map);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m45559c(Act act, dd80 dd80Var, Runnable runnable, View view, boolean z) {
        try {
            vuw.m200138d(act);
            e = null;
        } catch (Exception e) {
            e = e;
            CrashHelper.m81296c(e);
        }
        if (NullChecker.m81303a(e)) {
            lsi0.m151578h(R$string.f17858Jl);
        }
        dd80Var.dismiss();
        HashMap map = new HashMap();
        map.put("neverask", "no");
        if (z) {
            runnable.run();
            map.put("neverask", "yes");
        }
        zvf0.m220397s("e_intl_5star_dialog_rating_button", "p_intl_5star_dialog_view", map);
    }

    /* JADX INFO: renamed from: j */
    public static C8346a m45563j() {
        if (f29297p == null) {
            synchronized (C8346a.class) {
                try {
                    if (f29297p == null) {
                        f29297p = new C8346a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f29297p;
    }

    /* JADX INFO: renamed from: q */
    public static void m45564q(final Act act, final Runnable runnable, Runnable runnable2) {
        GpRateGuideDialog gpRateGuideDialog = new GpRateGuideDialog(act);
        final dd80 dd80VarM110989r0 = act.newDialog().m110963R(gpRateGuideDialog).m110961P(true).m110989r0();
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_intl_5star_dialog_view", dd80VarM110989r0.getClass().getName());
        cwf0VarM133794c.m109040p(ic50.m135327j().m135333f().m145235V(OmsDialog.p_intl_5star_dialog_view.getIdentifier(), new j760("tooltips_trigger_mode", "passive")));
        i0e.m133797f(cwf0VarM133794c);
        dd80VarM110989r0.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.xcc0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        });
        if (NullChecker.m81303a(runnable2)) {
            runnable2.run();
        }
        gpRateGuideDialog.m45555g(new GpRateGuideDialog.InterfaceC8345a() { // from class: l.ycc0
            @Override // com.p046p1.mobile.putong.core.p053ui.p055gp.GpRateGuideDialog.InterfaceC8345a
            /* JADX INFO: renamed from: a */
            public final void mo45556a(View view, boolean z) {
                C8346a.m45559c(act, dd80VarM110989r0, runnable, view, z);
            }
        }, new GpRateGuideDialog.InterfaceC8345a() { // from class: l.zcc0
            @Override // com.p046p1.mobile.putong.core.p053ui.p055gp.GpRateGuideDialog.InterfaceC8345a
            /* JADX INFO: renamed from: a */
            public final void mo45556a(View view, boolean z) {
                C8346a.m45558b(dd80VarM110989r0, runnable, view, z);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public void m45565g() {
        z3g0 z3g0VarM94917a = a4g0.m94917a();
        this.f29312o = z3g0VarM94917a;
        z3g0VarM94917a.m217046b(CoreModule.f17545c.f19642f0.m33099qn().subscribe(mkd0.m154955G(new e30() { // from class: l.adc0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f68925a.m45568k((List) obj);
            }
        })));
    }

    /* JADX INFO: renamed from: h */
    public synchronized void m45566h() {
        m45567i();
        this.f29311n = "";
        this.f29308k = null;
        this.f29309l = null;
        this.f29310m = null;
    }

    /* JADX INFO: renamed from: i */
    public final void m45567i() {
        if (NullChecker.m81303a(this.f29308k)) {
            this.f29308k.clear();
            this.f29308k.put(0);
        }
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m45568k(List list) {
        Conversation conversation;
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext() && ((conversation = (Conversation) it.next()) == null || User.isTeamAccount(conversation.otherUser) || (i = i + 1) < 5)) {
        }
        m45574r(i);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m45569l() {
        if (ogl0.m164227F()) {
            ic50.m135327j().m135333f().m145261v0(OmsDialog.p_intl_5star_dialog_view.getIdentifier(), Long.MAX_VALUE);
        }
        this.f29307j.put(Long.MAX_VALUE);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m45570m() {
        this.f29307j.put(Long.valueOf(System.currentTimeMillis()));
    }

    /* JADX INFO: renamed from: n */
    public void m45571n() {
        Calendar calendar = Calendar.getInstance();
        String str = "message_count_" + calendar.get(1) + calendar.get(2) + calendar.get(5);
        boolean zEquals = str.equals(this.f29311n);
        if (!zEquals) {
            this.f29311n = str;
            if (NullChecker.m81303a(this.f29309l)) {
                this.f29309l.clear();
            }
            if (NullChecker.m81303a(this.f29308k)) {
                this.f29308k.clear();
            }
            if (NullChecker.m81303a(this.f29310m)) {
                this.f29310m.clear();
            }
        }
        if (this.f29308k == null || this.f29309l == null || this.f29310m == null || !zEquals) {
            this.f29308k = new tpd0(str + "_" + CoreModule.m29931H().userId() + "_receive", 0, true, "MessageCountToday");
            this.f29309l = new tpd0(str + "_" + CoreModule.m29931H().userId() + "_send", 0, true, "MessageCountToday");
            this.f29310m = new tpd0(str + "_" + CoreModule.m29931H().userId() + "_match", 0, true, "MessageCountToday");
        }
    }

    /* JADX INFO: renamed from: o */
    public synchronized void m45572o(Act act) {
        m45571n();
        Long l2 = this.f29307j.get();
        if (ogl0.m164227F()) {
            if (!ic50.m135327j().m135333f().m145226M(OmsDialog.p_intl_5star_dialog_view.getIdentifier(), true)) {
                return;
            }
        } else if (System.currentTimeMillis() - l2.longValue() < 259200000) {
            return;
        }
        if ((this.f29308k.get().intValue() >= 5 && this.f29309l.get().intValue() >= 5) || this.f29310m.get().intValue() >= 5) {
            if (ogl0.m164227F()) {
                ic50.m135327j().m135333f().m145241b0(OmsDialog.p_intl_5star_dialog_view.getIdentifier(), 0, true);
            }
            m45564q(act, new Runnable() { // from class: l.vcc0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f180918a.m45569l();
                }
            }, new Runnable() { // from class: l.wcc0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f185675a.m45570m();
                }
            });
        }
    }

    /* JADX INFO: renamed from: p */
    public void m45573p() {
        this.f29312o.unsubscribe();
        this.f29312o = a4g0.m94917a();
    }

    /* JADX INFO: renamed from: r */
    public final synchronized void m45574r(int i) {
        m45571n();
        this.f29310m.put(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: s */
    public synchronized void m45575s(int i) {
        m45571n();
        this.f29308k.put(Integer.valueOf(this.f29308k.get().intValue() + i));
    }

    /* JADX INFO: renamed from: t */
    public synchronized void m45576t(int i) {
        m45571n();
        this.f29309l.put(Integer.valueOf(this.f29309l.get().intValue() + i));
    }
}
