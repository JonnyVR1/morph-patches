package p149l;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class y3f extends ygf0 {
    @Override // p149l.ygf0
    /* JADX INFO: renamed from: b */
    public Metadata mo122590b(e100 e100Var, ByteBuffer byteBuffer) {
        return new Metadata(m212801c(new d860(byteBuffer.array(), byteBuffer.limit())));
    }

    /* JADX INFO: renamed from: c */
    public EventMessage m212801c(d860 d860Var) {
        return new EventMessage((String) p11.m167011e(d860Var.m110273B()), (String) p11.m167011e(d860Var.m110273B()), d860Var.m110272A(), d860Var.m110272A(), Arrays.copyOfRange(d860Var.m110299e(), d860Var.m110300f(), d860Var.m110301g()));
    }
}
