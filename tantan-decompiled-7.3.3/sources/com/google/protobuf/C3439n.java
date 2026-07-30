package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.n */
/* JADX INFO: loaded from: classes7.dex */
public class C3439n {

    /* JADX INFO: renamed from: e */
    public static final C3433h f11651e = C3433h.m17213b();

    /* JADX INFO: renamed from: a */
    public ByteString f11652a;

    /* JADX INFO: renamed from: b */
    public C3433h f11653b;

    /* JADX INFO: renamed from: c */
    public volatile InterfaceC3442q f11654c;

    /* JADX INFO: renamed from: d */
    public volatile ByteString f11655d;

    /* JADX INFO: renamed from: a */
    public void m17270a(InterfaceC3442q interfaceC3442q) {
        if (this.f11654c != null) {
            return;
        }
        synchronized (this) {
            if (this.f11654c != null) {
                return;
            }
            try {
                if (this.f11652a != null) {
                    this.f11654c = interfaceC3442q.getParserForType().mo17131a(this.f11652a, this.f11653b);
                    this.f11655d = this.f11652a;
                } else {
                    this.f11654c = interfaceC3442q;
                    this.f11655d = ByteString.EMPTY;
                }
            } catch (InvalidProtocolBufferException unused) {
                this.f11654c = interfaceC3442q;
                this.f11655d = ByteString.EMPTY;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public int m17271b() {
        if (this.f11655d != null) {
            return this.f11655d.size();
        }
        ByteString byteString = this.f11652a;
        if (byteString != null) {
            return byteString.size();
        }
        if (this.f11654c != null) {
            return this.f11654c.getSerializedSize();
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public InterfaceC3442q m17272c(InterfaceC3442q interfaceC3442q) {
        m17270a(interfaceC3442q);
        return this.f11654c;
    }

    /* JADX INFO: renamed from: d */
    public InterfaceC3442q m17273d(InterfaceC3442q interfaceC3442q) {
        InterfaceC3442q interfaceC3442q2 = this.f11654c;
        this.f11652a = null;
        this.f11655d = null;
        this.f11654c = interfaceC3442q;
        return interfaceC3442q2;
    }

    /* JADX INFO: renamed from: e */
    public ByteString m17274e() {
        if (this.f11655d != null) {
            return this.f11655d;
        }
        ByteString byteString = this.f11652a;
        if (byteString != null) {
            return byteString;
        }
        synchronized (this) {
            try {
                if (this.f11655d != null) {
                    return this.f11655d;
                }
                if (this.f11654c == null) {
                    this.f11655d = ByteString.EMPTY;
                } else {
                    this.f11655d = this.f11654c.toByteString();
                }
                return this.f11655d;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3439n)) {
            return false;
        }
        C3439n c3439n = (C3439n) obj;
        InterfaceC3442q interfaceC3442q = this.f11654c;
        InterfaceC3442q interfaceC3442q2 = c3439n.f11654c;
        if (interfaceC3442q == null && interfaceC3442q2 == null) {
            return m17274e().equals(c3439n.m17274e());
        }
        if (interfaceC3442q == null || interfaceC3442q2 == null) {
            return interfaceC3442q != null ? interfaceC3442q.equals(c3439n.m17272c(interfaceC3442q.getDefaultInstanceForType())) : m17272c(interfaceC3442q2.getDefaultInstanceForType()).equals(interfaceC3442q2);
        }
        return interfaceC3442q.equals(interfaceC3442q2);
    }

    public int hashCode() {
        return 1;
    }
}
