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
import com.tencent.could.huiyansdk.turing.InterfaceC14082a;

/* JADX INFO: loaded from: classes12.dex */
public class CameraDateGatherView extends SurfaceView implements SurfaceHolder.Callback, InterfaceC14082a {

    /* JADX INFO: renamed from: a */
    public int f58402a;

    /* JADX INFO: renamed from: b */
    public int f58403b;

    /* JADX INFO: renamed from: c */
    public int f58404c;

    /* JADX INFO: renamed from: d */
    public Point f58405d;

    /* JADX INFO: renamed from: e */
    public Path f58406e;

    /* JADX INFO: renamed from: f */
    public SurfaceHolder f58407f;

    /* JADX INFO: renamed from: g */
    public CameraHolder f58408g;

    public CameraDateGatherView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m83601b();
    }

    @Override // com.tencent.could.huiyansdk.turing.InterfaceC14082a
    /* JADX INFO: renamed from: a */
    public void mo83561a() {
        SurfaceHolder surfaceHolder;
        CameraHolder cameraHolder = this.f58408g;
        if (cameraHolder == null || (surfaceHolder = this.f58407f) == null) {
            return;
        }
        cameraHolder.startPreview(surfaceHolder);
    }

    /* JADX INFO: renamed from: b */
    public final void m83601b() {
        SurfaceHolder holder = getHolder();
        this.f58407f = holder;
        holder.addCallback(this);
        this.f58405d = new Point();
        this.f58406e = new Path();
    }

    @Override // android.view.SurfaceView, android.view.View
    public void draw(Canvas canvas) {
        int i = Build.VERSION.SDK_INT;
        Path path = this.f58406e;
        if (i >= 26) {
            canvas.clipPath(path);
        } else {
            canvas.clipPath(path, Region.Op.REPLACE);
        }
        super.draw(canvas);
    }

    public int getViewHeight() {
        return this.f58403b;
    }

    public int getViewWidth() {
        return this.f58402a;
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f58402a = View.MeasureSpec.getSize(i);
        int size = View.MeasureSpec.getSize(i2);
        this.f58403b = size;
        Point point = this.f58405d;
        int i3 = this.f58402a >> 1;
        point.x = i3;
        int i4 = size >> 1;
        point.y = i4;
        if (i3 > i4) {
            i3 = i4;
        }
        this.f58404c = i3;
        this.f58406e.reset();
        Path path = this.f58406e;
        Point point2 = this.f58405d;
        path.addCircle(point2.x, point2.y, this.f58404c, Path.Direction.CCW);
        this.f58404c -= Math.round(getResources().getDisplayMetrics().density * 1.9f);
        setMeasuredDimension(this.f58402a, this.f58403b);
    }

    @Override // com.tencent.could.huiyansdk.turing.InterfaceC14082a
    public void setCameraHolder(CameraHolder cameraHolder) {
        this.f58408g = cameraHolder;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f58407f = surfaceHolder;
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
