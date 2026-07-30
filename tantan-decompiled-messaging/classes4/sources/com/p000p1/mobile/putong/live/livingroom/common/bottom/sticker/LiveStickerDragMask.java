package com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import l.l9e;
import l.s7m;
import l.t100;
import p002l.v5u;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveStickerDragMask extends FrameLayout implements s7m<v5u> {

    /* JADX INFO: renamed from: a */
    public Paint f4735a;

    /* JADX INFO: renamed from: b */
    public Paint f4736b;

    /* JADX INFO: renamed from: c */
    public Path f4737c;

    /* JADX INFO: renamed from: d */
    public boolean f4738d;

    /* JADX INFO: renamed from: e */
    public v5u f4739e;

    /* JADX INFO: renamed from: f */
    public int f4740f;

    public LiveStickerDragMask(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4740f = l9e.b();
    }

    private void init() {
        Paint paint = new Paint();
        this.f4735a = paint;
        paint.setAntiAlias(true);
        this.f4735a.setStrokeWidth(t100.a);
        this.f4735a.setColor(-1711276033);
        this.f4735a.setStyle(Paint.Style.STROKE);
        Paint paint2 = new Paint();
        this.f4736b = paint2;
        paint2.setAntiAlias(true);
        this.f4736b.setColor(701975863);
        this.f4736b.setStyle(Paint.Style.FILL);
        this.f4737c = new Path();
        int i = t100.f;
        this.f4735a.setPathEffect(new DashPathEffect(new float[]{i, i}, 0.0f));
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m5795C0() {
        return getContext();
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void m5798i1(v5u v5uVar) {
        this.f4739e = v5uVar;
    }

    /* JADX INFO: renamed from: b */
    public void m5797b(int i) {
        this.f4740f = i;
    }

    public void destroy() {
        this.f4740f = l9e.b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f4738d) {
            this.f4737c.reset();
            int height = (getHeight() - t100.d(266.0f)) - 1;
            int i = this.f4740f + 1;
            float f = height;
            this.f4737c.moveTo(0.0f, f);
            float f2 = i;
            this.f4737c.lineTo(f2, f);
            float height2 = (getHeight() - t100.d(60.0f)) - 1;
            this.f4737c.lineTo(f2, height2);
            this.f4737c.lineTo(getWidth(), height2);
            canvas.drawPath(this.f4737c, this.f4735a);
            this.f4737c.lineTo(getWidth(), getHeight());
            this.f4737c.lineTo(0.0f, getHeight());
            this.f4737c.lineTo(0.0f, f);
            canvas.drawPath(this.f4737c, this.f4736b);
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        init();
    }

    public void setMaskVisibility(boolean z) {
        if (z != this.f4738d) {
            this.f4738d = z;
            invalidate();
        }
    }

    public LiveStickerDragMask(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LiveStickerDragMask(Context context) {
        this(context, null);
    }
}
