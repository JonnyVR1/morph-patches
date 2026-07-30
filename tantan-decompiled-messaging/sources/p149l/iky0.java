package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class iky0 implements hhy0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ jky0 f113754a;

    public /* synthetic */ iky0(jky0 jky0Var, hky0 hky0Var) {
        this.f113754a = jky0Var;
    }

    @Override // p149l.hhy0
    /* JADX INFO: renamed from: b */
    public final void mo131195b(Exception exc) {
        svv0.m186109d("MediaCodecAudioRenderer", "Audio sink error", exc);
        this.f113754a.f118427b1.m218726b(exc);
    }

    @Override // p149l.hhy0
    public final void zzb() {
        jky0 jky0Var = this.f113754a;
        if (jky0Var.f118437l1 != null) {
            jky0Var.f118437l1.zzb();
        }
    }
}
