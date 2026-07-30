package com.immomo.mmdns;

import android.text.TextUtils;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;
import p149l.a5e;

/* JADX INFO: loaded from: classes7.dex */
public class MMOkHttpDns implements a5e {
    private String appId;

    public MMOkHttpDns(String str) {
        this.appId = str;
    }

    @Override // p149l.a5e
    public List<InetAddress> lookup(String str) throws UnknownHostException {
        String usableHost;
        String usableHost2;
        String ipByHost = MockDns.getIpByHost(str);
        if (ipByHost != null) {
            return Arrays.asList(InetAddress.getAllByName(ipByHost));
        }
        if (TextUtils.isEmpty(this.appId)) {
            if (MDDNSEntrance.getInstance().useDNS(str) && (usableHost2 = MDDNSEntrance.getInstance().getUsableHost(str)) != null) {
                return Arrays.asList(MoInetAddressHelper.getAllByName(usableHost2));
            }
        } else if (DNSManager.getInstance(this.appId).useDNS(str) && (usableHost = DNSManager.getInstance(this.appId).getUsableHost(str)) != null) {
            return Arrays.asList(MoInetAddressHelper.getAllByName(usableHost));
        }
        return a5e.f67705a.lookup(str);
    }

    @Deprecated
    public MMOkHttpDns() {
    }
}
