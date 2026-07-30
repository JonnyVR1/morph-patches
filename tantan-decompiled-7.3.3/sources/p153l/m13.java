package p153l;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes.dex */
public class m13 implements y4d0<Bitmap, byte[]> {

    /* JADX INFO: renamed from: a */
    private final Bitmap.CompressFormat f134379a;

    /* JADX INFO: renamed from: b */
    private final int f134380b;

    public m13() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    @Override // p153l.y4d0
    @Nullable
    /* JADX INFO: renamed from: a */
    public u3d0<byte[]> mo95615a(@NonNull u3d0<Bitmap> u3d0Var, @NonNull u560 u560Var) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        u3d0Var.get().compress(this.f134379a, this.f134380b, byteArrayOutputStream);
        u3d0Var.recycle();
        return new wr3(byteArrayOutputStream.toByteArray());
    }

    public m13(@NonNull Bitmap.CompressFormat compressFormat, int i) {
        this.f134379a = compressFormat;
        this.f134380b = i;
    }
}
