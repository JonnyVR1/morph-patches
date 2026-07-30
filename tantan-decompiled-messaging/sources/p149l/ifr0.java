package p149l;

import java.io.IOException;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;

/* JADX INFO: loaded from: classes6.dex */
public final class ifr0 implements j5r0 {

    /* JADX INFO: renamed from: a */
    public final x6r0 f113050a = new x6r0(35152, 2, DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_PNG);

    @Override // p149l.j5r0
    /* JADX INFO: renamed from: c */
    public final void mo100820c(long j, long j2) {
        this.f113050a.mo100820c(j, j2);
    }

    @Override // p149l.j5r0
    /* JADX INFO: renamed from: d */
    public final boolean mo100821d(k5r0 k5r0Var) throws IOException {
        return this.f113050a.mo100821d(k5r0Var);
    }

    @Override // p149l.j5r0
    /* JADX INFO: renamed from: e */
    public final void mo100822e(m5r0 m5r0Var) {
        this.f113050a.mo100822e(m5r0Var);
    }

    @Override // p149l.j5r0
    /* JADX INFO: renamed from: f */
    public final int mo100823f(k5r0 k5r0Var, s6r0 s6r0Var) throws IOException {
        return this.f113050a.mo100823f(k5r0Var, s6r0Var);
    }
}
