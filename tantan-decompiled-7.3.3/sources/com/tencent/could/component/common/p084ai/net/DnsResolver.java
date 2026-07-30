package com.tencent.could.component.common.p084ai.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes12.dex */
public class DnsResolver implements Runnable {

    /* JADX INFO: renamed from: a */
    public final String f58132a;

    /* JADX INFO: renamed from: b */
    public InetAddress f58133b;

    public DnsResolver(String str) {
        this.f58132a = str;
    }

    public synchronized InetAddress getHasAddress() {
        return this.f58133b;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            setAddress(InetAddress.getByName(this.f58132a));
        } catch (UnknownHostException e) {
            TxNetWorkHelper.getInstance().logError("DnsResolver", "UnknownHostException " + this.f58132a + " e: " + e.getLocalizedMessage());
            this.f58133b = null;
        }
    }

    public synchronized void setAddress(InetAddress inetAddress) {
        this.f58133b = inetAddress;
    }
}
