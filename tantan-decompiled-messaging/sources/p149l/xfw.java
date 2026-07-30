package p149l;

import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import net.jpountz.lz4.LZ4Factory;

/* JADX INFO: loaded from: classes4.dex */
public class xfw implements apl {
    @Override // p149l.apl
    /* JADX INFO: renamed from: a */
    public byte[] mo98141a(byte[] bArr) {
        return LZ4Factory.fastestInstance().safeDecompressor().decompress(bArr, ShareConstants.MD5_FILE_BUF_LENGTH);
    }
}
