package p149l;

import android.view.View;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.newui.home.base.impl.swipe.C7915o1;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import p147v.VFrame;

/* JADX INFO: loaded from: classes11.dex */
public class cjp extends udp {

    /* JADX INFO: renamed from: d */
    public static volatile boolean f81212d = false;

    /* JADX INFO: renamed from: a */
    public nbp f81213a;

    /* JADX INFO: renamed from: b */
    public volatile boolean f81214b = false;

    /* JADX INFO: renamed from: c */
    public volatile boolean f81215c = false;

    /* JADX INFO: renamed from: l.cjp$a */
    public class C16169a implements C7915o1.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ j7h0.C17710a f81216a;

        public C16169a(j7h0.C17710a c17710a) {
            this.f81216a = c17710a;
        }

        @Override // com.p046p1.mobile.putong.core.newui.home.base.impl.swipe.C7915o1.a
        /* JADX INFO: renamed from: a */
        public void mo37598a() {
            this.f81216a.f116599a.m131046B2(true);
            cjp.this.m107229q(this.f81216a);
        }

        @Override // com.p046p1.mobile.putong.core.newui.home.base.impl.swipe.C7915o1.a
        public void onCancel() {
            this.f81216a.f116599a.m131048C2(false);
            C7915o1.m37714c(this.f81216a.f116600b.m169729m0());
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m107223r(boolean z) {
        f81212d = z;
    }

    /* JADX INFO: renamed from: l */
    public final View m107224l(j7h0.C17710a c17710a) {
        if (NullChecker.m81303a(c17710a.f116601c) && NullChecker.m81303a(c17710a.f116601c.m141742a())) {
            return c17710a.f116601c.m141742a().getCardView();
        }
        return null;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(j7h0.C17710a c17710a) {
        return pjp.m169914k(c17710a) ? m107231t(c17710a) : m107228p(c17710a);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m107226n(j7h0.C17710a c17710a) {
        this.f81214b = false;
        this.f81215c = true;
        m107232u(c17710a);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m107227o(j7h0.C17710a c17710a) {
        this.f81214b = false;
        this.f81215c = true;
        m107232u(c17710a);
    }

    /* JADX INFO: renamed from: p */
    public final VSwipeStack.OnCardSwipeResult m107228p(final j7h0.C17710a c17710a) {
        View viewM107224l = m107224l(c17710a);
        VFrame vFrame = c17710a.f116600b.f149650o;
        if (viewM107224l == null || vFrame == null) {
            return VSwipeStack.OnCardSwipeResult.pass;
        }
        this.f81214b = true;
        nbp nbpVar = new nbp(c17710a.f116600b.getAct(), vFrame);
        this.f81213a = nbpVar;
        nbpVar.m158826i(viewM107224l, new Runnable() { // from class: l.ajp
            @Override // java.lang.Runnable
            public final void run() {
                this.f70130a.m107226n(c17710a);
            }
        });
        return VSwipeStack.OnCardSwipeResult.stay;
    }

    /* JADX INFO: renamed from: q */
    public final void m107229q(final j7h0.C17710a c17710a) {
        View viewM107224l = m107224l(c17710a);
        VFrame vFrame = c17710a.f116600b.f149650o;
        if (viewM107224l == null || vFrame == null) {
            m107232u(c17710a);
            return;
        }
        this.f81214b = true;
        nbp nbpVar = new nbp(c17710a.f116600b.getAct(), vFrame);
        this.f81213a = nbpVar;
        nbpVar.m158826i(viewM107224l, new Runnable() { // from class: l.bjp
            @Override // java.lang.Runnable
            public final void run() {
                this.f75928a.m107227o(c17710a);
            }
        });
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(j7h0.C17710a c17710a) {
        if (this.f81215c) {
            this.f81215c = false;
            return false;
        }
        if (!f81212d) {
            return !this.f81214b && c17710a.f116602d == SwipeDirection.UP && c17710a.f116603e && !IntlCountryCodeController.m28126v() && NullChecker.m81303a(c17710a.f116601c.m141745d()) && sbp.m183244d();
        }
        f81212d = false;
        return false;
    }

    /* JADX INFO: renamed from: t */
    public final VSwipeStack.OnCardSwipeResult m107231t(j7h0.C17710a c17710a) {
        if (c17710a.f116599a.m131052F1()) {
            return m107228p(c17710a);
        }
        c17710a.f116599a.m131048C2(true);
        C7915o1.m37716e(c17710a.f116600b.getAct(), c17710a.f116601c.m141745d().f56011id, new C16169a(c17710a));
        c17710a.f116599a.m131072i1();
        return VSwipeStack.OnCardSwipeResult.stay;
    }

    /* JADX INFO: renamed from: u */
    public final void m107232u(j7h0.C17710a c17710a) {
        if (NullChecker.m81303a(c17710a.f116600b) && NullChecker.m81303a(c17710a.f116600b.m169729m0())) {
            c17710a.f116600b.m169729m0().mo38801A(SwipeDirection.UP);
        }
    }
}
