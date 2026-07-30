package com.tencent.could.huiyansdk.utils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p153l.nj80;
import p153l.wg3;
import p153l.wtq0;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.utils.i */
/* JADX INFO: loaded from: classes12.dex */
public class C14097i<T> implements nj80<T> {

    /* JADX INFO: renamed from: a */
    public final Object[] f58365a;

    /* JADX INFO: renamed from: b */
    public int f58366b;

    public C14097i(int i, String str) {
        if (i > 0) {
            this.f58365a = new Object[i];
        } else {
            wg3.m206174a("The max pool size must be > 0");
            throw null;
        }
    }

    @Override // p153l.nj80
    @Nullable
    public T acquire() {
        int i = this.f58366b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f58365a;
        T t = (T) objArr[i2];
        objArr[i2] = null;
        this.f58366b = i2;
        return t;
    }

    @Override // p153l.nj80
    public boolean release(@NonNull T t) {
        int i = 0;
        while (true) {
            int i2 = this.f58366b;
            Object[] objArr = this.f58365a;
            if (i >= i2) {
                if (i2 >= objArr.length) {
                    return false;
                }
                objArr[i2] = t;
                this.f58366b = i2 + 1;
                return true;
            }
            if (objArr[i] == t) {
                wtq0.m207906a("Already in the pool!");
                return false;
            }
            i++;
        }
    }
}
