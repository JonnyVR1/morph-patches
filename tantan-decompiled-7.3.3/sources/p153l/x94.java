package p153l;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Build;
import android.os.Handler;
import android.view.SurfaceHolder;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class x94 {

    /* JADX INFO: renamed from: k */
    public static int f192898k = -1;

    /* JADX INFO: renamed from: l */
    public static int f192899l = -1;

    /* JADX INFO: renamed from: m */
    public static int f192900m = -1;

    /* JADX INFO: renamed from: n */
    private static x94 f192901n;

    /* JADX INFO: renamed from: o */
    static final int f192902o;

    /* JADX INFO: renamed from: a */
    private final Context f192903a;

    /* JADX INFO: renamed from: b */
    private final m94 f192904b;

    /* JADX INFO: renamed from: c */
    private Camera f192905c;

    /* JADX INFO: renamed from: d */
    private Rect f192906d;

    /* JADX INFO: renamed from: e */
    private Rect f192907e;

    /* JADX INFO: renamed from: f */
    private boolean f192908f;

    /* JADX INFO: renamed from: g */
    private boolean f192909g;

    /* JADX INFO: renamed from: h */
    private final boolean f192910h;

    /* JADX INFO: renamed from: i */
    private final oq80 f192911i;

    /* JADX INFO: renamed from: j */
    private final te1 f192912j;

    static {
        int i;
        try {
            i = Integer.parseInt(Build.VERSION.SDK);
        } catch (NumberFormatException unused) {
            i = 10000;
        }
        f192902o = i;
    }

    private x94(Context context) {
        this.f192903a = context;
        m94 m94Var = new m94(context);
        this.f192904b = m94Var;
        boolean z = Integer.parseInt(Build.VERSION.SDK) > 3;
        this.f192910h = z;
        this.f192911i = new oq80(m94Var, z);
        this.f192912j = new te1();
    }

    /* JADX INFO: renamed from: c */
    public static x94 m209763c() {
        return f192901n;
    }

    /* JADX INFO: renamed from: i */
    public static void m209764i(Context context) {
        if (f192901n == null) {
            f192901n = new x94(context);
        }
    }

    /* JADX INFO: renamed from: a */
    public vc80 m209765a(byte[] bArr, int i, int i2) {
        Rect rectM209770g = m209770g();
        int iM157555e = this.f192904b.m157555e();
        String strM157556f = this.f192904b.m157556f();
        if (iM157555e == 16 || iM157555e == 17) {
            return new vc80(bArr, i, i2, rectM209770g.left, rectM209770g.top, rectM209770g.width(), rectM209770g.height());
        }
        if ("yuv420p".equals(strM157556f)) {
            return new vc80(bArr, i, i2, rectM209770g.left, rectM209770g.top, rectM209770g.width(), rectM209770g.height());
        }
        throw new IllegalArgumentException("Unsupported picture format: " + iM157555e + '/' + strM157556f);
    }

    /* JADX INFO: renamed from: b */
    public void m209766b() {
        if (this.f192905c != null) {
            tsi.m192609a();
            this.f192905c.release();
            this.f192905c = null;
        }
    }

    /* JADX INFO: renamed from: d */
    public te1 m209767d() {
        return this.f192912j;
    }

    /* JADX INFO: renamed from: e */
    public Camera m209768e() {
        return this.f192905c;
    }

    /* JADX INFO: renamed from: f */
    public Rect m209769f() {
        try {
            Point pointM157557g = this.f192904b.m157557g();
            if (this.f192905c == null) {
                return null;
            }
            int i = (pointM157557g.x - f192898k) / 2;
            int i2 = f192900m;
            if (i2 == -1) {
                i2 = (pointM157557g.y - f192899l) / 2;
            }
            Rect rect = new Rect(i, i2, f192898k + i, f192899l + i2);
            this.f192906d = rect;
            return rect;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public Rect m209770g() {
        if (this.f192907e == null) {
            Rect rect = new Rect(m209769f());
            Point pointM157554c = this.f192904b.m157554c();
            Point pointM157557g = this.f192904b.m157557g();
            int i = rect.left;
            int i2 = pointM157554c.y;
            int i3 = pointM157557g.x;
            rect.left = (i * i2) / i3;
            rect.right = (rect.right * i2) / i3;
            int i4 = rect.top;
            int i5 = pointM157554c.x;
            int i6 = pointM157557g.y;
            rect.top = (i4 * i5) / i6;
            rect.bottom = (rect.bottom * i5) / i6;
            this.f192907e = rect;
        }
        return this.f192907e;
    }

    /* JADX INFO: renamed from: h */
    public oq80 m209771h() {
        return this.f192911i;
    }

    /* JADX INFO: renamed from: j */
    public boolean m209772j() {
        return this.f192909g;
    }

    /* JADX INFO: renamed from: k */
    public boolean m209773k() {
        return this.f192910h;
    }

    /* JADX INFO: renamed from: l */
    public void m209774l(SurfaceHolder surfaceHolder) throws IOException {
        if (this.f192905c == null) {
            Camera cameraOpen = Camera.open();
            this.f192905c = cameraOpen;
            if (cameraOpen == null) {
                throw new IOException();
            }
            cameraOpen.setPreviewDisplay(surfaceHolder);
            if (!this.f192908f) {
                this.f192908f = true;
                this.f192904b.m157558h(this.f192905c);
            }
            this.f192904b.m157559i(this.f192905c);
            tsi.m192610b();
        }
    }

    /* JADX INFO: renamed from: m */
    public void m209775m(Handler handler, int i) {
        if (this.f192905c == null || !this.f192909g) {
            return;
        }
        this.f192912j.m190675a(handler, i);
        this.f192905c.autoFocus(this.f192912j);
    }

    /* JADX INFO: renamed from: n */
    public void m209776n(Handler handler, int i) {
        if (this.f192905c == null || !this.f192909g) {
            return;
        }
        this.f192911i.m168798a(handler, i);
        boolean z = this.f192910h;
        Camera camera = this.f192905c;
        if (z) {
            camera.setOneShotPreviewCallback(this.f192911i);
        } else {
            camera.setPreviewCallback(this.f192911i);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m209777o(boolean z) {
        this.f192909g = z;
    }

    /* JADX INFO: renamed from: p */
    public void m209778p() {
        Camera camera = this.f192905c;
        if (camera == null || this.f192909g) {
            return;
        }
        camera.startPreview();
        this.f192909g = true;
    }

    /* JADX INFO: renamed from: q */
    public void m209779q() {
        Camera camera = this.f192905c;
        if (camera == null || !this.f192909g) {
            return;
        }
        if (!this.f192910h) {
            camera.setPreviewCallback(null);
        }
        this.f192905c.stopPreview();
        this.f192911i.m168798a(null, 0);
        this.f192912j.m190675a(null, 0);
        this.f192909g = false;
    }
}
