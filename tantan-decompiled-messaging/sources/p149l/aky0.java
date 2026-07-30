package p149l;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* JADX INFO: loaded from: classes6.dex */
public final class aky0 extends AudioTrack$StreamEventCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ dky0 f70351a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bky0 f70352b;

    public aky0(bky0 bky0Var, dky0 dky0Var) {
        this.f70351a = dky0Var;
        this.f70352b = bky0Var;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        if (audioTrack.equals(this.f70352b.f76150c.f86758q)) {
            dky0 dky0Var = this.f70352b.f76150c;
            if (dky0Var.f86754m == null || !dky0Var.f86730L) {
                return;
            }
            dky0Var.f86754m.zzb();
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        if (audioTrack.equals(this.f70352b.f76150c.f86758q)) {
            dky0 dky0Var = this.f70352b.f76150c;
            if (dky0Var.f86754m == null || !dky0Var.f86730L) {
                return;
            }
            dky0Var.f86754m.zzb();
        }
    }
}
