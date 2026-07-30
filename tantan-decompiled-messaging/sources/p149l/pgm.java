package p149l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.liteav.audio.TXEAudioDef;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;

/* JADX INFO: loaded from: classes8.dex */
public class pgm {

    /* JADX INFO: renamed from: n */
    public static final int f148725n;

    /* JADX INFO: renamed from: o */
    public static v9j<Boolean> f148726o;

    /* JADX INFO: renamed from: a */
    public final String f148727a;

    /* JADX INFO: renamed from: b */
    public final int[] f148728b;

    /* JADX INFO: renamed from: c */
    public final String f148729c;

    /* JADX INFO: renamed from: d */
    public final int[] f148730d;

    /* JADX INFO: renamed from: e */
    public final float f148731e;

    /* JADX INFO: renamed from: f */
    public final boolean f148732f;

    /* JADX INFO: renamed from: g */
    public final int f148733g;

    /* JADX INFO: renamed from: h */
    public final Bitmap.CompressFormat f148734h;

    /* JADX INFO: renamed from: i */
    public String f148735i;

    /* JADX INFO: renamed from: j */
    public final int f148736j;

    /* JADX INFO: renamed from: k */
    public final int f148737k;

    /* JADX INFO: renamed from: l */
    public final int f148738l;

    /* JADX INFO: renamed from: m */
    public final int f148739m;

    static {
        f148725n = App.f15372h ? TXEAudioDef.TXE_OPUS_SAMPLE_NUM : 1440;
    }

    public pgm(String str, int i, int i2, Bitmap.CompressFormat compressFormat, boolean z) {
        ExifInterface exifInterface;
        int i3;
        Bitmap.CompressFormat compressFormat2;
        String attribute;
        this.f148736j = djx.m112144h().m112147c();
        this.f148737k = djx.m112144h().m112146b();
        this.f148738l = djx.m112144h().m112149e();
        this.f148739m = djx.m112144h().m112148d();
        this.f148727a = str;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        int i4 = options.outHeight;
        int i5 = options.outWidth;
        this.f148728b = new int[]{i5, i4};
        boolean z2 = false;
        float fM168766g = m168766g(options, i, i2);
        this.f148731e = fM168766g;
        this.f148733g = Math.max((int) Math.pow(2.0d, (int) Math.floor(Math.log(fM168766g) / Math.log(2.0d))), 1);
        try {
            exifInterface = new ExifInterface(str);
        } catch (IOException e) {
            CrashHelper.m81296c(e);
            exifInterface = null;
        }
        int iRound = Math.round(i5 / this.f148731e);
        int iRound2 = Math.round(i4 / this.f148731e);
        if (exifInterface == null || (attribute = exifInterface.getAttribute(j6f.TAG_ORIENTATION)) == null) {
            this.f148730d = new int[]{iRound, iRound2};
            i3 = 0;
        } else {
            i3 = Integer.parseInt(attribute);
            if (i3 == 6 || i3 == 8) {
                this.f148730d = new int[]{iRound2, iRound};
            } else {
                this.f148730d = new int[]{iRound, iRound2};
            }
        }
        String str2 = options.outMimeType;
        this.f148729c = str2;
        if (!z) {
            this.f148735i = str2;
        } else if (m168760c()) {
            this.f148735i = i3 > 1 ? DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG : "image/webp";
        } else {
            this.f148735i = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
        }
        if (this.f148731e <= 1.0f && DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG.equals(str2)) {
            z2 = true;
        }
        this.f148732f = z2;
        if (m168760c() && (compressFormat == (compressFormat2 = Bitmap.CompressFormat.JPEG) || compressFormat == Bitmap.CompressFormat.WEBP || z)) {
            this.f148734h = i3 <= 1 ? Bitmap.CompressFormat.WEBP : compressFormat2;
        } else {
            this.f148734h = i3 > 1 ? Bitmap.CompressFormat.JPEG : compressFormat;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m168759a(Bitmap bitmap) {
        return m168761f(bitmap.getAllocationByteCount());
    }

    /* JADX INFO: renamed from: c */
    public static boolean m168760c() {
        v9j<Boolean> v9jVar = f148726o;
        return v9jVar != null && v9jVar.call().booleanValue();
    }

    /* JADX INFO: renamed from: f */
    public static int m168761f(int i) {
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
    public static void m168762i(@Nullable v9j<Boolean> v9jVar) {
        f148726o = v9jVar;
    }

    /* JADX INFO: renamed from: b */
    public final int m168763b(Bitmap bitmap) {
        if (m168760c()) {
            return m168761f(bitmap.getAllocationByteCount());
        }
        return 95;
    }

    /* JADX INFO: renamed from: d */
    public String m168764d() throws IOException {
        return m168765e(false, null);
    }

    /* JADX INFO: renamed from: e */
    public String m168765e(boolean z, e30<Bitmap> e30Var) throws Throwable {
        Throwable th;
        FileInputStream fileInputStream;
        Bitmap bitmapDecodeStream;
        Throwable th2;
        Bitmap bitmapM132808a;
        FileInputStream fileInputStream2 = null;
        FileInputStream fileInputStream3 = null;
        Bitmap bitmap = null;
        if (this.f148732f) {
            if (NullChecker.m81303a(e30Var)) {
                File file = new File(this.f148727a);
                if (z) {
                    bitmapM132808a = ht00.m132808a(this.f148727a);
                } else {
                    try {
                        FileInputStream fileInputStream4 = new FileInputStream(file);
                        try {
                            Bitmap bitmapDecodeStream2 = BitmapFactory.decodeStream(fileInputStream4, null, null);
                            t95.m187604b(fileInputStream4);
                            bitmapM132808a = bitmapDecodeStream2;
                        } catch (Throwable th3) {
                            th2 = th3;
                            fileInputStream3 = fileInputStream4;
                            t95.m187604b(fileInputStream3);
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        th2 = th4;
                    }
                }
                if (NullChecker.m81303a(bitmapM132808a)) {
                    e30Var.call(bitmapM132808a);
                }
            }
            return this.f148727a;
        }
        File fileM145083O = k9j.m145083O("cache");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = this.f148733g;
        File file2 = new File(this.f148727a);
        try {
            if (z) {
                bitmapDecodeStream = ht00.m132808a(this.f148727a);
                fileInputStream = null;
            } else {
                fileInputStream = new FileInputStream(file2);
                try {
                    bitmapDecodeStream = BitmapFactory.decodeStream(fileInputStream, null, options);
                } catch (Throwable th5) {
                    th = th5;
                    fileInputStream2 = fileInputStream;
                    t95.m187604b(fileInputStream2);
                    throw th;
                }
            }
            t95.m187604b(fileInputStream);
            Matrix matrix = new Matrix();
            int iM168763b = m168763b(bitmapDecodeStream);
            float f = this.f148733g / this.f148731e;
            matrix.postScale(f, f);
            try {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeStream, 0, 0, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight(), matrix, true);
                if (NullChecker.m81303a(e30Var)) {
                    e30Var.call(bitmapCreateBitmap);
                }
                if (bitmapCreateBitmap != bitmapDecodeStream) {
                    bitmapDecodeStream.recycle();
                }
                bitmap = bitmapCreateBitmap;
            } catch (OutOfMemoryError e) {
                CrashHelper.m81296c(e);
            }
            System.gc();
            bitmap.compress(this.f148734h, iM168763b, new FileOutputStream(fileM145083O));
            n6f.m158039a(file2, fileM145083O, true);
            return fileM145083O.getAbsolutePath();
        } catch (Throwable th6) {
            th = th6;
        }
    }

    /* JADX INFO: renamed from: g */
    public float m168766g(BitmapFactory.Options options, int i, int i2) {
        int i3;
        int i4;
        float f;
        if (!m168767h(options) || (i3 = options.outWidth) == 0 || (i4 = options.outHeight) == 0) {
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
    public final boolean m168767h(BitmapFactory.Options options) {
        int i = options.outWidth;
        int i2 = options.outHeight;
        if (i != 0 && i2 != 0) {
            boolean zM116012h = eew.m116012h(App.f15369e);
            if (i > i2) {
                float f = i / i2;
                return f <= ((float) this.f148737k) && f >= ((float) this.f148736j) && !zM116012h;
            }
            float f2 = i2 / i;
            if (f2 >= this.f148738l && f2 <= this.f148739m && !zM116012h) {
                return true;
            }
        }
        return false;
    }

    public pgm(String str, int i) {
        this(str, i, 0, Bitmap.CompressFormat.JPEG, true);
    }

    public pgm(String str) {
        this(str, f148725n, 0, Bitmap.CompressFormat.JPEG, true);
    }
}
