package com.sunshine.engine.base;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import p149l.xsi0;
import p149l.yae;

/* JADX INFO: renamed from: com.sunshine.engine.base.r */
/* JADX INFO: loaded from: classes13.dex */
public class C13501r {

    /* JADX INFO: renamed from: a */
    public static final Paint f55679a;

    /* JADX INFO: renamed from: b */
    private static final PaintFlagsDrawFilter f55680b;

    /* JADX INFO: renamed from: com.sunshine.engine.base.r$a */
    public static abstract class a {

        /* JADX INFO: renamed from: a */
        public final Paint f55681a = new Paint();
    }

    /* JADX INFO: renamed from: com.sunshine.engine.base.r$b */
    public static abstract class b extends a {
        /* JADX INFO: renamed from: a */
        public abstract void m80966a(Canvas canvas, float f, RectF rectF, float f2);
    }

    static {
        Paint paint = new Paint();
        f55679a = paint;
        f55680b = new PaintFlagsDrawFilter(0, 3);
        paint.setAntiAlias(true);
    }

    /* JADX INFO: renamed from: a */
    public static void m80961a(Canvas canvas, Bitmap bitmap, Rect rect, yae yaeVar) {
        if (xsi0.m210764e(yaeVar.f197188d)) {
            m80963c(canvas, bitmap, rect, yaeVar);
            return;
        }
        int iSave = canvas.save();
        float f = yaeVar.f197188d;
        PointF pointF = yaeVar.f197189e;
        canvas.rotate(f, pointF.x, pointF.y);
        m80963c(canvas, bitmap, rect, yaeVar);
        canvas.restoreToCount(iSave);
    }

    /* JADX INFO: renamed from: b */
    public static void m80962b(Canvas canvas, a aVar, float f, AbstractC13484a abstractC13484a) {
        if (xsi0.m210764e(abstractC13484a.f55671s.f197188d)) {
            m80964d(canvas, aVar, f, abstractC13484a);
            return;
        }
        int iSave = canvas.save();
        yae yaeVar = abstractC13484a.f55671s;
        float f2 = yaeVar.f197188d;
        PointF pointF = yaeVar.f197189e;
        canvas.rotate(f2, pointF.x, pointF.y);
        m80964d(canvas, aVar, f, abstractC13484a);
        canvas.restoreToCount(iSave);
    }

    /* JADX INFO: renamed from: c */
    private static void m80963c(Canvas canvas, Bitmap bitmap, Rect rect, yae yaeVar) {
        Paint paint = f55679a;
        paint.setAlpha(yaeVar.f197190f);
        canvas.drawBitmap(bitmap, rect, yaeVar.f197187c, paint);
        paint.setAlpha(255);
    }

    /* JADX INFO: renamed from: d */
    private static void m80964d(Canvas canvas, a aVar, float f, AbstractC13484a abstractC13484a) {
        aVar.f55681a.setAlpha(abstractC13484a.f55671s.f197190f);
        if (aVar instanceof b) {
            ((b) aVar).m80966a(canvas, f, abstractC13484a.f55671s.f197187c, abstractC13484a.f55659g);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m80965e(Canvas canvas) {
        canvas.setDrawFilter(f55680b);
    }
}
