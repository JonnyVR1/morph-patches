package p153l;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public final class qxy0 implements bwy0 {

    /* JADX INFO: renamed from: a */
    public final MediaCodec f160084a;

    public /* synthetic */ qxy0(MediaCodec mediaCodec, pxy0 pxy0Var) {
        this.f160084a = mediaCodec;
        int i = mpw0.f137957a;
    }

    @Override // p153l.bwy0
    @RequiresApi(19)
    /* JADX INFO: renamed from: F */
    public final void mo106813F(Bundle bundle) {
        this.f160084a.setParameters(bundle);
    }

    @Override // p153l.bwy0
    /* JADX INFO: renamed from: a */
    public final void mo106814a(int i, int i2, int i3, long j, int i4) {
        this.f160084a.queueInputBuffer(i, 0, i3, j, i4);
    }

    @Override // p153l.bwy0
    @RequiresApi(23)
    /* JADX INFO: renamed from: b */
    public final void mo106815b(Surface surface) {
        this.f160084a.setOutputSurface(surface);
    }

    @Override // p153l.bwy0
    /* JADX INFO: renamed from: c */
    public final void mo106816c(int i, int i2, tux0 tux0Var, long j, int i3) {
        this.f160084a.queueSecureInputBuffer(i, 0, tux0Var.m192763a(), j, 0);
    }

    @Override // p153l.bwy0
    /* JADX INFO: renamed from: d */
    public final void mo106817d(int i) {
        this.f160084a.setVideoScalingMode(i);
    }

    @Override // p153l.bwy0
    /* JADX INFO: renamed from: e */
    public final void mo106818e(int i, boolean z) {
        this.f160084a.releaseOutputBuffer(i, false);
    }

    @Override // p153l.bwy0
    /* JADX INFO: renamed from: f */
    public final int mo106819f(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.f160084a.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer == -3) {
                int i = mpw0.f137957a;
                iDequeueOutputBuffer = -3;
            }
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // p153l.bwy0
    @RequiresApi(21)
    /* JADX INFO: renamed from: h */
    public final void mo106820h(int i, long j) {
        this.f160084a.releaseOutputBuffer(i, j);
    }

    @Override // p153l.bwy0
    public final int zza() {
        return this.f160084a.dequeueInputBuffer(0L);
    }

    @Override // p153l.bwy0
    public final MediaFormat zzc() {
        return this.f160084a.getOutputFormat();
    }

    @Override // p153l.bwy0
    @Nullable
    public final ByteBuffer zzf(int i) {
        int i2 = mpw0.f137957a;
        return this.f160084a.getInputBuffer(i);
    }

    @Override // p153l.bwy0
    @Nullable
    public final ByteBuffer zzg(int i) {
        int i2 = mpw0.f137957a;
        return this.f160084a.getOutputBuffer(i);
    }

    @Override // p153l.bwy0
    public final void zzi() {
        this.f160084a.flush();
    }

    @Override // p153l.bwy0
    public final void zzl() {
        this.f160084a.release();
    }
}
