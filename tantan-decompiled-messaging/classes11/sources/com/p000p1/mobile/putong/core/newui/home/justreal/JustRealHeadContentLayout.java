package com.p000p1.mobile.putong.core.newui.home.justreal;

import android.animation.LayoutTransition;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreJustVerificationCardApi;
import com.p1.mobile.putong.core.ui.VText_Default_Bold;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import l.brq;
import l.e30;
import l.j760;
import l.mkd0;
import l.t100;
import l.xdl0;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class JustRealHeadContentLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VText_Default_Bold f1863a;

    /* JADX INFO: renamed from: b */
    public VLinear f1864b;

    /* JADX INFO: renamed from: c */
    public VText_Default_Bold f1865c;

    /* JADX INFO: renamed from: d */
    public JustRealNumContentLayout f1866d;

    /* JADX INFO: renamed from: e */
    public VText_Default_Bold f1867e;

    /* JADX INFO: renamed from: f */
    public VText_Default_Bold f1868f;

    /* JADX INFO: renamed from: g */
    public VText_Default_Bold f1869g;

    /* JADX INFO: renamed from: h */
    public j760<CoreJustVerificationCardApi.JustRealStatus, Integer> f1870h;

    /* JADX INFO: renamed from: i */
    public List<C0170c> f1871i;

    /* JADX INFO: renamed from: j */
    public HashMap<CoreJustVerificationCardApi.JustRealStatus, List<C0169b>> f1872j;

    /* JADX INFO: renamed from: k */
    public ValueAnimator f1873k;

    /* JADX INFO: renamed from: l */
    public float f1874l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.justreal.JustRealHeadContentLayout$a */
    public class C0168a implements ValueAnimator.AnimatorUpdateListener {
        public C0168a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            JustRealHeadContentLayout.this.m2638h(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.justreal.JustRealHeadContentLayout$c */
    public static class C0170c {

        /* JADX INFO: renamed from: a */
        public View f1880a;

        /* JADX INFO: renamed from: b */
        public C0169b f1881b = new C0169b();

        /* JADX INFO: renamed from: c */
        public C0169b f1882c = new C0169b();

        /* JADX INFO: renamed from: d */
        public C0169b f1883d = new C0169b();

        /* JADX INFO: renamed from: e */
        public C0169b f1884e = new C0169b();

        public C0170c(View view) {
            this.f1880a = view;
        }

        /* JADX INFO: renamed from: a */
        public void m2643a() {
            this.f1880a.setAlpha(this.f1881b.f1876a);
            this.f1880a.setTranslationY(this.f1881b.f1877b);
            this.f1880a.setTranslationX(this.f1881b.f1879d);
        }
    }

    public JustRealHeadContentLayout(@NonNull Context context) {
        super(context);
        this.f1871i = new ArrayList();
        this.f1874l = t100.d(10.0f);
    }

    /* JADX INFO: renamed from: c */
    public final void m2633c(View view) {
        brq.a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final void m2634d(CoreJustVerificationCardApi.JustRealStatus justRealStatus) {
        ValueAnimator valueAnimator = this.f1873k;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f1873k.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f1873k = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f1873k.addUpdateListener(new C0168a());
        this.f1873k.start();
    }

    /* JADX INFO: renamed from: e */
    public final List<C0169b> m2635e(j760<CoreJustVerificationCardApi.JustRealStatus, Integer> j760Var) {
        ArrayList arrayList = new ArrayList();
        Iterator<C0169b> it = this.f1872j.get(j760Var.a).iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().m2641a());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public final void m2636f() {
        this.f1872j = new HashMap<>();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0169b(1.0f, 0.0f, true));
        arrayList.add(new C0169b(0.0f, 0.0f, false));
        arrayList.add(new C0169b(1.0f, 0.0f, true));
        this.f1872j.put(CoreJustVerificationCardApi.JustRealStatus.IDLE, arrayList);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C0169b(1.0f, 0.0f, true));
        arrayList2.add(new C0169b(1.0f, 0.0f, false));
        arrayList2.add(new C0169b(1.0f, 0.0f, true));
        this.f1872j.put(CoreJustVerificationCardApi.JustRealStatus.PRE_START, arrayList2);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(new C0169b(1.0f, 0.0f, true));
        arrayList3.add(new C0169b(1.0f, 0.0f, false));
        arrayList3.add(new C0169b(1.0f, 0.0f, true));
        this.f1872j.put(CoreJustVerificationCardApi.JustRealStatus.TRIALING, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(new C0169b(1.0f, 0.0f, false));
        arrayList4.add(new C0169b(1.0f, 0.0f, false));
        arrayList4.add(new C0169b(1.0f, 0.0f, false));
        this.f1872j.put(CoreJustVerificationCardApi.JustRealStatus.RUNNING, arrayList4);
        this.f1872j.put(CoreJustVerificationCardApi.JustRealStatus.CLICK_RUNNING, arrayList4);
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(new C0169b(1.0f, 0.0f, true));
        arrayList5.add(new C0169b(0.0f, 0.0f, false));
        arrayList5.add(new C0169b(1.0f, 0.0f, true));
        this.f1872j.put(CoreJustVerificationCardApi.JustRealStatus.FINISH, arrayList5);
    }

    /* JADX INFO: renamed from: h */
    public final void m2638h(float f) {
        for (C0170c c0170c : this.f1871i) {
            C0169b c0169b = c0170c.f1881b;
            C0169b c0169b2 = c0170c.f1883d;
            float f2 = c0169b2.f1876a;
            C0169b c0169b3 = c0170c.f1884e;
            c0169b.f1876a = f2 + ((c0169b3.f1876a - f2) * f);
            float f3 = c0169b2.f1877b;
            c0169b.f1877b = f3 + ((c0169b3.f1877b - f3) * f);
            float f4 = c0169b2.f1879d;
            c0169b.f1879d = f4 + ((c0169b3.f1879d - f4) * f);
            c0170c.m2643a();
        }
    }

    /* JADX INFO: renamed from: i */
    public void m2639i(Act act) {
        j760<CoreJustVerificationCardApi.JustRealStatus, Integer> j760VarK3 = CoreModule.c.z2.k3();
        this.f1868f.setText(String.valueOf(j760VarK3.b));
        this.f1867e.setText(String.valueOf(j760VarK3.b));
        m2637g(j760VarK3);
        act.duringCreated(CoreModule.c.z2.m3().distinctUntilChanged().skip(1)).subscribe(mkd0.G(new e30() { // from class: l.arq
            public final void call(Object obj) {
                this.f9658a.m2637g((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void m2637g(j760<CoreJustVerificationCardApi.JustRealStatus, Integer> j760Var) {
        this.f1868f.setText(this.f1867e.getText());
        this.f1867e.setText(String.valueOf(j760Var.b));
        this.f1868f.measure(View.MeasureSpec.makeMeasureSpec(xdl0.y0(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(t100.d(30.0f), Integer.MIN_VALUE));
        this.f1867e.measure(View.MeasureSpec.makeMeasureSpec(xdl0.y0(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(t100.d(30.0f), Integer.MIN_VALUE));
        List<C0169b> listM2635e = m2635e(j760Var);
        for (int i = 0; i < this.f1871i.size(); i++) {
            C0170c c0170c = this.f1871i.get(i);
            c0170c.f1882c.m2642b(listM2635e.get(i));
            if (this.f1870h == null) {
                c0170c.f1881b.m2642b(c0170c.f1882c);
                c0170c.m2643a();
            } else {
                c0170c.f1883d.m2642b(c0170c.f1881b);
                c0170c.f1884e.m2642b(c0170c.f1882c);
                C0169b c0169b = c0170c.f1881b;
                c0169b.f1879d = 0.0f;
                C0169b c0169b2 = c0170c.f1883d;
                if (c0169b2.f1878c != c0170c.f1884e.f1878c) {
                    c0169b.f1878c = c0170c.f1882c.f1878c;
                }
                VText_Default_Bold vText_Default_Bold = c0170c.f1880a;
                VText_Default_Bold vText_Default_Bold2 = this.f1867e;
                if (vText_Default_Bold == vText_Default_Bold2) {
                    boolean zEquals = TextUtils.equals(vText_Default_Bold2.getText(), this.f1868f.getText());
                    C0169b c0169b3 = c0170c.f1883d;
                    if (zEquals) {
                        c0169b3.f1877b = 0.0f;
                        c0169b3.f1876a = 1.0f;
                        C0169b c0169b4 = c0170c.f1884e;
                        c0169b4.f1877b = 0.0f;
                        c0169b4.f1876a = 1.0f;
                    } else {
                        c0169b3.f1877b = this.f1874l;
                        c0169b3.f1876a = 0.0f;
                        C0169b c0169b5 = c0170c.f1884e;
                        c0169b5.f1877b = 0.0f;
                        c0169b5.f1876a = 1.0f;
                    }
                } else {
                    VText_Default_Bold vText_Default_Bold3 = this.f1868f;
                    if (vText_Default_Bold == vText_Default_Bold3) {
                        boolean zEquals2 = TextUtils.equals(vText_Default_Bold2.getText(), this.f1868f.getText());
                        C0169b c0169b6 = c0170c.f1883d;
                        if (zEquals2) {
                            c0169b6.f1877b = 0.0f;
                            c0169b6.f1876a = 0.0f;
                            C0169b c0169b7 = c0170c.f1884e;
                            c0169b7.f1877b = 0.0f;
                            c0169b7.f1876a = 0.0f;
                        } else {
                            c0169b6.f1877b = 0.0f;
                            c0169b6.f1876a = 1.0f;
                            C0169b c0169b8 = c0170c.f1884e;
                            c0169b8.f1877b = -this.f1874l;
                            c0169b8.f1876a = 0.0f;
                        }
                    } else if (vText_Default_Bold == this.f1869g) {
                        c0169b2.f1879d = vText_Default_Bold3.getMeasuredWidth() - this.f1867e.getMeasuredWidth();
                        c0170c.f1884e.f1879d = 0.0f;
                    }
                }
            }
        }
        if (this.f1870h != null) {
            m2634d((CoreJustVerificationCardApi.JustRealStatus) j760Var.a);
        }
        this.f1870h = j760Var;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2633c(this);
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(500L);
        this.f1864b.setLayoutTransition(layoutTransition);
        this.f1871i.add(new C0170c(this.f1867e));
        this.f1871i.add(new C0170c(this.f1868f));
        this.f1871i.add(new C0170c(this.f1869g));
        m2636f();
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.justreal.JustRealHeadContentLayout$b */
    public static class C0169b {

        /* JADX INFO: renamed from: a */
        public float f1876a;

        /* JADX INFO: renamed from: b */
        public float f1877b;

        /* JADX INFO: renamed from: c */
        public boolean f1878c;

        /* JADX INFO: renamed from: d */
        public float f1879d;

        public C0169b(float f, float f2, boolean z) {
            this.f1876a = f;
            this.f1877b = f2;
            this.f1878c = z;
        }

        /* JADX INFO: renamed from: a */
        public C0169b m2641a() {
            return new C0169b(this.f1876a, this.f1877b, this.f1878c);
        }

        /* JADX INFO: renamed from: b */
        public void m2642b(C0169b c0169b) {
            this.f1876a = c0169b.f1876a;
            this.f1877b = c0169b.f1877b;
            this.f1878c = c0169b.f1878c;
        }

        public C0169b() {
        }
    }

    public JustRealHeadContentLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1871i = new ArrayList();
        this.f1874l = t100.d(10.0f);
    }

    public JustRealHeadContentLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1871i = new ArrayList();
        this.f1874l = t100.d(10.0f);
    }

    public JustRealHeadContentLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f1871i = new ArrayList();
        this.f1874l = t100.d(10.0f);
    }
}
