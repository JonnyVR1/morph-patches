package p153l;

import okio.ByteString;

/* JADX INFO: loaded from: classes2.dex */
public final class xzk {

    /* JADX INFO: renamed from: d */
    public static final ByteString f196878d = ByteString.encodeUtf8(":");

    /* JADX INFO: renamed from: e */
    public static final ByteString f196879e = ByteString.encodeUtf8(":status");

    /* JADX INFO: renamed from: f */
    public static final ByteString f196880f = ByteString.encodeUtf8(":method");

    /* JADX INFO: renamed from: g */
    public static final ByteString f196881g = ByteString.encodeUtf8(":path");

    /* JADX INFO: renamed from: h */
    public static final ByteString f196882h = ByteString.encodeUtf8(":scheme");

    /* JADX INFO: renamed from: i */
    public static final ByteString f196883i = ByteString.encodeUtf8(":authority");

    /* JADX INFO: renamed from: a */
    public final ByteString f196884a;

    /* JADX INFO: renamed from: b */
    public final ByteString f196885b;

    /* JADX INFO: renamed from: c */
    public final int f196886c;

    public xzk(ByteString byteString, ByteString byteString2) {
        this.f196884a = byteString;
        this.f196885b = byteString2;
        this.f196886c = byteString.size() + 32 + byteString2.size();
    }

    public boolean equals(Object obj) {
        if (obj instanceof xzk) {
            xzk xzkVar = (xzk) obj;
            if (this.f196884a.equals(xzkVar.f196884a) && this.f196885b.equals(xzkVar.f196885b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f196884a.hashCode()) * 31) + this.f196885b.hashCode();
    }

    public String toString() {
        return zlk0.m220255q("%s: %s", this.f196884a.utf8(), this.f196885b.utf8());
    }

    public xzk(ByteString byteString, String str) {
        this(byteString, ByteString.encodeUtf8(str));
    }

    public xzk(String str, String str2) {
        this(ByteString.encodeUtf8(str), ByteString.encodeUtf8(str2));
    }
}
