package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(27)
public final class q7f implements ImageHeaderParser {
    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    /* JADX INFO: renamed from: a */
    public ImageHeaderParser.ImageType mo5354a(@NonNull InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    /* JADX INFO: renamed from: b */
    public ImageHeaderParser.ImageType mo5355b(@NonNull ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* JADX INFO: renamed from: c */
    public int mo5356c(@NonNull InputStream inputStream, @NonNull o01 o01Var) throws IOException {
        int attributeInt = new p7f(inputStream).getAttributeInt(p7f.TAG_ORIENTATION, 1);
        if (attributeInt == 0) {
            return -1;
        }
        return attributeInt;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* JADX INFO: renamed from: d */
    public int mo5357d(@NonNull ByteBuffer byteBuffer, @NonNull o01 o01Var) throws IOException {
        return mo5356c(er3.m122100g(byteBuffer), o01Var);
    }
}
