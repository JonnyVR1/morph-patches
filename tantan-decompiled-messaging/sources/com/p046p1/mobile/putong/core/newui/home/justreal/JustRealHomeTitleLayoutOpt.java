package com.p046p1.mobile.putong.core.newui.home.justreal;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreJustVerificationCardApi;
import com.p046p1.mobile.putong.core.p053ui.VText_Default_Bold;
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
import p147v.VImage;
import p147v.VLinear;
import p149l.e30;
import p149l.itl;
import p149l.j760;
import p149l.mkd0;
import p149l.psq;
import p149l.t100;
import p149l.vsq;
import p149l.x2c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class JustRealHomeTitleLayoutOpt extends FrameLayout implements itl {

    /* JADX INFO: renamed from: u */
    public static boolean f23111u = false;

    /* JADX INFO: renamed from: a */
    public SVGAnimationView f23112a;

    /* JADX INFO: renamed from: b */
    public VImage f23113b;

    /* JADX INFO: renamed from: c */
    public VText_Default_Bold f23114c;

    /* JADX INFO: renamed from: d */
    public VLinear f23115d;

    /* JADX INFO: renamed from: e */
    public VText_Default_Bold f23116e;

    /* JADX INFO: renamed from: f */
    public JustRealNumContentLayout f23117f;

    /* JADX INFO: renamed from: g */
    public VText_Default_Bold f23118g;

    /* JADX INFO: renamed from: h */
    public VText_Default_Bold f23119h;

    /* JADX INFO: renamed from: i */
    public VText_Default_Bold f23120i;

    /* JADX INFO: renamed from: j */
    public Paint f23121j;

    /* JADX INFO: renamed from: k */
    public float f23122k;

    /* JADX INFO: renamed from: l */
    public float f23123l;

    /* JADX INFO: renamed from: m */
    public int f23124m;

    /* JADX INFO: renamed from: n */
    public int f23125n;

    /* JADX INFO: renamed from: o */
    public ValueAnimator f23126o;

    /* JADX INFO: renamed from: p */
    public ValueAnimator f23127p;

    /* JADX INFO: renamed from: q */
    public float f23128q;

    /* JADX INFO: renamed from: r */
    public j760<CoreJustVerificationCardApi.JustRealStatus, Integer> f23129r;

    /* JADX INFO: renamed from: s */
    public List<C8014f> f23130s;

    /* JADX INFO: renamed from: t */
    public HashMap<CoreJustVerificationCardApi.JustRealStatus, List<C8013e>> f23131t;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.justreal.JustRealHomeTitleLayoutOpt$a */
    public class C8009a implements RequestCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f23132a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f23133b;

        public C8009a(boolean z, String str) {
            this.f23132a = z;
            this.f23133b = str;
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onLoadFailed(@NonNull ResourceKey resourceKey, @Nullable SVGAException sVGAException) {
            if (this.f23132a) {
                JustRealHomeTitleLayoutOpt.this.f23113b.setAlpha(1.0f);
            }
            boolean unused = JustRealHomeTitleLayoutOpt.f23111u;
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onResourceReady(@NonNull ResourceKey resourceKey, @NonNull Resource<?> resource) {
            if (this.f23132a) {
                JustRealHomeTitleLayoutOpt.this.f23113b.setAlpha(0.0f);
                JustRealHomeTitleLayoutOpt.this.f23112a.stepToFrame(0.0f, true);
            }
            boolean unused = JustRealHomeTitleLayoutOpt.f23111u;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.justreal.JustRealHomeTitleLayoutOpt$b */
    public class C8010b extends AnimListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f23135a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f23136b;

        public C8010b(boolean z, String str) {
            this.f23135a = z;
            this.f23136b = str;
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            super.onStart();
            JustRealHomeTitleLayoutOpt.this.f23113b.setAlpha(0.0f);
            boolean unused = JustRealHomeTitleLayoutOpt.f23111u;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.justreal.JustRealHomeTitleLayoutOpt$c */
    public class C8011c implements ValueAnimator.AnimatorUpdateListener {
        public C8011c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            JustRealHomeTitleLayoutOpt.this.m38682p(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.justreal.JustRealHomeTitleLayoutOpt$d */
    public class C8012d implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ float f23139a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ float f23140b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ float f23141c;

        public C8012d(float f, float f2, float f3) {
            this.f23139a = f;
            this.f23140b = f2;
            this.f23141c = f3;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            float f = this.f23139a;
            if (fFloatValue > (f / 2.0f) + 1.0f) {
                fFloatValue = ((f / 2.0f) + 1.0f) - (fFloatValue - ((f / 2.0f) + 1.0f));
            }
            JustRealHomeTitleLayoutOpt.this.f23123l = this.f23140b + (this.f23141c * fFloatValue);
            JustRealHomeTitleLayoutOpt.this.invalidate();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.justreal.JustRealHomeTitleLayoutOpt$f */
    public static class C8014f {

        /* JADX INFO: renamed from: a */
        public View f23147a;

        /* JADX INFO: renamed from: b */
        public C8013e f23148b = new C8013e();

        /* JADX INFO: renamed from: c */
        public C8013e f23149c = new C8013e();

        /* JADX INFO: renamed from: d */
        public C8013e f23150d = new C8013e();

        /* JADX INFO: renamed from: e */
        public C8013e f23151e = new C8013e();

        public C8014f(View view) {
            this.f23147a = view;
        }

        /* JADX INFO: renamed from: a */
        public void m38687a() {
            this.f23147a.setAlpha(this.f23148b.f23143a);
            this.f23147a.setTranslationY(this.f23148b.f23144b);
            this.f23147a.setTranslationX(this.f23148b.f23146d);
        }
    }

    public JustRealHomeTitleLayoutOpt(@NonNull Context context) {
        super(context);
        this.f23125n = 0;
        this.f23128q = t100.m186890d(10.0f);
        this.f23130s = new ArrayList();
        m38679m();
    }

    @Override // p149l.itl
    /* JADX INFO: renamed from: a */
    public void mo38672a(Act act) {
        j760<CoreJustVerificationCardApi.JustRealStatus, Integer> j760VarM30248k3 = CoreModule.f17545c.f19704z2.m30248k3();
        this.f23119h.setText(String.valueOf(j760VarM30248k3.f116565b));
        this.f23118g.setText(String.valueOf(j760VarM30248k3.f116565b));
        CoreJustVerificationCardApi.JustRealStatus justRealStatus = j760VarM30248k3.f116564a;
        m38683q(justRealStatus.started ? "https://auto.tancdn.com/v1/raw/e1682a2a-bb89-4167-8d38-b0a02f577b9114.svga" : "https://auto.tancdn.com/v1/raw/07117dd5-5a08-410c-af53-77044233802414.svga", justRealStatus.started ? x2c0.f190138fd : x2c0.f190075dd, false);
        m38684r(j760VarM30248k3);
        act.duringCreated(CoreModule.f17545c.f19704z2.m30250m3().distinctUntilChanged().skip(1)).subscribe(mkd0.m154955G(new e30() { // from class: l.rsq
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f160885a.m38681o((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g */
    public final void m38673g(View view) {
        vsq.m199891a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public final void m38674h(CoreJustVerificationCardApi.JustRealStatus justRealStatus) {
        ValueAnimator valueAnimator = this.f23127p;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f23127p.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f23127p = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(300L);
        this.f23127p.addUpdateListener(new C8011c());
        this.f23127p.start();
    }

    /* JADX INFO: renamed from: i */
    public final void m38675i(int i) {
        ValueAnimator valueAnimator = this.f23126o;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f23126o.cancel();
        }
        float f = this.f23123l;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.12f);
        this.f23126o = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(300L);
        this.f23126o.addUpdateListener(new C8012d(0.12f, f, i - f));
        this.f23126o.start();
    }

    /* JADX INFO: renamed from: j */
    public final void m38676j(int i) {
        if (i > 0) {
            if (this.f23123l != 0.0f) {
                m38675i(i);
            } else {
                this.f23123l = i;
                invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final List<C8013e> m38677k(j760<CoreJustVerificationCardApi.JustRealStatus, Integer> j760Var) {
        ArrayList arrayList = new ArrayList();
        Iterator<C8013e> it = this.f23131t.get(j760Var.f116564a).iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().m38685a());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: l */
    public final void m38678l() {
        this.f23131t = new HashMap<>();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C8013e(1.0f, 0.0f, true));
        arrayList.add(new C8013e(1.0f, 0.0f, true));
        arrayList.add(new C8013e(0.0f, 0.0f, false));
        arrayList.add(new C8013e(1.0f, 0.0f, true));
        arrayList.add(new C8013e(0.0f, 0.0f, false));
        arrayList.add(new C8013e(1.0f, 0.0f, true));
        this.f23131t.put(CoreJustVerificationCardApi.JustRealStatus.IDLE, arrayList);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C8013e(1.0f, 0.0f, true));
        arrayList2.add(new C8013e(0.0f, 0.0f, false));
        arrayList2.add(new C8013e(1.0f, 0.0f, true));
        arrayList2.add(new C8013e(1.0f, 0.0f, true));
        arrayList2.add(new C8013e(1.0f, 0.0f, false));
        arrayList2.add(new C8013e(1.0f, 0.0f, true));
        this.f23131t.put(CoreJustVerificationCardApi.JustRealStatus.PRE_START, arrayList2);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(new C8013e(1.0f, 0.0f, true));
        arrayList3.add(new C8013e(0.0f, 0.0f, false));
        arrayList3.add(new C8013e(1.0f, 0.0f, true));
        arrayList3.add(new C8013e(1.0f, 0.0f, true));
        arrayList3.add(new C8013e(1.0f, 0.0f, false));
        arrayList3.add(new C8013e(1.0f, 0.0f, true));
        this.f23131t.put(CoreJustVerificationCardApi.JustRealStatus.TRIALING, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(new C8013e(1.0f, 0.0f, true));
        arrayList4.add(new C8013e(1.0f, 0.0f, true));
        arrayList4.add(new C8013e(0.0f, 0.0f, false));
        arrayList4.add(new C8013e(1.0f, 0.0f, false));
        arrayList4.add(new C8013e(1.0f, 0.0f, false));
        arrayList4.add(new C8013e(1.0f, 0.0f, true));
        this.f23131t.put(CoreJustVerificationCardApi.JustRealStatus.RUNNING, arrayList4);
        this.f23131t.put(CoreJustVerificationCardApi.JustRealStatus.CLICK_RUNNING, arrayList4);
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(new C8013e(1.0f, 0.0f, true));
        arrayList5.add(new C8013e(1.0f, 0.0f, true));
        arrayList5.add(new C8013e(0.0f, 0.0f, false));
        arrayList5.add(new C8013e(1.0f, 0.0f, true));
        arrayList5.add(new C8013e(0.0f, 0.0f, false));
        arrayList5.add(new C8013e(1.0f, 0.0f, true));
        this.f23131t.put(CoreJustVerificationCardApi.JustRealStatus.FINISH, arrayList5);
    }

    /* JADX INFO: renamed from: m */
    public final void m38679m() {
        Paint paint = new Paint();
        this.f23121j = paint;
        paint.setAntiAlias(true);
        this.f23121j.setColor(-855310);
        this.f23123l = 0.0f;
        this.f23124m = t100.m186890d(36.0f);
        this.f23122k = t100.m186890d(10.0f);
        setWillNotDraw(false);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m38680n(View view) {
        psq.m171200P((Act) xdl0.m208326D(getContext()), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m38681o(j760 j760Var) {
        CoreJustVerificationCardApi.JustRealStatus justRealStatus = this.f23129r.f116564a;
        if (justRealStatus != null) {
            F f = j760Var.f116564a;
            if (((CoreJustVerificationCardApi.JustRealStatus) f).started != justRealStatus.started) {
                m38683q(((CoreJustVerificationCardApi.JustRealStatus) f).started ? "https://auto.tancdn.com/v1/raw/971473e6-caf8-4972-8380-2f58273555e414.svga" : "https://auto.tancdn.com/v1/raw/a0d1dac8-559c-4258-a092-6129b31427eb14.svga", ((CoreJustVerificationCardApi.JustRealStatus) f).started ? x2c0.f190138fd : x2c0.f190075dd, true);
            }
        }
        m38684r(j760Var);
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        float f = this.f23123l;
        if (f > 0.0f) {
            float f2 = this.f23124m;
            float f3 = this.f23122k;
            canvas.drawRoundRect(0.0f, 0.0f, f, f2, f3, f3, this.f23121j);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m38673g(this);
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(300L);
        this.f23115d.setLayoutTransition(layoutTransition);
        this.f23130s.add(new C8014f(this.f23112a));
        this.f23130s.add(new C8014f(this.f23114c));
        this.f23130s.add(new C8014f(this.f23115d));
        this.f23130s.add(new C8014f(this.f23118g));
        this.f23130s.add(new C8014f(this.f23119h));
        this.f23130s.add(new C8014f(this.f23120i));
        m38678l();
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.qsq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f156266a.m38680n(view);
            }
        });
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        boolean z = this.f23130s.get(1).f23149c.f23145c;
        List<C8014f> list = this.f23130s;
        int measuredWidth = (z ? list.get(1) : list.get(2)).f23147a.getMeasuredWidth() + t100.m186890d(42.0f);
        if (measuredWidth != this.f23125n) {
            m38676j(measuredWidth);
            this.f23125n = measuredWidth;
        }
        setMeasuredDimension(measuredWidth, t100.m186890d(36.0f));
    }

    /* JADX INFO: renamed from: p */
    public final void m38682p(float f) {
        for (C8014f c8014f : this.f23130s) {
            C8013e c8013e = c8014f.f23148b;
            C8013e c8013e2 = c8014f.f23150d;
            float f2 = c8013e2.f23143a;
            C8013e c8013e3 = c8014f.f23151e;
            c8013e.f23143a = f2 + ((c8013e3.f23143a - f2) * f);
            float f3 = c8013e2.f23144b;
            c8013e.f23144b = f3 + ((c8013e3.f23144b - f3) * f);
            float f4 = c8013e2.f23146d;
            c8013e.f23146d = f4 + ((c8013e3.f23146d - f4) * f);
            c8014f.m38687a();
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m38683q(String str, int i, boolean z) {
        this.f23113b.setAlpha(z ? 0.0f : 1.0f);
        this.f23113b.setImageResource(i);
        SVGALoader.with(getContext()).from(str).animListener(new C8010b(z, str)).loadCallback(new C8009a(z, str)).repeatCount(1).autoPlay(z).into(this.f23112a);
    }

    /* JADX INFO: renamed from: r */
    public final void m38684r(j760<CoreJustVerificationCardApi.JustRealStatus, Integer> j760Var) {
        this.f23119h.setText(this.f23118g.getText());
        this.f23118g.setText(String.valueOf(j760Var.f116565b));
        this.f23119h.measure(View.MeasureSpec.makeMeasureSpec(xdl0.m208412y0(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(t100.m186890d(32.0f), Integer.MIN_VALUE));
        this.f23118g.measure(View.MeasureSpec.makeMeasureSpec(xdl0.m208412y0(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(t100.m186890d(32.0f), Integer.MIN_VALUE));
        List<C8013e> listM38677k = m38677k(j760Var);
        for (int i = 0; i < this.f23130s.size(); i++) {
            C8014f c8014f = this.f23130s.get(i);
            c8014f.f23149c.m38686b(listM38677k.get(i));
            if (this.f23129r == null) {
                c8014f.f23148b.m38686b(c8014f.f23149c);
                c8014f.m38687a();
            } else {
                c8014f.f23150d.m38686b(c8014f.f23148b);
                c8014f.f23151e.m38686b(c8014f.f23149c);
                C8013e c8013e = c8014f.f23148b;
                c8013e.f23146d = 0.0f;
                C8013e c8013e2 = c8014f.f23150d;
                boolean z = c8013e2.f23145c;
                C8013e c8013e3 = c8014f.f23151e;
                if (z != c8013e3.f23145c) {
                    c8013e.f23145c = c8014f.f23149c.f23145c;
                    if (c8013e2.f23145c) {
                        c8013e2.f23144b = 0.0f;
                        c8013e3.f23144b = -this.f23128q;
                    } else {
                        c8013e2.f23144b = this.f23128q;
                        c8013e3.f23144b = 0.0f;
                    }
                }
                View view = c8014f.f23147a;
                VText_Default_Bold vText_Default_Bold = this.f23118g;
                if (view == vText_Default_Bold) {
                    boolean zEquals = TextUtils.equals(vText_Default_Bold.getText(), this.f23119h.getText());
                    C8013e c8013e4 = c8014f.f23150d;
                    if (zEquals) {
                        c8013e4.f23144b = 0.0f;
                        c8013e4.f23143a = 1.0f;
                        C8013e c8013e5 = c8014f.f23151e;
                        c8013e5.f23144b = 0.0f;
                        c8013e5.f23143a = 1.0f;
                    } else {
                        c8013e4.f23144b = this.f23128q;
                        c8013e4.f23143a = 0.0f;
                        C8013e c8013e6 = c8014f.f23151e;
                        c8013e6.f23144b = 0.0f;
                        c8013e6.f23143a = 1.0f;
                    }
                } else {
                    VText_Default_Bold vText_Default_Bold2 = this.f23119h;
                    if (view == vText_Default_Bold2) {
                        boolean zEquals2 = TextUtils.equals(vText_Default_Bold.getText(), this.f23119h.getText());
                        C8013e c8013e7 = c8014f.f23150d;
                        if (zEquals2) {
                            c8013e7.f23144b = 0.0f;
                            c8013e7.f23143a = 0.0f;
                            C8013e c8013e8 = c8014f.f23151e;
                            c8013e8.f23144b = 0.0f;
                            c8013e8.f23143a = 0.0f;
                        } else {
                            c8013e7.f23144b = 0.0f;
                            c8013e7.f23143a = 1.0f;
                            C8013e c8013e9 = c8014f.f23151e;
                            c8013e9.f23144b = -this.f23128q;
                            c8013e9.f23143a = 0.0f;
                        }
                    } else if (view == this.f23120i) {
                        c8013e2.f23146d = vText_Default_Bold2.getMeasuredWidth() - this.f23118g.getMeasuredWidth();
                        c8014f.f23151e.f23146d = 0.0f;
                    }
                }
            }
        }
        if (this.f23129r != null) {
            m38674h(j760Var.f116564a);
        }
        this.f23129r = j760Var;
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.justreal.JustRealHomeTitleLayoutOpt$e */
    public static class C8013e {

        /* JADX INFO: renamed from: a */
        public float f23143a;

        /* JADX INFO: renamed from: b */
        public float f23144b;

        /* JADX INFO: renamed from: c */
        public boolean f23145c;

        /* JADX INFO: renamed from: d */
        public float f23146d;

        public C8013e(float f, float f2, boolean z) {
            this.f23143a = f;
            this.f23144b = f2;
            this.f23145c = z;
        }

        /* JADX INFO: renamed from: a */
        public C8013e m38685a() {
            return new C8013e(this.f23143a, this.f23144b, this.f23145c);
        }

        /* JADX INFO: renamed from: b */
        public void m38686b(C8013e c8013e) {
            this.f23143a = c8013e.f23143a;
            this.f23144b = c8013e.f23144b;
            this.f23145c = c8013e.f23145c;
        }

        public C8013e() {
        }
    }

    public JustRealHomeTitleLayoutOpt(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23125n = 0;
        this.f23128q = t100.m186890d(10.0f);
        this.f23130s = new ArrayList();
        m38679m();
    }

    public JustRealHomeTitleLayoutOpt(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23125n = 0;
        this.f23128q = t100.m186890d(10.0f);
        this.f23130s = new ArrayList();
        m38679m();
    }
}
