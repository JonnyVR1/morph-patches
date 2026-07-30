package com.p051p1.mobile.putong.live.base.view;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.live.base.view.RollAnimView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VFrame;
import p153l.gt0;
import p153l.jyb;
import p153l.nsv;
import p153l.qa00;
import p153l.qcj;
import p153l.thc0;
import p153l.z20;

/* JADX INFO: loaded from: classes13.dex */
public class RollAnimView<T> extends VFrame {

    /* JADX INFO: renamed from: a */
    public int f45646a;

    /* JADX INFO: renamed from: b */
    public final float f45647b;

    /* JADX INFO: renamed from: c */
    public int f45648c;

    /* JADX INFO: renamed from: d */
    public int f45649d;

    /* JADX INFO: renamed from: e */
    public float f45650e;

    /* JADX INFO: renamed from: f */
    public ArrayList<C12645a<T>> f45651f;

    /* JADX INFO: renamed from: g */
    public Animator f45652g;

    /* JADX INFO: renamed from: h */
    public Animator f45653h;

    /* JADX INFO: renamed from: i */
    public Animator f45654i;

    /* JADX INFO: renamed from: j */
    public final float f45655j;

    /* JADX INFO: renamed from: k */
    public List<nsv<T>> f45656k;

    /* JADX INFO: renamed from: l */
    public RollAnimView<T>.RunnableC12646b f45657l;

    /* JADX INFO: renamed from: m */
    public double f45658m;

    /* JADX INFO: renamed from: n */
    public int f45659n;

    /* JADX INFO: renamed from: o */
    public final boolean f45660o;

    /* JADX INFO: renamed from: p */
    public final boolean f45661p;

    /* JADX INFO: renamed from: q */
    public int f45662q;

    /* JADX INFO: renamed from: r */
    public int f45663r;

    /* JADX INFO: renamed from: s */
    public z20<Integer, Integer> f45664s;

    /* JADX INFO: renamed from: t */
    public qcj<nsv<T>, RollItemView<T>> f45665t;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.view.RollAnimView$a */
    public static class C12645a<T> {

        /* JADX INFO: renamed from: a */
        public int f45666a;

        /* JADX INFO: renamed from: b */
        public int f45667b;

        /* JADX INFO: renamed from: c */
        public RollItemView<T> f45668c;

        public C12645a() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.view.RollAnimView$b */
    public class RunnableC12646b implements Runnable {
        public RunnableC12646b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RollAnimView.this.m70014N();
            RollAnimView rollAnimView = RollAnimView.this;
            rollAnimView.postDelayed(this, rollAnimView.f45659n);
        }
    }

    public RollAnimView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f45656k = new ArrayList();
        this.f45658m = 1.0d;
        this.f45659n = 2000;
        this.f45662q = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, thc0.f174305O);
        this.f45648c = typedArrayObtainStyledAttributes.getInt(thc0.f174309S, 3);
        this.f45647b = typedArrayObtainStyledAttributes.getDimensionPixelSize(thc0.f174310T, qa00.m175859d(8.0f));
        this.f45655j = typedArrayObtainStyledAttributes.getInt(thc0.f174308R, 30);
        this.f45660o = typedArrayObtainStyledAttributes.getBoolean(thc0.f174307Q, false);
        this.f45661p = typedArrayObtainStyledAttributes.getBoolean(thc0.f174306P, false);
        typedArrayObtainStyledAttributes.recycle();
        m70006B();
        m70002r();
    }

    private nsv<T> getNextUser() {
        List<nsv<T>> list = this.f45656k;
        if (list == null) {
            return null;
        }
        int i = this.f45662q + 1;
        this.f45662q = i;
        if (i >= list.size()) {
            this.f45662q = 0;
        }
        if (NullChecker.m82486a(this.f45664s)) {
            this.f45664s.call(Integer.valueOf(this.f45662q), Integer.valueOf(this.f45656k.size()));
        }
        return this.f45656k.get(this.f45662q);
    }

    /* JADX INFO: renamed from: r */
    private void m70002r() {
        m70017w(this.f45653h, this.f45652g, this.f45654i);
        setChildrenDrawingOrderEnabled(true);
        this.f45651f = new ArrayList<>();
        removeAllViews();
    }

    /* JADX INFO: renamed from: B */
    public final void m70006B() {
        int iM175859d = qa00.m175859d(this.f45655j);
        this.f45646a = iM175859d;
        int i = this.f45648c;
        this.f45649d = i + 1;
        this.f45650e = (iM175859d * i) - ((i - 1) * this.f45647b);
        this.f45662q = i - 1;
        this.f45657l = new RunnableC12646b();
    }

    /* JADX INFO: renamed from: C */
    public boolean m70007C() {
        return true;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Boolean m70008E(int i, C12645a c12645a) {
        return Boolean.valueOf(this.f45648c - c12645a.f45666a == i);
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m70009F(RollItemView rollItemView) {
        if (this.f45661p) {
            rollItemView.setScaleX(1.0f);
            rollItemView.setScaleY(1.0f);
        }
        setChildrenDrawingOrderEnabled(true);
        requestLayout();
    }

    /* JADX INFO: renamed from: G */
    public void m70010G(nsv<T> nsvVar, boolean z) {
        if (this.f45651f.size() < this.f45649d) {
            RollItemView<T> rollItemViewCall = this.f45665t.call(nsvVar);
            C12645a<T> c12645a = new C12645a<>();
            c12645a.f45668c = rollItemViewCall;
            c12645a.f45666a = this.f45651f.size();
            c12645a.f45667b = this.f45651f.size();
            int i = this.f45646a;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
            this.f45651f.add(c12645a);
            addView(rollItemViewCall, layoutParams);
            if (this.f45651f.size() == 1) {
                rollItemViewCall.setAlpha(1.0f);
            } else if (z) {
                rollItemViewCall.setAlpha(0.0f);
                m70011K(rollItemViewCall);
            } else if (this.f45651f.size() == this.f45649d) {
                rollItemViewCall.setAlpha(0.0f);
            } else {
                rollItemViewCall.setTranslationX(m70018z(c12645a.f45666a));
            }
            if (z) {
                if (this.f45651f.size() != this.f45649d) {
                    for (int i2 = 0; i2 < this.f45651f.size() - 1; i2++) {
                        m70013M(this.f45651f.get(i2).f45668c);
                    }
                } else {
                    m70012L(this.f45651f.get(0).f45668c);
                    for (int i3 = 1; i3 < this.f45648c; i3++) {
                        m70013M(this.f45651f.get(i3).f45668c);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m70011K(View view) {
        float fM70018z = m70018z(this.f45649d - 1);
        Animator animatorM132178x = gt0.m132178x((long) (this.f45658m * 400.0d), gt0.m132168n(view, View.ALPHA, 0.0f, 1.0f), gt0.m132168n(view, View.TRANSLATION_X, fM70018z, (fM70018z - this.f45646a) + this.f45647b));
        this.f45652g = animatorM132178x;
        animatorM132178x.start();
    }

    /* JADX INFO: renamed from: L */
    public final void m70012L(final RollItemView<T> rollItemView) {
        this.f45654i = gt0.m132168n(rollItemView, View.ALPHA, 1.0f, 0.0f);
        if (this.f45660o) {
            this.f45654i = gt0.m132180z(this.f45654i, gt0.m132168n(rollItemView, View.TRANSLATION_X, 0.0f, (-this.f45646a) + this.f45647b));
        }
        if (this.f45661p) {
            this.f45654i = gt0.m132180z(this.f45654i, gt0.m132168n(rollItemView, gt0.f106354i, 1.0f, 0.72f));
        }
        this.f45654i.setDuration((long) (this.f45658m * 300.0d));
        gt0.m132160f(this.f45654i, new Runnable() { // from class: l.kdd0
            @Override // java.lang.Runnable
            public final void run() {
                this.f125224a.m70009F(rollItemView);
            }
        }).start();
    }

    /* JADX INFO: renamed from: M */
    public final void m70013M(View view) {
        Animator animatorM132168n = gt0.m132168n(view, View.TRANSLATION_X, view.getTranslationX(), (view.getTranslationX() - this.f45646a) + this.f45647b);
        this.f45653h = animatorM132168n;
        animatorM132168n.setDuration((long) (this.f45658m * 400.0d));
        this.f45653h.start();
    }

    /* JADX INFO: renamed from: N */
    public void m70014N() {
        if (NullChecker.m82486a(this.f45653h) && this.f45653h.isRunning()) {
            return;
        }
        if ((NullChecker.m82486a(this.f45652g) && this.f45652g.isRunning()) || jyb.m147479J(this.f45656k)) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
        for (int i = 0; i < this.f45651f.size(); i++) {
            C12645a<T> c12645a = this.f45651f.get(i);
            int i2 = c12645a.f45666a;
            int i3 = this.f45648c;
            int i4 = (i2 + i3) % this.f45649d;
            c12645a.f45666a = i4;
            if (i4 == i3) {
                m70012L(c12645a.f45668c);
            } else if (i4 == i3 - 1) {
                nsv<T> nextUser = getNextUser();
                if (NullChecker.m82486a(nextUser)) {
                    c12645a.f45668c.mo70019a(nextUser);
                    m70011K(c12645a.f45668c);
                }
            } else {
                m70013M(c12645a.f45668c);
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public void m70015O() {
        List<nsv<T>> list;
        reset();
        m70006B();
        int i = 0;
        while (true) {
            int i2 = this.f45649d;
            list = this.f45656k;
            if (i >= i2) {
                break;
            }
            m70010G(i < list.size() ? this.f45656k.get(i) : null, false);
            i++;
        }
        if (list.size() > this.f45648c) {
            RollAnimView<T>.RunnableC12646b runnableC12646b = this.f45657l;
            int i3 = this.f45663r;
            if (i3 <= 0) {
                i3 = this.f45659n;
            }
            postDelayed(runnableC12646b, i3);
        }
    }

    /* JADX INFO: renamed from: P */
    public void m70016P() {
        removeCallbacks(this.f45657l);
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, final int i2) {
        if (i2 > this.f45651f.size()) {
            return i2;
        }
        boolean zM70007C = m70007C();
        ArrayList<C12645a<T>> arrayList = this.f45651f;
        return zM70007C ? ((C12645a) jyb.m147529r(arrayList, new qcj() { // from class: l.idd0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((RollAnimView.C12645a) obj).f45666a == i2);
            }
        })).f45667b : ((C12645a) jyb.m147529r(arrayList, new qcj() { // from class: l.jdd0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f120244a.m70008E(i2, (RollAnimView.C12645a) obj);
            }
        })).f45667b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        reset();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            int i6 = this.f45646a;
            childAt.layout(0, 0, i6, i6);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec((int) this.f45650e, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.f45646a, Integer.MIN_VALUE));
    }

    public void reset() {
        removeAllViews();
        this.f45651f = new ArrayList<>();
        m70017w(this.f45653h, this.f45652g, this.f45654i);
        m70016P();
    }

    public void setDelay(int i) {
        this.f45663r = i;
    }

    public void setItemViewFunc(qcj<nsv<T>, RollItemView<T>> qcjVar) {
        this.f45665t = qcjVar;
    }

    public void setNextAction(z20<Integer, Integer> z20Var) {
        this.f45664s = z20Var;
    }

    public void setSpeedUpRate(double d) {
        this.f45658m = d;
        this.f45659n = (int) (((double) this.f45659n) * d);
    }

    public void setUsers(List<nsv<T>> list) {
        this.f45656k = list;
    }

    /* JADX INFO: renamed from: w */
    public final void m70017w(Animator... animatorArr) {
        for (Animator animator : animatorArr) {
            if (NullChecker.m82486a(animator) && animator.isRunning()) {
                animator.cancel();
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public final float m70018z(int i) {
        return (this.f45646a * i) - (i * this.f45647b);
    }

    public RollAnimView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RollAnimView(Context context) {
        this(context, null);
    }
}
