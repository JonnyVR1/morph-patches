package p153l;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class vfe extends xpf0 {

    /* JADX INFO: renamed from: o */
    public final wfe f183896o;

    public vfe(List<byte[]> list) {
        super("DvbDecoder");
        ig60 ig60Var = new ig60(list.get(0));
        this.f183896o = new wfe(ig60Var.m139801N(), ig60Var.m139801N());
    }

    @Override // p153l.xpf0
    /* JADX INFO: renamed from: A */
    public mdg0 mo122811A(byte[] bArr, int i, boolean z) {
        if (z) {
            this.f183896o.m206115r();
        }
        return new xfe(this.f183896o.m206114b(bArr, i));
    }
}
