package com.tantanapp.common.data;

import java.util.HashSet;

/* JADX INFO: loaded from: classes11.dex */
public abstract class DataChecker {
    HashSet<Class> set = registerCheckClass();

    public boolean needCheck(ValueObject valueObject) {
        HashSet<Class> hashSet = this.set;
        if (hashSet == null) {
            return false;
        }
        return hashSet.contains(valueObject.getClass());
    }

    public abstract boolean netDataErrorCheck(ValueObject valueObject);

    public abstract HashSet<Class> registerCheckClass();
}
