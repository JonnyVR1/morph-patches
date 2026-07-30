package p006l;

import android.text.TextUtils;
import com.cosmos.mdlog.MDLog;
import com.immomo.mmdns.MDDNSEntrance;
import com.p000p1.mobile.putong.api.api.Network;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import l.a5e;
import l.du2;
import l.hkl;
import l.ksl;
import l.vwb;
import l.zbc0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class m850 implements a5e {

    /* JADX INFO: renamed from: e */
    public static String f16843e = "1.203.100.139";

    /* JADX INFO: renamed from: f */
    public static m850 f16844f;

    /* JADX INFO: renamed from: g */
    public static final HashSet<String> f16845g = new HashSet<>();

    /* JADX INFO: renamed from: b */
    public hkl f16846b;

    /* JADX INFO: renamed from: c */
    public boolean f16847c = false;

    /* JADX INFO: renamed from: d */
    public ksl f16848d;

    public m850() {
        m19155c(m19156g());
        m19159d(m19157h());
        this.f16848d = new ksl() { // from class: l.l850
            public final HashMap getHeader() {
                return m850.m19154b();
            }
        };
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ HashMap m19154b() {
        HashMap map = new HashMap();
        map.put("User-Agent", Network.getUA());
        return map;
    }

    /* JADX INFO: renamed from: c */
    public static void m19155c(String str) {
        HashSet<String> hashSet = f16845g;
        hashSet.add("accounts." + str);
        hashSet.add("account." + str);
        hashSet.add("core." + str);
        hashSet.add("cloud." + str);
        hashSet.add("client-tracking." + str);
        hashSet.add("client-tracking_new." + str);
        hashSet.add("asset." + str);
        hashSet.add("autoupdate." + str);
        hashSet.add("payment." + str);
        hashSet.add("abtest." + str);
        hashSet.add("ai-growth." + str);
        hashSet.add("growth." + str);
        hashSet.add("k." + str);
        hashSet.add("report." + str);
        hashSet.add("sc-report." + str);
        hashSet.add("my-tantan." + str);
        hashSet.add("m." + str);
        hashSet.add("i." + str);
    }

    /* JADX INFO: renamed from: g */
    public static String m19156g() {
        return uel.INSTANCE.m25199b() ? "tantantribe.com" : "tantanapp.com";
    }

    /* JADX INFO: renamed from: h */
    public static String m19157h() {
        return uel.INSTANCE.m25199b() ? "tantantribecdn.com" : "tancdn.com";
    }

    /* JADX INFO: renamed from: i */
    public static m850 m19158i() {
        if (f16844f == null) {
            f16844f = new m850();
        }
        return f16844f;
    }

    /* JADX INFO: renamed from: d */
    public final void m19159d(String str) {
        f16845g.add("auto." + str);
    }

    /* JADX INFO: renamed from: e */
    public void m19160e() {
        if (this.f16847c) {
            this.f16846b.a();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m19161f(boolean z) {
        du2.a("[putong-common][dns]", "degradeHttpDns enable = " + z + ", inited = " + this.f16847c);
        if (this.f16847c) {
            this.f16846b.i(z);
            hkl hklVar = this.f16846b;
            if (z) {
                hklVar.h();
            } else {
                hklVar.a();
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final List<InetAddress> m19162j(String str) throws UnknownHostException {
        boolean z;
        if (MDDNSEntrance.getInstance().useDNS(str)) {
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList = new ArrayList();
            String[] usableHostList = MDDNSEntrance.getInstance().getUsableHostList(str, true);
            if (vwb.K(usableHostList)) {
                z = false;
            } else {
                arrayList.add(usableHostList[0]);
                z = false;
                for (String str2 : usableHostList) {
                    if (!TextUtils.equals(str2, str)) {
                        z = true;
                    }
                    sb.append(str2);
                    sb.append(',');
                }
            }
            String usableHost = MDDNSEntrance.getInstance().getUsableHost(str);
            if (!TextUtils.isEmpty(usableHost) && !TextUtils.equals(str, usableHost)) {
                arrayList.add(usableHost);
                sb.append(usableHost);
                sb.append(',');
                z = true;
            }
            if (arrayList.size() > 0) {
                MDLog.i("MMDNS", "MomoDNSImp %s replace %s to %s", new Object[]{"MomoIpv6Util", str, arrayList});
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.addAll(Arrays.asList(InetAddress.getAllByName((String) it.next())));
                }
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
                m19164l(str, z, sb.toString());
                return arrayList2;
            }
        }
        List<InetAddress> listLookup = a5e.a.lookup(str);
        StringBuilder sb2 = new StringBuilder();
        if (listLookup != null) {
            Iterator<InetAddress> it2 = listLookup.iterator();
            while (it2.hasNext()) {
                sb2.append(it2.next().getHostAddress());
                sb2.append(',');
            }
        }
        if (sb2.length() > 0) {
            sb2.deleteCharAt(sb2.length() - 1);
        }
        m19164l(str, false, sb2.toString());
        return listLookup;
    }

    /* JADX INFO: renamed from: k */
    public final List<InetAddress> m19163k(String str) throws UnknownHostException {
        String strD;
        return (!this.f16847c || (strD = this.f16846b.d(str)) == null) ? a5e.a.lookup(str) : Arrays.asList(InetAddress.getAllByName(strD));
    }

    /* JADX INFO: renamed from: l */
    public final void m19164l(String str, boolean z, String str2) {
        int iM13871e;
        if (da20.m13869g().m13874i() && (iM13871e = da20.m13869g().m13871e()) != 0 && zbc0.a(0, 101) <= iM13871e) {
            HashMap map = new HashMap();
            map.put("uid", qib0.f19805c0.userId());
            map.put("domain", str);
            map.put("is_httpdns", "" + z);
            map.put("is_localdns", "" + (z ^ true));
            map.put("result_ip", str2);
            map.put("os", "Android");
            map.put("ver", "7.2.7");
            qib0.f19787K.m13806c(map);
        }
    }

    public List<InetAddress> lookup(String str) throws UnknownHostException {
        return i0c.f14160a ? m19162j(str) : m19163k(str);
    }
}
