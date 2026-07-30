package com.xiaomi.push;

import java.io.IOException;

/* JADX INFO: renamed from: com.xiaomi.push.d */
/* JADX INFO: loaded from: classes2.dex */
public class C14878d extends IOException {
    public C14878d(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: a */
    public static C14878d m86684a() {
        return new C14878d("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: renamed from: b */
    public static C14878d m86685b() {
        return new C14878d("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: renamed from: c */
    public static C14878d m86686c() {
        return new C14878d("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: renamed from: d */
    public static C14878d m86687d() {
        return new C14878d("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: renamed from: e */
    public static C14878d m86688e() {
        return new C14878d("Protocol message end-group tag did not match expected tag.");
    }

    /* JADX INFO: renamed from: f */
    public static C14878d m86689f() {
        return new C14878d("Protocol message tag had invalid wire type.");
    }

    /* JADX INFO: renamed from: g */
    public static C14878d m86690g() {
        return new C14878d("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* JADX INFO: renamed from: h */
    public static C14878d m86691h() {
        return new C14878d("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }
}
