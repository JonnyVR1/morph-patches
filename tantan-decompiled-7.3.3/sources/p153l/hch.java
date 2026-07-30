package p153l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.AttributeSet;
import com.p051p1.mobile.putong.feed.newui.view.progressbar.FeedProgressBar;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes13.dex */
public class hch implements pxh {

    /* JADX INFO: renamed from: a */
    public int f108693a;

    /* JADX INFO: renamed from: b */
    public Point f108694b;

    /* JADX INFO: renamed from: c */
    public Point f108695c;

    /* JADX INFO: renamed from: d */
    public Point f108696d;

    /* JADX INFO: renamed from: e */
    public Point f108697e;

    @Override // p153l.pxh
    /* JADX INFO: renamed from: a */
    public void mo134450a(Canvas canvas, FeedProgressBar feedProgressBar, Paint[] paintArr, float f) {
        this.f108695c.x = m134454e(f);
        Point point = this.f108696d;
        float f2 = point.x;
        float f3 = point.y;
        Point point2 = this.f108697e;
        canvas.drawLine(f2, f3, point2.x, point2.y, paintArr[0]);
        Point point3 = this.f108694b;
        float f4 = point3.x;
        float f5 = point3.y;
        Point point4 = this.f108695c;
        canvas.drawLine(f4, f5, point4.x, point4.y, paintArr[1]);
    }

    @Override // p153l.pxh
    /* JADX INFO: renamed from: b */
    public void mo134451b(Context context, AttributeSet attributeSet) {
        if (NullChecker.m82486a(attributeSet)) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, shc0.f168612A);
            this.f108693a = typedArrayObtainStyledAttributes.getDimensionPixelSize(shc0.f168617D, -1);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // p153l.pxh
    /* JADX INFO: renamed from: c */
    public void mo134452c(FeedProgressBar feedProgressBar) {
        if (this.f108696d == null || this.f108697e == null) {
            int measuredHeight = feedProgressBar.getMeasuredHeight();
            int measuredWidth = feedProgressBar.getMeasuredWidth();
            if (this.f108693a <= 0) {
                this.f108693a = measuredWidth;
            }
            int i = (measuredWidth - this.f108693a) / 2;
            int drawLineWidth = (measuredHeight - feedProgressBar.getDrawLineWidth()) / 2;
            this.f108696d = new Point(i, drawLineWidth);
            this.f108697e = new Point(this.f108693a + i, drawLineWidth);
            this.f108694b = new Point(i, drawLineWidth);
            this.f108695c = new Point(i, drawLineWidth);
        }
    }

    @Override // p153l.pxh
    /* JADX INFO: renamed from: d */
    public Paint[] mo134453d(FeedProgressBar feedProgressBar) {
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
    public final int m134454e(float f) {
        return (int) (this.f108693a * f);
    }
}
