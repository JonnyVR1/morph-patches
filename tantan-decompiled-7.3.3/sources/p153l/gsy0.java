package p153l;

import android.media.AudioTrack;
import com.google.android.gms.internal.ads.zzpx;

/* JADX INFO: loaded from: classes6.dex */
public final class gsy0 {

    /* JADX INFO: renamed from: a */
    public final sqr0 f106334a;

    /* JADX INFO: renamed from: b */
    public final int f106335b;

    /* JADX INFO: renamed from: c */
    public final int f106336c;

    /* JADX INFO: renamed from: d */
    public final int f106337d;

    /* JADX INFO: renamed from: e */
    public final int f106338e;

    /* JADX INFO: renamed from: f */
    public final int f106339f;

    /* JADX INFO: renamed from: g */
    public final int f106340g;

    /* JADX INFO: renamed from: h */
    public final int f106341h;

    /* JADX INFO: renamed from: i */
    public final gpu0 f106342i;

    /* JADX INFO: renamed from: j */
    public final boolean f106343j = false;

    /* JADX INFO: renamed from: k */
    public final boolean f106344k = false;

    /* JADX INFO: renamed from: l */
    public final boolean f106345l = false;

    public gsy0(sqr0 sqr0Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, gpu0 gpu0Var, boolean z, boolean z2, boolean z3) {
        this.f106334a = sqr0Var;
        this.f106335b = i;
        this.f106336c = i2;
        this.f106337d = i3;
        this.f106338e = i4;
        this.f106339f = i5;
        this.f106340g = i6;
        this.f106341h = i7;
        this.f106342i = gpu0Var;
    }

    /* JADX INFO: renamed from: a */
    public final AudioTrack m132152a(w3y0 w3y0Var, int i) throws zzpx {
        AudioTrack audioTrack;
        try {
            if (mpw0.f137957a >= 29) {
                audioTrack = new AudioTrack.Builder().setAudioAttributes(w3y0Var.m204797a().f176116a).setAudioFormat(mpw0.m159398K(this.f106338e, this.f106339f, this.f106340g)).setTransferMode(1).setBufferSizeInBytes(this.f106341h).setSessionId(i).setOffloadedPlayback(this.f106336c == 1).build();
            } else {
                audioTrack = new AudioTrack(w3y0Var.m204797a().f176116a, mpw0.m159398K(this.f106338e, this.f106339f, this.f106340g), this.f106341h, 1, i);
            }
            int state = audioTrack.getState();
            if (state == 1) {
                return audioTrack;
            }
            try {
                audioTrack.release();
            } catch (Exception unused) {
            }
            throw new zzpx(state, this.f106338e, this.f106339f, this.f106341h, this.f106334a, m132154c(), null);
        } catch (IllegalArgumentException e) {
            e = e;
            throw new zzpx(0, this.f106338e, this.f106339f, this.f106341h, this.f106334a, m132154c(), e);
        } catch (UnsupportedOperationException e2) {
            e = e2;
            throw new zzpx(0, this.f106338e, this.f106339f, this.f106341h, this.f106334a, m132154c(), e);
        }
    }

    /* JADX INFO: renamed from: b */
    public final jqy0 m132153b() {
        boolean z = this.f106336c == 1;
        return new jqy0(this.f106340g, this.f106338e, this.f106339f, false, z, this.f106341h);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m132154c() {
        return this.f106336c == 1;
    }
}
