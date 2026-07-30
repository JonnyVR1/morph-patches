package p007l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.p003p1.mobile.android.p005ui.cropiwa.shape.CropIwaRectShape;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class avb extends CropIwaRectShape {
    public avb(nub nubVar) {
        super(nubVar);
    }

    @Override // com.p003p1.mobile.android.p005ui.cropiwa.shape.CropIwaRectShape, p007l.rub
    /* JADX INFO: renamed from: b */
    public void mo1345b(Canvas canvas, RectF rectF, Paint paint) {
        int i = t100.h;
        canvas.drawRoundRect(rectF, i, i, paint);
    }

    @Override // com.p003p1.mobile.android.p005ui.cropiwa.shape.CropIwaRectShape, p007l.rub
    /* JADX INFO: renamed from: d */
    public void mo1346d(Canvas canvas, RectF rectF, Paint paint) {
        int i = t100.h;
        canvas.drawRoundRect(rectF, i, i, paint);
    }

    @Override // p007l.rub
    /* JADX INFO: renamed from: f */
    public void mo1347f(Canvas canvas, RectF rectF, Paint paint) {
        super.mo1347f(canvas, rectF, paint);
    }
}
