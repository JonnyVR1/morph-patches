package p149l;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(api = 28)
public final class ysm implements wvc0<InputStream, Bitmap> {

    /* JADX INFO: renamed from: a */
    private final t13 f199794a = new t13();

    @Override // p149l.wvc0
    @Nullable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public rvc0<Bitmap> mo5553b(@NonNull InputStream inputStream, int i, int i2, @NonNull px50 px50Var) throws IOException {
        return this.f199794a.m174358d(ImageDecoder.createSource(eq3.m117703b(inputStream)), i, i2, px50Var);
    }

    @Override // p149l.wvc0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo5552a(@NonNull InputStream inputStream, @NonNull px50 px50Var) throws IOException {
        return true;
    }
}
