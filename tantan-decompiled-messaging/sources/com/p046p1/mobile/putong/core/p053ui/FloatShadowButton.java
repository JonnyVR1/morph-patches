package com.p046p1.mobile.putong.core.p053ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import com.tantanapp.common.utils.NullChecker;
import p149l.t6k;
import p149l.vwb;

/* JADX INFO: loaded from: classes6.dex */
public class FloatShadowButton extends ShadowButton {

    /* JADX INFO: renamed from: x */
    public final String f27972x;

    public FloatShadowButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27972x = getClass().getSimpleName();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.ShadowButton
    /* JADX INFO: renamed from: d */
    public void mo43893d(Canvas canvas, float f) {
        float f2 = f / (this.f27971a.f28189c / 2.0f);
        this.f28156j.setColor(this.f28149c);
        if (this.f28161o) {
            Paint paint = this.f28156j;
            float f3 = this.f28155i;
            paint.setShadowLayer(f3, 0.0f, f3, m44064b(this.f28150d, f2));
            float f4 = this.f28159m;
            canvas.drawCircle(f4, f4, f, this.f28156j);
            this.f28156j.setShadowLayer(this.f28155i, 0.0f, 0.0f, m44064b(this.f28151e, f2));
        }
        float f5 = this.f28159m;
        canvas.drawCircle(f5, f5, f, this.f28156j);
        this.f28156j.clearShadowLayer();
        if (NullChecker.m81303a(this.f28158l)) {
            Bitmap bitmap = ((BitmapDrawable) this.f28158l).getBitmap();
            float f6 = this.f28159m;
            float f7 = this.f28153g;
            float f8 = f6 - ((f7 / 2.0f) * f2);
            float f9 = this.f28154h;
            float f10 = f6 - ((f9 / 2.0f) * f2);
            if (f8 <= 0.0f || f10 <= 0.0f) {
                return;
            }
            int i = (int) f8;
            if (!this.f28164r) {
                canvas.drawBitmap(t6k.m187383a(bitmap, f7 * f2, f9 * f2), f8, f10, this.f28156j);
                return;
            }
            if (this.f28169w.containsKey(Integer.valueOf(i))) {
                canvas.drawBitmap(this.f28169w.get(Integer.valueOf(i)).f116565b, this.f28169w.get(Integer.valueOf(i)).f116564a.floatValue(), this.f28169w.get(Integer.valueOf(i)).f116564a.floatValue(), this.f28156j);
                return;
            }
            Bitmap bitmapM187383a = t6k.m187383a(bitmap, this.f28153g * f2, this.f28154h * f2);
            canvas.drawBitmap(bitmapM187383a, f8, f10, this.f28156j);
            if (this.f28164r) {
                this.f28169w.put(Integer.valueOf(i), vwb.m200311Y(Float.valueOf(f8), bitmapM187383a));
            }
        }
    }

    public FloatShadowButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f27972x = getClass().getSimpleName();
    }
}
