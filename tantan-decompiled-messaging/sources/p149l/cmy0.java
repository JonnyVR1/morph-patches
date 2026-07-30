package p149l;

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
public final class cmy0 implements vmy0 {

    /* JADX INFO: renamed from: a */
    public final MediaCodec f81627a;

    /* JADX INFO: renamed from: b */
    public final lmy0 f81628b;

    /* JADX INFO: renamed from: c */
    public final xmy0 f81629c;

    /* JADX INFO: renamed from: d */
    public boolean f81630d;

    /* JADX INFO: renamed from: e */
    public int f81631e = 0;

    public /* synthetic */ cmy0(MediaCodec mediaCodec, HandlerThread handlerThread, xmy0 xmy0Var, bmy0 bmy0Var) {
        this.f81627a = mediaCodec;
        this.f81628b = new lmy0(handlerThread);
        this.f81629c = xmy0Var;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m107720j(cmy0 cmy0Var, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        cmy0Var.f81628b.m150625f(cmy0Var.f81627a);
        int i2 = ggw0.f102568a;
        Trace.beginSection("configureCodec");
        cmy0Var.f81627a.configure(mediaFormat, surface, (MediaCrypto) null, i);
        Trace.endSection();
        cmy0Var.f81629c.zzh();
        Trace.beginSection("startCodec");
        cmy0Var.f81627a.start();
        Trace.endSection();
        cmy0Var.f81631e = 1;
    }

    /* JADX INFO: renamed from: k */
    public static String m107721k(int i, String str) {
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

    @Override // p149l.vmy0
    /* JADX INFO: renamed from: F */
    public final void mo107722F(Bundle bundle) {
        this.f81629c.mo131806a(bundle);
    }

    @Override // p149l.vmy0
    /* JADX INFO: renamed from: a */
    public final void mo107723a(int i, int i2, int i3, long j, int i4) {
        this.f81629c.mo131808c(i, 0, i3, j, i4);
    }

    @Override // p149l.vmy0
    /* JADX INFO: renamed from: b */
    public final void mo107724b(Surface surface) {
        this.f81627a.setOutputSurface(surface);
    }

    @Override // p149l.vmy0
    /* JADX INFO: renamed from: c */
    public final void mo107725c(int i, int i2, nlx0 nlx0Var, long j, int i3) {
        this.f81629c.mo131807b(i, 0, nlx0Var, j, 0);
    }

    @Override // p149l.vmy0
    /* JADX INFO: renamed from: d */
    public final void mo107726d(int i) {
        this.f81627a.setVideoScalingMode(i);
    }

    @Override // p149l.vmy0
    /* JADX INFO: renamed from: e */
    public final void mo107727e(int i, boolean z) {
        this.f81627a.releaseOutputBuffer(i, false);
    }

    @Override // p149l.vmy0
    /* JADX INFO: renamed from: f */
    public final int mo107728f(MediaCodec.BufferInfo bufferInfo) {
        this.f81629c.zzc();
        return this.f81628b.m150622b(bufferInfo);
    }

    @Override // p149l.vmy0
    /* JADX INFO: renamed from: h */
    public final void mo107729h(int i, long j) {
        this.f81627a.releaseOutputBuffer(i, j);
    }

    @Override // p149l.vmy0
    public final int zza() {
        this.f81629c.zzc();
        return this.f81628b.m150621a();
    }

    @Override // p149l.vmy0
    public final MediaFormat zzc() {
        return this.f81628b.m150623c();
    }

    @Override // p149l.vmy0
    @Nullable
    public final ByteBuffer zzf(int i) {
        return this.f81627a.getInputBuffer(i);
    }

    @Override // p149l.vmy0
    @Nullable
    public final ByteBuffer zzg(int i) {
        return this.f81627a.getOutputBuffer(i);
    }

    @Override // p149l.vmy0
    public final void zzi() {
        this.f81629c.zzb();
        this.f81627a.flush();
        this.f81628b.m150624e();
        this.f81627a.start();
    }

    @Override // p149l.vmy0
    public final void zzl() {
        try {
            if (this.f81631e == 1) {
                this.f81629c.zzg();
                this.f81628b.m150626g();
            }
            this.f81631e = 2;
            if (this.f81630d) {
            }
        } finally {
            if (!this.f81630d) {
                this.f81627a.release();
                this.f81630d = true;
            }
        }
    }
}
