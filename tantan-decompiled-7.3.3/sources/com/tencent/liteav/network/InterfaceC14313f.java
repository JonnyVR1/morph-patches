package com.tencent.liteav.network;

import com.tencent.liteav.basic.structs.C14204a;
import com.tencent.liteav.basic.structs.TXSNALPacket;

/* JADX INFO: renamed from: com.tencent.liteav.network.f */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC14313f {
    void onPullAudio(C14204a c14204a);

    void onPullNAL(TXSNALPacket tXSNALPacket);
}
