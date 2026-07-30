package p151v;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import p153l.lsh0;

/* JADX INFO: loaded from: classes3.dex */
public class VRelative_Foreground extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public lsh0 f210249a;

    public VRelative_Foreground(Context context) {
        super(context);
        m224437a(context, null, 0);
    }

    /* JADX INFO: renamed from: a */
    public final void m224437a(Context context, AttributeSet attributeSet, int i) {
        lsh0 lsh0Var = new lsh0(this);
        this.f210249a = lsh0Var;
        lsh0Var.m155695h(context, attributeSet, i);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        this.f210249a.m155688a(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f210249a.m155693f();
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f210249a.m155694g();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f210249a.m155689b();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f210249a.m155690c();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f210249a.m155691d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        this.f210249a.m155696i(drawable);
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || this.f210249a.m155692e(drawable);
    }

    public VRelative_Foreground(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m224437a(context, attributeSet, 0);
    }

    public VRelative_Foreground(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m224437a(context, attributeSet, 0);
    }
}
