package com.p000p1.mobile.putong.core.newui.home.base.impl.swipe;

import android.view.View;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import p009l.nbp;
import p009l.sbp;
import v.VFrame;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.d0 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0045d0 extends AbstractC0035a {

    /* JADX INFO: renamed from: j */
    public static volatile boolean f842j = false;

    /* JADX INFO: renamed from: g */
    public nbp f843g;

    /* JADX INFO: renamed from: h */
    public volatile boolean f844h = false;

    /* JADX INFO: renamed from: i */
    public volatile boolean f845i = false;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.d0$a */
    public class a implements C0079o1.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C0062j.a f846a;

        public a(C0062j.a aVar) {
            this.f846a = aVar;
        }

        @Override // com.p000p1.mobile.putong.core.newui.home.base.impl.swipe.C0079o1.a
        /* JADX INFO: renamed from: a */
        public void mo1569a() {
            this.f846a.f872a.m19385X8(true);
            C0045d0.this.m1567x(this.f846a);
        }

        @Override // com.p000p1.mobile.putong.core.newui.home.base.impl.swipe.C0079o1.a
        public void onCancel() {
            this.f846a.f872a.m19390Y8(false);
            C0079o1.m1685c(this.f846a.f873b.m1092A2());
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m1559y(boolean z) {
        f842j = z;
    }

    /* JADX INFO: renamed from: A */
    public final VSwipeStack.OnCardSwipeResult m1560A(C0062j.a aVar) {
        if (aVar.f872a.m19472q6()) {
            return m1566w(aVar);
        }
        aVar.f872a.m19390Y8(true);
        C0079o1.m1687e(aVar.f873b.act(), ((DbObject) aVar.f874c.m17130d()).id, new a(aVar));
        aVar.f872a.m19407c5();
        return VSwipeStack.OnCardSwipeResult.stay;
    }

    /* JADX INFO: renamed from: B */
    public final void m1561B(C0062j.a aVar) {
        if (NullChecker.a(aVar.f873b) && NullChecker.a(aVar.f873b.m1092A2())) {
            aVar.f873b.m1092A2().mo2797A(SwipeDirection.UP);
        }
    }

    /* JADX INFO: renamed from: s */
    public final View m1562s(C0062j.a aVar) {
        if (NullChecker.a(aVar.f874c) && NullChecker.a(aVar.f874c.m17127a())) {
            return aVar.f874c.m17127a().getCardView();
        }
        return null;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(C0062j.a aVar) {
        return C0052f1.m1588v(aVar) ? m1560A(aVar) : m1566w(aVar);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m1564u(C0062j.a aVar) {
        this.f844h = false;
        this.f845i = true;
        m1561B(aVar);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m1565v(C0062j.a aVar) {
        this.f844h = false;
        this.f845i = true;
        m1561B(aVar);
    }

    /* JADX INFO: renamed from: w */
    public final VSwipeStack.OnCardSwipeResult m1566w(final C0062j.a aVar) {
        View viewM1562s = m1562s(aVar);
        VFrame vFrame = aVar.f873b.f698c;
        if (viewM1562s == null || vFrame == null) {
            return VSwipeStack.OnCardSwipeResult.pass;
        }
        this.f844h = true;
        nbp nbpVar = new nbp(aVar.f873b.act(), vFrame);
        this.f843g = nbpVar;
        nbpVar.m18835i(viewM1562s, new Runnable() { // from class: l.ebh0
            @Override // java.lang.Runnable
            public final void run() {
                this.f12483a.m1564u(aVar);
            }
        });
        return VSwipeStack.OnCardSwipeResult.stay;
    }

    /* JADX INFO: renamed from: x */
    public final void m1567x(final C0062j.a aVar) {
        View viewM1562s = m1562s(aVar);
        VFrame vFrame = aVar.f873b.f698c;
        if (viewM1562s == null || vFrame == null) {
            m1561B(aVar);
            return;
        }
        this.f844h = true;
        nbp nbpVar = new nbp(aVar.f873b.act(), vFrame);
        this.f843g = nbpVar;
        nbpVar.m18835i(viewM1562s, new Runnable() { // from class: l.fbh0
            @Override // java.lang.Runnable
            public final void run() {
                this.f12903a.m1565v(aVar);
            }
        });
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(C0062j.a aVar) {
        if (this.f845i) {
            this.f845i = false;
            return false;
        }
        if (!f842j) {
            return !this.f844h && aVar.f875d == SwipeDirection.UP && aVar.f876e && !IntlCountryCodeController.v() && NullChecker.a(aVar.f874c.m17130d()) && sbp.m22047d();
        }
        f842j = false;
        return false;
    }
}
