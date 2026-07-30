package p153l;

import android.text.TextUtils;
import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.data.CounterSuperlikeAndUndoLimit;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import p151v.VFrame;

/* JADX INFO: loaded from: classes11.dex */
public class olp extends ufp {

    /* JADX INFO: renamed from: a */
    public static volatile boolean f147859a = false;

    /* JADX INFO: renamed from: u */
    public static void m168147u(boolean z) {
        f147859a = z;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(final rfh0.C19824a c19824a) {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        String strM101829p5 = b240.m101829p5();
        if (TextUtils.isEmpty(strM101829p5)) {
            strM101829p5 = "p_intl_tribe_swipe_view,e_superlikeButton,click";
        }
        String str = strM101829p5;
        if (qj90.m176831c(userM116600p9, PurchaseType.TYPE_SUPERLIKE_PKG) || d79.m114669b0()) {
            C8927c.m54577G1(c19824a.f162788b.getAct(), str, 1, new a30() { // from class: l.klp
                @Override // p153l.a30
                /* JADX INFO: renamed from: a */
                public final void mo37058a(Object obj, Object obj2, Object obj3) {
                    this.f127401a.m168151p(c19824a, (PurchaseType) obj, (Act) obj2, (String) obj3);
                }
            });
            c19824a.f162787a.m135496x2(c19824a.f162792f, "failExhaustSuperlike");
        } else {
            C8927c.m54595M1(c19824a.f162788b.getAct(), str, Privilege.vip_super_like, null, null, false, c19824a.f162789c.m140259d());
            c19824a.f162787a.m135496x2(c19824a.f162792f, "failLessVipSuperLike");
        }
        return VSwipeStack.OnCardSwipeResult.back;
    }

    /* JADX INFO: renamed from: n */
    public final void m168149n(final rfh0.C19824a c19824a) {
        if (NullChecker.m82486a(c19824a.f162788b)) {
            l51.m152886F(c19824a.f162788b.getAct(), new Runnable() { // from class: l.llp
                @Override // java.lang.Runnable
                public final void run() {
                    this.f132582a.m168152q(c19824a);
                }
            });
        }
    }

    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final void m168152q(final rfh0.C19824a c19824a) {
        if (IntlCountryCodeController.m29125v()) {
            m168154s(c19824a);
            return;
        }
        if (NullChecker.m82486a(c19824a.f162788b)) {
            if (!c19824a.f162788b.m172715e0().isAdded()) {
                l51.m152888H(c19824a.f162788b.getAct(), new Runnable() { // from class: l.mlp
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f137431a.m168153r(c19824a);
                    }
                }, 300L);
                return;
            }
            View cardView = (NullChecker.m82486a(c19824a.f162789c) && NullChecker.m82486a(c19824a.f162789c.m140256a())) ? c19824a.f162789c.m140256a().getCardView() : null;
            pkp pkpVar = c19824a.f162788b;
            VFrame vFrame = pkpVar.f152917o;
            if (cardView == null || vFrame == null) {
                m168154s(c19824a);
            } else {
                new ndp(pkpVar.getAct(), vFrame).m162726i(cardView, new Runnable() { // from class: l.nlp
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f142576a.m168154s(c19824a);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m168151p(rfh0.C19824a c19824a, PurchaseType purchaseType, Act act, String str) {
        m168149n(c19824a);
    }

    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final void m168153r(rfh0.C19824a c19824a) {
        if (NullChecker.m82486a(c19824a.f162788b) && c19824a.f162788b.m172715e0().isAdded()) {
            m168152q(c19824a);
        } else {
            m168154s(c19824a);
        }
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(rfh0.C19824a c19824a) {
        if (f147859a) {
            f147859a = false;
            return false;
        }
        CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit = CoreModule.f18264c.m32487o3().superLikeLimit;
        boolean z = c19824a.f162790d == SwipeDirection.UP;
        return !(d79.m114685j0() && z && c19824a.f162787a.m135451C1(c19824a.f162789c.m140259d().f56859id)) && z && a5i0.m96178w0(counterSuperlikeAndUndoLimit.remainToday()) == 0;
    }

    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final void m168154s(rfh0.C19824a c19824a) {
        if (NullChecker.m82486a(c19824a.f162788b) && c19824a.f162788b.m172715e0().isAdded()) {
            clp.m110673r(true);
            m168147u(true);
            c19824a.f162788b.m172725m0().mo39804A(SwipeDirection.UP);
        }
    }
}
