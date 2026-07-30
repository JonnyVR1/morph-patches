package p153l;

import com.coremedia.iso.boxes.MovieBox;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public class yox0 extends bpx0 implements fyr0 {

    /* JADX INFO: renamed from: i */
    public gyr0 f201024i;

    /* JADX INFO: renamed from: j */
    public final String f201025j = MovieBox.TYPE;

    public yox0(String str) {
    }

    @Override // p153l.fyr0
    /* JADX INFO: renamed from: b */
    public final void mo128123b(cpx0 cpx0Var, ByteBuffer byteBuffer, long j, cyr0 cyr0Var) throws IOException {
        cpx0Var.zzb();
        byteBuffer.remaining();
        byteBuffer.remaining();
        this.f77833b = cpx0Var;
        this.f77835d = cpx0Var.zzb();
        cpx0Var.mo111835l(cpx0Var.zzb() + j);
        this.f77836e = cpx0Var.zzb();
        this.f77832a = cyr0Var;
    }

    @Override // p153l.fyr0
    /* JADX INFO: renamed from: d */
    public final void mo128124d(gyr0 gyr0Var) {
        this.f201024i = gyr0Var;
    }

    @Override // p153l.fyr0
    public final String zza() {
        return this.f201025j;
    }
}
