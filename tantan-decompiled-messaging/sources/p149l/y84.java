package p149l;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Build;
import android.os.Handler;
import android.view.SurfaceHolder;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class y84 {

    /* JADX INFO: renamed from: k */
    public static int f196762k = -1;

    /* JADX INFO: renamed from: l */
    public static int f196763l = -1;

    /* JADX INFO: renamed from: m */
    public static int f196764m = -1;

    /* JADX INFO: renamed from: n */
    private static y84 f196765n;

    /* JADX INFO: renamed from: o */
    static final int f196766o;

    /* JADX INFO: renamed from: a */
    private final Context f196767a;

    /* JADX INFO: renamed from: b */
    private final n84 f196768b;

    /* JADX INFO: renamed from: c */
    private Camera f196769c;

    /* JADX INFO: renamed from: d */
    private Rect f196770d;

    /* JADX INFO: renamed from: e */
    private Rect f196771e;

    /* JADX INFO: renamed from: f */
    private boolean f196772f;

    /* JADX INFO: renamed from: g */
    private boolean f196773g;

    /* JADX INFO: renamed from: h */
    private final boolean f196774h;

    /* JADX INFO: renamed from: i */
    private final ki80 f196775i;

    /* JADX INFO: renamed from: j */
    private final me1 f196776j;

    static {
        int i;
        try {
            i = Integer.parseInt(Build.VERSION.SDK);
        } catch (NumberFormatException unused) {
            i = 10000;
        }
        f196766o = i;
    }

    private y84(Context context) {
        this.f196767a = context;
        n84 n84Var = new n84(context);
        this.f196768b = n84Var;
        boolean z = Integer.parseInt(Build.VERSION.SDK) > 3;
        this.f196774h = z;
        this.f196775i = new ki80(n84Var, z);
        this.f196776j = new me1();
    }

    /* JADX INFO: renamed from: c */
    public static y84 m213344c() {
        return f196765n;
    }

    /* JADX INFO: renamed from: i */
    public static void m213345i(Context context) {
        if (f196765n == null) {
            f196765n = new y84(context);
        }
    }

    /* JADX INFO: renamed from: a */
    public p480 m213346a(byte[] bArr, int i, int i2) {
        Rect rectM213351g = m213351g();
        int iM158183e = this.f196768b.m158183e();
        String strM158184f = this.f196768b.m158184f();
        if (iM158183e == 16 || iM158183e == 17) {
            return new p480(bArr, i, i2, rectM213351g.left, rectM213351g.top, rectM213351g.width(), rectM213351g.height());
        }
        if ("yuv420p".equals(strM158184f)) {
            return new p480(bArr, i, i2, rectM213351g.left, rectM213351g.top, rectM213351g.width(), rectM213351g.height());
        }
        throw new IllegalArgumentException("Unsupported picture format: " + iM158183e + '/' + strM158184f);
    }

    /* JADX INFO: renamed from: b */
    public void m213347b() {
        if (this.f196769c != null) {
            xpi.m210495a();
            this.f196769c.release();
            this.f196769c = null;
        }
    }

    /* JADX INFO: renamed from: d */
    public me1 m213348d() {
        return this.f196776j;
    }

    /* JADX INFO: renamed from: e */
    public Camera m213349e() {
        return this.f196769c;
    }

    /* JADX INFO: renamed from: f */
    public Rect m213350f() {
        try {
            Point pointM158185g = this.f196768b.m158185g();
            if (this.f196769c == null) {
                return null;
            }
            int i = (pointM158185g.x - f196762k) / 2;
            int i2 = f196764m;
            if (i2 == -1) {
                i2 = (pointM158185g.y - f196763l) / 2;
            }
            Rect rect = new Rect(i, i2, f196762k + i, f196763l + i2);
            this.f196770d = rect;
            return rect;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public Rect m213351g() {
        if (this.f196771e == null) {
            Rect rect = new Rect(m213350f());
            Point pointM158182c = this.f196768b.m158182c();
            Point pointM158185g = this.f196768b.m158185g();
            int i = rect.left;
            int i2 = pointM158182c.y;
            int i3 = pointM158185g.x;
            rect.left = (i * i2) / i3;
            rect.right = (rect.right * i2) / i3;
            int i4 = rect.top;
            int i5 = pointM158182c.x;
            int i6 = pointM158185g.y;
            rect.top = (i4 * i5) / i6;
            rect.bottom = (rect.bottom * i5) / i6;
            this.f196771e = rect;
        }
        return this.f196771e;
    }

    /* JADX INFO: renamed from: h */
    public ki80 m213352h() {
        return this.f196775i;
    }

    /* JADX INFO: renamed from: j */
    public boolean m213353j() {
        return this.f196773g;
    }

    /* JADX INFO: renamed from: k */
    public boolean m213354k() {
        return this.f196774h;
    }

    /* JADX INFO: renamed from: l */
    public void m213355l(SurfaceHolder surfaceHolder) throws IOException {
        if (this.f196769c == null) {
            Camera cameraOpen = Camera.open();
            this.f196769c = cameraOpen;
            if (cameraOpen == null) {
                throw new IOException();
            }
            cameraOpen.setPreviewDisplay(surfaceHolder);
            if (!this.f196772f) {
                this.f196772f = true;
                this.f196768b.m158186h(this.f196769c);
            }
            this.f196768b.m158187i(this.f196769c);
            xpi.m210496b();
        }
    }

    /* JADX INFO: renamed from: m */
    public void m213356m(Handler handler, int i) {
        if (this.f196769c == null || !this.f196773g) {
            return;
        }
        this.f196776j.m154110a(handler, i);
        this.f196769c.autoFocus(this.f196776j);
    }

    /* JADX INFO: renamed from: n */
    public void m213357n(Handler handler, int i) {
        if (this.f196769c == null || !this.f196773g) {
            return;
        }
        this.f196775i.m146054a(handler, i);
        boolean z = this.f196774h;
        Camera camera = this.f196769c;
        if (z) {
            camera.setOneShotPreviewCallback(this.f196775i);
        } else {
            camera.setPreviewCallback(this.f196775i);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m213358o(boolean z) {
        this.f196773g = z;
    }

    /* JADX INFO: renamed from: p */
    public void m213359p() {
        Camera camera = this.f196769c;
        if (camera == null || this.f196773g) {
            return;
        }
        camera.startPreview();
        this.f196773g = true;
    }

    /* JADX INFO: renamed from: q */
    public void m213360q() {
        Camera camera = this.f196769c;
        if (camera == null || !this.f196773g) {
            return;
        }
        if (!this.f196774h) {
            camera.setPreviewCallback(null);
        }
        this.f196769c.stopPreview();
        this.f196775i.m146054a(null, 0);
        this.f196776j.m154110a(null, 0);
        this.f196773g = false;
    }
}
