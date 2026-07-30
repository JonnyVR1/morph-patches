package p149l;

import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"Ll/tyk;", "", "<init>", "()V", "Ljava/io/InputStream;", "inputStream", "", "a", "(Ljava/io/InputStream;)I", "imagepipeline-base_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class tyk {

    @NotNull
    public static final tyk INSTANCE = new tyk();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final int m191055a(@Nullable InputStream inputStream) {
        if (inputStream == null) {
            tsf.m190536b("HeifExifUtil", "Trying to read Heif Exif from null inputStream -> ignoring");
            return 0;
        }
        try {
            return new j6f(inputStream).getAttributeInt(j6f.TAG_ORIENTATION, 1);
        } catch (IOException e) {
            tsf.m190537c("HeifExifUtil", "Failed reading Heif Exif orientation -> ignoring", e);
            return 0;
        }
    }
}
