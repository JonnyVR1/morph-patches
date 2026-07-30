package com.p046p1.mobile.putong.core.newui.home.base.impl.swipe;

import android.view.View;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import p147v.VFrame;
import p149l.nbp;
import p149l.sbp;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.d0 */
/* JADX INFO: loaded from: classes11.dex */
public class C7881d0 extends AbstractC7871a {

    /* JADX INFO: renamed from: j */
    public static volatile boolean f22064j = false;

    /* JADX INFO: renamed from: g */
    public nbp f22065g;

    /* JADX INFO: renamed from: h */
    public volatile boolean f22066h = false;

    /* JADX INFO: renamed from: i */
    public volatile boolean f22067i = false;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.d0$a */
    public class a implements C7915o1.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C7898j.a f22068a;

        public a(C7898j.a aVar) {
            this.f22068a = aVar;
        }

        @Override // com.p046p1.mobile.putong.core.newui.home.base.impl.swipe.C7915o1.a
        /* JADX INFO: renamed from: a */
        public void mo37598a() {
            this.f22068a.f22094a.m161181X8(true);
            C7881d0.this.m37596x(this.f22068a);
        }

        @Override // com.p046p1.mobile.putong.core.newui.home.base.impl.swipe.C7915o1.a
        public void onCancel() {
            this.f22068a.f22094a.m161186Y8(false);
            C7915o1.m37714c(this.f22068a.f22095b.m37125A2());
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m37588y(boolean z) {
        f22064j = z;
    }

    /* JADX INFO: renamed from: A */
    public final VSwipeStack.OnCardSwipeResult m37589A(C7898j.a aVar) {
        if (aVar.f22094a.m161266q6()) {
            return m37595w(aVar);
        }
        aVar.f22094a.m161186Y8(true);
        C7915o1.m37716e(aVar.f22095b.act(), aVar.f22096c.m141745d().f56011id, new a(aVar));
        aVar.f22094a.m161201c5();
        return VSwipeStack.OnCardSwipeResult.stay;
    }

    /* JADX INFO: renamed from: B */
    public final void m37590B(C7898j.a aVar) {
        if (NullChecker.m81303a(aVar.f22095b) && NullChecker.m81303a(aVar.f22095b.m37125A2())) {
            aVar.f22095b.m37125A2().mo38801A(SwipeDirection.UP);
        }
    }

    /* JADX INFO: renamed from: s */
    public final View m37591s(C7898j.a aVar) {
        if (NullChecker.m81303a(aVar.f22096c) && NullChecker.m81303a(aVar.f22096c.m141742a())) {
            return aVar.f22096c.m141742a().getCardView();
        }
        return null;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(C7898j.a aVar) {
        return C7888f1.m37617v(aVar) ? m37589A(aVar) : m37595w(aVar);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m37593u(C7898j.a aVar) {
        this.f22066h = false;
        this.f22067i = true;
        m37590B(aVar);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m37594v(C7898j.a aVar) {
        this.f22066h = false;
        this.f22067i = true;
        m37590B(aVar);
    }

    /* JADX INFO: renamed from: w */
    public final VSwipeStack.OnCardSwipeResult m37595w(final C7898j.a aVar) {
        View viewM37591s = m37591s(aVar);
        VFrame vFrame = aVar.f22095b.f21920c;
        if (viewM37591s == null || vFrame == null) {
            return VSwipeStack.OnCardSwipeResult.pass;
        }
        this.f22066h = true;
        nbp nbpVar = new nbp(aVar.f22095b.act(), vFrame);
        this.f22065g = nbpVar;
        nbpVar.m158826i(viewM37591s, new Runnable() { // from class: l.ebh0
            @Override // java.lang.Runnable
            public final void run() {
                this.f90327a.m37593u(aVar);
            }
        });
        return VSwipeStack.OnCardSwipeResult.stay;
    }

    /* JADX INFO: renamed from: x */
    public final void m37596x(final C7898j.a aVar) {
        View viewM37591s = m37591s(aVar);
        VFrame vFrame = aVar.f22095b.f21920c;
        if (viewM37591s == null || vFrame == null) {
            m37590B(aVar);
            return;
        }
        this.f22066h = true;
        nbp nbpVar = new nbp(aVar.f22095b.act(), vFrame);
        this.f22065g = nbpVar;
        nbpVar.m158826i(viewM37591s, new Runnable() { // from class: l.fbh0
            @Override // java.lang.Runnable
            public final void run() {
                this.f96715a.m37594v(aVar);
            }
        });
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(C7898j.a aVar) {
        if (this.f22067i) {
            this.f22067i = false;
            return false;
        }
        if (!f22064j) {
            return !this.f22066h && aVar.f22097d == SwipeDirection.UP && aVar.f22098e && !IntlCountryCodeController.m28126v() && NullChecker.m81303a(aVar.f22096c.m141745d()) && sbp.m183244d();
        }
        f22064j = false;
        return false;
    }
}
