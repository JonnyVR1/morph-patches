package com.cosmos.photon.push.dns;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p153l.o6e;
import p153l.w1c;

/* JADX INFO: loaded from: classes.dex */
public class PushHttpDns implements o6e {
    private String appId;

    public PushHttpDns(String str) {
        this.appId = str;
    }

    @Override // p153l.o6e
    public List<InetAddress> lookup(String str) throws UnknownHostException {
        List<String> listMo155718e = w1c.m204391b(this.appId).mo155718e(str);
        if (listMo155718e == null || listMo155718e.size() <= 0) {
            return o6e.f145159a.lookup(str);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = listMo155718e.iterator();
        while (it.hasNext()) {
            arrayList.addAll(Arrays.asList(InetAddress.getAllByName(it.next())));
        }
        return arrayList;
    }
}
