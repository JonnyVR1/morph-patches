package com.p000p1.mobile.putong.core.p001ui.home;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.data.PartialListOpt;
import com.p000p1.mobile.putong.core.data.SwipeDirection;
import com.p000p1.mobile.putong.core.data.VirtualCardType;
import com.p000p1.mobile.putong.core.p001ui.home.VirtualCard;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.card.VSwipeCard;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.newui.home.opt.CardProgressAction;
import com.p1.mobile.putong.core.newui.home.opt.SwipeState;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.a3v;
import l.aol;
import l.c3v;
import l.d30;
import l.d5m;
import l.e51;
import l.ffx;
import l.iol;
import l.jj4;
import l.l0t;
import l.o7r;
import l.qm4;
import l.t100;
import l.upa;
import l.wpo;
import l.x2c0;
import l.xdl0;
import l.znl;
import p003l.ool0;
import p003l.t7m;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class VirtualCard extends FrameLayout implements aol, znl, qm4, t7m, iol {

    /* JADX INFO: renamed from: a */
    public ool0 f2055a;

    /* JADX INFO: renamed from: b */
    public VirtualCardType f2056b;

    /* JADX INFO: renamed from: c */
    public View f2057c;

    /* JADX INFO: renamed from: d */
    public Paint f2058d;

    /* JADX INFO: renamed from: e */
    public int f2059e;

    /* JADX INFO: renamed from: f */
    public int f2060f;

    /* JADX INFO: renamed from: g */
    public int f2061g;

    /* JADX INFO: renamed from: h */
    public int f2062h;

    /* JADX INFO: renamed from: i */
    public int f2063i;

    /* JADX INFO: renamed from: j */
    public int f2064j;

    /* JADX INFO: renamed from: k */
    public RectF f2065k;

    /* JADX INFO: renamed from: l */
    public RectF f2066l;

    /* JADX INFO: renamed from: m */
    public Xfermode f2067m;

    /* JADX INFO: renamed from: n */
    public float f2068n;

    /* JADX INFO: renamed from: o */
    public Path f2069o;

    /* JADX INFO: renamed from: p */
    public boolean f2070p;

    /* JADX INFO: renamed from: q */
    public float f2071q;

    /* JADX INFO: renamed from: r */
    public ValueAnimator f2072r;

    /* JADX INFO: renamed from: s */
    public boolean f2073s;

    /* JADX INFO: renamed from: t */
    public boolean f2074t;

    /* JADX INFO: renamed from: u */
    public boolean f2075u;

    /* JADX INFO: renamed from: v */
    public CoreSuggested.UserInfo f2076v;

    /* JADX INFO: renamed from: w */
    public jj4 f2077w;

    /* JADX INFO: renamed from: x */
    public int f2078x;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.home.VirtualCard$a */
    public class C3145a implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VSwipeCard f2079a;

        public C3145a(VSwipeCard vSwipeCard) {
            this.f2079a = vSwipeCard;
        }

        public void call() {
            VirtualCard.this.f2055a.mo5286b(this.f2079a);
            this.f2079a.l1(this);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.home.VirtualCard$b */
    public class C3146b implements ValueAnimator.AnimatorUpdateListener {
        public C3146b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            VirtualCard.this.f2071q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            VirtualCard.this.invalidate();
        }
    }

    public VirtualCard(Context context) {
        super(context);
        this.f2070p = false;
        this.f2071q = 0.0f;
        this.f2073s = false;
        this.f2074t = false;
        this.f2075u = false;
        this.f2076v = null;
        this.f2077w = null;
        this.f2078x = -1;
        m3435G0();
    }

    /* JADX INFO: renamed from: G0 */
    private void m3435G0() {
        if (upa.N3()) {
            this.f2073s = true;
            this.f2061g = t100.d(8.0f);
            this.f2062h = t100.d(10.0f);
            this.f2063i = t100.d(8.0f);
            this.f2064j = t100.d(98.0f);
            Paint paint = new Paint();
            this.f2058d = paint;
            paint.setFilterBitmap(true);
            this.f2058d.setAntiAlias(true);
            this.f2058d.setColor(-65536);
            this.f2058d.setStyle(Paint.Style.FILL);
            this.f2069o = new Path();
            this.f2065k = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
            this.f2066l = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
            this.f2067m = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
            this.f2068n = t100.d(20.0f);
            setLayerType(0, null);
            xdl0.E0(this, new View.OnClickListener() { // from class: l.mol0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VirtualCard.m3439l(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: X */
    private void m3437X() {
        ValueAnimator valueAnimator = this.f2072r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f2070p = false;
        this.f2071q = 0.0f;
    }

    /* JADX INFO: renamed from: c0 */
    private void m3438c0(boolean z) {
        if (upa.L3() && this.f2075u && this.f2073s && z != this.f2070p) {
            this.f2070p = z;
            m3452s0(z);
        }
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m3439l(View view) {
    }

    /* JADX INFO: renamed from: D0 */
    public void m3441D0(View view, SwipeState swipeState, boolean z) {
        ool0 ool0Var;
        super.D0(view, swipeState, z);
        if (swipeState == SwipeState.START_MOVING) {
            m3438c0(true);
            return;
        }
        if (swipeState == SwipeState.START_BACK || swipeState == SwipeState.FINISH_OUT) {
            m3438c0(false);
        } else {
            if (swipeState != SwipeState.START_TOUCH || (ool0Var = this.f2055a) == null) {
                return;
            }
            ool0Var.mo8547a();
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final void m3442E0(FrameLayout.LayoutParams layoutParams) {
        if (upa.N3()) {
            layoutParams.leftMargin = t100.d(8.0f);
            layoutParams.topMargin = t100.d(10.0f);
            layoutParams.rightMargin = t100.d(8.0f);
            layoutParams.bottomMargin = t100.d(98.0f);
            if (this.f2075u) {
                setBackgroundResource(x2c0.f7);
            }
        }
    }

    /* JADX INFO: renamed from: F0 */
    public void m3443F0(VSwipeCard vSwipeCard) {
        measure(ffx.e(), ffx.e());
        layout(vSwipeCard.getPaddingLeft(), vSwipeCard.getPaddingTop(), getMeasuredWidth() + vSwipeCard.getPaddingLeft(), getMeasuredHeight() + vSwipeCard.getPaddingTop());
    }

    /* JADX INFO: renamed from: H0 */
    public void m3444H0(View view) {
        if (NullChecker.b(this.f2055a)) {
            this.f2055a.mo5287c(view);
        }
    }

    /* JADX INFO: renamed from: I0 */
    public VSwipeStack.OnCardSwipeResult m3445I0(SwipeDirection swipeDirection, VirtualCard virtualCard, boolean z) {
        VSwipeStack.OnCardSwipeResult onCardSwipeResultMo5291g;
        PartialListOpt partialListOpt;
        VSwipeStack.OnCardSwipeResult onCardSwipeResult = VSwipeStack.OnCardSwipeResult.pass;
        wpo wpoVar = this.f2055a;
        if (wpoVar instanceof wpo) {
            onCardSwipeResultMo5291g = wpoVar.k(swipeDirection, virtualCard, z);
        } else {
            onCardSwipeResultMo5291g = NullChecker.b(wpoVar) ? this.f2055a.mo5291g(swipeDirection, virtualCard) : onCardSwipeResult;
        }
        if (onCardSwipeResultMo5291g == onCardSwipeResult && (partialListOpt = (PartialListOpt) CoreModule.c.m0.a0.e()) != null && partialListOpt.loaded.size() == 1) {
            e51.G(new Runnable() { // from class: l.nol0
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.c.m0.m8();
                }
            });
        }
        return onCardSwipeResultMo5291g;
    }

    /* JADX INFO: renamed from: J0 */
    public void m3446J0(VSwipeCard vSwipeCard, int i, VirtualCardType virtualCardType, CoreSuggested.UserInfo userInfo) {
        this.f2076v = userInfo;
        if (NullChecker.b(this.f2055a)) {
            this.f2055a.mo5289e(this.f2057c, i, virtualCardType, vSwipeCard);
            if (this.f2055a.mo5290f()) {
                vSwipeCard.P0(new C3145a(vSwipeCard));
            }
            xdl0.k0(this);
        }
    }

    /* JADX INFO: renamed from: K0 */
    public void m3447K0(int i, VirtualCardType virtualCardType, CoreSuggested.UserInfo userInfo) {
        if (i != 0) {
            this.f2071q = 0.0f;
            this.f2070p = false;
        } else {
            m3438c0(false);
        }
        this.f2076v = userInfo;
        if (NullChecker.b(this.f2055a)) {
            this.f2055a.mo5289e(this.f2057c, i, virtualCardType, this);
        }
    }

    /* JADX INFO: renamed from: L0 */
    public void m3448L0(boolean z) {
        this.f2074t = z;
        invalidate();
    }

    /* JADX INFO: renamed from: d0 */
    public void m3449d0(float f, float f2, float f3, CardProgressAction cardProgressAction) {
        if (f != 0.0f) {
            f2 = -f;
        }
        float fMin = Math.min(1.0f, Math.max(-1.0f, f2));
        boolean z = f3 == 0.0f;
        if (f3 == 0.0f) {
            f3 = fMin;
        }
        l0t l0tVar = this.f2055a;
        if (l0tVar instanceof l0t) {
            l0tVar.p(z, f3, VSwipeCard.G, false);
        }
        a3v a3vVar = this.f2055a;
        if (a3vVar instanceof a3v) {
            a3vVar.s(z, f3, VSwipeCard.G, false);
        }
        c3v c3vVar = this.f2055a;
        if (c3vVar instanceof c3v) {
            c3vVar.p(z, f3, VSwipeCard.G, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NonNull Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f2075u) {
            if (this.f2073s || this.f2074t) {
                if (this.f2074t) {
                    this.f2071q = 1.0f;
                }
                if (this.f2059e > 0 && this.f2060f > 0 && this.f2071q > 0.0f) {
                    this.f2069o.reset();
                    this.f2069o.setFillType(Path.FillType.EVEN_ODD);
                    Path path = this.f2069o;
                    float f = this.f2059e + 2.0f;
                    float f2 = this.f2060f + 2.0f;
                    Path.Direction direction = Path.Direction.CW;
                    path.addRect(-2.0f, -2.0f, f, f2, direction);
                    this.f2058d.setXfermode(this.f2067m);
                    boolean zN3 = upa.N3();
                    RectF rectF = this.f2066l;
                    if (zN3) {
                        float f3 = this.f2061g;
                        float f4 = this.f2071q;
                        float f5 = f3 * f4;
                        float fD = (this.f2062h * f4) + t100.d(44.0f);
                        float f6 = this.f2059e;
                        float f7 = this.f2063i;
                        float f8 = this.f2071q;
                        rectF.set(f5, fD, f6 - (f7 * f8), (this.f2060f - (this.f2064j * f8)) - t100.d(56.0f));
                    } else {
                        float f9 = this.f2061g;
                        float f10 = this.f2071q;
                        rectF.set(f9 * f10, this.f2062h * f10, this.f2059e - (this.f2063i * f10), this.f2060f - (this.f2064j * f10));
                    }
                    Path path2 = this.f2069o;
                    RectF rectF2 = this.f2066l;
                    float f11 = this.f2068n;
                    float f12 = this.f2071q;
                    path2.addRoundRect(rectF2, f11 * f12, f11 * f12, direction);
                    this.f2069o.close();
                    canvas.drawPath(this.f2069o, this.f2058d);
                    this.f2058d.setXfermode(null);
                }
                canvas.restoreToCount(this.f2078x);
            }
        }
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        Canvas canvas2;
        if (this.f2073s && this.f2075u) {
            canvas2 = canvas;
            this.f2078x = canvas2.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null, 31);
            canvas2.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        } else {
            canvas2 = canvas;
        }
        super.draw(canvas2);
    }

    /* JADX INFO: renamed from: f0 */
    public void m3450f0(int i, float f, float f2, boolean z, String str) {
        if (z) {
            return;
        }
        if (i >= 1) {
            setAlpha(Math.max(0.3f, f));
        } else {
            setAlpha(1.0f);
        }
    }

    public ool0 getAdapter() {
        return this.f2055a;
    }

    public jj4 getCardData() {
        if (this.f2077w == null) {
            jj4 jj4Var = new jj4(this);
            this.f2077w = jj4Var;
            jj4Var.h(new jj4.a());
        }
        this.f2077w.i((User) null);
        this.f2077w.j(this.f2076v);
        this.f2077w.b().b();
        return this.f2077w;
    }

    public VirtualCardType getCardType() {
        return this.f2056b;
    }

    public View getContentView() {
        return this.f2057c;
    }

    @Override // p003l.t7m
    public Context getIVirtualCardContext() {
        return getContext();
    }

    @Override // p003l.t7m
    public CoreSuggested.UserInfo getIVirtualCardUserInfoProxy() {
        return this.f2076v;
    }

    public CoreSuggested.UserInfo getUserInfoProxy() {
        return this.f2076v;
    }

    /* JADX INFO: renamed from: k */
    public void m3451k(boolean z) {
        super.k(z);
        if (z) {
            return;
        }
        m3437X();
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (getParent() instanceof d5m) {
            d5m parent = getParent();
            this.f2059e = parent.getCardView().getMeasuredWidth();
            this.f2060f = parent.getCardView().getMeasuredHeight();
            super.onMeasure(ffx.b(this.f2059e), ffx.b(this.f2060f));
            return;
        }
        if (this.f2059e != View.MeasureSpec.getSize(i) || this.f2060f != View.MeasureSpec.getSize(i2)) {
            this.f2059e = View.MeasureSpec.getSize(i);
            this.f2060f = View.MeasureSpec.getSize(i2);
        }
        super.onMeasure(i, i2);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m3452s0(boolean z) {
        if (this.f2073s) {
            ValueAnimator valueAnimator = this.f2072r;
            if (valueAnimator == null) {
                if (z) {
                    this.f2072r = ValueAnimator.ofFloat(0.0f, 1.0f);
                } else {
                    this.f2072r = ValueAnimator.ofFloat(1.0f, 0.0f);
                }
                this.f2072r.addUpdateListener(new C3146b());
            } else {
                valueAnimator.cancel();
                this.f2072r.setFloatValues(this.f2071q, z ? 1.0f : 0.0f);
            }
            this.f2072r.setDuration(50L);
            this.f2072r.start();
        }
    }

    public void setAdapter(ool0 ool0Var) {
        if (ool0Var == null) {
            return;
        }
        this.f2055a = ool0Var;
        removeAllViews();
        this.f2057c = ool0Var.mo5288d(o7r.a(getContext()), this, this.f2056b);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        m3442E0(layoutParams);
        addView(this.f2057c, layoutParams);
        setClipChildren(true);
    }

    public void setCardType(VirtualCardType virtualCardType) {
        this.f2056b = virtualCardType;
    }

    public VirtualCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2070p = false;
        this.f2071q = 0.0f;
        this.f2073s = false;
        this.f2074t = false;
        this.f2075u = false;
        this.f2076v = null;
        this.f2077w = null;
        this.f2078x = -1;
        m3435G0();
    }

    public VirtualCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2070p = false;
        this.f2071q = 0.0f;
        this.f2073s = false;
        this.f2074t = false;
        this.f2075u = false;
        this.f2076v = null;
        this.f2077w = null;
        this.f2078x = -1;
        m3435G0();
    }
}
