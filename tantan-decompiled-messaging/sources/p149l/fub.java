package p149l;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.p047rx.rxthread.FastIoScheduler;
import com.p046p1.mobile.android.p048ui.cropiwa.CropIwaView;
import com.p046p1.mobile.android.p048ui.cropiwa.CropperAct;
import com.p046p1.mobile.android.p048ui.cropiwa.shape.CropIwaShapeMask;
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
public class fub {
    private static final fub INSTANCE = new fub();

    /* JADX INFO: renamed from: d */
    public static Executor f99327d = FastIoScheduler.f15629a;

    /* JADX INFO: renamed from: a */
    public final Object f99328a = new Object();

    /* JADX INFO: renamed from: b */
    public Map<Uri, InterfaceC16922a> f99329b = new HashMap();

    /* JADX INFO: renamed from: c */
    public Map<Uri, File> f99330c = new HashMap();

    /* JADX INFO: renamed from: l.fub$a */
    public interface InterfaceC16922a {
        /* JADX INFO: renamed from: a */
        void mo21044a(Uri uri, Bitmap bitmap);

        /* JADX INFO: renamed from: b */
        void mo21045b(Throwable th);
    }

    /* JADX INFO: renamed from: c */
    public static Bitmap m123164c(Context context, Uri uri, Bitmap bitmap) {
        return m123165d(context, uri, bitmap, 0);
    }

    /* JADX INFO: renamed from: d */
    public static Bitmap m123165d(Context context, Uri uri, Bitmap bitmap, int i) {
        int iM123166e = m123166e(m123167f(context, uri)) + i;
        if (iM123166e == 0) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.preRotate(iM123166e);
        return m123171r(bitmap, matrix);
    }

    /* JADX INFO: renamed from: e */
    public static int m123166e(int i) {
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
    public static int m123167f(@NonNull Context context, @NonNull Uri uri) {
        try {
            try {
                InputStream inputStreamM123170k = m123170k(context, uri);
                if (inputStreamM123170k == null) {
                    sub.m186005b(inputStreamM123170k);
                    return 0;
                }
                int iM141315b = new jgm(inputStreamM123170k).m141315b();
                sub.m186005b(inputStreamM123170k);
                return iM141315b;
            } catch (IOException e) {
                CrashHelper.m81296c(e);
                jub.m143263b(e.getMessage(), e);
                sub.m186005b(null);
                return 0;
            }
        } catch (Throwable th) {
            sub.m186005b(null);
            throw th;
        }
    }

    /* JADX INFO: renamed from: h */
    public static fub m123168h() {
        return INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static BitmapFactory.Options m123169j(Context context, Uri uri, int i, int i2) throws FileNotFoundException {
        InputStream inputStreamM123170k = m123170k(context, uri);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStreamM123170k, null, options);
        options.inJustDecodeBounds = false;
        int iM179357a = rhi.m179357a(options, i, i2);
        options.inSampleSize = iM179357a;
        if (((options.outHeight * options.outWidth) * 4) / iM179357a > 20971520) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        return options;
    }

    /* JADX INFO: renamed from: k */
    public static InputStream m123170k(Context context, Uri uri) throws FileNotFoundException {
        return CropperAct.m21055H1(context, uri) ? new FileInputStream(new File(uri.getPath())) : context.getContentResolver().openInputStream(uri);
    }

    /* JADX INFO: renamed from: r */
    public static Bitmap m123171r(@NonNull Bitmap bitmap, @NonNull Matrix matrix) {
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
                    CrashHelper.m81296c(outOfMemoryError);
                    jub.m143263b(outOfMemoryError.getMessage(), outOfMemoryError);
                    return bitmap;
                }
            } catch (OutOfMemoryError e2) {
                outOfMemoryError = e2;
                bitmap = bitmap;
                CrashHelper.m81296c(outOfMemoryError);
                jub.m143263b(outOfMemoryError.getMessage(), outOfMemoryError);
                return bitmap;
            }
        } catch (OutOfMemoryError e3) {
            e = e3;
        }
    }

    /* JADX INFO: renamed from: a */
    public final File m123172a(Context context, Uri uri) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        File file = new File(context.getExternalCacheDir(), m123174g(uri));
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
                            sub.m186005b(bufferedInputStream2);
                            sub.m186005b(bufferedOutputStream);
                            jub.m143262a("cached {%s} as {%s}", uri.toString(), file.getAbsolutePath());
                            return file;
                        }
                        bufferedOutputStream.write(bArr, 0, i);
                    } catch (Throwable th) {
                        th = th;
                        bufferedInputStream = bufferedInputStream2;
                        sub.m186005b(bufferedInputStream);
                        sub.m186005b(bufferedOutputStream);
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
    public void m123173b(@NonNull Context context, cub cubVar, CropIwaShapeMask cropIwaShapeMask, @NonNull Uri uri, qub qubVar, CropIwaView cropIwaView) {
        new dub(context.getApplicationContext(), cubVar, cropIwaShapeMask, uri, qubVar, cropIwaView).executeOnExecutor(f99327d, new Void[0]);
    }

    /* JADX INFO: renamed from: g */
    public final String m123174g(Uri uri) {
        return "temp_" + uri.getLastPathSegment() + "_" + System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: i */
    public final BitmapFactory.Options m123175i(Context context, Uri uri, int i, int i2) throws FileNotFoundException {
        if (i != -1 && i2 != -1) {
            return m123169j(context, uri, i, i2);
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = 1;
        return options;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m123176l(Uri uri) {
        String scheme = uri.getScheme();
        return "http".equals(scheme) || "https".equals(scheme);
    }

    /* JADX INFO: renamed from: m */
    public void m123177m(@NonNull Context context, @NonNull Uri uri, int i, int i2, InterfaceC16922a interfaceC16922a) {
        synchronized (this.f99328a) {
            try {
                boolean zContainsKey = this.f99329b.containsKey(uri);
                this.f99329b.put(uri, interfaceC16922a);
                if (zContainsKey) {
                    jub.m143262a("request for {%s} is already in progress", uri.toString());
                } else {
                    jub.m143262a("load bitmap request for {%s}", uri.toString());
                    new mrv(context.getApplicationContext(), uri, i, i2).executeOnExecutor(f99327d, new Void[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public Bitmap m123178n(Context context, Uri uri, int i, int i2, int i3) throws IOException {
        Uri uriM123181q = m123181q(context, uri);
        Bitmap bitmapM123182s = m123182s(context, uriM123181q, m123175i(context, uriM123181q, i, i2), i3);
        if (bitmapM123182s != null) {
            jub.m143262a("loaded image with dimensions {width=%d, height=%d}", Integer.valueOf(bitmapM123182s.getWidth()), Integer.valueOf(bitmapM123182s.getHeight()));
        }
        return bitmapM123182s;
    }

    /* JADX INFO: renamed from: o */
    public void m123179o(Uri uri, Bitmap bitmap, Throwable th) {
        InterfaceC16922a interfaceC16922aRemove;
        synchronized (this.f99328a) {
            interfaceC16922aRemove = this.f99329b.remove(uri);
        }
        if (interfaceC16922aRemove == null) {
            m123180p(uri);
            jub.m143262a("{%s} loading completed, but there was no listeners", uri.toString());
        } else {
            if (th != null) {
                interfaceC16922aRemove.mo21045b(th);
            } else {
                interfaceC16922aRemove.mo21044a(uri, bitmap);
            }
            jub.m143262a("{%s} loading completed, listener got the result", uri.toString());
        }
    }

    /* JADX INFO: renamed from: p */
    public void m123180p(Uri uri) {
        sub.m186007d(this.f99330c.remove(uri));
    }

    /* JADX INFO: renamed from: q */
    public final Uri m123181q(Context context, Uri uri) throws Throwable {
        if (!m123176l(uri)) {
            return uri;
        }
        File fileM123172a = this.f99330c.get(uri);
        if (fileM123172a == null) {
            fileM123172a = m123172a(context, uri);
            this.f99330c.put(uri, fileM123172a);
        }
        return Uri.fromFile(fileM123172a);
    }

    /* JADX INFO: renamed from: s */
    public final Bitmap m123182s(Context context, Uri uri, BitmapFactory.Options options, int i) throws FileNotFoundException {
        while (true) {
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(m123170k(context, uri), null, options);
                if (bitmapDecodeStream == null) {
                    return null;
                }
                return m123165d(context, uri, bitmapDecodeStream, i);
            } catch (OutOfMemoryError e) {
                CrashHelper.m81296c(e);
                if (options.inSampleSize >= 64) {
                    return null;
                }
                options.inSampleSize *= 2;
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public void m123183t(Uri uri) {
        synchronized (this.f99328a) {
            try {
                if (this.f99329b.containsKey(uri)) {
                    jub.m143262a("listener for {%s} loading unsubscribed", uri.toString());
                    this.f99329b.put(uri, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
