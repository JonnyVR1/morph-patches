package p149l;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.EncodeStrategy;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class m13 implements zvc0<Bitmap> {

    /* JADX INFO: renamed from: b */
    public static final kx50<Integer> f130793b = kx50.m147678f("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);

    /* JADX INFO: renamed from: c */
    public static final kx50<Bitmap.CompressFormat> f130794c = kx50.m147677e("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");

    /* JADX INFO: renamed from: a */
    @Nullable
    private final h01 f130795a;

    @Deprecated
    public m13() {
        this.f130795a = null;
    }

    /* JADX INFO: renamed from: d */
    private Bitmap.CompressFormat m152561d(Bitmap bitmap, px50 px50Var) {
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) px50Var.m171822c(f130794c);
        if (compressFormat != null) {
            return compressFormat;
        }
        return bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
    }

    @Override // p149l.zvc0
    @NonNull
    /* JADX INFO: renamed from: b */
    public EncodeStrategy mo144138b(@NonNull px50 px50Var) {
        return EncodeStrategy.TRANSFORMED;
    }

    @Override // p149l.rze
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo98228a(@NonNull rvc0<Bitmap> rvc0Var, @NonNull File file, @NonNull px50 px50Var) {
        boolean z;
        Bitmap bitmap = rvc0Var.get();
        Bitmap.CompressFormat compressFormatM152561d = m152561d(bitmap, px50Var);
        m1k.m152597c("encode: [%dx%d] %s", Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), compressFormatM152561d);
        try {
            long jM147808b = kxv.m147808b();
            int iIntValue = ((Integer) px50Var.m171822c(f130793b)).intValue();
            OutputStream zg3Var = null;
            try {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        zg3Var = this.f130795a != null ? new zg3(fileOutputStream, this.f130795a) : fileOutputStream;
                        bitmap.compress(compressFormatM152561d, iIntValue, zg3Var);
                        zg3Var.close();
                        try {
                            zg3Var.close();
                        } catch (IOException unused) {
                        }
                        z = true;
                    } catch (IOException unused2) {
                        zg3Var = fileOutputStream;
                        Log.isLoggable("BitmapEncoder", 3);
                        if (zg3Var != null) {
                            try {
                                zg3Var.close();
                            } catch (IOException unused3) {
                            }
                        }
                        z = false;
                    } catch (Throwable th) {
                        th = th;
                        zg3Var = fileOutputStream;
                        if (zg3Var != null) {
                            try {
                                zg3Var.close();
                            } catch (IOException unused4) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException unused5) {
                }
                if (Log.isLoggable("BitmapEncoder", 2)) {
                    Objects.toString(compressFormatM152561d);
                    sck0.m183408h(bitmap);
                    kxv.m147807a(jM147808b);
                    Objects.toString(px50Var.m171822c(f130794c));
                    bitmap.hasAlpha();
                }
                m1k.m152598d();
                return z;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            m1k.m152598d();
            throw th3;
        }
    }

    public m13(@NonNull h01 h01Var) {
        this.f130795a = h01Var;
    }
}
