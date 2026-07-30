package com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker;

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
import p153l.iam;
import p153l.pae;
import p153l.qa00;
import p153l.w7u;

/* JADX INFO: loaded from: classes4.dex */
public class LiveStickerDragMask extends FrameLayout implements iam<w7u> {

    /* JADX INFO: renamed from: a */
    public Paint f49541a;

    /* JADX INFO: renamed from: b */
    public Paint f49542b;

    /* JADX INFO: renamed from: c */
    public Path f49543c;

    /* JADX INFO: renamed from: d */
    public boolean f49544d;

    /* JADX INFO: renamed from: e */
    public w7u f49545e;

    /* JADX INFO: renamed from: f */
    public int f49546f;

    public LiveStickerDragMask(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f49546f = pae.m171419b();
    }

    private void init() {
        Paint paint = new Paint();
        this.f49541a = paint;
        paint.setAntiAlias(true);
        this.f49541a.setStrokeWidth(qa00.f156314a);
        this.f49541a.setColor(-1711276033);
        this.f49541a.setStyle(Paint.Style.STROKE);
        Paint paint2 = new Paint();
        this.f49542b = paint2;
        paint2.setAntiAlias(true);
        this.f49542b.setColor(701975863);
        this.f49542b.setStyle(Paint.Style.FILL);
        this.f49543c = new Path();
        int i = qa00.f156319f;
        this.f49541a.setPathEffect(new DashPathEffect(new float[]{i, i}, 0.0f));
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(w7u w7uVar) {
        this.f49545e = w7uVar;
    }

    /* JADX INFO: renamed from: b */
    public void m73504b(int i) {
        this.f49546f = i;
    }

    @Override // p153l.iam
    public void destroy() {
        this.f49546f = pae.m171419b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f49544d) {
            this.f49543c.reset();
            int height = (getHeight() - qa00.m175859d(266.0f)) - 1;
            int i = this.f49546f + 1;
            float f = height;
            this.f49543c.moveTo(0.0f, f);
            float f2 = i;
            this.f49543c.lineTo(f2, f);
            float height2 = (getHeight() - qa00.m175859d(60.0f)) - 1;
            this.f49543c.lineTo(f2, height2);
            this.f49543c.lineTo(getWidth(), height2);
            canvas.drawPath(this.f49543c, this.f49541a);
            this.f49543c.lineTo(getWidth(), getHeight());
            this.f49543c.lineTo(0.0f, getHeight());
            this.f49543c.lineTo(0.0f, f);
            canvas.drawPath(this.f49543c, this.f49542b);
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        init();
    }

    public void setMaskVisibility(boolean z) {
        if (z != this.f49544d) {
            this.f49544d = z;
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
