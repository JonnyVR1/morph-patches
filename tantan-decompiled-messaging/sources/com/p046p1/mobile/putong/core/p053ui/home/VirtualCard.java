package com.p046p1.mobile.putong.core.p053ui.home;

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
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.card.VSwipeCard;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.PartialListOpt;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.p046p1.mobile.putong.core.newui.home.opt.CardProgressAction;
import com.p046p1.mobile.putong.core.newui.home.opt.SwipeState;
import com.p046p1.mobile.putong.core.p053ui.home.VirtualCard;
import com.tantanapp.common.utils.NullChecker;
import p149l.a3v;
import p149l.aol;
import p149l.c3v;
import p149l.d30;
import p149l.d5m;
import p149l.e51;
import p149l.ffx;
import p149l.iol;
import p149l.jj4;
import p149l.l0t;
import p149l.o7r;
import p149l.ool0;
import p149l.qm4;
import p149l.t100;
import p149l.t7m;
import p149l.upa;
import p149l.wpo;
import p149l.x2c0;
import p149l.xdl0;
import p149l.znl;

/* JADX INFO: loaded from: classes10.dex */
public class VirtualCard extends FrameLayout implements aol, znl, qm4, t7m, iol {

    /* JADX INFO: renamed from: a */
    public ool0 f29661a;

    /* JADX INFO: renamed from: b */
    public VirtualCardType f29662b;

    /* JADX INFO: renamed from: c */
    public View f29663c;

    /* JADX INFO: renamed from: d */
    public Paint f29664d;

    /* JADX INFO: renamed from: e */
    public int f29665e;

    /* JADX INFO: renamed from: f */
    public int f29666f;

    /* JADX INFO: renamed from: g */
    public int f29667g;

    /* JADX INFO: renamed from: h */
    public int f29668h;

    /* JADX INFO: renamed from: i */
    public int f29669i;

    /* JADX INFO: renamed from: j */
    public int f29670j;

    /* JADX INFO: renamed from: k */
    public RectF f29671k;

    /* JADX INFO: renamed from: l */
    public RectF f29672l;

    /* JADX INFO: renamed from: m */
    public Xfermode f29673m;

    /* JADX INFO: renamed from: n */
    public float f29674n;

    /* JADX INFO: renamed from: o */
    public Path f29675o;

    /* JADX INFO: renamed from: p */
    public boolean f29676p;

    /* JADX INFO: renamed from: q */
    public float f29677q;

    /* JADX INFO: renamed from: r */
    public ValueAnimator f29678r;

    /* JADX INFO: renamed from: s */
    public boolean f29679s;

    /* JADX INFO: renamed from: t */
    public boolean f29680t;

    /* JADX INFO: renamed from: u */
    public boolean f29681u;

    /* JADX INFO: renamed from: v */
    public CoreSuggested.UserInfo f29682v;

    /* JADX INFO: renamed from: w */
    public jj4 f29683w;

    /* JADX INFO: renamed from: x */
    public int f29684x;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.home.VirtualCard$a */
    public class C8370a implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VSwipeCard f29685a;

        public C8370a(VSwipeCard vSwipeCard) {
            this.f29685a = vSwipeCard;
        }

        @Override // p149l.d30
        public void call() {
            VirtualCard.this.f29661a.mo30009b(this.f29685a);
            this.f29685a.m35172l1(this);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.home.VirtualCard$b */
    public class C8371b implements ValueAnimator.AnimatorUpdateListener {
        public C8371b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            VirtualCard.this.f29677q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            VirtualCard.this.invalidate();
        }
    }

    public VirtualCard(Context context) {
        super(context);
        this.f29676p = false;
        this.f29677q = 0.0f;
        this.f29679s = false;
        this.f29680t = false;
        this.f29681u = false;
        this.f29682v = null;
        this.f29683w = null;
        this.f29684x = -1;
        m46074G0();
    }

    /* JADX INFO: renamed from: G0 */
    private void m46074G0() {
        if (upa.m194675N3()) {
            this.f29679s = true;
            this.f29667g = t100.m186890d(8.0f);
            this.f29668h = t100.m186890d(10.0f);
            this.f29669i = t100.m186890d(8.0f);
            this.f29670j = t100.m186890d(98.0f);
            Paint paint = new Paint();
            this.f29664d = paint;
            paint.setFilterBitmap(true);
            this.f29664d.setAntiAlias(true);
            this.f29664d.setColor(-65536);
            this.f29664d.setStyle(Paint.Style.FILL);
            this.f29675o = new Path();
            this.f29671k = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
            this.f29672l = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
            this.f29673m = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
            this.f29674n = t100.m186890d(20.0f);
            setLayerType(0, null);
            xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.mol0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VirtualCard.m46078l(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: X */
    private void m46076X() {
        ValueAnimator valueAnimator = this.f29678r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f29676p = false;
        this.f29677q = 0.0f;
    }

    /* JADX INFO: renamed from: c0 */
    private void m46077c0(boolean z) {
        if (upa.m194665L3() && this.f29681u && this.f29679s && z != this.f29676p) {
            this.f29676p = z;
            m46087s0(z);
        }
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m46078l(View view) {
    }

    @Override // p149l.qm4
    /* JADX INFO: renamed from: D0 */
    public void mo37961D0(View view, SwipeState swipeState, boolean z) {
        ool0 ool0Var;
        super.mo37961D0(view, swipeState, z);
        if (swipeState == SwipeState.START_MOVING) {
            m46077c0(true);
            return;
        }
        if (swipeState == SwipeState.START_BACK || swipeState == SwipeState.FINISH_OUT) {
            m46077c0(false);
        } else {
            if (swipeState != SwipeState.START_TOUCH || (ool0Var = this.f29661a) == null) {
                return;
            }
            ool0Var.mo120980a();
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final void m46080E0(FrameLayout.LayoutParams layoutParams) {
        if (upa.m194675N3()) {
            layoutParams.leftMargin = t100.m186890d(8.0f);
            layoutParams.topMargin = t100.m186890d(10.0f);
            layoutParams.rightMargin = t100.m186890d(8.0f);
            layoutParams.bottomMargin = t100.m186890d(98.0f);
            if (this.f29681u) {
                setBackgroundResource(x2c0.f190132f7);
            }
        }
    }

    /* JADX INFO: renamed from: F0 */
    public void m46081F0(VSwipeCard vSwipeCard) {
        measure(ffx.m121202e(), ffx.m121202e());
        layout(vSwipeCard.getPaddingLeft(), vSwipeCard.getPaddingTop(), getMeasuredWidth() + vSwipeCard.getPaddingLeft(), getMeasuredHeight() + vSwipeCard.getPaddingTop());
    }

    /* JADX INFO: renamed from: H0 */
    public void m46082H0(View view) {
        if (NullChecker.m81304b(this.f29661a)) {
            this.f29661a.mo30010c(view);
        }
    }

    /* JADX INFO: renamed from: I0 */
    public VSwipeStack.OnCardSwipeResult m46083I0(SwipeDirection swipeDirection, VirtualCard virtualCard, boolean z) {
        VSwipeStack.OnCardSwipeResult onCardSwipeResultMo30014g;
        PartialListOpt<CoreSuggested.UserInfo> partialListOptM221515e;
        VSwipeStack.OnCardSwipeResult onCardSwipeResult = VSwipeStack.OnCardSwipeResult.pass;
        ool0 ool0Var = this.f29661a;
        if (ool0Var instanceof wpo) {
            onCardSwipeResultMo30014g = ((wpo) ool0Var).m204932k(swipeDirection, virtualCard, z);
        } else {
            onCardSwipeResultMo30014g = NullChecker.m81304b(ool0Var) ? this.f29661a.mo30014g(swipeDirection, virtualCard) : onCardSwipeResult;
        }
        if (onCardSwipeResultMo30014g == onCardSwipeResult && (partialListOptM221515e = CoreModule.f17545c.f19663m0.f19394a0.m221515e()) != null && partialListOptM221515e.loaded.size() == 1) {
            e51.m114742G(new Runnable() { // from class: l.nol0
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f17545c.f19663m0.m31127m8();
                }
            });
        }
        return onCardSwipeResultMo30014g;
    }

    /* JADX INFO: renamed from: J0 */
    public void m46084J0(VSwipeCard vSwipeCard, int i, VirtualCardType virtualCardType, CoreSuggested.UserInfo userInfo) {
        this.f29682v = userInfo;
        if (NullChecker.m81304b(this.f29661a)) {
            this.f29661a.mo30012e(this.f29663c, i, virtualCardType, vSwipeCard);
            if (this.f29661a.mo30013f()) {
                vSwipeCard.m35148P0(new C8370a(vSwipeCard));
            }
            xdl0.m208384k0(this);
        }
    }

    /* JADX INFO: renamed from: K0 */
    public void m46085K0(int i, VirtualCardType virtualCardType, CoreSuggested.UserInfo userInfo) {
        if (i != 0) {
            this.f29677q = 0.0f;
            this.f29676p = false;
        } else {
            m46077c0(false);
        }
        this.f29682v = userInfo;
        if (NullChecker.m81304b(this.f29661a)) {
            this.f29661a.mo30012e(this.f29663c, i, virtualCardType, this);
        }
    }

    /* JADX INFO: renamed from: L0 */
    public void m46086L0(boolean z) {
        this.f29680t = z;
        invalidate();
    }

    @Override // p149l.qm4
    /* JADX INFO: renamed from: d0 */
    public void mo36365d0(float f, float f2, float f3, CardProgressAction cardProgressAction) {
        if (f != 0.0f) {
            f2 = -f;
        }
        float fMin = Math.min(1.0f, Math.max(-1.0f, f2));
        boolean z = f3 == 0.0f;
        if (f3 == 0.0f) {
            f3 = fMin;
        }
        ool0 ool0Var = this.f29661a;
        if (ool0Var instanceof l0t) {
            ((l0t) ool0Var).m148111p(z, f3, VSwipeCard.f20280G, false);
        }
        ool0 ool0Var2 = this.f29661a;
        if (ool0Var2 instanceof a3v) {
            ((a3v) ool0Var2).m94751s(z, f3, VSwipeCard.f20280G, false);
        }
        ool0 ool0Var3 = this.f29661a;
        if (ool0Var3 instanceof c3v) {
            ((c3v) ool0Var3).m105111p(z, f3, VSwipeCard.f20280G, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NonNull Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f29681u) {
            if (this.f29679s || this.f29680t) {
                if (this.f29680t) {
                    this.f29677q = 1.0f;
                }
                if (this.f29665e > 0 && this.f29666f > 0 && this.f29677q > 0.0f) {
                    this.f29675o.reset();
                    this.f29675o.setFillType(Path.FillType.EVEN_ODD);
                    Path path = this.f29675o;
                    float f = this.f29665e + 2.0f;
                    float f2 = this.f29666f + 2.0f;
                    Path.Direction direction = Path.Direction.CW;
                    path.addRect(-2.0f, -2.0f, f, f2, direction);
                    this.f29664d.setXfermode(this.f29673m);
                    boolean zM194675N3 = upa.m194675N3();
                    RectF rectF = this.f29672l;
                    if (zM194675N3) {
                        float f3 = this.f29667g;
                        float f4 = this.f29677q;
                        float f5 = f3 * f4;
                        float fM186890d = (this.f29668h * f4) + t100.m186890d(44.0f);
                        float f6 = this.f29665e;
                        float f7 = this.f29669i;
                        float f8 = this.f29677q;
                        rectF.set(f5, fM186890d, f6 - (f7 * f8), (this.f29666f - (this.f29670j * f8)) - t100.m186890d(56.0f));
                    } else {
                        float f9 = this.f29667g;
                        float f10 = this.f29677q;
                        rectF.set(f9 * f10, this.f29668h * f10, this.f29665e - (this.f29669i * f10), this.f29666f - (this.f29670j * f10));
                    }
                    Path path2 = this.f29675o;
                    RectF rectF2 = this.f29672l;
                    float f11 = this.f29674n;
                    float f12 = this.f29677q;
                    path2.addRoundRect(rectF2, f11 * f12, f11 * f12, direction);
                    this.f29675o.close();
                    canvas.drawPath(this.f29675o, this.f29664d);
                    this.f29664d.setXfermode(null);
                }
                canvas.restoreToCount(this.f29684x);
            }
        }
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        Canvas canvas2;
        if (this.f29679s && this.f29681u) {
            canvas2 = canvas;
            this.f29684x = canvas2.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null, 31);
            canvas2.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        } else {
            canvas2 = canvas;
        }
        super.draw(canvas2);
    }

    @Override // p149l.qm4
    /* JADX INFO: renamed from: f0 */
    public void mo37963f0(int i, float f, float f2, boolean z, String str) {
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
        return this.f29661a;
    }

    @Override // p149l.znl, p149l.a5m
    public jj4 getCardData() {
        if (this.f29683w == null) {
            jj4 jj4Var = new jj4(this);
            this.f29683w = jj4Var;
            jj4Var.m141749h(new jj4.C17798a());
        }
        this.f29683w.m141750i(null);
        this.f29683w.m141751j(this.f29682v);
        this.f29683w.m141743b().m141753b();
        return this.f29683w;
    }

    public VirtualCardType getCardType() {
        return this.f29662b;
    }

    public View getContentView() {
        return this.f29663c;
    }

    @Override // p149l.t7m
    public Context getIVirtualCardContext() {
        return getContext();
    }

    @Override // p149l.t7m
    public CoreSuggested.UserInfo getIVirtualCardUserInfoProxy() {
        return this.f29682v;
    }

    @Override // p149l.aol
    public CoreSuggested.UserInfo getUserInfoProxy() {
        return this.f29682v;
    }

    @Override // p149l.iol
    /* JADX INFO: renamed from: k */
    public void mo36901k(boolean z) {
        super.mo36901k(z);
        if (z) {
            return;
        }
        m46076X();
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (getParent() instanceof d5m) {
            d5m d5mVar = (d5m) getParent();
            this.f29665e = d5mVar.getCardView().getMeasuredWidth();
            this.f29666f = d5mVar.getCardView().getMeasuredHeight();
            super.onMeasure(ffx.m121199b(this.f29665e), ffx.m121199b(this.f29666f));
            return;
        }
        if (this.f29665e != View.MeasureSpec.getSize(i) || this.f29666f != View.MeasureSpec.getSize(i2)) {
            this.f29665e = View.MeasureSpec.getSize(i);
            this.f29666f = View.MeasureSpec.getSize(i2);
        }
        super.onMeasure(i, i2);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m46087s0(boolean z) {
        if (this.f29679s) {
            ValueAnimator valueAnimator = this.f29678r;
            if (valueAnimator == null) {
                if (z) {
                    this.f29678r = ValueAnimator.ofFloat(0.0f, 1.0f);
                } else {
                    this.f29678r = ValueAnimator.ofFloat(1.0f, 0.0f);
                }
                this.f29678r.addUpdateListener(new C8371b());
            } else {
                valueAnimator.cancel();
                this.f29678r.setFloatValues(this.f29677q, z ? 1.0f : 0.0f);
            }
            this.f29678r.setDuration(50L);
            this.f29678r.start();
        }
    }

    public void setAdapter(ool0 ool0Var) {
        if (ool0Var == null) {
            return;
        }
        this.f29661a = ool0Var;
        removeAllViews();
        this.f29663c = ool0Var.mo30011d(o7r.m163037a(getContext()), this, this.f29662b);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        m46080E0(layoutParams);
        addView(this.f29663c, layoutParams);
        setClipChildren(true);
    }

    public void setCardType(VirtualCardType virtualCardType) {
        this.f29662b = virtualCardType;
    }

    public VirtualCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29676p = false;
        this.f29677q = 0.0f;
        this.f29679s = false;
        this.f29680t = false;
        this.f29681u = false;
        this.f29682v = null;
        this.f29683w = null;
        this.f29684x = -1;
        m46074G0();
    }

    public VirtualCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29676p = false;
        this.f29677q = 0.0f;
        this.f29679s = false;
        this.f29680t = false;
        this.f29681u = false;
        this.f29682v = null;
        this.f29683w = null;
        this.f29684x = -1;
        m46074G0();
    }
}
