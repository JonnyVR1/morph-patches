package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class jvt0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f119986a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f119987b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ h0s0 f119988c;

    public jvt0(h0s0 h0s0Var, String str, long j) {
        this.f119986a = str;
        this.f119987b = j;
        this.f119988c = h0s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h0s0.m128969x(this.f119988c, this.f119986a, this.f119987b);
    }
}
