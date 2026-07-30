package com.tencent.cloud.p080ai.network.okhttp3.internal.http2;

import com.tencent.cloud.p080ai.network.okhttp3.internal.C13869c;
import com.tencent.cloud.p080ai.network.okio.ByteString;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http2.c */
/* JADX INFO: loaded from: classes12.dex */
public final class C13893c {

    /* JADX INFO: renamed from: d */
    public static final ByteString f57469d = ByteString.encodeUtf8(":");

    /* JADX INFO: renamed from: e */
    public static final ByteString f57470e = ByteString.encodeUtf8(":status");

    /* JADX INFO: renamed from: f */
    public static final ByteString f57471f = ByteString.encodeUtf8(":method");

    /* JADX INFO: renamed from: g */
    public static final ByteString f57472g = ByteString.encodeUtf8(":path");

    /* JADX INFO: renamed from: h */
    public static final ByteString f57473h = ByteString.encodeUtf8(":scheme");

    /* JADX INFO: renamed from: i */
    public static final ByteString f57474i = ByteString.encodeUtf8(":authority");

    /* JADX INFO: renamed from: a */
    public final ByteString f57475a;

    /* JADX INFO: renamed from: b */
    public final ByteString f57476b;

    /* JADX INFO: renamed from: c */
    public final int f57477c;

    public C13893c(ByteString byteString, ByteString byteString2) {
        this.f57475a = byteString;
        this.f57476b = byteString2;
        this.f57477c = byteString.size() + 32 + byteString2.size();
    }

    public boolean equals(Object obj) {
        if (obj instanceof C13893c) {
            C13893c c13893c = (C13893c) obj;
            if (this.f57475a.equals(c13893c.f57475a) && this.f57476b.equals(c13893c.f57476b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f57475a.hashCode() + 527) * 31) + this.f57476b.hashCode();
    }

    public String toString() {
        return C13869c.m82788a("%s: %s", this.f57475a.utf8(), this.f57476b.utf8());
    }

    public C13893c(String str, String str2) {
        this(ByteString.encodeUtf8(str), ByteString.encodeUtf8(str2));
    }
}
