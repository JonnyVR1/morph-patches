package p149l;

import androidx.annotation.WorkerThread;
import com.immomo.resdownloader.log.MLog;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class xhe {

    /* JADX INFO: renamed from: b */
    private final r600 f192877b;

    /* JADX INFO: renamed from: c */
    private Map<String, whe> f192878c;

    /* JADX INFO: renamed from: d */
    private volatile boolean f192879d;

    /* JADX INFO: renamed from: a */
    private List<InterfaceC21152b> f192876a = new ArrayList();

    /* JADX INFO: renamed from: e */
    private List<Long> f192880e = new ArrayList();

    /* JADX INFO: renamed from: f */
    private Object f192881f = new Object();

    /* JADX INFO: renamed from: l.xhe$a */
    public class RunnableC21151a implements Runnable {
        public RunnableC21151a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (xhe.this.f192879d) {
                xhe.this.m208791e(true, "");
                return;
            }
            try {
                MLog.m19459d("lclclc ------\nlclclc -----", "config请求", new Object[0]);
                boolean zM208792h = xhe.this.m208792h();
                xhe xheVar = xhe.this;
                if (!zM208792h) {
                    xheVar.m208791e(false, "请求过于频繁");
                    return;
                }
                xhe.this.m208794g(new JSONObject(ivc0.m138542c(yhe.m214803f((whe[]) xheVar.f192878c.values().toArray(new whe[xhe.this.f192878c.size()])))));
                MLog.m19459d("lclcl_", "拉取配置完成，结果：" + xhe.this.f192879d, new Object[0]);
                xhe xheVar2 = xhe.this;
                xheVar2.m208791e(xheVar2.f192879d, xhe.this.f192879d ? "" : "拉取配置失败");
            } catch (Exception e) {
                MLog.printErrStackTrace("SDKResource", e);
            }
        }
    }

    /* JADX INFO: renamed from: l.xhe$b */
    public interface InterfaceC21152b {
        /* JADX INFO: renamed from: a */
        void mo177965a();

        void onFailed(String str);
    }

    public xhe(Map<String, whe> map, r600 r600Var) {
        this.f192878c = map;
        this.f192877b = r600Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m208791e(boolean z, String str) {
        synchronized (this) {
            try {
                for (InterfaceC21152b interfaceC21152b : new ArrayList(this.f192876a)) {
                    if (z) {
                        interfaceC21152b.mo177965a();
                    } else {
                        interfaceC21152b.onFailed(str);
                    }
                }
                this.f192876a.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public synchronized boolean m208792h() {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            List<Long> list = this.f192880e;
            ArrayList arrayList = new ArrayList();
            this.f192880e = arrayList;
            arrayList.addAll(list);
            for (Long l2 : list) {
                if (jCurrentTimeMillis - l2.longValue() > HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT) {
                    this.f192880e.remove(l2);
                }
            }
            if (this.f192880e.size() >= 5) {
                return false;
            }
            this.f192880e.add(Long.valueOf(jCurrentTimeMillis));
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: f */
    public void m208793f() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (whe wheVar : this.f192878c.values()) {
            boolean z = false;
            int iM214790b = yh80.m214790b(wheVar.m203126b(), 0);
            int iM214790b2 = yh80.m214790b(yhe.m214804g(wheVar.m203126b()), 0);
            int i = ivc0.f115117f;
            String strM214792d = yh80.m214792d(yhe.m214802e(wheVar.m203126b()), null);
            boolean zM198456o = vhe.m198456o(wheVar);
            if (!zM198456o) {
                iM214790b2 = 0;
            }
            String str = zM198456o ? strM214792d : null;
            if (wheVar.m203132h()) {
                if (i == iM214790b && zM198456o) {
                    z = true;
                }
                zM198456o = z;
            }
            wheVar.m203133i(zM198456o);
            wheVar.m203137m(iM214790b2);
            wheVar.m203134j(str);
            MLog.m19459d("SDKResource", "%s: isEnable: %b version: %d  guid: %s", wheVar.m203126b(), Boolean.valueOf(zM198456o), Integer.valueOf(iM214790b2), str);
        }
        MLog.m19459d("SDKResource", "本地数据填充完成, cast time: %d", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
    }

    @WorkerThread
    /* JADX INFO: renamed from: g */
    public void m208794g(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        synchronized (this.f192881f) {
            try {
                if (this.f192879d) {
                    return;
                }
                MLog.m19459d("SDKResource", "onFetchServerData: \n%s", jSONObject);
                JSONObject jSONObjectM214811n = yhe.m214811n(jSONObject);
                if (jSONObjectM214811n == null) {
                    return;
                }
                Iterator<String> itKeys = jSONObjectM214811n.keys();
                if (itKeys == null) {
                    return;
                }
                while (itKeys.hasNext()) {
                    whe wheVar = this.f192878c.get(itKeys.next());
                    if (wheVar != null) {
                        MLog.m19459d("SDKResource", "item: " + wheVar.m203126b(), new Object[0]);
                        if (wheVar.m203128d() == null) {
                            yhe.m214815r(jSONObjectM214811n, wheVar);
                        }
                    }
                }
                this.f192879d = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public void m208795i(InterfaceC21152b interfaceC21152b) {
        MLog.m19459d("SDKResource", "requestAllConfigs", new Object[0]);
        MLog.m19459d("lclclc_", " requestAllConfigs  进来了", new Object[0]);
        synchronized (this) {
            try {
                this.f192876a.add(interfaceC21152b);
                if (this.f192876a.size() > 1) {
                    return;
                }
                if (!this.f192879d) {
                    epi0.m117639d(1, new RunnableC21151a());
                } else {
                    MLog.m19459d("lclcl_", "已经拉取过配置", new Object[0]);
                    m208791e(true, "");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
