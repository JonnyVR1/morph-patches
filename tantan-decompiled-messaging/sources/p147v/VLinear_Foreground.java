package p147v;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import p149l.ekh0;

/* JADX INFO: loaded from: classes3.dex */
public class VLinear_Foreground extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public ekh0 f209140a;

    /* JADX INFO: renamed from: b */
    public StringBuilder f209141b;

    public VLinear_Foreground(Context context) {
        super(context);
        this.f209141b = new StringBuilder();
        m223070a(context, null, 0);
    }

    /* JADX INFO: renamed from: a */
    public final void m223070a(Context context, AttributeSet attributeSet, int i) {
        ekh0 ekh0Var = new ekh0(this);
        this.f209140a = ekh0Var;
        ekh0Var.m116974h(context, attributeSet, i);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        this.f209140a.m116967a(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f209140a.m116972f();
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f209140a.m116973g();
    }

    public String getMeasureLogs() {
        return this.f209141b.toString();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f209140a.m116968b();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        this.f209141b.append("widthMode=" + mode + " widthSize=" + size + " heightMode=" + mode2 + " heightSize=" + size2);
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        this.f209141b.append(" measuredWidth=" + measuredWidth + " measuredHeight=" + measuredHeight);
        this.f209141b.append(SignParameters.NEW_LINE);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f209140a.m116969c();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f209140a.m116970d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        this.f209140a.m116975i(drawable);
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || this.f209140a.m116971e(drawable);
    }

    public VLinear_Foreground(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f209141b = new StringBuilder();
        m223070a(context, attributeSet, 0);
    }

    public VLinear_Foreground(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f209141b = new StringBuilder();
        m223070a(context, attributeSet, 0);
    }
}
