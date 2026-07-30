package p153l;

import android.widget.FrameLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p051p1.mobile.putong.core.newui.home.ViewTreeObserverOnGlobalLayoutListenerC8017b;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u000fJ\u000f\u0010\u0015\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0015\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, m88121d2 = {"Ll/pqn;", "", "Lcom/p1/mobile/putong/core/newui/home/NewNewHomeFrag;", "frag", "Ll/y20;", "", "onSwipePromoBannerVisibilityForBottomAd", "<init>", "(Lcom/p1/mobile/putong/core/newui/home/NewNewHomeFrag;Ll/y20;)V", "Landroid/widget/FrameLayout;", "container", "", RXScreenCaptureService.KEY_INDEX, "(Landroid/widget/FrameLayout;)V", "m", "()V", BLiveStormDanmakuGiftResourceType.f45292l, Constants.INAPP_SUPPRESSED, "n", "(Z)V", "h", "j", "a", "Lcom/p1/mobile/putong/core/newui/home/NewNewHomeFrag;", "b", "Ll/y20;", "c", "Z", "suppressDiscountForExpandedCard", Constants.INAPP_DATA_TAG, "suppressDiscountForSwipeGuide", "Ll/n3n;", "e", "Ll/n3n;", "delegate", "Ll/kcg0;", "f", "Ll/kcg0;", "modeVisibilitySub", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class pqn {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final NewNewHomeFrag frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final y20<Boolean> onSwipePromoBannerVisibilityForBottomAd;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public boolean suppressDiscountForExpandedCard;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public boolean suppressDiscountForSwipeGuide;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final n3n delegate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public kcg0 modeVisibilitySub;

    @JvmOverloads
    public pqn(@NotNull NewNewHomeFrag newNewHomeFrag, @Nullable y20<Boolean> y20Var) {
        newNewHomeFrag.getClass();
        this.frag = newNewHomeFrag;
        this.onSwipePromoBannerVisibilityForBottomAd = y20Var;
        n3n n3nVar = new n3n(newNewHomeFrag, p3n.INSTANCE.m170498a(), true, new x20() { // from class: l.lqn
            @Override // p153l.x20
            public final void call() {
                pqn.m173361b(this.f133232a);
            }
        });
        this.delegate = n3nVar;
        n3nVar.m161346u(new x20() { // from class: l.mqn
            @Override // p153l.x20
            public final void call() {
                pqn.m173365f(this.f138115a);
            }
        });
        n3nVar.m161345t(new x20() { // from class: l.nqn
            @Override // p153l.x20
            public final void call() {
                pqn.m173360a(this.f143246a);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static void m173360a(pqn pqnVar) {
        ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b = pqnVar.frag.f22420C;
        if (viewTreeObserverOnGlobalLayoutListenerC8017b != null) {
            viewTreeObserverOnGlobalLayoutListenerC8017b.m38176J6();
        }
        if (viewTreeObserverOnGlobalLayoutListenerC8017b != null) {
            viewTreeObserverOnGlobalLayoutListenerC8017b.m38165H5();
        }
        y20<Boolean> y20Var = pqnVar.onSwipePromoBannerVisibilityForBottomAd;
        if (y20Var != null) {
            y20Var.call(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m173361b(final pqn pqnVar) {
        l51.m152888H(pqnVar.frag.act(), new Runnable() { // from class: l.oqn
            @Override // java.lang.Runnable
            public final void run() {
                pqn.m173367k(this.f148605a);
            }
        }, 400L);
    }

    /* JADX INFO: renamed from: c */
    public static Boolean m173362c(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: d */
    public static void m173363d(pqn pqnVar, Boolean bool) {
        pqnVar.suppressDiscountForExpandedCard = Intrinsics.m88377d(bool, Boolean.TRUE);
        pqnVar.m173368h();
    }

    /* JADX INFO: renamed from: f */
    public static void m173365f(pqn pqnVar) {
        ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b = pqnVar.frag.f22420C;
        if (viewTreeObserverOnGlobalLayoutListenerC8017b == null) {
            return;
        }
        y20<Boolean> y20Var = pqnVar.onSwipePromoBannerVisibilityForBottomAd;
        if (y20Var != null) {
            y20Var.call(Boolean.TRUE);
        }
        viewTreeObserverOnGlobalLayoutListenerC8017b.m38176J6();
        viewTreeObserverOnGlobalLayoutListenerC8017b.m38165H5();
    }

    /* JADX INFO: renamed from: g */
    public static Boolean m173366g(ExpandedCardStyleHelper.C8102b c8102b) {
        return Boolean.valueOf(c8102b != null && c8102b.m39118e());
    }

    /* JADX INFO: renamed from: k */
    public static final void m173367k(pqn pqnVar) {
        if (NullChecker.m82486a(pqnVar.frag.f22419B)) {
            pqnVar.frag.f22419B.m101976Y4();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m173368h() {
        this.delegate.m161344s(this.suppressDiscountForExpandedCard || this.suppressDiscountForSwipeGuide);
    }

    /* JADX INFO: renamed from: i */
    public final void m173369i(@NotNull FrameLayout container) {
        container.getClass();
        this.delegate.m161333g(container, 0.0f, 7.0f);
        m173370j();
    }

    /* JADX INFO: renamed from: j */
    public final void m173370j() {
        if (this.modeVisibilitySub != null) {
            return;
        }
        C22421c c22421cDuringCreated = this.frag.duringCreated(ExpandedCardStyleHelper.m39093o().m39112y());
        final Function1 function1 = new Function1() { // from class: l.iqn
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return pqn.m173366g((ExpandedCardStyleHelper.C8102b) obj);
            }
        };
        this.modeVisibilitySub = c22421cDuringCreated.map(new qcj() { // from class: l.jqn
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return pqn.m173362c(function1, obj);
            }
        }).startWith(Boolean.valueOf(ExpandedCardStyleHelper.m39093o().m39106s())).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.kqn
            @Override // p153l.y20
            public final void call(Object obj) {
                pqn.m173363d(this.f128261a, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l */
    public final void m173371l() {
        kcg0 kcg0Var = this.modeVisibilitySub;
        if (kcg0Var != null) {
            kcg0Var.unsubscribe();
        }
        this.modeVisibilitySub = null;
        y20<Boolean> y20Var = this.onSwipePromoBannerVisibilityForBottomAd;
        if (y20Var != null) {
            y20Var.call(Boolean.FALSE);
        }
        ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b = this.frag.f22420C;
        if (viewTreeObserverOnGlobalLayoutListenerC8017b != null) {
            viewTreeObserverOnGlobalLayoutListenerC8017b.m38217R1();
        }
        ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = this.frag.f22420C;
        if (viewTreeObserverOnGlobalLayoutListenerC8017b2 != null) {
            viewTreeObserverOnGlobalLayoutListenerC8017b2.m38176J6();
        }
        this.delegate.m161336k();
    }

    /* JADX INFO: renamed from: m */
    public final void m173372m() {
        this.delegate.m161340o();
    }

    /* JADX INFO: renamed from: n */
    public final void m173373n(boolean suppressed) {
        if (this.suppressDiscountForSwipeGuide == suppressed) {
            return;
        }
        this.suppressDiscountForSwipeGuide = suppressed;
        m173368h();
    }
}
