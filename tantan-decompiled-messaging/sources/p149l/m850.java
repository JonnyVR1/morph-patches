package p149l;

import android.text.TextUtils;
import com.cosmos.mdlog.MDLog;
import com.immomo.mmdns.LogTag;
import com.immomo.mmdns.MDDNSEntrance;
import com.p046p1.mobile.putong.api.api.Network;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class m850 implements a5e {

    /* JADX INFO: renamed from: e */
    public static String f132521e = "1.203.100.139";

    /* JADX INFO: renamed from: f */
    public static m850 f132522f;

    /* JADX INFO: renamed from: g */
    public static final HashSet<String> f132523g = new HashSet<>();

    /* JADX INFO: renamed from: b */
    public hkl f132524b;

    /* JADX INFO: renamed from: c */
    public boolean f132525c = false;

    /* JADX INFO: renamed from: d */
    public ksl f132526d;

    public m850() {
        m153452c(m153453g());
        m153456d(m153454h());
        this.f132526d = new ksl() { // from class: l.l850
            @Override // p149l.ksl
            public final HashMap getHeader() {
                return m850.m153451b();
            }
        };
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ HashMap m153451b() {
        HashMap map = new HashMap();
        map.put("User-Agent", Network.getUA());
        return map;
    }

    /* JADX INFO: renamed from: c */
    public static void m153452c(String str) {
        HashSet<String> hashSet = f132523g;
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
    public static String m153453g() {
        return uel.INSTANCE.m193266b() ? "tantantribe.com" : "tantanapp.com";
    }

    /* JADX INFO: renamed from: h */
    public static String m153454h() {
        return uel.INSTANCE.m193266b() ? "tantantribecdn.com" : "tancdn.com";
    }

    /* JADX INFO: renamed from: i */
    public static m850 m153455i() {
        if (f132522f == null) {
            f132522f = new m850();
        }
        return f132522f;
    }

    /* JADX INFO: renamed from: d */
    public final void m153456d(String str) {
        f132523g.add("auto." + str);
    }

    /* JADX INFO: renamed from: e */
    public void m153457e() {
        if (this.f132525c) {
            this.f132524b.m131569a();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m153458f(boolean z) {
        du2.m113670a("[putong-common][dns]", "degradeHttpDns enable = " + z + ", inited = " + this.f132525c);
        if (this.f132525c) {
            this.f132524b.m131575i(z);
            hkl hklVar = this.f132524b;
            if (z) {
                hklVar.m131574h();
            } else {
                hklVar.m131569a();
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final List<InetAddress> m153459j(String str) throws UnknownHostException {
        boolean z;
        if (MDDNSEntrance.getInstance().useDNS(str)) {
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList = new ArrayList();
            String[] usableHostList = MDDNSEntrance.getInstance().getUsableHostList(str, true);
            if (vwb.m200297K(usableHostList)) {
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
                MDLog.m7396i(LogTag.DNS, "MomoDNSImp %s replace %s to %s", "MomoIpv6Util", str, arrayList);
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.addAll(Arrays.asList(InetAddress.getAllByName((String) it.next())));
                }
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
                m153461l(str, z, sb.toString());
                return arrayList2;
            }
        }
        List<InetAddress> listLookup = a5e.f67705a.lookup(str);
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
        m153461l(str, false, sb2.toString());
        return listLookup;
    }

    /* JADX INFO: renamed from: k */
    public final List<InetAddress> m153460k(String str) throws UnknownHostException {
        String strM131571d;
        return (!this.f132525c || (strM131571d = this.f132524b.m131571d(str)) == null) ? a5e.f67705a.lookup(str) : Arrays.asList(InetAddress.getAllByName(strM131571d));
    }

    /* JADX INFO: renamed from: l */
    public final void m153461l(String str, boolean z, String str2) {
        int iM110539e;
        if (da20.m110537g().m110542i() && (iM110539e = da20.m110537g().m110539e()) != 0 && zbc0.m217835a(0, 101) <= iM110539e) {
            HashMap map = new HashMap();
            map.put(Oauth2AccessToken.KEY_UID, qib0.f154714c0.userId());
            map.put("domain", str);
            map.put("is_httpdns", "" + z);
            map.put("is_localdns", "" + (z ^ true));
            map.put("result_ip", str2);
            map.put("os", "Android");
            map.put("ver", "7.2.7");
            qib0.f154696K.m110170c(map);
        }
    }

    @Override // p149l.a5e
    public List<InetAddress> lookup(String str) throws UnknownHostException {
        return i0c.f110273a ? m153459j(str) : m153460k(str);
    }
}
