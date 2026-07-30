package p153l;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.mmkv.MMKV;
import com.xiaomi.push.C14892gj;
import com.xiaomi.push.EnumC14880ed;
import com.xiaomi.push.EnumC14888gf;
import com.xiaomi.push.EnumC14893gk;
import com.xiaomi.push.EnumC14898gp;
import com.xiaomi.push.service.C14985ah;
import com.xiaomi.push.service.C15003az;
import com.xiaomi.push.service.C15005ba;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class szq0 {

    /* JADX INFO: renamed from: a */
    private static InterfaceC20197a f171414a;

    /* JADX INFO: renamed from: b */
    private static Map<String, EnumC14898gp> f171415b;

    /* JADX INFO: renamed from: l.szq0$a */
    public interface InterfaceC20197a {
        /* JADX INFO: renamed from: a */
        void mo86442a(Context context, C14892gj c14892gj);
    }

    /* JADX INFO: renamed from: a */
    public static int m188664a(int i) {
        if (i > 0) {
            return i + 1000;
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public static int m188665b(Enum r1) {
        if (r1 == null) {
            return -1;
        }
        if (r1 instanceof EnumC14888gf) {
            return r1.ordinal() + 1001;
        }
        if (r1 instanceof EnumC14898gp) {
            return r1.ordinal() + 2001;
        }
        if (r1 instanceof EnumC14880ed) {
            return r1.ordinal() + 3001;
        }
        return -1;
    }

    /* JADX INFO: renamed from: c */
    public static C14892gj m188666c(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C14892gj c14892gj = new C14892gj();
        c14892gj.m86803d("category_client_report_data");
        c14892gj.m86784a("push_sdk_channel");
        c14892gj.m86783a(1L);
        c14892gj.m86795b(str);
        c14892gj.m86786a(true);
        c14892gj.m86794b(System.currentTimeMillis());
        c14892gj.m86811g(context.getPackageName());
        c14892gj.m86806e("com.xiaomi.xmsf");
        c14892gj.m86809f(C15003az.m87770a());
        c14892gj.m86799c("quality_support");
        return c14892gj;
    }

    /* JADX INFO: renamed from: d */
    public static EnumC14898gp m188667d(String str) {
        if (f171415b == null) {
            synchronized (EnumC14898gp.class) {
                try {
                    if (f171415b == null) {
                        f171415b = new HashMap();
                        for (EnumC14898gp enumC14898gp : EnumC14898gp.values()) {
                            f171415b.put(enumC14898gp.f62957a.toLowerCase(), enumC14898gp);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        EnumC14898gp enumC14898gp2 = f171415b.get(str.toLowerCase());
        return enumC14898gp2 != null ? enumC14898gp2 : EnumC14898gp.Invalid;
    }

    /* JADX INFO: renamed from: e */
    public static String m188668e(int i) {
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
    public static uv5 m188669f(Context context) {
        boolean zM87660a = C14985ah.m87648a(context).m87660a(EnumC14893gk.PerfUploadSwitch.m86817a(), false);
        boolean zM87660a2 = C14985ah.m87648a(context).m87660a(EnumC14893gk.EventUploadNewSwitch.m86817a(), false);
        return uv5.m198241b().m198259l(zM87660a2).m198258k(C14985ah.m87648a(context).m87652a(EnumC14893gk.EventUploadFrequency.m86817a(), MMKV.ExpireInDay)).m198262o(zM87660a).m198261n(C14985ah.m87648a(context).m87652a(EnumC14893gk.PerfUploadFrequency.m86817a(), MMKV.ExpireInDay)).m198255h(context);
    }

    /* JADX INFO: renamed from: g */
    public static y3f m188670g(Context context, String str, String str2, int i, long j, String str3) {
        y3f y3fVarM188671h = m188671h(str);
        y3fVarM188671h.f197356h = str2;
        y3fVarM188671h.f197357i = i;
        y3fVarM188671h.f197358j = j;
        y3fVarM188671h.f197359k = str3;
        return y3fVarM188671h;
    }

    /* JADX INFO: renamed from: h */
    public static y3f m188671h(String str) {
        y3f y3fVar = new y3f();
        y3fVar.f195947a = 1000;
        y3fVar.f195949c = 1001;
        y3fVar.f195948b = str;
        return y3fVar;
    }

    /* JADX INFO: renamed from: i */
    public static gr60 m188672i() {
        gr60 gr60Var = new gr60();
        gr60Var.f195947a = 1000;
        gr60Var.f195949c = 1000;
        gr60Var.f195948b = "P100000";
        return gr60Var;
    }

    /* JADX INFO: renamed from: j */
    public static gr60 m188673j(Context context, int i, long j, long j2) {
        gr60 gr60VarM188672i = m188672i();
        gr60VarM188672i.f106008h = i;
        gr60VarM188672i.f106009i = j;
        gr60VarM188672i.f106010j = j2;
        return gr60VarM188672i;
    }

    /* JADX INFO: renamed from: k */
    public static void m188674k(Context context) {
        ga5.m129690d(context, m188669f(context));
    }

    /* JADX INFO: renamed from: l */
    private static void m188675l(Context context, C14892gj c14892gj) {
        if (m188679p(context.getApplicationContext())) {
            C15005ba.m87782a(context.getApplicationContext(), c14892gj);
            return;
        }
        InterfaceC20197a interfaceC20197a = f171414a;
        if (interfaceC20197a != null) {
            interfaceC20197a.mo86442a(context, c14892gj);
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m188676m(Context context, List<String> list) {
        if (list == null) {
            return;
        }
        try {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                C14892gj c14892gjM188666c = m188666c(context, it.next());
                if (!C15003az.m87773a(c14892gjM188666c, false)) {
                    m188675l(context, c14892gjM188666c);
                }
            }
        } catch (Throwable th) {
            ouq0.m169378B(th.getMessage());
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m188677n(Context context, uv5 uv5Var) {
        ga5.m129687a(context, uv5Var, new qzq0(context), new rzq0(context));
    }

    /* JADX INFO: renamed from: o */
    public static void m188678o(InterfaceC20197a interfaceC20197a) {
        f171414a = interfaceC20197a;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m188679p(Context context) {
        return (context == null || TextUtils.isEmpty(context.getPackageName()) || !"com.xiaomi.xmsf".equals(context.getPackageName())) ? false : true;
    }
}
