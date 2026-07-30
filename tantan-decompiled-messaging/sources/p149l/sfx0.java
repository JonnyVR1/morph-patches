package p149l;

import com.coremedia.iso.boxes.MovieBox;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public class sfx0 extends vfx0 implements zor0 {

    /* JADX INFO: renamed from: i */
    public apr0 f164349i;

    /* JADX INFO: renamed from: j */
    public final String f164350j = MovieBox.TYPE;

    public sfx0(String str) {
    }

    @Override // p149l.zor0
    /* JADX INFO: renamed from: b */
    public final void mo179149b(wfx0 wfx0Var, ByteBuffer byteBuffer, long j, wor0 wor0Var) throws IOException {
        wfx0Var.zzb();
        byteBuffer.remaining();
        byteBuffer.remaining();
        this.f181330b = wfx0Var;
        this.f181332d = wfx0Var.zzb();
        wfx0Var.mo202997l(wfx0Var.zzb() + j);
        this.f181333e = wfx0Var.zzb();
        this.f181329a = wor0Var;
    }

    @Override // p149l.zor0
    /* JADX INFO: renamed from: d */
    public final void mo179150d(apr0 apr0Var) {
        this.f164349i = apr0Var;
    }

    @Override // p149l.zor0
    public final String zza() {
        return this.f164350j;
    }
}
