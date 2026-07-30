package p149l;

import android.content.Context;
import android.content.pm.ServiceInfo;
import com.xiaomi.push.service.XMJobService;

/* JADX INFO: loaded from: classes2.dex */
public final class uqq0 {

    /* JADX INFO: renamed from: a */
    private static InterfaceC20487a f177767a;

    /* JADX INFO: renamed from: b */
    private static final String f177768b = XMJobService.class.getCanonicalName();

    /* JADX INFO: renamed from: c */
    private static int f177769c = 0;

    /* JADX INFO: renamed from: l.uqq0$a */
    public interface InterfaceC20487a {
        /* JADX INFO: renamed from: a */
        void mo137911a();

        /* JADX INFO: renamed from: a */
        void mo137912a(boolean z);

        /* JADX INFO: renamed from: a */
        boolean mo137913a();
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m194994a() {
        if (f177767a == null) {
            return;
        }
        ilq0.m137040m("[Alarm] stop alarm.");
        f177767a.mo137911a();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0045  */
    /* JADX INFO: renamed from: b */
    public static void m194995b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if ("com.xiaomi.xmsf".equals(applicationContext.getPackageName())) {
            f177767a = new irq0(applicationContext);
            return;
        }
        int i = 0;
        try {
            ServiceInfo[] serviceInfoArr = applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 4).services;
            if (serviceInfoArr != null) {
                int length = serviceInfoArr.length;
                int i2 = 0;
                while (true) {
                    if (i < length) {
                        try {
                            ServiceInfo serviceInfo = serviceInfoArr[i];
                            if ("android.permission.BIND_JOB_SERVICE".equals(serviceInfo.permission)) {
                                String str = f177768b;
                                if (str.equals(serviceInfo.name)) {
                                    i2 = 1;
                                } else {
                                    try {
                                        if (str.equals(nwq0.m161880c(applicationContext, serviceInfo.name).getSuperclass().getCanonicalName())) {
                                            i2 = 1;
                                        }
                                    } catch (Exception unused) {
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            if (f177768b.equals(serviceInfo.name) && "android.permission.BIND_JOB_SERVICE".equals(serviceInfo.permission)) {
                                i = 1;
                                break;
                            }
                            i++;
                        } catch (Exception e) {
                            e = e;
                            i = i2;
                            ilq0.m137040m("check service err : " + e.getMessage());
                        }
                    }
                    i = i2;
                    break;
                }
            }
        } catch (Exception e2) {
            e = e2;
        }
        if (i == 0 && nwq0.m161884g(applicationContext)) {
            tqq0.m190155a("Should export service: ", f177768b, " with permission android.permission.BIND_JOB_SERVICE in AndroidManifest.xml file");
        } else {
            f177767a = new irq0(applicationContext);
        }
    }

    /* JADX INFO: renamed from: c */
    public static synchronized void m194996c(Context context, int i) {
        try {
            int i2 = f177769c;
            if (!"com.xiaomi.xmsf".equals(context.getPackageName())) {
                if (i == 2) {
                    f177769c = 2;
                } else {
                    f177769c = 0;
                }
            }
            int i3 = f177769c;
            if (i2 != i3 && i3 == 2) {
                m194994a();
                f177767a = new jrq0(context);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public static synchronized void m194997d(boolean z) {
        if (f177767a == null) {
            ilq0.m137040m("timer is not initialized");
            return;
        }
        ilq0.m137040m("[Alarm] register alarm. (" + z + ")");
        f177767a.mo137912a(z);
    }

    /* JADX INFO: renamed from: e */
    public static synchronized boolean m194998e() {
        InterfaceC20487a interfaceC20487a = f177767a;
        if (interfaceC20487a == null) {
            return false;
        }
        return interfaceC20487a.mo137913a();
    }
}
