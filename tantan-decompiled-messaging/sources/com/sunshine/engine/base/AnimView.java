package com.sunshine.engine.base;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.sunshine.engine.base.AbstractC13502s;
import p149l.haj;
import p149l.xsi0;

/* JADX INFO: loaded from: classes13.dex */
public abstract class AnimView<T extends AbstractC13502s> extends View {

    /* JADX INFO: renamed from: a */
    protected T f55651a;

    /* JADX INFO: renamed from: b */
    private long f55652b;

    public AnimView(Context context) {
        super(context);
        this.f55651a = (T) mo80915a();
        this.f55652b = -1L;
    }

    /* JADX INFO: renamed from: a */
    public abstract T mo80915a();

    /* JADX INFO: renamed from: b */
    public AnimView m80916b(boolean z) {
        T t = this.f55651a.f55685e;
        if (t != 0) {
            t.f55670r = z;
        }
        return this;
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo80917c(int i, int i2);

    /* JADX INFO: renamed from: d */
    public boolean m80918d(String... strArr) {
        return this.f55651a.m80979n(this, strArr);
    }

    /* JADX INFO: renamed from: e */
    public void m80919e() {
        this.f55651a.mo80972e();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f55651a.m80975i(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f55651a.m80980p(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        T t = this.f55651a.f55685e;
        if (t != 0 && t.f55676x.size() > 0) {
            if (motionEvent.getAction() == 0) {
                this.f55652b = xsi0.m210767h();
            } else if (motionEvent.getAction() == 1 && xsi0.m210767h() - this.f55652b < 200) {
                mo80917c((int) motionEvent.getX(), (int) motionEvent.getY());
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOnError(haj<String> hajVar) {
        this.f55651a.m80981q(hajVar);
    }

    public AnimView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f55651a = (T) mo80915a();
        this.f55652b = -1L;
    }

    public AnimView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f55651a = (T) mo80915a();
        this.f55652b = -1L;
    }
}
