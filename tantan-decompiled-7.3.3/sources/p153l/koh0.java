package p153l;

import android.util.ArrayMap;
import com.immomo.resdownloader.log.MLog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
class koh0 {

    /* JADX INFO: renamed from: a */
    private Map<aje, List<C18231e>> f127729a;

    /* JADX INFO: renamed from: b */
    private Map<String, Integer> f127730b;

    /* JADX INFO: renamed from: c */
    private final Object f127731c;

    /* JADX INFO: renamed from: l.koh0$a */
    public class RunnableC18227a implements Runnable {
        public RunnableC18227a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                synchronized (koh0.this.f127731c) {
                    try {
                        aje ajeVarM150616l = koh0.this.m150616l();
                        if (ajeVarM150616l == null) {
                            return;
                        }
                        MLog.m20458d("SDKResource", "开始下载资源: %s", ajeVarM150616l.m98367b());
                        xr4 xr4VarM150618n = koh0.this.m150618n(ajeVarM150616l, true);
                        MLog.m20458d("SDKResource", "完成资源下载(%s): %s", !xr4VarM150618n.m212776c() ? "成功" : "失败", ajeVarM150616l.m98367b());
                        synchronized (koh0.this.f127731c) {
                            try {
                                koh0.this.m150617m(xr4VarM150618n, ajeVarM150616l);
                                if (koh0.this.f127729a.isEmpty()) {
                                    return;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.koh0$b */
    public static class C18228b {

        /* JADX INFO: renamed from: a */
        private static koh0 f127733a = new koh0(null);
    }

    /* JADX INFO: renamed from: l.koh0$d */
    public static class C18230d {
        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public static List<wr4> m150629b(aje ajeVar) {
            ire0 ire0VarM98369d = ajeVar.m98369d();
            ArrayList arrayList = new ArrayList(4);
            boolean zM110123k = cje.m110123k(ire0VarM98369d);
            if (ire0VarM98369d.m141819i()) {
                arrayList.add(new psy());
            } else {
                arrayList.add(new m9e());
            }
            if (!zM110123k) {
                arrayList.add(new m9l0());
            }
            arrayList.add(new k9l0());
            if (cje.m110125m(ire0VarM98369d)) {
                arrayList.add(new auj0());
                arrayList.add(new tc2());
            }
            arrayList.add(new ezc0());
            arrayList.add(new sc2());
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: l.koh0$e */
    public static class C18231e {

        /* JADX INFO: renamed from: a */
        private loh0 f127743a;

        /* JADX INFO: renamed from: c */
        private final int f127745c;

        /* JADX INFO: renamed from: e */
        private volatile int f127747e;

        /* JADX INFO: renamed from: b */
        private Map<aje, Boolean> f127744b = new ArrayMap();

        /* JADX INFO: renamed from: d */
        private AtomicInteger f127746d = new AtomicInteger(0);

        /* JADX INFO: renamed from: l.koh0$e$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ int f127748a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ String f127749b;

            public a(int i, String str) {
                this.f127748a = i;
                this.f127749b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                C18231e.this.f127743a.m155055c(this.f127748a, this.f127749b);
            }
        }

        /* JADX INFO: renamed from: l.koh0$e$b */
        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C18231e.this.f127743a.m155057e();
            }
        }

        /* JADX INFO: renamed from: l.koh0$e$c */
        public class c implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ int f127752a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ double f127753b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ aje f127754c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ float f127755d;

            public c(int i, double d, aje ajeVar, float f) {
                this.f127752a = i;
                this.f127753b = d;
                this.f127754c = ajeVar;
                this.f127755d = f;
            }

            @Override // java.lang.Runnable
            public void run() {
                C18231e.this.f127743a.m155056d(this.f127752a, this.f127753b);
                MLog.m20458d("SDKResource", "%s process: %d  itemPercent: %s", this.f127754c.m98367b(), Integer.valueOf(this.f127752a), Float.valueOf(this.f127755d + 1.0f));
            }
        }

        public C18231e(loh0 loh0Var) {
            this.f127743a = loh0Var;
            for (aje ajeVar : loh0Var.f132900b) {
                this.f127744b.put(ajeVar, Boolean.FALSE);
            }
            this.f127745c = loh0Var.f132900b.length;
        }

        /* JADX INFO: renamed from: b */
        public void m150631b() {
            osw.m169064b(new b());
        }

        /* JADX INFO: renamed from: c */
        public void m150632c(int i, String str) {
            osw.m169064b(new a(i, str));
        }

        /* JADX INFO: renamed from: d */
        public void m150633d(aje ajeVar) {
            if (!this.f127744b.get(ajeVar).booleanValue()) {
                this.f127744b.put(ajeVar, Boolean.TRUE);
                this.f127746d.incrementAndGet();
            }
            if (this.f127746d.get() == this.f127745c) {
                m150631b();
            }
        }

        /* JADX INFO: renamed from: e */
        public void m150634e(float f, double d, aje ajeVar) {
            float f2 = this.f127746d.get() * 1.0f;
            int i = this.f127745c;
            float f3 = f2 / i;
            int i2 = (int) (((1.0f / i) * f) + (100.0f * f3));
            if (this.f127747e >= i2) {
                return;
            }
            this.f127747e = i2;
            osw.m169064b(new c(i2, d, ajeVar, f3));
        }
    }

    private koh0() {
        this.f127729a = new LinkedHashMap();
        this.f127731c = new Object();
    }

    /* JADX INFO: renamed from: f */
    private String m150611f(aje ajeVar) {
        ire0 ire0VarM98369d = ajeVar.m98369d();
        if (!vi20.m201323f()) {
            if (!cje.m110114b(ajeVar.m98367b(), ire0VarM98369d.m141819i() ? ire0VarM98369d.m141815e() : ire0VarM98369d.m141817g())) {
                synchronized (this.f127731c) {
                    try {
                        Iterator<C18231e> it = this.f127729a.get(ajeVar).iterator();
                        boolean z = true;
                        while (it.hasNext()) {
                            if (!it.next().f127743a.f132899a) {
                                z = false;
                            }
                        }
                        if (!z) {
                            return null;
                        }
                        return ajeVar.m98367b() + ": 4G环境下取消自动下载大文件";
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    private void m150612h() {
        gyi0.m132965d(1, new RunnableC18227a());
    }

    /* JADX INFO: renamed from: i */
    private xr4 m150613i(List<wr4> list, aje ajeVar, xr4 xr4Var, boolean z) {
        boolean zMo100400e;
        C18229c c18229c = new C18229c(this, null);
        if (z) {
            c18229c.m150626f(list, ajeVar);
        }
        cje.m110128p(ajeVar);
        for (wr4 wr4Var : list) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                wr4Var.m207548g(xr4Var);
                zMo100400e = wr4Var.mo100400e(ajeVar);
                if (z) {
                    c18229c.m150624d(wr4Var, ajeVar, -1.0d, 1.0f);
                }
                MLog.m20458d("SDKResource", "完成职责：%s::%s::time: %s", wr4Var.m207546d(), ajeVar.m98367b(), Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            } catch (Exception e) {
                MLog.printErrStackTrace("SDKResource", e);
                wr4Var.m207550i(7, e);
                zMo100400e = false;
            }
            if (!zMo100400e) {
                MLog.m20458d("SDKResource", "%s\n%s", wr4Var.m207546d(), xr4Var.m212774a());
                cje.m110128p(ajeVar);
                m150615k(ajeVar);
                xr4Var.m212779f(true);
                if (xr4Var.m212775b() != 0) {
                    break;
                }
                xr4Var.m212778e(14, xr4Var.m212774a() + " handle failed " + wr4Var.m207546d());
                break;
            }
        }
        MLog.m20458d("SDKResource", "资源同步任务完成 : %s", ajeVar.m98367b());
        if (z) {
            c18229c.m150625e(100, -1.0d, ajeVar);
        }
        return xr4Var;
    }

    /* JADX INFO: renamed from: j */
    public static koh0 m150614j() {
        return C18228b.f127733a;
    }

    /* JADX INFO: renamed from: k */
    private void m150615k(aje ajeVar) {
        int iValueOf;
        if (ajeVar.m98369d().m141819i()) {
            if (this.f127730b == null) {
                this.f127730b = new ArrayMap();
            }
            Integer num = this.f127730b.get(ajeVar.m98367b());
            if (num == null) {
                iValueOf = 1;
            } else {
                if (num.intValue() >= 1) {
                    MLog.m20458d("SDKResource", "%s 增量更新失败，进行全量更新", ajeVar.m98367b());
                    ajeVar.m98369d().m141820j(false);
                    return;
                }
                iValueOf = Integer.valueOf(num.intValue() + 1);
            }
            MLog.m20458d("SDKResource", "增量更新失败：%d", iValueOf);
            this.f127730b.put(ajeVar.m98367b(), iValueOf);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public aje m150616l() {
        aje ajeVar;
        synchronized (this.f127731c) {
            try {
                ajeVar = null;
                long jM98368c = -1;
                for (aje ajeVar2 : this.f127729a.keySet()) {
                    if (ajeVar2.m98368c() > jM98368c) {
                        jM98368c = ajeVar2.m98368c();
                        ajeVar = ajeVar2;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ajeVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public void m150617m(xr4 xr4Var, aje ajeVar) {
        List<C18231e> list;
        synchronized (this.f127731c) {
            try {
                List<C18231e> list2 = this.f127729a.get(ajeVar);
                if (list2 == null) {
                    return;
                }
                this.f127729a.remove(ajeVar);
                for (C18231e c18231e : list2) {
                    if (xr4Var.m212776c()) {
                        c18231e.m150632c(xr4Var.m212775b(), xr4Var.m212774a());
                        for (aje ajeVar2 : c18231e.f127743a.f132900b) {
                            if (ajeVar2 != ajeVar && (list = this.f127729a.get(ajeVar2)) != null && list.remove(c18231e) && list.isEmpty()) {
                                this.f127729a.remove(ajeVar2);
                                MLog.m20458d("SDKResource", "%s 因为%s失败而被取消下载", ajeVar2.m98367b(), ajeVar.m98367b());
                            }
                        }
                    } else {
                        c18231e.m150633d(ajeVar);
                    }
                }
                if (xr4Var.m212776c()) {
                    xie.m211140a(ajeVar, xr4Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public xr4 m150618n(aje ajeVar, boolean z) {
        String strM150611f;
        ire0 ire0VarM98369d = ajeVar.m98369d();
        xr4 xr4Var = new xr4();
        if (ire0VarM98369d == null) {
            cje.m110115c(ajeVar);
            if (ajeVar.m98369d() == null) {
                u4d0.m194475a("Event_Resource_CONFIG", 0, null);
                xr4Var.m212779f(true);
                xr4Var.m212778e(1, ajeVar.m98367b() + " 拉取服务器配置信息失败");
                return xr4Var;
            }
            u4d0.m194475a("Event_Resource_CONFIG", 1, null);
            MLog.m20458d("SDKResource", "%s 拉取ServerConfig成功", ajeVar.m98367b());
        }
        if (ajeVar.m98372g()) {
            MLog.m20458d("SDKResource", ajeVar.m98367b() + ":资源可用，不需要同步", new Object[0]);
            return xr4Var;
        }
        if (z && (strM150611f = m150611f(ajeVar)) != null) {
            xr4Var.m212779f(true);
            xr4Var.m212778e(12, strM150611f);
            return xr4Var;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(C18230d.m150629b(ajeVar));
        arrayList.add(new e1k0());
        if (!arrayList.isEmpty()) {
            return m150613i(arrayList, ajeVar, xr4Var, z);
        }
        xr4Var.m212779f(true);
        xr4Var.m212778e(10000, ":职责链为空，请检查代码逻辑");
        return xr4Var;
    }

    /* JADX INFO: renamed from: g */
    public void m150619g(loh0 loh0Var) {
        if (loh0Var == null) {
            return;
        }
        MLog.m20458d("SDKResource", " execute: %s", Arrays.asList(loh0Var.f132900b));
        C18231e c18231e = new C18231e(loh0Var);
        if (loh0Var.f132900b.length == 0) {
            c18231e.m150632c(0, "请求下载的资源集合为空");
            return;
        }
        synchronized (this.f127731c) {
            try {
                boolean zIsEmpty = this.f127729a.isEmpty();
                for (aje ajeVar : loh0Var.f132900b) {
                    if (ajeVar.m98372g()) {
                        c18231e.m150634e(100.0f, -1.0d, ajeVar);
                    }
                    List<C18231e> linkedList = this.f127729a.get(ajeVar);
                    if (linkedList == null) {
                        linkedList = new LinkedList<>();
                        this.f127729a.put(ajeVar, linkedList);
                    }
                    linkedList.add(c18231e);
                    if (ajeVar.m98372g()) {
                        m150617m(new xr4(), ajeVar);
                    }
                }
                if (zIsEmpty) {
                    m150612h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: l.koh0$c */
    public class C18229c {

        /* JADX INFO: renamed from: a */
        int f127734a;

        /* JADX INFO: renamed from: b */
        int f127735b;

        /* JADX INFO: renamed from: c */
        int f127736c;

        /* JADX INFO: renamed from: d */
        wr4 f127737d;

        /* JADX INFO: renamed from: e */
        int f127738e;

        /* JADX INFO: renamed from: f */
        int f127739f;

        /* JADX INFO: renamed from: l.koh0$c$a */
        public class a implements wr4.InterfaceC21169a {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ aje f127741a;

            public a(aje ajeVar) {
                this.f127741a = ajeVar;
            }

            @Override // p153l.wr4.InterfaceC21169a
            /* JADX INFO: renamed from: a */
            public void mo150627a(float f, double d, wr4 wr4Var) {
                C18229c.this.m150624d(wr4Var, this.f127741a, d, f);
            }
        }

        private C18229c() {
            this.f127736c = 0;
            this.f127738e = 0;
            this.f127739f = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public void m150624d(wr4 wr4Var, aje ajeVar, double d, float f) {
            if (this.f127737d != wr4Var) {
                this.f127736c += this.f127738e + this.f127739f;
                this.f127738e = 0;
                this.f127739f = 0;
                this.f127737d = wr4Var;
            }
            int iM207545c = wr4Var.m207545c();
            if (iM207545c == 1) {
                this.f127739f = (int) (((iM207545c * f) / this.f127735b) * 10.0f);
            } else {
                this.f127738e = (int) (((iM207545c * f) / this.f127734a) * 90.0f);
            }
            m150625e(this.f127736c + this.f127739f + this.f127738e, d, ajeVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: e */
        public void m150625e(int i, double d, aje ajeVar) {
            synchronized (koh0.this.f127731c) {
                try {
                    List list = (List) koh0.this.f127729a.get(ajeVar);
                    if (list == null) {
                        return;
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((C18231e) it.next()).m150634e(i, d, ajeVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public void m150626f(List<wr4> list, aje ajeVar) {
            int iM207545c = 0;
            int i = 0;
            for (wr4 wr4Var : list) {
                if (wr4Var.m207545c() == 1) {
                    i++;
                } else {
                    iM207545c += wr4Var.m207545c();
                }
            }
            this.f127734a = iM207545c;
            this.f127735b = i;
            a aVar = new a(ajeVar);
            Iterator<wr4> it = list.iterator();
            while (it.hasNext()) {
                it.next().m207547f(aVar);
            }
        }

        public /* synthetic */ C18229c(koh0 koh0Var, RunnableC18227a runnableC18227a) {
            this();
        }
    }

    public /* synthetic */ koh0(RunnableC18227a runnableC18227a) {
        this();
    }
}
