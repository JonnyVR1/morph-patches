package p153l;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.core.data.StickStatus;
import com.p051p1.mobile.putong.core.newui.home.views.CardPictureViewOpt;
import com.p051p1.mobile.putong.core.p058ui.PictureView;
import com.p051p1.mobile.putong.core.p058ui.profile.views.VPager_SquaredRefactor;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u0006\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0006\u0018\u0000 q2\u00020\u0001:\u0002@;B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013JW\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\n2\u0006\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u0014H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\nH\u0002¢\u0006\u0004\b%\u0010&J\u0019\u0010(\u001a\u00020\n2\b\u0010'\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b(\u0010\fJ!\u0010*\u001a\u00020\n2\b\u0010'\u001a\u0004\u0018\u00010\b2\u0006\u0010)\u001a\u00020\u0004H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\nH\u0002¢\u0006\u0004\b.\u0010&J\u000f\u0010/\u001a\u00020\nH\u0002¢\u0006\u0004\b/\u0010&J/\u00105\u001a\u0002002\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u0002002\u0006\u00103\u001a\u0002002\u0006\u00104\u001a\u000200H\u0002¢\u0006\u0004\b5\u00106J\u0019\u00108\u001a\u00020\n2\b\u00107\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b8\u0010\fJ\u0019\u00109\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b9\u0010:R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010-R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010\u0013\"\u0004\bC\u0010DR\u0018\u0010'\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010J\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010N\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0018\u0010Q\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010PR\u0018\u0010T\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010SR\u0018\u0010W\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010VR\u0018\u0010X\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010FR\u0016\u0010Z\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010YR\u0018\u0010[\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010FR\u0016\u0010]\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010\\R\u0016\u0010`\u001a\u00020^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010_R\u0016\u0010a\u001a\u00020^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010_R\u0016\u0010b\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010YR\u0016\u0010c\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010YR\u001e\u0010f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010eR\u0016\u0010g\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010AR\u001a\u0010k\u001a\b\u0012\u0004\u0012\u00020i0h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010jR\u001a\u0010o\u001a\b\u0012\u0004\u0012\u00020\b0l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010F¨\u0006r"}, m88121d2 = {"Ll/qmj0;", "", "Landroid/app/Activity;", "activity", "", "openZoomViewSwitch", "<init>", "(Landroid/app/Activity;Z)V", "Landroid/view/View;", "touchTargetView", "", "p", "(Landroid/view/View;)V", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "interceptGesture", "h", "(Landroid/view/MotionEvent;Z)Z", "k", "()Z", "", "animatedFraction", "scaleYStart", "scaleXStart", "", "leftMarginStart", "topMarginStart", "scaleXEnd", "scaleYEnd", "leftMarginEnd", "topMarginEnd", "r", "(FFFIIFFII)V", BLiveGiftBubblePopupTitlePosition.left, StickStatus.top, BLiveStormDanmakuGiftResourceType.f45294s, "(FF)V", "g", "()V", "zoomableView", "n", "zoom", "m", "(Landroid/view/View;Z)V", "o", "(Landroid/app/Activity;)V", "f", BLiveStormDanmakuGiftResourceType.f45292l, "", "x1", "x2", "y1", "y2", RXScreenCaptureService.KEY_INDEX, "(DDDD)D", OMSTemplateModeType.view, "q", "j", "(Landroid/view/MotionEvent;)Landroid/view/View;", "a", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "setActivity", "b", "Z", "getOpenZoomViewSwitch", "setOpenZoomViewSwitch", "(Z)V", "c", "Landroid/view/View;", "Landroid/view/ViewGroup;", Constants.INAPP_DATA_TAG, "Landroid/view/ViewGroup;", "parentOfZoomableView", "Landroid/view/ViewGroup$LayoutParams;", "e", "Landroid/view/ViewGroup$LayoutParams;", "zoomableViewLP", "Landroid/widget/FrameLayout$LayoutParams;", "Landroid/widget/FrameLayout$LayoutParams;", "zoomableViewFrameLP", "Landroid/app/Dialog;", "Landroid/app/Dialog;", OMSTemplateType.dialog, "Landroid/widget/FrameLayout;", "Landroid/widget/FrameLayout;", "zoomDialogContent", "placeholderView", "I", "viewIndex", "darkView", "D", "originalDistance", "", "[I", "twoPointCenter", "originalXY", "pivotX", "pivotY", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "activityWeakReference", "isAnimatingDismiss", "", "Ll/qmj0$b;", "Ljava/util/List;", "zoomListeners", "", Constants.KEY_T, "Ljava/util/Set;", "allChildrenViews", "u", "Companion", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class qmj0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public Activity activity;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean openZoomViewSwitch;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public View zoomableView;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public ViewGroup parentOfZoomableView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public ViewGroup.LayoutParams zoomableViewLP;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public FrameLayout.LayoutParams zoomableViewFrameLP;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public Dialog dialog;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public FrameLayout zoomDialogContent;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public View placeholderView;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public int viewIndex;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public View darkView;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public double originalDistance;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public int pivotX;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public int pivotY;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public WeakReference<Activity> activityWeakReference;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public boolean isAnimatingDismiss;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @Nullable
    public View touchTargetView;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public int[] twoPointCenter = new int[2];

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public int[] originalXY = new int[2];

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public final List<InterfaceC19601b> zoomListeners = new ArrayList();

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public final Set<View> allChildrenViews = new HashSet();

    /* JADX INFO: renamed from: l.qmj0$b */
    @Metadata(m88120d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\b\u0010\u0006¨\u0006\tÀ\u0006\u0003"}, m88121d2 = {"Ll/qmj0$b;", "", "Landroid/view/View;", OMSTemplateModeType.view, "", "c", "(Landroid/view/View;)V", "a", "b", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public interface InterfaceC19601b {
        /* JADX INFO: renamed from: a */
        void m177133a(@Nullable View view);

        /* JADX INFO: renamed from: b */
        void m177134b(@Nullable View view);

        /* JADX INFO: renamed from: c */
        void m177135c(@Nullable View view);
    }

    /* JADX INFO: renamed from: l.qmj0$c */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m88121d2 = {"l/qmj0$c", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationCancel", "(Landroid/animation/Animator;)V", "onAnimationEnd", "a", "()V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C19602c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ float f158369b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ float f158370c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f158371d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f158372e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ float f158373f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ float f158374g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ int f158375h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ int f158376i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ ValueAnimator f158377j;

        public C19602c(float f, float f2, int i, int i2, float f3, float f4, int i3, int i4, ValueAnimator valueAnimator) {
            this.f158369b = f;
            this.f158370c = f2;
            this.f158371d = i;
            this.f158372e = i2;
            this.f158373f = f3;
            this.f158374g = f4;
            this.f158375h = i3;
            this.f158376i = i4;
            this.f158377j = valueAnimator;
        }

        /* JADX INFO: renamed from: a */
        public final void m177136a() {
            if (qmj0.this.zoomableView != null) {
                qmj0.this.m177130r(1.0f, this.f158369b, this.f158370c, this.f158371d, this.f158372e, this.f158373f, this.f158374g, this.f158375h, this.f158376i);
            }
            qmj0.this.m177119g();
            this.f158377j.removeAllListeners();
            this.f158377j.removeAllUpdateListeners();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            animation.getClass();
            super.onAnimationCancel(animation);
            m177136a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            animation.getClass();
            super.onAnimationEnd(animation);
            m177136a();
        }
    }

    public qmj0(@Nullable Activity activity, boolean z) {
        this.activity = activity;
        this.openZoomViewSwitch = z;
        this.activityWeakReference = new WeakReference<>(this.activity);
    }

    /* JADX INFO: renamed from: a */
    public static void m177113a(qmj0 qmj0Var, float f, float f2, float f3, float f4, int i, int i2, float f5, float f6, int i3, int i4, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        float animatedFraction = valueAnimator.getAnimatedFraction();
        if (qmj0Var.zoomableView != null) {
            qmj0Var.m177130r(animatedFraction, f3, f4, i, i2, f5, f6, i3, i4);
        }
        View view = qmj0Var.darkView;
        if (view != null) {
            view.setAlpha(((f - f2) * animatedFraction) + f2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m177114b(qmj0 qmj0Var, View view, MotionEvent motionEvent) {
        motionEvent.getClass();
        return qmj0Var.m177120h(motionEvent, false);
    }

    /* JADX INFO: renamed from: f */
    public final void m177118f() {
        Dialog dialog = this.dialog;
        if (dialog != null) {
            dialog.dismiss();
        }
        this.dialog = null;
        this.zoomDialogContent = null;
        this.darkView = null;
        this.touchTargetView = null;
        m177124l();
    }

    /* JADX INFO: renamed from: g */
    public final void m177119g() {
        m177125m(this.zoomableView, false);
        if (this.zoomableView != null) {
            FrameLayout frameLayout = this.zoomDialogContent;
            if (frameLayout != null) {
                frameLayout.setVisibility(4);
            }
            View view = this.zoomableView;
            if (view != null) {
                view.setVisibility(0);
            }
            View view2 = this.zoomableView;
            ViewParent parent = view2 != null ? view2.getParent() : null;
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(this.zoomableView);
                View view3 = this.placeholderView;
                if (view3 != null) {
                    view3.setBackground(null);
                }
                ViewGroup viewGroup2 = this.parentOfZoomableView;
                if (viewGroup2 != null) {
                    viewGroup2.removeView(this.placeholderView);
                }
                ViewGroup viewGroup3 = this.parentOfZoomableView;
                if (viewGroup3 != null) {
                    viewGroup3.addView(this.zoomableView, this.viewIndex, this.zoomableViewLP);
                }
            }
            m177118f();
        } else {
            m177118f();
        }
        this.isAnimatingDismiss = false;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m177120h(@NotNull MotionEvent event, boolean interceptGesture) {
        Activity ownerActivity;
        event.getClass();
        try {
            Activity activity = this.activityWeakReference.get();
            if (activity != null && this.openZoomViewSwitch && !interceptGesture) {
                if (event.getActionMasked() == 3 && this.zoomableView != null) {
                    return m177123k();
                }
                int pointerCount = event.getPointerCount();
                View view = this.zoomableView;
                if (pointerCount == 2) {
                    if (view != null) {
                        MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
                        event.getPointerCoords(0, pointerCoords);
                        MotionEvent.PointerCoords pointerCoords2 = new MotionEvent.PointerCoords();
                        event.getPointerCoords(1, pointerCoords2);
                        float f = pointerCoords2.x;
                        float f2 = pointerCoords.x;
                        float f3 = pointerCoords2.y;
                        float f4 = pointerCoords.y;
                        int[] iArr = {(int) ((f + f2) / 2.0f), (int) ((f3 + f4) / 2.0f)};
                        int iM177121i = (int) m177121i(f2, f, f4, f3);
                        double d = this.originalDistance;
                        double d2 = d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? (((double) iM177121i) - d) / d : 0.0d;
                        float f5 = (Math.abs(d2) > Double.MAX_VALUE || d2 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) ? 1.0f : (float) (1.0d + d2);
                        View view2 = this.zoomableView;
                        if (view2 != null) {
                            view2.setPivotX(this.pivotX);
                        }
                        View view3 = this.zoomableView;
                        if (view3 != null) {
                            view3.setPivotY(this.pivotY);
                        }
                        View view4 = this.zoomableView;
                        if (view4 != null) {
                            view4.setScaleX(f5);
                        }
                        View view5 = this.zoomableView;
                        if (view5 != null) {
                            view5.setScaleY(f5);
                        }
                        int i = iArr[0];
                        int[] iArr2 = this.twoPointCenter;
                        int i2 = i - iArr2[0];
                        int[] iArr3 = this.originalXY;
                        m177131s(i2 + iArr3[0], (iArr[1] - iArr2[1]) + iArr3[1]);
                        View view6 = this.darkView;
                        if (view6 != null) {
                            view6.setAlpha(Math.abs(d2) <= Double.MAX_VALUE ? (float) d2 : 0.0f);
                        }
                        return true;
                    }
                    m177129q(activity.findViewById(R.id.content));
                    View viewM177122j = m177122j(event);
                    if (viewM177122j != null) {
                        this.zoomableView = viewM177122j;
                        m177126n(viewM177122j);
                        viewM177122j.getLocationInWindow(this.originalXY);
                        FrameLayout frameLayout = new FrameLayout(viewM177122j.getContext());
                        this.zoomDialogContent = frameLayout;
                        frameLayout.setOnTouchListener(new View.OnTouchListener() { // from class: l.omj0
                            @Override // android.view.View.OnTouchListener
                            public final boolean onTouch(View view7, MotionEvent motionEvent) {
                                return qmj0.m177114b(this.f147949a, view7, motionEvent);
                            }
                        });
                        View view7 = new View(viewM177122j.getContext());
                        this.darkView = view7;
                        view7.setBackgroundColor(0);
                        View view8 = this.darkView;
                        if (view8 != null) {
                            view8.setAlpha(0.0f);
                        }
                        frameLayout.addView(this.darkView, new FrameLayout.LayoutParams(-1, -1));
                        View view9 = this.zoomableView;
                        ViewParent parent = view9 != null ? view9.getParent() : null;
                        parent.getClass();
                        ViewGroup viewGroup = (ViewGroup) parent;
                        this.parentOfZoomableView = viewGroup;
                        this.viewIndex = viewGroup != null ? viewGroup.indexOfChild(this.zoomableView) : 0;
                        View view10 = this.zoomableView;
                        this.zoomableViewLP = view10 != null ? view10.getLayoutParams() : null;
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(viewM177122j.getWidth(), viewM177122j.getHeight());
                        this.zoomableViewFrameLP = layoutParams;
                        layoutParams.leftMargin = this.originalXY[0];
                        layoutParams.topMargin = this.originalXY[1];
                        this.placeholderView = new View(activity);
                        View view11 = this.zoomableView;
                        if (view11 != null) {
                            view11.setDrawingCacheEnabled(true);
                        }
                        View view12 = this.zoomableView;
                        Bitmap drawingCache = view12 != null ? view12.getDrawingCache() : null;
                        if (drawingCache != null) {
                            BitmapDrawable bitmapDrawable = new BitmapDrawable(activity.getResources(), Bitmap.createBitmap(drawingCache));
                            View view13 = this.placeholderView;
                            if (view13 != null) {
                                view13.setBackground(bitmapDrawable);
                            }
                        }
                        ViewGroup viewGroup2 = this.parentOfZoomableView;
                        if (viewGroup2 != null) {
                            viewGroup2.addView(this.placeholderView, this.zoomableViewLP);
                        }
                        ViewGroup viewGroup3 = this.parentOfZoomableView;
                        if (viewGroup3 != null) {
                            viewGroup3.removeView(this.zoomableView);
                        }
                        frameLayout.addView(this.zoomableView, this.zoomableViewFrameLP);
                        Dialog dialog = new Dialog(activity, agc0.f71139y);
                        this.dialog = dialog;
                        dialog.addContentView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
                        Dialog dialog2 = this.dialog;
                        if (dialog2 != null) {
                            dialog2.show();
                        }
                        Dialog dialog3 = this.dialog;
                        if (dialog3 != null && (ownerActivity = dialog3.getOwnerActivity()) != null) {
                            m177127o(ownerActivity);
                        }
                        View view14 = this.zoomableView;
                        if (view14 != null) {
                            view14.setDrawingCacheEnabled(false);
                        }
                        MotionEvent.PointerCoords pointerCoords3 = new MotionEvent.PointerCoords();
                        event.getPointerCoords(0, pointerCoords3);
                        MotionEvent.PointerCoords pointerCoords4 = new MotionEvent.PointerCoords();
                        event.getPointerCoords(1, pointerCoords4);
                        this.originalDistance = m177121i(pointerCoords3.x, pointerCoords4.x, pointerCoords3.y, pointerCoords4.y);
                        this.twoPointCenter = new int[]{(int) ((pointerCoords4.x + pointerCoords3.x) / 2.0f), (int) ((pointerCoords4.y + pointerCoords3.y) / 2.0f)};
                        this.pivotX = ((int) event.getRawX()) - this.originalXY[0];
                        this.pivotY = ((int) event.getRawY()) - this.originalXY[1];
                        m177125m(this.zoomableView, true);
                        return true;
                    }
                } else if (view != null && !this.isAnimatingDismiss) {
                    return m177123k();
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final double m177121i(double x1, double x2, double y1, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2.0d) + Math.pow(y2 - y1, 2.0d));
    }

    /* JADX INFO: renamed from: j */
    public final View m177122j(MotionEvent event) {
        try {
            View view = this.touchTargetView;
            if (view instanceof VPager_SquaredRefactor) {
                view.getClass();
                VPager_SquaredRefactor vPager_SquaredRefactor = (VPager_SquaredRefactor) view;
                View viewFindViewWithTag = vPager_SquaredRefactor.findViewWithTag(Integer.valueOf(vPager_SquaredRefactor.getCurrentItem()));
                if (!(viewFindViewWithTag instanceof PictureView) || (((PictureView) viewFindViewWithTag).f28888G instanceof Video)) {
                    return null;
                }
            } else {
                CardPictureViewOpt cardPictureViewOpt = view instanceof CardPictureViewOpt ? (CardPictureViewOpt) view : null;
                if ((cardPictureViewOpt != null ? cardPictureViewOpt.f24496j : null) instanceof Video) {
                    return null;
                }
            }
        } catch (Exception unused) {
        }
        MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
        event.getPointerCoords(0, pointerCoords);
        MotionEvent.PointerCoords pointerCoords2 = new MotionEvent.PointerCoords();
        event.getPointerCoords(1, pointerCoords2);
        for (View view2 : this.allChildrenViews) {
            if (view2 == this.touchTargetView && view2.getTag(adc0.f70074Pe) == null) {
                Rect rect = new Rect();
                int[] iArr = new int[2];
                view2.getLocationOnScreen(iArr);
                int i = iArr[0];
                rect.left = i;
                rect.top = iArr[1];
                rect.right = i + view2.getWidth();
                rect.bottom = rect.top + view2.getHeight();
                if (rect.contains((int) pointerCoords.x, (int) pointerCoords.y) && rect.contains((int) pointerCoords2.x, (int) pointerCoords2.y) && view2.getTag(adc0.f70177Vf) != null) {
                    return view2;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m177123k() {
        View view = this.zoomableView;
        if (view == null || this.isAnimatingDismiss) {
            return false;
        }
        this.isAnimatingDismiss = true;
        final float scaleY = view != null ? view.getScaleY() : 0.0f;
        View view2 = this.zoomableView;
        final float scaleX = view2 != null ? view2.getScaleX() : 0.0f;
        FrameLayout.LayoutParams layoutParams = this.zoomableViewFrameLP;
        final int i = layoutParams != null ? layoutParams.leftMargin : 0;
        final int i2 = layoutParams != null ? layoutParams.topMargin : 0;
        int[] iArr = this.originalXY;
        final int i3 = iArr[0];
        final int i4 = iArr[1];
        View view3 = this.darkView;
        final float alpha = view3 != null ? view3.getAlpha() : 0.0f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(100L);
        final float f = 0.0f;
        final float f2 = 1.0f;
        final float f3 = 1.0f;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.pmj0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                qmj0.m177113a(this.f153187a, f, alpha, scaleY, scaleX, i, i2, f2, f3, i3, i4, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new C19602c(scaleY, scaleX, i, i2, 1.0f, 1.0f, i3, i4, valueAnimatorOfFloat));
        valueAnimatorOfFloat.start();
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final void m177124l() {
        View view = this.zoomableView;
        if (view != null) {
            if (view != null) {
                view.invalidate();
            }
            this.zoomableView = null;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m177125m(View zoomableView, boolean zoom) {
        for (InterfaceC19601b interfaceC19601b : this.zoomListeners) {
            if (zoom) {
                interfaceC19601b.m177133a(zoomableView);
            } else {
                interfaceC19601b.m177134b(zoomableView);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m177126n(View zoomableView) {
        Iterator<InterfaceC19601b> it = this.zoomListeners.iterator();
        while (it.hasNext()) {
            it.next().m177135c(zoomableView);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m177127o(Activity activity) {
        try {
            activity.getWindow().addFlags(Integer.MIN_VALUE);
            activity.getWindow().setStatusBarColor(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m177128p(@Nullable View touchTargetView) {
        INSTANCE.m177132a(touchTargetView);
        this.touchTargetView = touchTargetView;
    }

    /* JADX INFO: renamed from: q */
    public final void m177129q(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof ViewGroup) {
                    if (((ViewGroup) childAt).getTag(adc0.f70177Vf) != null) {
                        this.allChildrenViews.add(childAt);
                    }
                    m177129q(childAt);
                } else if (childAt.getTag(adc0.f70177Vf) != null) {
                    this.allChildrenViews.add(childAt);
                }
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m177130r(float animatedFraction, float scaleYStart, float scaleXStart, int leftMarginStart, int topMarginStart, float scaleXEnd, float scaleYEnd, int leftMarginEnd, int topMarginEnd) {
        View view = this.zoomableView;
        if (view != null) {
            view.setScaleX(((scaleXEnd - scaleXStart) * animatedFraction) + scaleXStart);
        }
        View view2 = this.zoomableView;
        if (view2 != null) {
            view2.setScaleY(((scaleYEnd - scaleYStart) * animatedFraction) + scaleYStart);
        }
        m177131s(((leftMarginEnd - leftMarginStart) * animatedFraction) + leftMarginStart, ((topMarginEnd - topMarginStart) * animatedFraction) + topMarginStart);
    }

    /* JADX INFO: renamed from: s */
    public final void m177131s(float left, float top) {
        FrameLayout.LayoutParams layoutParams;
        View view = this.zoomableView;
        if (view == null || (layoutParams = this.zoomableViewFrameLP) == null) {
            return;
        }
        if (layoutParams != null) {
            layoutParams.leftMargin = (int) left;
        }
        if (layoutParams != null) {
            layoutParams.topMargin = (int) top;
        }
        if (view != null) {
            view.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: l.qmj0$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Ll/qmj0$a;", "", "<init>", "()V", "Landroid/view/View;", OMSTemplateModeType.view, "", "a", "(Landroid/view/View;)V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m177132a(@Nullable View view) {
            if (view != null) {
                view.setTag(adc0.f70177Vf, new Object());
            }
        }

        public Companion() {
        }
    }
}
