package com.p046p1.mobile.putong.live_api.api.serviceprovider.api.live;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public enum DialogObserver {
    BOOST_AND_SEE,
    PURCHASE,
    LIVE_SUGGEST,
    LIVE_CAMPAIGN_SUGGEST;

    private volatile boolean isDialogShown = false;
    private Set<InterfaceC13057a> callbacks = new LinkedHashSet();

    /* JADX INFO: renamed from: com.p1.mobile.putong.live_api.api.serviceprovider.api.live.DialogObserver$a */
    public interface InterfaceC13057a {
        /* JADX INFO: renamed from: b */
        void m78788b();

        /* JADX INFO: renamed from: c */
        default void m78789c() {
        }
    }

    DialogObserver() {
    }

    public synchronized void addOnDismissCallBack(InterfaceC13057a interfaceC13057a) {
        this.callbacks.add(interfaceC13057a);
    }

    public boolean isDialogShown() {
        return this.isDialogShown;
    }

    public synchronized void removeOnDismissCallBack(InterfaceC13057a interfaceC13057a) {
        this.callbacks.remove(interfaceC13057a);
    }

    public synchronized void setDialogShown(boolean z) {
        this.isDialogShown = z;
        boolean z2 = this.isDialogShown;
        Set<InterfaceC13057a> set = this.callbacks;
        if (z2) {
            Iterator<InterfaceC13057a> it = set.iterator();
            while (it.hasNext()) {
                it.next().m78789c();
            }
        } else {
            Iterator<InterfaceC13057a> it2 = set.iterator();
            while (it2.hasNext()) {
                it2.next().m78788b();
            }
        }
    }
}
