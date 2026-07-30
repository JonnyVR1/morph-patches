package com.sunshine.engine.base;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.sunshine.engine.base.AbstractC13665s;
import p153l.a2j0;
import p153l.bdj;

/* JADX INFO: loaded from: classes11.dex */
public abstract class AnimView<T extends AbstractC13665s> extends View {

    /* JADX INFO: renamed from: a */
    protected T f56499a;

    /* JADX INFO: renamed from: b */
    private long f56500b;

    public AnimView(Context context) {
        super(context);
        this.f56499a = (T) mo82098a();
        this.f56500b = -1L;
    }

    /* JADX INFO: renamed from: a */
    public abstract T mo82098a();

    /* JADX INFO: renamed from: b */
    public AnimView m82099b(boolean z) {
        T t = this.f56499a.f56533e;
        if (t != 0) {
            t.f56518r = z;
        }
        return this;
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo82100c(int i, int i2);

    /* JADX INFO: renamed from: d */
    public boolean m82101d(String... strArr) {
        return this.f56499a.m82162n(this, strArr);
    }

    /* JADX INFO: renamed from: e */
    public void m82102e() {
        this.f56499a.mo82155e();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f56499a.m82158i(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f56499a.m82163p(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        T t = this.f56499a.f56533e;
        if (t != 0 && t.f56524x.size() > 0) {
            if (motionEvent.getAction() == 0) {
                this.f56500b = a2j0.m95705h();
            } else if (motionEvent.getAction() == 1 && a2j0.m95705h() - this.f56500b < 200) {
                mo82100c((int) motionEvent.getX(), (int) motionEvent.getY());
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOnError(bdj<String> bdjVar) {
        this.f56499a.m82164q(bdjVar);
    }

    public AnimView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f56499a = (T) mo82098a();
        this.f56500b = -1L;
    }

    public AnimView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f56499a = (T) mo82098a();
        this.f56500b = -1L;
    }
}
