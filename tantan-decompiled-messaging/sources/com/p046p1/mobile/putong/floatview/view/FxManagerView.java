package com.p046p1.mobile.putong.floatview.view;

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
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.floatview.view.FxManagerView;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C15167a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.bbj;
import p149l.jbj;
import p149l.qkq0;
import p149l.wrl;
import p149l.yrl;
import p149l.zrl;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m87231d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\t\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 n2\u00020\u0001:\u0002KGB\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\nJ\u001b\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\nJ\u000f\u0010\u0018\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0018\u0010\nJ\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u0014\u0010\u001dJ\u0017\u0010 \u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00020\b2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u0015\u001a\u00020\"H\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010'\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\"H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0019H\u0002¢\u0006\u0004\b)\u0010\u001bJ\u001f\u0010,\u001a\u00020\u00192\u0006\u0010*\u001a\u00020\"2\u0006\u0010+\u001a\u00020\"H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0019H\u0002¢\u0006\u0004\b.\u0010\u001bJ\u001f\u00101\u001a\u00020\b2\u0006\u0010/\u001a\u00020\u00112\u0006\u00100\u001a\u00020\u0011H\u0002¢\u0006\u0004\b1\u00102J\u001f\u00103\u001a\u00020\b2\u0006\u0010/\u001a\u00020\u00112\u0006\u00100\u001a\u00020\u0011H\u0002¢\u0006\u0004\b3\u00102J\u0017\u00106\u001a\u00020\u00002\u0006\u00105\u001a\u000204H\u0000¢\u0006\u0004\b6\u00107J)\u00109\u001a\u00020\b2\u0006\u00103\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u00108\u001a\u00020\u0019H\u0007¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\u001eH\u0017¢\u0006\u0004\b=\u0010<J\u000f\u0010>\u001a\u00020\bH\u0014¢\u0006\u0004\b>\u0010\nJ\u000f\u0010?\u001a\u00020\bH\u0014¢\u0006\u0004\b?\u0010\nJ\u0017\u0010A\u001a\u00020\b2\u0006\u0010@\u001a\u00020\"H\u0014¢\u0006\u0004\bA\u0010BJ#\u0010E\u001a\u00020\b2\b\b\u0002\u0010C\u001a\u00020\u00192\b\b\u0002\u0010D\u001a\u00020\u0019H\u0000¢\u0006\u0004\bE\u0010FR\u0016\u0010I\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010M\u001a\u00020J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010P\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010R\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010OR\u0016\u0010U\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010W\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010OR\u0016\u0010X\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010OR\u0016\u0010Y\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010OR\u0016\u0010Z\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010OR\u0016\u0010\\\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010[R\u0016\u0010]\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010OR\u0016\u0010^\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010OR\u0016\u0010_\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010OR\u0016\u0010`\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010OR\u0016\u0010a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010TR\u0016\u0010b\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010TR\u0016\u0010c\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010[R\u0016\u0010f\u001a\u00020d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010eR\u0018\u0010h\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010gR\u001a\u0010k\u001a\u00060iR\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010jR\u0013\u0010m\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\bl\u0010\r¨\u0006o"}, m87232d2 = {"Lcom/p1/mobile/putong/floatview/view/FxManagerView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "p", "()V", "Landroid/view/View;", "k", "()Landroid/view/View;", "j", "n", "Lkotlin/Pair;", "", "m", "()Lkotlin/Pair;", BaseSei.f13931Y, "h", "(F)F", RXScreenCaptureService.KEY_INDEX, "g", "", "r", "()Z", "isDownTouchInit", "(Z)V", "Landroid/view/MotionEvent;", "ev", "o", "(Landroid/view/MotionEvent;)V", "", "w", "(II)V", NotificationCompat.CATEGORY_EVENT, "pointIndex", BaseSei.f13932Z, "(Landroid/view/MotionEvent;I)V", "A", "parentW", "parentH", "B", "(II)Z", "q", "moveX", "moveY", ResourceDirection.f38808v, "(FF)V", BaseSei.f13930X, "Ll/bbj;", Constants.KEY_CONFIG, BLiveStormDanmakuGiftResourceType.f44444l, "(Ll/bbj;)Lcom/p1/mobile/putong/floatview/view/FxManagerView;", "useAnimation", BLiveStormDanmakuGiftResourceType.f44446s, "(FFZ)V", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "onTouchEvent", "onAttachedToWindow", "onDetachedFromWindow", "visibility", "onWindowVisibilityChanged", "(I)V", "isLeft", "isUpdateBoundary", Constants.KEY_T, "(ZZ)V", "a", "Ll/bbj;", "helper", "", "b", "J", "mLastTouchDownTime", "c", "F", "mParentWidth", Constants.INAPP_DATA_TAG, "mParentHeight", "e", "Z", "isNearestLeft", "f", "downTouchX", "downTouchY", "currentX", "currentY", "I", "touchDownId", "minHBoundary", "maxHBoundary", "minWBoundary", "maxWBoundary", "isClickEnable", "isMoveLoading", "scaledTouchSlop", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/View$OnLayoutChangeListener;", "parentChangeListener", "Landroid/view/View;", "_childFxView", "Lcom/p1/mobile/putong/floatview/view/FxManagerView$b;", "Lcom/p1/mobile/putong/floatview/view/FxManagerView$b;", "mMoveAnimator", "getChildFxView", "childFxView", "Companion", "putong-common_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SuppressLint({"ViewConstructor"})
@SourceDebugExtension
public final class FxManagerView extends FrameLayout {

    /* JADX INFO: renamed from: u */
    @NotNull
    public static final Handler f44022u = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public bbj helper;

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
    public RunnableC11417b mMoveAnimator;

    /* JADX INFO: renamed from: com.p1.mobile.putong.floatview.view.FxManagerView$b */
    @Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m87232d2 = {"Lcom/p1/mobile/putong/floatview/view/FxManagerView$b;", "Ljava/lang/Runnable;", "<init>", "(Lcom/p1/mobile/putong/floatview/view/FxManagerView;)V", "", BaseSei.f13930X, BaseSei.f13931Y, "", "a", "(FF)V", "run", "()V", "stop", "F", "destinationX", "b", "destinationY", "", "c", "J", "startingTime", "putong-common_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public final class RunnableC11417b implements Runnable {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public float destinationX;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public float destinationY;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public long startingTime;

        public RunnableC11417b() {
        }

        /* JADX INFO: renamed from: a */
        public final void m67127a(float x, float y) {
            this.destinationX = x;
            this.destinationY = y;
            this.startingTime = System.currentTimeMillis();
            FxManagerView.f44022u.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (FxManagerView.this.get_childFxView() != null) {
                View view = FxManagerView.this.get_childFxView();
                if ((view != null ? view.getParent() : null) == null) {
                    return;
                }
                float fM87598d = C15167a.m87598d(1.0f, (System.currentTimeMillis() - this.startingTime) / 400.0f);
                FxManagerView fxManagerView = FxManagerView.this;
                fxManagerView.setX(fxManagerView.getX() + ((this.destinationX - FxManagerView.this.getX()) * fM87598d));
                FxManagerView fxManagerView2 = FxManagerView.this;
                fxManagerView2.setY(fxManagerView2.getY() + ((this.destinationY - FxManagerView.this.getY()) * fM87598d));
                FxManagerView fxManagerView3 = FxManagerView.this;
                fxManagerView3.currentX = fxManagerView3.getX();
                FxManagerView fxManagerView4 = FxManagerView.this;
                fxManagerView4.currentY = fxManagerView4.getY();
                if (fM87598d < 1.0f) {
                    FxManagerView.f44022u.post(this);
                } else {
                    FxManagerView.this.isMoveLoading = false;
                }
            }
        }

        public final void stop() {
            FxManagerView.this.isMoveLoading = false;
            FxManagerView.f44022u.removeCallbacks(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FxManagerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.isNearestLeft = true;
        this.isClickEnable = true;
        this.parentChangeListener = new View.OnLayoutChangeListener() { // from class: l.gbj
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                FxManagerView.m67100b(this.f101858a, view, i, i2, i3, i4, i5, i6, i7, i8);
            }
        };
        this.mMoveAnimator = new RunnableC11417b();
    }

    /* JADX INFO: renamed from: a */
    public static void m67099a(FxManagerView fxManagerView) {
        fxManagerView.isClickEnable = true;
    }

    /* JADX INFO: renamed from: b */
    public static void m67100b(FxManagerView fxManagerView, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        fxManagerView.m67123w(view.getWidth(), view.getHeight());
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m67105u(FxManagerView fxManagerView, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = fxManagerView.m67118q();
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        fxManagerView.m67121t(z, z2);
    }

    /* JADX INFO: renamed from: A */
    public final boolean m67106A() {
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return false;
        }
        return m67107B(viewGroup.getWidth(), viewGroup.getHeight());
    }

    /* JADX INFO: renamed from: B */
    public final boolean m67107B(int parentW, int parentH) {
        float width = parentW - getWidth();
        float height = parentH - getHeight();
        if (this.mParentHeight == height && this.mParentWidth == width) {
            return false;
        }
        this.mParentWidth = width;
        this.mParentHeight = height;
        m67125y(false);
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final void m67108g() {
        bbj bbjVar = this.helper;
        if (bbjVar == null) {
            Intrinsics.m87502r("helper");
            bbjVar = null;
        }
        yrl yrlVar = bbjVar.iFxScrollListener;
        if (yrlVar != null) {
            yrlVar.mo135257c(get_childFxView());
        }
        this.touchDownId = -1;
        m67105u(this, false, false, 3, null);
    }

    @Nullable
    /* JADX INFO: renamed from: getChildFxView, reason: from getter */
    public final View get_childFxView() {
        return this._childFxView;
    }

    /* JADX INFO: renamed from: h */
    public final float m67109h(float y) {
        bbj bbjVar = this.helper;
        bbj bbjVar2 = null;
        if (bbjVar == null) {
            Intrinsics.m87502r("helper");
            bbjVar = null;
        }
        int scope = bbjVar.gravity.getScope();
        if (scope == 1) {
            bbj bbjVar3 = this.helper;
            if (bbjVar3 == null) {
                Intrinsics.m87502r("helper");
            } else {
                bbjVar2 = bbjVar3;
            }
            return y + bbjVar2.statsBarHeight;
        }
        if (scope != 3) {
            return y;
        }
        bbj bbjVar4 = this.helper;
        if (bbjVar4 == null) {
            Intrinsics.m87502r("helper");
        } else {
            bbjVar2 = bbjVar4;
        }
        return y - bbjVar2.navigationBarHeight;
    }

    /* JADX INFO: renamed from: i */
    public final void m67110i() {
        bbj bbjVar = this.helper;
        bbj bbjVar2 = null;
        if (bbjVar == null) {
            Intrinsics.m87502r("helper");
            bbjVar = null;
        }
        if (bbjVar.enableClickListener && this.isClickEnable) {
            bbj bbjVar3 = this.helper;
            if (bbjVar3 == null) {
                Intrinsics.m87502r("helper");
                bbjVar3 = null;
            }
            if (bbjVar3.iFxClickListener == null || !m67119r()) {
                return;
            }
            this.isClickEnable = false;
            bbj bbjVar4 = this.helper;
            if (bbjVar4 == null) {
                Intrinsics.m87502r("helper");
                bbjVar4 = null;
            }
            View.OnClickListener onClickListener = bbjVar4.iFxClickListener;
            onClickListener.getClass();
            onClickListener.onClick(this);
            Runnable runnable = new Runnable() { // from class: l.fbj
                @Override // java.lang.Runnable
                public final void run() {
                    FxManagerView.m67099a(this.f96721a);
                }
            };
            bbj bbjVar5 = this.helper;
            if (bbjVar5 == null) {
                Intrinsics.m87502r("helper");
            } else {
                bbjVar2 = bbjVar5;
            }
            postDelayed(runnable, bbjVar2.clickTime);
        }
    }

    /* JADX INFO: renamed from: j */
    public final View m67111j() {
        bbj bbjVar = this.helper;
        bbj bbjVar2 = null;
        if (bbjVar == null) {
            Intrinsics.m87502r("helper");
            bbjVar = null;
        }
        if (bbjVar.layoutId == 0) {
            return null;
        }
        Context context = getContext();
        bbj bbjVar3 = this.helper;
        if (bbjVar3 == null) {
            Intrinsics.m87502r("helper");
        } else {
            bbjVar2 = bbjVar3;
        }
        return View.inflate(context, bbjVar2.layoutId, this);
    }

    /* JADX INFO: renamed from: k */
    public final View m67112k() {
        bbj bbjVar = this.helper;
        bbj bbjVar2 = null;
        if (bbjVar == null) {
            Intrinsics.m87502r("helper");
            bbjVar = null;
        }
        View view = bbjVar.layoutView;
        if (view == null) {
            return null;
        }
        bbj bbjVar3 = this.helper;
        if (bbjVar3 == null) {
            Intrinsics.m87502r("helper");
        } else {
            bbjVar2 = bbjVar3;
        }
        FrameLayout.LayoutParams layoutParams = bbjVar2.layoutParams;
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-2, -2);
        }
        addView(view, layoutParams);
        return view;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ FxManagerView m67113l(bbj config) {
        config.getClass();
        this.helper = config;
        m67117p();
        return this;
    }

    /* JADX INFO: renamed from: m */
    public final Pair<Float, Float> m67114m() {
        bbj bbjVar = this.helper;
        bbj bbjVar2 = null;
        if (bbjVar == null) {
            Intrinsics.m87502r("helper");
            bbjVar = null;
        }
        Float fValueOf = Float.valueOf(bbjVar.defaultX);
        bbj bbjVar3 = this.helper;
        if (bbjVar3 == null) {
            Intrinsics.m87502r("helper");
        } else {
            bbjVar2 = bbjVar3;
        }
        return TuplesKt.m87240a(fValueOf, Float.valueOf(m67109h(bbjVar2.defaultY)));
    }

    /* JADX INFO: renamed from: n */
    public final void m67115n() {
        Pair<Float, Float> pairM67114m;
        bbj bbjVar = this.helper;
        bbj bbjVar2 = null;
        if (bbjVar == null) {
            Intrinsics.m87502r("helper");
            bbjVar = null;
        }
        wrl wrlVar = bbjVar.iFxConfigStorage;
        boolean zHasConfig = wrlVar != null ? wrlVar.hasConfig() : false;
        bbj bbjVar3 = this.helper;
        if (bbjVar3 == null) {
            Intrinsics.m87502r("helper");
            bbjVar3 = null;
        }
        FrameLayout.LayoutParams layoutParams = bbjVar3.layoutParams;
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-2, -2);
        }
        if (!zHasConfig) {
            bbj bbjVar4 = this.helper;
            if (bbjVar4 == null) {
                Intrinsics.m87502r("helper");
            } else {
                bbjVar2 = bbjVar4;
            }
            layoutParams.gravity = bbjVar2.gravity.getValue();
        }
        setLayoutParams(layoutParams);
        if (zHasConfig) {
            wrlVar.getClass();
            pairM67114m = TuplesKt.m87240a(Float.valueOf(wrlVar.getX()), Float.valueOf(wrlVar.getY()));
        } else {
            pairM67114m = m67114m();
        }
        float fFloatValue = pairM67114m.component1().floatValue();
        float fFloatValue2 = pairM67114m.component2().floatValue();
        if (fFloatValue != -1.0f) {
            setX(fFloatValue);
        }
        if (fFloatValue2 == -1.0f) {
            return;
        }
        setY(fFloatValue2);
    }

    /* JADX INFO: renamed from: o */
    public final void m67116o(MotionEvent ev) {
        m67106A();
        m67125y(true);
        this.touchDownId = ev.getPointerId(ev.getActionIndex());
        this.downTouchX = ev.getX(ev.getActionIndex());
        this.downTouchY = ev.getY(ev.getActionIndex());
        this.mMoveAnimator.stop();
        bbj bbjVar = this.helper;
        bbj bbjVar2 = null;
        if (bbjVar == null) {
            Intrinsics.m87502r("helper");
            bbjVar = null;
        }
        yrl yrlVar = bbjVar.iFxScrollListener;
        if (yrlVar != null) {
            yrlVar.mo135256b(get_childFxView());
        }
        bbj bbjVar3 = this.helper;
        if (bbjVar3 == null) {
            Intrinsics.m87502r("helper");
        } else {
            bbjVar2 = bbjVar3;
        }
        if (bbjVar2.enableClickListener) {
            this.mLastTouchDownTime = System.currentTimeMillis();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        bbj bbjVar = this.helper;
        if (bbjVar == null) {
            Intrinsics.m87502r("helper");
            bbjVar = null;
        }
        zrl zrlVar = bbjVar.iFxViewLifecycle;
        if (zrlVar != null) {
            zrlVar.mo145305d();
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
        bbj bbjVar = this.helper;
        if (bbjVar == null) {
            Intrinsics.m87502r("helper");
            bbjVar = null;
        }
        zrl zrlVar = bbjVar.iFxViewLifecycle;
        if (zrlVar != null) {
            zrlVar.mo145307f();
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
        m67116o(ev);
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0091  */
    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        event.getClass();
        bbj bbjVar = this.helper;
        bbj bbjVar2 = null;
        if (bbjVar == null) {
            Intrinsics.m87502r("helper");
            bbjVar = null;
        }
        yrl yrlVar = bbjVar.iFxScrollListener;
        if (yrlVar != null) {
            yrlVar.mo135258d(event);
        }
        int actionMasked = event.getActionMasked();
        if (actionMasked == 1) {
            m67108g();
            m67110i();
        } else {
            if (actionMasked == 2) {
                if (this.touchDownId != -1) {
                    bbj bbjVar3 = this.helper;
                    if (bbjVar3 == null) {
                        Intrinsics.m87502r("helper");
                    } else {
                        bbjVar2 = bbjVar3;
                    }
                    if (bbjVar2.enableTouch) {
                        int iFindPointerIndex = event.findPointerIndex(this.touchDownId);
                        if (iFindPointerIndex != -1) {
                            m67126z(event, iFindPointerIndex);
                        }
                    }
                }
                return super.onTouchEvent(event);
            }
            if (actionMasked == 3) {
                m67108g();
                m67110i();
            } else if (actionMasked != 5) {
                if (actionMasked == 6 && event.getPointerId(event.getActionIndex()) == this.touchDownId) {
                    m67108g();
                }
            } else if (this.touchDownId == -1) {
                float x = event.getX(event.getActionIndex());
                float y = event.getY(event.getActionIndex());
                if (x >= 0.0f && x <= getWidth() && y >= 0.0f && y <= getHeight()) {
                    m67116o(event);
                }
            }
        }
        return super.onTouchEvent(event);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int visibility) {
        super.onWindowVisibilityChanged(visibility);
        bbj bbjVar = this.helper;
        if (bbjVar == null) {
            Intrinsics.m87502r("helper");
            bbjVar = null;
        }
        zrl zrlVar = bbjVar.iFxViewLifecycle;
        if (zrlVar != null) {
            zrlVar.mo145304c(visibility);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m67117p() {
        View viewM67112k = m67112k();
        if (viewM67112k == null) {
            viewM67112k = m67111j();
        }
        this._childFxView = viewM67112k;
        if (viewM67112k == null) {
            qkq0.m175383a("initFxView -> Error,check your layoutId or layoutView.");
            return;
        }
        m67115n();
        setClickable(true);
        this.scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        bbj bbjVar = this.helper;
        if (bbjVar == null) {
            Intrinsics.m87502r("helper");
            bbjVar = null;
        }
        zrl zrlVar = bbjVar.iFxViewLifecycle;
        if (zrlVar != null) {
            zrlVar.mo145306e(this);
        }
        setBackgroundColor(0);
    }

    /* JADX INFO: renamed from: q */
    public final boolean m67118q() {
        boolean z = getX() < this.mParentWidth / 2.0f;
        this.isNearestLeft = z;
        return z;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m67119r() {
        return System.currentTimeMillis() - this.mLastTouchDownTime < 150;
    }

    @JvmOverloads
    /* JADX INFO: renamed from: s */
    public final void m67120s(float x, float y, boolean useAnimation) {
        float fM140782a = jbj.m140782a(x, this.minWBoundary, this.maxWBoundary);
        float fM140782a2 = jbj.m140782a(y, this.minHBoundary, this.maxHBoundary);
        if (useAnimation) {
            m67122v(fM140782a, fM140782a2);
        } else {
            setX(x);
            setY(y);
        }
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m67121t(boolean isLeft, boolean isUpdateBoundary) {
        if (this.isMoveLoading) {
            return;
        }
        if (isUpdateBoundary) {
            m67125y(false);
        }
        bbj bbjVar = this.helper;
        if (bbjVar == null) {
            Intrinsics.m87502r("helper");
            bbjVar = null;
        }
        if (!bbjVar.enableEdgeAdsorption) {
            m67122v(jbj.m140782a(getX(), this.minWBoundary, this.maxWBoundary), jbj.m140782a(getY(), this.minHBoundary, this.maxHBoundary));
        } else {
            m67122v(isLeft ? this.minWBoundary : this.maxWBoundary, jbj.m140782a(getY(), this.minHBoundary, this.maxHBoundary));
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m67122v(float moveX, float moveY) {
        this.isMoveLoading = true;
        if (moveX == getX() && moveY == getY()) {
            this.isMoveLoading = false;
            return;
        }
        this.mMoveAnimator.m67127a(moveX, moveY);
        this.currentX = moveX;
        this.currentY = moveY;
        m67124x(moveX, moveY);
    }

    /* JADX INFO: renamed from: w */
    public final void m67123w(int w, int h) {
        if (m67107B(w, h)) {
            m67105u(this, false, false, 1, null);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m67124x(float moveX, float moveY) {
        bbj bbjVar = this.helper;
        if (bbjVar == null) {
            Intrinsics.m87502r("helper");
            bbjVar = null;
        }
        wrl wrlVar = bbjVar.iFxConfigStorage;
        if (wrlVar != null) {
            wrlVar.mo110645a(moveX, moveY);
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m67125y(boolean isDownTouchInit) {
        float f;
        float t;
        float b;
        float l2;
        float r = 0.0f;
        bbj bbjVar = null;
        if (isDownTouchInit) {
            f = 0.0f;
        } else {
            bbj bbjVar2 = this.helper;
            if (bbjVar2 == null) {
                Intrinsics.m87502r("helper");
                bbjVar2 = null;
            }
            f = bbjVar2.edgeOffset;
        }
        if (isDownTouchInit) {
            t = 0.0f;
        } else {
            bbj bbjVar3 = this.helper;
            if (bbjVar3 == null) {
                Intrinsics.m87502r("helper");
                bbjVar3 = null;
            }
            t = bbjVar3.fxBorderMargin.getCom.clevertap.android.sdk.Constants.KEY_T java.lang.String() + f;
        }
        if (isDownTouchInit) {
            b = 0.0f;
        } else {
            bbj bbjVar4 = this.helper;
            if (bbjVar4 == null) {
                Intrinsics.m87502r("helper");
                bbjVar4 = null;
            }
            b = bbjVar4.fxBorderMargin.getB() + f;
        }
        if (isDownTouchInit) {
            l2 = 0.0f;
        } else {
            bbj bbjVar5 = this.helper;
            if (bbjVar5 == null) {
                Intrinsics.m87502r("helper");
                bbjVar5 = null;
            }
            l2 = bbjVar5.fxBorderMargin.getCom.p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType.l java.lang.String() + f;
        }
        if (!isDownTouchInit) {
            bbj bbjVar6 = this.helper;
            if (bbjVar6 == null) {
                Intrinsics.m87502r("helper");
                bbjVar6 = null;
            }
            r = bbjVar6.fxBorderMargin.getR() + f;
        }
        this.minWBoundary = l2;
        this.maxWBoundary = this.mParentWidth - r;
        bbj bbjVar7 = this.helper;
        if (bbjVar7 == null) {
            Intrinsics.m87502r("helper");
            bbjVar7 = null;
        }
        this.minHBoundary = bbjVar7.statsBarHeight + t;
        float f2 = this.mParentHeight;
        bbj bbjVar8 = this.helper;
        if (bbjVar8 == null) {
            Intrinsics.m87502r("helper");
        } else {
            bbjVar = bbjVar8;
        }
        this.maxHBoundary = (f2 - bbjVar.navigationBarHeight) - b;
    }

    /* JADX INFO: renamed from: z */
    public final void m67126z(MotionEvent event, int pointIndex) {
        float fM140782a = jbj.m140782a((getX() + event.getX(pointIndex)) - this.downTouchX, this.minWBoundary, this.maxWBoundary);
        float fM140782a2 = jbj.m140782a((getY() + event.getY(pointIndex)) - this.downTouchY, this.minHBoundary, this.maxHBoundary);
        setX(fM140782a);
        setY(fM140782a2);
        bbj bbjVar = this.helper;
        if (bbjVar == null) {
            Intrinsics.m87502r("helper");
            bbjVar = null;
        }
        yrl yrlVar = bbjVar.iFxScrollListener;
        if (yrlVar != null) {
            yrlVar.mo135255a(get_childFxView(), event, fM140782a, fM140782a2);
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
