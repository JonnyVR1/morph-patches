package p153l;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class c5f extends gpf0 {
    @Override // p153l.gpf0
    /* JADX INFO: renamed from: b */
    public Metadata mo108050b(ba00 ba00Var, ByteBuffer byteBuffer) {
        return new Metadata(m108051c(new ig60(byteBuffer.array(), byteBuffer.limit())));
    }

    /* JADX INFO: renamed from: c */
    public EventMessage m108051c(ig60 ig60Var) {
        return new EventMessage((String) w11.m204369e(ig60Var.m139789B()), (String) w11.m204369e(ig60Var.m139789B()), ig60Var.m139788A(), ig60Var.m139788A(), Arrays.copyOfRange(ig60Var.m139815e(), ig60Var.m139816f(), ig60Var.m139817g()));
    }
}
