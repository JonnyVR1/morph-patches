package p153l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.p051p1.mobile.android.p053ui.cropiwa.shape.CropIwaRectShape;

/* JADX INFO: loaded from: classes8.dex */
public class owb extends CropIwaRectShape {
    public owb(bwb bwbVar) {
        super(bwbVar);
    }

    @Override // com.p051p1.mobile.android.p053ui.cropiwa.shape.CropIwaRectShape, p153l.fwb
    /* JADX INFO: renamed from: b */
    public void mo22072b(Canvas canvas, RectF rectF, Paint paint) {
        int i = qa00.f156321h;
        canvas.drawRoundRect(rectF, i, i, paint);
    }

    @Override // com.p051p1.mobile.android.p053ui.cropiwa.shape.CropIwaRectShape, p153l.fwb
    /* JADX INFO: renamed from: d */
    public void mo22073d(Canvas canvas, RectF rectF, Paint paint) {
        int i = qa00.f156321h;
        canvas.drawRoundRect(rectF, i, i, paint);
    }

    @Override // p153l.fwb
    /* JADX INFO: renamed from: f */
    public void mo22074f(Canvas canvas, RectF rectF, Paint paint) {
        super.mo22074f(canvas, rectF, paint);
    }
}
