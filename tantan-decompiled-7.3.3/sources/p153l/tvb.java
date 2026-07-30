package p153l;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.p052rx.rxthread.FastIoScheduler;
import com.p051p1.mobile.android.p053ui.cropiwa.CropIwaView;
import com.p051p1.mobile.android.p053ui.cropiwa.CropperAct;
import com.p051p1.mobile.android.p053ui.cropiwa.shape.CropIwaShapeMask;
import com.tantanapp.common.utils.CrashHelper;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes8.dex */
public class tvb {
    private static final tvb INSTANCE = new tvb();

    /* JADX INFO: renamed from: d */
    public static Executor f176250d = FastIoScheduler.f16348a;

    /* JADX INFO: renamed from: a */
    public final Object f176251a = new Object();

    /* JADX INFO: renamed from: b */
    public Map<Uri, InterfaceC20409a> f176252b = new HashMap();

    /* JADX INFO: renamed from: c */
    public Map<Uri, File> f176253c = new HashMap();

    /* JADX INFO: renamed from: l.tvb$a */
    public interface InterfaceC20409a {
        /* JADX INFO: renamed from: a */
        void mo22043a(Uri uri, Bitmap bitmap);

        /* JADX INFO: renamed from: b */
        void mo22044b(Throwable th);
    }

    /* JADX INFO: renamed from: c */
    public static Bitmap m192783c(Context context, Uri uri, Bitmap bitmap) {
        return m192784d(context, uri, bitmap, 0);
    }

    /* JADX INFO: renamed from: d */
    public static Bitmap m192784d(Context context, Uri uri, Bitmap bitmap, int i) {
        int iM192785e = m192785e(m192786f(context, uri)) + i;
        if (iM192785e == 0) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.preRotate(iM192785e);
        return m192790r(bitmap, matrix);
    }

    /* JADX INFO: renamed from: e */
    public static int m192785e(int i) {
        switch (i) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: f */
    public static int m192786f(@NonNull Context context, @NonNull Uri uri) {
        try {
            try {
                InputStream inputStreamM192789k = m192789k(context, uri);
                if (inputStreamM192789k == null) {
                    gwb.m132649b(inputStreamM192789k);
                    return 0;
                }
                int iM158512b = new mim(inputStreamM192789k).m158512b();
                gwb.m132649b(inputStreamM192789k);
                return iM158512b;
            } catch (IOException e) {
                CrashHelper.m82479c(e);
                xvb.m213212b(e.getMessage(), e);
                gwb.m132649b(null);
                return 0;
            }
        } catch (Throwable th) {
            gwb.m132649b(null);
            throw th;
        }
    }

    /* JADX INFO: renamed from: h */
    public static tvb m192787h() {
        return INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static BitmapFactory.Options m192788j(Context context, Uri uri, int i, int i2) throws FileNotFoundException {
        InputStream inputStreamM192789k = m192789k(context, uri);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStreamM192789k, null, options);
        options.inJustDecodeBounds = false;
        int iM168013a = oki.m168013a(options, i, i2);
        options.inSampleSize = iM168013a;
        if (((options.outHeight * options.outWidth) * 4) / iM168013a > 20971520) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        return options;
    }

    /* JADX INFO: renamed from: k */
    public static InputStream m192789k(Context context, Uri uri) throws FileNotFoundException {
        return CropperAct.m22054I1(context, uri) ? new FileInputStream(new File(uri.getPath())) : context.getContentResolver().openInputStream(uri);
    }

    /* JADX INFO: renamed from: r */
    public static Bitmap m192790r(@NonNull Bitmap bitmap, @NonNull Matrix matrix) {
        OutOfMemoryError outOfMemoryError;
        try {
            try {
                bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                if (bitmap.sameAs(bitmap)) {
                    return bitmap;
                }
                try {
                    bitmap.recycle();
                    return bitmap;
                } catch (OutOfMemoryError e) {
                    e = e;
                    outOfMemoryError = e;
                    CrashHelper.m82479c(outOfMemoryError);
                    xvb.m213212b(outOfMemoryError.getMessage(), outOfMemoryError);
                    return bitmap;
                }
            } catch (OutOfMemoryError e2) {
                outOfMemoryError = e2;
                bitmap = bitmap;
                CrashHelper.m82479c(outOfMemoryError);
                xvb.m213212b(outOfMemoryError.getMessage(), outOfMemoryError);
                return bitmap;
            }
        } catch (OutOfMemoryError e3) {
            e = e3;
        }
    }

    /* JADX INFO: renamed from: a */
    public final File m192791a(Context context, Uri uri) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        File file = new File(context.getExternalCacheDir(), m192793g(uri));
        BufferedInputStream bufferedInputStream = null;
        try {
            byte[] bArr = new byte[1024];
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new URL(uri.toString()).openStream());
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                while (true) {
                    try {
                        int i = bufferedInputStream2.read(bArr);
                        if (i == -1) {
                            bufferedOutputStream.flush();
                            gwb.m132649b(bufferedInputStream2);
                            gwb.m132649b(bufferedOutputStream);
                            xvb.m213211a("cached {%s} as {%s}", uri.toString(), file.getAbsolutePath());
                            return file;
                        }
                        bufferedOutputStream.write(bArr, 0, i);
                    } catch (Throwable th) {
                        th = th;
                        bufferedInputStream = bufferedInputStream2;
                        gwb.m132649b(bufferedInputStream);
                        gwb.m132649b(bufferedOutputStream);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedOutputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedOutputStream = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m192792b(@NonNull Context context, qvb qvbVar, CropIwaShapeMask cropIwaShapeMask, @NonNull Uri uri, ewb ewbVar, CropIwaView cropIwaView) {
        new rvb(context.getApplicationContext(), qvbVar, cropIwaShapeMask, uri, ewbVar, cropIwaView).executeOnExecutor(f176250d, new Void[0]);
    }

    /* JADX INFO: renamed from: g */
    public final String m192793g(Uri uri) {
        return "temp_" + uri.getLastPathSegment() + "_" + System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: i */
    public final BitmapFactory.Options m192794i(Context context, Uri uri, int i, int i2) throws FileNotFoundException {
        if (i != -1 && i2 != -1) {
            return m192788j(context, uri, i, i2);
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = 1;
        return options;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m192795l(Uri uri) {
        String scheme = uri.getScheme();
        return "http".equals(scheme) || "https".equals(scheme);
    }

    /* JADX INFO: renamed from: m */
    public void m192796m(@NonNull Context context, @NonNull Uri uri, int i, int i2, InterfaceC20409a interfaceC20409a) {
        synchronized (this.f176251a) {
            try {
                boolean zContainsKey = this.f176252b.containsKey(uri);
                this.f176252b.put(uri, interfaceC20409a);
                if (zContainsKey) {
                    xvb.m213211a("request for {%s} is already in progress", uri.toString());
                } else {
                    xvb.m213211a("load bitmap request for {%s}", uri.toString());
                    new ntv(context.getApplicationContext(), uri, i, i2).executeOnExecutor(f176250d, new Void[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public Bitmap m192797n(Context context, Uri uri, int i, int i2, int i3) throws IOException {
        Uri uriM192800q = m192800q(context, uri);
        Bitmap bitmapM192801s = m192801s(context, uriM192800q, m192794i(context, uriM192800q, i, i2), i3);
        if (bitmapM192801s != null) {
            xvb.m213211a("loaded image with dimensions {width=%d, height=%d}", Integer.valueOf(bitmapM192801s.getWidth()), Integer.valueOf(bitmapM192801s.getHeight()));
        }
        return bitmapM192801s;
    }

    /* JADX INFO: renamed from: o */
    public void m192798o(Uri uri, Bitmap bitmap, Throwable th) {
        InterfaceC20409a interfaceC20409aRemove;
        synchronized (this.f176251a) {
            interfaceC20409aRemove = this.f176252b.remove(uri);
        }
        if (interfaceC20409aRemove == null) {
            m192799p(uri);
            xvb.m213211a("{%s} loading completed, but there was no listeners", uri.toString());
        } else {
            if (th != null) {
                interfaceC20409aRemove.mo22044b(th);
            } else {
                interfaceC20409aRemove.mo22043a(uri, bitmap);
            }
            xvb.m213211a("{%s} loading completed, listener got the result", uri.toString());
        }
    }

    /* JADX INFO: renamed from: p */
    public void m192799p(Uri uri) {
        gwb.m132651d(this.f176253c.remove(uri));
    }

    /* JADX INFO: renamed from: q */
    public final Uri m192800q(Context context, Uri uri) throws Throwable {
        if (!m192795l(uri)) {
            return uri;
        }
        File fileM192791a = this.f176253c.get(uri);
        if (fileM192791a == null) {
            fileM192791a = m192791a(context, uri);
            this.f176253c.put(uri, fileM192791a);
        }
        return Uri.fromFile(fileM192791a);
    }

    /* JADX INFO: renamed from: s */
    public final Bitmap m192801s(Context context, Uri uri, BitmapFactory.Options options, int i) throws FileNotFoundException {
        while (true) {
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(m192789k(context, uri), null, options);
                if (bitmapDecodeStream == null) {
                    return null;
                }
                return m192784d(context, uri, bitmapDecodeStream, i);
            } catch (OutOfMemoryError e) {
                CrashHelper.m82479c(e);
                if (options.inSampleSize >= 64) {
                    return null;
                }
                options.inSampleSize *= 2;
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public void m192802t(Uri uri) {
        synchronized (this.f176251a) {
            try {
                if (this.f176252b.containsKey(uri)) {
                    xvb.m213211a("listener for {%s} loading unsubscribed", uri.toString());
                    this.f176252b.put(uri, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
