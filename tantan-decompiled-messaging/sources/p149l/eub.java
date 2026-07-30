package p149l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.p046p1.mobile.android.p048ui.cropiwa.shape.CropIwaRectShape;

/* JADX INFO: loaded from: classes8.dex */
public class eub extends CropIwaRectShape {

    /* JADX INFO: renamed from: f */
    public RectF f93224f;

    public eub(nub nubVar) {
        super(nubVar);
        this.f93224f = null;
    }

    @Override // com.p046p1.mobile.android.p048ui.cropiwa.shape.CropIwaRectShape, p149l.rub
    /* JADX INFO: renamed from: b */
    public void mo21073b(Canvas canvas, RectF rectF, Paint paint) {
        RectF rectFM118157i = m118157i(rectF);
        int i = t100.f167259h;
        canvas.drawRoundRect(rectFM118157i, i, i, paint);
    }

    @Override // com.p046p1.mobile.android.p048ui.cropiwa.shape.CropIwaRectShape, p149l.rub
    /* JADX INFO: renamed from: d */
    public void mo21074d(Canvas canvas, RectF rectF, Paint paint) {
        RectF rectFM118157i = m118157i(rectF);
        int i = t100.f167259h;
        canvas.drawRoundRect(rectFM118157i, i, i, paint);
    }

    @Override // p149l.rub
    /* JADX INFO: renamed from: f */
    public void mo21075f(Canvas canvas, RectF rectF, Paint paint) {
        super.mo21075f(canvas, m118157i(rectF), paint);
    }

    /* JADX INFO: renamed from: i */
    public final RectF m118157i(RectF rectF) {
        if (this.f93224f == null) {
            this.f93224f = new RectF();
        }
        float fWidth = rectF.width() / 2.0f;
        this.f93224f.set(rectF.centerX() - fWidth, rectF.top, rectF.centerX() + fWidth, rectF.bottom);
        return this.f93224f;
    }
}
