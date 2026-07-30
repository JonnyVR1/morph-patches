package com.p046p1.mobile.putong.live.livingroom.other.longlinkbase.connection.happyeyeballs;

import java.util.concurrent.atomic.AtomicReference;
import p149l.gkh0;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.other.longlinkbase.connection.happyeyeballs.c */
/* JADX INFO: loaded from: classes4.dex */
public class C12891c {

    /* JADX INFO: renamed from: a */
    public final AtomicReference<AddressRecord.AddressType> f51230a = new AtomicReference<>(null);

    /* JADX INFO: renamed from: a */
    public AddressRecord.AddressType m75535a() {
        return this.f51230a.get();
    }

    /* JADX INFO: renamed from: b */
    public final void m75536b(String str) {
        gkh0.m126627j("[live][longlink]", "PreferenceCache: " + str);
    }

    /* JADX INFO: renamed from: c */
    public void m75537c(AddressRecord.AddressType addressType) {
        if (addressType == null) {
            return;
        }
        this.f51230a.set(addressType);
        m75536b("record success for protocol: " + addressType);
    }
}
