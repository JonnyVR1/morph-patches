package p153l;

import com.clevertap.android.sdk.Constants;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0014\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019¨\u0006\u001b"}, m88121d2 = {"Ll/ozi0;", "", "<init>", "()V", "", Constants.KEY_ORIENTATION, "a", "(I)I", "Ljava/io/InputStream;", "stream", "length", Constants.INAPP_DATA_TAG, "(Ljava/io/InputStream;I)I", "Ll/ozi0$a;", "tiffHeader", "e", "(Ljava/io/InputStream;ILl/ozi0$a;)I", "", "isLittleEndian", "tagToFind", "c", "(Ljava/io/InputStream;IZI)I", "b", "(Ljava/io/InputStream;IZ)I", "Ljava/lang/Class;", "Ljava/lang/Class;", "TAG", "imagepipeline-base_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class ozi0 {

    @NotNull
    public static final ozi0 INSTANCE = new ozi0();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Class<?> TAG = ozi0.class;

    /* JADX INFO: renamed from: l.ozi0$a */
    @Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u0012\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u0005\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0014\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0013\u0010\u0011¨\u0006\u0015"}, m88121d2 = {"Ll/ozi0$a;", "", "<init>", "()V", "", "a", "Z", "c", "()Z", "f", "(Z)V", "isLittleEndian", "", "b", "I", "()I", Constants.INAPP_DATA_TAG, "(I)V", "byteOrder", "e", "firstIfdOffset", "imagepipeline-base_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class C19258a {

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
        public final void m169971d(int i) {
            this.byteOrder = i;
        }

        /* JADX INFO: renamed from: e */
        public final void m169972e(int i) {
            this.firstIfdOffset = i;
        }

        /* JADX INFO: renamed from: f */
        public final void m169973f(boolean z) {
            this.isLittleEndian = z;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final int m169963a(int orientation) {
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
    public static final int m169964d(@NotNull InputStream stream, int length) throws IOException {
        stream.getClass();
        C19258a c19258a = new C19258a();
        ozi0 ozi0Var = INSTANCE;
        int iM169967e = ozi0Var.m169967e(stream, length, c19258a);
        int firstIfdOffset = c19258a.getFirstIfdOffset() - 8;
        if (iM169967e == 0 || firstIfdOffset > iM169967e) {
            return 0;
        }
        stream.skip(firstIfdOffset);
        return ozi0Var.m169965b(stream, ozi0Var.m169966c(stream, iM169967e - firstIfdOffset, c19258a.getIsLittleEndian(), 274), c19258a.getIsLittleEndian());
    }

    /* JADX INFO: renamed from: b */
    public final int m169965b(InputStream stream, int length, boolean isLittleEndian) throws IOException {
        if (length >= 10 && u7g0.m194855a(stream, 2, isLittleEndian) == 3 && u7g0.m194855a(stream, 4, isLittleEndian) == 1) {
            return u7g0.m194855a(stream, 2, isLittleEndian);
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public final int m169966c(InputStream stream, int length, boolean isLittleEndian, int tagToFind) throws IOException {
        if (length < 14) {
            return 0;
        }
        int iM194855a = u7g0.m194855a(stream, 2, isLittleEndian);
        int i = length - 2;
        while (true) {
            int i2 = iM194855a - 1;
            if (iM194855a <= 0 || i < 12) {
                break;
            }
            int i3 = i - 2;
            if (u7g0.m194855a(stream, 2, isLittleEndian) == tagToFind) {
                return i3;
            }
            stream.skip(10L);
            i -= 12;
            iM194855a = i2;
        }
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public final int m169967e(InputStream stream, int length, C19258a tiffHeader) throws IOException {
        if (length <= 8) {
            return 0;
        }
        tiffHeader.m169971d(u7g0.m194855a(stream, 4, false));
        if (tiffHeader.getByteOrder() != 1229531648 && tiffHeader.getByteOrder() != 1296891946) {
            huf.m137176d(TAG, "Invalid TIFF header");
            return 0;
        }
        tiffHeader.m169973f(tiffHeader.getByteOrder() == 1229531648);
        tiffHeader.m169972e(u7g0.m194855a(stream, 4, tiffHeader.getIsLittleEndian()));
        int i = length - 8;
        if (tiffHeader.getFirstIfdOffset() >= 8 && tiffHeader.getFirstIfdOffset() - 8 <= i) {
            return i;
        }
        huf.m137176d(TAG, "Invalid offset");
        return 0;
    }
}
