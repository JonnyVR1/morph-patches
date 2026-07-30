package p007l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.p003p1.mobile.android.p005ui.cropiwa.shape.CropIwaRectShape;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class eub extends CropIwaRectShape {

    /* JADX INFO: renamed from: f */
    public RectF f2643f;

    public eub(nub nubVar) {
        super(nubVar);
        this.f2643f = null;
    }

    @Override // com.p003p1.mobile.android.p005ui.cropiwa.shape.CropIwaRectShape, p007l.rub
    /* JADX INFO: renamed from: b */
    public void mo1345b(Canvas canvas, RectF rectF, Paint paint) {
        RectF rectFM9074i = m9074i(rectF);
        int i = t100.h;
        canvas.drawRoundRect(rectFM9074i, i, i, paint);
    }

    @Override // com.p003p1.mobile.android.p005ui.cropiwa.shape.CropIwaRectShape, p007l.rub
    /* JADX INFO: renamed from: d */
    public void mo1346d(Canvas canvas, RectF rectF, Paint paint) {
        RectF rectFM9074i = m9074i(rectF);
        int i = t100.h;
        canvas.drawRoundRect(rectFM9074i, i, i, paint);
    }

    @Override // p007l.rub
    /* JADX INFO: renamed from: f */
    public void mo1347f(Canvas canvas, RectF rectF, Paint paint) {
        super.mo1347f(canvas, m9074i(rectF), paint);
    }

    /* JADX INFO: renamed from: i */
    public final RectF m9074i(RectF rectF) {
        if (this.f2643f == null) {
            this.f2643f = new RectF();
        }
        float fWidth = rectF.width() / 2.0f;
        this.f2643f.set(rectF.centerX() - fWidth, rectF.top, rectF.centerX() + fWidth, rectF.bottom);
        return this.f2643f;
    }
}
