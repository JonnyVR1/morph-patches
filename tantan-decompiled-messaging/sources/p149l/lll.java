package p149l;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.putong.core.data.UserId;
import com.p046p1.mobile.putong.live.base.data.BLivePkCategory;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class lll {

    /* JADX INFO: renamed from: h */
    private static long f128717h;

    /* JADX INFO: renamed from: a */
    private final LinkedList<ConcurrentHashMap<String, String>> f128718a;

    /* JADX INFO: renamed from: b */
    private List<String> f128719b;

    /* JADX INFO: renamed from: c */
    private final Object f128720c;

    /* JADX INFO: renamed from: d */
    private final Object f128721d;

    /* JADX INFO: renamed from: e */
    private Timer f128722e;

    /* JADX INFO: renamed from: f */
    private boolean f128723f;

    /* JADX INFO: renamed from: g */
    x74 f128724g;

    /* JADX INFO: renamed from: l.lll$a */
    public class C18256a extends TimerTask {
        public C18256a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            lll.this.m150509n();
        }
    }

    /* JADX INFO: renamed from: l.lll$c */
    public class C18258c implements x74 {
        public C18258c() {
        }

        @Override // p149l.x74
        public void onFailure(sx3 sx3Var, IOException iOException) {
            hjx.m131421d("BaseHttpUtils", "updateNtpTime onFailure");
            iOException.printStackTrace();
        }

        @Override // p149l.x74
        public void onResponse(sx3 sx3Var, exc0 exc0Var) throws IOException {
            if (!exc0Var.m118597I()) {
                mll.m155165a("Unexpected code ", exc0Var);
                return;
            }
            long jM118605Z = exc0Var.m118605Z();
            long jM118603T = exc0Var.m118603T();
            hjx.m131421d("BaseHttpUtils", "sentTime: " + jM118605Z + " recvTime: " + jM118603T);
            try {
                JSONObject jSONObject = new JSONObject(exc0Var.m118606k().string());
                hjx.m131421d("BaseHttpUtils", jSONObject.toString());
                if (jSONObject.has("millisecond")) {
                    long j = jSONObject.getLong("millisecond");
                    long j2 = jM118603T - jM118605Z;
                    fjx.m121638R().m121662H1(j, j2);
                    dyx.m114098a().m114103f(j, j2);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: l.lll$d */
    public static class C18259d {

        /* JADX INFO: renamed from: a */
        private static lll f128730a = new lll(null);
    }

    private lll() {
        this.f128718a = new LinkedList<>();
        this.f128719b = new ArrayList();
        this.f128720c = new Object();
        this.f128721d = new Object();
        this.f128722e = null;
        this.f128723f = false;
        this.f128724g = new C18258c();
        this.f128719b.clear();
        this.f128719b.add("appid");
        this.f128719b.add("secret");
        this.f128719b.add("net");
        this.f128719b.add(UserId.TYPE);
        this.f128719b.add(BLivePkCategory.random);
        this.f128719b.add("time");
        this.f128719b.add("roomid");
        this.f128719b.add("publisherType");
        this.f128719b.add("sessiontime");
        this.f128719b.add("provider");
        this.f128719b.add("type");
        this.f128719b.add("body");
        this.f128719b.add("msgID");
        this.f128719b.add("businessType");
        this.f128719b.add("retryTime");
        this.f128719b.add("lat");
        this.f128719b.add("lng");
        this.f128719b.add("servicetype");
        this.f128719b.add("uuid");
        this.f128719b.add("newlog");
        this.f128719b.add("showid");
        this.f128719b.add("mTag");
        this.f128719b.add("appName");
        Collections.sort(this.f128719b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m150500c(ConcurrentHashMap<String, String> concurrentHashMap) {
        m150507l(concurrentHashMap);
        if (m150508m() > fjx.m121638R().m121745h0()) {
            hjx.m131418a("BaseHttpUtils", "addNode " + concurrentHashMap.get("msgID") + " del " + ((Object) m150505i().get("msgID")));
        } else {
            hjx.m131418a("BaseHttpUtils", "addNode [" + concurrentHashMap.get("msgID") + "] " + concurrentHashMap.get("type") + WeJson.EMPTY_ARR);
        }
        if (m150508m() <= 0 || this.f128723f) {
            return;
        }
        m150503g().scheduleAtFixedRate(new C18256a(), fjx.m121638R().m121741g0(), fjx.m121638R().m121741g0());
        this.f128723f = true;
    }

    /* JADX INFO: renamed from: d */
    public static String m150501d(String str) {
        return "https://sla-media.immomo.com/api/media/slalog?appid=" + str;
    }

    /* JADX INFO: renamed from: e */
    public static lll m150502e() {
        return C18259d.f128730a;
    }

    /* JADX INFO: renamed from: g */
    private Timer m150503g() {
        Timer timer;
        synchronized (this.f128721d) {
            try {
                if (this.f128722e == null) {
                    this.f128722e = new Timer();
                }
                hjx.m131421d("BaseHttpUtils", "getTimer " + this.f128722e);
                timer = this.f128722e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return timer;
    }

    /* JADX INFO: renamed from: h */
    private ConcurrentHashMap<String, String> m150504h() {
        ConcurrentHashMap<String, String> concurrentHashMapPeekFirst;
        synchronized (this.f128720c) {
            hjx.m131421d("BaseHttpUtils", MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            concurrentHashMapPeekFirst = this.f128718a.peekFirst();
        }
        return concurrentHashMapPeekFirst;
    }

    /* JADX INFO: renamed from: i */
    private ConcurrentHashMap<String, String> m150505i() {
        ConcurrentHashMap<String, String> concurrentHashMapPollFirst;
        synchronized (this.f128720c) {
            hjx.m131421d("BaseHttpUtils", MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            concurrentHashMapPollFirst = this.f128718a.pollFirst();
        }
        return concurrentHashMapPollFirst;
    }

    /* JADX INFO: renamed from: k */
    private void m150506k() {
        synchronized (this.f128721d) {
            try {
                hjx.m131421d("BaseHttpUtils", "releaseTimer " + this.f128722e);
                Timer timer = this.f128722e;
                if (timer != null) {
                    timer.cancel();
                }
                this.f128722e = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    private boolean m150507l(ConcurrentHashMap<String, String> concurrentHashMap) {
        boolean zAdd;
        synchronized (this.f128720c) {
            hjx.m131421d("BaseHttpUtils", "retryListAdd " + concurrentHashMap);
            zAdd = this.f128718a.add(concurrentHashMap);
        }
        return zAdd;
    }

    /* JADX INFO: renamed from: m */
    private int m150508m() {
        int size;
        synchronized (this.f128720c) {
            size = this.f128718a.size();
            hjx.m131421d("BaseHttpUtils", MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + size);
        }
        return size;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public void m150509n() {
        do {
            ConcurrentHashMap<String, String> concurrentHashMapM150504h = m150504h();
            String str = concurrentHashMapM150504h.get("time");
            concurrentHashMapM150504h.put("time", String.valueOf(dyx.m114098a().m114099b() / 1000));
            concurrentHashMapM150504h.put("retryTime", str);
            StringBuilder sb = new StringBuilder();
            Iterator<String> it = this.f128719b.iterator();
            while (it.hasNext()) {
                sb.append(concurrentHashMapM150504h.get(it.next()));
            }
            concurrentHashMapM150504h.put("sign", d0f.m109479c(sb.toString()));
            HashMap map = new HashMap();
            map.put("User-Agent", concurrentHashMapM150504h.get("User-Agent"));
            zuc0<T> zuc0VarM185439h = new igf0("https://sla-media.immomo.com/api/media/slalog", concurrentHashMapM150504h, map).m185439h();
            if (zuc0VarM185439h == 0 || !zuc0VarM185439h.m220224e()) {
                hjx.m131418a("BaseHttpUtils", "retry Node error. [" + concurrentHashMapM150504h.get("msgID") + "]  size " + m150508m());
                break;
            }
            hjx.m131418a("BaseHttpUtils", "retry Node succ. peek [" + concurrentHashMapM150504h.get("msgID") + "] " + concurrentHashMapM150504h.get("type") + WeJson.EMPTY_ARR);
            m150505i();
        } while (m150508m() > 0);
        if (m150508m() == 0) {
            m150506k();
            this.f128723f = false;
            hjx.m131418a("BaseHttpUtils", "retry Node retry list is 0. ");
        }
    }

    /* JADX INFO: renamed from: f */
    public long m150510f() {
        long j = f128717h;
        f128717h = 1 + j;
        return j;
    }

    /* JADX INFO: renamed from: j */
    public void m150511j(ConcurrentHashMap<String, String> concurrentHashMap, String str) {
        StringBuilder sb = new StringBuilder();
        for (String str2 : this.f128719b) {
            String str3 = concurrentHashMap.get(str2);
            sb.append(str3);
            hjx.m131418a("BaseHttpUtils", "key: " + str2 + " = " + str3);
        }
        concurrentHashMap.put("sign", d0f.m109479c(sb.toString()));
        hjx.m131418a("BaseHttpUtils", "key: sign = " + d0f.m109479c(sb.toString()));
        HashMap map = new HashMap();
        map.put("User-Agent", concurrentHashMap.get("User-Agent"));
        String strM150501d = m150501d(str);
        hjx.m131421d("BaseHttpUtils", "postNewMsg: [" + (f128717h - 1) + "] " + concurrentHashMap.get("type") + WeJson.EMPTY_ARR);
        new igf0(strM150501d, concurrentHashMap, map).m185438g(new C18257b(concurrentHashMap));
    }

    /* JADX INFO: renamed from: o */
    public void m150512o() throws Exception {
        stc0 stc0VarM185883b = new stc0.C20027a().m185898q("https://live-api.immomo.com/ext/server/time").m185883b();
        o850.m163105g().mo163106a("REQUEST_INSTANCE", new euc0(), stc0VarM185883b).mo96077h(this.f128724g);
    }

    /* JADX INFO: renamed from: l.lll$b */
    public class C18257b extends wtc0<se2> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ConcurrentHashMap f128726a;

        /* JADX INFO: renamed from: l.lll$b$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C18257b c18257b = C18257b.this;
                lll.this.m150500c(c18257b.f128726a);
            }
        }

        public C18257b(ConcurrentHashMap concurrentHashMap) {
            this.f128726a = concurrentHashMap;
        }

        @Override // p149l.wtc0
        public void onError(int i, String str, String str2) {
            hjx.m131418a("BaseHttpUtils", "ec " + i + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str2);
            npw.m160542a(new a());
        }

        @Override // p149l.wtc0
        public void onSuccess(int i, se2 se2Var, String str) {
            hjx.m131418a("BaseHttpUtils", "ec " + i + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str);
        }

        @Override // p149l.wtc0
        public void onCancel() {
        }

        @Override // p149l.wtc0
        public void onFinish() {
        }
    }

    public /* synthetic */ lll(C18256a c18256a) {
        this();
    }
}
