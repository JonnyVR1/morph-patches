package p149l;

import android.text.TextUtils;
import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.data.CounterSuperlikeAndUndoLimit;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import p147v.VFrame;

/* JADX INFO: loaded from: classes11.dex */
public class ojp extends udp {

    /* JADX INFO: renamed from: a */
    public static volatile boolean f144331a = false;

    /* JADX INFO: renamed from: u */
    public static void m164738u(boolean z) {
        f144331a = z;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(final j7h0.C17710a c17710a) {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        String strM161035p5 = nt30.m161035p5();
        if (TextUtils.isEmpty(strM161035p5)) {
            strM161035p5 = "p_intl_tribe_swipe_view,e_superlikeButton,click";
        }
        String str = strM161035p5;
        if (mb90.m153867c(userM169527p9, PurchaseType.TYPE_SUPERLIKE_PKG) || u59.m191818a0()) {
            C8764c.m53394G1(c17710a.f116600b.getAct(), str, 1, new g30() { // from class: l.kjp
                @Override // p149l.g30
                /* JADX INFO: renamed from: a */
                public final void mo36055a(Object obj, Object obj2, Object obj3) {
                    this.f123492a.m164742p(c17710a, (PurchaseType) obj, (Act) obj2, (String) obj3);
                }
            });
            c17710a.f116599a.m131092x2(c17710a.f116604f, "failExhaustSuperlike");
        } else {
            C8764c.m53412M1(c17710a.f116600b.getAct(), str, Privilege.vip_super_like, null, null, false, c17710a.f116601c.m141745d());
            c17710a.f116599a.m131092x2(c17710a.f116604f, "failLessVipSuperLike");
        }
        return VSwipeStack.OnCardSwipeResult.back;
    }

    /* JADX INFO: renamed from: n */
    public final void m164740n(final j7h0.C17710a c17710a) {
        if (NullChecker.m81303a(c17710a.f116600b)) {
            e51.m114741F(c17710a.f116600b.getAct(), new Runnable() { // from class: l.ljp
                @Override // java.lang.Runnable
                public final void run() {
                    this.f128376a.m164743q(c17710a);
                }
            });
        }
    }

    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final void m164743q(final j7h0.C17710a c17710a) {
        if (IntlCountryCodeController.m28126v()) {
            m164745s(c17710a);
            return;
        }
        if (NullChecker.m81303a(c17710a.f116600b)) {
            if (!c17710a.f116600b.m169719e0().isAdded()) {
                e51.m114743H(c17710a.f116600b.getAct(), new Runnable() { // from class: l.mjp
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f134224a.m164744r(c17710a);
                    }
                }, 300L);
                return;
            }
            View cardView = (NullChecker.m81303a(c17710a.f116601c) && NullChecker.m81303a(c17710a.f116601c.m141742a())) ? c17710a.f116601c.m141742a().getCardView() : null;
            pip pipVar = c17710a.f116600b;
            VFrame vFrame = pipVar.f149650o;
            if (cardView == null || vFrame == null) {
                m164745s(c17710a);
            } else {
                new nbp(pipVar.getAct(), vFrame).m158826i(cardView, new Runnable() { // from class: l.njp
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f139303a.m164745s(c17710a);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m164742p(j7h0.C17710a c17710a, PurchaseType purchaseType, Act act, String str) {
        m164740n(c17710a);
    }

    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final void m164744r(j7h0.C17710a c17710a) {
        if (NullChecker.m81303a(c17710a.f116600b) && c17710a.f116600b.m169719e0().isAdded()) {
            m164743q(c17710a);
        } else {
            m164745s(c17710a);
        }
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(j7h0.C17710a c17710a) {
        if (f144331a) {
            f144331a = false;
            return false;
        }
        CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit = CoreModule.f17545c.m31484o3().superLikeLimit;
        boolean z = c17710a.f116602d == SwipeDirection.UP;
        return !(u59.m191827f0() && z && c17710a.f116599a.m131047C1(c17710a.f116601c.m141745d().f56011id)) && z && swh0.m186273w0(counterSuperlikeAndUndoLimit.remainToday()) == 0;
    }

    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final void m164745s(j7h0.C17710a c17710a) {
        if (NullChecker.m81303a(c17710a.f116600b) && c17710a.f116600b.m169719e0().isAdded()) {
            cjp.m107223r(true);
            m164738u(true);
            c17710a.f116600b.m169729m0().mo38801A(SwipeDirection.UP);
        }
    }
}
