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
import com.tencent.cloud.turingempty.C13964R;
import com.tencent.could.aicamare.CameraHolder;
import com.tencent.could.huiyansdk.base.HuiYanBaseApi;
import com.tencent.could.huiyansdk.manager.C14068e;
import com.tencent.could.huiyansdk.turing.InterfaceC14082a;

/* JADX INFO: loaded from: classes12.dex */
public class CameraDateBotGatherView extends RelativeLayout implements SurfaceHolder.Callback, InterfaceC14082a {

    /* JADX INFO: renamed from: a */
    public ImageView f58379a;

    /* JADX INFO: renamed from: b */
    public SurfaceView f58380b;

    /* JADX INFO: renamed from: c */
    public SurfaceHolder f58381c;

    /* JADX INFO: renamed from: d */
    public int f58382d;

    /* JADX INFO: renamed from: e */
    public int f58383e;

    /* JADX INFO: renamed from: f */
    public int f58384f;

    /* JADX INFO: renamed from: g */
    public Point f58385g;

    /* JADX INFO: renamed from: h */
    public Path f58386h;

    /* JADX INFO: renamed from: i */
    public CameraHolder f58387i;

    /* JADX INFO: renamed from: j */
    public int f58388j;

    /* JADX INFO: renamed from: k */
    public int f58389k;

    /* JADX INFO: renamed from: l */
    public RenderScript f58390l;

    /* JADX INFO: renamed from: m */
    public ScriptIntrinsicYuvToRGB f58391m;

    /* JADX INFO: renamed from: n */
    public ScriptIntrinsicBlur f58392n;

    /* JADX INFO: renamed from: o */
    public Type.Builder f58393o;

    /* JADX INFO: renamed from: p */
    public Type.Builder f58394p;

    /* JADX INFO: renamed from: q */
    public Allocation f58395q;

    /* JADX INFO: renamed from: r */
    public Allocation f58396r;

    /* JADX INFO: renamed from: s */
    public Allocation f58397s;

    /* JADX INFO: renamed from: t */
    public HandlerThread f58398t;

    /* JADX INFO: renamed from: u */
    public volatile Handler f58399u;

    /* JADX INFO: renamed from: com.tencent.could.huiyansdk.view.CameraDateBotGatherView$a */
    public class RunnableC14103a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Bitmap f58400a;

        public RunnableC14103a(Bitmap bitmap) {
            this.f58400a = bitmap;
        }

        @Override // java.lang.Runnable
        public void run() {
            Bitmap bitmap = this.f58400a;
            if (bitmap != null) {
                CameraDateBotGatherView.this.f58379a.setImageBitmap(bitmap);
            }
        }
    }

    public CameraDateBotGatherView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f58388j = 0;
        this.f58389k = 0;
        m83598a(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m83597a(byte[] bArr) {
        Bitmap bitmap;
        int i = this.f58388j / 2;
        int i2 = this.f58389k / 2;
        Bitmap bitmapCreateBitmap = null;
        try {
            if (this.f58393o == null) {
                RenderScript renderScript = this.f58390l;
                Type.Builder x = new Type.Builder(renderScript, Element.U8(renderScript)).setX(bArr.length);
                this.f58393o = x;
                this.f58395q = Allocation.createTyped(this.f58390l, x.create(), 1);
                RenderScript renderScript2 = this.f58390l;
                Type.Builder y = new Type.Builder(renderScript2, Element.RGBA_8888(renderScript2)).setX(i).setY(i2);
                this.f58394p = y;
                Allocation allocationCreateTyped = Allocation.createTyped(this.f58390l, y.create(), 1);
                this.f58396r = allocationCreateTyped;
                this.f58397s = Allocation.createTyped(this.f58390l, allocationCreateTyped.getType());
            }
            this.f58395q.copyFrom(bArr);
            this.f58391m.setInput(this.f58395q);
            this.f58391m.forEach(this.f58396r);
            this.f58392n.setRadius(7.5f);
            this.f58392n.setInput(this.f58396r);
            this.f58392n.forEach(this.f58397s);
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            this.f58397s.copyTo(bitmapCreateBitmap2);
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
        synchronized (C14104a.class) {
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
        ImageView imageView = this.f58379a;
        if (imageView != null) {
            imageView.post(new RunnableC14103a(bitmapCreateBitmap));
        }
    }

    /* JADX INFO: renamed from: b */
    public void m83600b(byte[] bArr) {
        try {
            if (this.f58389k == 0 || this.f58388j == 0) {
                Camera.Size cameraSize = this.f58387i.getCameraSize();
                this.f58388j = cameraSize.width;
                this.f58389k = cameraSize.height;
            }
            final byte[] bArrM83599a = m83599a(bArr, this.f58388j, this.f58389k);
            this.f58399u.post(new Runnable() { // from class: l.q94
                @Override // java.lang.Runnable
                public final void run() {
                    this.f156190a.m83597a(bArrM83599a);
                }
            });
        } catch (Exception e) {
            Log.e("CameraDateBotGatherView", "frame error! " + e.getLocalizedMessage());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int i = Build.VERSION.SDK_INT;
        Path path = this.f58386h;
        if (i >= 26) {
            canvas.clipPath(path);
        } else {
            canvas.clipPath(path, Region.Op.REPLACE);
        }
        super.dispatchDraw(canvas);
    }

    public View getTuringPreviewView() {
        return this.f58380b;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f58382d = View.MeasureSpec.getSize(i);
        int size = View.MeasureSpec.getSize(i2);
        this.f58383e = size;
        Point point = this.f58385g;
        int i3 = this.f58382d >> 1;
        point.x = i3;
        int i4 = size >> 1;
        point.y = i4;
        if (i3 > i4) {
            i3 = i4;
        }
        this.f58384f = i3;
        this.f58386h.reset();
        Path path = this.f58386h;
        Point point2 = this.f58385g;
        path.addCircle(point2.x, point2.y, this.f58384f, Path.Direction.CCW);
        this.f58384f -= Math.round(getResources().getDisplayMetrics().density * 1.9f);
        setMeasuredDimension(this.f58382d, this.f58383e);
    }

    @Override // com.tencent.could.huiyansdk.turing.InterfaceC14082a
    public void setCameraHolder(CameraHolder cameraHolder) {
        this.f58387i = cameraHolder;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f58381c = surfaceHolder;
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

    @Override // com.tencent.could.huiyansdk.turing.InterfaceC14082a
    /* JADX INFO: renamed from: a */
    public void mo83561a() {
        SurfaceHolder surfaceHolder;
        C14068e.a.f58293a.m83520a(1, "CameraDateBotGatherView", "start preview");
        CameraHolder cameraHolder = this.f58387i;
        if (cameraHolder == null || (surfaceHolder = this.f58381c) == null) {
            return;
        }
        cameraHolder.startPreview(surfaceHolder);
    }

    /* JADX INFO: renamed from: a */
    public final void m83598a(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(context.getResources().getLayout(C13964R.layout.txy_camera_camera_bot_view_layout), this);
        if (viewInflate == null) {
            C14068e.a.f58293a.m83520a(2, "CameraDateBotGatherView", "create view is null!");
            return;
        }
        this.f58379a = (ImageView) viewInflate.findViewById(C13964R.id.txy_huiyan_bot_image_view);
        SurfaceView surfaceView = (SurfaceView) viewInflate.findViewById(C13964R.id.txy_bot_turing_view);
        this.f58380b = surfaceView;
        if (surfaceView != null) {
            SurfaceHolder holder = surfaceView.getHolder();
            this.f58381c = holder;
            holder.addCallback(this);
        }
        this.f58385g = new Point();
        this.f58386h = new Path();
        RenderScript renderScriptCreate = RenderScript.create(HuiYanBaseApi.C14044a.f58205a.m83423a());
        this.f58390l = renderScriptCreate;
        this.f58391m = ScriptIntrinsicYuvToRGB.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
        RenderScript renderScript = this.f58390l;
        this.f58392n = ScriptIntrinsicBlur.create(renderScript, Element.U8_4(renderScript));
        HandlerThread handlerThread = new HandlerThread("blur-image");
        this.f58398t = handlerThread;
        handlerThread.start();
        this.f58399u = new Handler(this.f58398t.getLooper());
    }

    /* JADX INFO: renamed from: a */
    public byte[] m83599a(byte[] bArr, int i, int i2) {
        int i3 = i / 2;
        int i4 = i2 / 2;
        synchronized (C14104a.class) {
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
