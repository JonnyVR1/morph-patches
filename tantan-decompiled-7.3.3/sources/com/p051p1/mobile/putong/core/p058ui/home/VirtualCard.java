package com.p051p1.mobile.putong.core.p058ui.home;

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
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.card.VSwipeCard;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.PartialListOpt;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import com.p051p1.mobile.putong.core.newui.home.opt.CardProgressAction;
import com.p051p1.mobile.putong.core.newui.home.opt.SwipeState;
import com.p051p1.mobile.putong.core.p058ui.home.VirtualCard;
import com.tantanapp.common.utils.NullChecker;
import p153l.b5v;
import p153l.bnl0;
import p153l.d5v;
import p153l.dbc0;
import p153l.dox;
import p153l.gra;
import p153l.ik4;
import p153l.jam;
import p153l.kql;
import p153l.l51;
import p153l.lql;
import p153l.m2t;
import p153l.p9r;
import p153l.pn4;
import p153l.qa00;
import p153l.sxl0;
import p153l.t7m;
import p153l.tql;
import p153l.wro;
import p153l.x20;

/* JADX INFO: loaded from: classes3.dex */
public class VirtualCard extends FrameLayout implements lql, kql, pn4, jam, tql {

    /* JADX INFO: renamed from: a */
    public sxl0 f30509a;

    /* JADX INFO: renamed from: b */
    public VirtualCardType f30510b;

    /* JADX INFO: renamed from: c */
    public View f30511c;

    /* JADX INFO: renamed from: d */
    public Paint f30512d;

    /* JADX INFO: renamed from: e */
    public int f30513e;

    /* JADX INFO: renamed from: f */
    public int f30514f;

    /* JADX INFO: renamed from: g */
    public int f30515g;

    /* JADX INFO: renamed from: h */
    public int f30516h;

    /* JADX INFO: renamed from: i */
    public int f30517i;

    /* JADX INFO: renamed from: j */
    public int f30518j;

    /* JADX INFO: renamed from: k */
    public RectF f30519k;

    /* JADX INFO: renamed from: l */
    public RectF f30520l;

    /* JADX INFO: renamed from: m */
    public Xfermode f30521m;

    /* JADX INFO: renamed from: n */
    public float f30522n;

    /* JADX INFO: renamed from: o */
    public Path f30523o;

    /* JADX INFO: renamed from: p */
    public boolean f30524p;

    /* JADX INFO: renamed from: q */
    public float f30525q;

    /* JADX INFO: renamed from: r */
    public ValueAnimator f30526r;

    /* JADX INFO: renamed from: s */
    public boolean f30527s;

    /* JADX INFO: renamed from: t */
    public boolean f30528t;

    /* JADX INFO: renamed from: u */
    public boolean f30529u;

    /* JADX INFO: renamed from: v */
    public CoreSuggested.UserInfo f30530v;

    /* JADX INFO: renamed from: w */
    public ik4 f30531w;

    /* JADX INFO: renamed from: x */
    public int f30532x;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.home.VirtualCard$a */
    public class C8533a implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VSwipeCard f30533a;

        public C8533a(VSwipeCard vSwipeCard) {
            this.f30533a = vSwipeCard;
        }

        @Override // p153l.x20
        public void call() {
            VirtualCard.this.f30509a.mo31007b(this.f30533a);
            this.f30533a.m36175l1(this);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.home.VirtualCard$b */
    public class C8534b implements ValueAnimator.AnimatorUpdateListener {
        public C8534b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            VirtualCard.this.f30525q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            VirtualCard.this.invalidate();
        }
    }

    public VirtualCard(Context context) {
        super(context);
        this.f30524p = false;
        this.f30525q = 0.0f;
        this.f30527s = false;
        this.f30528t = false;
        this.f30529u = false;
        this.f30530v = null;
        this.f30531w = null;
        this.f30532x = -1;
        m47257G0();
    }

    /* JADX INFO: renamed from: G0 */
    private void m47257G0() {
        if (gra.m131606N3()) {
            this.f30527s = true;
            this.f30515g = qa00.m175859d(8.0f);
            this.f30516h = qa00.m175859d(10.0f);
            this.f30517i = qa00.m175859d(8.0f);
            this.f30518j = qa00.m175859d(98.0f);
            Paint paint = new Paint();
            this.f30512d = paint;
            paint.setFilterBitmap(true);
            this.f30512d.setAntiAlias(true);
            this.f30512d.setColor(-65536);
            this.f30512d.setStyle(Paint.Style.FILL);
            this.f30523o = new Path();
            this.f30519k = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
            this.f30520l = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
            this.f30521m = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
            this.f30522n = qa00.m175859d(20.0f);
            setLayerType(0, null);
            bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.qxl0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VirtualCard.m47261l(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: X */
    private void m47259X() {
        ValueAnimator valueAnimator = this.f30526r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f30524p = false;
        this.f30525q = 0.0f;
    }

    /* JADX INFO: renamed from: c0 */
    private void m47260c0(boolean z) {
        if (gra.m131596L3() && this.f30529u && this.f30527s && z != this.f30524p) {
            this.f30524p = z;
            m47270s0(z);
        }
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m47261l(View view) {
    }

    @Override // p153l.pn4
    /* JADX INFO: renamed from: D0 */
    public void mo38964D0(View view, SwipeState swipeState, boolean z) {
        sxl0 sxl0Var;
        super.mo38964D0(view, swipeState, z);
        if (swipeState == SwipeState.START_MOVING) {
            m47260c0(true);
            return;
        }
        if (swipeState == SwipeState.START_BACK || swipeState == SwipeState.FINISH_OUT) {
            m47260c0(false);
        } else {
            if (swipeState != SwipeState.START_TOUCH || (sxl0Var = this.f30509a) == null) {
                return;
            }
            sxl0Var.mo164283a();
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final void m47263E0(FrameLayout.LayoutParams layoutParams) {
        if (gra.m131606N3()) {
            layoutParams.leftMargin = qa00.m175859d(8.0f);
            layoutParams.topMargin = qa00.m175859d(10.0f);
            layoutParams.rightMargin = qa00.m175859d(8.0f);
            layoutParams.bottomMargin = qa00.m175859d(98.0f);
            if (this.f30529u) {
                setBackgroundResource(dbc0.f87013g7);
            }
        }
    }

    /* JADX INFO: renamed from: F0 */
    public void m47264F0(VSwipeCard vSwipeCard) {
        measure(dox.m117367e(), dox.m117367e());
        layout(vSwipeCard.getPaddingLeft(), vSwipeCard.getPaddingTop(), getMeasuredWidth() + vSwipeCard.getPaddingLeft(), getMeasuredHeight() + vSwipeCard.getPaddingTop());
    }

    /* JADX INFO: renamed from: H0 */
    public void m47265H0(View view) {
        if (NullChecker.m82487b(this.f30509a)) {
            this.f30509a.mo31008c(view);
        }
    }

    /* JADX INFO: renamed from: I0 */
    public VSwipeStack.OnCardSwipeResult m47266I0(SwipeDirection swipeDirection, VirtualCard virtualCard, boolean z) {
        VSwipeStack.OnCardSwipeResult onCardSwipeResultMo31012g;
        PartialListOpt<CoreSuggested.UserInfo> partialListOptM222761e;
        VSwipeStack.OnCardSwipeResult onCardSwipeResult = VSwipeStack.OnCardSwipeResult.pass;
        sxl0 sxl0Var = this.f30509a;
        if (sxl0Var instanceof wro) {
            onCardSwipeResultMo31012g = ((wro) sxl0Var).m207607k(swipeDirection, virtualCard, z);
        } else {
            onCardSwipeResultMo31012g = NullChecker.m82487b(sxl0Var) ? this.f30509a.mo31012g(swipeDirection, virtualCard) : onCardSwipeResult;
        }
        if (onCardSwipeResultMo31012g == onCardSwipeResult && (partialListOptM222761e = CoreModule.f18264c.f20405m0.f20136a0.m222761e()) != null && partialListOptM222761e.loaded.size() == 1) {
            l51.m152887G(new Runnable() { // from class: l.rxl0
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f18264c.f20405m0.m32130m8();
                }
            });
        }
        return onCardSwipeResultMo31012g;
    }

    /* JADX INFO: renamed from: J0 */
    public void m47267J0(VSwipeCard vSwipeCard, int i, VirtualCardType virtualCardType, CoreSuggested.UserInfo userInfo) {
        this.f30530v = userInfo;
        if (NullChecker.m82487b(this.f30509a)) {
            this.f30509a.mo31010e(this.f30511c, i, virtualCardType, vSwipeCard);
            if (this.f30509a.mo31011f()) {
                vSwipeCard.m36151P0(new C8533a(vSwipeCard));
            }
            bnl0.m105564k0(this);
        }
    }

    /* JADX INFO: renamed from: K0 */
    public void m47268K0(int i, VirtualCardType virtualCardType, CoreSuggested.UserInfo userInfo) {
        if (i != 0) {
            this.f30525q = 0.0f;
            this.f30524p = false;
        } else {
            m47260c0(false);
        }
        this.f30530v = userInfo;
        if (NullChecker.m82487b(this.f30509a)) {
            this.f30509a.mo31010e(this.f30511c, i, virtualCardType, this);
        }
    }

    /* JADX INFO: renamed from: L0 */
    public void m47269L0(boolean z) {
        this.f30528t = z;
        invalidate();
    }

    @Override // p153l.pn4
    /* JADX INFO: renamed from: d0 */
    public void mo37368d0(float f, float f2, float f3, CardProgressAction cardProgressAction) {
        if (f != 0.0f) {
            f2 = -f;
        }
        float fMin = Math.min(1.0f, Math.max(-1.0f, f2));
        boolean z = f3 == 0.0f;
        if (f3 == 0.0f) {
            f3 = fMin;
        }
        sxl0 sxl0Var = this.f30509a;
        if (sxl0Var instanceof m2t) {
            ((m2t) sxl0Var).m156897p(z, f3, VSwipeCard.f21022G, false);
        }
        sxl0 sxl0Var2 = this.f30509a;
        if (sxl0Var2 instanceof b5v) {
            ((b5v) sxl0Var2).m102645s(z, f3, VSwipeCard.f21022G, false);
        }
        sxl0 sxl0Var3 = this.f30509a;
        if (sxl0Var3 instanceof d5v) {
            ((d5v) sxl0Var3).m114332p(z, f3, VSwipeCard.f21022G, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NonNull Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f30529u) {
            if (this.f30527s || this.f30528t) {
                if (this.f30528t) {
                    this.f30525q = 1.0f;
                }
                if (this.f30513e > 0 && this.f30514f > 0 && this.f30525q > 0.0f) {
                    this.f30523o.reset();
                    this.f30523o.setFillType(Path.FillType.EVEN_ODD);
                    Path path = this.f30523o;
                    float f = this.f30513e + 2.0f;
                    float f2 = this.f30514f + 2.0f;
                    Path.Direction direction = Path.Direction.CW;
                    path.addRect(-2.0f, -2.0f, f, f2, direction);
                    this.f30512d.setXfermode(this.f30521m);
                    boolean zM131606N3 = gra.m131606N3();
                    RectF rectF = this.f30520l;
                    if (zM131606N3) {
                        float f3 = this.f30515g;
                        float f4 = this.f30525q;
                        float f5 = f3 * f4;
                        float fM175859d = (this.f30516h * f4) + qa00.m175859d(44.0f);
                        float f6 = this.f30513e;
                        float f7 = this.f30517i;
                        float f8 = this.f30525q;
                        rectF.set(f5, fM175859d, f6 - (f7 * f8), (this.f30514f - (this.f30518j * f8)) - qa00.m175859d(56.0f));
                    } else {
                        float f9 = this.f30515g;
                        float f10 = this.f30525q;
                        rectF.set(f9 * f10, this.f30516h * f10, this.f30513e - (this.f30517i * f10), this.f30514f - (this.f30518j * f10));
                    }
                    Path path2 = this.f30523o;
                    RectF rectF2 = this.f30520l;
                    float f11 = this.f30522n;
                    float f12 = this.f30525q;
                    path2.addRoundRect(rectF2, f11 * f12, f11 * f12, direction);
                    this.f30523o.close();
                    canvas.drawPath(this.f30523o, this.f30512d);
                    this.f30512d.setXfermode(null);
                }
                canvas.restoreToCount(this.f30532x);
            }
        }
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        Canvas canvas2;
        if (this.f30527s && this.f30529u) {
            canvas2 = canvas;
            this.f30532x = canvas2.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null, 31);
            canvas2.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        } else {
            canvas2 = canvas;
        }
        super.draw(canvas2);
    }

    @Override // p153l.pn4
    /* JADX INFO: renamed from: f0 */
    public void mo38966f0(int i, float f, float f2, boolean z, String str) {
        if (z) {
            return;
        }
        if (i >= 1) {
            setAlpha(Math.max(0.3f, f));
        } else {
            setAlpha(1.0f);
        }
    }

    public sxl0 getAdapter() {
        return this.f30509a;
    }

    @Override // p153l.kql, p153l.q7m
    public ik4 getCardData() {
        if (this.f30531w == null) {
            ik4 ik4Var = new ik4(this);
            this.f30531w = ik4Var;
            ik4Var.m140263h(new ik4.C17729a());
        }
        this.f30531w.m140264i(null);
        this.f30531w.m140265j(this.f30530v);
        this.f30531w.m140257b().m140267b();
        return this.f30531w;
    }

    public VirtualCardType getCardType() {
        return this.f30510b;
    }

    public View getContentView() {
        return this.f30511c;
    }

    @Override // p153l.jam
    public Context getIVirtualCardContext() {
        return getContext();
    }

    @Override // p153l.jam
    public CoreSuggested.UserInfo getIVirtualCardUserInfoProxy() {
        return this.f30530v;
    }

    @Override // p153l.lql
    public CoreSuggested.UserInfo getUserInfoProxy() {
        return this.f30530v;
    }

    @Override // p153l.tql
    /* JADX INFO: renamed from: k */
    public void mo37904k(boolean z) {
        super.mo37904k(z);
        if (z) {
            return;
        }
        m47259X();
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (getParent() instanceof t7m) {
            t7m t7mVar = (t7m) getParent();
            this.f30513e = t7mVar.getCardView().getMeasuredWidth();
            this.f30514f = t7mVar.getCardView().getMeasuredHeight();
            super.onMeasure(dox.m117364b(this.f30513e), dox.m117364b(this.f30514f));
            return;
        }
        if (this.f30513e != View.MeasureSpec.getSize(i) || this.f30514f != View.MeasureSpec.getSize(i2)) {
            this.f30513e = View.MeasureSpec.getSize(i);
            this.f30514f = View.MeasureSpec.getSize(i2);
        }
        super.onMeasure(i, i2);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m47270s0(boolean z) {
        if (this.f30527s) {
            ValueAnimator valueAnimator = this.f30526r;
            if (valueAnimator == null) {
                if (z) {
                    this.f30526r = ValueAnimator.ofFloat(0.0f, 1.0f);
                } else {
                    this.f30526r = ValueAnimator.ofFloat(1.0f, 0.0f);
                }
                this.f30526r.addUpdateListener(new C8534b());
            } else {
                valueAnimator.cancel();
                this.f30526r.setFloatValues(this.f30525q, z ? 1.0f : 0.0f);
            }
            this.f30526r.setDuration(50L);
            this.f30526r.start();
        }
    }

    public void setAdapter(sxl0 sxl0Var) {
        if (sxl0Var == null) {
            return;
        }
        this.f30509a = sxl0Var;
        removeAllViews();
        this.f30511c = sxl0Var.mo31009d(p9r.m171370a(getContext()), this, this.f30510b);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        m47263E0(layoutParams);
        addView(this.f30511c, layoutParams);
        setClipChildren(true);
    }

    public void setCardType(VirtualCardType virtualCardType) {
        this.f30510b = virtualCardType;
    }

    public VirtualCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30524p = false;
        this.f30525q = 0.0f;
        this.f30527s = false;
        this.f30528t = false;
        this.f30529u = false;
        this.f30530v = null;
        this.f30531w = null;
        this.f30532x = -1;
        m47257G0();
    }

    public VirtualCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30524p = false;
        this.f30525q = 0.0f;
        this.f30527s = false;
        this.f30528t = false;
        this.f30529u = false;
        this.f30530v = null;
        this.f30531w = null;
        this.f30532x = -1;
        m47257G0();
    }
}
