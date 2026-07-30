package com.sunshine.engine.base;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import p153l.a2j0;
import p153l.cce;

/* JADX INFO: renamed from: com.sunshine.engine.base.r */
/* JADX INFO: loaded from: classes11.dex */
public class C13664r {

    /* JADX INFO: renamed from: a */
    public static final Paint f56527a;

    /* JADX INFO: renamed from: b */
    private static final PaintFlagsDrawFilter f56528b;

    /* JADX INFO: renamed from: com.sunshine.engine.base.r$a */
    public static abstract class a {

        /* JADX INFO: renamed from: a */
        public final Paint f56529a = new Paint();
    }

    /* JADX INFO: renamed from: com.sunshine.engine.base.r$b */
    public static abstract class b extends a {
        /* JADX INFO: renamed from: a */
        public abstract void m82149a(Canvas canvas, float f, RectF rectF, float f2);
    }

    static {
        Paint paint = new Paint();
        f56527a = paint;
        f56528b = new PaintFlagsDrawFilter(0, 3);
        paint.setAntiAlias(true);
    }

    /* JADX INFO: renamed from: a */
    public static void m82144a(Canvas canvas, Bitmap bitmap, Rect rect, cce cceVar) {
        if (a2j0.m95702e(cceVar.f80953d)) {
            m82146c(canvas, bitmap, rect, cceVar);
            return;
        }
        int iSave = canvas.save();
        float f = cceVar.f80953d;
        PointF pointF = cceVar.f80954e;
        canvas.rotate(f, pointF.x, pointF.y);
        m82146c(canvas, bitmap, rect, cceVar);
        canvas.restoreToCount(iSave);
    }

    /* JADX INFO: renamed from: b */
    public static void m82145b(Canvas canvas, a aVar, float f, AbstractC13647a abstractC13647a) {
        if (a2j0.m95702e(abstractC13647a.f56519s.f80953d)) {
            m82147d(canvas, aVar, f, abstractC13647a);
            return;
        }
        int iSave = canvas.save();
        cce cceVar = abstractC13647a.f56519s;
        float f2 = cceVar.f80953d;
        PointF pointF = cceVar.f80954e;
        canvas.rotate(f2, pointF.x, pointF.y);
        m82147d(canvas, aVar, f, abstractC13647a);
        canvas.restoreToCount(iSave);
    }

    /* JADX INFO: renamed from: c */
    private static void m82146c(Canvas canvas, Bitmap bitmap, Rect rect, cce cceVar) {
        Paint paint = f56527a;
        paint.setAlpha(cceVar.f80955f);
        canvas.drawBitmap(bitmap, rect, cceVar.f80952c, paint);
        paint.setAlpha(255);
    }

    /* JADX INFO: renamed from: d */
    private static void m82147d(Canvas canvas, a aVar, float f, AbstractC13647a abstractC13647a) {
        aVar.f56529a.setAlpha(abstractC13647a.f56519s.f80955f);
        if (aVar instanceof b) {
            ((b) aVar).m82149a(canvas, f, abstractC13647a.f56519s.f80952c, abstractC13647a.f56507g);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m82148e(Canvas canvas) {
        canvas.setDrawFilter(f56528b);
    }
}
