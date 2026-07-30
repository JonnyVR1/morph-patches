package p153l;

import android.content.Context;
import android.content.SharedPreferences;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.xiaomi.push.service.C15001ax;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class eyq0 {

    /* JADX INFO: renamed from: c */
    private static volatile eyq0 f96470c;

    /* JADX INFO: renamed from: a */
    private final ConcurrentLinkedQueue<C16866d> f96471a;

    /* JADX INFO: renamed from: b */
    private Context f96472b;

    /* JADX INFO: renamed from: l.eyq0$a */
    public class C16863a extends C16866d {

        /* JADX INFO: renamed from: d */
        File f96473d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ int f96474e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ Date f96475f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ Date f96476g;

        /* JADX INFO: renamed from: h */
        final /* synthetic */ String f96477h;

        /* JADX INFO: renamed from: i */
        final /* synthetic */ String f96478i;

        /* JADX INFO: renamed from: j */
        final /* synthetic */ boolean f96479j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16863a(int i, Date date, Date date2, String str, String str2, boolean z) {
            super();
            this.f96474e = i;
            this.f96475f = date;
            this.f96476g = date2;
            this.f96477h = str;
            this.f96478i = str2;
            this.f96479j = z;
        }

        @Override // p153l.eyq0.C16866d, p153l.vsq0.AbstractC20930d
        /* JADX INFO: renamed from: b */
        public void mo87758b() {
            try {
                File file = new File(eyq0.this.f96472b.getFilesDir() + "/.logcache");
                if (e6r0.m119667b(file)) {
                    file.mkdirs();
                    if (file.isDirectory()) {
                        dyq0 dyq0Var = new dyq0();
                        dyq0Var.m118710d(this.f96474e);
                        this.f96473d = dyq0Var.m118707a(eyq0.this.f96472b, this.f96475f, this.f96476g, file);
                    }
                }
            } catch (NullPointerException unused) {
            }
        }

        @Override // p153l.vsq0.AbstractC20930d
        /* JADX INFO: renamed from: c */
        public void mo87759c() {
            File file = this.f96473d;
            if (file != null && file.exists()) {
                eyq0.this.f96471a.add(eyq0.this.new C16867e(this.f96477h, this.f96478i, this.f96473d, this.f96479j));
            }
            eyq0.this.m123218e(0L);
        }
    }

    /* JADX INFO: renamed from: l.eyq0$b */
    public class C16864b extends vsq0.AbstractC20930d {

        /* JADX INFO: renamed from: b */
        vsq0.AbstractC20930d f96481b;

        public C16864b() {
        }

        @Override // p153l.vsq0.AbstractC20930d
        /* JADX INFO: renamed from: b */
        public void mo87758b() {
            C16866d c16866d = (C16866d) eyq0.this.f96471a.peek();
            if (c16866d == null || !c16866d.mo123226d()) {
                return;
            }
            if (eyq0.this.f96471a.remove(c16866d)) {
                this.f96481b = c16866d;
            }
            vsq0.AbstractC20930d abstractC20930d = this.f96481b;
            if (abstractC20930d != null) {
                abstractC20930d.mo87758b();
            }
        }

        @Override // p153l.vsq0.AbstractC20930d
        /* JADX INFO: renamed from: c */
        public void mo87759c() {
            vsq0.AbstractC20930d abstractC20930d = this.f96481b;
            if (abstractC20930d != null) {
                abstractC20930d.mo87759c();
            }
        }
    }

    /* JADX INFO: renamed from: l.eyq0$c */
    public class C16865c extends C16866d {
        public C16865c() {
            super();
        }

        @Override // p153l.eyq0.C16866d, p153l.vsq0.AbstractC20930d
        /* JADX INFO: renamed from: b */
        public void mo87758b() {
            eyq0.this.m123221i();
        }
    }

    /* JADX INFO: renamed from: l.eyq0$e */
    public class C16867e extends C16866d {

        /* JADX INFO: renamed from: d */
        String f96486d;

        /* JADX INFO: renamed from: e */
        String f96487e;

        /* JADX INFO: renamed from: f */
        File f96488f;

        /* JADX INFO: renamed from: g */
        int f96489g;

        /* JADX INFO: renamed from: h */
        boolean f96490h;

        /* JADX INFO: renamed from: i */
        boolean f96491i;

        public C16867e(String str, String str2, File file, boolean z) {
            super();
            this.f96486d = str;
            this.f96487e = str2;
            this.f96488f = file;
            this.f96491i = z;
        }

        /* JADX INFO: renamed from: f */
        private boolean m123228f() {
            int i;
            int i2 = 0;
            SharedPreferences sharedPreferences = eyq0.this.f96472b.getSharedPreferences("log.timestamp", 0);
            String string = sharedPreferences.getString("log.requst", "");
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                JSONObject jSONObject = new JSONObject(string);
                jCurrentTimeMillis = jSONObject.getLong("time");
                i = jSONObject.getInt("times");
            } catch (JSONException unused) {
                i = 0;
            }
            if (System.currentTimeMillis() - jCurrentTimeMillis >= 86400000) {
                jCurrentTimeMillis = System.currentTimeMillis();
            } else {
                if (i > 10) {
                    return false;
                }
                i2 = i;
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("time", jCurrentTimeMillis);
                jSONObject2.put("times", i2 + 1);
                sharedPreferences.edit().putString("log.requst", jSONObject2.toString()).commit();
            } catch (JSONException e) {
                ouq0.m169406z("JSONException on put " + e.getMessage());
            }
            return true;
        }

        @Override // p153l.eyq0.C16866d, p153l.vsq0.AbstractC20930d
        /* JADX INFO: renamed from: b */
        public void mo87758b() {
            try {
                if (m123228f()) {
                    HashMap map = new HashMap();
                    map.put(Oauth2AccessToken.KEY_UID, C15001ax.m87743a());
                    map.put("token", this.f96487e);
                    map.put("net", mtq0.m160029e(eyq0.this.f96472b));
                    mtq0.m160033i(this.f96486d, map, this.f96488f, "file");
                }
                this.f96490h = true;
            } catch (IOException unused) {
            }
        }

        @Override // p153l.vsq0.AbstractC20930d
        /* JADX INFO: renamed from: c */
        public void mo87759c() {
            if (!this.f96490h) {
                int i = this.f96489g + 1;
                this.f96489g = i;
                if (i < 3) {
                    eyq0.this.f96471a.add(this);
                }
            }
            if (this.f96490h || this.f96489g >= 3) {
                this.f96488f.delete();
            }
            eyq0.this.m123218e((1 << this.f96489g) * 1000);
        }

        @Override // p153l.eyq0.C16866d
        /* JADX INFO: renamed from: d */
        public boolean mo123226d() {
            if (mtq0.m160048x(eyq0.this.f96472b)) {
                return true;
            }
            return this.f96491i && mtq0.m160044t(eyq0.this.f96472b);
        }
    }

    private eyq0(Context context) {
        ConcurrentLinkedQueue<C16866d> concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
        this.f96471a = concurrentLinkedQueue;
        this.f96472b = context;
        concurrentLinkedQueue.add(new C16865c());
        m123222j(0L);
    }

    /* JADX INFO: renamed from: c */
    public static eyq0 m123217c(Context context) {
        if (f96470c == null) {
            synchronized (eyq0.class) {
                try {
                    if (f96470c == null) {
                        f96470c = new eyq0(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        f96470c.f96472b = context;
        return f96470c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m123218e(long j) {
        C16866d c16866dPeek = this.f96471a.peek();
        if (c16866dPeek == null || !c16866dPeek.mo123226d()) {
            return;
        }
        m123222j(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public void m123221i() {
        try {
            File file = new File(this.f96472b.getFilesDir() + "/.logcache");
            if (file.exists() && file.isDirectory()) {
                for (File file2 : file.listFiles()) {
                    file2.delete();
                }
            }
        } catch (NullPointerException unused) {
        }
    }

    /* JADX INFO: renamed from: j */
    private void m123222j(long j) {
        if (this.f96471a.isEmpty()) {
            return;
        }
        o2r0.m165746c(new C16864b(), j);
    }

    /* JADX INFO: renamed from: k */
    private void m123223k() {
        while (!this.f96471a.isEmpty()) {
            C16866d c16866dPeek = this.f96471a.peek();
            if (c16866dPeek != null) {
                if (!c16866dPeek.m123227e() && this.f96471a.size() <= 6) {
                    return;
                }
                ouq0.m169406z("remove Expired task");
                this.f96471a.remove(c16866dPeek);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m123224d() {
        m123223k();
        m123218e(0L);
    }

    /* JADX INFO: renamed from: f */
    public void m123225f(String str, String str2, Date date, Date date2, int i, boolean z) {
        this.f96471a.add(new C16863a(i, date, date2, str, str2, z));
        m123222j(0L);
    }

    /* JADX INFO: renamed from: l.eyq0$d */
    public class C16866d extends vsq0.AbstractC20930d {

        /* JADX INFO: renamed from: b */
        long f96484b = System.currentTimeMillis();

        public C16866d() {
        }

        /* JADX INFO: renamed from: d */
        public boolean mo123226d() {
            return true;
        }

        /* JADX INFO: renamed from: e */
        public final boolean m123227e() {
            return System.currentTimeMillis() - this.f96484b > 172800000;
        }

        @Override // p153l.vsq0.AbstractC20930d
        /* JADX INFO: renamed from: b */
        public void mo87758b() {
        }
    }
}
