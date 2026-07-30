package p153l;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantanapp.foxstatistics.DefaultEnvironment;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class i4g0 {

    /* JADX INFO: renamed from: a */
    public static Context f112899a = null;

    /* JADX INFO: renamed from: b */
    public static boolean f112900b = false;

    /* JADX INFO: renamed from: c */
    public static boolean f112901c = true;

    /* JADX INFO: renamed from: d */
    public static gvl f112902d;

    /* JADX INFO: renamed from: l.i4g0$a */
    public class C17641a extends ek2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f112903a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f112904b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f112905c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f112906d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ boolean f112907e;

        public C17641a(String str, String str2, String str3, String str4, boolean z) {
            this.f112903a = str;
            this.f112904b = str2;
            this.f112905c = str3;
            this.f112906d = str4;
            this.f112907e = z;
        }

        @Override // p153l.ek2
        /* JADX INFO: renamed from: D */
        public String mo121004D() {
            return "";
        }

        @Override // p153l.y5m
        /* JADX INFO: renamed from: a */
        public String mo138529a() {
            return this.f112903a;
        }

        @Override // p153l.y5m
        /* JADX INFO: renamed from: b */
        public String mo138530b() {
            return this.f112904b;
        }

        @Override // p153l.y5m
        /* JADX INFO: renamed from: c */
        public String mo138531c() {
            return this.f112905c;
        }

        @Override // p153l.ek2
        /* JADX INFO: renamed from: h */
        public String mo121011h() {
            return this.f112906d;
        }

        @Override // p153l.ek2
        /* JADX INFO: renamed from: l */
        public boolean mo121015l() {
            return this.f112907e;
        }

        @Override // p153l.ek2
        /* JADX INFO: renamed from: q */
        public Object mo121020q() {
            return null;
        }
    }

    /* JADX INFO: renamed from: l.i4g0$b */
    public interface InterfaceC17642b {
        void init();
    }

    /* JADX INFO: renamed from: A */
    public static void m138492A(String str, String str2, pf60... pf60VarArr) {
        m138528z(str, str2, m138504b(pf60VarArr));
    }

    /* JADX INFO: renamed from: B */
    public static void m138493B(String str, String str2, pf60... pf60VarArr) {
        m4g0.m157014f().m157026m(EventNameEnum.SYS_CHECK, str, str2, m138504b(pf60VarArr));
    }

    /* JADX INFO: renamed from: C */
    public static void m138494C(String str) {
        m4g0.m157014f().m157029p(str);
    }

    /* JADX INFO: renamed from: D */
    public static void m138495D(String str, String str2, pf60... pf60VarArr) {
        m4g0.m157014f().m157026m(EventNameEnum.USER_BEHAVIOR_COMPLEMENT, str, str2, m138504b(pf60VarArr));
    }

    /* JADX INFO: renamed from: E */
    public static void m138496E(gvl gvlVar) {
        f112902d = gvlVar;
    }

    /* JADX INFO: renamed from: F */
    public static void m138497F(l4g0.InterfaceC18345b interfaceC18345b) {
        m4g0.m157014f().m157030q(interfaceC18345b);
    }

    /* JADX INFO: renamed from: G */
    public static void m138498G(k4g0 k4g0Var) {
        m4g0.m157014f().m157031r(k4g0Var);
    }

    /* JADX INFO: renamed from: H */
    public static void m138499H(String str, Object obj) {
        if (m138507e() == null) {
            return;
        }
        m4g0.m157014f().m157032s(str, obj);
    }

    /* JADX INFO: renamed from: I */
    public static void m138500I(HashMap<String, Object> map) {
        if (m138507e() == null) {
            return;
        }
        DefaultEnvironment.m82507c(m138507e()).m82511g(map);
    }

    /* JADX INFO: renamed from: J */
    public static void m138501J() {
        if (m138507e() == null) {
            return;
        }
        DefaultEnvironment.m82507c(f112899a).m82514j();
    }

    /* JADX INFO: renamed from: K */
    public static void m138502K(ek2 ek2Var) {
        if (m138507e() == null) {
            return;
        }
        m4g0.m157014f().m157033t(ek2Var);
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m138503a(Map<String, Object> map) {
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
                        wu80.m207938b(e);
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
    public static JSONObject m138504b(pf60[] pf60VarArr) {
        JSONObject jSONObject = null;
        if (pf60VarArr != null && pf60VarArr.length > 0) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    for (pf60 pf60Var : pf60VarArr) {
                        jSONObject2.put((String) pf60Var.f152156a, pf60Var.f152157b);
                    }
                    return jSONObject2;
                } catch (Exception e) {
                    e = e;
                    jSONObject = jSONObject2;
                    wu80.m207938b(e);
                    return jSONObject;
                }
            } catch (Exception e2) {
                e = e2;
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: c */
    public static void m138505c() {
        f112901c = true;
    }

    /* JADX INFO: renamed from: d */
    public static void m138506d() {
        if (m138507e() == null) {
            return;
        }
        m4g0.m157014f().m157017c();
    }

    /* JADX INFO: renamed from: e */
    public static Context m138507e() {
        return f112899a;
    }

    /* JADX INFO: renamed from: f */
    public static rg50 m138508f() {
        gvl gvlVar = f112902d;
        if (gvlVar == null) {
            return null;
        }
        return gvlVar.mo132559a();
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public static l4g0.InterfaceC18345b m138509g() {
        return m4g0.m157014f().f134795d;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m138510h() {
        return f112901c;
    }

    /* JADX INFO: renamed from: i */
    public static void m138511i(Context context) {
        m138513k(context, null);
    }

    /* JADX INFO: renamed from: j */
    public static void m138512j(Context context, String str, String str2, boolean z, String str3, String str4) {
        m138511i(context);
        m138502K(new C17641a(str, str3, str2, str4, z));
    }

    /* JADX INFO: renamed from: k */
    public static void m138513k(Context context, InterfaceC17642b interfaceC17642b) {
        if (context == null) {
            return;
        }
        f112899a = context.getApplicationContext();
        if (interfaceC17642b != null) {
            interfaceC17642b.init();
        }
        m4g0.m157014f().m157020g(f112899a);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m138514l() {
        return f112900b;
    }

    /* JADX INFO: renamed from: m */
    public static void m138515m(q4f q4fVar) {
        m4g0.m157014f().m157023j(q4fVar);
    }

    /* JADX INFO: renamed from: n */
    public static void m138516n(@NonNull q4f q4fVar, Map<String, Object> map) {
        q4fVar.f155585w = m138503a(map);
        m138515m(q4fVar);
    }

    /* JADX INFO: renamed from: o */
    public static void m138517o(@NonNull q4f q4fVar, pf60... pf60VarArr) {
        q4fVar.f155585w = m138504b(pf60VarArr);
        m138515m(q4fVar);
    }

    /* JADX INFO: renamed from: p */
    public static void m138518p(String str, String str2, Map<String, Object> map) {
        m4g0.m157014f().m157025l(EventNameEnum.MODULE_VIEW, str, str2, m138503a(map));
    }

    /* JADX INFO: renamed from: q */
    public static void m138519q(String str, String str2, pf60... pf60VarArr) {
        m4g0.m157014f().m157026m(EventNameEnum.BIZ_PAY, str, str2, m138504b(pf60VarArr));
    }

    /* JADX INFO: renamed from: r */
    public static void m138520r(String str, String str2) {
        m138522t(str, str2, null);
    }

    /* JADX INFO: renamed from: s */
    public static void m138521s(String str, String str2, Map<String, Object> map) {
        m138522t(str, str2, m138503a(map));
    }

    /* JADX INFO: renamed from: t */
    public static void m138522t(String str, String str2, JSONObject jSONObject) {
        ve60.m201044k(str, jSONObject != null ? jSONObject.toString() : "");
        m4g0.m157014f().m157026m(EventNameEnum.MODULE_CLICK, str, str2, jSONObject);
    }

    /* JADX INFO: renamed from: u */
    public static void m138523u(String str, String str2, pf60... pf60VarArr) {
        m138522t(str, str2, m138504b(pf60VarArr));
    }

    /* JADX INFO: renamed from: v */
    public static void m138524v(String str, String str2, pf60... pf60VarArr) {
        m4g0.m157014f().m157026m(EventNameEnum.MODULE, str, str2, m138504b(pf60VarArr));
    }

    /* JADX INFO: renamed from: w */
    public static void m138525w(String str, String str2, pf60... pf60VarArr) {
        m4g0.m157014f().m157026m(EventNameEnum.MODULE_SLIDER, str, str2, m138504b(pf60VarArr));
    }

    /* JADX INFO: renamed from: x */
    public static void m138526x(String str, String str2) {
        m138528z(str, str2, null);
    }

    /* JADX INFO: renamed from: y */
    public static void m138527y(String str, String str2, Map<String, Object> map) {
        m138528z(str, str2, m138503a(map));
    }

    /* JADX INFO: renamed from: z */
    public static void m138528z(String str, String str2, JSONObject jSONObject) {
        m4g0.m157014f().m157026m(EventNameEnum.MODULE_VIEW, str, str2, jSONObject);
    }
}
