package p007l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.AttributeSet;
import com.p000p1.mobile.putong.feed.newui.view.progressbar.FeedProgressBar;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class sah implements awh {

    /* JADX INFO: renamed from: a */
    public int f12857a;

    /* JADX INFO: renamed from: b */
    public Point f12858b;

    /* JADX INFO: renamed from: c */
    public Point f12859c;

    /* JADX INFO: renamed from: d */
    public Point f12860d;

    /* JADX INFO: renamed from: e */
    public Point f12861e;

    @Override // p007l.awh
    /* JADX INFO: renamed from: a */
    public void mo8617a(Canvas canvas, FeedProgressBar feedProgressBar, Paint[] paintArr, float f) {
        this.f12859c.x = m14117e(f);
        Point point = this.f12860d;
        float f2 = point.x;
        float f3 = point.y;
        Point point2 = this.f12861e;
        canvas.drawLine(f2, f3, point2.x, point2.y, paintArr[0]);
        Point point3 = this.f12858b;
        float f4 = point3.x;
        float f5 = point3.y;
        Point point4 = this.f12859c;
        canvas.drawLine(f4, f5, point4.x, point4.y, paintArr[1]);
    }

    @Override // p007l.awh
    /* JADX INFO: renamed from: b */
    public void mo8618b(Context context, AttributeSet attributeSet) {
        if (NullChecker.a(attributeSet)) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m9c0.f10281A);
            this.f12857a = typedArrayObtainStyledAttributes.getDimensionPixelSize(m9c0.f10286D, -1);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // p007l.awh
    /* JADX INFO: renamed from: c */
    public void mo8619c(FeedProgressBar feedProgressBar) {
        if (this.f12860d == null || this.f12861e == null) {
            int measuredHeight = feedProgressBar.getMeasuredHeight();
            int measuredWidth = feedProgressBar.getMeasuredWidth();
            if (this.f12857a <= 0) {
                this.f12857a = measuredWidth;
            }
            int i = (measuredWidth - this.f12857a) / 2;
            int drawLineWidth = (measuredHeight - feedProgressBar.getDrawLineWidth()) / 2;
            this.f12860d = new Point(i, drawLineWidth);
            this.f12861e = new Point(this.f12857a + i, drawLineWidth);
            this.f12858b = new Point(i, drawLineWidth);
            this.f12859c = new Point(i, drawLineWidth);
        }
    }

    @Override // p007l.awh
    /* JADX INFO: renamed from: d */
    public Paint[] mo8620d(FeedProgressBar feedProgressBar) {
        Paint paint = new Paint();
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setAntiAlias(true);
        paint.setColor(feedProgressBar.getBackGroundColor());
        paint.setStrokeWidth(feedProgressBar.getDrawLineWidth());
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint paint2 = new Paint();
        paint2.setStyle(style);
        paint2.setAntiAlias(true);
        paint2.setColor(feedProgressBar.getProgressColor());
        paint2.setStrokeWidth(feedProgressBar.getDrawLineWidth());
        paint2.setStrokeCap(cap);
        return new Paint[]{paint, paint2};
    }

    /* JADX INFO: renamed from: e */
    public final int m14117e(float f) {
        return (int) (this.f12857a * f);
    }
}
