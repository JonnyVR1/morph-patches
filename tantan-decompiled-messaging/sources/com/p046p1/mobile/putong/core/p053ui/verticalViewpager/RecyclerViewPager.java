package com.p046p1.mobile.putong.core.p053ui.verticalViewpager;

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
import androidx.recyclerview.widget.C0608n;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Locale;
import p149l.e9c0;
import p149l.lji0;
import p149l.pjc0;
import p149l.r0l0;

/* JADX INFO: loaded from: classes9.dex */
public class RecyclerViewPager extends RecyclerView {

    /* JADX INFO: renamed from: a */
    public pjc0<?> f36693a;

    /* JADX INFO: renamed from: b */
    public float f36694b;

    /* JADX INFO: renamed from: c */
    public float f36695c;

    /* JADX INFO: renamed from: d */
    public float f36696d;

    /* JADX INFO: renamed from: e */
    public float f36697e;

    /* JADX INFO: renamed from: f */
    public List<InterfaceC8925c> f36698f;

    /* JADX INFO: renamed from: g */
    public int f36699g;

    /* JADX INFO: renamed from: h */
    public int f36700h;

    /* JADX INFO: renamed from: i */
    public boolean f36701i;

    /* JADX INFO: renamed from: j */
    public boolean f36702j;

    /* JADX INFO: renamed from: k */
    public float f36703k;

    /* JADX INFO: renamed from: l */
    public PointF f36704l;

    /* JADX INFO: renamed from: m */
    public boolean f36705m;

    /* JADX INFO: renamed from: n */
    public int f36706n;

    /* JADX INFO: renamed from: o */
    public int f36707o;

    /* JADX INFO: renamed from: p */
    public View f36708p;

    /* JADX INFO: renamed from: q */
    public int f36709q;

    /* JADX INFO: renamed from: r */
    public int f36710r;

    /* JADX INFO: renamed from: s */
    public int f36711s;

    /* JADX INFO: renamed from: t */
    public int f36712t;

    /* JADX INFO: renamed from: u */
    public int f36713u;

    /* JADX INFO: renamed from: v */
    public boolean f36714v;

    /* JADX INFO: renamed from: w */
    public boolean f36715w;

    /* JADX INFO: renamed from: x */
    public float f36716x;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.verticalViewpager.RecyclerViewPager$a */
    public class C8923a extends C0608n {
        public C8923a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C0608n
        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return RecyclerViewPager.this.f36696d / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0587y
        public PointF computeScrollVectorForPosition(int i) {
            if (getLayoutManager() == null) {
                return null;
            }
            return ((LinearLayoutManager) getLayoutManager()).computeScrollVectorForPosition(i);
        }

        @Override // androidx.recyclerview.widget.C0608n, androidx.recyclerview.widget.RecyclerView.AbstractC0587y
        public void onStop() {
            super.onStop();
            if (NullChecker.m81303a(RecyclerViewPager.this.f36698f)) {
                for (InterfaceC8925c interfaceC8925c : RecyclerViewPager.this.f36698f) {
                    if (NullChecker.m81303a(interfaceC8925c)) {
                        interfaceC8925c.m56106a(RecyclerViewPager.this.f36700h, RecyclerViewPager.this.f36699g);
                    }
                }
            }
            RecyclerViewPager.this.f36714v = true;
        }

        @Override // androidx.recyclerview.widget.C0608n, androidx.recyclerview.widget.RecyclerView.AbstractC0587y
        public void onTargetFound(View view, RecyclerView.C0588z c0588z, RecyclerView.AbstractC0587y.a aVar) {
            if (getLayoutManager() == null) {
                return;
            }
            int iCalculateDxToMakeVisible = calculateDxToMakeVisible(view, getHorizontalSnapPreference());
            int iCalculateDyToMakeVisible = calculateDyToMakeVisible(view, getVerticalSnapPreference());
            int leftDecorationWidth = iCalculateDxToMakeVisible > 0 ? iCalculateDxToMakeVisible - getLayoutManager().getLeftDecorationWidth(view) : iCalculateDxToMakeVisible + getLayoutManager().getRightDecorationWidth(view);
            int topDecorationHeight = iCalculateDyToMakeVisible > 0 ? iCalculateDyToMakeVisible - getLayoutManager().getTopDecorationHeight(view) : iCalculateDyToMakeVisible + getLayoutManager().getBottomDecorationHeight(view);
            int iCalculateTimeForDeceleration = calculateTimeForDeceleration((int) Math.sqrt((leftDecorationWidth * leftDecorationWidth) + (topDecorationHeight * topDecorationHeight)));
            if (iCalculateTimeForDeceleration > 0) {
                aVar.m3483d(-leftDecorationWidth, -topDecorationHeight, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.verticalViewpager.RecyclerViewPager$b */
    public class ViewTreeObserverOnGlobalLayoutListenerC8924b implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC8924b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            RecyclerViewPager.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            if (RecyclerViewPager.this.f36699g < 0 || RecyclerViewPager.this.f36699g >= RecyclerViewPager.this.getItemCount() || !NullChecker.m81303a(RecyclerViewPager.this.f36698f)) {
                return;
            }
            for (InterfaceC8925c interfaceC8925c : RecyclerViewPager.this.f36698f) {
                if (NullChecker.m81303a(interfaceC8925c)) {
                    interfaceC8925c.m56106a(RecyclerViewPager.this.f36700h, RecyclerViewPager.this.getCurrentPosition());
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.verticalViewpager.RecyclerViewPager$c */
    public interface InterfaceC8925c {
        /* JADX INFO: renamed from: a */
        void m56106a(int i, int i2);
    }

    public RecyclerViewPager(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f36694b = 0.25f;
        this.f36695c = 0.15f;
        this.f36696d = 25.0f;
        this.f36699g = -1;
        this.f36700h = -1;
        this.f36709q = Integer.MIN_VALUE;
        this.f36710r = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f36711s = Integer.MIN_VALUE;
        this.f36712t = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f36713u = -1;
        this.f36714v = true;
        this.f36715w = false;
        m56103O(context, attributeSet, i);
        setNestedScrollingEnabled(false);
        this.f36703k = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getItemCount() {
        pjc0<?> pjc0Var = this.f36693a;
        if (pjc0Var == null) {
            return 0;
        }
        return pjc0Var.getItemCount();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0078  */
    /* JADX WARN: Code duplicated, block: B:30:0x007b  */
    /* JADX INFO: renamed from: K */
    public void m56099K(int i) {
        if (this.f36715w) {
            i *= -1;
        }
        if (!m56104P()) {
            i *= -1;
        }
        if (getChildCount() > 0) {
            int iM177401b = r0l0.m177401b(this);
            int iM56102N = m56102N(i, (getWidth() - getPaddingLeft()) - getPaddingRight());
            int i2 = iM177401b + iM56102N;
            if (this.f36701i) {
                int iMax = Math.max(-1, Math.min(1, iM56102N));
                i2 = iMax == 0 ? iM177401b : this.f36713u + iMax;
            }
            int iMin = Math.min(Math.max(i2, 0), getItemCount() - 1);
            if (iMin == iM177401b && (!this.f36701i || this.f36713u == iM177401b)) {
                View viewM177400a = r0l0.m177400a(this);
                if (NullChecker.m81303a(viewM177400a)) {
                    float f = this.f36697e;
                    float width = viewM177400a.getWidth();
                    float f2 = this.f36694b;
                    if (f <= width * f2 * f2 || iMin == 0) {
                        if (this.f36697e < viewM177400a.getWidth() * (-this.f36694b) && iMin != getItemCount() - 1) {
                            if (this.f36715w) {
                                iMin--;
                            } else {
                                iMin++;
                            }
                        }
                    } else if (this.f36715w) {
                        iMin++;
                    } else {
                        iMin--;
                    }
                }
            }
            smoothScrollToPosition(m56105Q(iMin, getItemCount()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0072  */
    /* JADX INFO: renamed from: L */
    public void m56100L(int i) {
        if (this.f36715w) {
            i *= -1;
        }
        if (getChildCount() > 0) {
            int iM177403d = r0l0.m177403d(this);
            int iM56102N = m56102N(i, (getHeight() - getPaddingTop()) - getPaddingBottom());
            int i2 = iM177403d + iM56102N;
            if (this.f36701i) {
                int iMax = Math.max(-1, Math.min(1, iM56102N));
                i2 = iMax == 0 ? iM177403d : this.f36713u + iMax;
            }
            int iMin = Math.min(Math.max(i2, 0), getItemCount() - 1);
            if (iMin == iM177403d && (!this.f36701i || this.f36713u == iM177403d)) {
                View viewM177402c = r0l0.m177402c(this);
                if (NullChecker.m81303a(viewM177402c)) {
                    if (this.f36697e <= viewM177402c.getHeight() * this.f36694b || iMin == 0) {
                        if (this.f36697e < viewM177402c.getHeight() * (-this.f36694b) && iMin != getItemCount() - 1) {
                            if (this.f36715w) {
                                iMin--;
                            } else {
                                iMin++;
                            }
                        }
                    } else if (this.f36715w) {
                        iMin++;
                    } else {
                        iMin--;
                    }
                }
            }
            smoothScrollToPosition(m56105Q(iMin, getItemCount()));
        }
    }

    @NonNull
    /* JADX INFO: renamed from: M */
    public pjc0 m56101M(RecyclerView.Adapter adapter) {
        return adapter instanceof pjc0 ? (pjc0) adapter : new pjc0(this, adapter);
    }

    /* JADX INFO: renamed from: N */
    public final int m56102N(int i, int i2) {
        if (i == 0) {
            return 0;
        }
        int i3 = i > 0 ? 1 : -1;
        return (int) (((double) i3) * Math.ceil((((i * i3) * this.f36695c) / i2) - this.f36694b));
    }

    /* JADX INFO: renamed from: O */
    public final void m56103O(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e9c0.f90090z1, i, 0);
        this.f36695c = typedArrayObtainStyledAttributes.getFloat(e9c0.f89941A1, 0.15f);
        this.f36694b = typedArrayObtainStyledAttributes.getFloat(e9c0.f89953E1, 0.25f);
        this.f36701i = typedArrayObtainStyledAttributes.getBoolean(e9c0.f89950D1, this.f36701i);
        this.f36702j = typedArrayObtainStyledAttributes.getBoolean(e9c0.f89944B1, false);
        this.f36696d = typedArrayObtainStyledAttributes.getFloat(e9c0.f89947C1, 25.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: P */
    public final boolean m56104P() {
        return lji0.m149981a(Locale.getDefault()) == 0;
    }

    /* JADX INFO: renamed from: Q */
    public final int m56105Q(int i, int i2) {
        if (i < 0) {
            return 0;
        }
        return i >= i2 ? i2 - 1 : i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && NullChecker.m81303a(getLayoutManager())) {
            this.f36713u = getLayoutManager().canScrollHorizontally() ? r0l0.m177401b(this) : r0l0.m177403d(this);
            this.f36716x = motionEvent.getRawY();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean fling(int i, int i2) {
        float f = this.f36695c;
        boolean zFling = super.fling((int) (i * f), (int) (i2 * f));
        if (zFling) {
            if (getLayoutManager().canScrollHorizontally()) {
                m56099K(i);
                return zFling;
            }
            m56100L(i2);
        }
        return zFling;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public RecyclerView.Adapter getAdapter() {
        if (NullChecker.m81303a(this.f36693a)) {
            return this.f36693a.f149768b;
        }
        return null;
    }

    public int getCurrentPosition() {
        int iM177401b = getLayoutManager().canScrollHorizontally() ? r0l0.m177401b(this) : r0l0.m177403d(this);
        return iM177401b < 0 ? this.f36699g : iM177401b;
    }

    public float getFlingFactor() {
        return this.f36695c;
    }

    public float getTriggerOffset() {
        return this.f36694b;
    }

    public pjc0 getWrapperAdapter() {
        return this.f36693a;
    }

    public float getlLastY() {
        return this.f36716x;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f36702j) {
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            if (this.f36704l == null) {
                this.f36704l = new PointF();
            }
            int action = motionEvent.getAction() & 255;
            if (action == 0) {
                this.f36704l.set(rawX, rawY);
            } else if (action == 2) {
                float fSqrt = (float) Math.sqrt((rawX * rawX) + (rawY * rawY));
                PointF pointF = this.f36704l;
                float f = pointF.x;
                float f2 = pointF.y;
                if (Math.abs(((float) Math.sqrt((f * f) + (f2 * f2))) - fSqrt) > this.f36703k) {
                    PointF pointF2 = this.f36704l;
                    float fAbs = Math.abs((pointF2.y - rawY) / (pointF2.x - rawX));
                    if (Math.abs(this.f36704l.y - rawY) < 1.0f) {
                        return getLayoutManager().canScrollHorizontally();
                    }
                    if (Math.abs(this.f36704l.x - rawX) < 1.0f) {
                        return !getLayoutManager().canScrollHorizontally();
                    }
                    return ((double) fAbs) < Math.tan(Math.toRadians(30.0d));
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
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
            CrashHelper.m81296c(th);
        }
        super.onRestoreInstanceState(parcelable);
    }

    /* JADX WARN: Code duplicated, block: B:65:0x012c  */
    /* JADX WARN: Code duplicated, block: B:66:0x012f  */
    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrollStateChanged(int i) {
        super.onScrollStateChanged(i);
        if (i == 1) {
            this.f36705m = true;
            View viewM177400a = getLayoutManager().canScrollHorizontally() ? r0l0.m177400a(this) : r0l0.m177402c(this);
            this.f36708p = viewM177400a;
            if (NullChecker.m81303a(viewM177400a)) {
                if (this.f36714v) {
                    this.f36700h = getChildLayoutPosition(this.f36708p);
                    this.f36714v = false;
                }
                this.f36706n = this.f36708p.getLeft();
                this.f36707o = this.f36708p.getTop();
            } else {
                this.f36700h = -1;
            }
            this.f36697e = 0.0f;
            return;
        }
        if (i == 2) {
            this.f36705m = false;
            if (NullChecker.m81303a(this.f36708p)) {
                boolean zCanScrollHorizontally = getLayoutManager().canScrollHorizontally();
                View view = this.f36708p;
                if (zCanScrollHorizontally) {
                    this.f36697e = view.getLeft() - this.f36706n;
                } else {
                    this.f36697e = view.getTop() - this.f36707o;
                }
            } else {
                this.f36697e = 0.0f;
            }
            this.f36708p = null;
            return;
        }
        if (i == 0) {
            if (this.f36705m) {
                int iM177401b = getLayoutManager().canScrollHorizontally() ? r0l0.m177401b(this) : r0l0.m177403d(this);
                if (NullChecker.m81303a(this.f36708p)) {
                    iM177401b = getChildAdapterPosition(this.f36708p);
                    if (getLayoutManager().canScrollHorizontally()) {
                        boolean zM56104P = m56104P();
                        float left = this.f36708p.getLeft() - this.f36706n;
                        if (left <= this.f36708p.getWidth() * this.f36694b || this.f36708p.getLeft() < this.f36709q) {
                            if (left < this.f36708p.getWidth() * (-this.f36694b) && this.f36708p.getLeft() <= this.f36710r) {
                                if (this.f36715w) {
                                    iM177401b++;
                                } else {
                                    iM177401b++;
                                }
                            }
                        } else if (this.f36715w ? !zM56104P : zM56104P) {
                            iM177401b--;
                        } else {
                            iM177401b++;
                        }
                    } else {
                        float top = this.f36708p.getTop() - this.f36707o;
                        if (top <= this.f36708p.getHeight() * this.f36694b || this.f36708p.getTop() < this.f36711s) {
                            if (top < this.f36708p.getHeight() * (-this.f36694b) && this.f36708p.getTop() <= this.f36712t) {
                                if (this.f36715w) {
                                    iM177401b--;
                                } else {
                                    iM177401b++;
                                }
                            }
                        } else if (this.f36715w) {
                            iM177401b++;
                        } else {
                            iM177401b--;
                        }
                    }
                }
                smoothScrollToPosition(m56105Q(iM177401b, getItemCount()));
                this.f36708p = null;
            } else {
                int i2 = this.f36699g;
                if (i2 != this.f36700h) {
                    this.f36700h = i2;
                }
            }
            this.f36709q = Integer.MIN_VALUE;
            this.f36710r = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f36711s = Integer.MIN_VALUE;
            this.f36712t = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 2 && NullChecker.m81303a(this.f36708p)) {
            this.f36709q = Math.max(this.f36708p.getLeft(), this.f36709q);
            this.f36711s = Math.max(this.f36708p.getTop(), this.f36711s);
            this.f36710r = Math.min(this.f36708p.getLeft(), this.f36710r);
            this.f36712t = Math.min(this.f36708p.getTop(), this.f36712t);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void scrollToPosition(int i) {
        this.f36700h = getCurrentPosition();
        this.f36699g = i;
        super.scrollToPosition(i);
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC8924b());
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.Adapter adapter) {
        pjc0<?> pjc0VarM56101M = m56101M(adapter);
        this.f36693a = pjc0VarM56101M;
        super.setAdapter(pjc0VarM56101M);
    }

    public void setFlingFactor(float f) {
        this.f36695c = f;
    }

    public void setInertia(boolean z) {
        this.f36702j = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setLayoutManager(RecyclerView.AbstractC0577o abstractC0577o) {
        super.setLayoutManager(abstractC0577o);
        if (abstractC0577o instanceof LinearLayoutManager) {
            this.f36715w = ((LinearLayoutManager) abstractC0577o).getReverseLayout();
        }
    }

    public void setSinglePageFling(boolean z) {
        this.f36701i = z;
    }

    public void setTriggerOffset(float f) {
        this.f36694b = f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void smoothScrollToPosition(int i) {
        if (this.f36700h < 0) {
            this.f36700h = getCurrentPosition();
        }
        this.f36699g = i;
        if (!NullChecker.m81303a(getLayoutManager()) || !(getLayoutManager() instanceof LinearLayoutManager)) {
            super.smoothScrollToPosition(i);
            return;
        }
        C8923a c8923a = new C8923a(getContext());
        c8923a.setTargetPosition(i);
        if (i == -1) {
            return;
        }
        getLayoutManager().startSmoothScroll(c8923a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void swapAdapter(RecyclerView.Adapter adapter, boolean z) {
        pjc0<?> pjc0VarM56101M = m56101M(adapter);
        this.f36693a = pjc0VarM56101M;
        super.swapAdapter(pjc0VarM56101M, z);
    }

    public RecyclerViewPager(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RecyclerViewPager(Context context) {
        this(context, null);
    }
}
