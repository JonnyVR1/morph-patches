package p149l;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public class zhq0 {

    /* JADX INFO: renamed from: i */
    private static final int f203205i;

    /* JADX INFO: renamed from: j */
    private static volatile zhq0 f203206j;

    /* JADX INFO: renamed from: a */
    private ExecutorService f203207a = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: b */
    private HashMap<String, HashMap<String, siq0>> f203208b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    private HashMap<String, ArrayList<siq0>> f203209c = new HashMap<>();

    /* JADX INFO: renamed from: d */
    private Context f203210d;

    /* JADX INFO: renamed from: e */
    private qu5 f203211e;

    /* JADX INFO: renamed from: f */
    private String f203212f;

    /* JADX INFO: renamed from: g */
    private mql f203213g;

    /* JADX INFO: renamed from: h */
    private rzl f203214h;

    /* JADX INFO: renamed from: l.zhq0$a */
    public class RunnableC21700a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ t2f f203215a;

        public RunnableC21700a(t2f t2fVar) {
            this.f203215a = t2fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            zhq0.this.m218840t(this.f203215a);
        }
    }

    /* JADX INFO: renamed from: l.zhq0$b */
    public class RunnableC21701b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ bj60 f203217a;

        public RunnableC21701b(bj60 bj60Var) {
            this.f203217a = bj60Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            zhq0.this.m218841u(this.f203217a);
        }
    }

    /* JADX INFO: renamed from: l.zhq0$c */
    public class C21702c extends njq0.AbstractRunnableC18717c {

        /* JADX INFO: renamed from: l.zhq0$c$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                zhq0.this.m218843x();
            }
        }

        public C21702c() {
        }

        @Override // p149l.njq0.AbstractRunnableC18717c
        /* JADX INFO: renamed from: a */
        public String mo86627a() {
            return "100888";
        }

        @Override // java.lang.Runnable
        public void run() {
            if (zhq0.this.m218830a() > 0) {
                zhq0.this.f203207a.execute(new a());
            }
        }
    }

    /* JADX INFO: renamed from: l.zhq0$d */
    public class C21703d extends njq0.AbstractRunnableC18717c {

        /* JADX INFO: renamed from: l.zhq0$d$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                zhq0.this.m218844y();
            }
        }

        public C21703d() {
        }

        @Override // p149l.njq0.AbstractRunnableC18717c
        /* JADX INFO: renamed from: a */
        public String mo86627a() {
            return "100889";
        }

        @Override // java.lang.Runnable
        public void run() {
            if (zhq0.this.m218838q() > 0) {
                zhq0.this.f203207a.execute(new a());
            }
        }
    }

    /* JADX INFO: renamed from: l.zhq0$e */
    public class RunnableC21704e implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ cmq0 f203223a;

        public RunnableC21704e(cmq0 cmq0Var) {
            this.f203223a = cmq0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f203223a.run();
        }
    }

    /* JADX INFO: renamed from: l.zhq0$f */
    public class RunnableC21705f implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ dmq0 f203225a;

        public RunnableC21705f(dmq0 dmq0Var) {
            this.f203225a = dmq0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f203225a.run();
        }
    }

    static {
        f203205i = fvq0.m123355i() ? 30 : 10;
    }

    private zhq0(Context context) {
        this.f203210d = context;
    }

    /* JADX INFO: renamed from: A */
    private void m218829A() {
        if (m218833f(this.f203210d).m218846d().m176524h()) {
            dmq0 dmq0Var = new dmq0(this.f203210d);
            int iM176521e = (int) m218833f(this.f203210d).m218846d().m176521e();
            if (iM176521e < 1800) {
                iM176521e = 1800;
            }
            if (System.currentTimeMillis() - gmq0.m127046c(this.f203210d).m127047a("sp_client_report_status", "perf_last_upload_time", 0L) > iM176521e * 1000) {
                njq0.m159772f(this.f203210d).m159774h(new RunnableC21705f(dmq0Var), 15);
            }
            synchronized (zhq0.class) {
                try {
                    if (!njq0.m159772f(this.f203210d).m159777k(dmq0Var, iM176521e)) {
                        njq0.m159772f(this.f203210d).m159775i("100887");
                        njq0.m159772f(this.f203210d).m159777k(dmq0Var, iM176521e);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public int m218830a() {
        HashMap<String, ArrayList<siq0>> map = this.f203209c;
        if (map == null) {
            return 0;
        }
        Iterator<String> it = map.keySet().iterator();
        int size = 0;
        while (it.hasNext()) {
            ArrayList<siq0> arrayList = this.f203209c.get(it.next());
            size += arrayList != null ? arrayList.size() : 0;
        }
        return size;
    }

    /* JADX INFO: renamed from: f */
    public static zhq0 m218833f(Context context) {
        if (f203206j == null) {
            synchronized (zhq0.class) {
                try {
                    if (f203206j == null) {
                        f203206j = new zhq0(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f203206j;
    }

    /* JADX INFO: renamed from: o */
    private void m218837o(njq0.AbstractRunnableC18717c abstractRunnableC18717c, int i) {
        njq0.m159772f(this.f203210d).m159780n(abstractRunnableC18717c, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public int m218838q() {
        HashMap<String, HashMap<String, siq0>> map = this.f203208b;
        int i = 0;
        if (map != null) {
            Iterator<String> it = map.keySet().iterator();
            while (it.hasNext()) {
                HashMap<String, siq0> map2 = this.f203208b.get(it.next());
                if (map2 != null) {
                    Iterator<String> it2 = map2.keySet().iterator();
                    while (it2.hasNext()) {
                        siq0 siq0Var = map2.get(it2.next());
                        if (siq0Var instanceof bj60) {
                            i = (int) (((long) i) + ((bj60) siq0Var).f75886i);
                        }
                    }
                }
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public void m218840t(t2f t2fVar) {
        mql mqlVar = this.f203213g;
        if (mqlVar != null) {
            mqlVar.mo150542a(t2fVar);
            if (m218830a() < 10) {
                m218837o(new C21702c(), f203205i);
            } else {
                m218843x();
                njq0.m159772f(this.f203210d).m159775i("100888");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public void m218841u(bj60 bj60Var) {
        rzl rzlVar = this.f203214h;
        if (rzlVar != null) {
            rzlVar.mo150542a(bj60Var);
            if (m218838q() < 10) {
                m218837o(new C21703d(), f203205i);
            } else {
                m218844y();
                njq0.m159772f(this.f203210d).m159775i("100889");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public void m218843x() {
        try {
            this.f203213g.mo150543b();
        } catch (Exception e) {
            ilq0.m137025B("we: " + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public void m218844y() {
        try {
            this.f203214h.mo150543b();
        } catch (Exception e) {
            ilq0.m137025B("wp: " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: z */
    private void m218845z() {
        if (m218833f(this.f203210d).m218846d().m176523g()) {
            cmq0 cmq0Var = new cmq0(this.f203210d);
            int iM176519c = (int) m218833f(this.f203210d).m218846d().m176519c();
            if (iM176519c < 1800) {
                iM176519c = 1800;
            }
            if (System.currentTimeMillis() - gmq0.m127046c(this.f203210d).m127047a("sp_client_report_status", "event_last_upload_time", 0L) > iM176519c * 1000) {
                njq0.m159772f(this.f203210d).m159774h(new RunnableC21704e(cmq0Var), 10);
            }
            synchronized (zhq0.class) {
                try {
                    if (!njq0.m159772f(this.f203210d).m159777k(cmq0Var, iM176519c)) {
                        njq0.m159772f(this.f203210d).m159775i("100886");
                        njq0.m159772f(this.f203210d).m159777k(cmq0Var, iM176519c);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public synchronized qu5 m218846d() {
        try {
            if (this.f203211e == null) {
                this.f203211e = qu5.m176517a(this.f203210d);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f203211e;
    }

    /* JADX INFO: renamed from: e */
    public t2f m218847e(int i, String str) {
        t2f t2fVar = new t2f();
        t2fVar.f167468k = str;
        t2fVar.f167467j = System.currentTimeMillis();
        t2fVar.f167466i = i;
        t2fVar.f167465h = vlq0.m198838a(6);
        t2fVar.f164730a = 1000;
        t2fVar.f164732c = 1001;
        t2fVar.f164731b = "E100004";
        t2fVar.m184352a(this.f203210d.getPackageName());
        t2fVar.m184353b(this.f203212f);
        return t2fVar;
    }

    /* JADX INFO: renamed from: g */
    public void m218848g() {
        m218833f(this.f203210d).m218845z();
        m218833f(this.f203210d).m218829A();
    }

    /* JADX INFO: renamed from: h */
    public void m218849h(String str) {
        this.f203212f = str;
    }

    /* JADX INFO: renamed from: i */
    public void m218850i(qu5 qu5Var, mql mqlVar, rzl rzlVar) {
        this.f203211e = qu5Var;
        this.f203213g = mqlVar;
        this.f203214h = rzlVar;
        mqlVar.mo155957b(this.f203209c);
        this.f203214h.mo150544c(this.f203208b);
    }

    /* JADX INFO: renamed from: j */
    public void m218851j(t2f t2fVar) {
        if (m218846d().m176523g()) {
            this.f203207a.execute(new RunnableC21700a(t2fVar));
        }
    }

    /* JADX INFO: renamed from: k */
    public void m218852k(bj60 bj60Var) {
        if (m218846d().m176524h()) {
            this.f203207a.execute(new RunnableC21701b(bj60Var));
        }
    }

    /* JADX INFO: renamed from: p */
    public void m218853p(boolean z, boolean z2, long j, long j2) {
        qu5 qu5Var = this.f203211e;
        if (qu5Var != null) {
            if (z == qu5Var.m176523g() && z2 == this.f203211e.m176524h() && j == this.f203211e.m176519c() && j2 == this.f203211e.m176521e()) {
                return;
            }
            long jM176519c = this.f203211e.m176519c();
            long jM176521e = this.f203211e.m176521e();
            qu5 qu5VarM176532h = qu5.m176518b().m176533i(fmq0.m122192b(this.f203210d)).m176534j(this.f203211e.m176522f()).m176536l(z).m176535k(j).m176539o(z2).m176538n(j2).m176532h(this.f203210d);
            this.f203211e = qu5VarM176532h;
            if (!qu5VarM176532h.m176523g()) {
                njq0.m159772f(this.f203210d).m159775i("100886");
            } else if (jM176519c != qu5VarM176532h.m176519c()) {
                ilq0.m137053z(this.f203210d.getPackageName() + "reset event job " + qu5VarM176532h.m176519c());
                m218845z();
            }
            if (!this.f203211e.m176524h()) {
                njq0.m159772f(this.f203210d).m159775i("100887");
                return;
            }
            if (jM176521e != qu5VarM176532h.m176521e()) {
                ilq0.m137053z(this.f203210d.getPackageName() + " reset perf job " + qu5VarM176532h.m176521e());
                m218829A();
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public void m218854s() {
        if (m218846d().m176523g()) {
            emq0 emq0Var = new emq0();
            emq0Var.m117217a(this.f203210d);
            emq0Var.m117218b(this.f203213g);
            this.f203207a.execute(emq0Var);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m218855w() {
        if (m218846d().m176524h()) {
            emq0 emq0Var = new emq0();
            emq0Var.m117218b(this.f203214h);
            emq0Var.m117217a(this.f203210d);
            this.f203207a.execute(emq0Var);
        }
    }
}
