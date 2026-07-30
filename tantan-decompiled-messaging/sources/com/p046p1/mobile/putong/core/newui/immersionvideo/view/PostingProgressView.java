package com.p046p1.mobile.putong.core.newui.immersionvideo.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import p149l.t100;

/* JADX INFO: loaded from: classes11.dex */
public class PostingProgressView extends View {

    /* JADX INFO: renamed from: a */
    public float f24173a;

    /* JADX INFO: renamed from: b */
    public Paint f24174b;

    /* JADX INFO: renamed from: c */
    @ColorInt
    public final int f24175c;

    /* JADX INFO: renamed from: d */
    @ColorInt
    public final int f24176d;

    /* JADX INFO: renamed from: e */
    public final int f24177e;

    /* JADX INFO: renamed from: f */
    public final int f24178f;

    /* JADX INFO: renamed from: g */
    public final RectF f24179g;

    /* JADX INFO: renamed from: h */
    public Path f24180h;

    /* JADX INFO: renamed from: i */
    public final Path f24181i;

    /* JADX INFO: renamed from: j */
    public int f24182j;

    /* JADX INFO: renamed from: k */
    public final RectF f24183k;

    public PostingProgressView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24173a = 0.0f;
        this.f24175c = 1308622847;
        this.f24176d = -98530;
        this.f24177e = t100.m186890d(1.5f);
        this.f24178f = t100.m186890d(11.5f);
        this.f24179g = new RectF();
        this.f24181i = new Path();
        this.f24183k = new RectF();
        m39346a();
    }

    /* JADX INFO: renamed from: a */
    public final void m39346a() {
        Paint paint = new Paint();
        this.f24174b = paint;
        paint.setAntiAlias(true);
        this.f24174b.setDither(true);
        this.f24174b.setStrokeCap(Paint.Cap.ROUND);
        this.f24174b.setStrokeWidth(this.f24177e * 2);
        this.f24174b.setStyle(Paint.Style.STROKE);
    }

    public float getProgress() {
        return this.f24173a;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (getWidth() <= 0) {
            return;
        }
        this.f24174b.setColor(1308622847);
        canvas.drawPath(this.f24180h, this.f24174b);
        if (this.f24173a >= 1.0f) {
            this.f24174b.setColor(-98530);
            canvas.drawPath(this.f24180h, this.f24174b);
            return;
        }
        this.f24181i.reset();
        this.f24174b.setColor(-98530);
        Path path = this.f24181i;
        int i = this.f24178f;
        int i2 = this.f24177e;
        path.moveTo(i + i2, i2);
        int i3 = (int) (this.f24182j * this.f24173a);
        int width = getWidth() - (this.f24177e * 2);
        int height = getHeight() - (this.f24177e * 2);
        int i4 = this.f24178f;
        int i5 = width - (i4 * 2);
        Path path2 = this.f24181i;
        if (i3 < i5) {
            path2.rLineTo(i3, 0.0f);
            canvas.drawPath(this.f24181i, this.f24174b);
            return;
        }
        path2.rLineTo(width - (i4 * 2), 0.0f);
        int i6 = (i3 - width) + (this.f24178f * 2);
        RectF rectF = this.f24183k;
        rectF.top = this.f24177e;
        rectF.right = getWidth() - this.f24177e;
        RectF rectF2 = this.f24183k;
        RectF rectF3 = this.f24179g;
        float f = rectF3.right;
        int i7 = this.f24178f;
        rectF2.left = f - (i7 * 2);
        rectF2.bottom = rectF3.top + (i7 * 2);
        int i8 = i7 * 2;
        Path path3 = this.f24181i;
        if (i6 < i8) {
            path3.arcTo(rectF2, -90.0f, (i6 * 90.0f) / (i7 * 2), true);
            canvas.drawPath(this.f24181i, this.f24174b);
            return;
        }
        path3.arcTo(rectF2, -90.0f, 90.0f, true);
        int i9 = this.f24178f;
        int i10 = i6 - (i9 * 2);
        int i11 = height - (i9 * 2);
        Path path4 = this.f24181i;
        if (i10 < i11) {
            path4.rLineTo(0.0f, i10);
            canvas.drawPath(this.f24181i, this.f24174b);
            return;
        }
        path4.rLineTo(0.0f, height - (i9 * 2));
        int i12 = (i10 - height) + (this.f24178f * 2);
        this.f24183k.right = getWidth() - this.f24177e;
        this.f24183k.bottom = getHeight() - this.f24177e;
        RectF rectF4 = this.f24183k;
        float f2 = rectF4.bottom;
        int i13 = this.f24178f;
        rectF4.top = f2 - (i13 * 2);
        rectF4.left = this.f24179g.right - (i13 * 2);
        int i14 = i13 * 2;
        Path path5 = this.f24181i;
        if (i12 < i14) {
            path5.arcTo(rectF4, 0.0f, (i12 * 90.0f) / (i13 * 2), true);
            canvas.drawPath(this.f24181i, this.f24174b);
            return;
        }
        path5.arcTo(rectF4, 0.0f, 90.0f, true);
        int i15 = this.f24178f;
        int i16 = i12 - (i15 * 2);
        int i17 = width - (i15 * 2);
        Path path6 = this.f24181i;
        if (i16 < i17) {
            path6.rLineTo(-i16, 0.0f);
            canvas.drawPath(this.f24181i, this.f24174b);
            return;
        }
        path6.rLineTo((-width) + (i15 * 2), 0.0f);
        int i18 = (i16 - width) + (this.f24178f * 2);
        RectF rectF5 = this.f24183k;
        rectF5.left = this.f24177e;
        rectF5.bottom = getHeight() - this.f24177e;
        RectF rectF6 = this.f24183k;
        float f3 = rectF6.bottom;
        int i19 = this.f24178f;
        rectF6.top = f3 - (i19 * 2);
        rectF6.right = this.f24179g.left + (i19 * 2);
        int i20 = i19 * 2;
        Path path7 = this.f24181i;
        if (i18 < i20) {
            path7.arcTo(rectF6, 90.0f, (i18 * 90.0f) / (i19 * 2), true);
            canvas.drawPath(this.f24181i, this.f24174b);
            return;
        }
        path7.arcTo(rectF6, 90.0f, 90.0f, true);
        int i21 = this.f24178f;
        int i22 = i18 - (i21 * 2);
        int i23 = height - (i21 * 2);
        Path path8 = this.f24181i;
        if (i22 < i23) {
            path8.rLineTo(0.0f, -i22);
            canvas.drawPath(this.f24181i, this.f24174b);
            return;
        }
        path8.rLineTo(0.0f, (-height) + (i21 * 2));
        int i24 = this.f24178f;
        int i25 = (i22 - height) + (i24 * 2);
        RectF rectF7 = this.f24183k;
        int i26 = this.f24177e;
        rectF7.left = i26;
        float f4 = i26;
        rectF7.top = f4;
        rectF7.bottom = f4 + (i24 * 2);
        rectF7.right = this.f24179g.left + (i24 * 2);
        int i27 = i24 * 2;
        Path path9 = this.f24181i;
        if (i25 < i27) {
            path9.arcTo(rectF7, 180.0f, (i25 * 90.0f) / (i24 * 2), true);
            canvas.drawPath(this.f24181i, this.f24174b);
        } else {
            path9.arcTo(rectF7, 180.0f, 90.0f, true);
            canvas.drawPath(this.f24181i, this.f24174b);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i <= 0 || i2 <= 0) {
            return;
        }
        RectF rectF = this.f24179g;
        int i5 = this.f24177e;
        rectF.top = i5;
        rectF.left = i5;
        rectF.right = i - i5;
        rectF.bottom = i2 - i5;
        Path path = new Path();
        this.f24180h = path;
        RectF rectF2 = this.f24179g;
        int i6 = this.f24178f;
        path.addRoundRect(rectF2, i6, i6, Path.Direction.CW);
        this.f24182j = (i * 2) + (i2 * 2);
    }

    public void setProgress(@FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 1.0d) float f) {
        this.f24173a = f;
        invalidate();
    }

    public PostingProgressView(Context context) {
        this(context, null);
    }
}
