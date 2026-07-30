package p149l;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.mmkv.MMKV;
import com.xiaomi.push.C14744gj;
import com.xiaomi.push.EnumC14732ed;
import com.xiaomi.push.EnumC14740gf;
import com.xiaomi.push.EnumC14745gk;
import com.xiaomi.push.EnumC14750gp;
import com.xiaomi.push.service.C14837ah;
import com.xiaomi.push.service.C14855az;
import com.xiaomi.push.service.C14857ba;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class mqq0 {

    /* JADX INFO: renamed from: a */
    private static InterfaceC18538a f135287a;

    /* JADX INFO: renamed from: b */
    private static Map<String, EnumC14750gp> f135288b;

    /* JADX INFO: renamed from: l.mqq0$a */
    public interface InterfaceC18538a {
        /* JADX INFO: renamed from: a */
        void mo85271a(Context context, C14744gj c14744gj);
    }

    /* JADX INFO: renamed from: a */
    public static int m155978a(int i) {
        if (i > 0) {
            return i + 1000;
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public static int m155979b(Enum r1) {
        if (r1 == null) {
            return -1;
        }
        if (r1 instanceof EnumC14740gf) {
            return r1.ordinal() + 1001;
        }
        if (r1 instanceof EnumC14750gp) {
            return r1.ordinal() + 2001;
        }
        if (r1 instanceof EnumC14732ed) {
            return r1.ordinal() + 3001;
        }
        return -1;
    }

    /* JADX INFO: renamed from: c */
    public static C14744gj m155980c(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C14744gj c14744gj = new C14744gj();
        c14744gj.m85632d("category_client_report_data");
        c14744gj.m85613a("push_sdk_channel");
        c14744gj.m85612a(1L);
        c14744gj.m85624b(str);
        c14744gj.m85615a(true);
        c14744gj.m85623b(System.currentTimeMillis());
        c14744gj.m85640g(context.getPackageName());
        c14744gj.m85635e("com.xiaomi.xmsf");
        c14744gj.m85638f(C14855az.m86599a());
        c14744gj.m85628c("quality_support");
        return c14744gj;
    }

    /* JADX INFO: renamed from: d */
    public static EnumC14750gp m155981d(String str) {
        if (f135288b == null) {
            synchronized (EnumC14750gp.class) {
                try {
                    if (f135288b == null) {
                        f135288b = new HashMap();
                        for (EnumC14750gp enumC14750gp : EnumC14750gp.values()) {
                            f135288b.put(enumC14750gp.f62110a.toLowerCase(), enumC14750gp);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        EnumC14750gp enumC14750gp2 = f135288b.get(str.toLowerCase());
        return enumC14750gp2 != null ? enumC14750gp2 : EnumC14750gp.Invalid;
    }

    /* JADX INFO: renamed from: e */
    public static String m155982e(int i) {
        if (i == 1000) {
            return "E100000";
        }
        if (i == 3000) {
            return "E100002";
        }
        if (i == 2000) {
            return "E100001";
        }
        return i == 6000 ? "E100003" : "";
    }

    /* JADX INFO: renamed from: f */
    public static qu5 m155983f(Context context) {
        boolean zM86489a = C14837ah.m86477a(context).m86489a(EnumC14745gk.PerfUploadSwitch.m85646a(), false);
        boolean zM86489a2 = C14837ah.m86477a(context).m86489a(EnumC14745gk.EventUploadNewSwitch.m85646a(), false);
        return qu5.m176518b().m176536l(zM86489a2).m176535k(C14837ah.m86477a(context).m86481a(EnumC14745gk.EventUploadFrequency.m85646a(), MMKV.ExpireInDay)).m176539o(zM86489a).m176538n(C14837ah.m86477a(context).m86481a(EnumC14745gk.PerfUploadFrequency.m85646a(), MMKV.ExpireInDay)).m176532h(context);
    }

    /* JADX INFO: renamed from: g */
    public static t2f m155984g(Context context, String str, String str2, int i, long j, String str3) {
        t2f t2fVarM155985h = m155985h(str);
        t2fVarM155985h.f167465h = str2;
        t2fVarM155985h.f167466i = i;
        t2fVarM155985h.f167467j = j;
        t2fVarM155985h.f167468k = str3;
        return t2fVarM155985h;
    }

    /* JADX INFO: renamed from: h */
    public static t2f m155985h(String str) {
        t2f t2fVar = new t2f();
        t2fVar.f164730a = 1000;
        t2fVar.f164732c = 1001;
        t2fVar.f164731b = str;
        return t2fVar;
    }

    /* JADX INFO: renamed from: i */
    public static bj60 m155986i() {
        bj60 bj60Var = new bj60();
        bj60Var.f164730a = 1000;
        bj60Var.f164732c = 1000;
        bj60Var.f164731b = "P100000";
        return bj60Var;
    }

    /* JADX INFO: renamed from: j */
    public static bj60 m155987j(Context context, int i, long j, long j2) {
        bj60 bj60VarM155986i = m155986i();
        bj60VarM155986i.f75885h = i;
        bj60VarM155986i.f75886i = j;
        bj60VarM155986i.f75887j = j2;
        return bj60VarM155986i;
    }

    /* JADX INFO: renamed from: k */
    public static void m155988k(Context context) {
        f95.m120077d(context, m155983f(context));
    }

    /* JADX INFO: renamed from: l */
    private static void m155989l(Context context, C14744gj c14744gj) {
        if (m155993p(context.getApplicationContext())) {
            C14857ba.m86611a(context.getApplicationContext(), c14744gj);
            return;
        }
        InterfaceC18538a interfaceC18538a = f135287a;
        if (interfaceC18538a != null) {
            interfaceC18538a.mo85271a(context, c14744gj);
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m155990m(Context context, List<String> list) {
        if (list == null) {
            return;
        }
        try {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                C14744gj c14744gjM155980c = m155980c(context, it.next());
                if (!C14855az.m86602a(c14744gjM155980c, false)) {
                    m155989l(context, c14744gjM155980c);
                }
            }
        } catch (Throwable th) {
            ilq0.m137025B(th.getMessage());
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m155991n(Context context, qu5 qu5Var) {
        f95.m120074a(context, qu5Var, new kqq0(context), new lqq0(context));
    }

    /* JADX INFO: renamed from: o */
    public static void m155992o(InterfaceC18538a interfaceC18538a) {
        f135287a = interfaceC18538a;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m155993p(Context context) {
        return (context == null || TextUtils.isEmpty(context.getPackageName()) || !"com.xiaomi.xmsf".equals(context.getPackageName())) ? false : true;
    }
}
