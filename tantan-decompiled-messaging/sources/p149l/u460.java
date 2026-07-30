package p149l;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class u460 {

    /* JADX INFO: renamed from: a */
    private ByteBuffer f173695a;

    /* JADX INFO: renamed from: b */
    private MediaCodec.BufferInfo f173696b;

    /* JADX INFO: renamed from: c */
    private int f173697c = -1;

    public u460(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        this.f173695a = null;
        this.f173696b = null;
        this.f173695a = ByteBuffer.allocate(bufferInfo.size);
        byteBuffer.position(0);
        byteBuffer.get(this.f173695a.array(), 0, bufferInfo.size);
        this.f173695a.rewind();
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        this.f173696b = bufferInfo2;
        bufferInfo2.size = bufferInfo.size;
        bufferInfo2.offset = bufferInfo.offset;
        bufferInfo2.flags = bufferInfo.flags;
        bufferInfo2.presentationTimeUs = bufferInfo.presentationTimeUs;
    }

    /* JADX INFO: renamed from: a */
    public ByteBuffer m191672a() {
        return this.f173695a;
    }

    /* JADX INFO: renamed from: b */
    public MediaCodec.BufferInfo m191673b() {
        return this.f173696b;
    }

    /* JADX INFO: renamed from: c */
    public int m191674c() {
        return this.f173697c;
    }

    /* JADX INFO: renamed from: d */
    public void m191675d(int i, int i2, int i3, long j, int i4) {
        MediaCodec.BufferInfo bufferInfo = this.f173696b;
        bufferInfo.size = i;
        bufferInfo.offset = i2;
        bufferInfo.flags = i3;
        bufferInfo.presentationTimeUs = j;
        this.f173697c = i4;
    }

    /* JADX INFO: renamed from: e */
    public void m191676e(ByteBuffer byteBuffer) {
        this.f173695a = byteBuffer;
    }

    public u460(ByteBuffer byteBuffer) {
        this.f173696b = null;
        this.f173695a = byteBuffer;
        this.f173696b = new MediaCodec.BufferInfo();
    }

    public u460(int i) {
        this.f173695a = null;
        this.f173696b = null;
        this.f173695a = ByteBuffer.allocate(i);
        this.f173696b = new MediaCodec.BufferInfo();
    }
}
