package p149l;

import com.alibaba.fastjson.asm.Opcodes;
import com.momo.momortc.MMConstants;
import com.tantanapp.ijk.media.player.IjkMediaMeta;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.logging.Logger;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.Primes;

/* JADX INFO: loaded from: classes7.dex */
@eud(tags = {19, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, MMConstants.ERR_WATERMARK_READ, 130, 131, CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA, 134, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA, CipherSuite.TLS_PSK_WITH_RC4_128_SHA, CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA, 140, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA, CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA, CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA, 144, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA, CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA, CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA, 148, 149, 150, 151, CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA, 153, 154, CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, 157, 158, 159, 160, 161, 162, 163, CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256, 165, 166, 167, CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256, 169, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384, 176, 177, 178, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384, 180, 181, 182, 183, 184, 185, CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256, 187, 188, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA256, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256, 192, 193, CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, Opcodes.IFNULL, Opcodes.IFNONNULL, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, Primes.SMALL_FACTOR_LIMIT, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE, 245, 246, 247, 248, 249, 250, 251, 252, 253})
public class gpf extends vi2 {

    /* JADX INFO: renamed from: e */
    private static Logger f103797e = Logger.getLogger(gpf.class.getName());

    /* JADX INFO: renamed from: d */
    byte[] f103798d;

    @Override // p149l.vi2
    /* JADX INFO: renamed from: e */
    public void mo106861e(ByteBuffer byteBuffer) throws IOException {
        if (m198491a() > 0) {
            byte[] bArr = new byte[this.f181548b];
            this.f103798d = bArr;
            byteBuffer.get(bArr);
        }
    }

    @Override // p149l.vi2
    public String toString() {
        StringBuilder sb = new StringBuilder("ExtensionDescriptor{bytes=");
        byte[] bArr = this.f103798d;
        sb.append(bArr == null ? "null" : qzk.m177232a(bArr));
        sb.append('}');
        return sb.toString();
    }
}
