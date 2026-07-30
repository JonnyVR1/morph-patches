package p028v;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import p003l.ekh0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VRelative_Foreground extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public ekh0 f12952a;

    public VRelative_Foreground(Context context) {
        super(context);
        m11674a(context, null, 0);
    }

    /* JADX INFO: renamed from: a */
    public final void m11674a(Context context, AttributeSet attributeSet, int i) {
        ekh0 ekh0Var = new ekh0(this);
        this.f12952a = ekh0Var;
        ekh0Var.m3898h(context, attributeSet, i);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        this.f12952a.m3891a(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f12952a.m3896f();
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f12952a.m3897g();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f12952a.m3892b();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f12952a.m3893c();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f12952a.m3894d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        this.f12952a.m3899i(drawable);
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || this.f12952a.m3895e(drawable);
    }

    public VRelative_Foreground(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m11674a(context, attributeSet, 0);
    }

    public VRelative_Foreground(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m11674a(context, attributeSet, 0);
    }
}
