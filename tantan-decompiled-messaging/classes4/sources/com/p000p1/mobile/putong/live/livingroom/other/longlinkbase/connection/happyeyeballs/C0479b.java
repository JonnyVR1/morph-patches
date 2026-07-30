package com.p000p1.mobile.putong.live.livingroom.other.longlinkbase.connection.happyeyeballs;

import com.tantanapp.common.utils.CrashHelper;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import l.gkh0;
import l.ptc0;
import p002l.fvk;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.other.longlinkbase.connection.happyeyeballs.b */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class C0479b {

    /* JADX INFO: renamed from: a */
    public final fvk f7269a;

    /* JADX INFO: renamed from: b */
    public final C0480c f7270b;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.other.longlinkbase.connection.happyeyeballs.b$a */
    public static class a implements Comparator<AddressRecord> {

        /* JADX INFO: renamed from: a */
        public final AddressRecord.AddressType f7271a;

        public a(AddressRecord.AddressType addressType) {
            this.f7271a = addressType;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AddressRecord addressRecord, AddressRecord addressRecord2) {
            if (this.f7271a != null) {
                if (addressRecord.m9154f() == this.f7271a && addressRecord2.m9154f() != this.f7271a) {
                    return -1;
                }
                if (addressRecord2.m9154f() == this.f7271a && addressRecord.m9154f() != this.f7271a) {
                    return 1;
                }
            }
            AddressRecord.AddressType addressTypeM9154f = addressRecord.m9154f();
            AddressRecord.AddressType addressType = AddressRecord.AddressType.IPV6;
            if (addressTypeM9154f == addressType && addressRecord2.m9154f() == AddressRecord.AddressType.IPV4) {
                return -1;
            }
            return (addressRecord.m9154f() == AddressRecord.AddressType.IPV4 && addressRecord2.m9154f() == addressType) ? 1 : 0;
        }
    }

    public C0479b(fvk fvkVar, C0480c c0480c) {
        this.f7269a = fvkVar;
        this.f7270b = c0480c;
    }

    /* JADX INFO: renamed from: a */
    public final void m9166a(String str) {
        gkh0.j("[live][longlink]", "DnsResolver: " + str);
    }

    /* JADX INFO: renamed from: b */
    public List<AddressRecord> m9167b(String str) {
        try {
            m9166a("resolving " + str);
            InetAddress[] allByName = InetAddress.getAllByName(str);
            ArrayList arrayList = new ArrayList();
            for (InetAddress inetAddress : allByName) {
                arrayList.add(new AddressRecord(inetAddress, str));
            }
            List<AddressRecord> listM9168c = m9168c(arrayList);
            m9166a("resolved " + str + " to " + listM9168c.size() + " addresses");
            return listM9168c;
        } catch (UnknownHostException e) {
            CrashHelper.c(e);
            m9166a("failed to resolve " + str + " - " + e.getMessage());
            ptc0.a("DNS resolve failed for host: ", str, e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final List<AddressRecord> m9168c(List<AddressRecord> list) {
        Collections.sort(list, new a(this.f7270b.m9170a()));
        return list;
    }
}
