package p149l;

import com.clevertap.android.sdk.Constants;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0014\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019¨\u0006\u001b"}, m87232d2 = {"Ll/lqi0;", "", "<init>", "()V", "", Constants.KEY_ORIENTATION, "a", "(I)I", "Ljava/io/InputStream;", "stream", "length", Constants.INAPP_DATA_TAG, "(Ljava/io/InputStream;I)I", "Ll/lqi0$a;", "tiffHeader", "e", "(Ljava/io/InputStream;ILl/lqi0$a;)I", "", "isLittleEndian", "tagToFind", "c", "(Ljava/io/InputStream;IZI)I", "b", "(Ljava/io/InputStream;IZ)I", "Ljava/lang/Class;", "Ljava/lang/Class;", "TAG", "imagepipeline-base_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class lqi0 {

    @NotNull
    public static final lqi0 INSTANCE = new lqi0();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Class<?> TAG = lqi0.class;

    /* JADX INFO: renamed from: l.lqi0$a */
    @Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u0012\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u0005\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0014\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0013\u0010\u0011¨\u0006\u0015"}, m87232d2 = {"Ll/lqi0$a;", "", "<init>", "()V", "", "a", "Z", "c", "()Z", "f", "(Z)V", "isLittleEndian", "", "b", "I", "()I", Constants.INAPP_DATA_TAG, "(I)V", "byteOrder", "e", "firstIfdOffset", "imagepipeline-base_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class C18286a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public boolean isLittleEndian;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public int byteOrder;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public int firstIfdOffset;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getByteOrder() {
            return this.byteOrder;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getFirstIfdOffset() {
            return this.firstIfdOffset;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIsLittleEndian() {
            return this.isLittleEndian;
        }

        /* JADX INFO: renamed from: d */
        public final void m151037d(int i) {
            this.byteOrder = i;
        }

        /* JADX INFO: renamed from: e */
        public final void m151038e(int i) {
            this.firstIfdOffset = i;
        }

        /* JADX INFO: renamed from: f */
        public final void m151039f(boolean z) {
            this.isLittleEndian = z;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final int m151029a(int orientation) {
        if (orientation == 0 || orientation == 1) {
            return 0;
        }
        if (orientation == 3) {
            return 180;
        }
        if (orientation != 6) {
            return orientation != 8 ? 0 : 270;
        }
        return 90;
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final int m151030d(@NotNull InputStream stream, int length) throws IOException {
        stream.getClass();
        C18286a c18286a = new C18286a();
        lqi0 lqi0Var = INSTANCE;
        int iM151033e = lqi0Var.m151033e(stream, length, c18286a);
        int firstIfdOffset = c18286a.getFirstIfdOffset() - 8;
        if (iM151033e == 0 || firstIfdOffset > iM151033e) {
            return 0;
        }
        stream.skip(firstIfdOffset);
        return lqi0Var.m151031b(stream, lqi0Var.m151032c(stream, iM151033e - firstIfdOffset, c18286a.getIsLittleEndian(), 274), c18286a.getIsLittleEndian());
    }

    /* JADX INFO: renamed from: b */
    public final int m151031b(InputStream stream, int length, boolean isLittleEndian) throws IOException {
        if (length >= 10 && nzf0.m162039a(stream, 2, isLittleEndian) == 3 && nzf0.m162039a(stream, 4, isLittleEndian) == 1) {
            return nzf0.m162039a(stream, 2, isLittleEndian);
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public final int m151032c(InputStream stream, int length, boolean isLittleEndian, int tagToFind) throws IOException {
        if (length < 14) {
            return 0;
        }
        int iM162039a = nzf0.m162039a(stream, 2, isLittleEndian);
        int i = length - 2;
        while (true) {
            int i2 = iM162039a - 1;
            if (iM162039a <= 0 || i < 12) {
                break;
            }
            int i3 = i - 2;
            if (nzf0.m162039a(stream, 2, isLittleEndian) == tagToFind) {
                return i3;
            }
            stream.skip(10L);
            i -= 12;
            iM162039a = i2;
        }
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public final int m151033e(InputStream stream, int length, C18286a tiffHeader) throws IOException {
        if (length <= 8) {
            return 0;
        }
        tiffHeader.m151037d(nzf0.m162039a(stream, 4, false));
        if (tiffHeader.getByteOrder() != 1229531648 && tiffHeader.getByteOrder() != 1296891946) {
            tsf.m190538d(TAG, "Invalid TIFF header");
            return 0;
        }
        tiffHeader.m151039f(tiffHeader.getByteOrder() == 1229531648);
        tiffHeader.m151038e(nzf0.m162039a(stream, 4, tiffHeader.getIsLittleEndian()));
        int i = length - 8;
        if (tiffHeader.getFirstIfdOffset() >= 8 && tiffHeader.getFirstIfdOffset() - 8 <= i) {
            return i;
        }
        tsf.m190538d(TAG, "Invalid offset");
        return 0;
    }
}
