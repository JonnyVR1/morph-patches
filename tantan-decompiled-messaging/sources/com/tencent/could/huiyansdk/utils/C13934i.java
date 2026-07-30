package com.tencent.could.huiyansdk.utils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p149l.hb80;
import p149l.ig3;
import p149l.qkq0;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.utils.i */
/* JADX INFO: loaded from: classes2.dex */
public class C13934i<T> implements hb80<T> {

    /* JADX INFO: renamed from: a */
    public final Object[] f57517a;

    /* JADX INFO: renamed from: b */
    public int f57518b;

    public C13934i(int i, String str) {
        if (i > 0) {
            this.f57517a = new Object[i];
        } else {
            ig3.m135964a("The max pool size must be > 0");
            throw null;
        }
    }

    @Override // p149l.hb80
    @Nullable
    public T acquire() {
        int i = this.f57518b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f57517a;
        T t = (T) objArr[i2];
        objArr[i2] = null;
        this.f57518b = i2;
        return t;
    }

    @Override // p149l.hb80
    public boolean release(@NonNull T t) {
        int i = 0;
        while (true) {
            int i2 = this.f57518b;
            Object[] objArr = this.f57517a;
            if (i >= i2) {
                if (i2 >= objArr.length) {
                    return false;
                }
                objArr[i2] = t;
                this.f57518b = i2 + 1;
                return true;
            }
            if (objArr[i] == t) {
                qkq0.m175383a("Already in the pool!");
                return false;
            }
            i++;
        }
    }
}
