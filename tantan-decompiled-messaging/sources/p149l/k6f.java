package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(27)
public final class k6f implements ImageHeaderParser {
    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    /* JADX INFO: renamed from: a */
    public ImageHeaderParser.ImageType mo5342a(@NonNull InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    /* JADX INFO: renamed from: b */
    public ImageHeaderParser.ImageType mo5343b(@NonNull ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* JADX INFO: renamed from: c */
    public int mo5344c(@NonNull InputStream inputStream, @NonNull h01 h01Var) throws IOException {
        int attributeInt = new j6f(inputStream).getAttributeInt(j6f.TAG_ORIENTATION, 1);
        if (attributeInt == 0) {
            return -1;
        }
        return attributeInt;
    }
}
