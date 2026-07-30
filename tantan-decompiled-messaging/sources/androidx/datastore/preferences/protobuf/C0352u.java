package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.u */
/* JADX INFO: loaded from: classes.dex */
public class C0352u {

    /* JADX INFO: renamed from: e */
    public static final C0340l f1745e = C0340l.m2226b();

    /* JADX INFO: renamed from: a */
    public ByteString f1746a;

    /* JADX INFO: renamed from: b */
    public C0340l f1747b;

    /* JADX INFO: renamed from: c */
    public volatile InterfaceC0321b0 f1748c;

    /* JADX INFO: renamed from: d */
    public volatile ByteString f1749d;

    /* JADX INFO: renamed from: a */
    public void m2352a(InterfaceC0321b0 interfaceC0321b0) {
        if (this.f1748c != null) {
            return;
        }
        synchronized (this) {
            if (this.f1748c != null) {
                return;
            }
            try {
                if (this.f1746a != null) {
                    this.f1748c = interfaceC0321b0.getParserForType().mo1813b(this.f1746a, this.f1747b);
                    this.f1749d = this.f1746a;
                } else {
                    this.f1748c = interfaceC0321b0;
                    this.f1749d = ByteString.EMPTY;
                }
            } catch (InvalidProtocolBufferException unused) {
                this.f1748c = interfaceC0321b0;
                this.f1749d = ByteString.EMPTY;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public int m2353b() {
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
    public InterfaceC0321b0 m2354c(InterfaceC0321b0 interfaceC0321b0) {
        m2352a(interfaceC0321b0);
        return this.f1748c;
    }

    /* JADX INFO: renamed from: d */
    public InterfaceC0321b0 m2355d(InterfaceC0321b0 interfaceC0321b0) {
        InterfaceC0321b0 interfaceC0321b1 = this.f1748c;
        this.f1746a = null;
        this.f1749d = null;
        this.f1748c = interfaceC0321b0;
        return interfaceC0321b1;
    }

    /* JADX INFO: renamed from: e */
    public ByteString m2356e() {
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
        if (!(obj instanceof C0352u)) {
            return false;
        }
        C0352u c0352u = (C0352u) obj;
        InterfaceC0321b0 interfaceC0321b0 = this.f1748c;
        InterfaceC0321b0 interfaceC0321b1 = c0352u.f1748c;
        if (interfaceC0321b0 == null && interfaceC0321b1 == null) {
            return m2356e().equals(c0352u.m2356e());
        }
        if (interfaceC0321b0 == null || interfaceC0321b1 == null) {
            return interfaceC0321b0 != null ? interfaceC0321b0.equals(c0352u.m2354c(interfaceC0321b0.getDefaultInstanceForType())) : m2354c(interfaceC0321b1.getDefaultInstanceForType()).equals(interfaceC0321b1);
        }
        return interfaceC0321b0.equals(interfaceC0321b1);
    }

    public int hashCode() {
        return 1;
    }
}
