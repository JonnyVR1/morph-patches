package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class vfy0 {

    /* JADX INFO: renamed from: a */
    public boolean f181336a;

    /* JADX INFO: renamed from: b */
    public boolean f181337b;

    /* JADX INFO: renamed from: c */
    public boolean f181338c;

    /* JADX INFO: renamed from: a */
    public final vfy0 m198304a(boolean z) {
        this.f181336a = true;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final vfy0 m198305b(boolean z) {
        this.f181337b = z;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final vfy0 m198306c(boolean z) {
        this.f181338c = z;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final zfy0 m198307d() {
        if (this.f181336a || !(this.f181337b || this.f181338c)) {
            return new zfy0(this, null);
        }
        qkq0.m175383a("Secondary offload attribute fields are true but primary isFormatSupported is false");
        return null;
    }
}
