package p153l;

import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.location.Location;
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
public class dk50 extends xi5 {

    /* JADX INFO: renamed from: a */
    public static String f88975a = "";

    /* JADX INFO: renamed from: b */
    public static Map<String, pcj<String>> f88976b;

    static {
        HashMap map = new HashMap();
        f88976b = map;
        map.put("OS", new pcj() { // from class: l.tj50
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dk50.m116214C();
            }
        });
        f88976b.put("IMEI", new pcj() { // from class: l.uj50
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qzd.m178771d();
            }
        });
        f88976b.put("ANDROIDID", new pcj() { // from class: l.vj50
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qzd.m178769b();
            }
        });
        f88976b.put("OAID", new pcj() { // from class: l.wj50
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return hb00.m134333b();
            }
        });
        f88976b.put(Network.MAC, new pcj() { // from class: l.xj50
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dk50.m116219y();
            }
        });
        f88976b.put("TS", new pcj() { // from class: l.yj50
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return String.valueOf(pzi0.m174454o() / 1000);
            }
        });
        f88976b.put("LBS", new pcj() { // from class: l.zj50
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dk50.m116218x();
            }
        });
        f88976b.put("UA", new pcj() { // from class: l.ak50
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dk50.m116216E();
            }
        });
        f88976b.put("IP", new pcj() { // from class: l.bk50
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dk50.m116215D(true);
            }
        });
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ String m116214C() {
        return "2";
    }

    /* JADX INFO: renamed from: D */
    public static String m116215D(boolean z) {
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
    public static String m116216E() {
        if (TextUtils.isEmpty(f88975a)) {
            try {
                f88975a = gsp0.getDefaultUserAgent(App.f16088e);
            } catch (Exception e) {
                CrashHelper.m82479c(e);
            }
        }
        return TextUtils.isEmpty(f88975a) ? System.getProperty("http.agent") : f88975a;
    }

    /* JADX INFO: renamed from: F */
    public static String m116217F(String str) {
        f88976b.put("TS", new pcj() { // from class: l.ck50
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return String.valueOf(pzi0.m174454o() / 1000);
            }
        });
        Matcher matcher = Pattern.compile("\\[(.*?)]").matcher(str);
        while (matcher.find()) {
            String strGroup = matcher.group();
            pcj<String> pcjVar = f88976b.get(strGroup.replace("[", "").replace(Constants.AES_SUFFIX, ""));
            if (NullChecker.m82486a(pcjVar)) {
                String strCall = pcjVar.call();
                str = !TextUtils.isEmpty(strCall) ? str.replace(strGroup, strCall) : str.replace(strGroup, URLEncoder.encode(strGroup));
            } else {
                str = str.replace(strGroup, URLEncoder.encode(strGroup));
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ String m116218x() {
        Location locationM80048q = uqb0.f180370E.m80048q();
        return locationM80048q != null ? String.format(Locale.US, "%1$.4f,%2$.4f", Double.valueOf(locationM80048q.m80016x()), Double.valueOf(locationM80048q.m80014u())) : "";
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ String m116219y() {
        WifiInfo connectionInfo = ((WifiManager) App.f16088e.getSystemService("wifi")).getConnectionInfo();
        if (!NullChecker.m82486a(connectionInfo)) {
            return "";
        }
        String macAddress = connectionInfo.getMacAddress();
        return TextUtils.equals(macAddress, "02:00:00:00:00:00") ? "" : macAddress;
    }
}
