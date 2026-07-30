package com.tencent.liteav.network;

import com.tencent.liteav.basic.structs.C14041a;
import com.tencent.liteav.basic.structs.TXSNALPacket;

/* JADX INFO: renamed from: com.tencent.liteav.network.f */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC14150f {
    void onPullAudio(C14041a c14041a);

    void onPullNAL(TXSNALPacket tXSNALPacket);
}
