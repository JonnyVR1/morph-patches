package p149l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.p046p1.mobile.android.p048ui.cropiwa.shape.CropIwaRectShape;

/* JADX INFO: loaded from: classes8.dex */
public class avb extends CropIwaRectShape {
    public avb(nub nubVar) {
        super(nubVar);
    }

    @Override // com.p046p1.mobile.android.p048ui.cropiwa.shape.CropIwaRectShape, p149l.rub
    /* JADX INFO: renamed from: b */
    public void mo21073b(Canvas canvas, RectF rectF, Paint paint) {
        int i = t100.f167259h;
        canvas.drawRoundRect(rectF, i, i, paint);
    }

    @Override // com.p046p1.mobile.android.p048ui.cropiwa.shape.CropIwaRectShape, p149l.rub
    /* JADX INFO: renamed from: d */
    public void mo21074d(Canvas canvas, RectF rectF, Paint paint) {
        int i = t100.f167259h;
        canvas.drawRoundRect(rectF, i, i, paint);
    }

    @Override // p149l.rub
    /* JADX INFO: renamed from: f */
    public void mo21075f(Canvas canvas, RectF rectF, Paint paint) {
        super.mo21075f(canvas, rectF, paint);
    }
}
