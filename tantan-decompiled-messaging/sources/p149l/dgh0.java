package p149l;

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
class dgh0 {

    /* JADX INFO: renamed from: a */
    private Map<whe, List<C16363e>> f86082a;

    /* JADX INFO: renamed from: b */
    private Map<String, Integer> f86083b;

    /* JADX INFO: renamed from: c */
    private final Object f86084c;

    /* JADX INFO: renamed from: l.dgh0$a */
    public class RunnableC16359a implements Runnable {
        public RunnableC16359a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                synchronized (dgh0.this.f86084c) {
                    try {
                        whe wheVarM111637l = dgh0.this.m111637l();
                        if (wheVarM111637l == null) {
                            return;
                        }
                        MLog.m19459d("SDKResource", "开始下载资源: %s", wheVarM111637l.m203126b());
                        yq4 yq4VarM111639n = dgh0.this.m111639n(wheVarM111637l, true);
                        MLog.m19459d("SDKResource", "完成资源下载(%s): %s", !yq4VarM111639n.m215701c() ? "成功" : "失败", wheVarM111637l.m203126b());
                        synchronized (dgh0.this.f86084c) {
                            try {
                                dgh0.this.m111638m(yq4VarM111639n, wheVarM111637l);
                                if (dgh0.this.f86082a.isEmpty()) {
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

    /* JADX INFO: renamed from: l.dgh0$b */
    public static class C16360b {

        /* JADX INFO: renamed from: a */
        private static dgh0 f86086a = new dgh0(null);
    }

    /* JADX INFO: renamed from: l.dgh0$d */
    public static class C16362d {
        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public static List<xq4> m111650b(whe wheVar) {
            dje0 dje0VarM203128d = wheVar.m203128d();
            ArrayList arrayList = new ArrayList(4);
            boolean zM214808k = yhe.m214808k(dje0VarM203128d);
            if (dje0VarM203128d.m112034i()) {
                arrayList.add(new sjy());
            } else {
                arrayList.add(new z7e());
            }
            if (!zM214808k) {
                arrayList.add(new h0l0());
            }
            arrayList.add(new f0l0());
            if (yhe.m214810m(dje0VarM203128d)) {
                arrayList.add(new xkj0());
                arrayList.add(new mc2());
            }
            arrayList.add(new zqc0());
            arrayList.add(new lc2());
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: l.dgh0$e */
    public static class C16363e {

        /* JADX INFO: renamed from: a */
        private egh0 f86096a;

        /* JADX INFO: renamed from: c */
        private final int f86098c;

        /* JADX INFO: renamed from: e */
        private volatile int f86100e;

        /* JADX INFO: renamed from: b */
        private Map<whe, Boolean> f86097b = new ArrayMap();

        /* JADX INFO: renamed from: d */
        private AtomicInteger f86099d = new AtomicInteger(0);

        /* JADX INFO: renamed from: l.dgh0$e$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ int f86101a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ String f86102b;

            public a(int i, String str) {
                this.f86101a = i;
                this.f86102b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                C16363e.this.f86096a.m116285c(this.f86101a, this.f86102b);
            }
        }

        /* JADX INFO: renamed from: l.dgh0$e$b */
        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C16363e.this.f86096a.m116287e();
            }
        }

        /* JADX INFO: renamed from: l.dgh0$e$c */
        public class c implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ int f86105a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ double f86106b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ whe f86107c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ float f86108d;

            public c(int i, double d, whe wheVar, float f) {
                this.f86105a = i;
                this.f86106b = d;
                this.f86107c = wheVar;
                this.f86108d = f;
            }

            @Override // java.lang.Runnable
            public void run() {
                C16363e.this.f86096a.m116286d(this.f86105a, this.f86106b);
                MLog.m19459d("SDKResource", "%s process: %d  itemPercent: %s", this.f86107c.m203126b(), Integer.valueOf(this.f86105a), Float.valueOf(this.f86108d + 1.0f));
            }
        }

        public C16363e(egh0 egh0Var) {
            this.f86096a = egh0Var;
            for (whe wheVar : egh0Var.f90946b) {
                this.f86097b.put(wheVar, Boolean.FALSE);
            }
            this.f86098c = egh0Var.f90946b.length;
        }

        /* JADX INFO: renamed from: b */
        public void m111652b() {
            ppw.m170871b(new b());
        }

        /* JADX INFO: renamed from: c */
        public void m111653c(int i, String str) {
            ppw.m170871b(new a(i, str));
        }

        /* JADX INFO: renamed from: d */
        public void m111654d(whe wheVar) {
            if (!this.f86097b.get(wheVar).booleanValue()) {
                this.f86097b.put(wheVar, Boolean.TRUE);
                this.f86099d.incrementAndGet();
            }
            if (this.f86099d.get() == this.f86098c) {
                m111652b();
            }
        }

        /* JADX INFO: renamed from: e */
        public void m111655e(float f, double d, whe wheVar) {
            float f2 = this.f86099d.get() * 1.0f;
            int i = this.f86098c;
            float f3 = f2 / i;
            int i2 = (int) (((1.0f / i) * f) + (100.0f * f3));
            if (this.f86100e >= i2) {
                return;
            }
            this.f86100e = i2;
            ppw.m170871b(new c(i2, d, wheVar, f3));
        }
    }

    private dgh0() {
        this.f86082a = new LinkedHashMap();
        this.f86084c = new Object();
    }

    /* JADX INFO: renamed from: f */
    private String m111632f(whe wheVar) {
        dje0 dje0VarM203128d = wheVar.m203128d();
        if (!ma20.m153634f()) {
            if (!yhe.m214799b(wheVar.m203126b(), dje0VarM203128d.m112034i() ? dje0VarM203128d.m112030e() : dje0VarM203128d.m112032g())) {
                synchronized (this.f86084c) {
                    try {
                        Iterator<C16363e> it = this.f86082a.get(wheVar).iterator();
                        boolean z = true;
                        while (it.hasNext()) {
                            if (!it.next().f86096a.f90945a) {
                                z = false;
                            }
                        }
                        if (!z) {
                            return null;
                        }
                        return wheVar.m203126b() + ": 4G环境下取消自动下载大文件";
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    private void m111633h() {
        epi0.m117639d(1, new RunnableC16359a());
    }

    /* JADX INFO: renamed from: i */
    private yq4 m111634i(List<xq4> list, whe wheVar, yq4 yq4Var, boolean z) {
        boolean zMo98595e;
        C16361c c16361c = new C16361c(this, null);
        if (z) {
            c16361c.m111647f(list, wheVar);
        }
        yhe.m214813p(wheVar);
        for (xq4 xq4Var : list) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                xq4Var.m210549g(yq4Var);
                zMo98595e = xq4Var.mo98595e(wheVar);
                if (z) {
                    c16361c.m111645d(xq4Var, wheVar, -1.0d, 1.0f);
                }
                MLog.m19459d("SDKResource", "完成职责：%s::%s::time: %s", xq4Var.m210547d(), wheVar.m203126b(), Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            } catch (Exception e) {
                MLog.printErrStackTrace("SDKResource", e);
                xq4Var.m210551i(7, e);
                zMo98595e = false;
            }
            if (!zMo98595e) {
                MLog.m19459d("SDKResource", "%s\n%s", xq4Var.m210547d(), yq4Var.m215699a());
                yhe.m214813p(wheVar);
                m111636k(wheVar);
                yq4Var.m215704f(true);
                if (yq4Var.m215700b() != 0) {
                    break;
                }
                yq4Var.m215703e(14, yq4Var.m215699a() + " handle failed " + xq4Var.m210547d());
                break;
            }
        }
        MLog.m19459d("SDKResource", "资源同步任务完成 : %s", wheVar.m203126b());
        if (z) {
            c16361c.m111646e(100, -1.0d, wheVar);
        }
        return yq4Var;
    }

    /* JADX INFO: renamed from: j */
    public static dgh0 m111635j() {
        return C16360b.f86086a;
    }

    /* JADX INFO: renamed from: k */
    private void m111636k(whe wheVar) {
        int iValueOf;
        if (wheVar.m203128d().m112034i()) {
            if (this.f86083b == null) {
                this.f86083b = new ArrayMap();
            }
            Integer num = this.f86083b.get(wheVar.m203126b());
            if (num == null) {
                iValueOf = 1;
            } else {
                if (num.intValue() >= 1) {
                    MLog.m19459d("SDKResource", "%s 增量更新失败，进行全量更新", wheVar.m203126b());
                    wheVar.m203128d().m112035j(false);
                    return;
                }
                iValueOf = Integer.valueOf(num.intValue() + 1);
            }
            MLog.m19459d("SDKResource", "增量更新失败：%d", iValueOf);
            this.f86083b.put(wheVar.m203126b(), iValueOf);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public whe m111637l() {
        whe wheVar;
        synchronized (this.f86084c) {
            try {
                wheVar = null;
                long jM203127c = -1;
                for (whe wheVar2 : this.f86082a.keySet()) {
                    if (wheVar2.m203127c() > jM203127c) {
                        jM203127c = wheVar2.m203127c();
                        wheVar = wheVar2;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return wheVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public void m111638m(yq4 yq4Var, whe wheVar) {
        List<C16363e> list;
        synchronized (this.f86084c) {
            try {
                List<C16363e> list2 = this.f86082a.get(wheVar);
                if (list2 == null) {
                    return;
                }
                this.f86082a.remove(wheVar);
                for (C16363e c16363e : list2) {
                    if (yq4Var.m215701c()) {
                        c16363e.m111653c(yq4Var.m215700b(), yq4Var.m215699a());
                        for (whe wheVar2 : c16363e.f86096a.f90946b) {
                            if (wheVar2 != wheVar && (list = this.f86082a.get(wheVar2)) != null && list.remove(c16363e) && list.isEmpty()) {
                                this.f86082a.remove(wheVar2);
                                MLog.m19459d("SDKResource", "%s 因为%s失败而被取消下载", wheVar2.m203126b(), wheVar.m203126b());
                            }
                        }
                    } else {
                        c16363e.m111654d(wheVar);
                    }
                }
                if (yq4Var.m215701c()) {
                    the.m188901a(wheVar, yq4Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public yq4 m111639n(whe wheVar, boolean z) {
        String strM111632f;
        dje0 dje0VarM203128d = wheVar.m203128d();
        yq4 yq4Var = new yq4();
        if (dje0VarM203128d == null) {
            yhe.m214800c(wheVar);
            if (wheVar.m203128d() == null) {
                rwc0.m181387a("Event_Resource_CONFIG", 0, null);
                yq4Var.m215704f(true);
                yq4Var.m215703e(1, wheVar.m203126b() + " 拉取服务器配置信息失败");
                return yq4Var;
            }
            rwc0.m181387a("Event_Resource_CONFIG", 1, null);
            MLog.m19459d("SDKResource", "%s 拉取ServerConfig成功", wheVar.m203126b());
        }
        if (wheVar.m203131g()) {
            MLog.m19459d("SDKResource", wheVar.m203126b() + ":资源可用，不需要同步", new Object[0]);
            return yq4Var;
        }
        if (z && (strM111632f = m111632f(wheVar)) != null) {
            yq4Var.m215704f(true);
            yq4Var.m215703e(12, strM111632f);
            return yq4Var;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(C16362d.m111650b(wheVar));
        arrayList.add(new asj0());
        if (!arrayList.isEmpty()) {
            return m111634i(arrayList, wheVar, yq4Var, z);
        }
        yq4Var.m215704f(true);
        yq4Var.m215703e(10000, ":职责链为空，请检查代码逻辑");
        return yq4Var;
    }

    /* JADX INFO: renamed from: g */
    public void m111640g(egh0 egh0Var) {
        if (egh0Var == null) {
            return;
        }
        MLog.m19459d("SDKResource", " execute: %s", Arrays.asList(egh0Var.f90946b));
        C16363e c16363e = new C16363e(egh0Var);
        if (egh0Var.f90946b.length == 0) {
            c16363e.m111653c(0, "请求下载的资源集合为空");
            return;
        }
        synchronized (this.f86084c) {
            try {
                boolean zIsEmpty = this.f86082a.isEmpty();
                for (whe wheVar : egh0Var.f90946b) {
                    if (wheVar.m203131g()) {
                        c16363e.m111655e(100.0f, -1.0d, wheVar);
                    }
                    List<C16363e> linkedList = this.f86082a.get(wheVar);
                    if (linkedList == null) {
                        linkedList = new LinkedList<>();
                        this.f86082a.put(wheVar, linkedList);
                    }
                    linkedList.add(c16363e);
                    if (wheVar.m203131g()) {
                        m111638m(new yq4(), wheVar);
                    }
                }
                if (zIsEmpty) {
                    m111633h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: l.dgh0$c */
    public class C16361c {

        /* JADX INFO: renamed from: a */
        int f86087a;

        /* JADX INFO: renamed from: b */
        int f86088b;

        /* JADX INFO: renamed from: c */
        int f86089c;

        /* JADX INFO: renamed from: d */
        xq4 f86090d;

        /* JADX INFO: renamed from: e */
        int f86091e;

        /* JADX INFO: renamed from: f */
        int f86092f;

        /* JADX INFO: renamed from: l.dgh0$c$a */
        public class a implements xq4.InterfaceC21198a {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ whe f86094a;

            public a(whe wheVar) {
                this.f86094a = wheVar;
            }

            @Override // p149l.xq4.InterfaceC21198a
            /* JADX INFO: renamed from: a */
            public void mo111648a(float f, double d, xq4 xq4Var) {
                C16361c.this.m111645d(xq4Var, this.f86094a, d, f);
            }
        }

        private C16361c() {
            this.f86089c = 0;
            this.f86091e = 0;
            this.f86092f = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public void m111645d(xq4 xq4Var, whe wheVar, double d, float f) {
            if (this.f86090d != xq4Var) {
                this.f86089c += this.f86091e + this.f86092f;
                this.f86091e = 0;
                this.f86092f = 0;
                this.f86090d = xq4Var;
            }
            int iM210546c = xq4Var.m210546c();
            if (iM210546c == 1) {
                this.f86092f = (int) (((iM210546c * f) / this.f86088b) * 10.0f);
            } else {
                this.f86091e = (int) (((iM210546c * f) / this.f86087a) * 90.0f);
            }
            m111646e(this.f86089c + this.f86092f + this.f86091e, d, wheVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: e */
        public void m111646e(int i, double d, whe wheVar) {
            synchronized (dgh0.this.f86084c) {
                try {
                    List list = (List) dgh0.this.f86082a.get(wheVar);
                    if (list == null) {
                        return;
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((C16363e) it.next()).m111655e(i, d, wheVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public void m111647f(List<xq4> list, whe wheVar) {
            int iM210546c = 0;
            int i = 0;
            for (xq4 xq4Var : list) {
                if (xq4Var.m210546c() == 1) {
                    i++;
                } else {
                    iM210546c += xq4Var.m210546c();
                }
            }
            this.f86087a = iM210546c;
            this.f86088b = i;
            a aVar = new a(wheVar);
            Iterator<xq4> it = list.iterator();
            while (it.hasNext()) {
                it.next().m210548f(aVar);
            }
        }

        public /* synthetic */ C16361c(dgh0 dgh0Var, RunnableC16359a runnableC16359a) {
            this();
        }
    }

    public /* synthetic */ dgh0(RunnableC16359a runnableC16359a) {
        this();
    }
}
