package p149l;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public final class koy0 implements vmy0 {

    /* JADX INFO: renamed from: a */
    public final MediaCodec f124082a;

    public /* synthetic */ koy0(MediaCodec mediaCodec, joy0 joy0Var) {
        this.f124082a = mediaCodec;
        int i = ggw0.f102568a;
    }

    @Override // p149l.vmy0
    @RequiresApi(19)
    /* JADX INFO: renamed from: F */
    public final void mo107722F(Bundle bundle) {
        this.f124082a.setParameters(bundle);
    }

    @Override // p149l.vmy0
    /* JADX INFO: renamed from: a */
    public final void mo107723a(int i, int i2, int i3, long j, int i4) {
        this.f124082a.queueInputBuffer(i, 0, i3, j, i4);
    }

    @Override // p149l.vmy0
    @RequiresApi(23)
    /* JADX INFO: renamed from: b */
    public final void mo107724b(Surface surface) {
        this.f124082a.setOutputSurface(surface);
    }

    @Override // p149l.vmy0
    /* JADX INFO: renamed from: c */
    public final void mo107725c(int i, int i2, nlx0 nlx0Var, long j, int i3) {
        this.f124082a.queueSecureInputBuffer(i, 0, nlx0Var.m160077a(), j, 0);
    }

    @Override // p149l.vmy0
    /* JADX INFO: renamed from: d */
    public final void mo107726d(int i) {
        this.f124082a.setVideoScalingMode(i);
    }

    @Override // p149l.vmy0
    /* JADX INFO: renamed from: e */
    public final void mo107727e(int i, boolean z) {
        this.f124082a.releaseOutputBuffer(i, false);
    }

    @Override // p149l.vmy0
    /* JADX INFO: renamed from: f */
    public final int mo107728f(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.f124082a.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer == -3) {
                int i = ggw0.f102568a;
                iDequeueOutputBuffer = -3;
            }
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // p149l.vmy0
    @RequiresApi(21)
    /* JADX INFO: renamed from: h */
    public final void mo107729h(int i, long j) {
        this.f124082a.releaseOutputBuffer(i, j);
    }

    @Override // p149l.vmy0
    public final int zza() {
        return this.f124082a.dequeueInputBuffer(0L);
    }

    @Override // p149l.vmy0
    public final MediaFormat zzc() {
        return this.f124082a.getOutputFormat();
    }

    @Override // p149l.vmy0
    @Nullable
    public final ByteBuffer zzf(int i) {
        int i2 = ggw0.f102568a;
        return this.f124082a.getInputBuffer(i);
    }

    @Override // p149l.vmy0
    @Nullable
    public final ByteBuffer zzg(int i) {
        int i2 = ggw0.f102568a;
        return this.f124082a.getOutputBuffer(i);
    }

    @Override // p149l.vmy0
    public final void zzi() {
        this.f124082a.flush();
    }

    @Override // p149l.vmy0
    public final void zzl() {
        this.f124082a.release();
    }
}
