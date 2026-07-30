package p149l;

import android.media.MediaFormat;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class tjx {
    /* JADX INFO: renamed from: a */
    public static void m189415a(MediaFormat mediaFormat, String str, @Nullable byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m189416b(MediaFormat mediaFormat, @Nullable de5 de5Var) {
        if (de5Var != null) {
            m189418d(mediaFormat, "color-transfer", de5Var.f85710c);
            m189418d(mediaFormat, "color-standard", de5Var.f85708a);
            m189418d(mediaFormat, "color-range", de5Var.f85709b);
            m189415a(mediaFormat, "hdr-static-info", de5Var.f85711d);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m189417c(MediaFormat mediaFormat, String str, float f) {
        if (f != -1.0f) {
            mediaFormat.setFloat(str, f);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m189418d(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m189419e(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer("csd-" + i, ByteBuffer.wrap(list.get(i)));
        }
    }
}
