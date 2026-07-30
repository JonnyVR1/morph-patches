package com.tencent.could.component.common.p084ai.utils;

import p153l.wg3;
import p153l.wtq0;

/* JADX INFO: loaded from: classes12.dex */
public class SimplePool<T> {
    public static final String TAG = "SimplePool";
    public final Object[] pool;
    public String poolName;
    public int poolSize;

    public SimplePool(int i, String str) {
        if (i <= 0) {
            wg3.m206174a("The max pool size must be > 0");
            throw null;
        }
        this.pool = new Object[i];
        this.poolName = str;
    }

    private boolean isInPool(T t) {
        for (int i = 0; i < this.poolSize; i++) {
            if (this.pool[i] == t) {
                return true;
            }
        }
        return false;
    }

    public T acquire() {
        int i = this.poolSize;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.pool;
        T t = (T) objArr[i2];
        objArr[i2] = null;
        this.poolSize = i2;
        return t;
    }

    public boolean release(T t) {
        if (isInPool(t)) {
            wtq0.m207906a("Already in the pool!");
            return false;
        }
        int i = this.poolSize;
        Object[] objArr = this.pool;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = t;
        this.poolSize = i + 1;
        return true;
    }
}
