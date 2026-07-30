package com.p051p1.mobile.putong.core.p058ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import com.tantanapp.common.utils.NullChecker;
import p153l.jyb;
import p153l.l9k;

/* JADX INFO: loaded from: classes6.dex */
public class FloatShadowButton extends ShadowButton {

    /* JADX INFO: renamed from: x */
    public final String f28820x;

    public FloatShadowButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28820x = getClass().getSimpleName();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.ShadowButton
    /* JADX INFO: renamed from: d */
    public void mo45079d(Canvas canvas, float f) {
        float f2 = f / (this.f28819a.f29037c / 2.0f);
        this.f29004j.setColor(this.f28997c);
        if (this.f29009o) {
            Paint paint = this.f29004j;
            float f3 = this.f29003i;
            paint.setShadowLayer(f3, 0.0f, f3, m45247b(this.f28998d, f2));
            float f4 = this.f29007m;
            canvas.drawCircle(f4, f4, f, this.f29004j);
            this.f29004j.setShadowLayer(this.f29003i, 0.0f, 0.0f, m45247b(this.f28999e, f2));
        }
        float f5 = this.f29007m;
        canvas.drawCircle(f5, f5, f, this.f29004j);
        this.f29004j.clearShadowLayer();
        if (NullChecker.m82486a(this.f29006l)) {
            Bitmap bitmap = ((BitmapDrawable) this.f29006l).getBitmap();
            float f6 = this.f29007m;
            float f7 = this.f29001g;
            float f8 = f6 - ((f7 / 2.0f) * f2);
            float f9 = this.f29002h;
            float f10 = f6 - ((f9 / 2.0f) * f2);
            if (f8 <= 0.0f || f10 <= 0.0f) {
                return;
            }
            int i = (int) f8;
            if (!this.f29012r) {
                canvas.drawBitmap(l9k.m153435a(bitmap, f7 * f2, f9 * f2), f8, f10, this.f29004j);
                return;
            }
            if (this.f29017w.containsKey(Integer.valueOf(i))) {
                canvas.drawBitmap(this.f29017w.get(Integer.valueOf(i)).f152157b, this.f29017w.get(Integer.valueOf(i)).f152156a.floatValue(), this.f29017w.get(Integer.valueOf(i)).f152156a.floatValue(), this.f29004j);
                return;
            }
            Bitmap bitmapM153435a = l9k.m153435a(bitmap, this.f29001g * f2, this.f29002h * f2);
            canvas.drawBitmap(bitmapM153435a, f8, f10, this.f29004j);
            if (this.f29012r) {
                this.f29017w.put(Integer.valueOf(i), jyb.m147494Y(Float.valueOf(f8), bitmapM153435a));
            }
        }
    }

    public FloatShadowButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f28820x = getClass().getSimpleName();
    }
}
