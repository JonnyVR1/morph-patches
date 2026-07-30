package com.immomo.velib.anim.path;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import p153l.dj60;

/* JADX INFO: loaded from: classes7.dex */
public class PathView extends View {

    /* JADX INFO: renamed from: a */
    List<Path> f14858a;

    /* JADX INFO: renamed from: b */
    List<dj60> f14859b;

    /* JADX INFO: renamed from: c */
    Paint f14860c;

    /* JADX INFO: renamed from: d */
    dj60 f14861d;

    public PathView(Context context) {
        super(context);
        this.f14858a = new ArrayList();
        this.f14859b = new ArrayList();
        m20518a();
    }

    /* JADX INFO: renamed from: a */
    private void m20518a() {
        Paint paint = new Paint(1);
        this.f14860c = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f14860c.setColor(-65536);
        this.f14860c.setStrokeWidth(5.0f);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f14858a != null) {
            this.f14860c.setStyle(Paint.Style.STROKE);
            this.f14860c.setColor(-256);
            for (int i = 0; i < this.f14858a.size(); i++) {
                Paint paint = this.f14860c;
                if (i == 0) {
                    paint.setColor(-16711936);
                } else {
                    paint.setColor(-65536);
                }
                canvas.drawPath(this.f14858a.get(i), this.f14860c);
            }
        }
        this.f14860c.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f14860c.setColor(-65536);
        dj60 dj60Var = this.f14861d;
        if (dj60Var != null) {
            canvas.drawCircle(dj60Var.f88782a, dj60Var.f88783b, 20.0f, this.f14860c);
        }
        List<dj60> list = this.f14859b;
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f14860c.setColor(-16776961);
        for (int i2 = 0; i2 < this.f14859b.size(); i2++) {
            dj60 dj60Var2 = this.f14859b.get(i2);
            canvas.drawCircle(dj60Var2.f88782a, dj60Var2.f88783b, 10.0f, this.f14860c);
            float f = dj60Var2.f88784c;
            if (f > 0.0f || dj60Var2.f88785d > 0.0f) {
                canvas.drawCircle(f, dj60Var2.f88785d, 10.0f, this.f14860c);
            }
            float f2 = dj60Var2.f88786e;
            if (f2 > 0.0f || dj60Var2.f88787f > 0.0f) {
                canvas.drawCircle(f2, dj60Var2.f88787f, 10.0f, this.f14860c);
            }
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }

    public void setPath(List<Path> list) {
        if (this.f14858a.size() > 0) {
            this.f14858a.clear();
        }
        this.f14858a.addAll(list);
        invalidate();
    }

    public void setPathPoint(dj60 dj60Var) {
        this.f14861d = dj60Var;
        invalidate();
    }

    public void setPathPoints(List<dj60> list) {
        this.f14859b = list;
        invalidate();
    }

    public PathView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14858a = new ArrayList();
        this.f14859b = new ArrayList();
        m20518a();
    }

    public PathView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f14858a = new ArrayList();
        this.f14859b = new ArrayList();
        m20518a();
    }
}
