package com.tencent.p106mm.opensdk.diffdev.p108a;

import org.eclipse.jetty.http.HttpStatus;

/* JADX INFO: renamed from: com.tencent.mm.opensdk.diffdev.a.d */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC14499d {
    UUID_EXPIRED(402),
    UUID_CANCELED(403),
    UUID_SCANED(404),
    UUID_CONFIRM(HttpStatus.METHOD_NOT_ALLOWED_405),
    UUID_KEEP_CONNECT(HttpStatus.REQUEST_TIMEOUT_408),
    UUID_ERROR(500);


    /* JADX INFO: renamed from: a */
    private int f60967a;

    EnumC14499d(int i) {
        this.f60967a = i;
    }

    /* JADX INFO: renamed from: a */
    public int m85351a() {
        return this.f60967a;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "UUIDStatusCode:" + this.f60967a;
    }
}
