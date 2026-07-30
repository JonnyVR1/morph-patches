package p153l;

import android.media.MediaFormat;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class qsx {
    /* JADX INFO: renamed from: a */
    public static void m177821a(MediaFormat mediaFormat, String str, @Nullable byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m177822b(MediaFormat mediaFormat, @Nullable df5 df5Var) {
        if (df5Var != null) {
            m177824d(mediaFormat, "color-transfer", df5Var.f88125c);
            m177824d(mediaFormat, "color-standard", df5Var.f88123a);
            m177824d(mediaFormat, "color-range", df5Var.f88124b);
            m177821a(mediaFormat, "hdr-static-info", df5Var.f88126d);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m177823c(MediaFormat mediaFormat, String str, float f) {
        if (f != -1.0f) {
            mediaFormat.setFloat(str, f);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m177824d(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m177825e(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer("csd-" + i, ByteBuffer.wrap(list.get(i)));
        }
    }
}
