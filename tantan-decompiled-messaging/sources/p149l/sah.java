package p149l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.AttributeSet;
import com.p046p1.mobile.putong.feed.newui.view.progressbar.FeedProgressBar;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes12.dex */
public class sah implements awh {

    /* JADX INFO: renamed from: a */
    public int f163404a;

    /* JADX INFO: renamed from: b */
    public Point f163405b;

    /* JADX INFO: renamed from: c */
    public Point f163406c;

    /* JADX INFO: renamed from: d */
    public Point f163407d;

    /* JADX INFO: renamed from: e */
    public Point f163408e;

    @Override // p149l.awh
    /* JADX INFO: renamed from: a */
    public void mo99285a(Canvas canvas, FeedProgressBar feedProgressBar, Paint[] paintArr, float f) {
        this.f163406c.x = m183058e(f);
        Point point = this.f163407d;
        float f2 = point.x;
        float f3 = point.y;
        Point point2 = this.f163408e;
        canvas.drawLine(f2, f3, point2.x, point2.y, paintArr[0]);
        Point point3 = this.f163405b;
        float f4 = point3.x;
        float f5 = point3.y;
        Point point4 = this.f163406c;
        canvas.drawLine(f4, f5, point4.x, point4.y, paintArr[1]);
    }

    @Override // p149l.awh
    /* JADX INFO: renamed from: b */
    public void mo99286b(Context context, AttributeSet attributeSet) {
        if (NullChecker.m81303a(attributeSet)) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m9c0.f132690A);
            this.f163404a = typedArrayObtainStyledAttributes.getDimensionPixelSize(m9c0.f132695D, -1);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // p149l.awh
    /* JADX INFO: renamed from: c */
    public void mo99287c(FeedProgressBar feedProgressBar) {
        if (this.f163407d == null || this.f163408e == null) {
            int measuredHeight = feedProgressBar.getMeasuredHeight();
            int measuredWidth = feedProgressBar.getMeasuredWidth();
            if (this.f163404a <= 0) {
                this.f163404a = measuredWidth;
            }
            int i = (measuredWidth - this.f163404a) / 2;
            int drawLineWidth = (measuredHeight - feedProgressBar.getDrawLineWidth()) / 2;
            this.f163407d = new Point(i, drawLineWidth);
            this.f163408e = new Point(this.f163404a + i, drawLineWidth);
            this.f163405b = new Point(i, drawLineWidth);
            this.f163406c = new Point(i, drawLineWidth);
        }
    }

    @Override // p149l.awh
    /* JADX INFO: renamed from: d */
    public Paint[] mo99288d(FeedProgressBar feedProgressBar) {
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
    public final int m183058e(float f) {
        return (int) (this.f163404a * f);
    }
}
