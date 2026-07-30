package com.p051p1.mobile.putong.core.newui.home.base.impl.swipe;

import android.view.View;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import p151v.VFrame;
import p153l.ndp;
import p153l.sdp;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.d0 */
/* JADX INFO: loaded from: classes11.dex */
public class C8032d0 extends AbstractC8022a {

    /* JADX INFO: renamed from: j */
    public static volatile boolean f22806j = false;

    /* JADX INFO: renamed from: g */
    public ndp f22807g;

    /* JADX INFO: renamed from: h */
    public volatile boolean f22808h = false;

    /* JADX INFO: renamed from: i */
    public volatile boolean f22809i = false;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.d0$a */
    public class a implements C8066o1.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C8049j.a f22810a;

        public a(C8049j.a aVar) {
            this.f22810a = aVar;
        }

        @Override // com.p051p1.mobile.putong.core.newui.home.base.impl.swipe.C8066o1.a
        /* JADX INFO: renamed from: a */
        public void mo38601a() {
            this.f22810a.f22836a.m101975X8(true);
            C8032d0.this.m38599x(this.f22810a);
        }

        @Override // com.p051p1.mobile.putong.core.newui.home.base.impl.swipe.C8066o1.a
        public void onCancel() {
            this.f22810a.f22836a.m101980Y8(false);
            C8066o1.m38717c(this.f22810a.f22837b.m38128A2());
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m38591y(boolean z) {
        f22806j = z;
    }

    /* JADX INFO: renamed from: A */
    public final VSwipeStack.OnCardSwipeResult m38592A(C8049j.a aVar) {
        if (aVar.f22836a.m102060q6()) {
            return m38598w(aVar);
        }
        aVar.f22836a.m101980Y8(true);
        C8066o1.m38719e(aVar.f22837b.act(), aVar.f22838c.m140259d().f56859id, new a(aVar));
        aVar.f22836a.m101995c5();
        return VSwipeStack.OnCardSwipeResult.stay;
    }

    /* JADX INFO: renamed from: B */
    public final void m38593B(C8049j.a aVar) {
        if (NullChecker.m82486a(aVar.f22837b) && NullChecker.m82486a(aVar.f22837b.m38128A2())) {
            aVar.f22837b.m38128A2().mo39804A(SwipeDirection.UP);
        }
    }

    /* JADX INFO: renamed from: s */
    public final View m38594s(C8049j.a aVar) {
        if (NullChecker.m82486a(aVar.f22838c) && NullChecker.m82486a(aVar.f22838c.m140256a())) {
            return aVar.f22838c.m140256a().getCardView();
        }
        return null;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(C8049j.a aVar) {
        return C8039f1.m38620v(aVar) ? m38592A(aVar) : m38598w(aVar);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m38596u(C8049j.a aVar) {
        this.f22808h = false;
        this.f22809i = true;
        m38593B(aVar);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m38597v(C8049j.a aVar) {
        this.f22808h = false;
        this.f22809i = true;
        m38593B(aVar);
    }

    /* JADX INFO: renamed from: w */
    public final VSwipeStack.OnCardSwipeResult m38598w(final C8049j.a aVar) {
        View viewM38594s = m38594s(aVar);
        VFrame vFrame = aVar.f22837b.f22662c;
        if (viewM38594s == null || vFrame == null) {
            return VSwipeStack.OnCardSwipeResult.pass;
        }
        this.f22808h = true;
        ndp ndpVar = new ndp(aVar.f22837b.act(), vFrame);
        this.f22807g = ndpVar;
        ndpVar.m162726i(viewM38594s, new Runnable() { // from class: l.mjh0
            @Override // java.lang.Runnable
            public final void run() {
                this.f137076a.m38596u(aVar);
            }
        });
        return VSwipeStack.OnCardSwipeResult.stay;
    }

    /* JADX INFO: renamed from: x */
    public final void m38599x(final C8049j.a aVar) {
        View viewM38594s = m38594s(aVar);
        VFrame vFrame = aVar.f22837b.f22662c;
        if (viewM38594s == null || vFrame == null) {
            m38593B(aVar);
            return;
        }
        this.f22808h = true;
        ndp ndpVar = new ndp(aVar.f22837b.act(), vFrame);
        this.f22807g = ndpVar;
        ndpVar.m162726i(viewM38594s, new Runnable() { // from class: l.njh0
            @Override // java.lang.Runnable
            public final void run() {
                this.f142298a.m38597v(aVar);
            }
        });
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(C8049j.a aVar) {
        if (this.f22809i) {
            this.f22809i = false;
            return false;
        }
        if (!f22806j) {
            return !this.f22808h && aVar.f22839d == SwipeDirection.UP && aVar.f22840e && !IntlCountryCodeController.m29125v() && NullChecker.m82486a(aVar.f22838c.m140259d()) && sdp.m185487d();
        }
        f22806j = false;
        return false;
    }
}
