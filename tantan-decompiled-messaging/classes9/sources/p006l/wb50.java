package p006l;

import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import com.p000p1.mobile.putong.api.api.Network;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.location.Location;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l.dyd;
import l.mqi0;
import l.v9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class wb50 extends xh5 {

    /* JADX INFO: renamed from: a */
    public static String f25076a = "";

    /* JADX INFO: renamed from: b */
    public static Map<String, v9j<String>> f25077b;

    static {
        HashMap map = new HashMap();
        f25077b = map;
        map.put("OS", new v9j() { // from class: l.mb50
            public final Object call() {
                return wb50.m26314C();
            }
        });
        f25077b.put("IMEI", new v9j() { // from class: l.nb50
            public final Object call() {
                return dyd.d();
            }
        });
        f25077b.put("ANDROIDID", new v9j() { // from class: l.ob50
            public final Object call() {
                return dyd.b();
            }
        });
        f25077b.put("OAID", new v9j() { // from class: l.pb50
            public final Object call() {
                return k200.m17914b();
            }
        });
        f25077b.put(Network.MAC, new v9j() { // from class: l.qb50
            public final Object call() {
                return wb50.m26319y();
            }
        });
        f25077b.put("TS", new v9j() { // from class: l.rb50
            public final Object call() {
                return String.valueOf(mqi0.o() / 1000);
            }
        });
        f25077b.put("LBS", new v9j() { // from class: l.sb50
            public final Object call() {
                return wb50.m26318x();
            }
        });
        f25077b.put("UA", new v9j() { // from class: l.tb50
            public final Object call() {
                return wb50.m26316E();
            }
        });
        f25077b.put("IP", new v9j() { // from class: l.ub50
            public final Object call() {
                return wb50.m26315D(true);
            }
        });
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ String m26314C() {
        return "2";
    }

    /* JADX INFO: renamed from: D */
    public static String m26315D(boolean z) {
        try {
            Iterator it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
            while (it.hasNext()) {
                for (InetAddress inetAddress : Collections.list(((NetworkInterface) it.next()).getInetAddresses())) {
                    if (!inetAddress.isLoopbackAddress()) {
                        String hostAddress = inetAddress.getHostAddress();
                        boolean z2 = hostAddress.indexOf(58) < 0;
                        if (z) {
                            if (z2) {
                                return hostAddress;
                            }
                        } else if (!z2) {
                            int iIndexOf = hostAddress.indexOf(37);
                            return iIndexOf < 0 ? hostAddress.toUpperCase() : hostAddress.substring(0, iIndexOf).toUpperCase();
                        }
                    }
                }
            }
            return "";
        } catch (ArrayIndexOutOfBoundsException | NullPointerException | SocketException unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: E */
    public static String m26316E() {
        if (TextUtils.isEmpty(f25076a)) {
            try {
                f25076a = bjp0.getDefaultUserAgent(App.e);
            } catch (Exception e) {
                CrashHelper.c(e);
            }
        }
        return TextUtils.isEmpty(f25076a) ? System.getProperty("http.agent") : f25076a;
    }

    /* JADX INFO: renamed from: F */
    public static String m26317F(String str) {
        f25077b.put("TS", new v9j() { // from class: l.vb50
            public final Object call() {
                return String.valueOf(mqi0.o() / 1000);
            }
        });
        Matcher matcher = Pattern.compile("\\[(.*?)]").matcher(str);
        while (matcher.find()) {
            String strGroup = matcher.group();
            v9j<String> v9jVar = f25077b.get(strGroup.replace("[", "").replace("]", ""));
            if (NullChecker.a(v9jVar)) {
                String str2 = (String) v9jVar.call();
                str = !TextUtils.isEmpty(str2) ? str.replace(strGroup, str2) : str.replace(strGroup, URLEncoder.encode(strGroup));
            } else {
                str = str.replace(strGroup, URLEncoder.encode(strGroup));
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ String m26318x() {
        Location locationQ = qib0.f19778E.q();
        return locationQ != null ? String.format(Locale.US, "%1$.4f,%2$.4f", Double.valueOf(locationQ.x()), Double.valueOf(locationQ.u())) : "";
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ String m26319y() {
        WifiInfo connectionInfo = ((WifiManager) App.e.getSystemService("wifi")).getConnectionInfo();
        if (!NullChecker.a(connectionInfo)) {
            return "";
        }
        String macAddress = connectionInfo.getMacAddress();
        return TextUtils.equals(macAddress, "02:00:00:00:00:00") ? "" : macAddress;
    }
}
