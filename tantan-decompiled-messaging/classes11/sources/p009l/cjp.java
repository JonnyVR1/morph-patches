package p009l;

import android.view.View;
import com.p000p1.mobile.putong.core.newui.home.base.impl.swipe.C0079o1;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class cjp extends udp {

    /* JADX INFO: renamed from: d */
    public static volatile boolean f10638d = false;

    /* JADX INFO: renamed from: a */
    public nbp f10639a;

    /* JADX INFO: renamed from: b */
    public volatile boolean f10640b = false;

    /* JADX INFO: renamed from: c */
    public volatile boolean f10641c = false;

    /* JADX INFO: renamed from: l.cjp$a */
    public class C0815a implements C0079o1.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ j7h0.C0970a f10642a;

        public C0815a(j7h0.C0970a c0970a) {
            this.f10642a = c0970a;
        }

        @Override // com.p000p1.mobile.putong.core.newui.home.base.impl.swipe.C0079o1.a
        /* JADX INFO: renamed from: a */
        public void mo1569a() {
            this.f10642a.f14967a.m15788B2(true);
            cjp.this.m12639q(this.f10642a);
        }

        @Override // com.p000p1.mobile.putong.core.newui.home.base.impl.swipe.C0079o1.a
        public void onCancel() {
            this.f10642a.f14967a.m15790C2(false);
            C0079o1.m1685c(this.f10642a.f14968b.m20414m0());
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m12633r(boolean z) {
        f10638d = z;
    }

    /* JADX INFO: renamed from: l */
    public final View m12634l(j7h0.C0970a c0970a) {
        if (NullChecker.a(c0970a.f14969c) && NullChecker.a(c0970a.f14969c.m17127a())) {
            return c0970a.f14969c.m17127a().getCardView();
        }
        return null;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(j7h0.C0970a c0970a) {
        return pjp.m20488k(c0970a) ? m12641t(c0970a) : m12638p(c0970a);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m12636n(j7h0.C0970a c0970a) {
        this.f10640b = false;
        this.f10641c = true;
        m12642u(c0970a);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m12637o(j7h0.C0970a c0970a) {
        this.f10640b = false;
        this.f10641c = true;
        m12642u(c0970a);
    }

    /* JADX INFO: renamed from: p */
    public final VSwipeStack.OnCardSwipeResult m12638p(final j7h0.C0970a c0970a) {
        View viewM12634l = m12634l(c0970a);
        VFrame vFrame = c0970a.f14968b.f18696o;
        if (viewM12634l == null || vFrame == null) {
            return VSwipeStack.OnCardSwipeResult.pass;
        }
        this.f10640b = true;
        nbp nbpVar = new nbp(c0970a.f14968b.act(), vFrame);
        this.f10639a = nbpVar;
        nbpVar.m18835i(viewM12634l, new Runnable() { // from class: l.ajp
            @Override // java.lang.Runnable
            public final void run() {
                this.f9544a.m12636n(c0970a);
            }
        });
        return VSwipeStack.OnCardSwipeResult.stay;
    }

    /* JADX INFO: renamed from: q */
    public final void m12639q(final j7h0.C0970a c0970a) {
        View viewM12634l = m12634l(c0970a);
        VFrame vFrame = c0970a.f14968b.f18696o;
        if (viewM12634l == null || vFrame == null) {
            m12642u(c0970a);
            return;
        }
        this.f10640b = true;
        nbp nbpVar = new nbp(c0970a.f14968b.act(), vFrame);
        this.f10639a = nbpVar;
        nbpVar.m18835i(viewM12634l, new Runnable() { // from class: l.bjp
            @Override // java.lang.Runnable
            public final void run() {
                this.f10143a.m12637o(c0970a);
            }
        });
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(j7h0.C0970a c0970a) {
        if (this.f10641c) {
            this.f10641c = false;
            return false;
        }
        if (!f10638d) {
            return !this.f10640b && c0970a.f14970d == SwipeDirection.UP && c0970a.f14971e && !IntlCountryCodeController.v() && NullChecker.a(c0970a.f14969c.m17130d()) && sbp.m22047d();
        }
        f10638d = false;
        return false;
    }

    /* JADX INFO: renamed from: t */
    public final VSwipeStack.OnCardSwipeResult m12641t(j7h0.C0970a c0970a) {
        if (c0970a.f14967a.m15794F1()) {
            return m12638p(c0970a);
        }
        c0970a.f14967a.m15790C2(true);
        C0079o1.m1687e(c0970a.f14968b.act(), ((DbObject) c0970a.f14969c.m17130d()).id, new C0815a(c0970a));
        c0970a.f14967a.m15815i1();
        return VSwipeStack.OnCardSwipeResult.stay;
    }

    /* JADX INFO: renamed from: u */
    public final void m12642u(j7h0.C0970a c0970a) {
        if (NullChecker.a(c0970a.f14968b) && NullChecker.a(c0970a.f14968b.m20414m0())) {
            c0970a.f14968b.m20414m0().mo2797A(SwipeDirection.UP);
        }
    }
}
