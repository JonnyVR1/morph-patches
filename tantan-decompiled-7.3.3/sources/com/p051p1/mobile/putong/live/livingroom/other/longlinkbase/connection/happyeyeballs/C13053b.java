package com.p051p1.mobile.putong.live.livingroom.other.longlinkbase.connection.happyeyeballs;

import com.tantanapp.common.utils.CrashHelper;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p153l.nsh0;
import p153l.u1d0;
import p153l.vxk;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.other.longlinkbase.connection.happyeyeballs.b */
/* JADX INFO: loaded from: classes5.dex */
public class C13053b {

    /* JADX INFO: renamed from: a */
    public final vxk f52075a;

    /* JADX INFO: renamed from: b */
    public final C13054c f52076b;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.other.longlinkbase.connection.happyeyeballs.b$a */
    public static class a implements Comparator<AddressRecord> {

        /* JADX INFO: renamed from: a */
        public final AddressRecord.AddressType f52077a;

        public a(AddressRecord.AddressType addressType) {
            this.f52077a = addressType;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AddressRecord addressRecord, AddressRecord addressRecord2) {
            if (this.f52077a != null) {
                if (addressRecord.m76702f() == this.f52077a && addressRecord2.m76702f() != this.f52077a) {
                    return -1;
                }
                if (addressRecord2.m76702f() == this.f52077a && addressRecord.m76702f() != this.f52077a) {
                    return 1;
                }
            }
            AddressRecord.AddressType addressTypeM76702f = addressRecord.m76702f();
            AddressRecord.AddressType addressType = AddressRecord.AddressType.IPV6;
            if (addressTypeM76702f == addressType && addressRecord2.m76702f() == AddressRecord.AddressType.IPV4) {
                return -1;
            }
            return (addressRecord.m76702f() == AddressRecord.AddressType.IPV4 && addressRecord2.m76702f() == addressType) ? 1 : 0;
        }
    }

    public C13053b(vxk vxkVar, C13054c c13054c) {
        this.f52075a = vxkVar;
        this.f52076b = c13054c;
    }

    /* JADX INFO: renamed from: a */
    public final void m76714a(String str) {
        nsh0.m164608j("[live][longlink]", "DnsResolver: " + str);
    }

    /* JADX INFO: renamed from: b */
    public List<AddressRecord> m76715b(String str) {
        try {
            m76714a("resolving " + str);
            InetAddress[] allByName = InetAddress.getAllByName(str);
            ArrayList arrayList = new ArrayList();
            for (InetAddress inetAddress : allByName) {
                arrayList.add(new AddressRecord(inetAddress, str));
            }
            List<AddressRecord> listM76716c = m76716c(arrayList);
            m76714a("resolved " + str + " to " + listM76716c.size() + " addresses");
            return listM76716c;
        } catch (UnknownHostException e) {
            CrashHelper.m82479c(e);
            m76714a("failed to resolve " + str + " - " + e.getMessage());
            u1d0.m193953a("DNS resolve failed for host: ", str, e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final List<AddressRecord> m76716c(List<AddressRecord> list) {
        Collections.sort(list, new a(this.f52076b.m76718a()));
        return list;
    }
}
