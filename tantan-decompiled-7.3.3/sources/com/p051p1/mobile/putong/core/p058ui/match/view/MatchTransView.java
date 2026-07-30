package com.p051p1.mobile.putong.core.p058ui.match.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import p153l.qa00;

/* JADX INFO: loaded from: classes3.dex */
public class MatchTransView extends View {

    /* JADX INFO: renamed from: a */
    public int f31445a;

    /* JADX INFO: renamed from: b */
    public int f31446b;

    /* JADX INFO: renamed from: c */
    public Paint f31447c;

    /* JADX INFO: renamed from: d */
    public Paint f31448d;

    /* JADX INFO: renamed from: e */
    public Rect f31449e;

    /* JADX INFO: renamed from: f */
    public Rect f31450f;

    /* JADX INFO: renamed from: g */
    public int f31451g;

    /* JADX INFO: renamed from: h */
    public boolean f31452h;

    /* JADX INFO: renamed from: i */
    public boolean f31453i;

    /* JADX INFO: renamed from: j */
    public int f31454j;

    public MatchTransView(Context context) {
        super(context);
        this.f31451g = -2302756;
        this.f31452h = false;
        this.f31453i = false;
        this.f31454j = qa00.m175859d(1.0f);
        m48943a();
    }

    private void setColorAndSize(boolean z) {
        int iM175859d = qa00.m175859d(272.0f);
        int i = z ? this.f31446b - ((int) (this.f31445a / 0.56f)) : 0;
        Rect rect = this.f31450f;
        int i2 = this.f31446b;
        rect.set(0, i2 - i, this.f31445a, i2);
        int i3 = this.f31446b;
        this.f31449e.set(0, ((i3 - i) - iM175859d) + this.f31454j, this.f31445a, i3 - i);
        Rect rect2 = this.f31449e;
        this.f31448d.setShader(new LinearGradient(0.0f, rect2.top - this.f31454j, 0.0f, rect2.bottom, new int[]{0, this.f31451g}, (float[]) null, Shader.TileMode.REPEAT));
    }

    /* JADX INFO: renamed from: a */
    public final void m48943a() {
        this.f31448d = new Paint();
        this.f31447c = new Paint();
        this.f31448d.setAntiAlias(true);
        this.f31449e = new Rect();
        this.f31450f = new Rect();
        this.f31447c.setColor(this.f31451g);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f31445a <= 0 || this.f31446b <= 0) {
            return;
        }
        if (this.f31453i) {
            canvas.drawRect(this.f31449e, this.f31448d);
        }
        if (this.f31452h) {
            canvas.drawRect(this.f31450f, this.f31447c);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        if (this.f31446b == size && this.f31445a == size2) {
            return;
        }
        this.f31446b = View.MeasureSpec.getSize(i2);
        int size3 = View.MeasureSpec.getSize(i);
        this.f31445a = size3;
        if (size3 / this.f31446b > 0.56f) {
            this.f31452h = false;
        } else {
            this.f31452h = true;
        }
        this.f31453i = true;
        setColorAndSize(this.f31452h);
    }

    public void setRenderColor(int i) {
        this.f31451g = i;
        this.f31447c.setColor(i);
        Rect rect = this.f31449e;
        this.f31448d.setShader(new LinearGradient(0.0f, rect.top - this.f31454j, 0.0f, rect.bottom, new int[]{0, this.f31451g}, (float[]) null, Shader.TileMode.REPEAT));
        invalidate();
    }

    public MatchTransView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31451g = -2302756;
        this.f31452h = false;
        this.f31453i = false;
        this.f31454j = qa00.m175859d(1.0f);
        m48943a();
    }

    public MatchTransView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31451g = -2302756;
        this.f31452h = false;
        this.f31453i = false;
        this.f31454j = qa00.m175859d(1.0f);
        m48943a();
    }
}
