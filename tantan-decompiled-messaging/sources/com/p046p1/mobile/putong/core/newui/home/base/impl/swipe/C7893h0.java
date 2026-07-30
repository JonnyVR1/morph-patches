package com.p046p1.mobile.putong.core.newui.home.base.impl.swipe;

import android.content.DialogInterface;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseDialogConfigTriggerShowType;
import com.p046p1.mobile.putong.core.data.PurchaseDialogConfigs;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.newui.home.ViewTreeObserverOnGlobalLayoutListenerC7866b;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.CounterLikeLimit;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p149l.c4g0;
import p149l.d30;
import p149l.e30;
import p149l.jkh0;
import p149l.jo0;
import p149l.ke7;
import p149l.lac0;
import p149l.mb90;
import p149l.mkd0;
import p149l.mrm;
import p149l.nkp;
import p149l.ogl0;
import p149l.p0d0;
import p149l.psq;
import p149l.qqi0;
import p149l.u6l0;
import p149l.upa;
import p149l.x2c0;
import p149l.xdl0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.h0 */
/* JADX INFO: loaded from: classes11.dex */
public class C7893h0 extends AbstractC7871a {

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.h0$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public Dialog f22083a;

        /* JADX INFO: renamed from: b */
        public TextView f22084b;

        /* JADX INFO: renamed from: c */
        public c4g0 f22085c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ CounterLikeLimit f22086d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ C7898j.a f22087e;

        public a(CounterLikeLimit counterLikeLimit, C7898j.a aVar) {
            this.f22086d = counterLikeLimit;
            this.f22087e = aVar;
            this.f22085c = aVar.f22094a.duringCreated(C22306c.interval(1L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(jo0.m142408a())).subscribe(mkd0.m154955G(new e30() { // from class: l.lbh0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f127296a.m37645d((Long) obj);
                }
            }));
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ void m37645d(Long l2) {
            m37648g();
        }

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ void m37646e() {
            this.f22085c.unsubscribe();
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m37647f(DialogInterface dialogInterface) {
            this.f22085c.unsubscribe();
        }

        /* JADX INFO: renamed from: g */
        public void m37648g() {
            long jResetNowMillis = this.f22086d.resetNowMillis();
            if (jResetNowMillis <= 0 && NullChecker.m81303a(this.f22083a)) {
                this.f22083a.cancel();
            }
            String strM175934b = qqi0.m175934b(jResetNowMillis);
            if (NullChecker.m81303a(this.f22084b)) {
                this.f22084b.setText(strM175934b);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Dialog dialogM20568z0 = this.f22087e.f22095b.act().dialog().m20507G0(this.f22087e.f22095b.act().getString(R$string.f17840J3, Integer.valueOf(this.f22086d.total))).m20504F(this.f22087e.f22095b.act().getString(R$string.f17810I3, Integer.valueOf(this.f22086d.total))).m20557u().m20553s().m20533c0(x2c0.f190664vt).m20560v0("", new Runnable() { // from class: l.jbh0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f117192a.m37646e();
                }
            }).m20562w0(this.f22087e.f22095b.act().getResources().getDrawable(x2c0.f190696wt)).m20494A(new DialogInterface.OnCancelListener() { // from class: l.kbh0
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    this.f122241a.m37647f(dialogInterface);
                }
            }).m20568z0();
            this.f22083a = dialogM20568z0;
            TextView textViewM208339J0 = xdl0.m208339J0(dialogM20568z0.m20465Z());
            this.f22084b = textViewM208339J0;
            textViewM208339J0.setTextSize(0, textViewM208339J0.getTextSize() * 1.1f);
            m37648g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m37635s(C7898j.a aVar) {
        m37640w(aVar, null);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0095  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:58:0x0129  */
    @Override // p149l.p3m
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(final C7898j.a aVar) {
        ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b;
        ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2;
        ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b3;
        CounterLikeLimit counterLikeLimit = m37508h() != null ? m37508h().likeLimit : null;
        if (mrm.m156049o().m156064t() > 0) {
            new u6l0(aVar.f22095b.act(), aVar.f22094a).m192000E();
        } else if (!upa.m194742e() || mb90.m153866b(PurchaseType.TYPE_LIKENOLIMIT_PKG) || !ke7.m145736u()) {
            if (upa.m194736c3() && !mb90.m153866b(PurchaseType.TYPE_LIKENOLIMIT_PKG) && ke7.m145736u()) {
                if (CoreModule.f17545c.f19639e0.f149146B5.get().intValue() < (NullChecker.m81303a(upa.m194731b3()) ? upa.m194731b3().maximum_verify_guide_times : 2)) {
                    if (aVar != null && (viewTreeObserverOnGlobalLayoutListenerC7866b2 = aVar.f22095b) != null) {
                        m37641x(viewTreeObserverOnGlobalLayoutListenerC7866b2.act());
                    }
                } else if (!upa.m194658K1()) {
                    if (mb90.m153866b(PurchaseType.TYPE_LIKENOLIMIT_PKG)) {
                        new a(counterLikeLimit, aVar).run();
                    } else {
                        new a(counterLikeLimit, aVar).run();
                    }
                } else if (mb90.m153866b(PurchaseType.TYPE_LIKENOLIMIT_PKG)) {
                    new a(counterLikeLimit, aVar).run();
                } else {
                    new a(counterLikeLimit, aVar).run();
                }
            } else if (!upa.m194658K1() && ke7.m145736u() && !mb90.m153866b(PurchaseType.TYPE_LIKENOLIMIT_PKG)) {
                if (CoreModule.f17545c.f19639e0.f149146B5.get().intValue() < (NullChecker.m81303a(upa.m194727a3()) ? upa.m194727a3().maximum_verify_guide_times : 2)) {
                    if (aVar != null && (viewTreeObserverOnGlobalLayoutListenerC7866b = aVar.f22095b) != null) {
                        m37641x(viewTreeObserverOnGlobalLayoutListenerC7866b.act());
                    }
                } else if (mb90.m153866b(PurchaseType.TYPE_LIKENOLIMIT_PKG)) {
                    new a(counterLikeLimit, aVar).run();
                } else {
                    new a(counterLikeLimit, aVar).run();
                }
            } else if (mb90.m153866b(PurchaseType.TYPE_LIKENOLIMIT_PKG) || !nkp.m159982a()) {
                new a(counterLikeLimit, aVar).run();
            } else if (!p0d0.m166973i().m166977l(jkh0.m141875d().m141876c()) || p0d0.m166973i().m166976j(jkh0.m141875d().m141876c())) {
                m37640w(aVar, new d30() { // from class: l.ibh0
                    @Override // p149l.d30
                    public final void call() {
                        this.f112367a.m37636t(aVar);
                    }
                });
            } else {
                p0d0.m166973i().m166979n(aVar.f22095b.act(), "p_suggest_users_home_view,e_card,like_swipe", new d30() { // from class: l.hbh0
                    @Override // p149l.d30
                    public final void call() {
                        this.f106934a.m37635s(aVar);
                    }
                });
            }
        } else if (aVar != null && (viewTreeObserverOnGlobalLayoutListenerC7866b3 = aVar.f22095b) != null) {
            m37641x(viewTreeObserverOnGlobalLayoutListenerC7866b3.act());
        }
        aVar.f22094a.m161144P8(aVar.f22099f, "failExhaustSwipe");
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(C7898j.a aVar) {
        Counter counterM37508h = m37508h();
        CounterLikeLimit counterLikeLimit = counterM37508h == null ? null : counterM37508h.likeLimit;
        return !(lac0.m149136m() && CoreModule.f17545c.f19635c2.m99148t3()) && counterLikeLimit != null && counterLikeLimit.remaining == 0 && counterLikeLimit.resetNowMillis() > 0 && m37511k(aVar);
    }

    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public final void m37636t(C7898j.a aVar) {
        if (p0d0.m166973i().m166977l(jkh0.m141875d().m141876c())) {
            p0d0.m166973i().m166978m(aVar.f22095b.act(), "p_suggest_users_home_view,e_card,like_swipe");
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m37640w(C7898j.a aVar, d30 d30Var) {
        if (!ogl0.m164260m()) {
            C8764c.m53412M1(aVar.f22095b.act(), "p_home,likelimit", Privilege.vip_unlimited_likes, null, d30Var, false, aVar.f22096c.m141745d());
            return;
        }
        PurchaseDialogConfigs purchaseDialogConfigsM30588I4 = CoreModule.f17545c.f19654j0.m30588I4();
        PurchaseDialogConfigTriggerShowType purchaseDialogConfigTriggerShowType = PurchaseDialogConfigTriggerShowType.get("unknown_");
        if (NullChecker.m81303a(purchaseDialogConfigsM30588I4) && NullChecker.m81303a(purchaseDialogConfigsM30588I4.sceneTriggerDialog)) {
            purchaseDialogConfigTriggerShowType = purchaseDialogConfigsM30588I4.sceneTriggerDialog.swipeLimit.showType;
        }
        if (TEnum.equals(purchaseDialogConfigTriggerShowType, "svip")) {
            CoreModule.m29935P().m94651a().mo33323Gd(aVar.f22095b.act(), "p_home,likelimit", Privilege.vip_unlimited_likes, null, null, -1, null, d30Var, null, aVar.f22096c.m141745d(), false);
        } else {
            C8764c.m53412M1(aVar.f22095b.act(), "p_home,likelimit", Privilege.vip_unlimited_likes, null, d30Var, false, aVar.f22096c.m141745d());
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m37641x(Act act) {
        if (act == null) {
            return;
        }
        psq.m171207W(act);
    }
}
