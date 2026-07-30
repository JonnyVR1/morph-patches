package com.p000p1.mobile.putong.core.card;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.card.VSwipeCard;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.newui.home.opt.CardProgressAction;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;
import l.e30;
import l.ffx;
import l.le7;
import l.qkq0;
import l.t100;
import l.wp1;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class VSwipeStack<T extends VSwipeCard> extends AdapterView<wp1> implements VSwipeCard.InterfaceC0190d<T> {

    /* JADX INFO: renamed from: a */
    public wp1 f4303a;

    /* JADX INFO: renamed from: b */
    public Stack<T> f4304b;

    /* JADX INFO: renamed from: c */
    public Stack<T> f4305c;

    /* JADX INFO: renamed from: d */
    public DataSetObserver f4306d;

    /* JADX INFO: renamed from: e */
    public int f4307e;

    /* JADX INFO: renamed from: f */
    public float f4308f;

    /* JADX INFO: renamed from: g */
    public int f4309g;

    /* JADX INFO: renamed from: h */
    public float f4310h;

    /* JADX INFO: renamed from: i */
    public Point f4311i;

    /* JADX INFO: renamed from: j */
    public ArrayList<View> f4312j;

    /* JADX INFO: renamed from: k */
    public boolean f4313k;

    /* JADX INFO: renamed from: l */
    public boolean f4314l;

    /* JADX INFO: renamed from: m */
    public int f4315m;

    /* JADX INFO: renamed from: n */
    public int f4316n;

    /* JADX INFO: renamed from: o */
    public double f4317o;

    /* JADX INFO: renamed from: p */
    public boolean f4318p;

    /* JADX INFO: renamed from: q */
    public InterfaceC0193c f4319q;

    /* JADX INFO: renamed from: r */
    public int f4320r;

    /* JADX INFO: renamed from: s */
    public int f4321s;

    /* JADX INFO: renamed from: t */
    public int f4322t;

    /* JADX INFO: renamed from: u */
    public Queue<SwipeDirection> f4323u;

    /* JADX INFO: renamed from: v */
    public e30<T> f4324v;

    public enum OnCardSwipeResult {
        pass,
        stay,
        back
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.card.VSwipeStack$a */
    public class C0191a extends DataSetObserver {
        public C0191a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            VSwipeStack.this.m7136n();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            VSwipeStack.this.m7136n();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.card.VSwipeStack$b */
    public static /* synthetic */ class C0192b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f4326a;

        static {
            int[] iArr = new int[OnCardSwipeResult.values().length];
            f4326a = iArr;
            try {
                iArr[OnCardSwipeResult.pass.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4326a[OnCardSwipeResult.back.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4326a[OnCardSwipeResult.stay.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.card.VSwipeStack$c */
    public interface InterfaceC0193c {
        /* JADX INFO: renamed from: a */
        default void m7138a(float f, float f2, CardProgressAction cardProgressAction) {
        }

        /* JADX INFO: renamed from: b */
        void m7139b(boolean z, float f, CardProgressAction cardProgressAction);
    }

    public VSwipeStack(Context context) {
        super(context);
        this.f4304b = new Stack<>();
        this.f4305c = new Stack<>();
        this.f4306d = new C0191a();
        this.f4307e = t100.d(6.0f);
        this.f4308f = 0.0225f;
        this.f4309g = 4;
        this.f4310h = 0.0f;
        this.f4312j = new ArrayList<>();
        this.f4313k = false;
        this.f4314l = false;
        this.f4315m = 0;
        this.f4316n = le7.a() ? 3 : this.f4309g;
        this.f4317o = -1.0d;
        this.f4318p = false;
        this.f4322t = 0;
        this.f4323u = new ArrayDeque();
    }

    /* JADX INFO: renamed from: b */
    public T m7130b(int i) {
        return (T) getChildAt(i);
    }

    @Override // com.p000p1.mobile.putong.core.card.VSwipeCard.InterfaceC0190d
    /* JADX INFO: renamed from: c */
    public boolean mo7123c(boolean z) {
        return this.f4318p;
    }

    /* JADX INFO: renamed from: d */
    public T m7131d(int i) {
        return (T) m7130b(((getChildCount() - this.f4312j.size()) - 1) - i);
    }

    @Override // com.p000p1.mobile.putong.core.card.VSwipeCard.InterfaceC0190d
    /* JADX INFO: renamed from: e */
    public void mo7124e(float f) {
        this.f4310h = Math.max(f, 0.0f);
        m7135m();
    }

    @Override // com.p000p1.mobile.putong.core.card.VSwipeCard.InterfaceC0190d
    /* JADX INFO: renamed from: f */
    public boolean mo7125f(T t) {
        return m7137o() == t;
    }

    @Override // com.p000p1.mobile.putong.core.card.VSwipeCard.InterfaceC0190d
    /* JADX INFO: renamed from: g */
    public void mo7126g(T t) {
        if (NullChecker.a(this.f4324v)) {
            this.f4324v.call(t);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return this.f4313k ? new ViewGroup.LayoutParams(-1, -1) : super.generateDefaultLayoutParams();
    }

    @Override // com.p000p1.mobile.putong.core.card.VSwipeCard.InterfaceC0190d
    public float getBgAlpha() {
        return this.f4310h;
    }

    @Override // android.widget.AdapterView
    public View getSelectedView() {
        return null;
    }

    @Override // com.p000p1.mobile.putong.core.card.VSwipeCard.InterfaceC0190d
    /* JADX INFO: renamed from: h */
    public void mo7127h(boolean z, float f) {
        InterfaceC0193c interfaceC0193c = this.f4319q;
        if (interfaceC0193c != null) {
            interfaceC0193c.m7139b(z, f, CardProgressAction.UNKNOWN);
        }
    }

    @Override // com.p000p1.mobile.putong.core.card.VSwipeCard.InterfaceC0190d
    /* JADX INFO: renamed from: i */
    public void mo7128i(T t, SwipeDirection swipeDirection, float f, boolean z) {
        this.f4310h = f - 1.0f;
        this.f4312j.add(t);
        if (t.getBackground() != null) {
            t.getBackground().setAlpha(255);
        }
        int[] iArr = C0192b.f4326a;
        throw null;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m7133k(T t) {
        if (this.f4313k) {
            return t.getHeight() != this.f4311i.y;
        }
        return t.getWidth() != this.f4311i.x;
    }

    /* JADX INFO: renamed from: l */
    public final void m7134l(T t) {
        if (t.getParent() != null) {
            qkq0.a("!!");
        } else if (t.f4280d) {
            this.f4305c.add(t);
            this.f4322t--;
        } else {
            t.m7116n1();
            this.f4304b.add(t);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m7135m() {
        int childCount = getChildCount() - this.f4312j.size();
        float f = (!this.f4313k || this.f4314l) ? this.f4309g - 2 : this.f4309g;
        for (int i = 0; i < childCount; i++) {
            float fMin = Math.min((this.f4321s - i) - this.f4310h, f);
            VSwipeCard vSwipeCardM7130b = m7130b(i);
            if (i < childCount - 1) {
                float f2 = 1.0f - (this.f4308f * fMin);
                float f3 = f2 * f2 * f2;
                float fSqrt = (float) Math.sqrt(Math.sqrt(fMin));
                vSwipeCardM7130b.m7097V0(f3, (!this.f4313k || this.f4314l) ? -((((float) (((double) (fSqrt * fSqrt * fSqrt)) * Math.sqrt(fSqrt))) * this.f4307e) + ((vSwipeCardM7130b.getHeight() * (1.0f - f3)) / 2.0f)) : 0.0f);
            }
            if (childCount == this.f4309g && getChildAt(0).getBackground() != null) {
                getChildAt(0).getBackground().setAlpha((int) (this.f4310h * 255.0f));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0092  */
    /* JADX INFO: renamed from: n */
    public final void m7136n() {
        wp1 wp1Var;
        T tPop;
        if (this.f4311i == null || (wp1Var = this.f4303a) == null) {
            return;
        }
        int iMin = Math.min(this.f4316n, wp1Var.getCount()) - 1;
        this.f4321s = iMin;
        this.f4320r = (this.f4309g - 1) - iMin;
        int iMin2 = Math.min(this.f4303a.getCount(), this.f4316n);
        int size = this.f4312j.size();
        int childCount = (getChildCount() - size) - iMin2;
        int childCount2 = getChildCount() - size;
        int i = this.f4322t;
        int i2 = childCount2 - i;
        if (childCount > 0) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(0);
                removeViewsInLayout(0, 1);
                m7134l((VSwipeCard) childAt);
            }
        } else if (childCount < 0) {
            for (int i4 = i2; i4 < Math.abs(childCount) + i2; i4++) {
                if (this.f4303a.getItemViewType(i4) == 0) {
                    if (this.f4304b.isEmpty()) {
                        tPop = null;
                    } else {
                        tPop = this.f4304b.pop();
                    }
                } else if (this.f4303a.getItemViewType(i4) != 1 || this.f4305c.isEmpty()) {
                    tPop = null;
                } else {
                    tPop = this.f4305c.pop();
                }
                if (tPop == null) {
                    wp1 wp1Var2 = this.f4303a;
                    tPop = (VSwipeCard) wp1Var2.m(this, wp1Var2.getItemViewType(i4));
                }
                tPop.setSwipeCardObserver(this);
                if (tPop.f4280d) {
                    addViewInLayout(tPop, 0, generateDefaultLayoutParams(), true);
                    this.f4322t++;
                } else {
                    addViewInLayout(tPop, this.f4322t, generateDefaultLayoutParams(), true);
                }
            }
        } else if (childCount == 0 && i > 0 && getChildCount() - this.f4312j.size() != 4) {
            T tPop2 = this.f4304b.isEmpty() ? null : this.f4304b.pop();
            if (tPop2 == null) {
                wp1 wp1Var3 = this.f4303a;
                tPop2 = (VSwipeCard) wp1Var3.m(this, wp1Var3.getItemViewType(this.f4322t - 1));
            }
            tPop2.setSwipeCardObserver(this);
            addViewInLayout(tPop2, this.f4322t, generateDefaultLayoutParams(), true);
            View childAt2 = getChildAt(0);
            removeViewsInLayout(0, 1);
            m7134l((VSwipeCard) childAt2);
        }
        int i5 = iMin2 - 1;
        while (i5 >= 0) {
            VSwipeCard vSwipeCardM7131d = m7131d(i5);
            vSwipeCardM7131d.m7089O0(i5 == 0);
            if (vSwipeCardM7131d.getRight() == 0 || m7133k(vSwipeCardM7131d)) {
                vSwipeCardM7131d.measure(ffx.b(this.f4311i.x), ffx.b(this.f4311i.y));
                int measuredWidth = (getMeasuredWidth() - vSwipeCardM7131d.getMeasuredWidth()) / 2;
                int measuredHeight = getMeasuredHeight() - getPaddingBottom();
                if (vSwipeCardM7131d.f4280d) {
                    vSwipeCardM7131d.layout(measuredWidth, measuredHeight - vSwipeCardM7131d.getMeasuredHeight(), this.f4311i.x + measuredWidth, measuredHeight);
                } else {
                    vSwipeCardM7131d.layout(measuredWidth, measuredHeight - vSwipeCardM7131d.getMeasuredHeight(), vSwipeCardM7131d.getMeasuredWidth() + measuredWidth, measuredHeight);
                }
            }
            wp1 wp1Var4 = this.f4303a;
            wp1Var4.j(vSwipeCardM7131d, wp1Var4.getItem(i5), this.f4303a.getItemViewType(i5), i5);
            if (vSwipeCardM7131d.getBackground() != null) {
                vSwipeCardM7131d.getBackground().setAlpha(255);
            }
            i5--;
        }
        m7135m();
        invalidate();
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public T m7137o() {
        return (T) m7131d(0);
    }

    @Override // android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i4 - i2;
        if (this.f4315m != i5) {
            this.f4315m = i5;
            m7136n();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        T childAt;
        if (this.f4303a == null) {
            qkq0.a("it is expected to have adapter set no to simplify measuring");
            return;
        }
        if (getChildCount() == 0 && this.f4304b.empty()) {
            childAt = this.f4303a.m(this, 0);
            this.f4304b.add((T) ((VSwipeCard) childAt));
            m7132j(this.f4304b, this.f4303a);
        } else {
            childAt = getChildAt(this.f4322t);
            if (childAt == null) {
                childAt = this.f4304b.peek();
            }
        }
        if (this.f4311i == null) {
            this.f4311i = new Point();
        }
        if (childAt.getLayoutParams() == null) {
            childAt.setLayoutParams(generateDefaultLayoutParams());
        }
        boolean z = this.f4313k;
        if (z && !this.f4314l) {
            measureChild(childAt, ffx.b(ffx.d(i)), ffx.b(ffx.d(i2)));
            this.f4311i.x = childAt.getMeasuredWidth();
            this.f4311i.y = childAt.getMeasuredHeight();
            super.onMeasure(i, i2);
            return;
        }
        if (z) {
            measureChild(childAt, ffx.b(ffx.d(i)), ffx.b(ffx.d(i2) - ((this.f4309g - 2) * this.f4307e)));
        } else {
            measureChild(childAt, ffx.a(ffx.d(i)), ffx.a(ffx.d(i2) - ((this.f4309g - 2) * this.f4307e)));
        }
        this.f4311i.x = childAt.getMeasuredWidth();
        this.f4311i.y = childAt.getMeasuredHeight();
        super.onMeasure(ffx.b(this.f4311i.x + getPaddingLeft() + getPaddingRight()), ffx.b(this.f4311i.y + ((this.f4309g - 2) * this.f4307e) + getPaddingTop() + getPaddingBottom()));
    }

    @Override // android.widget.AdapterView
    public void setAdapter(wp1 wp1Var) {
        wp1 wp1Var2 = this.f4303a;
        if (wp1Var2 != null) {
            wp1Var2.unregisterDataSetObserver(this.f4306d);
        }
        this.f4303a = wp1Var;
        if (wp1Var != null) {
            wp1Var.registerDataSetObserver(this.f4306d);
        }
        m7136n();
    }

    public void setAllowUpSwipe(boolean z) {
        this.f4318p = z;
    }

    public void setDisplayedCount(int i) {
        this.f4309g = i;
    }

    public void setRenderCardCount(int i) {
        this.f4316n = i;
    }

    @Override // android.widget.AdapterView
    public void setSelection(int i) {
    }

    @Override // android.widget.AdapterView
    public wp1 getAdapter() {
        return this.f4303a;
    }

    /* JADX INFO: renamed from: j */
    public void m7132j(@NonNull Stack<T> stack, @NonNull wp1 wp1Var) {
    }

    public VSwipeStack(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4304b = new Stack<>();
        this.f4305c = new Stack<>();
        this.f4306d = new C0191a();
        this.f4307e = t100.d(6.0f);
        this.f4308f = 0.0225f;
        this.f4309g = 4;
        this.f4310h = 0.0f;
        this.f4312j = new ArrayList<>();
        this.f4313k = false;
        this.f4314l = false;
        this.f4315m = 0;
        this.f4316n = le7.a() ? 3 : this.f4309g;
        this.f4317o = -1.0d;
        this.f4318p = false;
        this.f4322t = 0;
        this.f4323u = new ArrayDeque();
    }

    public VSwipeStack(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4304b = new Stack<>();
        this.f4305c = new Stack<>();
        this.f4306d = new C0191a();
        this.f4307e = t100.d(6.0f);
        this.f4308f = 0.0225f;
        this.f4309g = 4;
        this.f4310h = 0.0f;
        this.f4312j = new ArrayList<>();
        this.f4313k = false;
        this.f4314l = false;
        this.f4315m = 0;
        this.f4316n = le7.a() ? 3 : this.f4309g;
        this.f4317o = -1.0d;
        this.f4318p = false;
        this.f4322t = 0;
        this.f4323u = new ArrayDeque();
    }
}
