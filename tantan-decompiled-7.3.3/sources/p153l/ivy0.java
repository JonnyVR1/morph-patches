package p153l;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
@RequiresApi(23)
public final class ivy0 implements bwy0 {

    /* JADX INFO: renamed from: a */
    public final MediaCodec f117230a;

    /* JADX INFO: renamed from: b */
    public final rvy0 f117231b;

    /* JADX INFO: renamed from: c */
    public final dwy0 f117232c;

    /* JADX INFO: renamed from: d */
    public boolean f117233d;

    /* JADX INFO: renamed from: e */
    public int f117234e = 0;

    public /* synthetic */ ivy0(MediaCodec mediaCodec, HandlerThread handlerThread, dwy0 dwy0Var, hvy0 hvy0Var) {
        this.f117230a = mediaCodec;
        this.f117231b = new rvy0(handlerThread);
        this.f117232c = dwy0Var;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m142366j(ivy0 ivy0Var, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        ivy0Var.f117231b.m183328f(ivy0Var.f117230a);
        int i2 = mpw0.f137957a;
        Trace.beginSection("configureCodec");
        ivy0Var.f117230a.configure(mediaFormat, surface, (MediaCrypto) null, i);
        Trace.endSection();
        ivy0Var.f117232c.zzh();
        Trace.beginSection("startCodec");
        ivy0Var.f117230a.start();
        Trace.endSection();
        ivy0Var.f117234e = 1;
    }

    /* JADX INFO: renamed from: k */
    public static String m142367k(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // p153l.bwy0
    /* JADX INFO: renamed from: F */
    public final void mo106813F(Bundle bundle) {
        this.f117232c.mo118424a(bundle);
    }

    @Override // p153l.bwy0
    /* JADX INFO: renamed from: a */
    public final void mo106814a(int i, int i2, int i3, long j, int i4) {
        this.f117232c.mo118426c(i, 0, i3, j, i4);
    }

    @Override // p153l.bwy0
    /* JADX INFO: renamed from: b */
    public final void mo106815b(Surface surface) {
        this.f117230a.setOutputSurface(surface);
    }

    @Override // p153l.bwy0
    /* JADX INFO: renamed from: c */
    public final void mo106816c(int i, int i2, tux0 tux0Var, long j, int i3) {
        this.f117232c.mo118425b(i, 0, tux0Var, j, 0);
    }

    @Override // p153l.bwy0
    /* JADX INFO: renamed from: d */
    public final void mo106817d(int i) {
        this.f117230a.setVideoScalingMode(i);
    }

    @Override // p153l.bwy0
    /* JADX INFO: renamed from: e */
    public final void mo106818e(int i, boolean z) {
        this.f117230a.releaseOutputBuffer(i, false);
    }

    @Override // p153l.bwy0
    /* JADX INFO: renamed from: f */
    public final int mo106819f(MediaCodec.BufferInfo bufferInfo) {
        this.f117232c.zzc();
        return this.f117231b.m183325b(bufferInfo);
    }

    @Override // p153l.bwy0
    /* JADX INFO: renamed from: h */
    public final void mo106820h(int i, long j) {
        this.f117230a.releaseOutputBuffer(i, j);
    }

    @Override // p153l.bwy0
    public final int zza() {
        this.f117232c.zzc();
        return this.f117231b.m183324a();
    }

    @Override // p153l.bwy0
    public final MediaFormat zzc() {
        return this.f117231b.m183326c();
    }

    @Override // p153l.bwy0
    @Nullable
    public final ByteBuffer zzf(int i) {
        return this.f117230a.getInputBuffer(i);
    }

    @Override // p153l.bwy0
    @Nullable
    public final ByteBuffer zzg(int i) {
        return this.f117230a.getOutputBuffer(i);
    }

    @Override // p153l.bwy0
    public final void zzi() {
        this.f117232c.zzb();
        this.f117230a.flush();
        this.f117231b.m183327e();
        this.f117230a.start();
    }

    @Override // p153l.bwy0
    public final void zzl() {
        try {
            if (this.f117234e == 1) {
                this.f117232c.zzg();
                this.f117231b.m183329g();
            }
            this.f117234e = 2;
            if (this.f117233d) {
            }
        } finally {
            if (!this.f117233d) {
                this.f117230a.release();
                this.f117233d = true;
            }
        }
    }
}
