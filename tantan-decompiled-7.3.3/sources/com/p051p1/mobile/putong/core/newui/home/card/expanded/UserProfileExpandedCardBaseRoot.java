package com.p051p1.mobile.putong.core.newui.home.card.expanded;

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
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedCardBaseRoot;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.anim.ExpandedCardClipStatus;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.base.BaseExpandedView;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.base.ExpandedTouchType;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;
import com.p051p1.mobile.putong.core.newui.home.opt.CardProgressAction;
import com.p051p1.mobile.putong.data.User;
import p137rx.C22421c;
import p137rx.subjects.C22508b;
import p153l.atl;
import p153l.bnl0;
import p153l.gra;
import p153l.inf;
import p153l.jnf;
import p153l.ner;
import p153l.pcj;
import p153l.psd0;
import p153l.qa00;
import p153l.qcj;

/* JADX INFO: loaded from: classes11.dex */
public abstract class UserProfileExpandedCardBaseRoot extends FrameLayout implements atl, inf.InterfaceC17749b {

    /* JADX INFO: renamed from: A */
    public float f23012A;

    /* JADX INFO: renamed from: B */
    public float f23013B;

    /* JADX INFO: renamed from: a */
    public C22508b<View> f23014a;

    /* JADX INFO: renamed from: b */
    public float f23015b;

    /* JADX INFO: renamed from: c */
    public inf.C17748a f23016c;

    /* JADX INFO: renamed from: d */
    public int f23017d;

    /* JADX INFO: renamed from: e */
    public int f23018e;

    /* JADX INFO: renamed from: f */
    public int f23019f;

    /* JADX INFO: renamed from: g */
    public int f23020g;

    /* JADX INFO: renamed from: h */
    public int f23021h;

    /* JADX INFO: renamed from: i */
    public Paint f23022i;

    /* JADX INFO: renamed from: j */
    public int f23023j;

    /* JADX INFO: renamed from: k */
    public int f23024k;

    /* JADX INFO: renamed from: l */
    public int f23025l;

    /* JADX INFO: renamed from: m */
    public int f23026m;

    /* JADX INFO: renamed from: n */
    public int f23027n;

    /* JADX INFO: renamed from: o */
    public int f23028o;

    /* JADX INFO: renamed from: p */
    public RectF f23029p;

    /* JADX INFO: renamed from: q */
    public Xfermode f23030q;

    /* JADX INFO: renamed from: r */
    public float f23031r;

    /* JADX INFO: renamed from: s */
    public Path f23032s;

    /* JADX INFO: renamed from: t */
    public boolean f23033t;

    /* JADX INFO: renamed from: u */
    public float f23034u;

    /* JADX INFO: renamed from: v */
    public ValueAnimator f23035v;

    /* JADX INFO: renamed from: w */
    public boolean f23036w;

    /* JADX INFO: renamed from: x */
    public float f23037x;

    /* JADX INFO: renamed from: y */
    public inf f23038y;

    /* JADX INFO: renamed from: z */
    public jnf f23039z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedCardBaseRoot$a */
    public class C8096a implements ValueAnimator.AnimatorUpdateListener {
        public C8096a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            UserProfileExpandedCardBaseRoot userProfileExpandedCardBaseRoot = UserProfileExpandedCardBaseRoot.this;
            userProfileExpandedCardBaseRoot.f23034u = fFloatValue;
            userProfileExpandedCardBaseRoot.m38948S0();
            UserProfileExpandedCardBaseRoot.this.invalidate();
        }
    }

    public UserProfileExpandedCardBaseRoot(@NonNull Context context) {
        super(context);
        this.f23014a = C22508b.m222767b();
        this.f23016c = new inf.C17748a();
        this.f23017d = 0;
        this.f23018e = -1;
        this.f23019f = -1;
        this.f23020g = qa00.m175859d(60.0f);
        this.f23021h = qa00.m175859d(0.0f);
        this.f23033t = false;
        this.f23034u = 0.0f;
        this.f23036w = true;
        this.f23037x = 0.0f;
        this.f23012A = 0.0f;
        this.f23013B = qa00.m175859d(100.0f);
        m38937P0();
    }

    /* JADX INFO: renamed from: F0 */
    public static /* synthetic */ C22421c m38935F0(C22421c c22421c) {
        return c22421c;
    }

    /* JADX INFO: renamed from: K0 */
    private void m38936K0(boolean z) {
        ValueAnimator valueAnimator = this.f23035v;
        if (valueAnimator == null) {
            if (z) {
                this.f23035v = ValueAnimator.ofFloat(0.0f, 1.0f);
            } else {
                this.f23035v = ValueAnimator.ofFloat(1.0f, 0.0f);
            }
            this.f23035v.addUpdateListener(new C8096a());
            if (z && m38945O0()) {
                this.f23034u = 1.0f;
                m38948S0();
                invalidate();
                return;
            }
        } else {
            valueAnimator.cancel();
            if (z && m38945O0()) {
                this.f23034u = 1.0f;
                m38948S0();
                invalidate();
                return;
            }
            this.f23035v.setFloatValues(this.f23034u, z ? 1.0f : 0.0f);
        }
        this.f23035v.setDuration(150L);
        this.f23035v.start();
    }

    /* JADX INFO: renamed from: P0 */
    private void m38937P0() {
        this.f23015b = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f23025l = qa00.m175859d(8.0f);
        this.f23026m = qa00.m175859d(10.0f);
        this.f23027n = qa00.m175859d(8.0f);
        this.f23028o = qa00.m175859d(12.0f);
        Paint paint = new Paint();
        this.f23022i = paint;
        paint.setFilterBitmap(true);
        this.f23022i.setAntiAlias(true);
        this.f23022i.setColor(-65536);
        this.f23022i.setStyle(Paint.Style.FILL);
        this.f23032s = new Path();
        this.f23029p = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f23030q = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f23031r = qa00.m175859d(20.0f);
        setLayerType(2, null);
        int i = this.f23025l;
        int i2 = this.f23026m;
        int i3 = this.f23027n;
        int iM175859d = this.f23028o + qa00.m175859d(56.0f);
        float f = this.f23031r;
        this.f23039z = new jnf(i, i2, i3, iM175859d, f, f, qa00.m175859d(50.0f));
        this.f23038y = new inf(this.f23039z, this);
    }

    @Override // p153l.atl
    /* JADX INFO: renamed from: B */
    public void mo38399B(int i, int i2, int i3, String str, int i4) {
        super.mo38399B(i, i2, i3, str, i4);
    }

    /* JADX INFO: renamed from: G0 */
    public void m38938G0() {
        ValueAnimator valueAnimator = this.f23035v;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f23033t = false;
        this.f23034u = 0.0f;
    }

    /* JADX INFO: renamed from: H0 */
    public void m38939H0() {
        this.f23038y.m141122i(ExpandedCardClipStatus.EXPANDED_CARD, true);
    }

    /* JADX INFO: renamed from: I0 */
    public void m38940I0() {
        this.f23038y.m141122i(ExpandedCardClipStatus.EXPANDED_PROFILE, true);
    }

    /* JADX INFO: renamed from: J0 */
    public void m38941J0(boolean z) {
        if (z != this.f23033t) {
            this.f23033t = z;
            m38936K0(z);
        }
    }

    /* JADX INFO: renamed from: L0 */
    public void m38942L0(int i, CardProgressAction cardProgressAction, boolean z, float f, float f2) {
        if (i == 0) {
            if ((cardProgressAction == CardProgressAction.SWIPE || cardProgressAction == CardProgressAction.ANIM) && gra.m131654Z2()) {
                if (CoreModule.f18264c.f20446z2.m31253r3() || z) {
                    float f3 = this.f23012A;
                    if (f > 0.0f) {
                        if (f3 * f <= 0.0f) {
                            this.f23038y.m141116c(this.f23016c);
                            float innerTransY = getCardViewInner().getInnerTransY() - getCardViewInner().getScrollH();
                            inf.C17748a c17748a = this.f23016c;
                            if (innerTransY > c17748a.f115945b) {
                                c17748a.f115945b = innerTransY;
                                c17748a.f115948e = qa00.m175859d(20.0f);
                            }
                        }
                        this.f23038y.m141115b(f / this.f23013B, ExpandedCardClipStatus.FLING_CLIP, this.f23016c, 1.0f, "swipe size");
                    } else {
                        if (f3 * f > 0.0f) {
                            return;
                        }
                        if (gra.m131606N3() && ExpandedCardStyleHelper.m39093o().m39106s()) {
                            this.f23038y.m141122i(ExpandedCardClipStatus.SWIPE_CLIP_PROFILE, true);
                        } else {
                            this.f23038y.m141122i(ExpandedCardClipStatus.SWIPE_CLIP, true);
                        }
                    }
                    this.f23012A = f;
                }
            }
        }
    }

    /* JADX INFO: renamed from: M0 */
    public <V> C22421c<V> m38943M0(ner nerVar, C22421c<V> c22421c) {
        return m38944N0(nerVar, c22421c, true);
    }

    /* JADX INFO: renamed from: N0 */
    public <V> C22421c<V> m38944N0(ner nerVar, final C22421c<V> c22421c, boolean z) {
        return psd0.m173593D(new pcj() { // from class: l.ygk0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return UserProfileExpandedCardBaseRoot.m38935F0(c22421c);
            }
        }, nerVar.lifecycle().compose(psd0.m173594E()).takeUntil(this.f23014a.filter(new qcj() { // from class: l.xgk0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((View) obj) == this);
            }
        })), z);
    }

    /* JADX INFO: renamed from: O0 */
    public final boolean m38945O0() {
        return getExpandedCard() == null || getExpandedCard().getScrollH() == 0;
    }

    /* JADX INFO: renamed from: Q0 */
    public void m38946Q0() {
        this.f23014a.m137019l(this);
    }

    /* JADX INFO: renamed from: R0 */
    public void m38947R0(int i, User user) {
        if (!this.f23036w) {
            if (i == 0) {
                m38941J0(false);
                return;
            } else {
                this.f23034u = 1.0f;
                this.f23033t = false;
                return;
            }
        }
        if (i != 0) {
            this.f23038y.m141122i(ExpandedCardClipStatus.SWIPE_CLIP, false);
            return;
        }
        boolean zM131606N3 = gra.m131606N3();
        inf infVar = this.f23038y;
        if (zM131606N3) {
            infVar.m141122i(ExpandedCardStyleHelper.m39093o().m39106s() ? ExpandedCardClipStatus.EXPANDED_PROFILE : ExpandedCardClipStatus.EXPANDED_CARD, true);
        } else {
            infVar.m141122i(ExpandedCardClipStatus.EXPANDED_CARD, true);
        }
    }

    /* JADX INFO: renamed from: S0 */
    public void m38948S0() {
    }

    @Override // p153l.atl
    /* JADX INFO: renamed from: X */
    public void mo38949X(int i, int i2, int i3, int i4, ExpandedTouchType expandedTouchType) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NonNull Canvas canvas) {
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null, 31);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        super.dispatchDraw(canvas);
        int i = this.f23023j;
        if (i > 0 && this.f23024k > 0 && this.f23034u > 0.0f && !this.f23036w) {
            this.f23032s.reset();
            this.f23032s.setFillType(Path.FillType.EVEN_ODD);
            Path path = this.f23032s;
            float f = this.f23023j + 2;
            float f2 = this.f23024k + 2;
            Path.Direction direction = Path.Direction.CW;
            path.addRect(-2.0f, -2.0f, f, f2, direction);
            this.f23022i.setXfermode(this.f23030q);
            RectF rectF = this.f23029p;
            float f3 = this.f23025l;
            float f4 = this.f23034u;
            float f5 = f3 * f4;
            float f6 = this.f23026m * f4;
            float fM175859d = qa00.m175859d(0.0f);
            float f7 = this.f23034u;
            rectF.set(f5, f6 + (fM175859d * f7), this.f23023j - (this.f23027n * f7), (this.f23024k - (this.f23028o * f7)) - (qa00.m175859d(56.0f) * this.f23034u));
            Path path2 = this.f23032s;
            RectF rectF2 = this.f23029p;
            float f8 = this.f23031r;
            float f9 = this.f23034u;
            path2.addRoundRect(rectF2, f8 * f9, f8 * f9, direction);
            this.f23032s.close();
            canvas.drawPath(this.f23032s, this.f23022i);
            this.f23022i.setXfermode(null);
        } else if (this.f23036w && i > 0 && this.f23024k > 0 && this.f23038y.m141117d()) {
            this.f23032s.reset();
            this.f23032s.setFillType(Path.FillType.EVEN_ODD);
            this.f23032s.addRect(-2.0f, -2.0f, this.f23023j + 2, this.f23024k + 2, Path.Direction.CW);
            this.f23022i.setXfermode(this.f23030q);
            this.f23038y.m141118e(this.f23032s);
            this.f23032s.close();
            canvas.drawPath(this.f23032s, this.f23022i);
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
        if (this.f23023j == View.MeasureSpec.getSize(i) && this.f23024k == View.MeasureSpec.getSize(i2)) {
            return;
        }
        this.f23023j = View.MeasureSpec.getSize(i);
        int size = View.MeasureSpec.getSize(i2);
        this.f23024k = size;
        if (this.f23036w) {
            this.f23038y.m141120g(this.f23023j, size);
        }
    }

    @Override // p153l.inf.InterfaceC17749b
    /* JADX INFO: renamed from: u */
    public void mo38950u(ExpandedCardClipStatus expandedCardClipStatus, float f) {
        invalidate();
        if (expandedCardClipStatus != ExpandedCardClipStatus.FLING_CLIP || f < 0.9f) {
            bnl0.m105524M(getClipAvatarView(), false);
            return;
        }
        float f2 = (f - 0.9f) / 0.100000024f;
        bnl0.m105524M(getClipAvatarView(), true);
        getClipAvatarView().setAlpha(f2);
        float f3 = 2.0f - f2;
        getClipAvatarView().setScaleY(f3);
        getClipAvatarView().setScaleX(f3);
    }

    public UserProfileExpandedCardBaseRoot(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23014a = C22508b.m222767b();
        this.f23016c = new inf.C17748a();
        this.f23017d = 0;
        this.f23018e = -1;
        this.f23019f = -1;
        this.f23020g = qa00.m175859d(60.0f);
        this.f23021h = qa00.m175859d(0.0f);
        this.f23033t = false;
        this.f23034u = 0.0f;
        this.f23036w = true;
        this.f23037x = 0.0f;
        this.f23012A = 0.0f;
        this.f23013B = qa00.m175859d(100.0f);
        m38937P0();
    }

    public UserProfileExpandedCardBaseRoot(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23014a = C22508b.m222767b();
        this.f23016c = new inf.C17748a();
        this.f23017d = 0;
        this.f23018e = -1;
        this.f23019f = -1;
        this.f23020g = qa00.m175859d(60.0f);
        this.f23021h = qa00.m175859d(0.0f);
        this.f23033t = false;
        this.f23034u = 0.0f;
        this.f23036w = true;
        this.f23037x = 0.0f;
        this.f23012A = 0.0f;
        this.f23013B = qa00.m175859d(100.0f);
        m38937P0();
    }
}
