package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class t8w0 extends q8w0 {

    /* JADX INFO: renamed from: a */
    public String f168966a;

    /* JADX INFO: renamed from: b */
    public boolean f168967b;

    /* JADX INFO: renamed from: c */
    public boolean f168968c;

    /* JADX INFO: renamed from: d */
    public byte f168969d;

    @Override // p149l.q8w0
    /* JADX INFO: renamed from: a */
    public final q8w0 mo173572a(String str) {
        if (str != null) {
            this.f168966a = str;
            return this;
        }
        jfd0.m141176a("Null clientVersion");
        return null;
    }

    @Override // p149l.q8w0
    /* JADX INFO: renamed from: b */
    public final q8w0 mo173573b(boolean z) {
        this.f168968c = true;
        this.f168969d = (byte) (this.f168969d | 2);
        return this;
    }

    @Override // p149l.q8w0
    /* JADX INFO: renamed from: c */
    public final q8w0 mo173574c(boolean z) {
        this.f168967b = z;
        this.f168969d = (byte) (this.f168969d | 1);
        return this;
    }

    @Override // p149l.q8w0
    /* JADX INFO: renamed from: d */
    public final r8w0 mo173575d() {
        String str;
        u8w0 u8w0Var = null;
        if (this.f168969d == 3 && (str = this.f168966a) != null) {
            return new v8w0(str, this.f168967b, this.f168968c, u8w0Var);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f168966a == null) {
            sb.append(" clientVersion");
        }
        if ((this.f168969d & 1) == 0) {
            sb.append(" shouldGetAdvertisingId");
        }
        if ((this.f168969d & 2) == 0) {
            sb.append(" isGooglePlayServicesAvailable");
        }
        qkq0.m175383a("Missing required properties:".concat(sb.toString()));
        return null;
    }
}
