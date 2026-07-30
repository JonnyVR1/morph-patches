package p149l;

import android.media.MediaCodec;
import android.os.Bundle;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes6.dex */
@RequiresApi(23)
public final class loy0 implements xmy0 {

    /* JADX INFO: renamed from: a */
    public final MediaCodec f129149a;

    public loy0(MediaCodec mediaCodec) {
        this.f129149a = mediaCodec;
    }

    @Override // p149l.xmy0
    /* JADX INFO: renamed from: a */
    public final void mo131806a(Bundle bundle) {
        this.f129149a.setParameters(bundle);
    }

    @Override // p149l.xmy0
    /* JADX INFO: renamed from: b */
    public final void mo131807b(int i, int i2, nlx0 nlx0Var, long j, int i3) {
        this.f129149a.queueSecureInputBuffer(i, 0, nlx0Var.m160077a(), j, 0);
    }

    @Override // p149l.xmy0
    /* JADX INFO: renamed from: c */
    public final void mo131808c(int i, int i2, int i3, long j, int i4) {
        this.f129149a.queueInputBuffer(i, 0, i3, j, i4);
    }

    @Override // p149l.xmy0
    public final void zzb() {
    }

    @Override // p149l.xmy0
    public final void zzc() {
    }

    @Override // p149l.xmy0
    public final void zzg() {
    }

    @Override // p149l.xmy0
    public final void zzh() {
    }
}
