package p153l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.p051p1.mobile.android.p053ui.cropiwa.shape.CropIwaRectShape;

/* JADX INFO: loaded from: classes8.dex */
public class svb extends CropIwaRectShape {

    /* JADX INFO: renamed from: f */
    public RectF f170822f;

    public svb(bwb bwbVar) {
        super(bwbVar);
        this.f170822f = null;
    }

    @Override // com.p051p1.mobile.android.p053ui.cropiwa.shape.CropIwaRectShape, p153l.fwb
    /* JADX INFO: renamed from: b */
    public void mo22072b(Canvas canvas, RectF rectF, Paint paint) {
        RectF rectFM188114i = m188114i(rectF);
        int i = qa00.f156321h;
        canvas.drawRoundRect(rectFM188114i, i, i, paint);
    }

    @Override // com.p051p1.mobile.android.p053ui.cropiwa.shape.CropIwaRectShape, p153l.fwb
    /* JADX INFO: renamed from: d */
    public void mo22073d(Canvas canvas, RectF rectF, Paint paint) {
        RectF rectFM188114i = m188114i(rectF);
        int i = qa00.f156321h;
        canvas.drawRoundRect(rectFM188114i, i, i, paint);
    }

    @Override // p153l.fwb
    /* JADX INFO: renamed from: f */
    public void mo22074f(Canvas canvas, RectF rectF, Paint paint) {
        super.mo22074f(canvas, m188114i(rectF), paint);
    }

    /* JADX INFO: renamed from: i */
    public final RectF m188114i(RectF rectF) {
        if (this.f170822f == null) {
            this.f170822f = new RectF();
        }
        float fWidth = rectF.width() / 2.0f;
        this.f170822f.set(rectF.centerX() - fWidth, rectF.top, rectF.centerX() + fWidth, rectF.bottom);
        return this.f170822f;
    }
}
