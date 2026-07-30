package p153l;

import androidx.annotation.WorkerThread;
import com.immomo.resdownloader.log.MLog;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class bje {

    /* JADX INFO: renamed from: b */
    private final af00 f76980b;

    /* JADX INFO: renamed from: c */
    private Map<String, aje> f76981c;

    /* JADX INFO: renamed from: d */
    private volatile boolean f76982d;

    /* JADX INFO: renamed from: a */
    private List<InterfaceC16025b> f76979a = new ArrayList();

    /* JADX INFO: renamed from: e */
    private List<Long> f76983e = new ArrayList();

    /* JADX INFO: renamed from: f */
    private Object f76984f = new Object();

    /* JADX INFO: renamed from: l.bje$a */
    public class RunnableC16024a implements Runnable {
        public RunnableC16024a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (bje.this.f76982d) {
                bje.this.m104613e(true, "");
                return;
            }
            try {
                MLog.m20458d("lclclc ------\nlclclc -----", "config请求", new Object[0]);
                boolean zM104614h = bje.this.m104614h();
                bje bjeVar = bje.this;
                if (!zM104614h) {
                    bjeVar.m104613e(false, "请求过于频繁");
                    return;
                }
                bje.this.m104616g(new JSONObject(l3d0.m152689c(cje.m110118f((aje[]) bjeVar.f76981c.values().toArray(new aje[bje.this.f76981c.size()])))));
                MLog.m20458d("lclcl_", "拉取配置完成，结果：" + bje.this.f76982d, new Object[0]);
                bje bjeVar2 = bje.this;
                bjeVar2.m104613e(bjeVar2.f76982d, bje.this.f76982d ? "" : "拉取配置失败");
            } catch (Exception e) {
                MLog.printErrStackTrace("SDKResource", e);
            }
        }
    }

    /* JADX INFO: renamed from: l.bje$b */
    public interface InterfaceC16025b {
        /* JADX INFO: renamed from: a */
        void mo97272a();

        void onFailed(String str);
    }

    public bje(Map<String, aje> map, af00 af00Var) {
        this.f76981c = map;
        this.f76980b = af00Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m104613e(boolean z, String str) {
        synchronized (this) {
            try {
                for (InterfaceC16025b interfaceC16025b : new ArrayList(this.f76979a)) {
                    if (z) {
                        interfaceC16025b.mo97272a();
                    } else {
                        interfaceC16025b.onFailed(str);
                    }
                }
                this.f76979a.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public synchronized boolean m104614h() {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            List<Long> list = this.f76983e;
            ArrayList arrayList = new ArrayList();
            this.f76983e = arrayList;
            arrayList.addAll(list);
            for (Long l2 : list) {
                if (jCurrentTimeMillis - l2.longValue() > HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT) {
                    this.f76983e.remove(l2);
                }
            }
            if (this.f76983e.size() >= 5) {
                return false;
            }
            this.f76983e.add(Long.valueOf(jCurrentTimeMillis));
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: f */
    public void m104615f() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (aje ajeVar : this.f76981c.values()) {
            boolean z = false;
            int iM117492b = dq80.m117492b(ajeVar.m98367b(), 0);
            int iM117492b2 = dq80.m117492b(cje.m110119g(ajeVar.m98367b()), 0);
            int i = l3d0.f129864f;
            String strM117494d = dq80.m117494d(cje.m110117e(ajeVar.m98367b()), null);
            boolean zM219742o = zie.m219742o(ajeVar);
            if (!zM219742o) {
                iM117492b2 = 0;
            }
            String str = zM219742o ? strM117494d : null;
            if (ajeVar.m98373h()) {
                if (i == iM117492b && zM219742o) {
                    z = true;
                }
                zM219742o = z;
            }
            ajeVar.m98374i(zM219742o);
            ajeVar.m98378m(iM117492b2);
            ajeVar.m98375j(str);
            MLog.m20458d("SDKResource", "%s: isEnable: %b version: %d  guid: %s", ajeVar.m98367b(), Boolean.valueOf(zM219742o), Integer.valueOf(iM117492b2), str);
        }
        MLog.m20458d("SDKResource", "本地数据填充完成, cast time: %d", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
    }

    @WorkerThread
    /* JADX INFO: renamed from: g */
    public void m104616g(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        synchronized (this.f76984f) {
            try {
                if (this.f76982d) {
                    return;
                }
                MLog.m20458d("SDKResource", "onFetchServerData: \n%s", jSONObject);
                JSONObject jSONObjectM110126n = cje.m110126n(jSONObject);
                if (jSONObjectM110126n == null) {
                    return;
                }
                Iterator<String> itKeys = jSONObjectM110126n.keys();
                if (itKeys == null) {
                    return;
                }
                while (itKeys.hasNext()) {
                    aje ajeVar = this.f76981c.get(itKeys.next());
                    if (ajeVar != null) {
                        MLog.m20458d("SDKResource", "item: " + ajeVar.m98367b(), new Object[0]);
                        if (ajeVar.m98369d() == null) {
                            cje.m110130r(jSONObjectM110126n, ajeVar);
                        }
                    }
                }
                this.f76982d = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public void m104617i(InterfaceC16025b interfaceC16025b) {
        MLog.m20458d("SDKResource", "requestAllConfigs", new Object[0]);
        MLog.m20458d("lclclc_", " requestAllConfigs  进来了", new Object[0]);
        synchronized (this) {
            try {
                this.f76979a.add(interfaceC16025b);
                if (this.f76979a.size() > 1) {
                    return;
                }
                if (!this.f76982d) {
                    gyi0.m132965d(1, new RunnableC16024a());
                } else {
                    MLog.m20458d("lclcl_", "已经拉取过配置", new Object[0]);
                    m104613e(true, "");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
