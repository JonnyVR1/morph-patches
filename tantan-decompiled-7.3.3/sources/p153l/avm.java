package p153l;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(api = 28)
public final class avm implements z3d0<InputStream, Bitmap> {

    /* JADX INFO: renamed from: a */
    private final j23 f73631a = new j23();

    @Override // p153l.z3d0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public u3d0<Bitmap> mo5554b(@NonNull InputStream inputStream, int i, int i2, @NonNull u560 u560Var) throws IOException {
        return this.f73631a.m143186c(ImageDecoder.createSource(er3.m122095b(inputStream)), i, i2, u560Var);
    }

    @Override // p153l.z3d0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo5553a(@NonNull InputStream inputStream, @NonNull u560 u560Var) throws IOException {
        return true;
    }
}
