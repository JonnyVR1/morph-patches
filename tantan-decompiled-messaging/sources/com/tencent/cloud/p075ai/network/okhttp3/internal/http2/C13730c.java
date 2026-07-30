package com.tencent.cloud.p075ai.network.okhttp3.internal.http2;

import com.tencent.cloud.p075ai.network.okhttp3.internal.C13706c;
import com.tencent.cloud.p075ai.network.okio.ByteString;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http2.c */
/* JADX INFO: loaded from: classes13.dex */
public final class C13730c {

    /* JADX INFO: renamed from: d */
    public static final ByteString f56621d = ByteString.encodeUtf8(":");

    /* JADX INFO: renamed from: e */
    public static final ByteString f56622e = ByteString.encodeUtf8(":status");

    /* JADX INFO: renamed from: f */
    public static final ByteString f56623f = ByteString.encodeUtf8(":method");

    /* JADX INFO: renamed from: g */
    public static final ByteString f56624g = ByteString.encodeUtf8(":path");

    /* JADX INFO: renamed from: h */
    public static final ByteString f56625h = ByteString.encodeUtf8(":scheme");

    /* JADX INFO: renamed from: i */
    public static final ByteString f56626i = ByteString.encodeUtf8(":authority");

    /* JADX INFO: renamed from: a */
    public final ByteString f56627a;

    /* JADX INFO: renamed from: b */
    public final ByteString f56628b;

    /* JADX INFO: renamed from: c */
    public final int f56629c;

    public C13730c(ByteString byteString, ByteString byteString2) {
        this.f56627a = byteString;
        this.f56628b = byteString2;
        this.f56629c = byteString.size() + 32 + byteString2.size();
    }

    public boolean equals(Object obj) {
        if (obj instanceof C13730c) {
            C13730c c13730c = (C13730c) obj;
            if (this.f56627a.equals(c13730c.f56627a) && this.f56628b.equals(c13730c.f56628b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f56627a.hashCode() + 527) * 31) + this.f56628b.hashCode();
    }

    public String toString() {
        return C13706c.m81605a("%s: %s", this.f56627a.utf8(), this.f56628b.utf8());
    }

    public C13730c(String str, String str2) {
        this(ByteString.encodeUtf8(str), ByteString.encodeUtf8(str2));
    }
}
