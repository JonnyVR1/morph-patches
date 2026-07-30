package com.p051p1.mobile.putong.core.newui.home.justreal;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreJustVerificationCardApi;
import com.p051p1.mobile.putong.core.p058ui.VText_Default_Bold;
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
import p151v.VImage;
import p151v.VLinear;
import p153l.bnl0;
import p153l.dbc0;
import p153l.pf60;
import p153l.psd0;
import p153l.qa00;
import p153l.quq;
import p153l.wuq;
import p153l.wvl;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class JustRealHomeTitleLayoutOpt extends FrameLayout implements wvl {

    /* JADX INFO: renamed from: u */
    public static boolean f23853u = false;

    /* JADX INFO: renamed from: a */
    public SVGAnimationView f23854a;

    /* JADX INFO: renamed from: b */
    public VImage f23855b;

    /* JADX INFO: renamed from: c */
    public VText_Default_Bold f23856c;

    /* JADX INFO: renamed from: d */
    public VLinear f23857d;

    /* JADX INFO: renamed from: e */
    public VText_Default_Bold f23858e;

    /* JADX INFO: renamed from: f */
    public JustRealNumContentLayout f23859f;

    /* JADX INFO: renamed from: g */
    public VText_Default_Bold f23860g;

    /* JADX INFO: renamed from: h */
    public VText_Default_Bold f23861h;

    /* JADX INFO: renamed from: i */
    public VText_Default_Bold f23862i;

    /* JADX INFO: renamed from: j */
    public Paint f23863j;

    /* JADX INFO: renamed from: k */
    public float f23864k;

    /* JADX INFO: renamed from: l */
    public float f23865l;

    /* JADX INFO: renamed from: m */
    public int f23866m;

    /* JADX INFO: renamed from: n */
    public int f23867n;

    /* JADX INFO: renamed from: o */
    public ValueAnimator f23868o;

    /* JADX INFO: renamed from: p */
    public ValueAnimator f23869p;

    /* JADX INFO: renamed from: q */
    public float f23870q;

    /* JADX INFO: renamed from: r */
    public pf60<CoreJustVerificationCardApi.JustRealStatus, Integer> f23871r;

    /* JADX INFO: renamed from: s */
    public List<C8165f> f23872s;

    /* JADX INFO: renamed from: t */
    public HashMap<CoreJustVerificationCardApi.JustRealStatus, List<C8164e>> f23873t;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.justreal.JustRealHomeTitleLayoutOpt$a */
    public class C8160a implements RequestCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f23874a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f23875b;

        public C8160a(boolean z, String str) {
            this.f23874a = z;
            this.f23875b = str;
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onLoadFailed(@NonNull ResourceKey resourceKey, @Nullable SVGAException sVGAException) {
            if (this.f23874a) {
                JustRealHomeTitleLayoutOpt.this.f23855b.setAlpha(1.0f);
            }
            boolean unused = JustRealHomeTitleLayoutOpt.f23853u;
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onResourceReady(@NonNull ResourceKey resourceKey, @NonNull Resource<?> resource) {
            if (this.f23874a) {
                JustRealHomeTitleLayoutOpt.this.f23855b.setAlpha(0.0f);
                JustRealHomeTitleLayoutOpt.this.f23854a.stepToFrame(0.0f, true);
            }
            boolean unused = JustRealHomeTitleLayoutOpt.f23853u;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.justreal.JustRealHomeTitleLayoutOpt$b */
    public class C8161b extends AnimListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f23877a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f23878b;

        public C8161b(boolean z, String str) {
            this.f23877a = z;
            this.f23878b = str;
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            super.onStart();
            JustRealHomeTitleLayoutOpt.this.f23855b.setAlpha(0.0f);
            boolean unused = JustRealHomeTitleLayoutOpt.f23853u;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.justreal.JustRealHomeTitleLayoutOpt$c */
    public class C8162c implements ValueAnimator.AnimatorUpdateListener {
        public C8162c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            JustRealHomeTitleLayoutOpt.this.m39685p(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.justreal.JustRealHomeTitleLayoutOpt$d */
    public class C8163d implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ float f23881a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ float f23882b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ float f23883c;

        public C8163d(float f, float f2, float f3) {
            this.f23881a = f;
            this.f23882b = f2;
            this.f23883c = f3;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            float f = this.f23881a;
            if (fFloatValue > (f / 2.0f) + 1.0f) {
                fFloatValue = ((f / 2.0f) + 1.0f) - (fFloatValue - ((f / 2.0f) + 1.0f));
            }
            JustRealHomeTitleLayoutOpt.this.f23865l = this.f23882b + (this.f23883c * fFloatValue);
            JustRealHomeTitleLayoutOpt.this.invalidate();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.justreal.JustRealHomeTitleLayoutOpt$f */
    public static class C8165f {

        /* JADX INFO: renamed from: a */
        public View f23889a;

        /* JADX INFO: renamed from: b */
        public C8164e f23890b = new C8164e();

        /* JADX INFO: renamed from: c */
        public C8164e f23891c = new C8164e();

        /* JADX INFO: renamed from: d */
        public C8164e f23892d = new C8164e();

        /* JADX INFO: renamed from: e */
        public C8164e f23893e = new C8164e();

        public C8165f(View view) {
            this.f23889a = view;
        }

        /* JADX INFO: renamed from: a */
        public void m39690a() {
            this.f23889a.setAlpha(this.f23890b.f23885a);
            this.f23889a.setTranslationY(this.f23890b.f23886b);
            this.f23889a.setTranslationX(this.f23890b.f23888d);
        }
    }

    public JustRealHomeTitleLayoutOpt(@NonNull Context context) {
        super(context);
        this.f23867n = 0;
        this.f23870q = qa00.m175859d(10.0f);
        this.f23872s = new ArrayList();
        m39682m();
    }

    @Override // p153l.wvl
    /* JADX INFO: renamed from: a */
    public void mo39675a(Act act) {
        pf60<CoreJustVerificationCardApi.JustRealStatus, Integer> pf60VarM31246k3 = CoreModule.f18264c.f20446z2.m31246k3();
        this.f23861h.setText(String.valueOf(pf60VarM31246k3.f152157b));
        this.f23860g.setText(String.valueOf(pf60VarM31246k3.f152157b));
        CoreJustVerificationCardApi.JustRealStatus justRealStatus = pf60VarM31246k3.f152156a;
        m39686q(justRealStatus.started ? "https://auto.tancdn.com/v1/raw/e1682a2a-bb89-4167-8d38-b0a02f577b9114.svga" : "https://auto.tancdn.com/v1/raw/07117dd5-5a08-410c-af53-77044233802414.svga", justRealStatus.started ? dbc0.f87019gd : dbc0.f86953ed, false);
        m39687r(pf60VarM31246k3);
        act.duringCreated(CoreModule.f18264c.f20446z2.m31248m3().distinctUntilChanged().skip(1)).subscribe(psd0.m173596G(new y20() { // from class: l.suq
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f170739a.m39684o((pf60) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g */
    public final void m39676g(View view) {
        wuq.m207972a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public final void m39677h(CoreJustVerificationCardApi.JustRealStatus justRealStatus) {
        ValueAnimator valueAnimator = this.f23869p;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f23869p.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f23869p = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(300L);
        this.f23869p.addUpdateListener(new C8162c());
        this.f23869p.start();
    }

    /* JADX INFO: renamed from: i */
    public final void m39678i(int i) {
        ValueAnimator valueAnimator = this.f23868o;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f23868o.cancel();
        }
        float f = this.f23865l;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.12f);
        this.f23868o = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(300L);
        this.f23868o.addUpdateListener(new C8163d(0.12f, f, i - f));
        this.f23868o.start();
    }

    /* JADX INFO: renamed from: j */
    public final void m39679j(int i) {
        if (i > 0) {
            if (this.f23865l != 0.0f) {
                m39678i(i);
            } else {
                this.f23865l = i;
                invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final List<C8164e> m39680k(pf60<CoreJustVerificationCardApi.JustRealStatus, Integer> pf60Var) {
        ArrayList arrayList = new ArrayList();
        Iterator<C8164e> it = this.f23873t.get(pf60Var.f152156a).iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().m39688a());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: l */
    public final void m39681l() {
        this.f23873t = new HashMap<>();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C8164e(1.0f, 0.0f, true));
        arrayList.add(new C8164e(1.0f, 0.0f, true));
        arrayList.add(new C8164e(0.0f, 0.0f, false));
        arrayList.add(new C8164e(1.0f, 0.0f, true));
        arrayList.add(new C8164e(0.0f, 0.0f, false));
        arrayList.add(new C8164e(1.0f, 0.0f, true));
        this.f23873t.put(CoreJustVerificationCardApi.JustRealStatus.IDLE, arrayList);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C8164e(1.0f, 0.0f, true));
        arrayList2.add(new C8164e(0.0f, 0.0f, false));
        arrayList2.add(new C8164e(1.0f, 0.0f, true));
        arrayList2.add(new C8164e(1.0f, 0.0f, true));
        arrayList2.add(new C8164e(1.0f, 0.0f, false));
        arrayList2.add(new C8164e(1.0f, 0.0f, true));
        this.f23873t.put(CoreJustVerificationCardApi.JustRealStatus.PRE_START, arrayList2);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(new C8164e(1.0f, 0.0f, true));
        arrayList3.add(new C8164e(0.0f, 0.0f, false));
        arrayList3.add(new C8164e(1.0f, 0.0f, true));
        arrayList3.add(new C8164e(1.0f, 0.0f, true));
        arrayList3.add(new C8164e(1.0f, 0.0f, false));
        arrayList3.add(new C8164e(1.0f, 0.0f, true));
        this.f23873t.put(CoreJustVerificationCardApi.JustRealStatus.TRIALING, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(new C8164e(1.0f, 0.0f, true));
        arrayList4.add(new C8164e(1.0f, 0.0f, true));
        arrayList4.add(new C8164e(0.0f, 0.0f, false));
        arrayList4.add(new C8164e(1.0f, 0.0f, false));
        arrayList4.add(new C8164e(1.0f, 0.0f, false));
        arrayList4.add(new C8164e(1.0f, 0.0f, true));
        this.f23873t.put(CoreJustVerificationCardApi.JustRealStatus.RUNNING, arrayList4);
        this.f23873t.put(CoreJustVerificationCardApi.JustRealStatus.CLICK_RUNNING, arrayList4);
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(new C8164e(1.0f, 0.0f, true));
        arrayList5.add(new C8164e(1.0f, 0.0f, true));
        arrayList5.add(new C8164e(0.0f, 0.0f, false));
        arrayList5.add(new C8164e(1.0f, 0.0f, true));
        arrayList5.add(new C8164e(0.0f, 0.0f, false));
        arrayList5.add(new C8164e(1.0f, 0.0f, true));
        this.f23873t.put(CoreJustVerificationCardApi.JustRealStatus.FINISH, arrayList5);
    }

    /* JADX INFO: renamed from: m */
    public final void m39682m() {
        Paint paint = new Paint();
        this.f23863j = paint;
        paint.setAntiAlias(true);
        this.f23863j.setColor(-855310);
        this.f23865l = 0.0f;
        this.f23866m = qa00.m175859d(36.0f);
        this.f23864k = qa00.m175859d(10.0f);
        setWillNotDraw(false);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m39683n(View view) {
        quq.m178180P((Act) bnl0.m105506D(getContext()), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m39684o(pf60 pf60Var) {
        CoreJustVerificationCardApi.JustRealStatus justRealStatus = this.f23871r.f152156a;
        if (justRealStatus != null) {
            F f = pf60Var.f152156a;
            if (((CoreJustVerificationCardApi.JustRealStatus) f).started != justRealStatus.started) {
                m39686q(((CoreJustVerificationCardApi.JustRealStatus) f).started ? "https://auto.tancdn.com/v1/raw/971473e6-caf8-4972-8380-2f58273555e414.svga" : "https://auto.tancdn.com/v1/raw/a0d1dac8-559c-4258-a092-6129b31427eb14.svga", ((CoreJustVerificationCardApi.JustRealStatus) f).started ? dbc0.f87019gd : dbc0.f86953ed, true);
            }
        }
        m39687r(pf60Var);
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        float f = this.f23865l;
        if (f > 0.0f) {
            float f2 = this.f23866m;
            float f3 = this.f23864k;
            canvas.drawRoundRect(0.0f, 0.0f, f, f2, f3, f3, this.f23863j);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39676g(this);
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(300L);
        this.f23857d.setLayoutTransition(layoutTransition);
        this.f23872s.add(new C8165f(this.f23854a));
        this.f23872s.add(new C8165f(this.f23856c));
        this.f23872s.add(new C8165f(this.f23857d));
        this.f23872s.add(new C8165f(this.f23860g));
        this.f23872s.add(new C8165f(this.f23861h));
        this.f23872s.add(new C8165f(this.f23862i));
        m39681l();
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.ruq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f164931a.m39683n(view);
            }
        });
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        boolean z = this.f23872s.get(1).f23891c.f23887c;
        List<C8165f> list = this.f23872s;
        int measuredWidth = (z ? list.get(1) : list.get(2)).f23889a.getMeasuredWidth() + qa00.m175859d(42.0f);
        if (measuredWidth != this.f23867n) {
            m39679j(measuredWidth);
            this.f23867n = measuredWidth;
        }
        setMeasuredDimension(measuredWidth, qa00.m175859d(36.0f));
    }

    /* JADX INFO: renamed from: p */
    public final void m39685p(float f) {
        for (C8165f c8165f : this.f23872s) {
            C8164e c8164e = c8165f.f23890b;
            C8164e c8164e2 = c8165f.f23892d;
            float f2 = c8164e2.f23885a;
            C8164e c8164e3 = c8165f.f23893e;
            c8164e.f23885a = f2 + ((c8164e3.f23885a - f2) * f);
            float f3 = c8164e2.f23886b;
            c8164e.f23886b = f3 + ((c8164e3.f23886b - f3) * f);
            float f4 = c8164e2.f23888d;
            c8164e.f23888d = f4 + ((c8164e3.f23888d - f4) * f);
            c8165f.m39690a();
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m39686q(String str, int i, boolean z) {
        this.f23855b.setAlpha(z ? 0.0f : 1.0f);
        this.f23855b.setImageResource(i);
        SVGALoader.with(getContext()).from(str).animListener(new C8161b(z, str)).loadCallback(new C8160a(z, str)).repeatCount(1).autoPlay(z).into(this.f23854a);
    }

    /* JADX INFO: renamed from: r */
    public final void m39687r(pf60<CoreJustVerificationCardApi.JustRealStatus, Integer> pf60Var) {
        this.f23861h.setText(this.f23860g.getText());
        this.f23860g.setText(String.valueOf(pf60Var.f152157b));
        this.f23861h.measure(View.MeasureSpec.makeMeasureSpec(bnl0.m105592y0(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(qa00.m175859d(32.0f), Integer.MIN_VALUE));
        this.f23860g.measure(View.MeasureSpec.makeMeasureSpec(bnl0.m105592y0(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(qa00.m175859d(32.0f), Integer.MIN_VALUE));
        List<C8164e> listM39680k = m39680k(pf60Var);
        for (int i = 0; i < this.f23872s.size(); i++) {
            C8165f c8165f = this.f23872s.get(i);
            c8165f.f23891c.m39689b(listM39680k.get(i));
            if (this.f23871r == null) {
                c8165f.f23890b.m39689b(c8165f.f23891c);
                c8165f.m39690a();
            } else {
                c8165f.f23892d.m39689b(c8165f.f23890b);
                c8165f.f23893e.m39689b(c8165f.f23891c);
                C8164e c8164e = c8165f.f23890b;
                c8164e.f23888d = 0.0f;
                C8164e c8164e2 = c8165f.f23892d;
                boolean z = c8164e2.f23887c;
                C8164e c8164e3 = c8165f.f23893e;
                if (z != c8164e3.f23887c) {
                    c8164e.f23887c = c8165f.f23891c.f23887c;
                    if (c8164e2.f23887c) {
                        c8164e2.f23886b = 0.0f;
                        c8164e3.f23886b = -this.f23870q;
                    } else {
                        c8164e2.f23886b = this.f23870q;
                        c8164e3.f23886b = 0.0f;
                    }
                }
                View view = c8165f.f23889a;
                VText_Default_Bold vText_Default_Bold = this.f23860g;
                if (view == vText_Default_Bold) {
                    boolean zEquals = TextUtils.equals(vText_Default_Bold.getText(), this.f23861h.getText());
                    C8164e c8164e4 = c8165f.f23892d;
                    if (zEquals) {
                        c8164e4.f23886b = 0.0f;
                        c8164e4.f23885a = 1.0f;
                        C8164e c8164e5 = c8165f.f23893e;
                        c8164e5.f23886b = 0.0f;
                        c8164e5.f23885a = 1.0f;
                    } else {
                        c8164e4.f23886b = this.f23870q;
                        c8164e4.f23885a = 0.0f;
                        C8164e c8164e6 = c8165f.f23893e;
                        c8164e6.f23886b = 0.0f;
                        c8164e6.f23885a = 1.0f;
                    }
                } else {
                    VText_Default_Bold vText_Default_Bold2 = this.f23861h;
                    if (view == vText_Default_Bold2) {
                        boolean zEquals2 = TextUtils.equals(vText_Default_Bold.getText(), this.f23861h.getText());
                        C8164e c8164e7 = c8165f.f23892d;
                        if (zEquals2) {
                            c8164e7.f23886b = 0.0f;
                            c8164e7.f23885a = 0.0f;
                            C8164e c8164e8 = c8165f.f23893e;
                            c8164e8.f23886b = 0.0f;
                            c8164e8.f23885a = 0.0f;
                        } else {
                            c8164e7.f23886b = 0.0f;
                            c8164e7.f23885a = 1.0f;
                            C8164e c8164e9 = c8165f.f23893e;
                            c8164e9.f23886b = -this.f23870q;
                            c8164e9.f23885a = 0.0f;
                        }
                    } else if (view == this.f23862i) {
                        c8164e2.f23888d = vText_Default_Bold2.getMeasuredWidth() - this.f23860g.getMeasuredWidth();
                        c8165f.f23893e.f23888d = 0.0f;
                    }
                }
            }
        }
        if (this.f23871r != null) {
            m39677h(pf60Var.f152156a);
        }
        this.f23871r = pf60Var;
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.justreal.JustRealHomeTitleLayoutOpt$e */
    public static class C8164e {

        /* JADX INFO: renamed from: a */
        public float f23885a;

        /* JADX INFO: renamed from: b */
        public float f23886b;

        /* JADX INFO: renamed from: c */
        public boolean f23887c;

        /* JADX INFO: renamed from: d */
        public float f23888d;

        public C8164e(float f, float f2, boolean z) {
            this.f23885a = f;
            this.f23886b = f2;
            this.f23887c = z;
        }

        /* JADX INFO: renamed from: a */
        public C8164e m39688a() {
            return new C8164e(this.f23885a, this.f23886b, this.f23887c);
        }

        /* JADX INFO: renamed from: b */
        public void m39689b(C8164e c8164e) {
            this.f23885a = c8164e.f23885a;
            this.f23886b = c8164e.f23886b;
            this.f23887c = c8164e.f23887c;
        }

        public C8164e() {
        }
    }

    public JustRealHomeTitleLayoutOpt(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23867n = 0;
        this.f23870q = qa00.m175859d(10.0f);
        this.f23872s = new ArrayList();
        m39682m();
    }

    public JustRealHomeTitleLayoutOpt(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23867n = 0;
        this.f23870q = qa00.m175859d(10.0f);
        this.f23872s = new ArrayList();
        m39682m();
    }
}
