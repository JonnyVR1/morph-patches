package p028v;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import p003l.ekh0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VLinear_Foreground extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public ekh0 f12765a;

    /* JADX INFO: renamed from: b */
    public StringBuilder f12766b;

    public VLinear_Foreground(Context context) {
        super(context);
        this.f12766b = new StringBuilder();
        m11550a(context, null, 0);
    }

    /* JADX INFO: renamed from: a */
    public final void m11550a(Context context, AttributeSet attributeSet, int i) {
        ekh0 ekh0Var = new ekh0(this);
        this.f12765a = ekh0Var;
        ekh0Var.m3898h(context, attributeSet, i);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        this.f12765a.m3891a(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f12765a.m3896f();
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f12765a.m3897g();
    }

    public String getMeasureLogs() {
        return this.f12766b.toString();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f12765a.m3892b();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        this.f12766b.append("widthMode=" + mode + " widthSize=" + size + " heightMode=" + mode2 + " heightSize=" + size2);
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        this.f12766b.append(" measuredWidth=" + measuredWidth + " measuredHeight=" + measuredHeight);
        this.f12766b.append("\n");
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f12765a.m3893c();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f12765a.m3894d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        this.f12765a.m3899i(drawable);
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || this.f12765a.m3895e(drawable);
    }

    public VLinear_Foreground(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12766b = new StringBuilder();
        m11550a(context, attributeSet, 0);
    }

    public VLinear_Foreground(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12766b = new StringBuilder();
        m11550a(context, attributeSet, 0);
    }
}
