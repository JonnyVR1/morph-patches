package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.Animation;
import android.widget.ImageView;
import p153l.fic0;
import p153l.kkl0;

/* JADX INFO: loaded from: classes.dex */
class CircleImageView extends ImageView {

    /* JADX INFO: renamed from: a */
    public Animation.AnimationListener f3121a;

    /* JADX INFO: renamed from: b */
    public int f3122b;

    /* JADX INFO: renamed from: c */
    public int f3123c;

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.CircleImageView$a */
    public static class C0691a extends OvalShape {

        /* JADX INFO: renamed from: a */
        public Paint f3124a = new Paint();

        /* JADX INFO: renamed from: b */
        public int f3125b;

        /* JADX INFO: renamed from: c */
        public CircleImageView f3126c;

        public C0691a(CircleImageView circleImageView, int i) {
            this.f3126c = circleImageView;
            this.f3125b = i;
            m4071a((int) rect().width());
        }

        /* JADX INFO: renamed from: a */
        public final void m4071a(int i) {
            float f = i / 2;
            this.f3124a.setShader(new RadialGradient(f, f, this.f3125b, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP));
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            int width = this.f3126c.getWidth() / 2;
            float f = width;
            float height = this.f3126c.getHeight() / 2;
            canvas.drawCircle(f, height, f, this.f3124a);
            canvas.drawCircle(f, height, width - this.f3125b, paint);
        }

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void onResize(float f, float f2) {
            super.onResize(f, f2);
            m4071a((int) f);
        }
    }

    public CircleImageView(Context context) {
        ShapeDrawable shapeDrawable;
        super(context);
        float f = getContext().getResources().getDisplayMetrics().density;
        int i = (int) (1.75f * f);
        int i2 = (int) (0.0f * f);
        this.f3122b = (int) (3.5f * f);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(fic0.f99176a);
        this.f3123c = typedArrayObtainStyledAttributes.getColor(fic0.f99177b, -328966);
        typedArrayObtainStyledAttributes.recycle();
        if (m4069a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            kkl0.m150178q0(this, f * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new C0691a(this, this.f3122b));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer(this.f3122b, i2, i, 503316480);
            int i3 = this.f3122b;
            setPadding(i3, i3, i3, i3);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(this.f3123c);
        kkl0.m150170m0(this, shapeDrawable);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m4069a() {
        return true;
    }

    /* JADX INFO: renamed from: b */
    public void m4070b(Animation.AnimationListener animationListener) {
        this.f3121a = animationListener;
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f3121a;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f3121a;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (m4069a()) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth() + (this.f3122b * 2), getMeasuredHeight() + (this.f3122b * 2));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
            this.f3123c = i;
        }
    }
}
