package com.p046p1.mobile.putong.live.livingroom.common.avatar.view;

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
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import p149l.i3c0;
import p149l.t100;

/* JADX INFO: loaded from: classes4.dex */
public class AvatarShineView extends View {

    /* JADX INFO: renamed from: a */
    public Paint f48469a;

    /* JADX INFO: renamed from: b */
    public Bitmap f48470b;

    /* JADX INFO: renamed from: c */
    public float f48471c;

    /* JADX INFO: renamed from: d */
    public Path f48472d;

    /* JADX INFO: renamed from: e */
    public RectF f48473e;

    public AvatarShineView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f48471c = 0.0f;
        this.f48472d = new Path();
        this.f48473e = new RectF();
        m72134a();
    }

    /* JADX INFO: renamed from: a */
    public final void m72134a() {
        Paint paint = new Paint();
        this.f48469a = paint;
        paint.setAntiAlias(true);
        this.f48470b = BitmapFactory.decodeResource(getResources(), i3c0.f110964c2);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.clipPath(this.f48472d);
        Bitmap bitmap = this.f48470b;
        canvas.drawBitmap(bitmap, (-bitmap.getWidth()) + ((this.f48470b.getWidth() + getMeasuredWidth()) * this.f48471c), 0.0f, this.f48469a);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f48472d.reset();
        this.f48473e.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        this.f48472d.addRoundRect(this.f48473e, t100.m186890d(18.0f), t100.m186890d(18.0f), Path.Direction.CW);
    }

    public void setProcess(@FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 1.0d) float f) {
        this.f48471c = f;
        requestLayout();
    }

    public AvatarShineView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AvatarShineView(@NonNull Context context) {
        this(context, null);
    }
}
