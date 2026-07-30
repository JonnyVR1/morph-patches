package p007l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import androidx.annotation.Nullable;
import com.p003p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import l.e30;
import l.ht00;
import l.t95;
import l.v9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class pgm {

    /* JADX INFO: renamed from: n */
    public static final int f3724n;

    /* JADX INFO: renamed from: o */
    public static v9j<Boolean> f3725o;

    /* JADX INFO: renamed from: a */
    public final String f3726a;

    /* JADX INFO: renamed from: b */
    public final int[] f3727b;

    /* JADX INFO: renamed from: c */
    public final String f3728c;

    /* JADX INFO: renamed from: d */
    public final int[] f3729d;

    /* JADX INFO: renamed from: e */
    public final float f3730e;

    /* JADX INFO: renamed from: f */
    public final boolean f3731f;

    /* JADX INFO: renamed from: g */
    public final int f3732g;

    /* JADX INFO: renamed from: h */
    public final Bitmap.CompressFormat f3733h;

    /* JADX INFO: renamed from: i */
    public String f3734i;

    /* JADX INFO: renamed from: j */
    public final int f3735j;

    /* JADX INFO: renamed from: k */
    public final int f3736k;

    /* JADX INFO: renamed from: l */
    public final int f3737l;

    /* JADX INFO: renamed from: m */
    public final int f3738m;

    static {
        f3724n = App.f1071h ? 960 : 1440;
    }

    public pgm(String str, int i, int i2, Bitmap.CompressFormat compressFormat, boolean z) {
        ExifInterface exifInterface;
        int i3;
        Bitmap.CompressFormat compressFormat2;
        String attribute;
        this.f3735j = djx.m8997h().m9000c();
        this.f3736k = djx.m8997h().m8999b();
        this.f3737l = djx.m8997h().m9002e();
        this.f3738m = djx.m8997h().m9001d();
        this.f3726a = str;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        int i4 = options.outHeight;
        int i5 = options.outWidth;
        this.f3727b = new int[]{i5, i4};
        boolean z2 = false;
        float fM10260g = m10260g(options, i, i2);
        this.f3730e = fM10260g;
        this.f3732g = Math.max((int) Math.pow(2.0d, (int) Math.floor(Math.log(fM10260g) / Math.log(2.0d))), 1);
        try {
            exifInterface = new ExifInterface(str);
        } catch (IOException e) {
            CrashHelper.c(e);
            exifInterface = null;
        }
        int iRound = Math.round(i5 / this.f3730e);
        int iRound2 = Math.round(i4 / this.f3730e);
        if (exifInterface == null || (attribute = exifInterface.getAttribute("Orientation")) == null) {
            this.f3729d = new int[]{iRound, iRound2};
            i3 = 0;
        } else {
            i3 = Integer.parseInt(attribute);
            if (i3 == 6 || i3 == 8) {
                this.f3729d = new int[]{iRound2, iRound};
            } else {
                this.f3729d = new int[]{iRound, iRound2};
            }
        }
        String str2 = options.outMimeType;
        this.f3728c = str2;
        if (!z) {
            this.f3734i = str2;
        } else if (m10254c()) {
            this.f3734i = i3 > 1 ? "image/jpeg" : "image/webp";
        } else {
            this.f3734i = "image/jpeg";
        }
        if (this.f3730e <= 1.0f && "image/jpeg".equals(str2)) {
            z2 = true;
        }
        this.f3731f = z2;
        if (m10254c() && (compressFormat == (compressFormat2 = Bitmap.CompressFormat.JPEG) || compressFormat == Bitmap.CompressFormat.WEBP || z)) {
            this.f3733h = i3 <= 1 ? Bitmap.CompressFormat.WEBP : compressFormat2;
        } else {
            this.f3733h = i3 > 1 ? Bitmap.CompressFormat.JPEG : compressFormat;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m10253a(Bitmap bitmap) {
        return m10255f(bitmap.getAllocationByteCount());
    }

    /* JADX INFO: renamed from: c */
    public static boolean m10254c() {
        v9j<Boolean> v9jVar = f3725o;
        return v9jVar != null && ((Boolean) v9jVar.call()).booleanValue();
    }

    /* JADX INFO: renamed from: f */
    public static int m10255f(int i) {
        if (i < 102400) {
            return 92;
        }
        if (i < 204800) {
            return 90;
        }
        if (i < 614400) {
            return 86;
        }
        if (i < 1536000) {
            return 84;
        }
        return i < 2048000 ? 82 : 80;
    }

    /* JADX INFO: renamed from: i */
    public static void m10256i(@Nullable v9j<Boolean> v9jVar) {
        f3725o = v9jVar;
    }

    /* JADX INFO: renamed from: b */
    public final int m10257b(Bitmap bitmap) {
        if (m10254c()) {
            return m10255f(bitmap.getAllocationByteCount());
        }
        return 95;
    }

    /* JADX INFO: renamed from: d */
    public String m10258d() throws IOException {
        return m10259e(false, null);
    }

    /* JADX INFO: renamed from: e */
    public String m10259e(boolean z, e30<Bitmap> e30Var) throws Throwable {
        Throwable th;
        FileInputStream fileInputStream;
        Bitmap bitmapDecodeStream;
        Throwable th2;
        Bitmap bitmapA;
        FileInputStream fileInputStream2 = null;
        FileInputStream fileInputStream3 = null;
        Bitmap bitmap = null;
        if (this.f3731f) {
            if (NullChecker.a(e30Var)) {
                File file = new File(this.f3726a);
                if (z) {
                    bitmapA = ht00.a(this.f3726a);
                } else {
                    try {
                        FileInputStream fileInputStream4 = new FileInputStream(file);
                        try {
                            Bitmap bitmapDecodeStream2 = BitmapFactory.decodeStream(fileInputStream4, null, null);
                            t95.b(fileInputStream4);
                            bitmapA = bitmapDecodeStream2;
                        } catch (Throwable th3) {
                            th2 = th3;
                            fileInputStream3 = fileInputStream4;
                            t95.b(fileInputStream3);
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        th2 = th4;
                    }
                }
                if (NullChecker.a(bitmapA)) {
                    e30Var.call(bitmapA);
                }
            }
            return this.f3726a;
        }
        File fileM9572O = k9j.m9572O("cache");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = this.f3732g;
        File file2 = new File(this.f3726a);
        try {
            if (z) {
                bitmapDecodeStream = ht00.a(this.f3726a);
                fileInputStream = null;
            } else {
                fileInputStream = new FileInputStream(file2);
                try {
                    bitmapDecodeStream = BitmapFactory.decodeStream(fileInputStream, null, options);
                } catch (Throwable th5) {
                    th = th5;
                    fileInputStream2 = fileInputStream;
                    t95.b(fileInputStream2);
                    throw th;
                }
            }
            t95.b(fileInputStream);
            Matrix matrix = new Matrix();
            int iM10257b = m10257b(bitmapDecodeStream);
            float f = this.f3732g / this.f3730e;
            matrix.postScale(f, f);
            try {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeStream, 0, 0, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight(), matrix, true);
                if (NullChecker.a(e30Var)) {
                    e30Var.call(bitmapCreateBitmap);
                }
                if (bitmapCreateBitmap != bitmapDecodeStream) {
                    bitmapDecodeStream.recycle();
                }
                bitmap = bitmapCreateBitmap;
            } catch (OutOfMemoryError e) {
                CrashHelper.c(e);
            }
            System.gc();
            bitmap.compress(this.f3733h, iM10257b, new FileOutputStream(fileM9572O));
            n6f.m9950a(file2, fileM9572O, true);
            return fileM9572O.getAbsolutePath();
        } catch (Throwable th6) {
            th = th6;
        }
    }

    /* JADX INFO: renamed from: g */
    public float m10260g(BitmapFactory.Options options, int i, int i2) {
        int i3;
        int i4;
        float f;
        if (!m10261h(options) || (i3 = options.outWidth) == 0 || (i4 = options.outHeight) == 0) {
            if (i2 == 1) {
                int i5 = options.outWidth;
                int i6 = options.outHeight;
                if (i5 <= i6) {
                    i5 = i6;
                }
                if (i5 > i) {
                    return (i5 * 1.0f) / i;
                }
            } else {
                int i7 = options.outWidth;
                int i8 = options.outHeight;
                int i9 = i * i;
                if (i7 * i8 > i9) {
                    return (float) Math.sqrt(((i7 * 1.0f) * i8) / i9);
                }
            }
        } else if (i3 > i4) {
            if (i4 > 720) {
                f = i4;
                return 720.0f / f;
            }
        } else if (i3 > 720) {
            f = i3;
            return 720.0f / f;
        }
        return 1.0f;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m10261h(BitmapFactory.Options options) {
        int i = options.outWidth;
        int i2 = options.outHeight;
        if (i != 0 && i2 != 0) {
            boolean zM9068h = eew.m9068h(App.f1068e);
            if (i > i2) {
                float f = i / i2;
                return f <= ((float) this.f3736k) && f >= ((float) this.f3735j) && !zM9068h;
            }
            float f2 = i2 / i;
            if (f2 >= this.f3737l && f2 <= this.f3738m && !zM9068h) {
                return true;
            }
        }
        return false;
    }

    public pgm(String str, int i) {
        this(str, i, 0, Bitmap.CompressFormat.JPEG, true);
    }

    public pgm(String str) {
        this(str, f3724n, 0, Bitmap.CompressFormat.JPEG, true);
    }
}
