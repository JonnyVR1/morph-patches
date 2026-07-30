package com.tencent.liteav.basic.structs;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class TXSNALPacket {
    public byte[] nalData = null;
    public int nalType = -1;
    public long gopIndex = 0;
    public long gopFrameIndex = 0;
    public long frameIndex = 0;
    public long refFremeIndex = 0;
    public long pts = 0;
    public long dts = 0;
    public int rotation = 0;
    public long sequenceNum = 0;
    public long arrivalTimeMs = 0;
    public int codecId = 0;
    public ByteBuffer buffer = null;
    public MediaCodec.BufferInfo info = null;
    public int streamType = 2;
}
