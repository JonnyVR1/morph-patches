package p149l;

import android.animation.TimeInterpolator;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import com.clevertap.android.sdk.inapp.pipsdk.PIPAnimation;
import com.clevertap.android.sdk.inapp.pipsdk.PIPAnimationConfig;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012JE\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ3\u0010!\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b!\u0010\"J+\u0010%\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u000f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b%\u0010&J#\u0010'\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u000f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b'\u0010(¨\u0006)"}, m87232d2 = {"Ll/g160;", "", "<init>", "()V", "Landroid/graphics/PointF;", "anchor", "", "pipW", "pipH", "containerW", "containerH", "Lcom/clevertap/android/sdk/inapp/pipsdk/PIPAnimationConfig$MoveInDirection;", "direction", "m", "(Landroid/graphics/PointF;IIIILcom/clevertap/android/sdk/inapp/pipsdk/PIPAnimationConfig$MoveInDirection;)Landroid/graphics/PointF;", "Landroid/view/View;", OMSTemplateModeType.view, "n", "(Landroid/view/View;II)Landroid/graphics/PointF;", "Lcom/clevertap/android/sdk/inapp/pipsdk/PIPAnimationConfig;", "animationConfig", "containerWidth", "containerHeight", "Lkotlin/Function0;", "", "onComplete", "j", "(Landroid/view/View;Landroid/graphics/PointF;Lcom/clevertap/android/sdk/inapp/pipsdk/PIPAnimationConfig;IILkotlin/jvm/functions/Function0;)V", "k", "(Landroid/view/View;Lcom/clevertap/android/sdk/inapp/pipsdk/PIPAnimationConfig;Lkotlin/jvm/functions/Function0;)V", "", "targetX", "targetY", BLiveStormDanmakuGiftResourceType.f44444l, "(Landroid/view/View;FFLkotlin/jvm/functions/Function0;)V", "overlay", "mediaContainer", RXScreenCaptureService.KEY_INDEX, "(Landroid/view/View;Landroid/view/View;Lkotlin/jvm/functions/Function0;)V", "h", "(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class g160 {

    @NotNull
    public static final g160 INSTANCE = new g160();

    /* JADX INFO: renamed from: l.g160$a */
    @Metadata(m87233k = 3, m87234mv = {2, 0, 0}, m87236xi = 48)
    public /* synthetic */ class C16976a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f100120a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f100121b;

        static {
            int[] iArr = new int[PIPAnimation.values().length];
            try {
                iArr[PIPAnimation.INSTANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PIPAnimation.DISSOLVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PIPAnimation.MOVE_IN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f100120a = iArr;
            int[] iArr2 = new int[PIPAnimationConfig.MoveInDirection.values().length];
            try {
                iArr2[PIPAnimationConfig.MoveInDirection.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[PIPAnimationConfig.MoveInDirection.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[PIPAnimationConfig.MoveInDirection.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[PIPAnimationConfig.MoveInDirection.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            f100121b = iArr2;
        }
    }

    private g160() {
    }

    /* JADX INFO: renamed from: a */
    public static void m124055a(View view, Function0 function0) {
        view.getClass();
        function0.getClass();
        view.setVisibility(8);
        function0.invoke();
    }

    /* JADX INFO: renamed from: b */
    public static void m124056b(View view, Function0 function0) {
        view.getClass();
        function0.getClass();
        view.setVisibility(8);
        function0.invoke();
    }

    /* JADX INFO: renamed from: c */
    public static void m124057c(Function0 function0) {
        function0.getClass();
        function0.invoke();
    }

    /* JADX INFO: renamed from: d */
    public static void m124058d(View view, Function0 function0) {
        view.getClass();
        function0.getClass();
        view.setVisibility(8);
        function0.invoke();
    }

    /* JADX INFO: renamed from: e */
    public static void m124059e(Function0 function0) {
        function0.getClass();
        function0.invoke();
    }

    /* JADX INFO: renamed from: f */
    public static void m124060f(Function0 function0) {
        function0.getClass();
        function0.invoke();
    }

    /* JADX INFO: renamed from: g */
    public static void m124061g(Function0 function0) {
        function0.getClass();
        function0.invoke();
    }

    /* JADX INFO: renamed from: m */
    private final PointF m124062m(PointF anchor, int pipW, int pipH, int containerW, int containerH, PIPAnimationConfig.MoveInDirection direction) {
        if (direction != null) {
            int i = C16976a.f100121b[direction.ordinal()];
            if (i == 1) {
                return new PointF(containerW - anchor.x, 0.0f);
            }
            if (i == 2) {
                return new PointF(-(anchor.x + pipW), 0.0f);
            }
            if (i == 3) {
                return new PointF(0.0f, containerH - anchor.y);
            }
            if (i == 4) {
                return new PointF(0.0f, -(anchor.y + pipH));
            }
            l9r.m149037a();
            return null;
        }
        float f = pipW;
        float f2 = anchor.x + (f / 2.0f);
        float f3 = pipH;
        float f4 = anchor.y + (f3 / 2.0f);
        float f5 = containerH;
        if (f4 < f5 * 0.33f) {
            return new PointF(0.0f, -(anchor.y + f3));
        }
        if (f4 > f5 * 0.66999996f) {
            return new PointF(0.0f, f5 - anchor.y);
        }
        float f6 = containerW;
        if (f2 < 0.33f * f6) {
            return new PointF(-(anchor.x + f), 0.0f);
        }
        return f2 > 0.66999996f * f6 ? new PointF(f6 - anchor.x, 0.0f) : new PointF(0.0f, 0.0f);
    }

    /* JADX INFO: renamed from: n */
    private final PointF m124063n(View view, int containerW, int containerH) {
        float x = view.getX() + (view.getWidth() / 2.0f);
        float y = view.getY() + (view.getHeight() / 2.0f);
        float f = containerH;
        if (y < f * 0.33f) {
            return new PointF(0.0f, -(view.getY() + view.getHeight()));
        }
        if (y > 0.66999996f * f) {
            return new PointF(0.0f, f - view.getY());
        }
        float f2 = containerW;
        return x < 0.33f * f2 ? new PointF(-(view.getX() + view.getWidth()), 0.0f) : new PointF(f2 - view.getX(), 0.0f);
    }

    /* JADX INFO: renamed from: h */
    public final void m124064h(@NotNull final View overlay, @NotNull final Function0<Unit> onComplete) {
        overlay.getClass();
        onComplete.getClass();
        overlay.animate().alpha(0.0f).setDuration(200L).withEndAction(new Runnable() { // from class: l.z060
            @Override // java.lang.Runnable
            public final void run() {
                g160.m124055a(overlay, onComplete);
            }
        }).start();
    }

    /* JADX INFO: renamed from: i */
    public final void m124065i(@NotNull View overlay, @NotNull View mediaContainer, @NotNull final Function0<Unit> onComplete) {
        overlay.getClass();
        mediaContainer.getClass();
        onComplete.getClass();
        overlay.setAlpha(0.0f);
        overlay.setVisibility(0);
        mediaContainer.setScaleX(0.85f);
        mediaContainer.setScaleY(0.85f);
        overlay.animate().alpha(1.0f).setDuration(250L).start();
        mediaContainer.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).setInterpolator(new DecelerateInterpolator()).withEndAction(new Runnable() { // from class: l.f160
            @Override // java.lang.Runnable
            public final void run() {
                g160.m124060f(onComplete);
            }
        }).start();
    }

    /* JADX INFO: renamed from: j */
    public final void m124066j(@NotNull View view, @NotNull PointF anchor, @NotNull PIPAnimationConfig animationConfig, int containerWidth, int containerHeight, @NotNull final Function0<Unit> onComplete) {
        view.getClass();
        anchor.getClass();
        animationConfig.getClass();
        onComplete.getClass();
        long durationMs = animationConfig.getDurationMs();
        TimeInterpolator interpolator = animationConfig.getInterpolator();
        int i = C16976a.f100120a[animationConfig.getType().ordinal()];
        if (i == 1) {
            view.setX(anchor.x);
            view.setY(anchor.y);
            view.setAlpha(1.0f);
            view.setVisibility(0);
            onComplete.invoke();
            return;
        }
        if (i == 2) {
            view.setX(anchor.x);
            view.setY(anchor.y);
            view.setAlpha(0.0f);
            view.setVisibility(0);
            view.animate().alpha(1.0f).setDuration(durationMs).setInterpolator(interpolator).withEndAction(new Runnable() { // from class: l.c160
                @Override // java.lang.Runnable
                public final void run() {
                    g160.m124059e(onComplete);
                }
            }).start();
            return;
        }
        if (i != 3) {
            l9r.m149037a();
            return;
        }
        PointF pointFM124062m = m124062m(anchor, view.getWidth(), view.getHeight(), containerWidth, containerHeight, animationConfig.getMoveInDirection());
        view.setX(anchor.x + pointFM124062m.x);
        view.setY(anchor.y + pointFM124062m.y);
        view.setAlpha(1.0f);
        view.setVisibility(0);
        view.animate().x(anchor.x).y(anchor.y).setDuration(durationMs).setInterpolator(interpolator).withEndAction(new Runnable() { // from class: l.d160
            @Override // java.lang.Runnable
            public final void run() {
                g160.m124057c(onComplete);
            }
        }).start();
    }

    /* JADX INFO: renamed from: k */
    public final void m124067k(@NotNull final View view, @NotNull PIPAnimationConfig animationConfig, @NotNull final Function0<Unit> onComplete) {
        view.getClass();
        animationConfig.getClass();
        onComplete.getClass();
        long durationMs = animationConfig.getDurationMs();
        TimeInterpolator interpolator = animationConfig.getInterpolator();
        int i = C16976a.f100120a[animationConfig.getType().ordinal()];
        if (i == 1) {
            view.setVisibility(8);
            onComplete.invoke();
        } else {
            if (i == 2) {
                view.animate().alpha(0.0f).setDuration(durationMs).setInterpolator(interpolator).withEndAction(new Runnable() { // from class: l.a160
                    @Override // java.lang.Runnable
                    public final void run() {
                        g160.m124058d(view, onComplete);
                    }
                }).start();
                return;
            }
            if (i != 3) {
                l9r.m149037a();
                return;
            }
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            PointF pointFM124063n = m124063n(view, viewGroup != null ? viewGroup.getWidth() : 0, viewGroup != null ? viewGroup.getHeight() : 0);
            view.animate().xBy(pointFM124063n.x).yBy(pointFM124063n.y).setDuration(durationMs).setInterpolator(interpolator).withEndAction(new Runnable() { // from class: l.b160
                @Override // java.lang.Runnable
                public final void run() {
                    g160.m124056b(view, onComplete);
                }
            }).start();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m124068l(@NotNull View view, float targetX, float targetY, @NotNull final Function0<Unit> onComplete) {
        view.getClass();
        onComplete.getClass();
        view.animate().x(targetX).y(targetY).setDuration(250L).setInterpolator(new OvershootInterpolator(1.2f)).withEndAction(new Runnable() { // from class: l.e160
            @Override // java.lang.Runnable
            public final void run() {
                g160.m124061g(onComplete);
            }
        }).start();
    }
}
