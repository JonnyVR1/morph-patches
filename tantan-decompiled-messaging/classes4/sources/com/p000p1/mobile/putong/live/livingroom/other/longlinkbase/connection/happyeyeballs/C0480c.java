package com.p000p1.mobile.putong.live.livingroom.other.longlinkbase.connection.happyeyeballs;

import java.util.concurrent.atomic.AtomicReference;
import l.gkh0;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.other.longlinkbase.connection.happyeyeballs.c */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class C0480c {

    /* JADX INFO: renamed from: a */
    public final AtomicReference<AddressRecord.AddressType> f7272a = new AtomicReference<>(null);

    /* JADX INFO: renamed from: a */
    public AddressRecord.AddressType m9170a() {
        return this.f7272a.get();
    }

    /* JADX INFO: renamed from: b */
    public final void m9171b(String str) {
        gkh0.j("[live][longlink]", "PreferenceCache: " + str);
    }

    /* JADX INFO: renamed from: c */
    public void m9172c(AddressRecord.AddressType addressType) {
        if (addressType == null) {
            return;
        }
        this.f7272a.set(addressType);
        m9171b("record success for protocol: " + addressType);
    }
}
