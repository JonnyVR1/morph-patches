package com.p046p1.mobile.putong.live.base.view;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.live.base.view.RollAnimView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VFrame;
import p149l.bt0;
import p149l.f30;
import p149l.mqv;
import p149l.n9c0;
import p149l.t100;
import p149l.vwb;
import p149l.w9j;

/* JADX INFO: loaded from: classes13.dex */
public class RollAnimView<T> extends VFrame {

    /* JADX INFO: renamed from: a */
    public int f44798a;

    /* JADX INFO: renamed from: b */
    public final float f44799b;

    /* JADX INFO: renamed from: c */
    public int f44800c;

    /* JADX INFO: renamed from: d */
    public int f44801d;

    /* JADX INFO: renamed from: e */
    public float f44802e;

    /* JADX INFO: renamed from: f */
    public ArrayList<C12482a<T>> f44803f;

    /* JADX INFO: renamed from: g */
    public Animator f44804g;

    /* JADX INFO: renamed from: h */
    public Animator f44805h;

    /* JADX INFO: renamed from: i */
    public Animator f44806i;

    /* JADX INFO: renamed from: j */
    public final float f44807j;

    /* JADX INFO: renamed from: k */
    public List<mqv<T>> f44808k;

    /* JADX INFO: renamed from: l */
    public RollAnimView<T>.RunnableC12483b f44809l;

    /* JADX INFO: renamed from: m */
    public double f44810m;

    /* JADX INFO: renamed from: n */
    public int f44811n;

    /* JADX INFO: renamed from: o */
    public final boolean f44812o;

    /* JADX INFO: renamed from: p */
    public final boolean f44813p;

    /* JADX INFO: renamed from: q */
    public int f44814q;

    /* JADX INFO: renamed from: r */
    public int f44815r;

    /* JADX INFO: renamed from: s */
    public f30<Integer, Integer> f44816s;

    /* JADX INFO: renamed from: t */
    public w9j<mqv<T>, RollItemView<T>> f44817t;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.view.RollAnimView$a */
    public static class C12482a<T> {

        /* JADX INFO: renamed from: a */
        public int f44818a;

        /* JADX INFO: renamed from: b */
        public int f44819b;

        /* JADX INFO: renamed from: c */
        public RollItemView<T> f44820c;

        public C12482a() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.view.RollAnimView$b */
    public class RunnableC12483b implements Runnable {
        public RunnableC12483b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RollAnimView.this.m68831N();
            RollAnimView rollAnimView = RollAnimView.this;
            rollAnimView.postDelayed(this, rollAnimView.f44811n);
        }
    }

    public RollAnimView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f44808k = new ArrayList();
        this.f44810m = 1.0d;
        this.f44811n = 2000;
        this.f44814q = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n9c0.f137747O);
        this.f44800c = typedArrayObtainStyledAttributes.getInt(n9c0.f137751S, 3);
        this.f44799b = typedArrayObtainStyledAttributes.getDimensionPixelSize(n9c0.f137752T, t100.m186890d(8.0f));
        this.f44807j = typedArrayObtainStyledAttributes.getInt(n9c0.f137750R, 30);
        this.f44812o = typedArrayObtainStyledAttributes.getBoolean(n9c0.f137749Q, false);
        this.f44813p = typedArrayObtainStyledAttributes.getBoolean(n9c0.f137748P, false);
        typedArrayObtainStyledAttributes.recycle();
        m68823B();
        m68819r();
    }

    private mqv<T> getNextUser() {
        List<mqv<T>> list = this.f44808k;
        if (list == null) {
            return null;
        }
        int i = this.f44814q + 1;
        this.f44814q = i;
        if (i >= list.size()) {
            this.f44814q = 0;
        }
        if (NullChecker.m81303a(this.f44816s)) {
            this.f44816s.call(Integer.valueOf(this.f44814q), Integer.valueOf(this.f44808k.size()));
        }
        return this.f44808k.get(this.f44814q);
    }

    /* JADX INFO: renamed from: r */
    private void m68819r() {
        m68834w(this.f44805h, this.f44804g, this.f44806i);
        setChildrenDrawingOrderEnabled(true);
        this.f44803f = new ArrayList<>();
        removeAllViews();
    }

    /* JADX INFO: renamed from: B */
    public final void m68823B() {
        int iM186890d = t100.m186890d(this.f44807j);
        this.f44798a = iM186890d;
        int i = this.f44800c;
        this.f44801d = i + 1;
        this.f44802e = (iM186890d * i) - ((i - 1) * this.f44799b);
        this.f44814q = i - 1;
        this.f44809l = new RunnableC12483b();
    }

    /* JADX INFO: renamed from: C */
    public boolean m68824C() {
        return true;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Boolean m68825E(int i, C12482a c12482a) {
        return Boolean.valueOf(this.f44800c - c12482a.f44818a == i);
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m68826F(RollItemView rollItemView) {
        if (this.f44813p) {
            rollItemView.setScaleX(1.0f);
            rollItemView.setScaleY(1.0f);
        }
        setChildrenDrawingOrderEnabled(true);
        requestLayout();
    }

    /* JADX INFO: renamed from: G */
    public void m68827G(mqv<T> mqvVar, boolean z) {
        if (this.f44803f.size() < this.f44801d) {
            RollItemView<T> rollItemViewCall = this.f44817t.call(mqvVar);
            C12482a<T> c12482a = new C12482a<>();
            c12482a.f44820c = rollItemViewCall;
            c12482a.f44818a = this.f44803f.size();
            c12482a.f44819b = this.f44803f.size();
            int i = this.f44798a;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
            this.f44803f.add(c12482a);
            addView(rollItemViewCall, layoutParams);
            if (this.f44803f.size() == 1) {
                rollItemViewCall.setAlpha(1.0f);
            } else if (z) {
                rollItemViewCall.setAlpha(0.0f);
                m68828K(rollItemViewCall);
            } else if (this.f44803f.size() == this.f44801d) {
                rollItemViewCall.setAlpha(0.0f);
            } else {
                rollItemViewCall.setTranslationX(m68835z(c12482a.f44818a));
            }
            if (z) {
                if (this.f44803f.size() != this.f44801d) {
                    for (int i2 = 0; i2 < this.f44803f.size() - 1; i2++) {
                        m68830M(this.f44803f.get(i2).f44820c);
                    }
                } else {
                    m68829L(this.f44803f.get(0).f44820c);
                    for (int i3 = 1; i3 < this.f44800c; i3++) {
                        m68830M(this.f44803f.get(i3).f44820c);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m68828K(View view) {
        float fM68835z = m68835z(this.f44801d - 1);
        Animator animatorM103751x = bt0.m103751x((long) (this.f44810m * 400.0d), bt0.m103741n(view, View.ALPHA, 0.0f, 1.0f), bt0.m103741n(view, View.TRANSLATION_X, fM68835z, (fM68835z - this.f44798a) + this.f44799b));
        this.f44804g = animatorM103751x;
        animatorM103751x.start();
    }

    /* JADX INFO: renamed from: L */
    public final void m68829L(final RollItemView<T> rollItemView) {
        this.f44806i = bt0.m103741n(rollItemView, View.ALPHA, 1.0f, 0.0f);
        if (this.f44812o) {
            this.f44806i = bt0.m103753z(this.f44806i, bt0.m103741n(rollItemView, View.TRANSLATION_X, 0.0f, (-this.f44798a) + this.f44799b));
        }
        if (this.f44813p) {
            this.f44806i = bt0.m103753z(this.f44806i, bt0.m103741n(rollItemView, bt0.f77162i, 1.0f, 0.72f));
        }
        this.f44806i.setDuration((long) (this.f44810m * 300.0d));
        bt0.m103733f(this.f44806i, new Runnable() { // from class: l.h5d0
            @Override // java.lang.Runnable
            public final void run() {
                this.f105943a.m68826F(rollItemView);
            }
        }).start();
    }

    /* JADX INFO: renamed from: M */
    public final void m68830M(View view) {
        Animator animatorM103741n = bt0.m103741n(view, View.TRANSLATION_X, view.getTranslationX(), (view.getTranslationX() - this.f44798a) + this.f44799b);
        this.f44805h = animatorM103741n;
        animatorM103741n.setDuration((long) (this.f44810m * 400.0d));
        this.f44805h.start();
    }

    /* JADX INFO: renamed from: N */
    public void m68831N() {
        if (NullChecker.m81303a(this.f44805h) && this.f44805h.isRunning()) {
            return;
        }
        if ((NullChecker.m81303a(this.f44804g) && this.f44804g.isRunning()) || vwb.m200296J(this.f44808k)) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
        for (int i = 0; i < this.f44803f.size(); i++) {
            C12482a<T> c12482a = this.f44803f.get(i);
            int i2 = c12482a.f44818a;
            int i3 = this.f44800c;
            int i4 = (i2 + i3) % this.f44801d;
            c12482a.f44818a = i4;
            if (i4 == i3) {
                m68829L(c12482a.f44820c);
            } else if (i4 == i3 - 1) {
                mqv<T> nextUser = getNextUser();
                if (NullChecker.m81303a(nextUser)) {
                    c12482a.f44820c.mo68836a(nextUser);
                    m68828K(c12482a.f44820c);
                }
            } else {
                m68830M(c12482a.f44820c);
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public void m68832O() {
        List<mqv<T>> list;
        reset();
        m68823B();
        int i = 0;
        while (true) {
            int i2 = this.f44801d;
            list = this.f44808k;
            if (i >= i2) {
                break;
            }
            m68827G(i < list.size() ? this.f44808k.get(i) : null, false);
            i++;
        }
        if (list.size() > this.f44800c) {
            RollAnimView<T>.RunnableC12483b runnableC12483b = this.f44809l;
            int i3 = this.f44815r;
            if (i3 <= 0) {
                i3 = this.f44811n;
            }
            postDelayed(runnableC12483b, i3);
        }
    }

    /* JADX INFO: renamed from: P */
    public void m68833P() {
        removeCallbacks(this.f44809l);
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, final int i2) {
        if (i2 > this.f44803f.size()) {
            return i2;
        }
        boolean zM68824C = m68824C();
        ArrayList<C12482a<T>> arrayList = this.f44803f;
        return zM68824C ? ((C12482a) vwb.m200346r(arrayList, new w9j() { // from class: l.f5d0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((RollAnimView.C12482a) obj).f44818a == i2);
            }
        })).f44819b : ((C12482a) vwb.m200346r(arrayList, new w9j() { // from class: l.g5d0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f101117a.m68825E(i2, (RollAnimView.C12482a) obj);
            }
        })).f44819b;
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
            int i6 = this.f44798a;
            childAt.layout(0, 0, i6, i6);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec((int) this.f44802e, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.f44798a, Integer.MIN_VALUE));
    }

    public void reset() {
        removeAllViews();
        this.f44803f = new ArrayList<>();
        m68834w(this.f44805h, this.f44804g, this.f44806i);
        m68833P();
    }

    public void setDelay(int i) {
        this.f44815r = i;
    }

    public void setItemViewFunc(w9j<mqv<T>, RollItemView<T>> w9jVar) {
        this.f44817t = w9jVar;
    }

    public void setNextAction(f30<Integer, Integer> f30Var) {
        this.f44816s = f30Var;
    }

    public void setSpeedUpRate(double d) {
        this.f44810m = d;
        this.f44811n = (int) (((double) this.f44811n) * d);
    }

    public void setUsers(List<mqv<T>> list) {
        this.f44808k = list;
    }

    /* JADX INFO: renamed from: w */
    public final void m68834w(Animator... animatorArr) {
        for (Animator animator : animatorArr) {
            if (NullChecker.m81303a(animator) && animator.isRunning()) {
                animator.cancel();
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public final float m68835z(int i) {
        return (this.f44798a * i) - (i * this.f44799b);
    }

    public RollAnimView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RollAnimView(Context context) {
        this(context, null);
    }
}
