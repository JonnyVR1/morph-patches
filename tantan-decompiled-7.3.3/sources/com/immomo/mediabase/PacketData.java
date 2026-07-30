package com.immomo.mediabase;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class PacketData {
    public static final int MEDIA_AUDIO_DATA = 0;
    public static final int MEDIA_VIDEO_DATA = 1;
    private int mMeidaType = -1;
    private MediaCodec.BufferInfo mPacketBufInfo;
    private ByteBuffer mPacketByteBuffer;

    public PacketData(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        this.mPacketByteBuffer = null;
        this.mPacketBufInfo = null;
        this.mPacketByteBuffer = ByteBuffer.allocate(bufferInfo.size);
        byteBuffer.position(0);
        byteBuffer.get(this.mPacketByteBuffer.array(), 0, bufferInfo.size);
        this.mPacketByteBuffer.rewind();
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        this.mPacketBufInfo = bufferInfo2;
        bufferInfo2.size = bufferInfo.size;
        bufferInfo2.offset = bufferInfo.offset;
        bufferInfo2.flags = bufferInfo.flags;
        bufferInfo2.presentationTimeUs = bufferInfo.presentationTimeUs;
    }

    public ByteBuffer getFrameBuffer() {
        return this.mPacketByteBuffer;
    }

    public MediaCodec.BufferInfo getFrameBufferInfo() {
        return this.mPacketBufInfo;
    }

    public int getMediaType() {
        return this.mMeidaType;
    }

    public void setBuffInfo(int i, int i2, int i3, long j, int i4) {
        MediaCodec.BufferInfo bufferInfo = this.mPacketBufInfo;
        bufferInfo.size = i;
        bufferInfo.offset = i2;
        bufferInfo.flags = i3;
        bufferInfo.presentationTimeUs = j;
        this.mMeidaType = i4;
    }

    public void setFrameBuffer(ByteBuffer byteBuffer) {
        this.mPacketByteBuffer = byteBuffer;
    }

    public PacketData(ByteBuffer byteBuffer) {
        this.mPacketBufInfo = null;
        this.mPacketByteBuffer = byteBuffer;
        this.mPacketBufInfo = new MediaCodec.BufferInfo();
    }

    public PacketData(int i) {
        this.mPacketByteBuffer = null;
        this.mPacketBufInfo = null;
        this.mPacketByteBuffer = ByteBuffer.allocate(i);
        this.mPacketBufInfo = new MediaCodec.BufferInfo();
    }
}
