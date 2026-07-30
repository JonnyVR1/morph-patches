package p149l;

import okio.ByteString;

/* JADX INFO: loaded from: classes2.dex */
public final class hxk {

    /* JADX INFO: renamed from: d */
    public static final ByteString f109875d = ByteString.encodeUtf8(":");

    /* JADX INFO: renamed from: e */
    public static final ByteString f109876e = ByteString.encodeUtf8(":status");

    /* JADX INFO: renamed from: f */
    public static final ByteString f109877f = ByteString.encodeUtf8(":method");

    /* JADX INFO: renamed from: g */
    public static final ByteString f109878g = ByteString.encodeUtf8(":path");

    /* JADX INFO: renamed from: h */
    public static final ByteString f109879h = ByteString.encodeUtf8(":scheme");

    /* JADX INFO: renamed from: i */
    public static final ByteString f109880i = ByteString.encodeUtf8(":authority");

    /* JADX INFO: renamed from: a */
    public final ByteString f109881a;

    /* JADX INFO: renamed from: b */
    public final ByteString f109882b;

    /* JADX INFO: renamed from: c */
    public final int f109883c;

    public hxk(ByteString byteString, ByteString byteString2) {
        this.f109881a = byteString;
        this.f109882b = byteString2;
        this.f109883c = byteString.size() + 32 + byteString2.size();
    }

    public boolean equals(Object obj) {
        if (obj instanceof hxk) {
            hxk hxkVar = (hxk) obj;
            if (this.f109881a.equals(hxkVar.f109881a) && this.f109882b.equals(hxkVar.f109882b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f109881a.hashCode()) * 31) + this.f109882b.hashCode();
    }

    public String toString() {
        return tck0.m188016q("%s: %s", this.f109881a.utf8(), this.f109882b.utf8());
    }

    public hxk(ByteString byteString, String str) {
        this(byteString, ByteString.encodeUtf8(str));
    }

    public hxk(String str, String str2) {
        this(ByteString.encodeUtf8(str), ByteString.encodeUtf8(str2));
    }
}
