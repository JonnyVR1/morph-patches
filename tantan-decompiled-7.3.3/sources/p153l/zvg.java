package p153l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.p051p1.mobile.putong.feed.newui.view.progressbar.FeedProgressBar;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes13.dex */
public class zvg implements pxh {

    /* JADX INFO: renamed from: a */
    public int f206214a;

    /* JADX INFO: renamed from: b */
    public int f206215b;

    /* JADX INFO: renamed from: c */
    public RectF f206216c;

    @Override // p153l.pxh
    /* JADX INFO: renamed from: a */
    public void mo134450a(Canvas canvas, FeedProgressBar feedProgressBar, Paint[] paintArr, float f) {
        if (paintArr.length > 1) {
            float fCenterX = this.f206216c.centerX();
            float fCenterY = this.f206216c.centerY();
            RectF rectF = this.f206216c;
            canvas.drawCircle(fCenterX, fCenterY, (rectF.right - rectF.left) / 2.0f, paintArr[1]);
        }
        canvas.drawArc(this.f206216c, this.f206215b, m221755e(f), false, paintArr[0]);
    }

    @Override // p153l.pxh
    /* JADX INFO: renamed from: b */
    public void mo134451b(Context context, AttributeSet attributeSet) {
        if (NullChecker.m82486a(attributeSet)) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, shc0.f168612A);
            this.f206214a = typedArrayObtainStyledAttributes.getDimensionPixelSize(shc0.f168614B, -1);
            this.f206215b = typedArrayObtainStyledAttributes.getDimensionPixelSize(shc0.f168616C, -90);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // p153l.pxh
    /* JADX INFO: renamed from: c */
    public void mo134452c(FeedProgressBar feedProgressBar) {
        if (this.f206216c == null) {
            int measuredWidth = feedProgressBar.getMeasuredWidth();
            int measuredHeight = feedProgressBar.getMeasuredHeight();
            int drawLineWidth = feedProgressBar.getDrawLineWidth();
            int i = this.f206214a;
            if (i <= 0) {
                int i2 = drawLineWidth >> 1;
                float f = i2;
                this.f206216c = new RectF(f, f, measuredWidth - i2, measuredHeight - i2);
            } else {
                int i3 = drawLineWidth * 2;
                int i4 = ((measuredWidth - i3) - (i * 2)) / 2;
                int i5 = ((measuredHeight - i3) - (i * 2)) / 2;
                this.f206216c = new RectF(i4, i5, measuredWidth - i4, measuredHeight - i5);
            }
        }
    }

    @Override // p153l.pxh
    /* JADX INFO: renamed from: d */
    public Paint[] mo134453d(FeedProgressBar feedProgressBar) {
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
    public final float m221755e(float f) {
        return f * 360.0f;
    }
}
