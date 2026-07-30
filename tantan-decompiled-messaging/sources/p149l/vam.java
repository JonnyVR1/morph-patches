package p149l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import java.io.EOFException;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class vam {

    /* JADX INFO: renamed from: a */
    public final d860 f180769a = new d860(10);

    @Nullable
    /* JADX INFO: renamed from: a */
    public Metadata m197643a(tqf tqfVar, @Nullable uam.InterfaceC20397a interfaceC20397a) throws Throwable {
        Metadata metadataM192787e = null;
        int i = 0;
        while (true) {
            try {
                tqfVar.mo150655f(this.f180769a.m110299e(), 0, 10);
                this.f180769a.m110292U(0);
                if (this.f180769a.m110282K() != 4801587) {
                    break;
                }
                this.f180769a.m110293V(3);
                int iM110278G = this.f180769a.m110278G();
                int i2 = iM110278G + 10;
                if (metadataM192787e == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.f180769a.m110299e(), 0, bArr, 0, 10);
                    tqfVar.mo150655f(bArr, 10, iM110278G);
                    metadataM192787e = new uam(interfaceC20397a).m192787e(bArr, i2);
                } else {
                    tqfVar.mo150660m(iM110278G);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        tqfVar.mo150657h();
        tqfVar.mo150660m(i);
        return metadataM192787e;
    }
}
