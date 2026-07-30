package p153l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import java.io.EOFException;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class ldm {

    /* JADX INFO: renamed from: a */
    public final ig60 f131657a = new ig60(10);

    @Nullable
    /* JADX INFO: renamed from: a */
    public Metadata m153782a(asf asfVar, @Nullable kdm.InterfaceC18140a interfaceC18140a) throws Throwable {
        Metadata metadataM149237e = null;
        int i = 0;
        while (true) {
            try {
                asfVar.mo99900f(this.f131657a.m139815e(), 0, 10);
                this.f131657a.m139808U(0);
                if (this.f131657a.m139798K() != 4801587) {
                    break;
                }
                this.f131657a.m139809V(3);
                int iM139794G = this.f131657a.m139794G();
                int i2 = iM139794G + 10;
                if (metadataM149237e == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.f131657a.m139815e(), 0, bArr, 0, 10);
                    asfVar.mo99900f(bArr, 10, iM139794G);
                    metadataM149237e = new kdm(interfaceC18140a).m149237e(bArr, i2);
                } else {
                    asfVar.mo99904m(iM139794G);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        asfVar.mo99902h();
        asfVar.mo99904m(i);
        return metadataM149237e;
    }
}
