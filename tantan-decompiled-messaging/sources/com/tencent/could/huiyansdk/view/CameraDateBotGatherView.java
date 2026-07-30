package com.tencent.could.huiyansdk.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Region;
import android.hardware.Camera;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.renderscript.ScriptIntrinsicYuvToRGB;
import android.renderscript.Type;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.tencent.cloud.turingempty.C13801R;
import com.tencent.could.aicamare.CameraHolder;
import com.tencent.could.huiyansdk.base.HuiYanBaseApi;
import com.tencent.could.huiyansdk.manager.C13905e;
import com.tencent.could.huiyansdk.turing.InterfaceC13919a;

/* JADX INFO: loaded from: classes2.dex */
public class CameraDateBotGatherView extends RelativeLayout implements SurfaceHolder.Callback, InterfaceC13919a {

    /* JADX INFO: renamed from: a */
    public ImageView f57531a;

    /* JADX INFO: renamed from: b */
    public SurfaceView f57532b;

    /* JADX INFO: renamed from: c */
    public SurfaceHolder f57533c;

    /* JADX INFO: renamed from: d */
    public int f57534d;

    /* JADX INFO: renamed from: e */
    public int f57535e;

    /* JADX INFO: renamed from: f */
    public int f57536f;

    /* JADX INFO: renamed from: g */
    public Point f57537g;

    /* JADX INFO: renamed from: h */
    public Path f57538h;

    /* JADX INFO: renamed from: i */
    public CameraHolder f57539i;

    /* JADX INFO: renamed from: j */
    public int f57540j;

    /* JADX INFO: renamed from: k */
    public int f57541k;

    /* JADX INFO: renamed from: l */
    public RenderScript f57542l;

    /* JADX INFO: renamed from: m */
    public ScriptIntrinsicYuvToRGB f57543m;

    /* JADX INFO: renamed from: n */
    public ScriptIntrinsicBlur f57544n;

    /* JADX INFO: renamed from: o */
    public Type.Builder f57545o;

    /* JADX INFO: renamed from: p */
    public Type.Builder f57546p;

    /* JADX INFO: renamed from: q */
    public Allocation f57547q;

    /* JADX INFO: renamed from: r */
    public Allocation f57548r;

    /* JADX INFO: renamed from: s */
    public Allocation f57549s;

    /* JADX INFO: renamed from: t */
    public HandlerThread f57550t;

    /* JADX INFO: renamed from: u */
    public volatile Handler f57551u;

    /* JADX INFO: renamed from: com.tencent.could.huiyansdk.view.CameraDateBotGatherView$a */
    public class RunnableC13940a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Bitmap f57552a;

        public RunnableC13940a(Bitmap bitmap) {
            this.f57552a = bitmap;
        }

        @Override // java.lang.Runnable
        public void run() {
            Bitmap bitmap = this.f57552a;
            if (bitmap != null) {
                CameraDateBotGatherView.this.f57531a.setImageBitmap(bitmap);
            }
        }
    }

    public CameraDateBotGatherView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f57540j = 0;
        this.f57541k = 0;
        m82415a(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m82414a(byte[] bArr) {
        Bitmap bitmap;
        int i = this.f57540j / 2;
        int i2 = this.f57541k / 2;
        Bitmap bitmapCreateBitmap = null;
        try {
            if (this.f57545o == null) {
                RenderScript renderScript = this.f57542l;
                Type.Builder x = new Type.Builder(renderScript, Element.U8(renderScript)).setX(bArr.length);
                this.f57545o = x;
                this.f57547q = Allocation.createTyped(this.f57542l, x.create(), 1);
                RenderScript renderScript2 = this.f57542l;
                Type.Builder y = new Type.Builder(renderScript2, Element.RGBA_8888(renderScript2)).setX(i).setY(i2);
                this.f57546p = y;
                Allocation allocationCreateTyped = Allocation.createTyped(this.f57542l, y.create(), 1);
                this.f57548r = allocationCreateTyped;
                this.f57549s = Allocation.createTyped(this.f57542l, allocationCreateTyped.getType());
            }
            this.f57547q.copyFrom(bArr);
            this.f57543m.setInput(this.f57547q);
            this.f57543m.forEach(this.f57548r);
            this.f57544n.setRadius(7.5f);
            this.f57544n.setInput(this.f57548r);
            this.f57544n.forEach(this.f57549s);
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            this.f57549s.copyTo(bitmapCreateBitmap2);
            bitmap = bitmapCreateBitmap2;
        } catch (Exception e) {
            e = e;
            Log.e("CameraDateBotGatherView", "nv21ToBitmap happen some error: " + e.getLocalizedMessage());
            bitmap = null;
        } catch (OutOfMemoryError e2) {
            e = e2;
            Log.e("CameraDateBotGatherView", "nv21ToBitmap happen some error: " + e.getLocalizedMessage());
            bitmap = null;
        }
        synchronized (C13941a.class) {
        }
        if (bitmap != null) {
            Matrix matrix = new Matrix();
            matrix.postRotate(90.0f);
            matrix.postScale(0.2f, -0.2f);
            try {
                bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                if (bitmapCreateBitmap == null) {
                    bitmapCreateBitmap = bitmap;
                } else {
                    bitmap.recycle();
                }
            } catch (OutOfMemoryError e3) {
                Log.e("CameraDateBotGatherView", "rotateBitmapByDegree  OutOfMemoryError: " + e3.getLocalizedMessage());
            }
        }
        ImageView imageView = this.f57531a;
        if (imageView != null) {
            imageView.post(new RunnableC13940a(bitmapCreateBitmap));
        }
    }

    /* JADX INFO: renamed from: b */
    public void m82417b(byte[] bArr) {
        try {
            if (this.f57541k == 0 || this.f57540j == 0) {
                Camera.Size cameraSize = this.f57539i.getCameraSize();
                this.f57540j = cameraSize.width;
                this.f57541k = cameraSize.height;
            }
            final byte[] bArrM82416a = m82416a(bArr, this.f57540j, this.f57541k);
            this.f57551u.post(new Runnable() { // from class: l.r84
                @Override // java.lang.Runnable
                public final void run() {
                    this.f158121a.m82414a(bArrM82416a);
                }
            });
        } catch (Exception e) {
            Log.e("CameraDateBotGatherView", "frame error! " + e.getLocalizedMessage());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int i = Build.VERSION.SDK_INT;
        Path path = this.f57538h;
        if (i >= 26) {
            canvas.clipPath(path);
        } else {
            canvas.clipPath(path, Region.Op.REPLACE);
        }
        super.dispatchDraw(canvas);
    }

    public View getTuringPreviewView() {
        return this.f57532b;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f57534d = View.MeasureSpec.getSize(i);
        int size = View.MeasureSpec.getSize(i2);
        this.f57535e = size;
        Point point = this.f57537g;
        int i3 = this.f57534d >> 1;
        point.x = i3;
        int i4 = size >> 1;
        point.y = i4;
        if (i3 > i4) {
            i3 = i4;
        }
        this.f57536f = i3;
        this.f57538h.reset();
        Path path = this.f57538h;
        Point point2 = this.f57537g;
        path.addCircle(point2.x, point2.y, this.f57536f, Path.Direction.CCW);
        this.f57536f -= Math.round(getResources().getDisplayMetrics().density * 1.9f);
        setMeasuredDimension(this.f57534d, this.f57535e);
    }

    @Override // com.tencent.could.huiyansdk.turing.InterfaceC13919a
    public void setCameraHolder(CameraHolder cameraHolder) {
        this.f57539i = cameraHolder;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f57533c = surfaceHolder;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    }

    public CameraDateBotGatherView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CameraDateBotGatherView(Context context) {
        this(context, null);
    }

    @Override // com.tencent.could.huiyansdk.turing.InterfaceC13919a
    /* JADX INFO: renamed from: a */
    public void mo82378a() {
        SurfaceHolder surfaceHolder;
        C13905e.a.f57445a.m82337a(1, "CameraDateBotGatherView", "start preview");
        CameraHolder cameraHolder = this.f57539i;
        if (cameraHolder == null || (surfaceHolder = this.f57533c) == null) {
            return;
        }
        cameraHolder.startPreview(surfaceHolder);
    }

    /* JADX INFO: renamed from: a */
    public final void m82415a(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(context.getResources().getLayout(C13801R.layout.txy_camera_camera_bot_view_layout), this);
        if (viewInflate == null) {
            C13905e.a.f57445a.m82337a(2, "CameraDateBotGatherView", "create view is null!");
            return;
        }
        this.f57531a = (ImageView) viewInflate.findViewById(C13801R.id.txy_huiyan_bot_image_view);
        SurfaceView surfaceView = (SurfaceView) viewInflate.findViewById(C13801R.id.txy_bot_turing_view);
        this.f57532b = surfaceView;
        if (surfaceView != null) {
            SurfaceHolder holder = surfaceView.getHolder();
            this.f57533c = holder;
            holder.addCallback(this);
        }
        this.f57537g = new Point();
        this.f57538h = new Path();
        RenderScript renderScriptCreate = RenderScript.create(HuiYanBaseApi.C13881a.f57357a.m82240a());
        this.f57542l = renderScriptCreate;
        this.f57543m = ScriptIntrinsicYuvToRGB.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
        RenderScript renderScript = this.f57542l;
        this.f57544n = ScriptIntrinsicBlur.create(renderScript, Element.U8_4(renderScript));
        HandlerThread handlerThread = new HandlerThread("blur-image");
        this.f57550t = handlerThread;
        handlerThread.start();
        this.f57551u = new Handler(this.f57550t.getLooper());
    }

    /* JADX INFO: renamed from: a */
    public byte[] m82416a(byte[] bArr, int i, int i2) {
        int i3 = i / 2;
        int i4 = i2 / 2;
        synchronized (C13941a.class) {
        }
        byte[] bArr2 = new byte[((i3 * i4) * 3) / 2];
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6 += 2) {
            for (int i7 = 0; i7 < i; i7 += 2) {
                bArr2[i5] = bArr[(i6 * i) + i7];
                i5++;
            }
        }
        for (int i8 = 0; i8 < i4; i8 += 2) {
            for (int i9 = 0; i9 < i; i9 += 4) {
                int i10 = (i * i2) + (i8 * i);
                bArr2[i5] = bArr[i10 + i9];
                bArr2[i5 + 1] = bArr[i10 + i9 + 1];
                i5 += 2;
            }
        }
        return bArr2;
    }
}
