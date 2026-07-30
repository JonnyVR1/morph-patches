package com.p000p1.mobile.putong.core.newui.home.base.impl.swipe;

import android.content.DialogInterface;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.newui.home.ViewTreeObserverOnGlobalLayoutListenerC0030b;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseDialogConfigTriggerShowType;
import com.p1.mobile.putong.core.data.PurchaseDialogConfigs;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.data.Counter;
import com.p1.mobile.putong.data.CounterLikeLimit;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;
import l.c4g0;
import l.d30;
import l.e30;
import l.jkh0;
import l.jo0;
import l.ke7;
import l.lac0;
import l.mb90;
import l.mkd0;
import l.mrm;
import l.nkp;
import l.ogl0;
import l.p0d0;
import l.qqi0;
import l.u6l0;
import l.upa;
import l.x2c0;
import l.xdl0;
import p009l.psq;
import rx.c;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.h0 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0057h0 extends AbstractC0035a {

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.h0$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public Dialog f861a;

        /* JADX INFO: renamed from: b */
        public TextView f862b;

        /* JADX INFO: renamed from: c */
        public c4g0 f863c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ CounterLikeLimit f864d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ C0062j.a f865e;

        public a(CounterLikeLimit counterLikeLimit, C0062j.a aVar) {
            this.f864d = counterLikeLimit;
            this.f865e = aVar;
            this.f863c = aVar.f872a.duringCreated(c.interval(1L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(jo0.a())).subscribe(mkd0.G(new e30() { // from class: l.lbh0
                public final void call(Object obj) {
                    this.f16042a.m1616d((Long) obj);
                }
            }));
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ void m1616d(Long l2) {
            m1619g();
        }

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ void m1617e() {
            this.f863c.unsubscribe();
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m1618f(DialogInterface dialogInterface) {
            this.f863c.unsubscribe();
        }

        /* JADX INFO: renamed from: g */
        public void m1619g() {
            long jResetNowMillis = this.f864d.resetNowMillis();
            if (jResetNowMillis <= 0 && NullChecker.a(this.f861a)) {
                this.f861a.cancel();
            }
            String strB = qqi0.b(jResetNowMillis);
            if (NullChecker.a(this.f862b)) {
                this.f862b.setText(strB);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Dialog dialogZ0 = this.f865e.f873b.act().dialog().G0(this.f865e.f873b.act().getString(R.string.J3, Integer.valueOf(this.f864d.total))).F(this.f865e.f873b.act().getString(R.string.I3, Integer.valueOf(this.f864d.total))).u().s().c0(x2c0.vt).v0("", new Runnable() { // from class: l.jbh0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f15040a.m1617e();
                }
            }).w0(this.f865e.f873b.act().getResources().getDrawable(x2c0.wt)).A(new DialogInterface.OnCancelListener() { // from class: l.kbh0
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    this.f15590a.m1618f(dialogInterface);
                }
            }).z0();
            this.f861a = dialogZ0;
            TextView textViewJ0 = xdl0.J0(dialogZ0.Z());
            this.f862b = textViewJ0;
            textViewJ0.setTextSize(0, textViewJ0.getTextSize() * 1.1f);
            m1619g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m1606s(C0062j.a aVar) {
        m1611w(aVar, null);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0095  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:58:0x0129  */
    @Override // p009l.p3m
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(final C0062j.a aVar) {
        ViewTreeObserverOnGlobalLayoutListenerC0030b viewTreeObserverOnGlobalLayoutListenerC0030b;
        ViewTreeObserverOnGlobalLayoutListenerC0030b viewTreeObserverOnGlobalLayoutListenerC0030b2;
        ViewTreeObserverOnGlobalLayoutListenerC0030b viewTreeObserverOnGlobalLayoutListenerC0030b3;
        CounterLikeLimit counterLikeLimit = m1479h() != null ? m1479h().likeLimit : null;
        if (mrm.o().t() > 0) {
            new u6l0(aVar.f873b.act(), aVar.f872a).E();
        } else if (!upa.e() || mb90.b(PurchaseType.TYPE_LIKENOLIMIT_PKG) || !ke7.u()) {
            if (upa.c3() && !mb90.b(PurchaseType.TYPE_LIKENOLIMIT_PKG) && ke7.u()) {
                if (((Integer) CoreModule.c.e0.B5.get()).intValue() < (NullChecker.a(upa.b3()) ? upa.b3().maximum_verify_guide_times : 2)) {
                    if (aVar != null && (viewTreeObserverOnGlobalLayoutListenerC0030b2 = aVar.f873b) != null) {
                        m1612x(viewTreeObserverOnGlobalLayoutListenerC0030b2.act());
                    }
                } else if (!upa.K1()) {
                    if (mb90.b(PurchaseType.TYPE_LIKENOLIMIT_PKG)) {
                        new a(counterLikeLimit, aVar).run();
                    } else {
                        new a(counterLikeLimit, aVar).run();
                    }
                } else if (mb90.b(PurchaseType.TYPE_LIKENOLIMIT_PKG)) {
                    new a(counterLikeLimit, aVar).run();
                } else {
                    new a(counterLikeLimit, aVar).run();
                }
            } else if (!upa.K1() && ke7.u() && !mb90.b(PurchaseType.TYPE_LIKENOLIMIT_PKG)) {
                if (((Integer) CoreModule.c.e0.B5.get()).intValue() < (NullChecker.a(upa.a3()) ? upa.a3().maximum_verify_guide_times : 2)) {
                    if (aVar != null && (viewTreeObserverOnGlobalLayoutListenerC0030b = aVar.f873b) != null) {
                        m1612x(viewTreeObserverOnGlobalLayoutListenerC0030b.act());
                    }
                } else if (mb90.b(PurchaseType.TYPE_LIKENOLIMIT_PKG)) {
                    new a(counterLikeLimit, aVar).run();
                } else {
                    new a(counterLikeLimit, aVar).run();
                }
            } else if (mb90.b(PurchaseType.TYPE_LIKENOLIMIT_PKG) || !nkp.a()) {
                new a(counterLikeLimit, aVar).run();
            } else if (!p0d0.i().l(jkh0.d().c()) || p0d0.i().j(jkh0.d().c())) {
                m1611w(aVar, new d30() { // from class: l.ibh0
                    public final void call() {
                        this.f14470a.m1607t(aVar);
                    }
                });
            } else {
                p0d0.i().n(aVar.f873b.act(), "p_suggest_users_home_view,e_card,like_swipe", new d30() { // from class: l.hbh0
                    public final void call() {
                        this.f13940a.m1606s(aVar);
                    }
                });
            }
        } else if (aVar != null && (viewTreeObserverOnGlobalLayoutListenerC0030b3 = aVar.f873b) != null) {
            m1612x(viewTreeObserverOnGlobalLayoutListenerC0030b3.act());
        }
        aVar.f872a.m19348P8(aVar.f877f, "failExhaustSwipe");
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(C0062j.a aVar) {
        Counter counterM1479h = m1479h();
        CounterLikeLimit counterLikeLimit = counterM1479h == null ? null : counterM1479h.likeLimit;
        return !(lac0.m() && CoreModule.c.c2.t3()) && counterLikeLimit != null && counterLikeLimit.remaining == 0 && counterLikeLimit.resetNowMillis() > 0 && m1482k(aVar);
    }

    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public final void m1607t(C0062j.a aVar) {
        if (p0d0.i().l(jkh0.d().c())) {
            p0d0.i().m(aVar.f873b.act(), "p_suggest_users_home_view,e_card,like_swipe");
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m1611w(C0062j.a aVar, d30 d30Var) {
        if (!ogl0.m()) {
            com.p1.mobile.putong.core.ui.purchase.c.M1(aVar.f873b.act(), "p_home,likelimit", Privilege.vip_unlimited_likes, (d30) null, d30Var, false, aVar.f874c.m17130d());
            return;
        }
        PurchaseDialogConfigs purchaseDialogConfigsI4 = CoreModule.c.j0.I4();
        PurchaseDialogConfigTriggerShowType purchaseDialogConfigTriggerShowType = PurchaseDialogConfigTriggerShowType.get("unknown_");
        if (NullChecker.a(purchaseDialogConfigsI4) && NullChecker.a(purchaseDialogConfigsI4.sceneTriggerDialog)) {
            purchaseDialogConfigTriggerShowType = purchaseDialogConfigsI4.sceneTriggerDialog.swipeLimit.showType;
        }
        if (TEnum.equals(purchaseDialogConfigTriggerShowType, "svip")) {
            CoreModule.P().a().Gd(aVar.f873b.act(), "p_home,likelimit", Privilege.vip_unlimited_likes, (PurchaseType) null, (e30) null, -1, (d30) null, d30Var, (String) null, aVar.f874c.m17130d(), false);
        } else {
            com.p1.mobile.putong.core.ui.purchase.c.M1(aVar.f873b.act(), "p_home,likelimit", Privilege.vip_unlimited_likes, (d30) null, d30Var, false, aVar.f874c.m17130d());
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m1612x(Act act) {
        if (act == null) {
            return;
        }
        psq.m20652W(act);
    }
}
