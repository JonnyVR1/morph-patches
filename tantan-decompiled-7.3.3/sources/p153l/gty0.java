package p153l;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* JADX INFO: loaded from: classes6.dex */
public final class gty0 extends AudioTrack$StreamEventCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ jty0 f106459a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hty0 f106460b;

    public gty0(hty0 hty0Var, jty0 jty0Var) {
        this.f106459a = jty0Var;
        this.f106460b = hty0Var;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        if (audioTrack.equals(this.f106460b.f111610c.f122675q)) {
            jty0 jty0Var = this.f106460b.f111610c;
            if (jty0Var.f122671m == null || !jty0Var.f122647L) {
                return;
            }
            jty0Var.f122671m.zzb();
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        if (audioTrack.equals(this.f106460b.f111610c.f122675q)) {
            jty0 jty0Var = this.f106460b.f111610c;
            if (jty0Var.f122671m == null || !jty0Var.f122647L) {
                return;
            }
            jty0Var.f122671m.zzb();
        }
    }
}
