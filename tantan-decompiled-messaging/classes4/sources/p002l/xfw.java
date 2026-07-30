package p002l;

import net.jpountz.lz4.LZ4Factory;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class xfw implements apl {
    @Override // p002l.apl
    /* JADX INFO: renamed from: a */
    public byte[] mo9992a(byte[] bArr) {
        return LZ4Factory.fastestInstance().safeDecompressor().decompress(bArr, 102400);
    }
}
