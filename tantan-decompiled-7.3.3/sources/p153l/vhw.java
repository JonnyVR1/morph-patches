package p153l;

import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import net.jpountz.lz4.LZ4Factory;

/* JADX INFO: loaded from: classes5.dex */
public class vhw implements mrl {
    @Override // p153l.mrl
    /* JADX INFO: renamed from: a */
    public byte[] mo159708a(byte[] bArr) {
        return LZ4Factory.fastestInstance().safeDecompressor().decompress(bArr, ShareConstants.MD5_FILE_BUF_LENGTH);
    }
}
