package com.idv.identity.ocr;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.ColorInt;
import com.idv.identity.ocr.widget.RectMaskView;
import p153l.dec0;
import p153l.ehc0;
import p153l.je00;
import p153l.o6r0;
import p153l.rcc0;
import p153l.vac0;

/* JADX INFO: loaded from: classes7.dex */
public class IdentityScanView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    private final float f13021a;

    /* JADX INFO: renamed from: b */
    private ValueAnimator f13022b;

    /* JADX INFO: renamed from: c */
    private float f13023c;

    /* JADX INFO: renamed from: d */
    private float f13024d;

    /* JADX INFO: renamed from: e */
    private float f13025e;

    /* JADX INFO: renamed from: f */
    private float f13026f;

    /* JADX INFO: renamed from: g */
    private boolean f13027g;

    /* JADX INFO: renamed from: h */
    private boolean f13028h;

    /* JADX INFO: renamed from: i */
    private int f13029i;

    /* JADX INFO: renamed from: j */
    private float f13030j;

    /* JADX INFO: renamed from: k */
    private float f13031k;

    /* JADX INFO: renamed from: l */
    private Drawable f13032l;

    /* JADX INFO: renamed from: m */
    private boolean f13033m;

    /* JADX INFO: renamed from: n */
    private boolean f13034n;

    /* JADX INFO: renamed from: o */
    private View f13035o;

    /* JADX INFO: renamed from: p */
    private RectMaskView f13036p;

    /* JADX INFO: renamed from: com.idv.identity.ocr.IdentityScanView$a */
    public class C3736a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ View f13037a;

        public C3736a(View view) {
            this.f13037a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            View view = this.f13037a;
            if (view != null) {
                view.setAlpha(fFloatValue);
            }
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.IdentityScanView$b */
    public class C3737b implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ View f13039a;

        public C3737b(View view) {
            this.f13039a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ViewGroup.LayoutParams layoutParams = this.f13039a.getLayoutParams();
            layoutParams.height = (int) fFloatValue;
            this.f13039a.setLayoutParams(layoutParams);
            this.f13039a.requestLayout();
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.IdentityScanView$c */
    public class C3738c implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ float f13041a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ float f13042b;

        public C3738c(float f, float f2) {
            this.f13041a = f;
            this.f13042b = f2;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            IdentityScanView.this.f13036p.setRectTop((int) (this.f13041a + fFloatValue));
            int i = (int) (this.f13042b - (fFloatValue * 2.0f));
            if (i < 0) {
                i = 0;
            }
            IdentityScanView.this.f13036p.setRectHeight(i);
            IdentityScanView.this.f13036p.invalidate();
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.IdentityScanView$d */
    public class C3739d implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ float f13044a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ float f13045b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Animator.AnimatorListener f13046c;

        public C3739d(float f, float f2, Animator.AnimatorListener animatorListener) {
            this.f13044a = f;
            this.f13045b = f2;
            this.f13046c = animatorListener;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            Animator.AnimatorListener animatorListener = this.f13046c;
            if (animatorListener != null) {
                animatorListener.onAnimationCancel(animator);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            o6r0.m166281a("眨眼动画结束...");
            IdentityScanView.this.f13036p.setRectTop((int) this.f13044a);
            IdentityScanView.this.f13036p.setRectHeight((int) this.f13045b);
            IdentityScanView.this.invalidate();
            Animator.AnimatorListener animatorListener = this.f13046c;
            if (animatorListener != null) {
                animatorListener.onAnimationEnd(animator);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            Animator.AnimatorListener animatorListener = this.f13046c;
            if (animatorListener != null) {
                animatorListener.onAnimationRepeat(animator);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            o6r0.m166281a("眨眼动画开始...");
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.IdentityScanView$e */
    public static /* synthetic */ class C3740e {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f13048a;

        static {
            int[] iArr = new int[OcrType.values().length];
            f13048a = iArr;
            try {
                iArr[OcrType.OT_PHOTO_FRONT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13048a[OcrType.OT_PHOTO_BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13048a[OcrType.OT_PHOTO_THIRD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13048a[OcrType.OT_PHOTO_BACK_3D.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13048a[OcrType.OT_PHOTO_FRONT_3D.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public IdentityScanView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13021a = 0.6405797f;
        this.f13023c = -1.0f;
        this.f13024d = -1.0f;
        this.f13025e = -1.0f;
        this.f13026f = -1.0f;
        this.f13027g = false;
        this.f13028h = false;
        this.f13029i = -1;
        this.f13030j = 0.0f;
        this.f13031k = 0.0f;
        this.f13032l = null;
        this.f13033m = false;
        this.f13034n = false;
        LayoutInflater.from(context).inflate(dec0.f88008l, this);
        m18807e(context, attributeSet);
    }

    /* JADX INFO: renamed from: e */
    private void m18807e(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ehc0.f94024h);
        if (typedArrayObtainStyledAttributes != null) {
            this.f13023c = typedArrayObtainStyledAttributes.getDimension(ehc0.f94028l, 0.0f);
            this.f13024d = typedArrayObtainStyledAttributes.getDimension(ehc0.f94033q, 0.0f);
            this.f13025e = typedArrayObtainStyledAttributes.getDimension(ehc0.f94035s, 0.0f);
            this.f13026f = typedArrayObtainStyledAttributes.getDimension(ehc0.f94027k, 0.0f);
            this.f13027g = typedArrayObtainStyledAttributes.getBoolean(ehc0.f94026j, false);
            this.f13028h = typedArrayObtainStyledAttributes.getBoolean(ehc0.f94034r, false);
            this.f13029i = typedArrayObtainStyledAttributes.getColor(ehc0.f94030n, -1);
            this.f13030j = typedArrayObtainStyledAttributes.getDimension(ehc0.f94032p, 0.0f);
            this.f13031k = typedArrayObtainStyledAttributes.getDimension(ehc0.f94031o, 0.0f);
            this.f13032l = typedArrayObtainStyledAttributes.getDrawable(ehc0.f94029m);
            this.f13033m = typedArrayObtainStyledAttributes.getBoolean(ehc0.f94025i, false);
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f13035o = findViewById(rcc0.f162108K0);
        RectMaskView rectMaskView = (RectMaskView) findViewById(rcc0.f162112M0);
        this.f13036p = rectMaskView;
        rectMaskView.setRectLeft(this.f13023c);
        this.f13036p.setRectTop((int) this.f13024d);
        this.f13036p.setRectHeight((int) this.f13026f);
        this.f13036p.setRectWidth((int) this.f13025e);
        this.f13036p.setStrokeWidth((int) this.f13030j);
        this.f13036p.setRectRoundCx((int) this.f13031k);
        this.f13036p.setRectColor(this.f13029i);
        ImageView imageView = (ImageView) findViewById(rcc0.f162195x);
        if (this.f13033m) {
            return;
        }
        imageView.setVisibility(4);
    }

    /* JADX INFO: renamed from: b */
    public void m18808b() {
        ViewGroup.LayoutParams layoutParams;
        ImageView imageView = (ImageView) findViewById(rcc0.f162193w);
        if (imageView != null) {
            imageView.setImageDrawable(this.f13032l);
            int width = getWidth() - ((int) (this.f13023c * 2.0f));
            float f = width;
            int i = (int) (0.6405797f * f);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams2.height = je00.m144505a(getContext(), 94.0f);
            layoutParams2.width = je00.m144505a(getContext(), 82.0f);
            layoutParams2.topMargin = (i - je00.m144505a(getContext(), 94.0f)) / 2;
            layoutParams2.leftMargin = (int) ((width - je00.m144505a(getContext(), 82.0f)) - this.f13023c);
            imageView.setLayoutParams(layoutParams2);
            Log.e("autoLayout", "imgFrontCardW:" + width + ",imgFrontCardH:" + i + "   layoutParams.height:" + layoutParams2.height + "  layoutParams.width:" + layoutParams2.width + " layoutParams.topMargin:" + layoutParams2.topMargin + "  layoutParams.leftMargin:" + layoutParams2.leftMargin);
            this.f13025e = f;
            this.f13026f = (float) i;
        }
        View viewFindViewById = findViewById(rcc0.f162108K0);
        if (viewFindViewById != null) {
            ViewGroup.LayoutParams layoutParams3 = viewFindViewById.getLayoutParams();
            layoutParams3.height = (int) this.f13024d;
            viewFindViewById.setLayoutParams(layoutParams3);
        }
        View viewFindViewById2 = findViewById(rcc0.f162104I0);
        if (viewFindViewById2 != null) {
            ViewGroup.LayoutParams layoutParams4 = viewFindViewById2.getLayoutParams();
            layoutParams4.width = (int) this.f13023c;
            viewFindViewById2.setLayoutParams(layoutParams4);
        }
        View viewFindViewById3 = findViewById(rcc0.f162106J0);
        if (viewFindViewById3 != null) {
            ViewGroup.LayoutParams layoutParams5 = viewFindViewById3.getLayoutParams();
            layoutParams5.width = (int) this.f13023c;
            viewFindViewById3.setLayoutParams(layoutParams5);
        }
        View viewFindViewById4 = findViewById(rcc0.f162195x);
        if (viewFindViewById4 == null || (layoutParams = viewFindViewById4.getLayoutParams()) == null) {
            return;
        }
        layoutParams.width = (int) (this.f13025e + (this.f13023c * 2.0f));
        viewFindViewById4.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: c */
    public void m18809c(int i, Animator.AnimatorListener animatorListener) {
        m18815j();
        float rectHeigth = this.f13036p.getRectHeigth();
        float rectTop = this.f13036p.getRectTop();
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setFloatValues(0.0f, rectHeigth / 2.0f);
        valueAnimator.setDuration(i);
        valueAnimator.setInterpolator(new LinearInterpolator());
        valueAnimator.setRepeatCount(0);
        valueAnimator.addUpdateListener(new C3738c(rectTop, rectHeigth));
        valueAnimator.addListener(new C3739d(rectTop, rectHeigth, animatorListener));
        valueAnimator.start();
    }

    /* JADX INFO: renamed from: d */
    public void m18810d(OcrType ocrType) {
        boolean drawTrapezoid = this.f13036p.getDrawTrapezoid();
        int i = C3740e.f13048a[ocrType.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            if (drawTrapezoid) {
                this.f13036p.setDrawTrapezoid(false);
            }
        } else if ((i == 4 || i == 5) && !drawTrapezoid) {
            this.f13036p.setDrawTrapezoid(true);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m18811f() {
        ValueAnimator valueAnimator = this.f13022b;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            this.f13022b.cancel();
            m18815j();
            this.f13034n = true;
        }
    }

    /* JADX INFO: renamed from: g */
    public void m18812g() {
        this.f13036p.setRectLeft((int) this.f13023c);
        this.f13036p.setRectTop((int) this.f13024d);
        this.f13036p.setRectHeight((int) this.f13026f);
        this.f13036p.setRectWidth((int) this.f13025e);
        this.f13036p.setStrokeWidth((int) this.f13030j);
        this.f13036p.setRectRoundCx((int) this.f13031k);
        this.f13036p.setRectColor(this.f13029i);
        this.f13036p.invalidate();
        View viewFindViewById = findViewById(rcc0.f162114N0);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(500L);
        valueAnimator.setFloatValues(1.0f, 0.0f);
        valueAnimator.setInterpolator(new LinearInterpolator());
        valueAnimator.setRepeatCount(0);
        valueAnimator.addUpdateListener(new C3736a(viewFindViewById));
        valueAnimator.start();
    }

    public float getHoleHeight() {
        return this.f13026f;
    }

    public float getHoleLeft() {
        return this.f13023c;
    }

    public Drawable getHolePicture() {
        return this.f13032l;
    }

    public float getHoleTop() {
        return this.f13024d;
    }

    public float getHoleWidth() {
        return this.f13025e;
    }

    public float getMaskScale() {
        return 0.6405797f;
    }

    /* JADX INFO: renamed from: h */
    public void m18813h(Drawable drawable, boolean z, boolean z2) {
        this.f13032l = drawable;
        ImageView imageView = (ImageView) findViewById(rcc0.f162193w);
        ImageView imageView2 = (ImageView) findViewById(rcc0.f162197y);
        if (imageView != null) {
            int width = getWidth() - ((int) (this.f13023c * 2.0f));
            int i = (int) (width * 0.6405797f);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) imageView.getLayoutParams();
            if (z2) {
                imageView2.setVisibility(0);
                int iM144505a = je00.m144505a(getContext(), 94.0f);
                int i2 = i - iM144505a;
                int i3 = (i2 / 2) - ((int) this.f13023c);
                layoutParams.height = iM144505a;
                layoutParams.width = je00.m144505a(getContext(), 82.0f);
                layoutParams.topMargin = i3;
                layoutParams.leftMargin = (int) this.f13023c;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) imageView2.getLayoutParams();
                int height = (i2 - i3) - (imageView2.getHeight() * 2);
                float f = this.f13023c;
                layoutParams2.width = width - ((int) (2.0f * f));
                layoutParams2.leftMargin = (int) f;
                layoutParams2.rightMargin = (int) f;
                layoutParams2.topMargin = height;
                imageView2.setLayoutParams(layoutParams2);
            } else {
                imageView2.setVisibility(8);
                if (z) {
                    layoutParams.height = je00.m144505a(getContext(), 94.0f);
                    layoutParams.width = je00.m144505a(getContext(), 82.0f);
                    layoutParams.topMargin = (i - je00.m144505a(getContext(), 94.0f)) / 2;
                    layoutParams.leftMargin = (int) ((width - je00.m144505a(getContext(), 82.0f)) - this.f13023c);
                } else {
                    layoutParams.height = je00.m144505a(getContext(), 60.0f);
                    layoutParams.width = je00.m144505a(getContext(), 59.0f);
                    float f2 = this.f13023c;
                    layoutParams.topMargin = (int) f2;
                    layoutParams.leftMargin = ((int) f2) * 2;
                }
            }
            imageView.setLayoutParams(layoutParams);
            imageView.setImageDrawable(drawable);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m18814i() {
        View viewFindViewById;
        ImageView imageView = (ImageView) findViewById(rcc0.f162195x);
        if (imageView == null || (viewFindViewById = findViewById(rcc0.f162110L0)) == null) {
            return;
        }
        imageView.setVisibility(0);
        getResources().getDimension(vac0.f183081d);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f13022b = valueAnimator;
        valueAnimator.setFloatValues(0.0f, this.f13036p.getRectHeigth() + this.f13024d);
        this.f13022b.setRepeatCount(-1);
        this.f13022b.setRepeatMode(1);
        this.f13022b.setInterpolator(new LinearInterpolator());
        this.f13022b.setDuration(1500L);
        this.f13022b.addUpdateListener(new C3737b(viewFindViewById));
        this.f13022b.start();
    }

    /* JADX INFO: renamed from: j */
    public void m18815j() {
        o6r0.m166282b("ScanAnimation", "stopScanAnimation");
        ImageView imageView = (ImageView) findViewById(rcc0.f162195x);
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        View viewFindViewById = findViewById(rcc0.f162110L0);
        if (viewFindViewById != null) {
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            layoutParams.height = 0;
            viewFindViewById.setLayoutParams(layoutParams);
        }
        ValueAnimator valueAnimator = this.f13022b;
        if (valueAnimator == null || !valueAnimator.isStarted()) {
            return;
        }
        this.f13022b.end();
        this.f13022b = null;
    }

    public void setHoleColor(@ColorInt int i) {
        this.f13029i = i;
        this.f13036p.setRectColor(i);
    }

    public void setHoleHCenter(boolean z) {
        this.f13027g = z;
    }

    public void setHoleHeight(float f) {
        this.f13026f = f;
    }

    public void setHoleLeft(float f) {
        this.f13023c = f;
    }

    public void setHoleTop(float f) {
        this.f13024d = f;
    }

    public void setHoleVCenter(boolean z) {
        this.f13028h = z;
    }

    public void setHoleWidth(float f) {
        this.f13025e = f;
    }

    public IdentityScanView(Context context) {
        super(context);
        this.f13021a = 0.6405797f;
        this.f13023c = -1.0f;
        this.f13024d = -1.0f;
        this.f13025e = -1.0f;
        this.f13026f = -1.0f;
        this.f13027g = false;
        this.f13028h = false;
        this.f13029i = -1;
        this.f13030j = 0.0f;
        this.f13031k = 0.0f;
        this.f13032l = null;
        this.f13033m = false;
        this.f13034n = false;
    }
}
