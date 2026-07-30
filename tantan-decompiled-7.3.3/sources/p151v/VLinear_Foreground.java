package p151v;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import p153l.lsh0;

/* JADX INFO: loaded from: classes3.dex */
public class VLinear_Foreground extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public lsh0 f210062a;

    /* JADX INFO: renamed from: b */
    public StringBuilder f210063b;

    public VLinear_Foreground(Context context) {
        super(context);
        this.f210063b = new StringBuilder();
        m224316a(context, null, 0);
    }

    /* JADX INFO: renamed from: a */
    public final void m224316a(Context context, AttributeSet attributeSet, int i) {
        lsh0 lsh0Var = new lsh0(this);
        this.f210062a = lsh0Var;
        lsh0Var.m155695h(context, attributeSet, i);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        this.f210062a.m155688a(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f210062a.m155693f();
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f210062a.m155694g();
    }

    public String getMeasureLogs() {
        return this.f210063b.toString();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f210062a.m155689b();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        this.f210063b.append("widthMode=" + mode + " widthSize=" + size + " heightMode=" + mode2 + " heightSize=" + size2);
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        this.f210063b.append(" measuredWidth=" + measuredWidth + " measuredHeight=" + measuredHeight);
        this.f210063b.append(SignParameters.NEW_LINE);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f210062a.m155690c();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f210062a.m155691d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        this.f210062a.m155696i(drawable);
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || this.f210062a.m155692e(drawable);
    }

    public VLinear_Foreground(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f210063b = new StringBuilder();
        m224316a(context, attributeSet, 0);
    }

    public VLinear_Foreground(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f210063b = new StringBuilder();
        m224316a(context, attributeSet, 0);
    }
}
