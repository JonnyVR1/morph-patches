package p153l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class gpf0 implements w900 {
    @Override // p153l.w900
    @Nullable
    /* JADX INFO: renamed from: a */
    public final Metadata mo131256a(ba00 ba00Var) {
        ByteBuffer byteBuffer = (ByteBuffer) w11.m204369e(ba00Var.f7412c);
        w11.m204365a(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (ba00Var.m97778o()) {
            return null;
        }
        return mo108050b(ba00Var, byteBuffer);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public abstract Metadata mo108050b(ba00 ba00Var, ByteBuffer byteBuffer);
}
