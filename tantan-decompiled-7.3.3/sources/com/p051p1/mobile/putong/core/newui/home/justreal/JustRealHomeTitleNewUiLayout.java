package com.p051p1.mobile.putong.core.newui.home.justreal;

import android.animation.LayoutTransition;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
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
import p153l.wvl;
import p153l.y20;
import p153l.zuq;

/* JADX INFO: loaded from: classes11.dex */
public class JustRealHomeTitleNewUiLayout extends FrameLayout implements wvl {

    /* JADX INFO: renamed from: z */
    public static boolean f23907z = false;

    /* JADX INFO: renamed from: a */
    public SVGAnimationView f23908a;

    /* JADX INFO: renamed from: b */
    public VImage f23909b;

    /* JADX INFO: renamed from: c */
    public VText_Default_Bold f23910c;

    /* JADX INFO: renamed from: d */
    public VLinear f23911d;

    /* JADX INFO: renamed from: e */
    public VText_Default_Bold f23912e;

    /* JADX INFO: renamed from: f */
    public JustRealNumContentLayout f23913f;

    /* JADX INFO: renamed from: g */
    public VText_Default_Bold f23914g;

    /* JADX INFO: renamed from: h */
    public VText_Default_Bold f23915h;

    /* JADX INFO: renamed from: i */
    public VText_Default_Bold f23916i;

    /* JADX INFO: renamed from: j */
    public Paint f23917j;

    /* JADX INFO: renamed from: k */
    public float f23918k;

    /* JADX INFO: renamed from: l */
    public float f23919l;

    /* JADX INFO: renamed from: m */
    public int f23920m;

    /* JADX INFO: renamed from: n */
    public int f23921n;

    /* JADX INFO: renamed from: o */
    public ValueAnimator f23922o;

    /* JADX INFO: renamed from: p */
    public ValueAnimator f23923p;

    /* JADX INFO: renamed from: q */
    public Bitmap f23924q;

    /* JADX INFO: renamed from: r */
    public float f23925r;

    /* JADX INFO: renamed from: s */
    public Rect f23926s;

    /* JADX INFO: renamed from: t */
    public RectF f23927t;

    /* JADX INFO: renamed from: u */
    public Path f23928u;

    /* JADX INFO: renamed from: v */
    public PorterDuffXfermode f23929v;

    /* JADX INFO: renamed from: w */
    public pf60<CoreJustVerificationCardApi.JustRealStatus, Integer> f23930w;

    /* JADX INFO: renamed from: x */
    public List<C8175f> f23931x;

    /* JADX INFO: renamed from: y */
    public HashMap<CoreJustVerificationCardApi.JustRealStatus, List<C8174e>> f23932y;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.justreal.JustRealHomeTitleNewUiLayout$a */
    public class C8170a implements RequestCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f23933a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f23934b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f23935c;

        public C8170a(boolean z, String str, int i) {
            this.f23933a = z;
            this.f23934b = str;
            this.f23935c = i;
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onLoadFailed(@NonNull ResourceKey resourceKey, @Nullable SVGAException sVGAException) {
            JustRealHomeTitleNewUiLayout.this.f23909b.setImageResource(this.f23935c);
            JustRealHomeTitleNewUiLayout.this.f23909b.setAlpha(1.0f);
            JustRealHomeTitleNewUiLayout.this.f23908a.setAlpha(0.0f);
            boolean unused = JustRealHomeTitleNewUiLayout.f23907z;
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onResourceReady(@NonNull ResourceKey resourceKey, @NonNull Resource<?> resource) {
            JustRealHomeTitleNewUiLayout.this.f23909b.setAlpha(0.0f);
            JustRealHomeTitleNewUiLayout.this.f23908a.setAlpha(1.0f);
            boolean unused = JustRealHomeTitleNewUiLayout.f23907z;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.justreal.JustRealHomeTitleNewUiLayout$b */
    public class C8171b extends AnimListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f23937a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f23938b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f23939c;

        public C8171b(boolean z, String str, int i) {
            this.f23937a = z;
            this.f23938b = str;
            this.f23939c = i;
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
            boolean unused = JustRealHomeTitleNewUiLayout.f23907z;
            JustRealHomeTitleNewUiLayout.this.f23909b.setImageResource(this.f23939c);
            JustRealHomeTitleNewUiLayout.this.f23909b.setAlpha(1.0f);
            JustRealHomeTitleNewUiLayout.this.f23908a.setAlpha(0.0f);
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            JustRealHomeTitleNewUiLayout.this.f23909b.setAlpha(0.0f);
            JustRealHomeTitleNewUiLayout.this.f23908a.setAlpha(1.0f);
            super.onStart();
            boolean unused = JustRealHomeTitleNewUiLayout.f23907z;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.justreal.JustRealHomeTitleNewUiLayout$c */
    public class C8172c implements ValueAnimator.AnimatorUpdateListener {
        public C8172c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            JustRealHomeTitleNewUiLayout.this.m39714p(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.justreal.JustRealHomeTitleNewUiLayout$d */
    public class C8173d implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ float f23942a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ float f23943b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ float f23944c;

        public C8173d(float f, float f2, float f3) {
            this.f23942a = f;
            this.f23943b = f2;
            this.f23944c = f3;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            float f = this.f23942a;
            if (fFloatValue > (f / 2.0f) + 1.0f) {
                fFloatValue = ((f / 2.0f) + 1.0f) - (fFloatValue - ((f / 2.0f) + 1.0f));
            }
            JustRealHomeTitleNewUiLayout.this.f23919l = this.f23943b + (this.f23944c * fFloatValue);
            JustRealHomeTitleNewUiLayout.this.invalidate();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.justreal.JustRealHomeTitleNewUiLayout$f */
    public static class C8175f {

        /* JADX INFO: renamed from: a */
        public View f23950a;

        /* JADX INFO: renamed from: b */
        public C8174e f23951b = new C8174e();

        /* JADX INFO: renamed from: c */
        public C8174e f23952c = new C8174e();

        /* JADX INFO: renamed from: d */
        public C8174e f23953d = new C8174e();

        /* JADX INFO: renamed from: e */
        public C8174e f23954e = new C8174e();

        public C8175f(View view) {
            this.f23950a = view;
        }

        /* JADX INFO: renamed from: a */
        public void m39720a() {
            this.f23950a.setAlpha(this.f23951b.f23946a);
            this.f23950a.setTranslationY(this.f23951b.f23947b);
            this.f23950a.setTranslationX(this.f23951b.f23949d);
        }
    }

    public JustRealHomeTitleNewUiLayout(@NonNull Context context) {
        super(context);
        this.f23921n = 0;
        this.f23925r = qa00.m175859d(10.0f);
        this.f23929v = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f23931x = new ArrayList();
        m39711m();
    }

    /* JADX INFO: renamed from: h */
    private void m39706h(CoreJustVerificationCardApi.JustRealStatus justRealStatus) {
        ValueAnimator valueAnimator = this.f23923p;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f23923p.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f23923p = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(300L);
        this.f23923p.addUpdateListener(new C8172c());
        this.f23923p.start();
    }

    /* JADX INFO: renamed from: i */
    private void m39707i(int i) {
        ValueAnimator valueAnimator = this.f23922o;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f23922o.cancel();
        }
        float f = this.f23919l;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.12f);
        this.f23922o = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(300L);
        this.f23922o.addUpdateListener(new C8173d(0.12f, f, i - f));
        this.f23922o.start();
    }

    /* JADX INFO: renamed from: j */
    private void m39708j(int i) {
        if (i > 0) {
            if (this.f23919l != 0.0f) {
                m39707i(i);
            } else {
                this.f23919l = i;
                invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: k */
    private List<C8174e> m39709k(pf60<CoreJustVerificationCardApi.JustRealStatus, Integer> pf60Var) {
        ArrayList arrayList = new ArrayList();
        Iterator<C8174e> it = this.f23932y.get(pf60Var.f152156a).iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().m39718a());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: l */
    private void m39710l() {
        this.f23932y = new HashMap<>();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C8174e(1.0f, 0.0f, true));
        arrayList.add(new C8174e(1.0f, 0.0f, true));
        arrayList.add(new C8174e(0.0f, 0.0f, false));
        arrayList.add(new C8174e(1.0f, 0.0f, true));
        arrayList.add(new C8174e(0.0f, 0.0f, false));
        arrayList.add(new C8174e(1.0f, 0.0f, true));
        this.f23932y.put(CoreJustVerificationCardApi.JustRealStatus.IDLE, arrayList);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C8174e(1.0f, 0.0f, true));
        arrayList2.add(new C8174e(0.0f, 0.0f, false));
        arrayList2.add(new C8174e(1.0f, 0.0f, true));
        arrayList2.add(new C8174e(1.0f, 0.0f, true));
        arrayList2.add(new C8174e(1.0f, 0.0f, false));
        arrayList2.add(new C8174e(1.0f, 0.0f, true));
        this.f23932y.put(CoreJustVerificationCardApi.JustRealStatus.PRE_START, arrayList2);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(new C8174e(1.0f, 0.0f, true));
        arrayList3.add(new C8174e(0.0f, 0.0f, false));
        arrayList3.add(new C8174e(1.0f, 0.0f, true));
        arrayList3.add(new C8174e(1.0f, 0.0f, true));
        arrayList3.add(new C8174e(1.0f, 0.0f, false));
        arrayList3.add(new C8174e(1.0f, 0.0f, true));
        this.f23932y.put(CoreJustVerificationCardApi.JustRealStatus.TRIALING, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(new C8174e(1.0f, 0.0f, true));
        arrayList4.add(new C8174e(1.0f, 0.0f, true));
        arrayList4.add(new C8174e(0.0f, 0.0f, false));
        arrayList4.add(new C8174e(1.0f, 0.0f, false));
        arrayList4.add(new C8174e(1.0f, 0.0f, false));
        arrayList4.add(new C8174e(1.0f, 0.0f, true));
        this.f23932y.put(CoreJustVerificationCardApi.JustRealStatus.RUNNING, arrayList4);
        this.f23932y.put(CoreJustVerificationCardApi.JustRealStatus.CLICK_RUNNING, arrayList4);
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(new C8174e(1.0f, 0.0f, true));
        arrayList5.add(new C8174e(1.0f, 0.0f, true));
        arrayList5.add(new C8174e(0.0f, 0.0f, false));
        arrayList5.add(new C8174e(1.0f, 0.0f, true));
        arrayList5.add(new C8174e(0.0f, 0.0f, false));
        arrayList5.add(new C8174e(1.0f, 0.0f, true));
        this.f23932y.put(CoreJustVerificationCardApi.JustRealStatus.FINISH, arrayList5);
    }

    /* JADX INFO: renamed from: m */
    private void m39711m() {
        Paint paint = new Paint();
        this.f23917j = paint;
        paint.setAntiAlias(true);
        this.f23917j.setColor(-8264961);
        this.f23919l = 0.0f;
        this.f23920m = qa00.m175859d(34.0f);
        this.f23918k = qa00.m175859d(10.0f);
        setWillNotDraw(false);
        this.f23924q = BitmapFactory.decodeResource(getResources(), dbc0.f86980f7);
        this.f23926s = new Rect(0, 0, this.f23924q.getWidth(), this.f23924q.getHeight());
        this.f23927t = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f23928u = new Path();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m39712n(View view) {
        quq.m178180P((Act) bnl0.m105506D(getContext()), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    public /* synthetic */ void m39713o(pf60 pf60Var) {
        CoreJustVerificationCardApi.JustRealStatus justRealStatus = this.f23930w.f152156a;
        if (justRealStatus != null) {
            F f = pf60Var.f152156a;
            if (((CoreJustVerificationCardApi.JustRealStatus) f).started != justRealStatus.started) {
                m39717q(((CoreJustVerificationCardApi.JustRealStatus) f).started ? "https://auto.tancdn.com/v1/raw/c2e4b787-b734-4437-b903-e6e4c3a9cfca14.svga" : "https://auto.tancdn.com/v1/raw/76e2e6fd-d661-4ab5-9bd2-cb498e90e47314.svga", ((CoreJustVerificationCardApi.JustRealStatus) f).started ? dbc0.f87052hd : dbc0.f86986fd, true, ((CoreJustVerificationCardApi.JustRealStatus) f).started);
            }
        }
        m39715r(pf60Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public void m39714p(float f) {
        for (C8175f c8175f : this.f23931x) {
            C8174e c8174e = c8175f.f23951b;
            C8174e c8174e2 = c8175f.f23953d;
            float f2 = c8174e2.f23946a;
            C8174e c8174e3 = c8175f.f23954e;
            c8174e.f23946a = f2 + ((c8174e3.f23946a - f2) * f);
            float f3 = c8174e2.f23947b;
            c8174e.f23947b = f3 + ((c8174e3.f23947b - f3) * f);
            float f4 = c8174e2.f23949d;
            c8174e.f23949d = f4 + ((c8174e3.f23949d - f4) * f);
            c8175f.m39720a();
        }
    }

    /* JADX INFO: renamed from: r */
    private void m39715r(pf60<CoreJustVerificationCardApi.JustRealStatus, Integer> pf60Var) {
        this.f23915h.setText(this.f23914g.getText());
        this.f23914g.setText(String.valueOf(pf60Var.f152157b));
        this.f23915h.measure(View.MeasureSpec.makeMeasureSpec(bnl0.m105592y0(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(qa00.m175859d(32.0f), Integer.MIN_VALUE));
        this.f23914g.measure(View.MeasureSpec.makeMeasureSpec(bnl0.m105592y0(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(qa00.m175859d(32.0f), Integer.MIN_VALUE));
        List<C8174e> listM39709k = m39709k(pf60Var);
        for (int i = 0; i < this.f23931x.size(); i++) {
            C8175f c8175f = this.f23931x.get(i);
            c8175f.f23952c.m39719b(listM39709k.get(i));
            if (this.f23930w == null) {
                c8175f.f23951b.m39719b(c8175f.f23952c);
                c8175f.m39720a();
            } else {
                c8175f.f23953d.m39719b(c8175f.f23951b);
                c8175f.f23954e.m39719b(c8175f.f23952c);
                C8174e c8174e = c8175f.f23951b;
                c8174e.f23949d = 0.0f;
                C8174e c8174e2 = c8175f.f23953d;
                boolean z = c8174e2.f23948c;
                C8174e c8174e3 = c8175f.f23954e;
                if (z != c8174e3.f23948c) {
                    c8174e.f23948c = c8175f.f23952c.f23948c;
                    if (c8174e2.f23948c) {
                        c8174e2.f23947b = 0.0f;
                        c8174e3.f23947b = -this.f23925r;
                    } else {
                        c8174e2.f23947b = this.f23925r;
                        c8174e3.f23947b = 0.0f;
                    }
                }
                View view = c8175f.f23950a;
                VText_Default_Bold vText_Default_Bold = this.f23914g;
                if (view == vText_Default_Bold) {
                    boolean zEquals = TextUtils.equals(vText_Default_Bold.getText(), this.f23915h.getText());
                    C8174e c8174e4 = c8175f.f23953d;
                    if (zEquals) {
                        c8174e4.f23947b = 0.0f;
                        c8174e4.f23946a = 1.0f;
                        C8174e c8174e5 = c8175f.f23954e;
                        c8174e5.f23947b = 0.0f;
                        c8174e5.f23946a = 1.0f;
                    } else {
                        c8174e4.f23947b = this.f23925r;
                        c8174e4.f23946a = 0.0f;
                        C8174e c8174e6 = c8175f.f23954e;
                        c8174e6.f23947b = 0.0f;
                        c8174e6.f23946a = 1.0f;
                    }
                } else {
                    VText_Default_Bold vText_Default_Bold2 = this.f23915h;
                    if (view == vText_Default_Bold2) {
                        boolean zEquals2 = TextUtils.equals(vText_Default_Bold.getText(), this.f23915h.getText());
                        C8174e c8174e7 = c8175f.f23953d;
                        if (zEquals2) {
                            c8174e7.f23947b = 0.0f;
                            c8174e7.f23946a = 0.0f;
                            C8174e c8174e8 = c8175f.f23954e;
                            c8174e8.f23947b = 0.0f;
                            c8174e8.f23946a = 0.0f;
                        } else {
                            c8174e7.f23947b = 0.0f;
                            c8174e7.f23946a = 1.0f;
                            C8174e c8174e9 = c8175f.f23954e;
                            c8174e9.f23947b = -this.f23925r;
                            c8174e9.f23946a = 0.0f;
                        }
                    } else if (view == this.f23916i) {
                        c8174e2.f23949d = vText_Default_Bold2.getMeasuredWidth() - this.f23914g.getMeasuredWidth();
                        c8175f.f23954e.f23949d = 0.0f;
                    }
                }
            }
        }
        if (this.f23930w != null) {
            m39706h(pf60Var.f152156a);
        }
        this.f23930w = pf60Var;
    }

    @Override // p153l.wvl
    /* JADX INFO: renamed from: a */
    public void mo39675a(Act act) {
        pf60<CoreJustVerificationCardApi.JustRealStatus, Integer> pf60VarM31246k3 = CoreModule.f18264c.f20446z2.m31246k3();
        this.f23915h.setText(String.valueOf(pf60VarM31246k3.f152157b));
        this.f23914g.setText(String.valueOf(pf60VarM31246k3.f152157b));
        CoreJustVerificationCardApi.JustRealStatus justRealStatus = pf60VarM31246k3.f152156a;
        m39717q(justRealStatus.started ? "https://auto.tancdn.com/v1/raw/ea168f2f-c024-41dc-81e8-a30eb58b06f314.svga" : "https://auto.tancdn.com/v1/raw/82debc02-4e7b-4741-8a15-1d024241dfca14.svga", justRealStatus.started ? dbc0.f87052hd : dbc0.f86986fd, false, justRealStatus.started);
        m39715r(pf60VarM31246k3);
        act.duringCreated(CoreModule.f18264c.f20446z2.m31248m3().distinctUntilChanged().skip(1)).subscribe(psd0.m173596G(new y20() { // from class: l.yuq
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f201656a.m39713o((pf60) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g */
    public final void m39716g(View view) {
        zuq.m221699a(this, view);
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        if (this.f23919l > 0.0f) {
            this.f23917j.setXfermode(null);
            float f = this.f23919l;
            float f2 = this.f23920m;
            float f3 = this.f23918k;
            canvas.drawRoundRect(0.0f, 0.0f, f, f2, f3, f3, this.f23917j);
            RectF rectF = this.f23927t;
            Rect rect = this.f23926s;
            int i = rect.right;
            int i2 = this.f23920m;
            rectF.set(0.0f, 0.0f, (i * i2) / rect.bottom, i2);
            int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, this.f23919l, this.f23920m, null, 31);
            canvas.drawBitmap(this.f23924q, this.f23926s, this.f23927t, this.f23917j);
            this.f23928u.reset();
            this.f23928u.setFillType(Path.FillType.EVEN_ODD);
            Path path = this.f23928u;
            float f4 = this.f23919l + 1.0f;
            float f5 = this.f23920m + 1;
            Path.Direction direction = Path.Direction.CW;
            path.addRect(-1.0f, -1.0f, f4, f5, direction);
            Path path2 = this.f23928u;
            float f6 = this.f23919l;
            float f7 = this.f23920m;
            float f8 = this.f23918k;
            path2.addRoundRect(0.0f, 0.0f, f6, f7, f8, f8, direction);
            this.f23928u.close();
            this.f23917j.setXfermode(this.f23929v);
            canvas.drawPath(this.f23928u, this.f23917j);
            this.f23917j.setXfermode(null);
            canvas.restoreToCount(iSaveLayer);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39716g(this);
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(300L);
        this.f23911d.setLayoutTransition(layoutTransition);
        this.f23931x.add(new C8175f(this.f23908a));
        this.f23931x.add(new C8175f(this.f23910c));
        this.f23931x.add(new C8175f(this.f23911d));
        this.f23931x.add(new C8175f(this.f23914g));
        this.f23931x.add(new C8175f(this.f23915h));
        this.f23931x.add(new C8175f(this.f23916i));
        m39710l();
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.xuq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f196306a.m39712n(view);
            }
        });
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        boolean z = this.f23931x.get(1).f23952c.f23948c;
        List<C8175f> list = this.f23931x;
        int measuredWidth = (z ? list.get(1) : list.get(2)).f23950a.getMeasuredWidth() + qa00.m175859d(42.0f);
        if (measuredWidth != this.f23921n) {
            m39708j(measuredWidth);
            this.f23921n = measuredWidth;
        }
        setMeasuredDimension(measuredWidth, qa00.m175859d(34.0f));
    }

    /* JADX INFO: renamed from: q */
    public final void m39717q(String str, int i, boolean z, boolean z2) {
        if (f23907z) {
            this.f23909b.getAlpha();
            this.f23908a.getAlpha();
        }
        if (z) {
            this.f23908a.setImageDrawable(null);
            SVGALoader.with(getContext()).from(str).animListener(new C8171b(z, str, i)).loadCallback(new C8170a(z, str, i)).repeatCount(1).frameMode(SVGAnimationView.FrameMode.BEFORE).autoPlay(true).into(this.f23908a);
        } else {
            this.f23909b.setImageResource(i);
            this.f23909b.setAlpha(1.0f);
            this.f23908a.setAlpha(0.0f);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.justreal.JustRealHomeTitleNewUiLayout$e */
    public static class C8174e {

        /* JADX INFO: renamed from: a */
        public float f23946a;

        /* JADX INFO: renamed from: b */
        public float f23947b;

        /* JADX INFO: renamed from: c */
        public boolean f23948c;

        /* JADX INFO: renamed from: d */
        public float f23949d;

        public C8174e(float f, float f2, boolean z) {
            this.f23946a = f;
            this.f23947b = f2;
            this.f23948c = z;
        }

        /* JADX INFO: renamed from: a */
        public C8174e m39718a() {
            return new C8174e(this.f23946a, this.f23947b, this.f23948c);
        }

        /* JADX INFO: renamed from: b */
        public void m39719b(C8174e c8174e) {
            this.f23946a = c8174e.f23946a;
            this.f23947b = c8174e.f23947b;
            this.f23948c = c8174e.f23948c;
        }

        public C8174e() {
        }
    }

    public JustRealHomeTitleNewUiLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23921n = 0;
        this.f23925r = qa00.m175859d(10.0f);
        this.f23929v = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f23931x = new ArrayList();
        m39711m();
    }

    public JustRealHomeTitleNewUiLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23921n = 0;
        this.f23925r = qa00.m175859d(10.0f);
        this.f23929v = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f23931x = new ArrayList();
        m39711m();
    }
}
