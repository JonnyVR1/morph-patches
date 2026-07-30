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
import p149l.ixq0;
import p149l.k4c0;
import p149l.n2c0;
import p149l.x5c0;
import p149l.y8c0;
import p149l.z500;

/* JADX INFO: loaded from: classes7.dex */
public class IdentityScanView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    private final float f12280a;

    /* JADX INFO: renamed from: b */
    private ValueAnimator f12281b;

    /* JADX INFO: renamed from: c */
    private float f12282c;

    /* JADX INFO: renamed from: d */
    private float f12283d;

    /* JADX INFO: renamed from: e */
    private float f12284e;

    /* JADX INFO: renamed from: f */
    private float f12285f;

    /* JADX INFO: renamed from: g */
    private boolean f12286g;

    /* JADX INFO: renamed from: h */
    private boolean f12287h;

    /* JADX INFO: renamed from: i */
    private int f12288i;

    /* JADX INFO: renamed from: j */
    private float f12289j;

    /* JADX INFO: renamed from: k */
    private float f12290k;

    /* JADX INFO: renamed from: l */
    private Drawable f12291l;

    /* JADX INFO: renamed from: m */
    private boolean f12292m;

    /* JADX INFO: renamed from: n */
    private boolean f12293n;

    /* JADX INFO: renamed from: o */
    private View f12294o;

    /* JADX INFO: renamed from: p */
    private RectMaskView f12295p;

    /* JADX INFO: renamed from: com.idv.identity.ocr.IdentityScanView$a */
    public class C3577a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ View f12296a;

        public C3577a(View view) {
            this.f12296a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            View view = this.f12296a;
            if (view != null) {
                view.setAlpha(fFloatValue);
            }
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.IdentityScanView$b */
    public class C3578b implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ View f12298a;

        public C3578b(View view) {
            this.f12298a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ViewGroup.LayoutParams layoutParams = this.f12298a.getLayoutParams();
            layoutParams.height = (int) fFloatValue;
            this.f12298a.setLayoutParams(layoutParams);
            this.f12298a.requestLayout();
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.IdentityScanView$c */
    public class C3579c implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ float f12300a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ float f12301b;

        public C3579c(float f, float f2) {
            this.f12300a = f;
            this.f12301b = f2;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            IdentityScanView.this.f12295p.setRectTop((int) (this.f12300a + fFloatValue));
            int i = (int) (this.f12301b - (fFloatValue * 2.0f));
            if (i < 0) {
                i = 0;
            }
            IdentityScanView.this.f12295p.setRectHeight(i);
            IdentityScanView.this.f12295p.invalidate();
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.IdentityScanView$d */
    public class C3580d implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ float f12303a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ float f12304b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Animator.AnimatorListener f12305c;

        public C3580d(float f, float f2, Animator.AnimatorListener animatorListener) {
            this.f12303a = f;
            this.f12304b = f2;
            this.f12305c = animatorListener;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            Animator.AnimatorListener animatorListener = this.f12305c;
            if (animatorListener != null) {
                animatorListener.onAnimationCancel(animator);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ixq0.m138884a("眨眼动画结束...");
            IdentityScanView.this.f12295p.setRectTop((int) this.f12303a);
            IdentityScanView.this.f12295p.setRectHeight((int) this.f12304b);
            IdentityScanView.this.invalidate();
            Animator.AnimatorListener animatorListener = this.f12305c;
            if (animatorListener != null) {
                animatorListener.onAnimationEnd(animator);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            Animator.AnimatorListener animatorListener = this.f12305c;
            if (animatorListener != null) {
                animatorListener.onAnimationRepeat(animator);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ixq0.m138884a("眨眼动画开始...");
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.ocr.IdentityScanView$e */
    public static /* synthetic */ class C3581e {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f12307a;

        static {
            int[] iArr = new int[OcrType.values().length];
            f12307a = iArr;
            try {
                iArr[OcrType.OT_PHOTO_FRONT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12307a[OcrType.OT_PHOTO_BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12307a[OcrType.OT_PHOTO_THIRD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12307a[OcrType.OT_PHOTO_BACK_3D.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12307a[OcrType.OT_PHOTO_FRONT_3D.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public IdentityScanView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12280a = 0.6405797f;
        this.f12282c = -1.0f;
        this.f12283d = -1.0f;
        this.f12284e = -1.0f;
        this.f12285f = -1.0f;
        this.f12286g = false;
        this.f12287h = false;
        this.f12288i = -1;
        this.f12289j = 0.0f;
        this.f12290k = 0.0f;
        this.f12291l = null;
        this.f12292m = false;
        this.f12293n = false;
        LayoutInflater.from(context).inflate(x5c0.f191124l, this);
        m17730e(context, attributeSet);
    }

    /* JADX INFO: renamed from: e */
    private void m17730e(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y8c0.f196802h);
        if (typedArrayObtainStyledAttributes != null) {
            this.f12282c = typedArrayObtainStyledAttributes.getDimension(y8c0.f196806l, 0.0f);
            this.f12283d = typedArrayObtainStyledAttributes.getDimension(y8c0.f196811q, 0.0f);
            this.f12284e = typedArrayObtainStyledAttributes.getDimension(y8c0.f196813s, 0.0f);
            this.f12285f = typedArrayObtainStyledAttributes.getDimension(y8c0.f196805k, 0.0f);
            this.f12286g = typedArrayObtainStyledAttributes.getBoolean(y8c0.f196804j, false);
            this.f12287h = typedArrayObtainStyledAttributes.getBoolean(y8c0.f196812r, false);
            this.f12288i = typedArrayObtainStyledAttributes.getColor(y8c0.f196808n, -1);
            this.f12289j = typedArrayObtainStyledAttributes.getDimension(y8c0.f196810p, 0.0f);
            this.f12290k = typedArrayObtainStyledAttributes.getDimension(y8c0.f196809o, 0.0f);
            this.f12291l = typedArrayObtainStyledAttributes.getDrawable(y8c0.f196807m);
            this.f12292m = typedArrayObtainStyledAttributes.getBoolean(y8c0.f196803i, false);
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f12294o = findViewById(k4c0.f120989K0);
        RectMaskView rectMaskView = (RectMaskView) findViewById(k4c0.f120993M0);
        this.f12295p = rectMaskView;
        rectMaskView.setRectLeft(this.f12282c);
        this.f12295p.setRectTop((int) this.f12283d);
        this.f12295p.setRectHeight((int) this.f12285f);
        this.f12295p.setRectWidth((int) this.f12284e);
        this.f12295p.setStrokeWidth((int) this.f12289j);
        this.f12295p.setRectRoundCx((int) this.f12290k);
        this.f12295p.setRectColor(this.f12288i);
        ImageView imageView = (ImageView) findViewById(k4c0.f121076x);
        if (this.f12292m) {
            return;
        }
        imageView.setVisibility(4);
    }

    /* JADX INFO: renamed from: b */
    public void m17731b() {
        ViewGroup.LayoutParams layoutParams;
        ImageView imageView = (ImageView) findViewById(k4c0.f121074w);
        if (imageView != null) {
            imageView.setImageDrawable(this.f12291l);
            int width = getWidth() - ((int) (this.f12282c * 2.0f));
            float f = width;
            int i = (int) (0.6405797f * f);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams2.height = z500.m217269a(getContext(), 94.0f);
            layoutParams2.width = z500.m217269a(getContext(), 82.0f);
            layoutParams2.topMargin = (i - z500.m217269a(getContext(), 94.0f)) / 2;
            layoutParams2.leftMargin = (int) ((width - z500.m217269a(getContext(), 82.0f)) - this.f12282c);
            imageView.setLayoutParams(layoutParams2);
            Log.e("autoLayout", "imgFrontCardW:" + width + ",imgFrontCardH:" + i + "   layoutParams.height:" + layoutParams2.height + "  layoutParams.width:" + layoutParams2.width + " layoutParams.topMargin:" + layoutParams2.topMargin + "  layoutParams.leftMargin:" + layoutParams2.leftMargin);
            this.f12284e = f;
            this.f12285f = (float) i;
        }
        View viewFindViewById = findViewById(k4c0.f120989K0);
        if (viewFindViewById != null) {
            ViewGroup.LayoutParams layoutParams3 = viewFindViewById.getLayoutParams();
            layoutParams3.height = (int) this.f12283d;
            viewFindViewById.setLayoutParams(layoutParams3);
        }
        View viewFindViewById2 = findViewById(k4c0.f120985I0);
        if (viewFindViewById2 != null) {
            ViewGroup.LayoutParams layoutParams4 = viewFindViewById2.getLayoutParams();
            layoutParams4.width = (int) this.f12282c;
            viewFindViewById2.setLayoutParams(layoutParams4);
        }
        View viewFindViewById3 = findViewById(k4c0.f120987J0);
        if (viewFindViewById3 != null) {
            ViewGroup.LayoutParams layoutParams5 = viewFindViewById3.getLayoutParams();
            layoutParams5.width = (int) this.f12282c;
            viewFindViewById3.setLayoutParams(layoutParams5);
        }
        View viewFindViewById4 = findViewById(k4c0.f121076x);
        if (viewFindViewById4 == null || (layoutParams = viewFindViewById4.getLayoutParams()) == null) {
            return;
        }
        layoutParams.width = (int) (this.f12284e + (this.f12282c * 2.0f));
        viewFindViewById4.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: c */
    public void m17732c(int i, Animator.AnimatorListener animatorListener) {
        m17738j();
        float rectHeigth = this.f12295p.getRectHeigth();
        float rectTop = this.f12295p.getRectTop();
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setFloatValues(0.0f, rectHeigth / 2.0f);
        valueAnimator.setDuration(i);
        valueAnimator.setInterpolator(new LinearInterpolator());
        valueAnimator.setRepeatCount(0);
        valueAnimator.addUpdateListener(new C3579c(rectTop, rectHeigth));
        valueAnimator.addListener(new C3580d(rectTop, rectHeigth, animatorListener));
        valueAnimator.start();
    }

    /* JADX INFO: renamed from: d */
    public void m17733d(OcrType ocrType) {
        boolean drawTrapezoid = this.f12295p.getDrawTrapezoid();
        int i = C3581e.f12307a[ocrType.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            if (drawTrapezoid) {
                this.f12295p.setDrawTrapezoid(false);
            }
        } else if ((i == 4 || i == 5) && !drawTrapezoid) {
            this.f12295p.setDrawTrapezoid(true);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m17734f() {
        ValueAnimator valueAnimator = this.f12281b;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            this.f12281b.cancel();
            m17738j();
            this.f12293n = true;
        }
    }

    /* JADX INFO: renamed from: g */
    public void m17735g() {
        this.f12295p.setRectLeft((int) this.f12282c);
        this.f12295p.setRectTop((int) this.f12283d);
        this.f12295p.setRectHeight((int) this.f12285f);
        this.f12295p.setRectWidth((int) this.f12284e);
        this.f12295p.setStrokeWidth((int) this.f12289j);
        this.f12295p.setRectRoundCx((int) this.f12290k);
        this.f12295p.setRectColor(this.f12288i);
        this.f12295p.invalidate();
        View viewFindViewById = findViewById(k4c0.f120995N0);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(500L);
        valueAnimator.setFloatValues(1.0f, 0.0f);
        valueAnimator.setInterpolator(new LinearInterpolator());
        valueAnimator.setRepeatCount(0);
        valueAnimator.addUpdateListener(new C3577a(viewFindViewById));
        valueAnimator.start();
    }

    public float getHoleHeight() {
        return this.f12285f;
    }

    public float getHoleLeft() {
        return this.f12282c;
    }

    public Drawable getHolePicture() {
        return this.f12291l;
    }

    public float getHoleTop() {
        return this.f12283d;
    }

    public float getHoleWidth() {
        return this.f12284e;
    }

    public float getMaskScale() {
        return 0.6405797f;
    }

    /* JADX INFO: renamed from: h */
    public void m17736h(Drawable drawable, boolean z, boolean z2) {
        this.f12291l = drawable;
        ImageView imageView = (ImageView) findViewById(k4c0.f121074w);
        ImageView imageView2 = (ImageView) findViewById(k4c0.f121078y);
        if (imageView != null) {
            int width = getWidth() - ((int) (this.f12282c * 2.0f));
            int i = (int) (width * 0.6405797f);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) imageView.getLayoutParams();
            if (z2) {
                imageView2.setVisibility(0);
                int iM217269a = z500.m217269a(getContext(), 94.0f);
                int i2 = i - iM217269a;
                int i3 = (i2 / 2) - ((int) this.f12282c);
                layoutParams.height = iM217269a;
                layoutParams.width = z500.m217269a(getContext(), 82.0f);
                layoutParams.topMargin = i3;
                layoutParams.leftMargin = (int) this.f12282c;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) imageView2.getLayoutParams();
                int height = (i2 - i3) - (imageView2.getHeight() * 2);
                float f = this.f12282c;
                layoutParams2.width = width - ((int) (2.0f * f));
                layoutParams2.leftMargin = (int) f;
                layoutParams2.rightMargin = (int) f;
                layoutParams2.topMargin = height;
                imageView2.setLayoutParams(layoutParams2);
            } else {
                imageView2.setVisibility(8);
                if (z) {
                    layoutParams.height = z500.m217269a(getContext(), 94.0f);
                    layoutParams.width = z500.m217269a(getContext(), 82.0f);
                    layoutParams.topMargin = (i - z500.m217269a(getContext(), 94.0f)) / 2;
                    layoutParams.leftMargin = (int) ((width - z500.m217269a(getContext(), 82.0f)) - this.f12282c);
                } else {
                    layoutParams.height = z500.m217269a(getContext(), 60.0f);
                    layoutParams.width = z500.m217269a(getContext(), 59.0f);
                    float f2 = this.f12282c;
                    layoutParams.topMargin = (int) f2;
                    layoutParams.leftMargin = ((int) f2) * 2;
                }
            }
            imageView.setLayoutParams(layoutParams);
            imageView.setImageDrawable(drawable);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m17737i() {
        View viewFindViewById;
        ImageView imageView = (ImageView) findViewById(k4c0.f121076x);
        if (imageView == null || (viewFindViewById = findViewById(k4c0.f120991L0)) == null) {
            return;
        }
        imageView.setVisibility(0);
        getResources().getDimension(n2c0.f136786d);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f12281b = valueAnimator;
        valueAnimator.setFloatValues(0.0f, this.f12295p.getRectHeigth() + this.f12283d);
        this.f12281b.setRepeatCount(-1);
        this.f12281b.setRepeatMode(1);
        this.f12281b.setInterpolator(new LinearInterpolator());
        this.f12281b.setDuration(1500L);
        this.f12281b.addUpdateListener(new C3578b(viewFindViewById));
        this.f12281b.start();
    }

    /* JADX INFO: renamed from: j */
    public void m17738j() {
        ixq0.m138885b("ScanAnimation", "stopScanAnimation");
        ImageView imageView = (ImageView) findViewById(k4c0.f121076x);
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        View viewFindViewById = findViewById(k4c0.f120991L0);
        if (viewFindViewById != null) {
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            layoutParams.height = 0;
            viewFindViewById.setLayoutParams(layoutParams);
        }
        ValueAnimator valueAnimator = this.f12281b;
        if (valueAnimator == null || !valueAnimator.isStarted()) {
            return;
        }
        this.f12281b.end();
        this.f12281b = null;
    }

    public void setHoleColor(@ColorInt int i) {
        this.f12288i = i;
        this.f12295p.setRectColor(i);
    }

    public void setHoleHCenter(boolean z) {
        this.f12286g = z;
    }

    public void setHoleHeight(float f) {
        this.f12285f = f;
    }

    public void setHoleLeft(float f) {
        this.f12282c = f;
    }

    public void setHoleTop(float f) {
        this.f12283d = f;
    }

    public void setHoleVCenter(boolean z) {
        this.f12287h = z;
    }

    public void setHoleWidth(float f) {
        this.f12284e = f;
    }

    public IdentityScanView(Context context) {
        super(context);
        this.f12280a = 0.6405797f;
        this.f12282c = -1.0f;
        this.f12283d = -1.0f;
        this.f12284e = -1.0f;
        this.f12285f = -1.0f;
        this.f12286g = false;
        this.f12287h = false;
        this.f12288i = -1;
        this.f12289j = 0.0f;
        this.f12290k = 0.0f;
        this.f12291l = null;
        this.f12292m = false;
        this.f12293n = false;
    }
}
