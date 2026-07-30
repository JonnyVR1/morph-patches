package p149l;

import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.location.Location;
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

/* JADX INFO: loaded from: classes9.dex */
public class wb50 extends xh5 {

    /* JADX INFO: renamed from: a */
    public static String f185556a = "";

    /* JADX INFO: renamed from: b */
    public static Map<String, v9j<String>> f185557b;

    static {
        HashMap map = new HashMap();
        f185557b = map;
        map.put("OS", new v9j() { // from class: l.mb50
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return wb50.m202525C();
            }
        });
        f185557b.put("IMEI", new v9j() { // from class: l.nb50
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return dyd.m114058d();
            }
        });
        f185557b.put("ANDROIDID", new v9j() { // from class: l.ob50
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return dyd.m114056b();
            }
        });
        f185557b.put("OAID", new v9j() { // from class: l.pb50
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return k200.m144241b();
            }
        });
        f185557b.put(Network.MAC, new v9j() { // from class: l.qb50
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return wb50.m202530y();
            }
        });
        f185557b.put("TS", new v9j() { // from class: l.rb50
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return String.valueOf(mqi0.m155944o() / 1000);
            }
        });
        f185557b.put("LBS", new v9j() { // from class: l.sb50
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return wb50.m202529x();
            }
        });
        f185557b.put("UA", new v9j() { // from class: l.tb50
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return wb50.m202527E();
            }
        });
        f185557b.put("IP", new v9j() { // from class: l.ub50
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return wb50.m202526D(true);
            }
        });
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ String m202525C() {
        return "2";
    }

    /* JADX INFO: renamed from: D */
    public static String m202526D(boolean z) {
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
    public static String m202527E() {
        if (TextUtils.isEmpty(f185556a)) {
            try {
                f185556a = bjp0.getDefaultUserAgent(App.f15369e);
            } catch (Exception e) {
                CrashHelper.m81296c(e);
            }
        }
        return TextUtils.isEmpty(f185556a) ? System.getProperty("http.agent") : f185556a;
    }

    /* JADX INFO: renamed from: F */
    public static String m202528F(String str) {
        f185557b.put("TS", new v9j() { // from class: l.vb50
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return String.valueOf(mqi0.m155944o() / 1000);
            }
        });
        Matcher matcher = Pattern.compile("\\[(.*?)]").matcher(str);
        while (matcher.find()) {
            String strGroup = matcher.group();
            v9j<String> v9jVar = f185557b.get(strGroup.replace("[", "").replace(Constants.AES_SUFFIX, ""));
            if (NullChecker.m81303a(v9jVar)) {
                String strCall = v9jVar.call();
                str = !TextUtils.isEmpty(strCall) ? str.replace(strGroup, strCall) : str.replace(strGroup, URLEncoder.encode(strGroup));
            } else {
                str = str.replace(strGroup, URLEncoder.encode(strGroup));
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ String m202529x() {
        Location locationM78865q = qib0.f154687E.m78865q();
        return locationM78865q != null ? String.format(Locale.US, "%1$.4f,%2$.4f", Double.valueOf(locationM78865q.m78833x()), Double.valueOf(locationM78865q.m78831u())) : "";
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ String m202530y() {
        WifiInfo connectionInfo = ((WifiManager) App.f15369e.getSystemService("wifi")).getConnectionInfo();
        if (!NullChecker.m81303a(connectionInfo)) {
            return "";
        }
        String macAddress = connectionInfo.getMacAddress();
        return TextUtils.equals(macAddress, "02:00:00:00:00:00") ? "" : macAddress;
    }
}
