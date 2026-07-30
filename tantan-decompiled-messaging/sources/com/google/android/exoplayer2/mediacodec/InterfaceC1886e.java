package com.google.android.exoplayer2.mediacodec;

import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.e */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface InterfaceC1886e {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC1886e f7910a = new InterfaceC1886e() { // from class: l.qix
        @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1886e
        /* JADX INFO: renamed from: a */
        public final List mo10526a(String str, boolean z, boolean z2) {
            return MediaCodecUtil.m10458t(str, z, z2);
        }
    };

    /* JADX INFO: renamed from: a */
    List<C1885d> mo10526a(String str, boolean z, boolean z2) throws MediaCodecUtil.DecoderQueryException;
}
