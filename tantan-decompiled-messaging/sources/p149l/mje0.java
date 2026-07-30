package p149l;

import android.text.TextUtils;
import com.immomo.mwc.sdk.C3929c;
import com.immomo.mwc.sdk.MWCEngine;
import com.immomo.mwc.sdk.WebResourcePool;
import com.immomo.mwc.sdk.exception.MWCException;
import com.quickjs.QuickJSException;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public class mje0 {

    /* JADX INFO: renamed from: a */
    private static final Map<String, Boolean> f134121a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    private static final Map<String, C3929c> f134122b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    private static void m154789a(C3929c c3929c, boolean z, nn5 nn5Var) {
        String strM19442e = c3929c.m19442e();
        String strM19446i = c3929c.m19446i();
        AtomicReference atomicReference = new AtomicReference(null);
        if (m154793e(c3929c, z)) {
            f134122b.put(strM19446i, c3929c);
            try {
                try {
                    if (!c3929c.m19454r()) {
                        atomicReference.set(new MWCException(3001, "worker.setup() return a false value, which is not equal to true"));
                    }
                    if (atomicReference.get() != null) {
                        WebResourcePool.m19407g(strM19446i);
                        m154798j(strM19446i);
                    }
                } catch (QuickJSException e) {
                    atomicReference.set(new MWCException(3002, e));
                    if (atomicReference.get() != null) {
                    }
                }
            } catch (Throwable th) {
                if (atomicReference.get() != null) {
                    WebResourcePool.m19407g(strM19446i);
                    m154798j(strM19446i);
                }
                throw th;
            }
        } else {
            atomicReference.set(new MWCException(2002, "service:" + strM19442e + " not exist"));
        }
        MWCEngine.m19380k("ServiceManager", strM19446i, "addWorker::%s @serviceId=%s, @workerId=%s, @available=%s", atomicReference.get() == null ? "success" : "fail", strM19442e, strM19446i, f134122b.keySet());
        MWCException mWCException = (MWCException) atomicReference.get();
        if (atomicReference.get() != null) {
            c3929c = null;
        }
        nn5Var.mo97998a(mWCException, c3929c);
    }

    /* JADX INFO: renamed from: b */
    public static void m154790b(C3929c c3929c, nn5 nn5Var) {
        m154789a(c3929c, false, nn5Var);
    }

    /* JADX INFO: renamed from: c */
    public static void m154791c(C3929c c3929c, nn5 nn5Var) {
        m154789a(c3929c, true, nn5Var);
    }

    /* JADX INFO: renamed from: d */
    private static boolean m154792d(String str) {
        if (!TextUtils.isEmpty(str) && str.startsWith("/")) {
            File file = new File(str);
            if (file.exists() && file.isFile() && file.canRead()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    private static boolean m154793e(C3929c c3929c, boolean z) {
        String strM19442e = c3929c.m19442e();
        String strM19446i = c3929c.m19446i();
        String strM19443f = c3929c.m19443f();
        if (TextUtils.isEmpty(strM19442e) || "0".equals(strM19442e)) {
            return false;
        }
        int iM154797i = m154797i(strM19442e, strM19446i, strM19443f);
        boolean z2 = true;
        if (iM154797i >= 0) {
            return iM154797i == 1;
        }
        boolean zM154795g = m154795g(strM19442e);
        if (zM154795g) {
            return zM154795g;
        }
        try {
            try {
                if (z) {
                    if (!m154792d(strM19443f)) {
                        MWCEngine.m19382m("ServiceManager", strM19446i, "addWorker::createService:unavailable:servicePath @serviceId=%s, @workerId=%s, @servicePath=%s", strM19442e, strM19446i, strM19443f);
                        return zM154795g;
                    }
                    MWCEngine.m19386q().mo19396a(strM19443f);
                    Map<String, Boolean> map = f134121a;
                    map.put(strM19442e, Boolean.TRUE);
                    MWCEngine.m19380k("ServiceManager", strM19446i, "addWorker::createService @serviceId=%s, @workerId=%s, @available=%s", strM19442e, strM19446i, map.keySet());
                    return true;
                }
                String strLoad = MWCEngine.m19392w().load(strM19443f);
                if (TextUtils.isEmpty(strLoad)) {
                    MWCEngine.m19382m("ServiceManager", strM19446i, "addWorker::createService:empty:script:content @serviceId=%s, @workerId=%s, @servicePath=%s", strM19442e, strM19446i, strM19443f);
                    return zM154795g;
                }
                MWCEngine.m19386q().mo19398c(strLoad, strM19443f);
                Map<String, Boolean> map2 = f134121a;
                map2.put(strM19442e, Boolean.TRUE);
                MWCEngine.m19380k("ServiceManager", strM19446i, "addWorker::createService @serviceId=%s, @workerId=%s, @available=%s", strM19442e, strM19446i, map2.keySet());
                return true;
            } catch (Throwable th) {
                th = th;
                MWCEngine.m19382m("ServiceManager", strM19446i, "addWorker::createService:exception @serviceId=%s, @workerId=%s, @exception=%s", strM19442e, strM19446i, th.getMessage());
                return z2;
            }
        } catch (Throwable th2) {
            th = th2;
            z2 = zM154795g;
            MWCEngine.m19382m("ServiceManager", strM19446i, "addWorker::createService:exception @serviceId=%s, @workerId=%s, @exception=%s", strM19442e, strM19446i, th.getMessage());
            return z2;
        }
    }

    /* JADX INFO: renamed from: f */
    public static C3929c m154794f(String str) {
        return f134122b.get(str);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m154795g(String str) {
        Map<String, Boolean> map = f134121a;
        return map.containsKey(str) && map.get(str).booleanValue();
    }

    /* JADX INFO: renamed from: h */
    public static boolean m154796h(String str) {
        Map<String, C3929c> map = f134122b;
        return map.containsKey(str) && map.get(str) != null;
    }

    /* JADX INFO: renamed from: i */
    private static int m154797i(String str, String str2, String str3) {
        if (!unw.m194528c()) {
            return -1;
        }
        String strM194527b = unw.m194527b(str);
        if (TextUtils.isEmpty(strM194527b)) {
            return -1;
        }
        try {
            MWCEngine.m19386q().mo19398c(strM194527b, str3);
            Map<String, Boolean> map = f134121a;
            map.put(str, Boolean.TRUE);
            MWCEngine.m19361D("ServiceManager", str2, "[当前在FDT调试模式下运行Service服务] @serviceId=%s, @workerId=%s, @available=%s", str, str2, map.keySet());
            return 1;
        } catch (Throwable th) {
            MWCEngine.m19382m("ServiceManager", str2, "addWorker::createService:exception @serviceId=%s, @workerId=%s, @exception=%s", str, str2, th.getMessage());
            return 0;
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m154798j(String str) {
        Map<String, C3929c> map = f134122b;
        if (map.containsKey(str)) {
            map.remove(str);
            MWCEngine.m19380k("ServiceManager", str, "remove worker @workerId=%s, @available=%s", str, map.keySet());
        }
    }
}
