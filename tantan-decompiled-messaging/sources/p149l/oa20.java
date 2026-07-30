package p149l;

import com.p046p1.mobile.putong.api.api.NKResult;
import org.spongycastle.crypto.engines.AESFastEngine;
import org.spongycastle.crypto.modes.CBCBlockCipher;
import org.spongycastle.crypto.paddings.PaddedBufferedBlockCipher;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;

/* JADX INFO: loaded from: classes9.dex */
public class oa20 {
    /* JADX INFO: renamed from: a */
    public static NKResult m163223a(byte[] bArr, byte[] bArr2, byte[] bArr3) throws Exception {
        PaddedBufferedBlockCipher paddedBufferedBlockCipher = new PaddedBufferedBlockCipher(new CBCBlockCipher(new AESFastEngine()));
        paddedBufferedBlockCipher.init(true, new ParametersWithIV(new KeyParameter(bArr), bArr3));
        byte[] bArr4 = new byte[paddedBufferedBlockCipher.getOutputSize(bArr2.length)];
        paddedBufferedBlockCipher.doFinal(bArr4, paddedBufferedBlockCipher.processBytes(bArr2, 0, bArr2.length, bArr4, 0));
        return new NKResult(bArr4, bArr3);
    }
}
