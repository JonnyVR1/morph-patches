package p153l;

import android.text.TextUtils;
import com.immomo.mwc.sdk.C4072c;
import com.immomo.mwc.sdk.MWCEngine;
import com.immomo.mwc.sdk.WebResourcePool;
import com.immomo.mwc.sdk.exception.MWCException;
import com.quickjs.QuickJSException;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public class rre0 {

    /* JADX INFO: renamed from: a */
    private static final Map<String, Boolean> f164568a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    private static final Map<String, C4072c> f164569b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    private static void m182755a(C4072c c4072c, boolean z, ro5 ro5Var) {
        String strM20422e = c4072c.m20422e();
        String strM20426i = c4072c.m20426i();
        AtomicReference atomicReference = new AtomicReference(null);
        if (m182759e(c4072c, z)) {
            f164569b.put(strM20426i, c4072c);
            try {
                try {
                    if (!c4072c.m20434r()) {
                        atomicReference.set(new MWCException(3001, "worker.setup() return a false value, which is not equal to true"));
                    }
                    if (atomicReference.get() != null) {
                        WebResourcePool.m20387g(strM20426i);
                        m182764j(strM20426i);
                    }
                } catch (QuickJSException e) {
                    atomicReference.set(new MWCException(3002, e));
                    if (atomicReference.get() != null) {
                    }
                }
            } catch (Throwable th) {
                if (atomicReference.get() != null) {
                    WebResourcePool.m20387g(strM20426i);
                    m182764j(strM20426i);
                }
                throw th;
            }
        } else {
            atomicReference.set(new MWCException(2002, "service:" + strM20422e + " not exist"));
        }
        MWCEngine.m20360k("ServiceManager", strM20426i, "addWorker::%s @serviceId=%s, @workerId=%s, @available=%s", atomicReference.get() == null ? "success" : "fail", strM20422e, strM20426i, f164569b.keySet());
        MWCException mWCException = (MWCException) atomicReference.get();
        if (atomicReference.get() != null) {
            c4072c = null;
        }
        ro5Var.mo182358a(mWCException, c4072c);
    }

    /* JADX INFO: renamed from: b */
    public static void m182756b(C4072c c4072c, ro5 ro5Var) {
        m182755a(c4072c, false, ro5Var);
    }

    /* JADX INFO: renamed from: c */
    public static void m182757c(C4072c c4072c, ro5 ro5Var) {
        m182755a(c4072c, true, ro5Var);
    }

    /* JADX INFO: renamed from: d */
    private static boolean m182758d(String str) {
        if (!TextUtils.isEmpty(str) && str.startsWith("/")) {
            File file = new File(str);
            if (file.exists() && file.isFile() && file.canRead()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    private static boolean m182759e(C4072c c4072c, boolean z) {
        String strM20422e = c4072c.m20422e();
        String strM20426i = c4072c.m20426i();
        String strM20423f = c4072c.m20423f();
        if (TextUtils.isEmpty(strM20422e) || "0".equals(strM20422e)) {
            return false;
        }
        int iM182763i = m182763i(strM20422e, strM20426i, strM20423f);
        boolean z2 = true;
        if (iM182763i >= 0) {
            return iM182763i == 1;
        }
        boolean zM182761g = m182761g(strM20422e);
        if (zM182761g) {
            return zM182761g;
        }
        try {
            try {
                if (z) {
                    if (!m182758d(strM20423f)) {
                        MWCEngine.m20362m("ServiceManager", strM20426i, "addWorker::createService:unavailable:servicePath @serviceId=%s, @workerId=%s, @servicePath=%s", strM20422e, strM20426i, strM20423f);
                        return zM182761g;
                    }
                    MWCEngine.m20366q().mo20376a(strM20423f);
                    Map<String, Boolean> map = f164568a;
                    map.put(strM20422e, Boolean.TRUE);
                    MWCEngine.m20360k("ServiceManager", strM20426i, "addWorker::createService @serviceId=%s, @workerId=%s, @available=%s", strM20422e, strM20426i, map.keySet());
                    return true;
                }
                String strLoad = MWCEngine.m20372w().load(strM20423f);
                if (TextUtils.isEmpty(strLoad)) {
                    MWCEngine.m20362m("ServiceManager", strM20426i, "addWorker::createService:empty:script:content @serviceId=%s, @workerId=%s, @servicePath=%s", strM20422e, strM20426i, strM20423f);
                    return zM182761g;
                }
                MWCEngine.m20366q().mo20378c(strLoad, strM20423f);
                Map<String, Boolean> map2 = f164568a;
                map2.put(strM20422e, Boolean.TRUE);
                MWCEngine.m20360k("ServiceManager", strM20426i, "addWorker::createService @serviceId=%s, @workerId=%s, @available=%s", strM20422e, strM20426i, map2.keySet());
                return true;
            } catch (Throwable th) {
                th = th;
                MWCEngine.m20362m("ServiceManager", strM20426i, "addWorker::createService:exception @serviceId=%s, @workerId=%s, @exception=%s", strM20422e, strM20426i, th.getMessage());
                return z2;
            }
        } catch (Throwable th2) {
            th = th2;
            z2 = zM182761g;
            MWCEngine.m20362m("ServiceManager", strM20426i, "addWorker::createService:exception @serviceId=%s, @workerId=%s, @exception=%s", strM20422e, strM20426i, th.getMessage());
            return z2;
        }
    }

    /* JADX INFO: renamed from: f */
    public static C4072c m182760f(String str) {
        return f164569b.get(str);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m182761g(String str) {
        Map<String, Boolean> map = f164568a;
        return map.containsKey(str) && map.get(str).booleanValue();
    }

    /* JADX INFO: renamed from: h */
    public static boolean m182762h(String str) {
        Map<String, C4072c> map = f164569b;
        return map.containsKey(str) && map.get(str) != null;
    }

    /* JADX INFO: renamed from: i */
    private static int m182763i(String str, String str2, String str3) {
        if (!tqw.m192365c()) {
            return -1;
        }
        String strM192364b = tqw.m192364b(str);
        if (TextUtils.isEmpty(strM192364b)) {
            return -1;
        }
        try {
            MWCEngine.m20366q().mo20378c(strM192364b, str3);
            Map<String, Boolean> map = f164568a;
            map.put(str, Boolean.TRUE);
            MWCEngine.m20341D("ServiceManager", str2, "[当前在FDT调试模式下运行Service服务] @serviceId=%s, @workerId=%s, @available=%s", str, str2, map.keySet());
            return 1;
        } catch (Throwable th) {
            MWCEngine.m20362m("ServiceManager", str2, "addWorker::createService:exception @serviceId=%s, @workerId=%s, @exception=%s", str, str2, th.getMessage());
            return 0;
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m182764j(String str) {
        Map<String, C4072c> map = f164569b;
        if (map.containsKey(str)) {
            map.remove(str);
            MWCEngine.m20360k("ServiceManager", str, "remove worker @workerId=%s, @available=%s", str, map.keySet());
        }
    }
}
