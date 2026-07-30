package p149l;

import androidx.annotation.NonNull;
import com.cosmos.mdlog.MDLog;
import com.immomo.mmutil.task.C3804c;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public class hzl {

    /* JADX INFO: renamed from: a */
    private static gzl f110208a;

    /* JADX INFO: renamed from: b */
    private static int f110209b;

    /* JADX INFO: renamed from: c */
    private static int f110210c;

    /* JADX INFO: renamed from: d */
    private static long f110211d;

    /* JADX INFO: renamed from: e */
    private static AtomicBoolean f110212e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f */
    private static AtomicBoolean f110213f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: g */
    private static AtomicBoolean f110214g = new AtomicBoolean(false);

    /* JADX INFO: renamed from: h */
    public static int f110215h = 0;

    /* JADX INFO: renamed from: l.hzl$a */
    public class RunnableC17439a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            String[] strArrMo113464c = hzl.m133703g().mo113464c();
            if (strArrMo113464c == null || strArrMo113464c.length == 0) {
                hzl.m133698b();
                hzl.f110214g.set(false);
                hzl.f110215h = -2;
                hzl.f110213f.set(false);
                MDLog.m7395i("MomoIpv6Util", "IPV6Util detect address null, then fail v6Enable:false");
                return;
            }
            String str = strArrMo113464c[new Random().nextInt(strArrMo113464c.length)];
            MDLog.m7396i("MomoIpv6Util", "IPV6Util detect url: %s", str);
            hzl.m133698b();
            try {
                try {
                    Socket socket = new Socket();
                    try {
                        cll cllVarM107501r = cll.m107501r(str);
                        Objects.requireNonNull(cllVarM107501r);
                        socket.connect(new InetSocketAddress(cllVarM107501r.m107522m(), 80), 5000);
                        hzl.f110214g.set(true);
                        hzl.f110215h = 100;
                        MDLog.m7395i("MomoIpv6Util", "IPV6Util detect success v6Enable:true");
                        int unused = hzl.f110210c = 0;
                        hzl.m133698b();
                        socket.close();
                        MDLog.m7395i("MomoIpv6Util", "IPV6Util detect end");
                        hzl.f110213f.set(false);
                    } catch (Throwable th) {
                        try {
                            socket.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    hzl.m133698b();
                    MDLog.printErrStackTrace("MOMOHttp", e);
                    hzl.f110214g.set(false);
                    hzl.f110215h = -2;
                    MDLog.m7396i("MomoIpv6Util", "IPV6Util detect exception fail v6Enable:false  exception: %s", e.getMessage());
                    MDLog.m7395i("MomoIpv6Util", "IPV6Util detect end");
                    hzl.f110213f.set(false);
                }
            } catch (Throwable th3) {
                MDLog.m7395i("MomoIpv6Util", "IPV6Util detect end");
                hzl.f110213f.set(false);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ wsl m133698b() {
        return null;
    }

    /* JADX INFO: renamed from: f */
    private static void m133702f() {
        f110211d = System.currentTimeMillis();
        f110213f.set(true);
        MDLog.m7395i("MomoIpv6Util", "IPV6Util detect begin");
        C3804c.m18444d(2, new RunnableC17439a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    /* JADX INFO: renamed from: g */
    public static gzl m133703g() {
        if (f110208a == null) {
            f110208a = new dsd();
        }
        return f110208a;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m133704h(String str) {
        return Pattern.compile("^\\s*((([0-9A-Fa-f]{1,4}:){7}([0-9A-Fa-f]{1,4}|:))|(([0-9A-Fa-f]{1,4}:){6}(:[0-9A-Fa-f]{1,4}|((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3})|:))|(([0-9A-Fa-f]{1,4}:){5}(((:[0-9A-Fa-f]{1,4}){1,2})|:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3})|:))|(([0-9A-Fa-f]{1,4}:){4}(((:[0-9A-Fa-f]{1,4}){1,3})|((:[0-9A-Fa-f]{1,4})?:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|(([0-9A-Fa-f]{1,4}:){3}(((:[0-9A-Fa-f]{1,4}){1,4})|((:[0-9A-Fa-f]{1,4}){0,2}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|(([0-9A-Fa-f]{1,4}:){2}(((:[0-9A-Fa-f]{1,4}){1,5})|((:[0-9A-Fa-f]{1,4}){0,3}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|(([0-9A-Fa-f]{1,4}:)(((:[0-9A-Fa-f]{1,4}){1,6})|((:[0-9A-Fa-f]{1,4}){0,4}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|(:(((:[0-9A-Fa-f]{1,4}){1,7})|((:[0-9A-Fa-f]{1,4}){0,5}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:)))(%.+)?\\s*$").matcher(str).matches();
    }

    /* JADX INFO: renamed from: i */
    public static synchronized void m133705i(String str) {
        try {
            if (f110212e.get()) {
                if (m133704h(str)) {
                    int i = f110210c + 1;
                    f110210c = i;
                    MDLog.m7396i("MomoIpv6Util", "IPV6Util ipv6 request failed   failCount:%d", Integer.valueOf(i));
                    if (f110210c >= m133703g().mo113465d()) {
                        MDLog.m7395i("MomoIpv6Util", "IPV6Util ipv6 request failed exceeding max limit, downgrade");
                        f110214g.set(false);
                        f110215h = -2;
                        f110209b = 0;
                    }
                } else {
                    int i2 = f110209b + 1;
                    f110209b = i2;
                    MDLog.m7396i("MomoIpv6Util", "IPV6Util ipv4 request failed count:%d", Integer.valueOf(i2));
                    if (f110209b >= m133703g().mo113462a()) {
                        MDLog.m7395i("MomoIpv6Util", "IPV6Util ipv4 request failed exceeding max limit, reset");
                        m133706j();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: j */
    private static void m133706j() {
        f110215h = 0;
        MDLog.m7395i("MomoIpv6Util", "IPV6Util reset params");
        f110214g.set(false);
        f110211d = 0L;
        f110209b = 0;
        f110210c = 0;
    }

    /* JADX INFO: renamed from: k */
    public static synchronized boolean m133707k() {
        if (!f110212e.get()) {
            MDLog.m7395i("MomoIpv6Util", "IPV6Util toggle false, useV6:false");
            return false;
        }
        if (f110214g.get()) {
            MDLog.m7395i("MomoIpv6Util", "IPV6Util Enable true, useV6:true");
            return true;
        }
        if (f110213f.get()) {
            MDLog.m7395i("MomoIpv6Util", "IPV6Util Detecting, useV6:false");
            return false;
        }
        if (Math.abs(System.currentTimeMillis() - f110211d) < m133703g().mo113463b()) {
            MDLog.m7395i("MomoIpv6Util", "IPV6Util in failback duration, useV6:false");
            return false;
        }
        MDLog.m7395i("MomoIpv6Util", "IPV6Util in exceeding failback duration, begin detect");
        f110215h = -3;
        m133702f();
        return false;
    }
}
