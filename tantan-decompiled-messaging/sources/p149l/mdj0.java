package p149l;

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
import com.p046p1.mobile.putong.core.data.StickStatus;
import com.p046p1.mobile.putong.core.newui.home.views.CardPictureViewOpt;
import com.p046p1.mobile.putong.core.p053ui.PictureView;
import com.p046p1.mobile.putong.core.p053ui.profile.views.VPager_SquaredRefactor;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.OMSTemplateType;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
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
@Metadata(m87231d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u0006\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0006\u0018\u0000 q2\u00020\u0001:\u0002@;B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013JW\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\n2\u0006\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u0014H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\nH\u0002¢\u0006\u0004\b%\u0010&J\u0019\u0010(\u001a\u00020\n2\b\u0010'\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b(\u0010\fJ!\u0010*\u001a\u00020\n2\b\u0010'\u001a\u0004\u0018\u00010\b2\u0006\u0010)\u001a\u00020\u0004H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\nH\u0002¢\u0006\u0004\b.\u0010&J\u000f\u0010/\u001a\u00020\nH\u0002¢\u0006\u0004\b/\u0010&J/\u00105\u001a\u0002002\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u0002002\u0006\u00103\u001a\u0002002\u0006\u00104\u001a\u000200H\u0002¢\u0006\u0004\b5\u00106J\u0019\u00108\u001a\u00020\n2\b\u00107\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b8\u0010\fJ\u0019\u00109\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b9\u0010:R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010-R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010\u0013\"\u0004\bC\u0010DR\u0018\u0010'\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010J\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010N\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0018\u0010Q\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010PR\u0018\u0010T\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010SR\u0018\u0010W\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010VR\u0018\u0010X\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010FR\u0016\u0010Z\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010YR\u0018\u0010[\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010FR\u0016\u0010]\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010\\R\u0016\u0010`\u001a\u00020^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010_R\u0016\u0010a\u001a\u00020^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010_R\u0016\u0010b\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010YR\u0016\u0010c\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010YR\u001e\u0010f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010eR\u0016\u0010g\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010AR\u001a\u0010k\u001a\b\u0012\u0004\u0012\u00020i0h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010jR\u001a\u0010o\u001a\b\u0012\u0004\u0012\u00020\b0l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010F¨\u0006r"}, m87232d2 = {"Ll/mdj0;", "", "Landroid/app/Activity;", "activity", "", "openZoomViewSwitch", "<init>", "(Landroid/app/Activity;Z)V", "Landroid/view/View;", "touchTargetView", "", "p", "(Landroid/view/View;)V", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "interceptGesture", "h", "(Landroid/view/MotionEvent;Z)Z", "k", "()Z", "", "animatedFraction", "scaleYStart", "scaleXStart", "", "leftMarginStart", "topMarginStart", "scaleXEnd", "scaleYEnd", "leftMarginEnd", "topMarginEnd", "r", "(FFFIIFFII)V", BLiveGiftBubblePopupTitlePosition.left, StickStatus.top, BLiveStormDanmakuGiftResourceType.f44446s, "(FF)V", "g", "()V", "zoomableView", "n", "zoom", "m", "(Landroid/view/View;Z)V", "o", "(Landroid/app/Activity;)V", "f", BLiveStormDanmakuGiftResourceType.f44444l, "", "x1", "x2", "y1", "y2", RXScreenCaptureService.KEY_INDEX, "(DDDD)D", OMSTemplateModeType.view, "q", "j", "(Landroid/view/MotionEvent;)Landroid/view/View;", "a", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "setActivity", "b", "Z", "getOpenZoomViewSwitch", "setOpenZoomViewSwitch", "(Z)V", "c", "Landroid/view/View;", "Landroid/view/ViewGroup;", Constants.INAPP_DATA_TAG, "Landroid/view/ViewGroup;", "parentOfZoomableView", "Landroid/view/ViewGroup$LayoutParams;", "e", "Landroid/view/ViewGroup$LayoutParams;", "zoomableViewLP", "Landroid/widget/FrameLayout$LayoutParams;", "Landroid/widget/FrameLayout$LayoutParams;", "zoomableViewFrameLP", "Landroid/app/Dialog;", "Landroid/app/Dialog;", OMSTemplateType.dialog, "Landroid/widget/FrameLayout;", "Landroid/widget/FrameLayout;", "zoomDialogContent", "placeholderView", "I", "viewIndex", "darkView", "D", "originalDistance", "", "[I", "twoPointCenter", "originalXY", "pivotX", "pivotY", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "activityWeakReference", "isAnimatingDismiss", "", "Ll/mdj0$b;", "Ljava/util/List;", "zoomListeners", "", Constants.KEY_T, "Ljava/util/Set;", "allChildrenViews", "u", "Companion", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class mdj0 {

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
    public final List<InterfaceC18437b> zoomListeners = new ArrayList();

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public final Set<View> allChildrenViews = new HashSet();

    /* JADX INFO: renamed from: l.mdj0$b */
    @Metadata(m87231d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\b\u0010\u0006¨\u0006\tÀ\u0006\u0003"}, m87232d2 = {"Ll/mdj0$b;", "", "Landroid/view/View;", OMSTemplateModeType.view, "", "c", "(Landroid/view/View;)V", "a", "b", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public interface InterfaceC18437b {
        /* JADX INFO: renamed from: a */
        void m154085a(@Nullable View view);

        /* JADX INFO: renamed from: b */
        void m154086b(@Nullable View view);

        /* JADX INFO: renamed from: c */
        void m154087c(@Nullable View view);
    }

    /* JADX INFO: renamed from: l.mdj0$c */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m87232d2 = {"l/mdj0$c", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationCancel", "(Landroid/animation/Animator;)V", "onAnimationEnd", "a", "()V", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C18438c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ float f133265b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ float f133266c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f133267d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f133268e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ float f133269f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ float f133270g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ int f133271h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ int f133272i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ ValueAnimator f133273j;

        public C18438c(float f, float f2, int i, int i2, float f3, float f4, int i3, int i4, ValueAnimator valueAnimator) {
            this.f133265b = f;
            this.f133266c = f2;
            this.f133267d = i;
            this.f133268e = i2;
            this.f133269f = f3;
            this.f133270g = f4;
            this.f133271h = i3;
            this.f133272i = i4;
            this.f133273j = valueAnimator;
        }

        /* JADX INFO: renamed from: a */
        public final void m154088a() {
            if (mdj0.this.zoomableView != null) {
                mdj0.this.m154082r(1.0f, this.f133265b, this.f133266c, this.f133267d, this.f133268e, this.f133269f, this.f133270g, this.f133271h, this.f133272i);
            }
            mdj0.this.m154071g();
            this.f133273j.removeAllListeners();
            this.f133273j.removeAllUpdateListeners();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            animation.getClass();
            super.onAnimationCancel(animation);
            m154088a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            animation.getClass();
            super.onAnimationEnd(animation);
            m154088a();
        }
    }

    public mdj0(@Nullable Activity activity, boolean z) {
        this.activity = activity;
        this.openZoomViewSwitch = z;
        this.activityWeakReference = new WeakReference<>(this.activity);
    }

    /* JADX INFO: renamed from: a */
    public static void m154065a(mdj0 mdj0Var, float f, float f2, float f3, float f4, int i, int i2, float f5, float f6, int i3, int i4, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        float animatedFraction = valueAnimator.getAnimatedFraction();
        if (mdj0Var.zoomableView != null) {
            mdj0Var.m154082r(animatedFraction, f3, f4, i, i2, f5, f6, i3, i4);
        }
        View view = mdj0Var.darkView;
        if (view != null) {
            view.setAlpha(((f - f2) * animatedFraction) + f2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m154066b(mdj0 mdj0Var, View view, MotionEvent motionEvent) {
        motionEvent.getClass();
        return mdj0Var.m154072h(motionEvent, false);
    }

    /* JADX INFO: renamed from: f */
    public final void m154070f() {
        Dialog dialog = this.dialog;
        if (dialog != null) {
            dialog.dismiss();
        }
        this.dialog = null;
        this.zoomDialogContent = null;
        this.darkView = null;
        this.touchTargetView = null;
        m154076l();
    }

    /* JADX INFO: renamed from: g */
    public final void m154071g() {
        m154077m(this.zoomableView, false);
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
            m154070f();
        } else {
            m154070f();
        }
        this.isAnimatingDismiss = false;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m154072h(@NotNull MotionEvent event, boolean interceptGesture) {
        Activity ownerActivity;
        event.getClass();
        try {
            Activity activity = this.activityWeakReference.get();
            if (activity != null && this.openZoomViewSwitch && !interceptGesture) {
                if (event.getActionMasked() == 3 && this.zoomableView != null) {
                    return m154075k();
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
                        int iM154073i = (int) m154073i(f2, f, f4, f3);
                        double d = this.originalDistance;
                        double d2 = d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? (((double) iM154073i) - d) / d : 0.0d;
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
                        m154083s(i2 + iArr3[0], (iArr[1] - iArr2[1]) + iArr3[1]);
                        View view6 = this.darkView;
                        if (view6 != null) {
                            view6.setAlpha(Math.abs(d2) <= Double.MAX_VALUE ? (float) d2 : 0.0f);
                        }
                        return true;
                    }
                    m154081q(activity.findViewById(R.id.content));
                    View viewM154074j = m154074j(event);
                    if (viewM154074j != null) {
                        this.zoomableView = viewM154074j;
                        m154078n(viewM154074j);
                        viewM154074j.getLocationInWindow(this.originalXY);
                        FrameLayout frameLayout = new FrameLayout(viewM154074j.getContext());
                        this.zoomDialogContent = frameLayout;
                        frameLayout.setOnTouchListener(new View.OnTouchListener() { // from class: l.kdj0
                            @Override // android.view.View.OnTouchListener
                            public final boolean onTouch(View view7, MotionEvent motionEvent) {
                                return mdj0.m154066b(this.f122567a, view7, motionEvent);
                            }
                        });
                        View view7 = new View(viewM154074j.getContext());
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
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(viewM154074j.getWidth(), viewM154074j.getHeight());
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
                        Dialog dialog = new Dialog(activity, v7c0.f180378y);
                        this.dialog = dialog;
                        dialog.addContentView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
                        Dialog dialog2 = this.dialog;
                        if (dialog2 != null) {
                            dialog2.show();
                        }
                        Dialog dialog3 = this.dialog;
                        if (dialog3 != null && (ownerActivity = dialog3.getOwnerActivity()) != null) {
                            m154079o(ownerActivity);
                        }
                        View view14 = this.zoomableView;
                        if (view14 != null) {
                            view14.setDrawingCacheEnabled(false);
                        }
                        MotionEvent.PointerCoords pointerCoords3 = new MotionEvent.PointerCoords();
                        event.getPointerCoords(0, pointerCoords3);
                        MotionEvent.PointerCoords pointerCoords4 = new MotionEvent.PointerCoords();
                        event.getPointerCoords(1, pointerCoords4);
                        this.originalDistance = m154073i(pointerCoords3.x, pointerCoords4.x, pointerCoords3.y, pointerCoords4.y);
                        this.twoPointCenter = new int[]{(int) ((pointerCoords4.x + pointerCoords3.x) / 2.0f), (int) ((pointerCoords4.y + pointerCoords3.y) / 2.0f)};
                        this.pivotX = ((int) event.getRawX()) - this.originalXY[0];
                        this.pivotY = ((int) event.getRawY()) - this.originalXY[1];
                        m154077m(this.zoomableView, true);
                        return true;
                    }
                } else if (view != null && !this.isAnimatingDismiss) {
                    return m154075k();
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final double m154073i(double x1, double x2, double y1, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2.0d) + Math.pow(y2 - y1, 2.0d));
    }

    /* JADX INFO: renamed from: j */
    public final View m154074j(MotionEvent event) {
        try {
            View view = this.touchTargetView;
            if (view instanceof VPager_SquaredRefactor) {
                view.getClass();
                VPager_SquaredRefactor vPager_SquaredRefactor = (VPager_SquaredRefactor) view;
                View viewFindViewWithTag = vPager_SquaredRefactor.findViewWithTag(Integer.valueOf(vPager_SquaredRefactor.getCurrentItem()));
                if (!(viewFindViewWithTag instanceof PictureView) || (((PictureView) viewFindViewWithTag).f28040G instanceof Video)) {
                    return null;
                }
            } else {
                CardPictureViewOpt cardPictureViewOpt = view instanceof CardPictureViewOpt ? (CardPictureViewOpt) view : null;
                if ((cardPictureViewOpt != null ? cardPictureViewOpt.f23754j : null) instanceof Video) {
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
            if (view2 == this.touchTargetView && view2.getTag(u4c0.f173935Me) == null) {
                Rect rect = new Rect();
                int[] iArr = new int[2];
                view2.getLocationOnScreen(iArr);
                int i = iArr[0];
                rect.left = i;
                rect.top = iArr[1];
                rect.right = i + view2.getWidth();
                rect.bottom = rect.top + view2.getHeight();
                if (rect.contains((int) pointerCoords.x, (int) pointerCoords.y) && rect.contains((int) pointerCoords2.x, (int) pointerCoords2.y) && view2.getTag(u4c0.f174038Sf) != null) {
                    return view2;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m154075k() {
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
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ldj0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                mdj0.m154065a(this.f127556a, f, alpha, scaleY, scaleX, i, i2, f2, f3, i3, i4, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new C18438c(scaleY, scaleX, i, i2, 1.0f, 1.0f, i3, i4, valueAnimatorOfFloat));
        valueAnimatorOfFloat.start();
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final void m154076l() {
        View view = this.zoomableView;
        if (view != null) {
            if (view != null) {
                view.invalidate();
            }
            this.zoomableView = null;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m154077m(View zoomableView, boolean zoom) {
        for (InterfaceC18437b interfaceC18437b : this.zoomListeners) {
            if (zoom) {
                interfaceC18437b.m154085a(zoomableView);
            } else {
                interfaceC18437b.m154086b(zoomableView);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m154078n(View zoomableView) {
        Iterator<InterfaceC18437b> it = this.zoomListeners.iterator();
        while (it.hasNext()) {
            it.next().m154087c(zoomableView);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m154079o(Activity activity) {
        try {
            activity.getWindow().addFlags(Integer.MIN_VALUE);
            activity.getWindow().setStatusBarColor(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m154080p(@Nullable View touchTargetView) {
        INSTANCE.m154084a(touchTargetView);
        this.touchTargetView = touchTargetView;
    }

    /* JADX INFO: renamed from: q */
    public final void m154081q(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof ViewGroup) {
                    if (((ViewGroup) childAt).getTag(u4c0.f174038Sf) != null) {
                        this.allChildrenViews.add(childAt);
                    }
                    m154081q(childAt);
                } else if (childAt.getTag(u4c0.f174038Sf) != null) {
                    this.allChildrenViews.add(childAt);
                }
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m154082r(float animatedFraction, float scaleYStart, float scaleXStart, int leftMarginStart, int topMarginStart, float scaleXEnd, float scaleYEnd, int leftMarginEnd, int topMarginEnd) {
        View view = this.zoomableView;
        if (view != null) {
            view.setScaleX(((scaleXEnd - scaleXStart) * animatedFraction) + scaleXStart);
        }
        View view2 = this.zoomableView;
        if (view2 != null) {
            view2.setScaleY(((scaleYEnd - scaleYStart) * animatedFraction) + scaleYStart);
        }
        m154083s(((leftMarginEnd - leftMarginStart) * animatedFraction) + leftMarginStart, ((topMarginEnd - topMarginStart) * animatedFraction) + topMarginStart);
    }

    /* JADX INFO: renamed from: s */
    public final void m154083s(float left, float top) {
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

    /* JADX INFO: renamed from: l.mdj0$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"Ll/mdj0$a;", "", "<init>", "()V", "Landroid/view/View;", OMSTemplateModeType.view, "", "a", "(Landroid/view/View;)V", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m154084a(@Nullable View view) {
            if (view != null) {
                view.setTag(u4c0.f174038Sf, new Object());
            }
        }

        public Companion() {
        }
    }
}
