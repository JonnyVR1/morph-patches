package com.p000p1.mobile.putong.core.newui.home.card.expanded;

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
import com.p000p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedCardBaseRoot;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.anim.ExpandedCardClipStatus;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.base.BaseExpandedView;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.base.ExpandedTouchType;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;
import com.p000p1.mobile.putong.core.newui.home.opt.CardProgressAction;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.User;
import l.mcr;
import l.mkd0;
import l.t100;
import l.upa;
import l.v9j;
import l.w9j;
import l.xdl0;
import p009l.cmf;
import p009l.dmf;
import p009l.oql;
import rx.c;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public abstract class UserProfileExpandedCardBaseRoot extends FrameLayout implements oql, cmf.InterfaceC0823b {

    /* JADX INFO: renamed from: A */
    public float f1048A;

    /* JADX INFO: renamed from: B */
    public float f1049B;

    /* JADX INFO: renamed from: a */
    public b<View> f1050a;

    /* JADX INFO: renamed from: b */
    public float f1051b;

    /* JADX INFO: renamed from: c */
    public cmf.C0822a f1052c;

    /* JADX INFO: renamed from: d */
    public int f1053d;

    /* JADX INFO: renamed from: e */
    public int f1054e;

    /* JADX INFO: renamed from: f */
    public int f1055f;

    /* JADX INFO: renamed from: g */
    public int f1056g;

    /* JADX INFO: renamed from: h */
    public int f1057h;

    /* JADX INFO: renamed from: i */
    public Paint f1058i;

    /* JADX INFO: renamed from: j */
    public int f1059j;

    /* JADX INFO: renamed from: k */
    public int f1060k;

    /* JADX INFO: renamed from: l */
    public int f1061l;

    /* JADX INFO: renamed from: m */
    public int f1062m;

    /* JADX INFO: renamed from: n */
    public int f1063n;

    /* JADX INFO: renamed from: o */
    public int f1064o;

    /* JADX INFO: renamed from: p */
    public RectF f1065p;

    /* JADX INFO: renamed from: q */
    public Xfermode f1066q;

    /* JADX INFO: renamed from: r */
    public float f1067r;

    /* JADX INFO: renamed from: s */
    public Path f1068s;

    /* JADX INFO: renamed from: t */
    public boolean f1069t;

    /* JADX INFO: renamed from: u */
    public float f1070u;

    /* JADX INFO: renamed from: v */
    public ValueAnimator f1071v;

    /* JADX INFO: renamed from: w */
    public boolean f1072w;

    /* JADX INFO: renamed from: x */
    public float f1073x;

    /* JADX INFO: renamed from: y */
    public cmf f1074y;

    /* JADX INFO: renamed from: z */
    public dmf f1075z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedCardBaseRoot$a */
    public class C0109a implements ValueAnimator.AnimatorUpdateListener {
        public C0109a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            UserProfileExpandedCardBaseRoot userProfileExpandedCardBaseRoot = UserProfileExpandedCardBaseRoot.this;
            userProfileExpandedCardBaseRoot.f1070u = fFloatValue;
            userProfileExpandedCardBaseRoot.m1919S0();
            UserProfileExpandedCardBaseRoot.this.invalidate();
        }
    }

    public UserProfileExpandedCardBaseRoot(@NonNull Context context) {
        super(context);
        this.f1050a = b.b();
        this.f1052c = new cmf.C0822a();
        this.f1053d = 0;
        this.f1054e = -1;
        this.f1055f = -1;
        this.f1056g = t100.d(60.0f);
        this.f1057h = t100.d(0.0f);
        this.f1069t = false;
        this.f1070u = 0.0f;
        this.f1072w = true;
        this.f1073x = 0.0f;
        this.f1048A = 0.0f;
        this.f1049B = t100.d(100.0f);
        m1908P0();
    }

    /* JADX INFO: renamed from: F0 */
    public static /* synthetic */ c m1906F0(c cVar) {
        return cVar;
    }

    /* JADX INFO: renamed from: K0 */
    private void m1907K0(boolean z) {
        ValueAnimator valueAnimator = this.f1071v;
        if (valueAnimator == null) {
            if (z) {
                this.f1071v = ValueAnimator.ofFloat(0.0f, 1.0f);
            } else {
                this.f1071v = ValueAnimator.ofFloat(1.0f, 0.0f);
            }
            this.f1071v.addUpdateListener(new C0109a());
            if (z && m1916O0()) {
                this.f1070u = 1.0f;
                m1919S0();
                invalidate();
                return;
            }
        } else {
            valueAnimator.cancel();
            if (z && m1916O0()) {
                this.f1070u = 1.0f;
                m1919S0();
                invalidate();
                return;
            }
            this.f1071v.setFloatValues(this.f1070u, z ? 1.0f : 0.0f);
        }
        this.f1071v.setDuration(150L);
        this.f1071v.start();
    }

    /* JADX INFO: renamed from: P0 */
    private void m1908P0() {
        this.f1051b = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f1061l = t100.d(8.0f);
        this.f1062m = t100.d(10.0f);
        this.f1063n = t100.d(8.0f);
        this.f1064o = t100.d(12.0f);
        Paint paint = new Paint();
        this.f1058i = paint;
        paint.setFilterBitmap(true);
        this.f1058i.setAntiAlias(true);
        this.f1058i.setColor(-65536);
        this.f1058i.setStyle(Paint.Style.FILL);
        this.f1068s = new Path();
        this.f1065p = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f1066q = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f1067r = t100.d(20.0f);
        setLayerType(2, null);
        int i = this.f1061l;
        int i2 = this.f1062m;
        int i3 = this.f1063n;
        int iD = this.f1064o + t100.d(56.0f);
        float f = this.f1067r;
        this.f1075z = new dmf(i, i2, i3, iD, f, f, t100.d(50.0f));
        this.f1074y = new cmf(this.f1075z, this);
    }

    @Override // p009l.oql
    /* JADX INFO: renamed from: B */
    public void mo1365B(int i, int i2, int i3, String str, int i4) {
        super.mo1365B(i, i2, i3, str, i4);
    }

    /* JADX INFO: renamed from: G0 */
    public void m1909G0() {
        ValueAnimator valueAnimator = this.f1071v;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f1069t = false;
        this.f1070u = 0.0f;
    }

    /* JADX INFO: renamed from: H0 */
    public void m1910H0() {
        this.f1074y.m12714i(ExpandedCardClipStatus.EXPANDED_CARD, true);
    }

    /* JADX INFO: renamed from: I0 */
    public void m1911I0() {
        this.f1074y.m12714i(ExpandedCardClipStatus.EXPANDED_PROFILE, true);
    }

    /* JADX INFO: renamed from: J0 */
    public void m1912J0(boolean z) {
        if (z != this.f1069t) {
            this.f1069t = z;
            m1907K0(z);
        }
    }

    /* JADX INFO: renamed from: L0 */
    public void m1913L0(int i, CardProgressAction cardProgressAction, boolean z, float f, float f2) {
        if (i == 0) {
            if ((cardProgressAction == CardProgressAction.SWIPE || cardProgressAction == CardProgressAction.ANIM) && upa.Z2()) {
                if (CoreModule.c.z2.r3() || z) {
                    float f3 = this.f1048A;
                    if (f > 0.0f) {
                        if (f3 * f <= 0.0f) {
                            this.f1074y.m12708c(this.f1052c);
                            float innerTransY = getCardViewInner().getInnerTransY() - getCardViewInner().getScrollH();
                            cmf.C0822a c0822a = this.f1052c;
                            if (innerTransY > c0822a.f10689b) {
                                c0822a.f10689b = innerTransY;
                                c0822a.f10692e = t100.d(20.0f);
                            }
                        }
                        this.f1074y.m12707b(f / this.f1049B, ExpandedCardClipStatus.FLING_CLIP, this.f1052c, 1.0f, "swipe size");
                    } else {
                        if (f3 * f > 0.0f) {
                            return;
                        }
                        if (upa.N3() && ExpandedCardStyleHelper.m2064o().m2077s()) {
                            this.f1074y.m12714i(ExpandedCardClipStatus.SWIPE_CLIP_PROFILE, true);
                        } else {
                            this.f1074y.m12714i(ExpandedCardClipStatus.SWIPE_CLIP, true);
                        }
                    }
                    this.f1048A = f;
                }
            }
        }
    }

    /* JADX INFO: renamed from: M0 */
    public <V> c<V> m1914M0(mcr mcrVar, c<V> cVar) {
        return m1915N0(mcrVar, cVar, true);
    }

    /* JADX INFO: renamed from: N0 */
    public <V> c<V> m1915N0(mcr mcrVar, final c<V> cVar, boolean z) {
        return mkd0.D(new v9j() { // from class: l.s7k0
            public final Object call() {
                return UserProfileExpandedCardBaseRoot.m1906F0(cVar);
            }
        }, mcrVar.lifecycle().compose(mkd0.E()).takeUntil(this.f1050a.filter(new w9j() { // from class: l.r7k0
            public final Object call(Object obj) {
                return Boolean.valueOf(((View) obj) == this);
            }
        })), z);
    }

    /* JADX INFO: renamed from: O0 */
    public final boolean m1916O0() {
        return getExpandedCard() == null || getExpandedCard().getScrollH() == 0;
    }

    /* JADX INFO: renamed from: Q0 */
    public void m1917Q0() {
        this.f1050a.onNext(this);
    }

    /* JADX INFO: renamed from: R0 */
    public void m1918R0(int i, User user) {
        if (!this.f1072w) {
            if (i == 0) {
                m1912J0(false);
                return;
            } else {
                this.f1070u = 1.0f;
                this.f1069t = false;
                return;
            }
        }
        if (i != 0) {
            this.f1074y.m12714i(ExpandedCardClipStatus.SWIPE_CLIP, false);
            return;
        }
        boolean zN3 = upa.N3();
        cmf cmfVar = this.f1074y;
        if (zN3) {
            cmfVar.m12714i(ExpandedCardStyleHelper.m2064o().m2077s() ? ExpandedCardClipStatus.EXPANDED_PROFILE : ExpandedCardClipStatus.EXPANDED_CARD, true);
        } else {
            cmfVar.m12714i(ExpandedCardClipStatus.EXPANDED_CARD, true);
        }
    }

    /* JADX INFO: renamed from: S0 */
    public void m1919S0() {
    }

    @Override // p009l.oql
    /* JADX INFO: renamed from: X */
    public void mo1920X(int i, int i2, int i3, int i4, ExpandedTouchType expandedTouchType) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NonNull Canvas canvas) {
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null, 31);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        super.dispatchDraw(canvas);
        int i = this.f1059j;
        if (i > 0 && this.f1060k > 0 && this.f1070u > 0.0f && !this.f1072w) {
            this.f1068s.reset();
            this.f1068s.setFillType(Path.FillType.EVEN_ODD);
            Path path = this.f1068s;
            float f = this.f1059j + 2;
            float f2 = this.f1060k + 2;
            Path.Direction direction = Path.Direction.CW;
            path.addRect(-2.0f, -2.0f, f, f2, direction);
            this.f1058i.setXfermode(this.f1066q);
            RectF rectF = this.f1065p;
            float f3 = this.f1061l;
            float f4 = this.f1070u;
            float f5 = f3 * f4;
            float f6 = this.f1062m * f4;
            float fD = t100.d(0.0f);
            float f7 = this.f1070u;
            rectF.set(f5, f6 + (fD * f7), this.f1059j - (this.f1063n * f7), (this.f1060k - (this.f1064o * f7)) - (t100.d(56.0f) * this.f1070u));
            Path path2 = this.f1068s;
            RectF rectF2 = this.f1065p;
            float f8 = this.f1067r;
            float f9 = this.f1070u;
            path2.addRoundRect(rectF2, f8 * f9, f8 * f9, direction);
            this.f1068s.close();
            canvas.drawPath(this.f1068s, this.f1058i);
            this.f1058i.setXfermode(null);
        } else if (this.f1072w && i > 0 && this.f1060k > 0 && this.f1074y.m12709d()) {
            this.f1068s.reset();
            this.f1068s.setFillType(Path.FillType.EVEN_ODD);
            this.f1068s.addRect(-2.0f, -2.0f, this.f1059j + 2, this.f1060k + 2, Path.Direction.CW);
            this.f1058i.setXfermode(this.f1066q);
            this.f1074y.m12710e(this.f1068s);
            this.f1068s.close();
            canvas.drawPath(this.f1068s, this.f1058i);
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
        if (this.f1059j == View.MeasureSpec.getSize(i) && this.f1060k == View.MeasureSpec.getSize(i2)) {
            return;
        }
        this.f1059j = View.MeasureSpec.getSize(i);
        int size = View.MeasureSpec.getSize(i2);
        this.f1060k = size;
        if (this.f1072w) {
            this.f1074y.m12712g(this.f1059j, size);
        }
    }

    @Override // p009l.cmf.InterfaceC0823b
    /* JADX INFO: renamed from: u */
    public void mo1921u(ExpandedCardClipStatus expandedCardClipStatus, float f) {
        invalidate();
        if (expandedCardClipStatus != ExpandedCardClipStatus.FLING_CLIP || f < 0.9f) {
            xdl0.M(getClipAvatarView(), false);
            return;
        }
        float f2 = (f - 0.9f) / 0.100000024f;
        xdl0.M(getClipAvatarView(), true);
        getClipAvatarView().setAlpha(f2);
        float f3 = 2.0f - f2;
        getClipAvatarView().setScaleY(f3);
        getClipAvatarView().setScaleX(f3);
    }

    public UserProfileExpandedCardBaseRoot(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1050a = b.b();
        this.f1052c = new cmf.C0822a();
        this.f1053d = 0;
        this.f1054e = -1;
        this.f1055f = -1;
        this.f1056g = t100.d(60.0f);
        this.f1057h = t100.d(0.0f);
        this.f1069t = false;
        this.f1070u = 0.0f;
        this.f1072w = true;
        this.f1073x = 0.0f;
        this.f1048A = 0.0f;
        this.f1049B = t100.d(100.0f);
        m1908P0();
    }

    public UserProfileExpandedCardBaseRoot(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1050a = b.b();
        this.f1052c = new cmf.C0822a();
        this.f1053d = 0;
        this.f1054e = -1;
        this.f1055f = -1;
        this.f1056g = t100.d(60.0f);
        this.f1057h = t100.d(0.0f);
        this.f1069t = false;
        this.f1070u = 0.0f;
        this.f1072w = true;
        this.f1073x = 0.0f;
        this.f1048A = 0.0f;
        this.f1049B = t100.d(100.0f);
        m1908P0();
    }
}
