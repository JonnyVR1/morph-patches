package org.brotli.dec;

import com.alibaba.fastjson.asm.Opcodes;
import com.core.glcore.util.DetectDelayStopHelper;
import com.tantanapp.ijk.media.player.IjkMediaMeta;
import org.eclipse.jetty.http.HttpStatus;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes2.dex */
final class Prefix {
    static final int[] BLOCK_LENGTH_OFFSET = {1, 5, 9, 13, 17, 25, 33, 41, 49, 65, 81, 97, 113, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA, 177, 209, 241, HttpStatus.USE_PROXY_305, 369, 497, DetectDelayStopHelper.TYPE_DETECT_CRYING_FACE, 1265, 2289, 4337, 8433, 16625};
    static final int[] BLOCK_LENGTH_N_BITS = {2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 7, 8, 9, 10, 11, 12, 13, 24};
    static final int[] INSERT_LENGTH_OFFSET = {0, 1, 2, 3, 4, 5, 6, 8, 10, 14, 18, 26, 34, 50, 66, 98, 130, CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256, 322, IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED_BASELINE, 1090, 2114, 6210, 22594};
    static final int[] INSERT_LENGTH_N_BITS = {0, 0, 0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7, 8, 9, 10, 12, 14, 24};
    static final int[] COPY_LENGTH_OFFSET = {2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 14, 18, 22, 30, 38, 54, 70, 102, 134, Opcodes.IFNULL, 326, 582, 1094, 2118};
    static final int[] COPY_LENGTH_N_BITS = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7, 8, 9, 10, 24};
    static final int[] INSERT_RANGE_LUT = {0, 0, 8, 8, 0, 16, 8, 16, 16};
    static final int[] COPY_RANGE_LUT = {0, 8, 0, 8, 16, 0, 16, 8, 16};
}
