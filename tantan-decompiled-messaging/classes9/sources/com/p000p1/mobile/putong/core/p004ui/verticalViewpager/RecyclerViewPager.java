package com.p000p1.mobile.putong.core.p004ui.verticalViewpager;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Locale;
import l.lji0;
import p006l.e9c0;
import p006l.pjc0;
import p006l.r0l0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class RecyclerViewPager extends RecyclerView {

    /* JADX INFO: renamed from: a */
    public pjc0<?> f6474a;

    /* JADX INFO: renamed from: b */
    public float f6475b;

    /* JADX INFO: renamed from: c */
    public float f6476c;

    /* JADX INFO: renamed from: d */
    public float f6477d;

    /* JADX INFO: renamed from: e */
    public float f6478e;

    /* JADX INFO: renamed from: f */
    public List<InterfaceC0361c> f6479f;

    /* JADX INFO: renamed from: g */
    public int f6480g;

    /* JADX INFO: renamed from: h */
    public int f6481h;

    /* JADX INFO: renamed from: i */
    public boolean f6482i;

    /* JADX INFO: renamed from: j */
    public boolean f6483j;

    /* JADX INFO: renamed from: k */
    public float f6484k;

    /* JADX INFO: renamed from: l */
    public PointF f6485l;

    /* JADX INFO: renamed from: m */
    public boolean f6486m;

    /* JADX INFO: renamed from: n */
    public int f6487n;

    /* JADX INFO: renamed from: o */
    public int f6488o;

    /* JADX INFO: renamed from: p */
    public View f6489p;

    /* JADX INFO: renamed from: q */
    public int f6490q;

    /* JADX INFO: renamed from: r */
    public int f6491r;

    /* JADX INFO: renamed from: s */
    public int f6492s;

    /* JADX INFO: renamed from: t */
    public int f6493t;

    /* JADX INFO: renamed from: u */
    public int f6494u;

    /* JADX INFO: renamed from: v */
    public boolean f6495v;

    /* JADX INFO: renamed from: w */
    public boolean f6496w;

    /* JADX INFO: renamed from: x */
    public float f6497x;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.verticalViewpager.RecyclerViewPager$a */
    public class C0359a extends n {
        public C0359a(Context context) {
            super(context);
        }

        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return RecyclerViewPager.this.f6477d / displayMetrics.densityDpi;
        }

        public PointF computeScrollVectorForPosition(int i) {
            if (getLayoutManager() == null) {
                return null;
            }
            return getLayoutManager().computeScrollVectorForPosition(i);
        }

        public void onStop() {
            super.onStop();
            if (NullChecker.a(RecyclerViewPager.this.f6479f)) {
                for (InterfaceC0361c interfaceC0361c : RecyclerViewPager.this.f6479f) {
                    if (NullChecker.a(interfaceC0361c)) {
                        interfaceC0361c.m9531a(RecyclerViewPager.this.f6481h, RecyclerViewPager.this.f6480g);
                    }
                }
            }
            RecyclerViewPager.this.f6495v = true;
        }

        public void onTargetFound(View view, RecyclerView.z zVar, RecyclerView.y.a aVar) {
            if (getLayoutManager() == null) {
                return;
            }
            int iCalculateDxToMakeVisible = calculateDxToMakeVisible(view, getHorizontalSnapPreference());
            int iCalculateDyToMakeVisible = calculateDyToMakeVisible(view, getVerticalSnapPreference());
            int leftDecorationWidth = iCalculateDxToMakeVisible > 0 ? iCalculateDxToMakeVisible - getLayoutManager().getLeftDecorationWidth(view) : iCalculateDxToMakeVisible + getLayoutManager().getRightDecorationWidth(view);
            int topDecorationHeight = iCalculateDyToMakeVisible > 0 ? iCalculateDyToMakeVisible - getLayoutManager().getTopDecorationHeight(view) : iCalculateDyToMakeVisible + getLayoutManager().getBottomDecorationHeight(view);
            int iCalculateTimeForDeceleration = calculateTimeForDeceleration((int) Math.sqrt((leftDecorationWidth * leftDecorationWidth) + (topDecorationHeight * topDecorationHeight)));
            if (iCalculateTimeForDeceleration > 0) {
                aVar.d(-leftDecorationWidth, -topDecorationHeight, iCalculateTimeForDeceleration, ((n) this).mDecelerateInterpolator);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.verticalViewpager.RecyclerViewPager$b */
    public class ViewTreeObserverOnGlobalLayoutListenerC0360b implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC0360b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            RecyclerViewPager.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            if (RecyclerViewPager.this.f6480g < 0 || RecyclerViewPager.this.f6480g >= RecyclerViewPager.this.getItemCount() || !NullChecker.a(RecyclerViewPager.this.f6479f)) {
                return;
            }
            for (InterfaceC0361c interfaceC0361c : RecyclerViewPager.this.f6479f) {
                if (NullChecker.a(interfaceC0361c)) {
                    interfaceC0361c.m9531a(RecyclerViewPager.this.f6481h, RecyclerViewPager.this.getCurrentPosition());
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.verticalViewpager.RecyclerViewPager$c */
    public interface InterfaceC0361c {
        /* JADX INFO: renamed from: a */
        void m9531a(int i, int i2);
    }

    public RecyclerViewPager(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6475b = 0.25f;
        this.f6476c = 0.15f;
        this.f6477d = 25.0f;
        this.f6480g = -1;
        this.f6481h = -1;
        this.f6490q = Integer.MIN_VALUE;
        this.f6491r = Integer.MAX_VALUE;
        this.f6492s = Integer.MIN_VALUE;
        this.f6493t = Integer.MAX_VALUE;
        this.f6494u = -1;
        this.f6495v = true;
        this.f6496w = false;
        m9528O(context, attributeSet, i);
        setNestedScrollingEnabled(false);
        this.f6484k = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getItemCount() {
        pjc0<?> pjc0Var = this.f6474a;
        if (pjc0Var == null) {
            return 0;
        }
        return pjc0Var.getItemCount();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0078  */
    /* JADX WARN: Code duplicated, block: B:30:0x007b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K */
    public void m9524K(int i) {
        if (this.f6496w) {
            i *= -1;
        }
        if (!m9529P()) {
            i *= -1;
        }
        if (getChildCount() > 0) {
            int iM22571b = r0l0.m22571b(this);
            int iM9527N = m9527N(i, (getWidth() - getPaddingLeft()) - getPaddingRight());
            int i2 = iM22571b + iM9527N;
            if (this.f6482i) {
                int iMax = Math.max(-1, Math.min(1, iM9527N));
                i2 = iMax == 0 ? iM22571b : this.f6494u + iMax;
            }
            int iMin = Math.min(Math.max(i2, 0), getItemCount() - 1);
            if (iMin == iM22571b && (!this.f6482i || this.f6494u == iM22571b)) {
                View viewM22570a = r0l0.m22570a(this);
                if (NullChecker.a(viewM22570a)) {
                    float f = this.f6478e;
                    float width = viewM22570a.getWidth();
                    float f2 = this.f6475b;
                    if (f <= width * f2 * f2 || iMin == 0) {
                        if (this.f6478e < viewM22570a.getWidth() * (-this.f6475b) && iMin != getItemCount() - 1) {
                            if (this.f6496w) {
                                iMin--;
                            } else {
                                iMin++;
                            }
                        }
                    } else if (this.f6496w) {
                        iMin++;
                    } else {
                        iMin--;
                    }
                }
            }
            smoothScrollToPosition(m9530Q(iMin, getItemCount()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0072  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L */
    public void m9525L(int i) {
        if (this.f6496w) {
            i *= -1;
        }
        if (getChildCount() > 0) {
            int iM22573d = r0l0.m22573d(this);
            int iM9527N = m9527N(i, (getHeight() - getPaddingTop()) - getPaddingBottom());
            int i2 = iM22573d + iM9527N;
            if (this.f6482i) {
                int iMax = Math.max(-1, Math.min(1, iM9527N));
                i2 = iMax == 0 ? iM22573d : this.f6494u + iMax;
            }
            int iMin = Math.min(Math.max(i2, 0), getItemCount() - 1);
            if (iMin == iM22573d && (!this.f6482i || this.f6494u == iM22573d)) {
                View viewM22572c = r0l0.m22572c(this);
                if (NullChecker.a(viewM22572c)) {
                    if (this.f6478e <= viewM22572c.getHeight() * this.f6475b || iMin == 0) {
                        if (this.f6478e < viewM22572c.getHeight() * (-this.f6475b) && iMin != getItemCount() - 1) {
                            if (this.f6496w) {
                                iMin--;
                            } else {
                                iMin++;
                            }
                        }
                    } else if (this.f6496w) {
                        iMin++;
                    } else {
                        iMin--;
                    }
                }
            }
            smoothScrollToPosition(m9530Q(iMin, getItemCount()));
        }
    }

    @NonNull
    /* JADX INFO: renamed from: M */
    public pjc0 m9526M(RecyclerView.Adapter adapter) {
        return adapter instanceof pjc0 ? (pjc0) adapter : new pjc0(this, adapter);
    }

    /* JADX INFO: renamed from: N */
    public final int m9527N(int i, int i2) {
        if (i == 0) {
            return 0;
        }
        int i3 = i > 0 ? 1 : -1;
        return (int) (((double) i3) * Math.ceil((((i * i3) * this.f6476c) / i2) - this.f6475b));
    }

    /* JADX INFO: renamed from: O */
    public final void m9528O(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e9c0.f11017z1, i, 0);
        this.f6476c = typedArrayObtainStyledAttributes.getFloat(e9c0.f10868A1, 0.15f);
        this.f6475b = typedArrayObtainStyledAttributes.getFloat(e9c0.f10880E1, 0.25f);
        this.f6482i = typedArrayObtainStyledAttributes.getBoolean(e9c0.f10877D1, this.f6482i);
        this.f6483j = typedArrayObtainStyledAttributes.getBoolean(e9c0.f10871B1, false);
        this.f6477d = typedArrayObtainStyledAttributes.getFloat(e9c0.f10874C1, 25.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: P */
    public final boolean m9529P() {
        return lji0.a(Locale.getDefault()) == 0;
    }

    /* JADX INFO: renamed from: Q */
    public final int m9530Q(int i, int i2) {
        if (i < 0) {
            return 0;
        }
        return i >= i2 ? i2 - 1 : i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && NullChecker.a(getLayoutManager())) {
            this.f6494u = getLayoutManager().canScrollHorizontally() ? r0l0.m22571b(this) : r0l0.m22573d(this);
            this.f6497x = motionEvent.getRawY();
        }
        return super/*android.view.View*/.dispatchTouchEvent(motionEvent);
    }

    public boolean fling(int i, int i2) {
        float f = this.f6476c;
        boolean zFling = super.fling((int) (i * f), (int) (i2 * f));
        if (zFling) {
            if (getLayoutManager().canScrollHorizontally()) {
                m9524K(i);
                return zFling;
            }
            m9525L(i2);
        }
        return zFling;
    }

    public RecyclerView.Adapter getAdapter() {
        if (NullChecker.a(this.f6474a)) {
            return this.f6474a.f19160b;
        }
        return null;
    }

    public int getCurrentPosition() {
        int iM22571b = getLayoutManager().canScrollHorizontally() ? r0l0.m22571b(this) : r0l0.m22573d(this);
        return iM22571b < 0 ? this.f6480g : iM22571b;
    }

    public float getFlingFactor() {
        return this.f6476c;
    }

    public float getTriggerOffset() {
        return this.f6475b;
    }

    public pjc0 getWrapperAdapter() {
        return this.f6474a;
    }

    public float getlLastY() {
        return this.f6497x;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f6483j) {
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            if (this.f6485l == null) {
                this.f6485l = new PointF();
            }
            int action = motionEvent.getAction() & 255;
            if (action == 0) {
                this.f6485l.set(rawX, rawY);
            } else if (action == 2) {
                float fSqrt = (float) Math.sqrt((rawX * rawX) + (rawY * rawY));
                PointF pointF = this.f6485l;
                float f = pointF.x;
                float f2 = pointF.y;
                if (Math.abs(((float) Math.sqrt((f * f) + (f2 * f2))) - fSqrt) > this.f6484k) {
                    PointF pointF2 = this.f6485l;
                    float fAbs = Math.abs((pointF2.y - rawY) / (pointF2.x - rawX));
                    if (Math.abs(this.f6485l.y - rawY) < 1.0f) {
                        return getLayoutManager().canScrollHorizontally();
                    }
                    if (Math.abs(this.f6485l.x - rawX) < 1.0f) {
                        return !getLayoutManager().canScrollHorizontally();
                    }
                    return ((double) fAbs) < Math.tan(Math.toRadians(30.0d));
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        try {
            Field declaredField = parcelable.getClass().getDeclaredField("mLayoutState");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(parcelable);
            Field declaredField2 = obj.getClass().getDeclaredField("mAnchorOffset");
            Field declaredField3 = obj.getClass().getDeclaredField("mAnchorPosition");
            declaredField3.setAccessible(true);
            declaredField2.setAccessible(true);
            if (declaredField2.getInt(obj) > 0) {
                declaredField3.set(obj, Integer.valueOf(declaredField3.getInt(obj) - 1));
            } else if (declaredField2.getInt(obj) < 0) {
                declaredField3.set(obj, Integer.valueOf(declaredField3.getInt(obj) + 1));
            }
            declaredField2.setInt(obj, 0);
        } catch (Throwable th) {
            CrashHelper.c(th);
        }
        super.onRestoreInstanceState(parcelable);
    }

    /* JADX WARN: Code duplicated, block: B:65:0x012c  */
    /* JADX WARN: Code duplicated, block: B:66:0x012f  */
    public void onScrollStateChanged(int i) {
        super.onScrollStateChanged(i);
        if (i == 1) {
            this.f6486m = true;
            View viewM22570a = getLayoutManager().canScrollHorizontally() ? r0l0.m22570a(this) : r0l0.m22572c(this);
            this.f6489p = viewM22570a;
            if (NullChecker.a(viewM22570a)) {
                if (this.f6495v) {
                    this.f6481h = getChildLayoutPosition(this.f6489p);
                    this.f6495v = false;
                }
                this.f6487n = this.f6489p.getLeft();
                this.f6488o = this.f6489p.getTop();
            } else {
                this.f6481h = -1;
            }
            this.f6478e = 0.0f;
            return;
        }
        if (i == 2) {
            this.f6486m = false;
            if (NullChecker.a(this.f6489p)) {
                boolean zCanScrollHorizontally = getLayoutManager().canScrollHorizontally();
                View view = this.f6489p;
                if (zCanScrollHorizontally) {
                    this.f6478e = view.getLeft() - this.f6487n;
                } else {
                    this.f6478e = view.getTop() - this.f6488o;
                }
            } else {
                this.f6478e = 0.0f;
            }
            this.f6489p = null;
            return;
        }
        if (i == 0) {
            if (this.f6486m) {
                int iM22571b = getLayoutManager().canScrollHorizontally() ? r0l0.m22571b(this) : r0l0.m22573d(this);
                if (NullChecker.a(this.f6489p)) {
                    iM22571b = getChildAdapterPosition(this.f6489p);
                    if (getLayoutManager().canScrollHorizontally()) {
                        boolean zM9529P = m9529P();
                        float left = this.f6489p.getLeft() - this.f6487n;
                        if (left <= this.f6489p.getWidth() * this.f6475b || this.f6489p.getLeft() < this.f6490q) {
                            if (left < this.f6489p.getWidth() * (-this.f6475b) && this.f6489p.getLeft() <= this.f6491r) {
                                if (this.f6496w) {
                                    iM22571b++;
                                } else {
                                    iM22571b++;
                                }
                            }
                        } else if (this.f6496w ? !zM9529P : zM9529P) {
                            iM22571b--;
                        } else {
                            iM22571b++;
                        }
                    } else {
                        float top = this.f6489p.getTop() - this.f6488o;
                        if (top <= this.f6489p.getHeight() * this.f6475b || this.f6489p.getTop() < this.f6492s) {
                            if (top < this.f6489p.getHeight() * (-this.f6475b) && this.f6489p.getTop() <= this.f6493t) {
                                if (this.f6496w) {
                                    iM22571b--;
                                } else {
                                    iM22571b++;
                                }
                            }
                        } else if (this.f6496w) {
                            iM22571b++;
                        } else {
                            iM22571b--;
                        }
                    }
                }
                smoothScrollToPosition(m9530Q(iM22571b, getItemCount()));
                this.f6489p = null;
            } else {
                int i2 = this.f6480g;
                if (i2 != this.f6481h) {
                    this.f6481h = i2;
                }
            }
            this.f6490q = Integer.MIN_VALUE;
            this.f6491r = Integer.MAX_VALUE;
            this.f6492s = Integer.MIN_VALUE;
            this.f6493t = Integer.MAX_VALUE;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 2 && NullChecker.a(this.f6489p)) {
            this.f6490q = Math.max(this.f6489p.getLeft(), this.f6490q);
            this.f6492s = Math.max(this.f6489p.getTop(), this.f6492s);
            this.f6491r = Math.min(this.f6489p.getLeft(), this.f6491r);
            this.f6493t = Math.min(this.f6489p.getTop(), this.f6493t);
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void scrollToPosition(int i) {
        this.f6481h = getCurrentPosition();
        this.f6480g = i;
        super.scrollToPosition(i);
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0360b());
    }

    public void setAdapter(RecyclerView.Adapter adapter) {
        pjc0<?> pjc0VarM9526M = m9526M(adapter);
        this.f6474a = pjc0VarM9526M;
        super.setAdapter(pjc0VarM9526M);
    }

    public void setFlingFactor(float f) {
        this.f6476c = f;
    }

    public void setInertia(boolean z) {
        this.f6483j = z;
    }

    public void setLayoutManager(RecyclerView.o oVar) {
        super.setLayoutManager(oVar);
        if (oVar instanceof LinearLayoutManager) {
            this.f6496w = ((LinearLayoutManager) oVar).getReverseLayout();
        }
    }

    public void setSinglePageFling(boolean z) {
        this.f6482i = z;
    }

    public void setTriggerOffset(float f) {
        this.f6475b = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void smoothScrollToPosition(int i) {
        if (this.f6481h < 0) {
            this.f6481h = getCurrentPosition();
        }
        this.f6480g = i;
        if (!NullChecker.a(getLayoutManager()) || !(getLayoutManager() instanceof LinearLayoutManager)) {
            super.smoothScrollToPosition(i);
            return;
        }
        C0359a c0359a = new C0359a(getContext());
        c0359a.setTargetPosition(i);
        if (i == -1) {
            return;
        }
        getLayoutManager().startSmoothScroll(c0359a);
    }

    public void swapAdapter(RecyclerView.Adapter adapter, boolean z) {
        pjc0<?> pjc0VarM9526M = m9526M(adapter);
        this.f6474a = pjc0VarM9526M;
        super.swapAdapter(pjc0VarM9526M, z);
    }

    public RecyclerViewPager(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RecyclerViewPager(Context context) {
        this(context, null);
    }
}
