package p153l;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.scte35.PrivateCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceNullCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand;
import com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class oxf0 extends gpf0 {

    /* JADX INFO: renamed from: a */
    public final ig60 f149663a = new ig60();

    /* JADX INFO: renamed from: b */
    public final hg60 f149664b = new hg60();

    /* JADX INFO: renamed from: c */
    public h0j0 f149665c;

    @Override // p153l.gpf0
    /* JADX INFO: renamed from: b */
    public Metadata mo108050b(ba00 ba00Var, ByteBuffer byteBuffer) {
        Metadata.Entry spliceNullCommand;
        h0j0 h0j0Var = this.f149665c;
        if (h0j0Var == null || ba00Var.f75635i != h0j0Var.m133177e()) {
            h0j0 h0j0Var2 = new h0j0(ba00Var.f7414e);
            this.f149665c = h0j0Var2;
            h0j0Var2.m133173a(ba00Var.f7414e - ba00Var.f75635i);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        this.f149663a.m139806S(bArrArray, iLimit);
        this.f149664b.m134912o(bArrArray, iLimit);
        this.f149664b.m134915r(39);
        long jM134905h = (((long) this.f149664b.m134905h(1)) << 32) | ((long) this.f149664b.m134905h(32));
        this.f149664b.m134915r(20);
        int iM134905h = this.f149664b.m134905h(12);
        int iM134905h2 = this.f149664b.m134905h(8);
        this.f149663a.m139809V(14);
        if (iM134905h2 == 0) {
            spliceNullCommand = new SpliceNullCommand();
        } else if (iM134905h2 == 255) {
            spliceNullCommand = PrivateCommand.m10648a(this.f149663a, iM134905h, jM134905h);
        } else if (iM134905h2 == 4) {
            spliceNullCommand = SpliceScheduleCommand.m10658a(this.f149663a);
        } else if (iM134905h2 != 5) {
            spliceNullCommand = iM134905h2 != 6 ? null : TimeSignalCommand.m10671a(this.f149663a, jM134905h, this.f149665c);
        } else {
            spliceNullCommand = SpliceInsertCommand.m10651a(this.f149663a, jM134905h, this.f149665c);
        }
        return spliceNullCommand == null ? new Metadata(new Metadata.Entry[0]) : new Metadata(spliceNullCommand);
    }
}
