package com.p051p1.mobile.putong.live_api.api.serviceprovider.api.live;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public enum DialogObserver {
    BOOST_AND_SEE,
    PURCHASE,
    LIVE_SUGGEST,
    LIVE_CAMPAIGN_SUGGEST;

    private volatile boolean isDialogShown = false;
    private Set<InterfaceC13220a> callbacks = new LinkedHashSet();

    /* JADX INFO: renamed from: com.p1.mobile.putong.live_api.api.serviceprovider.api.live.DialogObserver$a */
    public interface InterfaceC13220a {
        /* JADX INFO: renamed from: b */
        void m79971b();

        /* JADX INFO: renamed from: c */
        default void m79972c() {
        }
    }

    DialogObserver() {
    }

    public synchronized void addOnDismissCallBack(InterfaceC13220a interfaceC13220a) {
        this.callbacks.add(interfaceC13220a);
    }

    public boolean isDialogShown() {
        return this.isDialogShown;
    }

    public synchronized void removeOnDismissCallBack(InterfaceC13220a interfaceC13220a) {
        this.callbacks.remove(interfaceC13220a);
    }

    public synchronized void setDialogShown(boolean z) {
        this.isDialogShown = z;
        boolean z2 = this.isDialogShown;
        Set<InterfaceC13220a> set = this.callbacks;
        if (z2) {
            Iterator<InterfaceC13220a> it = set.iterator();
            while (it.hasNext()) {
                it.next().m79972c();
            }
        } else {
            Iterator<InterfaceC13220a> it2 = set.iterator();
            while (it2.hasNext()) {
                it2.next().m79971b();
            }
        }
    }
}
