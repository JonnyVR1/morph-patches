package com.tencent.liteav.videodecoder;

import android.view.Surface;
import com.tencent.liteav.basic.p087b.InterfaceC14007b;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.tencent.liteav.videodecoder.b */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC14318b {
    int GetDecodeCost();

    int config(Surface surface);

    void decode(TXSNALPacket tXSNALPacket);

    void enableLimitDecCache(boolean z);

    boolean isHevc();

    void setListener(InterfaceC14322f interfaceC14322f);

    void setNotifyListener(WeakReference<InterfaceC14007b> weakReference);

    int start(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, boolean z, boolean z2);

    void stop();
}
