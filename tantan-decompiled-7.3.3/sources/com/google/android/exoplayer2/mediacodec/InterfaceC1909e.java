package com.google.android.exoplayer2.mediacodec;

import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.e */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface InterfaceC1909e {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC1909e f7947a = new InterfaceC1909e() { // from class: l.nrx
        @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1909e
        /* JADX INFO: renamed from: a */
        public final List mo10580a(String str, boolean z, boolean z2) {
            return MediaCodecUtil.m10512t(str, z, z2);
        }
    };

    /* JADX INFO: renamed from: a */
    List<C1908d> mo10580a(String str, boolean z, boolean z2) throws MediaCodecUtil.DecoderQueryException;
}
