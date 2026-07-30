package com.p000p1.mobile.putong.live_api.api.serviceprovider.api.live;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public enum DialogObserver {
    BOOST_AND_SEE,
    PURCHASE,
    LIVE_SUGGEST,
    LIVE_CAMPAIGN_SUGGEST;

    private volatile boolean isDialogShown = false;
    private Set<InterfaceC0459a> callbacks = new LinkedHashSet();

    /* JADX INFO: renamed from: com.p1.mobile.putong.live_api.api.serviceprovider.api.live.DialogObserver$a */
    public interface InterfaceC0459a {
        /* JADX INFO: renamed from: b */
        void m9082b();

        /* JADX INFO: renamed from: c */
        default void m9083c() {
        }
    }

    DialogObserver() {
    }

    public synchronized void addOnDismissCallBack(InterfaceC0459a interfaceC0459a) {
        this.callbacks.add(interfaceC0459a);
    }

    public boolean isDialogShown() {
        return this.isDialogShown;
    }

    public synchronized void removeOnDismissCallBack(InterfaceC0459a interfaceC0459a) {
        this.callbacks.remove(interfaceC0459a);
    }

    public synchronized void setDialogShown(boolean z) {
        this.isDialogShown = z;
        boolean z2 = this.isDialogShown;
        Set<InterfaceC0459a> set = this.callbacks;
        if (z2) {
            Iterator<InterfaceC0459a> it = set.iterator();
            while (it.hasNext()) {
                it.next().m9083c();
            }
        } else {
            Iterator<InterfaceC0459a> it2 = set.iterator();
            while (it2.hasNext()) {
                it2.next().m9082b();
            }
        }
    }
}
