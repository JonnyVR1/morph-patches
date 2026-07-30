package p153l;

import android.graphics.Bitmap;
import android.media.ExifInterface;
import android.os.Build;
import com.clevertap.android.sdk.Constants;
import com.cosmos.mdlog.MDLog;
import java.io.ByteArrayInputStream;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class c3i0 {

    /* JADX INFO: renamed from: g */
    private int f79620g;

    /* JADX INFO: renamed from: i */
    qpw f79622i;

    /* JADX INFO: renamed from: a */
    private final int f79614a = 1;

    /* JADX INFO: renamed from: b */
    private final int f79615b = 16;

    /* JADX INFO: renamed from: c */
    private boolean f79616c = false;

    /* JADX INFO: renamed from: d */
    private Bitmap f79617d = null;

    /* JADX INFO: renamed from: e */
    private HashMap<String, String> f79618e = null;

    /* JADX INFO: renamed from: f */
    private String f79619f = "/sdcard/tmp.png";

    /* JADX INFO: renamed from: h */
    private boolean f79621h = false;

    /* JADX INFO: renamed from: l.c3i0$a */
    public class RunnableC16173a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f79623a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Exception f79624b;

        public RunnableC16173a(int i, Exception exc) {
            this.f79623a = i;
            this.f79624b = exc;
        }

        @Override // java.lang.Runnable
        public void run() {
            qpw qpwVar = c3i0.this.f79622i;
            if (qpwVar != null) {
                qpwVar.mo118030a(this.f79623a, this.f79624b);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m107794a() {
        this.f79618e = null;
        this.f79617d = null;
        this.f79620g = 0;
    }

    /* JADX INFO: renamed from: c */
    private void m107795c() {
        int i;
        try {
            try {
                a33.m95767c(this.f79619f, this.f79617d, this.f79618e);
                m107794a();
                e = null;
                i = 0;
            } catch (Exception e) {
                e = e;
                e.printStackTrace();
                m107794a();
                i = -1;
            }
            MDLog.m7443d("media", "Bitmap was already saved to storage, now callback with listener in sub thread [status=" + i + Constants.AES_SUFFIX);
            lyi0.m156289d(2, new RunnableC16173a(i, e));
        } catch (Throwable th) {
            m107794a();
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m107796b() {
        this.f79618e = null;
        this.f79617d = null;
        this.f79622i = null;
        this.f79616c = false;
        this.f79621h = false;
        this.f79619f = "/sdcard/tmp.png";
    }

    /* JADX INFO: renamed from: d */
    public void m107797d() {
        boolean z = this.f79616c;
        int i = this.f79620g;
        if (!z) {
            if ((i & 16) != 0) {
                m107795c();
                return;
            }
            MDLog.m7443d("media", "Status error, Do not have bitmap info [status=" + this.f79620g + Constants.AES_SUFFIX);
            return;
        }
        if (i == 17) {
            m107795c();
            return;
        }
        MDLog.m7443d("media", "[status=" + this.f79620g + "][needExif=" + this.f79616c + "][gotExif=" + this.f79621h + Constants.AES_SUFFIX);
        if (this.f79621h || (this.f79620g & 16) == 0) {
            return;
        }
        m107795c();
    }

    /* JADX INFO: renamed from: e */
    public void m107798e(Bitmap bitmap) {
        this.f79617d = bitmap;
        this.f79620g |= 16;
    }

    /* JADX INFO: renamed from: f */
    public void m107799f(HashMap<String, String> map) {
        this.f79618e = map;
        this.f79620g |= 1;
    }

    /* JADX INFO: renamed from: g */
    public void m107800g(byte[] bArr) throws Throwable {
        ExifInterface exifInterface;
        this.f79621h = true;
        try {
            if (Build.VERSION.SDK_INT > 24) {
                exifInterface = new ExifInterface(new ByteArrayInputStream(bArr));
            } else {
                kki.m150103f(bArr, this.f79619f.replace(".png", "exif.jpg"));
                exifInterface = new ExifInterface(this.f79619f.replace(".png", "exif.jpg"));
            }
            m107799f(ykm.m216527a(exifInterface));
            kki.m150099b(this.f79619f.replace(".png", "exif.jpg"));
        } catch (Exception e) {
            MDLog.printErrStackTrace("media", e);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m107801h(String str) {
        this.f79619f = str;
    }

    /* JADX INFO: renamed from: i */
    public void m107802i(boolean z) {
        this.f79616c = z;
    }

    /* JADX INFO: renamed from: j */
    public void m107803j(qpw qpwVar) {
        this.f79622i = qpwVar;
    }
}
