package com.p046p1.mobile.putong.core.newui.home.card.expanded;

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
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedCardBaseRoot;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.anim.ExpandedCardClipStatus;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.base.BaseExpandedView;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.base.ExpandedTouchType;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;
import com.p046p1.mobile.putong.core.newui.home.opt.CardProgressAction;
import com.p046p1.mobile.putong.data.User;
import p133rx.C22306c;
import p133rx.subjects.C22393b;
import p149l.cmf;
import p149l.dmf;
import p149l.mcr;
import p149l.mkd0;
import p149l.oql;
import p149l.t100;
import p149l.upa;
import p149l.v9j;
import p149l.w9j;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public abstract class UserProfileExpandedCardBaseRoot extends FrameLayout implements oql, cmf.InterfaceC16195b {

    /* JADX INFO: renamed from: A */
    public float f22270A;

    /* JADX INFO: renamed from: B */
    public float f22271B;

    /* JADX INFO: renamed from: a */
    public C22393b<View> f22272a;

    /* JADX INFO: renamed from: b */
    public float f22273b;

    /* JADX INFO: renamed from: c */
    public cmf.C16194a f22274c;

    /* JADX INFO: renamed from: d */
    public int f22275d;

    /* JADX INFO: renamed from: e */
    public int f22276e;

    /* JADX INFO: renamed from: f */
    public int f22277f;

    /* JADX INFO: renamed from: g */
    public int f22278g;

    /* JADX INFO: renamed from: h */
    public int f22279h;

    /* JADX INFO: renamed from: i */
    public Paint f22280i;

    /* JADX INFO: renamed from: j */
    public int f22281j;

    /* JADX INFO: renamed from: k */
    public int f22282k;

    /* JADX INFO: renamed from: l */
    public int f22283l;

    /* JADX INFO: renamed from: m */
    public int f22284m;

    /* JADX INFO: renamed from: n */
    public int f22285n;

    /* JADX INFO: renamed from: o */
    public int f22286o;

    /* JADX INFO: renamed from: p */
    public RectF f22287p;

    /* JADX INFO: renamed from: q */
    public Xfermode f22288q;

    /* JADX INFO: renamed from: r */
    public float f22289r;

    /* JADX INFO: renamed from: s */
    public Path f22290s;

    /* JADX INFO: renamed from: t */
    public boolean f22291t;

    /* JADX INFO: renamed from: u */
    public float f22292u;

    /* JADX INFO: renamed from: v */
    public ValueAnimator f22293v;

    /* JADX INFO: renamed from: w */
    public boolean f22294w;

    /* JADX INFO: renamed from: x */
    public float f22295x;

    /* JADX INFO: renamed from: y */
    public cmf f22296y;

    /* JADX INFO: renamed from: z */
    public dmf f22297z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedCardBaseRoot$a */
    public class C7945a implements ValueAnimator.AnimatorUpdateListener {
        public C7945a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            UserProfileExpandedCardBaseRoot userProfileExpandedCardBaseRoot = UserProfileExpandedCardBaseRoot.this;
            userProfileExpandedCardBaseRoot.f22292u = fFloatValue;
            userProfileExpandedCardBaseRoot.m37945S0();
            UserProfileExpandedCardBaseRoot.this.invalidate();
        }
    }

    public UserProfileExpandedCardBaseRoot(@NonNull Context context) {
        super(context);
        this.f22272a = C22393b.m221521b();
        this.f22274c = new cmf.C16194a();
        this.f22275d = 0;
        this.f22276e = -1;
        this.f22277f = -1;
        this.f22278g = t100.m186890d(60.0f);
        this.f22279h = t100.m186890d(0.0f);
        this.f22291t = false;
        this.f22292u = 0.0f;
        this.f22294w = true;
        this.f22295x = 0.0f;
        this.f22270A = 0.0f;
        this.f22271B = t100.m186890d(100.0f);
        m37934P0();
    }

    /* JADX INFO: renamed from: F0 */
    public static /* synthetic */ C22306c m37932F0(C22306c c22306c) {
        return c22306c;
    }

    /* JADX INFO: renamed from: K0 */
    private void m37933K0(boolean z) {
        ValueAnimator valueAnimator = this.f22293v;
        if (valueAnimator == null) {
            if (z) {
                this.f22293v = ValueAnimator.ofFloat(0.0f, 1.0f);
            } else {
                this.f22293v = ValueAnimator.ofFloat(1.0f, 0.0f);
            }
            this.f22293v.addUpdateListener(new C7945a());
            if (z && m37942O0()) {
                this.f22292u = 1.0f;
                m37945S0();
                invalidate();
                return;
            }
        } else {
            valueAnimator.cancel();
            if (z && m37942O0()) {
                this.f22292u = 1.0f;
                m37945S0();
                invalidate();
                return;
            }
            this.f22293v.setFloatValues(this.f22292u, z ? 1.0f : 0.0f);
        }
        this.f22293v.setDuration(150L);
        this.f22293v.start();
    }

    /* JADX INFO: renamed from: P0 */
    private void m37934P0() {
        this.f22273b = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f22283l = t100.m186890d(8.0f);
        this.f22284m = t100.m186890d(10.0f);
        this.f22285n = t100.m186890d(8.0f);
        this.f22286o = t100.m186890d(12.0f);
        Paint paint = new Paint();
        this.f22280i = paint;
        paint.setFilterBitmap(true);
        this.f22280i.setAntiAlias(true);
        this.f22280i.setColor(-65536);
        this.f22280i.setStyle(Paint.Style.FILL);
        this.f22290s = new Path();
        this.f22287p = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f22288q = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f22289r = t100.m186890d(20.0f);
        setLayerType(2, null);
        int i = this.f22283l;
        int i2 = this.f22284m;
        int i3 = this.f22285n;
        int iM186890d = this.f22286o + t100.m186890d(56.0f);
        float f = this.f22289r;
        this.f22297z = new dmf(i, i2, i3, iM186890d, f, f, t100.m186890d(50.0f));
        this.f22296y = new cmf(this.f22297z, this);
    }

    @Override // p149l.oql
    /* JADX INFO: renamed from: B */
    public void mo37396B(int i, int i2, int i3, String str, int i4) {
        super.mo37396B(i, i2, i3, str, i4);
    }

    /* JADX INFO: renamed from: G0 */
    public void m37935G0() {
        ValueAnimator valueAnimator = this.f22293v;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f22291t = false;
        this.f22292u = 0.0f;
    }

    /* JADX INFO: renamed from: H0 */
    public void m37936H0() {
        this.f22296y.m107624i(ExpandedCardClipStatus.EXPANDED_CARD, true);
    }

    /* JADX INFO: renamed from: I0 */
    public void m37937I0() {
        this.f22296y.m107624i(ExpandedCardClipStatus.EXPANDED_PROFILE, true);
    }

    /* JADX INFO: renamed from: J0 */
    public void m37938J0(boolean z) {
        if (z != this.f22291t) {
            this.f22291t = z;
            m37933K0(z);
        }
    }

    /* JADX INFO: renamed from: L0 */
    public void m37939L0(int i, CardProgressAction cardProgressAction, boolean z, float f, float f2) {
        if (i == 0) {
            if ((cardProgressAction == CardProgressAction.SWIPE || cardProgressAction == CardProgressAction.ANIM) && upa.m194723Z2()) {
                if (CoreModule.f17545c.f19704z2.m30255r3() || z) {
                    float f3 = this.f22270A;
                    if (f > 0.0f) {
                        if (f3 * f <= 0.0f) {
                            this.f22296y.m107618c(this.f22274c);
                            float innerTransY = getCardViewInner().getInnerTransY() - getCardViewInner().getScrollH();
                            cmf.C16194a c16194a = this.f22274c;
                            if (innerTransY > c16194a.f81551b) {
                                c16194a.f81551b = innerTransY;
                                c16194a.f81554e = t100.m186890d(20.0f);
                            }
                        }
                        this.f22296y.m107617b(f / this.f22271B, ExpandedCardClipStatus.FLING_CLIP, this.f22274c, 1.0f, "swipe size");
                    } else {
                        if (f3 * f > 0.0f) {
                            return;
                        }
                        if (upa.m194675N3() && ExpandedCardStyleHelper.m38090o().m38103s()) {
                            this.f22296y.m107624i(ExpandedCardClipStatus.SWIPE_CLIP_PROFILE, true);
                        } else {
                            this.f22296y.m107624i(ExpandedCardClipStatus.SWIPE_CLIP, true);
                        }
                    }
                    this.f22270A = f;
                }
            }
        }
    }

    /* JADX INFO: renamed from: M0 */
    public <V> C22306c<V> m37940M0(mcr mcrVar, C22306c<V> c22306c) {
        return m37941N0(mcrVar, c22306c, true);
    }

    /* JADX INFO: renamed from: N0 */
    public <V> C22306c<V> m37941N0(mcr mcrVar, final C22306c<V> c22306c, boolean z) {
        return mkd0.m154952D(new v9j() { // from class: l.s7k0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return UserProfileExpandedCardBaseRoot.m37932F0(c22306c);
            }
        }, mcrVar.lifecycle().compose(mkd0.m154953E()).takeUntil(this.f22272a.filter(new w9j() { // from class: l.r7k0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((View) obj) == this);
            }
        })), z);
    }

    /* JADX INFO: renamed from: O0 */
    public final boolean m37942O0() {
        return getExpandedCard() == null || getExpandedCard().getScrollH() == 0;
    }

    /* JADX INFO: renamed from: Q0 */
    public void m37943Q0() {
        this.f22272a.m132487l(this);
    }

    /* JADX INFO: renamed from: R0 */
    public void m37944R0(int i, User user) {
        if (!this.f22294w) {
            if (i == 0) {
                m37938J0(false);
                return;
            } else {
                this.f22292u = 1.0f;
                this.f22291t = false;
                return;
            }
        }
        if (i != 0) {
            this.f22296y.m107624i(ExpandedCardClipStatus.SWIPE_CLIP, false);
            return;
        }
        boolean zM194675N3 = upa.m194675N3();
        cmf cmfVar = this.f22296y;
        if (zM194675N3) {
            cmfVar.m107624i(ExpandedCardStyleHelper.m38090o().m38103s() ? ExpandedCardClipStatus.EXPANDED_PROFILE : ExpandedCardClipStatus.EXPANDED_CARD, true);
        } else {
            cmfVar.m107624i(ExpandedCardClipStatus.EXPANDED_CARD, true);
        }
    }

    /* JADX INFO: renamed from: S0 */
    public void m37945S0() {
    }

    @Override // p149l.oql
    /* JADX INFO: renamed from: X */
    public void mo37946X(int i, int i2, int i3, int i4, ExpandedTouchType expandedTouchType) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NonNull Canvas canvas) {
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null, 31);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        super.dispatchDraw(canvas);
        int i = this.f22281j;
        if (i > 0 && this.f22282k > 0 && this.f22292u > 0.0f && !this.f22294w) {
            this.f22290s.reset();
            this.f22290s.setFillType(Path.FillType.EVEN_ODD);
            Path path = this.f22290s;
            float f = this.f22281j + 2;
            float f2 = this.f22282k + 2;
            Path.Direction direction = Path.Direction.CW;
            path.addRect(-2.0f, -2.0f, f, f2, direction);
            this.f22280i.setXfermode(this.f22288q);
            RectF rectF = this.f22287p;
            float f3 = this.f22283l;
            float f4 = this.f22292u;
            float f5 = f3 * f4;
            float f6 = this.f22284m * f4;
            float fM186890d = t100.m186890d(0.0f);
            float f7 = this.f22292u;
            rectF.set(f5, f6 + (fM186890d * f7), this.f22281j - (this.f22285n * f7), (this.f22282k - (this.f22286o * f7)) - (t100.m186890d(56.0f) * this.f22292u));
            Path path2 = this.f22290s;
            RectF rectF2 = this.f22287p;
            float f8 = this.f22289r;
            float f9 = this.f22292u;
            path2.addRoundRect(rectF2, f8 * f9, f8 * f9, direction);
            this.f22290s.close();
            canvas.drawPath(this.f22290s, this.f22280i);
            this.f22280i.setXfermode(null);
        } else if (this.f22294w && i > 0 && this.f22282k > 0 && this.f22296y.m107619d()) {
            this.f22290s.reset();
            this.f22290s.setFillType(Path.FillType.EVEN_ODD);
            this.f22290s.addRect(-2.0f, -2.0f, this.f22281j + 2, this.f22282k + 2, Path.Direction.CW);
            this.f22280i.setXfermode(this.f22288q);
            this.f22296y.m107620e(this.f22290s);
            this.f22290s.close();
            canvas.drawPath(this.f22290s, this.f22280i);
        }
        canvas.restoreToCount(iSaveLayer);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            if (motionEvent.getY() < getExpandedCard().getTopEmptySize()) {
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public abstract BaseExpandedView getCardViewInner();

    public abstract SimpleDraweeView getClipAvatarView();

    public abstract UserProfileExpandedCard getExpandedCard();

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f22281j == View.MeasureSpec.getSize(i) && this.f22282k == View.MeasureSpec.getSize(i2)) {
            return;
        }
        this.f22281j = View.MeasureSpec.getSize(i);
        int size = View.MeasureSpec.getSize(i2);
        this.f22282k = size;
        if (this.f22294w) {
            this.f22296y.m107622g(this.f22281j, size);
        }
    }

    @Override // p149l.cmf.InterfaceC16195b
    /* JADX INFO: renamed from: u */
    public void mo37947u(ExpandedCardClipStatus expandedCardClipStatus, float f) {
        invalidate();
        if (expandedCardClipStatus != ExpandedCardClipStatus.FLING_CLIP || f < 0.9f) {
            xdl0.m208344M(getClipAvatarView(), false);
            return;
        }
        float f2 = (f - 0.9f) / 0.100000024f;
        xdl0.m208344M(getClipAvatarView(), true);
        getClipAvatarView().setAlpha(f2);
        float f3 = 2.0f - f2;
        getClipAvatarView().setScaleY(f3);
        getClipAvatarView().setScaleX(f3);
    }

    public UserProfileExpandedCardBaseRoot(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22272a = C22393b.m221521b();
        this.f22274c = new cmf.C16194a();
        this.f22275d = 0;
        this.f22276e = -1;
        this.f22277f = -1;
        this.f22278g = t100.m186890d(60.0f);
        this.f22279h = t100.m186890d(0.0f);
        this.f22291t = false;
        this.f22292u = 0.0f;
        this.f22294w = true;
        this.f22295x = 0.0f;
        this.f22270A = 0.0f;
        this.f22271B = t100.m186890d(100.0f);
        m37934P0();
    }

    public UserProfileExpandedCardBaseRoot(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22272a = C22393b.m221521b();
        this.f22274c = new cmf.C16194a();
        this.f22275d = 0;
        this.f22276e = -1;
        this.f22277f = -1;
        this.f22278g = t100.m186890d(60.0f);
        this.f22279h = t100.m186890d(0.0f);
        this.f22291t = false;
        this.f22292u = 0.0f;
        this.f22294w = true;
        this.f22295x = 0.0f;
        this.f22270A = 0.0f;
        this.f22271B = t100.m186890d(100.0f);
        m37934P0();
    }
}
