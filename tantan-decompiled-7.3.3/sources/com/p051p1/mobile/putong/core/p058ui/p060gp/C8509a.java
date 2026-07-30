package com.p051p1.mobile.putong.core.p058ui.p060gp;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.oms.OmsDialog;
import com.p051p1.mobile.putong.core.p058ui.p060gp.C8509a;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p153l.byd0;
import p153l.gcg0;
import p153l.i4g0;
import p153l.icg0;
import p153l.jl80;
import p153l.l4g0;
import p153l.o1j0;
import p153l.pf60;
import p153l.pk50;
import p153l.psd0;
import p153l.spl0;
import p153l.uxw;
import p153l.vxd0;
import p153l.w1e;
import p153l.y20;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.gp.a */
/* JADX INFO: loaded from: classes3.dex */
public class C8509a {

    /* JADX INFO: renamed from: p */
    public static volatile C8509a f30145p;

    /* JADX INFO: renamed from: a */
    public final String f30146a = "message_count_";

    /* JADX INFO: renamed from: b */
    public final String f30147b = "_";

    /* JADX INFO: renamed from: c */
    public final String f30148c = "_receive";

    /* JADX INFO: renamed from: d */
    public final String f30149d = "_send";

    /* JADX INFO: renamed from: e */
    public final String f30150e = "_match";

    /* JADX INFO: renamed from: f */
    public final int f30151f = 3;

    /* JADX INFO: renamed from: g */
    public final int f30152g = 10;

    /* JADX INFO: renamed from: h */
    public final int f30153h = 5;

    /* JADX INFO: renamed from: i */
    public final int f30154i = 5;

    /* JADX INFO: renamed from: j */
    @SuppressLint({"SV_USE_DUP_ID"})
    public byd0 f30155j = new byd0("rate_popup_last_shown_new", 0L);

    /* JADX INFO: renamed from: k */
    public vxd0 f30156k;

    /* JADX INFO: renamed from: l */
    public vxd0 f30157l;

    /* JADX INFO: renamed from: m */
    public vxd0 f30158m;

    /* JADX INFO: renamed from: n */
    public String f30159n;

    /* JADX INFO: renamed from: o */
    public gcg0 f30160o;

    public C8509a() {
        m46754n();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m46741b(jl80 jl80Var, Runnable runnable, View view, boolean z) {
        jl80Var.dismiss();
        HashMap map = new HashMap();
        map.put("neverask", "no");
        if (z) {
            runnable.run();
            map.put("neverask", "yes");
        }
        i4g0.m138521s("e_intl_5star_dialog_cancel_butto", "p_intl_5star_dialog_view", map);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m46742c(Act act, jl80 jl80Var, Runnable runnable, View view, boolean z) {
        try {
            uxw.m198548d(act);
            e = null;
        } catch (Exception e) {
            e = e;
            CrashHelper.m82479c(e);
        }
        if (NullChecker.m82486a(e)) {
            o1j0.m165634h(R$string.f19253fm);
        }
        jl80Var.dismiss();
        HashMap map = new HashMap();
        map.put("neverask", "no");
        if (z) {
            runnable.run();
            map.put("neverask", "yes");
        }
        i4g0.m138521s("e_intl_5star_dialog_rating_button", "p_intl_5star_dialog_view", map);
    }

    /* JADX INFO: renamed from: j */
    public static C8509a m46746j() {
        if (f30145p == null) {
            synchronized (C8509a.class) {
                try {
                    if (f30145p == null) {
                        f30145p = new C8509a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f30145p;
    }

    /* JADX INFO: renamed from: q */
    public static void m46747q(final Act act, final Runnable runnable, Runnable runnable2) {
        GpRateGuideDialog gpRateGuideDialog = new GpRateGuideDialog(act);
        final jl80 jl80VarM146049r0 = act.newDialog().m146023R(gpRateGuideDialog).m146021P(true).m146049r0();
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_intl_5star_dialog_view", jl80VarM146049r0.getClass().getName());
        l4g0VarM204399c.m152781p(pk50.m172568j().m172574f().m181658V(OmsDialog.p_intl_5star_dialog_view.getIdentifier(), new pf60("tooltips_trigger_mode", "passive")));
        w1e.m204402f(l4g0VarM204399c);
        jl80VarM146049r0.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.elc0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        });
        if (NullChecker.m82486a(runnable2)) {
            runnable2.run();
        }
        gpRateGuideDialog.m46738g(new GpRateGuideDialog.InterfaceC8508a() { // from class: l.flc0
            @Override // com.p051p1.mobile.putong.core.p058ui.p060gp.GpRateGuideDialog.InterfaceC8508a
            /* JADX INFO: renamed from: a */
            public final void mo46739a(View view, boolean z) {
                C8509a.m46742c(act, jl80VarM146049r0, runnable, view, z);
            }
        }, new GpRateGuideDialog.InterfaceC8508a() { // from class: l.glc0
            @Override // com.p051p1.mobile.putong.core.p058ui.p060gp.GpRateGuideDialog.InterfaceC8508a
            /* JADX INFO: renamed from: a */
            public final void mo46739a(View view, boolean z) {
                C8509a.m46741b(jl80VarM146049r0, runnable, view, z);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public void m46748g() {
        gcg0 gcg0VarM139434a = icg0.m139434a();
        this.f30160o = gcg0VarM139434a;
        gcg0VarM139434a.m129866b(CoreModule.f18264c.f20384f0.m34102qn().subscribe(psd0.m173596G(new y20() { // from class: l.hlc0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f110492a.m46751k((List) obj);
            }
        })));
    }

    /* JADX INFO: renamed from: h */
    public synchronized void m46749h() {
        m46750i();
        this.f30159n = "";
        this.f30156k = null;
        this.f30157l = null;
        this.f30158m = null;
    }

    /* JADX INFO: renamed from: i */
    public final void m46750i() {
        if (NullChecker.m82486a(this.f30156k)) {
            this.f30156k.clear();
            this.f30156k.put(0);
        }
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m46751k(List list) {
        Conversation conversation;
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext() && ((conversation = (Conversation) it.next()) == null || User.isTeamAccount(conversation.otherUser) || (i = i + 1) < 5)) {
        }
        m46757r(i);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m46752l() {
        if (spl0.m187354F()) {
            pk50.m172568j().m172574f().m181684v0(OmsDialog.p_intl_5star_dialog_view.getIdentifier(), Long.MAX_VALUE);
        }
        this.f30155j.put(Long.MAX_VALUE);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m46753m() {
        this.f30155j.put(Long.valueOf(System.currentTimeMillis()));
    }

    /* JADX INFO: renamed from: n */
    public void m46754n() {
        Calendar calendar = Calendar.getInstance();
        String str = "message_count_" + calendar.get(1) + calendar.get(2) + calendar.get(5);
        boolean zEquals = str.equals(this.f30159n);
        if (!zEquals) {
            this.f30159n = str;
            if (NullChecker.m82486a(this.f30157l)) {
                this.f30157l.clear();
            }
            if (NullChecker.m82486a(this.f30156k)) {
                this.f30156k.clear();
            }
            if (NullChecker.m82486a(this.f30158m)) {
                this.f30158m.clear();
            }
        }
        if (this.f30156k == null || this.f30157l == null || this.f30158m == null || !zEquals) {
            this.f30156k = new vxd0(str + "_" + CoreModule.m30929H().userId() + "_receive", 0, true, "MessageCountToday");
            this.f30157l = new vxd0(str + "_" + CoreModule.m30929H().userId() + "_send", 0, true, "MessageCountToday");
            this.f30158m = new vxd0(str + "_" + CoreModule.m30929H().userId() + "_match", 0, true, "MessageCountToday");
        }
    }

    /* JADX INFO: renamed from: o */
    public synchronized void m46755o(Act act) {
        m46754n();
        Long l2 = this.f30155j.get();
        if (spl0.m187354F()) {
            if (!pk50.m172568j().m172574f().m181649M(OmsDialog.p_intl_5star_dialog_view.getIdentifier(), true)) {
                return;
            }
        } else if (System.currentTimeMillis() - l2.longValue() < 259200000) {
            return;
        }
        if ((this.f30156k.get().intValue() >= 5 && this.f30157l.get().intValue() >= 5) || this.f30158m.get().intValue() >= 5) {
            if (spl0.m187354F()) {
                pk50.m172568j().m172574f().m181664b0(OmsDialog.p_intl_5star_dialog_view.getIdentifier(), 0, true);
            }
            m46747q(act, new Runnable() { // from class: l.clc0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f82366a.m46752l();
                }
            }, new Runnable() { // from class: l.dlc0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f89524a.m46753m();
                }
            });
        }
    }

    /* JADX INFO: renamed from: p */
    public void m46756p() {
        this.f30160o.unsubscribe();
        this.f30160o = icg0.m139434a();
    }

    /* JADX INFO: renamed from: r */
    public final synchronized void m46757r(int i) {
        m46754n();
        this.f30158m.put(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: s */
    public synchronized void m46758s(int i) {
        m46754n();
        this.f30156k.put(Integer.valueOf(this.f30156k.get().intValue() + i));
    }

    /* JADX INFO: renamed from: t */
    public synchronized void m46759t(int i) {
        m46754n();
        this.f30157l.put(Integer.valueOf(this.f30157l.get().intValue() + i));
    }
}
