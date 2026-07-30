package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.mediacodec.C1887f;
import java.io.IOException;
import java.nio.ByteBuffer;
import p149l.iwb;
import p149l.j5j0;
import p149l.p11;
import p149l.vck0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.f */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1887f implements InterfaceC1884c {

    /* JADX INFO: renamed from: a */
    public final MediaCodec f7911a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public ByteBuffer[] f7912b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public ByteBuffer[] f7913c;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.f$b */
    public static class b implements InterfaceC1884c.b {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.exoplayer2.mediacodec.f$a] */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3 */
        @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1884c.b
        /* JADX INFO: renamed from: a */
        public InterfaceC1884c mo10488a(InterfaceC1884c.a aVar) throws Throwable {
            MediaCodec mediaCodec = 0;
            mediaCodec = 0;
            try {
                MediaCodec mediaCodecM10528b = m10528b(aVar);
                try {
                    j5j0.m139865a("configureCodec");
                    mediaCodecM10528b.configure(aVar.f7894b, aVar.f7896d, aVar.f7897e, aVar.f7898f);
                    j5j0.m139867c();
                    j5j0.m139865a("startCodec");
                    mediaCodecM10528b.start();
                    j5j0.m139867c();
                    return new C1887f(mediaCodecM10528b);
                } catch (IOException | RuntimeException e) {
                    e = e;
                    mediaCodec = mediaCodecM10528b;
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
        public MediaCodec m10528b(InterfaceC1884c.a aVar) throws IOException {
            p11.m167011e(aVar.f7893a);
            String str = aVar.f7893a.f7899a;
            j5j0.m139865a("createCodec:" + str);
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            j5j0.m139867c();
            return mediaCodecCreateByCodecName;
        }
    }

    public C1887f(MediaCodec mediaCodec) {
        this.f7911a = mediaCodec;
        if (vck0.f180948a < 21) {
            this.f7912b = mediaCodec.getInputBuffers();
            this.f7913c = mediaCodec.getOutputBuffers();
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m10527f(C1887f c1887f, InterfaceC1884c.c cVar, MediaCodec mediaCodec, long j, long j2) {
        c1887f.getClass();
        cVar.mo10492a(c1887f, j, j2);
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1884c
    /* JADX INFO: renamed from: a */
    public boolean mo10479a() {
        return false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1884c
    /* JADX INFO: renamed from: b */
    public void mo10480b(int i, int i2, iwb iwbVar, long j, int i3) {
        this.f7911a.queueSecureInputBuffer(i, i2, iwbVar.m138720a(), j, i3);
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1884c
    /* JADX INFO: renamed from: c */
    public int mo10481c(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.f7911a.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer == -3 && vck0.f180948a < 21) {
                this.f7913c = this.f7911a.getOutputBuffers();
            }
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1884c
    @RequiresApi(23)
    /* JADX INFO: renamed from: d */
    public void mo10482d(final InterfaceC1884c.c cVar, Handler handler) {
        this.f7911a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: l.kgh0
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                C1887f.m10527f(this.f123036a, cVar, mediaCodec, j, j2);
            }
        }, handler);
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1884c
    /* JADX INFO: renamed from: e */
    public int mo10483e() {
        return this.f7911a.dequeueInputBuffer(0L);
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1884c
    public void flush() {
        this.f7911a.flush();
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1884c
    @Nullable
    public ByteBuffer getInputBuffer(int i) {
        return vck0.f180948a >= 21 ? this.f7911a.getInputBuffer(i) : ((ByteBuffer[]) vck0.m197866j(this.f7912b))[i];
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1884c
    @Nullable
    public ByteBuffer getOutputBuffer(int i) {
        return vck0.f180948a >= 21 ? this.f7911a.getOutputBuffer(i) : ((ByteBuffer[]) vck0.m197866j(this.f7913c))[i];
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1884c
    public MediaFormat getOutputFormat() {
        return this.f7911a.getOutputFormat();
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1884c
    public void queueInputBuffer(int i, int i2, int i3, long j, int i4) {
        this.f7911a.queueInputBuffer(i, i2, i3, j, i4);
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1884c
    public void release() {
        this.f7912b = null;
        this.f7913c = null;
        this.f7911a.release();
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1884c
    public void releaseOutputBuffer(int i, boolean z) {
        this.f7911a.releaseOutputBuffer(i, z);
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1884c
    @RequiresApi(23)
    public void setOutputSurface(Surface surface) {
        this.f7911a.setOutputSurface(surface);
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1884c
    @RequiresApi(19)
    public void setParameters(Bundle bundle) {
        this.f7911a.setParameters(bundle);
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1884c
    public void setVideoScalingMode(int i) {
        this.f7911a.setVideoScalingMode(i);
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1884c
    @RequiresApi(21)
    public void releaseOutputBuffer(int i, long j) {
        this.f7911a.releaseOutputBuffer(i, j);
    }
}
