package p153l;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class ad60 {

    /* JADX INFO: renamed from: a */
    private ByteBuffer f69788a;

    /* JADX INFO: renamed from: b */
    private MediaCodec.BufferInfo f69789b;

    /* JADX INFO: renamed from: c */
    private int f69790c = -1;

    public ad60(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        this.f69788a = null;
        this.f69789b = null;
        this.f69788a = ByteBuffer.allocate(bufferInfo.size);
        byteBuffer.position(0);
        byteBuffer.get(this.f69788a.array(), 0, bufferInfo.size);
        this.f69788a.rewind();
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        this.f69789b = bufferInfo2;
        bufferInfo2.size = bufferInfo.size;
        bufferInfo2.offset = bufferInfo.offset;
        bufferInfo2.flags = bufferInfo.flags;
        bufferInfo2.presentationTimeUs = bufferInfo.presentationTimeUs;
    }

    /* JADX INFO: renamed from: a */
    public ByteBuffer m97015a() {
        return this.f69788a;
    }

    /* JADX INFO: renamed from: b */
    public MediaCodec.BufferInfo m97016b() {
        return this.f69789b;
    }

    /* JADX INFO: renamed from: c */
    public int m97017c() {
        return this.f69790c;
    }

    /* JADX INFO: renamed from: d */
    public void m97018d(int i, int i2, int i3, long j, int i4) {
        MediaCodec.BufferInfo bufferInfo = this.f69789b;
        bufferInfo.size = i;
        bufferInfo.offset = i2;
        bufferInfo.flags = i3;
        bufferInfo.presentationTimeUs = j;
        this.f69790c = i4;
    }

    /* JADX INFO: renamed from: e */
    public void m97019e(ByteBuffer byteBuffer) {
        this.f69788a = byteBuffer;
    }

    public ad60(ByteBuffer byteBuffer) {
        this.f69789b = null;
        this.f69788a = byteBuffer;
        this.f69789b = new MediaCodec.BufferInfo();
    }

    public ad60(int i) {
        this.f69788a = null;
        this.f69789b = null;
        this.f69788a = ByteBuffer.allocate(i);
        this.f69789b = new MediaCodec.BufferInfo();
    }
}
