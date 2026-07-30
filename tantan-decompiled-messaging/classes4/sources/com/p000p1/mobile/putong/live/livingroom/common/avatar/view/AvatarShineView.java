package com.p000p1.mobile.putong.live.livingroom.common.avatar.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import l.t100;
import p002l.i3c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class AvatarShineView extends View {

    /* JADX INFO: renamed from: a */
    public Paint f4511a;

    /* JADX INFO: renamed from: b */
    public Bitmap f4512b;

    /* JADX INFO: renamed from: c */
    public float f4513c;

    /* JADX INFO: renamed from: d */
    public Path f4514d;

    /* JADX INFO: renamed from: e */
    public RectF f4515e;

    public AvatarShineView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4513c = 0.0f;
        this.f4514d = new Path();
        this.f4515e = new RectF();
        m5607a();
    }

    /* JADX INFO: renamed from: a */
    public final void m5607a() {
        Paint paint = new Paint();
        this.f4511a = paint;
        paint.setAntiAlias(true);
        this.f4512b = BitmapFactory.decodeResource(getResources(), i3c0.f12749c2);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.clipPath(this.f4514d);
        Bitmap bitmap = this.f4512b;
        canvas.drawBitmap(bitmap, (-bitmap.getWidth()) + ((this.f4512b.getWidth() + getMeasuredWidth()) * this.f4513c), 0.0f, this.f4511a);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f4514d.reset();
        this.f4515e.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        this.f4514d.addRoundRect(this.f4515e, t100.d(18.0f), t100.d(18.0f), Path.Direction.CW);
    }

    public void setProcess(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        this.f4513c = f;
        requestLayout();
    }

    public AvatarShineView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AvatarShineView(@NonNull Context context) {
        this(context, null);
    }
}
