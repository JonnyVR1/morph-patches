package com.p051p1.mobile.putong.core.p058ui.verticalViewpager;

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
import androidx.recyclerview.widget.C0610n;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Locale;
import p153l.khc0;
import p153l.lsi0;
import p153l.w9l0;
import p153l.wrc0;

/* JADX INFO: loaded from: classes12.dex */
public class RecyclerViewPager extends RecyclerView {

    /* JADX INFO: renamed from: a */
    public wrc0<?> f37541a;

    /* JADX INFO: renamed from: b */
    public float f37542b;

    /* JADX INFO: renamed from: c */
    public float f37543c;

    /* JADX INFO: renamed from: d */
    public float f37544d;

    /* JADX INFO: renamed from: e */
    public float f37545e;

    /* JADX INFO: renamed from: f */
    public List<InterfaceC9088c> f37546f;

    /* JADX INFO: renamed from: g */
    public int f37547g;

    /* JADX INFO: renamed from: h */
    public int f37548h;

    /* JADX INFO: renamed from: i */
    public boolean f37549i;

    /* JADX INFO: renamed from: j */
    public boolean f37550j;

    /* JADX INFO: renamed from: k */
    public float f37551k;

    /* JADX INFO: renamed from: l */
    public PointF f37552l;

    /* JADX INFO: renamed from: m */
    public boolean f37553m;

    /* JADX INFO: renamed from: n */
    public int f37554n;

    /* JADX INFO: renamed from: o */
    public int f37555o;

    /* JADX INFO: renamed from: p */
    public View f37556p;

    /* JADX INFO: renamed from: q */
    public int f37557q;

    /* JADX INFO: renamed from: r */
    public int f37558r;

    /* JADX INFO: renamed from: s */
    public int f37559s;

    /* JADX INFO: renamed from: t */
    public int f37560t;

    /* JADX INFO: renamed from: u */
    public int f37561u;

    /* JADX INFO: renamed from: v */
    public boolean f37562v;

    /* JADX INFO: renamed from: w */
    public boolean f37563w;

    /* JADX INFO: renamed from: x */
    public float f37564x;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.verticalViewpager.RecyclerViewPager$a */
    public class C9086a extends C0610n {
        public C9086a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C0610n
        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return RecyclerViewPager.this.f37544d / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0590z
        public PointF computeScrollVectorForPosition(int i) {
            if (getLayoutManager() == null) {
                return null;
            }
            return ((LinearLayoutManager) getLayoutManager()).computeScrollVectorForPosition(i);
        }

        @Override // androidx.recyclerview.widget.C0610n, androidx.recyclerview.widget.RecyclerView.AbstractC0590z
        public void onStop() {
            super.onStop();
            if (NullChecker.m82486a(RecyclerViewPager.this.f37546f)) {
                for (InterfaceC9088c interfaceC9088c : RecyclerViewPager.this.f37546f) {
                    if (NullChecker.m82486a(interfaceC9088c)) {
                        interfaceC9088c.m57289a(RecyclerViewPager.this.f37548h, RecyclerViewPager.this.f37547g);
                    }
                }
            }
            RecyclerViewPager.this.f37562v = true;
        }

        @Override // androidx.recyclerview.widget.C0610n, androidx.recyclerview.widget.RecyclerView.AbstractC0590z
        public void onTargetFound(View view, RecyclerView.C0561a0 c0561a0, RecyclerView.AbstractC0590z.a aVar) {
            if (getLayoutManager() == null) {
                return;
            }
            int iCalculateDxToMakeVisible = calculateDxToMakeVisible(view, getHorizontalSnapPreference());
            int iCalculateDyToMakeVisible = calculateDyToMakeVisible(view, getVerticalSnapPreference());
            int leftDecorationWidth = iCalculateDxToMakeVisible > 0 ? iCalculateDxToMakeVisible - getLayoutManager().getLeftDecorationWidth(view) : iCalculateDxToMakeVisible + getLayoutManager().getRightDecorationWidth(view);
            int topDecorationHeight = iCalculateDyToMakeVisible > 0 ? iCalculateDyToMakeVisible - getLayoutManager().getTopDecorationHeight(view) : iCalculateDyToMakeVisible + getLayoutManager().getBottomDecorationHeight(view);
            int iCalculateTimeForDeceleration = calculateTimeForDeceleration((int) Math.sqrt((leftDecorationWidth * leftDecorationWidth) + (topDecorationHeight * topDecorationHeight)));
            if (iCalculateTimeForDeceleration > 0) {
                aVar.m3492d(-leftDecorationWidth, -topDecorationHeight, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.verticalViewpager.RecyclerViewPager$b */
    public class ViewTreeObserverOnGlobalLayoutListenerC9087b implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC9087b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            RecyclerViewPager.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            if (RecyclerViewPager.this.f37547g < 0 || RecyclerViewPager.this.f37547g >= RecyclerViewPager.this.getItemCount() || !NullChecker.m82486a(RecyclerViewPager.this.f37546f)) {
                return;
            }
            for (InterfaceC9088c interfaceC9088c : RecyclerViewPager.this.f37546f) {
                if (NullChecker.m82486a(interfaceC9088c)) {
                    interfaceC9088c.m57289a(RecyclerViewPager.this.f37548h, RecyclerViewPager.this.getCurrentPosition());
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.verticalViewpager.RecyclerViewPager$c */
    public interface InterfaceC9088c {
        /* JADX INFO: renamed from: a */
        void m57289a(int i, int i2);
    }

    public RecyclerViewPager(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37542b = 0.25f;
        this.f37543c = 0.15f;
        this.f37544d = 25.0f;
        this.f37547g = -1;
        this.f37548h = -1;
        this.f37557q = Integer.MIN_VALUE;
        this.f37558r = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f37559s = Integer.MIN_VALUE;
        this.f37560t = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f37561u = -1;
        this.f37562v = true;
        this.f37563w = false;
        m57286O(context, attributeSet, i);
        setNestedScrollingEnabled(false);
        this.f37551k = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getItemCount() {
        wrc0<?> wrc0Var = this.f37541a;
        if (wrc0Var == null) {
            return 0;
        }
        return wrc0Var.getItemCount();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0078  */
    /* JADX WARN: Code duplicated, block: B:30:0x007b  */
    /* JADX INFO: renamed from: K */
    public void m57282K(int i) {
        if (this.f37563w) {
            i *= -1;
        }
        if (!m57287P()) {
            i *= -1;
        }
        if (getChildCount() > 0) {
            int iM205598b = w9l0.m205598b(this);
            int iM57285N = m57285N(i, (getWidth() - getPaddingLeft()) - getPaddingRight());
            int i2 = iM205598b + iM57285N;
            if (this.f37549i) {
                int iMax = Math.max(-1, Math.min(1, iM57285N));
                i2 = iMax == 0 ? iM205598b : this.f37561u + iMax;
            }
            int iMin = Math.min(Math.max(i2, 0), getItemCount() - 1);
            if (iMin == iM205598b && (!this.f37549i || this.f37561u == iM205598b)) {
                View viewM205597a = w9l0.m205597a(this);
                if (NullChecker.m82486a(viewM205597a)) {
                    float f = this.f37545e;
                    float width = viewM205597a.getWidth();
                    float f2 = this.f37542b;
                    if (f <= width * f2 * f2 || iMin == 0) {
                        if (this.f37545e < viewM205597a.getWidth() * (-this.f37542b) && iMin != getItemCount() - 1) {
                            if (this.f37563w) {
                                iMin--;
                            } else {
                                iMin++;
                            }
                        }
                    } else if (this.f37563w) {
                        iMin++;
                    } else {
                        iMin--;
                    }
                }
            }
            smoothScrollToPosition(m57288Q(iMin, getItemCount()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0072  */
    /* JADX INFO: renamed from: L */
    public void m57283L(int i) {
        if (this.f37563w) {
            i *= -1;
        }
        if (getChildCount() > 0) {
            int iM205600d = w9l0.m205600d(this);
            int iM57285N = m57285N(i, (getHeight() - getPaddingTop()) - getPaddingBottom());
            int i2 = iM205600d + iM57285N;
            if (this.f37549i) {
                int iMax = Math.max(-1, Math.min(1, iM57285N));
                i2 = iMax == 0 ? iM205600d : this.f37561u + iMax;
            }
            int iMin = Math.min(Math.max(i2, 0), getItemCount() - 1);
            if (iMin == iM205600d && (!this.f37549i || this.f37561u == iM205600d)) {
                View viewM205599c = w9l0.m205599c(this);
                if (NullChecker.m82486a(viewM205599c)) {
                    if (this.f37545e <= viewM205599c.getHeight() * this.f37542b || iMin == 0) {
                        if (this.f37545e < viewM205599c.getHeight() * (-this.f37542b) && iMin != getItemCount() - 1) {
                            if (this.f37563w) {
                                iMin--;
                            } else {
                                iMin++;
                            }
                        }
                    } else if (this.f37563w) {
                        iMin++;
                    } else {
                        iMin--;
                    }
                }
            }
            smoothScrollToPosition(m57288Q(iMin, getItemCount()));
        }
    }

    @NonNull
    /* JADX INFO: renamed from: M */
    public wrc0 m57284M(RecyclerView.Adapter adapter) {
        return adapter instanceof wrc0 ? (wrc0) adapter : new wrc0(this, adapter);
    }

    /* JADX INFO: renamed from: N */
    public final int m57285N(int i, int i2) {
        if (i == 0) {
            return 0;
        }
        int i3 = i > 0 ? 1 : -1;
        return (int) (((double) i3) * Math.ceil((((i * i3) * this.f37543c) / i2) - this.f37542b));
    }

    /* JADX INFO: renamed from: O */
    public final void m57286O(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, khc0.f126860z1, i, 0);
        this.f37543c = typedArrayObtainStyledAttributes.getFloat(khc0.f126711A1, 0.15f);
        this.f37542b = typedArrayObtainStyledAttributes.getFloat(khc0.f126723E1, 0.25f);
        this.f37549i = typedArrayObtainStyledAttributes.getBoolean(khc0.f126720D1, this.f37549i);
        this.f37550j = typedArrayObtainStyledAttributes.getBoolean(khc0.f126714B1, false);
        this.f37544d = typedArrayObtainStyledAttributes.getFloat(khc0.f126717C1, 25.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: P */
    public final boolean m57287P() {
        return lsi0.m155697a(Locale.getDefault()) == 0;
    }

    /* JADX INFO: renamed from: Q */
    public final int m57288Q(int i, int i2) {
        if (i < 0) {
            return 0;
        }
        return i >= i2 ? i2 - 1 : i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && NullChecker.m82486a(getLayoutManager())) {
            this.f37561u = getLayoutManager().canScrollHorizontally() ? w9l0.m205598b(this) : w9l0.m205600d(this);
            this.f37564x = motionEvent.getRawY();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean fling(int i, int i2) {
        float f = this.f37543c;
        boolean zFling = super.fling((int) (i * f), (int) (i2 * f));
        if (zFling) {
            if (getLayoutManager().canScrollHorizontally()) {
                m57282K(i);
                return zFling;
            }
            m57283L(i2);
        }
        return zFling;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public RecyclerView.Adapter getAdapter() {
        if (NullChecker.m82486a(this.f37541a)) {
            return this.f37541a.f190501b;
        }
        return null;
    }

    public int getCurrentPosition() {
        int iM205598b = getLayoutManager().canScrollHorizontally() ? w9l0.m205598b(this) : w9l0.m205600d(this);
        return iM205598b < 0 ? this.f37547g : iM205598b;
    }

    public float getFlingFactor() {
        return this.f37543c;
    }

    public float getTriggerOffset() {
        return this.f37542b;
    }

    public wrc0 getWrapperAdapter() {
        return this.f37541a;
    }

    public float getlLastY() {
        return this.f37564x;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f37550j) {
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            if (this.f37552l == null) {
                this.f37552l = new PointF();
            }
            int action = motionEvent.getAction() & 255;
            if (action == 0) {
                this.f37552l.set(rawX, rawY);
            } else if (action == 2) {
                float fSqrt = (float) Math.sqrt((rawX * rawX) + (rawY * rawY));
                PointF pointF = this.f37552l;
                float f = pointF.x;
                float f2 = pointF.y;
                if (Math.abs(((float) Math.sqrt((f * f) + (f2 * f2))) - fSqrt) > this.f37551k) {
                    PointF pointF2 = this.f37552l;
                    float fAbs = Math.abs((pointF2.y - rawY) / (pointF2.x - rawX));
                    if (Math.abs(this.f37552l.y - rawY) < 1.0f) {
                        return getLayoutManager().canScrollHorizontally();
                    }
                    if (Math.abs(this.f37552l.x - rawX) < 1.0f) {
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
            CrashHelper.m82479c(th);
        }
        super.onRestoreInstanceState(parcelable);
    }

    /* JADX WARN: Code duplicated, block: B:65:0x012c  */
    /* JADX WARN: Code duplicated, block: B:66:0x012f  */
    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrollStateChanged(int i) {
        super.onScrollStateChanged(i);
        if (i == 1) {
            this.f37553m = true;
            View viewM205597a = getLayoutManager().canScrollHorizontally() ? w9l0.m205597a(this) : w9l0.m205599c(this);
            this.f37556p = viewM205597a;
            if (NullChecker.m82486a(viewM205597a)) {
                if (this.f37562v) {
                    this.f37548h = getChildLayoutPosition(this.f37556p);
                    this.f37562v = false;
                }
                this.f37554n = this.f37556p.getLeft();
                this.f37555o = this.f37556p.getTop();
            } else {
                this.f37548h = -1;
            }
            this.f37545e = 0.0f;
            return;
        }
        if (i == 2) {
            this.f37553m = false;
            if (NullChecker.m82486a(this.f37556p)) {
                boolean zCanScrollHorizontally = getLayoutManager().canScrollHorizontally();
                View view = this.f37556p;
                if (zCanScrollHorizontally) {
                    this.f37545e = view.getLeft() - this.f37554n;
                } else {
                    this.f37545e = view.getTop() - this.f37555o;
                }
            } else {
                this.f37545e = 0.0f;
            }
            this.f37556p = null;
            return;
        }
        if (i == 0) {
            if (this.f37553m) {
                int iM205598b = getLayoutManager().canScrollHorizontally() ? w9l0.m205598b(this) : w9l0.m205600d(this);
                if (NullChecker.m82486a(this.f37556p)) {
                    iM205598b = getChildAdapterPosition(this.f37556p);
                    if (getLayoutManager().canScrollHorizontally()) {
                        boolean zM57287P = m57287P();
                        float left = this.f37556p.getLeft() - this.f37554n;
                        if (left <= this.f37556p.getWidth() * this.f37542b || this.f37556p.getLeft() < this.f37557q) {
                            if (left < this.f37556p.getWidth() * (-this.f37542b) && this.f37556p.getLeft() <= this.f37558r) {
                                if (this.f37563w) {
                                    iM205598b++;
                                } else {
                                    iM205598b++;
                                }
                            }
                        } else if (this.f37563w ? !zM57287P : zM57287P) {
                            iM205598b--;
                        } else {
                            iM205598b++;
                        }
                    } else {
                        float top = this.f37556p.getTop() - this.f37555o;
                        if (top <= this.f37556p.getHeight() * this.f37542b || this.f37556p.getTop() < this.f37559s) {
                            if (top < this.f37556p.getHeight() * (-this.f37542b) && this.f37556p.getTop() <= this.f37560t) {
                                if (this.f37563w) {
                                    iM205598b--;
                                } else {
                                    iM205598b++;
                                }
                            }
                        } else if (this.f37563w) {
                            iM205598b++;
                        } else {
                            iM205598b--;
                        }
                    }
                }
                smoothScrollToPosition(m57288Q(iM205598b, getItemCount()));
                this.f37556p = null;
            } else {
                int i2 = this.f37547g;
                if (i2 != this.f37548h) {
                    this.f37548h = i2;
                }
            }
            this.f37557q = Integer.MIN_VALUE;
            this.f37558r = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f37559s = Integer.MIN_VALUE;
            this.f37560t = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 2 && NullChecker.m82486a(this.f37556p)) {
            this.f37557q = Math.max(this.f37556p.getLeft(), this.f37557q);
            this.f37559s = Math.max(this.f37556p.getTop(), this.f37559s);
            this.f37558r = Math.min(this.f37556p.getLeft(), this.f37558r);
            this.f37560t = Math.min(this.f37556p.getTop(), this.f37560t);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void scrollToPosition(int i) {
        this.f37548h = getCurrentPosition();
        this.f37547g = i;
        super.scrollToPosition(i);
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC9087b());
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.Adapter adapter) {
        wrc0<?> wrc0VarM57284M = m57284M(adapter);
        this.f37541a = wrc0VarM57284M;
        super.setAdapter(wrc0VarM57284M);
    }

    public void setFlingFactor(float f) {
        this.f37543c = f;
    }

    public void setInertia(boolean z) {
        this.f37550j = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setLayoutManager(RecyclerView.AbstractC0579o abstractC0579o) {
        super.setLayoutManager(abstractC0579o);
        if (abstractC0579o instanceof LinearLayoutManager) {
            this.f37563w = ((LinearLayoutManager) abstractC0579o).getReverseLayout();
        }
    }

    public void setSinglePageFling(boolean z) {
        this.f37549i = z;
    }

    public void setTriggerOffset(float f) {
        this.f37542b = f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void smoothScrollToPosition(int i) {
        if (this.f37548h < 0) {
            this.f37548h = getCurrentPosition();
        }
        this.f37547g = i;
        if (!NullChecker.m82486a(getLayoutManager()) || !(getLayoutManager() instanceof LinearLayoutManager)) {
            super.smoothScrollToPosition(i);
            return;
        }
        C9086a c9086a = new C9086a(getContext());
        c9086a.setTargetPosition(i);
        if (i == -1) {
            return;
        }
        getLayoutManager().startSmoothScroll(c9086a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void swapAdapter(RecyclerView.Adapter adapter, boolean z) {
        wrc0<?> wrc0VarM57284M = m57284M(adapter);
        this.f37541a = wrc0VarM57284M;
        super.swapAdapter(wrc0VarM57284M, z);
    }

    public RecyclerViewPager(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RecyclerViewPager(Context context) {
        this(context, null);
    }
}
