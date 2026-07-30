package p153l;

import android.view.View;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.newui.home.base.impl.swipe.C8066o1;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import p151v.VFrame;

/* JADX INFO: loaded from: classes11.dex */
public class clp extends ufp {

    /* JADX INFO: renamed from: d */
    public static volatile boolean f82409d = false;

    /* JADX INFO: renamed from: a */
    public ndp f82410a;

    /* JADX INFO: renamed from: b */
    public volatile boolean f82411b = false;

    /* JADX INFO: renamed from: c */
    public volatile boolean f82412c = false;

    /* JADX INFO: renamed from: l.clp$a */
    public class C16302a implements C8066o1.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ rfh0.C19824a f82413a;

        public C16302a(rfh0.C19824a c19824a) {
            this.f82413a = c19824a;
        }

        @Override // com.p051p1.mobile.putong.core.newui.home.base.impl.swipe.C8066o1.a
        /* JADX INFO: renamed from: a */
        public void mo38601a() {
            this.f82413a.f162787a.m135450B2(true);
            clp.this.m110679q(this.f82413a);
        }

        @Override // com.p051p1.mobile.putong.core.newui.home.base.impl.swipe.C8066o1.a
        public void onCancel() {
            this.f82413a.f162787a.m135452C2(false);
            C8066o1.m38717c(this.f82413a.f162788b.m172725m0());
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m110673r(boolean z) {
        f82409d = z;
    }

    /* JADX INFO: renamed from: l */
    public final View m110674l(rfh0.C19824a c19824a) {
        if (NullChecker.m82486a(c19824a.f162789c) && NullChecker.m82486a(c19824a.f162789c.m140256a())) {
            return c19824a.f162789c.m140256a().getCardView();
        }
        return null;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(rfh0.C19824a c19824a) {
        return plp.m172841k(c19824a) ? m110681t(c19824a) : m110678p(c19824a);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m110676n(rfh0.C19824a c19824a) {
        this.f82411b = false;
        this.f82412c = true;
        m110682u(c19824a);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m110677o(rfh0.C19824a c19824a) {
        this.f82411b = false;
        this.f82412c = true;
        m110682u(c19824a);
    }

    /* JADX INFO: renamed from: p */
    public final VSwipeStack.OnCardSwipeResult m110678p(final rfh0.C19824a c19824a) {
        View viewM110674l = m110674l(c19824a);
        VFrame vFrame = c19824a.f162788b.f152917o;
        if (viewM110674l == null || vFrame == null) {
            return VSwipeStack.OnCardSwipeResult.pass;
        }
        this.f82411b = true;
        ndp ndpVar = new ndp(c19824a.f162788b.getAct(), vFrame);
        this.f82410a = ndpVar;
        ndpVar.m162726i(viewM110674l, new Runnable() { // from class: l.alp
            @Override // java.lang.Runnable
            public final void run() {
                this.f72145a.m110676n(c19824a);
            }
        });
        return VSwipeStack.OnCardSwipeResult.stay;
    }

    /* JADX INFO: renamed from: q */
    public final void m110679q(final rfh0.C19824a c19824a) {
        View viewM110674l = m110674l(c19824a);
        VFrame vFrame = c19824a.f162788b.f152917o;
        if (viewM110674l == null || vFrame == null) {
            m110682u(c19824a);
            return;
        }
        this.f82411b = true;
        ndp ndpVar = new ndp(c19824a.f162788b.getAct(), vFrame);
        this.f82410a = ndpVar;
        ndpVar.m162726i(viewM110674l, new Runnable() { // from class: l.blp
            @Override // java.lang.Runnable
            public final void run() {
                this.f77204a.m110677o(c19824a);
            }
        });
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(rfh0.C19824a c19824a) {
        if (this.f82412c) {
            this.f82412c = false;
            return false;
        }
        if (!f82409d) {
            return !this.f82411b && c19824a.f162790d == SwipeDirection.UP && c19824a.f162791e && !IntlCountryCodeController.m29125v() && NullChecker.m82486a(c19824a.f162789c.m140259d()) && sdp.m185487d();
        }
        f82409d = false;
        return false;
    }

    /* JADX INFO: renamed from: t */
    public final VSwipeStack.OnCardSwipeResult m110681t(rfh0.C19824a c19824a) {
        if (c19824a.f162787a.m135456F1()) {
            return m110678p(c19824a);
        }
        c19824a.f162787a.m135452C2(true);
        C8066o1.m38719e(c19824a.f162788b.getAct(), c19824a.f162789c.m140259d().f56859id, new C16302a(c19824a));
        c19824a.f162787a.m135476i1();
        return VSwipeStack.OnCardSwipeResult.stay;
    }

    /* JADX INFO: renamed from: u */
    public final void m110682u(rfh0.C19824a c19824a) {
        if (NullChecker.m82486a(c19824a.f162788b) && NullChecker.m82486a(c19824a.f162788b.m172725m0())) {
            c19824a.f162788b.m172725m0().mo39804A(SwipeDirection.UP);
        }
    }
}
