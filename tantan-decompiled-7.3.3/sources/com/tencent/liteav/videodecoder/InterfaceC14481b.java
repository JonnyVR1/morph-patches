package com.tencent.liteav.videodecoder;

import android.view.Surface;
import com.tencent.liteav.basic.p092b.InterfaceC14170b;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.tencent.liteav.videodecoder.b */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC14481b {
    int GetDecodeCost();

    int config(Surface surface);

    void decode(TXSNALPacket tXSNALPacket);

    void enableLimitDecCache(boolean z);

    boolean isHevc();

    void setListener(InterfaceC14485f interfaceC14485f);

    void setNotifyListener(WeakReference<InterfaceC14170b> weakReference);

    int start(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, boolean z, boolean z2);

    void stop();
}
