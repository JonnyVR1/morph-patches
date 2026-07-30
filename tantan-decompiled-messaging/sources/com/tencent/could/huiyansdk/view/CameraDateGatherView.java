package com.tencent.could.huiyansdk.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Region;
import android.os.Build;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import com.tencent.could.aicamare.CameraHolder;
import com.tencent.could.huiyansdk.turing.InterfaceC13919a;

/* JADX INFO: loaded from: classes2.dex */
public class CameraDateGatherView extends SurfaceView implements SurfaceHolder.Callback, InterfaceC13919a {

    /* JADX INFO: renamed from: a */
    public int f57554a;

    /* JADX INFO: renamed from: b */
    public int f57555b;

    /* JADX INFO: renamed from: c */
    public int f57556c;

    /* JADX INFO: renamed from: d */
    public Point f57557d;

    /* JADX INFO: renamed from: e */
    public Path f57558e;

    /* JADX INFO: renamed from: f */
    public SurfaceHolder f57559f;

    /* JADX INFO: renamed from: g */
    public CameraHolder f57560g;

    public CameraDateGatherView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m82418b();
    }

    @Override // com.tencent.could.huiyansdk.turing.InterfaceC13919a
    /* JADX INFO: renamed from: a */
    public void mo82378a() {
        SurfaceHolder surfaceHolder;
        CameraHolder cameraHolder = this.f57560g;
        if (cameraHolder == null || (surfaceHolder = this.f57559f) == null) {
            return;
        }
        cameraHolder.startPreview(surfaceHolder);
    }

    /* JADX INFO: renamed from: b */
    public final void m82418b() {
        SurfaceHolder holder = getHolder();
        this.f57559f = holder;
        holder.addCallback(this);
        this.f57557d = new Point();
        this.f57558e = new Path();
    }

    @Override // android.view.SurfaceView, android.view.View
    public void draw(Canvas canvas) {
        int i = Build.VERSION.SDK_INT;
        Path path = this.f57558e;
        if (i >= 26) {
            canvas.clipPath(path);
        } else {
            canvas.clipPath(path, Region.Op.REPLACE);
        }
        super.draw(canvas);
    }

    public int getViewHeight() {
        return this.f57555b;
    }

    public int getViewWidth() {
        return this.f57554a;
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f57554a = View.MeasureSpec.getSize(i);
        int size = View.MeasureSpec.getSize(i2);
        this.f57555b = size;
        Point point = this.f57557d;
        int i3 = this.f57554a >> 1;
        point.x = i3;
        int i4 = size >> 1;
        point.y = i4;
        if (i3 > i4) {
            i3 = i4;
        }
        this.f57556c = i3;
        this.f57558e.reset();
        Path path = this.f57558e;
        Point point2 = this.f57557d;
        path.addCircle(point2.x, point2.y, this.f57556c, Path.Direction.CCW);
        this.f57556c -= Math.round(getResources().getDisplayMetrics().density * 1.9f);
        setMeasuredDimension(this.f57554a, this.f57555b);
    }

    @Override // com.tencent.could.huiyansdk.turing.InterfaceC13919a
    public void setCameraHolder(CameraHolder cameraHolder) {
        this.f57560g = cameraHolder;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f57559f = surfaceHolder;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    }

    public CameraDateGatherView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CameraDateGatherView(Context context) {
        this(context, null);
    }
}
