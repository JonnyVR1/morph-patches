package p149l;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes.dex */
public class x03 implements uwc0<Bitmap, byte[]> {

    /* JADX INFO: renamed from: a */
    private final Bitmap.CompressFormat f188921a;

    /* JADX INFO: renamed from: b */
    private final int f188922b;

    public x03() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    @Override // p149l.uwc0
    @Nullable
    /* JADX INFO: renamed from: a */
    public rvc0<byte[]> mo140781a(@NonNull rvc0<Bitmap> rvc0Var, @NonNull px50 px50Var) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        rvc0Var.get().compress(this.f188921a, this.f188922b, byteArrayOutputStream);
        rvc0Var.recycle();
        return new xq3(byteArrayOutputStream.toByteArray());
    }

    public x03(@NonNull Bitmap.CompressFormat compressFormat, int i) {
        this.f188921a = compressFormat;
        this.f188922b = i;
    }
}
