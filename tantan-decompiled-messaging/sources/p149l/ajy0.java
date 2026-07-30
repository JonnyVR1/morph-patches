package p149l;

import android.media.AudioTrack;
import com.google.android.gms.internal.ads.zzpx;

/* JADX INFO: loaded from: classes6.dex */
public final class ajy0 {

    /* JADX INFO: renamed from: a */
    public final mhr0 f70216a;

    /* JADX INFO: renamed from: b */
    public final int f70217b;

    /* JADX INFO: renamed from: c */
    public final int f70218c;

    /* JADX INFO: renamed from: d */
    public final int f70219d;

    /* JADX INFO: renamed from: e */
    public final int f70220e;

    /* JADX INFO: renamed from: f */
    public final int f70221f;

    /* JADX INFO: renamed from: g */
    public final int f70222g;

    /* JADX INFO: renamed from: h */
    public final int f70223h;

    /* JADX INFO: renamed from: i */
    public final agu0 f70224i;

    /* JADX INFO: renamed from: j */
    public final boolean f70225j = false;

    /* JADX INFO: renamed from: k */
    public final boolean f70226k = false;

    /* JADX INFO: renamed from: l */
    public final boolean f70227l = false;

    public ajy0(mhr0 mhr0Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, agu0 agu0Var, boolean z, boolean z2, boolean z3) {
        this.f70216a = mhr0Var;
        this.f70217b = i;
        this.f70218c = i2;
        this.f70219d = i3;
        this.f70220e = i4;
        this.f70221f = i5;
        this.f70222g = i6;
        this.f70223h = i7;
        this.f70224i = agu0Var;
    }

    /* JADX INFO: renamed from: a */
    public final AudioTrack m97091a(qux0 qux0Var, int i) throws zzpx {
        AudioTrack audioTrack;
        try {
            if (ggw0.f102568a >= 29) {
                audioTrack = new AudioTrack.Builder().setAudioAttributes(qux0Var.m176664a().f139488a).setAudioFormat(ggw0.m126054K(this.f70220e, this.f70221f, this.f70222g)).setTransferMode(1).setBufferSizeInBytes(this.f70223h).setSessionId(i).setOffloadedPlayback(this.f70218c == 1).build();
            } else {
                audioTrack = new AudioTrack(qux0Var.m176664a().f139488a, ggw0.m126054K(this.f70220e, this.f70221f, this.f70222g), this.f70223h, 1, i);
            }
            int state = audioTrack.getState();
            if (state == 1) {
                return audioTrack;
            }
            try {
                audioTrack.release();
            } catch (Exception unused) {
            }
            throw new zzpx(state, this.f70220e, this.f70221f, this.f70223h, this.f70216a, m97093c(), null);
        } catch (IllegalArgumentException e) {
            e = e;
            throw new zzpx(0, this.f70220e, this.f70221f, this.f70223h, this.f70216a, m97093c(), e);
        } catch (UnsupportedOperationException e2) {
            e = e2;
            throw new zzpx(0, this.f70220e, this.f70221f, this.f70223h, this.f70216a, m97093c(), e);
        }
    }

    /* JADX INFO: renamed from: b */
    public final dhy0 m97092b() {
        boolean z = this.f70218c == 1;
        return new dhy0(this.f70222g, this.f70220e, this.f70221f, false, z, this.f70223h);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m97093c() {
        return this.f70218c == 1;
    }
}
