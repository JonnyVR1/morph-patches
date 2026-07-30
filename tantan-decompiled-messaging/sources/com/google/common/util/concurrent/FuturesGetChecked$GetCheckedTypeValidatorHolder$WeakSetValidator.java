package com.google.common.util.concurrent;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import p149l.uaj;

/* JADX INFO: loaded from: classes7.dex */
enum FuturesGetChecked$GetCheckedTypeValidatorHolder$WeakSetValidator {
    INSTANCE;

    private static final Set<WeakReference<Class<? extends Exception>>> validClasses = new CopyOnWriteArraySet();

    public void validateClass(Class<? extends Exception> cls) {
        Iterator<WeakReference<Class<? extends Exception>>> it = validClasses.iterator();
        while (it.hasNext()) {
            if (cls.equals(it.next().get())) {
                return;
            }
        }
        uaj.m192754a(cls);
        Set<WeakReference<Class<? extends Exception>>> set = validClasses;
        if (set.size() > 1000) {
            set.clear();
        }
        set.add(new WeakReference<>(cls));
    }
}
