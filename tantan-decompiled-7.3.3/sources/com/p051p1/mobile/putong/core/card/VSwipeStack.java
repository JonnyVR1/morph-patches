package com.p051p1.mobile.putong.core.card;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.card.VSwipeCard;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.newui.home.opt.CardProgressAction;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;
import p153l.dox;
import p153l.dq1;
import p153l.pf7;
import p153l.qa00;
import p153l.wtq0;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public class VSwipeStack<T extends VSwipeCard> extends AdapterView<dq1> implements VSwipeCard.InterfaceC4915d<T> {

    /* JADX INFO: renamed from: a */
    public dq1 f21056a;

    /* JADX INFO: renamed from: b */
    public Stack<T> f21057b;

    /* JADX INFO: renamed from: c */
    public Stack<T> f21058c;

    /* JADX INFO: renamed from: d */
    public DataSetObserver f21059d;

    /* JADX INFO: renamed from: e */
    public int f21060e;

    /* JADX INFO: renamed from: f */
    public float f21061f;

    /* JADX INFO: renamed from: g */
    public int f21062g;

    /* JADX INFO: renamed from: h */
    public float f21063h;

    /* JADX INFO: renamed from: i */
    public Point f21064i;

    /* JADX INFO: renamed from: j */
    public ArrayList<View> f21065j;

    /* JADX INFO: renamed from: k */
    public boolean f21066k;

    /* JADX INFO: renamed from: l */
    public boolean f21067l;

    /* JADX INFO: renamed from: m */
    public int f21068m;

    /* JADX INFO: renamed from: n */
    public int f21069n;

    /* JADX INFO: renamed from: o */
    public double f21070o;

    /* JADX INFO: renamed from: p */
    public boolean f21071p;

    /* JADX INFO: renamed from: q */
    public InterfaceC4918c f21072q;

    /* JADX INFO: renamed from: r */
    public int f21073r;

    /* JADX INFO: renamed from: s */
    public int f21074s;

    /* JADX INFO: renamed from: t */
    public int f21075t;

    /* JADX INFO: renamed from: u */
    public Queue<SwipeDirection> f21076u;

    /* JADX INFO: renamed from: v */
    public y20<T> f21077v;

    public enum OnCardSwipeResult {
        pass,
        stay,
        back
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.card.VSwipeStack$a */
    public class C4916a extends DataSetObserver {
        public C4916a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            VSwipeStack.this.m36197n();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            VSwipeStack.this.m36197n();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.card.VSwipeStack$b */
    public static /* synthetic */ class C4917b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f21079a;

        static {
            int[] iArr = new int[OnCardSwipeResult.values().length];
            f21079a = iArr;
            try {
                iArr[OnCardSwipeResult.pass.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21079a[OnCardSwipeResult.back.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21079a[OnCardSwipeResult.stay.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.card.VSwipeStack$c */
    public interface InterfaceC4918c {
        /* JADX INFO: renamed from: a */
        default void m36199a(float f, float f2, CardProgressAction cardProgressAction) {
        }

        /* JADX INFO: renamed from: b */
        void mo36200b(boolean z, float f, CardProgressAction cardProgressAction);
    }

    public VSwipeStack(Context context) {
        super(context);
        this.f21057b = new Stack<>();
        this.f21058c = new Stack<>();
        this.f21059d = new C4916a();
        this.f21060e = qa00.m175859d(6.0f);
        this.f21061f = 0.0225f;
        this.f21062g = 4;
        this.f21063h = 0.0f;
        this.f21065j = new ArrayList<>();
        this.f21066k = false;
        this.f21067l = false;
        this.f21068m = 0;
        this.f21069n = pf7.m172086a() ? 3 : this.f21062g;
        this.f21070o = -1.0d;
        this.f21071p = false;
        this.f21075t = 0;
        this.f21076u = new ArrayDeque();
    }

    /* JADX INFO: renamed from: b */
    public T m36191b(int i) {
        return (T) getChildAt(i);
    }

    @Override // com.p051p1.mobile.putong.core.card.VSwipeCard.InterfaceC4915d
    /* JADX INFO: renamed from: c */
    public boolean mo36184c(boolean z) {
        return this.f21071p;
    }

    /* JADX INFO: renamed from: d */
    public T m36192d(int i) {
        return (T) m36191b(((getChildCount() - this.f21065j.size()) - 1) - i);
    }

    @Override // com.p051p1.mobile.putong.core.card.VSwipeCard.InterfaceC4915d
    /* JADX INFO: renamed from: e */
    public void mo36185e(float f) {
        this.f21063h = Math.max(f, 0.0f);
        m36196m();
    }

    @Override // com.p051p1.mobile.putong.core.card.VSwipeCard.InterfaceC4915d
    /* JADX INFO: renamed from: f */
    public boolean mo36186f(T t) {
        return m36198o() == t;
    }

    @Override // com.p051p1.mobile.putong.core.card.VSwipeCard.InterfaceC4915d
    /* JADX INFO: renamed from: g */
    public void mo36187g(T t) {
        if (NullChecker.m82486a(this.f21077v)) {
            this.f21077v.call(t);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return this.f21066k ? new ViewGroup.LayoutParams(-1, -1) : super.generateDefaultLayoutParams();
    }

    @Override // com.p051p1.mobile.putong.core.card.VSwipeCard.InterfaceC4915d
    public float getBgAlpha() {
        return this.f21063h;
    }

    @Override // android.widget.AdapterView
    public View getSelectedView() {
        return null;
    }

    @Override // com.p051p1.mobile.putong.core.card.VSwipeCard.InterfaceC4915d
    /* JADX INFO: renamed from: h */
    public void mo36188h(boolean z, float f) {
        InterfaceC4918c interfaceC4918c = this.f21072q;
        if (interfaceC4918c != null) {
            interfaceC4918c.mo36200b(z, f, CardProgressAction.UNKNOWN);
        }
    }

    @Override // com.p051p1.mobile.putong.core.card.VSwipeCard.InterfaceC4915d
    /* JADX INFO: renamed from: i */
    public void mo36189i(T t, SwipeDirection swipeDirection, float f, boolean z) {
        this.f21063h = f - 1.0f;
        this.f21065j.add(t);
        if (t.getBackground() != null) {
            t.getBackground().setAlpha(255);
        }
        int[] iArr = C4917b.f21079a;
        throw null;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m36194k(T t) {
        if (this.f21066k) {
            return t.getHeight() != this.f21064i.y;
        }
        return t.getWidth() != this.f21064i.x;
    }

    /* JADX INFO: renamed from: l */
    public final void m36195l(T t) {
        if (t.getParent() != null) {
            wtq0.m207906a("!!");
        } else if (t.f21033d) {
            this.f21058c.add(t);
            this.f21075t--;
        } else {
            t.mo36177n1();
            this.f21057b.add(t);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m36196m() {
        int childCount = getChildCount() - this.f21065j.size();
        float f = (!this.f21066k || this.f21067l) ? this.f21062g - 2 : this.f21062g;
        for (int i = 0; i < childCount; i++) {
            float fMin = Math.min((this.f21074s - i) - this.f21063h, f);
            VSwipeCard vSwipeCardM36191b = m36191b(i);
            if (i < childCount - 1) {
                float f2 = 1.0f - (this.f21061f * fMin);
                float f3 = f2 * f2 * f2;
                float fSqrt = (float) Math.sqrt(Math.sqrt(fMin));
                vSwipeCardM36191b.m36158V0(f3, (!this.f21066k || this.f21067l) ? -((((float) (((double) (fSqrt * fSqrt * fSqrt)) * Math.sqrt(fSqrt))) * this.f21060e) + ((vSwipeCardM36191b.getHeight() * (1.0f - f3)) / 2.0f)) : 0.0f);
            }
            if (childCount == this.f21062g && getChildAt(0).getBackground() != null) {
                getChildAt(0).getBackground().setAlpha((int) (this.f21063h * 255.0f));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0092  */
    /* JADX INFO: renamed from: n */
    public final void m36197n() {
        dq1 dq1Var;
        T tPop;
        if (this.f21064i == null || (dq1Var = this.f21056a) == null) {
            return;
        }
        int iMin = Math.min(this.f21069n, dq1Var.getCount()) - 1;
        this.f21074s = iMin;
        this.f21073r = (this.f21062g - 1) - iMin;
        int iMin2 = Math.min(this.f21056a.getCount(), this.f21069n);
        int size = this.f21065j.size();
        int childCount = (getChildCount() - size) - iMin2;
        int childCount2 = getChildCount() - size;
        int i = this.f21075t;
        int i2 = childCount2 - i;
        if (childCount > 0) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(0);
                removeViewsInLayout(0, 1);
                m36195l((VSwipeCard) childAt);
            }
        } else if (childCount < 0) {
            for (int i4 = i2; i4 < Math.abs(childCount) + i2; i4++) {
                if (this.f21056a.getItemViewType(i4) == 0) {
                    if (this.f21057b.isEmpty()) {
                        tPop = null;
                    } else {
                        tPop = this.f21057b.pop();
                    }
                } else if (this.f21056a.getItemViewType(i4) != 1 || this.f21058c.isEmpty()) {
                    tPop = null;
                } else {
                    tPop = this.f21058c.pop();
                }
                if (tPop == null) {
                    dq1 dq1Var2 = this.f21056a;
                    tPop = (VSwipeCard) dq1Var2.mo21402m(this, dq1Var2.getItemViewType(i4));
                }
                tPop.setSwipeCardObserver(this);
                if (tPop.f21033d) {
                    addViewInLayout(tPop, 0, generateDefaultLayoutParams(), true);
                    this.f21075t++;
                } else {
                    addViewInLayout(tPop, this.f21075t, generateDefaultLayoutParams(), true);
                }
            }
        } else if (childCount == 0 && i > 0 && getChildCount() - this.f21065j.size() != 4) {
            T tPop2 = this.f21057b.isEmpty() ? null : this.f21057b.pop();
            if (tPop2 == null) {
                dq1 dq1Var3 = this.f21056a;
                tPop2 = (VSwipeCard) dq1Var3.mo21402m(this, dq1Var3.getItemViewType(this.f21075t - 1));
            }
            tPop2.setSwipeCardObserver(this);
            addViewInLayout(tPop2, this.f21075t, generateDefaultLayoutParams(), true);
            View childAt2 = getChildAt(0);
            removeViewsInLayout(0, 1);
            m36195l((VSwipeCard) childAt2);
        }
        int i5 = iMin2 - 1;
        while (i5 >= 0) {
            VSwipeCard vSwipeCardM36192d = m36192d(i5);
            vSwipeCardM36192d.m36150O0(i5 == 0);
            if (vSwipeCardM36192d.getRight() == 0 || m36194k(vSwipeCardM36192d)) {
                vSwipeCardM36192d.measure(dox.m117364b(this.f21064i.x), dox.m117364b(this.f21064i.y));
                int measuredWidth = (getMeasuredWidth() - vSwipeCardM36192d.getMeasuredWidth()) / 2;
                int measuredHeight = getMeasuredHeight() - getPaddingBottom();
                if (vSwipeCardM36192d.f21033d) {
                    vSwipeCardM36192d.layout(measuredWidth, measuredHeight - vSwipeCardM36192d.getMeasuredHeight(), this.f21064i.x + measuredWidth, measuredHeight);
                } else {
                    vSwipeCardM36192d.layout(measuredWidth, measuredHeight - vSwipeCardM36192d.getMeasuredHeight(), vSwipeCardM36192d.getMeasuredWidth() + measuredWidth, measuredHeight);
                }
            }
            dq1 dq1Var4 = this.f21056a;
            dq1Var4.mo21401j(vSwipeCardM36192d, dq1Var4.getItem(i5), this.f21056a.getItemViewType(i5), i5);
            if (vSwipeCardM36192d.getBackground() != null) {
                vSwipeCardM36192d.getBackground().setAlpha(255);
            }
            i5--;
        }
        m36196m();
        invalidate();
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public T m36198o() {
        return (T) m36192d(0);
    }

    @Override // android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i4 - i2;
        if (this.f21068m != i5) {
            this.f21068m = i5;
            m36197n();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        T childAt;
        if (this.f21056a == null) {
            wtq0.m207906a("it is expected to have adapter set no to simplify measuring");
            return;
        }
        if (getChildCount() == 0 && this.f21057b.empty()) {
            childAt = this.f21056a.mo21402m(this, 0);
            this.f21057b.add((T) ((VSwipeCard) childAt));
            m36193j(this.f21057b, this.f21056a);
        } else {
            childAt = getChildAt(this.f21075t);
            if (childAt == null) {
                childAt = this.f21057b.peek();
            }
        }
        if (this.f21064i == null) {
            this.f21064i = new Point();
        }
        if (childAt.getLayoutParams() == null) {
            childAt.setLayoutParams(generateDefaultLayoutParams());
        }
        boolean z = this.f21066k;
        if (z && !this.f21067l) {
            measureChild(childAt, dox.m117364b(dox.m117366d(i)), dox.m117364b(dox.m117366d(i2)));
            this.f21064i.x = childAt.getMeasuredWidth();
            this.f21064i.y = childAt.getMeasuredHeight();
            super.onMeasure(i, i2);
            return;
        }
        if (z) {
            measureChild(childAt, dox.m117364b(dox.m117366d(i)), dox.m117364b(dox.m117366d(i2) - ((this.f21062g - 2) * this.f21060e)));
        } else {
            measureChild(childAt, dox.m117363a(dox.m117366d(i)), dox.m117363a(dox.m117366d(i2) - ((this.f21062g - 2) * this.f21060e)));
        }
        this.f21064i.x = childAt.getMeasuredWidth();
        this.f21064i.y = childAt.getMeasuredHeight();
        super.onMeasure(dox.m117364b(this.f21064i.x + getPaddingLeft() + getPaddingRight()), dox.m117364b(this.f21064i.y + ((this.f21062g - 2) * this.f21060e) + getPaddingTop() + getPaddingBottom()));
    }

    @Override // android.widget.AdapterView
    public void setAdapter(dq1 dq1Var) {
        dq1 dq1Var2 = this.f21056a;
        if (dq1Var2 != null) {
            dq1Var2.unregisterDataSetObserver(this.f21059d);
        }
        this.f21056a = dq1Var;
        if (dq1Var != null) {
            dq1Var.registerDataSetObserver(this.f21059d);
        }
        m36197n();
    }

    public void setAllowUpSwipe(boolean z) {
        this.f21071p = z;
    }

    public void setDisplayedCount(int i) {
        this.f21062g = i;
    }

    public void setRenderCardCount(int i) {
        this.f21069n = i;
    }

    @Override // android.widget.AdapterView
    public void setSelection(int i) {
    }

    @Override // android.widget.AdapterView
    public dq1 getAdapter() {
        return this.f21056a;
    }

    /* JADX INFO: renamed from: j */
    public void m36193j(@NonNull Stack<T> stack, @NonNull dq1 dq1Var) {
    }

    public VSwipeStack(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21057b = new Stack<>();
        this.f21058c = new Stack<>();
        this.f21059d = new C4916a();
        this.f21060e = qa00.m175859d(6.0f);
        this.f21061f = 0.0225f;
        this.f21062g = 4;
        this.f21063h = 0.0f;
        this.f21065j = new ArrayList<>();
        this.f21066k = false;
        this.f21067l = false;
        this.f21068m = 0;
        this.f21069n = pf7.m172086a() ? 3 : this.f21062g;
        this.f21070o = -1.0d;
        this.f21071p = false;
        this.f21075t = 0;
        this.f21076u = new ArrayDeque();
    }

    public VSwipeStack(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21057b = new Stack<>();
        this.f21058c = new Stack<>();
        this.f21059d = new C4916a();
        this.f21060e = qa00.m175859d(6.0f);
        this.f21061f = 0.0225f;
        this.f21062g = 4;
        this.f21063h = 0.0f;
        this.f21065j = new ArrayList<>();
        this.f21066k = false;
        this.f21067l = false;
        this.f21068m = 0;
        this.f21069n = pf7.m172086a() ? 3 : this.f21062g;
        this.f21070o = -1.0d;
        this.f21071p = false;
        this.f21075t = 0;
        this.f21076u = new ArrayDeque();
    }
}
