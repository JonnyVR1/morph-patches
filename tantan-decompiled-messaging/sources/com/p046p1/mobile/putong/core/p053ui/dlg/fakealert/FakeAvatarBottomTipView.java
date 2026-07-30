package com.p046p1.mobile.putong.core.p053ui.dlg.fakealert;

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
import p149l.e9c0;

/* JADX INFO: loaded from: classes10.dex */
public class FakeAvatarBottomTipView extends View {

    /* JADX INFO: renamed from: a */
    public int f28980a;

    /* JADX INFO: renamed from: b */
    public int f28981b;

    /* JADX INFO: renamed from: c */
    public Bitmap f28982c;

    public FakeAvatarBottomTipView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m45190a(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public final void m45190a(Context context, AttributeSet attributeSet) {
        if (NullChecker.m81303a(attributeSet)) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e9c0.f89943B0);
            this.f28980a = typedArrayObtainStyledAttributes.getDimensionPixelSize(e9c0.f89949D0, 0);
            this.f28981b = typedArrayObtainStyledAttributes.getDimensionPixelSize(e9c0.f89952E0, 0);
            int color = typedArrayObtainStyledAttributes.getColor(e9c0.f89946C0, 0);
            typedArrayObtainStyledAttributes.recycle();
            if (this.f28981b == 0) {
                return;
            }
            RectF rectF = new RectF();
            Paint paint = new Paint();
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            int i = this.f28981b;
            this.f28982c = Bitmap.createBitmap(i * 2, i * 2, config);
            Canvas canvas = new Canvas(this.f28982c);
            paint.setDither(true);
            paint.setAntiAlias(true);
            paint.setColor(color);
            paint.setXfermode(null);
            int i2 = this.f28981b;
            canvas.drawCircle(i2, i2, i2, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            rectF.left = 0.0f;
            int i3 = this.f28981b;
            rectF.right = i3 * 2;
            rectF.top = 0.0f;
            rectF.bottom = (i3 * 2) - this.f28980a;
            canvas.drawRect(rectF, paint);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        int measuredHeight = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        if (measuredHeight <= 0 || measuredWidth <= 0 || this.f28980a == 0 || (i = this.f28981b) == 0) {
            return;
        }
        canvas.drawBitmap(this.f28982c, (measuredWidth / 2) - i, measuredHeight - (i * 2), (Paint) null);
    }

    public FakeAvatarBottomTipView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FakeAvatarBottomTipView(Context context) {
        this(context, null);
    }
}
