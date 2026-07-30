package p149l;

import android.graphics.Bitmap;
import android.media.ExifInterface;
import android.os.Build;
import com.clevertap.android.sdk.Constants;
import com.cosmos.mdlog.MDLog;
import java.io.ByteArrayInputStream;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class uuh0 {

    /* JADX INFO: renamed from: g */
    private int f178393g;

    /* JADX INFO: renamed from: i */
    rmw f178395i;

    /* JADX INFO: renamed from: a */
    private final int f178387a = 1;

    /* JADX INFO: renamed from: b */
    private final int f178388b = 16;

    /* JADX INFO: renamed from: c */
    private boolean f178389c = false;

    /* JADX INFO: renamed from: d */
    private Bitmap f178390d = null;

    /* JADX INFO: renamed from: e */
    private HashMap<String, String> f178391e = null;

    /* JADX INFO: renamed from: f */
    private String f178392f = "/sdcard/tmp.png";

    /* JADX INFO: renamed from: h */
    private boolean f178394h = false;

    /* JADX INFO: renamed from: l.uuh0$a */
    public class RunnableC20516a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f178396a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Exception f178397b;

        public RunnableC20516a(int i, Exception exc) {
            this.f178396a = i;
            this.f178397b = exc;
        }

        @Override // java.lang.Runnable
        public void run() {
            rmw rmwVar = uuh0.this.f178395i;
            if (rmwVar != null) {
                rmwVar.mo108309a(this.f178396a, this.f178397b);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m195364a() {
        this.f178391e = null;
        this.f178390d = null;
        this.f178393g = 0;
    }

    /* JADX INFO: renamed from: c */
    private void m195365c() {
        int i;
        try {
            try {
                k23.m144258c(this.f178392f, this.f178390d, this.f178391e);
                m195364a();
                e = null;
                i = 0;
            } catch (Exception e) {
                e = e;
                e.printStackTrace();
                m195364a();
                i = -1;
            }
            MDLog.m7389d("media", "Bitmap was already saved to storage, now callback with listener in sub thread [status=" + i + Constants.AES_SUFFIX);
            jpi0.m142740d(2, new RunnableC20516a(i, e));
        } catch (Throwable th) {
            m195364a();
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m195366b() {
        this.f178391e = null;
        this.f178390d = null;
        this.f178395i = null;
        this.f178389c = false;
        this.f178394h = false;
        this.f178392f = "/sdcard/tmp.png";
    }

    /* JADX INFO: renamed from: d */
    public void m195367d() {
        boolean z = this.f178389c;
        int i = this.f178393g;
        if (!z) {
            if ((i & 16) != 0) {
                m195365c();
                return;
            }
            MDLog.m7389d("media", "Status error, Do not have bitmap info [status=" + this.f178393g + Constants.AES_SUFFIX);
            return;
        }
        if (i == 17) {
            m195365c();
            return;
        }
        MDLog.m7389d("media", "[status=" + this.f178393g + "][needExif=" + this.f178389c + "][gotExif=" + this.f178394h + Constants.AES_SUFFIX);
        if (this.f178394h || (this.f178393g & 16) == 0) {
            return;
        }
        m195365c();
    }

    /* JADX INFO: renamed from: e */
    public void m195368e(Bitmap bitmap) {
        this.f178390d = bitmap;
        this.f178393g |= 16;
    }

    /* JADX INFO: renamed from: f */
    public void m195369f(HashMap<String, String> map) {
        this.f178391e = map;
        this.f178393g |= 1;
    }

    /* JADX INFO: renamed from: g */
    public void m195370g(byte[] bArr) throws Throwable {
        ExifInterface exifInterface;
        this.f178394h = true;
        try {
            if (Build.VERSION.SDK_INT > 24) {
                exifInterface = new ExifInterface(new ByteArrayInputStream(bArr));
            } else {
                nhi.m159406f(bArr, this.f178392f.replace(".png", "exif.jpg"));
                exifInterface = new ExifInterface(this.f178392f.replace(".png", "exif.jpg"));
            }
            m195369f(vim.m198585a(exifInterface));
            nhi.m159402b(this.f178392f.replace(".png", "exif.jpg"));
        } catch (Exception e) {
            MDLog.printErrStackTrace("media", e);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m195371h(String str) {
        this.f178392f = str;
    }

    /* JADX INFO: renamed from: i */
    public void m195372i(boolean z) {
        this.f178389c = z;
    }

    /* JADX INFO: renamed from: j */
    public void m195373j(rmw rmwVar) {
        this.f178395i = rmwVar;
    }
}
