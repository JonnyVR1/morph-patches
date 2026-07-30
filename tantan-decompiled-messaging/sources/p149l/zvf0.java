package p149l;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantanapp.foxstatistics.DefaultEnvironment;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class zvf0 {

    /* JADX INFO: renamed from: a */
    public static Context f204999a = null;

    /* JADX INFO: renamed from: b */
    public static boolean f205000b = false;

    /* JADX INFO: renamed from: c */
    public static boolean f205001c = true;

    /* JADX INFO: renamed from: d */
    public static tsl f205002d;

    /* JADX INFO: renamed from: l.zvf0$a */
    public class C21786a extends wj2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f205003a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f205004b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f205005c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f205006d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ boolean f205007e;

        public C21786a(String str, String str2, String str3, String str4, boolean z) {
            this.f205003a = str;
            this.f205004b = str2;
            this.f205005c = str3;
            this.f205006d = str4;
            this.f205007e = z;
        }

        @Override // p149l.wj2
        /* JADX INFO: renamed from: D */
        public String mo203365D() {
            return "";
        }

        @Override // p149l.h3m
        /* JADX INFO: renamed from: a */
        public String mo129174a() {
            return this.f205003a;
        }

        @Override // p149l.h3m
        /* JADX INFO: renamed from: b */
        public String mo129175b() {
            return this.f205004b;
        }

        @Override // p149l.h3m
        /* JADX INFO: renamed from: c */
        public String mo129176c() {
            return this.f205005c;
        }

        @Override // p149l.wj2
        /* JADX INFO: renamed from: h */
        public String mo203372h() {
            return this.f205006d;
        }

        @Override // p149l.wj2
        /* JADX INFO: renamed from: l */
        public boolean mo203376l() {
            return this.f205007e;
        }

        @Override // p149l.wj2
        /* JADX INFO: renamed from: q */
        public Object mo203381q() {
            return null;
        }
    }

    /* JADX INFO: renamed from: l.zvf0$b */
    public interface InterfaceC21787b {
        void init();
    }

    /* JADX INFO: renamed from: A */
    public static void m220368A(String str, String str2, j760... j760VarArr) {
        m220404z(str, str2, m220380b(j760VarArr));
    }

    /* JADX INFO: renamed from: B */
    public static void m220369B(String str, String str2, j760... j760VarArr) {
        dwf0.m113869f().m113881m(EventNameEnum.SYS_CHECK, str, str2, m220380b(j760VarArr));
    }

    /* JADX INFO: renamed from: C */
    public static void m220370C(String str) {
        dwf0.m113869f().m113884p(str);
    }

    /* JADX INFO: renamed from: D */
    public static void m220371D(String str, String str2, j760... j760VarArr) {
        dwf0.m113869f().m113881m(EventNameEnum.USER_BEHAVIOR_COMPLEMENT, str, str2, m220380b(j760VarArr));
    }

    /* JADX INFO: renamed from: E */
    public static void m220372E(tsl tslVar) {
        f205002d = tslVar;
    }

    /* JADX INFO: renamed from: F */
    public static void m220373F(cwf0.InterfaceC16263b interfaceC16263b) {
        dwf0.m113869f().m113885q(interfaceC16263b);
    }

    /* JADX INFO: renamed from: G */
    public static void m220374G(bwf0 bwf0Var) {
        dwf0.m113869f().m113886r(bwf0Var);
    }

    /* JADX INFO: renamed from: H */
    public static void m220375H(String str, Object obj) {
        if (m220383e() == null) {
            return;
        }
        dwf0.m113869f().m113887s(str, obj);
    }

    /* JADX INFO: renamed from: I */
    public static void m220376I(HashMap<String, Object> map) {
        if (m220383e() == null) {
            return;
        }
        DefaultEnvironment.m81324c(m220383e()).m81328g(map);
    }

    /* JADX INFO: renamed from: J */
    public static void m220377J() {
        if (m220383e() == null) {
            return;
        }
        DefaultEnvironment.m81324c(f204999a).m81331j();
    }

    /* JADX INFO: renamed from: K */
    public static void m220378K(wj2 wj2Var) {
        if (m220383e() == null) {
            return;
        }
        dwf0.m113869f().m113888t(wj2Var);
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m220379a(Map<String, Object> map) {
        JSONObject jSONObject = null;
        if (map != null) {
            try {
                if (map.keySet().size() > 0) {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        for (Map.Entry<String, Object> entry : map.entrySet()) {
                            jSONObject2.put(entry.getKey(), entry.getValue());
                        }
                        return jSONObject2;
                    } catch (Exception e) {
                        e = e;
                        jSONObject = jSONObject2;
                        sm80.m184942b(e);
                        return jSONObject;
                    }
                }
            } catch (Exception e2) {
                e = e2;
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static JSONObject m220380b(j760[] j760VarArr) {
        JSONObject jSONObject = null;
        if (j760VarArr != null && j760VarArr.length > 0) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    for (j760 j760Var : j760VarArr) {
                        jSONObject2.put((String) j760Var.f116564a, j760Var.f116565b);
                    }
                    return jSONObject2;
                } catch (Exception e) {
                    e = e;
                    jSONObject = jSONObject2;
                    sm80.m184942b(e);
                    return jSONObject;
                }
            } catch (Exception e2) {
                e = e2;
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: c */
    public static void m220381c() {
        f205001c = true;
    }

    /* JADX INFO: renamed from: d */
    public static void m220382d() {
        if (m220383e() == null) {
            return;
        }
        dwf0.m113869f().m113872c();
    }

    /* JADX INFO: renamed from: e */
    public static Context m220383e() {
        return f204999a;
    }

    /* JADX INFO: renamed from: f */
    public static k850 m220384f() {
        tsl tslVar = f205002d;
        if (tslVar == null) {
            return null;
        }
        return tslVar.mo174860a();
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public static cwf0.InterfaceC16263b m220385g() {
        return dwf0.m113869f().f88171d;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m220386h() {
        return f205001c;
    }

    /* JADX INFO: renamed from: i */
    public static void m220387i(Context context) {
        m220389k(context, null);
    }

    /* JADX INFO: renamed from: j */
    public static void m220388j(Context context, String str, String str2, boolean z, String str3, String str4) {
        m220387i(context);
        m220378K(new C21786a(str, str3, str2, str4, z));
    }

    /* JADX INFO: renamed from: k */
    public static void m220389k(Context context, InterfaceC21787b interfaceC21787b) {
        if (context == null) {
            return;
        }
        f204999a = context.getApplicationContext();
        if (interfaceC21787b != null) {
            interfaceC21787b.init();
        }
        dwf0.m113869f().m113875g(f204999a);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m220390l() {
        return f205000b;
    }

    /* JADX INFO: renamed from: m */
    public static void m220391m(l3f l3fVar) {
        dwf0.m113869f().m113878j(l3fVar);
    }

    /* JADX INFO: renamed from: n */
    public static void m220392n(@NonNull l3f l3fVar, Map<String, Object> map) {
        l3fVar.f125904w = m220379a(map);
        m220391m(l3fVar);
    }

    /* JADX INFO: renamed from: o */
    public static void m220393o(@NonNull l3f l3fVar, j760... j760VarArr) {
        l3fVar.f125904w = m220380b(j760VarArr);
        m220391m(l3fVar);
    }

    /* JADX INFO: renamed from: p */
    public static void m220394p(String str, String str2, Map<String, Object> map) {
        dwf0.m113869f().m113880l(EventNameEnum.MODULE_VIEW, str, str2, m220379a(map));
    }

    /* JADX INFO: renamed from: q */
    public static void m220395q(String str, String str2, j760... j760VarArr) {
        dwf0.m113869f().m113881m(EventNameEnum.BIZ_PAY, str, str2, m220380b(j760VarArr));
    }

    /* JADX INFO: renamed from: r */
    public static void m220396r(String str, String str2) {
        m220398t(str, str2, null);
    }

    /* JADX INFO: renamed from: s */
    public static void m220397s(String str, String str2, Map<String, Object> map) {
        m220398t(str, str2, m220379a(map));
    }

    /* JADX INFO: renamed from: t */
    public static void m220398t(String str, String str2, JSONObject jSONObject) {
        p660.m167652k(str, jSONObject != null ? jSONObject.toString() : "");
        dwf0.m113869f().m113881m(EventNameEnum.MODULE_CLICK, str, str2, jSONObject);
    }

    /* JADX INFO: renamed from: u */
    public static void m220399u(String str, String str2, j760... j760VarArr) {
        m220398t(str, str2, m220380b(j760VarArr));
    }

    /* JADX INFO: renamed from: v */
    public static void m220400v(String str, String str2, j760... j760VarArr) {
        dwf0.m113869f().m113881m(EventNameEnum.MODULE, str, str2, m220380b(j760VarArr));
    }

    /* JADX INFO: renamed from: w */
    public static void m220401w(String str, String str2, j760... j760VarArr) {
        dwf0.m113869f().m113881m(EventNameEnum.MODULE_SLIDER, str, str2, m220380b(j760VarArr));
    }

    /* JADX INFO: renamed from: x */
    public static void m220402x(String str, String str2) {
        m220404z(str, str2, null);
    }

    /* JADX INFO: renamed from: y */
    public static void m220403y(String str, String str2, Map<String, Object> map) {
        m220404z(str, str2, m220379a(map));
    }

    /* JADX INFO: renamed from: z */
    public static void m220404z(String str, String str2, JSONObject jSONObject) {
        dwf0.m113869f().m113881m(EventNameEnum.MODULE_VIEW, str, str2, jSONObject);
    }
}
