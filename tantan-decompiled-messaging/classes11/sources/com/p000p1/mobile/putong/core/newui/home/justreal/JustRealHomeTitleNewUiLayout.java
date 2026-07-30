package com.p000p1.mobile.putong.core.newui.home.justreal;

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
import l.x2c0;
import l.xdl0;
import l.ysq;
import p009l.itl;
import p009l.psq;
import v.VImage;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class JustRealHomeTitleNewUiLayout extends FrameLayout implements itl {

    /* JADX INFO: renamed from: z */
    public static boolean f1943z = false;

    /* JADX INFO: renamed from: a */
    public SVGAnimationView f1944a;

    /* JADX INFO: renamed from: b */
    public VImage f1945b;

    /* JADX INFO: renamed from: c */
    public VText_Default_Bold f1946c;

    /* JADX INFO: renamed from: d */
    public VLinear f1947d;

    /* JADX INFO: renamed from: e */
    public VText_Default_Bold f1948e;

    /* JADX INFO: renamed from: f */
    public JustRealNumContentLayout f1949f;

    /* JADX INFO: renamed from: g */
    public VText_Default_Bold f1950g;

    /* JADX INFO: renamed from: h */
    public VText_Default_Bold f1951h;

    /* JADX INFO: renamed from: i */
    public VText_Default_Bold f1952i;

    /* JADX INFO: renamed from: j */
    public Paint f1953j;

    /* JADX INFO: renamed from: k */
    public float f1954k;

    /* JADX INFO: renamed from: l */
    public float f1955l;

    /* JADX INFO: renamed from: m */
    public int f1956m;

    /* JADX INFO: renamed from: n */
    public int f1957n;

    /* JADX INFO: renamed from: o */
    public ValueAnimator f1958o;

    /* JADX INFO: renamed from: p */
    public ValueAnimator f1959p;

    /* JADX INFO: renamed from: q */
    public Bitmap f1960q;

    /* JADX INFO: renamed from: r */
    public float f1961r;

    /* JADX INFO: renamed from: s */
    public Rect f1962s;

    /* JADX INFO: renamed from: t */
    public RectF f1963t;

    /* JADX INFO: renamed from: u */
    public Path f1964u;

    /* JADX INFO: renamed from: v */
    public PorterDuffXfermode f1965v;

    /* JADX INFO: renamed from: w */
    public j760<CoreJustVerificationCardApi.JustRealStatus, Integer> f1966w;

    /* JADX INFO: renamed from: x */
    public List<C0188f> f1967x;

    /* JADX INFO: renamed from: y */
    public HashMap<CoreJustVerificationCardApi.JustRealStatus, List<C0187e>> f1968y;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.justreal.JustRealHomeTitleNewUiLayout$a */
    public class C0183a implements RequestCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f1969a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f1970b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f1971c;

        public C0183a(boolean z, String str, int i) {
            this.f1969a = z;
            this.f1970b = str;
            this.f1971c = i;
        }

        public void onLoadFailed(@NonNull ResourceKey resourceKey, @Nullable SVGAException sVGAException) {
            JustRealHomeTitleNewUiLayout.this.f1945b.setImageResource(this.f1971c);
            JustRealHomeTitleNewUiLayout.this.f1945b.setAlpha(1.0f);
            JustRealHomeTitleNewUiLayout.this.f1944a.setAlpha(0.0f);
            boolean unused = JustRealHomeTitleNewUiLayout.f1943z;
        }

        public void onResourceReady(@NonNull ResourceKey resourceKey, @NonNull Resource<?> resource) {
            JustRealHomeTitleNewUiLayout.this.f1945b.setAlpha(0.0f);
            JustRealHomeTitleNewUiLayout.this.f1944a.setAlpha(1.0f);
            boolean unused = JustRealHomeTitleNewUiLayout.f1943z;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.justreal.JustRealHomeTitleNewUiLayout$b */
    public class C0184b extends AnimListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f1973a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f1974b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f1975c;

        public C0184b(boolean z, String str, int i) {
            this.f1973a = z;
            this.f1974b = str;
            this.f1975c = i;
        }

        public void onFinished() {
            super.onFinished();
            boolean unused = JustRealHomeTitleNewUiLayout.f1943z;
            JustRealHomeTitleNewUiLayout.this.f1945b.setImageResource(this.f1975c);
            JustRealHomeTitleNewUiLayout.this.f1945b.setAlpha(1.0f);
            JustRealHomeTitleNewUiLayout.this.f1944a.setAlpha(0.0f);
        }

        public void onStart() {
            JustRealHomeTitleNewUiLayout.this.f1945b.setAlpha(0.0f);
            JustRealHomeTitleNewUiLayout.this.f1944a.setAlpha(1.0f);
            super.onStart();
            boolean unused = JustRealHomeTitleNewUiLayout.f1943z;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.justreal.JustRealHomeTitleNewUiLayout$c */
    public class C0185c implements ValueAnimator.AnimatorUpdateListener {
        public C0185c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            JustRealHomeTitleNewUiLayout.this.m2697p(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.justreal.JustRealHomeTitleNewUiLayout$d */
    public class C0186d implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ float f1978a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ float f1979b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ float f1980c;

        public C0186d(float f, float f2, float f3) {
            this.f1978a = f;
            this.f1979b = f2;
            this.f1980c = f3;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            float f = this.f1978a;
            if (fFloatValue > (f / 2.0f) + 1.0f) {
                fFloatValue = ((f / 2.0f) + 1.0f) - (fFloatValue - ((f / 2.0f) + 1.0f));
            }
            JustRealHomeTitleNewUiLayout.this.f1955l = this.f1979b + (this.f1980c * fFloatValue);
            JustRealHomeTitleNewUiLayout.this.invalidate();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.justreal.JustRealHomeTitleNewUiLayout$f */
    public static class C0188f {

        /* JADX INFO: renamed from: a */
        public View f1986a;

        /* JADX INFO: renamed from: b */
        public C0187e f1987b = new C0187e();

        /* JADX INFO: renamed from: c */
        public C0187e f1988c = new C0187e();

        /* JADX INFO: renamed from: d */
        public C0187e f1989d = new C0187e();

        /* JADX INFO: renamed from: e */
        public C0187e f1990e = new C0187e();

        public C0188f(View view) {
            this.f1986a = view;
        }

        /* JADX INFO: renamed from: a */
        public void m2703a() {
            this.f1986a.setAlpha(this.f1987b.f1982a);
            this.f1986a.setTranslationY(this.f1987b.f1983b);
            this.f1986a.setTranslationX(this.f1987b.f1985d);
        }
    }

    public JustRealHomeTitleNewUiLayout(@NonNull Context context) {
        super(context);
        this.f1957n = 0;
        this.f1961r = t100.d(10.0f);
        this.f1965v = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f1967x = new ArrayList();
        m2694m();
    }

    /* JADX INFO: renamed from: h */
    private void m2689h(CoreJustVerificationCardApi.JustRealStatus justRealStatus) {
        ValueAnimator valueAnimator = this.f1959p;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f1959p.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f1959p = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(300L);
        this.f1959p.addUpdateListener(new C0185c());
        this.f1959p.start();
    }

    /* JADX INFO: renamed from: i */
    private void m2690i(int i) {
        ValueAnimator valueAnimator = this.f1958o;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f1958o.cancel();
        }
        float f = this.f1955l;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.12f);
        this.f1958o = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(300L);
        this.f1958o.addUpdateListener(new C0186d(0.12f, f, i - f));
        this.f1958o.start();
    }

    /* JADX INFO: renamed from: j */
    private void m2691j(int i) {
        if (i > 0) {
            if (this.f1955l != 0.0f) {
                m2690i(i);
            } else {
                this.f1955l = i;
                invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: k */
    private List<C0187e> m2692k(j760<CoreJustVerificationCardApi.JustRealStatus, Integer> j760Var) {
        ArrayList arrayList = new ArrayList();
        Iterator<C0187e> it = this.f1968y.get(j760Var.a).iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().m2701a());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: l */
    private void m2693l() {
        this.f1968y = new HashMap<>();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0187e(1.0f, 0.0f, true));
        arrayList.add(new C0187e(1.0f, 0.0f, true));
        arrayList.add(new C0187e(0.0f, 0.0f, false));
        arrayList.add(new C0187e(1.0f, 0.0f, true));
        arrayList.add(new C0187e(0.0f, 0.0f, false));
        arrayList.add(new C0187e(1.0f, 0.0f, true));
        this.f1968y.put(CoreJustVerificationCardApi.JustRealStatus.IDLE, arrayList);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C0187e(1.0f, 0.0f, true));
        arrayList2.add(new C0187e(0.0f, 0.0f, false));
        arrayList2.add(new C0187e(1.0f, 0.0f, true));
        arrayList2.add(new C0187e(1.0f, 0.0f, true));
        arrayList2.add(new C0187e(1.0f, 0.0f, false));
        arrayList2.add(new C0187e(1.0f, 0.0f, true));
        this.f1968y.put(CoreJustVerificationCardApi.JustRealStatus.PRE_START, arrayList2);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(new C0187e(1.0f, 0.0f, true));
        arrayList3.add(new C0187e(0.0f, 0.0f, false));
        arrayList3.add(new C0187e(1.0f, 0.0f, true));
        arrayList3.add(new C0187e(1.0f, 0.0f, true));
        arrayList3.add(new C0187e(1.0f, 0.0f, false));
        arrayList3.add(new C0187e(1.0f, 0.0f, true));
        this.f1968y.put(CoreJustVerificationCardApi.JustRealStatus.TRIALING, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(new C0187e(1.0f, 0.0f, true));
        arrayList4.add(new C0187e(1.0f, 0.0f, true));
        arrayList4.add(new C0187e(0.0f, 0.0f, false));
        arrayList4.add(new C0187e(1.0f, 0.0f, false));
        arrayList4.add(new C0187e(1.0f, 0.0f, false));
        arrayList4.add(new C0187e(1.0f, 0.0f, true));
        this.f1968y.put(CoreJustVerificationCardApi.JustRealStatus.RUNNING, arrayList4);
        this.f1968y.put(CoreJustVerificationCardApi.JustRealStatus.CLICK_RUNNING, arrayList4);
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(new C0187e(1.0f, 0.0f, true));
        arrayList5.add(new C0187e(1.0f, 0.0f, true));
        arrayList5.add(new C0187e(0.0f, 0.0f, false));
        arrayList5.add(new C0187e(1.0f, 0.0f, true));
        arrayList5.add(new C0187e(0.0f, 0.0f, false));
        arrayList5.add(new C0187e(1.0f, 0.0f, true));
        this.f1968y.put(CoreJustVerificationCardApi.JustRealStatus.FINISH, arrayList5);
    }

    /* JADX INFO: renamed from: m */
    private void m2694m() {
        Paint paint = new Paint();
        this.f1953j = paint;
        paint.setAntiAlias(true);
        this.f1953j.setColor(-8264961);
        this.f1955l = 0.0f;
        this.f1956m = t100.d(34.0f);
        this.f1954k = t100.d(10.0f);
        setWillNotDraw(false);
        this.f1960q = BitmapFactory.decodeResource(getResources(), x2c0.e7);
        this.f1962s = new Rect(0, 0, this.f1960q.getWidth(), this.f1960q.getHeight());
        this.f1963t = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f1964u = new Path();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m2695n(View view) {
        psq.m20645P(xdl0.D(getContext()), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public /* synthetic */ void m2696o(j760 j760Var) {
        Object obj = this.f1966w.a;
        if (obj != null) {
            Object obj2 = j760Var.a;
            if (((CoreJustVerificationCardApi.JustRealStatus) obj2).started != ((CoreJustVerificationCardApi.JustRealStatus) obj).started) {
                m2700q(((CoreJustVerificationCardApi.JustRealStatus) obj2).started ? "https://auto.tancdn.com/v1/raw/c2e4b787-b734-4437-b903-e6e4c3a9cfca14.svga" : "https://auto.tancdn.com/v1/raw/76e2e6fd-d661-4ab5-9bd2-cb498e90e47314.svga", ((CoreJustVerificationCardApi.JustRealStatus) obj2).started ? x2c0.gd : x2c0.ed, true, ((CoreJustVerificationCardApi.JustRealStatus) obj2).started);
            }
        }
        m2698r(j760Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public void m2697p(float f) {
        for (C0188f c0188f : this.f1967x) {
            C0187e c0187e = c0188f.f1987b;
            C0187e c0187e2 = c0188f.f1989d;
            float f2 = c0187e2.f1982a;
            C0187e c0187e3 = c0188f.f1990e;
            c0187e.f1982a = f2 + ((c0187e3.f1982a - f2) * f);
            float f3 = c0187e2.f1983b;
            c0187e.f1983b = f3 + ((c0187e3.f1983b - f3) * f);
            float f4 = c0187e2.f1985d;
            c0187e.f1985d = f4 + ((c0187e3.f1985d - f4) * f);
            c0188f.m2703a();
        }
    }

    /* JADX INFO: renamed from: r */
    private void m2698r(j760<CoreJustVerificationCardApi.JustRealStatus, Integer> j760Var) {
        this.f1951h.setText(this.f1950g.getText());
        this.f1950g.setText(String.valueOf(j760Var.b));
        this.f1951h.measure(View.MeasureSpec.makeMeasureSpec(xdl0.y0(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(t100.d(32.0f), Integer.MIN_VALUE));
        this.f1950g.measure(View.MeasureSpec.makeMeasureSpec(xdl0.y0(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(t100.d(32.0f), Integer.MIN_VALUE));
        List<C0187e> listM2692k = m2692k(j760Var);
        for (int i = 0; i < this.f1967x.size(); i++) {
            C0188f c0188f = this.f1967x.get(i);
            c0188f.f1988c.m2702b(listM2692k.get(i));
            if (this.f1966w == null) {
                c0188f.f1987b.m2702b(c0188f.f1988c);
                c0188f.m2703a();
            } else {
                c0188f.f1989d.m2702b(c0188f.f1987b);
                c0188f.f1990e.m2702b(c0188f.f1988c);
                C0187e c0187e = c0188f.f1987b;
                c0187e.f1985d = 0.0f;
                C0187e c0187e2 = c0188f.f1989d;
                boolean z = c0187e2.f1984c;
                C0187e c0187e3 = c0188f.f1990e;
                if (z != c0187e3.f1984c) {
                    c0187e.f1984c = c0188f.f1988c.f1984c;
                    if (c0187e2.f1984c) {
                        c0187e2.f1983b = 0.0f;
                        c0187e3.f1983b = -this.f1961r;
                    } else {
                        c0187e2.f1983b = this.f1961r;
                        c0187e3.f1983b = 0.0f;
                    }
                }
                VText_Default_Bold vText_Default_Bold = c0188f.f1986a;
                VText_Default_Bold vText_Default_Bold2 = this.f1950g;
                if (vText_Default_Bold == vText_Default_Bold2) {
                    boolean zEquals = TextUtils.equals(vText_Default_Bold2.getText(), this.f1951h.getText());
                    C0187e c0187e4 = c0188f.f1989d;
                    if (zEquals) {
                        c0187e4.f1983b = 0.0f;
                        c0187e4.f1982a = 1.0f;
                        C0187e c0187e5 = c0188f.f1990e;
                        c0187e5.f1983b = 0.0f;
                        c0187e5.f1982a = 1.0f;
                    } else {
                        c0187e4.f1983b = this.f1961r;
                        c0187e4.f1982a = 0.0f;
                        C0187e c0187e6 = c0188f.f1990e;
                        c0187e6.f1983b = 0.0f;
                        c0187e6.f1982a = 1.0f;
                    }
                } else {
                    VText_Default_Bold vText_Default_Bold3 = this.f1951h;
                    if (vText_Default_Bold == vText_Default_Bold3) {
                        boolean zEquals2 = TextUtils.equals(vText_Default_Bold2.getText(), this.f1951h.getText());
                        C0187e c0187e7 = c0188f.f1989d;
                        if (zEquals2) {
                            c0187e7.f1983b = 0.0f;
                            c0187e7.f1982a = 0.0f;
                            C0187e c0187e8 = c0188f.f1990e;
                            c0187e8.f1983b = 0.0f;
                            c0187e8.f1982a = 0.0f;
                        } else {
                            c0187e7.f1983b = 0.0f;
                            c0187e7.f1982a = 1.0f;
                            C0187e c0187e9 = c0188f.f1990e;
                            c0187e9.f1983b = -this.f1961r;
                            c0187e9.f1982a = 0.0f;
                        }
                    } else if (vText_Default_Bold == this.f1952i) {
                        c0187e2.f1985d = vText_Default_Bold3.getMeasuredWidth() - this.f1950g.getMeasuredWidth();
                        c0188f.f1990e.f1985d = 0.0f;
                    }
                }
            }
        }
        if (this.f1966w != null) {
            m2689h((CoreJustVerificationCardApi.JustRealStatus) j760Var.a);
        }
        this.f1966w = j760Var;
    }

    @Override // p009l.itl
    /* JADX INFO: renamed from: a */
    public void mo2658a(Act act) {
        j760<CoreJustVerificationCardApi.JustRealStatus, Integer> j760VarK3 = CoreModule.c.z2.k3();
        this.f1951h.setText(String.valueOf(j760VarK3.b));
        this.f1950g.setText(String.valueOf(j760VarK3.b));
        Object obj = j760VarK3.a;
        m2700q(((CoreJustVerificationCardApi.JustRealStatus) obj).started ? "https://auto.tancdn.com/v1/raw/ea168f2f-c024-41dc-81e8-a30eb58b06f314.svga" : "https://auto.tancdn.com/v1/raw/82debc02-4e7b-4741-8a15-1d024241dfca14.svga", ((CoreJustVerificationCardApi.JustRealStatus) obj).started ? x2c0.gd : x2c0.ed, false, ((CoreJustVerificationCardApi.JustRealStatus) obj).started);
        m2698r(j760VarK3);
        act.duringCreated(CoreModule.c.z2.m3().distinctUntilChanged().skip(1)).subscribe(mkd0.G(new e30() { // from class: l.xsq
            public final void call(Object obj2) {
                this.f22712a.m2696o((j760) obj2);
            }
        }));
    }

    /* JADX INFO: renamed from: g */
    public final void m2699g(View view) {
        ysq.a(this, view);
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        if (this.f1955l > 0.0f) {
            this.f1953j.setXfermode(null);
            float f = this.f1955l;
            float f2 = this.f1956m;
            float f3 = this.f1954k;
            canvas.drawRoundRect(0.0f, 0.0f, f, f2, f3, f3, this.f1953j);
            RectF rectF = this.f1963t;
            Rect rect = this.f1962s;
            int i = rect.right;
            int i2 = this.f1956m;
            rectF.set(0.0f, 0.0f, (i * i2) / rect.bottom, i2);
            int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, this.f1955l, this.f1956m, null, 31);
            canvas.drawBitmap(this.f1960q, this.f1962s, this.f1963t, this.f1953j);
            this.f1964u.reset();
            this.f1964u.setFillType(Path.FillType.EVEN_ODD);
            Path path = this.f1964u;
            float f4 = this.f1955l + 1.0f;
            float f5 = this.f1956m + 1;
            Path.Direction direction = Path.Direction.CW;
            path.addRect(-1.0f, -1.0f, f4, f5, direction);
            Path path2 = this.f1964u;
            float f6 = this.f1955l;
            float f7 = this.f1956m;
            float f8 = this.f1954k;
            path2.addRoundRect(0.0f, 0.0f, f6, f7, f8, f8, direction);
            this.f1964u.close();
            this.f1953j.setXfermode(this.f1965v);
            canvas.drawPath(this.f1964u, this.f1953j);
            this.f1953j.setXfermode(null);
            canvas.restoreToCount(iSaveLayer);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2699g(this);
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(300L);
        this.f1947d.setLayoutTransition(layoutTransition);
        this.f1967x.add(new C0188f(this.f1944a));
        this.f1967x.add(new C0188f(this.f1946c));
        this.f1967x.add(new C0188f(this.f1947d));
        this.f1967x.add(new C0188f(this.f1950g));
        this.f1967x.add(new C0188f(this.f1951h));
        this.f1967x.add(new C0188f(this.f1952i));
        m2693l();
        xdl0.E0(this, new View.OnClickListener() { // from class: l.wsq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22304a.m2695n(view);
            }
        });
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        boolean z = this.f1967x.get(1).f1988c.f1984c;
        List<C0188f> list = this.f1967x;
        int measuredWidth = (z ? list.get(1) : list.get(2)).f1986a.getMeasuredWidth() + t100.d(42.0f);
        if (measuredWidth != this.f1957n) {
            m2691j(measuredWidth);
            this.f1957n = measuredWidth;
        }
        setMeasuredDimension(measuredWidth, t100.d(34.0f));
    }

    /* JADX INFO: renamed from: q */
    public final void m2700q(String str, int i, boolean z, boolean z2) {
        if (f1943z) {
            this.f1945b.getAlpha();
            this.f1944a.getAlpha();
        }
        if (z) {
            this.f1944a.setImageDrawable(null);
            SVGALoader.with(getContext()).from(str).animListener(new C0184b(z, str, i)).loadCallback(new C0183a(z, str, i)).repeatCount(1).frameMode(SVGAnimationView.FrameMode.BEFORE).autoPlay(true).into(this.f1944a);
        } else {
            this.f1945b.setImageResource(i);
            this.f1945b.setAlpha(1.0f);
            this.f1944a.setAlpha(0.0f);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.justreal.JustRealHomeTitleNewUiLayout$e */
    public static class C0187e {

        /* JADX INFO: renamed from: a */
        public float f1982a;

        /* JADX INFO: renamed from: b */
        public float f1983b;

        /* JADX INFO: renamed from: c */
        public boolean f1984c;

        /* JADX INFO: renamed from: d */
        public float f1985d;

        public C0187e(float f, float f2, boolean z) {
            this.f1982a = f;
            this.f1983b = f2;
            this.f1984c = z;
        }

        /* JADX INFO: renamed from: a */
        public C0187e m2701a() {
            return new C0187e(this.f1982a, this.f1983b, this.f1984c);
        }

        /* JADX INFO: renamed from: b */
        public void m2702b(C0187e c0187e) {
            this.f1982a = c0187e.f1982a;
            this.f1983b = c0187e.f1983b;
            this.f1984c = c0187e.f1984c;
        }

        public C0187e() {
        }
    }

    public JustRealHomeTitleNewUiLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1957n = 0;
        this.f1961r = t100.d(10.0f);
        this.f1965v = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f1967x = new ArrayList();
        m2694m();
    }

    public JustRealHomeTitleNewUiLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1957n = 0;
        this.f1961r = t100.d(10.0f);
        this.f1965v = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f1967x = new ArrayList();
        m2694m();
    }
}
