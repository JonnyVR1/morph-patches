package p009l;

import android.widget.FrameLayout;
import com.p000p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p000p1.mobile.putong.core.newui.home.ViewTreeObserverOnGlobalLayoutListenerC0030b;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l.c4g0;
import l.d30;
import l.e30;
import l.e51;
import l.mkd0;
import l.w9j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u000fJ\u000f\u0010\u0015\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0015\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"Ll/pon;", "", "Lcom/p1/mobile/putong/core/newui/home/NewNewHomeFrag;", "frag", "Ll/e30;", "", "onSwipePromoBannerVisibilityForBottomAd", "<init>", "(Lcom/p1/mobile/putong/core/newui/home/NewNewHomeFrag;Ll/e30;)V", "Landroid/widget/FrameLayout;", "container", "", "i", "(Landroid/widget/FrameLayout;)V", "m", "()V", "l", "suppressed", "n", "(Z)V", "h", "j", "a", "Lcom/p1/mobile/putong/core/newui/home/NewNewHomeFrag;", "b", "Ll/e30;", "c", "Z", "suppressDiscountForExpandedCard", "d", "suppressDiscountForSwipeGuide", "Ll/n1n;", "e", "Ll/n1n;", "delegate", "Ll/c4g0;", "f", "Ll/c4g0;", "modeVisibilitySub", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class pon {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final NewNewHomeFrag frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final e30<Boolean> onSwipePromoBannerVisibilityForBottomAd;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public boolean suppressDiscountForExpandedCard;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public boolean suppressDiscountForSwipeGuide;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final n1n delegate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public c4g0 modeVisibilitySub;

    @JvmOverloads
    public pon(@NotNull NewNewHomeFrag newNewHomeFrag, @Nullable e30<Boolean> e30Var) {
        newNewHomeFrag.getClass();
        this.frag = newNewHomeFrag;
        this.onSwipePromoBannerVisibilityForBottomAd = e30Var;
        n1n n1nVar = new n1n(newNewHomeFrag, p1n.INSTANCE.m20083a(), true, new d30() { // from class: l.lon
            public final void call() {
                pon.m20527b(this.f16285a);
            }
        });
        this.delegate = n1nVar;
        n1nVar.m18753u(new d30() { // from class: l.mon
            public final void call() {
                pon.m20531f(this.f17004a);
            }
        });
        n1nVar.m18752t(new d30() { // from class: l.non
            public final void call() {
                pon.m20526a(this.f17589a);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static void m20526a(pon ponVar) {
        ViewTreeObserverOnGlobalLayoutListenerC0030b viewTreeObserverOnGlobalLayoutListenerC0030b = ponVar.frag.f456C;
        if (viewTreeObserverOnGlobalLayoutListenerC0030b != null) {
            viewTreeObserverOnGlobalLayoutListenerC0030b.m1141J6();
        }
        if (viewTreeObserverOnGlobalLayoutListenerC0030b != null) {
            viewTreeObserverOnGlobalLayoutListenerC0030b.m1130H5();
        }
        e30<Boolean> e30Var = ponVar.onSwipePromoBannerVisibilityForBottomAd;
        if (e30Var != null) {
            e30Var.call(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m20527b(final pon ponVar) {
        e51.H(ponVar.frag.act(), new Runnable() { // from class: l.oon
            @Override // java.lang.Runnable
            public final void run() {
                pon.m20533k(this.f18191a);
            }
        }, 400L);
    }

    /* JADX INFO: renamed from: c */
    public static Boolean m20528c(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: d */
    public static void m20529d(pon ponVar, Boolean bool) {
        ponVar.suppressDiscountForExpandedCard = Intrinsics.d(bool, Boolean.TRUE);
        ponVar.m20534h();
    }

    /* JADX INFO: renamed from: f */
    public static void m20531f(pon ponVar) {
        ViewTreeObserverOnGlobalLayoutListenerC0030b viewTreeObserverOnGlobalLayoutListenerC0030b = ponVar.frag.f456C;
        if (viewTreeObserverOnGlobalLayoutListenerC0030b == null) {
            return;
        }
        e30<Boolean> e30Var = ponVar.onSwipePromoBannerVisibilityForBottomAd;
        if (e30Var != null) {
            e30Var.call(Boolean.TRUE);
        }
        viewTreeObserverOnGlobalLayoutListenerC0030b.m1141J6();
        viewTreeObserverOnGlobalLayoutListenerC0030b.m1130H5();
    }

    /* JADX INFO: renamed from: g */
    public static Boolean m20532g(ExpandedCardStyleHelper.C0115b c0115b) {
        return Boolean.valueOf(c0115b != null && c0115b.m2089e());
    }

    /* JADX INFO: renamed from: k */
    public static final void m20533k(pon ponVar) {
        if (NullChecker.a(ponVar.frag.f455B)) {
            ponVar.frag.f455B.m19386Y4();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m20534h() {
        this.delegate.m18751s(this.suppressDiscountForExpandedCard || this.suppressDiscountForSwipeGuide);
    }

    /* JADX INFO: renamed from: i */
    public final void m20535i(@NotNull FrameLayout container) {
        container.getClass();
        this.delegate.m18740g(container, 0.0f, 7.0f);
        m20536j();
    }

    /* JADX INFO: renamed from: j */
    public final void m20536j() {
        if (this.modeVisibilitySub != null) {
            return;
        }
        c cVarDuringCreated = this.frag.duringCreated(ExpandedCardStyleHelper.m2064o().m2083y());
        final Function1 function1 = new Function1() { // from class: l.ion
            public final Object invoke(Object obj) {
                return pon.m20532g((ExpandedCardStyleHelper.C0115b) obj);
            }
        };
        this.modeVisibilitySub = cVarDuringCreated.map(new w9j() { // from class: l.jon
            public final Object call(Object obj) {
                return pon.m20528c(function1, obj);
            }
        }).startWith(Boolean.valueOf(ExpandedCardStyleHelper.m2064o().m2077s())).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.kon
            public final void call(Object obj) {
                pon.m20529d(this.f15787a, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l */
    public final void m20537l() {
        c4g0 c4g0Var = this.modeVisibilitySub;
        if (c4g0Var != null) {
            c4g0Var.unsubscribe();
        }
        this.modeVisibilitySub = null;
        e30<Boolean> e30Var = this.onSwipePromoBannerVisibilityForBottomAd;
        if (e30Var != null) {
            e30Var.call(Boolean.FALSE);
        }
        ViewTreeObserverOnGlobalLayoutListenerC0030b viewTreeObserverOnGlobalLayoutListenerC0030b = this.frag.f456C;
        if (viewTreeObserverOnGlobalLayoutListenerC0030b != null) {
            viewTreeObserverOnGlobalLayoutListenerC0030b.m1182R1();
        }
        ViewTreeObserverOnGlobalLayoutListenerC0030b viewTreeObserverOnGlobalLayoutListenerC0030b2 = this.frag.f456C;
        if (viewTreeObserverOnGlobalLayoutListenerC0030b2 != null) {
            viewTreeObserverOnGlobalLayoutListenerC0030b2.m1141J6();
        }
        this.delegate.m18743k();
    }

    /* JADX INFO: renamed from: m */
    public final void m20538m() {
        this.delegate.m18747o();
    }

    /* JADX INFO: renamed from: n */
    public final void m20539n(boolean suppressed) {
        if (this.suppressDiscountForSwipeGuide == suppressed) {
            return;
        }
        this.suppressDiscountForSwipeGuide = suppressed;
        m20534h();
    }
}
