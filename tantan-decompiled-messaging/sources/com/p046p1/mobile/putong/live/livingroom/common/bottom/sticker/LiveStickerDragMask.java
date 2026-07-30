package com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker;

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
import p149l.l9e;
import p149l.s7m;
import p149l.t100;
import p149l.v5u;

/* JADX INFO: loaded from: classes4.dex */
public class LiveStickerDragMask extends FrameLayout implements s7m<v5u> {

    /* JADX INFO: renamed from: a */
    public Paint f48693a;

    /* JADX INFO: renamed from: b */
    public Paint f48694b;

    /* JADX INFO: renamed from: c */
    public Path f48695c;

    /* JADX INFO: renamed from: d */
    public boolean f48696d;

    /* JADX INFO: renamed from: e */
    public v5u f48697e;

    /* JADX INFO: renamed from: f */
    public int f48698f;

    public LiveStickerDragMask(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f48698f = l9e.m149018b();
    }

    private void init() {
        Paint paint = new Paint();
        this.f48693a = paint;
        paint.setAntiAlias(true);
        this.f48693a.setStrokeWidth(t100.f167252a);
        this.f48693a.setColor(-1711276033);
        this.f48693a.setStyle(Paint.Style.STROKE);
        Paint paint2 = new Paint();
        this.f48694b = paint2;
        paint2.setAntiAlias(true);
        this.f48694b.setColor(701975863);
        this.f48694b.setStyle(Paint.Style.FILL);
        this.f48695c = new Path();
        int i = t100.f167257f;
        this.f48693a.setPathEffect(new DashPathEffect(new float[]{i, i}, 0.0f));
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(v5u v5uVar) {
        this.f48697e = v5uVar;
    }

    /* JADX INFO: renamed from: b */
    public void m72321b(int i) {
        this.f48698f = i;
    }

    @Override // p149l.s7m
    public void destroy() {
        this.f48698f = l9e.m149018b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f48696d) {
            this.f48695c.reset();
            int height = (getHeight() - t100.m186890d(266.0f)) - 1;
            int i = this.f48698f + 1;
            float f = height;
            this.f48695c.moveTo(0.0f, f);
            float f2 = i;
            this.f48695c.lineTo(f2, f);
            float height2 = (getHeight() - t100.m186890d(60.0f)) - 1;
            this.f48695c.lineTo(f2, height2);
            this.f48695c.lineTo(getWidth(), height2);
            canvas.drawPath(this.f48695c, this.f48693a);
            this.f48695c.lineTo(getWidth(), getHeight());
            this.f48695c.lineTo(0.0f, getHeight());
            this.f48695c.lineTo(0.0f, f);
            canvas.drawPath(this.f48695c, this.f48694b);
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        init();
    }

    public void setMaskVisibility(boolean z) {
        if (z != this.f48696d) {
            this.f48696d = z;
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
