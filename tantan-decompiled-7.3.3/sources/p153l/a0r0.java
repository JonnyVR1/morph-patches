package p153l;

import android.content.Context;
import android.content.pm.ServiceInfo;
import com.xiaomi.push.service.XMJobService;

/* JADX INFO: loaded from: classes2.dex */
public final class a0r0 {

    /* JADX INFO: renamed from: a */
    private static InterfaceC15614a f67742a;

    /* JADX INFO: renamed from: b */
    private static final String f67743b = XMJobService.class.getCanonicalName();

    /* JADX INFO: renamed from: c */
    private static int f67744c = 0;

    /* JADX INFO: renamed from: l.a0r0$a */
    public interface InterfaceC15614a {
        /* JADX INFO: renamed from: a */
        void mo95414a();

        /* JADX INFO: renamed from: a */
        void mo95415a(boolean z);

        /* JADX INFO: renamed from: a */
        boolean mo95416a();
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m95409a() {
        if (f67742a == null) {
            return;
        }
        ouq0.m169393m("[Alarm] stop alarm.");
        f67742a.mo95414a();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0045  */
    /* JADX INFO: renamed from: b */
    public static void m95410b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if ("com.xiaomi.xmsf".equals(applicationContext.getPackageName())) {
            f67742a = new o0r0(applicationContext);
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
                                String str = f67743b;
                                if (str.equals(serviceInfo.name)) {
                                    i2 = 1;
                                } else {
                                    try {
                                        if (str.equals(t5r0.m189419c(applicationContext, serviceInfo.name).getSuperclass().getCanonicalName())) {
                                            i2 = 1;
                                        }
                                    } catch (Exception unused) {
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            if (f67743b.equals(serviceInfo.name) && "android.permission.BIND_JOB_SERVICE".equals(serviceInfo.permission)) {
                                i = 1;
                                break;
                            }
                            i++;
                        } catch (Exception e) {
                            e = e;
                            i = i2;
                            ouq0.m169393m("check service err : " + e.getMessage());
                        }
                    }
                    i = i2;
                    break;
                }
            }
        } catch (Exception e2) {
            e = e2;
        }
        if (i == 0 && t5r0.m189423g(applicationContext)) {
            zzq0.m222278a("Should export service: ", f67743b, " with permission android.permission.BIND_JOB_SERVICE in AndroidManifest.xml file");
        } else {
            f67742a = new o0r0(applicationContext);
        }
    }

    /* JADX INFO: renamed from: c */
    public static synchronized void m95411c(Context context, int i) {
        try {
            int i2 = f67744c;
            if (!"com.xiaomi.xmsf".equals(context.getPackageName())) {
                if (i == 2) {
                    f67744c = 2;
                } else {
                    f67744c = 0;
                }
            }
            int i3 = f67744c;
            if (i2 != i3 && i3 == 2) {
                m95409a();
                f67742a = new p0r0(context);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public static synchronized void m95412d(boolean z) {
        if (f67742a == null) {
            ouq0.m169393m("timer is not initialized");
            return;
        }
        ouq0.m169393m("[Alarm] register alarm. (" + z + ")");
        f67742a.mo95415a(z);
    }

    /* JADX INFO: renamed from: e */
    public static synchronized boolean m95413e() {
        InterfaceC15614a interfaceC15614a = f67742a;
        if (interfaceC15614a == null) {
            return false;
        }
        return interfaceC15614a.mo95416a();
    }
}
