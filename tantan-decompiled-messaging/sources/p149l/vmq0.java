package p149l;

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
public abstract class vmq0 {

    /* JADX INFO: renamed from: a */
    protected CrashType f182139a;

    /* JADX INFO: renamed from: b */
    protected Context f182140b;

    /* JADX INFO: renamed from: c */
    protected xol f182141c = hrq0.m132693b().m194562e();

    /* JADX INFO: renamed from: d */
    protected ykq0 f182142d;

    /* JADX INFO: renamed from: e */
    protected voq0 f182143e;

    /* JADX INFO: renamed from: l.vmq0$a */
    public interface InterfaceC20665a {
        /* JADX INFO: renamed from: a */
        bjq0 mo155706a(int i, bjq0 bjq0Var);

        /* JADX INFO: renamed from: a */
        void mo155707a(Throwable th);

        /* JADX INFO: renamed from: b */
        bjq0 mo155708b(int i, bjq0 bjq0Var, boolean z);
    }

    public vmq0(CrashType crashType, Context context, ykq0 ykq0Var, voq0 voq0Var) {
        this.f182139a = crashType;
        this.f182140b = context;
        this.f182142d = ykq0Var;
        this.f182143e = voq0Var;
    }

    /* JADX INFO: renamed from: o */
    private void m198973o(bjq0 bjq0Var) {
        List<k31> listM154747a = hrq0.m132695d().m154747a(this.f182139a);
        HashMap map = new HashMap();
        JSONObject jSONObjectOptJSONObject = bjq0Var.m102206G().optJSONObject("custom");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
            bjq0Var.m102217j("custom", jSONObjectOptJSONObject);
        }
        if (listM154747a != null) {
            for (int i = 0; i < listM154747a.size(); i++) {
                try {
                    k31 k31Var = listM154747a.get(i);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    bjq0.m102195m(jSONObjectOptJSONObject, k31Var.m144362a(this.f182139a));
                    map.put("custom_cost_" + k31Var.getClass().getName() + "_" + map.size(), Long.valueOf(SystemClock.uptimeMillis() - jUptimeMillis));
                } catch (Throwable th) {
                    bjq0.m102194l(jSONObjectOptJSONObject, th);
                }
            }
        }
        try {
            jSONObjectOptJSONObject.put("fd_count", wtq0.m205580a());
        } catch (Throwable unused) {
        }
        List<k31> listM154749c = hrq0.m132695d().m154749c(this.f182139a);
        if (listM154749c != null) {
            JSONObject jSONObjectOptJSONObject2 = bjq0Var.m102206G().optJSONObject("custom_long");
            if (jSONObjectOptJSONObject2 == null) {
                jSONObjectOptJSONObject2 = new JSONObject();
                bjq0Var.m102217j("custom_long", jSONObjectOptJSONObject2);
            }
            for (int i2 = 0; i2 < listM154749c.size(); i2++) {
                try {
                    k31 k31Var2 = listM154749c.get(i2);
                    long jUptimeMillis2 = SystemClock.uptimeMillis();
                    bjq0.m102195m(jSONObjectOptJSONObject2, k31Var2.m144362a(this.f182139a));
                    map.put("custom_cost_" + k31Var2.getClass().getName() + "_" + map.size(), Long.valueOf(SystemClock.uptimeMillis() - jUptimeMillis2));
                } catch (Throwable th2) {
                    bjq0.m102194l(jSONObjectOptJSONObject2, th2);
                }
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            jSONObjectOptJSONObject.put((String) entry.getKey(), entry.getValue());
        }
    }

    /* JADX INFO: renamed from: a */
    public bjq0 mo108890a(int i, bjq0 bjq0Var) {
        if (bjq0Var == null) {
            bjq0Var = new bjq0();
        }
        if (i == 0) {
            m198975f(bjq0Var);
            return bjq0Var;
        }
        if (i == 1) {
            m198976g(bjq0Var);
            m198973o(bjq0Var);
            return bjq0Var;
        }
        if (i == 2) {
            m198979k(bjq0Var);
            return bjq0Var;
        }
        if (i == 4) {
            m198980l(bjq0Var);
            return bjq0Var;
        }
        if (i != 5) {
            return bjq0Var;
        }
        m198978i(bjq0Var);
        return bjq0Var;
    }

    /* JADX INFO: renamed from: c */
    public bjq0 m198974c(bjq0 bjq0Var, InterfaceC20665a interfaceC20665a, boolean z) {
        if (bjq0Var == null) {
            bjq0Var = new bjq0();
        }
        bjq0 bjq0VarMo155706a = bjq0Var;
        for (int i = 0; i < mo108892e(); i++) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (interfaceC20665a != null) {
                try {
                    bjq0VarMo155706a = interfaceC20665a.mo155706a(i, bjq0VarMo155706a);
                } catch (Throwable th) {
                    interfaceC20665a.mo155707a(th);
                }
            }
            try {
                bjq0VarMo155706a = mo108890a(i, bjq0VarMo155706a);
            } catch (Throwable th2) {
                if (interfaceC20665a != null) {
                    interfaceC20665a.mo155707a(th2);
                }
            }
            if (interfaceC20665a != null) {
                try {
                    boolean z2 = true;
                    if (i != mo108892e() - 1) {
                        z2 = false;
                    }
                    bjq0VarMo155706a = interfaceC20665a.mo155708b(i, bjq0VarMo155706a, z2);
                } catch (Throwable th3) {
                    interfaceC20665a.mo155707a(th3);
                }
                if (z) {
                    if (i != 0) {
                        bjq0Var.m102225y(bjq0VarMo155706a.m102206G());
                    } else {
                        bjq0Var = bjq0VarMo155706a;
                    }
                    bjq0VarMo155706a = new bjq0();
                }
            }
            bjq0Var.m102219q("step_cost_" + i, String.valueOf(SystemClock.uptimeMillis() - jUptimeMillis));
        }
        return mo141663b(bjq0Var);
    }

    /* JADX INFO: renamed from: d */
    public boolean mo108891d() {
        return false;
    }

    /* JADX INFO: renamed from: e */
    public int mo108892e() {
        return 6;
    }

    /* JADX INFO: renamed from: f */
    public bjq0 m198975f(bjq0 bjq0Var) {
        bjq0Var.m102208a(hrq0.m132709r(), hrq0.m132710s());
        if (hrq0.m132706o()) {
            bjq0Var.m102217j("is_mp", 1);
        }
        try {
            bjq0Var.m102213f(this.f182141c.mo147294c());
        } catch (Throwable th) {
            try {
                HashMap map = new HashMap();
                map.put("Fetch info failed:\n" + xwq0.m211359b(th), 0);
                bjq0Var.m102213f(map);
            } catch (Throwable unused) {
            }
        }
        bjq0Var.m102220r(hrq0.m132708q());
        bjq0Var.m102217j("process_name", giq0.m126397l(hrq0.m132700i()));
        return bjq0Var;
    }

    /* JADX INFO: renamed from: g */
    public bjq0 m198976g(bjq0 bjq0Var) {
        ykq0 ykq0Var;
        if (!giq0.m126395j(hrq0.m132700i())) {
            bjq0Var.m102217j("remote_process", 1);
        }
        bjq0Var.m102217j("pid", Integer.valueOf(Process.myPid()));
        bjq0Var.m102209b(hrq0.m132703l());
        if (m198977h() && (ykq0Var = this.f182142d) != null) {
            bjq0Var.m102214g(ykq0Var);
        }
        try {
            bjq0Var.m102212e(this.f182141c.mo147293b());
        } catch (Throwable th) {
            try {
                bjq0Var.m102212e(Arrays.asList("Fetch info failed:\n" + xwq0.m211359b(th)));
            } catch (Throwable unused) {
            }
        }
        String strM132704m = hrq0.m132704m();
        if (strM132704m != null) {
            bjq0Var.m102217j("business", strM132704m);
        }
        bjq0Var.m102217j("is_background", Boolean.valueOf(!giq0.m126392g(this.f182140b)));
        return bjq0Var;
    }

    /* JADX INFO: renamed from: h */
    public boolean m198977h() {
        return true;
    }

    /* JADX INFO: renamed from: i */
    public bjq0 m198978i(bjq0 bjq0Var) {
        if (mo108893j()) {
            bjq0Var.m102221s(fxq0.m123680b(this.f182140b));
        }
        return bjq0Var;
    }

    /* JADX INFO: renamed from: j */
    public boolean mo108893j() {
        return true;
    }

    /* JADX INFO: renamed from: k */
    public bjq0 m198979k(bjq0 bjq0Var) {
        voq0 voq0Var = this.f182143e;
        bjq0Var.m102217j("battery", Integer.valueOf(voq0Var == null ? 0 : voq0Var.m199193a()));
        bjq0Var.m102223w(hrq0.m132695d().m154748b());
        return bjq0Var;
    }

    /* JADX INFO: renamed from: l */
    public bjq0 m198980l(bjq0 bjq0Var) {
        if (mo108891d()) {
            mo108894n(bjq0Var);
        }
        return bjq0Var;
    }

    /* JADX INFO: renamed from: b */
    public bjq0 mo141663b(bjq0 bjq0Var) {
        return bjq0Var;
    }

    /* JADX INFO: renamed from: m */
    public void m198981m(bjq0 bjq0Var) {
    }

    /* JADX INFO: renamed from: n */
    public void mo108894n(bjq0 bjq0Var) {
    }
}
