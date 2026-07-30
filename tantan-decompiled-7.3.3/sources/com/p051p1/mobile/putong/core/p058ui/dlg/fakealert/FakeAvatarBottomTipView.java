package com.p051p1.mobile.putong.core.p058ui.dlg.fakealert;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import p153l.khc0;

/* JADX INFO: loaded from: classes2.dex */
public class FakeAvatarBottomTipView extends View {

    /* JADX INFO: renamed from: a */
    public int f29828a;

    /* JADX INFO: renamed from: b */
    public int f29829b;

    /* JADX INFO: renamed from: c */
    public Bitmap f29830c;

    public FakeAvatarBottomTipView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m46373a(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public final void m46373a(Context context, AttributeSet attributeSet) {
        if (NullChecker.m82486a(attributeSet)) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, khc0.f126713B0);
            this.f29828a = typedArrayObtainStyledAttributes.getDimensionPixelSize(khc0.f126719D0, 0);
            this.f29829b = typedArrayObtainStyledAttributes.getDimensionPixelSize(khc0.f126722E0, 0);
            int color = typedArrayObtainStyledAttributes.getColor(khc0.f126716C0, 0);
            typedArrayObtainStyledAttributes.recycle();
            if (this.f29829b == 0) {
                return;
            }
            RectF rectF = new RectF();
            Paint paint = new Paint();
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            int i = this.f29829b;
            this.f29830c = Bitmap.createBitmap(i * 2, i * 2, config);
            Canvas canvas = new Canvas(this.f29830c);
            paint.setDither(true);
            paint.setAntiAlias(true);
            paint.setColor(color);
            paint.setXfermode(null);
            int i2 = this.f29829b;
            canvas.drawCircle(i2, i2, i2, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            rectF.left = 0.0f;
            int i3 = this.f29829b;
            rectF.right = i3 * 2;
            rectF.top = 0.0f;
            rectF.bottom = (i3 * 2) - this.f29828a;
            canvas.drawRect(rectF, paint);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        int measuredHeight = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        if (measuredHeight <= 0 || measuredWidth <= 0 || this.f29828a == 0 || (i = this.f29829b) == 0) {
            return;
        }
        canvas.drawBitmap(this.f29830c, (measuredWidth / 2) - i, measuredHeight - (i * 2), (Paint) null);
    }

    public FakeAvatarBottomTipView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FakeAvatarBottomTipView(Context context) {
        this(context, null);
    }
}
