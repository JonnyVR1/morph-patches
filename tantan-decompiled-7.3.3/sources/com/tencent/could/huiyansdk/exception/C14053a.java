package com.tencent.could.huiyansdk.exception;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.exception.a */
/* JADX INFO: loaded from: classes12.dex */
public class C14053a extends Exception {

    /* JADX INFO: renamed from: a */
    public int f58213a;

    /* JADX INFO: renamed from: b */
    public String f58214b;

    public C14053a(String str) {
        super(str);
        this.f58213a = -1;
        this.f58214b = str;
    }

    public C14053a(int i, String str) {
        this(str);
        this.f58213a = i;
    }
}
