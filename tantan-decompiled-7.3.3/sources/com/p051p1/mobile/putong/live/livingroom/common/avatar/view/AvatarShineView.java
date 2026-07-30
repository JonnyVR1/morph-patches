package com.p051p1.mobile.putong.live.livingroom.common.avatar.view;

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
import p153l.obc0;
import p153l.qa00;

/* JADX INFO: loaded from: classes4.dex */
public class AvatarShineView extends View {

    /* JADX INFO: renamed from: a */
    public Paint f49317a;

    /* JADX INFO: renamed from: b */
    public Bitmap f49318b;

    /* JADX INFO: renamed from: c */
    public float f49319c;

    /* JADX INFO: renamed from: d */
    public Path f49320d;

    /* JADX INFO: renamed from: e */
    public RectF f49321e;

    public AvatarShineView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f49319c = 0.0f;
        this.f49320d = new Path();
        this.f49321e = new RectF();
        m73317a();
    }

    /* JADX INFO: renamed from: a */
    public final void m73317a() {
        Paint paint = new Paint();
        this.f49317a = paint;
        paint.setAntiAlias(true);
        this.f49318b = BitmapFactory.decodeResource(getResources(), obc0.f146292c2);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.clipPath(this.f49320d);
        Bitmap bitmap = this.f49318b;
        canvas.drawBitmap(bitmap, (-bitmap.getWidth()) + ((this.f49318b.getWidth() + getMeasuredWidth()) * this.f49319c), 0.0f, this.f49317a);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f49320d.reset();
        this.f49321e.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        this.f49320d.addRoundRect(this.f49321e, qa00.m175859d(18.0f), qa00.m175859d(18.0f), Path.Direction.CW);
    }

    public void setProcess(@FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 1.0d) float f) {
        this.f49319c = f;
        requestLayout();
    }

    public AvatarShineView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AvatarShineView(@NonNull Context context) {
        this(context, null);
    }
}
