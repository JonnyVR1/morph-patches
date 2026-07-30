package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.n */
/* JADX INFO: loaded from: classes7.dex */
public class C3416n {

    /* JADX INFO: renamed from: e */
    public static final C3410h f11614e = C3410h.m17158b();

    /* JADX INFO: renamed from: a */
    public ByteString f11615a;

    /* JADX INFO: renamed from: b */
    public C3410h f11616b;

    /* JADX INFO: renamed from: c */
    public volatile InterfaceC3419q f11617c;

    /* JADX INFO: renamed from: d */
    public volatile ByteString f11618d;

    /* JADX INFO: renamed from: a */
    public void m17215a(InterfaceC3419q interfaceC3419q) {
        if (this.f11617c != null) {
            return;
        }
        synchronized (this) {
            if (this.f11617c != null) {
                return;
            }
            try {
                if (this.f11615a != null) {
                    this.f11617c = interfaceC3419q.getParserForType().mo17076a(this.f11615a, this.f11616b);
                    this.f11618d = this.f11615a;
                } else {
                    this.f11617c = interfaceC3419q;
                    this.f11618d = ByteString.EMPTY;
                }
            } catch (InvalidProtocolBufferException unused) {
                this.f11617c = interfaceC3419q;
                this.f11618d = ByteString.EMPTY;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public int m17216b() {
        if (this.f11618d != null) {
            return this.f11618d.size();
        }
        ByteString byteString = this.f11615a;
        if (byteString != null) {
            return byteString.size();
        }
        if (this.f11617c != null) {
            return this.f11617c.getSerializedSize();
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public InterfaceC3419q m17217c(InterfaceC3419q interfaceC3419q) {
        m17215a(interfaceC3419q);
        return this.f11617c;
    }

    /* JADX INFO: renamed from: d */
    public InterfaceC3419q m17218d(InterfaceC3419q interfaceC3419q) {
        InterfaceC3419q interfaceC3419q2 = this.f11617c;
        this.f11615a = null;
        this.f11618d = null;
        this.f11617c = interfaceC3419q;
        return interfaceC3419q2;
    }

    /* JADX INFO: renamed from: e */
    public ByteString m17219e() {
        if (this.f11618d != null) {
            return this.f11618d;
        }
        ByteString byteString = this.f11615a;
        if (byteString != null) {
            return byteString;
        }
        synchronized (this) {
            try {
                if (this.f11618d != null) {
                    return this.f11618d;
                }
                if (this.f11617c == null) {
                    this.f11618d = ByteString.EMPTY;
                } else {
                    this.f11618d = this.f11617c.toByteString();
                }
                return this.f11618d;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3416n)) {
            return false;
        }
        C3416n c3416n = (C3416n) obj;
        InterfaceC3419q interfaceC3419q = this.f11617c;
        InterfaceC3419q interfaceC3419q2 = c3416n.f11617c;
        if (interfaceC3419q == null && interfaceC3419q2 == null) {
            return m17219e().equals(c3416n.m17219e());
        }
        if (interfaceC3419q == null || interfaceC3419q2 == null) {
            return interfaceC3419q != null ? interfaceC3419q.equals(c3416n.m17217c(interfaceC3419q.getDefaultInstanceForType())) : m17217c(interfaceC3419q2.getDefaultInstanceForType()).equals(interfaceC3419q2);
        }
        return interfaceC3419q.equals(interfaceC3419q2);
    }

    public int hashCode() {
        return 1;
    }
}
