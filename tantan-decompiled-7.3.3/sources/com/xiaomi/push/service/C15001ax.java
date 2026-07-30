package com.xiaomi.push.service;

import android.content.SharedPreferences;
import android.util.Base64;
import com.xiaomi.push.C14877c;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.util.ArrayList;
import java.util.List;
import p153l.ezq0;
import p153l.gzq0;
import p153l.j6r0;
import p153l.o2r0;
import p153l.ouq0;
import p153l.suq0;
import p153l.t5r0;
import p153l.u3r0;
import p153l.vsq0;
import p153l.zwq0;

/* JADX INFO: renamed from: com.xiaomi.push.service.ax */
/* JADX INFO: loaded from: classes2.dex */
public class C15001ax {

    /* JADX INFO: renamed from: a */
    private static C15001ax f63837a = new C15001ax();

    /* JADX INFO: renamed from: a */
    private static String f63838a;

    /* JADX INFO: renamed from: a */
    private List<a> f63839a = new ArrayList();

    /* JADX INFO: renamed from: a */
    private ezq0 f63840a;

    /* JADX INFO: renamed from: a */
    private vsq0.AbstractC20930d f63841a;

    /* JADX INFO: renamed from: com.xiaomi.push.service.ax$a */
    public static abstract class a {
        /* JADX INFO: renamed from: a */
        public void mo87710a(ezq0 ezq0Var) {
        }

        /* JADX INFO: renamed from: a */
        public void mo87055a(gzq0 gzq0Var) {
        }
    }

    private C15001ax() {
    }

    /* JADX INFO: renamed from: a */
    public static synchronized String m87743a() {
        try {
            if (f63838a == null) {
                SharedPreferences sharedPreferences = t5r0.m189418b().getSharedPreferences("XMPushServiceConfig", 0);
                String string = sharedPreferences.getString("DeviceUUID", null);
                f63838a = string;
                if (string == null) {
                    String strM194400h = u3r0.m194400h(t5r0.m189418b(), false);
                    f63838a = strM194400h;
                    if (strM194400h != null) {
                        sharedPreferences.edit().putString("DeviceUUID", f63838a).commit();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return f63838a;
    }

    /* JADX INFO: renamed from: b */
    private void m87749b() throws Throwable {
        if (this.f63840a == null) {
            m87751d();
        }
    }

    /* JADX INFO: renamed from: c */
    private void m87750c() {
        if (this.f63841a != null) {
            return;
        }
        vsq0.AbstractC20930d abstractC20930d = new vsq0.AbstractC20930d() { // from class: com.xiaomi.push.service.ax.1

            /* JADX INFO: renamed from: a */
            boolean f63843a = false;

            @Override // p153l.vsq0.AbstractC20930d
            /* JADX INFO: renamed from: b */
            public void mo87758b() {
                try {
                    ezq0 ezq0VarM123399o = ezq0.m123399o(Base64.decode(zwq0.m221949f(t5r0.m189418b(), "https://resolver.msg.xiaomi.net/psc/?t=a", null), 10));
                    if (ezq0VarM123399o != null) {
                        C15001ax.this.f63840a = ezq0VarM123399o;
                        this.f63843a = true;
                        C15001ax.this.m87752e();
                    }
                } catch (Exception e) {
                    ouq0.m169393m("fetch config failure: " + e.getMessage());
                }
            }

            @Override // p153l.vsq0.AbstractC20930d
            /* JADX INFO: renamed from: c */
            public void mo87759c() {
                a[] aVarArr;
                C15001ax.this.f63841a = null;
                if (this.f63843a) {
                    synchronized (C15001ax.this) {
                        aVarArr = (a[]) C15001ax.this.f63839a.toArray(new a[C15001ax.this.f63839a.size()]);
                    }
                    for (a aVar : aVarArr) {
                        aVar.mo87710a(C15001ax.this.f63840a);
                    }
                }
            }
        };
        this.f63841a = abstractC20930d;
        o2r0.m165745b(abstractC20930d);
    }

    /* JADX INFO: renamed from: d */
    private void m87751d() throws Throwable {
        BufferedInputStream bufferedInputStream;
        Exception e;
        BufferedInputStream bufferedInputStream2 = null;
        try {
            try {
                bufferedInputStream = new BufferedInputStream(t5r0.m189418b().openFileInput("XMCloudCfg"));
                try {
                    this.f63840a = ezq0.m123400r(suq0.m188071g(bufferedInputStream));
                    bufferedInputStream.close();
                } catch (Exception e2) {
                    e = e2;
                    ouq0.m169393m("load config failure: " + e.getMessage());
                }
            } catch (Throwable th) {
                th = th;
                bufferedInputStream2 = bufferedInputStream;
                j6r0.m143691b(bufferedInputStream2);
                throw th;
            }
        } catch (Exception e3) {
            bufferedInputStream = null;
            e = e3;
        } catch (Throwable th2) {
            th = th2;
            j6r0.m143691b(bufferedInputStream2);
            throw th;
        }
        j6r0.m143691b(bufferedInputStream);
        if (this.f63840a == null) {
            this.f63840a = new ezq0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m87752e() {
        try {
            if (this.f63840a != null) {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(t5r0.m189418b().openFileOutput("XMCloudCfg", 0));
                C14877c c14877cM86655n = C14877c.m86655n(bufferedOutputStream);
                this.f63840a.mo118920e(c14877cM86655n);
                c14877cM86655n.m86674q();
                bufferedOutputStream.close();
            }
        } catch (Exception e) {
            ouq0.m169393m("save config failure: " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public static C15001ax m87742a() {
        return f63837a;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m87756a(a aVar) {
        this.f63839a.add(aVar);
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m87755a() {
        this.f63839a.clear();
    }

    /* JADX INFO: renamed from: a */
    public int m87753a() throws Throwable {
        m87749b();
        ezq0 ezq0Var = this.f63840a;
        if (ezq0Var != null) {
            return ezq0Var.m123411u();
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public ezq0 m87754a() throws Throwable {
        m87749b();
        return this.f63840a;
    }

    /* JADX INFO: renamed from: a */
    public void m87757a(gzq0 gzq0Var) {
        a[] aVarArr;
        if (gzq0Var.m133119u() && gzq0Var.m133118t() > m87753a()) {
            m87750c();
        }
        synchronized (this) {
            List<a> list = this.f63839a;
            aVarArr = (a[]) list.toArray(new a[list.size()]);
        }
        for (a aVar : aVarArr) {
            aVar.mo87055a(gzq0Var);
        }
    }
}
