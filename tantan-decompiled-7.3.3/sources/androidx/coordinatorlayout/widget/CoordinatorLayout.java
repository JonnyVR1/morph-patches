package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.customview.view.AbsSavedState;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.google.android.material.badge.BadgeDrawable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p153l.ci20;
import p153l.dgq0;
import p153l.di20;
import p153l.ell0;
import p153l.fi20;
import p153l.il50;
import p153l.j26;
import p153l.jse0;
import p153l.kkl0;
import p153l.l8c0;
import p153l.l950;
import p153l.m9k;
import p153l.ngc0;
import p153l.nj80;
import p153l.oce;
import p153l.rj80;
import p153l.uid0;
import p153l.vtq0;
import p153l.wtq0;
import p153l.x2e;
import p153l.zhc0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements ci20, di20 {
    static final Class<?>[] CONSTRUCTOR_PARAMS;
    static final int EVENT_NESTED_SCROLL = 1;
    static final int EVENT_PRE_DRAW = 0;
    static final int EVENT_VIEW_REMOVED = 2;
    static final String TAG = "CoordinatorLayout";
    static final Comparator<View> TOP_SORTED_CHILDREN_COMPARATOR;
    private static final int TYPE_ON_INTERCEPT = 0;
    private static final int TYPE_ON_TOUCH = 1;
    static final String WIDGET_PACKAGE_NAME;
    static final ThreadLocal<Map<String, Constructor<AbstractC0227c>>> sConstructors;
    private static final nj80<Rect> sRectPool;
    private il50 mApplyWindowInsetsListener;
    private final int[] mBehaviorConsumed;
    private View mBehaviorTouchView;
    private final x2e<View> mChildDag;
    private final List<View> mDependencySortedChildren;
    private boolean mDisallowInterceptReset;
    private boolean mDrawStatusBarBackground;
    private boolean mIsAttachedToWindow;
    private int[] mKeylines;
    private dgq0 mLastInsets;
    private boolean mNeedsPreDrawListener;
    private final fi20 mNestedScrollingParentHelper;
    private View mNestedScrollingTarget;
    private final int[] mNestedScrollingV2ConsumedCompat;
    ViewGroup.OnHierarchyChangeListener mOnHierarchyChangeListener;
    private ViewTreeObserverOnPreDrawListenerC0231g mOnPreDrawListener;
    private Paint mScrimPaint;
    private Drawable mStatusBarBackground;
    private final List<View> mTempDependenciesList;
    private final List<View> mTempList1;

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$a */
    public class C0225a implements il50 {
        public C0225a() {
        }

        @Override // p153l.il50
        public dgq0 onApplyWindowInsets(View view, dgq0 dgq0Var) {
            return CoordinatorLayout.this.setWindowInsets(dgq0Var);
        }
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$b */
    public interface InterfaceC0226b {
        @NonNull
        AbstractC0227c getBehavior();
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$d */
    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    public @interface InterfaceC0228d {
        Class<? extends AbstractC0227c> value();
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$e */
    public class ViewGroupOnHierarchyChangeListenerC0229e implements ViewGroup.OnHierarchyChangeListener {
        public ViewGroupOnHierarchyChangeListenerC0229e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.mOnHierarchyChangeListener;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.onChildViewsChanged(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.mOnHierarchyChangeListener;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$g */
    public class ViewTreeObserverOnPreDrawListenerC0231g implements ViewTreeObserver.OnPreDrawListener {
        public ViewTreeObserverOnPreDrawListenerC0231g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.onChildViewsChanged(0);
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h */
    public static class C0232h implements Comparator<View> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            float fM150128J = kkl0.m150128J(view);
            float fM150128J2 = kkl0.m150128J(view2);
            if (fM150128J > fM150128J2) {
                return -1;
            }
            return fM150128J < fM150128J2 ? 1 : 0;
        }
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        WIDGET_PACKAGE_NAME = r0 != null ? r0.getName() : null;
        TOP_SORTED_CHILDREN_COMPARATOR = new C0232h();
        CONSTRUCTOR_PARAMS = new Class[]{Context.class, AttributeSet.class};
        sConstructors = new ThreadLocal<>();
        sRectPool = new rj80(12);
    }

    public CoordinatorLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        CoordinatorLayout coordinatorLayout;
        Context context2;
        super(context, attributeSet, i);
        this.mDependencySortedChildren = new ArrayList();
        this.mChildDag = new x2e<>();
        this.mTempList1 = new ArrayList();
        this.mTempDependenciesList = new ArrayList();
        this.mBehaviorConsumed = new int[2];
        this.mNestedScrollingV2ConsumedCompat = new int[2];
        this.mNestedScrollingParentHelper = new fi20(this);
        TypedArray typedArrayObtainStyledAttributes = i == 0 ? context.obtainStyledAttributes(attributeSet, zhc0.f204395a, 0, ngc0.f141808a) : context.obtainStyledAttributes(attributeSet, zhc0.f204395a, i, 0);
        if (Build.VERSION.SDK_INT < 29) {
            coordinatorLayout = this;
            context2 = context;
        } else if (i == 0) {
            coordinatorLayout = this;
            context2 = context;
            coordinatorLayout.saveAttributeDataForStyleable(context2, zhc0.f204395a, attributeSet, typedArrayObtainStyledAttributes, 0, ngc0.f141808a);
        } else {
            coordinatorLayout = this;
            context2 = context;
            coordinatorLayout.saveAttributeDataForStyleable(context2, zhc0.f204395a, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(zhc0.f204396b, 0);
        if (resourceId != 0) {
            Resources resources = context2.getResources();
            coordinatorLayout.mKeylines = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = coordinatorLayout.mKeylines.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr = coordinatorLayout.mKeylines;
                iArr[i2] = (int) (iArr[i2] * f);
            }
        }
        coordinatorLayout.mStatusBarBackground = typedArrayObtainStyledAttributes.getDrawable(zhc0.f204397c);
        typedArrayObtainStyledAttributes.recycle();
        coordinatorLayout.setupForInsets();
        super.setOnHierarchyChangeListener(coordinatorLayout.new ViewGroupOnHierarchyChangeListenerC0229e());
        if (kkl0.m150187v(coordinatorLayout) == 0) {
            kkl0.m150184t0(coordinatorLayout, 1);
        }
    }

    @NonNull
    private static Rect acquireTempRect() {
        Rect rectAcquire = sRectPool.acquire();
        return rectAcquire == null ? new Rect() : rectAcquire;
    }

    private static int clamp(int i, int i2, int i3) {
        if (i < i2) {
            return i2;
        }
        return i > i3 ? i3 : i;
    }

    private void constrainChildRect(C0230f c0230f, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0230f).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) c0230f).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0230f).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) c0230f).bottomMargin));
        rect.set(iMax, iMax2, i + iMax, i2 + iMax2);
    }

    private dgq0 dispatchApplyWindowInsetsToBehaviors(dgq0 dgq0Var) {
        AbstractC0227c abstractC0227cM1182f;
        if (dgq0Var.m115688o()) {
            return dgq0Var;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (kkl0.m150185u(childAt) && (abstractC0227cM1182f = ((C0230f) childAt.getLayoutParams()).m1182f()) != null) {
                dgq0Var = abstractC0227cM1182f.onApplyWindowInsets(this, childAt, dgq0Var);
                if (dgq0Var.m115688o()) {
                    return dgq0Var;
                }
            }
        }
        return dgq0Var;
    }

    private void getDesiredAnchoredChildRectWithoutConstraints(View view, int i, Rect rect, Rect rect2, C0230f c0230f, int i2, int i3) {
        int iWidth;
        int iHeight;
        int iM157578b = m9k.m157578b(resolveAnchoredChildGravity(c0230f.f1375c), i);
        int iM157578b2 = m9k.m157578b(resolveGravity(c0230f.f1376d), i);
        int i4 = iM157578b & 7;
        int i5 = iM157578b & 112;
        int i6 = iM157578b2 & 7;
        int i7 = iM157578b2 & 112;
        if (i6 != 1) {
            iWidth = i6 != 5 ? rect.left : rect.right;
        } else {
            iWidth = rect.left + (rect.width() / 2);
        }
        if (i7 != 16) {
            iHeight = i7 != 80 ? rect.top : rect.bottom;
        } else {
            iHeight = rect.top + (rect.height() / 2);
        }
        if (i4 == 1) {
            iWidth -= i2 / 2;
        } else if (i4 != 5) {
            iWidth -= i2;
        }
        if (i5 == 16) {
            iHeight -= i3 / 2;
        } else if (i5 != 80) {
            iHeight -= i3;
        }
        rect2.set(iWidth, iHeight, i2 + iWidth, i3 + iHeight);
    }

    private int getKeyline(int i) {
        int[] iArr = this.mKeylines;
        if (iArr == null) {
            Log.e(TAG, "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        }
        if (i >= 0 && i < iArr.length) {
            return iArr[i];
        }
        Log.e(TAG, "Keyline index " + i + " out of range for " + this);
        return 0;
    }

    private void getTopSortedChildren(List<View> list) {
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i = childCount - 1; i >= 0; i--) {
            list.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i) : i));
        }
        Comparator<View> comparator = TOP_SORTED_CHILDREN_COMPARATOR;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    private boolean hasDependencies(View view) {
        return this.mChildDag.m209142j(view);
    }

    private void layoutChild(View view, int i) {
        C0230f c0230f = (C0230f) view.getLayoutParams();
        Rect rectAcquireTempRect = acquireTempRect();
        rectAcquireTempRect.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0230f).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0230f).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0230f).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c0230f).bottomMargin);
        if (this.mLastInsets != null && kkl0.m150185u(this) && !kkl0.m150185u(view)) {
            rectAcquireTempRect.left += this.mLastInsets.m115684j();
            rectAcquireTempRect.top += this.mLastInsets.m115686l();
            rectAcquireTempRect.right -= this.mLastInsets.m115685k();
            rectAcquireTempRect.bottom -= this.mLastInsets.m115683i();
        }
        Rect rectAcquireTempRect2 = acquireTempRect();
        m9k.m157577a(resolveGravity(c0230f.f1375c), view.getMeasuredWidth(), view.getMeasuredHeight(), rectAcquireTempRect, rectAcquireTempRect2, i);
        view.layout(rectAcquireTempRect2.left, rectAcquireTempRect2.top, rectAcquireTempRect2.right, rectAcquireTempRect2.bottom);
        releaseTempRect(rectAcquireTempRect);
        releaseTempRect(rectAcquireTempRect2);
    }

    private void layoutChildWithAnchor(View view, View view2, int i) {
        Rect rectAcquireTempRect = acquireTempRect();
        Rect rectAcquireTempRect2 = acquireTempRect();
        try {
            getDescendantRect(view2, rectAcquireTempRect);
            getDesiredAnchoredChildRect(view, i, rectAcquireTempRect, rectAcquireTempRect2);
            view.layout(rectAcquireTempRect2.left, rectAcquireTempRect2.top, rectAcquireTempRect2.right, rectAcquireTempRect2.bottom);
        } finally {
            releaseTempRect(rectAcquireTempRect);
            releaseTempRect(rectAcquireTempRect2);
        }
    }

    private void layoutChildWithKeyline(View view, int i, int i2) {
        int i3;
        C0230f c0230f = (C0230f) view.getLayoutParams();
        int iM157578b = m9k.m157578b(resolveKeylineGravity(c0230f.f1375c), i2);
        int i4 = iM157578b & 7;
        int i5 = iM157578b & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 == 1) {
            i = width - i;
        }
        int keyline = getKeyline(i) - measuredWidth;
        if (i4 == 1) {
            keyline += measuredWidth / 2;
        } else if (i4 == 5) {
            keyline += measuredWidth;
        }
        if (i5 != 16) {
            i3 = i5 != 80 ? 0 : measuredHeight;
        } else {
            i3 = measuredHeight / 2;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0230f).leftMargin, Math.min(keyline, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) c0230f).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0230f).topMargin, Math.min(i3, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c0230f).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth + iMax, measuredHeight + iMax2);
    }

    private void offsetChildByInset(View view, Rect rect, int i) {
        boolean z;
        boolean z2;
        int width;
        int i2;
        int i3;
        int i4;
        int height;
        int i5;
        int i6;
        int i7;
        if (kkl0.m150134P(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            C0230f c0230f = (C0230f) view.getLayoutParams();
            AbstractC0227c abstractC0227cM1182f = c0230f.m1182f();
            Rect rectAcquireTempRect = acquireTempRect();
            Rect rectAcquireTempRect2 = acquireTempRect();
            rectAcquireTempRect2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (abstractC0227cM1182f == null || !abstractC0227cM1182f.getInsetDodgeRect(this, view, rectAcquireTempRect)) {
                rectAcquireTempRect.set(rectAcquireTempRect2);
            } else if (!rectAcquireTempRect2.contains(rectAcquireTempRect)) {
                jse0.m146838a("Rect should be within the child's bounds. Rect:", rectAcquireTempRect.toShortString(), " | Bounds:", rectAcquireTempRect2.toShortString());
                return;
            }
            releaseTempRect(rectAcquireTempRect2);
            if (rectAcquireTempRect.isEmpty()) {
                releaseTempRect(rectAcquireTempRect);
                return;
            }
            int iM157578b = m9k.m157578b(c0230f.f1380h, i);
            boolean z3 = true;
            if ((iM157578b & 48) != 48 || (i6 = (rectAcquireTempRect.top - ((ViewGroup.MarginLayoutParams) c0230f).topMargin) - c0230f.f1382j) >= (i7 = rect.top)) {
                z = false;
            } else {
                setInsetOffsetY(view, i7 - i6);
                z = true;
            }
            if ((iM157578b & 80) == 80 && (height = ((getHeight() - rectAcquireTempRect.bottom) - ((ViewGroup.MarginLayoutParams) c0230f).bottomMargin) + c0230f.f1382j) < (i5 = rect.bottom)) {
                setInsetOffsetY(view, height - i5);
                z = true;
            }
            if (!z) {
                setInsetOffsetY(view, 0);
            }
            if ((iM157578b & 3) != 3 || (i3 = (rectAcquireTempRect.left - ((ViewGroup.MarginLayoutParams) c0230f).leftMargin) - c0230f.f1381i) >= (i4 = rect.left)) {
                z2 = false;
            } else {
                setInsetOffsetX(view, i4 - i3);
                z2 = true;
            }
            if ((iM157578b & 5) != 5 || (width = ((getWidth() - rectAcquireTempRect.right) - ((ViewGroup.MarginLayoutParams) c0230f).rightMargin) + c0230f.f1381i) >= (i2 = rect.right)) {
                z3 = z2;
            } else {
                setInsetOffsetX(view, width - i2);
            }
            if (!z3) {
                setInsetOffsetX(view, 0);
            }
            releaseTempRect(rectAcquireTempRect);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static AbstractC0227c parseBehavior(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = WIDGET_PACKAGE_NAME;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<AbstractC0227c>>> threadLocal = sConstructors;
            Map<String, Constructor<AbstractC0227c>> map = threadLocal.get();
            if (map == null) {
                map = new HashMap<>();
                threadLocal.set(map);
            }
            Constructor<AbstractC0227c> constructor = map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(CONSTRUCTOR_PARAMS);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (Exception e) {
            vtq0.m202761a("Could not inflate Behavior subclass ".concat(str), e);
            return null;
        }
    }

    private boolean performIntercept(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.mTempList1;
        getTopSortedChildren(list);
        int size = list.size();
        MotionEvent motionEventObtain = null;
        boolean zOnInterceptTouchEvent = false;
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            View view = list.get(i2);
            C0230f c0230f = (C0230f) view.getLayoutParams();
            AbstractC0227c abstractC0227cM1182f = c0230f.m1182f();
            if (!(zOnInterceptTouchEvent || z) || actionMasked == 0) {
                if (!zOnInterceptTouchEvent && abstractC0227cM1182f != null) {
                    if (i == 0) {
                        zOnInterceptTouchEvent = abstractC0227cM1182f.onInterceptTouchEvent(this, view, motionEvent);
                    } else if (i == 1) {
                        zOnInterceptTouchEvent = abstractC0227cM1182f.onTouchEvent(this, view, motionEvent);
                    }
                    if (zOnInterceptTouchEvent) {
                        this.mBehaviorTouchView = view;
                    }
                }
                boolean zM1179c = c0230f.m1179c();
                boolean zM1185i = c0230f.m1185i(this, view);
                z = zM1185i && !zM1179c;
                if (zM1185i && !z) {
                    break;
                }
            } else if (abstractC0227cM1182f != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i == 0) {
                    abstractC0227cM1182f.onInterceptTouchEvent(this, view, motionEventObtain);
                } else if (i == 1) {
                    abstractC0227cM1182f.onTouchEvent(this, view, motionEventObtain);
                }
            }
        }
        list.clear();
        return zOnInterceptTouchEvent;
    }

    private void prepareChildren() {
        this.mDependencySortedChildren.clear();
        this.mChildDag.m209135c();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0230f resolvedLayoutParams = getResolvedLayoutParams(childAt);
            resolvedLayoutParams.m1180d(this, childAt);
            this.mChildDag.m209134b(childAt);
            for (int i2 = 0; i2 < childCount; i2++) {
                if (i2 != i) {
                    View childAt2 = getChildAt(i2);
                    if (resolvedLayoutParams.m1178b(this, childAt, childAt2)) {
                        if (!this.mChildDag.m209136d(childAt2)) {
                            this.mChildDag.m209134b(childAt2);
                        }
                        this.mChildDag.m209133a(childAt2, childAt);
                    }
                }
            }
        }
        this.mDependencySortedChildren.addAll(this.mChildDag.m209141i());
        Collections.reverse(this.mDependencySortedChildren);
    }

    private static void releaseTempRect(@NonNull Rect rect) {
        rect.setEmpty();
        sRectPool.release(rect);
    }

    private void resetTouchBehaviors(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            AbstractC0227c abstractC0227cM1182f = ((C0230f) childAt.getLayoutParams()).m1182f();
            if (abstractC0227cM1182f != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    abstractC0227cM1182f.onInterceptTouchEvent(this, childAt, motionEventObtain);
                } else {
                    abstractC0227cM1182f.onTouchEvent(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C0230f) getChildAt(i2).getLayoutParams()).m1189m();
        }
        this.mBehaviorTouchView = null;
        this.mDisallowInterceptReset = false;
    }

    private static int resolveAnchoredChildGravity(int i) {
        if (i == 0) {
            return 17;
        }
        return i;
    }

    private static int resolveGravity(int i) {
        if ((i & 7) == 0) {
            i |= 8388611;
        }
        return (i & 112) == 0 ? i | 48 : i;
    }

    private static int resolveKeylineGravity(int i) {
        return i == 0 ? BadgeDrawable.TOP_END : i;
    }

    private void setInsetOffsetX(View view, int i) {
        C0230f c0230f = (C0230f) view.getLayoutParams();
        int i2 = c0230f.f1381i;
        if (i2 != i) {
            kkl0.m150139U(view, i - i2);
            c0230f.f1381i = i;
        }
    }

    private void setInsetOffsetY(View view, int i) {
        C0230f c0230f = (C0230f) view.getLayoutParams();
        int i2 = c0230f.f1382j;
        if (i2 != i) {
            kkl0.m150140V(view, i - i2);
            c0230f.f1382j = i;
        }
    }

    private void setupForInsets() {
        if (!kkl0.m150185u(this)) {
            kkl0.m150194y0(this, null);
            return;
        }
        if (this.mApplyWindowInsetsListener == null) {
            this.mApplyWindowInsetsListener = new C0225a();
        }
        kkl0.m150194y0(this, this.mApplyWindowInsetsListener);
        setSystemUiVisibility(EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK);
    }

    public void addPreDrawListener() {
        if (this.mIsAttachedToWindow) {
            if (this.mOnPreDrawListener == null) {
                this.mOnPreDrawListener = new ViewTreeObserverOnPreDrawListenerC0231g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
        }
        this.mNeedsPreDrawListener = true;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0230f) && super.checkLayoutParams(layoutParams);
    }

    public void dispatchDependentViewsChanged(@NonNull View view) {
        List listM209139g = this.mChildDag.m209139g(view);
        if (listM209139g == null || listM209139g.isEmpty()) {
            return;
        }
        for (int i = 0; i < listM209139g.size(); i++) {
            View view2 = (View) listM209139g.get(i);
            AbstractC0227c abstractC0227cM1182f = ((C0230f) view2.getLayoutParams()).m1182f();
            if (abstractC0227cM1182f != null) {
                abstractC0227cM1182f.onDependentViewChanged(this, view2, view);
            }
        }
    }

    public boolean doViewsOverlap(@NonNull View view, @NonNull View view2) {
        boolean z = false;
        if (view.getVisibility() != 0 || view2.getVisibility() != 0) {
            return false;
        }
        Rect rectAcquireTempRect = acquireTempRect();
        getChildRect(view, view.getParent() != this, rectAcquireTempRect);
        Rect rectAcquireTempRect2 = acquireTempRect();
        getChildRect(view2, view2.getParent() != this, rectAcquireTempRect2);
        try {
            if (rectAcquireTempRect.left <= rectAcquireTempRect2.right && rectAcquireTempRect.top <= rectAcquireTempRect2.bottom && rectAcquireTempRect.right >= rectAcquireTempRect2.left && rectAcquireTempRect.bottom >= rectAcquireTempRect2.top) {
                z = true;
            }
            return z;
        } finally {
            releaseTempRect(rectAcquireTempRect);
            releaseTempRect(rectAcquireTempRect2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x008f  */
    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        C0230f c0230f = (C0230f) view.getLayoutParams();
        AbstractC0227c abstractC0227c = c0230f.f1373a;
        if (abstractC0227c != null) {
            float scrimOpacity = abstractC0227c.getScrimOpacity(this, view);
            if (scrimOpacity > 0.0f) {
                if (this.mScrimPaint == null) {
                    this.mScrimPaint = new Paint();
                }
                this.mScrimPaint.setColor(c0230f.f1373a.getScrimColor(this, view));
                this.mScrimPaint.setAlpha(clamp(Math.round(scrimOpacity * 255.0f), 0, 255));
                int iSave = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.mScrimPaint);
                canvas.restoreToCount(iSave);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.mStatusBarBackground;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    public void ensurePreDrawListener() {
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            if (hasDependencies(getChildAt(i))) {
                z = true;
                break;
            }
        }
        if (z != this.mNeedsPreDrawListener) {
            if (z) {
                addPreDrawListener();
            } else {
                removePreDrawListener();
            }
        }
    }

    @Override // android.view.ViewGroup
    public C0230f generateDefaultLayoutParams() {
        return new C0230f(-2, -2);
    }

    @Override // android.view.ViewGroup
    public C0230f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0230f) {
            return new C0230f((C0230f) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0230f((ViewGroup.MarginLayoutParams) layoutParams) : new C0230f(layoutParams);
    }

    public void getChildRect(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            getDescendantRect(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @NonNull
    public List<View> getDependencies(@NonNull View view) {
        List<View> listM209140h = this.mChildDag.m209140h(view);
        this.mTempDependenciesList.clear();
        if (listM209140h != null) {
            this.mTempDependenciesList.addAll(listM209140h);
        }
        return this.mTempDependenciesList;
    }

    @VisibleForTesting
    public final List<View> getDependencySortedChildren() {
        prepareChildren();
        return Collections.unmodifiableList(this.mDependencySortedChildren);
    }

    @NonNull
    public List<View> getDependents(@NonNull View view) {
        List listM209139g = this.mChildDag.m209139g(view);
        this.mTempDependenciesList.clear();
        if (listM209139g != null) {
            this.mTempDependenciesList.addAll(listM209139g);
        }
        return this.mTempDependenciesList;
    }

    public void getDescendantRect(View view, Rect rect) {
        ell0.m121240a(this, view, rect);
    }

    public void getDesiredAnchoredChildRect(View view, int i, Rect rect, Rect rect2) {
        C0230f c0230f = (C0230f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        getDesiredAnchoredChildRectWithoutConstraints(view, i, rect, rect2, c0230f, measuredWidth, measuredHeight);
        constrainChildRect(c0230f, rect2, measuredWidth, measuredHeight);
    }

    public void getLastChildRect(View view, Rect rect) {
        rect.set(((C0230f) view.getLayoutParams()).m1184h());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final dgq0 getLastWindowInsets() {
        return this.mLastInsets;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.mNestedScrollingParentHelper.m125663a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0230f getResolvedLayoutParams(View view) {
        C0230f c0230f = (C0230f) view.getLayoutParams();
        if (!c0230f.f1374b) {
            if (view instanceof InterfaceC0226b) {
                AbstractC0227c behavior = ((InterfaceC0226b) view).getBehavior();
                if (behavior == null) {
                    Log.e(TAG, "Attached behavior class is null");
                }
                c0230f.m1191o(behavior);
                c0230f.f1374b = true;
                return c0230f;
            }
            InterfaceC0228d interfaceC0228d = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                interfaceC0228d = (InterfaceC0228d) superclass.getAnnotation(InterfaceC0228d.class);
                if (interfaceC0228d != null) {
                    break;
                }
            }
            if (interfaceC0228d != null) {
                try {
                    c0230f.m1191o(interfaceC0228d.value().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception e) {
                    Log.e(TAG, "Default behavior class " + interfaceC0228d.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                }
            }
            c0230f.f1374b = true;
        }
        return c0230f;
    }

    @Nullable
    public Drawable getStatusBarBackground() {
        return this.mStatusBarBackground;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    public boolean isPointInChildBounds(@NonNull View view, int i, int i2) {
        Rect rectAcquireTempRect = acquireTempRect();
        getDescendantRect(view, rectAcquireTempRect);
        try {
            return rectAcquireTempRect.contains(i, i2);
        } finally {
            releaseTempRect(rectAcquireTempRect);
        }
    }

    public void offsetChildToAnchor(View view, int i) {
        AbstractC0227c abstractC0227cM1182f;
        C0230f c0230f = (C0230f) view.getLayoutParams();
        if (c0230f.f1383k != null) {
            Rect rectAcquireTempRect = acquireTempRect();
            Rect rectAcquireTempRect2 = acquireTempRect();
            Rect rectAcquireTempRect3 = acquireTempRect();
            getDescendantRect(c0230f.f1383k, rectAcquireTempRect);
            getChildRect(view, false, rectAcquireTempRect2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            getDesiredAnchoredChildRectWithoutConstraints(view, i, rectAcquireTempRect, rectAcquireTempRect3, c0230f, measuredWidth, measuredHeight);
            boolean z = (rectAcquireTempRect3.left == rectAcquireTempRect2.left && rectAcquireTempRect3.top == rectAcquireTempRect2.top) ? false : true;
            constrainChildRect(c0230f, rectAcquireTempRect3, measuredWidth, measuredHeight);
            int i2 = rectAcquireTempRect3.left - rectAcquireTempRect2.left;
            int i3 = rectAcquireTempRect3.top - rectAcquireTempRect2.top;
            if (i2 != 0) {
                kkl0.m150139U(view, i2);
            }
            if (i3 != 0) {
                kkl0.m150140V(view, i3);
            }
            if (z && (abstractC0227cM1182f = c0230f.m1182f()) != null) {
                abstractC0227cM1182f.onDependentViewChanged(this, view, c0230f.f1383k);
            }
            releaseTempRect(rectAcquireTempRect);
            releaseTempRect(rectAcquireTempRect2);
            releaseTempRect(rectAcquireTempRect3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        resetTouchBehaviors(false);
        if (this.mNeedsPreDrawListener) {
            if (this.mOnPreDrawListener == null) {
                this.mOnPreDrawListener = new ViewTreeObserverOnPreDrawListenerC0231g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
        }
        if (this.mLastInsets == null && kkl0.m150185u(this)) {
            kkl0.m150158g0(this);
        }
        this.mIsAttachedToWindow = true;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ca  */
    public final void onChildViewsChanged(int i) {
        int i2;
        AbstractC0227c abstractC0227cM1182f;
        boolean zOnDependentViewChanged;
        int iM150191x = kkl0.m150191x(this);
        int size = this.mDependencySortedChildren.size();
        Rect rectAcquireTempRect = acquireTempRect();
        Rect rectAcquireTempRect2 = acquireTempRect();
        Rect rectAcquireTempRect3 = acquireTempRect();
        for (int i3 = 0; i3 < size; i3++) {
            View view = this.mDependencySortedChildren.get(i3);
            C0230f c0230f = (C0230f) view.getLayoutParams();
            if (i != 0 || view.getVisibility() != 8) {
                for (int i4 = 0; i4 < i3; i4++) {
                    if (c0230f.f1384l == this.mDependencySortedChildren.get(i4)) {
                        offsetChildToAnchor(view, iM150191x);
                    }
                }
                getChildRect(view, true, rectAcquireTempRect2);
                if (c0230f.f1379g != 0 && !rectAcquireTempRect2.isEmpty()) {
                    int iM157578b = m9k.m157578b(c0230f.f1379g, iM150191x);
                    int i5 = iM157578b & 112;
                    if (i5 == 48) {
                        rectAcquireTempRect.top = Math.max(rectAcquireTempRect.top, rectAcquireTempRect2.bottom);
                    } else if (i5 == 80) {
                        rectAcquireTempRect.bottom = Math.max(rectAcquireTempRect.bottom, getHeight() - rectAcquireTempRect2.top);
                    }
                    int i6 = iM157578b & 7;
                    if (i6 == 3) {
                        rectAcquireTempRect.left = Math.max(rectAcquireTempRect.left, rectAcquireTempRect2.right);
                    } else if (i6 == 5) {
                        rectAcquireTempRect.right = Math.max(rectAcquireTempRect.right, getWidth() - rectAcquireTempRect2.left);
                    }
                }
                if (c0230f.f1380h != 0 && view.getVisibility() == 0) {
                    offsetChildByInset(view, rectAcquireTempRect, iM150191x);
                }
                if (i != 2) {
                    getLastChildRect(view, rectAcquireTempRect3);
                    if (!rectAcquireTempRect3.equals(rectAcquireTempRect2)) {
                        recordLastChildRect(view, rectAcquireTempRect2);
                        for (i2 = i3 + 1; i2 < size; i2++) {
                            View view2 = this.mDependencySortedChildren.get(i2);
                            C0230f c0230f2 = (C0230f) view2.getLayoutParams();
                            abstractC0227cM1182f = c0230f2.m1182f();
                            if (abstractC0227cM1182f == null && abstractC0227cM1182f.layoutDependsOn(this, view2, view)) {
                                if (i == 0 && c0230f2.m1183g()) {
                                    c0230f2.m1187k();
                                } else {
                                    if (i != 2) {
                                        zOnDependentViewChanged = abstractC0227cM1182f.onDependentViewChanged(this, view2, view);
                                    } else {
                                        abstractC0227cM1182f.onDependentViewRemoved(this, view2, view);
                                        zOnDependentViewChanged = true;
                                    }
                                    if (i == 1) {
                                        c0230f2.m1192p(zOnDependentViewChanged);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    while (i2 < size) {
                        View view3 = this.mDependencySortedChildren.get(i2);
                        C0230f c0230f3 = (C0230f) view3.getLayoutParams();
                        abstractC0227cM1182f = c0230f3.m1182f();
                        if (abstractC0227cM1182f == null) {
                        }
                    }
                }
            }
        }
        releaseTempRect(rectAcquireTempRect);
        releaseTempRect(rectAcquireTempRect2);
        releaseTempRect(rectAcquireTempRect3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        resetTouchBehaviors(false);
        if (this.mNeedsPreDrawListener && this.mOnPreDrawListener != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.mOnPreDrawListener);
        }
        View view = this.mNestedScrollingTarget;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.mIsAttachedToWindow = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.mDrawStatusBarBackground || this.mStatusBarBackground == null) {
            return;
        }
        dgq0 dgq0Var = this.mLastInsets;
        int iM115686l = dgq0Var != null ? dgq0Var.m115686l() : 0;
        if (iM115686l > 0) {
            this.mStatusBarBackground.setBounds(0, 0, getWidth(), iM115686l);
            this.mStatusBarBackground.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            resetTouchBehaviors(true);
        }
        boolean zPerformIntercept = performIntercept(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zPerformIntercept;
        }
        resetTouchBehaviors(true);
        return zPerformIntercept;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        AbstractC0227c abstractC0227cM1182f;
        int iM150191x = kkl0.m150191x(this);
        int size = this.mDependencySortedChildren.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = this.mDependencySortedChildren.get(i5);
            if (view.getVisibility() != 8 && ((abstractC0227cM1182f = ((C0230f) view.getLayoutParams()).m1182f()) == null || !abstractC0227cM1182f.onLayoutChild(this, view, iM150191x))) {
                onLayoutChild(view, iM150191x);
            }
        }
    }

    public void onLayoutChild(@NonNull View view, int i) {
        C0230f c0230f = (C0230f) view.getLayoutParams();
        if (c0230f.m1177a()) {
            wtq0.m207906a("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
            return;
        }
        View view2 = c0230f.f1383k;
        if (view2 != null) {
            layoutChildWithAnchor(view, view2, i);
            return;
        }
        int i2 = c0230f.f1377e;
        if (i2 >= 0) {
            layoutChildWithKeyline(view, i2, i);
        } else {
            layoutChild(view, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:44:0x010b  */
    /* JADX WARN: Code duplicated, block: B:47:0x012c  */
    /* JADX WARN: Code duplicated, block: B:48:0x012f  */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        AbstractC0227c abstractC0227cM1182f;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        View view;
        int i13;
        int i14;
        boolean zOnMeasureChild;
        int iMax;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.prepareChildren();
        coordinatorLayout.ensurePreDrawListener();
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        int iM150191x = kkl0.m150191x(coordinatorLayout);
        boolean z = iM150191x == 1;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i15 = paddingLeft + paddingRight;
        int i16 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        boolean z2 = coordinatorLayout.mLastInsets != null && kkl0.m150185u(coordinatorLayout);
        int size3 = coordinatorLayout.mDependencySortedChildren.size();
        int i17 = 0;
        int iCombineMeasuredStates = 0;
        while (i17 < size3) {
            View view2 = coordinatorLayout.mDependencySortedChildren.get(i17);
            int i18 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                i8 = size3;
                i4 = i17;
                i9 = paddingLeft;
                i6 = iM150191x;
                suggestedMinimumWidth = i18;
                i13 = paddingRight;
            } else {
                C0230f c0230f = (C0230f) view2.getLayoutParams();
                int i19 = c0230f.f1377e;
                if (i19 < 0 || mode == 0) {
                    i3 = suggestedMinimumHeight;
                } else {
                    int keyline = coordinatorLayout.getKeyline(i19);
                    int iM157578b = m9k.m157578b(resolveKeylineGravity(c0230f.f1375c), iM150191x) & 7;
                    i3 = suggestedMinimumHeight;
                    if ((iM157578b != 3 || z) && !(iM157578b == 5 && z)) {
                        if ((iM157578b == 5 && !z) || (iM157578b == 3 && z)) {
                            iMax = Math.max(0, keyline - paddingLeft);
                        }
                        if (z2 || kkl0.m150185u(view2)) {
                            iMakeMeasureSpec = i;
                            iMakeMeasureSpec2 = i2;
                        } else {
                            int iM115684j = coordinatorLayout.mLastInsets.m115684j() + coordinatorLayout.mLastInsets.m115685k();
                            int iM115686l = coordinatorLayout.mLastInsets.m115686l() + coordinatorLayout.mLastInsets.m115683i();
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - iM115684j, mode);
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iM115686l, mode2);
                        }
                        abstractC0227cM1182f = c0230f.m1182f();
                        if (abstractC0227cM1182f != null) {
                            i8 = size3;
                            int i20 = iMakeMeasureSpec;
                            view = view2;
                            int i21 = i3;
                            i6 = iM150191x;
                            i7 = i21;
                            i9 = paddingLeft;
                            i10 = i18;
                            i13 = paddingRight;
                            i14 = iCombineMeasuredStates;
                            int i22 = iMakeMeasureSpec2;
                            zOnMeasureChild = abstractC0227cM1182f.onMeasureChild(this, view, i20, i5, i22, 0);
                            i12 = i20;
                            i11 = i22;
                            if (zOnMeasureChild) {
                                coordinatorLayout = this;
                            }
                            suggestedMinimumWidth = Math.max(i10, i15 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0230f).leftMargin + ((ViewGroup.MarginLayoutParams) c0230f).rightMargin);
                            int iMax2 = Math.max(i7, i16 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0230f).topMargin + ((ViewGroup.MarginLayoutParams) c0230f).bottomMargin);
                            iCombineMeasuredStates = View.combineMeasuredStates(i14, view.getMeasuredState());
                            suggestedMinimumHeight = iMax2;
                        } else {
                            int i23 = i3;
                            i6 = iM150191x;
                            i7 = i23;
                            i8 = size3;
                            i9 = paddingLeft;
                            i10 = i18;
                            i11 = iMakeMeasureSpec2;
                            i12 = iMakeMeasureSpec;
                            view = view2;
                            i13 = paddingRight;
                            i14 = iCombineMeasuredStates;
                        }
                        View view3 = view;
                        coordinatorLayout = this;
                        coordinatorLayout.onMeasureChild(view3, i12, i5, i11, 0);
                        view = view3;
                        suggestedMinimumWidth = Math.max(i10, i15 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0230f).leftMargin + ((ViewGroup.MarginLayoutParams) c0230f).rightMargin);
                        int iMax3 = Math.max(i7, i16 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0230f).topMargin + ((ViewGroup.MarginLayoutParams) c0230f).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(i14, view.getMeasuredState());
                        suggestedMinimumHeight = iMax3;
                    } else {
                        iMax = Math.max(0, (size - paddingRight) - keyline);
                    }
                    int i24 = i17;
                    i5 = iMax;
                    i4 = i24;
                    if (z2) {
                        iMakeMeasureSpec = i;
                        iMakeMeasureSpec2 = i2;
                    } else {
                        iMakeMeasureSpec = i;
                        iMakeMeasureSpec2 = i2;
                    }
                    abstractC0227cM1182f = c0230f.m1182f();
                    if (abstractC0227cM1182f != null) {
                        i8 = size3;
                        int i25 = iMakeMeasureSpec;
                        view = view2;
                        int i26 = i3;
                        i6 = iM150191x;
                        i7 = i26;
                        i9 = paddingLeft;
                        i10 = i18;
                        i13 = paddingRight;
                        i14 = iCombineMeasuredStates;
                        int i27 = iMakeMeasureSpec2;
                        zOnMeasureChild = abstractC0227cM1182f.onMeasureChild(this, view, i25, i5, i27, 0);
                        i12 = i25;
                        i11 = i27;
                        if (zOnMeasureChild) {
                            coordinatorLayout = this;
                        }
                        suggestedMinimumWidth = Math.max(i10, i15 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0230f).leftMargin + ((ViewGroup.MarginLayoutParams) c0230f).rightMargin);
                        int iMax4 = Math.max(i7, i16 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0230f).topMargin + ((ViewGroup.MarginLayoutParams) c0230f).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(i14, view.getMeasuredState());
                        suggestedMinimumHeight = iMax4;
                    } else {
                        int i28 = i3;
                        i6 = iM150191x;
                        i7 = i28;
                        i8 = size3;
                        i9 = paddingLeft;
                        i10 = i18;
                        i11 = iMakeMeasureSpec2;
                        i12 = iMakeMeasureSpec;
                        view = view2;
                        i13 = paddingRight;
                        i14 = iCombineMeasuredStates;
                    }
                    View view4 = view;
                    coordinatorLayout = this;
                    coordinatorLayout.onMeasureChild(view4, i12, i5, i11, 0);
                    view = view4;
                    suggestedMinimumWidth = Math.max(i10, i15 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0230f).leftMargin + ((ViewGroup.MarginLayoutParams) c0230f).rightMargin);
                    int iMax5 = Math.max(i7, i16 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0230f).topMargin + ((ViewGroup.MarginLayoutParams) c0230f).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i14, view.getMeasuredState());
                    suggestedMinimumHeight = iMax5;
                }
                i4 = i17;
                i5 = 0;
                if (z2) {
                    iMakeMeasureSpec = i;
                    iMakeMeasureSpec2 = i2;
                } else {
                    iMakeMeasureSpec = i;
                    iMakeMeasureSpec2 = i2;
                }
                abstractC0227cM1182f = c0230f.m1182f();
                if (abstractC0227cM1182f != null) {
                    i8 = size3;
                    int i29 = iMakeMeasureSpec;
                    view = view2;
                    int i210 = i3;
                    i6 = iM150191x;
                    i7 = i210;
                    i9 = paddingLeft;
                    i10 = i18;
                    i13 = paddingRight;
                    i14 = iCombineMeasuredStates;
                    int i211 = iMakeMeasureSpec2;
                    zOnMeasureChild = abstractC0227cM1182f.onMeasureChild(this, view, i29, i5, i211, 0);
                    i12 = i29;
                    i11 = i211;
                    if (zOnMeasureChild) {
                        coordinatorLayout = this;
                    }
                    suggestedMinimumWidth = Math.max(i10, i15 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0230f).leftMargin + ((ViewGroup.MarginLayoutParams) c0230f).rightMargin);
                    int iMax6 = Math.max(i7, i16 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0230f).topMargin + ((ViewGroup.MarginLayoutParams) c0230f).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i14, view.getMeasuredState());
                    suggestedMinimumHeight = iMax6;
                } else {
                    int i212 = i3;
                    i6 = iM150191x;
                    i7 = i212;
                    i8 = size3;
                    i9 = paddingLeft;
                    i10 = i18;
                    i11 = iMakeMeasureSpec2;
                    i12 = iMakeMeasureSpec;
                    view = view2;
                    i13 = paddingRight;
                    i14 = iCombineMeasuredStates;
                }
                View view5 = view;
                coordinatorLayout = this;
                coordinatorLayout.onMeasureChild(view5, i12, i5, i11, 0);
                view = view5;
                suggestedMinimumWidth = Math.max(i10, i15 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0230f).leftMargin + ((ViewGroup.MarginLayoutParams) c0230f).rightMargin);
                int iMax7 = Math.max(i7, i16 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0230f).topMargin + ((ViewGroup.MarginLayoutParams) c0230f).bottomMargin);
                iCombineMeasuredStates = View.combineMeasuredStates(i14, view.getMeasuredState());
                suggestedMinimumHeight = iMax7;
            }
            i17 = i4 + 1;
            paddingLeft = i9;
            paddingRight = i13;
            iM150191x = i6;
            size3 = i8;
        }
        int i30 = iCombineMeasuredStates;
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i, (-16777216) & i30), View.resolveSizeAndState(suggestedMinimumHeight, i2, i30 << 16));
    }

    public void onMeasureChild(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0015  */
    @Override // android.view.ViewGroup, android.view.ViewParent, p153l.ei20
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        AbstractC0227c abstractC0227cM1182f;
        CoordinatorLayout coordinatorLayout;
        View view2;
        float f3;
        float f4;
        boolean z2;
        int childCount = getChildCount();
        int i = 0;
        boolean zOnNestedFling = false;
        while (i < childCount) {
            View childAt = this.getChildAt(i);
            if (childAt.getVisibility() == 8) {
                coordinatorLayout = this;
                view2 = view;
                f3 = f;
                f4 = f2;
                z2 = z;
            } else {
                C0230f c0230f = (C0230f) childAt.getLayoutParams();
                if (c0230f.m1186j(0) && (abstractC0227cM1182f = c0230f.m1182f()) != null) {
                    coordinatorLayout = this;
                    view2 = view;
                    f3 = f;
                    f4 = f2;
                    z2 = z;
                    zOnNestedFling |= abstractC0227cM1182f.onNestedFling(coordinatorLayout, childAt, view2, f3, f4, z2);
                } else {
                    coordinatorLayout = this;
                    view2 = view;
                    f3 = f;
                    f4 = f2;
                    z2 = z;
                }
            }
            i++;
            this = coordinatorLayout;
            view = view2;
            f = f3;
            f2 = f4;
            z = z2;
        }
        CoordinatorLayout coordinatorLayout2 = this;
        if (zOnNestedFling) {
            coordinatorLayout2.onChildViewsChanged(1);
        }
        return zOnNestedFling;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0015  */
    @Override // android.view.ViewGroup, android.view.ViewParent, p153l.ei20
    public boolean onNestedPreFling(View view, float f, float f2) {
        AbstractC0227c abstractC0227cM1182f;
        CoordinatorLayout coordinatorLayout;
        View view2;
        float f3;
        float f4;
        int childCount = getChildCount();
        int i = 0;
        boolean zOnNestedPreFling = false;
        while (i < childCount) {
            View childAt = this.getChildAt(i);
            if (childAt.getVisibility() == 8) {
                coordinatorLayout = this;
                view2 = view;
                f3 = f;
                f4 = f2;
            } else {
                C0230f c0230f = (C0230f) childAt.getLayoutParams();
                if (c0230f.m1186j(0) && (abstractC0227cM1182f = c0230f.m1182f()) != null) {
                    coordinatorLayout = this;
                    view2 = view;
                    f3 = f;
                    f4 = f2;
                    zOnNestedPreFling |= abstractC0227cM1182f.onNestedPreFling(coordinatorLayout, childAt, view2, f3, f4);
                } else {
                    coordinatorLayout = this;
                    view2 = view;
                    f3 = f;
                    f4 = f2;
                }
            }
            i++;
            this = coordinatorLayout;
            view = view2;
            f = f3;
            f2 = f4;
        }
        return zOnNestedPreFling;
    }

    @Override // p153l.ci20
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        AbstractC0227c abstractC0227cM1182f;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C0230f c0230f = (C0230f) childAt.getLayoutParams();
                if (c0230f.m1186j(i3) && (abstractC0227cM1182f = c0230f.m1182f()) != null) {
                    int[] iArr2 = this.mBehaviorConsumed;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC0227cM1182f.onNestedPreScroll(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.mBehaviorConsumed;
                    iMax = i > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    int[] iArr4 = this.mBehaviorConsumed;
                    iMax2 = i2 > 0 ? Math.max(iMax2, iArr4[1]) : Math.min(iMax2, iArr4[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z) {
            onChildViewsChanged(1);
        }
    }

    @Override // p153l.di20
    public void onNestedScroll(@NonNull View view, int i, int i2, int i3, int i4, int i5, @NonNull int[] iArr) {
        AbstractC0227c abstractC0227cM1182f;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C0230f c0230f = (C0230f) childAt.getLayoutParams();
                if (c0230f.m1186j(i5) && (abstractC0227cM1182f = c0230f.m1182f()) != null) {
                    int[] iArr2 = this.mBehaviorConsumed;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC0227cM1182f.onNestedScroll(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    int[] iArr3 = this.mBehaviorConsumed;
                    iMax = i3 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    int[] iArr4 = this.mBehaviorConsumed;
                    iMax2 = i4 > 0 ? Math.max(iMax2, iArr4[1]) : Math.min(iMax2, iArr4[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z) {
            onChildViewsChanged(1);
        }
    }

    @Override // p153l.ci20
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        AbstractC0227c abstractC0227cM1182f;
        CoordinatorLayout coordinatorLayout;
        View view3;
        View view4;
        int i3;
        int i4;
        this.mNestedScrollingParentHelper.m125665c(view, view2, i, i2);
        this.mNestedScrollingTarget = view2;
        int childCount = getChildCount();
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = this.getChildAt(i5);
            C0230f c0230f = (C0230f) childAt.getLayoutParams();
            if (c0230f.m1186j(i2) && (abstractC0227cM1182f = c0230f.m1182f()) != null) {
                coordinatorLayout = this;
                view3 = view;
                view4 = view2;
                i3 = i;
                i4 = i2;
                abstractC0227cM1182f.onNestedScrollAccepted(coordinatorLayout, childAt, view3, view4, i3, i4);
            } else {
                coordinatorLayout = this;
                view3 = view;
                view4 = view2;
                i3 = i;
                i4 = i2;
            }
            i5++;
            this = coordinatorLayout;
            view = view3;
            view2 = view4;
            i = i3;
            i2 = i4;
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        SparseArray<Parcelable> sparseArray = savedState.behaviorStates;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC0227c abstractC0227cM1182f = getResolvedLayoutParams(childAt).m1182f();
            if (id != -1 && abstractC0227cM1182f != null && (parcelable2 = sparseArray.get(id)) != null) {
                abstractC0227cM1182f.onRestoreInstanceState(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC0227c abstractC0227cM1182f = ((C0230f) childAt.getLayoutParams()).m1182f();
            if (id != -1 && abstractC0227cM1182f != null && (parcelableOnSaveInstanceState = abstractC0227cM1182f.onSaveInstanceState(this, childAt)) != null) {
                sparseArray.append(id, parcelableOnSaveInstanceState);
            }
        }
        savedState.behaviorStates = sparseArray;
        return savedState;
    }

    @Override // p153l.ci20
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C0230f c0230f = (C0230f) childAt.getLayoutParams();
                AbstractC0227c abstractC0227cM1182f = c0230f.m1182f();
                if (abstractC0227cM1182f != null) {
                    boolean zOnStartNestedScroll = abstractC0227cM1182f.onStartNestedScroll(this, childAt, view, view2, i, i2);
                    z |= zOnStartNestedScroll;
                    c0230f.m1194r(i2, zOnStartNestedScroll);
                } else {
                    c0230f.m1194r(i2, false);
                }
            }
        }
        return z;
    }

    @Override // p153l.ci20
    public void onStopNestedScroll(View view, int i) {
        this.mNestedScrollingParentHelper.m125667e(view, i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0230f c0230f = (C0230f) childAt.getLayoutParams();
            if (c0230f.m1186j(i)) {
                AbstractC0227c abstractC0227cM1182f = c0230f.m1182f();
                if (abstractC0227cM1182f != null) {
                    abstractC0227cM1182f.onStopNestedScroll(this, childAt, view, i);
                }
                c0230f.m1188l(i);
                c0230f.m1187k();
            }
        }
        this.mNestedScrollingTarget = null;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    /* JADX WARN: Code duplicated, block: B:15:0x0037 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0039  */
    /* JADX WARN: Code duplicated, block: B:18:0x004c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015 A[PHI: r3
      0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0024, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zPerformIntercept;
        boolean zOnTouchEvent;
        MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.mBehaviorTouchView == null) {
            zPerformIntercept = performIntercept(motionEvent, 1);
            if (!zPerformIntercept) {
                zOnTouchEvent = false;
            }
            motionEventObtain = null;
            if (this.mBehaviorTouchView == null) {
                zOnTouchEvent |= super.onTouchEvent(motionEvent);
            } else if (zPerformIntercept) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEventObtain);
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
            if (actionMasked == 1 && actionMasked != 3) {
                return zOnTouchEvent;
            }
            resetTouchBehaviors(false);
            return zOnTouchEvent;
        }
        zPerformIntercept = false;
        AbstractC0227c abstractC0227cM1182f = ((C0230f) this.mBehaviorTouchView.getLayoutParams()).m1182f();
        if (abstractC0227cM1182f != null) {
            zOnTouchEvent = abstractC0227cM1182f.onTouchEvent(this, this.mBehaviorTouchView, motionEvent);
        } else {
            zOnTouchEvent = false;
        }
        motionEventObtain = null;
        if (this.mBehaviorTouchView == null) {
            zOnTouchEvent |= super.onTouchEvent(motionEvent);
        } else if (zPerformIntercept) {
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            motionEventObtain = MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, 0.0f, 0.0f, 0);
            super.onTouchEvent(motionEventObtain);
        }
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        if (actionMasked == 1) {
        }
        resetTouchBehaviors(false);
        return zOnTouchEvent;
    }

    public void recordLastChildRect(View view, Rect rect) {
        ((C0230f) view.getLayoutParams()).m1193q(rect);
    }

    public void removePreDrawListener() {
        if (this.mIsAttachedToWindow && this.mOnPreDrawListener != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.mOnPreDrawListener);
        }
        this.mNeedsPreDrawListener = false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        AbstractC0227c abstractC0227cM1182f = ((C0230f) view.getLayoutParams()).m1182f();
        if (abstractC0227cM1182f == null || !abstractC0227cM1182f.onRequestChildRectangleOnScreen(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.mDisallowInterceptReset) {
            return;
        }
        resetTouchBehaviors(false);
        this.mDisallowInterceptReset = true;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        setupForInsets();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.mOnHierarchyChangeListener = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(@Nullable Drawable drawable) {
        Drawable drawable2 = this.mStatusBarBackground;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.mStatusBarBackground = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.mStatusBarBackground.setState(getDrawableState());
                }
                oce.m167173m(this.mStatusBarBackground, kkl0.m150191x(this));
                this.mStatusBarBackground.setVisible(getVisibility() == 0, false);
                this.mStatusBarBackground.setCallback(this);
            }
            kkl0.m150146a0(this);
        }
    }

    public void setStatusBarBackgroundColor(@ColorInt int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(@DrawableRes int i) {
        setStatusBarBackground(i != 0 ? j26.m143192e(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.mStatusBarBackground;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.mStatusBarBackground.setVisible(z, false);
    }

    public final dgq0 setWindowInsets(dgq0 dgq0Var) {
        if (l950.m153327a(this.mLastInsets, dgq0Var)) {
            return dgq0Var;
        }
        this.mLastInsets = dgq0Var;
        boolean z = false;
        boolean z2 = dgq0Var != null && dgq0Var.m115686l() > 0;
        this.mDrawStatusBarBackground = z2;
        if (!z2 && getBackground() == null) {
            z = true;
        }
        setWillNotDraw(z);
        dgq0 dgq0VarDispatchApplyWindowInsetsToBehaviors = dispatchApplyWindowInsetsToBehaviors(dgq0Var);
        requestLayout();
        return dgq0VarDispatchApplyWindowInsetsToBehaviors;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mStatusBarBackground;
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$c */
    public static abstract class AbstractC0227c<V extends View> {
        public AbstractC0227c() {
        }

        @Nullable
        public static Object getTag(@NonNull View view) {
            return ((C0230f) view.getLayoutParams()).f1390r;
        }

        public static void setTag(@NonNull View view, @Nullable Object obj) {
            ((C0230f) view.getLayoutParams()).f1390r = obj;
        }

        public boolean blocksInteractionBelow(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v2) {
            return getScrimOpacity(coordinatorLayout, v2) > 0.0f;
        }

        public boolean getInsetDodgeRect(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v2, @NonNull Rect rect) {
            return false;
        }

        @ColorInt
        public int getScrimColor(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v2) {
            return RoundedDrawable.DEFAULT_BORDER_COLOR;
        }

        @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 1.0d)
        public float getScrimOpacity(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v2) {
            return 0.0f;
        }

        public boolean layoutDependsOn(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v2, @NonNull View view) {
            return false;
        }

        public void onAttachedToLayoutParams(@NonNull C0230f c0230f) {
        }

        public boolean onDependentViewChanged(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v2, @NonNull View view) {
            return false;
        }

        public void onDependentViewRemoved(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v2, @NonNull View view) {
        }

        public void onDetachedFromLayoutParams() {
        }

        public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v2, @NonNull MotionEvent motionEvent) {
            return false;
        }

        public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v2, int i) {
            return false;
        }

        public boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v2, int i, int i2, int i3, int i4) {
            return false;
        }

        public boolean onNestedFling(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v2, @NonNull View view, float f, float f2, boolean z) {
            return false;
        }

        public boolean onNestedPreFling(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v2, @NonNull View view, float f, float f2) {
            return false;
        }

        public void onNestedPreScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v2, @NonNull View view, int i, int i2, @NonNull int[] iArr, int i3) {
            if (i3 == 0) {
                onNestedPreScroll(coordinatorLayout, v2, view, i, i2, iArr);
            }
        }

        public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v2, @NonNull View view, int i, int i2, int i3, int i4, int i5, @NonNull int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
            onNestedScroll(coordinatorLayout, v2, view, i, i2, i3, i4, i5);
        }

        public void onNestedScrollAccepted(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v2, @NonNull View view, @NonNull View view2, int i, int i2) {
            if (i2 == 0) {
                onNestedScrollAccepted(coordinatorLayout, v2, view, view2, i);
            }
        }

        public boolean onRequestChildRectangleOnScreen(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v2, @NonNull Rect rect, boolean z) {
            return false;
        }

        public void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v2, @NonNull Parcelable parcelable) {
        }

        @Nullable
        public Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v2) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v2, @NonNull View view, @NonNull View view2, int i, int i2) {
            if (i2 == 0) {
                return onStartNestedScroll(coordinatorLayout, v2, view, view2, i);
            }
            return false;
        }

        public void onStopNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v2, @NonNull View view, int i) {
            if (i == 0) {
                onStopNestedScroll(coordinatorLayout, v2, view);
            }
        }

        public boolean onTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v2, @NonNull MotionEvent motionEvent) {
            return false;
        }

        public AbstractC0227c(Context context, AttributeSet attributeSet) {
        }

        @Deprecated
        public void onNestedPreScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v2, @NonNull View view, int i, int i2, @NonNull int[] iArr) {
        }

        @Deprecated
        public void onNestedScrollAccepted(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v2, @NonNull View view, @NonNull View view2, int i) {
        }

        @Deprecated
        public void onStopNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v2, @NonNull View view) {
        }

        @Deprecated
        public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v2, @NonNull View view, @NonNull View view2, int i) {
            return false;
        }

        @Deprecated
        public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v2, @NonNull View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                onNestedScroll(coordinatorLayout, v2, view, i, i2, i3, i4);
            }
        }

        @Deprecated
        public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v2, @NonNull View view, int i, int i2, int i3, int i4) {
        }

        @NonNull
        public dgq0 onApplyWindowInsets(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v2, @NonNull dgq0 dgq0Var) {
            return dgq0Var;
        }
    }

    @Override // android.view.ViewGroup
    public C0230f generateLayoutParams(AttributeSet attributeSet) {
        return new C0230f(getContext(), attributeSet);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0224a();
        SparseArray<Parcelable> behaviorStates;

        /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$SavedState$a */
        public static class C0224a implements Parcelable.ClassLoaderCreator<SavedState> {
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
            int i = parcel.readInt();
            int[] iArr = new int[i];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.behaviorStates = new SparseArray<>(i);
            for (int i2 = 0; i2 < i; i2++) {
                this.behaviorStates.append(iArr[i2], parcelableArray[i2]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray<Parcelable> sparseArray = this.behaviorStates;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.behaviorStates.keyAt(i2);
                parcelableArr[i2] = this.behaviorStates.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        onNestedScrollAccepted(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return onStartNestedScroll(view, view2, i, 0);
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$f */
    public static class C0230f extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a */
        public AbstractC0227c f1373a;

        /* JADX INFO: renamed from: b */
        public boolean f1374b;

        /* JADX INFO: renamed from: c */
        public int f1375c;

        /* JADX INFO: renamed from: d */
        public int f1376d;

        /* JADX INFO: renamed from: e */
        public int f1377e;

        /* JADX INFO: renamed from: f */
        public int f1378f;

        /* JADX INFO: renamed from: g */
        public int f1379g;

        /* JADX INFO: renamed from: h */
        public int f1380h;

        /* JADX INFO: renamed from: i */
        public int f1381i;

        /* JADX INFO: renamed from: j */
        public int f1382j;

        /* JADX INFO: renamed from: k */
        public View f1383k;

        /* JADX INFO: renamed from: l */
        public View f1384l;

        /* JADX INFO: renamed from: m */
        public boolean f1385m;

        /* JADX INFO: renamed from: n */
        public boolean f1386n;

        /* JADX INFO: renamed from: o */
        public boolean f1387o;

        /* JADX INFO: renamed from: p */
        public boolean f1388p;

        /* JADX INFO: renamed from: q */
        public final Rect f1389q;

        /* JADX INFO: renamed from: r */
        public Object f1390r;

        public C0230f(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1374b = false;
            this.f1375c = 0;
            this.f1376d = 0;
            this.f1377e = -1;
            this.f1378f = -1;
            this.f1379g = 0;
            this.f1380h = 0;
            this.f1389q = new Rect();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, zhc0.f204398d);
            this.f1375c = typedArrayObtainStyledAttributes.getInteger(zhc0.f204399e, 0);
            this.f1378f = typedArrayObtainStyledAttributes.getResourceId(zhc0.f204400f, -1);
            this.f1376d = typedArrayObtainStyledAttributes.getInteger(zhc0.f204401g, 0);
            this.f1377e = typedArrayObtainStyledAttributes.getInteger(zhc0.f204405k, -1);
            this.f1379g = typedArrayObtainStyledAttributes.getInt(zhc0.f204404j, 0);
            this.f1380h = typedArrayObtainStyledAttributes.getInt(zhc0.f204403i, 0);
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(zhc0.f204402h);
            this.f1374b = zHasValue;
            if (zHasValue) {
                this.f1373a = CoordinatorLayout.parseBehavior(context, attributeSet, typedArrayObtainStyledAttributes.getString(zhc0.f204402h));
            }
            typedArrayObtainStyledAttributes.recycle();
            AbstractC0227c abstractC0227c = this.f1373a;
            if (abstractC0227c != null) {
                abstractC0227c.onAttachedToLayoutParams(this);
            }
        }

        /* JADX INFO: renamed from: a */
        public boolean m1177a() {
            return this.f1383k == null && this.f1378f != -1;
        }

        /* JADX INFO: renamed from: b */
        public boolean m1178b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 == this.f1384l || m1195s(view2, kkl0.m150191x(coordinatorLayout))) {
                return true;
            }
            AbstractC0227c abstractC0227c = this.f1373a;
            return abstractC0227c != null && abstractC0227c.layoutDependsOn(coordinatorLayout, view, view2);
        }

        /* JADX INFO: renamed from: c */
        public boolean m1179c() {
            if (this.f1373a == null) {
                this.f1385m = false;
            }
            return this.f1385m;
        }

        /* JADX INFO: renamed from: d */
        public View m1180d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f1378f == -1) {
                this.f1384l = null;
                this.f1383k = null;
                return null;
            }
            if (this.f1383k == null || !m1196t(view, coordinatorLayout)) {
                m1190n(view, coordinatorLayout);
            }
            return this.f1383k;
        }

        @IdRes
        /* JADX INFO: renamed from: e */
        public int m1181e() {
            return this.f1378f;
        }

        @Nullable
        /* JADX INFO: renamed from: f */
        public AbstractC0227c m1182f() {
            return this.f1373a;
        }

        /* JADX INFO: renamed from: g */
        public boolean m1183g() {
            return this.f1388p;
        }

        /* JADX INFO: renamed from: h */
        public Rect m1184h() {
            return this.f1389q;
        }

        /* JADX INFO: renamed from: i */
        public boolean m1185i(CoordinatorLayout coordinatorLayout, View view) {
            boolean z = this.f1385m;
            if (z) {
                return true;
            }
            AbstractC0227c abstractC0227c = this.f1373a;
            boolean zBlocksInteractionBelow = (abstractC0227c != null ? abstractC0227c.blocksInteractionBelow(coordinatorLayout, view) : false) | z;
            this.f1385m = zBlocksInteractionBelow;
            return zBlocksInteractionBelow;
        }

        /* JADX INFO: renamed from: j */
        public boolean m1186j(int i) {
            if (i == 0) {
                return this.f1386n;
            }
            if (i != 1) {
                return false;
            }
            return this.f1387o;
        }

        /* JADX INFO: renamed from: k */
        public void m1187k() {
            this.f1388p = false;
        }

        /* JADX INFO: renamed from: l */
        public void m1188l(int i) {
            m1194r(i, false);
        }

        /* JADX INFO: renamed from: m */
        public void m1189m() {
            this.f1385m = false;
        }

        /* JADX INFO: renamed from: n */
        public final void m1190n(View view, CoordinatorLayout coordinatorLayout) {
            View viewFindViewById = coordinatorLayout.findViewById(this.f1378f);
            this.f1383k = viewFindViewById;
            if (viewFindViewById == null) {
                if (!coordinatorLayout.isInEditMode()) {
                    uid0.m196153a("Could not find CoordinatorLayout descendant view with id ", coordinatorLayout.getResources().getResourceName(this.f1378f), " to anchor view ", view);
                    return;
                } else {
                    this.f1384l = null;
                    this.f1383k = null;
                    return;
                }
            }
            if (viewFindViewById == coordinatorLayout) {
                if (!coordinatorLayout.isInEditMode()) {
                    wtq0.m207906a("View can not be anchored to the the parent CoordinatorLayout");
                    return;
                } else {
                    this.f1384l = null;
                    this.f1383k = null;
                    return;
                }
            }
            for (ViewParent parent = viewFindViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                if (parent == view) {
                    if (!coordinatorLayout.isInEditMode()) {
                        wtq0.m207906a("Anchor must not be a descendant of the anchored view");
                        return;
                    } else {
                        this.f1384l = null;
                        this.f1383k = null;
                        return;
                    }
                }
                if (parent instanceof View) {
                    viewFindViewById = parent;
                }
            }
            this.f1384l = viewFindViewById;
        }

        /* JADX INFO: renamed from: o */
        public void m1191o(@Nullable AbstractC0227c abstractC0227c) {
            AbstractC0227c abstractC0227c2 = this.f1373a;
            if (abstractC0227c2 != abstractC0227c) {
                if (abstractC0227c2 != null) {
                    abstractC0227c2.onDetachedFromLayoutParams();
                }
                this.f1373a = abstractC0227c;
                this.f1390r = null;
                this.f1374b = true;
                if (abstractC0227c != null) {
                    abstractC0227c.onAttachedToLayoutParams(this);
                }
            }
        }

        /* JADX INFO: renamed from: p */
        public void m1192p(boolean z) {
            this.f1388p = z;
        }

        /* JADX INFO: renamed from: q */
        public void m1193q(Rect rect) {
            this.f1389q.set(rect);
        }

        /* JADX INFO: renamed from: r */
        public void m1194r(int i, boolean z) {
            if (i == 0) {
                this.f1386n = z;
            } else {
                if (i != 1) {
                    return;
                }
                this.f1387o = z;
            }
        }

        /* JADX INFO: renamed from: s */
        public final boolean m1195s(View view, int i) {
            int iM157578b = m9k.m157578b(((C0230f) view.getLayoutParams()).f1379g, i);
            return iM157578b != 0 && (m9k.m157578b(this.f1380h, i) & iM157578b) == iM157578b;
        }

        /* JADX INFO: renamed from: t */
        public final boolean m1196t(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f1383k.getId() != this.f1378f) {
                return false;
            }
            View view2 = this.f1383k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f1384l = null;
                    this.f1383k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
            this.f1384l = view2;
            return true;
        }

        public C0230f(int i, int i2) {
            super(i, i2);
            this.f1374b = false;
            this.f1375c = 0;
            this.f1376d = 0;
            this.f1377e = -1;
            this.f1378f = -1;
            this.f1379g = 0;
            this.f1380h = 0;
            this.f1389q = new Rect();
        }

        public C0230f(C0230f c0230f) {
            super((ViewGroup.MarginLayoutParams) c0230f);
            this.f1374b = false;
            this.f1375c = 0;
            this.f1376d = 0;
            this.f1377e = -1;
            this.f1378f = -1;
            this.f1379g = 0;
            this.f1380h = 0;
            this.f1389q = new Rect();
        }

        public C0230f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1374b = false;
            this.f1375c = 0;
            this.f1376d = 0;
            this.f1377e = -1;
            this.f1378f = -1;
            this.f1379g = 0;
            this.f1380h = 0;
            this.f1389q = new Rect();
        }

        public C0230f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1374b = false;
            this.f1375c = 0;
            this.f1376d = 0;
            this.f1377e = -1;
            this.f1378f = -1;
            this.f1379g = 0;
            this.f1380h = 0;
            this.f1389q = new Rect();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        onNestedPreScroll(view, i, i2, iArr, 0);
    }

    @Override // p153l.ci20
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        onNestedScroll(view, i, i2, i3, i4, 0, this.mNestedScrollingV2ConsumedCompat);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p153l.ei20
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        onNestedScroll(view, i, i2, i3, i4, 0);
    }

    public CoordinatorLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, l8c0.f130433a);
    }

    public CoordinatorLayout(@NonNull Context context) {
        this(context, null);
    }
}
