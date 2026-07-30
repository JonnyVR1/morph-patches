package com.p000p1.mobile.putong.core.p001ui.match.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MatchTransView extends View {

    /* JADX INFO: renamed from: a */
    public int f488a;

    /* JADX INFO: renamed from: b */
    public int f489b;

    /* JADX INFO: renamed from: c */
    public Paint f490c;

    /* JADX INFO: renamed from: d */
    public Paint f491d;

    /* JADX INFO: renamed from: e */
    public Rect f492e;

    /* JADX INFO: renamed from: f */
    public Rect f493f;

    /* JADX INFO: renamed from: g */
    public int f494g;

    /* JADX INFO: renamed from: h */
    public boolean f495h;

    /* JADX INFO: renamed from: i */
    public boolean f496i;

    /* JADX INFO: renamed from: j */
    public int f497j;

    public MatchTransView(Context context) {
        super(context);
        this.f494g = -2302756;
        this.f495h = false;
        this.f496i = false;
        this.f497j = t100.d(1.0f);
        m824a();
    }

    private void setColorAndSize(boolean z) {
        int iD = t100.d(272.0f);
        int i = z ? this.f489b - ((int) (this.f488a / 0.56f)) : 0;
        Rect rect = this.f493f;
        int i2 = this.f489b;
        rect.set(0, i2 - i, this.f488a, i2);
        int i3 = this.f489b;
        this.f492e.set(0, ((i3 - i) - iD) + this.f497j, this.f488a, i3 - i);
        Rect rect2 = this.f492e;
        this.f491d.setShader(new LinearGradient(0.0f, rect2.top - this.f497j, 0.0f, rect2.bottom, new int[]{0, this.f494g}, (float[]) null, Shader.TileMode.REPEAT));
    }

    /* JADX INFO: renamed from: a */
    public final void m824a() {
        this.f491d = new Paint();
        this.f490c = new Paint();
        this.f491d.setAntiAlias(true);
        this.f492e = new Rect();
        this.f493f = new Rect();
        this.f490c.setColor(this.f494g);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f488a <= 0 || this.f489b <= 0) {
            return;
        }
        if (this.f496i) {
            canvas.drawRect(this.f492e, this.f491d);
        }
        if (this.f495h) {
            canvas.drawRect(this.f493f, this.f490c);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        if (this.f489b == size && this.f488a == size2) {
            return;
        }
        this.f489b = View.MeasureSpec.getSize(i2);
        int size3 = View.MeasureSpec.getSize(i);
        this.f488a = size3;
        if (size3 / this.f489b > 0.56f) {
            this.f495h = false;
        } else {
            this.f495h = true;
        }
        this.f496i = true;
        setColorAndSize(this.f495h);
    }

    public void setRenderColor(int i) {
        this.f494g = i;
        this.f490c.setColor(i);
        Rect rect = this.f492e;
        this.f491d.setShader(new LinearGradient(0.0f, rect.top - this.f497j, 0.0f, rect.bottom, new int[]{0, this.f494g}, (float[]) null, Shader.TileMode.REPEAT));
        invalidate();
    }

    public MatchTransView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f494g = -2302756;
        this.f495h = false;
        this.f496i = false;
        this.f497j = t100.d(1.0f);
        m824a();
    }

    public MatchTransView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f494g = -2302756;
        this.f495h = false;
        this.f496i = false;
        this.f497j = t100.d(1.0f);
        m824a();
    }
}
