package p149l;

import android.widget.FrameLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p046p1.mobile.putong.core.newui.home.ViewTreeObserverOnGlobalLayoutListenerC7866b;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u000fJ\u000f\u0010\u0015\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0015\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, m87232d2 = {"Ll/pon;", "", "Lcom/p1/mobile/putong/core/newui/home/NewNewHomeFrag;", "frag", "Ll/e30;", "", "onSwipePromoBannerVisibilityForBottomAd", "<init>", "(Lcom/p1/mobile/putong/core/newui/home/NewNewHomeFrag;Ll/e30;)V", "Landroid/widget/FrameLayout;", "container", "", RXScreenCaptureService.KEY_INDEX, "(Landroid/widget/FrameLayout;)V", "m", "()V", BLiveStormDanmakuGiftResourceType.f44444l, Constants.INAPP_SUPPRESSED, "n", "(Z)V", "h", "j", "a", "Lcom/p1/mobile/putong/core/newui/home/NewNewHomeFrag;", "b", "Ll/e30;", "c", "Z", "suppressDiscountForExpandedCard", Constants.INAPP_DATA_TAG, "suppressDiscountForSwipeGuide", "Ll/n1n;", "e", "Ll/n1n;", "delegate", "Ll/c4g0;", "f", "Ll/c4g0;", "modeVisibilitySub", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
        n1n n1nVar = new n1n(newNewHomeFrag, p1n.INSTANCE.m167111a(), true, new d30() { // from class: l.lon
            @Override // p149l.d30
            public final void call() {
                pon.m170619b(this.f129122a);
            }
        });
        this.delegate = n1nVar;
        n1nVar.m157455u(new d30() { // from class: l.mon
            @Override // p149l.d30
            public final void call() {
                pon.m170623f(this.f134924a);
            }
        });
        n1nVar.m157454t(new d30() { // from class: l.non
            @Override // p149l.d30
            public final void call() {
                pon.m170618a(this.f139854a);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static void m170618a(pon ponVar) {
        ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b = ponVar.frag.f21678C;
        if (viewTreeObserverOnGlobalLayoutListenerC7866b != null) {
            viewTreeObserverOnGlobalLayoutListenerC7866b.m37173J6();
        }
        if (viewTreeObserverOnGlobalLayoutListenerC7866b != null) {
            viewTreeObserverOnGlobalLayoutListenerC7866b.m37162H5();
        }
        e30<Boolean> e30Var = ponVar.onSwipePromoBannerVisibilityForBottomAd;
        if (e30Var != null) {
            e30Var.call(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m170619b(final pon ponVar) {
        e51.m114743H(ponVar.frag.act(), new Runnable() { // from class: l.oon
            @Override // java.lang.Runnable
            public final void run() {
                pon.m170625k(this.f144895a);
            }
        }, 400L);
    }

    /* JADX INFO: renamed from: c */
    public static Boolean m170620c(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: d */
    public static void m170621d(pon ponVar, Boolean bool) {
        ponVar.suppressDiscountForExpandedCard = Intrinsics.m87488d(bool, Boolean.TRUE);
        ponVar.m170626h();
    }

    /* JADX INFO: renamed from: f */
    public static void m170623f(pon ponVar) {
        ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b = ponVar.frag.f21678C;
        if (viewTreeObserverOnGlobalLayoutListenerC7866b == null) {
            return;
        }
        e30<Boolean> e30Var = ponVar.onSwipePromoBannerVisibilityForBottomAd;
        if (e30Var != null) {
            e30Var.call(Boolean.TRUE);
        }
        viewTreeObserverOnGlobalLayoutListenerC7866b.m37173J6();
        viewTreeObserverOnGlobalLayoutListenerC7866b.m37162H5();
    }

    /* JADX INFO: renamed from: g */
    public static Boolean m170624g(ExpandedCardStyleHelper.C7951b c7951b) {
        return Boolean.valueOf(c7951b != null && c7951b.m38115e());
    }

    /* JADX INFO: renamed from: k */
    public static final void m170625k(pon ponVar) {
        if (NullChecker.m81303a(ponVar.frag.f21677B)) {
            ponVar.frag.f21677B.m161182Y4();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m170626h() {
        this.delegate.m157453s(this.suppressDiscountForExpandedCard || this.suppressDiscountForSwipeGuide);
    }

    /* JADX INFO: renamed from: i */
    public final void m170627i(@NotNull FrameLayout container) {
        container.getClass();
        this.delegate.m157442g(container, 0.0f, 7.0f);
        m170628j();
    }

    /* JADX INFO: renamed from: j */
    public final void m170628j() {
        if (this.modeVisibilitySub != null) {
            return;
        }
        C22306c c22306cDuringCreated = this.frag.duringCreated(ExpandedCardStyleHelper.m38090o().m38109y());
        final Function1 function1 = new Function1() { // from class: l.ion
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return pon.m170624g((ExpandedCardStyleHelper.C7951b) obj);
            }
        };
        this.modeVisibilitySub = c22306cDuringCreated.map(new w9j() { // from class: l.jon
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return pon.m170620c(function1, obj);
            }
        }).startWith(Boolean.valueOf(ExpandedCardStyleHelper.m38090o().m38103s())).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.kon
            @Override // p149l.e30
            public final void call(Object obj) {
                pon.m170621d(this.f124051a, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l */
    public final void m170629l() {
        c4g0 c4g0Var = this.modeVisibilitySub;
        if (c4g0Var != null) {
            c4g0Var.unsubscribe();
        }
        this.modeVisibilitySub = null;
        e30<Boolean> e30Var = this.onSwipePromoBannerVisibilityForBottomAd;
        if (e30Var != null) {
            e30Var.call(Boolean.FALSE);
        }
        ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b = this.frag.f21678C;
        if (viewTreeObserverOnGlobalLayoutListenerC7866b != null) {
            viewTreeObserverOnGlobalLayoutListenerC7866b.m37214R1();
        }
        ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = this.frag.f21678C;
        if (viewTreeObserverOnGlobalLayoutListenerC7866b2 != null) {
            viewTreeObserverOnGlobalLayoutListenerC7866b2.m37173J6();
        }
        this.delegate.m157445k();
    }

    /* JADX INFO: renamed from: m */
    public final void m170630m() {
        this.delegate.m157449o();
    }

    /* JADX INFO: renamed from: n */
    public final void m170631n(boolean suppressed) {
        if (this.suppressDiscountForSwipeGuide == suppressed) {
            return;
        }
        this.suppressDiscountForSwipeGuide = suppressed;
        m170626h();
    }
}
