package com.p046p1.mobile.putong.live.livingroom.other.longlinkbase.connection.happyeyeballs;

import com.tantanapp.common.utils.CrashHelper;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p149l.fvk;
import p149l.gkh0;
import p149l.ptc0;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.other.longlinkbase.connection.happyeyeballs.b */
/* JADX INFO: loaded from: classes4.dex */
public class C12890b {

    /* JADX INFO: renamed from: a */
    public final fvk f51227a;

    /* JADX INFO: renamed from: b */
    public final C12891c f51228b;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.other.longlinkbase.connection.happyeyeballs.b$a */
    public static class a implements Comparator<AddressRecord> {

        /* JADX INFO: renamed from: a */
        public final AddressRecord.AddressType f51229a;

        public a(AddressRecord.AddressType addressType) {
            this.f51229a = addressType;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AddressRecord addressRecord, AddressRecord addressRecord2) {
            if (this.f51229a != null) {
                if (addressRecord.m75519f() == this.f51229a && addressRecord2.m75519f() != this.f51229a) {
                    return -1;
                }
                if (addressRecord2.m75519f() == this.f51229a && addressRecord.m75519f() != this.f51229a) {
                    return 1;
                }
            }
            AddressRecord.AddressType addressTypeM75519f = addressRecord.m75519f();
            AddressRecord.AddressType addressType = AddressRecord.AddressType.IPV6;
            if (addressTypeM75519f == addressType && addressRecord2.m75519f() == AddressRecord.AddressType.IPV4) {
                return -1;
            }
            return (addressRecord.m75519f() == AddressRecord.AddressType.IPV4 && addressRecord2.m75519f() == addressType) ? 1 : 0;
        }
    }

    public C12890b(fvk fvkVar, C12891c c12891c) {
        this.f51227a = fvkVar;
        this.f51228b = c12891c;
    }

    /* JADX INFO: renamed from: a */
    public final void m75531a(String str) {
        gkh0.m126627j("[live][longlink]", "DnsResolver: " + str);
    }

    /* JADX INFO: renamed from: b */
    public List<AddressRecord> m75532b(String str) {
        try {
            m75531a("resolving " + str);
            InetAddress[] allByName = InetAddress.getAllByName(str);
            ArrayList arrayList = new ArrayList();
            for (InetAddress inetAddress : allByName) {
                arrayList.add(new AddressRecord(inetAddress, str));
            }
            List<AddressRecord> listM75533c = m75533c(arrayList);
            m75531a("resolved " + str + " to " + listM75533c.size() + " addresses");
            return listM75533c;
        } catch (UnknownHostException e) {
            CrashHelper.m81296c(e);
            m75531a("failed to resolve " + str + " - " + e.getMessage());
            ptc0.m171306a("DNS resolve failed for host: ", str, e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final List<AddressRecord> m75533c(List<AddressRecord> list) {
        Collections.sort(list, new a(this.f51228b.m75535a()));
        return list;
    }
}
