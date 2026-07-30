package p007l;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p003p1.mobile.android.p004rx.rxthread.FastIoScheduler;
import com.p003p1.mobile.android.p005ui.cropiwa.CropIwaView;
import com.p003p1.mobile.android.p005ui.cropiwa.CropperAct;
import com.p003p1.mobile.android.p005ui.cropiwa.shape.CropIwaShapeMask;
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
import l.rhi;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class fub {
    private static final fub INSTANCE = new fub();

    /* JADX INFO: renamed from: d */
    public static Executor f2738d = FastIoScheduler.f1328a;

    /* JADX INFO: renamed from: a */
    public final Object f2739a = new Object();

    /* JADX INFO: renamed from: b */
    public Map<Uri, InterfaceC0547a> f2740b = new HashMap();

    /* JADX INFO: renamed from: c */
    public Map<Uri, File> f2741c = new HashMap();

    /* JADX INFO: renamed from: l.fub$a */
    public interface InterfaceC0547a {
        /* JADX INFO: renamed from: a */
        void mo1316a(Uri uri, Bitmap bitmap);

        /* JADX INFO: renamed from: b */
        void mo1317b(Throwable th);
    }

    /* JADX INFO: renamed from: c */
    public static Bitmap m9144c(Context context, Uri uri, Bitmap bitmap) {
        return m9145d(context, uri, bitmap, 0);
    }

    /* JADX INFO: renamed from: d */
    public static Bitmap m9145d(Context context, Uri uri, Bitmap bitmap, int i) {
        int iM9146e = m9146e(m9147f(context, uri)) + i;
        if (iM9146e == 0) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.preRotate(iM9146e);
        return m9151r(bitmap, matrix);
    }

    /* JADX INFO: renamed from: e */
    public static int m9146e(int i) {
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
    public static int m9147f(@NonNull Context context, @NonNull Uri uri) {
        try {
            try {
                InputStream inputStreamM9150k = m9150k(context, uri);
                if (inputStreamM9150k == null) {
                    sub.m10725b(inputStreamM9150k);
                    return 0;
                }
                int iM9524b = new jgm(inputStreamM9150k).m9524b();
                sub.m10725b(inputStreamM9150k);
                return iM9524b;
            } catch (IOException e) {
                CrashHelper.c(e);
                jub.m9558b(e.getMessage(), e);
                sub.m10725b(null);
                return 0;
            }
        } catch (Throwable th) {
            sub.m10725b(null);
            throw th;
        }
    }

    /* JADX INFO: renamed from: h */
    public static fub m9148h() {
        return INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static BitmapFactory.Options m9149j(Context context, Uri uri, int i, int i2) throws FileNotFoundException {
        InputStream inputStreamM9150k = m9150k(context, uri);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStreamM9150k, null, options);
        options.inJustDecodeBounds = false;
        int iA = rhi.a(options, i, i2);
        options.inSampleSize = iA;
        if (((options.outHeight * options.outWidth) * 4) / iA > 20971520) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        return options;
    }

    /* JADX INFO: renamed from: k */
    public static InputStream m9150k(Context context, Uri uri) throws FileNotFoundException {
        return CropperAct.m1327H1(context, uri) ? new FileInputStream(new File(uri.getPath())) : context.getContentResolver().openInputStream(uri);
    }

    /* JADX INFO: renamed from: r */
    public static Bitmap m9151r(@NonNull Bitmap bitmap, @NonNull Matrix matrix) {
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
                    CrashHelper.c(outOfMemoryError);
                    jub.m9558b(outOfMemoryError.getMessage(), outOfMemoryError);
                    return bitmap;
                }
            } catch (OutOfMemoryError e2) {
                outOfMemoryError = e2;
                bitmap = bitmap;
                CrashHelper.c(outOfMemoryError);
                jub.m9558b(outOfMemoryError.getMessage(), outOfMemoryError);
                return bitmap;
            }
        } catch (OutOfMemoryError e3) {
            e = e3;
        }
    }

    /* JADX INFO: renamed from: a */
    public final File m9152a(Context context, Uri uri) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        File file = new File(context.getExternalCacheDir(), m9154g(uri));
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
                            sub.m10725b(bufferedInputStream2);
                            sub.m10725b(bufferedOutputStream);
                            jub.m9557a("cached {%s} as {%s}", uri.toString(), file.getAbsolutePath());
                            return file;
                        }
                        bufferedOutputStream.write(bArr, 0, i);
                    } catch (Throwable th) {
                        th = th;
                        bufferedInputStream = bufferedInputStream2;
                        sub.m10725b(bufferedInputStream);
                        sub.m10725b(bufferedOutputStream);
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
    public void m9153b(@NonNull Context context, cub cubVar, CropIwaShapeMask cropIwaShapeMask, @NonNull Uri uri, qub qubVar, CropIwaView cropIwaView) {
        new dub(context.getApplicationContext(), cubVar, cropIwaShapeMask, uri, qubVar, cropIwaView).executeOnExecutor(f2738d, new Void[0]);
    }

    /* JADX INFO: renamed from: g */
    public final String m9154g(Uri uri) {
        return "temp_" + uri.getLastPathSegment() + "_" + System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: i */
    public final BitmapFactory.Options m9155i(Context context, Uri uri, int i, int i2) throws FileNotFoundException {
        if (i != -1 && i2 != -1) {
            return m9149j(context, uri, i, i2);
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = 1;
        return options;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m9156l(Uri uri) {
        String scheme = uri.getScheme();
        return "http".equals(scheme) || "https".equals(scheme);
    }

    /* JADX INFO: renamed from: m */
    public void m9157m(@NonNull Context context, @NonNull Uri uri, int i, int i2, InterfaceC0547a interfaceC0547a) {
        synchronized (this.f2739a) {
            try {
                boolean zContainsKey = this.f2740b.containsKey(uri);
                this.f2740b.put(uri, interfaceC0547a);
                if (zContainsKey) {
                    jub.m9557a("request for {%s} is already in progress", uri.toString());
                } else {
                    jub.m9557a("load bitmap request for {%s}", uri.toString());
                    new mrv(context.getApplicationContext(), uri, i, i2).executeOnExecutor(f2738d, new Void[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public Bitmap m9158n(Context context, Uri uri, int i, int i2, int i3) throws IOException {
        Uri uriM9161q = m9161q(context, uri);
        Bitmap bitmapM9162s = m9162s(context, uriM9161q, m9155i(context, uriM9161q, i, i2), i3);
        if (bitmapM9162s != null) {
            jub.m9557a("loaded image with dimensions {width=%d, height=%d}", Integer.valueOf(bitmapM9162s.getWidth()), Integer.valueOf(bitmapM9162s.getHeight()));
        }
        return bitmapM9162s;
    }

    /* JADX INFO: renamed from: o */
    public void m9159o(Uri uri, Bitmap bitmap, Throwable th) {
        InterfaceC0547a interfaceC0547aRemove;
        synchronized (this.f2739a) {
            interfaceC0547aRemove = this.f2740b.remove(uri);
        }
        if (interfaceC0547aRemove == null) {
            m9160p(uri);
            jub.m9557a("{%s} loading completed, but there was no listeners", uri.toString());
        } else {
            if (th != null) {
                interfaceC0547aRemove.mo1317b(th);
            } else {
                interfaceC0547aRemove.mo1316a(uri, bitmap);
            }
            jub.m9557a("{%s} loading completed, listener got the result", uri.toString());
        }
    }

    /* JADX INFO: renamed from: p */
    public void m9160p(Uri uri) {
        sub.m10727d(this.f2741c.remove(uri));
    }

    /* JADX INFO: renamed from: q */
    public final Uri m9161q(Context context, Uri uri) throws Throwable {
        if (!m9156l(uri)) {
            return uri;
        }
        File fileM9152a = this.f2741c.get(uri);
        if (fileM9152a == null) {
            fileM9152a = m9152a(context, uri);
            this.f2741c.put(uri, fileM9152a);
        }
        return Uri.fromFile(fileM9152a);
    }

    /* JADX INFO: renamed from: s */
    public final Bitmap m9162s(Context context, Uri uri, BitmapFactory.Options options, int i) throws FileNotFoundException {
        while (true) {
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(m9150k(context, uri), null, options);
                if (bitmapDecodeStream == null) {
                    return null;
                }
                return m9145d(context, uri, bitmapDecodeStream, i);
            } catch (OutOfMemoryError e) {
                CrashHelper.c(e);
                if (options.inSampleSize >= 64) {
                    return null;
                }
                options.inSampleSize *= 2;
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public void m9163t(Uri uri) {
        synchronized (this.f2739a) {
            try {
                if (this.f2740b.containsKey(uri)) {
                    jub.m9557a("listener for {%s} loading unsubscribed", uri.toString());
                    this.f2740b.put(uri, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
