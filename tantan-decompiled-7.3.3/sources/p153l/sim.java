package p153l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.liteav.audio.TXEAudioDef;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;

/* JADX INFO: loaded from: classes8.dex */
public class sim {

    /* JADX INFO: renamed from: n */
    public static final int f168838n;

    /* JADX INFO: renamed from: o */
    public static pcj<Boolean> f168839o;

    /* JADX INFO: renamed from: a */
    public final String f168840a;

    /* JADX INFO: renamed from: b */
    public final int[] f168841b;

    /* JADX INFO: renamed from: c */
    public final String f168842c;

    /* JADX INFO: renamed from: d */
    public final int[] f168843d;

    /* JADX INFO: renamed from: e */
    public final float f168844e;

    /* JADX INFO: renamed from: f */
    public final boolean f168845f;

    /* JADX INFO: renamed from: g */
    public final int f168846g;

    /* JADX INFO: renamed from: h */
    public final Bitmap.CompressFormat f168847h;

    /* JADX INFO: renamed from: i */
    public String f168848i;

    /* JADX INFO: renamed from: j */
    public final int f168849j;

    /* JADX INFO: renamed from: k */
    public final int f168850k;

    /* JADX INFO: renamed from: l */
    public final int f168851l;

    /* JADX INFO: renamed from: m */
    public final int f168852m;

    static {
        f168838n = App.f16091h ? TXEAudioDef.TXE_OPUS_SAMPLE_NUM : 1440;
    }

    public sim(String str, int i, int i2, Bitmap.CompressFormat compressFormat, boolean z) {
        ExifInterface exifInterface;
        int i3;
        Bitmap.CompressFormat compressFormat2;
        String attribute;
        this.f168849j = asx.m99990h().m99993c();
        this.f168850k = asx.m99990h().m99992b();
        this.f168851l = asx.m99990h().m99995e();
        this.f168852m = asx.m99990h().m99994d();
        this.f168840a = str;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        int i4 = options.outHeight;
        int i5 = options.outWidth;
        this.f168841b = new int[]{i5, i4};
        boolean z2 = false;
        float fM186027g = m186027g(options, i, i2);
        this.f168844e = fM186027g;
        this.f168846g = Math.max((int) Math.pow(2.0d, (int) Math.floor(Math.log(fM186027g) / Math.log(2.0d))), 1);
        try {
            exifInterface = new ExifInterface(str);
        } catch (IOException e) {
            CrashHelper.m82479c(e);
            exifInterface = null;
        }
        int iRound = Math.round(i5 / this.f168844e);
        int iRound2 = Math.round(i4 / this.f168844e);
        if (exifInterface == null || (attribute = exifInterface.getAttribute(p7f.TAG_ORIENTATION)) == null) {
            this.f168843d = new int[]{iRound, iRound2};
            i3 = 0;
        } else {
            i3 = Integer.parseInt(attribute);
            if (i3 == 6 || i3 == 8) {
                this.f168843d = new int[]{iRound2, iRound};
            } else {
                this.f168843d = new int[]{iRound, iRound2};
            }
        }
        String str2 = options.outMimeType;
        this.f168842c = str2;
        if (!z) {
            this.f168848i = str2;
        } else if (m186021c()) {
            this.f168848i = i3 > 1 ? DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG : "image/webp";
        } else {
            this.f168848i = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
        }
        if (this.f168844e <= 1.0f && DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG.equals(str2)) {
            z2 = true;
        }
        this.f168845f = z2;
        if (m186021c() && (compressFormat == (compressFormat2 = Bitmap.CompressFormat.JPEG) || compressFormat == Bitmap.CompressFormat.WEBP || z)) {
            this.f168847h = i3 <= 1 ? Bitmap.CompressFormat.WEBP : compressFormat2;
        } else {
            this.f168847h = i3 > 1 ? Bitmap.CompressFormat.JPEG : compressFormat;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m186020a(Bitmap bitmap) {
        return m186022f(bitmap.getAllocationByteCount());
    }

    /* JADX INFO: renamed from: c */
    public static boolean m186021c() {
        pcj<Boolean> pcjVar = f168839o;
        return pcjVar != null && pcjVar.call().booleanValue();
    }

    /* JADX INFO: renamed from: f */
    public static int m186022f(int i) {
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
    public static void m186023i(@Nullable pcj<Boolean> pcjVar) {
        f168839o = pcjVar;
    }

    /* JADX INFO: renamed from: b */
    public final int m186024b(Bitmap bitmap) {
        if (m186021c()) {
            return m186022f(bitmap.getAllocationByteCount());
        }
        return 95;
    }

    /* JADX INFO: renamed from: d */
    public String m186025d() throws IOException {
        return m186026e(false, null);
    }

    /* JADX INFO: renamed from: e */
    public String m186026e(boolean z, y20<Bitmap> y20Var) throws Throwable {
        Throwable th;
        FileInputStream fileInputStream;
        Bitmap bitmapDecodeStream;
        Throwable th2;
        Bitmap bitmapM174807a;
        FileInputStream fileInputStream2 = null;
        FileInputStream fileInputStream3 = null;
        Bitmap bitmap = null;
        if (this.f168845f) {
            if (NullChecker.m82486a(y20Var)) {
                File file = new File(this.f168840a);
                if (z) {
                    bitmapM174807a = q110.m174807a(this.f168840a);
                } else {
                    try {
                        FileInputStream fileInputStream4 = new FileInputStream(file);
                        try {
                            Bitmap bitmapDecodeStream2 = BitmapFactory.decodeStream(fileInputStream4, null, null);
                            ua5.m195158b(fileInputStream4);
                            bitmapM174807a = bitmapDecodeStream2;
                        } catch (Throwable th3) {
                            th2 = th3;
                            fileInputStream3 = fileInputStream4;
                            ua5.m195158b(fileInputStream3);
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        th2 = th4;
                    }
                }
                if (NullChecker.m82486a(bitmapM174807a)) {
                    y20Var.call(bitmapM174807a);
                }
            }
            return this.f168840a;
        }
        File fileM120381O = ecj.m120381O("cache");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = this.f168846g;
        File file2 = new File(this.f168840a);
        try {
            if (z) {
                bitmapDecodeStream = q110.m174807a(this.f168840a);
                fileInputStream = null;
            } else {
                fileInputStream = new FileInputStream(file2);
                try {
                    bitmapDecodeStream = BitmapFactory.decodeStream(fileInputStream, null, options);
                } catch (Throwable th5) {
                    th = th5;
                    fileInputStream2 = fileInputStream;
                    ua5.m195158b(fileInputStream2);
                    throw th;
                }
            }
            ua5.m195158b(fileInputStream);
            Matrix matrix = new Matrix();
            int iM186024b = m186024b(bitmapDecodeStream);
            float f = this.f168846g / this.f168844e;
            matrix.postScale(f, f);
            try {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeStream, 0, 0, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight(), matrix, true);
                if (NullChecker.m82486a(y20Var)) {
                    y20Var.call(bitmapCreateBitmap);
                }
                if (bitmapCreateBitmap != bitmapDecodeStream) {
                    bitmapDecodeStream.recycle();
                }
                bitmap = bitmapCreateBitmap;
            } catch (OutOfMemoryError e) {
                CrashHelper.m82479c(e);
            }
            System.gc();
            bitmap.compress(this.f168847h, iM186024b, new FileOutputStream(fileM120381O));
            t7f.m189564a(file2, fileM120381O, true);
            return fileM120381O.getAbsolutePath();
        } catch (Throwable th6) {
            th = th6;
        }
    }

    /* JADX INFO: renamed from: g */
    public float m186027g(BitmapFactory.Options options, int i, int i2) {
        int i3;
        int i4;
        float f;
        if (!m186028h(options) || (i3 = options.outWidth) == 0 || (i4 = options.outHeight) == 0) {
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
    public final boolean m186028h(BitmapFactory.Options options) {
        int i = options.outWidth;
        int i2 = options.outHeight;
        if (i != 0 && i2 != 0) {
            boolean zM109764h = cgw.m109764h(App.f16088e);
            if (i > i2) {
                float f = i / i2;
                return f <= ((float) this.f168850k) && f >= ((float) this.f168849j) && !zM109764h;
            }
            float f2 = i2 / i;
            if (f2 >= this.f168851l && f2 <= this.f168852m && !zM109764h) {
                return true;
            }
        }
        return false;
    }

    public sim(String str, int i) {
        this(str, i, 0, Bitmap.CompressFormat.JPEG, true);
    }

    public sim(String str) {
        this(str, f168838n, 0, Bitmap.CompressFormat.JPEG, true);
    }
}
