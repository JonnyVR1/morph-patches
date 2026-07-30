package p147v;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import p149l.ekh0;

/* JADX INFO: loaded from: classes3.dex */
public class VRelative_Foreground extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public ekh0 f209327a;

    public VRelative_Foreground(Context context) {
        super(context);
        m223191a(context, null, 0);
    }

    /* JADX INFO: renamed from: a */
    public final void m223191a(Context context, AttributeSet attributeSet, int i) {
        ekh0 ekh0Var = new ekh0(this);
        this.f209327a = ekh0Var;
        ekh0Var.m116974h(context, attributeSet, i);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        this.f209327a.m116967a(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f209327a.m116972f();
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f209327a.m116973g();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f209327a.m116968b();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f209327a.m116969c();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f209327a.m116970d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        this.f209327a.m116975i(drawable);
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || this.f209327a.m116971e(drawable);
    }

    public VRelative_Foreground(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m223191a(context, attributeSet, 0);
    }

    public VRelative_Foreground(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m223191a(context, attributeSet, 0);
    }
}
