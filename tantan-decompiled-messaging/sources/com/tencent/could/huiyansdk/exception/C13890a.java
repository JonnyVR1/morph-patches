package com.tencent.could.huiyansdk.exception;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.exception.a */
/* JADX INFO: loaded from: classes2.dex */
public class C13890a extends Exception {

    /* JADX INFO: renamed from: a */
    public int f57365a;

    /* JADX INFO: renamed from: b */
    public String f57366b;

    public C13890a(String str) {
        super(str);
        this.f57365a = -1;
        this.f57366b = str;
    }

    public C13890a(int i, String str) {
        this(str);
        this.f57365a = i;
    }
}
