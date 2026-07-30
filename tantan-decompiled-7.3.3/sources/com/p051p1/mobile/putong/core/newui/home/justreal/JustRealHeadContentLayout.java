package com.p051p1.mobile.putong.core.newui.home.justreal;

import android.animation.LayoutTransition;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreJustVerificationCardApi;
import com.p051p1.mobile.putong.core.p058ui.VText_Default_Bold;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p151v.VLinear;
import p153l.bnl0;
import p153l.ctq;
import p153l.pf60;
import p153l.psd0;
import p153l.qa00;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class JustRealHeadContentLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VText_Default_Bold f23827a;

    /* JADX INFO: renamed from: b */
    public VLinear f23828b;

    /* JADX INFO: renamed from: c */
    public VText_Default_Bold f23829c;

    /* JADX INFO: renamed from: d */
    public JustRealNumContentLayout f23830d;

    /* JADX INFO: renamed from: e */
    public VText_Default_Bold f23831e;

    /* JADX INFO: renamed from: f */
    public VText_Default_Bold f23832f;

    /* JADX INFO: renamed from: g */
    public VText_Default_Bold f23833g;

    /* JADX INFO: renamed from: h */
    public pf60<CoreJustVerificationCardApi.JustRealStatus, Integer> f23834h;

    /* JADX INFO: renamed from: i */
    public List<C8157c> f23835i;

    /* JADX INFO: renamed from: j */
    public HashMap<CoreJustVerificationCardApi.JustRealStatus, List<C8156b>> f23836j;

    /* JADX INFO: renamed from: k */
    public ValueAnimator f23837k;

    /* JADX INFO: renamed from: l */
    public float f23838l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.justreal.JustRealHeadContentLayout$a */
    public class C8155a implements ValueAnimator.AnimatorUpdateListener {
        public C8155a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            JustRealHeadContentLayout.this.m39655h(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.justreal.JustRealHeadContentLayout$c */
    public static class C8157c {

        /* JADX INFO: renamed from: a */
        public View f23844a;

        /* JADX INFO: renamed from: b */
        public C8156b f23845b = new C8156b();

        /* JADX INFO: renamed from: c */
        public C8156b f23846c = new C8156b();

        /* JADX INFO: renamed from: d */
        public C8156b f23847d = new C8156b();

        /* JADX INFO: renamed from: e */
        public C8156b f23848e = new C8156b();

        public C8157c(View view) {
            this.f23844a = view;
        }

        /* JADX INFO: renamed from: a */
        public void m39660a() {
            this.f23844a.setAlpha(this.f23845b.f23840a);
            this.f23844a.setTranslationY(this.f23845b.f23841b);
            this.f23844a.setTranslationX(this.f23845b.f23843d);
        }
    }

    public JustRealHeadContentLayout(@NonNull Context context) {
        super(context);
        this.f23835i = new ArrayList();
        this.f23838l = qa00.m175859d(10.0f);
    }

    /* JADX INFO: renamed from: c */
    public final void m39650c(View view) {
        ctq.m112546a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final void m39651d(CoreJustVerificationCardApi.JustRealStatus justRealStatus) {
        ValueAnimator valueAnimator = this.f23837k;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f23837k.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f23837k = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f23837k.addUpdateListener(new C8155a());
        this.f23837k.start();
    }

    /* JADX INFO: renamed from: e */
    public final List<C8156b> m39652e(pf60<CoreJustVerificationCardApi.JustRealStatus, Integer> pf60Var) {
        ArrayList arrayList = new ArrayList();
        Iterator<C8156b> it = this.f23836j.get(pf60Var.f152156a).iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().m39658a());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public final void m39653f() {
        this.f23836j = new HashMap<>();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C8156b(1.0f, 0.0f, true));
        arrayList.add(new C8156b(0.0f, 0.0f, false));
        arrayList.add(new C8156b(1.0f, 0.0f, true));
        this.f23836j.put(CoreJustVerificationCardApi.JustRealStatus.IDLE, arrayList);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C8156b(1.0f, 0.0f, true));
        arrayList2.add(new C8156b(1.0f, 0.0f, false));
        arrayList2.add(new C8156b(1.0f, 0.0f, true));
        this.f23836j.put(CoreJustVerificationCardApi.JustRealStatus.PRE_START, arrayList2);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(new C8156b(1.0f, 0.0f, true));
        arrayList3.add(new C8156b(1.0f, 0.0f, false));
        arrayList3.add(new C8156b(1.0f, 0.0f, true));
        this.f23836j.put(CoreJustVerificationCardApi.JustRealStatus.TRIALING, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(new C8156b(1.0f, 0.0f, false));
        arrayList4.add(new C8156b(1.0f, 0.0f, false));
        arrayList4.add(new C8156b(1.0f, 0.0f, false));
        this.f23836j.put(CoreJustVerificationCardApi.JustRealStatus.RUNNING, arrayList4);
        this.f23836j.put(CoreJustVerificationCardApi.JustRealStatus.CLICK_RUNNING, arrayList4);
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(new C8156b(1.0f, 0.0f, true));
        arrayList5.add(new C8156b(0.0f, 0.0f, false));
        arrayList5.add(new C8156b(1.0f, 0.0f, true));
        this.f23836j.put(CoreJustVerificationCardApi.JustRealStatus.FINISH, arrayList5);
    }

    /* JADX INFO: renamed from: h */
    public final void m39655h(float f) {
        for (C8157c c8157c : this.f23835i) {
            C8156b c8156b = c8157c.f23845b;
            C8156b c8156b2 = c8157c.f23847d;
            float f2 = c8156b2.f23840a;
            C8156b c8156b3 = c8157c.f23848e;
            c8156b.f23840a = f2 + ((c8156b3.f23840a - f2) * f);
            float f3 = c8156b2.f23841b;
            c8156b.f23841b = f3 + ((c8156b3.f23841b - f3) * f);
            float f4 = c8156b2.f23843d;
            c8156b.f23843d = f4 + ((c8156b3.f23843d - f4) * f);
            c8157c.m39660a();
        }
    }

    /* JADX INFO: renamed from: i */
    public void m39656i(Act act) {
        pf60<CoreJustVerificationCardApi.JustRealStatus, Integer> pf60VarM31246k3 = CoreModule.f18264c.f20446z2.m31246k3();
        this.f23832f.setText(String.valueOf(pf60VarM31246k3.f152157b));
        this.f23831e.setText(String.valueOf(pf60VarM31246k3.f152157b));
        m39654g(pf60VarM31246k3);
        act.duringCreated(CoreModule.f18264c.f20446z2.m31248m3().distinctUntilChanged().skip(1)).subscribe(psd0.m173596G(new y20() { // from class: l.btq
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f78390a.m39654g((pf60) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void m39654g(pf60<CoreJustVerificationCardApi.JustRealStatus, Integer> pf60Var) {
        this.f23832f.setText(this.f23831e.getText());
        this.f23831e.setText(String.valueOf(pf60Var.f152157b));
        this.f23832f.measure(View.MeasureSpec.makeMeasureSpec(bnl0.m105592y0(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(qa00.m175859d(30.0f), Integer.MIN_VALUE));
        this.f23831e.measure(View.MeasureSpec.makeMeasureSpec(bnl0.m105592y0(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(qa00.m175859d(30.0f), Integer.MIN_VALUE));
        List<C8156b> listM39652e = m39652e(pf60Var);
        for (int i = 0; i < this.f23835i.size(); i++) {
            C8157c c8157c = this.f23835i.get(i);
            c8157c.f23846c.m39659b(listM39652e.get(i));
            if (this.f23834h == null) {
                c8157c.f23845b.m39659b(c8157c.f23846c);
                c8157c.m39660a();
            } else {
                c8157c.f23847d.m39659b(c8157c.f23845b);
                c8157c.f23848e.m39659b(c8157c.f23846c);
                C8156b c8156b = c8157c.f23845b;
                c8156b.f23843d = 0.0f;
                C8156b c8156b2 = c8157c.f23847d;
                if (c8156b2.f23842c != c8157c.f23848e.f23842c) {
                    c8156b.f23842c = c8157c.f23846c.f23842c;
                }
                View view = c8157c.f23844a;
                VText_Default_Bold vText_Default_Bold = this.f23831e;
                if (view == vText_Default_Bold) {
                    boolean zEquals = TextUtils.equals(vText_Default_Bold.getText(), this.f23832f.getText());
                    C8156b c8156b3 = c8157c.f23847d;
                    if (zEquals) {
                        c8156b3.f23841b = 0.0f;
                        c8156b3.f23840a = 1.0f;
                        C8156b c8156b4 = c8157c.f23848e;
                        c8156b4.f23841b = 0.0f;
                        c8156b4.f23840a = 1.0f;
                    } else {
                        c8156b3.f23841b = this.f23838l;
                        c8156b3.f23840a = 0.0f;
                        C8156b c8156b5 = c8157c.f23848e;
                        c8156b5.f23841b = 0.0f;
                        c8156b5.f23840a = 1.0f;
                    }
                } else {
                    VText_Default_Bold vText_Default_Bold2 = this.f23832f;
                    if (view == vText_Default_Bold2) {
                        boolean zEquals2 = TextUtils.equals(vText_Default_Bold.getText(), this.f23832f.getText());
                        C8156b c8156b6 = c8157c.f23847d;
                        if (zEquals2) {
                            c8156b6.f23841b = 0.0f;
                            c8156b6.f23840a = 0.0f;
                            C8156b c8156b7 = c8157c.f23848e;
                            c8156b7.f23841b = 0.0f;
                            c8156b7.f23840a = 0.0f;
                        } else {
                            c8156b6.f23841b = 0.0f;
                            c8156b6.f23840a = 1.0f;
                            C8156b c8156b8 = c8157c.f23848e;
                            c8156b8.f23841b = -this.f23838l;
                            c8156b8.f23840a = 0.0f;
                        }
                    } else if (view == this.f23833g) {
                        c8156b2.f23843d = vText_Default_Bold2.getMeasuredWidth() - this.f23831e.getMeasuredWidth();
                        c8157c.f23848e.f23843d = 0.0f;
                    }
                }
            }
        }
        if (this.f23834h != null) {
            m39651d(pf60Var.f152156a);
        }
        this.f23834h = pf60Var;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39650c(this);
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(500L);
        this.f23828b.setLayoutTransition(layoutTransition);
        this.f23835i.add(new C8157c(this.f23831e));
        this.f23835i.add(new C8157c(this.f23832f));
        this.f23835i.add(new C8157c(this.f23833g));
        m39653f();
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.justreal.JustRealHeadContentLayout$b */
    public static class C8156b {

        /* JADX INFO: renamed from: a */
        public float f23840a;

        /* JADX INFO: renamed from: b */
        public float f23841b;

        /* JADX INFO: renamed from: c */
        public boolean f23842c;

        /* JADX INFO: renamed from: d */
        public float f23843d;

        public C8156b(float f, float f2, boolean z) {
            this.f23840a = f;
            this.f23841b = f2;
            this.f23842c = z;
        }

        /* JADX INFO: renamed from: a */
        public C8156b m39658a() {
            return new C8156b(this.f23840a, this.f23841b, this.f23842c);
        }

        /* JADX INFO: renamed from: b */
        public void m39659b(C8156b c8156b) {
            this.f23840a = c8156b.f23840a;
            this.f23841b = c8156b.f23841b;
            this.f23842c = c8156b.f23842c;
        }

        public C8156b() {
        }
    }

    public JustRealHeadContentLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23835i = new ArrayList();
        this.f23838l = qa00.m175859d(10.0f);
    }

    public JustRealHeadContentLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23835i = new ArrayList();
        this.f23838l = qa00.m175859d(10.0f);
    }

    public JustRealHeadContentLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f23835i = new ArrayList();
        this.f23838l = qa00.m175859d(10.0f);
    }
}
