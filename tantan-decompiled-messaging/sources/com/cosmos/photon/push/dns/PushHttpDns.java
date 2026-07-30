package com.cosmos.photon.push.dns;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p149l.a5e;
import p149l.j0c;

/* JADX INFO: loaded from: classes.dex */
public class PushHttpDns implements a5e {
    private String appId;

    public PushHttpDns(String str) {
        this.appId = str;
    }

    @Override // p149l.a5e
    public List<InetAddress> lookup(String str) throws UnknownHostException {
        List<String> listMo105305e = j0c.m139158b(this.appId).mo105305e(str);
        if (listMo105305e == null || listMo105305e.size() <= 0) {
            return a5e.f67705a.lookup(str);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = listMo105305e.iterator();
        while (it.hasNext()) {
            arrayList.addAll(Arrays.asList(InetAddress.getAllByName(it.next())));
        }
        return arrayList;
    }
}
