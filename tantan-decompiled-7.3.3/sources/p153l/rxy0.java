package p153l;

import android.media.MediaCodec;
import android.os.Bundle;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes6.dex */
@RequiresApi(23)
public final class rxy0 implements dwy0 {

    /* JADX INFO: renamed from: a */
    public final MediaCodec f165392a;

    public rxy0(MediaCodec mediaCodec) {
        this.f165392a = mediaCodec;
    }

    @Override // p153l.dwy0
    /* JADX INFO: renamed from: a */
    public final void mo118424a(Bundle bundle) {
        this.f165392a.setParameters(bundle);
    }

    @Override // p153l.dwy0
    /* JADX INFO: renamed from: b */
    public final void mo118425b(int i, int i2, tux0 tux0Var, long j, int i3) {
        this.f165392a.queueSecureInputBuffer(i, 0, tux0Var.m192763a(), j, 0);
    }

    @Override // p153l.dwy0
    /* JADX INFO: renamed from: c */
    public final void mo118426c(int i, int i2, int i3, long j, int i4) {
        this.f165392a.queueInputBuffer(i, 0, i3, j, i4);
    }

    @Override // p153l.dwy0
    public final void zzb() {
    }

    @Override // p153l.dwy0
    public final void zzc() {
    }

    @Override // p153l.dwy0
    public final void zzg() {
    }

    @Override // p153l.dwy0
    public final void zzh() {
    }
}
