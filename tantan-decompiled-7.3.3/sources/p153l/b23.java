package p153l;

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
public class b23 implements c4d0<Bitmap> {

    /* JADX INFO: renamed from: b */
    public static final q560<Integer> f74469b = q560.m175297f("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);

    /* JADX INFO: renamed from: c */
    public static final q560<Bitmap.CompressFormat> f74470c = q560.m175296e("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");

    /* JADX INFO: renamed from: a */
    @Nullable
    private final o01 f74471a;

    @Deprecated
    public b23() {
        this.f74471a = null;
    }

    /* JADX INFO: renamed from: d */
    private Bitmap.CompressFormat m101609d(Bitmap bitmap, u560 u560Var) {
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) u560Var.m194542c(f74470c);
        if (compressFormat != null) {
            return compressFormat;
        }
        return bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
    }

    @Override // p153l.c4d0
    @NonNull
    /* JADX INFO: renamed from: b */
    public EncodeStrategy mo101610b(@NonNull u560 u560Var) {
        return EncodeStrategy.TRANSFORMED;
    }

    @Override // p153l.v0f
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo99642a(@NonNull u3d0<Bitmap> u3d0Var, @NonNull File file, @NonNull u560 u560Var) {
        boolean z;
        Bitmap bitmap = u3d0Var.get();
        Bitmap.CompressFormat compressFormatM101609d = m101609d(bitmap, u560Var);
        d4k.m114203d("encode: [%dx%d] %s", Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), compressFormatM101609d);
        try {
            long jM142879b = izv.m142879b();
            int iIntValue = ((Integer) u560Var.m194542c(f74469b)).intValue();
            OutputStream nh3Var = null;
            try {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        nh3Var = this.f74471a != null ? new nh3(fileOutputStream, this.f74471a) : fileOutputStream;
                        bitmap.compress(compressFormatM101609d, iIntValue, nh3Var);
                        nh3Var.close();
                        try {
                            nh3Var.close();
                        } catch (IOException unused) {
                        }
                        z = true;
                    } catch (IOException unused2) {
                        nh3Var = fileOutputStream;
                        Log.isLoggable("BitmapEncoder", 3);
                        if (nh3Var != null) {
                            try {
                                nh3Var.close();
                            } catch (IOException unused3) {
                            }
                        }
                        z = false;
                    } catch (Throwable th) {
                        th = th;
                        nh3Var = fileOutputStream;
                        if (nh3Var != null) {
                            try {
                                nh3Var.close();
                            } catch (IOException unused4) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException unused5) {
                }
                if (Log.isLoggable("BitmapEncoder", 2)) {
                    Objects.toString(compressFormatM101609d);
                    ylk0.m216584h(bitmap);
                    izv.m142878a(jM142879b);
                    Objects.toString(u560Var.m194542c(f74470c));
                    bitmap.hasAlpha();
                }
                d4k.m114204e();
                return z;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            d4k.m114204e();
            throw th3;
        }
    }

    public b23(@NonNull o01 o01Var) {
        this.f74471a = o01Var;
    }
}
