package com.immomo.mmdns;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;
import p149l.a5e;

/* JADX INFO: loaded from: classes7.dex */
public class WebFDTHttpDns implements a5e {
    @Override // p149l.a5e
    public List<InetAddress> lookup(String str) throws UnknownHostException {
        String ipByHost = MockDns.getIpByHost(str);
        return ipByHost != null ? Arrays.asList(InetAddress.getAllByName(ipByHost)) : a5e.f67705a.lookup(str);
    }
}
