package com.tantanapp.foxstatistics;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p153l.c350;
import p153l.cu2;
import p153l.ek2;
import p153l.i4g0;
import p153l.i6f;
import p153l.l0e;
import p153l.ql20;
import p153l.r1d0;
import p153l.tvv;
import p153l.wx0;
import p153l.zek0;

/* JADX INFO: loaded from: classes11.dex */
public class DefaultEnvironment {

    /* JADX INFO: renamed from: c */
    public static volatile DefaultEnvironment f56943c;

    /* JADX INFO: renamed from: a */
    public Context f56944a;

    /* JADX INFO: renamed from: b */
    public Map<String, Object> f56945b = new ConcurrentHashMap<String, Object>() { // from class: com.tantanapp.foxstatistics.DefaultEnvironment.1
        @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
        public Object put(@NonNull String str, Object obj) {
            if (obj == null) {
                obj = "";
            }
            return super.put(str, obj);
        }
    };

    /* JADX INFO: renamed from: com.tantanapp.foxstatistics.DefaultEnvironment$a */
    public class RunnableC13803a implements Runnable {
        public RunnableC13803a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                DefaultEnvironment.this.f56945b.put("os", l0e.m152333i());
                DefaultEnvironment.this.f56945b.put("osv", l0e.m152334j());
                DefaultEnvironment.this.f56945b.put("brand", l0e.m152326b());
                DefaultEnvironment.this.f56945b.put("dm", l0e.m152329e());
                DefaultEnvironment.this.f56945b.put(Constants.INAPP_NOTIF_SHOW_CLOSE, l0e.m152330f(DefaultEnvironment.this.f56944a));
                DefaultEnvironment.this.f56945b.put("ct", l0e.m152327c());
                DefaultEnvironment.this.f56945b.put("chrg", cu2.m112648b(i4g0.m138507e()));
                DefaultEnvironment.this.f56945b.put("btry", Float.valueOf(cu2.m112647a(i4g0.m138507e())));
                DefaultEnvironment.this.f56945b.put("ps", Integer.valueOf(wx0.m208364d(i4g0.m138507e())));
                DefaultEnvironment.this.f56945b.put("localid", tvv.m192837a(DefaultEnvironment.this.f56944a));
                DefaultEnvironment.this.f56945b.put("locale", l0e.m152332h());
                DefaultEnvironment.this.f56945b.put("lang", l0e.m152335k());
                DefaultEnvironment.this.f56945b.put("tz", l0e.m152328d());
            } catch (Exception e) {
                i4g0.m138494C(i6f.m138814b(e));
            }
            c350.m107769b();
        }
    }

    /* JADX INFO: renamed from: com.tantanapp.foxstatistics.DefaultEnvironment$b */
    public class RunnableC13804b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f56947a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Object f56948b;

        public RunnableC13804b(String str, Object obj) {
            this.f56947a = str;
            this.f56948b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            DefaultEnvironment.this.f56945b.put(this.f56947a, this.f56948b);
        }
    }

    /* JADX INFO: renamed from: com.tantanapp.foxstatistics.DefaultEnvironment$c */
    public class RunnableC13805c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ek2 f56950a;

        public RunnableC13805c(ek2 ek2Var) {
            this.f56950a = ek2Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            DefaultEnvironment.this.f56945b.putAll(zek0.m219499a(this.f56950a));
        }
    }

    /* JADX INFO: renamed from: com.tantanapp.foxstatistics.DefaultEnvironment$d */
    public class RunnableC13806d implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HashMap f56952a;

        public RunnableC13806d(HashMap map) {
            this.f56952a = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            DefaultEnvironment.this.f56945b.putAll(this.f56952a);
        }
    }

    /* JADX INFO: renamed from: com.tantanapp.foxstatistics.DefaultEnvironment$e */
    public class RunnableC13807e implements Runnable {
        public RunnableC13807e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                DefaultEnvironment.this.f56945b.put("wfs", Boolean.valueOf(ql20.m176982d(DefaultEnvironment.this.f56944a)));
                DefaultEnvironment.this.f56945b.put("bts", Boolean.valueOf(l0e.m152325a()));
                DefaultEnvironment.this.f56945b.put("gs", Integer.valueOf(l0e.m152331g(DefaultEnvironment.this.f56944a)));
                DefaultEnvironment.this.f56945b.put("net", ql20.m176980b(DefaultEnvironment.this.f56944a));
                DefaultEnvironment.this.f56945b.put("mno", ql20.m176981c(DefaultEnvironment.this.f56944a));
            } catch (Exception e) {
                i4g0.m138494C(i6f.m138814b(e));
            }
        }
    }

    /* JADX INFO: renamed from: com.tantanapp.foxstatistics.DefaultEnvironment$f */
    public class RunnableC13808f implements Runnable {
        public RunnableC13808f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DefaultEnvironment.this.f56945b.put("chrg", cu2.m112648b(i4g0.m138507e()));
            DefaultEnvironment.this.f56945b.put("btry", Float.valueOf(cu2.m112647a(i4g0.m138507e())));
        }
    }

    public DefaultEnvironment(Context context) {
        this.f56944a = context.getApplicationContext();
        m82509e();
    }

    /* JADX INFO: renamed from: c */
    public static DefaultEnvironment m82507c(Context context) {
        if (f56943c == null) {
            synchronized (DefaultEnvironment.class) {
                try {
                    if (f56943c == null) {
                        f56943c = new DefaultEnvironment(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f56943c;
    }

    /* JADX INFO: renamed from: d */
    public Object m82508d(String str) {
        return this.f56945b.get(str);
    }

    /* JADX INFO: renamed from: e */
    public final void m82509e() {
        r1d0.m179400c(new RunnableC13803a());
    }

    /* JADX INFO: renamed from: f */
    public void m82510f(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        r1d0.m179400c(new RunnableC13804b(str, obj));
    }

    /* JADX INFO: renamed from: g */
    public void m82511g(HashMap<String, Object> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        r1d0.m179400c(new RunnableC13806d(map));
    }

    /* JADX INFO: renamed from: h */
    public void m82512h(ek2 ek2Var) {
        if (ek2Var != null) {
            r1d0.m179400c(new RunnableC13805c(ek2Var));
        }
    }

    /* JADX INFO: renamed from: i */
    public void m82513i() {
        r1d0.m179400c(new RunnableC13808f());
    }

    /* JADX INFO: renamed from: j */
    public void m82514j() {
        r1d0.m179400c(new RunnableC13807e());
    }
}
