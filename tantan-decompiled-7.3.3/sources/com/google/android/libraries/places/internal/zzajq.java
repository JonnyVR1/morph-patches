package com.google.android.libraries.places.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p153l.C20511u7;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class zzajq {
    public static /* synthetic */ boolean zza(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, Object obj2, Object obj3) {
        while (!C20511u7.m194801a(atomicReferenceFieldUpdater, obj, obj2, obj3)) {
            if (atomicReferenceFieldUpdater.get(obj) != obj2) {
                return false;
            }
        }
        return true;
    }
}
