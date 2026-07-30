package com.p000p1.mobile.putong.core.newui.home.justreal;

import android.animation.LayoutTransition;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
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
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.ResourceKey;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantan.library.svga.data.cache.Resource;
import com.tantan.library.svga.data.request.RequestCallback;
import com.tantan.library.svga.exception.SVGAException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import l.e30;
import l.j760;
import l.mkd0;
import l.t100;
import l.vsq;
import l.x2c0;
import l.xdl0;
import p009l.itl;
import p009l.psq;
import v.VImage;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class JustRealHomeTitleLayoutOpt extends FrameLayout implements itl {

    /* JADX INFO: renamed from: u */
    public static boolean f1889u = false;

    /* JADX INFO: renamed from: a */
    public SVGAnimationView f1890a;

    /* JADX INFO: renamed from: b */
    public VImage f1891b;

    /* JADX INFO: renamed from: c */
    public VText_Default_Bold f1892c;

    /* JADX INFO: renamed from: d */
    public VLinear f1893d;

    /* JADX INFO: renamed from: e */
    public VText_Default_Bold f1894e;

    /* JADX INFO: renamed from: f */
    public JustRealNumContentLayout f1895f;

    /* JADX INFO: renamed from: g */
    public VText_Default_Bold f1896g;

    /* JADX INFO: renamed from: h */
    public VText_Default_Bold f1897h;

    /* JADX INFO: renamed from: i */
    public VText_Default_Bold f1898i;

    /* JADX INFO: renamed from: j */
    public Paint f1899j;

    /* JADX INFO: renamed from: k */
    public float f1900k;

    /* JADX INFO: renamed from: l */
    public float f1901l;

    /* JADX INFO: renamed from: m */
    public int f1902m;

    /* JADX INFO: renamed from: n */
    public int f1903n;

    /* JADX INFO: renamed from: o */
    public ValueAnimator f1904o;

    /* JADX INFO: renamed from: p */
    public ValueAnimator f1905p;

    /* JADX INFO: renamed from: q */
    public float f1906q;

    /* JADX INFO: renamed from: r */
    public j760<CoreJustVerificationCardApi.JustRealStatus, Integer> f1907r;

    /* JADX INFO: renamed from: s */
    public List<C0178f> f1908s;

    /* JADX INFO: renamed from: t */
    public HashMap<CoreJustVerificationCardApi.JustRealStatus, List<C0177e>> f1909t;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.justreal.JustRealHomeTitleLayoutOpt$a */
    public class C0173a implements RequestCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f1910a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f1911b;

        public C0173a(boolean z, String str) {
            this.f1910a = z;
            this.f1911b = str;
        }

        public void onLoadFailed(@NonNull ResourceKey resourceKey, @Nullable SVGAException sVGAException) {
            if (this.f1910a) {
                JustRealHomeTitleLayoutOpt.this.f1891b.setAlpha(1.0f);
            }
            boolean unused = JustRealHomeTitleLayoutOpt.f1889u;
        }

        public void onResourceReady(@NonNull ResourceKey resourceKey, @NonNull Resource<?> resource) {
            if (this.f1910a) {
                JustRealHomeTitleLayoutOpt.this.f1891b.setAlpha(0.0f);
                JustRealHomeTitleLayoutOpt.this.f1890a.stepToFrame(0.0f, true);
            }
            boolean unused = JustRealHomeTitleLayoutOpt.f1889u;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.justreal.JustRealHomeTitleLayoutOpt$b */
    public class C0174b extends AnimListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f1913a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f1914b;

        public C0174b(boolean z, String str) {
            this.f1913a = z;
            this.f1914b = str;
        }

        public void onStart() {
            super.onStart();
            JustRealHomeTitleLayoutOpt.this.f1891b.setAlpha(0.0f);
            boolean unused = JustRealHomeTitleLayoutOpt.f1889u;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.justreal.JustRealHomeTitleLayoutOpt$c */
    public class C0175c implements ValueAnimator.AnimatorUpdateListener {
        public C0175c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            JustRealHomeTitleLayoutOpt.this.m2668p(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.justreal.JustRealHomeTitleLayoutOpt$d */
    public class C0176d implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ float f1917a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ float f1918b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ float f1919c;

        public C0176d(float f, float f2, float f3) {
            this.f1917a = f;
            this.f1918b = f2;
            this.f1919c = f3;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            float f = this.f1917a;
            if (fFloatValue > (f / 2.0f) + 1.0f) {
                fFloatValue = ((f / 2.0f) + 1.0f) - (fFloatValue - ((f / 2.0f) + 1.0f));
            }
            JustRealHomeTitleLayoutOpt.this.f1901l = this.f1918b + (this.f1919c * fFloatValue);
            JustRealHomeTitleLayoutOpt.this.invalidate();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.justreal.JustRealHomeTitleLayoutOpt$f */
    public static class C0178f {

        /* JADX INFO: renamed from: a */
        public View f1925a;

        /* JADX INFO: renamed from: b */
        public C0177e f1926b = new C0177e();

        /* JADX INFO: renamed from: c */
        public C0177e f1927c = new C0177e();

        /* JADX INFO: renamed from: d */
        public C0177e f1928d = new C0177e();

        /* JADX INFO: renamed from: e */
        public C0177e f1929e = new C0177e();

        public C0178f(View view) {
            this.f1925a = view;
        }

        /* JADX INFO: renamed from: a */
        public void m2673a() {
            this.f1925a.setAlpha(this.f1926b.f1921a);
            this.f1925a.setTranslationY(this.f1926b.f1922b);
            this.f1925a.setTranslationX(this.f1926b.f1924d);
        }
    }

    public JustRealHomeTitleLayoutOpt(@NonNull Context context) {
        super(context);
        this.f1903n = 0;
        this.f1906q = t100.d(10.0f);
        this.f1908s = new ArrayList();
        m2665m();
    }

    @Override // p009l.itl
    /* JADX INFO: renamed from: a */
    public void mo2658a(Act act) {
        j760<CoreJustVerificationCardApi.JustRealStatus, Integer> j760VarK3 = CoreModule.c.z2.k3();
        this.f1897h.setText(String.valueOf(j760VarK3.b));
        this.f1896g.setText(String.valueOf(j760VarK3.b));
        Object obj = j760VarK3.a;
        m2669q(((CoreJustVerificationCardApi.JustRealStatus) obj).started ? "https://auto.tancdn.com/v1/raw/e1682a2a-bb89-4167-8d38-b0a02f577b9114.svga" : "https://auto.tancdn.com/v1/raw/07117dd5-5a08-410c-af53-77044233802414.svga", ((CoreJustVerificationCardApi.JustRealStatus) obj).started ? x2c0.fd : x2c0.dd, false);
        m2670r(j760VarK3);
        act.duringCreated(CoreModule.c.z2.m3().distinctUntilChanged().skip(1)).subscribe(mkd0.G(new e30() { // from class: l.rsq
            public final void call(Object obj2) {
                this.f19969a.m2667o((j760) obj2);
            }
        }));
    }

    /* JADX INFO: renamed from: g */
    public final void m2659g(View view) {
        vsq.a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public final void m2660h(CoreJustVerificationCardApi.JustRealStatus justRealStatus) {
        ValueAnimator valueAnimator = this.f1905p;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f1905p.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f1905p = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(300L);
        this.f1905p.addUpdateListener(new C0175c());
        this.f1905p.start();
    }

    /* JADX INFO: renamed from: i */
    public final void m2661i(int i) {
        ValueAnimator valueAnimator = this.f1904o;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f1904o.cancel();
        }
        float f = this.f1901l;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.12f);
        this.f1904o = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(300L);
        this.f1904o.addUpdateListener(new C0176d(0.12f, f, i - f));
        this.f1904o.start();
    }

    /* JADX INFO: renamed from: j */
    public final void m2662j(int i) {
        if (i > 0) {
            if (this.f1901l != 0.0f) {
                m2661i(i);
            } else {
                this.f1901l = i;
                invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final List<C0177e> m2663k(j760<CoreJustVerificationCardApi.JustRealStatus, Integer> j760Var) {
        ArrayList arrayList = new ArrayList();
        Iterator<C0177e> it = this.f1909t.get(j760Var.a).iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().m2671a());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: l */
    public final void m2664l() {
        this.f1909t = new HashMap<>();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0177e(1.0f, 0.0f, true));
        arrayList.add(new C0177e(1.0f, 0.0f, true));
        arrayList.add(new C0177e(0.0f, 0.0f, false));
        arrayList.add(new C0177e(1.0f, 0.0f, true));
        arrayList.add(new C0177e(0.0f, 0.0f, false));
        arrayList.add(new C0177e(1.0f, 0.0f, true));
        this.f1909t.put(CoreJustVerificationCardApi.JustRealStatus.IDLE, arrayList);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C0177e(1.0f, 0.0f, true));
        arrayList2.add(new C0177e(0.0f, 0.0f, false));
        arrayList2.add(new C0177e(1.0f, 0.0f, true));
        arrayList2.add(new C0177e(1.0f, 0.0f, true));
        arrayList2.add(new C0177e(1.0f, 0.0f, false));
        arrayList2.add(new C0177e(1.0f, 0.0f, true));
        this.f1909t.put(CoreJustVerificationCardApi.JustRealStatus.PRE_START, arrayList2);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(new C0177e(1.0f, 0.0f, true));
        arrayList3.add(new C0177e(0.0f, 0.0f, false));
        arrayList3.add(new C0177e(1.0f, 0.0f, true));
        arrayList3.add(new C0177e(1.0f, 0.0f, true));
        arrayList3.add(new C0177e(1.0f, 0.0f, false));
        arrayList3.add(new C0177e(1.0f, 0.0f, true));
        this.f1909t.put(CoreJustVerificationCardApi.JustRealStatus.TRIALING, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(new C0177e(1.0f, 0.0f, true));
        arrayList4.add(new C0177e(1.0f, 0.0f, true));
        arrayList4.add(new C0177e(0.0f, 0.0f, false));
        arrayList4.add(new C0177e(1.0f, 0.0f, false));
        arrayList4.add(new C0177e(1.0f, 0.0f, false));
        arrayList4.add(new C0177e(1.0f, 0.0f, true));
        this.f1909t.put(CoreJustVerificationCardApi.JustRealStatus.RUNNING, arrayList4);
        this.f1909t.put(CoreJustVerificationCardApi.JustRealStatus.CLICK_RUNNING, arrayList4);
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(new C0177e(1.0f, 0.0f, true));
        arrayList5.add(new C0177e(1.0f, 0.0f, true));
        arrayList5.add(new C0177e(0.0f, 0.0f, false));
        arrayList5.add(new C0177e(1.0f, 0.0f, true));
        arrayList5.add(new C0177e(0.0f, 0.0f, false));
        arrayList5.add(new C0177e(1.0f, 0.0f, true));
        this.f1909t.put(CoreJustVerificationCardApi.JustRealStatus.FINISH, arrayList5);
    }

    /* JADX INFO: renamed from: m */
    public final void m2665m() {
        Paint paint = new Paint();
        this.f1899j = paint;
        paint.setAntiAlias(true);
        this.f1899j.setColor(-855310);
        this.f1901l = 0.0f;
        this.f1902m = t100.d(36.0f);
        this.f1900k = t100.d(10.0f);
        setWillNotDraw(false);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m2666n(View view) {
        psq.m20645P(xdl0.D(getContext()), true);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m2667o(j760 j760Var) {
        Object obj = this.f1907r.a;
        if (obj != null) {
            Object obj2 = j760Var.a;
            if (((CoreJustVerificationCardApi.JustRealStatus) obj2).started != ((CoreJustVerificationCardApi.JustRealStatus) obj).started) {
                m2669q(((CoreJustVerificationCardApi.JustRealStatus) obj2).started ? "https://auto.tancdn.com/v1/raw/971473e6-caf8-4972-8380-2f58273555e414.svga" : "https://auto.tancdn.com/v1/raw/a0d1dac8-559c-4258-a092-6129b31427eb14.svga", ((CoreJustVerificationCardApi.JustRealStatus) obj2).started ? x2c0.fd : x2c0.dd, true);
            }
        }
        m2670r(j760Var);
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        float f = this.f1901l;
        if (f > 0.0f) {
            float f2 = this.f1902m;
            float f3 = this.f1900k;
            canvas.drawRoundRect(0.0f, 0.0f, f, f2, f3, f3, this.f1899j);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2659g(this);
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(300L);
        this.f1893d.setLayoutTransition(layoutTransition);
        this.f1908s.add(new C0178f(this.f1890a));
        this.f1908s.add(new C0178f(this.f1892c));
        this.f1908s.add(new C0178f(this.f1893d));
        this.f1908s.add(new C0178f(this.f1896g));
        this.f1908s.add(new C0178f(this.f1897h));
        this.f1908s.add(new C0178f(this.f1898i));
        m2664l();
        xdl0.E0(this, new View.OnClickListener() { // from class: l.qsq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f19520a.m2666n(view);
            }
        });
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        boolean z = this.f1908s.get(1).f1927c.f1923c;
        List<C0178f> list = this.f1908s;
        int measuredWidth = (z ? list.get(1) : list.get(2)).f1925a.getMeasuredWidth() + t100.d(42.0f);
        if (measuredWidth != this.f1903n) {
            m2662j(measuredWidth);
            this.f1903n = measuredWidth;
        }
        setMeasuredDimension(measuredWidth, t100.d(36.0f));
    }

    /* JADX INFO: renamed from: p */
    public final void m2668p(float f) {
        for (C0178f c0178f : this.f1908s) {
            C0177e c0177e = c0178f.f1926b;
            C0177e c0177e2 = c0178f.f1928d;
            float f2 = c0177e2.f1921a;
            C0177e c0177e3 = c0178f.f1929e;
            c0177e.f1921a = f2 + ((c0177e3.f1921a - f2) * f);
            float f3 = c0177e2.f1922b;
            c0177e.f1922b = f3 + ((c0177e3.f1922b - f3) * f);
            float f4 = c0177e2.f1924d;
            c0177e.f1924d = f4 + ((c0177e3.f1924d - f4) * f);
            c0178f.m2673a();
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m2669q(String str, int i, boolean z) {
        this.f1891b.setAlpha(z ? 0.0f : 1.0f);
        this.f1891b.setImageResource(i);
        SVGALoader.with(getContext()).from(str).animListener(new C0174b(z, str)).loadCallback(new C0173a(z, str)).repeatCount(1).autoPlay(z).into(this.f1890a);
    }

    /* JADX INFO: renamed from: r */
    public final void m2670r(j760<CoreJustVerificationCardApi.JustRealStatus, Integer> j760Var) {
        this.f1897h.setText(this.f1896g.getText());
        this.f1896g.setText(String.valueOf(j760Var.b));
        this.f1897h.measure(View.MeasureSpec.makeMeasureSpec(xdl0.y0(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(t100.d(32.0f), Integer.MIN_VALUE));
        this.f1896g.measure(View.MeasureSpec.makeMeasureSpec(xdl0.y0(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(t100.d(32.0f), Integer.MIN_VALUE));
        List<C0177e> listM2663k = m2663k(j760Var);
        for (int i = 0; i < this.f1908s.size(); i++) {
            C0178f c0178f = this.f1908s.get(i);
            c0178f.f1927c.m2672b(listM2663k.get(i));
            if (this.f1907r == null) {
                c0178f.f1926b.m2672b(c0178f.f1927c);
                c0178f.m2673a();
            } else {
                c0178f.f1928d.m2672b(c0178f.f1926b);
                c0178f.f1929e.m2672b(c0178f.f1927c);
                C0177e c0177e = c0178f.f1926b;
                c0177e.f1924d = 0.0f;
                C0177e c0177e2 = c0178f.f1928d;
                boolean z = c0177e2.f1923c;
                C0177e c0177e3 = c0178f.f1929e;
                if (z != c0177e3.f1923c) {
                    c0177e.f1923c = c0178f.f1927c.f1923c;
                    if (c0177e2.f1923c) {
                        c0177e2.f1922b = 0.0f;
                        c0177e3.f1922b = -this.f1906q;
                    } else {
                        c0177e2.f1922b = this.f1906q;
                        c0177e3.f1922b = 0.0f;
                    }
                }
                VText_Default_Bold vText_Default_Bold = c0178f.f1925a;
                VText_Default_Bold vText_Default_Bold2 = this.f1896g;
                if (vText_Default_Bold == vText_Default_Bold2) {
                    boolean zEquals = TextUtils.equals(vText_Default_Bold2.getText(), this.f1897h.getText());
                    C0177e c0177e4 = c0178f.f1928d;
                    if (zEquals) {
                        c0177e4.f1922b = 0.0f;
                        c0177e4.f1921a = 1.0f;
                        C0177e c0177e5 = c0178f.f1929e;
                        c0177e5.f1922b = 0.0f;
                        c0177e5.f1921a = 1.0f;
                    } else {
                        c0177e4.f1922b = this.f1906q;
                        c0177e4.f1921a = 0.0f;
                        C0177e c0177e6 = c0178f.f1929e;
                        c0177e6.f1922b = 0.0f;
                        c0177e6.f1921a = 1.0f;
                    }
                } else {
                    VText_Default_Bold vText_Default_Bold3 = this.f1897h;
                    if (vText_Default_Bold == vText_Default_Bold3) {
                        boolean zEquals2 = TextUtils.equals(vText_Default_Bold2.getText(), this.f1897h.getText());
                        C0177e c0177e7 = c0178f.f1928d;
                        if (zEquals2) {
                            c0177e7.f1922b = 0.0f;
                            c0177e7.f1921a = 0.0f;
                            C0177e c0177e8 = c0178f.f1929e;
                            c0177e8.f1922b = 0.0f;
                            c0177e8.f1921a = 0.0f;
                        } else {
                            c0177e7.f1922b = 0.0f;
                            c0177e7.f1921a = 1.0f;
                            C0177e c0177e9 = c0178f.f1929e;
                            c0177e9.f1922b = -this.f1906q;
                            c0177e9.f1921a = 0.0f;
                        }
                    } else if (vText_Default_Bold == this.f1898i) {
                        c0177e2.f1924d = vText_Default_Bold3.getMeasuredWidth() - this.f1896g.getMeasuredWidth();
                        c0178f.f1929e.f1924d = 0.0f;
                    }
                }
            }
        }
        if (this.f1907r != null) {
            m2660h((CoreJustVerificationCardApi.JustRealStatus) j760Var.a);
        }
        this.f1907r = j760Var;
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.justreal.JustRealHomeTitleLayoutOpt$e */
    public static class C0177e {

        /* JADX INFO: renamed from: a */
        public float f1921a;

        /* JADX INFO: renamed from: b */
        public float f1922b;

        /* JADX INFO: renamed from: c */
        public boolean f1923c;

        /* JADX INFO: renamed from: d */
        public float f1924d;

        public C0177e(float f, float f2, boolean z) {
            this.f1921a = f;
            this.f1922b = f2;
            this.f1923c = z;
        }

        /* JADX INFO: renamed from: a */
        public C0177e m2671a() {
            return new C0177e(this.f1921a, this.f1922b, this.f1923c);
        }

        /* JADX INFO: renamed from: b */
        public void m2672b(C0177e c0177e) {
            this.f1921a = c0177e.f1921a;
            this.f1922b = c0177e.f1922b;
            this.f1923c = c0177e.f1923c;
        }

        public C0177e() {
        }
    }

    public JustRealHomeTitleLayoutOpt(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1903n = 0;
        this.f1906q = t100.d(10.0f);
        this.f1908s = new ArrayList();
        m2665m();
    }

    public JustRealHomeTitleLayoutOpt(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1903n = 0;
        this.f1906q = t100.d(10.0f);
        this.f1908s = new ArrayList();
        m2665m();
    }
}
