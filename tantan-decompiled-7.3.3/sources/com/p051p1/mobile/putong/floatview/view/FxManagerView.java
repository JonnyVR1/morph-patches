package com.p051p1.mobile.putong.floatview.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.floatview.view.FxManagerView;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C15274a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.dej;
import p153l.kul;
import p153l.mul;
import p153l.nul;
import p153l.vdj;
import p153l.wtq0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m88120d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\t\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 n2\u00020\u0001:\u0002KGB\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\nJ\u001b\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\nJ\u000f\u0010\u0018\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0018\u0010\nJ\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u0014\u0010\u001dJ\u0017\u0010 \u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00020\b2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u0015\u001a\u00020\"H\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010'\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\"H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0019H\u0002¢\u0006\u0004\b)\u0010\u001bJ\u001f\u0010,\u001a\u00020\u00192\u0006\u0010*\u001a\u00020\"2\u0006\u0010+\u001a\u00020\"H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0019H\u0002¢\u0006\u0004\b.\u0010\u001bJ\u001f\u00101\u001a\u00020\b2\u0006\u0010/\u001a\u00020\u00112\u0006\u00100\u001a\u00020\u0011H\u0002¢\u0006\u0004\b1\u00102J\u001f\u00103\u001a\u00020\b2\u0006\u0010/\u001a\u00020\u00112\u0006\u00100\u001a\u00020\u0011H\u0002¢\u0006\u0004\b3\u00102J\u0017\u00106\u001a\u00020\u00002\u0006\u00105\u001a\u000204H\u0000¢\u0006\u0004\b6\u00107J)\u00109\u001a\u00020\b2\u0006\u00103\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u00108\u001a\u00020\u0019H\u0007¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\u001eH\u0017¢\u0006\u0004\b=\u0010<J\u000f\u0010>\u001a\u00020\bH\u0014¢\u0006\u0004\b>\u0010\nJ\u000f\u0010?\u001a\u00020\bH\u0014¢\u0006\u0004\b?\u0010\nJ\u0017\u0010A\u001a\u00020\b2\u0006\u0010@\u001a\u00020\"H\u0014¢\u0006\u0004\bA\u0010BJ#\u0010E\u001a\u00020\b2\b\b\u0002\u0010C\u001a\u00020\u00192\b\b\u0002\u0010D\u001a\u00020\u0019H\u0000¢\u0006\u0004\bE\u0010FR\u0016\u0010I\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010M\u001a\u00020J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010P\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010R\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010OR\u0016\u0010U\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010W\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010OR\u0016\u0010X\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010OR\u0016\u0010Y\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010OR\u0016\u0010Z\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010OR\u0016\u0010\\\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010[R\u0016\u0010]\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010OR\u0016\u0010^\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010OR\u0016\u0010_\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010OR\u0016\u0010`\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010OR\u0016\u0010a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010TR\u0016\u0010b\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010TR\u0016\u0010c\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010[R\u0016\u0010f\u001a\u00020d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010eR\u0018\u0010h\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010gR\u001a\u0010k\u001a\u00060iR\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010jR\u0013\u0010m\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\bl\u0010\r¨\u0006o"}, m88121d2 = {"Lcom/p1/mobile/putong/floatview/view/FxManagerView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "p", "()V", "Landroid/view/View;", "k", "()Landroid/view/View;", "j", "n", "Lkotlin/Pair;", "", "m", "()Lkotlin/Pair;", BaseSei.f14625Y, "h", "(F)F", RXScreenCaptureService.KEY_INDEX, "g", "", "r", "()Z", "isDownTouchInit", "(Z)V", "Landroid/view/MotionEvent;", "ev", "o", "(Landroid/view/MotionEvent;)V", "", "w", "(II)V", NotificationCompat.CATEGORY_EVENT, "pointIndex", BaseSei.f14626Z, "(Landroid/view/MotionEvent;I)V", "A", "parentW", "parentH", "B", "(II)Z", "q", "moveX", "moveY", ResourceDirection.f39656v, "(FF)V", BaseSei.f14624X, "Ll/vdj;", Constants.KEY_CONFIG, BLiveStormDanmakuGiftResourceType.f45292l, "(Ll/vdj;)Lcom/p1/mobile/putong/floatview/view/FxManagerView;", "useAnimation", BLiveStormDanmakuGiftResourceType.f45294s, "(FFZ)V", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "onTouchEvent", "onAttachedToWindow", "onDetachedFromWindow", "visibility", "onWindowVisibilityChanged", "(I)V", "isLeft", "isUpdateBoundary", Constants.KEY_T, "(ZZ)V", "a", "Ll/vdj;", "helper", "", "b", "J", "mLastTouchDownTime", "c", "F", "mParentWidth", Constants.INAPP_DATA_TAG, "mParentHeight", "e", "Z", "isNearestLeft", "f", "downTouchX", "downTouchY", "currentX", "currentY", "I", "touchDownId", "minHBoundary", "maxHBoundary", "minWBoundary", "maxWBoundary", "isClickEnable", "isMoveLoading", "scaledTouchSlop", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/View$OnLayoutChangeListener;", "parentChangeListener", "Landroid/view/View;", "_childFxView", "Lcom/p1/mobile/putong/floatview/view/FxManagerView$b;", "Lcom/p1/mobile/putong/floatview/view/FxManagerView$b;", "mMoveAnimator", "getChildFxView", "childFxView", "Companion", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SuppressLint({"ViewConstructor"})
@SourceDebugExtension
public final class FxManagerView extends FrameLayout {

    /* JADX INFO: renamed from: u */
    @NotNull
    public static final Handler f44870u = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public vdj helper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public long mLastTouchDownTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public float mParentWidth;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public float mParentHeight;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public boolean isNearestLeft;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public float downTouchX;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public float downTouchY;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public float currentX;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public float currentY;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public int touchDownId;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public float minHBoundary;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public float maxHBoundary;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public float minWBoundary;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public float maxWBoundary;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public boolean isClickEnable;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public boolean isMoveLoading;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public int scaledTouchSlop;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public View.OnLayoutChangeListener parentChangeListener;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @Nullable
    public View _childFxView;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public RunnableC11580b mMoveAnimator;

    /* JADX INFO: renamed from: com.p1.mobile.putong.floatview.view.FxManagerView$b */
    @Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m88121d2 = {"Lcom/p1/mobile/putong/floatview/view/FxManagerView$b;", "Ljava/lang/Runnable;", "<init>", "(Lcom/p1/mobile/putong/floatview/view/FxManagerView;)V", "", BaseSei.f14624X, BaseSei.f14625Y, "", "a", "(FF)V", "run", "()V", "stop", "F", "destinationX", "b", "destinationY", "", "c", "J", "startingTime", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public final class RunnableC11580b implements Runnable {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public float destinationX;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public float destinationY;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public long startingTime;

        public RunnableC11580b() {
        }

        /* JADX INFO: renamed from: a */
        public final void m68310a(float x, float y) {
            this.destinationX = x;
            this.destinationY = y;
            this.startingTime = System.currentTimeMillis();
            FxManagerView.f44870u.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (FxManagerView.this.get_childFxView() != null) {
                View view = FxManagerView.this.get_childFxView();
                if ((view != null ? view.getParent() : null) == null) {
                    return;
                }
                float fM88488d = C15274a.m88488d(1.0f, (System.currentTimeMillis() - this.startingTime) / 400.0f);
                FxManagerView fxManagerView = FxManagerView.this;
                fxManagerView.setX(fxManagerView.getX() + ((this.destinationX - FxManagerView.this.getX()) * fM88488d));
                FxManagerView fxManagerView2 = FxManagerView.this;
                fxManagerView2.setY(fxManagerView2.getY() + ((this.destinationY - FxManagerView.this.getY()) * fM88488d));
                FxManagerView fxManagerView3 = FxManagerView.this;
                fxManagerView3.currentX = fxManagerView3.getX();
                FxManagerView fxManagerView4 = FxManagerView.this;
                fxManagerView4.currentY = fxManagerView4.getY();
                if (fM88488d < 1.0f) {
                    FxManagerView.f44870u.post(this);
                } else {
                    FxManagerView.this.isMoveLoading = false;
                }
            }
        }

        public final void stop() {
            FxManagerView.this.isMoveLoading = false;
            FxManagerView.f44870u.removeCallbacks(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FxManagerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.isNearestLeft = true;
        this.isClickEnable = true;
        this.parentChangeListener = new View.OnLayoutChangeListener() { // from class: l.aej
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                FxManagerView.m68283b(this.f70802a, view, i, i2, i3, i4, i5, i6, i7, i8);
            }
        };
        this.mMoveAnimator = new RunnableC11580b();
    }

    /* JADX INFO: renamed from: a */
    public static void m68282a(FxManagerView fxManagerView) {
        fxManagerView.isClickEnable = true;
    }

    /* JADX INFO: renamed from: b */
    public static void m68283b(FxManagerView fxManagerView, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        fxManagerView.m68306w(view.getWidth(), view.getHeight());
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m68288u(FxManagerView fxManagerView, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = fxManagerView.m68301q();
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        fxManagerView.m68304t(z, z2);
    }

    /* JADX INFO: renamed from: A */
    public final boolean m68289A() {
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return false;
        }
        return m68290B(viewGroup.getWidth(), viewGroup.getHeight());
    }

    /* JADX INFO: renamed from: B */
    public final boolean m68290B(int parentW, int parentH) {
        float width = parentW - getWidth();
        float height = parentH - getHeight();
        if (this.mParentHeight == height && this.mParentWidth == width) {
            return false;
        }
        this.mParentWidth = width;
        this.mParentHeight = height;
        m68308y(false);
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final void m68291g() {
        vdj vdjVar = this.helper;
        if (vdjVar == null) {
            Intrinsics.m88391r("helper");
            vdjVar = null;
        }
        mul mulVar = vdjVar.iFxScrollListener;
        if (mulVar != null) {
            mulVar.mo109371c(get_childFxView());
        }
        this.touchDownId = -1;
        m68288u(this, false, false, 3, null);
    }

    @Nullable
    /* JADX INFO: renamed from: getChildFxView, reason: from getter */
    public final View get_childFxView() {
        return this._childFxView;
    }

    /* JADX INFO: renamed from: h */
    public final float m68292h(float y) {
        vdj vdjVar = this.helper;
        vdj vdjVar2 = null;
        if (vdjVar == null) {
            Intrinsics.m88391r("helper");
            vdjVar = null;
        }
        int scope = vdjVar.gravity.getScope();
        if (scope == 1) {
            vdj vdjVar3 = this.helper;
            if (vdjVar3 == null) {
                Intrinsics.m88391r("helper");
            } else {
                vdjVar2 = vdjVar3;
            }
            return y + vdjVar2.statsBarHeight;
        }
        if (scope != 3) {
            return y;
        }
        vdj vdjVar4 = this.helper;
        if (vdjVar4 == null) {
            Intrinsics.m88391r("helper");
        } else {
            vdjVar2 = vdjVar4;
        }
        return y - vdjVar2.navigationBarHeight;
    }

    /* JADX INFO: renamed from: i */
    public final void m68293i() {
        vdj vdjVar = this.helper;
        vdj vdjVar2 = null;
        if (vdjVar == null) {
            Intrinsics.m88391r("helper");
            vdjVar = null;
        }
        if (vdjVar.enableClickListener && this.isClickEnable) {
            vdj vdjVar3 = this.helper;
            if (vdjVar3 == null) {
                Intrinsics.m88391r("helper");
                vdjVar3 = null;
            }
            if (vdjVar3.iFxClickListener == null || !m68302r()) {
                return;
            }
            this.isClickEnable = false;
            vdj vdjVar4 = this.helper;
            if (vdjVar4 == null) {
                Intrinsics.m88391r("helper");
                vdjVar4 = null;
            }
            View.OnClickListener onClickListener = vdjVar4.iFxClickListener;
            onClickListener.getClass();
            onClickListener.onClick(this);
            Runnable runnable = new Runnable() { // from class: l.zdj
                @Override // java.lang.Runnable
                public final void run() {
                    FxManagerView.m68282a(this.f203886a);
                }
            };
            vdj vdjVar5 = this.helper;
            if (vdjVar5 == null) {
                Intrinsics.m88391r("helper");
            } else {
                vdjVar2 = vdjVar5;
            }
            postDelayed(runnable, vdjVar2.clickTime);
        }
    }

    /* JADX INFO: renamed from: j */
    public final View m68294j() {
        vdj vdjVar = this.helper;
        vdj vdjVar2 = null;
        if (vdjVar == null) {
            Intrinsics.m88391r("helper");
            vdjVar = null;
        }
        if (vdjVar.layoutId == 0) {
            return null;
        }
        Context context = getContext();
        vdj vdjVar3 = this.helper;
        if (vdjVar3 == null) {
            Intrinsics.m88391r("helper");
        } else {
            vdjVar2 = vdjVar3;
        }
        return View.inflate(context, vdjVar2.layoutId, this);
    }

    /* JADX INFO: renamed from: k */
    public final View m68295k() {
        vdj vdjVar = this.helper;
        vdj vdjVar2 = null;
        if (vdjVar == null) {
            Intrinsics.m88391r("helper");
            vdjVar = null;
        }
        View view = vdjVar.layoutView;
        if (view == null) {
            return null;
        }
        vdj vdjVar3 = this.helper;
        if (vdjVar3 == null) {
            Intrinsics.m88391r("helper");
        } else {
            vdjVar2 = vdjVar3;
        }
        FrameLayout.LayoutParams layoutParams = vdjVar2.layoutParams;
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-2, -2);
        }
        addView(view, layoutParams);
        return view;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ FxManagerView m68296l(vdj config) {
        config.getClass();
        this.helper = config;
        m68300p();
        return this;
    }

    /* JADX INFO: renamed from: m */
    public final Pair<Float, Float> m68297m() {
        vdj vdjVar = this.helper;
        vdj vdjVar2 = null;
        if (vdjVar == null) {
            Intrinsics.m88391r("helper");
            vdjVar = null;
        }
        Float fValueOf = Float.valueOf(vdjVar.defaultX);
        vdj vdjVar3 = this.helper;
        if (vdjVar3 == null) {
            Intrinsics.m88391r("helper");
        } else {
            vdjVar2 = vdjVar3;
        }
        return TuplesKt.m88129a(fValueOf, Float.valueOf(m68292h(vdjVar2.defaultY)));
    }

    /* JADX INFO: renamed from: n */
    public final void m68298n() {
        Pair<Float, Float> pairM68297m;
        vdj vdjVar = this.helper;
        vdj vdjVar2 = null;
        if (vdjVar == null) {
            Intrinsics.m88391r("helper");
            vdjVar = null;
        }
        kul kulVar = vdjVar.iFxConfigStorage;
        boolean zHasConfig = kulVar != null ? kulVar.hasConfig() : false;
        vdj vdjVar3 = this.helper;
        if (vdjVar3 == null) {
            Intrinsics.m88391r("helper");
            vdjVar3 = null;
        }
        FrameLayout.LayoutParams layoutParams = vdjVar3.layoutParams;
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-2, -2);
        }
        if (!zHasConfig) {
            vdj vdjVar4 = this.helper;
            if (vdjVar4 == null) {
                Intrinsics.m88391r("helper");
            } else {
                vdjVar2 = vdjVar4;
            }
            layoutParams.gravity = vdjVar2.gravity.getValue();
        }
        setLayoutParams(layoutParams);
        if (zHasConfig) {
            kulVar.getClass();
            pairM68297m = TuplesKt.m88129a(Float.valueOf(kulVar.getX()), Float.valueOf(kulVar.getY()));
        } else {
            pairM68297m = m68297m();
        }
        float fFloatValue = pairM68297m.component1().floatValue();
        float fFloatValue2 = pairM68297m.component2().floatValue();
        if (fFloatValue != -1.0f) {
            setX(fFloatValue);
        }
        if (fFloatValue2 == -1.0f) {
            return;
        }
        setY(fFloatValue2);
    }

    /* JADX INFO: renamed from: o */
    public final void m68299o(MotionEvent ev) {
        m68289A();
        m68308y(true);
        this.touchDownId = ev.getPointerId(ev.getActionIndex());
        this.downTouchX = ev.getX(ev.getActionIndex());
        this.downTouchY = ev.getY(ev.getActionIndex());
        this.mMoveAnimator.stop();
        vdj vdjVar = this.helper;
        vdj vdjVar2 = null;
        if (vdjVar == null) {
            Intrinsics.m88391r("helper");
            vdjVar = null;
        }
        mul mulVar = vdjVar.iFxScrollListener;
        if (mulVar != null) {
            mulVar.mo109370b(get_childFxView());
        }
        vdj vdjVar3 = this.helper;
        if (vdjVar3 == null) {
            Intrinsics.m88391r("helper");
        } else {
            vdjVar2 = vdjVar3;
        }
        if (vdjVar2.enableClickListener) {
            this.mLastTouchDownTime = System.currentTimeMillis();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        vdj vdjVar = this.helper;
        if (vdjVar == null) {
            Intrinsics.m88391r("helper");
            vdjVar = null;
        }
        nul nulVar = vdjVar.iFxViewLifecycle;
        if (nulVar != null) {
            nulVar.mo115443d();
        }
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.addOnLayoutChangeListener(this.parentChangeListener);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        vdj vdjVar = this.helper;
        if (vdjVar == null) {
            Intrinsics.m88391r("helper");
            vdjVar = null;
        }
        nul nulVar = vdjVar.iFxViewLifecycle;
        if (nulVar != null) {
            nulVar.mo120547f();
        }
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeOnLayoutChangeListener(this.parentChangeListener);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent ev) {
        ev.getClass();
        int actionMasked = ev.getActionMasked();
        if (actionMasked != 0) {
            return actionMasked == 2 && Math.abs(this.downTouchX - ev.getX()) >= ((float) this.scaledTouchSlop);
        }
        m68299o(ev);
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0091  */
    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        event.getClass();
        vdj vdjVar = this.helper;
        vdj vdjVar2 = null;
        if (vdjVar == null) {
            Intrinsics.m88391r("helper");
            vdjVar = null;
        }
        mul mulVar = vdjVar.iFxScrollListener;
        if (mulVar != null) {
            mulVar.mo109372d(event);
        }
        int actionMasked = event.getActionMasked();
        if (actionMasked == 1) {
            m68291g();
            m68293i();
        } else {
            if (actionMasked == 2) {
                if (this.touchDownId != -1) {
                    vdj vdjVar3 = this.helper;
                    if (vdjVar3 == null) {
                        Intrinsics.m88391r("helper");
                    } else {
                        vdjVar2 = vdjVar3;
                    }
                    if (vdjVar2.enableTouch) {
                        int iFindPointerIndex = event.findPointerIndex(this.touchDownId);
                        if (iFindPointerIndex != -1) {
                            m68309z(event, iFindPointerIndex);
                        }
                    }
                }
                return super.onTouchEvent(event);
            }
            if (actionMasked == 3) {
                m68291g();
                m68293i();
            } else if (actionMasked != 5) {
                if (actionMasked == 6 && event.getPointerId(event.getActionIndex()) == this.touchDownId) {
                    m68291g();
                }
            } else if (this.touchDownId == -1) {
                float x = event.getX(event.getActionIndex());
                float y = event.getY(event.getActionIndex());
                if (x >= 0.0f && x <= getWidth() && y >= 0.0f && y <= getHeight()) {
                    m68299o(event);
                }
            }
        }
        return super.onTouchEvent(event);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int visibility) {
        super.onWindowVisibilityChanged(visibility);
        vdj vdjVar = this.helper;
        if (vdjVar == null) {
            Intrinsics.m88391r("helper");
            vdjVar = null;
        }
        nul nulVar = vdjVar.iFxViewLifecycle;
        if (nulVar != null) {
            nulVar.mo120545c(visibility);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m68300p() {
        View viewM68295k = m68295k();
        if (viewM68295k == null) {
            viewM68295k = m68294j();
        }
        this._childFxView = viewM68295k;
        if (viewM68295k == null) {
            wtq0.m207906a("initFxView -> Error,check your layoutId or layoutView.");
            return;
        }
        m68298n();
        setClickable(true);
        this.scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        vdj vdjVar = this.helper;
        if (vdjVar == null) {
            Intrinsics.m88391r("helper");
            vdjVar = null;
        }
        nul nulVar = vdjVar.iFxViewLifecycle;
        if (nulVar != null) {
            nulVar.mo120546e(this);
        }
        setBackgroundColor(0);
    }

    /* JADX INFO: renamed from: q */
    public final boolean m68301q() {
        boolean z = getX() < this.mParentWidth / 2.0f;
        this.isNearestLeft = z;
        return z;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m68302r() {
        return System.currentTimeMillis() - this.mLastTouchDownTime < 150;
    }

    @JvmOverloads
    /* JADX INFO: renamed from: s */
    public final void m68303s(float x, float y, boolean useAnimation) {
        float fM115418a = dej.m115418a(x, this.minWBoundary, this.maxWBoundary);
        float fM115418a2 = dej.m115418a(y, this.minHBoundary, this.maxHBoundary);
        if (useAnimation) {
            m68305v(fM115418a, fM115418a2);
        } else {
            setX(x);
            setY(y);
        }
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m68304t(boolean isLeft, boolean isUpdateBoundary) {
        if (this.isMoveLoading) {
            return;
        }
        if (isUpdateBoundary) {
            m68308y(false);
        }
        vdj vdjVar = this.helper;
        if (vdjVar == null) {
            Intrinsics.m88391r("helper");
            vdjVar = null;
        }
        if (!vdjVar.enableEdgeAdsorption) {
            m68305v(dej.m115418a(getX(), this.minWBoundary, this.maxWBoundary), dej.m115418a(getY(), this.minHBoundary, this.maxHBoundary));
        } else {
            m68305v(isLeft ? this.minWBoundary : this.maxWBoundary, dej.m115418a(getY(), this.minHBoundary, this.maxHBoundary));
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m68305v(float moveX, float moveY) {
        this.isMoveLoading = true;
        if (moveX == getX() && moveY == getY()) {
            this.isMoveLoading = false;
            return;
        }
        this.mMoveAnimator.m68310a(moveX, moveY);
        this.currentX = moveX;
        this.currentY = moveY;
        m68307x(moveX, moveY);
    }

    /* JADX INFO: renamed from: w */
    public final void m68306w(int w, int h) {
        if (m68290B(w, h)) {
            m68288u(this, false, false, 1, null);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m68307x(float moveX, float moveY) {
        vdj vdjVar = this.helper;
        if (vdjVar == null) {
            Intrinsics.m88391r("helper");
            vdjVar = null;
        }
        kul kulVar = vdjVar.iFxConfigStorage;
        if (kulVar != null) {
            kulVar.mo151558a(moveX, moveY);
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m68308y(boolean isDownTouchInit) {
        float f;
        float fM205888d;
        float fM205885a;
        float fM205886b;
        float fM205887c = 0.0f;
        vdj vdjVar = null;
        if (isDownTouchInit) {
            f = 0.0f;
        } else {
            vdj vdjVar2 = this.helper;
            if (vdjVar2 == null) {
                Intrinsics.m88391r("helper");
                vdjVar2 = null;
            }
            f = vdjVar2.edgeOffset;
        }
        if (isDownTouchInit) {
            fM205888d = 0.0f;
        } else {
            vdj vdjVar3 = this.helper;
            if (vdjVar3 == null) {
                Intrinsics.m88391r("helper");
                vdjVar3 = null;
            }
            fM205888d = vdjVar3.fxBorderMargin.getCom.clevertap.android.sdk.Constants.KEY_T java.lang.String() + f;
        }
        if (isDownTouchInit) {
            fM205885a = 0.0f;
        } else {
            vdj vdjVar4 = this.helper;
            if (vdjVar4 == null) {
                Intrinsics.m88391r("helper");
                vdjVar4 = null;
            }
            fM205885a = vdjVar4.fxBorderMargin.getB() + f;
        }
        if (isDownTouchInit) {
            fM205886b = 0.0f;
        } else {
            vdj vdjVar5 = this.helper;
            if (vdjVar5 == null) {
                Intrinsics.m88391r("helper");
                vdjVar5 = null;
            }
            fM205886b = vdjVar5.fxBorderMargin.getCom.p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType.l java.lang.String() + f;
        }
        if (!isDownTouchInit) {
            vdj vdjVar6 = this.helper;
            if (vdjVar6 == null) {
                Intrinsics.m88391r("helper");
                vdjVar6 = null;
            }
            fM205887c = vdjVar6.fxBorderMargin.getR() + f;
        }
        this.minWBoundary = fM205886b;
        this.maxWBoundary = this.mParentWidth - fM205887c;
        vdj vdjVar7 = this.helper;
        if (vdjVar7 == null) {
            Intrinsics.m88391r("helper");
            vdjVar7 = null;
        }
        this.minHBoundary = vdjVar7.statsBarHeight + fM205888d;
        float f2 = this.mParentHeight;
        vdj vdjVar8 = this.helper;
        if (vdjVar8 == null) {
            Intrinsics.m88391r("helper");
        } else {
            vdjVar = vdjVar8;
        }
        this.maxHBoundary = (f2 - vdjVar.navigationBarHeight) - fM205885a;
    }

    /* JADX INFO: renamed from: z */
    public final void m68309z(MotionEvent event, int pointIndex) {
        float fM115418a = dej.m115418a((getX() + event.getX(pointIndex)) - this.downTouchX, this.minWBoundary, this.maxWBoundary);
        float fM115418a2 = dej.m115418a((getY() + event.getY(pointIndex)) - this.downTouchY, this.minHBoundary, this.maxHBoundary);
        setX(fM115418a);
        setY(fM115418a2);
        vdj vdjVar = this.helper;
        if (vdjVar == null) {
            Intrinsics.m88391r("helper");
            vdjVar = null;
        }
        mul mulVar = vdjVar.iFxScrollListener;
        if (mulVar != null) {
            mulVar.mo109369a(get_childFxView(), event, fM115418a, fM115418a2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public FxManagerView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    public /* synthetic */ FxManagerView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
