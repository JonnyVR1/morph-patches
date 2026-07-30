package com.p051p1.mobile.putong.live.livingroom.other.longlinkbase.connection.happyeyeballs;

import java.util.concurrent.atomic.AtomicReference;
import p153l.nsh0;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.other.longlinkbase.connection.happyeyeballs.c */
/* JADX INFO: loaded from: classes5.dex */
public class C13054c {

    /* JADX INFO: renamed from: a */
    public final AtomicReference<AddressRecord.AddressType> f52078a = new AtomicReference<>(null);

    /* JADX INFO: renamed from: a */
    public AddressRecord.AddressType m76718a() {
        return this.f52078a.get();
    }

    /* JADX INFO: renamed from: b */
    public final void m76719b(String str) {
        nsh0.m164608j("[live][longlink]", "PreferenceCache: " + str);
    }

    /* JADX INFO: renamed from: c */
    public void m76720c(AddressRecord.AddressType addressType) {
        if (addressType == null) {
            return;
        }
        this.f52078a.set(addressType);
        m76719b("record success for protocol: " + addressType);
    }
}
