package com.xiaomi.push.service;

import android.content.SharedPreferences;
import android.util.Base64;
import com.xiaomi.push.C14729c;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.util.ArrayList;
import java.util.List;
import p149l.aqq0;
import p149l.dxq0;
import p149l.ilq0;
import p149l.itq0;
import p149l.mlq0;
import p149l.nwq0;
import p149l.ouq0;
import p149l.pjq0;
import p149l.tnq0;
import p149l.ypq0;

/* JADX INFO: renamed from: com.xiaomi.push.service.ax */
/* JADX INFO: loaded from: classes2.dex */
public class C14853ax {

    /* JADX INFO: renamed from: a */
    private static C14853ax f62990a = new C14853ax();

    /* JADX INFO: renamed from: a */
    private static String f62991a;

    /* JADX INFO: renamed from: a */
    private List<a> f62992a = new ArrayList();

    /* JADX INFO: renamed from: a */
    private pjq0.AbstractC19254d f62993a;

    /* JADX INFO: renamed from: a */
    private ypq0 f62994a;

    /* JADX INFO: renamed from: com.xiaomi.push.service.ax$a */
    public static abstract class a {
        /* JADX INFO: renamed from: a */
        public void mo86539a(ypq0 ypq0Var) {
        }

        /* JADX INFO: renamed from: a */
        public void mo85884a(aqq0 aqq0Var) {
        }
    }

    private C14853ax() {
    }

    /* JADX INFO: renamed from: a */
    public static synchronized String m86572a() {
        try {
            if (f62991a == null) {
                SharedPreferences sharedPreferences = nwq0.m161879b().getSharedPreferences("XMPushServiceConfig", 0);
                String string = sharedPreferences.getString("DeviceUUID", null);
                f62991a = string;
                if (string == null) {
                    String strM166099h = ouq0.m166099h(nwq0.m161879b(), false);
                    f62991a = strM166099h;
                    if (strM166099h != null) {
                        sharedPreferences.edit().putString("DeviceUUID", f62991a).commit();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return f62991a;
    }

    /* JADX INFO: renamed from: b */
    private void m86578b() throws Throwable {
        if (this.f62994a == null) {
            m86580d();
        }
    }

    /* JADX INFO: renamed from: c */
    private void m86579c() {
        if (this.f62993a != null) {
            return;
        }
        pjq0.AbstractC19254d abstractC19254d = new pjq0.AbstractC19254d() { // from class: com.xiaomi.push.service.ax.1

            /* JADX INFO: renamed from: a */
            boolean f62996a = false;

            @Override // p149l.pjq0.AbstractC19254d
            /* JADX INFO: renamed from: b */
            public void mo86587b() {
                try {
                    ypq0 ypq0VarM215649o = ypq0.m215649o(Base64.decode(tnq0.m189821f(nwq0.m161879b(), "https://resolver.msg.xiaomi.net/psc/?t=a", null), 10));
                    if (ypq0VarM215649o != null) {
                        C14853ax.this.f62994a = ypq0VarM215649o;
                        this.f62996a = true;
                        C14853ax.this.m86581e();
                    }
                } catch (Exception e) {
                    ilq0.m137040m("fetch config failure: " + e.getMessage());
                }
            }

            @Override // p149l.pjq0.AbstractC19254d
            /* JADX INFO: renamed from: c */
            public void mo86588c() {
                a[] aVarArr;
                C14853ax.this.f62993a = null;
                if (this.f62996a) {
                    synchronized (C14853ax.this) {
                        aVarArr = (a[]) C14853ax.this.f62992a.toArray(new a[C14853ax.this.f62992a.size()]);
                    }
                    for (a aVar : aVarArr) {
                        aVar.mo86539a(C14853ax.this.f62994a);
                    }
                }
            }
        };
        this.f62993a = abstractC19254d;
        itq0.m138234b(abstractC19254d);
    }

    /* JADX INFO: renamed from: d */
    private void m86580d() throws Throwable {
        BufferedInputStream bufferedInputStream;
        Exception e;
        BufferedInputStream bufferedInputStream2 = null;
        try {
            try {
                bufferedInputStream = new BufferedInputStream(nwq0.m161879b().openFileInput("XMCloudCfg"));
                try {
                    this.f62994a = ypq0.m215650r(mlq0.m155170g(bufferedInputStream));
                    bufferedInputStream.close();
                } catch (Exception e2) {
                    e = e2;
                    ilq0.m137040m("load config failure: " + e.getMessage());
                }
            } catch (Throwable th) {
                th = th;
                bufferedInputStream2 = bufferedInputStream;
                dxq0.m114018b(bufferedInputStream2);
                throw th;
            }
        } catch (Exception e3) {
            bufferedInputStream = null;
            e = e3;
        } catch (Throwable th2) {
            th = th2;
            dxq0.m114018b(bufferedInputStream2);
            throw th;
        }
        dxq0.m114018b(bufferedInputStream);
        if (this.f62994a == null) {
            this.f62994a = new ypq0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m86581e() {
        try {
            if (this.f62994a != null) {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(nwq0.m161879b().openFileOutput("XMCloudCfg", 0));
                C14729c c14729cM85484n = C14729c.m85484n(bufferedOutputStream);
                this.f62994a.mo98328e(c14729cM85484n);
                c14729cM85484n.m85503q();
                bufferedOutputStream.close();
            }
        } catch (Exception e) {
            ilq0.m137040m("save config failure: " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public static C14853ax m86571a() {
        return f62990a;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m86585a(a aVar) {
        this.f62992a.add(aVar);
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m86584a() {
        this.f62992a.clear();
    }

    /* JADX INFO: renamed from: a */
    public int m86582a() throws Throwable {
        m86578b();
        ypq0 ypq0Var = this.f62994a;
        if (ypq0Var != null) {
            return ypq0Var.m215661u();
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public ypq0 m86583a() throws Throwable {
        m86578b();
        return this.f62994a;
    }

    /* JADX INFO: renamed from: a */
    public void m86586a(aqq0 aqq0Var) {
        a[] aVarArr;
        if (aqq0Var.m98340u() && aqq0Var.m98339t() > m86582a()) {
            m86579c();
        }
        synchronized (this) {
            List<a> list = this.f62992a;
            aVarArr = (a[]) list.toArray(new a[list.size()]);
        }
        for (a aVar : aVarArr) {
            aVar.mo85884a(aqq0Var);
        }
    }
}
