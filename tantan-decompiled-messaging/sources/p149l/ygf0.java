package p149l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class ygf0 implements z000 {
    @Override // p149l.z000
    @Nullable
    /* JADX INFO: renamed from: a */
    public final Metadata mo214640a(e100 e100Var) {
        ByteBuffer byteBuffer = (ByteBuffer) p11.m167011e(e100Var.f7375c);
        p11.m167007a(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (e100Var.m154494o()) {
            return null;
        }
        return mo122590b(e100Var, byteBuffer);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public abstract Metadata mo122590b(e100 e100Var, ByteBuffer byteBuffer);
}
