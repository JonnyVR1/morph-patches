package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.u */
/* JADX INFO: loaded from: classes.dex */
public class C0353u {

    /* JADX INFO: renamed from: e */
    public static final C0341l f1745e = C0341l.m2227b();

    /* JADX INFO: renamed from: a */
    public ByteString f1746a;

    /* JADX INFO: renamed from: b */
    public C0341l f1747b;

    /* JADX INFO: renamed from: c */
    public volatile InterfaceC0322b0 f1748c;

    /* JADX INFO: renamed from: d */
    public volatile ByteString f1749d;

    /* JADX INFO: renamed from: a */
    public void m2353a(InterfaceC0322b0 interfaceC0322b0) {
        if (this.f1748c != null) {
            return;
        }
        synchronized (this) {
            if (this.f1748c != null) {
                return;
            }
            try {
                if (this.f1746a != null) {
                    this.f1748c = interfaceC0322b0.getParserForType().mo1814b(this.f1746a, this.f1747b);
                    this.f1749d = this.f1746a;
                } else {
                    this.f1748c = interfaceC0322b0;
                    this.f1749d = ByteString.EMPTY;
                }
            } catch (InvalidProtocolBufferException unused) {
                this.f1748c = interfaceC0322b0;
                this.f1749d = ByteString.EMPTY;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public int m2354b() {
        if (this.f1749d != null) {
            return this.f1749d.size();
        }
        ByteString byteString = this.f1746a;
        if (byteString != null) {
            return byteString.size();
        }
        if (this.f1748c != null) {
            return this.f1748c.getSerializedSize();
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public InterfaceC0322b0 m2355c(InterfaceC0322b0 interfaceC0322b0) {
        m2353a(interfaceC0322b0);
        return this.f1748c;
    }

    /* JADX INFO: renamed from: d */
    public InterfaceC0322b0 m2356d(InterfaceC0322b0 interfaceC0322b0) {
        InterfaceC0322b0 interfaceC0322b1 = this.f1748c;
        this.f1746a = null;
        this.f1749d = null;
        this.f1748c = interfaceC0322b0;
        return interfaceC0322b1;
    }

    /* JADX INFO: renamed from: e */
    public ByteString m2357e() {
        if (this.f1749d != null) {
            return this.f1749d;
        }
        ByteString byteString = this.f1746a;
        if (byteString != null) {
            return byteString;
        }
        synchronized (this) {
            try {
                if (this.f1749d != null) {
                    return this.f1749d;
                }
                if (this.f1748c == null) {
                    this.f1749d = ByteString.EMPTY;
                } else {
                    this.f1749d = this.f1748c.toByteString();
                }
                return this.f1749d;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0353u)) {
            return false;
        }
        C0353u c0353u = (C0353u) obj;
        InterfaceC0322b0 interfaceC0322b0 = this.f1748c;
        InterfaceC0322b0 interfaceC0322b1 = c0353u.f1748c;
        if (interfaceC0322b0 == null && interfaceC0322b1 == null) {
            return m2357e().equals(c0353u.m2357e());
        }
        if (interfaceC0322b0 == null || interfaceC0322b1 == null) {
            return interfaceC0322b0 != null ? interfaceC0322b0.equals(c0353u.m2355c(interfaceC0322b0.getDefaultInstanceForType())) : m2355c(interfaceC0322b1.getDefaultInstanceForType()).equals(interfaceC0322b1);
        }
        return interfaceC0322b0.equals(interfaceC0322b1);
    }

    public int hashCode() {
        return 1;
    }
}
