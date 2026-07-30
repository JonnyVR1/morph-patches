package p149l;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.resource.bitmap.C1093a;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class xp3 implements wvc0<ByteBuffer, Bitmap> {

    /* JADX INFO: renamed from: a */
    private final C1093a f193894a;

    public xp3(C1093a c1093a) {
        this.f193894a = c1093a;
    }

    @Override // p149l.wvc0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public rvc0<Bitmap> mo5553b(@NonNull ByteBuffer byteBuffer, int i, int i2, @NonNull px50 px50Var) throws IOException {
        return this.f193894a.m5541f(eq3.m117707f(byteBuffer), i, i2, px50Var);
    }

    @Override // p149l.wvc0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo5552a(@NonNull ByteBuffer byteBuffer, @NonNull px50 px50Var) {
        return this.f193894a.m5545q(byteBuffer);
    }
}
