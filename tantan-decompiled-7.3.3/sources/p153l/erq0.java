package p153l;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public class erq0 {

    /* JADX INFO: renamed from: i */
    private static final int f95508i;

    /* JADX INFO: renamed from: j */
    private static volatile erq0 f95509j;

    /* JADX INFO: renamed from: a */
    private ExecutorService f95510a = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: b */
    private HashMap<String, HashMap<String, xrq0>> f95511b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    private HashMap<String, ArrayList<xrq0>> f95512c = new HashMap<>();

    /* JADX INFO: renamed from: d */
    private Context f95513d;

    /* JADX INFO: renamed from: e */
    private uv5 f95514e;

    /* JADX INFO: renamed from: f */
    private String f95515f;

    /* JADX INFO: renamed from: g */
    private ysl f95516g;

    /* JADX INFO: renamed from: h */
    private l2m f95517h;

    /* JADX INFO: renamed from: l.erq0$a */
    public class RunnableC16817a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ y3f f95518a;

        public RunnableC16817a(y3f y3fVar) {
            this.f95518a = y3fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            erq0.this.m122270t(this.f95518a);
        }
    }

    /* JADX INFO: renamed from: l.erq0$b */
    public class RunnableC16818b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ gr60 f95520a;

        public RunnableC16818b(gr60 gr60Var) {
            this.f95520a = gr60Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            erq0.this.m122271u(this.f95520a);
        }
    }

    /* JADX INFO: renamed from: l.erq0$c */
    public class C16819c extends tsq0.AbstractRunnableC20394c {

        /* JADX INFO: renamed from: l.erq0$c$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                erq0.this.m122273x();
            }
        }

        public C16819c() {
        }

        @Override // p153l.tsq0.AbstractRunnableC20394c
        /* JADX INFO: renamed from: a */
        public String mo87798a() {
            return "100888";
        }

        @Override // java.lang.Runnable
        public void run() {
            if (erq0.this.m122260a() > 0) {
                erq0.this.f95510a.execute(new a());
            }
        }
    }

    /* JADX INFO: renamed from: l.erq0$d */
    public class C16820d extends tsq0.AbstractRunnableC20394c {

        /* JADX INFO: renamed from: l.erq0$d$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                erq0.this.m122274y();
            }
        }

        public C16820d() {
        }

        @Override // p153l.tsq0.AbstractRunnableC20394c
        /* JADX INFO: renamed from: a */
        public String mo87798a() {
            return "100889";
        }

        @Override // java.lang.Runnable
        public void run() {
            if (erq0.this.m122268q() > 0) {
                erq0.this.f95510a.execute(new a());
            }
        }
    }

    /* JADX INFO: renamed from: l.erq0$e */
    public class RunnableC16821e implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ivq0 f95526a;

        public RunnableC16821e(ivq0 ivq0Var) {
            this.f95526a = ivq0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f95526a.run();
        }
    }

    /* JADX INFO: renamed from: l.erq0$f */
    public class RunnableC16822f implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ jvq0 f95528a;

        public RunnableC16822f(jvq0 jvq0Var) {
            this.f95528a = jvq0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f95528a.run();
        }
    }

    static {
        f95508i = l4r0.m152824i() ? 30 : 10;
    }

    private erq0(Context context) {
        this.f95513d = context;
    }

    /* JADX INFO: renamed from: A */
    private void m122259A() {
        if (m122263f(this.f95513d).m122276d().m198247h()) {
            jvq0 jvq0Var = new jvq0(this.f95513d);
            int iM198244e = (int) m122263f(this.f95513d).m122276d().m198244e();
            if (iM198244e < 1800) {
                iM198244e = 1800;
            }
            if (System.currentTimeMillis() - mvq0.m160316c(this.f95513d).m160317a("sp_client_report_status", "perf_last_upload_time", 0L) > iM198244e * 1000) {
                tsq0.m192627f(this.f95513d).m192629h(new RunnableC16822f(jvq0Var), 15);
            }
            synchronized (erq0.class) {
                try {
                    if (!tsq0.m192627f(this.f95513d).m192632k(jvq0Var, iM198244e)) {
                        tsq0.m192627f(this.f95513d).m192630i("100887");
                        tsq0.m192627f(this.f95513d).m192632k(jvq0Var, iM198244e);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public int m122260a() {
        HashMap<String, ArrayList<xrq0>> map = this.f95512c;
        if (map == null) {
            return 0;
        }
        Iterator<String> it = map.keySet().iterator();
        int size = 0;
        while (it.hasNext()) {
            ArrayList<xrq0> arrayList = this.f95512c.get(it.next());
            size += arrayList != null ? arrayList.size() : 0;
        }
        return size;
    }

    /* JADX INFO: renamed from: f */
    public static erq0 m122263f(Context context) {
        if (f95509j == null) {
            synchronized (erq0.class) {
                try {
                    if (f95509j == null) {
                        f95509j = new erq0(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f95509j;
    }

    /* JADX INFO: renamed from: o */
    private void m122267o(tsq0.AbstractRunnableC20394c abstractRunnableC20394c, int i) {
        tsq0.m192627f(this.f95513d).m192635n(abstractRunnableC20394c, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public int m122268q() {
        HashMap<String, HashMap<String, xrq0>> map = this.f95511b;
        int i = 0;
        if (map != null) {
            Iterator<String> it = map.keySet().iterator();
            while (it.hasNext()) {
                HashMap<String, xrq0> map2 = this.f95511b.get(it.next());
                if (map2 != null) {
                    Iterator<String> it2 = map2.keySet().iterator();
                    while (it2.hasNext()) {
                        xrq0 xrq0Var = map2.get(it2.next());
                        if (xrq0Var instanceof gr60) {
                            i = (int) (((long) i) + ((gr60) xrq0Var).f106009i);
                        }
                    }
                }
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public void m122270t(y3f y3fVar) {
        ysl yslVar = this.f95516g;
        if (yslVar != null) {
            yslVar.mo183213a(y3fVar);
            if (m122260a() < 10) {
                m122267o(new C16819c(), f95508i);
            } else {
                m122273x();
                tsq0.m192627f(this.f95513d).m192630i("100888");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public void m122271u(gr60 gr60Var) {
        l2m l2mVar = this.f95517h;
        if (l2mVar != null) {
            l2mVar.mo183213a(gr60Var);
            if (m122268q() < 10) {
                m122267o(new C16820d(), f95508i);
            } else {
                m122274y();
                tsq0.m192627f(this.f95513d).m192630i("100889");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public void m122273x() {
        try {
            this.f95516g.mo183214b();
        } catch (Exception e) {
            ouq0.m169378B("we: " + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public void m122274y() {
        try {
            this.f95517h.mo183214b();
        } catch (Exception e) {
            ouq0.m169378B("wp: " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: z */
    private void m122275z() {
        if (m122263f(this.f95513d).m122276d().m198246g()) {
            ivq0 ivq0Var = new ivq0(this.f95513d);
            int iM198242c = (int) m122263f(this.f95513d).m122276d().m198242c();
            if (iM198242c < 1800) {
                iM198242c = 1800;
            }
            if (System.currentTimeMillis() - mvq0.m160316c(this.f95513d).m160317a("sp_client_report_status", "event_last_upload_time", 0L) > iM198242c * 1000) {
                tsq0.m192627f(this.f95513d).m192629h(new RunnableC16821e(ivq0Var), 10);
            }
            synchronized (erq0.class) {
                try {
                    if (!tsq0.m192627f(this.f95513d).m192632k(ivq0Var, iM198242c)) {
                        tsq0.m192627f(this.f95513d).m192630i("100886");
                        tsq0.m192627f(this.f95513d).m192632k(ivq0Var, iM198242c);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public synchronized uv5 m122276d() {
        try {
            if (this.f95514e == null) {
                this.f95514e = uv5.m198240a(this.f95513d);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f95514e;
    }

    /* JADX INFO: renamed from: e */
    public y3f m122277e(int i, String str) {
        y3f y3fVar = new y3f();
        y3fVar.f197359k = str;
        y3fVar.f197358j = System.currentTimeMillis();
        y3fVar.f197357i = i;
        y3fVar.f197356h = bvq0.m106587a(6);
        y3fVar.f195947a = 1000;
        y3fVar.f195949c = 1001;
        y3fVar.f195948b = "E100004";
        y3fVar.m212849a(this.f95513d.getPackageName());
        y3fVar.m212850b(this.f95515f);
        return y3fVar;
    }

    /* JADX INFO: renamed from: g */
    public void m122278g() {
        m122263f(this.f95513d).m122275z();
        m122263f(this.f95513d).m122259A();
    }

    /* JADX INFO: renamed from: h */
    public void m122279h(String str) {
        this.f95515f = str;
    }

    /* JADX INFO: renamed from: i */
    public void m122280i(uv5 uv5Var, ysl yslVar, l2m l2mVar) {
        this.f95514e = uv5Var;
        this.f95516g = yslVar;
        this.f95517h = l2mVar;
        yslVar.mo217228b(this.f95512c);
        this.f95517h.mo152628c(this.f95511b);
    }

    /* JADX INFO: renamed from: j */
    public void m122281j(y3f y3fVar) {
        if (m122276d().m198246g()) {
            this.f95510a.execute(new RunnableC16817a(y3fVar));
        }
    }

    /* JADX INFO: renamed from: k */
    public void m122282k(gr60 gr60Var) {
        if (m122276d().m198247h()) {
            this.f95510a.execute(new RunnableC16818b(gr60Var));
        }
    }

    /* JADX INFO: renamed from: p */
    public void m122283p(boolean z, boolean z2, long j, long j2) {
        uv5 uv5Var = this.f95514e;
        if (uv5Var != null) {
            if (z == uv5Var.m198246g() && z2 == this.f95514e.m198247h() && j == this.f95514e.m198242c() && j2 == this.f95514e.m198244e()) {
                return;
            }
            long jM198242c = this.f95514e.m198242c();
            long jM198244e = this.f95514e.m198244e();
            uv5 uv5VarM198255h = uv5.m198241b().m198256i(lvq0.m156001b(this.f95513d)).m198257j(this.f95514e.m198245f()).m198259l(z).m198258k(j).m198262o(z2).m198261n(j2).m198255h(this.f95513d);
            this.f95514e = uv5VarM198255h;
            if (!uv5VarM198255h.m198246g()) {
                tsq0.m192627f(this.f95513d).m192630i("100886");
            } else if (jM198242c != uv5VarM198255h.m198242c()) {
                ouq0.m169406z(this.f95513d.getPackageName() + "reset event job " + uv5VarM198255h.m198242c());
                m122275z();
            }
            if (!this.f95514e.m198247h()) {
                tsq0.m192627f(this.f95513d).m192630i("100887");
                return;
            }
            if (jM198244e != uv5VarM198255h.m198244e()) {
                ouq0.m169406z(this.f95513d.getPackageName() + " reset perf job " + uv5VarM198255h.m198244e());
                m122259A();
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public void m122284s() {
        if (m122276d().m198246g()) {
            kvq0 kvq0Var = new kvq0();
            kvq0Var.m151675a(this.f95513d);
            kvq0Var.m151676b(this.f95516g);
            this.f95510a.execute(kvq0Var);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m122285w() {
        if (m122276d().m198247h()) {
            kvq0 kvq0Var = new kvq0();
            kvq0Var.m151676b(this.f95517h);
            kvq0Var.m151675a(this.f95513d);
            this.f95510a.execute(kvq0Var);
        }
    }
}
