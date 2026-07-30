package p149l;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.scte35.PrivateCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceNullCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand;
import com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class fpf0 extends ygf0 {

    /* JADX INFO: renamed from: a */
    public final d860 f98692a = new d860();

    /* JADX INFO: renamed from: b */
    public final c860 f98693b = new c860();

    /* JADX INFO: renamed from: c */
    public eri0 f98694c;

    @Override // p149l.ygf0
    /* JADX INFO: renamed from: b */
    public Metadata mo122590b(e100 e100Var, ByteBuffer byteBuffer) {
        Metadata.Entry spliceNullCommand;
        eri0 eri0Var = this.f98694c;
        if (eri0Var == null || e100Var.f88695i != eri0Var.m117840e()) {
            eri0 eri0Var2 = new eri0(e100Var.f7377e);
            this.f98694c = eri0Var2;
            eri0Var2.m117836a(e100Var.f7377e - e100Var.f88695i);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        this.f98692a.m110290S(bArrArray, iLimit);
        this.f98693b.m105671o(bArrArray, iLimit);
        this.f98693b.m105674r(39);
        long jM105664h = (((long) this.f98693b.m105664h(1)) << 32) | ((long) this.f98693b.m105664h(32));
        this.f98693b.m105674r(20);
        int iM105664h = this.f98693b.m105664h(12);
        int iM105664h2 = this.f98693b.m105664h(8);
        this.f98692a.m110293V(14);
        if (iM105664h2 == 0) {
            spliceNullCommand = new SpliceNullCommand();
        } else if (iM105664h2 == 255) {
            spliceNullCommand = PrivateCommand.m10594a(this.f98692a, iM105664h, jM105664h);
        } else if (iM105664h2 == 4) {
            spliceNullCommand = SpliceScheduleCommand.m10604a(this.f98692a);
        } else if (iM105664h2 != 5) {
            spliceNullCommand = iM105664h2 != 6 ? null : TimeSignalCommand.m10617a(this.f98692a, jM105664h, this.f98694c);
        } else {
            spliceNullCommand = SpliceInsertCommand.m10597a(this.f98692a, jM105664h, this.f98694c);
        }
        return spliceNullCommand == null ? new Metadata(new Metadata.Entry[0]) : new Metadata(spliceNullCommand);
    }
}
