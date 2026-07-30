package p153l;

import android.text.TextUtils;
import com.cosmos.mdlog.MDLog;
import com.immomo.mmdns.LogTag;
import com.immomo.mmdns.MDDNSEntrance;
import com.p051p1.mobile.putong.api.api.Network;
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
public class tg50 implements o6e {

    /* JADX INFO: renamed from: e */
    public static String f174038e = "1.203.100.139";

    /* JADX INFO: renamed from: f */
    public static tg50 f174039f;

    /* JADX INFO: renamed from: g */
    public static final HashSet<String> f174040g = new HashSet<>();

    /* JADX INFO: renamed from: b */
    public vml f174041b;

    /* JADX INFO: renamed from: c */
    public boolean f174042c = false;

    /* JADX INFO: renamed from: d */
    public xul f174043d;

    public tg50() {
        m191017c("tantanapp.com");
        m191017c("tantantribe.com");
        m191019d("tancdn.com");
        m191019d("tantantribecdn.com");
        this.f174043d = new xul() { // from class: l.sg50
            @Override // p153l.xul
            public final HashMap getHeader() {
                return tg50.m191016b();
            }
        };
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ HashMap m191016b() {
        HashMap map = new HashMap();
        map.put("User-Agent", Network.getUA());
        return map;
    }

    /* JADX INFO: renamed from: c */
    public static void m191017c(String str) {
        HashSet<String> hashSet = f174040g;
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
    public static tg50 m191018g() {
        if (f174039f == null) {
            f174039f = new tg50();
        }
        return f174039f;
    }

    /* JADX INFO: renamed from: d */
    public final void m191019d(String str) {
        f174040g.add("auto." + str);
    }

    /* JADX INFO: renamed from: e */
    public void m191020e() {
        if (this.f174042c) {
            this.f174041b.m201755a();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m191021f(boolean z) {
        tu2.m192703a("[putong-common][dns]", "degradeHttpDns enable = " + z + ", inited = " + this.f174042c);
        if (this.f174042c) {
            this.f174041b.m201761i(z);
            vml vmlVar = this.f174041b;
            if (z) {
                vmlVar.m201760h();
            } else {
                vmlVar.m201755a();
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final List<InetAddress> m191022h(String str) throws UnknownHostException {
        boolean z;
        if (MDDNSEntrance.getInstance().useDNS(str)) {
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList = new ArrayList();
            String[] usableHostList = MDDNSEntrance.getInstance().getUsableHostList(str, true);
            if (jyb.m147480K(usableHostList)) {
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
                MDLog.m7450i(LogTag.DNS, "MomoDNSImp %s replace %s to %s", "MomoIpv6Util", str, arrayList);
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.addAll(Arrays.asList(InetAddress.getAllByName((String) it.next())));
                }
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
                m191024j(str, z, sb.toString());
                return arrayList2;
            }
        }
        List<InetAddress> listLookup = o6e.f145159a.lookup(str);
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
        m191024j(str, false, sb2.toString());
        return listLookup;
    }

    /* JADX INFO: renamed from: i */
    public final List<InetAddress> m191023i(String str) throws UnknownHostException {
        String strM201757d;
        return (!this.f174042c || (strM201757d = this.f174041b.m201757d(str)) == null) ? o6e.f145159a.lookup(str) : Arrays.asList(InetAddress.getAllByName(strM201757d));
    }

    /* JADX INFO: renamed from: j */
    public final void m191024j(String str, boolean z, String str2) {
        int iM154279e;
        if (li20.m154277g().m154282i() && (iM154279e = li20.m154277g().m154279e()) != 0 && gkc0.m130573a(0, 101) <= iM154279e) {
            HashMap map = new HashMap();
            map.put(Oauth2AccessToken.KEY_UID, uqb0.f180397c0.userId());
            map.put("domain", str);
            map.put("is_httpdns", "" + z);
            map.put("is_localdns", "" + (z ^ true));
            map.put("result_ip", str2);
            map.put("os", "Android");
            map.put("ver", "7.3.3");
            uqb0.f180379K.m134809c(map);
        }
    }

    @Override // p153l.o6e
    public List<InetAddress> lookup(String str) throws UnknownHostException {
        return v1c.f181942a ? m191022h(str) : m191023i(str);
    }
}
