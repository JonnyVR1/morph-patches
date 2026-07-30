package p153l;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import com.apm.lite.CrashType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class bwq0 {

    /* JADX INFO: renamed from: a */
    protected CrashType f78770a;

    /* JADX INFO: renamed from: b */
    protected Context f78771b;

    /* JADX INFO: renamed from: c */
    protected irl f78772c = n0r0.m161015b().m100919e();

    /* JADX INFO: renamed from: d */
    protected euq0 f78773d;

    /* JADX INFO: renamed from: e */
    protected byq0 f78774e;

    /* JADX INFO: renamed from: l.bwq0$a */
    public interface InterfaceC16123a {
        /* JADX INFO: renamed from: a */
        gsq0 mo106755a(int i, gsq0 gsq0Var);

        /* JADX INFO: renamed from: a */
        void mo106756a(Throwable th);

        /* JADX INFO: renamed from: b */
        gsq0 mo106757b(int i, gsq0 gsq0Var, boolean z);
    }

    public bwq0(CrashType crashType, Context context, euq0 euq0Var, byq0 byq0Var) {
        this.f78770a = crashType;
        this.f78771b = context;
        this.f78773d = euq0Var;
        this.f78774e = byq0Var;
    }

    /* JADX INFO: renamed from: o */
    private void m106740o(gsq0 gsq0Var) {
        List<r31> listM182824a = n0r0.m161017d().m182824a(this.f78770a);
        HashMap map = new HashMap();
        JSONObject jSONObjectOptJSONObject = gsq0Var.m132125G().optJSONObject("custom");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
            gsq0Var.m132136j("custom", jSONObjectOptJSONObject);
        }
        if (listM182824a != null) {
            for (int i = 0; i < listM182824a.size(); i++) {
                try {
                    r31 r31Var = listM182824a.get(i);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    gsq0.m132114m(jSONObjectOptJSONObject, r31Var.m179575a(this.f78770a));
                    map.put("custom_cost_" + r31Var.getClass().getName() + "_" + map.size(), Long.valueOf(SystemClock.uptimeMillis() - jUptimeMillis));
                } catch (Throwable th) {
                    gsq0.m132113l(jSONObjectOptJSONObject, th);
                }
            }
        }
        try {
            jSONObjectOptJSONObject.put("fd_count", c3r0.m107806a());
        } catch (Throwable unused) {
        }
        List<r31> listM182826c = n0r0.m161017d().m182826c(this.f78770a);
        if (listM182826c != null) {
            JSONObject jSONObjectOptJSONObject2 = gsq0Var.m132125G().optJSONObject("custom_long");
            if (jSONObjectOptJSONObject2 == null) {
                jSONObjectOptJSONObject2 = new JSONObject();
                gsq0Var.m132136j("custom_long", jSONObjectOptJSONObject2);
            }
            for (int i2 = 0; i2 < listM182826c.size(); i2++) {
                try {
                    r31 r31Var2 = listM182826c.get(i2);
                    long jUptimeMillis2 = SystemClock.uptimeMillis();
                    gsq0.m132114m(jSONObjectOptJSONObject2, r31Var2.m179575a(this.f78770a));
                    map.put("custom_cost_" + r31Var2.getClass().getName() + "_" + map.size(), Long.valueOf(SystemClock.uptimeMillis() - jUptimeMillis2));
                } catch (Throwable th2) {
                    gsq0.m132113l(jSONObjectOptJSONObject2, th2);
                }
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            jSONObjectOptJSONObject.put((String) entry.getKey(), entry.getValue());
        }
    }

    /* JADX INFO: renamed from: a */
    public gsq0 mo106741a(int i, gsq0 gsq0Var) {
        if (gsq0Var == null) {
            gsq0Var = new gsq0();
        }
        if (i == 0) {
            m106746f(gsq0Var);
            return gsq0Var;
        }
        if (i == 1) {
            m106747g(gsq0Var);
            m106740o(gsq0Var);
            return gsq0Var;
        }
        if (i == 2) {
            m106751k(gsq0Var);
            return gsq0Var;
        }
        if (i == 4) {
            m106752l(gsq0Var);
            return gsq0Var;
        }
        if (i != 5) {
            return gsq0Var;
        }
        m106749i(gsq0Var);
        return gsq0Var;
    }

    /* JADX INFO: renamed from: c */
    public gsq0 m106743c(gsq0 gsq0Var, InterfaceC16123a interfaceC16123a, boolean z) {
        if (gsq0Var == null) {
            gsq0Var = new gsq0();
        }
        gsq0 gsq0VarMo106755a = gsq0Var;
        for (int i = 0; i < mo106745e(); i++) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (interfaceC16123a != null) {
                try {
                    gsq0VarMo106755a = interfaceC16123a.mo106755a(i, gsq0VarMo106755a);
                } catch (Throwable th) {
                    interfaceC16123a.mo106756a(th);
                }
            }
            try {
                gsq0VarMo106755a = mo106741a(i, gsq0VarMo106755a);
            } catch (Throwable th2) {
                if (interfaceC16123a != null) {
                    interfaceC16123a.mo106756a(th2);
                }
            }
            if (interfaceC16123a != null) {
                try {
                    boolean z2 = true;
                    if (i != mo106745e() - 1) {
                        z2 = false;
                    }
                    gsq0VarMo106755a = interfaceC16123a.mo106757b(i, gsq0VarMo106755a, z2);
                } catch (Throwable th3) {
                    interfaceC16123a.mo106756a(th3);
                }
                if (z) {
                    if (i != 0) {
                        gsq0Var.m132144y(gsq0VarMo106755a.m132125G());
                    } else {
                        gsq0Var = gsq0VarMo106755a;
                    }
                    gsq0VarMo106755a = new gsq0();
                }
            }
            gsq0Var.m132138q("step_cost_" + i, String.valueOf(SystemClock.uptimeMillis() - jUptimeMillis));
        }
        return mo106742b(gsq0Var);
    }

    /* JADX INFO: renamed from: d */
    public boolean mo106744d() {
        return false;
    }

    /* JADX INFO: renamed from: e */
    public int mo106745e() {
        return 6;
    }

    /* JADX INFO: renamed from: f */
    public gsq0 m106746f(gsq0 gsq0Var) {
        gsq0Var.m132127a(n0r0.m161031r(), n0r0.m161032s());
        if (n0r0.m161028o()) {
            gsq0Var.m132136j("is_mp", 1);
        }
        try {
            gsq0Var.m132132f(this.f78772c.mo141837c());
        } catch (Throwable th) {
            try {
                HashMap map = new HashMap();
                map.put("Fetch info failed:\n" + d6r0.m114507b(th), 0);
                gsq0Var.m132132f(map);
            } catch (Throwable unused) {
            }
        }
        gsq0Var.m132139r(n0r0.m161030q());
        gsq0Var.m132136j("process_name", lrq0.m155648l(n0r0.m161022i()));
        return gsq0Var;
    }

    /* JADX INFO: renamed from: g */
    public gsq0 m106747g(gsq0 gsq0Var) {
        euq0 euq0Var;
        if (!lrq0.m155646j(n0r0.m161022i())) {
            gsq0Var.m132136j("remote_process", 1);
        }
        gsq0Var.m132136j("pid", Integer.valueOf(Process.myPid()));
        gsq0Var.m132128b(n0r0.m161025l());
        if (m106748h() && (euq0Var = this.f78773d) != null) {
            gsq0Var.m132133g(euq0Var);
        }
        try {
            gsq0Var.m132131e(this.f78772c.mo141836b());
        } catch (Throwable th) {
            try {
                gsq0Var.m132131e(Arrays.asList("Fetch info failed:\n" + d6r0.m114507b(th)));
            } catch (Throwable unused) {
            }
        }
        String strM161026m = n0r0.m161026m();
        if (strM161026m != null) {
            gsq0Var.m132136j("business", strM161026m);
        }
        gsq0Var.m132136j("is_background", Boolean.valueOf(!lrq0.m155643g(this.f78771b)));
        return gsq0Var;
    }

    /* JADX INFO: renamed from: h */
    public boolean m106748h() {
        return true;
    }

    /* JADX INFO: renamed from: i */
    public gsq0 m106749i(gsq0 gsq0Var) {
        if (mo106750j()) {
            gsq0Var.m132140s(l6r0.m153085b(this.f78771b));
        }
        return gsq0Var;
    }

    /* JADX INFO: renamed from: j */
    public boolean mo106750j() {
        return true;
    }

    /* JADX INFO: renamed from: k */
    public gsq0 m106751k(gsq0 gsq0Var) {
        byq0 byq0Var = this.f78774e;
        gsq0Var.m132136j("battery", Integer.valueOf(byq0Var == null ? 0 : byq0Var.m107031a()));
        gsq0Var.m132142w(n0r0.m161017d().m182825b());
        return gsq0Var;
    }

    /* JADX INFO: renamed from: l */
    public gsq0 m106752l(gsq0 gsq0Var) {
        if (mo106744d()) {
            mo106754n(gsq0Var);
        }
        return gsq0Var;
    }

    /* JADX INFO: renamed from: b */
    public gsq0 mo106742b(gsq0 gsq0Var) {
        return gsq0Var;
    }

    /* JADX INFO: renamed from: m */
    public void m106753m(gsq0 gsq0Var) {
    }

    /* JADX INFO: renamed from: n */
    public void mo106754n(gsq0 gsq0Var) {
    }
}
