package p149l;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class ree extends phf0 {

    /* JADX INFO: renamed from: o */
    public final see f159049o;

    public ree(List<byte[]> list) {
        super("DvbDecoder");
        d860 d860Var = new d860(list.get(0));
        this.f159049o = new see(d860Var.m110285N(), d860Var.m110285N());
    }

    @Override // p149l.phf0
    /* JADX INFO: renamed from: A */
    public e5g0 mo97681A(byte[] bArr, int i, boolean z) {
        if (z) {
            this.f159049o.m183630r();
        }
        return new tee(this.f159049o.m183629b(bArr, i));
    }
}
