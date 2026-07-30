package com.p051p1.mobile.putong.core.newui.home.base.impl.swipe;

import android.content.DialogInterface;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseDialogConfigTriggerShowType;
import com.p051p1.mobile.putong.core.data.PurchaseDialogConfigs;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.newui.home.ViewTreeObserverOnGlobalLayoutListenerC8017b;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.CounterLikeLimit;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p153l.bnl0;
import p153l.dbc0;
import p153l.fo0;
import p153l.gra;
import p153l.kcg0;
import p153l.nmp;
import p153l.of7;
import p153l.otm;
import p153l.psd0;
import p153l.qj90;
import p153l.qsh0;
import p153l.quq;
import p153l.ric0;
import p153l.s8d0;
import p153l.spl0;
import p153l.tzi0;
import p153l.x20;
import p153l.y20;
import p153l.yfl0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.h0 */
/* JADX INFO: loaded from: classes11.dex */
public class C8044h0 extends AbstractC8022a {

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.h0$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public Dialog f22825a;

        /* JADX INFO: renamed from: b */
        public TextView f22826b;

        /* JADX INFO: renamed from: c */
        public kcg0 f22827c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ CounterLikeLimit f22828d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ C8049j.a f22829e;

        public a(CounterLikeLimit counterLikeLimit, C8049j.a aVar) {
            this.f22828d = counterLikeLimit;
            this.f22829e = aVar;
            this.f22827c = aVar.f22836a.duringCreated(C22421c.interval(1L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(fo0.m126432a())).subscribe(psd0.m173596G(new y20() { // from class: l.tjh0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f174589a.m38648d((Long) obj);
                }
            }));
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ void m38648d(Long l2) {
            m38651g();
        }

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ void m38649e() {
            this.f22827c.unsubscribe();
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m38650f(DialogInterface dialogInterface) {
            this.f22827c.unsubscribe();
        }

        /* JADX INFO: renamed from: g */
        public void m38651g() {
            long jResetNowMillis = this.f22828d.resetNowMillis();
            if (jResetNowMillis <= 0 && NullChecker.m82486a(this.f22825a)) {
                this.f22825a.cancel();
            }
            String strM193664b = tzi0.m193664b(jResetNowMillis);
            if (NullChecker.m82486a(this.f22826b)) {
                this.f22826b.setText(strM193664b);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Dialog dialogM21567z0 = this.f22829e.f22837b.act().dialog().m21506G0(this.f22829e.f22837b.act().getString(R$string.f18630L3, Integer.valueOf(this.f22828d.total))).m21503F(this.f22829e.f22837b.act().getString(R$string.f18599K3, Integer.valueOf(this.f22828d.total))).m21556u().m21552s().m21532c0(dbc0.f87133ju).m21559v0("", new Runnable() { // from class: l.rjh0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f163455a.m38649e();
                }
            }).m21561w0(this.f22829e.f22837b.act().getResources().getDrawable(dbc0.f87166ku)).m21493A(new DialogInterface.OnCancelListener() { // from class: l.sjh0
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    this.f168972a.m38650f(dialogInterface);
                }
            }).m21567z0();
            this.f22825a = dialogM21567z0;
            TextView textViewM105519J0 = bnl0.m105519J0(dialogM21567z0.m21464Z());
            this.f22826b = textViewM105519J0;
            textViewM105519J0.setTextSize(0, textViewM105519J0.getTextSize() * 1.1f);
            m38651g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m38638s(C8049j.a aVar) {
        m38643w(aVar, null);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0095  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:58:0x0129  */
    @Override // p153l.g6m
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(final C8049j.a aVar) {
        ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b;
        ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2;
        ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b3;
        CounterLikeLimit counterLikeLimit = m38511h() != null ? m38511h().likeLimit : null;
        if (otm.m169137o().m169152t() > 0) {
            new yfl0(aVar.f22837b.act(), aVar.f22836a).m215768E();
        } else if (!gra.m131673e() || qj90.m176830b(PurchaseType.TYPE_LIKENOLIMIT_PKG) || !of7.m167424u()) {
            if (gra.m131667c3() && !qj90.m176830b(PurchaseType.TYPE_LIKENOLIMIT_PKG) && of7.m167424u()) {
                if (CoreModule.f18264c.f20381e0.f89003B5.get().intValue() < (NullChecker.m82486a(gra.m131662b3()) ? gra.m131662b3().maximum_verify_guide_times : 2)) {
                    if (aVar != null && (viewTreeObserverOnGlobalLayoutListenerC8017b2 = aVar.f22837b) != null) {
                        m38644x(viewTreeObserverOnGlobalLayoutListenerC8017b2.act());
                    }
                } else if (!gra.m131589K1()) {
                    if (qj90.m176830b(PurchaseType.TYPE_LIKENOLIMIT_PKG)) {
                        new a(counterLikeLimit, aVar).run();
                    } else {
                        new a(counterLikeLimit, aVar).run();
                    }
                } else if (qj90.m176830b(PurchaseType.TYPE_LIKENOLIMIT_PKG)) {
                    new a(counterLikeLimit, aVar).run();
                } else {
                    new a(counterLikeLimit, aVar).run();
                }
            } else if (!gra.m131589K1() && of7.m167424u() && !qj90.m176830b(PurchaseType.TYPE_LIKENOLIMIT_PKG)) {
                if (CoreModule.f18264c.f20381e0.f89003B5.get().intValue() < (NullChecker.m82486a(gra.m131658a3()) ? gra.m131658a3().maximum_verify_guide_times : 2)) {
                    if (aVar != null && (viewTreeObserverOnGlobalLayoutListenerC8017b = aVar.f22837b) != null) {
                        m38644x(viewTreeObserverOnGlobalLayoutListenerC8017b.act());
                    }
                } else if (qj90.m176830b(PurchaseType.TYPE_LIKENOLIMIT_PKG)) {
                    new a(counterLikeLimit, aVar).run();
                } else {
                    new a(counterLikeLimit, aVar).run();
                }
            } else if (qj90.m176830b(PurchaseType.TYPE_LIKENOLIMIT_PKG) || !nmp.m163832a()) {
                new a(counterLikeLimit, aVar).run();
            } else if (!s8d0.m185067i().m185071l(qsh0.m177808d().m177809c()) || s8d0.m185067i().m185070j(qsh0.m177808d().m177809c())) {
                m38643w(aVar, new x20() { // from class: l.qjh0
                    @Override // p153l.x20
                    public final void call() {
                        this.f157972a.m38639t(aVar);
                    }
                });
            } else {
                s8d0.m185067i().m185073n(aVar.f22837b.act(), "p_suggest_users_home_view,e_card,like_swipe", new x20() { // from class: l.pjh0
                    @Override // p153l.x20
                    public final void call() {
                        this.f152696a.m38638s(aVar);
                    }
                });
            }
        } else if (aVar != null && (viewTreeObserverOnGlobalLayoutListenerC8017b3 = aVar.f22837b) != null) {
            m38644x(viewTreeObserverOnGlobalLayoutListenerC8017b3.act());
        }
        aVar.f22836a.m101938P8(aVar.f22841f, "failExhaustSwipe");
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(C8049j.a aVar) {
        Counter counterM38511h = m38511h();
        CounterLikeLimit counterLikeLimit = counterM38511h == null ? null : counterM38511h.likeLimit;
        return !(ric0.m181583m() && CoreModule.f18264c.f20377c2.m118408t3()) && counterLikeLimit != null && counterLikeLimit.remaining == 0 && counterLikeLimit.resetNowMillis() > 0 && m38514k(aVar);
    }

    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public final void m38639t(C8049j.a aVar) {
        if (s8d0.m185067i().m185071l(qsh0.m177808d().m177809c())) {
            s8d0.m185067i().m185072m(aVar.f22837b.act(), "p_suggest_users_home_view,e_card,like_swipe");
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m38643w(C8049j.a aVar, x20 x20Var) {
        if (!spl0.m187387m()) {
            C8927c.m54595M1(aVar.f22837b.act(), "p_home,likelimit", Privilege.vip_unlimited_likes, null, x20Var, false, aVar.f22838c.m140259d());
            return;
        }
        PurchaseDialogConfigs purchaseDialogConfigsM31591I4 = CoreModule.f18264c.f20396j0.m31591I4();
        PurchaseDialogConfigTriggerShowType purchaseDialogConfigTriggerShowType = PurchaseDialogConfigTriggerShowType.get("unknown_");
        if (NullChecker.m82486a(purchaseDialogConfigsM31591I4) && NullChecker.m82486a(purchaseDialogConfigsM31591I4.sceneTriggerDialog)) {
            purchaseDialogConfigTriggerShowType = purchaseDialogConfigsM31591I4.sceneTriggerDialog.swipeLimit.showType;
        }
        if (TEnum.equals(purchaseDialogConfigTriggerShowType, "svip")) {
            CoreModule.m30933P().m143405a().mo34326Gd(aVar.f22837b.act(), "p_home,likelimit", Privilege.vip_unlimited_likes, null, null, -1, null, x20Var, null, aVar.f22838c.m140259d(), false);
        } else {
            C8927c.m54595M1(aVar.f22837b.act(), "p_home,likelimit", Privilege.vip_unlimited_likes, null, x20Var, false, aVar.f22838c.m140259d());
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m38644x(Act act) {
        if (act == null) {
            return;
        }
        quq.m178187W(act);
    }
}
