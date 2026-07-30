package p007l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.p000p1.mobile.putong.feed.newui.view.progressbar.FeedProgressBar;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class kug implements awh {

    /* JADX INFO: renamed from: a */
    public int f9796a;

    /* JADX INFO: renamed from: b */
    public int f9797b;

    /* JADX INFO: renamed from: c */
    public RectF f9798c;

    @Override // p007l.awh
    /* JADX INFO: renamed from: a */
    public void mo8617a(Canvas canvas, FeedProgressBar feedProgressBar, Paint[] paintArr, float f) {
        if (paintArr.length > 1) {
            float fCenterX = this.f9798c.centerX();
            float fCenterY = this.f9798c.centerY();
            RectF rectF = this.f9798c;
            canvas.drawCircle(fCenterX, fCenterY, (rectF.right - rectF.left) / 2.0f, paintArr[1]);
        }
        canvas.drawArc(this.f9798c, this.f9797b, m11518e(f), false, paintArr[0]);
    }

    @Override // p007l.awh
    /* JADX INFO: renamed from: b */
    public void mo8618b(Context context, AttributeSet attributeSet) {
        if (NullChecker.a(attributeSet)) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m9c0.f10281A);
            this.f9796a = typedArrayObtainStyledAttributes.getDimensionPixelSize(m9c0.f10283B, -1);
            this.f9797b = typedArrayObtainStyledAttributes.getDimensionPixelSize(m9c0.f10285C, -90);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // p007l.awh
    /* JADX INFO: renamed from: c */
    public void mo8619c(FeedProgressBar feedProgressBar) {
        if (this.f9798c == null) {
            int measuredWidth = feedProgressBar.getMeasuredWidth();
            int measuredHeight = feedProgressBar.getMeasuredHeight();
            int drawLineWidth = feedProgressBar.getDrawLineWidth();
            int i = this.f9796a;
            if (i <= 0) {
                int i2 = drawLineWidth >> 1;
                float f = i2;
                this.f9798c = new RectF(f, f, measuredWidth - i2, measuredHeight - i2);
            } else {
                int i3 = drawLineWidth * 2;
                int i4 = ((measuredWidth - i3) - (i * 2)) / 2;
                int i5 = ((measuredHeight - i3) - (i * 2)) / 2;
                this.f9798c = new RectF(i4, i5, measuredWidth - i4, measuredHeight - i5);
            }
        }
    }

    @Override // p007l.awh
    /* JADX INFO: renamed from: d */
    public Paint[] mo8620d(FeedProgressBar feedProgressBar) {
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
    public final float m11518e(float f) {
        return f * 360.0f;
    }
}
