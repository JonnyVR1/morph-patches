package com.tencent.could.component.common.p079ai.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes2.dex */
public class DnsResolver implements Runnable {

    /* JADX INFO: renamed from: a */
    public final String f57284a;

    /* JADX INFO: renamed from: b */
    public InetAddress f57285b;

    public DnsResolver(String str) {
        this.f57284a = str;
    }

    public synchronized InetAddress getHasAddress() {
        return this.f57285b;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            setAddress(InetAddress.getByName(this.f57284a));
        } catch (UnknownHostException e) {
            TxNetWorkHelper.getInstance().logError("DnsResolver", "UnknownHostException " + this.f57284a + " e: " + e.getLocalizedMessage());
            this.f57285b = null;
        }
    }

    public synchronized void setAddress(InetAddress inetAddress) {
        this.f57285b = inetAddress;
    }
}
