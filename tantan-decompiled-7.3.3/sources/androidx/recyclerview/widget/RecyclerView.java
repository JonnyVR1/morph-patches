package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.customview.view.AbsSavedState;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.gms.common.api.Api;
import com.p074ss.bytertc.engine.type.ErrorCode;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import p153l.C15967bc;
import p153l.C16932fb;
import p153l.C17188gb;
import p153l.bi20;
import p153l.cej0;
import p153l.eic0;
import p153l.jj5;
import p153l.kj80;
import p153l.kkl0;
import p153l.mce;
import p153l.mee0;
import p153l.mke;
import p153l.n8c0;
import p153l.nkl0;
import p153l.qac0;
import p153l.qg50;
import p153l.rrc0;
import p153l.src0;
import p153l.trc0;
import p153l.trq;
import p153l.u610;
import p153l.uid0;
import p153l.urc0;
import p153l.vic0;
import p153l.wg3;
import p153l.wmw;
import p153l.wtq0;
import p153l.wwq0;
import p153l.xtq0;
import p153l.yg3;
import p153l.yn80;
import p153l.zh20;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements mee0, zh20 {
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    private static final float FLING_DESTRETCH_FACTOR = 4.0f;
    static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final float INFLEXION = 0.35f;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    static final int MAX_SCROLL_DURATION = 2000;
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    private static final float SCROLL_FRICTION = 0.015f;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    static boolean sDebugAssertionsEnabled = false;
    static final C0563b0 sDefaultEdgeEffectFactory;
    static final Interpolator sQuinticInterpolator;
    static boolean sVerboseLoggingEnabled = false;
    C0616t mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    Adapter mAdapter;
    C0597a mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private InterfaceC0574j mChildDrawingOrderCallback;
    C0601e mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;

    @NonNull
    private C0575k mEdgeEffectFactory;
    boolean mEnableFastScroller;

    @VisibleForTesting
    boolean mFirstLayoutComplete;
    RunnableC0606j mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private InterfaceC0583s mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    AbstractC0576l mItemAnimator;
    private AbstractC0576l.b mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList<AbstractC0578n> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastAutoMeasureNonExactMeasuredHeight;
    private int mLastAutoMeasureNonExactMeasuredWidth;
    private boolean mLastAutoMeasureSkippedDueToExact;
    private int mLastTouchX;
    private int mLastTouchY;

    @VisibleForTesting
    AbstractC0579o mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final C0588x mObserver;
    private List<InterfaceC0581q> mOnChildAttachStateListeners;
    private AbstractC0582r mOnFlingListener;
    private final ArrayList<InterfaceC0583s> mOnItemTouchListeners;

    @VisibleForTesting
    final List<AbstractC0569e0> mPendingAccessibilityImportanceChange;
    SavedState mPendingSavedState;
    private final float mPhysicalCoef;
    boolean mPostedAnimatorRunner;
    RunnableC0606j.b mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final C0586v mRecycler;
    InterfaceC0587w mRecyclerListener;
    final List<InterfaceC0587w> mRecyclerListeners;
    final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private AbstractC0584t mScrollListener;
    private List<AbstractC0584t> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private bi20 mScrollingChildHelper;
    final C0561a0 mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final RunnableC0567d0 mViewFlinger;
    private final C0621y.b mViewInfoProcessCallback;
    final C0621y mViewInfoStore;
    private static final int[] NESTED_SCROLLING_ATTRS = {R.attr.nestedScrollingEnabled};
    private static final float DECELERATION_RATE = (float) (Math.log(0.78d) / Math.log(0.9d));
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST = false;
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = true;
    static final boolean POST_UPDATES_ON_ANIMATION = true;
    static final boolean ALLOW_THREAD_GAP_WORK = true;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION = false;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD = false;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$a */
    public class RunnableC0560a implements Runnable {
        public RunnableC0560a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.mFirstLayoutComplete || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.mIsAttached) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.mLayoutSuppressed) {
                recyclerView2.mLayoutWasDefered = true;
            } else {
                recyclerView2.consumePendingUpdateOperations();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$a0 */
    public static class C0561a0 {

        /* JADX INFO: renamed from: b */
        public SparseArray<Object> f2569b;

        /* JADX INFO: renamed from: m */
        public int f2580m;

        /* JADX INFO: renamed from: n */
        public long f2581n;

        /* JADX INFO: renamed from: o */
        public int f2582o;

        /* JADX INFO: renamed from: p */
        public int f2583p;

        /* JADX INFO: renamed from: q */
        public int f2584q;

        /* JADX INFO: renamed from: a */
        public int f2568a = -1;

        /* JADX INFO: renamed from: c */
        public int f2570c = 0;

        /* JADX INFO: renamed from: d */
        public int f2571d = 0;

        /* JADX INFO: renamed from: e */
        public int f2572e = 1;

        /* JADX INFO: renamed from: f */
        public int f2573f = 0;

        /* JADX INFO: renamed from: g */
        public boolean f2574g = false;

        /* JADX INFO: renamed from: h */
        public boolean f2575h = false;

        /* JADX INFO: renamed from: i */
        public boolean f2576i = false;

        /* JADX INFO: renamed from: j */
        public boolean f2577j = false;

        /* JADX INFO: renamed from: k */
        public boolean f2578k = false;

        /* JADX INFO: renamed from: l */
        public boolean f2579l = false;

        /* JADX INFO: renamed from: a */
        public void m3359a(int i) {
            if ((this.f2572e & i) != 0) {
                return;
            }
            uid0.m196153a("Layout state should be one of ", Integer.toBinaryString(i), " but it is ", Integer.toBinaryString(this.f2572e));
        }

        /* JADX INFO: renamed from: b */
        public boolean m3360b() {
            return this.f2574g;
        }

        /* JADX INFO: renamed from: c */
        public int m3361c() {
            return this.f2575h ? this.f2570c - this.f2571d : this.f2573f;
        }

        /* JADX INFO: renamed from: d */
        public int m3362d() {
            return this.f2568a;
        }

        /* JADX INFO: renamed from: e */
        public boolean m3363e() {
            return this.f2568a != -1;
        }

        /* JADX INFO: renamed from: f */
        public boolean m3364f() {
            return this.f2575h;
        }

        /* JADX INFO: renamed from: g */
        public void m3365g(Adapter adapter) {
            this.f2572e = 1;
            this.f2573f = adapter.getItemCount();
            this.f2575h = false;
            this.f2576i = false;
            this.f2577j = false;
        }

        /* JADX INFO: renamed from: h */
        public boolean m3366h() {
            return this.f2579l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f2568a + ", mData=" + this.f2569b + ", mItemCount=" + this.f2573f + ", mIsMeasuring=" + this.f2577j + ", mPreviousLayoutItemCount=" + this.f2570c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f2571d + ", mStructureChanged=" + this.f2574g + ", mInPreLayout=" + this.f2575h + ", mRunSimpleAnimations=" + this.f2578k + ", mRunPredictiveAnimations=" + this.f2579l + '}';
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$b */
    public class RunnableC0562b implements Runnable {
        public RunnableC0562b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0576l abstractC0576l = RecyclerView.this.mItemAnimator;
            if (abstractC0576l != null) {
                abstractC0576l.runPendingAnimations();
            }
            RecyclerView.this.mPostedAnimatorRunner = false;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$b0 */
    public static class C0563b0 extends C0575k {
        @Override // androidx.recyclerview.widget.RecyclerView.C0575k
        @NonNull
        /* JADX INFO: renamed from: a */
        public EdgeEffect mo3367a(@NonNull RecyclerView recyclerView, int i) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$c */
    public class InterpolatorC0564c implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$c0 */
    public static abstract class AbstractC0565c0 {
        @Nullable
        /* JADX INFO: renamed from: a */
        public abstract View m3368a(@NonNull C0586v c0586v, int i, int i2);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$d */
    public class C0566d implements C0621y.b {
        public C0566d() {
        }

        @Override // androidx.recyclerview.widget.C0621y.b
        /* JADX INFO: renamed from: a */
        public void mo3369a(AbstractC0569e0 abstractC0569e0, AbstractC0576l.c cVar, AbstractC0576l.c cVar2) {
            RecyclerView.this.animateAppearance(abstractC0569e0, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.C0621y.b
        /* JADX INFO: renamed from: b */
        public void mo3370b(AbstractC0569e0 abstractC0569e0) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mLayout.removeAndRecycleView(abstractC0569e0.itemView, recyclerView.mRecycler);
        }

        @Override // androidx.recyclerview.widget.C0621y.b
        /* JADX INFO: renamed from: c */
        public void mo3371c(AbstractC0569e0 abstractC0569e0, @NonNull AbstractC0576l.c cVar, @Nullable AbstractC0576l.c cVar2) {
            RecyclerView.this.mRecycler.m3457O(abstractC0569e0);
            RecyclerView.this.animateDisappearance(abstractC0569e0, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.C0621y.b
        /* JADX INFO: renamed from: d */
        public void mo3372d(AbstractC0569e0 abstractC0569e0, @NonNull AbstractC0576l.c cVar, @NonNull AbstractC0576l.c cVar2) {
            abstractC0569e0.setIsRecyclable(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mDataSetHasChangedAfterLayout) {
                if (recyclerView.mItemAnimator.animateChange(abstractC0569e0, abstractC0569e0, cVar, cVar2)) {
                    RecyclerView.this.postAnimationRunner();
                }
            } else if (recyclerView.mItemAnimator.animatePersistence(abstractC0569e0, cVar, cVar2)) {
                RecyclerView.this.postAnimationRunner();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$d0 */
    public class RunnableC0567d0 implements Runnable {

        /* JADX INFO: renamed from: a */
        public int f2587a;

        /* JADX INFO: renamed from: b */
        public int f2588b;

        /* JADX INFO: renamed from: c */
        public OverScroller f2589c;

        /* JADX INFO: renamed from: d */
        public Interpolator f2590d;

        /* JADX INFO: renamed from: e */
        public boolean f2591e;

        /* JADX INFO: renamed from: f */
        public boolean f2592f;

        public RunnableC0567d0() {
            Interpolator interpolator = RecyclerView.sQuinticInterpolator;
            this.f2590d = interpolator;
            this.f2591e = false;
            this.f2592f = false;
            this.f2589c = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        /* JADX INFO: renamed from: a */
        public final int m3373a(int i, int i2) {
            int iAbs = Math.abs(i);
            int iAbs2 = Math.abs(i2);
            boolean z = iAbs > iAbs2;
            RecyclerView recyclerView = RecyclerView.this;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z) {
                iAbs = iAbs2;
            }
            return Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }

        /* JADX INFO: renamed from: b */
        public void m3374b(int i, int i2) {
            RecyclerView.this.setScrollState(2);
            this.f2588b = 0;
            this.f2587a = 0;
            Interpolator interpolator = this.f2590d;
            Interpolator interpolator2 = RecyclerView.sQuinticInterpolator;
            if (interpolator != interpolator2) {
                this.f2590d = interpolator2;
                this.f2589c = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f2589c.fling(0, 0, i, i2, Integer.MIN_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER, Integer.MIN_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER);
            m3376d();
        }

        /* JADX INFO: renamed from: c */
        public final void m3375c() {
            RecyclerView.this.removeCallbacks(this);
            kkl0.m150148b0(RecyclerView.this, this);
        }

        /* JADX INFO: renamed from: d */
        public void m3376d() {
            if (this.f2591e) {
                this.f2592f = true;
            } else {
                m3375c();
            }
        }

        /* JADX INFO: renamed from: e */
        public void m3377e(int i, int i2, int i3, @Nullable Interpolator interpolator) {
            if (i3 == Integer.MIN_VALUE) {
                i3 = m3373a(i, i2);
            }
            int i4 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.sQuinticInterpolator;
            }
            if (this.f2590d != interpolator) {
                this.f2590d = interpolator;
                this.f2589c = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f2588b = 0;
            this.f2587a = 0;
            RecyclerView.this.setScrollState(2);
            this.f2589c.startScroll(0, 0, i, i2, i4);
            m3376d();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            int i2;
            int i3;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mLayout == null) {
                stop();
                return;
            }
            this.f2592f = false;
            this.f2591e = true;
            recyclerView.consumePendingUpdateOperations();
            OverScroller overScroller = this.f2589c;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i4 = currX - this.f2587a;
                int i5 = currY - this.f2588b;
                this.f2587a = currX;
                this.f2588b = currY;
                int iConsumeFlingInHorizontalStretch = RecyclerView.this.consumeFlingInHorizontalStretch(i4);
                int iConsumeFlingInVerticalStretch = RecyclerView.this.consumeFlingInVerticalStretch(i5);
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.mReusableIntPair;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.dispatchNestedPreScroll(iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.mReusableIntPair;
                    iConsumeFlingInHorizontalStretch -= iArr2[0];
                    iConsumeFlingInVerticalStretch -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.considerReleasingGlowsOnScroll(iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.mAdapter != null) {
                    int[] iArr3 = recyclerView3.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.scrollStep(iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.mReusableIntPair;
                    int i6 = iArr4[0];
                    int i7 = iArr4[1];
                    iConsumeFlingInHorizontalStretch -= i6;
                    iConsumeFlingInVerticalStretch -= i7;
                    AbstractC0590z abstractC0590z = recyclerView4.mLayout.mSmoothScroller;
                    if (abstractC0590z != null && !abstractC0590z.isPendingInitialRun() && abstractC0590z.isRunning()) {
                        int iM3361c = RecyclerView.this.mState.m3361c();
                        if (iM3361c == 0) {
                            abstractC0590z.stop();
                        } else if (abstractC0590z.getTargetPosition() >= iM3361c) {
                            abstractC0590z.setTargetPosition(iM3361c - 1);
                            abstractC0590z.onAnimation(i6, i7);
                        } else {
                            abstractC0590z.onAnimation(i6, i7);
                        }
                    }
                    i2 = i7;
                    i = i6;
                } else {
                    i = 0;
                    i2 = 0;
                }
                int i8 = iConsumeFlingInHorizontalStretch;
                int i9 = iConsumeFlingInVerticalStretch;
                if (!RecyclerView.this.mItemDecorations.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.mReusableIntPair;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.dispatchNestedScroll(i, i2, i8, i9, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.mReusableIntPair;
                int i10 = i8 - iArr6[0];
                int i11 = i9 - iArr6[1];
                if (i != 0 || i2 != 0) {
                    recyclerView6.dispatchOnScrolled(i, i2);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i10 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i11 != 0));
                AbstractC0590z abstractC0590z2 = RecyclerView.this.mLayout.mSmoothScroller;
                if ((abstractC0590z2 == null || !abstractC0590z2.isPendingInitialRun()) && z) {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        if (i10 < 0) {
                            i3 = -currVelocity;
                        } else {
                            i3 = i10 > 0 ? currVelocity : 0;
                        }
                        if (i11 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i11 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.absorbGlows(i3, currVelocity);
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                        RecyclerView.this.mPrefetchRegistry.m3739b();
                    }
                } else {
                    m3376d();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    RunnableC0606j runnableC0606j = recyclerView7.mGapWorker;
                    if (runnableC0606j != null) {
                        runnableC0606j.m3733f(recyclerView7, i, i2);
                    }
                }
            }
            AbstractC0590z abstractC0590z3 = RecyclerView.this.mLayout.mSmoothScroller;
            if (abstractC0590z3 != null && abstractC0590z3.isPendingInitialRun()) {
                abstractC0590z3.onAnimation(0, 0);
            }
            this.f2591e = false;
            if (this.f2592f) {
                m3375c();
            } else {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.stopNestedScroll(1);
            }
        }

        public void stop() {
            RecyclerView.this.removeCallbacks(this);
            this.f2589c.abortAnimation();
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$e */
    public class C0568e implements C0601e.b {
        public C0568e() {
        }

        @Override // androidx.recyclerview.widget.C0601e.b
        /* JADX INFO: renamed from: a */
        public View mo3378a(int i) {
            return RecyclerView.this.getChildAt(i);
        }

        @Override // androidx.recyclerview.widget.C0601e.b
        /* JADX INFO: renamed from: b */
        public void mo3379b(View view) {
            AbstractC0569e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onEnteredHiddenState(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.C0601e.b
        /* JADX INFO: renamed from: c */
        public int mo3380c() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.C0601e.b
        /* JADX INFO: renamed from: d */
        public AbstractC0569e0 mo3381d(View view) {
            return RecyclerView.getChildViewHolderInt(view);
        }

        @Override // androidx.recyclerview.widget.C0601e.b
        /* JADX INFO: renamed from: e */
        public void mo3382e(View view, int i) {
            RecyclerView.this.addView(view, i);
            RecyclerView.this.dispatchChildAttached(view);
        }

        @Override // androidx.recyclerview.widget.C0601e.b
        /* JADX INFO: renamed from: f */
        public void mo3383f() {
            int iMo3380c = mo3380c();
            for (int i = 0; i < iMo3380c; i++) {
                View viewMo3378a = mo3378a(i);
                RecyclerView.this.dispatchChildDetached(viewMo3378a);
                viewMo3378a.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.C0601e.b
        /* JADX INFO: renamed from: g */
        public void mo3384g(View view, int i, ViewGroup.LayoutParams layoutParams) {
            AbstractC0569e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                if (!childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                    StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                    sb.append(childViewHolderInt);
                    trc0.m192469a(sb, RecyclerView.this.exceptionLabel());
                    return;
                } else {
                    if (RecyclerView.sVerboseLoggingEnabled) {
                        childViewHolderInt.toString();
                    }
                    childViewHolderInt.clearTmpDetachFlag();
                }
            } else if (RecyclerView.sDebugAssertionsEnabled) {
                StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
                sb2.append(view);
                String strExceptionLabel = RecyclerView.this.exceptionLabel();
                sb2.append(", index: ");
                sb2.append(i);
                sb2.append(strExceptionLabel);
                throw new IllegalArgumentException(sb2.toString());
            }
            RecyclerView.this.attachViewToParent(view, i, layoutParams);
        }

        @Override // androidx.recyclerview.widget.C0601e.b
        /* JADX INFO: renamed from: h */
        public void mo3385h(int i) {
            View viewMo3378a = mo3378a(i);
            if (viewMo3378a != null) {
                AbstractC0569e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(viewMo3378a);
                if (childViewHolderInt != null) {
                    if (childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                        StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                        sb.append(childViewHolderInt);
                        trc0.m192469a(sb, RecyclerView.this.exceptionLabel());
                        return;
                    } else {
                        if (RecyclerView.sVerboseLoggingEnabled) {
                            childViewHolderInt.toString();
                        }
                        childViewHolderInt.addFlags(256);
                    }
                }
            } else if (RecyclerView.sDebugAssertionsEnabled) {
                vic0.m201333a("No view at offset ", i, RecyclerView.this.exceptionLabel());
                return;
            }
            RecyclerView.this.detachViewFromParent(i);
        }

        @Override // androidx.recyclerview.widget.C0601e.b
        /* JADX INFO: renamed from: i */
        public int mo3386i(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // androidx.recyclerview.widget.C0601e.b
        /* JADX INFO: renamed from: j */
        public void mo3387j(View view) {
            AbstractC0569e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onLeftHiddenState(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.C0601e.b
        /* JADX INFO: renamed from: k */
        public void mo3388k(int i) {
            View childAt = RecyclerView.this.getChildAt(i);
            if (childAt != null) {
                RecyclerView.this.dispatchChildDetached(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$e0 */
    public static abstract class AbstractC0569e0 {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.EMPTY_LIST;
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;

        @NonNull
        public final View itemView;
        Adapter<? extends AbstractC0569e0> mBindingAdapter;
        int mFlags;
        WeakReference<RecyclerView> mNestedRecyclerView;
        RecyclerView mOwnerRecyclerView;
        int mPosition = -1;
        int mOldPosition = -1;
        long mItemId = -1;
        int mItemViewType = -1;
        int mPreLayoutPosition = -1;
        AbstractC0569e0 mShadowedHolder = null;
        AbstractC0569e0 mShadowingHolder = null;
        List<Object> mPayloads = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mIsRecyclableCount = 0;
        C0586v mScrapContainer = null;
        boolean mInChangeScrap = false;
        private int mWasImportantForAccessibilityBeforeHidden = 0;

        @VisibleForTesting
        int mPendingAccessibilityState = -1;

        public AbstractC0569e0(@NonNull View view) {
            if (view != null) {
                this.itemView = view;
            } else {
                wg3.m206174a("itemView may not be null");
                throw null;
            }
        }

        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        public void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(1024);
            } else if ((1024 & this.mFlags) == 0) {
                createPayloadsIfNeeded();
                this.mPayloads.add(obj);
            }
        }

        public void addFlags(int i) {
            this.mFlags = i | this.mFlags;
        }

        public void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        public void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= ErrorCode.ERROR_CODE_JOIN_ROOM_ROOM_FORBIDDEN;
        }

        public void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        public void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        public boolean doesTransientStatePreventRecycling() {
            return (this.mFlags & 16) == 0 && kkl0.m150131M(this.itemView);
        }

        public void flagRemovedAndOffsetPosition(int i, int i2, boolean z) {
            addFlags(8);
            offsetPosition(i2, z);
            this.mPosition = i;
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.getAdapterPositionInRecyclerView(this);
        }

        @Deprecated
        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        @Nullable
        public final Adapter<? extends AbstractC0569e0> getBindingAdapter() {
            return this.mBindingAdapter;
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            Adapter adapter;
            int adapterPositionInRecyclerView;
            if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (adapterPositionInRecyclerView = this.mOwnerRecyclerView.getAdapterPositionInRecyclerView(this)) == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, adapterPositionInRecyclerView);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i = this.mPreLayoutPosition;
            return i == -1 ? this.mPosition : i;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i = this.mPreLayoutPosition;
            return i == -1 ? this.mPosition : i;
        }

        public List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & 1024) != 0) {
                return FULLUPDATE_PAYLOADS;
            }
            List<Object> list = this.mPayloads;
            return (list == null || list.size() == 0) ? FULLUPDATE_PAYLOADS : this.mUnmodifiedPayloads;
        }

        public boolean hasAnyOfTheFlags(int i) {
            return (this.mFlags & i) != 0;
        }

        public boolean isAdapterPositionUnknown() {
            return (this.mFlags & 512) != 0 || isInvalid();
        }

        public boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        public boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        public boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            return (this.mFlags & 16) == 0 && !kkl0.m150131M(this.itemView);
        }

        public boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        public boolean isScrap() {
            return this.mScrapContainer != null;
        }

        public boolean isTmpDetached() {
            return (this.mFlags & 256) != 0;
        }

        public boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        public boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        public void offsetPosition(int i, boolean z) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z) {
                this.mPreLayoutPosition += i;
            }
            this.mPosition += i;
            if (this.itemView.getLayoutParams() != null) {
                ((C0580p) this.itemView.getLayoutParams()).f2610c = true;
            }
        }

        public void onEnteredHiddenState(RecyclerView recyclerView) {
            int i = this.mPendingAccessibilityState;
            if (i != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i;
            } else {
                this.mWasImportantForAccessibilityBeforeHidden = kkl0.m150187v(this.itemView);
            }
            recyclerView.setChildImportantForAccessibilityInternal(this, 4);
        }

        public void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.setChildImportantForAccessibilityInternal(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        public void resetInternal() {
            if (RecyclerView.sDebugAssertionsEnabled && isTmpDetached()) {
                wmw.m207134a("Attempting to reset temp-detached ViewHolder: ", this, ". ViewHolders should be fully detached before resetting.");
                return;
            }
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        }

        public void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        public void setFlags(int i, int i2) {
            this.mFlags = (i & i2) | (this.mFlags & (~i2));
        }

        public final void setIsRecyclable(boolean z) {
            int i = this.mIsRecyclableCount;
            int i2 = z ? i - 1 : i + 1;
            this.mIsRecyclableCount = i2;
            if (i2 < 0) {
                this.mIsRecyclableCount = 0;
                if (RecyclerView.sDebugAssertionsEnabled) {
                    mce.m157919a("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ", this);
                    return;
                } else {
                    Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                }
            } else if (!z && i2 == 1) {
                this.mFlags |= 16;
            } else if (z && i2 == 0) {
                this.mFlags &= -17;
            }
            if (RecyclerView.sVerboseLoggingEnabled) {
                toString();
            }
        }

        public void setScrapContainer(C0586v c0586v, boolean z) {
            this.mScrapContainer = c0586v;
            this.mInChangeScrap = z;
        }

        public boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        public boolean shouldIgnore() {
            return (this.mFlags & 128) != 0;
        }

        public void stopIgnoring() {
            this.mFlags &= -129;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.mPosition + " id=" + this.mItemId + ", oldPos=" + this.mOldPosition + ", pLpos:" + this.mPreLayoutPosition);
            if (isScrap()) {
                sb.append(" scrap ");
                sb.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
            }
            if (isInvalid()) {
                sb.append(" invalid");
            }
            if (!isBound()) {
                sb.append(" unbound");
            }
            if (needsUpdate()) {
                sb.append(" update");
            }
            if (isRemoved()) {
                sb.append(" removed");
            }
            if (shouldIgnore()) {
                sb.append(" ignored");
            }
            if (isTmpDetached()) {
                sb.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        public void unScrap() {
            this.mScrapContainer.m3457O(this);
        }

        public boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$f */
    public class C0570f implements C0597a.a {
        public C0570f() {
        }

        @Override // androidx.recyclerview.widget.C0597a.a
        /* JADX INFO: renamed from: a */
        public void mo3389a(int i, int i2) {
            RecyclerView.this.offsetPositionRecordsForMove(i, i2);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // androidx.recyclerview.widget.C0597a.a
        /* JADX INFO: renamed from: b */
        public void mo3390b(C0597a.b bVar) {
            m3397i(bVar);
        }

        @Override // androidx.recyclerview.widget.C0597a.a
        /* JADX INFO: renamed from: c */
        public void mo3391c(C0597a.b bVar) {
            m3397i(bVar);
        }

        @Override // androidx.recyclerview.widget.C0597a.a
        /* JADX INFO: renamed from: d */
        public AbstractC0569e0 mo3392d(int i) {
            AbstractC0569e0 abstractC0569e0FindViewHolderForPosition = RecyclerView.this.findViewHolderForPosition(i, true);
            if (abstractC0569e0FindViewHolderForPosition == null) {
                return null;
            }
            if (!RecyclerView.this.mChildHelper.m3665n(abstractC0569e0FindViewHolderForPosition.itemView)) {
                return abstractC0569e0FindViewHolderForPosition;
            }
            int i2 = RecyclerView.HORIZONTAL;
            return null;
        }

        @Override // androidx.recyclerview.widget.C0597a.a
        /* JADX INFO: renamed from: e */
        public void mo3393e(int i, int i2) {
            RecyclerView.this.offsetPositionRecordsForInsert(i, i2);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // androidx.recyclerview.widget.C0597a.a
        /* JADX INFO: renamed from: f */
        public void mo3394f(int i, int i2) {
            RecyclerView.this.offsetPositionRecordsForRemove(i, i2, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mItemsAddedOrRemoved = true;
            recyclerView.mState.f2571d += i2;
        }

        @Override // androidx.recyclerview.widget.C0597a.a
        /* JADX INFO: renamed from: g */
        public void mo3395g(int i, int i2) {
            RecyclerView.this.offsetPositionRecordsForRemove(i, i2, false);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // androidx.recyclerview.widget.C0597a.a
        /* JADX INFO: renamed from: h */
        public void mo3396h(int i, int i2, Object obj) {
            RecyclerView.this.viewRangeUpdate(i, i2, obj);
            RecyclerView.this.mItemsChanged = true;
        }

        /* JADX INFO: renamed from: i */
        public void m3397i(C0597a.b bVar) {
            int i = bVar.f2686a;
            if (i == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.mLayout.onItemsAdded(recyclerView, bVar.f2687b, bVar.f2689d);
                return;
            }
            if (i == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.mLayout.onItemsRemoved(recyclerView2, bVar.f2687b, bVar.f2689d);
            } else if (i == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.mLayout.onItemsUpdated(recyclerView3, bVar.f2687b, bVar.f2689d, bVar.f2688c);
            } else {
                if (i != 8) {
                    return;
                }
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.mLayout.onItemsMoved(recyclerView4, bVar.f2687b, bVar.f2689d, 1);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$g */
    public static /* synthetic */ class C0571g {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f2596a;

        static {
            int[] iArr = new int[Adapter.StateRestorationPolicy.values().length];
            f2596a = iArr;
            try {
                iArr[Adapter.StateRestorationPolicy.PREVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2596a[Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$h */
    public static class C0572h extends Observable<AbstractC0573i> {
        /* JADX INFO: renamed from: a */
        public boolean m3398a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        /* JADX INFO: renamed from: b */
        public void m3399b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC0573i) ((Observable) this).mObservers.get(size)).onChanged();
            }
        }

        /* JADX INFO: renamed from: c */
        public void m3400c(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC0573i) ((Observable) this).mObservers.get(size)).onItemRangeMoved(i, i2, 1);
            }
        }

        /* JADX INFO: renamed from: d */
        public void m3401d(int i, int i2) {
            m3402e(i, i2, null);
        }

        /* JADX INFO: renamed from: e */
        public void m3402e(int i, int i2, @Nullable Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC0573i) ((Observable) this).mObservers.get(size)).onItemRangeChanged(i, i2, obj);
            }
        }

        /* JADX INFO: renamed from: f */
        public void m3403f(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC0573i) ((Observable) this).mObservers.get(size)).onItemRangeInserted(i, i2);
            }
        }

        /* JADX INFO: renamed from: g */
        public void m3404g(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC0573i) ((Observable) this).mObservers.get(size)).onItemRangeRemoved(i, i2);
            }
        }

        /* JADX INFO: renamed from: h */
        public void m3405h() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC0573i) ((Observable) this).mObservers.get(size)).onStateRestorationPolicyChanged();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$j */
    public interface InterfaceC0574j {
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$k */
    public static class C0575k {
        @NonNull
        /* JADX INFO: renamed from: a */
        public EdgeEffect mo3367a(@NonNull RecyclerView recyclerView, int i) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$m */
    public class C0577m implements AbstractC0576l.b {
        public C0577m() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576l.b
        /* JADX INFO: renamed from: a */
        public void mo3407a(AbstractC0569e0 abstractC0569e0) {
            abstractC0569e0.setIsRecyclable(true);
            if (abstractC0569e0.mShadowedHolder != null && abstractC0569e0.mShadowingHolder == null) {
                abstractC0569e0.mShadowedHolder = null;
            }
            abstractC0569e0.mShadowingHolder = null;
            if (abstractC0569e0.shouldBeKeptAsChild() || RecyclerView.this.removeAnimatingView(abstractC0569e0.itemView) || !abstractC0569e0.isTmpDetached()) {
                return;
            }
            RecyclerView.this.removeDetachedView(abstractC0569e0.itemView, false);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$q */
    public interface InterfaceC0581q {
        /* JADX INFO: renamed from: b */
        void mo3422b(@NonNull View view);

        /* JADX INFO: renamed from: d */
        void mo3423d(@NonNull View view);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$r */
    public static abstract class AbstractC0582r {
        /* JADX INFO: renamed from: a */
        public abstract boolean mo3424a(int i, int i2);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$s */
    public interface InterfaceC0583s {
        /* JADX INFO: renamed from: a */
        void mo3425a(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent);

        /* JADX INFO: renamed from: c */
        boolean mo3426c(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent);

        /* JADX INFO: renamed from: e */
        void mo3427e(boolean z);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$t */
    public static abstract class AbstractC0584t {
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
        }

        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$u */
    public static class C0585u {

        /* JADX INFO: renamed from: a */
        public SparseArray<a> f2612a = new SparseArray<>();

        /* JADX INFO: renamed from: b */
        public int f2613b = 0;

        /* JADX INFO: renamed from: c */
        public Set<Adapter<?>> f2614c = Collections.newSetFromMap(new IdentityHashMap());

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$u$a */
        public static class a {

            /* JADX INFO: renamed from: a */
            public final ArrayList<AbstractC0569e0> f2615a = new ArrayList<>();

            /* JADX INFO: renamed from: b */
            public int f2616b = 5;

            /* JADX INFO: renamed from: c */
            public long f2617c = 0;

            /* JADX INFO: renamed from: d */
            public long f2618d = 0;
        }

        /* JADX INFO: renamed from: a */
        public void m3428a() {
            this.f2613b++;
        }

        /* JADX INFO: renamed from: b */
        public void m3429b(@NonNull Adapter<?> adapter) {
            this.f2614c.add(adapter);
        }

        /* JADX INFO: renamed from: c */
        public void m3430c() {
            for (int i = 0; i < this.f2612a.size(); i++) {
                a aVarValueAt = this.f2612a.valueAt(i);
                Iterator<AbstractC0569e0> it = aVarValueAt.f2615a.iterator();
                while (it.hasNext()) {
                    kj80.m150022a(it.next().itemView);
                }
                aVarValueAt.f2615a.clear();
            }
        }

        /* JADX INFO: renamed from: d */
        public void m3431d() {
            this.f2613b--;
        }

        /* JADX INFO: renamed from: e */
        public void m3432e(@NonNull Adapter<?> adapter, boolean z) {
            this.f2614c.remove(adapter);
            if (this.f2614c.size() != 0 || z) {
                return;
            }
            for (int i = 0; i < this.f2612a.size(); i++) {
                SparseArray<a> sparseArray = this.f2612a;
                ArrayList<AbstractC0569e0> arrayList = sparseArray.get(sparseArray.keyAt(i)).f2615a;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    kj80.m150022a(arrayList.get(i2).itemView);
                }
            }
        }

        /* JADX INFO: renamed from: f */
        public void m3433f(int i, long j) {
            a aVarM3436i = m3436i(i);
            aVarM3436i.f2618d = m3439l(aVarM3436i.f2618d, j);
        }

        /* JADX INFO: renamed from: g */
        public void m3434g(int i, long j) {
            a aVarM3436i = m3436i(i);
            aVarM3436i.f2617c = m3439l(aVarM3436i.f2617c, j);
        }

        @Nullable
        /* JADX INFO: renamed from: h */
        public AbstractC0569e0 m3435h(int i) {
            a aVar = this.f2612a.get(i);
            if (aVar == null || aVar.f2615a.isEmpty()) {
                return null;
            }
            ArrayList<AbstractC0569e0> arrayList = aVar.f2615a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).isAttachedToTransitionOverlay()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: i */
        public final a m3436i(int i) {
            a aVar = this.f2612a.get(i);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f2612a.put(i, aVar2);
            return aVar2;
        }

        /* JADX INFO: renamed from: j */
        public void m3437j(Adapter<?> adapter, Adapter<?> adapter2, boolean z) {
            if (adapter != null) {
                m3431d();
            }
            if (!z && this.f2613b == 0) {
                m3430c();
            }
            if (adapter2 != null) {
                m3428a();
            }
        }

        /* JADX INFO: renamed from: k */
        public void m3438k(AbstractC0569e0 abstractC0569e0) {
            int itemViewType = abstractC0569e0.getItemViewType();
            ArrayList<AbstractC0569e0> arrayList = m3436i(itemViewType).f2615a;
            if (this.f2612a.get(itemViewType).f2616b <= arrayList.size()) {
                kj80.m150022a(abstractC0569e0.itemView);
            } else if (RecyclerView.sDebugAssertionsEnabled && arrayList.contains(abstractC0569e0)) {
                wg3.m206174a("this scrap item already exists");
            } else {
                abstractC0569e0.resetInternal();
                arrayList.add(abstractC0569e0);
            }
        }

        /* JADX INFO: renamed from: l */
        public long m3439l(long j, long j2) {
            return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
        }

        /* JADX INFO: renamed from: m */
        public void m3440m(int i, int i2) {
            a aVarM3436i = m3436i(i);
            aVarM3436i.f2616b = i2;
            ArrayList<AbstractC0569e0> arrayList = aVarM3436i.f2615a;
            while (arrayList.size() > i2) {
                arrayList.remove(arrayList.size() - 1);
            }
        }

        /* JADX INFO: renamed from: n */
        public boolean m3441n(int i, long j, long j2) {
            long j3 = m3436i(i).f2618d;
            return j3 == 0 || j + j3 < j2;
        }

        /* JADX INFO: renamed from: o */
        public boolean m3442o(int i, long j, long j2) {
            long j3 = m3436i(i).f2617c;
            return j3 == 0 || j + j3 < j2;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$v */
    public final class C0586v {

        /* JADX INFO: renamed from: a */
        public final ArrayList<AbstractC0569e0> f2619a;

        /* JADX INFO: renamed from: b */
        public ArrayList<AbstractC0569e0> f2620b;

        /* JADX INFO: renamed from: c */
        public final ArrayList<AbstractC0569e0> f2621c;

        /* JADX INFO: renamed from: d */
        public final List<AbstractC0569e0> f2622d;

        /* JADX INFO: renamed from: e */
        public int f2623e;

        /* JADX INFO: renamed from: f */
        public int f2624f;

        /* JADX INFO: renamed from: g */
        public C0585u f2625g;

        /* JADX INFO: renamed from: h */
        public AbstractC0565c0 f2626h;

        public C0586v() {
            ArrayList<AbstractC0569e0> arrayList = new ArrayList<>();
            this.f2619a = arrayList;
            this.f2620b = null;
            this.f2621c = new ArrayList<>();
            this.f2622d = Collections.unmodifiableList(arrayList);
            this.f2623e = 2;
            this.f2624f = 2;
        }

        /* JADX INFO: renamed from: A */
        public void m3443A() {
            for (int i = 0; i < this.f2621c.size(); i++) {
                kj80.m150022a(this.f2621c.get(i).itemView);
            }
            m3444B(RecyclerView.this.mAdapter);
        }

        /* JADX INFO: renamed from: B */
        public final void m3444B(Adapter<?> adapter) {
            m3445C(adapter, false);
        }

        /* JADX INFO: renamed from: C */
        public final void m3445C(Adapter<?> adapter, boolean z) {
            C0585u c0585u = this.f2625g;
            if (c0585u != null) {
                c0585u.m3432e(adapter, z);
            }
        }

        /* JADX INFO: renamed from: D */
        public void m3446D(View view) {
            AbstractC0569e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.mScrapContainer = null;
            childViewHolderInt.mInChangeScrap = false;
            childViewHolderInt.clearReturnedFromScrapFlag();
            m3450H(childViewHolderInt);
        }

        /* JADX INFO: renamed from: E */
        public void m3447E() {
            for (int size = this.f2621c.size() - 1; size >= 0; size--) {
                m3448F(size);
            }
            this.f2621c.clear();
            if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                RecyclerView.this.mPrefetchRegistry.m3739b();
            }
        }

        /* JADX INFO: renamed from: F */
        public void m3448F(int i) {
            int i2 = RecyclerView.HORIZONTAL;
            AbstractC0569e0 abstractC0569e0 = this.f2621c.get(i);
            if (RecyclerView.sVerboseLoggingEnabled) {
                Objects.toString(abstractC0569e0);
            }
            m3461a(abstractC0569e0, true);
            this.f2621c.remove(i);
        }

        /* JADX INFO: renamed from: G */
        public void m3449G(@NonNull View view) {
            AbstractC0569e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (childViewHolderInt.isScrap()) {
                childViewHolderInt.unScrap();
            } else if (childViewHolderInt.wasReturnedFromScrap()) {
                childViewHolderInt.clearReturnedFromScrapFlag();
            }
            m3450H(childViewHolderInt);
            if (RecyclerView.this.mItemAnimator == null || childViewHolderInt.isRecyclable()) {
                return;
            }
            RecyclerView.this.mItemAnimator.endAnimation(childViewHolderInt);
        }

        /* JADX INFO: renamed from: H */
        public void m3450H(AbstractC0569e0 abstractC0569e0) {
            boolean z;
            boolean z2 = false;
            boolean z3 = true;
            if (abstractC0569e0.isScrap() || abstractC0569e0.itemView.getParent() != null) {
                StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(abstractC0569e0.isScrap());
                sb.append(" isAttached:");
                sb.append(abstractC0569e0.itemView.getParent() != null);
                sb.append(RecyclerView.this.exceptionLabel());
                throw new IllegalArgumentException(sb.toString());
            }
            if (abstractC0569e0.isTmpDetached()) {
                StringBuilder sb2 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
                sb2.append(abstractC0569e0);
                trc0.m192469a(sb2, RecyclerView.this.exceptionLabel());
                return;
            }
            if (abstractC0569e0.shouldIgnore()) {
                yg3.m215829a("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.", RecyclerView.this.exceptionLabel());
                return;
            }
            boolean zDoesTransientStatePreventRecycling = abstractC0569e0.doesTransientStatePreventRecycling();
            Adapter adapter = RecyclerView.this.mAdapter;
            boolean z4 = adapter != null && zDoesTransientStatePreventRecycling && adapter.onFailedToRecycleView(abstractC0569e0);
            if (RecyclerView.sDebugAssertionsEnabled && this.f2621c.contains(abstractC0569e0)) {
                StringBuilder sb3 = new StringBuilder("cached view received recycle internal? ");
                sb3.append(abstractC0569e0);
                trc0.m192469a(sb3, RecyclerView.this.exceptionLabel());
                return;
            }
            if (z4 || abstractC0569e0.isRecyclable()) {
                if (this.f2624f <= 0 || abstractC0569e0.hasAnyOfTheFlags(526)) {
                    z = false;
                } else {
                    int size = this.f2621c.size();
                    if (size >= this.f2624f && size > 0) {
                        m3448F(0);
                        size--;
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0 && !RecyclerView.this.mPrefetchRegistry.m3741d(abstractC0569e0.mPosition)) {
                        int i = size - 1;
                        while (i >= 0) {
                            if (!RecyclerView.this.mPrefetchRegistry.m3741d(this.f2621c.get(i).mPosition)) {
                                break;
                            } else {
                                i--;
                            }
                        }
                        size = i + 1;
                    }
                    this.f2621c.add(size, abstractC0569e0);
                    z = true;
                }
                if (z) {
                    z3 = false;
                } else {
                    m3461a(abstractC0569e0, true);
                }
                z2 = z;
            } else {
                if (RecyclerView.sVerboseLoggingEnabled) {
                    RecyclerView.this.exceptionLabel();
                }
                z3 = false;
            }
            RecyclerView.this.mViewInfoStore.m3888q(abstractC0569e0);
            if (z2 || z3 || !zDoesTransientStatePreventRecycling) {
                return;
            }
            kj80.m150022a(abstractC0569e0.itemView);
            abstractC0569e0.mBindingAdapter = null;
            abstractC0569e0.mOwnerRecyclerView = null;
        }

        /* JADX INFO: renamed from: I */
        public void m3451I(View view) {
            AbstractC0569e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.hasAnyOfTheFlags(12) && childViewHolderInt.isUpdated() && !RecyclerView.this.canReuseUpdatedViewHolder(childViewHolderInt)) {
                if (this.f2620b == null) {
                    this.f2620b = new ArrayList<>();
                }
                childViewHolderInt.setScrapContainer(this, true);
                this.f2620b.add(childViewHolderInt);
                return;
            }
            if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !RecyclerView.this.mAdapter.hasStableIds()) {
                yg3.m215829a("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.", RecyclerView.this.exceptionLabel());
            } else {
                childViewHolderInt.setScrapContainer(this, false);
                this.f2619a.add(childViewHolderInt);
            }
        }

        /* JADX INFO: renamed from: J */
        public void m3452J(C0585u c0585u) {
            m3444B(RecyclerView.this.mAdapter);
            C0585u c0585u2 = this.f2625g;
            if (c0585u2 != null) {
                c0585u2.m3431d();
            }
            this.f2625g = c0585u;
            if (c0585u != null && RecyclerView.this.getAdapter() != null) {
                this.f2625g.m3428a();
            }
            m3481u();
        }

        /* JADX INFO: renamed from: K */
        public void m3453K(AbstractC0565c0 abstractC0565c0) {
            this.f2626h = abstractC0565c0;
        }

        /* JADX INFO: renamed from: L */
        public void m3454L(int i) {
            this.f2623e = i;
            m3458P();
        }

        /* JADX INFO: renamed from: M */
        public final boolean m3455M(@NonNull AbstractC0569e0 abstractC0569e0, int i, int i2, long j) {
            abstractC0569e0.mBindingAdapter = null;
            abstractC0569e0.mOwnerRecyclerView = RecyclerView.this;
            int itemViewType = abstractC0569e0.getItemViewType();
            long nanoTime = RecyclerView.this.getNanoTime();
            boolean z = false;
            if (j != RecyclerView.FOREVER_NS && !this.f2625g.m3441n(itemViewType, nanoTime, j)) {
                return false;
            }
            if (abstractC0569e0.isTmpDetached()) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.attachViewToParent(abstractC0569e0.itemView, recyclerView.getChildCount(), abstractC0569e0.itemView.getLayoutParams());
                z = true;
            }
            RecyclerView.this.mAdapter.bindViewHolder(abstractC0569e0, i);
            if (z) {
                RecyclerView.this.detachViewFromParent(abstractC0569e0.itemView);
            }
            this.f2625g.m3433f(abstractC0569e0.getItemViewType(), RecyclerView.this.getNanoTime() - nanoTime);
            m3462b(abstractC0569e0);
            if (RecyclerView.this.mState.m3364f()) {
                abstractC0569e0.mPreLayoutPosition = i2;
            }
            return true;
        }

        /* JADX WARN: Code duplicated, block: B:105:0x01f6  */
        /* JADX WARN: Code duplicated, block: B:106:0x0202  */
        /* JADX WARN: Code duplicated, block: B:108:0x0208  */
        /* JADX WARN: Code duplicated, block: B:109:0x0216  */
        /* JADX WARN: Code duplicated, block: B:112:0x021d A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:114:0x0220  */
        /* JADX WARN: Code duplicated, block: B:18:0x0037 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:19:0x0039  */
        /* JADX WARN: Code duplicated, block: B:21:0x0043  */
        /* JADX WARN: Code duplicated, block: B:22:0x004e  */
        /* JADX WARN: Code duplicated, block: B:24:0x0054  */
        /* JADX WARN: Code duplicated, block: B:27:0x005c  */
        /* JADX WARN: Code duplicated, block: B:29:0x005f  */
        /* JADX WARN: Code duplicated, block: B:81:0x017e  */
        /* JADX WARN: Code duplicated, block: B:87:0x01aa  */
        /* JADX WARN: Code duplicated, block: B:89:0x01b0  */
        /* JADX WARN: Code duplicated, block: B:97:0x01c3  */
        @Nullable
        /* JADX INFO: renamed from: N */
        public AbstractC0569e0 m3456N(int i, boolean z, long j) {
            AbstractC0569e0 abstractC0569e0CreateViewHolder;
            boolean z2;
            AbstractC0569e0 abstractC0569e0;
            boolean z3;
            boolean zM3455M;
            ViewGroup.LayoutParams layoutParams;
            RecyclerView recyclerView;
            C0580p c0580p;
            int iM3617m;
            RecyclerView recyclerViewFindNestedRecyclerView;
            AbstractC0565c0 abstractC0565c0;
            View viewM3368a;
            if (i < 0 || i >= RecyclerView.this.mState.m3361c()) {
                throw new IndexOutOfBoundsException("Invalid item position " + i + "(" + i + "). Item count:" + RecyclerView.this.mState.m3361c() + RecyclerView.this.exceptionLabel());
            }
            if (RecyclerView.this.mState.m3364f()) {
                abstractC0569e0CreateViewHolder = m3468h(i);
                if (abstractC0569e0CreateViewHolder != null) {
                    z2 = true;
                }
                if (abstractC0569e0CreateViewHolder == null && (abstractC0569e0CreateViewHolder = m3473m(i, z)) != null) {
                    if (m3459Q(abstractC0569e0CreateViewHolder)) {
                        z2 = true;
                    } else {
                        if (!z) {
                            abstractC0569e0CreateViewHolder.addFlags(4);
                            if (abstractC0569e0CreateViewHolder.isScrap()) {
                                RecyclerView.this.removeDetachedView(abstractC0569e0CreateViewHolder.itemView, false);
                                abstractC0569e0CreateViewHolder.unScrap();
                            } else if (abstractC0569e0CreateViewHolder.wasReturnedFromScrap()) {
                                abstractC0569e0CreateViewHolder.clearReturnedFromScrapFlag();
                            }
                            m3450H(abstractC0569e0CreateViewHolder);
                        }
                        abstractC0569e0CreateViewHolder = null;
                    }
                }
                if (abstractC0569e0CreateViewHolder == null) {
                    iM3617m = RecyclerView.this.mAdapterHelper.m3617m(i);
                    if (iM3617m >= 0 || iM3617m >= RecyclerView.this.mAdapter.getItemCount()) {
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + iM3617m + ").state:" + RecyclerView.this.mState.m3361c() + RecyclerView.this.exceptionLabel());
                    }
                    int itemViewType = RecyclerView.this.mAdapter.getItemViewType(iM3617m);
                    if (RecyclerView.this.mAdapter.hasStableIds() && (abstractC0569e0CreateViewHolder = m3472l(RecyclerView.this.mAdapter.getItemId(iM3617m), itemViewType, z)) != null) {
                        abstractC0569e0CreateViewHolder.mPosition = iM3617m;
                        z2 = true;
                    }
                    if (abstractC0569e0CreateViewHolder == null && (abstractC0565c0 = this.f2626h) != null && (viewM3368a = abstractC0565c0.m3368a(this, i, itemViewType)) != null) {
                        abstractC0569e0CreateViewHolder = RecyclerView.this.getChildViewHolder(viewM3368a);
                        if (abstractC0569e0CreateViewHolder == null) {
                            yg3.m215829a("getViewForPositionAndType returned a view which does not have a ViewHolder", RecyclerView.this.exceptionLabel());
                            return null;
                        }
                        if (abstractC0569e0CreateViewHolder.shouldIgnore()) {
                            yg3.m215829a("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view.", RecyclerView.this.exceptionLabel());
                            return null;
                        }
                    }
                    if (abstractC0569e0CreateViewHolder == null) {
                        int i2 = RecyclerView.HORIZONTAL;
                        AbstractC0569e0 abstractC0569e0M3435h = m3469i().m3435h(itemViewType);
                        if (abstractC0569e0M3435h != null) {
                            abstractC0569e0M3435h.resetInternal();
                            if (RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST) {
                                m3478r(abstractC0569e0M3435h);
                            }
                        }
                        abstractC0569e0CreateViewHolder = abstractC0569e0M3435h;
                    }
                    if (abstractC0569e0CreateViewHolder == null) {
                        long nanoTime = RecyclerView.this.getNanoTime();
                        if (j != RecyclerView.FOREVER_NS && !this.f2625g.m3442o(itemViewType, nanoTime, j)) {
                            return null;
                        }
                        RecyclerView recyclerView2 = RecyclerView.this;
                        abstractC0569e0CreateViewHolder = recyclerView2.mAdapter.createViewHolder(recyclerView2, itemViewType);
                        if (RecyclerView.ALLOW_THREAD_GAP_WORK && (recyclerViewFindNestedRecyclerView = RecyclerView.findNestedRecyclerView(abstractC0569e0CreateViewHolder.itemView)) != null) {
                            abstractC0569e0CreateViewHolder.mNestedRecyclerView = new WeakReference<>(recyclerViewFindNestedRecyclerView);
                        }
                        this.f2625g.m3434g(itemViewType, RecyclerView.this.getNanoTime() - nanoTime);
                        int i3 = RecyclerView.HORIZONTAL;
                    }
                }
                abstractC0569e0 = abstractC0569e0CreateViewHolder;
                z3 = z2;
                if (z3 && !RecyclerView.this.mState.m3364f() && abstractC0569e0.hasAnyOfTheFlags(8192)) {
                    abstractC0569e0.setFlags(0, 8192);
                    if (RecyclerView.this.mState.f2578k) {
                        int iBuildAdapterChangeFlagsForAnimations = AbstractC0576l.buildAdapterChangeFlagsForAnimations(abstractC0569e0) | 4096;
                        RecyclerView recyclerView3 = RecyclerView.this;
                        RecyclerView.this.recordAnimationInfoIfBouncedHiddenView(abstractC0569e0, recyclerView3.mItemAnimator.recordPreLayoutInformation(recyclerView3.mState, abstractC0569e0, iBuildAdapterChangeFlagsForAnimations, abstractC0569e0.getUnmodifiedPayloads()));
                    }
                }
                if (RecyclerView.this.mState.m3364f() || !abstractC0569e0.isBound()) {
                    if (abstractC0569e0.isBound() || abstractC0569e0.needsUpdate() || abstractC0569e0.isInvalid()) {
                        if (!RecyclerView.sDebugAssertionsEnabled && abstractC0569e0.isRemoved()) {
                            StringBuilder sb = new StringBuilder("Removed holder should be bound and it should come here only in pre-layout. Holder: ");
                            sb.append(abstractC0569e0);
                            trq.m192522a(sb, RecyclerView.this.exceptionLabel());
                            return null;
                        }
                        zM3455M = m3455M(abstractC0569e0, RecyclerView.this.mAdapterHelper.m3617m(i), i, j);
                    }
                    layoutParams = abstractC0569e0.itemView.getLayoutParams();
                    recyclerView = RecyclerView.this;
                    if (layoutParams == null) {
                        c0580p = (C0580p) recyclerView.generateDefaultLayoutParams();
                        abstractC0569e0.itemView.setLayoutParams(c0580p);
                    } else if (recyclerView.checkLayoutParams(layoutParams)) {
                        c0580p = (C0580p) layoutParams;
                    } else {
                        c0580p = (C0580p) RecyclerView.this.generateLayoutParams(layoutParams);
                        abstractC0569e0.itemView.setLayoutParams(c0580p);
                    }
                    c0580p.f2608a = abstractC0569e0;
                    c0580p.f2611d = !z3 && zM3455M;
                    return abstractC0569e0;
                }
                abstractC0569e0.mPreLayoutPosition = i;
                zM3455M = false;
                layoutParams = abstractC0569e0.itemView.getLayoutParams();
                recyclerView = RecyclerView.this;
                if (layoutParams == null) {
                    c0580p = (C0580p) recyclerView.generateDefaultLayoutParams();
                    abstractC0569e0.itemView.setLayoutParams(c0580p);
                } else if (recyclerView.checkLayoutParams(layoutParams)) {
                    c0580p = (C0580p) RecyclerView.this.generateLayoutParams(layoutParams);
                    abstractC0569e0.itemView.setLayoutParams(c0580p);
                } else {
                    c0580p = (C0580p) layoutParams;
                }
                c0580p.f2608a = abstractC0569e0;
                c0580p.f2611d = !z3 && zM3455M;
                return abstractC0569e0;
            }
            abstractC0569e0CreateViewHolder = null;
            z2 = false;
            if (abstractC0569e0CreateViewHolder == null) {
                if (m3459Q(abstractC0569e0CreateViewHolder)) {
                    if (!z) {
                        abstractC0569e0CreateViewHolder.addFlags(4);
                        if (abstractC0569e0CreateViewHolder.isScrap()) {
                            RecyclerView.this.removeDetachedView(abstractC0569e0CreateViewHolder.itemView, false);
                            abstractC0569e0CreateViewHolder.unScrap();
                        } else if (abstractC0569e0CreateViewHolder.wasReturnedFromScrap()) {
                            abstractC0569e0CreateViewHolder.clearReturnedFromScrapFlag();
                        }
                        m3450H(abstractC0569e0CreateViewHolder);
                    }
                    abstractC0569e0CreateViewHolder = null;
                } else {
                    z2 = true;
                }
            }
            if (abstractC0569e0CreateViewHolder == null) {
                iM3617m = RecyclerView.this.mAdapterHelper.m3617m(i);
                if (iM3617m >= 0) {
                }
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + iM3617m + ").state:" + RecyclerView.this.mState.m3361c() + RecyclerView.this.exceptionLabel());
            }
            abstractC0569e0 = abstractC0569e0CreateViewHolder;
            z3 = z2;
            if (z3) {
                abstractC0569e0.setFlags(0, 8192);
                if (RecyclerView.this.mState.f2578k) {
                    int iBuildAdapterChangeFlagsForAnimations2 = AbstractC0576l.buildAdapterChangeFlagsForAnimations(abstractC0569e0) | 4096;
                    RecyclerView recyclerView4 = RecyclerView.this;
                    RecyclerView.this.recordAnimationInfoIfBouncedHiddenView(abstractC0569e0, recyclerView4.mItemAnimator.recordPreLayoutInformation(recyclerView4.mState, abstractC0569e0, iBuildAdapterChangeFlagsForAnimations2, abstractC0569e0.getUnmodifiedPayloads()));
                }
            }
            if (RecyclerView.this.mState.m3364f()) {
                if (abstractC0569e0.isBound()) {
                }
                if (!RecyclerView.sDebugAssertionsEnabled) {
                }
                zM3455M = m3455M(abstractC0569e0, RecyclerView.this.mAdapterHelper.m3617m(i), i, j);
            } else {
                if (abstractC0569e0.isBound()) {
                }
                if (!RecyclerView.sDebugAssertionsEnabled) {
                }
                zM3455M = m3455M(abstractC0569e0, RecyclerView.this.mAdapterHelper.m3617m(i), i, j);
            }
            layoutParams = abstractC0569e0.itemView.getLayoutParams();
            recyclerView = RecyclerView.this;
            if (layoutParams == null) {
                c0580p = (C0580p) recyclerView.generateDefaultLayoutParams();
                abstractC0569e0.itemView.setLayoutParams(c0580p);
            } else if (recyclerView.checkLayoutParams(layoutParams)) {
                c0580p = (C0580p) RecyclerView.this.generateLayoutParams(layoutParams);
                abstractC0569e0.itemView.setLayoutParams(c0580p);
            } else {
                c0580p = (C0580p) layoutParams;
            }
            c0580p.f2608a = abstractC0569e0;
            c0580p.f2611d = !z3 && zM3455M;
            return abstractC0569e0;
        }

        /* JADX INFO: renamed from: O */
        public void m3457O(AbstractC0569e0 abstractC0569e0) {
            if (abstractC0569e0.mInChangeScrap) {
                this.f2620b.remove(abstractC0569e0);
            } else {
                this.f2619a.remove(abstractC0569e0);
            }
            abstractC0569e0.mScrapContainer = null;
            abstractC0569e0.mInChangeScrap = false;
            abstractC0569e0.clearReturnedFromScrapFlag();
        }

        /* JADX INFO: renamed from: P */
        public void m3458P() {
            AbstractC0579o abstractC0579o = RecyclerView.this.mLayout;
            this.f2624f = this.f2623e + (abstractC0579o != null ? abstractC0579o.mPrefetchMaxCountObserved : 0);
            for (int size = this.f2621c.size() - 1; size >= 0 && this.f2621c.size() > this.f2624f; size--) {
                m3448F(size);
            }
        }

        /* JADX INFO: renamed from: Q */
        public boolean m3459Q(AbstractC0569e0 abstractC0569e0) {
            if (abstractC0569e0.isRemoved()) {
                if (!RecyclerView.sDebugAssertionsEnabled || RecyclerView.this.mState.m3364f()) {
                    return RecyclerView.this.mState.m3364f();
                }
                qg50.m176437a("should not receive a removed view unless it is pre layout", RecyclerView.this.exceptionLabel());
                return false;
            }
            int i = abstractC0569e0.mPosition;
            if (i < 0 || i >= RecyclerView.this.mAdapter.getItemCount()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + abstractC0569e0 + RecyclerView.this.exceptionLabel());
            }
            if (RecyclerView.this.mState.m3364f() || RecyclerView.this.mAdapter.getItemViewType(abstractC0569e0.mPosition) == abstractC0569e0.getItemViewType()) {
                return !RecyclerView.this.mAdapter.hasStableIds() || abstractC0569e0.getItemId() == RecyclerView.this.mAdapter.getItemId(abstractC0569e0.mPosition);
            }
            return false;
        }

        /* JADX INFO: renamed from: R */
        public void m3460R(int i, int i2) {
            int i3;
            int i4 = i2 + i;
            for (int size = this.f2621c.size() - 1; size >= 0; size--) {
                AbstractC0569e0 abstractC0569e0 = this.f2621c.get(size);
                if (abstractC0569e0 != null && (i3 = abstractC0569e0.mPosition) >= i && i3 < i4) {
                    abstractC0569e0.addFlags(2);
                    m3448F(size);
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public void m3461a(@NonNull AbstractC0569e0 abstractC0569e0, boolean z) {
            RecyclerView.clearNestedRecyclerViewIfNotNested(abstractC0569e0);
            View view = abstractC0569e0.itemView;
            C0616t c0616t = RecyclerView.this.mAccessibilityDelegate;
            if (c0616t != null) {
                C16932fb itemDelegate = c0616t.getItemDelegate();
                kkl0.m150164j0(view, itemDelegate instanceof C0616t.a ? ((C0616t.a) itemDelegate).m3853a(view) : null);
            }
            if (z) {
                m3467g(abstractC0569e0);
            }
            abstractC0569e0.mBindingAdapter = null;
            abstractC0569e0.mOwnerRecyclerView = null;
            m3469i().m3438k(abstractC0569e0);
        }

        /* JADX INFO: renamed from: b */
        public final void m3462b(AbstractC0569e0 abstractC0569e0) {
            if (RecyclerView.this.isAccessibilityEnabled()) {
                View view = abstractC0569e0.itemView;
                if (kkl0.m150187v(view) == 0) {
                    kkl0.m150184t0(view, 1);
                }
                C0616t c0616t = RecyclerView.this.mAccessibilityDelegate;
                if (c0616t == null) {
                    return;
                }
                C16932fb itemDelegate = c0616t.getItemDelegate();
                if (itemDelegate instanceof C0616t.a) {
                    ((C0616t.a) itemDelegate).m3854b(view);
                }
                kkl0.m150164j0(view, itemDelegate);
            }
        }

        /* JADX INFO: renamed from: c */
        public void m3463c() {
            this.f2619a.clear();
            m3447E();
        }

        /* JADX INFO: renamed from: d */
        public void m3464d() {
            int size = this.f2621c.size();
            for (int i = 0; i < size; i++) {
                this.f2621c.get(i).clearOldPosition();
            }
            int size2 = this.f2619a.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.f2619a.get(i2).clearOldPosition();
            }
            ArrayList<AbstractC0569e0> arrayList = this.f2620b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    this.f2620b.get(i3).clearOldPosition();
                }
            }
        }

        /* JADX INFO: renamed from: e */
        public void m3465e() {
            this.f2619a.clear();
            ArrayList<AbstractC0569e0> arrayList = this.f2620b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        /* JADX INFO: renamed from: f */
        public int m3466f(int i) {
            if (i >= 0 && i < RecyclerView.this.mState.m3361c()) {
                return !RecyclerView.this.mState.m3364f() ? i : RecyclerView.this.mAdapterHelper.m3617m(i);
            }
            throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + RecyclerView.this.mState.m3361c() + RecyclerView.this.exceptionLabel());
        }

        /* JADX INFO: renamed from: g */
        public void m3467g(@NonNull AbstractC0569e0 abstractC0569e0) {
            RecyclerView recyclerView;
            InterfaceC0587w interfaceC0587w = RecyclerView.this.mRecyclerListener;
            if (interfaceC0587w != null) {
                interfaceC0587w.m3487a(abstractC0569e0);
            }
            int size = RecyclerView.this.mRecyclerListeners.size();
            int i = 0;
            while (true) {
                recyclerView = RecyclerView.this;
                if (i >= size) {
                    break;
                }
                recyclerView.mRecyclerListeners.get(i).m3487a(abstractC0569e0);
                i++;
            }
            Adapter adapter = recyclerView.mAdapter;
            if (adapter != null) {
                adapter.onViewRecycled(abstractC0569e0);
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (recyclerView2.mState != null) {
                recyclerView2.mViewInfoStore.m3888q(abstractC0569e0);
            }
            if (RecyclerView.sVerboseLoggingEnabled) {
                Objects.toString(abstractC0569e0);
            }
        }

        /* JADX INFO: renamed from: h */
        public AbstractC0569e0 m3468h(int i) {
            int size;
            int iM3617m;
            ArrayList<AbstractC0569e0> arrayList = this.f2620b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    AbstractC0569e0 abstractC0569e0 = this.f2620b.get(i2);
                    if (!abstractC0569e0.wasReturnedFromScrap() && abstractC0569e0.getLayoutPosition() == i) {
                        abstractC0569e0.addFlags(32);
                        return abstractC0569e0;
                    }
                }
                if (RecyclerView.this.mAdapter.hasStableIds() && (iM3617m = RecyclerView.this.mAdapterHelper.m3617m(i)) > 0 && iM3617m < RecyclerView.this.mAdapter.getItemCount()) {
                    long itemId = RecyclerView.this.mAdapter.getItemId(iM3617m);
                    for (int i3 = 0; i3 < size; i3++) {
                        AbstractC0569e0 abstractC0569e1 = this.f2620b.get(i3);
                        if (!abstractC0569e1.wasReturnedFromScrap() && abstractC0569e1.getItemId() == itemId) {
                            abstractC0569e1.addFlags(32);
                            return abstractC0569e1;
                        }
                    }
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: i */
        public C0585u m3469i() {
            if (this.f2625g == null) {
                this.f2625g = new C0585u();
                m3481u();
            }
            return this.f2625g;
        }

        /* JADX INFO: renamed from: j */
        public int m3470j() {
            return this.f2619a.size();
        }

        @NonNull
        /* JADX INFO: renamed from: k */
        public List<AbstractC0569e0> m3471k() {
            return this.f2622d;
        }

        /* JADX INFO: renamed from: l */
        public AbstractC0569e0 m3472l(long j, int i, boolean z) {
            for (int size = this.f2619a.size() - 1; size >= 0; size--) {
                AbstractC0569e0 abstractC0569e0 = this.f2619a.get(size);
                if (abstractC0569e0.getItemId() == j && !abstractC0569e0.wasReturnedFromScrap()) {
                    if (i == abstractC0569e0.getItemViewType()) {
                        abstractC0569e0.addFlags(32);
                        if (abstractC0569e0.isRemoved() && !RecyclerView.this.mState.m3364f()) {
                            abstractC0569e0.setFlags(2, 14);
                        }
                        return abstractC0569e0;
                    }
                    if (!z) {
                        this.f2619a.remove(size);
                        RecyclerView.this.removeDetachedView(abstractC0569e0.itemView, false);
                        m3446D(abstractC0569e0.itemView);
                    }
                }
            }
            int size2 = this.f2621c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                AbstractC0569e0 abstractC0569e1 = this.f2621c.get(size2);
                if (abstractC0569e1.getItemId() == j && !abstractC0569e1.isAttachedToTransitionOverlay()) {
                    if (i == abstractC0569e1.getItemViewType()) {
                        if (!z) {
                            this.f2621c.remove(size2);
                        }
                        return abstractC0569e1;
                    }
                    if (!z) {
                        m3448F(size2);
                        return null;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: m */
        public AbstractC0569e0 m3473m(int i, boolean z) {
            View viewM3656e;
            int size = this.f2619a.size();
            for (int i2 = 0; i2 < size; i2++) {
                AbstractC0569e0 abstractC0569e0 = this.f2619a.get(i2);
                if (!abstractC0569e0.wasReturnedFromScrap() && abstractC0569e0.getLayoutPosition() == i && !abstractC0569e0.isInvalid() && (RecyclerView.this.mState.f2575h || !abstractC0569e0.isRemoved())) {
                    abstractC0569e0.addFlags(32);
                    return abstractC0569e0;
                }
            }
            if (!z && (viewM3656e = RecyclerView.this.mChildHelper.m3656e(i)) != null) {
                AbstractC0569e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(viewM3656e);
                RecyclerView.this.mChildHelper.m3670s(viewM3656e);
                int iM3664m = RecyclerView.this.mChildHelper.m3664m(viewM3656e);
                if (iM3664m != -1) {
                    RecyclerView.this.mChildHelper.m3655d(iM3664m);
                    m3451I(viewM3656e);
                    childViewHolderInt.addFlags(8224);
                    return childViewHolderInt;
                }
                StringBuilder sb = new StringBuilder("layout index should not be -1 after unhiding a view:");
                sb.append(childViewHolderInt);
                trq.m192522a(sb, RecyclerView.this.exceptionLabel());
                return null;
            }
            int size2 = this.f2621c.size();
            for (int i3 = 0; i3 < size2; i3++) {
                AbstractC0569e0 abstractC0569e1 = this.f2621c.get(i3);
                if (!abstractC0569e1.isInvalid() && abstractC0569e1.getLayoutPosition() == i && !abstractC0569e1.isAttachedToTransitionOverlay()) {
                    if (!z) {
                        this.f2621c.remove(i3);
                    }
                    if (RecyclerView.sVerboseLoggingEnabled) {
                        abstractC0569e1.toString();
                    }
                    return abstractC0569e1;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: n */
        public View m3474n(int i) {
            return this.f2619a.get(i).itemView;
        }

        @NonNull
        /* JADX INFO: renamed from: o */
        public View m3475o(int i) {
            return m3476p(i, false);
        }

        /* JADX INFO: renamed from: p */
        public View m3476p(int i, boolean z) {
            return m3456N(i, z, RecyclerView.FOREVER_NS).itemView;
        }

        /* JADX INFO: renamed from: q */
        public final void m3477q(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    m3477q((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        /* JADX INFO: renamed from: r */
        public final void m3478r(AbstractC0569e0 abstractC0569e0) {
            View view = abstractC0569e0.itemView;
            if (view instanceof ViewGroup) {
                m3477q((ViewGroup) view, false);
            }
        }

        /* JADX INFO: renamed from: s */
        public void m3479s() {
            int size = this.f2621c.size();
            for (int i = 0; i < size; i++) {
                C0580p c0580p = (C0580p) this.f2621c.get(i).itemView.getLayoutParams();
                if (c0580p != null) {
                    c0580p.f2610c = true;
                }
            }
        }

        /* JADX INFO: renamed from: t */
        public void m3480t() {
            int size = this.f2621c.size();
            for (int i = 0; i < size; i++) {
                AbstractC0569e0 abstractC0569e0 = this.f2621c.get(i);
                if (abstractC0569e0 != null) {
                    abstractC0569e0.addFlags(6);
                    abstractC0569e0.addChangePayload(null);
                }
            }
            Adapter adapter = RecyclerView.this.mAdapter;
            if (adapter == null || !adapter.hasStableIds()) {
                m3447E();
            }
        }

        /* JADX INFO: renamed from: u */
        public final void m3481u() {
            if (this.f2625g != null) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.mAdapter == null || !recyclerView.isAttachedToWindow()) {
                    return;
                }
                this.f2625g.m3429b(RecyclerView.this.mAdapter);
            }
        }

        /* JADX INFO: renamed from: v */
        public void m3482v(int i, int i2) {
            int size = this.f2621c.size();
            for (int i3 = 0; i3 < size; i3++) {
                AbstractC0569e0 abstractC0569e0 = this.f2621c.get(i3);
                if (abstractC0569e0 != null && abstractC0569e0.mPosition >= i) {
                    if (RecyclerView.sVerboseLoggingEnabled) {
                        abstractC0569e0.toString();
                    }
                    abstractC0569e0.offsetPosition(i2, false);
                }
            }
        }

        /* JADX INFO: renamed from: w */
        public void m3483w(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            if (i < i2) {
                i3 = -1;
                i5 = i;
                i4 = i2;
            } else {
                i3 = 1;
                i4 = i;
                i5 = i2;
            }
            int size = this.f2621c.size();
            for (int i7 = 0; i7 < size; i7++) {
                AbstractC0569e0 abstractC0569e0 = this.f2621c.get(i7);
                if (abstractC0569e0 != null && (i6 = abstractC0569e0.mPosition) >= i5 && i6 <= i4) {
                    if (i6 == i) {
                        abstractC0569e0.offsetPosition(i2 - i, false);
                    } else {
                        abstractC0569e0.offsetPosition(i3, false);
                    }
                    if (RecyclerView.sVerboseLoggingEnabled) {
                        abstractC0569e0.toString();
                    }
                }
            }
        }

        /* JADX INFO: renamed from: x */
        public void m3484x(int i, int i2, boolean z) {
            int i3 = i + i2;
            for (int size = this.f2621c.size() - 1; size >= 0; size--) {
                AbstractC0569e0 abstractC0569e0 = this.f2621c.get(size);
                if (abstractC0569e0 != null) {
                    int i4 = abstractC0569e0.mPosition;
                    if (i4 >= i3) {
                        if (RecyclerView.sVerboseLoggingEnabled) {
                            abstractC0569e0.toString();
                        }
                        abstractC0569e0.offsetPosition(-i2, z);
                    } else if (i4 >= i) {
                        abstractC0569e0.addFlags(8);
                        m3448F(size);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: y */
        public void m3485y(Adapter<?> adapter, Adapter<?> adapter2, boolean z) {
            m3463c();
            m3445C(adapter, true);
            m3469i().m3437j(adapter, adapter2, z);
            m3481u();
        }

        /* JADX INFO: renamed from: z */
        public void m3486z() {
            m3481u();
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$w */
    public interface InterfaceC0587w {
        /* JADX INFO: renamed from: a */
        void m3487a(@NonNull AbstractC0569e0 abstractC0569e0);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$x */
    public class C0588x extends AbstractC0573i {
        public C0588x() {
        }

        /* JADX INFO: renamed from: a */
        public void m3488a() {
            if (RecyclerView.POST_UPDATES_ON_ANIMATION) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.mHasFixedSize && recyclerView.mIsAttached) {
                    kkl0.m150148b0(recyclerView, recyclerView.mUpdateChildViewsRunnable);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.mAdapterUpdateDuringMeasure = true;
            recyclerView2.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0573i
        public void onChanged() {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mState.f2574g = true;
            recyclerView.processDataSetCompletelyChanged(true);
            if (RecyclerView.this.mAdapterHelper.m3620p()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0573i
        public void onItemRangeChanged(int i, int i2, Object obj) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.m3622r(i, i2, obj)) {
                m3488a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0573i
        public void onItemRangeInserted(int i, int i2) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.m3623s(i, i2)) {
                m3488a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0573i
        public void onItemRangeMoved(int i, int i2, int i3) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.m3624t(i, i2, i3)) {
                m3488a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0573i
        public void onItemRangeRemoved(int i, int i2) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.m3625u(i, i2)) {
                m3488a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0573i
        public void onStateRestorationPolicyChanged() {
            Adapter adapter;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mPendingSavedState == null || (adapter = recyclerView.mAdapter) == null || !adapter.canRestoreState()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$y */
    public static class C0589y implements InterfaceC0583s {
        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0583s
        /* JADX INFO: renamed from: a */
        public void mo3425a(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0583s
        /* JADX INFO: renamed from: c */
        public boolean mo3426c(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0583s
        /* JADX INFO: renamed from: e */
        public void mo3427e(boolean z) {
        }
    }

    static {
        Class cls = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, cls, cls};
        sQuinticInterpolator = new InterpolatorC0564c();
        sDefaultEdgeEffectFactory = new C0563b0();
    }

    public RecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mObserver = new C0588x();
        this.mRecycler = new C0586v();
        this.mViewInfoStore = new C0621y();
        this.mUpdateChildViewsRunnable = new RunnableC0560a();
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mRecyclerListeners = new ArrayList();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = sDefaultEdgeEffectFactory;
        this.mItemAnimator = new C0602f();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new RunnableC0567d0();
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new RunnableC0606j.b() : null;
        this.mState = new C0561a0();
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new C0577m();
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new RunnableC0562b();
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mViewInfoProcessCallback = new C0566d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = nkl0.m163644f(viewConfiguration, context);
        this.mScaledVerticalScrollFactor = nkl0.m163649k(viewConfiguration, context);
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mPhysicalCoef = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.setListener(this.mItemAnimatorListener);
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        if (kkl0.m150187v(this) == 0) {
            kkl0.m150184t0(this, 1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C0616t(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eic0.f94126a, i, 0);
        kkl0.m150160h0(this, context, eic0.f94126a, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        String string = typedArrayObtainStyledAttributes.getString(eic0.f94135j);
        if (typedArrayObtainStyledAttributes.getInt(eic0.f94129d, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = typedArrayObtainStyledAttributes.getBoolean(eic0.f94128c, true);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(eic0.f94130e, false);
        this.mEnableFastScroller = z;
        if (z) {
            initFastScroller((StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(eic0.f94133h), typedArrayObtainStyledAttributes.getDrawable(eic0.f94134i), (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(eic0.f94131f), typedArrayObtainStyledAttributes.getDrawable(eic0.f94132g));
        }
        typedArrayObtainStyledAttributes.recycle();
        createLayoutManager(context, string, attributeSet, i, 0);
        int[] iArr = NESTED_SCROLLING_ATTRS;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        kkl0.m150160h0(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes2, i, 0);
        boolean z2 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z2);
        kj80.m150025d(this, true);
    }

    private void addAnimatingView(AbstractC0569e0 abstractC0569e0) {
        View view = abstractC0569e0.itemView;
        boolean z = view.getParent() == this;
        this.mRecycler.m3457O(getChildViewHolder(view));
        if (abstractC0569e0.isTmpDetached()) {
            this.mChildHelper.m3654c(view, -1, view.getLayoutParams(), true);
            return;
        }
        C0601e c0601e = this.mChildHelper;
        if (z) {
            c0601e.m3662k(view);
        } else {
            c0601e.m3653b(view, true);
        }
    }

    private void animateChange(@NonNull AbstractC0569e0 abstractC0569e0, @NonNull AbstractC0569e0 abstractC0569e1, @NonNull AbstractC0576l.c cVar, @NonNull AbstractC0576l.c cVar2, boolean z, boolean z2) {
        abstractC0569e0.setIsRecyclable(false);
        if (z) {
            addAnimatingView(abstractC0569e0);
        }
        if (abstractC0569e0 != abstractC0569e1) {
            if (z2) {
                addAnimatingView(abstractC0569e1);
            }
            abstractC0569e0.mShadowedHolder = abstractC0569e1;
            addAnimatingView(abstractC0569e0);
            this.mRecycler.m3457O(abstractC0569e0);
            abstractC0569e1.setIsRecyclable(false);
            abstractC0569e1.mShadowingHolder = abstractC0569e0;
        }
        if (this.mItemAnimator.animateChange(abstractC0569e0, abstractC0569e1, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    public static void clearNestedRecyclerViewIfNotNested(@NonNull AbstractC0569e0 abstractC0569e0) {
        WeakReference<RecyclerView> weakReference = abstractC0569e0.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == abstractC0569e0.itemView) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            abstractC0569e0.mNestedRecyclerView = null;
        }
    }

    private int consumeFlingInStretch(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && mke.m158756c(edgeEffect) != 0.0f) {
            int iRound = Math.round(((-i2) / FLING_DESTRETCH_FACTOR) * mke.m158758h(edgeEffect, ((-i) * FLING_DESTRETCH_FACTOR) / i2, 0.5f));
            if (iRound != i) {
                edgeEffect.finish();
            }
            return i - iRound;
        }
        if (i >= 0 || edgeEffect2 == null || mke.m158756c(edgeEffect2) == 0.0f) {
            return i;
        }
        float f = i2;
        int iRound2 = Math.round((f / FLING_DESTRETCH_FACTOR) * mke.m158758h(edgeEffect2, (i * FLING_DESTRETCH_FACTOR) / f, 0.5f));
        if (iRound2 != i) {
            edgeEffect2.finish();
        }
        return i - iRound2;
    }

    private void createLayoutManager(Context context, String str, AttributeSet attributeSet, int i, int i2) {
        Object[] objArr;
        Constructor constructor;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            String fullClassName = getFullClassName(context, strTrim);
            try {
                Class<? extends U> clsAsSubclass = Class.forName(fullClassName, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(AbstractC0579o.class);
                try {
                    constructor = clsAsSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
                } catch (NoSuchMethodException e) {
                    objArr = null;
                    try {
                        constructor = clsAsSubclass.getConstructor(null);
                    } catch (NoSuchMethodException e2) {
                        e2.initCause(e);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + fullClassName, e2);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((AbstractC0579o) constructor.newInstance(objArr));
            } catch (ClassCastException e3) {
                urc0.m197502a(attributeSet.getPositionDescription(), ": Class is not a LayoutManager ", fullClassName, e3);
            } catch (ClassNotFoundException e4) {
                urc0.m197502a(attributeSet.getPositionDescription(), ": Unable to find LayoutManager ", fullClassName, e4);
            } catch (IllegalAccessException e5) {
                urc0.m197502a(attributeSet.getPositionDescription(), ": Cannot access non-public constructor ", fullClassName, e5);
            } catch (InstantiationException e6) {
                urc0.m197502a(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", fullClassName, e6);
            } catch (InvocationTargetException e7) {
                urc0.m197502a(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", fullClassName, e7);
            }
        }
    }

    private boolean didChildRangeChange(int i, int i2) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        return (iArr[0] == i && iArr[1] == i2) ? false : true;
    }

    private void dispatchContentChangedIfNecessary() {
        int i = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i == 0 || !isAccessibilityEnabled()) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
        accessibilityEventObtain.setEventType(2048);
        C17188gb.m129753b(accessibilityEventObtain, i);
        sendAccessibilityEventUnchecked(accessibilityEventObtain);
    }

    private void dispatchLayoutStep1() {
        this.mState.m3359a(1);
        fillRemainingScrollValues(this.mState);
        this.mState.f2577j = false;
        startInterceptRequestLayout();
        this.mViewInfoStore.m3877f();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        C0561a0 c0561a0 = this.mState;
        c0561a0.f2576i = c0561a0.f2578k && this.mItemsChanged;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        c0561a0.f2575h = c0561a0.f2579l;
        c0561a0.f2573f = this.mAdapter.getItemCount();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.f2578k) {
            int iM3658g = this.mChildHelper.m3658g();
            for (int i = 0; i < iM3658g; i++) {
                AbstractC0569e0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m3657f(i));
                if (!childViewHolderInt.shouldIgnore() && (!childViewHolderInt.isInvalid() || this.mAdapter.hasStableIds())) {
                    this.mViewInfoStore.m3876e(childViewHolderInt, this.mItemAnimator.recordPreLayoutInformation(this.mState, childViewHolderInt, AbstractC0576l.buildAdapterChangeFlagsForAnimations(childViewHolderInt), childViewHolderInt.getUnmodifiedPayloads()));
                    if (this.mState.f2576i && childViewHolderInt.isUpdated() && !childViewHolderInt.isRemoved() && !childViewHolderInt.shouldIgnore() && !childViewHolderInt.isInvalid()) {
                        this.mViewInfoStore.m3874c(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.f2579l) {
            saveOldPositions();
            C0561a0 c0561a1 = this.mState;
            boolean z = c0561a1.f2574g;
            c0561a1.f2574g = false;
            this.mLayout.onLayoutChildren(this.mRecycler, c0561a1);
            this.mState.f2574g = z;
            for (int i2 = 0; i2 < this.mChildHelper.m3658g(); i2++) {
                AbstractC0569e0 childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.m3657f(i2));
                if (!childViewHolderInt2.shouldIgnore() && !this.mViewInfoStore.m3880i(childViewHolderInt2)) {
                    int iBuildAdapterChangeFlagsForAnimations = AbstractC0576l.buildAdapterChangeFlagsForAnimations(childViewHolderInt2);
                    boolean zHasAnyOfTheFlags = childViewHolderInt2.hasAnyOfTheFlags(8192);
                    if (!zHasAnyOfTheFlags) {
                        iBuildAdapterChangeFlagsForAnimations |= 4096;
                    }
                    AbstractC0576l.c cVarRecordPreLayoutInformation = this.mItemAnimator.recordPreLayoutInformation(this.mState, childViewHolderInt2, iBuildAdapterChangeFlagsForAnimations, childViewHolderInt2.getUnmodifiedPayloads());
                    if (zHasAnyOfTheFlags) {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, cVarRecordPreLayoutInformation);
                    } else {
                        this.mViewInfoStore.m3872a(childViewHolderInt2, cVarRecordPreLayoutInformation);
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.f2572e = 2;
    }

    private void dispatchLayoutStep2() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.m3359a(6);
        this.mAdapterHelper.m3614j();
        this.mState.f2573f = this.mAdapter.getItemCount();
        this.mState.f2571d = 0;
        if (this.mPendingSavedState != null && this.mAdapter.canRestoreState()) {
            Parcelable parcelable = this.mPendingSavedState.mLayoutState;
            if (parcelable != null) {
                this.mLayout.onRestoreInstanceState(parcelable);
            }
            this.mPendingSavedState = null;
        }
        C0561a0 c0561a0 = this.mState;
        c0561a0.f2575h = false;
        this.mLayout.onLayoutChildren(this.mRecycler, c0561a0);
        C0561a0 c0561a1 = this.mState;
        c0561a1.f2574g = false;
        c0561a1.f2578k = c0561a1.f2578k && this.mItemAnimator != null;
        c0561a1.f2572e = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    private void dispatchLayoutStep3() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        this.mState.m3359a(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        C0561a0 c0561a0 = this.mState;
        c0561a0.f2572e = 1;
        if (c0561a0.f2578k) {
            int iM3658g = this.mChildHelper.m3658g() - 1;
            while (iM3658g >= 0) {
                AbstractC0569e0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m3657f(iM3658g));
                if (childViewHolderInt.shouldIgnore()) {
                    recyclerView2 = this;
                } else {
                    long changedHolderKey = this.getChangedHolderKey(childViewHolderInt);
                    AbstractC0576l.c cVarRecordPostLayoutInformation = this.mItemAnimator.recordPostLayoutInformation(this.mState, childViewHolderInt);
                    AbstractC0569e0 abstractC0569e0M3878g = this.mViewInfoStore.m3878g(changedHolderKey);
                    if (abstractC0569e0M3878g == null || abstractC0569e0M3878g.shouldIgnore()) {
                        recyclerView2 = this;
                        recyclerView2.mViewInfoStore.m3875d(childViewHolderInt, cVarRecordPostLayoutInformation);
                    } else {
                        boolean zM3879h = this.mViewInfoStore.m3879h(abstractC0569e0M3878g);
                        boolean zM3879h2 = this.mViewInfoStore.m3879h(childViewHolderInt);
                        if (zM3879h && abstractC0569e0M3878g == childViewHolderInt) {
                            this.mViewInfoStore.m3875d(childViewHolderInt, cVarRecordPostLayoutInformation);
                        } else {
                            AbstractC0576l.c cVarM3885n = this.mViewInfoStore.m3885n(abstractC0569e0M3878g);
                            this.mViewInfoStore.m3875d(childViewHolderInt, cVarRecordPostLayoutInformation);
                            AbstractC0576l.c cVarM3884m = this.mViewInfoStore.m3884m(childViewHolderInt);
                            if (cVarM3885n == null) {
                                this.handleMissingPreInfoForChangeError(changedHolderKey, childViewHolderInt, abstractC0569e0M3878g);
                            } else {
                                recyclerView2 = this;
                                recyclerView2.animateChange(abstractC0569e0M3878g, childViewHolderInt, cVarM3885n, cVarM3884m, zM3879h, zM3879h2);
                            }
                        }
                        recyclerView2 = this;
                    }
                }
                iM3658g--;
                this = recyclerView2;
            }
            recyclerView = this;
            recyclerView.mViewInfoStore.m3886o(recyclerView.mViewInfoProcessCallback);
        } else {
            recyclerView = this;
        }
        recyclerView.mLayout.removeAndRecycleScrapInt(recyclerView.mRecycler);
        C0561a0 c0561a1 = recyclerView.mState;
        c0561a1.f2570c = c0561a1.f2573f;
        recyclerView.mDataSetHasChangedAfterLayout = false;
        recyclerView.mDispatchItemsChangedEvent = false;
        c0561a1.f2578k = false;
        c0561a1.f2579l = false;
        recyclerView.mLayout.mRequestedSimpleAnimations = false;
        ArrayList<AbstractC0569e0> arrayList = recyclerView.mRecycler.f2620b;
        if (arrayList != null) {
            arrayList.clear();
        }
        AbstractC0579o abstractC0579o = recyclerView.mLayout;
        if (abstractC0579o.mPrefetchMaxObservedInInitialPrefetch) {
            abstractC0579o.mPrefetchMaxCountObserved = 0;
            abstractC0579o.mPrefetchMaxObservedInInitialPrefetch = false;
            recyclerView.mRecycler.m3458P();
        }
        recyclerView.mLayout.onLayoutCompleted(recyclerView.mState);
        recyclerView.onExitLayoutOrScroll();
        recyclerView.stopInterceptRequestLayout(false);
        recyclerView.mViewInfoStore.m3877f();
        int[] iArr = recyclerView.mMinMaxLayoutPositions;
        if (recyclerView.didChildRangeChange(iArr[0], iArr[1])) {
            recyclerView.dispatchOnScrolled(0, 0);
        }
        recyclerView.recoverFocusFromState();
        recyclerView.resetFocusInfo();
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent motionEvent) {
        InterfaceC0583s interfaceC0583s = this.mInterceptingOnItemTouchListener;
        if (interfaceC0583s == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return findInterceptingOnItemTouchListener(motionEvent);
        }
        interfaceC0583s.mo3425a(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.mInterceptingOnItemTouchListener = null;
        }
        return true;
    }

    private boolean findInterceptingOnItemTouchListener(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        for (int i = 0; i < size; i++) {
            InterfaceC0583s interfaceC0583s = this.mOnItemTouchListeners.get(i);
            if (interfaceC0583s.mo3426c(this, motionEvent) && action != 3) {
                this.mInterceptingOnItemTouchListener = interfaceC0583s;
                return true;
            }
        }
        return false;
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        int iM3658g = this.mChildHelper.m3658g();
        if (iM3658g == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < iM3658g; i3++) {
            AbstractC0569e0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m3657f(i3));
            if (!childViewHolderInt.shouldIgnore()) {
                int layoutPosition = childViewHolderInt.getLayoutPosition();
                if (layoutPosition < i) {
                    i = layoutPosition;
                }
                if (layoutPosition > i2) {
                    i2 = layoutPosition;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    @Nullable
    public static RecyclerView findNestedRecyclerView(@NonNull View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView recyclerViewFindNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i));
            if (recyclerViewFindNestedRecyclerView != null) {
                return recyclerViewFindNestedRecyclerView;
            }
        }
        return null;
    }

    @Nullable
    private View findNextViewToFocus() {
        AbstractC0569e0 abstractC0569e0FindViewHolderForAdapterPosition;
        C0561a0 c0561a0 = this.mState;
        int i = c0561a0.f2580m;
        if (i == -1) {
            i = 0;
        }
        int iM3361c = c0561a0.m3361c();
        for (int i2 = i; i2 < iM3361c; i2++) {
            AbstractC0569e0 abstractC0569e0FindViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i2);
            if (abstractC0569e0FindViewHolderForAdapterPosition2 == null) {
                break;
            }
            if (abstractC0569e0FindViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                return abstractC0569e0FindViewHolderForAdapterPosition2.itemView;
            }
        }
        int iMin = Math.min(iM3361c, i);
        do {
            iMin--;
            if (iMin < 0 || (abstractC0569e0FindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(iMin)) == null) {
                return null;
            }
        } while (!abstractC0569e0FindViewHolderForAdapterPosition.itemView.hasFocusable());
        return abstractC0569e0FindViewHolderForAdapterPosition.itemView;
    }

    public static AbstractC0569e0 getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((C0580p) view.getLayoutParams()).f2608a;
    }

    public static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        C0580p c0580p = (C0580p) view.getLayoutParams();
        Rect rect2 = c0580p.f2609b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c0580p).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c0580p).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c0580p).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c0580p).bottomMargin);
    }

    private int getDeepestFocusedViewWithId(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    private String getFullClassName(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    private bi20 getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new bi20(this);
        }
        return this.mScrollingChildHelper;
    }

    private float getSplineFlingDistance(int i) {
        double dLog = Math.log((Math.abs(i) * INFLEXION) / (this.mPhysicalCoef * SCROLL_FRICTION));
        float f = DECELERATION_RATE;
        return (float) (((double) (this.mPhysicalCoef * SCROLL_FRICTION)) * Math.exp((((double) f) / (((double) f) - 1.0d)) * dLog));
    }

    private void handleMissingPreInfoForChangeError(long j, AbstractC0569e0 abstractC0569e0, AbstractC0569e0 abstractC0569e1) {
        int iM3658g = this.mChildHelper.m3658g();
        for (int i = 0; i < iM3658g; i++) {
            AbstractC0569e0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m3657f(i));
            if (childViewHolderInt != abstractC0569e0 && getChangedHolderKey(childViewHolderInt) == j) {
                Adapter adapter = this.mAdapter;
                if (adapter == null || !adapter.hasStableIds()) {
                    StringBuilder sb = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                    sb.append(childViewHolderInt);
                    sb.append(" \n View Holder 2:");
                    sb.append(abstractC0569e0);
                    trq.m192522a(sb, exceptionLabel());
                    return;
                }
                StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                sb2.append(childViewHolderInt);
                sb2.append(" \n View Holder 2:");
                sb2.append(abstractC0569e0);
                trq.m192522a(sb2, exceptionLabel());
                return;
            }
        }
        Log.e(TAG, "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + abstractC0569e1 + " cannot be found but it is necessary for " + abstractC0569e0 + exceptionLabel());
    }

    private boolean hasUpdatedView() {
        int iM3658g = this.mChildHelper.m3658g();
        for (int i = 0; i < iM3658g; i++) {
            AbstractC0569e0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m3657f(i));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    private void initAutofill() {
        if (kkl0.m150189w(this) == 0) {
            kkl0.m150188v0(this, 8);
        }
    }

    private void initChildrenHelper() {
        this.mChildHelper = new C0601e(new C0568e());
    }

    private boolean isPreferredNextFocus(View view, View view2, int i) {
        int i2;
        if (view2 == null || view2 == this || view2 == view || findContainingItemView(view2) == null) {
            return false;
        }
        if (view == null || findContainingItemView(view) == null) {
            return true;
        }
        this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
        this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        offsetDescendantRectToMyCoords(view2, this.mTempRect2);
        byte b = -1;
        int i3 = this.mLayout.getLayoutDirection() == 1 ? -1 : 1;
        Rect rect = this.mTempRect;
        int i4 = rect.left;
        Rect rect2 = this.mTempRect2;
        int i5 = rect2.left;
        if ((i4 < i5 || rect.right <= i5) && rect.right < rect2.right) {
            i2 = 1;
        } else {
            int i6 = rect.right;
            int i7 = rect2.right;
            i2 = ((i6 > i7 || i4 >= i7) && i4 > i5) ? -1 : 0;
        }
        int i8 = rect.top;
        int i9 = rect2.top;
        if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
            b = 1;
        } else {
            int i10 = rect.bottom;
            int i11 = rect2.bottom;
            if ((i10 <= i11 && i8 < i11) || i8 <= i9) {
                b = 0;
            }
        }
        if (i == 1) {
            return b < 0 || (b == 0 && i2 * i3 < 0);
        }
        if (i == 2) {
            return b > 0 || (b == 0 && i2 * i3 > 0);
        }
        if (i == 17) {
            return i2 < 0;
        }
        if (i == 33) {
            return b < 0;
        }
        if (i == 66) {
            return i2 > 0;
        }
        if (i == 130) {
            return b > 0;
        }
        vic0.m201333a("Invalid direction: ", i, exceptionLabel());
        return false;
    }

    private void nestedScrollByInternal(int i, int i2, @Nullable MotionEvent motionEvent, int i3) {
        AbstractC0579o abstractC0579o = this.mLayout;
        if (abstractC0579o == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean zCanScrollHorizontally = abstractC0579o.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        int i4 = zCanScrollVertically ? (zCanScrollHorizontally ? 1 : 0) | 2 : zCanScrollHorizontally ? 1 : 0;
        float height = motionEvent == null ? getHeight() / 2.0f : motionEvent.getY();
        float width = motionEvent == null ? getWidth() / 2.0f : motionEvent.getX();
        int iReleaseHorizontalGlow = i - releaseHorizontalGlow(i, height);
        int iReleaseVerticalGlow = i2 - releaseVerticalGlow(i2, width);
        startNestedScroll(i4, i3);
        if (dispatchNestedPreScroll(zCanScrollHorizontally ? iReleaseHorizontalGlow : 0, zCanScrollVertically ? iReleaseVerticalGlow : 0, this.mReusableIntPair, this.mScrollOffset, i3)) {
            int[] iArr2 = this.mReusableIntPair;
            iReleaseHorizontalGlow -= iArr2[0];
            iReleaseVerticalGlow -= iArr2[1];
        }
        scrollByInternal(zCanScrollHorizontally ? iReleaseHorizontalGlow : 0, zCanScrollVertically ? iReleaseVerticalGlow : 0, motionEvent, i3);
        RunnableC0606j runnableC0606j = this.mGapWorker;
        if (runnableC0606j != null && (iReleaseHorizontalGlow != 0 || iReleaseVerticalGlow != 0)) {
            runnableC0606j.m3733f(this, iReleaseHorizontalGlow, iReleaseVerticalGlow);
        }
        stopNestedScroll(i3);
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            int i = actionIndex == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
        }
    }

    private boolean predictiveItemAnimationsEnabled() {
        return this.mItemAnimator != null && this.mLayout.supportsPredictiveItemAnimations();
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        boolean z;
        if (this.mDataSetHasChangedAfterLayout) {
            this.mAdapterHelper.m3629y();
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.onItemsChanged(this);
            }
        }
        boolean zPredictiveItemAnimationsEnabled = predictiveItemAnimationsEnabled();
        C0597a c0597a = this.mAdapterHelper;
        if (zPredictiveItemAnimationsEnabled) {
            c0597a.m3627w();
        } else {
            c0597a.m3614j();
        }
        boolean z2 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.f2578k = this.mFirstLayoutComplete && this.mItemAnimator != null && ((z = this.mDataSetHasChangedAfterLayout) || z2 || this.mLayout.mRequestedSimpleAnimations) && (!z || this.mAdapter.hasStableIds());
        C0561a0 c0561a0 = this.mState;
        c0561a0.f2579l = c0561a0.f2578k && z2 && !this.mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0040  */
    /* JADX WARN: Code duplicated, block: B:13:0x0056  */
    /* JADX WARN: Code duplicated, block: B:15:0x005a  */
    /* JADX WARN: Code duplicated, block: B:16:0x0071  */
    private void pullGlows(float f, float f2, float f3, float f4) {
        boolean z;
        boolean z2 = true;
        if (f2 >= 0.0f) {
            if (f2 > 0.0f) {
                ensureRightGlow();
                mke.m158758h(this.mRightGlow, f2 / getWidth(), f3 / getHeight());
            } else {
                z = false;
            }
            if (f4 < 0.0f) {
                ensureTopGlow();
                mke.m158758h(this.mTopGlow, (-f4) / getHeight(), f / getWidth());
            } else if (f4 > 0.0f) {
                ensureBottomGlow();
                mke.m158758h(this.mBottomGlow, f4 / getHeight(), 1.0f - (f / getWidth()));
            } else {
                z2 = z;
            }
            if (z2 && f2 == 0.0f && f4 == 0.0f) {
                return;
            }
            kkl0.m150146a0(this);
        }
        ensureLeftGlow();
        mke.m158758h(this.mLeftGlow, (-f2) / getWidth(), 1.0f - (f3 / getHeight()));
        z = true;
        if (f4 < 0.0f) {
            ensureTopGlow();
            mke.m158758h(this.mTopGlow, (-f4) / getHeight(), f / getWidth());
        } else if (f4 > 0.0f) {
            ensureBottomGlow();
            mke.m158758h(this.mBottomGlow, f4 / getHeight(), 1.0f - (f / getWidth()));
        } else {
            z2 = z;
        }
        if (z2) {
        }
        kkl0.m150146a0(this);
    }

    private void recoverFocusFromState() {
        View viewFindViewById;
        if (!this.mPreserveFocusAfterLayout || this.mAdapter == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!IGNORE_DETACHED_FOCUSED_CHILD || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.mChildHelper.m3665n(focusedChild)) {
                    return;
                }
            } else if (this.mChildHelper.m3658g() == 0) {
                requestFocus();
                return;
            }
        }
        View viewFindNextViewToFocus = null;
        AbstractC0569e0 abstractC0569e0FindViewHolderForItemId = (this.mState.f2581n == -1 || !this.mAdapter.hasStableIds()) ? null : findViewHolderForItemId(this.mState.f2581n);
        if (abstractC0569e0FindViewHolderForItemId != null && !this.mChildHelper.m3665n(abstractC0569e0FindViewHolderForItemId.itemView) && abstractC0569e0FindViewHolderForItemId.itemView.hasFocusable()) {
            viewFindNextViewToFocus = abstractC0569e0FindViewHolderForItemId.itemView;
        } else if (this.mChildHelper.m3658g() > 0) {
            viewFindNextViewToFocus = findNextViewToFocus();
        }
        if (viewFindNextViewToFocus != null) {
            int i = this.mState.f2582o;
            if (i != -1 && (viewFindViewById = viewFindNextViewToFocus.findViewById(i)) != null && viewFindViewById.isFocusable()) {
                viewFindNextViewToFocus = viewFindViewById;
            }
            viewFindNextViewToFocus.requestFocus();
        }
    }

    private void releaseGlows() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.mLeftGlow.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.mBottomGlow.isFinished();
        }
        if (zIsFinished) {
            kkl0.m150146a0(this);
        }
    }

    private int releaseHorizontalGlow(int i, float f) {
        float height = f / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect = this.mLeftGlow;
        float f2 = 0.0f;
        if (edgeEffect == null || mke.m158756c(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.mRightGlow;
            if (edgeEffect2 != null && mke.m158756c(edgeEffect2) != 0.0f) {
                boolean zCanScrollHorizontally = canScrollHorizontally(1);
                EdgeEffect edgeEffect3 = this.mRightGlow;
                if (zCanScrollHorizontally) {
                    edgeEffect3.onRelease();
                } else {
                    float fM158758h = mke.m158758h(edgeEffect3, width, height);
                    if (mke.m158756c(this.mRightGlow) == 0.0f) {
                        this.mRightGlow.onRelease();
                    }
                    f2 = fM158758h;
                }
                invalidate();
            }
        } else {
            boolean zCanScrollHorizontally2 = canScrollHorizontally(-1);
            EdgeEffect edgeEffect4 = this.mLeftGlow;
            if (zCanScrollHorizontally2) {
                edgeEffect4.onRelease();
            } else {
                float f3 = -mke.m158758h(edgeEffect4, -width, 1.0f - height);
                if (mke.m158756c(this.mLeftGlow) == 0.0f) {
                    this.mLeftGlow.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getWidth());
    }

    private int releaseVerticalGlow(int i, float f) {
        float width = f / getWidth();
        float height = i / getHeight();
        EdgeEffect edgeEffect = this.mTopGlow;
        float f2 = 0.0f;
        if (edgeEffect == null || mke.m158756c(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.mBottomGlow;
            if (edgeEffect2 != null && mke.m158756c(edgeEffect2) != 0.0f) {
                boolean zCanScrollVertically = canScrollVertically(1);
                EdgeEffect edgeEffect3 = this.mBottomGlow;
                if (zCanScrollVertically) {
                    edgeEffect3.onRelease();
                } else {
                    float fM158758h = mke.m158758h(edgeEffect3, height, 1.0f - width);
                    if (mke.m158756c(this.mBottomGlow) == 0.0f) {
                        this.mBottomGlow.onRelease();
                    }
                    f2 = fM158758h;
                }
                invalidate();
            }
        } else {
            boolean zCanScrollVertically2 = canScrollVertically(-1);
            EdgeEffect edgeEffect4 = this.mTopGlow;
            if (zCanScrollVertically2) {
                edgeEffect4.onRelease();
            } else {
                float f3 = -mke.m158758h(edgeEffect4, -height, width);
                if (mke.m158756c(this.mTopGlow) == 0.0f) {
                    this.mTopGlow.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getHeight());
    }

    private void requestChildOnScreen(@NonNull View view, @Nullable View view2) {
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C0580p) {
            C0580p c0580p = (C0580p) layoutParams;
            if (!c0580p.f2610c) {
                Rect rect = c0580p.f2609b;
                Rect rect2 = this.mTempRect;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        this.mLayout.requestChildRectangleOnScreen(this, view, this.mTempRect, !this.mFirstLayoutComplete, view2 == null);
    }

    private void resetFocusInfo() {
        C0561a0 c0561a0 = this.mState;
        c0561a0.f2581n = -1L;
        c0561a0.f2580m = -1;
        c0561a0.f2582o = -1;
    }

    private void resetScroll() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        releaseGlows();
    }

    private void saveFocusInfo() {
        int absoluteAdapterPosition;
        View focusedChild = (this.mPreserveFocusAfterLayout && hasFocus() && this.mAdapter != null) ? getFocusedChild() : null;
        AbstractC0569e0 abstractC0569e0FindContainingViewHolder = focusedChild != null ? findContainingViewHolder(focusedChild) : null;
        if (abstractC0569e0FindContainingViewHolder == null) {
            resetFocusInfo();
            return;
        }
        this.mState.f2581n = this.mAdapter.hasStableIds() ? abstractC0569e0FindContainingViewHolder.getItemId() : -1L;
        C0561a0 c0561a0 = this.mState;
        if (this.mDataSetHasChangedAfterLayout) {
            absoluteAdapterPosition = -1;
        } else {
            absoluteAdapterPosition = abstractC0569e0FindContainingViewHolder.isRemoved() ? abstractC0569e0FindContainingViewHolder.mOldPosition : abstractC0569e0FindContainingViewHolder.getAbsoluteAdapterPosition();
        }
        c0561a0.f2580m = absoluteAdapterPosition;
        this.mState.f2582o = getDeepestFocusedViewWithId(abstractC0569e0FindContainingViewHolder.itemView);
    }

    private void setAdapterInternal(@Nullable Adapter<?> adapter, boolean z, boolean z2) {
        Adapter adapter2 = this.mAdapter;
        if (adapter2 != null) {
            adapter2.unregisterAdapterDataObserver(this.mObserver);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }
        if (!z || z2) {
            removeAndRecycleViews();
        }
        this.mAdapterHelper.m3629y();
        Adapter<?> adapter3 = this.mAdapter;
        this.mAdapter = adapter;
        if (adapter != null) {
            adapter.registerAdapterDataObserver(this.mObserver);
            adapter.onAttachedToRecyclerView(this);
        }
        AbstractC0579o abstractC0579o = this.mLayout;
        if (abstractC0579o != null) {
            abstractC0579o.onAdapterChanged(adapter3, this.mAdapter);
        }
        this.mRecycler.m3485y(adapter3, this.mAdapter, z);
        this.mState.f2574g = true;
    }

    public static void setDebugAssertionsEnabled(boolean z) {
        sDebugAssertionsEnabled = z;
    }

    public static void setVerboseLoggingEnabled(boolean z) {
        sVerboseLoggingEnabled = z;
    }

    private boolean shouldAbsorb(@NonNull EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        return getSplineFlingDistance(-i) < mke.m158756c(edgeEffect) * ((float) i2);
    }

    private boolean stopGlowAnimations(MotionEvent motionEvent) {
        boolean z;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || mke.m158756c(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
            z = false;
        } else {
            mke.m158758h(this.mLeftGlow, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
            z = true;
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && mke.m158756c(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
            mke.m158758h(this.mRightGlow, 0.0f, motionEvent.getY() / getHeight());
            z = true;
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && mke.m158756c(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
            mke.m158758h(this.mTopGlow, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 == null || mke.m158756c(edgeEffect4) == 0.0f || canScrollVertically(1)) {
            return z;
        }
        mke.m158758h(this.mBottomGlow, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    private void stopScrollersInternal() {
        this.mViewFlinger.stop();
        AbstractC0579o abstractC0579o = this.mLayout;
        if (abstractC0579o != null) {
            abstractC0579o.stopSmoothScroller();
        }
    }

    public void absorbGlows(int i, int i2) {
        if (i < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i);
            }
        } else if (i > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i);
            }
        }
        if (i2 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i2);
            }
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        kkl0.m150146a0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        AbstractC0579o abstractC0579o = this.mLayout;
        if (abstractC0579o == null || !abstractC0579o.onAddFocusables(this, arrayList, i, i2)) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    public void addItemDecoration(@NonNull AbstractC0578n abstractC0578n, int i) {
        AbstractC0579o abstractC0579o = this.mLayout;
        if (abstractC0579o != null) {
            abstractC0579o.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        ArrayList<AbstractC0578n> arrayList = this.mItemDecorations;
        if (i < 0) {
            arrayList.add(abstractC0578n);
        } else {
            arrayList.add(i, abstractC0578n);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(@NonNull InterfaceC0581q interfaceC0581q) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(interfaceC0581q);
    }

    public void addOnItemTouchListener(@NonNull InterfaceC0583s interfaceC0583s) {
        this.mOnItemTouchListeners.add(interfaceC0583s);
    }

    public void addOnScrollListener(@NonNull AbstractC0584t abstractC0584t) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(abstractC0584t);
    }

    public void addRecyclerListener(@NonNull InterfaceC0587w interfaceC0587w) {
        yn80.m216772b(interfaceC0587w != null, "'listener' arg cannot be null.");
        this.mRecyclerListeners.add(interfaceC0587w);
    }

    public void animateAppearance(@NonNull AbstractC0569e0 abstractC0569e0, @Nullable AbstractC0576l.c cVar, @NonNull AbstractC0576l.c cVar2) {
        abstractC0569e0.setIsRecyclable(false);
        if (this.mItemAnimator.animateAppearance(abstractC0569e0, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    public void animateDisappearance(@NonNull AbstractC0569e0 abstractC0569e0, @NonNull AbstractC0576l.c cVar, @Nullable AbstractC0576l.c cVar2) {
        addAnimatingView(abstractC0569e0);
        abstractC0569e0.setIsRecyclable(false);
        if (this.mItemAnimator.animateDisappearance(abstractC0569e0, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    public void assertInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            return;
        }
        if (str == null) {
            qg50.m176437a("Cannot call this method unless RecyclerView is computing a layout or scrolling", exceptionLabel());
        } else {
            rrc0.m182720a(str, exceptionLabel());
        }
    }

    public void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str == null) {
                qg50.m176437a("Cannot call this method while RecyclerView is computing a layout or scrolling", exceptionLabel());
                return;
            } else {
                wtq0.m207906a(str);
                return;
            }
        }
        if (this.mDispatchScrollCounter > 0) {
            new IllegalStateException("" + exceptionLabel());
        }
    }

    public boolean canReuseUpdatedViewHolder(AbstractC0569e0 abstractC0569e0) {
        AbstractC0576l abstractC0576l = this.mItemAnimator;
        return abstractC0576l == null || abstractC0576l.canReuseUpdatedViewHolder(abstractC0569e0, abstractC0569e0.getUnmodifiedPayloads());
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0580p) && this.mLayout.checkLayoutParams((C0580p) layoutParams);
    }

    public void clearOldPositions() {
        int iM3661j = this.mChildHelper.m3661j();
        for (int i = 0; i < iM3661j; i++) {
            AbstractC0569e0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m3660i(i));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.clearOldPosition();
            }
        }
        this.mRecycler.m3464d();
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<InterfaceC0581q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List<AbstractC0584t> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        AbstractC0579o abstractC0579o = this.mLayout;
        if (abstractC0579o != null && abstractC0579o.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        AbstractC0579o abstractC0579o = this.mLayout;
        if (abstractC0579o != null && abstractC0579o.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        AbstractC0579o abstractC0579o = this.mLayout;
        if (abstractC0579o != null && abstractC0579o.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollRange(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        AbstractC0579o abstractC0579o = this.mLayout;
        if (abstractC0579o != null && abstractC0579o.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        AbstractC0579o abstractC0579o = this.mLayout;
        if (abstractC0579o != null && abstractC0579o.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        AbstractC0579o abstractC0579o = this.mLayout;
        if (abstractC0579o != null && abstractC0579o.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollRange(this.mState);
        }
        return 0;
    }

    public void considerReleasingGlowsOnScroll(int i, int i2) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            zIsFinished = false;
        } else {
            this.mLeftGlow.onRelease();
            zIsFinished = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.mRightGlow.onRelease();
            zIsFinished |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.mTopGlow.onRelease();
            zIsFinished |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.mBottomGlow.onRelease();
            zIsFinished |= this.mBottomGlow.isFinished();
        }
        if (zIsFinished) {
            kkl0.m150146a0(this);
        }
    }

    public int consumeFlingInHorizontalStretch(int i) {
        return consumeFlingInStretch(i, this.mLeftGlow, this.mRightGlow, getWidth());
    }

    public int consumeFlingInVerticalStretch(int i) {
        return consumeFlingInStretch(i, this.mTopGlow, this.mBottomGlow, getHeight());
    }

    public void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            cej0.m109373a(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
            dispatchLayout();
            cej0.m109374b();
            return;
        }
        if (this.mAdapterHelper.m3620p()) {
            if (!this.mAdapterHelper.m3619o(4) || this.mAdapterHelper.m3619o(11)) {
                if (this.mAdapterHelper.m3620p()) {
                    cej0.m109373a(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                    dispatchLayout();
                    cej0.m109374b();
                    return;
                }
                return;
            }
            cej0.m109373a(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            this.mAdapterHelper.m3627w();
            if (!this.mLayoutWasDefered) {
                if (hasUpdatedView()) {
                    dispatchLayout();
                } else {
                    this.mAdapterHelper.m3613i();
                }
            }
            stopInterceptRequestLayout(true);
            onExitLayoutOrScroll();
            cej0.m109374b();
        }
    }

    public void defaultOnMeasure(int i, int i2) {
        setMeasuredDimension(AbstractC0579o.chooseSize(i, getPaddingLeft() + getPaddingRight(), kkl0.m150195z(this)), AbstractC0579o.chooseSize(i2, getPaddingTop() + getPaddingBottom(), kkl0.m150193y(this)));
    }

    public void dispatchChildAttached(View view) {
        AbstractC0569e0 childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        Adapter adapter = this.mAdapter;
        if (adapter != null && childViewHolderInt != null) {
            adapter.onViewAttachedToWindow(childViewHolderInt);
        }
        List<InterfaceC0581q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).mo3423d(view);
            }
        }
    }

    public void dispatchChildDetached(View view) {
        AbstractC0569e0 childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        Adapter adapter = this.mAdapter;
        if (adapter != null && childViewHolderInt != null) {
            adapter.onViewDetachedFromWindow(childViewHolderInt);
        }
        List<InterfaceC0581q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).mo3422b(view);
            }
        }
    }

    public void dispatchLayout() {
        if (this.mAdapter == null) {
            return;
        }
        if (this.mLayout == null) {
            Log.e(TAG, "No layout manager attached; skipping layout");
            return;
        }
        this.mState.f2577j = false;
        boolean z = this.mLastAutoMeasureSkippedDueToExact && !(this.mLastAutoMeasureNonExactMeasuredWidth == getWidth() && this.mLastAutoMeasureNonExactMeasuredHeight == getHeight());
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mLastAutoMeasureSkippedDueToExact = false;
        if (this.mState.f2572e == 1) {
            dispatchLayoutStep1();
            this.mLayout.setExactMeasureSpecsFrom(this);
            dispatchLayoutStep2();
        } else if (this.mAdapterHelper.m3621q() || z || this.mLayout.getWidth() != getWidth() || this.mLayout.getHeight() != getHeight()) {
            this.mLayout.setExactMeasureSpecsFrom(this);
            dispatchLayoutStep2();
        } else {
            this.mLayout.setExactMeasureSpecsFrom(this);
        }
        dispatchLayoutStep3();
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().m104391a(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().m104392b(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m104393c(i, i2, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().m104396f(i, i2, i3, i4, iArr);
    }

    public void dispatchOnScrollStateChanged(int i) {
        AbstractC0579o abstractC0579o = this.mLayout;
        if (abstractC0579o != null) {
            abstractC0579o.onScrollStateChanged(i);
        }
        onScrollStateChanged(i);
        AbstractC0584t abstractC0584t = this.mScrollListener;
        if (abstractC0584t != null) {
            abstractC0584t.onScrollStateChanged(this, i);
        }
        List<AbstractC0584t> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrollStateChanged(this, i);
            }
        }
    }

    public void dispatchOnScrolled(int i, int i2) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        onScrolled(i, i2);
        AbstractC0584t abstractC0584t = this.mScrollListener;
        if (abstractC0584t != null) {
            abstractC0584t.onScrolled(this, i, i2);
        }
        List<AbstractC0584t> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrolled(this, i, i2);
            }
        }
        this.mDispatchScrollCounter--;
    }

    public void dispatchPendingImportantForAccessibilityChanges() {
        int i;
        int size = this.mPendingAccessibilityImportanceChange.size();
        while (true) {
            size--;
            List<AbstractC0569e0> list = this.mPendingAccessibilityImportanceChange;
            if (size < 0) {
                list.clear();
                return;
            }
            AbstractC0569e0 abstractC0569e0 = list.get(size);
            if (abstractC0569e0.itemView.getParent() == this && !abstractC0569e0.shouldIgnore() && (i = abstractC0569e0.mPendingAccessibilityState) != -1) {
                kkl0.m150184t0(abstractC0569e0.itemView, i);
                abstractC0569e0.mPendingAccessibilityState = -1;
            }
        }
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            this.mItemDecorations.get(i).onDrawOver(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.mClipToPadding ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.mClipToPadding ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.mRightGlow;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(iSave4);
        }
        if ((z || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.isRunning()) ? z : true) {
            kkl0.m150146a0(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public void ensureBottomGlow() {
        if (this.mBottomGlow != null) {
            return;
        }
        EdgeEffect edgeEffectMo3367a = this.mEdgeEffectFactory.mo3367a(this, 3);
        this.mBottomGlow = edgeEffectMo3367a;
        if (this.mClipToPadding) {
            edgeEffectMo3367a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectMo3367a.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void ensureLeftGlow() {
        if (this.mLeftGlow != null) {
            return;
        }
        EdgeEffect edgeEffectMo3367a = this.mEdgeEffectFactory.mo3367a(this, 0);
        this.mLeftGlow = edgeEffectMo3367a;
        if (this.mClipToPadding) {
            edgeEffectMo3367a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectMo3367a.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureRightGlow() {
        if (this.mRightGlow != null) {
            return;
        }
        EdgeEffect edgeEffectMo3367a = this.mEdgeEffectFactory.mo3367a(this, 2);
        this.mRightGlow = edgeEffectMo3367a;
        if (this.mClipToPadding) {
            edgeEffectMo3367a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectMo3367a.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureTopGlow() {
        if (this.mTopGlow != null) {
            return;
        }
        EdgeEffect edgeEffectMo3367a = this.mEdgeEffectFactory.mo3367a(this, 1);
        this.mTopGlow = edgeEffectMo3367a;
        if (this.mClipToPadding) {
            edgeEffectMo3367a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectMo3367a.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public String exceptionLabel() {
        return MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    public final void fillRemainingScrollValues(C0561a0 c0561a0) {
        if (getScrollState() != 2) {
            c0561a0.f2583p = 0;
            c0561a0.f2584q = 0;
        } else {
            OverScroller overScroller = this.mViewFlinger.f2589c;
            c0561a0.f2583p = overScroller.getFinalX() - overScroller.getCurrX();
            c0561a0.f2584q = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    @Nullable
    public View findChildViewUnder(float f, float f2) {
        for (int iM3658g = this.mChildHelper.m3658g() - 1; iM3658g >= 0; iM3658g--) {
            View viewM3657f = this.mChildHelper.m3657f(iM3658g);
            float translationX = viewM3657f.getTranslationX();
            float translationY = viewM3657f.getTranslationY();
            if (f >= viewM3657f.getLeft() + translationX && f <= viewM3657f.getRight() + translationX && f2 >= viewM3657f.getTop() + translationY && f2 <= viewM3657f.getBottom() + translationY) {
                return viewM3657f;
            }
        }
        return null;
    }

    @Nullable
    public View findContainingItemView(@NonNull View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    @Nullable
    public AbstractC0569e0 findContainingViewHolder(@NonNull View view) {
        View viewFindContainingItemView = findContainingItemView(view);
        if (viewFindContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(viewFindContainingItemView);
    }

    @Nullable
    public AbstractC0569e0 findViewHolderForAdapterPosition(int i) {
        AbstractC0569e0 abstractC0569e0 = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int iM3661j = this.mChildHelper.m3661j();
        for (int i2 = 0; i2 < iM3661j; i2++) {
            AbstractC0569e0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m3660i(i2));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && getAdapterPositionInRecyclerView(childViewHolderInt) == i) {
                if (!this.mChildHelper.m3665n(childViewHolderInt.itemView)) {
                    return childViewHolderInt;
                }
                abstractC0569e0 = childViewHolderInt;
            }
        }
        return abstractC0569e0;
    }

    public AbstractC0569e0 findViewHolderForItemId(long j) {
        Adapter adapter = this.mAdapter;
        AbstractC0569e0 abstractC0569e0 = null;
        if (adapter != null && adapter.hasStableIds()) {
            int iM3661j = this.mChildHelper.m3661j();
            for (int i = 0; i < iM3661j; i++) {
                AbstractC0569e0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m3660i(i));
                if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && childViewHolderInt.getItemId() == j) {
                    if (!this.mChildHelper.m3665n(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    abstractC0569e0 = childViewHolderInt;
                }
            }
        }
        return abstractC0569e0;
    }

    @Nullable
    public AbstractC0569e0 findViewHolderForLayoutPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0034  */
    /* JADX WARN: Code duplicated, block: B:22:0x0036 A[SYNTHETIC] */
    @Nullable
    public AbstractC0569e0 findViewHolderForPosition(int i, boolean z) {
        int iM3661j = this.mChildHelper.m3661j();
        AbstractC0569e0 abstractC0569e0 = null;
        for (int i2 = 0; i2 < iM3661j; i2++) {
            AbstractC0569e0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m3660i(i2));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved()) {
                if (z) {
                    if (childViewHolderInt.mPosition != i) {
                        continue;
                    } else {
                        if (this.mChildHelper.m3665n(childViewHolderInt.itemView)) {
                            return childViewHolderInt;
                        }
                        abstractC0569e0 = childViewHolderInt;
                    }
                } else if (childViewHolderInt.getLayoutPosition() != i) {
                    continue;
                } else {
                    if (this.mChildHelper.m3665n(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    abstractC0569e0 = childViewHolderInt;
                }
            }
        }
        return abstractC0569e0;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x007a  */
    /* JADX WARN: Code duplicated, block: B:57:0x00bc  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5 */
    public boolean fling(int i, int i2) {
        int iMax;
        int i3;
        AbstractC0579o abstractC0579o = this.mLayout;
        if (abstractC0579o == null) {
            Log.e(TAG, "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.mLayoutSuppressed) {
            return false;
        }
        int iCanScrollHorizontally = abstractC0579o.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (iCanScrollHorizontally == 0 || Math.abs(i) < this.mMinFlingVelocity) {
            i = 0;
        }
        if (!zCanScrollVertically || Math.abs(i2) < this.mMinFlingVelocity) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return false;
        }
        if (i == 0) {
            iMax = 0;
        } else {
            EdgeEffect edgeEffect = this.mLeftGlow;
            if (edgeEffect == null || mke.m158756c(edgeEffect) == 0.0f) {
                EdgeEffect edgeEffect2 = this.mRightGlow;
                if (edgeEffect2 == null || mke.m158756c(edgeEffect2) == 0.0f) {
                    iMax = 0;
                } else if (shouldAbsorb(this.mRightGlow, i, getWidth())) {
                    this.mRightGlow.onAbsorb(i);
                    i = 0;
                }
            } else {
                int i4 = -i;
                if (shouldAbsorb(this.mLeftGlow, i4, getWidth())) {
                    this.mLeftGlow.onAbsorb(i4);
                    i = 0;
                }
            }
            iMax = i;
            i = 0;
        }
        if (i2 == 0) {
            i3 = i2;
            i2 = 0;
        } else {
            EdgeEffect edgeEffect3 = this.mTopGlow;
            if (edgeEffect3 == null || mke.m158756c(edgeEffect3) == 0.0f) {
                EdgeEffect edgeEffect4 = this.mBottomGlow;
                if (edgeEffect4 == null || mke.m158756c(edgeEffect4) == 0.0f) {
                    i3 = i2;
                    i2 = 0;
                } else if (shouldAbsorb(this.mBottomGlow, i2, getHeight())) {
                    this.mBottomGlow.onAbsorb(i2);
                    i2 = 0;
                }
            } else {
                int i5 = -i2;
                if (shouldAbsorb(this.mTopGlow, i5, getHeight())) {
                    this.mTopGlow.onAbsorb(i5);
                    i2 = 0;
                }
            }
            i3 = 0;
        }
        if (iMax != 0 || i2 != 0) {
            int i6 = this.mMaxFlingVelocity;
            iMax = Math.max(-i6, Math.min(iMax, i6));
            int i7 = this.mMaxFlingVelocity;
            i2 = Math.max(-i7, Math.min(i2, i7));
            this.mViewFlinger.m3374b(iMax, i2);
        }
        if (i == 0 && i3 == 0) {
            return (iMax == 0 && i2 == 0) ? false : true;
        }
        float f = i;
        float f2 = i3;
        if (!dispatchNestedPreFling(f, f2)) {
            boolean z = iCanScrollHorizontally != 0 || zCanScrollVertically;
            dispatchNestedFling(f, f2, z);
            AbstractC0582r abstractC0582r = this.mOnFlingListener;
            if (abstractC0582r != null && abstractC0582r.mo3424a(i, i3)) {
                return true;
            }
            if (z) {
                if (zCanScrollVertically) {
                    iCanScrollHorizontally = (iCanScrollHorizontally == true ? 1 : 0) | 2;
                }
                startNestedScroll(iCanScrollHorizontally, 1);
                int i8 = this.mMaxFlingVelocity;
                int iMax2 = Math.max(-i8, Math.min(i, i8));
                int i9 = this.mMaxFlingVelocity;
                this.mViewFlinger.m3374b(iMax2, Math.max(-i9, Math.min(i3, i9)));
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i) {
        View viewOnFocusSearchFailed;
        boolean z;
        View viewOnInterceptFocusSearch = this.mLayout.onInterceptFocusSearch(view, i);
        if (viewOnInterceptFocusSearch != null) {
            return viewOnInterceptFocusSearch;
        }
        boolean z2 = (this.mAdapter == null || this.mLayout == null || isComputingLayout() || this.mLayoutSuppressed) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z2 && (i == 2 || i == 1)) {
            if (this.mLayout.canScrollVertically()) {
                int i2 = i == 2 ? 130 : 33;
                z = focusFinder.findNextFocus(this, view, i2) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i = i2;
                }
            } else {
                z = false;
            }
            if (!z && this.mLayout.canScrollHorizontally()) {
                int i3 = (this.mLayout.getLayoutDirection() == 1) ^ (i == 2) ? 66 : 17;
                boolean z3 = focusFinder.findNextFocus(this, view, i3) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i = i3;
                }
                z = z3;
            }
            if (z) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                this.mLayout.onFocusSearchFailed(view, i, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            viewOnFocusSearchFailed = focusFinder.findNextFocus(this, view, i);
        } else {
            View viewFindNextFocus = focusFinder.findNextFocus(this, view, i);
            if (viewFindNextFocus == null && z2) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                viewOnFocusSearchFailed = this.mLayout.onFocusSearchFailed(view, i, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            } else {
                viewOnFocusSearchFailed = viewFindNextFocus;
            }
        }
        if (viewOnFocusSearchFailed == null || viewOnFocusSearchFailed.hasFocusable()) {
            return isPreferredNextFocus(view, viewOnFocusSearchFailed, i) ? viewOnFocusSearchFailed : super.focusSearch(view, i);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i);
        }
        requestChildOnScreen(viewOnFocusSearchFailed, null);
        return view;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC0579o abstractC0579o = this.mLayout;
        if (abstractC0579o != null) {
            return abstractC0579o.generateDefaultLayoutParams();
        }
        qg50.m176437a("RecyclerView has no LayoutManager", exceptionLabel());
        return null;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC0579o abstractC0579o = this.mLayout;
        if (abstractC0579o != null) {
            return abstractC0579o.generateLayoutParams(getContext(), attributeSet);
        }
        qg50.m176437a("RecyclerView has no LayoutManager", exceptionLabel());
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    @Nullable
    public Adapter getAdapter() {
        return this.mAdapter;
    }

    public int getAdapterPositionInRecyclerView(AbstractC0569e0 abstractC0569e0) {
        if (abstractC0569e0.hasAnyOfTheFlags(524) || !abstractC0569e0.isBound()) {
            return -1;
        }
        return this.mAdapterHelper.m3609e(abstractC0569e0.mPosition);
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC0579o abstractC0579o = this.mLayout;
        return abstractC0579o != null ? abstractC0579o.getBaseline() : super.getBaseline();
    }

    public long getChangedHolderKey(AbstractC0569e0 abstractC0569e0) {
        return this.mAdapter.hasStableIds() ? abstractC0569e0.getItemId() : abstractC0569e0.mPosition;
    }

    public int getChildAdapterPosition(@NonNull View view) {
        AbstractC0569e0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    public long getChildItemId(@NonNull View view) {
        AbstractC0569e0 childViewHolderInt;
        Adapter adapter = this.mAdapter;
        if (adapter == null || !adapter.hasStableIds() || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1L;
        }
        return childViewHolderInt.getItemId();
    }

    public int getChildLayoutPosition(@NonNull View view) {
        AbstractC0569e0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getLayoutPosition();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(@NonNull View view) {
        return getChildAdapterPosition(view);
    }

    public AbstractC0569e0 getChildViewHolder(@NonNull View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return getChildViewHolderInt(view);
        }
        wwq0.m208289a("View ", view, " is not a direct child of ", this);
        return null;
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    @Nullable
    public C0616t getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(@NonNull View view, @NonNull Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    @NonNull
    public C0575k getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    @Nullable
    public AbstractC0576l getItemAnimator() {
        return this.mItemAnimator;
    }

    public Rect getItemDecorInsetsForChild(View view) {
        C0580p c0580p = (C0580p) view.getLayoutParams();
        if (!c0580p.f2610c) {
            return c0580p.f2609b;
        }
        if (this.mState.m3364f() && (c0580p.m3419d() || c0580p.m3421f())) {
            return c0580p.f2609b;
        }
        Rect rect = c0580p.f2609b;
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            this.mTempRect.set(0, 0, 0, 0);
            this.mItemDecorations.get(i).getItemOffsets(this.mTempRect, view, this, this.mState);
            int i2 = rect.left;
            Rect rect2 = this.mTempRect;
            rect.left = i2 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        c0580p.f2610c = false;
        return rect;
    }

    @NonNull
    public AbstractC0578n getItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i >= 0 && i < itemDecorationCount) {
            return this.mItemDecorations.get(i);
        }
        throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    @Nullable
    public AbstractC0579o getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    public long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0L;
    }

    @Nullable
    public AbstractC0582r getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    @NonNull
    public C0585u getRecycledViewPool() {
        return this.mRecycler.m3469i();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().m104401k();
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.m3620p();
    }

    public void initAdapterManager() {
        this.mAdapterHelper = new C0597a(new C0570f());
    }

    @VisibleForTesting
    public void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            yg3.m215829a("Trying to set fast scroller without both required drawables.", exceptionLabel());
        } else {
            Resources resources = getContext().getResources();
            new C0605i(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(qac0.f156370a), resources.getDimensionPixelSize(qac0.f156372c), resources.getDimensionPixelOffset(qac0.f156371b));
        }
    }

    public void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() == 0) {
            return;
        }
        AbstractC0579o abstractC0579o = this.mLayout;
        if (abstractC0579o != null) {
            abstractC0579o.assertNotInLayoutOrScroll("Cannot invalidate item decorations during a scroll or layout");
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean isAnimating() {
        AbstractC0576l abstractC0576l = this.mItemAnimator;
        return abstractC0576l != null && abstractC0576l.isRunning();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().m104403m();
    }

    public void jumpToPositionForSmoothScroller(int i) {
        if (this.mLayout == null) {
            return;
        }
        setScrollState(2);
        this.mLayout.scrollToPosition(i);
        awakenScrollBars();
    }

    public void markItemDecorInsetsDirty() {
        int iM3661j = this.mChildHelper.m3661j();
        for (int i = 0; i < iM3661j; i++) {
            ((C0580p) this.mChildHelper.m3660i(i).getLayoutParams()).f2610c = true;
        }
        this.mRecycler.m3479s();
    }

    public void markKnownViewsInvalid() {
        int iM3661j = this.mChildHelper.m3661j();
        for (int i = 0; i < iM3661j; i++) {
            AbstractC0569e0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m3660i(i));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.addFlags(6);
            }
        }
        markItemDecorInsetsDirty();
        this.mRecycler.m3480t();
    }

    public void nestedScrollBy(int i, int i2) {
        nestedScrollByInternal(i, i2, null, 1);
    }

    public void offsetChildrenHorizontal(@Px int i) {
        int iM3658g = this.mChildHelper.m3658g();
        for (int i2 = 0; i2 < iM3658g; i2++) {
            this.mChildHelper.m3657f(i2).offsetLeftAndRight(i);
        }
    }

    public void offsetChildrenVertical(@Px int i) {
        int iM3658g = this.mChildHelper.m3658g();
        for (int i2 = 0; i2 < iM3658g; i2++) {
            this.mChildHelper.m3657f(i2).offsetTopAndBottom(i);
        }
    }

    public void offsetPositionRecordsForInsert(int i, int i2) {
        int iM3661j = this.mChildHelper.m3661j();
        for (int i3 = 0; i3 < iM3661j; i3++) {
            AbstractC0569e0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m3660i(i3));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i) {
                if (sVerboseLoggingEnabled) {
                    childViewHolderInt.toString();
                }
                childViewHolderInt.offsetPosition(i2, false);
                this.mState.f2574g = true;
            }
        }
        this.mRecycler.m3482v(i, i2);
        requestLayout();
    }

    public void offsetPositionRecordsForMove(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int iM3661j = this.mChildHelper.m3661j();
        if (i < i2) {
            i5 = -1;
            i4 = i;
            i3 = i2;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i7 = 0; i7 < iM3661j; i7++) {
            AbstractC0569e0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m3660i(i7));
            if (childViewHolderInt != null && (i6 = childViewHolderInt.mPosition) >= i4 && i6 <= i3) {
                if (sVerboseLoggingEnabled) {
                    childViewHolderInt.toString();
                }
                if (childViewHolderInt.mPosition == i) {
                    childViewHolderInt.offsetPosition(i2 - i, false);
                } else {
                    childViewHolderInt.offsetPosition(i5, false);
                }
                this.mState.f2574g = true;
            }
        }
        this.mRecycler.m3483w(i, i2);
        requestLayout();
    }

    public void offsetPositionRecordsForRemove(int i, int i2, boolean z) {
        int i3 = i + i2;
        int iM3661j = this.mChildHelper.m3661j();
        for (int i4 = 0; i4 < iM3661j; i4++) {
            AbstractC0569e0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m3660i(i4));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                int i5 = childViewHolderInt.mPosition;
                if (i5 >= i3) {
                    if (sVerboseLoggingEnabled) {
                        childViewHolderInt.toString();
                    }
                    childViewHolderInt.offsetPosition(-i2, z);
                    this.mState.f2574g = true;
                } else if (i5 >= i) {
                    if (sVerboseLoggingEnabled) {
                        childViewHolderInt.toString();
                    }
                    childViewHolderInt.flagRemovedAndOffsetPosition(i - 1, -i2, z);
                    this.mState.f2574g = true;
                }
            }
        }
        this.mRecycler.m3484x(i, i2, z);
        requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0053  */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.mLayoutOrScrollCounter = 0;
        this.mIsAttached = true;
        this.mFirstLayoutComplete = this.mFirstLayoutComplete && !isLayoutRequested();
        this.mRecycler.m3486z();
        AbstractC0579o abstractC0579o = this.mLayout;
        if (abstractC0579o != null) {
            abstractC0579o.dispatchAttachedToWindow(this);
        }
        this.mPostedAnimatorRunner = false;
        if (ALLOW_THREAD_GAP_WORK) {
            ThreadLocal<RunnableC0606j> threadLocal = RunnableC0606j.f2827e;
            RunnableC0606j runnableC0606j = threadLocal.get();
            this.mGapWorker = runnableC0606j;
            if (runnableC0606j == null) {
                this.mGapWorker = new RunnableC0606j();
                Display displayM150181s = kkl0.m150181s(this);
                if (isInEditMode() || displayM150181s == null) {
                    refreshRate = 60.0f;
                } else {
                    refreshRate = displayM150181s.getRefreshRate();
                    if (refreshRate < 30.0f) {
                        refreshRate = 60.0f;
                    }
                }
                RunnableC0606j runnableC0606j2 = this.mGapWorker;
                runnableC0606j2.f2831c = (long) (1.0E9f / refreshRate);
                threadLocal.set(runnableC0606j2);
            }
            this.mGapWorker.m3729a(this);
        }
    }

    public void onChildAttachedToWindow(@NonNull View view) {
    }

    public void onChildDetachedFromWindow(@NonNull View view) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        RunnableC0606j runnableC0606j;
        super.onDetachedFromWindow();
        AbstractC0576l abstractC0576l = this.mItemAnimator;
        if (abstractC0576l != null) {
            abstractC0576l.endAnimations();
        }
        stopScroll();
        this.mIsAttached = false;
        AbstractC0579o abstractC0579o = this.mLayout;
        if (abstractC0579o != null) {
            abstractC0579o.dispatchDetachedFromWindow(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.m3881j();
        this.mRecycler.m3443A();
        kj80.m150023b(this);
        if (!ALLOW_THREAD_GAP_WORK || (runnableC0606j = this.mGapWorker) == null) {
            return;
        }
        runnableC0606j.m3737j(this);
        this.mGapWorker = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            this.mItemDecorations.get(i).onDraw(canvas, this, this.mState);
        }
    }

    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    public void onExitLayoutOrScroll(boolean z) {
        int i = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i;
        if (i < 1) {
            if (sDebugAssertionsEnabled && i < 0) {
                qg50.m176437a("layout or scroll counter cannot go below zero.Some calls are not matching", exceptionLabel());
                return;
            }
            this.mLayoutOrScrollCounter = 0;
            if (z) {
                dispatchContentChangedIfNecessary();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0062  */
    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float axisValue;
        if (this.mLayout != null && !this.mLayoutSuppressed && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f = this.mLayout.canScrollVertically() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.mLayout.canScrollHorizontally() ? motionEvent.getAxisValue(10) : 0.0f;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                float axisValue2 = motionEvent.getAxisValue(26);
                if (this.mLayout.canScrollVertically()) {
                    f = -axisValue2;
                } else if (this.mLayout.canScrollHorizontally()) {
                    axisValue = axisValue2;
                    f = 0.0f;
                } else {
                    f = 0.0f;
                    axisValue = 0.0f;
                }
            } else {
                f = 0.0f;
                axisValue = 0.0f;
            }
            if (f != 0.0f || axisValue != 0.0f) {
                nestedScrollByInternal((int) (axisValue * this.mScaledHorizontalScrollFactor), (int) (f * this.mScaledVerticalScrollFactor), motionEvent, 1);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (findInterceptingOnItemTouchListener(motionEvent)) {
            cancelScroll();
            return true;
        }
        AbstractC0579o abstractC0579o = this.mLayout;
        if (abstractC0579o == null) {
            return false;
        }
        boolean zCanScrollHorizontally = abstractC0579o.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.mIgnoreMotionEventTillDown) {
                this.mIgnoreMotionEventTillDown = false;
            }
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
            if (stopGlowAnimations(motionEvent) || this.mScrollState == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            int i = zCanScrollHorizontally;
            if (zCanScrollVertically) {
                i = (zCanScrollHorizontally ? 1 : 0) | 2;
            }
            startNestedScroll(i, 0);
        } else if (actionMasked == 1) {
            this.mVelocityTracker.clear();
            stopNestedScroll(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
            if (iFindPointerIndex < 0) {
                Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.mScrollState != 1) {
                int i2 = x2 - this.mInitialTouchX;
                int i3 = y2 - this.mInitialTouchY;
                if (!zCanScrollHorizontally || Math.abs(i2) <= this.mTouchSlop) {
                    z = false;
                } else {
                    this.mLastTouchX = x2;
                    z = true;
                }
                if (zCanScrollVertically && Math.abs(i3) > this.mTouchSlop) {
                    this.mLastTouchY = y2;
                    z = true;
                }
                if (z) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            cancelScroll();
        } else if (actionMasked == 5) {
            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.mLastTouchX = x3;
            this.mInitialTouchX = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.mLastTouchY = y3;
            this.mInitialTouchY = y3;
        } else if (actionMasked == 6) {
            onPointerUp(motionEvent);
        }
        return this.mScrollState == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        cej0.m109373a(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        cej0.m109374b();
        this.mFirstLayoutComplete = true;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        AbstractC0579o abstractC0579o = this.mLayout;
        if (abstractC0579o == null) {
            defaultOnMeasure(i, i2);
            return;
        }
        boolean z = false;
        if (abstractC0579o.isAutoMeasureEnabled()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.mLayout.onMeasure(this.mRecycler, this.mState, i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.mLastAutoMeasureSkippedDueToExact = z;
            if (z || this.mAdapter == null) {
                return;
            }
            if (this.mState.f2572e == 1) {
                dispatchLayoutStep1();
            }
            this.mLayout.setMeasureSpecs(i, i2);
            this.mState.f2577j = true;
            dispatchLayoutStep2();
            this.mLayout.setMeasuredDimensionFromChildren(i, i2);
            if (this.mLayout.shouldMeasureTwice()) {
                this.mLayout.setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.mState.f2577j = true;
                dispatchLayoutStep2();
                this.mLayout.setMeasuredDimensionFromChildren(i, i2);
            }
            this.mLastAutoMeasureNonExactMeasuredWidth = getMeasuredWidth();
            this.mLastAutoMeasureNonExactMeasuredHeight = getMeasuredHeight();
            return;
        }
        if (this.mHasFixedSize) {
            this.mLayout.onMeasure(this.mRecycler, this.mState, i, i2);
            return;
        }
        if (this.mAdapterUpdateDuringMeasure) {
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            processAdapterUpdatesAndSetAnimationFlags();
            onExitLayoutOrScroll();
            C0561a0 c0561a0 = this.mState;
            if (c0561a0.f2579l) {
                c0561a0.f2575h = true;
            } else {
                this.mAdapterHelper.m3614j();
                this.mState.f2575h = false;
            }
            this.mAdapterUpdateDuringMeasure = false;
            stopInterceptRequestLayout(false);
        } else if (this.mState.f2579l) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        Adapter adapter = this.mAdapter;
        C0561a0 c0561a1 = this.mState;
        if (adapter != null) {
            c0561a1.f2573f = adapter.getItemCount();
        } else {
            c0561a1.f2573f = 0;
        }
        startInterceptRequestLayout();
        this.mLayout.onMeasure(this.mRecycler, this.mState, i, i2);
        stopInterceptRequestLayout(false);
        this.mState.f2575h = false;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.mPendingSavedState = savedState;
        super.onRestoreInstanceState(savedState.getSuperState());
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.mPendingSavedState;
        if (savedState2 != null) {
            savedState.m3355a(savedState2);
            return savedState;
        }
        AbstractC0579o abstractC0579o = this.mLayout;
        if (abstractC0579o != null) {
            savedState.mLayoutState = abstractC0579o.onSaveInstanceState();
            return savedState;
        }
        savedState.mLayoutState = null;
        return savedState;
    }

    public void onScrollStateChanged(int i) {
    }

    public void onScrolled(@Px int i, @Px int i2) {
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        invalidateGlows();
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00da A[PHI: r1
      0x00da: PHI (r1v45 int) = (r1v25 int), (r1v49 int) binds: [B:41:0x00c5, B:46:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        boolean z;
        if (this.mLayoutSuppressed || this.mIgnoreMotionEventTillDown) {
            return false;
        }
        if (dispatchToOnItemTouchListeners(motionEvent)) {
            cancelScroll();
            return true;
        }
        AbstractC0579o abstractC0579o = this.mLayout;
        if (abstractC0579o == null) {
            return false;
        }
        boolean zCanScrollHorizontally = abstractC0579o.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        int[] iArr2 = this.mNestedOffsets;
        motionEventObtain.offsetLocation(iArr2[0], iArr2[1]);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                this.mVelocityTracker.addMovement(motionEventObtain);
                this.mVelocityTracker.computeCurrentVelocity(1000, this.mMaxFlingVelocity);
                float f = zCanScrollHorizontally ? -this.mVelocityTracker.getXVelocity(this.mScrollPointerId) : 0.0f;
                float f2 = zCanScrollVertically ? -this.mVelocityTracker.getYVelocity(this.mScrollPointerId) : 0.0f;
                if ((f == 0.0f && f2 == 0.0f) || !fling((int) f, (int) f2)) {
                    setScrollState(0);
                }
                resetScroll();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
                if (iFindPointerIndex < 0) {
                    Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                int x = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                int y = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                int iMax = this.mLastTouchX - x;
                int iMax2 = this.mLastTouchY - y;
                if (this.mScrollState != 1) {
                    if (zCanScrollHorizontally) {
                        int i2 = this.mTouchSlop;
                        iMax = iMax > 0 ? Math.max(0, iMax - i2) : Math.min(0, iMax + i2);
                        if (iMax != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    if (zCanScrollVertically) {
                        int i3 = this.mTouchSlop;
                        iMax2 = iMax2 > 0 ? Math.max(0, iMax2 - i3) : Math.min(0, iMax2 + i3);
                        if (iMax2 != 0) {
                            z = true;
                        }
                    }
                    if (z) {
                        setScrollState(1);
                    }
                }
                if (this.mScrollState == 1) {
                    int[] iArr3 = this.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    int iReleaseHorizontalGlow = iMax - releaseHorizontalGlow(iMax, motionEvent.getY());
                    int iReleaseVerticalGlow = iMax2 - releaseVerticalGlow(iMax2, motionEvent.getX());
                    if (dispatchNestedPreScroll(zCanScrollHorizontally ? iReleaseHorizontalGlow : 0, zCanScrollVertically ? iReleaseVerticalGlow : 0, this.mReusableIntPair, this.mScrollOffset, 0)) {
                        int[] iArr4 = this.mReusableIntPair;
                        iReleaseHorizontalGlow -= iArr4[0];
                        iReleaseVerticalGlow -= iArr4[1];
                        int[] iArr5 = this.mNestedOffsets;
                        int i4 = iArr5[0];
                        int[] iArr6 = this.mScrollOffset;
                        iArr5[0] = i4 + iArr6[0];
                        iArr5[1] = iArr5[1] + iArr6[1];
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int[] iArr7 = this.mScrollOffset;
                    this.mLastTouchX = x - iArr7[0];
                    this.mLastTouchY = y - iArr7[1];
                    if (scrollByInternal(zCanScrollHorizontally ? iReleaseHorizontalGlow : 0, zCanScrollVertically ? iReleaseVerticalGlow : 0, motionEvent, 0)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    RunnableC0606j runnableC0606j = this.mGapWorker;
                    if (runnableC0606j != null && (iReleaseHorizontalGlow != 0 || iReleaseVerticalGlow != 0)) {
                        runnableC0606j.m3733f(this, iReleaseHorizontalGlow, iReleaseVerticalGlow);
                    }
                }
            } else if (actionMasked == 3) {
                cancelScroll();
            } else if (actionMasked == 5) {
                this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
                int x2 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.mLastTouchX = x2;
                this.mInitialTouchX = x2;
                int y2 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.mLastTouchY = y2;
                this.mInitialTouchY = y2;
            } else if (actionMasked == 6) {
                onPointerUp(motionEvent);
            }
            motionEventObtain.recycle();
            return true;
        }
        this.mScrollPointerId = motionEvent.getPointerId(0);
        int x3 = (int) (motionEvent.getX() + 0.5f);
        this.mLastTouchX = x3;
        this.mInitialTouchX = x3;
        int y3 = (int) (motionEvent.getY() + 0.5f);
        this.mLastTouchY = y3;
        this.mInitialTouchY = y3;
        if (zCanScrollVertically) {
            i = zCanScrollHorizontally;
            i = (zCanScrollHorizontally ? 1 : 0) | 2;
        }
        i = zCanScrollHorizontally;
        startNestedScroll(i, 0);
        this.mVelocityTracker.addMovement(motionEventObtain);
        motionEventObtain.recycle();
        return true;
    }

    public void postAnimationRunner() {
        if (this.mPostedAnimatorRunner || !this.mIsAttached) {
            return;
        }
        kkl0.m150148b0(this, this.mItemAnimatorRunner);
        this.mPostedAnimatorRunner = true;
    }

    public void processDataSetCompletelyChanged(boolean z) {
        this.mDispatchItemsChangedEvent = z | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    public void recordAnimationInfoIfBouncedHiddenView(AbstractC0569e0 abstractC0569e0, AbstractC0576l.c cVar) {
        abstractC0569e0.setFlags(0, 8192);
        if (this.mState.f2576i && abstractC0569e0.isUpdated() && !abstractC0569e0.isRemoved() && !abstractC0569e0.shouldIgnore()) {
            this.mViewInfoStore.m3874c(getChangedHolderKey(abstractC0569e0), abstractC0569e0);
        }
        this.mViewInfoStore.m3876e(abstractC0569e0, cVar);
    }

    public void removeAndRecycleViews() {
        AbstractC0576l abstractC0576l = this.mItemAnimator;
        if (abstractC0576l != null) {
            abstractC0576l.endAnimations();
        }
        AbstractC0579o abstractC0579o = this.mLayout;
        if (abstractC0579o != null) {
            abstractC0579o.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        }
        this.mRecycler.m3463c();
    }

    public boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        boolean zM3669r = this.mChildHelper.m3669r(view);
        if (zM3669r) {
            AbstractC0569e0 childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.m3457O(childViewHolderInt);
            this.mRecycler.m3450H(childViewHolderInt);
            if (sVerboseLoggingEnabled) {
                Objects.toString(view);
                toString();
            }
        }
        stopInterceptRequestLayout(!zM3669r);
        return zM3669r;
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z) {
        AbstractC0569e0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.isTmpDetached()) {
                childViewHolderInt.clearTmpDetachFlag();
            } else if (!childViewHolderInt.shouldIgnore()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(childViewHolderInt);
                trc0.m192469a(sb, exceptionLabel());
                return;
            }
        } else if (sDebugAssertionsEnabled) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            trc0.m192469a(sb2, exceptionLabel());
            return;
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z);
    }

    public void removeItemDecoration(@NonNull AbstractC0578n abstractC0578n) {
        AbstractC0579o abstractC0579o = this.mLayout;
        if (abstractC0579o != null) {
            abstractC0579o.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(abstractC0578n);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i >= 0 && i < itemDecorationCount) {
            removeItemDecoration(getItemDecorationAt(i));
            return;
        }
        throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
    }

    public void removeOnChildAttachStateChangeListener(@NonNull InterfaceC0581q interfaceC0581q) {
        List<InterfaceC0581q> list = this.mOnChildAttachStateListeners;
        if (list == null) {
            return;
        }
        list.remove(interfaceC0581q);
    }

    public void removeOnItemTouchListener(@NonNull InterfaceC0583s interfaceC0583s) {
        this.mOnItemTouchListeners.remove(interfaceC0583s);
        if (this.mInterceptingOnItemTouchListener == interfaceC0583s) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(@NonNull AbstractC0584t abstractC0584t) {
        List<AbstractC0584t> list = this.mScrollListeners;
        if (list != null) {
            list.remove(abstractC0584t);
        }
    }

    public void removeRecyclerListener(@NonNull InterfaceC0587w interfaceC0587w) {
        this.mRecyclerListeners.remove(interfaceC0587w);
    }

    public void repositionShadowingViews() {
        AbstractC0569e0 abstractC0569e0;
        int iM3658g = this.mChildHelper.m3658g();
        for (int i = 0; i < iM3658g; i++) {
            View viewM3657f = this.mChildHelper.m3657f(i);
            AbstractC0569e0 childViewHolder = getChildViewHolder(viewM3657f);
            if (childViewHolder != null && (abstractC0569e0 = childViewHolder.mShadowingHolder) != null) {
                View view = abstractC0569e0.itemView;
                int left = viewM3657f.getLeft();
                int top = viewM3657f.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.mLayout.onRequestChildFocus(this, this.mState, view, view2) && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.mLayout.requestChildRectangleOnScreen(this, view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.mOnItemTouchListeners.size();
        for (int i = 0; i < size; i++) {
            this.mOnItemTouchListeners.get(i).mo3427e(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth != 0 || this.mLayoutSuppressed) {
            this.mLayoutWasDefered = true;
        } else {
            super.requestLayout();
        }
    }

    public void saveOldPositions() {
        int iM3661j = this.mChildHelper.m3661j();
        for (int i = 0; i < iM3661j; i++) {
            AbstractC0569e0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m3660i(i));
            if (sDebugAssertionsEnabled && childViewHolderInt.mPosition == -1 && !childViewHolderInt.isRemoved()) {
                qg50.m176437a("view holder cannot have position -1 unless it is removed", exceptionLabel());
                return;
            } else {
                if (!childViewHolderInt.shouldIgnore()) {
                    childViewHolderInt.saveOldPosition();
                }
            }
        }
    }

    @Override // android.view.View
    public void scrollBy(int i, int i2) {
        AbstractC0579o abstractC0579o = this.mLayout;
        if (abstractC0579o == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        boolean zCanScrollHorizontally = abstractC0579o.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (zCanScrollHorizontally || zCanScrollVertically) {
            if (!zCanScrollHorizontally) {
                i = 0;
            }
            if (!zCanScrollVertically) {
                i2 = 0;
            }
            scrollByInternal(i, i2, null, 0);
        }
    }

    public boolean scrollByInternal(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i, i2, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i8 = iArr2[0];
            int i9 = iArr2[1];
            i6 = i - i8;
            i7 = i2 - i9;
            i5 = i9;
            i4 = i8;
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i4, i5, i6, i7, this.mScrollOffset, i3, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i10 = iArr4[0];
        int i11 = i6 - i10;
        int i12 = iArr4[1];
        int i13 = i7 - i12;
        boolean z = (i10 == 0 && i12 == 0) ? false : true;
        int i14 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        int i15 = iArr5[0];
        this.mLastTouchX = i14 - i15;
        int i16 = this.mLastTouchY;
        int i17 = iArr5[1];
        this.mLastTouchY = i16 - i17;
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + i15;
        iArr6[1] = iArr6[1] + i17;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !u610.m194647g(motionEvent, 8194)) {
                pullGlows(motionEvent.getX(), i11, motionEvent.getY(), i13);
            }
            considerReleasingGlowsOnScroll(i, i2);
        }
        if (i4 != 0 || i5 != 0) {
            dispatchOnScrolled(i4, i5);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z && i4 == 0 && i5 == 0) ? false : true;
    }

    public void scrollStep(int i, int i2, @Nullable int[] iArr) {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        cej0.m109373a(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        int iScrollHorizontallyBy = i != 0 ? this.mLayout.scrollHorizontallyBy(i, this.mRecycler, this.mState) : 0;
        int iScrollVerticallyBy = i2 != 0 ? this.mLayout.scrollVerticallyBy(i2, this.mRecycler, this.mState) : 0;
        cej0.m109374b();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = iScrollHorizontallyBy;
            iArr[1] = iScrollVerticallyBy;
        }
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
    }

    public void scrollToPosition(int i) {
        if (this.mLayoutSuppressed) {
            return;
        }
        stopScroll();
        AbstractC0579o abstractC0579o = this.mLayout;
        if (abstractC0579o == null) {
            Log.e(TAG, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC0579o.scrollToPosition(i);
            awakenScrollBars();
        }
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (shouldDeferAccessibilityEvent(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(@Nullable C0616t c0616t) {
        this.mAccessibilityDelegate = c0616t;
        kkl0.m150164j0(this, c0616t);
    }

    public void setAdapter(@Nullable Adapter adapter) {
        setLayoutFrozen(false);
        setAdapterInternal(adapter, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(@Nullable InterfaceC0574j interfaceC0574j) {
        if (interfaceC0574j == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @VisibleForTesting
    public boolean setChildImportantForAccessibilityInternal(AbstractC0569e0 abstractC0569e0, int i) {
        if (!isComputingLayout()) {
            kkl0.m150184t0(abstractC0569e0.itemView, i);
            return true;
        }
        abstractC0569e0.mPendingAccessibilityState = i;
        this.mPendingAccessibilityImportanceChange.add(abstractC0569e0);
        return false;
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z;
        super.setClipToPadding(z);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(@NonNull C0575k c0575k) {
        yn80.m216775e(c0575k);
        this.mEdgeEffectFactory = c0575k;
        invalidateGlows();
    }

    public void setHasFixedSize(boolean z) {
        this.mHasFixedSize = z;
    }

    public void setItemAnimator(@Nullable AbstractC0576l abstractC0576l) {
        AbstractC0576l abstractC0576l2 = this.mItemAnimator;
        if (abstractC0576l2 != null) {
            abstractC0576l2.endAnimations();
            this.mItemAnimator.setListener(null);
        }
        this.mItemAnimator = abstractC0576l;
        if (abstractC0576l != null) {
            abstractC0576l.setListener(this.mItemAnimatorListener);
        }
    }

    public void setItemViewCacheSize(int i) {
        this.mRecycler.m3454L(i);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(@Nullable AbstractC0579o abstractC0579o) {
        if (abstractC0579o == this.mLayout) {
            return;
        }
        stopScroll();
        if (this.mLayout != null) {
            AbstractC0576l abstractC0576l = this.mItemAnimator;
            if (abstractC0576l != null) {
                abstractC0576l.endAnimations();
            }
            this.mLayout.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
            this.mRecycler.m3463c();
            if (this.mIsAttached) {
                this.mLayout.dispatchDetachedFromWindow(this, this.mRecycler);
            }
            this.mLayout.setRecyclerView(null);
            this.mLayout = null;
        } else {
            this.mRecycler.m3463c();
        }
        this.mChildHelper.m3666o();
        this.mLayout = abstractC0579o;
        if (abstractC0579o != null) {
            if (abstractC0579o.mRecyclerView != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(abstractC0579o);
                src0.m187593a(sb, " is already attached to a RecyclerView:", abstractC0579o.mRecyclerView.exceptionLabel());
                return;
            } else {
                abstractC0579o.setRecyclerView(this);
                if (this.mIsAttached) {
                    this.mLayout.dispatchAttachedToWindow(this);
                }
            }
        }
        this.mRecycler.m3458P();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
        } else {
            wg3.m206174a("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().m104404n(z);
    }

    public void setOnFlingListener(@Nullable AbstractC0582r abstractC0582r) {
        this.mOnFlingListener = abstractC0582r;
    }

    @Deprecated
    public void setOnScrollListener(@Nullable AbstractC0584t abstractC0584t) {
        this.mScrollListener = abstractC0584t;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.mPreserveFocusAfterLayout = z;
    }

    public void setRecycledViewPool(@Nullable C0585u c0585u) {
        this.mRecycler.m3452J(c0585u);
    }

    @Deprecated
    public void setRecyclerListener(@Nullable InterfaceC0587w interfaceC0587w) {
        this.mRecyclerListener = interfaceC0587w;
    }

    public void setScrollState(int i) {
        if (i == this.mScrollState) {
            return;
        }
        if (sVerboseLoggingEnabled) {
            new Exception();
        }
        this.mScrollState = i;
        if (i != 2) {
            stopScrollersInternal();
        }
        dispatchOnScrollStateChanged(i);
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 1) {
            this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        } else {
            this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        }
    }

    public void setViewCacheExtension(@Nullable AbstractC0565c0 abstractC0565c0) {
        this.mRecycler.m3453K(abstractC0565c0);
    }

    public boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (!isComputingLayout()) {
            return false;
        }
        int iM129752a = accessibilityEvent != null ? C17188gb.m129752a(accessibilityEvent) : 0;
        this.mEatenAccessibilityChangeFlags |= iM129752a != 0 ? iM129752a : 0;
        return true;
    }

    public void smoothScrollBy(@Px int i, @Px int i2, @Nullable Interpolator interpolator, int i3, boolean z) {
        AbstractC0579o abstractC0579o = this.mLayout;
        if (abstractC0579o == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        if (!abstractC0579o.canScrollHorizontally()) {
            i = 0;
        }
        if (!this.mLayout.canScrollVertically()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (i3 != Integer.MIN_VALUE && i3 <= 0) {
            scrollBy(i, i2);
            return;
        }
        if (z) {
            int i4 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i4 |= 2;
            }
            startNestedScroll(i4, 1);
        }
        this.mViewFlinger.m3377e(i, i2, i3, interpolator);
    }

    public void smoothScrollToPosition(int i) {
        if (this.mLayoutSuppressed) {
            return;
        }
        AbstractC0579o abstractC0579o = this.mLayout;
        if (abstractC0579o == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC0579o.smoothScrollToPosition(this, this.mState, i);
        }
    }

    public void startInterceptRequestLayout() {
        int i = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i;
        if (i != 1 || this.mLayoutSuppressed) {
            return;
        }
        this.mLayoutWasDefered = false;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().m104406p(i);
    }

    public void stopInterceptRequestLayout(boolean z) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            if (sDebugAssertionsEnabled) {
                qg50.m176437a("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.", exceptionLabel());
                return;
            }
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().m104408r();
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.mLayoutSuppressed = true;
                this.mIgnoreMotionEventTillDown = true;
                stopScroll();
                return;
            }
            this.mLayoutSuppressed = false;
            if (this.mLayoutWasDefered && this.mLayout != null && this.mAdapter != null) {
                requestLayout();
            }
            this.mLayoutWasDefered = false;
        }
    }

    public void swapAdapter(@Nullable Adapter adapter, boolean z) {
        setLayoutFrozen(false);
        setAdapterInternal(adapter, true, z);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    public void viewRangeUpdate(int i, int i2, Object obj) {
        int i3;
        int iM3661j = this.mChildHelper.m3661j();
        int i4 = i + i2;
        for (int i5 = 0; i5 < iM3661j; i5++) {
            View viewM3660i = this.mChildHelper.m3660i(i5);
            AbstractC0569e0 childViewHolderInt = getChildViewHolderInt(viewM3660i);
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && (i3 = childViewHolderInt.mPosition) >= i && i3 < i4) {
                childViewHolderInt.addFlags(2);
                childViewHolderInt.addChangePayload(obj);
                ((C0580p) viewM3660i.getLayoutParams()).f2610c = true;
            }
        }
        this.mRecycler.m3460R(i, i2);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$i */
    public static abstract class AbstractC0573i {
        public void onChanged() {
        }

        public void onItemRangeChanged(int i, int i2, @Nullable Object obj) {
            onItemRangeChanged(i, i2);
        }

        public void onItemRangeInserted(int i, int i2) {
        }

        public void onItemRangeMoved(int i, int i2, int i3) {
        }

        public void onItemRangeRemoved(int i, int i2) {
        }

        public void onStateRestorationPolicyChanged() {
        }

        public void onItemRangeChanged(int i, int i2) {
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$n */
    public static abstract class AbstractC0578n {
        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull C0561a0 c0561a0) {
            getItemOffsets(rect, ((C0580p) view.getLayoutParams()).m3417b(), recyclerView);
        }

        public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull C0561a0 c0561a0) {
            onDraw(canvas, recyclerView);
        }

        public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull C0561a0 c0561a0) {
            onDrawOver(canvas, recyclerView);
        }

        @Deprecated
        public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
        }

        @Deprecated
        public void getItemOffsets(@NonNull Rect rect, int i, @NonNull RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$o */
    public static abstract class AbstractC0579o {
        boolean mAutoMeasure;
        C0601e mChildHelper;
        private int mHeight;
        private int mHeightMode;
        C0620x mHorizontalBoundCheck;
        private final C0620x.b mHorizontalBoundCheckCallback;
        boolean mIsAttachedToWindow;
        private boolean mItemPrefetchEnabled;
        private boolean mMeasurementCacheEnabled;
        int mPrefetchMaxCountObserved;
        boolean mPrefetchMaxObservedInInitialPrefetch;
        RecyclerView mRecyclerView;
        boolean mRequestedSimpleAnimations;

        @Nullable
        AbstractC0590z mSmoothScroller;
        C0620x mVerticalBoundCheck;
        private final C0620x.b mVerticalBoundCheckCallback;
        private int mWidth;
        private int mWidthMode;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$o$a */
        public class a implements C0620x.b {
            public a() {
            }

            @Override // androidx.recyclerview.widget.C0620x.b
            /* JADX INFO: renamed from: a */
            public View mo3410a(int i) {
                return AbstractC0579o.this.getChildAt(i);
            }

            @Override // androidx.recyclerview.widget.C0620x.b
            /* JADX INFO: renamed from: b */
            public int mo3411b() {
                return AbstractC0579o.this.getPaddingLeft();
            }

            @Override // androidx.recyclerview.widget.C0620x.b
            /* JADX INFO: renamed from: c */
            public int mo3412c() {
                return AbstractC0579o.this.getWidth() - AbstractC0579o.this.getPaddingRight();
            }

            @Override // androidx.recyclerview.widget.C0620x.b
            /* JADX INFO: renamed from: d */
            public int mo3413d(View view) {
                return AbstractC0579o.this.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((C0580p) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.C0620x.b
            /* JADX INFO: renamed from: e */
            public int mo3414e(View view) {
                return AbstractC0579o.this.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((C0580p) view.getLayoutParams())).rightMargin;
            }
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$o$b */
        public class b implements C0620x.b {
            public b() {
            }

            @Override // androidx.recyclerview.widget.C0620x.b
            /* JADX INFO: renamed from: a */
            public View mo3410a(int i) {
                return AbstractC0579o.this.getChildAt(i);
            }

            @Override // androidx.recyclerview.widget.C0620x.b
            /* JADX INFO: renamed from: b */
            public int mo3411b() {
                return AbstractC0579o.this.getPaddingTop();
            }

            @Override // androidx.recyclerview.widget.C0620x.b
            /* JADX INFO: renamed from: c */
            public int mo3412c() {
                return AbstractC0579o.this.getHeight() - AbstractC0579o.this.getPaddingBottom();
            }

            @Override // androidx.recyclerview.widget.C0620x.b
            /* JADX INFO: renamed from: d */
            public int mo3413d(View view) {
                return AbstractC0579o.this.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((C0580p) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.C0620x.b
            /* JADX INFO: renamed from: e */
            public int mo3414e(View view) {
                return AbstractC0579o.this.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((C0580p) view.getLayoutParams())).bottomMargin;
            }
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$o$c */
        public interface c {
            /* JADX INFO: renamed from: a */
            void mo3415a(int i, int i2);
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$o$d */
        public static class d {

            /* JADX INFO: renamed from: a */
            public int f2604a;

            /* JADX INFO: renamed from: b */
            public int f2605b;

            /* JADX INFO: renamed from: c */
            public boolean f2606c;

            /* JADX INFO: renamed from: d */
            public boolean f2607d;
        }

        public AbstractC0579o() {
            a aVar = new a();
            this.mHorizontalBoundCheckCallback = aVar;
            b bVar = new b();
            this.mVerticalBoundCheckCallback = bVar;
            this.mHorizontalBoundCheck = new C0620x(aVar);
            this.mVerticalBoundCheck = new C0620x(bVar);
            this.mRequestedSimpleAnimations = false;
            this.mIsAttachedToWindow = false;
            this.mAutoMeasure = false;
            this.mMeasurementCacheEnabled = true;
            this.mItemPrefetchEnabled = true;
        }

        private void addViewInt(View view, int i, boolean z) {
            AbstractC0569e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (z || childViewHolderInt.isRemoved()) {
                this.mRecyclerView.mViewInfoStore.m3873b(childViewHolderInt);
            } else {
                this.mRecyclerView.mViewInfoStore.m3887p(childViewHolderInt);
            }
            C0580p c0580p = (C0580p) view.getLayoutParams();
            if (childViewHolderInt.wasReturnedFromScrap() || childViewHolderInt.isScrap()) {
                if (childViewHolderInt.isScrap()) {
                    childViewHolderInt.unScrap();
                } else {
                    childViewHolderInt.clearReturnedFromScrapFlag();
                }
                this.mChildHelper.m3654c(view, i, view.getLayoutParams(), false);
            } else {
                ViewParent parent = view.getParent();
                RecyclerView recyclerView = this.mRecyclerView;
                C0601e c0601e = this.mChildHelper;
                if (parent == recyclerView) {
                    int iM3664m = c0601e.m3664m(view);
                    if (i == -1) {
                        i = this.mChildHelper.m3658g();
                    }
                    if (iM3664m == -1) {
                        throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.mRecyclerView.indexOfChild(view) + this.mRecyclerView.exceptionLabel());
                    }
                    if (iM3664m != i) {
                        this.mRecyclerView.mLayout.moveView(iM3664m, i);
                    }
                } else {
                    c0601e.m3652a(view, i, false);
                    c0580p.f2610c = true;
                    AbstractC0590z abstractC0590z = this.mSmoothScroller;
                    if (abstractC0590z != null && abstractC0590z.isRunning()) {
                        this.mSmoothScroller.onChildAttachedToWindow(view);
                    }
                }
            }
            if (c0580p.f2611d) {
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Objects.toString(c0580p.f2608a);
                }
                childViewHolderInt.itemView.invalidate();
                c0580p.f2611d = false;
            }
        }

        public static int chooseSize(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            if (mode != Integer.MIN_VALUE) {
                return mode != 1073741824 ? Math.max(i2, i3) : size;
            }
            return Math.min(size, Math.max(i2, i3));
        }

        private void detachViewInternal(int i, @NonNull View view) {
            this.mChildHelper.m3655d(i);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001a  */
        /* JADX WARN: Code duplicated, block: B:14:0x0022  */
        /* JADX WARN: Code duplicated, block: B:5:0x0010  */
        public static int getChildMeasureSpec(int i, int i2, int i3, int i4, boolean z) {
            int iMax = Math.max(0, i - i3);
            if (z) {
                if (i4 >= 0) {
                    i2 = 1073741824;
                } else if (i4 != -1 || (i2 != Integer.MIN_VALUE && (i2 == 0 || i2 != 1073741824))) {
                    i2 = 0;
                    i4 = 0;
                } else {
                    i4 = iMax;
                }
            } else if (i4 >= 0) {
                i2 = 1073741824;
            } else if (i4 == -1) {
                i4 = iMax;
            } else if (i4 != -2) {
                i2 = 0;
                i4 = 0;
            } else if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
                i4 = iMax;
                i2 = Integer.MIN_VALUE;
            } else {
                i4 = iMax;
                i2 = 0;
            }
            return View.MeasureSpec.makeMeasureSpec(i4, i2);
        }

        private int[] getChildRectangleOnScreenScrollAmount(View view, Rect rect) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int iWidth = rect.width() + left;
            int iHeight = rect.height() + top;
            int i = left - paddingLeft;
            int iMin = Math.min(0, i);
            int i2 = top - paddingTop;
            int iMin2 = Math.min(0, i2);
            int i3 = iWidth - width;
            int iMax = Math.max(0, i3);
            int iMax2 = Math.max(0, iHeight - height);
            if (getLayoutDirection() != 1) {
                if (iMin == 0) {
                    iMin = Math.min(i, iMax);
                }
                iMax = iMin;
            } else if (iMax == 0) {
                iMax = Math.max(iMin, i3);
            }
            if (iMin2 == 0) {
                iMin2 = Math.min(i2, iMax2);
            }
            return new int[]{iMax, iMin2};
        }

        public static d getProperties(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
            d dVar = new d();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eic0.f94126a, i, i2);
            dVar.f2604a = typedArrayObtainStyledAttributes.getInt(eic0.f94127b, 1);
            dVar.f2605b = typedArrayObtainStyledAttributes.getInt(eic0.f94137l, 1);
            dVar.f2606c = typedArrayObtainStyledAttributes.getBoolean(eic0.f94136k, false);
            dVar.f2607d = typedArrayObtainStyledAttributes.getBoolean(eic0.f94138m, false);
            typedArrayObtainStyledAttributes.recycle();
            return dVar;
        }

        private boolean isFocusedChildVisibleAfterScrolling(RecyclerView recyclerView, int i, int i2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            Rect rect = this.mRecyclerView.mTempRect;
            getDecoratedBoundsWithMargins(focusedChild, rect);
            return rect.left - i < width && rect.right - i > paddingLeft && rect.top - i2 < height && rect.bottom - i2 > paddingTop;
        }

        private static boolean isMeasurementUpToDate(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i;
            }
            return true;
        }

        private void scrapOrRecycleView(C0586v c0586v, int i, View view) {
            AbstractC0569e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.shouldIgnore()) {
                if (RecyclerView.sVerboseLoggingEnabled) {
                    childViewHolderInt.toString();
                }
            } else if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !this.mRecyclerView.mAdapter.hasStableIds()) {
                removeViewAt(i);
                c0586v.m3450H(childViewHolderInt);
            } else {
                detachViewAt(i);
                c0586v.m3451I(view);
                this.mRecyclerView.mViewInfoStore.m3882k(childViewHolderInt);
            }
        }

        @SuppressLint({"UnknownNullness"})
        public void addDisappearingView(View view) {
            addDisappearingView(view, -1);
        }

        @SuppressLint({"UnknownNullness"})
        public void addView(View view) {
            addView(view, -1);
        }

        public void assertInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.assertInLayoutOrScroll(str);
            }
        }

        @SuppressLint({"UnknownNullness"})
        public void assertNotInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.assertNotInLayoutOrScroll(str);
            }
        }

        public void attachView(@NonNull View view, int i, C0580p c0580p) {
            AbstractC0569e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            boolean zIsRemoved = childViewHolderInt.isRemoved();
            RecyclerView recyclerView = this.mRecyclerView;
            if (zIsRemoved) {
                recyclerView.mViewInfoStore.m3873b(childViewHolderInt);
            } else {
                recyclerView.mViewInfoStore.m3887p(childViewHolderInt);
            }
            this.mChildHelper.m3654c(view, i, c0580p, childViewHolderInt.isRemoved());
        }

        public void calculateItemDecorationsForChild(@NonNull View view, @NonNull Rect rect) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.getItemDecorInsetsForChild(view));
            }
        }

        public boolean canScrollHorizontally() {
            return false;
        }

        public boolean canScrollVertically() {
            return false;
        }

        public boolean checkLayoutParams(C0580p c0580p) {
            return c0580p != null;
        }

        @SuppressLint({"UnknownNullness"})
        public void collectAdjacentPrefetchPositions(int i, int i2, C0561a0 c0561a0, c cVar) {
        }

        @SuppressLint({"UnknownNullness"})
        public void collectInitialPrefetchPositions(int i, c cVar) {
        }

        public int computeHorizontalScrollExtent(@NonNull C0561a0 c0561a0) {
            return 0;
        }

        public int computeHorizontalScrollOffset(@NonNull C0561a0 c0561a0) {
            return 0;
        }

        public int computeHorizontalScrollRange(@NonNull C0561a0 c0561a0) {
            return 0;
        }

        public int computeVerticalScrollExtent(@NonNull C0561a0 c0561a0) {
            return 0;
        }

        public int computeVerticalScrollOffset(@NonNull C0561a0 c0561a0) {
            return 0;
        }

        public int computeVerticalScrollRange(@NonNull C0561a0 c0561a0) {
            return 0;
        }

        public void detachAndScrapAttachedViews(@NonNull C0586v c0586v) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                scrapOrRecycleView(c0586v, childCount, getChildAt(childCount));
            }
        }

        public void detachAndScrapView(@NonNull View view, @NonNull C0586v c0586v) {
            scrapOrRecycleView(c0586v, this.mChildHelper.m3664m(view), view);
        }

        public void detachAndScrapViewAt(int i, @NonNull C0586v c0586v) {
            scrapOrRecycleView(c0586v, i, getChildAt(i));
        }

        public void detachView(@NonNull View view) {
            int iM3664m = this.mChildHelper.m3664m(view);
            if (iM3664m >= 0) {
                detachViewInternal(iM3664m, view);
            }
        }

        public void detachViewAt(int i) {
            detachViewInternal(i, getChildAt(i));
        }

        public void dispatchAttachedToWindow(RecyclerView recyclerView) {
            this.mIsAttachedToWindow = true;
            onAttachedToWindow(recyclerView);
        }

        public void dispatchDetachedFromWindow(RecyclerView recyclerView, C0586v c0586v) {
            this.mIsAttachedToWindow = false;
            onDetachedFromWindow(recyclerView, c0586v);
        }

        @SuppressLint({"UnknownNullness"})
        public void endAnimation(View view) {
            AbstractC0576l abstractC0576l = this.mRecyclerView.mItemAnimator;
            if (abstractC0576l != null) {
                abstractC0576l.endAnimation(RecyclerView.getChildViewHolderInt(view));
            }
        }

        @Nullable
        public View findContainingItemView(@NonNull View view) {
            View viewFindContainingItemView;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (viewFindContainingItemView = recyclerView.findContainingItemView(view)) == null || this.mChildHelper.m3665n(viewFindContainingItemView)) {
                return null;
            }
            return viewFindContainingItemView;
        }

        @Nullable
        public View findViewByPosition(int i) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                AbstractC0569e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
                if (childViewHolderInt != null && childViewHolderInt.getLayoutPosition() == i && !childViewHolderInt.shouldIgnore() && (this.mRecyclerView.mState.m3364f() || !childViewHolderInt.isRemoved())) {
                    return childAt;
                }
            }
            return null;
        }

        @SuppressLint({"UnknownNullness"})
        public abstract C0580p generateDefaultLayoutParams();

        @SuppressLint({"UnknownNullness"})
        public C0580p generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof C0580p) {
                return new C0580p((C0580p) layoutParams);
            }
            return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0580p((ViewGroup.MarginLayoutParams) layoutParams) : new C0580p(layoutParams);
        }

        public int getBaseline() {
            return -1;
        }

        public int getBottomDecorationHeight(@NonNull View view) {
            return ((C0580p) view.getLayoutParams()).f2609b.bottom;
        }

        @Nullable
        public View getChildAt(int i) {
            C0601e c0601e = this.mChildHelper;
            if (c0601e != null) {
                return c0601e.m3657f(i);
            }
            return null;
        }

        public int getChildCount() {
            C0601e c0601e = this.mChildHelper;
            if (c0601e != null) {
                return c0601e.m3658g();
            }
            return 0;
        }

        public boolean getClipToPadding() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.mClipToPadding;
        }

        public int getColumnCountForAccessibility(@NonNull C0586v c0586v, @NonNull C0561a0 c0561a0) {
            return -1;
        }

        public int getDecoratedBottom(@NonNull View view) {
            return view.getBottom() + getBottomDecorationHeight(view);
        }

        public void getDecoratedBoundsWithMargins(@NonNull View view, @NonNull Rect rect) {
            RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
        }

        public int getDecoratedLeft(@NonNull View view) {
            return view.getLeft() - getLeftDecorationWidth(view);
        }

        public int getDecoratedMeasuredHeight(@NonNull View view) {
            Rect rect = ((C0580p) view.getLayoutParams()).f2609b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public int getDecoratedMeasuredWidth(@NonNull View view) {
            Rect rect = ((C0580p) view.getLayoutParams()).f2609b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public int getDecoratedRight(@NonNull View view) {
            return view.getRight() + getRightDecorationWidth(view);
        }

        public int getDecoratedTop(@NonNull View view) {
            return view.getTop() - getTopDecorationHeight(view);
        }

        @Nullable
        public View getFocusedChild() {
            View focusedChild;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.mChildHelper.m3665n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        @Px
        public int getHeight() {
            return this.mHeight;
        }

        public int getHeightMode() {
            return this.mHeightMode;
        }

        public int getItemCount() {
            RecyclerView recyclerView = this.mRecyclerView;
            Adapter adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        public int getItemViewType(@NonNull View view) {
            return RecyclerView.getChildViewHolderInt(view).getItemViewType();
        }

        public int getLayoutDirection() {
            return kkl0.m150191x(this.mRecyclerView);
        }

        public int getLeftDecorationWidth(@NonNull View view) {
            return ((C0580p) view.getLayoutParams()).f2609b.left;
        }

        @Px
        public int getMinimumHeight() {
            return kkl0.m150193y(this.mRecyclerView);
        }

        @Px
        public int getMinimumWidth() {
            return kkl0.m150195z(this.mRecyclerView);
        }

        @Px
        public int getPaddingBottom() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        @Px
        public int getPaddingEnd() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return kkl0.m150110A(recyclerView);
            }
            return 0;
        }

        @Px
        public int getPaddingLeft() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        @Px
        public int getPaddingRight() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        @Px
        public int getPaddingStart() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return kkl0.m150112B(recyclerView);
            }
            return 0;
        }

        @Px
        public int getPaddingTop() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int getPosition(@NonNull View view) {
            return ((C0580p) view.getLayoutParams()).m3417b();
        }

        public int getRightDecorationWidth(@NonNull View view) {
            return ((C0580p) view.getLayoutParams()).f2609b.right;
        }

        public int getRowCountForAccessibility(@NonNull C0586v c0586v, @NonNull C0561a0 c0561a0) {
            return -1;
        }

        public int getSelectionModeForAccessibility(@NonNull C0586v c0586v, @NonNull C0561a0 c0561a0) {
            return 0;
        }

        public int getTopDecorationHeight(@NonNull View view) {
            return ((C0580p) view.getLayoutParams()).f2609b.top;
        }

        public void getTransformedBoundingBox(@NonNull View view, boolean z, @NonNull Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((C0580p) view.getLayoutParams()).f2609b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.mRecyclerView != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.mRecyclerView.mTempRectF;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        @Px
        public int getWidth() {
            return this.mWidth;
        }

        public int getWidthMode() {
            return this.mWidthMode;
        }

        public boolean hasFlexibleChildInBothOrientations() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                ViewGroup.LayoutParams layoutParams = getChildAt(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public boolean hasFocus() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.hasFocus();
        }

        public void ignoreView(@NonNull View view) {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.mRecyclerView;
            if (parent != recyclerView || recyclerView.indexOfChild(view) == -1) {
                yg3.m215829a("View should be fully attached to be ignored", this.mRecyclerView.exceptionLabel());
                return;
            }
            AbstractC0569e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.addFlags(128);
            this.mRecyclerView.mViewInfoStore.m3888q(childViewHolderInt);
        }

        public boolean isAttachedToWindow() {
            return this.mIsAttachedToWindow;
        }

        public boolean isAutoMeasureEnabled() {
            return this.mAutoMeasure;
        }

        public boolean isFocused() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.isFocused();
        }

        public final boolean isItemPrefetchEnabled() {
            return this.mItemPrefetchEnabled;
        }

        public boolean isLayoutHierarchical(@NonNull C0586v c0586v, @NonNull C0561a0 c0561a0) {
            return false;
        }

        public boolean isMeasurementCacheEnabled() {
            return this.mMeasurementCacheEnabled;
        }

        public boolean isSmoothScrolling() {
            AbstractC0590z abstractC0590z = this.mSmoothScroller;
            return abstractC0590z != null && abstractC0590z.isRunning();
        }

        public boolean isViewPartiallyVisible(@NonNull View view, boolean z, boolean z2) {
            boolean z3 = this.mHorizontalBoundCheck.m3866b(view, 24579) && this.mVerticalBoundCheck.m3866b(view, 24579);
            return z ? z3 : !z3;
        }

        public void layoutDecorated(@NonNull View view, int i, int i2, int i3, int i4) {
            Rect rect = ((C0580p) view.getLayoutParams()).f2609b;
            view.layout(i + rect.left, i2 + rect.top, i3 - rect.right, i4 - rect.bottom);
        }

        public void layoutDecoratedWithMargins(@NonNull View view, int i, int i2, int i3, int i4) {
            C0580p c0580p = (C0580p) view.getLayoutParams();
            Rect rect = c0580p.f2609b;
            view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) c0580p).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) c0580p).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) c0580p).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c0580p).bottomMargin);
        }

        public void measureChild(@NonNull View view, int i, int i2) {
            C0580p c0580p = (C0580p) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
            int i3 = i + itemDecorInsetsForChild.left + itemDecorInsetsForChild.right;
            int i4 = i2 + itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + i3, ((ViewGroup.MarginLayoutParams) c0580p).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + i4, ((ViewGroup.MarginLayoutParams) c0580p).height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, c0580p)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void measureChildWithMargins(@NonNull View view, int i, int i2) {
            C0580p c0580p = (C0580p) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
            int i3 = i + itemDecorInsetsForChild.left + itemDecorInsetsForChild.right;
            int i4 = i2 + itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + ((ViewGroup.MarginLayoutParams) c0580p).leftMargin + ((ViewGroup.MarginLayoutParams) c0580p).rightMargin + i3, ((ViewGroup.MarginLayoutParams) c0580p).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + ((ViewGroup.MarginLayoutParams) c0580p).topMargin + ((ViewGroup.MarginLayoutParams) c0580p).bottomMargin + i4, ((ViewGroup.MarginLayoutParams) c0580p).height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, c0580p)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void moveView(int i, int i2) {
            View childAt = getChildAt(i);
            if (childAt != null) {
                detachViewAt(i);
                attachView(childAt, i2);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i + this.mRecyclerView.toString());
            }
        }

        public void offsetChildrenHorizontal(@Px int i) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.offsetChildrenHorizontal(i);
            }
        }

        public void offsetChildrenVertical(@Px int i) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.offsetChildrenVertical(i);
            }
        }

        public void onAdapterChanged(@Nullable Adapter adapter, @Nullable Adapter adapter2) {
        }

        public boolean onAddFocusables(@NonNull RecyclerView recyclerView, @NonNull ArrayList<View> arrayList, int i, int i2) {
            return false;
        }

        @CallSuper
        public void onAttachedToWindow(RecyclerView recyclerView) {
        }

        @SuppressLint({"UnknownNullness"})
        @CallSuper
        public void onDetachedFromWindow(RecyclerView recyclerView, C0586v c0586v) {
            onDetachedFromWindow(recyclerView);
        }

        @Nullable
        public View onFocusSearchFailed(@NonNull View view, int i, @NonNull C0586v c0586v, @NonNull C0561a0 c0561a0) {
            return null;
        }

        public void onInitializeAccessibilityEvent(@NonNull C0586v c0586v, @NonNull C0561a0 c0561a0, @NonNull AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.mRecyclerView.canScrollVertically(-1) && !this.mRecyclerView.canScrollHorizontally(-1) && !this.mRecyclerView.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            Adapter adapter = this.mRecyclerView.mAdapter;
            if (adapter != null) {
                accessibilityEvent.setItemCount(adapter.getItemCount());
            }
        }

        public void onInitializeAccessibilityNodeInfo(@NonNull C0586v c0586v, @NonNull C0561a0 c0561a0, @NonNull C15967bc c15967bc) {
            if (this.mRecyclerView.canScrollVertically(-1) || this.mRecyclerView.canScrollHorizontally(-1)) {
                c15967bc.m103406a(8192);
                c15967bc.m103382K0(true);
            }
            if (this.mRecyclerView.canScrollVertically(1) || this.mRecyclerView.canScrollHorizontally(1)) {
                c15967bc.m103406a(4096);
                c15967bc.m103382K0(true);
            }
            c15967bc.m103435q0(C15967bc.e.m103466b(getRowCountForAccessibility(c0586v, c0561a0), getColumnCountForAccessibility(c0586v, c0561a0), isLayoutHierarchical(c0586v, c0561a0), getSelectionModeForAccessibility(c0586v, c0561a0)));
        }

        public void onInitializeAccessibilityNodeInfoForItem(View view, C15967bc c15967bc) {
            AbstractC0569e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt == null || childViewHolderInt.isRemoved() || this.mChildHelper.m3665n(childViewHolderInt.itemView)) {
                return;
            }
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfoForItem(recyclerView.mRecycler, recyclerView.mState, view, c15967bc);
        }

        @Nullable
        public View onInterceptFocusSearch(@NonNull View view, int i) {
            return null;
        }

        public void onItemsAdded(@NonNull RecyclerView recyclerView, int i, int i2) {
        }

        public void onItemsChanged(@NonNull RecyclerView recyclerView) {
        }

        public void onItemsMoved(@NonNull RecyclerView recyclerView, int i, int i2, int i3) {
        }

        public void onItemsRemoved(@NonNull RecyclerView recyclerView, int i, int i2) {
        }

        public void onItemsUpdated(@NonNull RecyclerView recyclerView, int i, int i2, @Nullable Object obj) {
            onItemsUpdated(recyclerView, i, i2);
        }

        @SuppressLint({"UnknownNullness"})
        public void onLayoutChildren(C0586v c0586v, C0561a0 c0561a0) {
            Log.e(RecyclerView.TAG, "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        @SuppressLint({"UnknownNullness"})
        public void onLayoutCompleted(C0561a0 c0561a0) {
        }

        public void onMeasure(@NonNull C0586v c0586v, @NonNull C0561a0 c0561a0, int i, int i2) {
            this.mRecyclerView.defaultOnMeasure(i, i2);
        }

        @Deprecated
        public boolean onRequestChildFocus(@NonNull RecyclerView recyclerView, @NonNull View view, @Nullable View view2) {
            return isSmoothScrolling() || recyclerView.isComputingLayout();
        }

        @SuppressLint({"UnknownNullness"})
        public void onRestoreInstanceState(Parcelable parcelable) {
        }

        @Nullable
        public Parcelable onSaveInstanceState() {
            return null;
        }

        public void onScrollStateChanged(int i) {
        }

        public void onSmoothScrollerStopped(AbstractC0590z abstractC0590z) {
            if (this.mSmoothScroller == abstractC0590z) {
                this.mSmoothScroller = null;
            }
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0067 A[PHI: r9
          0x0067: PHI (r9v8 int) = (r9v5 int), (r9v11 int) binds: [B:29:0x0084, B:20:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
        public boolean performAccessibilityAction(@NonNull C0586v c0586v, @NonNull C0561a0 c0561a0, int i, @Nullable Bundle bundle) {
            int paddingTop;
            int paddingLeft;
            int i2;
            int i3;
            if (this.mRecyclerView == null) {
                return false;
            }
            int height = getHeight();
            int width = getWidth();
            Rect rect = new Rect();
            if (this.mRecyclerView.getMatrix().isIdentity() && this.mRecyclerView.getGlobalVisibleRect(rect)) {
                height = rect.height();
                width = rect.width();
            }
            if (i == 4096) {
                paddingTop = this.mRecyclerView.canScrollVertically(1) ? (height - getPaddingTop()) - getPaddingBottom() : 0;
                if (this.mRecyclerView.canScrollHorizontally(1)) {
                    paddingLeft = (width - getPaddingLeft()) - getPaddingRight();
                    i2 = paddingTop;
                    i3 = paddingLeft;
                } else {
                    i2 = paddingTop;
                    i3 = 0;
                }
            } else if (i != 8192) {
                i3 = 0;
                i2 = 0;
            } else {
                paddingTop = this.mRecyclerView.canScrollVertically(-1) ? -((height - getPaddingTop()) - getPaddingBottom()) : 0;
                if (this.mRecyclerView.canScrollHorizontally(-1)) {
                    paddingLeft = -((width - getPaddingLeft()) - getPaddingRight());
                    i2 = paddingTop;
                    i3 = paddingLeft;
                } else {
                    i2 = paddingTop;
                    i3 = 0;
                }
            }
            if (i2 == 0 && i3 == 0) {
                return false;
            }
            this.mRecyclerView.smoothScrollBy(i3, i2, null, Integer.MIN_VALUE, true);
            return true;
        }

        public boolean performAccessibilityActionForItem(@NonNull View view, int i, @Nullable Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityActionForItem(recyclerView.mRecycler, recyclerView.mState, view, i, bundle);
        }

        public void postOnAnimation(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                kkl0.m150148b0(recyclerView, runnable);
            }
        }

        public void removeAllViews() {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                this.mChildHelper.m3668q(childCount);
            }
        }

        public void removeAndRecycleAllViews(@NonNull C0586v c0586v) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                if (!RecyclerView.getChildViewHolderInt(getChildAt(childCount)).shouldIgnore()) {
                    removeAndRecycleViewAt(childCount, c0586v);
                }
            }
        }

        public void removeAndRecycleScrapInt(C0586v c0586v) {
            int iM3470j = c0586v.m3470j();
            for (int i = iM3470j - 1; i >= 0; i--) {
                View viewM3474n = c0586v.m3474n(i);
                AbstractC0569e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(viewM3474n);
                if (!childViewHolderInt.shouldIgnore()) {
                    childViewHolderInt.setIsRecyclable(false);
                    if (childViewHolderInt.isTmpDetached()) {
                        this.mRecyclerView.removeDetachedView(viewM3474n, false);
                    }
                    AbstractC0576l abstractC0576l = this.mRecyclerView.mItemAnimator;
                    if (abstractC0576l != null) {
                        abstractC0576l.endAnimation(childViewHolderInt);
                    }
                    childViewHolderInt.setIsRecyclable(true);
                    c0586v.m3446D(viewM3474n);
                }
            }
            c0586v.m3465e();
            if (iM3470j > 0) {
                this.mRecyclerView.invalidate();
            }
        }

        public void removeAndRecycleView(@NonNull View view, @NonNull C0586v c0586v) {
            removeView(view);
            c0586v.m3449G(view);
        }

        public void removeAndRecycleViewAt(int i, @NonNull C0586v c0586v) {
            View childAt = getChildAt(i);
            removeViewAt(i);
            c0586v.m3449G(childAt);
        }

        public boolean removeCallbacks(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public void removeDetachedView(@NonNull View view) {
            this.mRecyclerView.removeDetachedView(view, false);
        }

        @SuppressLint({"UnknownNullness"})
        public void removeView(View view) {
            this.mChildHelper.m3667p(view);
        }

        public void removeViewAt(int i) {
            if (getChildAt(i) != null) {
                this.mChildHelper.m3668q(i);
            }
        }

        public boolean requestChildRectangleOnScreen(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z, boolean z2) {
            int[] childRectangleOnScreenScrollAmount = getChildRectangleOnScreenScrollAmount(view, rect);
            int i = childRectangleOnScreenScrollAmount[0];
            int i2 = childRectangleOnScreenScrollAmount[1];
            if ((z2 && !isFocusedChildVisibleAfterScrolling(recyclerView, i, i2)) || (i == 0 && i2 == 0)) {
                return false;
            }
            if (z) {
                recyclerView.scrollBy(i, i2);
            } else {
                recyclerView.smoothScrollBy(i, i2);
            }
            return true;
        }

        public void requestLayout() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public void requestSimpleAnimationsInNextLayout() {
            this.mRequestedSimpleAnimations = true;
        }

        @SuppressLint({"UnknownNullness"})
        public int scrollHorizontallyBy(int i, C0586v c0586v, C0561a0 c0561a0) {
            return 0;
        }

        public void scrollToPosition(int i) {
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.e(RecyclerView.TAG, "You MUST implement scrollToPosition. It will soon become abstract");
            }
        }

        @SuppressLint({"UnknownNullness"})
        public int scrollVerticallyBy(int i, C0586v c0586v, C0561a0 c0561a0) {
            return 0;
        }

        @Deprecated
        public void setAutoMeasureEnabled(boolean z) {
            this.mAutoMeasure = z;
        }

        public void setExactMeasureSpecsFrom(RecyclerView recyclerView) {
            setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public final void setItemPrefetchEnabled(boolean z) {
            if (z != this.mItemPrefetchEnabled) {
                this.mItemPrefetchEnabled = z;
                this.mPrefetchMaxCountObserved = 0;
                RecyclerView recyclerView = this.mRecyclerView;
                if (recyclerView != null) {
                    recyclerView.mRecycler.m3458P();
                }
            }
        }

        public void setMeasureSpecs(int i, int i2) {
            this.mWidth = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.mWidthMode = mode;
            if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.mWidth = 0;
            }
            this.mHeight = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.mHeightMode = mode2;
            if (mode2 != 0 || RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                return;
            }
            this.mHeight = 0;
        }

        public void setMeasuredDimension(Rect rect, int i, int i2) {
            setMeasuredDimension(chooseSize(i, rect.width() + getPaddingLeft() + getPaddingRight(), getMinimumWidth()), chooseSize(i2, rect.height() + getPaddingTop() + getPaddingBottom(), getMinimumHeight()));
        }

        public void setMeasuredDimensionFromChildren(int i, int i2) {
            int childCount = getChildCount();
            if (childCount == 0) {
                this.mRecyclerView.defaultOnMeasure(i, i2);
                return;
            }
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                Rect rect = this.mRecyclerView.mTempRect;
                getDecoratedBoundsWithMargins(childAt, rect);
                int i8 = rect.left;
                if (i8 < i6) {
                    i6 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i10 = rect.top;
                if (i10 < i4) {
                    i4 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i5) {
                    i5 = i11;
                }
            }
            this.mRecyclerView.mTempRect.set(i6, i4, i3, i5);
            setMeasuredDimension(this.mRecyclerView.mTempRect, i, i2);
        }

        public void setMeasurementCacheEnabled(boolean z) {
            this.mMeasurementCacheEnabled = z;
        }

        public void setRecyclerView(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.mRecyclerView = null;
                this.mChildHelper = null;
                this.mWidth = 0;
                this.mHeight = 0;
            } else {
                this.mRecyclerView = recyclerView;
                this.mChildHelper = recyclerView.mChildHelper;
                this.mWidth = recyclerView.getWidth();
                this.mHeight = recyclerView.getHeight();
            }
            this.mWidthMode = 1073741824;
            this.mHeightMode = 1073741824;
        }

        public boolean shouldMeasureChild(View view, int i, int i2, C0580p c0580p) {
            return (!view.isLayoutRequested() && this.mMeasurementCacheEnabled && isMeasurementUpToDate(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) c0580p).width) && isMeasurementUpToDate(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) c0580p).height)) ? false : true;
        }

        public boolean shouldMeasureTwice() {
            return false;
        }

        public boolean shouldReMeasureChild(View view, int i, int i2, C0580p c0580p) {
            return (this.mMeasurementCacheEnabled && isMeasurementUpToDate(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) c0580p).width) && isMeasurementUpToDate(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) c0580p).height)) ? false : true;
        }

        @SuppressLint({"UnknownNullness"})
        public void smoothScrollToPosition(RecyclerView recyclerView, C0561a0 c0561a0, int i) {
            Log.e(RecyclerView.TAG, "You must override smoothScrollToPosition to support smooth scrolling");
        }

        @SuppressLint({"UnknownNullness"})
        public void startSmoothScroll(AbstractC0590z abstractC0590z) {
            AbstractC0590z abstractC0590z2 = this.mSmoothScroller;
            if (abstractC0590z2 != null && abstractC0590z != abstractC0590z2 && abstractC0590z2.isRunning()) {
                this.mSmoothScroller.stop();
            }
            this.mSmoothScroller = abstractC0590z;
            abstractC0590z.start(this.mRecyclerView, this);
        }

        public void stopIgnoringView(@NonNull View view) {
            AbstractC0569e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.stopIgnoring();
            childViewHolderInt.resetInternal();
            childViewHolderInt.addFlags(4);
        }

        public void stopSmoothScroller() {
            AbstractC0590z abstractC0590z = this.mSmoothScroller;
            if (abstractC0590z != null) {
                abstractC0590z.stop();
            }
        }

        public boolean supportsPredictiveItemAnimations() {
            return false;
        }

        @Deprecated
        public void onDetachedFromWindow(RecyclerView recyclerView) {
        }

        public void onItemsUpdated(@NonNull RecyclerView recyclerView, int i, int i2) {
        }

        @SuppressLint({"UnknownNullness"})
        public void addDisappearingView(View view, int i) {
            addViewInt(view, i, true);
        }

        @SuppressLint({"UnknownNullness"})
        public void addView(View view, int i) {
            addViewInt(view, i, false);
        }

        public boolean performAccessibilityActionForItem(@NonNull C0586v c0586v, @NonNull C0561a0 c0561a0, @NonNull View view, int i, @Nullable Bundle bundle) {
            return false;
        }

        public boolean onRequestChildFocus(@NonNull RecyclerView recyclerView, @NonNull C0561a0 c0561a0, @NonNull View view, @Nullable View view2) {
            return onRequestChildFocus(recyclerView, view, view2);
        }

        @SuppressLint({"UnknownNullness"})
        public C0580p generateLayoutParams(Context context, AttributeSet attributeSet) {
            return new C0580p(context, attributeSet);
        }

        public void onInitializeAccessibilityNodeInfoForItem(@NonNull C0586v c0586v, @NonNull C0561a0 c0561a0, @NonNull View view, @NonNull C15967bc c15967bc) {
        }

        public void attachView(@NonNull View view, int i) {
            attachView(view, i, (C0580p) view.getLayoutParams());
        }

        public void attachView(@NonNull View view) {
            attachView(view, -1);
        }

        public boolean requestChildRectangleOnScreen(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z) {
            return requestChildRectangleOnScreen(recyclerView, view, rect, z, false);
        }

        public void setMeasuredDimension(int i, int i2) {
            this.mRecyclerView.setMeasuredDimension(i, i2);
        }

        /* JADX WARN: Code duplicated, block: B:5:0x000c A[PHI: r3
          0x000c: PHI (r3v5 int) = (r3v0 int), (r3v2 int), (r3v0 int) binds: [B:7:0x0010, B:11:0x0016, B:4:0x000a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:6:0x000e  */
        @Deprecated
        public static int getChildMeasureSpec(int i, int i2, int i3, boolean z) {
            int i4 = i - i2;
            int i5 = 0;
            int iMax = Math.max(0, i4);
            if (z) {
                if (i3 >= 0) {
                    i5 = 1073741824;
                } else {
                    i3 = 0;
                }
            } else if (i3 >= 0) {
                i5 = 1073741824;
            } else if (i3 == -1) {
                i3 = iMax;
                i5 = 1073741824;
            } else if (i3 == -2) {
                i5 = Integer.MIN_VALUE;
                i3 = iMax;
            } else {
                i3 = 0;
            }
            return View.MeasureSpec.makeMeasureSpec(i3, i5);
        }

        public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityEvent(recyclerView.mRecycler, recyclerView.mState, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(C15967bc c15967bc) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfo(recyclerView.mRecycler, recyclerView.mState, c15967bc);
        }

        public boolean performAccessibilityAction(int i, @Nullable Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityAction(recyclerView.mRecycler, recyclerView.mState, i, bundle);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$l */
    public static abstract class AbstractC0576l {
        public static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        public static final int FLAG_CHANGED = 2;
        public static final int FLAG_INVALIDATED = 4;
        public static final int FLAG_MOVED = 2048;
        public static final int FLAG_REMOVED = 8;
        private b mListener = null;
        private ArrayList<a> mFinishedListeners = new ArrayList<>();
        private long mAddDuration = 120;
        private long mRemoveDuration = 120;
        private long mMoveDuration = 250;
        private long mChangeDuration = 250;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$l$a */
        public interface a {
            /* JADX INFO: renamed from: a */
            void m3406a();
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$l$b */
        public interface b {
            /* JADX INFO: renamed from: a */
            void mo3407a(@NonNull AbstractC0569e0 abstractC0569e0);
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$l$c */
        public static class c {

            /* JADX INFO: renamed from: a */
            public int f2597a;

            /* JADX INFO: renamed from: b */
            public int f2598b;

            /* JADX INFO: renamed from: c */
            public int f2599c;

            /* JADX INFO: renamed from: d */
            public int f2600d;

            @NonNull
            /* JADX INFO: renamed from: a */
            public c m3408a(@NonNull AbstractC0569e0 abstractC0569e0) {
                return m3409b(abstractC0569e0, 0);
            }

            @NonNull
            /* JADX INFO: renamed from: b */
            public c m3409b(@NonNull AbstractC0569e0 abstractC0569e0, int i) {
                View view = abstractC0569e0.itemView;
                this.f2597a = view.getLeft();
                this.f2598b = view.getTop();
                this.f2599c = view.getRight();
                this.f2600d = view.getBottom();
                return this;
            }
        }

        public static int buildAdapterChangeFlagsForAnimations(AbstractC0569e0 abstractC0569e0) {
            int i = abstractC0569e0.mFlags;
            int i2 = i & 14;
            if (abstractC0569e0.isInvalid()) {
                return 4;
            }
            if ((i & 4) == 0) {
                int oldPosition = abstractC0569e0.getOldPosition();
                int absoluteAdapterPosition = abstractC0569e0.getAbsoluteAdapterPosition();
                if (oldPosition != -1 && absoluteAdapterPosition != -1 && oldPosition != absoluteAdapterPosition) {
                    return i2 | 2048;
                }
            }
            return i2;
        }

        public abstract boolean animateAppearance(@NonNull AbstractC0569e0 abstractC0569e0, @Nullable c cVar, @NonNull c cVar2);

        public abstract boolean animateChange(@NonNull AbstractC0569e0 abstractC0569e0, @NonNull AbstractC0569e0 abstractC0569e1, @NonNull c cVar, @NonNull c cVar2);

        public abstract boolean animateDisappearance(@NonNull AbstractC0569e0 abstractC0569e0, @NonNull c cVar, @Nullable c cVar2);

        public abstract boolean animatePersistence(@NonNull AbstractC0569e0 abstractC0569e0, @NonNull c cVar, @NonNull c cVar2);

        public boolean canReuseUpdatedViewHolder(@NonNull AbstractC0569e0 abstractC0569e0, @NonNull List<Object> list) {
            return canReuseUpdatedViewHolder(abstractC0569e0);
        }

        public final void dispatchAnimationFinished(@NonNull AbstractC0569e0 abstractC0569e0) {
            onAnimationFinished(abstractC0569e0);
            b bVar = this.mListener;
            if (bVar != null) {
                bVar.mo3407a(abstractC0569e0);
            }
        }

        public final void dispatchAnimationStarted(@NonNull AbstractC0569e0 abstractC0569e0) {
            onAnimationStarted(abstractC0569e0);
        }

        public final void dispatchAnimationsFinished() {
            int size = this.mFinishedListeners.size();
            int i = 0;
            while (true) {
                ArrayList<a> arrayList = this.mFinishedListeners;
                if (i >= size) {
                    arrayList.clear();
                    return;
                } else {
                    arrayList.get(i).m3406a();
                    i++;
                }
            }
        }

        public abstract void endAnimation(@NonNull AbstractC0569e0 abstractC0569e0);

        public abstract void endAnimations();

        public long getAddDuration() {
            return this.mAddDuration;
        }

        public long getChangeDuration() {
            return this.mChangeDuration;
        }

        public long getMoveDuration() {
            return this.mMoveDuration;
        }

        public long getRemoveDuration() {
            return this.mRemoveDuration;
        }

        public abstract boolean isRunning();

        public final boolean isRunning(@Nullable a aVar) {
            boolean zIsRunning = isRunning();
            if (aVar != null) {
                if (!zIsRunning) {
                    aVar.m3406a();
                    return zIsRunning;
                }
                this.mFinishedListeners.add(aVar);
            }
            return zIsRunning;
        }

        @NonNull
        public c obtainHolderInfo() {
            return new c();
        }

        public void onAnimationFinished(@NonNull AbstractC0569e0 abstractC0569e0) {
        }

        public void onAnimationStarted(@NonNull AbstractC0569e0 abstractC0569e0) {
        }

        @NonNull
        public c recordPostLayoutInformation(@NonNull C0561a0 c0561a0, @NonNull AbstractC0569e0 abstractC0569e0) {
            return obtainHolderInfo().m3408a(abstractC0569e0);
        }

        @NonNull
        public c recordPreLayoutInformation(@NonNull C0561a0 c0561a0, @NonNull AbstractC0569e0 abstractC0569e0, int i, @NonNull List<Object> list) {
            return obtainHolderInfo().m3408a(abstractC0569e0);
        }

        public abstract void runPendingAnimations();

        public void setAddDuration(long j) {
            this.mAddDuration = j;
        }

        public void setChangeDuration(long j) {
            this.mChangeDuration = j;
        }

        public void setListener(b bVar) {
            this.mListener = bVar;
        }

        public void setMoveDuration(long j) {
            this.mMoveDuration = j;
        }

        public void setRemoveDuration(long j) {
            this.mRemoveDuration = j;
        }

        public boolean canReuseUpdatedViewHolder(@NonNull AbstractC0569e0 abstractC0569e0) {
            return true;
        }
    }

    public static abstract class Adapter<VH extends AbstractC0569e0> {
        private final C0572h mObservable = new C0572h();
        private boolean mHasStableIds = false;
        private StateRestorationPolicy mStateRestorationPolicy = StateRestorationPolicy.ALLOW;

        public enum StateRestorationPolicy {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void bindViewHolder(@NonNull VH vh, int i) {
            boolean z = vh.mBindingAdapter == null;
            if (z) {
                vh.mPosition = i;
                if (hasStableIds()) {
                    vh.mItemId = getItemId(i);
                }
                vh.setFlags(1, 519);
                cej0.m109373a(RecyclerView.TRACE_BIND_VIEW_TAG);
            }
            vh.mBindingAdapter = this;
            if (RecyclerView.sDebugAssertionsEnabled) {
                if (vh.itemView.getParent() == null && kkl0.m150133O(vh.itemView) != vh.isTmpDetached()) {
                    throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + vh.isTmpDetached() + ", attached to window: " + kkl0.m150133O(vh.itemView) + ", holder: " + vh);
                }
                if (vh.itemView.getParent() == null && kkl0.m150133O(vh.itemView)) {
                    xtq0.m213103a("Attempting to bind attached holder with no parent (AKA temp detached): ", vh);
                    return;
                }
            }
            onBindViewHolder(vh, i, vh.getUnmodifiedPayloads());
            if (z) {
                vh.clearPayload();
                ViewGroup.LayoutParams layoutParams = vh.itemView.getLayoutParams();
                if (layoutParams instanceof C0580p) {
                    ((C0580p) layoutParams).f2610c = true;
                }
                cej0.m109374b();
            }
        }

        public boolean canRestoreState() {
            int i = C0571g.f2596a[this.mStateRestorationPolicy.ordinal()];
            return i != 1 && (i != 2 || getItemCount() > 0);
        }

        @NonNull
        public final VH createViewHolder(@NonNull ViewGroup viewGroup, int i) {
            try {
                cej0.m109373a(RecyclerView.TRACE_CREATE_VIEW_TAG);
                VH vh = (VH) jj5.m145015i(this, viewGroup, i);
                if (vh.itemView.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                vh.mItemViewType = i;
                cej0.m109374b();
                return vh;
            } catch (Throwable th) {
                cej0.m109374b();
                throw th;
            }
        }

        public int findRelativeAdapterPositionIn(@NonNull Adapter<? extends AbstractC0569e0> adapter, @NonNull AbstractC0569e0 abstractC0569e0, int i) {
            if (adapter == this) {
                return i;
            }
            return -1;
        }

        public abstract int getItemCount();

        public long getItemId(int i) {
            return -1L;
        }

        public int getItemViewType(int i) {
            return 0;
        }

        @NonNull
        public final StateRestorationPolicy getStateRestorationPolicy() {
            return this.mStateRestorationPolicy;
        }

        public final boolean hasObservers() {
            return this.mObservable.m3398a();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.m3399b();
        }

        public final void notifyItemChanged(int i) {
            this.mObservable.m3401d(i, 1);
        }

        public final void notifyItemInserted(int i) {
            this.mObservable.m3403f(i, 1);
        }

        public final void notifyItemMoved(int i, int i2) {
            this.mObservable.m3400c(i, i2);
        }

        public final void notifyItemRangeChanged(int i, int i2) {
            this.mObservable.m3401d(i, i2);
        }

        public final void notifyItemRangeInserted(int i, int i2) {
            this.mObservable.m3403f(i, i2);
        }

        public final void notifyItemRangeRemoved(int i, int i2) {
            this.mObservable.m3404g(i, i2);
        }

        public final void notifyItemRemoved(int i) {
            this.mObservable.m3404g(i, 1);
        }

        public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(@NonNull VH vh, int i);

        public void onBindViewHolder(@NonNull VH vh, int i, @NonNull List<Object> list) {
            onBindViewHolder(vh, i);
        }

        @NonNull
        public abstract VH onCreateViewHolder(@NonNull ViewGroup viewGroup, int i);

        public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(@NonNull VH vh) {
            return false;
        }

        public void onViewAttachedToWindow(@NonNull VH vh) {
        }

        public void onViewDetachedFromWindow(@NonNull VH vh) {
        }

        public void onViewRecycled(@NonNull VH vh) {
        }

        public void registerAdapterDataObserver(@NonNull AbstractC0573i abstractC0573i) {
            this.mObservable.registerObserver(abstractC0573i);
        }

        public void setHasStableIds(boolean z) {
            if (hasObservers()) {
                wtq0.m207906a("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            } else {
                this.mHasStableIds = z;
            }
        }

        public void setStateRestorationPolicy(@NonNull StateRestorationPolicy stateRestorationPolicy) {
            this.mStateRestorationPolicy = stateRestorationPolicy;
            this.mObservable.m3405h();
        }

        public void unregisterAdapterDataObserver(@NonNull AbstractC0573i abstractC0573i) {
            this.mObservable.unregisterObserver(abstractC0573i);
        }

        public final void notifyItemRangeChanged(int i, int i2, @Nullable Object obj) {
            this.mObservable.m3402e(i, i2, obj);
        }

        public final void notifyItemChanged(int i, @Nullable Object obj) {
            this.mObservable.m3402e(i, 1, obj);
        }
    }

    @Override // p153l.zh20
    public void stopNestedScroll(int i) {
        getScrollingChildHelper().m104409s(i);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().m104394d(i, i2, iArr, iArr2, i3);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return getScrollingChildHelper().m104397g(i, i2, i3, i4, iArr, i5);
    }

    public boolean hasNestedScrollingParent(int i) {
        return getScrollingChildHelper().m104402l(i);
    }

    public boolean startNestedScroll(int i, int i2) {
        return getScrollingChildHelper().m104407q(i, i2);
    }

    public final void dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5, @NonNull int[] iArr2) {
        getScrollingChildHelper().m104395e(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$p */
    public static class C0580p extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a */
        public AbstractC0569e0 f2608a;

        /* JADX INFO: renamed from: b */
        public final Rect f2609b;

        /* JADX INFO: renamed from: c */
        public boolean f2610c;

        /* JADX INFO: renamed from: d */
        public boolean f2611d;

        public C0580p(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2609b = new Rect();
            this.f2610c = true;
            this.f2611d = false;
        }

        @Deprecated
        /* JADX INFO: renamed from: a */
        public int m3416a() {
            return this.f2608a.getBindingAdapterPosition();
        }

        /* JADX INFO: renamed from: b */
        public int m3417b() {
            return this.f2608a.getLayoutPosition();
        }

        @Deprecated
        /* JADX INFO: renamed from: c */
        public int m3418c() {
            return this.f2608a.getPosition();
        }

        /* JADX INFO: renamed from: d */
        public boolean m3419d() {
            return this.f2608a.isUpdated();
        }

        /* JADX INFO: renamed from: e */
        public boolean m3420e() {
            return this.f2608a.isRemoved();
        }

        /* JADX INFO: renamed from: f */
        public boolean m3421f() {
            return this.f2608a.isInvalid();
        }

        public C0580p(int i, int i2) {
            super(i, i2);
            this.f2609b = new Rect();
            this.f2610c = true;
            this.f2611d = false;
        }

        public C0580p(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f2609b = new Rect();
            this.f2610c = true;
            this.f2611d = false;
        }

        public C0580p(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2609b = new Rect();
            this.f2610c = true;
            this.f2611d = false;
        }

        public C0580p(C0580p c0580p) {
            super((ViewGroup.LayoutParams) c0580p);
            this.f2609b = new Rect();
            this.f2610c = true;
            this.f2611d = false;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0559a();
        Parcelable mLayoutState;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$SavedState$a */
        public class C0559a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.mLayoutState = parcel.readParcelable(classLoader == null ? AbstractC0579o.class.getClassLoader() : classLoader);
        }

        /* JADX INFO: renamed from: a */
        public void m3355a(SavedState savedState) {
            this.mLayoutState = savedState.mLayoutState;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.mLayoutState, 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$z */
    public static abstract class AbstractC0590z {
        private AbstractC0579o mLayoutManager;
        private boolean mPendingInitialRun;
        private RecyclerView mRecyclerView;
        private boolean mRunning;
        private boolean mStarted;
        private View mTargetView;
        private int mTargetPosition = -1;
        private final a mRecyclingAction = new a(0, 0);

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$z$b */
        public interface b {
            @Nullable
            PointF computeScrollVectorForPosition(int i);
        }

        @Nullable
        public PointF computeScrollVectorForPosition(int i) {
            Object layoutManager = getLayoutManager();
            if (layoutManager instanceof b) {
                return ((b) layoutManager).computeScrollVectorForPosition(i);
            }
            return null;
        }

        public View findViewByPosition(int i) {
            return this.mRecyclerView.mLayout.findViewByPosition(i);
        }

        public int getChildCount() {
            return this.mRecyclerView.mLayout.getChildCount();
        }

        public int getChildPosition(View view) {
            return this.mRecyclerView.getChildLayoutPosition(view);
        }

        @Nullable
        public AbstractC0579o getLayoutManager() {
            return this.mLayoutManager;
        }

        public int getTargetPosition() {
            return this.mTargetPosition;
        }

        @Deprecated
        public void instantScrollToPosition(int i) {
            this.mRecyclerView.scrollToPosition(i);
        }

        public boolean isPendingInitialRun() {
            return this.mPendingInitialRun;
        }

        public boolean isRunning() {
            return this.mRunning;
        }

        public void normalize(@NonNull PointF pointF) {
            float f = pointF.x;
            float f2 = pointF.y;
            float fSqrt = (float) Math.sqrt((f * f) + (f2 * f2));
            pointF.x /= fSqrt;
            pointF.y /= fSqrt;
        }

        public void onAnimation(int i, int i2) {
            PointF pointFComputeScrollVectorForPosition;
            RecyclerView recyclerView = this.mRecyclerView;
            if (this.mTargetPosition == -1 || recyclerView == null) {
                stop();
            }
            if (this.mPendingInitialRun && this.mTargetView == null && this.mLayoutManager != null && (pointFComputeScrollVectorForPosition = computeScrollVectorForPosition(this.mTargetPosition)) != null) {
                float f = pointFComputeScrollVectorForPosition.x;
                if (f != 0.0f || pointFComputeScrollVectorForPosition.y != 0.0f) {
                    recyclerView.scrollStep((int) Math.signum(f), (int) Math.signum(pointFComputeScrollVectorForPosition.y), null);
                }
            }
            this.mPendingInitialRun = false;
            View view = this.mTargetView;
            if (view != null) {
                if (getChildPosition(view) == this.mTargetPosition) {
                    onTargetFound(this.mTargetView, recyclerView.mState, this.mRecyclingAction);
                    this.mRecyclingAction.m3491c(recyclerView);
                    stop();
                } else {
                    Log.e(RecyclerView.TAG, "Passed over target position while smooth scrolling.");
                    this.mTargetView = null;
                }
            }
            if (this.mRunning) {
                onSeekTargetStep(i, i2, recyclerView.mState, this.mRecyclingAction);
                boolean zM3489a = this.mRecyclingAction.m3489a();
                this.mRecyclingAction.m3491c(recyclerView);
                if (zM3489a && this.mRunning) {
                    this.mPendingInitialRun = true;
                    recyclerView.mViewFlinger.m3376d();
                }
            }
        }

        public void onChildAttachedToWindow(View view) {
            if (getChildPosition(view) == getTargetPosition()) {
                this.mTargetView = view;
                int i = RecyclerView.HORIZONTAL;
            }
        }

        public abstract void onSeekTargetStep(@Px int i, @Px int i2, @NonNull C0561a0 c0561a0, @NonNull a aVar);

        public abstract void onStart();

        public abstract void onStop();

        public abstract void onTargetFound(@NonNull View view, @NonNull C0561a0 c0561a0, @NonNull a aVar);

        public void setTargetPosition(int i) {
            this.mTargetPosition = i;
        }

        public void start(RecyclerView recyclerView, AbstractC0579o abstractC0579o) {
            recyclerView.mViewFlinger.stop();
            this.mRecyclerView = recyclerView;
            this.mLayoutManager = abstractC0579o;
            int i = this.mTargetPosition;
            if (i == -1) {
                wg3.m206174a("Invalid target position");
                return;
            }
            recyclerView.mState.f2568a = i;
            this.mRunning = true;
            this.mPendingInitialRun = true;
            this.mTargetView = findViewByPosition(getTargetPosition());
            onStart();
            this.mRecyclerView.mViewFlinger.m3376d();
            this.mStarted = true;
        }

        public final void stop() {
            if (this.mRunning) {
                this.mRunning = false;
                onStop();
                this.mRecyclerView.mState.f2568a = -1;
                this.mTargetView = null;
                this.mTargetPosition = -1;
                this.mPendingInitialRun = false;
                this.mLayoutManager.onSmoothScrollerStopped(this);
                this.mLayoutManager = null;
                this.mRecyclerView = null;
            }
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$z$a */
        public static class a {

            /* JADX INFO: renamed from: a */
            public int f2629a;

            /* JADX INFO: renamed from: b */
            public int f2630b;

            /* JADX INFO: renamed from: c */
            public int f2631c;

            /* JADX INFO: renamed from: d */
            public int f2632d;

            /* JADX INFO: renamed from: e */
            public Interpolator f2633e;

            /* JADX INFO: renamed from: f */
            public boolean f2634f;

            /* JADX INFO: renamed from: g */
            public int f2635g;

            public a(@Px int i, @Px int i2, int i3, @Nullable Interpolator interpolator) {
                this.f2632d = -1;
                this.f2634f = false;
                this.f2635g = 0;
                this.f2629a = i;
                this.f2630b = i2;
                this.f2631c = i3;
                this.f2633e = interpolator;
            }

            /* JADX INFO: renamed from: a */
            public boolean m3489a() {
                return this.f2632d >= 0;
            }

            /* JADX INFO: renamed from: b */
            public void m3490b(int i) {
                this.f2632d = i;
            }

            /* JADX INFO: renamed from: c */
            public void m3491c(RecyclerView recyclerView) {
                int i = this.f2632d;
                if (i >= 0) {
                    this.f2632d = -1;
                    recyclerView.jumpToPositionForSmoothScroller(i);
                    this.f2634f = false;
                } else {
                    if (!this.f2634f) {
                        this.f2635g = 0;
                        return;
                    }
                    m3493e();
                    recyclerView.mViewFlinger.m3377e(this.f2629a, this.f2630b, this.f2631c, this.f2633e);
                    int i2 = this.f2635g + 1;
                    this.f2635g = i2;
                    if (i2 > 10) {
                        Log.e(RecyclerView.TAG, "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f2634f = false;
                }
            }

            /* JADX INFO: renamed from: d */
            public void m3492d(@Px int i, @Px int i2, int i3, @Nullable Interpolator interpolator) {
                this.f2629a = i;
                this.f2630b = i2;
                this.f2631c = i3;
                this.f2633e = interpolator;
                this.f2634f = true;
            }

            /* JADX INFO: renamed from: e */
            public final void m3493e() {
                if (this.f2633e != null && this.f2631c < 1) {
                    wtq0.m207906a("If you provide an interpolator, you must set a positive duration");
                } else {
                    if (this.f2631c >= 1) {
                        return;
                    }
                    wtq0.m207906a("Scroll duration must be a positive number");
                }
            }

            public a(@Px int i, @Px int i2) {
                this(i, i2, Integer.MIN_VALUE, null);
            }
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC0579o abstractC0579o = this.mLayout;
        if (abstractC0579o != null) {
            return abstractC0579o.generateLayoutParams(layoutParams);
        }
        qg50.m176437a("RecyclerView has no LayoutManager", exceptionLabel());
        return null;
    }

    public void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    public void addItemDecoration(@NonNull AbstractC0578n abstractC0578n) {
        addItemDecoration(abstractC0578n, -1);
    }

    @Nullable
    @Deprecated
    public AbstractC0569e0 findViewHolderForPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    public void smoothScrollBy(@Px int i, @Px int i2, @Nullable Interpolator interpolator) {
        smoothScrollBy(i, i2, interpolator, Integer.MIN_VALUE);
    }

    public void smoothScrollBy(@Px int i, @Px int i2, @Nullable Interpolator interpolator, int i3) {
        smoothScrollBy(i, i2, interpolator, i3, false);
    }

    public void smoothScrollBy(@Px int i, @Px int i2) {
        smoothScrollBy(i, i2, null);
    }

    public RecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, n8c0.f140673a);
    }

    public RecyclerView(@NonNull Context context) {
        this(context, null);
    }
}
