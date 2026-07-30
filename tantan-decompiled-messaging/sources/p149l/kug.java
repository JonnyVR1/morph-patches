package p149l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.p046p1.mobile.putong.feed.newui.view.progressbar.FeedProgressBar;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes12.dex */
public class kug implements awh {

    /* JADX INFO: renamed from: a */
    public int f124684a;

    /* JADX INFO: renamed from: b */
    public int f124685b;

    /* JADX INFO: renamed from: c */
    public RectF f124686c;

    @Override // p149l.awh
    /* JADX INFO: renamed from: a */
    public void mo99285a(Canvas canvas, FeedProgressBar feedProgressBar, Paint[] paintArr, float f) {
        if (paintArr.length > 1) {
            float fCenterX = this.f124686c.centerX();
            float fCenterY = this.f124686c.centerY();
            RectF rectF = this.f124686c;
            canvas.drawCircle(fCenterX, fCenterY, (rectF.right - rectF.left) / 2.0f, paintArr[1]);
        }
        canvas.drawArc(this.f124686c, this.f124685b, m147270e(f), false, paintArr[0]);
    }

    @Override // p149l.awh
    /* JADX INFO: renamed from: b */
    public void mo99286b(Context context, AttributeSet attributeSet) {
        if (NullChecker.m81303a(attributeSet)) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m9c0.f132690A);
            this.f124684a = typedArrayObtainStyledAttributes.getDimensionPixelSize(m9c0.f132692B, -1);
            this.f124685b = typedArrayObtainStyledAttributes.getDimensionPixelSize(m9c0.f132694C, -90);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // p149l.awh
    /* JADX INFO: renamed from: c */
    public void mo99287c(FeedProgressBar feedProgressBar) {
        if (this.f124686c == null) {
            int measuredWidth = feedProgressBar.getMeasuredWidth();
            int measuredHeight = feedProgressBar.getMeasuredHeight();
            int drawLineWidth = feedProgressBar.getDrawLineWidth();
            int i = this.f124684a;
            if (i <= 0) {
                int i2 = drawLineWidth >> 1;
                float f = i2;
                this.f124686c = new RectF(f, f, measuredWidth - i2, measuredHeight - i2);
            } else {
                int i3 = drawLineWidth * 2;
                int i4 = ((measuredWidth - i3) - (i * 2)) / 2;
                int i5 = ((measuredHeight - i3) - (i * 2)) / 2;
                this.f124686c = new RectF(i4, i5, measuredWidth - i4, measuredHeight - i5);
            }
        }
    }

    @Override // p149l.awh
    /* JADX INFO: renamed from: d */
    public Paint[] mo99288d(FeedProgressBar feedProgressBar) {
        Paint paint;
        if (feedProgressBar.getBackGroundColor() != 0) {
            paint = new Paint();
            paint.setStyle(Paint.Style.STROKE);
            paint.setAntiAlias(true);
            paint.setColor(feedProgressBar.getBackGroundColor());
            paint.setStrokeWidth(feedProgressBar.getDrawLineWidth());
            paint.setStrokeCap(Paint.Cap.ROUND);
        } else {
            paint = null;
        }
        Paint[] paintArr = new Paint[paint != null ? 2 : 1];
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setColor(feedProgressBar.getProgressColor());
        paint2.setStrokeWidth(feedProgressBar.getDrawLineWidth());
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paintArr[0] = paint2;
        if (paint != null) {
            paintArr[1] = paint;
        }
        return paintArr;
    }

    /* JADX INFO: renamed from: e */
    public final float m147270e(float f) {
        return f * 360.0f;
    }
}
