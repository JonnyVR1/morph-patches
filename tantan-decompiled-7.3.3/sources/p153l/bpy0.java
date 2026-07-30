package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class bpy0 {

    /* JADX INFO: renamed from: a */
    public boolean f77838a;

    /* JADX INFO: renamed from: b */
    public boolean f77839b;

    /* JADX INFO: renamed from: c */
    public boolean f77840c;

    /* JADX INFO: renamed from: a */
    public final bpy0 m105865a(boolean z) {
        this.f77838a = true;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final bpy0 m105866b(boolean z) {
        this.f77839b = z;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final bpy0 m105867c(boolean z) {
        this.f77840c = z;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final fpy0 m105868d() {
        if (this.f77838a || !(this.f77839b || this.f77840c)) {
            return new fpy0(this, null);
        }
        wtq0.m207906a("Secondary offload attribute fields are true but primary isFormatSupported is false");
        return null;
    }
}
