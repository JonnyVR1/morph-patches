package com.tantanapp.foxstatistics;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p149l.e5f;
import p149l.gd20;
import p149l.mt2;
import p149l.mtc0;
import p149l.nu40;
import p149l.px0;
import p149l.stv;
import p149l.t5k0;
import p149l.wj2;
import p149l.yyd;
import p149l.zvf0;

/* JADX INFO: loaded from: classes13.dex */
public class DefaultEnvironment {

    /* JADX INFO: renamed from: c */
    public static volatile DefaultEnvironment f56095c;

    /* JADX INFO: renamed from: a */
    public Context f56096a;

    /* JADX INFO: renamed from: b */
    public Map<String, Object> f56097b = new ConcurrentHashMap<String, Object>() { // from class: com.tantanapp.foxstatistics.DefaultEnvironment.1
        @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
        public Object put(@NonNull String str, Object obj) {
            if (obj == null) {
                obj = "";
            }
            return super.put(str, obj);
        }
    };

    /* JADX INFO: renamed from: com.tantanapp.foxstatistics.DefaultEnvironment$a */
    public class RunnableC13640a implements Runnable {
        public RunnableC13640a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                DefaultEnvironment.this.f56097b.put("os", yyd.m216522i());
                DefaultEnvironment.this.f56097b.put("osv", yyd.m216523j());
                DefaultEnvironment.this.f56097b.put("brand", yyd.m216515b());
                DefaultEnvironment.this.f56097b.put("dm", yyd.m216518e());
                DefaultEnvironment.this.f56097b.put(Constants.INAPP_NOTIF_SHOW_CLOSE, yyd.m216519f(DefaultEnvironment.this.f56096a));
                DefaultEnvironment.this.f56097b.put("ct", yyd.m216516c());
                DefaultEnvironment.this.f56097b.put("chrg", mt2.m156176b(zvf0.m220383e()));
                DefaultEnvironment.this.f56097b.put("btry", Float.valueOf(mt2.m156175a(zvf0.m220383e())));
                DefaultEnvironment.this.f56097b.put("ps", Integer.valueOf(px0.m171780d(zvf0.m220383e())));
                DefaultEnvironment.this.f56097b.put("localid", stv.m185972a(DefaultEnvironment.this.f56096a));
                DefaultEnvironment.this.f56097b.put("locale", yyd.m216521h());
                DefaultEnvironment.this.f56097b.put("lang", yyd.m216524k());
                DefaultEnvironment.this.f56097b.put("tz", yyd.m216517d());
            } catch (Exception e) {
                zvf0.m220370C(e5f.m114788b(e));
            }
            nu40.m161426b();
        }
    }

    /* JADX INFO: renamed from: com.tantanapp.foxstatistics.DefaultEnvironment$b */
    public class RunnableC13641b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f56099a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Object f56100b;

        public RunnableC13641b(String str, Object obj) {
            this.f56099a = str;
            this.f56100b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            DefaultEnvironment.this.f56097b.put(this.f56099a, this.f56100b);
        }
    }

    /* JADX INFO: renamed from: com.tantanapp.foxstatistics.DefaultEnvironment$c */
    public class RunnableC13642c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ wj2 f56102a;

        public RunnableC13642c(wj2 wj2Var) {
            this.f56102a = wj2Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            DefaultEnvironment.this.f56097b.putAll(t5k0.m187334a(this.f56102a));
        }
    }

    /* JADX INFO: renamed from: com.tantanapp.foxstatistics.DefaultEnvironment$d */
    public class RunnableC13643d implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HashMap f56104a;

        public RunnableC13643d(HashMap map) {
            this.f56104a = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            DefaultEnvironment.this.f56097b.putAll(this.f56104a);
        }
    }

    /* JADX INFO: renamed from: com.tantanapp.foxstatistics.DefaultEnvironment$e */
    public class RunnableC13644e implements Runnable {
        public RunnableC13644e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                DefaultEnvironment.this.f56097b.put("wfs", Boolean.valueOf(gd20.m125537d(DefaultEnvironment.this.f56096a)));
                DefaultEnvironment.this.f56097b.put("bts", Boolean.valueOf(yyd.m216514a()));
                DefaultEnvironment.this.f56097b.put("gs", Integer.valueOf(yyd.m216520g(DefaultEnvironment.this.f56096a)));
                DefaultEnvironment.this.f56097b.put("net", gd20.m125535b(DefaultEnvironment.this.f56096a));
                DefaultEnvironment.this.f56097b.put("mno", gd20.m125536c(DefaultEnvironment.this.f56096a));
            } catch (Exception e) {
                zvf0.m220370C(e5f.m114788b(e));
            }
        }
    }

    /* JADX INFO: renamed from: com.tantanapp.foxstatistics.DefaultEnvironment$f */
    public class RunnableC13645f implements Runnable {
        public RunnableC13645f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DefaultEnvironment.this.f56097b.put("chrg", mt2.m156176b(zvf0.m220383e()));
            DefaultEnvironment.this.f56097b.put("btry", Float.valueOf(mt2.m156175a(zvf0.m220383e())));
        }
    }

    public DefaultEnvironment(Context context) {
        this.f56096a = context.getApplicationContext();
        m81326e();
    }

    /* JADX INFO: renamed from: c */
    public static DefaultEnvironment m81324c(Context context) {
        if (f56095c == null) {
            synchronized (DefaultEnvironment.class) {
                try {
                    if (f56095c == null) {
                        f56095c = new DefaultEnvironment(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f56095c;
    }

    /* JADX INFO: renamed from: d */
    public Object m81325d(String str) {
        return this.f56097b.get(str);
    }

    /* JADX INFO: renamed from: e */
    public final void m81326e() {
        mtc0.m156193c(new RunnableC13640a());
    }

    /* JADX INFO: renamed from: f */
    public void m81327f(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        mtc0.m156193c(new RunnableC13641b(str, obj));
    }

    /* JADX INFO: renamed from: g */
    public void m81328g(HashMap<String, Object> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        mtc0.m156193c(new RunnableC13643d(map));
    }

    /* JADX INFO: renamed from: h */
    public void m81329h(wj2 wj2Var) {
        if (wj2Var != null) {
            mtc0.m156193c(new RunnableC13642c(wj2Var));
        }
    }

    /* JADX INFO: renamed from: i */
    public void m81330i() {
        mtc0.m156193c(new RunnableC13645f());
    }

    /* JADX INFO: renamed from: j */
    public void m81331j() {
        mtc0.m156193c(new RunnableC13644e());
    }
}
