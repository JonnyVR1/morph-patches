package com.tencent.p101mm.opensdk.diffdev.p103a;

import org.eclipse.jetty.http.HttpStatus;

/* JADX INFO: renamed from: com.tencent.mm.opensdk.diffdev.a.d */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC14336d {
    UUID_EXPIRED(402),
    UUID_CANCELED(403),
    UUID_SCANED(404),
    UUID_CONFIRM(HttpStatus.METHOD_NOT_ALLOWED_405),
    UUID_KEEP_CONNECT(HttpStatus.REQUEST_TIMEOUT_408),
    UUID_ERROR(500);


    /* JADX INFO: renamed from: a */
    private int f60119a;

    EnumC14336d(int i) {
        this.f60119a = i;
    }

    /* JADX INFO: renamed from: a */
    public int m84168a() {
        return this.f60119a;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "UUIDStatusCode:" + this.f60119a;
    }
}
