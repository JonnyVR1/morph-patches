package com.p074ss.bytertc.engine.mediaio;

import androidx.annotation.NonNull;
import com.bytedance.realx.video.JavaI420Buffer;
import com.bytedance.realx.video.VideoFrame;
import com.p074ss.bytertc.engine.mediaio.CountDownLatchI420Buffer;
import java.nio.ByteBuffer;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes11.dex */
public class CountDownLatchI420Buffer implements VideoFrame.I420Buffer {

    @NonNull
    private final JavaI420Buffer buffer;
    private final CountDownLatch mCountDownLatch = new CountDownLatch(1);
    private Runnable mCustomReleaseCallback;

    private CountDownLatchI420Buffer(int i, int i2, ByteBuffer byteBuffer, int i3, ByteBuffer byteBuffer2, int i4, ByteBuffer byteBuffer3, int i5, final Runnable runnable) {
        this.mCustomReleaseCallback = runnable;
        this.buffer = JavaI420Buffer.wrap(i, i2, byteBuffer, i3, byteBuffer2, i4, byteBuffer3, i5, new Runnable() { // from class: l.prb
            @Override // java.lang.Runnable
            public final void run() {
                CountDownLatchI420Buffer.m82072a(this.f153742a, runnable);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m82072a(CountDownLatchI420Buffer countDownLatchI420Buffer, Runnable runnable) {
        countDownLatchI420Buffer.mCountDownLatch.countDown();
        if (countDownLatchI420Buffer.mCustomReleaseCallback != null) {
            runnable.run();
        }
    }

    public static CountDownLatchI420Buffer wrap(int i, int i2, ByteBuffer byteBuffer, int i3, ByteBuffer byteBuffer2, int i4, ByteBuffer byteBuffer3, int i5, Runnable runnable) {
        return new CountDownLatchI420Buffer(i, i2, byteBuffer, i3, byteBuffer2, i4, byteBuffer3, i5, runnable);
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.Buffer copyData() {
        return this.buffer.copyData();
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        return this.buffer.cropAndScale(i, i2, i3, i4, i5, i6);
    }

    @Override // com.bytedance.realx.video.VideoFrame.I420Buffer
    public ByteBuffer getDataU() {
        return this.buffer.getDataU();
    }

    @Override // com.bytedance.realx.video.VideoFrame.I420Buffer
    public ByteBuffer getDataV() {
        return this.buffer.getDataV();
    }

    @Override // com.bytedance.realx.video.VideoFrame.I420Buffer
    public ByteBuffer getDataY() {
        return this.buffer.getDataY();
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public int getHeight() {
        return this.buffer.getHeight();
    }

    public CountDownLatch getLatch() {
        return this.mCountDownLatch;
    }

    @Override // com.bytedance.realx.video.VideoFrame.I420Buffer
    public int getStrideU() {
        return this.buffer.getStrideU();
    }

    @Override // com.bytedance.realx.video.VideoFrame.I420Buffer
    public int getStrideV() {
        return this.buffer.getStrideV();
    }

    @Override // com.bytedance.realx.video.VideoFrame.I420Buffer
    public int getStrideY() {
        return this.buffer.getStrideY();
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public int getWidth() {
        return this.buffer.getWidth();
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer, com.bytedance.realx.base.RefCounted
    public void release() {
        this.buffer.release();
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer, com.bytedance.realx.base.RefCounted
    public void retain() {
        this.buffer.retain();
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.Buffer scaleAndFill(int i, int i2, int i3, int i4) {
        return this.buffer.scaleAndFill(i, i2, i3, i4);
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        return this.buffer.toI420();
    }
}
