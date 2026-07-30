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
import p149l.ya60;

/* JADX INFO: loaded from: classes7.dex */
public class PathView extends View {

    /* JADX INFO: renamed from: a */
    List<Path> f14139a;

    /* JADX INFO: renamed from: b */
    List<ya60> f14140b;

    /* JADX INFO: renamed from: c */
    Paint f14141c;

    /* JADX INFO: renamed from: d */
    ya60 f14142d;

    public PathView(Context context) {
        super(context);
        this.f14139a = new ArrayList();
        this.f14140b = new ArrayList();
        m19519a();
    }

    /* JADX INFO: renamed from: a */
    private void m19519a() {
        Paint paint = new Paint(1);
        this.f14141c = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f14141c.setColor(-65536);
        this.f14141c.setStrokeWidth(5.0f);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f14139a != null) {
            this.f14141c.setStyle(Paint.Style.STROKE);
            this.f14141c.setColor(-256);
            for (int i = 0; i < this.f14139a.size(); i++) {
                Paint paint = this.f14141c;
                if (i == 0) {
                    paint.setColor(-16711936);
                } else {
                    paint.setColor(-65536);
                }
                canvas.drawPath(this.f14139a.get(i), this.f14141c);
            }
        }
        this.f14141c.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f14141c.setColor(-65536);
        ya60 ya60Var = this.f14142d;
        if (ya60Var != null) {
            canvas.drawCircle(ya60Var.f197142a, ya60Var.f197143b, 20.0f, this.f14141c);
        }
        List<ya60> list = this.f14140b;
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f14141c.setColor(-16776961);
        for (int i2 = 0; i2 < this.f14140b.size(); i2++) {
            ya60 ya60Var2 = this.f14140b.get(i2);
            canvas.drawCircle(ya60Var2.f197142a, ya60Var2.f197143b, 10.0f, this.f14141c);
            float f = ya60Var2.f197144c;
            if (f > 0.0f || ya60Var2.f197145d > 0.0f) {
                canvas.drawCircle(f, ya60Var2.f197145d, 10.0f, this.f14141c);
            }
            float f2 = ya60Var2.f197146e;
            if (f2 > 0.0f || ya60Var2.f197147f > 0.0f) {
                canvas.drawCircle(f2, ya60Var2.f197147f, 10.0f, this.f14141c);
            }
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }

    public void setPath(List<Path> list) {
        if (this.f14139a.size() > 0) {
            this.f14139a.clear();
        }
        this.f14139a.addAll(list);
        invalidate();
    }

    public void setPathPoint(ya60 ya60Var) {
        this.f14142d = ya60Var;
        invalidate();
    }

    public void setPathPoints(List<ya60> list) {
        this.f14140b = list;
        invalidate();
    }

    public PathView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14139a = new ArrayList();
        this.f14140b = new ArrayList();
        m19519a();
    }

    public PathView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f14139a = new ArrayList();
        this.f14140b = new ArrayList();
        m19519a();
    }
}
