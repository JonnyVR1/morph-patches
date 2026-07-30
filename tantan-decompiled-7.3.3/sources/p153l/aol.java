package p153l;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.putong.core.data.UserId;
import com.p051p1.mobile.putong.live.base.data.BLivePkCategory;
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
public class aol {

    /* JADX INFO: renamed from: h */
    private static long f72460h;

    /* JADX INFO: renamed from: a */
    private final LinkedList<ConcurrentHashMap<String, String>> f72461a;

    /* JADX INFO: renamed from: b */
    private List<String> f72462b;

    /* JADX INFO: renamed from: c */
    private final Object f72463c;

    /* JADX INFO: renamed from: d */
    private final Object f72464d;

    /* JADX INFO: renamed from: e */
    private Timer f72465e;

    /* JADX INFO: renamed from: f */
    private boolean f72466f;

    /* JADX INFO: renamed from: g */
    w84 f72467g;

    /* JADX INFO: renamed from: l.aol$a */
    public class C15753a extends TimerTask {
        public C15753a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            aol.this.m99105n();
        }
    }

    /* JADX INFO: renamed from: l.aol$c */
    public class C15755c implements w84 {
        public C15755c() {
        }

        @Override // p153l.w84
        public void onFailure(ry3 ry3Var, IOException iOException) {
            esx.m122399d("BaseHttpUtils", "updateNtpTime onFailure");
            iOException.printStackTrace();
        }

        @Override // p153l.w84
        public void onResponse(ry3 ry3Var, i5d0 i5d0Var) throws IOException {
            if (!i5d0Var.m138661I()) {
                bol.m105705a("Unexpected code ", i5d0Var);
                return;
            }
            long jM138669a0 = i5d0Var.m138669a0();
            long jM138667U = i5d0Var.m138667U();
            esx.m122399d("BaseHttpUtils", "sentTime: " + jM138669a0 + " recvTime: " + jM138667U);
            try {
                JSONObject jSONObject = new JSONObject(i5d0Var.m138670k().string());
                esx.m122399d("BaseHttpUtils", jSONObject.toString());
                if (jSONObject.has("millisecond")) {
                    long j = jSONObject.getLong("millisecond");
                    long j2 = jM138667U - jM138669a0;
                    csx.m112235R().m112259H1(j, j2);
                    a7y.m96388a().m96393f(j, j2);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: l.aol$d */
    public static class C15756d {

        /* JADX INFO: renamed from: a */
        private static aol f72473a = new aol(null);
    }

    private aol() {
        this.f72461a = new LinkedList<>();
        this.f72462b = new ArrayList();
        this.f72463c = new Object();
        this.f72464d = new Object();
        this.f72465e = null;
        this.f72466f = false;
        this.f72467g = new C15755c();
        this.f72462b.clear();
        this.f72462b.add("appid");
        this.f72462b.add("secret");
        this.f72462b.add("net");
        this.f72462b.add(UserId.TYPE);
        this.f72462b.add(BLivePkCategory.random);
        this.f72462b.add("time");
        this.f72462b.add("roomid");
        this.f72462b.add("publisherType");
        this.f72462b.add("sessiontime");
        this.f72462b.add("provider");
        this.f72462b.add("type");
        this.f72462b.add("body");
        this.f72462b.add("msgID");
        this.f72462b.add("businessType");
        this.f72462b.add("retryTime");
        this.f72462b.add("lat");
        this.f72462b.add("lng");
        this.f72462b.add("servicetype");
        this.f72462b.add("uuid");
        this.f72462b.add("newlog");
        this.f72462b.add("showid");
        this.f72462b.add("mTag");
        this.f72462b.add("appName");
        Collections.sort(this.f72462b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m99096c(ConcurrentHashMap<String, String> concurrentHashMap) {
        m99103l(concurrentHashMap);
        if (m99104m() > csx.m112235R().m112342h0()) {
            esx.m122396a("BaseHttpUtils", "addNode " + concurrentHashMap.get("msgID") + " del " + ((Object) m99101i().get("msgID")));
        } else {
            esx.m122396a("BaseHttpUtils", "addNode [" + concurrentHashMap.get("msgID") + "] " + concurrentHashMap.get("type") + WeJson.EMPTY_ARR);
        }
        if (m99104m() <= 0 || this.f72466f) {
            return;
        }
        m99099g().scheduleAtFixedRate(new C15753a(), csx.m112235R().m112338g0(), csx.m112235R().m112338g0());
        this.f72466f = true;
    }

    /* JADX INFO: renamed from: d */
    public static String m99097d(String str) {
        return "https://sla-media.immomo.com/api/media/slalog?appid=" + str;
    }

    /* JADX INFO: renamed from: e */
    public static aol m99098e() {
        return C15756d.f72473a;
    }

    /* JADX INFO: renamed from: g */
    private Timer m99099g() {
        Timer timer;
        synchronized (this.f72464d) {
            try {
                if (this.f72465e == null) {
                    this.f72465e = new Timer();
                }
                esx.m122399d("BaseHttpUtils", "getTimer " + this.f72465e);
                timer = this.f72465e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return timer;
    }

    /* JADX INFO: renamed from: h */
    private ConcurrentHashMap<String, String> m99100h() {
        ConcurrentHashMap<String, String> concurrentHashMapPeekFirst;
        synchronized (this.f72463c) {
            esx.m122399d("BaseHttpUtils", MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            concurrentHashMapPeekFirst = this.f72461a.peekFirst();
        }
        return concurrentHashMapPeekFirst;
    }

    /* JADX INFO: renamed from: i */
    private ConcurrentHashMap<String, String> m99101i() {
        ConcurrentHashMap<String, String> concurrentHashMapPollFirst;
        synchronized (this.f72463c) {
            esx.m122399d("BaseHttpUtils", MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            concurrentHashMapPollFirst = this.f72461a.pollFirst();
        }
        return concurrentHashMapPollFirst;
    }

    /* JADX INFO: renamed from: k */
    private void m99102k() {
        synchronized (this.f72464d) {
            try {
                esx.m122399d("BaseHttpUtils", "releaseTimer " + this.f72465e);
                Timer timer = this.f72465e;
                if (timer != null) {
                    timer.cancel();
                }
                this.f72465e = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    private boolean m99103l(ConcurrentHashMap<String, String> concurrentHashMap) {
        boolean zAdd;
        synchronized (this.f72463c) {
            esx.m122399d("BaseHttpUtils", "retryListAdd " + concurrentHashMap);
            zAdd = this.f72461a.add(concurrentHashMap);
        }
        return zAdd;
    }

    /* JADX INFO: renamed from: m */
    private int m99104m() {
        int size;
        synchronized (this.f72463c) {
            size = this.f72461a.size();
            esx.m122399d("BaseHttpUtils", MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + size);
        }
        return size;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public void m99105n() {
        do {
            ConcurrentHashMap<String, String> concurrentHashMapM99100h = m99100h();
            String str = concurrentHashMapM99100h.get("time");
            concurrentHashMapM99100h.put("time", String.valueOf(a7y.m96388a().m96389b() / 1000));
            concurrentHashMapM99100h.put("retryTime", str);
            StringBuilder sb = new StringBuilder();
            Iterator<String> it = this.f72462b.iterator();
            while (it.hasNext()) {
                sb.append(concurrentHashMapM99100h.get(it.next()));
            }
            concurrentHashMapM99100h.put("sign", g1f.m128507c(sb.toString()));
            HashMap map = new HashMap();
            map.put("User-Agent", concurrentHashMapM99100h.get("User-Agent"));
            c3d0<T> c3d0VarM141756h = new pof0("https://sla-media.immomo.com/api/media/slalog", concurrentHashMapM99100h, map).m141756h();
            if (c3d0VarM141756h == 0 || !c3d0VarM141756h.m107776e()) {
                esx.m122396a("BaseHttpUtils", "retry Node error. [" + concurrentHashMapM99100h.get("msgID") + "]  size " + m99104m());
                break;
            }
            esx.m122396a("BaseHttpUtils", "retry Node succ. peek [" + concurrentHashMapM99100h.get("msgID") + "] " + concurrentHashMapM99100h.get("type") + WeJson.EMPTY_ARR);
            m99101i();
        } while (m99104m() > 0);
        if (m99104m() == 0) {
            m99102k();
            this.f72466f = false;
            esx.m122396a("BaseHttpUtils", "retry Node retry list is 0. ");
        }
    }

    /* JADX INFO: renamed from: f */
    public long m99106f() {
        long j = f72460h;
        f72460h = 1 + j;
        return j;
    }

    /* JADX INFO: renamed from: j */
    public void m99107j(ConcurrentHashMap<String, String> concurrentHashMap, String str) {
        StringBuilder sb = new StringBuilder();
        for (String str2 : this.f72462b) {
            String str3 = concurrentHashMap.get(str2);
            sb.append(str3);
            esx.m122396a("BaseHttpUtils", "key: " + str2 + " = " + str3);
        }
        concurrentHashMap.put("sign", g1f.m128507c(sb.toString()));
        esx.m122396a("BaseHttpUtils", "key: sign = " + g1f.m128507c(sb.toString()));
        HashMap map = new HashMap();
        map.put("User-Agent", concurrentHashMap.get("User-Agent"));
        String strM99097d = m99097d(str);
        esx.m122399d("BaseHttpUtils", "postNewMsg: [" + (f72460h - 1) + "] " + concurrentHashMap.get("type") + WeJson.EMPTY_ARR);
        new pof0(strM99097d, concurrentHashMap, map).m141755g(new C15754b(concurrentHashMap));
    }

    /* JADX INFO: renamed from: o */
    public void m99108o() throws Exception {
        x1d0 x1d0VarM209028b = new x1d0.C21228a().m209043q("https://live-api.immomo.com/ext/server/time").m209028b();
        vg50.m201217g().mo146674a("REQUEST_INSTANCE", new h2d0(), x1d0VarM209028b).mo135840h(this.f72467g);
    }

    /* JADX INFO: renamed from: l.aol$b */
    public class C15754b extends b2d0<ze2> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ConcurrentHashMap f72469a;

        /* JADX INFO: renamed from: l.aol$b$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C15754b c15754b = C15754b.this;
                aol.this.m99096c(c15754b.f72469a);
            }
        }

        public C15754b(ConcurrentHashMap concurrentHashMap) {
            this.f72469a = concurrentHashMap;
        }

        @Override // p153l.b2d0
        public void onError(int i, String str, String str2) {
            esx.m122396a("BaseHttpUtils", "ec " + i + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str2);
            msw.m159941a(new a());
        }

        @Override // p153l.b2d0
        public void onSuccess(int i, ze2 ze2Var, String str) {
            esx.m122396a("BaseHttpUtils", "ec " + i + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str);
        }

        @Override // p153l.b2d0
        public void onCancel() {
        }

        @Override // p153l.b2d0
        public void onFinish() {
        }
    }

    public /* synthetic */ aol(C15753a c15753a) {
        this();
    }
}
