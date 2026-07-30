package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.mediacodec.C1910f;
import java.io.IOException;
import java.nio.ByteBuffer;
import p153l.bmk0;
import p153l.nej0;
import p153l.w11;
import p153l.wxb;

/* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.f */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1910f implements InterfaceC1907c {

    /* JADX INFO: renamed from: a */
    public final MediaCodec f7948a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public ByteBuffer[] f7949b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public ByteBuffer[] f7950c;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.f$b */
    public static class b implements InterfaceC1907c.b {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.exoplayer2.mediacodec.f$a] */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3 */
        @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1907c.b
        /* JADX INFO: renamed from: a */
        public InterfaceC1907c mo10542a(InterfaceC1907c.a aVar) throws Throwable {
            MediaCodec mediaCodec = 0;
            mediaCodec = 0;
            try {
                MediaCodec mediaCodecM10582b = m10582b(aVar);
                try {
                    nej0.m162903a("configureCodec");
                    mediaCodecM10582b.configure(aVar.f7931b, aVar.f7933d, aVar.f7934e, aVar.f7935f);
                    nej0.m162905c();
                    nej0.m162903a("startCodec");
                    mediaCodecM10582b.start();
                    nej0.m162905c();
                    return new C1910f(mediaCodecM10582b);
                } catch (IOException | RuntimeException e) {
                    e = e;
                    mediaCodec = mediaCodecM10582b;
                    if (mediaCodec != 0) {
                        mediaCodec.release();
                    }
                    throw e;
                }
            } catch (IOException e2) {
                e = e2;
            } catch (RuntimeException e3) {
                e = e3;
            }
        }

        /* JADX INFO: renamed from: b */
        public MediaCodec m10582b(InterfaceC1907c.a aVar) throws IOException {
            w11.m204369e(aVar.f7930a);
            String str = aVar.f7930a.f7936a;
            nej0.m162903a("createCodec:" + str);
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            nej0.m162905c();
            return mediaCodecCreateByCodecName;
        }
    }

    public C1910f(MediaCodec mediaCodec) {
        this.f7948a = mediaCodec;
        if (bmk0.f77313a < 21) {
            this.f7949b = mediaCodec.getInputBuffers();
            this.f7950c = mediaCodec.getOutputBuffers();
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m10581f(C1910f c1910f, InterfaceC1907c.c cVar, MediaCodec mediaCodec, long j, long j2) {
        c1910f.getClass();
        cVar.mo10546a(c1910f, j, j2);
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1907c
    /* JADX INFO: renamed from: a */
    public boolean mo10533a() {
        return false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1907c
    /* JADX INFO: renamed from: b */
    public void mo10534b(int i, int i2, wxb wxbVar, long j, int i3) {
        this.f7948a.queueSecureInputBuffer(i, i2, wxbVar.m208396a(), j, i3);
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1907c
    /* JADX INFO: renamed from: c */
    public int mo10535c(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.f7948a.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer == -3 && bmk0.f77313a < 21) {
                this.f7950c = this.f7948a.getOutputBuffers();
            }
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1907c
    @RequiresApi(23)
    /* JADX INFO: renamed from: d */
    public void mo10536d(final InterfaceC1907c.c cVar, Handler handler) {
        this.f7948a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: l.roh0
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                C1910f.m10581f(this.f164210a, cVar, mediaCodec, j, j2);
            }
        }, handler);
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1907c
    /* JADX INFO: renamed from: e */
    public int mo10537e() {
        return this.f7948a.dequeueInputBuffer(0L);
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1907c
    public void flush() {
        this.f7948a.flush();
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1907c
    @Nullable
    public ByteBuffer getInputBuffer(int i) {
        return bmk0.f77313a >= 21 ? this.f7948a.getInputBuffer(i) : ((ByteBuffer[]) bmk0.m105144j(this.f7949b))[i];
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1907c
    @Nullable
    public ByteBuffer getOutputBuffer(int i) {
        return bmk0.f77313a >= 21 ? this.f7948a.getOutputBuffer(i) : ((ByteBuffer[]) bmk0.m105144j(this.f7950c))[i];
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1907c
    public MediaFormat getOutputFormat() {
        return this.f7948a.getOutputFormat();
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1907c
    public void queueInputBuffer(int i, int i2, int i3, long j, int i4) {
        this.f7948a.queueInputBuffer(i, i2, i3, j, i4);
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1907c
    public void release() {
        this.f7949b = null;
        this.f7950c = null;
        this.f7948a.release();
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1907c
    public void releaseOutputBuffer(int i, boolean z) {
        this.f7948a.releaseOutputBuffer(i, z);
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1907c
    @RequiresApi(23)
    public void setOutputSurface(Surface surface) {
        this.f7948a.setOutputSurface(surface);
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1907c
    @RequiresApi(19)
    public void setParameters(Bundle bundle) {
        this.f7948a.setParameters(bundle);
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1907c
    public void setVideoScalingMode(int i) {
        this.f7948a.setVideoScalingMode(i);
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1907c
    @RequiresApi(21)
    public void releaseOutputBuffer(int i, long j) {
        this.f7948a.releaseOutputBuffer(i, j);
    }
}
