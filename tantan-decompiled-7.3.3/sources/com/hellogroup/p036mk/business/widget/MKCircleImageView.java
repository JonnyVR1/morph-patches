package com.hellogroup.p036mk.business.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.Animation;
import androidx.appcompat.widget.AppCompatImageView;
import p153l.j26;
import p153l.kkl0;

/* JADX INFO: loaded from: classes7.dex */
public class MKCircleImageView extends AppCompatImageView {

    /* JADX INFO: renamed from: c */
    private Animation.AnimationListener f12340c;

    /* JADX INFO: renamed from: d */
    int f12341d;

    /* JADX INFO: renamed from: com.hellogroup.mk.business.widget.MKCircleImageView$a */
    public class C3572a extends OvalShape {

        /* JADX INFO: renamed from: a */
        private RadialGradient f12342a;

        /* JADX INFO: renamed from: b */
        private Paint f12343b = new Paint();

        public C3572a(int i) {
            MKCircleImageView.this.f12341d = i;
            m18269a((int) rect().width());
        }

        /* JADX INFO: renamed from: a */
        private void m18269a(int i) {
            float f = i / 2;
            RadialGradient radialGradient = new RadialGradient(f, f, MKCircleImageView.this.f12341d, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP);
            this.f12342a = radialGradient;
            this.f12343b.setShader(radialGradient);
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            int width = MKCircleImageView.this.getWidth() / 2;
            float f = width;
            float height = MKCircleImageView.this.getHeight() / 2;
            canvas.drawCircle(f, height, f, this.f12343b);
            canvas.drawCircle(f, height, width - MKCircleImageView.this.f12341d, paint);
        }

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void onResize(float f, float f2) {
            super.onResize(f, f2);
            m18269a((int) f);
        }
    }

    public MKCircleImageView(Context context, int i) {
        ShapeDrawable shapeDrawable;
        super(context);
        float f = getContext().getResources().getDisplayMetrics().density;
        int i2 = (int) (1.75f * f);
        int i3 = (int) (0.0f * f);
        this.f12341d = (int) (3.5f * f);
        if (m18268d()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            kkl0.m150178q0(this, f * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new C3572a(this.f12341d));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer(this.f12341d, i3, i2, 503316480);
            int i4 = this.f12341d;
            setPadding(i4, i4, i4, i4);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(i);
        kkl0.m150170m0(this, shapeDrawable);
    }

    /* JADX INFO: renamed from: d */
    private boolean m18268d() {
        return true;
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f12340c;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f12340c;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (m18268d()) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth() + (this.f12341d * 2), getMeasuredHeight() + (this.f12341d * 2));
    }

    public void setAnimationListener(Animation.AnimationListener animationListener) {
        this.f12340c = animationListener;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
        }
    }

    public void setBackgroundColorRes(int i) {
        setBackgroundColor(j26.m143190c(getContext(), i));
    }
}
