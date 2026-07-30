package com.p046p1.mobile.putong.core.p053ui.match.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import p149l.t100;

/* JADX INFO: loaded from: classes3.dex */
public class MatchTransView extends View {

    /* JADX INFO: renamed from: a */
    public int f30597a;

    /* JADX INFO: renamed from: b */
    public int f30598b;

    /* JADX INFO: renamed from: c */
    public Paint f30599c;

    /* JADX INFO: renamed from: d */
    public Paint f30600d;

    /* JADX INFO: renamed from: e */
    public Rect f30601e;

    /* JADX INFO: renamed from: f */
    public Rect f30602f;

    /* JADX INFO: renamed from: g */
    public int f30603g;

    /* JADX INFO: renamed from: h */
    public boolean f30604h;

    /* JADX INFO: renamed from: i */
    public boolean f30605i;

    /* JADX INFO: renamed from: j */
    public int f30606j;

    public MatchTransView(Context context) {
        super(context);
        this.f30603g = -2302756;
        this.f30604h = false;
        this.f30605i = false;
        this.f30606j = t100.m186890d(1.0f);
        m47760a();
    }

    private void setColorAndSize(boolean z) {
        int iM186890d = t100.m186890d(272.0f);
        int i = z ? this.f30598b - ((int) (this.f30597a / 0.56f)) : 0;
        Rect rect = this.f30602f;
        int i2 = this.f30598b;
        rect.set(0, i2 - i, this.f30597a, i2);
        int i3 = this.f30598b;
        this.f30601e.set(0, ((i3 - i) - iM186890d) + this.f30606j, this.f30597a, i3 - i);
        Rect rect2 = this.f30601e;
        this.f30600d.setShader(new LinearGradient(0.0f, rect2.top - this.f30606j, 0.0f, rect2.bottom, new int[]{0, this.f30603g}, (float[]) null, Shader.TileMode.REPEAT));
    }

    /* JADX INFO: renamed from: a */
    public final void m47760a() {
        this.f30600d = new Paint();
        this.f30599c = new Paint();
        this.f30600d.setAntiAlias(true);
        this.f30601e = new Rect();
        this.f30602f = new Rect();
        this.f30599c.setColor(this.f30603g);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f30597a <= 0 || this.f30598b <= 0) {
            return;
        }
        if (this.f30605i) {
            canvas.drawRect(this.f30601e, this.f30600d);
        }
        if (this.f30604h) {
            canvas.drawRect(this.f30602f, this.f30599c);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        if (this.f30598b == size && this.f30597a == size2) {
            return;
        }
        this.f30598b = View.MeasureSpec.getSize(i2);
        int size3 = View.MeasureSpec.getSize(i);
        this.f30597a = size3;
        if (size3 / this.f30598b > 0.56f) {
            this.f30604h = false;
        } else {
            this.f30604h = true;
        }
        this.f30605i = true;
        setColorAndSize(this.f30604h);
    }

    public void setRenderColor(int i) {
        this.f30603g = i;
        this.f30599c.setColor(i);
        Rect rect = this.f30601e;
        this.f30600d.setShader(new LinearGradient(0.0f, rect.top - this.f30606j, 0.0f, rect.bottom, new int[]{0, this.f30603g}, (float[]) null, Shader.TileMode.REPEAT));
        invalidate();
    }

    public MatchTransView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30603g = -2302756;
        this.f30604h = false;
        this.f30605i = false;
        this.f30606j = t100.m186890d(1.0f);
        m47760a();
    }

    public MatchTransView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30603g = -2302756;
        this.f30604h = false;
        this.f30605i = false;
        this.f30606j = t100.m186890d(1.0f);
        m47760a();
    }
}
