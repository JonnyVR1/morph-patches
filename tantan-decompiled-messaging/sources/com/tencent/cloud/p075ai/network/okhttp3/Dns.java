package com.tencent.cloud.p075ai.network.okhttp3;

import com.tencent.cloud.p075ai.network.okhttp3.Dns;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public interface Dns {
    public static final Dns SYSTEM = new Dns() { // from class: l.z4e
        @Override // com.tencent.cloud.p075ai.network.okhttp3.Dns
        public final List lookup(String str) {
            return Dns.m81581a(str);
        }
    };

    /* JADX INFO: renamed from: a */
    static /* synthetic */ List m81581a(String str) throws UnknownHostException {
        if (str == null) {
            throw new UnknownHostException("hostname == null");
        }
        try {
            return Arrays.asList(InetAddress.getAllByName(str));
        } catch (NullPointerException e) {
            UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
            unknownHostException.initCause(e);
            throw unknownHostException;
        }
    }

    List<InetAddress> lookup(String str);
}
