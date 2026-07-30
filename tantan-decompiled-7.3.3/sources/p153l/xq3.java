package p153l;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.resource.bitmap.C1110a;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class xq3 implements z3d0<ByteBuffer, Bitmap> {

    /* JADX INFO: renamed from: a */
    private final C1110a f195772a;

    public xq3(C1110a c1110a) {
        this.f195772a = c1110a;
    }

    @Override // p153l.z3d0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public u3d0<Bitmap> mo5554b(@NonNull ByteBuffer byteBuffer, int i, int i2, @NonNull u560 u560Var) throws IOException {
        return this.f195772a.m5585g(byteBuffer, i, i2, u560Var);
    }

    @Override // p153l.z3d0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo5553a(@NonNull ByteBuffer byteBuffer, @NonNull u560 u560Var) {
        return this.f195772a.m5588q(byteBuffer);
    }
}
