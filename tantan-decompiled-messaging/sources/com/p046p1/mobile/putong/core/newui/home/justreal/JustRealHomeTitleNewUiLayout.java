package com.p046p1.mobile.putong.core.newui.home.justreal;

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
import p149l.x2c0;
import p149l.xdl0;
import p149l.ysq;

/* JADX INFO: loaded from: classes11.dex */
public class JustRealHomeTitleNewUiLayout extends FrameLayout implements itl {

    /* JADX INFO: renamed from: z */
    public static boolean f23165z = false;

    /* JADX INFO: renamed from: a */
    public SVGAnimationView f23166a;

    /* JADX INFO: renamed from: b */
    public VImage f23167b;

    /* JADX INFO: renamed from: c */
    public VText_Default_Bold f23168c;

    /* JADX INFO: renamed from: d */
    public VLinear f23169d;

    /* JADX INFO: renamed from: e */
    public VText_Default_Bold f23170e;

    /* JADX INFO: renamed from: f */
    public JustRealNumContentLayout f23171f;

    /* JADX INFO: renamed from: g */
    public VText_Default_Bold f23172g;

    /* JADX INFO: renamed from: h */
    public VText_Default_Bold f23173h;

    /* JADX INFO: renamed from: i */
    public VText_Default_Bold f23174i;

    /* JADX INFO: renamed from: j */
    public Paint f23175j;

    /* JADX INFO: renamed from: k */
    public float f23176k;

    /* JADX INFO: renamed from: l */
    public float f23177l;

    /* JADX INFO: renamed from: m */
    public int f23178m;

    /* JADX INFO: renamed from: n */
    public int f23179n;

    /* JADX INFO: renamed from: o */
    public ValueAnimator f23180o;

    /* JADX INFO: renamed from: p */
    public ValueAnimator f23181p;

    /* JADX INFO: renamed from: q */
    public Bitmap f23182q;

    /* JADX INFO: renamed from: r */
    public float f23183r;

    /* JADX INFO: renamed from: s */
    public Rect f23184s;

    /* JADX INFO: renamed from: t */
    public RectF f23185t;

    /* JADX INFO: renamed from: u */
    public Path f23186u;

    /* JADX INFO: renamed from: v */
    public PorterDuffXfermode f23187v;

    /* JADX INFO: renamed from: w */
    public j760<CoreJustVerificationCardApi.JustRealStatus, Integer> f23188w;

    /* JADX INFO: renamed from: x */
    public List<C8024f> f23189x;

    /* JADX INFO: renamed from: y */
    public HashMap<CoreJustVerificationCardApi.JustRealStatus, List<C8023e>> f23190y;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.justreal.JustRealHomeTitleNewUiLayout$a */
    public class C8019a implements RequestCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f23191a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f23192b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f23193c;

        public C8019a(boolean z, String str, int i) {
            this.f23191a = z;
            this.f23192b = str;
            this.f23193c = i;
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onLoadFailed(@NonNull ResourceKey resourceKey, @Nullable SVGAException sVGAException) {
            JustRealHomeTitleNewUiLayout.this.f23167b.setImageResource(this.f23193c);
            JustRealHomeTitleNewUiLayout.this.f23167b.setAlpha(1.0f);
            JustRealHomeTitleNewUiLayout.this.f23166a.setAlpha(0.0f);
            boolean unused = JustRealHomeTitleNewUiLayout.f23165z;
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onResourceReady(@NonNull ResourceKey resourceKey, @NonNull Resource<?> resource) {
            JustRealHomeTitleNewUiLayout.this.f23167b.setAlpha(0.0f);
            JustRealHomeTitleNewUiLayout.this.f23166a.setAlpha(1.0f);
            boolean unused = JustRealHomeTitleNewUiLayout.f23165z;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.justreal.JustRealHomeTitleNewUiLayout$b */
    public class C8020b extends AnimListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f23195a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f23196b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f23197c;

        public C8020b(boolean z, String str, int i) {
            this.f23195a = z;
            this.f23196b = str;
            this.f23197c = i;
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
            boolean unused = JustRealHomeTitleNewUiLayout.f23165z;
            JustRealHomeTitleNewUiLayout.this.f23167b.setImageResource(this.f23197c);
            JustRealHomeTitleNewUiLayout.this.f23167b.setAlpha(1.0f);
            JustRealHomeTitleNewUiLayout.this.f23166a.setAlpha(0.0f);
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            JustRealHomeTitleNewUiLayout.this.f23167b.setAlpha(0.0f);
            JustRealHomeTitleNewUiLayout.this.f23166a.setAlpha(1.0f);
            super.onStart();
            boolean unused = JustRealHomeTitleNewUiLayout.f23165z;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.justreal.JustRealHomeTitleNewUiLayout$c */
    public class C8021c implements ValueAnimator.AnimatorUpdateListener {
        public C8021c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            JustRealHomeTitleNewUiLayout.this.m38711p(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.justreal.JustRealHomeTitleNewUiLayout$d */
    public class C8022d implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ float f23200a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ float f23201b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ float f23202c;

        public C8022d(float f, float f2, float f3) {
            this.f23200a = f;
            this.f23201b = f2;
            this.f23202c = f3;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            float f = this.f23200a;
            if (fFloatValue > (f / 2.0f) + 1.0f) {
                fFloatValue = ((f / 2.0f) + 1.0f) - (fFloatValue - ((f / 2.0f) + 1.0f));
            }
            JustRealHomeTitleNewUiLayout.this.f23177l = this.f23201b + (this.f23202c * fFloatValue);
            JustRealHomeTitleNewUiLayout.this.invalidate();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.justreal.JustRealHomeTitleNewUiLayout$f */
    public static class C8024f {

        /* JADX INFO: renamed from: a */
        public View f23208a;

        /* JADX INFO: renamed from: b */
        public C8023e f23209b = new C8023e();

        /* JADX INFO: renamed from: c */
        public C8023e f23210c = new C8023e();

        /* JADX INFO: renamed from: d */
        public C8023e f23211d = new C8023e();

        /* JADX INFO: renamed from: e */
        public C8023e f23212e = new C8023e();

        public C8024f(View view) {
            this.f23208a = view;
        }

        /* JADX INFO: renamed from: a */
        public void m38717a() {
            this.f23208a.setAlpha(this.f23209b.f23204a);
            this.f23208a.setTranslationY(this.f23209b.f23205b);
            this.f23208a.setTranslationX(this.f23209b.f23207d);
        }
    }

    public JustRealHomeTitleNewUiLayout(@NonNull Context context) {
        super(context);
        this.f23179n = 0;
        this.f23183r = t100.m186890d(10.0f);
        this.f23187v = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f23189x = new ArrayList();
        m38708m();
    }

    /* JADX INFO: renamed from: h */
    private void m38703h(CoreJustVerificationCardApi.JustRealStatus justRealStatus) {
        ValueAnimator valueAnimator = this.f23181p;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f23181p.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f23181p = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(300L);
        this.f23181p.addUpdateListener(new C8021c());
        this.f23181p.start();
    }

    /* JADX INFO: renamed from: i */
    private void m38704i(int i) {
        ValueAnimator valueAnimator = this.f23180o;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f23180o.cancel();
        }
        float f = this.f23177l;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.12f);
        this.f23180o = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(300L);
        this.f23180o.addUpdateListener(new C8022d(0.12f, f, i - f));
        this.f23180o.start();
    }

    /* JADX INFO: renamed from: j */
    private void m38705j(int i) {
        if (i > 0) {
            if (this.f23177l != 0.0f) {
                m38704i(i);
            } else {
                this.f23177l = i;
                invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: k */
    private List<C8023e> m38706k(j760<CoreJustVerificationCardApi.JustRealStatus, Integer> j760Var) {
        ArrayList arrayList = new ArrayList();
        Iterator<C8023e> it = this.f23190y.get(j760Var.f116564a).iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().m38715a());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: l */
    private void m38707l() {
        this.f23190y = new HashMap<>();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C8023e(1.0f, 0.0f, true));
        arrayList.add(new C8023e(1.0f, 0.0f, true));
        arrayList.add(new C8023e(0.0f, 0.0f, false));
        arrayList.add(new C8023e(1.0f, 0.0f, true));
        arrayList.add(new C8023e(0.0f, 0.0f, false));
        arrayList.add(new C8023e(1.0f, 0.0f, true));
        this.f23190y.put(CoreJustVerificationCardApi.JustRealStatus.IDLE, arrayList);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C8023e(1.0f, 0.0f, true));
        arrayList2.add(new C8023e(0.0f, 0.0f, false));
        arrayList2.add(new C8023e(1.0f, 0.0f, true));
        arrayList2.add(new C8023e(1.0f, 0.0f, true));
        arrayList2.add(new C8023e(1.0f, 0.0f, false));
        arrayList2.add(new C8023e(1.0f, 0.0f, true));
        this.f23190y.put(CoreJustVerificationCardApi.JustRealStatus.PRE_START, arrayList2);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(new C8023e(1.0f, 0.0f, true));
        arrayList3.add(new C8023e(0.0f, 0.0f, false));
        arrayList3.add(new C8023e(1.0f, 0.0f, true));
        arrayList3.add(new C8023e(1.0f, 0.0f, true));
        arrayList3.add(new C8023e(1.0f, 0.0f, false));
        arrayList3.add(new C8023e(1.0f, 0.0f, true));
        this.f23190y.put(CoreJustVerificationCardApi.JustRealStatus.TRIALING, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(new C8023e(1.0f, 0.0f, true));
        arrayList4.add(new C8023e(1.0f, 0.0f, true));
        arrayList4.add(new C8023e(0.0f, 0.0f, false));
        arrayList4.add(new C8023e(1.0f, 0.0f, false));
        arrayList4.add(new C8023e(1.0f, 0.0f, false));
        arrayList4.add(new C8023e(1.0f, 0.0f, true));
        this.f23190y.put(CoreJustVerificationCardApi.JustRealStatus.RUNNING, arrayList4);
        this.f23190y.put(CoreJustVerificationCardApi.JustRealStatus.CLICK_RUNNING, arrayList4);
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(new C8023e(1.0f, 0.0f, true));
        arrayList5.add(new C8023e(1.0f, 0.0f, true));
        arrayList5.add(new C8023e(0.0f, 0.0f, false));
        arrayList5.add(new C8023e(1.0f, 0.0f, true));
        arrayList5.add(new C8023e(0.0f, 0.0f, false));
        arrayList5.add(new C8023e(1.0f, 0.0f, true));
        this.f23190y.put(CoreJustVerificationCardApi.JustRealStatus.FINISH, arrayList5);
    }

    /* JADX INFO: renamed from: m */
    private void m38708m() {
        Paint paint = new Paint();
        this.f23175j = paint;
        paint.setAntiAlias(true);
        this.f23175j.setColor(-8264961);
        this.f23177l = 0.0f;
        this.f23178m = t100.m186890d(34.0f);
        this.f23176k = t100.m186890d(10.0f);
        setWillNotDraw(false);
        this.f23182q = BitmapFactory.decodeResource(getResources(), x2c0.f190100e7);
        this.f23184s = new Rect(0, 0, this.f23182q.getWidth(), this.f23182q.getHeight());
        this.f23185t = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f23186u = new Path();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m38709n(View view) {
        psq.m171200P((Act) xdl0.m208326D(getContext()), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    public /* synthetic */ void m38710o(j760 j760Var) {
        CoreJustVerificationCardApi.JustRealStatus justRealStatus = this.f23188w.f116564a;
        if (justRealStatus != null) {
            F f = j760Var.f116564a;
            if (((CoreJustVerificationCardApi.JustRealStatus) f).started != justRealStatus.started) {
                m38714q(((CoreJustVerificationCardApi.JustRealStatus) f).started ? "https://auto.tancdn.com/v1/raw/c2e4b787-b734-4437-b903-e6e4c3a9cfca14.svga" : "https://auto.tancdn.com/v1/raw/76e2e6fd-d661-4ab5-9bd2-cb498e90e47314.svga", ((CoreJustVerificationCardApi.JustRealStatus) f).started ? x2c0.f190170gd : x2c0.f190106ed, true, ((CoreJustVerificationCardApi.JustRealStatus) f).started);
            }
        }
        m38712r(j760Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public void m38711p(float f) {
        for (C8024f c8024f : this.f23189x) {
            C8023e c8023e = c8024f.f23209b;
            C8023e c8023e2 = c8024f.f23211d;
            float f2 = c8023e2.f23204a;
            C8023e c8023e3 = c8024f.f23212e;
            c8023e.f23204a = f2 + ((c8023e3.f23204a - f2) * f);
            float f3 = c8023e2.f23205b;
            c8023e.f23205b = f3 + ((c8023e3.f23205b - f3) * f);
            float f4 = c8023e2.f23207d;
            c8023e.f23207d = f4 + ((c8023e3.f23207d - f4) * f);
            c8024f.m38717a();
        }
    }

    /* JADX INFO: renamed from: r */
    private void m38712r(j760<CoreJustVerificationCardApi.JustRealStatus, Integer> j760Var) {
        this.f23173h.setText(this.f23172g.getText());
        this.f23172g.setText(String.valueOf(j760Var.f116565b));
        this.f23173h.measure(View.MeasureSpec.makeMeasureSpec(xdl0.m208412y0(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(t100.m186890d(32.0f), Integer.MIN_VALUE));
        this.f23172g.measure(View.MeasureSpec.makeMeasureSpec(xdl0.m208412y0(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(t100.m186890d(32.0f), Integer.MIN_VALUE));
        List<C8023e> listM38706k = m38706k(j760Var);
        for (int i = 0; i < this.f23189x.size(); i++) {
            C8024f c8024f = this.f23189x.get(i);
            c8024f.f23210c.m38716b(listM38706k.get(i));
            if (this.f23188w == null) {
                c8024f.f23209b.m38716b(c8024f.f23210c);
                c8024f.m38717a();
            } else {
                c8024f.f23211d.m38716b(c8024f.f23209b);
                c8024f.f23212e.m38716b(c8024f.f23210c);
                C8023e c8023e = c8024f.f23209b;
                c8023e.f23207d = 0.0f;
                C8023e c8023e2 = c8024f.f23211d;
                boolean z = c8023e2.f23206c;
                C8023e c8023e3 = c8024f.f23212e;
                if (z != c8023e3.f23206c) {
                    c8023e.f23206c = c8024f.f23210c.f23206c;
                    if (c8023e2.f23206c) {
                        c8023e2.f23205b = 0.0f;
                        c8023e3.f23205b = -this.f23183r;
                    } else {
                        c8023e2.f23205b = this.f23183r;
                        c8023e3.f23205b = 0.0f;
                    }
                }
                View view = c8024f.f23208a;
                VText_Default_Bold vText_Default_Bold = this.f23172g;
                if (view == vText_Default_Bold) {
                    boolean zEquals = TextUtils.equals(vText_Default_Bold.getText(), this.f23173h.getText());
                    C8023e c8023e4 = c8024f.f23211d;
                    if (zEquals) {
                        c8023e4.f23205b = 0.0f;
                        c8023e4.f23204a = 1.0f;
                        C8023e c8023e5 = c8024f.f23212e;
                        c8023e5.f23205b = 0.0f;
                        c8023e5.f23204a = 1.0f;
                    } else {
                        c8023e4.f23205b = this.f23183r;
                        c8023e4.f23204a = 0.0f;
                        C8023e c8023e6 = c8024f.f23212e;
                        c8023e6.f23205b = 0.0f;
                        c8023e6.f23204a = 1.0f;
                    }
                } else {
                    VText_Default_Bold vText_Default_Bold2 = this.f23173h;
                    if (view == vText_Default_Bold2) {
                        boolean zEquals2 = TextUtils.equals(vText_Default_Bold.getText(), this.f23173h.getText());
                        C8023e c8023e7 = c8024f.f23211d;
                        if (zEquals2) {
                            c8023e7.f23205b = 0.0f;
                            c8023e7.f23204a = 0.0f;
                            C8023e c8023e8 = c8024f.f23212e;
                            c8023e8.f23205b = 0.0f;
                            c8023e8.f23204a = 0.0f;
                        } else {
                            c8023e7.f23205b = 0.0f;
                            c8023e7.f23204a = 1.0f;
                            C8023e c8023e9 = c8024f.f23212e;
                            c8023e9.f23205b = -this.f23183r;
                            c8023e9.f23204a = 0.0f;
                        }
                    } else if (view == this.f23174i) {
                        c8023e2.f23207d = vText_Default_Bold2.getMeasuredWidth() - this.f23172g.getMeasuredWidth();
                        c8024f.f23212e.f23207d = 0.0f;
                    }
                }
            }
        }
        if (this.f23188w != null) {
            m38703h(j760Var.f116564a);
        }
        this.f23188w = j760Var;
    }

    @Override // p149l.itl
    /* JADX INFO: renamed from: a */
    public void mo38672a(Act act) {
        j760<CoreJustVerificationCardApi.JustRealStatus, Integer> j760VarM30248k3 = CoreModule.f17545c.f19704z2.m30248k3();
        this.f23173h.setText(String.valueOf(j760VarM30248k3.f116565b));
        this.f23172g.setText(String.valueOf(j760VarM30248k3.f116565b));
        CoreJustVerificationCardApi.JustRealStatus justRealStatus = j760VarM30248k3.f116564a;
        m38714q(justRealStatus.started ? "https://auto.tancdn.com/v1/raw/ea168f2f-c024-41dc-81e8-a30eb58b06f314.svga" : "https://auto.tancdn.com/v1/raw/82debc02-4e7b-4741-8a15-1d024241dfca14.svga", justRealStatus.started ? x2c0.f190170gd : x2c0.f190106ed, false, justRealStatus.started);
        m38712r(j760VarM30248k3);
        act.duringCreated(CoreModule.f17545c.f19704z2.m30250m3().distinctUntilChanged().skip(1)).subscribe(mkd0.m154955G(new e30() { // from class: l.xsq
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f194300a.m38710o((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g */
    public final void m38713g(View view) {
        ysq.m215917a(this, view);
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        if (this.f23177l > 0.0f) {
            this.f23175j.setXfermode(null);
            float f = this.f23177l;
            float f2 = this.f23178m;
            float f3 = this.f23176k;
            canvas.drawRoundRect(0.0f, 0.0f, f, f2, f3, f3, this.f23175j);
            RectF rectF = this.f23185t;
            Rect rect = this.f23184s;
            int i = rect.right;
            int i2 = this.f23178m;
            rectF.set(0.0f, 0.0f, (i * i2) / rect.bottom, i2);
            int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, this.f23177l, this.f23178m, null, 31);
            canvas.drawBitmap(this.f23182q, this.f23184s, this.f23185t, this.f23175j);
            this.f23186u.reset();
            this.f23186u.setFillType(Path.FillType.EVEN_ODD);
            Path path = this.f23186u;
            float f4 = this.f23177l + 1.0f;
            float f5 = this.f23178m + 1;
            Path.Direction direction = Path.Direction.CW;
            path.addRect(-1.0f, -1.0f, f4, f5, direction);
            Path path2 = this.f23186u;
            float f6 = this.f23177l;
            float f7 = this.f23178m;
            float f8 = this.f23176k;
            path2.addRoundRect(0.0f, 0.0f, f6, f7, f8, f8, direction);
            this.f23186u.close();
            this.f23175j.setXfermode(this.f23187v);
            canvas.drawPath(this.f23186u, this.f23175j);
            this.f23175j.setXfermode(null);
            canvas.restoreToCount(iSaveLayer);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m38713g(this);
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(300L);
        this.f23169d.setLayoutTransition(layoutTransition);
        this.f23189x.add(new C8024f(this.f23166a));
        this.f23189x.add(new C8024f(this.f23168c));
        this.f23189x.add(new C8024f(this.f23169d));
        this.f23189x.add(new C8024f(this.f23172g));
        this.f23189x.add(new C8024f(this.f23173h));
        this.f23189x.add(new C8024f(this.f23174i));
        m38707l();
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.wsq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f187958a.m38709n(view);
            }
        });
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        boolean z = this.f23189x.get(1).f23210c.f23206c;
        List<C8024f> list = this.f23189x;
        int measuredWidth = (z ? list.get(1) : list.get(2)).f23208a.getMeasuredWidth() + t100.m186890d(42.0f);
        if (measuredWidth != this.f23179n) {
            m38705j(measuredWidth);
            this.f23179n = measuredWidth;
        }
        setMeasuredDimension(measuredWidth, t100.m186890d(34.0f));
    }

    /* JADX INFO: renamed from: q */
    public final void m38714q(String str, int i, boolean z, boolean z2) {
        if (f23165z) {
            this.f23167b.getAlpha();
            this.f23166a.getAlpha();
        }
        if (z) {
            this.f23166a.setImageDrawable(null);
            SVGALoader.with(getContext()).from(str).animListener(new C8020b(z, str, i)).loadCallback(new C8019a(z, str, i)).repeatCount(1).frameMode(SVGAnimationView.FrameMode.BEFORE).autoPlay(true).into(this.f23166a);
        } else {
            this.f23167b.setImageResource(i);
            this.f23167b.setAlpha(1.0f);
            this.f23166a.setAlpha(0.0f);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.justreal.JustRealHomeTitleNewUiLayout$e */
    public static class C8023e {

        /* JADX INFO: renamed from: a */
        public float f23204a;

        /* JADX INFO: renamed from: b */
        public float f23205b;

        /* JADX INFO: renamed from: c */
        public boolean f23206c;

        /* JADX INFO: renamed from: d */
        public float f23207d;

        public C8023e(float f, float f2, boolean z) {
            this.f23204a = f;
            this.f23205b = f2;
            this.f23206c = z;
        }

        /* JADX INFO: renamed from: a */
        public C8023e m38715a() {
            return new C8023e(this.f23204a, this.f23205b, this.f23206c);
        }

        /* JADX INFO: renamed from: b */
        public void m38716b(C8023e c8023e) {
            this.f23204a = c8023e.f23204a;
            this.f23205b = c8023e.f23205b;
            this.f23206c = c8023e.f23206c;
        }

        public C8023e() {
        }
    }

    public JustRealHomeTitleNewUiLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23179n = 0;
        this.f23183r = t100.m186890d(10.0f);
        this.f23187v = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f23189x = new ArrayList();
        m38708m();
    }

    public JustRealHomeTitleNewUiLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23179n = 0;
        this.f23183r = t100.m186890d(10.0f);
        this.f23187v = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f23189x = new ArrayList();
        m38708m();
    }
}
