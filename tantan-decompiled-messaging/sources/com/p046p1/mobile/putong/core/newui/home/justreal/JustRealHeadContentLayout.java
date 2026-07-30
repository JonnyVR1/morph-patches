package com.p046p1.mobile.putong.core.newui.home.justreal;

import android.animation.LayoutTransition;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreJustVerificationCardApi;
import com.p046p1.mobile.putong.core.p053ui.VText_Default_Bold;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p147v.VLinear;
import p149l.brq;
import p149l.e30;
import p149l.j760;
import p149l.mkd0;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class JustRealHeadContentLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VText_Default_Bold f23085a;

    /* JADX INFO: renamed from: b */
    public VLinear f23086b;

    /* JADX INFO: renamed from: c */
    public VText_Default_Bold f23087c;

    /* JADX INFO: renamed from: d */
    public JustRealNumContentLayout f23088d;

    /* JADX INFO: renamed from: e */
    public VText_Default_Bold f23089e;

    /* JADX INFO: renamed from: f */
    public VText_Default_Bold f23090f;

    /* JADX INFO: renamed from: g */
    public VText_Default_Bold f23091g;

    /* JADX INFO: renamed from: h */
    public j760<CoreJustVerificationCardApi.JustRealStatus, Integer> f23092h;

    /* JADX INFO: renamed from: i */
    public List<C8006c> f23093i;

    /* JADX INFO: renamed from: j */
    public HashMap<CoreJustVerificationCardApi.JustRealStatus, List<C8005b>> f23094j;

    /* JADX INFO: renamed from: k */
    public ValueAnimator f23095k;

    /* JADX INFO: renamed from: l */
    public float f23096l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.justreal.JustRealHeadContentLayout$a */
    public class C8004a implements ValueAnimator.AnimatorUpdateListener {
        public C8004a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            JustRealHeadContentLayout.this.m38652h(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.justreal.JustRealHeadContentLayout$c */
    public static class C8006c {

        /* JADX INFO: renamed from: a */
        public View f23102a;

        /* JADX INFO: renamed from: b */
        public C8005b f23103b = new C8005b();

        /* JADX INFO: renamed from: c */
        public C8005b f23104c = new C8005b();

        /* JADX INFO: renamed from: d */
        public C8005b f23105d = new C8005b();

        /* JADX INFO: renamed from: e */
        public C8005b f23106e = new C8005b();

        public C8006c(View view) {
            this.f23102a = view;
        }

        /* JADX INFO: renamed from: a */
        public void m38657a() {
            this.f23102a.setAlpha(this.f23103b.f23098a);
            this.f23102a.setTranslationY(this.f23103b.f23099b);
            this.f23102a.setTranslationX(this.f23103b.f23101d);
        }
    }

    public JustRealHeadContentLayout(@NonNull Context context) {
        super(context);
        this.f23093i = new ArrayList();
        this.f23096l = t100.m186890d(10.0f);
    }

    /* JADX INFO: renamed from: c */
    public final void m38647c(View view) {
        brq.m103597a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final void m38648d(CoreJustVerificationCardApi.JustRealStatus justRealStatus) {
        ValueAnimator valueAnimator = this.f23095k;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f23095k.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f23095k = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f23095k.addUpdateListener(new C8004a());
        this.f23095k.start();
    }

    /* JADX INFO: renamed from: e */
    public final List<C8005b> m38649e(j760<CoreJustVerificationCardApi.JustRealStatus, Integer> j760Var) {
        ArrayList arrayList = new ArrayList();
        Iterator<C8005b> it = this.f23094j.get(j760Var.f116564a).iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().m38655a());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public final void m38650f() {
        this.f23094j = new HashMap<>();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C8005b(1.0f, 0.0f, true));
        arrayList.add(new C8005b(0.0f, 0.0f, false));
        arrayList.add(new C8005b(1.0f, 0.0f, true));
        this.f23094j.put(CoreJustVerificationCardApi.JustRealStatus.IDLE, arrayList);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C8005b(1.0f, 0.0f, true));
        arrayList2.add(new C8005b(1.0f, 0.0f, false));
        arrayList2.add(new C8005b(1.0f, 0.0f, true));
        this.f23094j.put(CoreJustVerificationCardApi.JustRealStatus.PRE_START, arrayList2);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(new C8005b(1.0f, 0.0f, true));
        arrayList3.add(new C8005b(1.0f, 0.0f, false));
        arrayList3.add(new C8005b(1.0f, 0.0f, true));
        this.f23094j.put(CoreJustVerificationCardApi.JustRealStatus.TRIALING, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(new C8005b(1.0f, 0.0f, false));
        arrayList4.add(new C8005b(1.0f, 0.0f, false));
        arrayList4.add(new C8005b(1.0f, 0.0f, false));
        this.f23094j.put(CoreJustVerificationCardApi.JustRealStatus.RUNNING, arrayList4);
        this.f23094j.put(CoreJustVerificationCardApi.JustRealStatus.CLICK_RUNNING, arrayList4);
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(new C8005b(1.0f, 0.0f, true));
        arrayList5.add(new C8005b(0.0f, 0.0f, false));
        arrayList5.add(new C8005b(1.0f, 0.0f, true));
        this.f23094j.put(CoreJustVerificationCardApi.JustRealStatus.FINISH, arrayList5);
    }

    /* JADX INFO: renamed from: h */
    public final void m38652h(float f) {
        for (C8006c c8006c : this.f23093i) {
            C8005b c8005b = c8006c.f23103b;
            C8005b c8005b2 = c8006c.f23105d;
            float f2 = c8005b2.f23098a;
            C8005b c8005b3 = c8006c.f23106e;
            c8005b.f23098a = f2 + ((c8005b3.f23098a - f2) * f);
            float f3 = c8005b2.f23099b;
            c8005b.f23099b = f3 + ((c8005b3.f23099b - f3) * f);
            float f4 = c8005b2.f23101d;
            c8005b.f23101d = f4 + ((c8005b3.f23101d - f4) * f);
            c8006c.m38657a();
        }
    }

    /* JADX INFO: renamed from: i */
    public void m38653i(Act act) {
        j760<CoreJustVerificationCardApi.JustRealStatus, Integer> j760VarM30248k3 = CoreModule.f17545c.f19704z2.m30248k3();
        this.f23090f.setText(String.valueOf(j760VarM30248k3.f116565b));
        this.f23089e.setText(String.valueOf(j760VarM30248k3.f116565b));
        m38651g(j760VarM30248k3);
        act.duringCreated(CoreModule.f17545c.f19704z2.m30250m3().distinctUntilChanged().skip(1)).subscribe(mkd0.m154955G(new e30() { // from class: l.arq
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f71336a.m38651g((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void m38651g(j760<CoreJustVerificationCardApi.JustRealStatus, Integer> j760Var) {
        this.f23090f.setText(this.f23089e.getText());
        this.f23089e.setText(String.valueOf(j760Var.f116565b));
        this.f23090f.measure(View.MeasureSpec.makeMeasureSpec(xdl0.m208412y0(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(t100.m186890d(30.0f), Integer.MIN_VALUE));
        this.f23089e.measure(View.MeasureSpec.makeMeasureSpec(xdl0.m208412y0(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(t100.m186890d(30.0f), Integer.MIN_VALUE));
        List<C8005b> listM38649e = m38649e(j760Var);
        for (int i = 0; i < this.f23093i.size(); i++) {
            C8006c c8006c = this.f23093i.get(i);
            c8006c.f23104c.m38656b(listM38649e.get(i));
            if (this.f23092h == null) {
                c8006c.f23103b.m38656b(c8006c.f23104c);
                c8006c.m38657a();
            } else {
                c8006c.f23105d.m38656b(c8006c.f23103b);
                c8006c.f23106e.m38656b(c8006c.f23104c);
                C8005b c8005b = c8006c.f23103b;
                c8005b.f23101d = 0.0f;
                C8005b c8005b2 = c8006c.f23105d;
                if (c8005b2.f23100c != c8006c.f23106e.f23100c) {
                    c8005b.f23100c = c8006c.f23104c.f23100c;
                }
                View view = c8006c.f23102a;
                VText_Default_Bold vText_Default_Bold = this.f23089e;
                if (view == vText_Default_Bold) {
                    boolean zEquals = TextUtils.equals(vText_Default_Bold.getText(), this.f23090f.getText());
                    C8005b c8005b3 = c8006c.f23105d;
                    if (zEquals) {
                        c8005b3.f23099b = 0.0f;
                        c8005b3.f23098a = 1.0f;
                        C8005b c8005b4 = c8006c.f23106e;
                        c8005b4.f23099b = 0.0f;
                        c8005b4.f23098a = 1.0f;
                    } else {
                        c8005b3.f23099b = this.f23096l;
                        c8005b3.f23098a = 0.0f;
                        C8005b c8005b5 = c8006c.f23106e;
                        c8005b5.f23099b = 0.0f;
                        c8005b5.f23098a = 1.0f;
                    }
                } else {
                    VText_Default_Bold vText_Default_Bold2 = this.f23090f;
                    if (view == vText_Default_Bold2) {
                        boolean zEquals2 = TextUtils.equals(vText_Default_Bold.getText(), this.f23090f.getText());
                        C8005b c8005b6 = c8006c.f23105d;
                        if (zEquals2) {
                            c8005b6.f23099b = 0.0f;
                            c8005b6.f23098a = 0.0f;
                            C8005b c8005b7 = c8006c.f23106e;
                            c8005b7.f23099b = 0.0f;
                            c8005b7.f23098a = 0.0f;
                        } else {
                            c8005b6.f23099b = 0.0f;
                            c8005b6.f23098a = 1.0f;
                            C8005b c8005b8 = c8006c.f23106e;
                            c8005b8.f23099b = -this.f23096l;
                            c8005b8.f23098a = 0.0f;
                        }
                    } else if (view == this.f23091g) {
                        c8005b2.f23101d = vText_Default_Bold2.getMeasuredWidth() - this.f23089e.getMeasuredWidth();
                        c8006c.f23106e.f23101d = 0.0f;
                    }
                }
            }
        }
        if (this.f23092h != null) {
            m38648d(j760Var.f116564a);
        }
        this.f23092h = j760Var;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m38647c(this);
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(500L);
        this.f23086b.setLayoutTransition(layoutTransition);
        this.f23093i.add(new C8006c(this.f23089e));
        this.f23093i.add(new C8006c(this.f23090f));
        this.f23093i.add(new C8006c(this.f23091g));
        m38650f();
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.justreal.JustRealHeadContentLayout$b */
    public static class C8005b {

        /* JADX INFO: renamed from: a */
        public float f23098a;

        /* JADX INFO: renamed from: b */
        public float f23099b;

        /* JADX INFO: renamed from: c */
        public boolean f23100c;

        /* JADX INFO: renamed from: d */
        public float f23101d;

        public C8005b(float f, float f2, boolean z) {
            this.f23098a = f;
            this.f23099b = f2;
            this.f23100c = z;
        }

        /* JADX INFO: renamed from: a */
        public C8005b m38655a() {
            return new C8005b(this.f23098a, this.f23099b, this.f23100c);
        }

        /* JADX INFO: renamed from: b */
        public void m38656b(C8005b c8005b) {
            this.f23098a = c8005b.f23098a;
            this.f23099b = c8005b.f23099b;
            this.f23100c = c8005b.f23100c;
        }

        public C8005b() {
        }
    }

    public JustRealHeadContentLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23093i = new ArrayList();
        this.f23096l = t100.m186890d(10.0f);
    }

    public JustRealHeadContentLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23093i = new ArrayList();
        this.f23096l = t100.m186890d(10.0f);
    }

    public JustRealHeadContentLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f23093i = new ArrayList();
        this.f23096l = t100.m186890d(10.0f);
    }
}
