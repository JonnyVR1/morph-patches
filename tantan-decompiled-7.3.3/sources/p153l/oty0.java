package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class oty0 implements nqy0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ pty0 f149034a;

    public /* synthetic */ oty0(pty0 pty0Var, nty0 nty0Var) {
        this.f149034a = pty0Var;
    }

    @Override // p153l.nqy0
    /* JADX INFO: renamed from: b */
    public final void mo164436b(Exception exc) {
        y4w0.m214276d("MediaCodecAudioRenderer", "Audio sink error", exc);
        this.f149034a.f154119b1.m126821b(exc);
    }

    @Override // p153l.nqy0
    public final void zzb() {
        pty0 pty0Var = this.f149034a;
        if (pty0Var.f154129l1 != null) {
            pty0Var.f154129l1.zzb();
        }
    }
}
