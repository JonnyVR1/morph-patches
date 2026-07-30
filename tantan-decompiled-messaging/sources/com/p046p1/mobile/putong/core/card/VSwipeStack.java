package com.p046p1.mobile.putong.core.card;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.card.VSwipeCard;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.newui.home.opt.CardProgressAction;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;
import p149l.e30;
import p149l.ffx;
import p149l.le7;
import p149l.qkq0;
import p149l.t100;
import p149l.wp1;

/* JADX INFO: loaded from: classes9.dex */
public class VSwipeStack<T extends VSwipeCard> extends AdapterView<wp1> implements VSwipeCard.InterfaceC4764d<T> {

    /* JADX INFO: renamed from: a */
    public wp1 f20314a;

    /* JADX INFO: renamed from: b */
    public Stack<T> f20315b;

    /* JADX INFO: renamed from: c */
    public Stack<T> f20316c;

    /* JADX INFO: renamed from: d */
    public DataSetObserver f20317d;

    /* JADX INFO: renamed from: e */
    public int f20318e;

    /* JADX INFO: renamed from: f */
    public float f20319f;

    /* JADX INFO: renamed from: g */
    public int f20320g;

    /* JADX INFO: renamed from: h */
    public float f20321h;

    /* JADX INFO: renamed from: i */
    public Point f20322i;

    /* JADX INFO: renamed from: j */
    public ArrayList<View> f20323j;

    /* JADX INFO: renamed from: k */
    public boolean f20324k;

    /* JADX INFO: renamed from: l */
    public boolean f20325l;

    /* JADX INFO: renamed from: m */
    public int f20326m;

    /* JADX INFO: renamed from: n */
    public int f20327n;

    /* JADX INFO: renamed from: o */
    public double f20328o;

    /* JADX INFO: renamed from: p */
    public boolean f20329p;

    /* JADX INFO: renamed from: q */
    public InterfaceC4767c f20330q;

    /* JADX INFO: renamed from: r */
    public int f20331r;

    /* JADX INFO: renamed from: s */
    public int f20332s;

    /* JADX INFO: renamed from: t */
    public int f20333t;

    /* JADX INFO: renamed from: u */
    public Queue<SwipeDirection> f20334u;

    /* JADX INFO: renamed from: v */
    public e30<T> f20335v;

    public enum OnCardSwipeResult {
        pass,
        stay,
        back
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.card.VSwipeStack$a */
    public class C4765a extends DataSetObserver {
        public C4765a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            VSwipeStack.this.m35194n();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            VSwipeStack.this.m35194n();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.card.VSwipeStack$b */
    public static /* synthetic */ class C4766b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f20337a;

        static {
            int[] iArr = new int[OnCardSwipeResult.values().length];
            f20337a = iArr;
            try {
                iArr[OnCardSwipeResult.pass.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20337a[OnCardSwipeResult.back.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20337a[OnCardSwipeResult.stay.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.card.VSwipeStack$c */
    public interface InterfaceC4767c {
        /* JADX INFO: renamed from: a */
        default void m35196a(float f, float f2, CardProgressAction cardProgressAction) {
        }

        /* JADX INFO: renamed from: b */
        void mo35197b(boolean z, float f, CardProgressAction cardProgressAction);
    }

    public VSwipeStack(Context context) {
        super(context);
        this.f20315b = new Stack<>();
        this.f20316c = new Stack<>();
        this.f20317d = new C4765a();
        this.f20318e = t100.m186890d(6.0f);
        this.f20319f = 0.0225f;
        this.f20320g = 4;
        this.f20321h = 0.0f;
        this.f20323j = new ArrayList<>();
        this.f20324k = false;
        this.f20325l = false;
        this.f20326m = 0;
        this.f20327n = le7.m149479a() ? 3 : this.f20320g;
        this.f20328o = -1.0d;
        this.f20329p = false;
        this.f20333t = 0;
        this.f20334u = new ArrayDeque();
    }

    /* JADX INFO: renamed from: b */
    public T m35188b(int i) {
        return (T) getChildAt(i);
    }

    @Override // com.p046p1.mobile.putong.core.card.VSwipeCard.InterfaceC4764d
    /* JADX INFO: renamed from: c */
    public boolean mo35181c(boolean z) {
        return this.f20329p;
    }

    /* JADX INFO: renamed from: d */
    public T m35189d(int i) {
        return (T) m35188b(((getChildCount() - this.f20323j.size()) - 1) - i);
    }

    @Override // com.p046p1.mobile.putong.core.card.VSwipeCard.InterfaceC4764d
    /* JADX INFO: renamed from: e */
    public void mo35182e(float f) {
        this.f20321h = Math.max(f, 0.0f);
        m35193m();
    }

    @Override // com.p046p1.mobile.putong.core.card.VSwipeCard.InterfaceC4764d
    /* JADX INFO: renamed from: f */
    public boolean mo35183f(T t) {
        return m35195o() == t;
    }

    @Override // com.p046p1.mobile.putong.core.card.VSwipeCard.InterfaceC4764d
    /* JADX INFO: renamed from: g */
    public void mo35184g(T t) {
        if (NullChecker.m81303a(this.f20335v)) {
            this.f20335v.call(t);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return this.f20324k ? new ViewGroup.LayoutParams(-1, -1) : super.generateDefaultLayoutParams();
    }

    @Override // com.p046p1.mobile.putong.core.card.VSwipeCard.InterfaceC4764d
    public float getBgAlpha() {
        return this.f20321h;
    }

    @Override // android.widget.AdapterView
    public View getSelectedView() {
        return null;
    }

    @Override // com.p046p1.mobile.putong.core.card.VSwipeCard.InterfaceC4764d
    /* JADX INFO: renamed from: h */
    public void mo35185h(boolean z, float f) {
        InterfaceC4767c interfaceC4767c = this.f20330q;
        if (interfaceC4767c != null) {
            interfaceC4767c.mo35197b(z, f, CardProgressAction.UNKNOWN);
        }
    }

    @Override // com.p046p1.mobile.putong.core.card.VSwipeCard.InterfaceC4764d
    /* JADX INFO: renamed from: i */
    public void mo35186i(T t, SwipeDirection swipeDirection, float f, boolean z) {
        this.f20321h = f - 1.0f;
        this.f20323j.add(t);
        if (t.getBackground() != null) {
            t.getBackground().setAlpha(255);
        }
        int[] iArr = C4766b.f20337a;
        throw null;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m35191k(T t) {
        if (this.f20324k) {
            return t.getHeight() != this.f20322i.y;
        }
        return t.getWidth() != this.f20322i.x;
    }

    /* JADX INFO: renamed from: l */
    public final void m35192l(T t) {
        if (t.getParent() != null) {
            qkq0.m175383a("!!");
        } else if (t.f20291d) {
            this.f20316c.add(t);
            this.f20333t--;
        } else {
            t.mo35174n1();
            this.f20315b.add(t);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m35193m() {
        int childCount = getChildCount() - this.f20323j.size();
        float f = (!this.f20324k || this.f20325l) ? this.f20320g - 2 : this.f20320g;
        for (int i = 0; i < childCount; i++) {
            float fMin = Math.min((this.f20332s - i) - this.f20321h, f);
            VSwipeCard vSwipeCardM35188b = m35188b(i);
            if (i < childCount - 1) {
                float f2 = 1.0f - (this.f20319f * fMin);
                float f3 = f2 * f2 * f2;
                float fSqrt = (float) Math.sqrt(Math.sqrt(fMin));
                vSwipeCardM35188b.m35155V0(f3, (!this.f20324k || this.f20325l) ? -((((float) (((double) (fSqrt * fSqrt * fSqrt)) * Math.sqrt(fSqrt))) * this.f20318e) + ((vSwipeCardM35188b.getHeight() * (1.0f - f3)) / 2.0f)) : 0.0f);
            }
            if (childCount == this.f20320g && getChildAt(0).getBackground() != null) {
                getChildAt(0).getBackground().setAlpha((int) (this.f20321h * 255.0f));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0092  */
    /* JADX INFO: renamed from: n */
    public final void m35194n() {
        wp1 wp1Var;
        T tPop;
        if (this.f20322i == null || (wp1Var = this.f20314a) == null) {
            return;
        }
        int iMin = Math.min(this.f20327n, wp1Var.getCount()) - 1;
        this.f20332s = iMin;
        this.f20331r = (this.f20320g - 1) - iMin;
        int iMin2 = Math.min(this.f20314a.getCount(), this.f20327n);
        int size = this.f20323j.size();
        int childCount = (getChildCount() - size) - iMin2;
        int childCount2 = getChildCount() - size;
        int i = this.f20333t;
        int i2 = childCount2 - i;
        if (childCount > 0) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(0);
                removeViewsInLayout(0, 1);
                m35192l((VSwipeCard) childAt);
            }
        } else if (childCount < 0) {
            for (int i4 = i2; i4 < Math.abs(childCount) + i2; i4++) {
                if (this.f20314a.getItemViewType(i4) == 0) {
                    if (this.f20315b.isEmpty()) {
                        tPop = null;
                    } else {
                        tPop = this.f20315b.pop();
                    }
                } else if (this.f20314a.getItemViewType(i4) != 1 || this.f20316c.isEmpty()) {
                    tPop = null;
                } else {
                    tPop = this.f20316c.pop();
                }
                if (tPop == null) {
                    wp1 wp1Var2 = this.f20314a;
                    tPop = (VSwipeCard) wp1Var2.mo20403m(this, wp1Var2.getItemViewType(i4));
                }
                tPop.setSwipeCardObserver(this);
                if (tPop.f20291d) {
                    addViewInLayout(tPop, 0, generateDefaultLayoutParams(), true);
                    this.f20333t++;
                } else {
                    addViewInLayout(tPop, this.f20333t, generateDefaultLayoutParams(), true);
                }
            }
        } else if (childCount == 0 && i > 0 && getChildCount() - this.f20323j.size() != 4) {
            T tPop2 = this.f20315b.isEmpty() ? null : this.f20315b.pop();
            if (tPop2 == null) {
                wp1 wp1Var3 = this.f20314a;
                tPop2 = (VSwipeCard) wp1Var3.mo20403m(this, wp1Var3.getItemViewType(this.f20333t - 1));
            }
            tPop2.setSwipeCardObserver(this);
            addViewInLayout(tPop2, this.f20333t, generateDefaultLayoutParams(), true);
            View childAt2 = getChildAt(0);
            removeViewsInLayout(0, 1);
            m35192l((VSwipeCard) childAt2);
        }
        int i5 = iMin2 - 1;
        while (i5 >= 0) {
            VSwipeCard vSwipeCardM35189d = m35189d(i5);
            vSwipeCardM35189d.m35147O0(i5 == 0);
            if (vSwipeCardM35189d.getRight() == 0 || m35191k(vSwipeCardM35189d)) {
                vSwipeCardM35189d.measure(ffx.m121199b(this.f20322i.x), ffx.m121199b(this.f20322i.y));
                int measuredWidth = (getMeasuredWidth() - vSwipeCardM35189d.getMeasuredWidth()) / 2;
                int measuredHeight = getMeasuredHeight() - getPaddingBottom();
                if (vSwipeCardM35189d.f20291d) {
                    vSwipeCardM35189d.layout(measuredWidth, measuredHeight - vSwipeCardM35189d.getMeasuredHeight(), this.f20322i.x + measuredWidth, measuredHeight);
                } else {
                    vSwipeCardM35189d.layout(measuredWidth, measuredHeight - vSwipeCardM35189d.getMeasuredHeight(), vSwipeCardM35189d.getMeasuredWidth() + measuredWidth, measuredHeight);
                }
            }
            wp1 wp1Var4 = this.f20314a;
            wp1Var4.mo20402j(vSwipeCardM35189d, wp1Var4.getItem(i5), this.f20314a.getItemViewType(i5), i5);
            if (vSwipeCardM35189d.getBackground() != null) {
                vSwipeCardM35189d.getBackground().setAlpha(255);
            }
            i5--;
        }
        m35193m();
        invalidate();
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public T m35195o() {
        return (T) m35189d(0);
    }

    @Override // android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i4 - i2;
        if (this.f20326m != i5) {
            this.f20326m = i5;
            m35194n();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        T childAt;
        if (this.f20314a == null) {
            qkq0.m175383a("it is expected to have adapter set no to simplify measuring");
            return;
        }
        if (getChildCount() == 0 && this.f20315b.empty()) {
            childAt = this.f20314a.mo20403m(this, 0);
            this.f20315b.add((T) ((VSwipeCard) childAt));
            m35190j(this.f20315b, this.f20314a);
        } else {
            childAt = getChildAt(this.f20333t);
            if (childAt == null) {
                childAt = this.f20315b.peek();
            }
        }
        if (this.f20322i == null) {
            this.f20322i = new Point();
        }
        if (childAt.getLayoutParams() == null) {
            childAt.setLayoutParams(generateDefaultLayoutParams());
        }
        boolean z = this.f20324k;
        if (z && !this.f20325l) {
            measureChild(childAt, ffx.m121199b(ffx.m121201d(i)), ffx.m121199b(ffx.m121201d(i2)));
            this.f20322i.x = childAt.getMeasuredWidth();
            this.f20322i.y = childAt.getMeasuredHeight();
            super.onMeasure(i, i2);
            return;
        }
        if (z) {
            measureChild(childAt, ffx.m121199b(ffx.m121201d(i)), ffx.m121199b(ffx.m121201d(i2) - ((this.f20320g - 2) * this.f20318e)));
        } else {
            measureChild(childAt, ffx.m121198a(ffx.m121201d(i)), ffx.m121198a(ffx.m121201d(i2) - ((this.f20320g - 2) * this.f20318e)));
        }
        this.f20322i.x = childAt.getMeasuredWidth();
        this.f20322i.y = childAt.getMeasuredHeight();
        super.onMeasure(ffx.m121199b(this.f20322i.x + getPaddingLeft() + getPaddingRight()), ffx.m121199b(this.f20322i.y + ((this.f20320g - 2) * this.f20318e) + getPaddingTop() + getPaddingBottom()));
    }

    @Override // android.widget.AdapterView
    public void setAdapter(wp1 wp1Var) {
        wp1 wp1Var2 = this.f20314a;
        if (wp1Var2 != null) {
            wp1Var2.unregisterDataSetObserver(this.f20317d);
        }
        this.f20314a = wp1Var;
        if (wp1Var != null) {
            wp1Var.registerDataSetObserver(this.f20317d);
        }
        m35194n();
    }

    public void setAllowUpSwipe(boolean z) {
        this.f20329p = z;
    }

    public void setDisplayedCount(int i) {
        this.f20320g = i;
    }

    public void setRenderCardCount(int i) {
        this.f20327n = i;
    }

    @Override // android.widget.AdapterView
    public void setSelection(int i) {
    }

    @Override // android.widget.AdapterView
    public wp1 getAdapter() {
        return this.f20314a;
    }

    /* JADX INFO: renamed from: j */
    public void m35190j(@NonNull Stack<T> stack, @NonNull wp1 wp1Var) {
    }

    public VSwipeStack(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20315b = new Stack<>();
        this.f20316c = new Stack<>();
        this.f20317d = new C4765a();
        this.f20318e = t100.m186890d(6.0f);
        this.f20319f = 0.0225f;
        this.f20320g = 4;
        this.f20321h = 0.0f;
        this.f20323j = new ArrayList<>();
        this.f20324k = false;
        this.f20325l = false;
        this.f20326m = 0;
        this.f20327n = le7.m149479a() ? 3 : this.f20320g;
        this.f20328o = -1.0d;
        this.f20329p = false;
        this.f20333t = 0;
        this.f20334u = new ArrayDeque();
    }

    public VSwipeStack(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f20315b = new Stack<>();
        this.f20316c = new Stack<>();
        this.f20317d = new C4765a();
        this.f20318e = t100.m186890d(6.0f);
        this.f20319f = 0.0225f;
        this.f20320g = 4;
        this.f20321h = 0.0f;
        this.f20323j = new ArrayList<>();
        this.f20324k = false;
        this.f20325l = false;
        this.f20326m = 0;
        this.f20327n = le7.m149479a() ? 3 : this.f20320g;
        this.f20328o = -1.0d;
        this.f20329p = false;
        this.f20333t = 0;
        this.f20334u = new ArrayDeque();
    }
}
