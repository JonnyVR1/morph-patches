package p149l;

import android.content.Context;
import android.content.SharedPreferences;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.xiaomi.push.service.C14853ax;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class yoq0 {

    /* JADX INFO: renamed from: c */
    private static volatile yoq0 f199321c;

    /* JADX INFO: renamed from: a */
    private final ConcurrentLinkedQueue<C21454d> f199322a;

    /* JADX INFO: renamed from: b */
    private Context f199323b;

    /* JADX INFO: renamed from: l.yoq0$a */
    public class C21451a extends C21454d {

        /* JADX INFO: renamed from: d */
        File f199324d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ int f199325e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ Date f199326f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ Date f199327g;

        /* JADX INFO: renamed from: h */
        final /* synthetic */ String f199328h;

        /* JADX INFO: renamed from: i */
        final /* synthetic */ String f199329i;

        /* JADX INFO: renamed from: j */
        final /* synthetic */ boolean f199330j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21451a(int i, Date date, Date date2, String str, String str2, boolean z) {
            super();
            this.f199325e = i;
            this.f199326f = date;
            this.f199327g = date2;
            this.f199328h = str;
            this.f199329i = str2;
            this.f199330j = z;
        }

        @Override // p149l.yoq0.C21454d, p149l.pjq0.AbstractC19254d
        /* JADX INFO: renamed from: b */
        public void mo86587b() {
            try {
                File file = new File(yoq0.this.f199323b.getFilesDir() + "/.logcache");
                if (ywq0.m216410b(file)) {
                    file.mkdirs();
                    if (file.isDirectory()) {
                        xoq0 xoq0Var = new xoq0();
                        xoq0Var.m210443d(this.f199325e);
                        this.f199324d = xoq0Var.m210440a(yoq0.this.f199323b, this.f199326f, this.f199327g, file);
                    }
                }
            } catch (NullPointerException unused) {
            }
        }

        @Override // p149l.pjq0.AbstractC19254d
        /* JADX INFO: renamed from: c */
        public void mo86588c() {
            File file = this.f199324d;
            if (file != null && file.exists()) {
                yoq0.this.f199322a.add(yoq0.this.new C21455e(this.f199328h, this.f199329i, this.f199324d, this.f199330j));
            }
            yoq0.this.m215532e(0L);
        }
    }

    /* JADX INFO: renamed from: l.yoq0$b */
    public class C21452b extends pjq0.AbstractC19254d {

        /* JADX INFO: renamed from: b */
        pjq0.AbstractC19254d f199332b;

        public C21452b() {
        }

        @Override // p149l.pjq0.AbstractC19254d
        /* JADX INFO: renamed from: b */
        public void mo86587b() {
            C21454d c21454d = (C21454d) yoq0.this.f199322a.peek();
            if (c21454d == null || !c21454d.mo215540d()) {
                return;
            }
            if (yoq0.this.f199322a.remove(c21454d)) {
                this.f199332b = c21454d;
            }
            pjq0.AbstractC19254d abstractC19254d = this.f199332b;
            if (abstractC19254d != null) {
                abstractC19254d.mo86587b();
            }
        }

        @Override // p149l.pjq0.AbstractC19254d
        /* JADX INFO: renamed from: c */
        public void mo86588c() {
            pjq0.AbstractC19254d abstractC19254d = this.f199332b;
            if (abstractC19254d != null) {
                abstractC19254d.mo86588c();
            }
        }
    }

    /* JADX INFO: renamed from: l.yoq0$c */
    public class C21453c extends C21454d {
        public C21453c() {
            super();
        }

        @Override // p149l.yoq0.C21454d, p149l.pjq0.AbstractC19254d
        /* JADX INFO: renamed from: b */
        public void mo86587b() {
            yoq0.this.m215535i();
        }
    }

    /* JADX INFO: renamed from: l.yoq0$e */
    public class C21455e extends C21454d {

        /* JADX INFO: renamed from: d */
        String f199337d;

        /* JADX INFO: renamed from: e */
        String f199338e;

        /* JADX INFO: renamed from: f */
        File f199339f;

        /* JADX INFO: renamed from: g */
        int f199340g;

        /* JADX INFO: renamed from: h */
        boolean f199341h;

        /* JADX INFO: renamed from: i */
        boolean f199342i;

        public C21455e(String str, String str2, File file, boolean z) {
            super();
            this.f199337d = str;
            this.f199338e = str2;
            this.f199339f = file;
            this.f199342i = z;
        }

        /* JADX INFO: renamed from: f */
        private boolean m215542f() {
            int i;
            int i2 = 0;
            SharedPreferences sharedPreferences = yoq0.this.f199323b.getSharedPreferences("log.timestamp", 0);
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
                ilq0.m137053z("JSONException on put " + e.getMessage());
            }
            return true;
        }

        @Override // p149l.yoq0.C21454d, p149l.pjq0.AbstractC19254d
        /* JADX INFO: renamed from: b */
        public void mo86587b() {
            try {
                if (m215542f()) {
                    HashMap map = new HashMap();
                    map.put(Oauth2AccessToken.KEY_UID, C14853ax.m86572a());
                    map.put("token", this.f199338e);
                    map.put("net", gkq0.m126676e(yoq0.this.f199323b));
                    gkq0.m126680i(this.f199337d, map, this.f199339f, "file");
                }
                this.f199341h = true;
            } catch (IOException unused) {
            }
        }

        @Override // p149l.pjq0.AbstractC19254d
        /* JADX INFO: renamed from: c */
        public void mo86588c() {
            if (!this.f199341h) {
                int i = this.f199340g + 1;
                this.f199340g = i;
                if (i < 3) {
                    yoq0.this.f199322a.add(this);
                }
            }
            if (this.f199341h || this.f199340g >= 3) {
                this.f199339f.delete();
            }
            yoq0.this.m215532e((1 << this.f199340g) * 1000);
        }

        @Override // p149l.yoq0.C21454d
        /* JADX INFO: renamed from: d */
        public boolean mo215540d() {
            if (gkq0.m126695x(yoq0.this.f199323b)) {
                return true;
            }
            return this.f199342i && gkq0.m126691t(yoq0.this.f199323b);
        }
    }

    private yoq0(Context context) {
        ConcurrentLinkedQueue<C21454d> concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
        this.f199322a = concurrentLinkedQueue;
        this.f199323b = context;
        concurrentLinkedQueue.add(new C21453c());
        m215536j(0L);
    }

    /* JADX INFO: renamed from: c */
    public static yoq0 m215531c(Context context) {
        if (f199321c == null) {
            synchronized (yoq0.class) {
                try {
                    if (f199321c == null) {
                        f199321c = new yoq0(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        f199321c.f199323b = context;
        return f199321c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m215532e(long j) {
        C21454d c21454dPeek = this.f199322a.peek();
        if (c21454dPeek == null || !c21454dPeek.mo215540d()) {
            return;
        }
        m215536j(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public void m215535i() {
        try {
            File file = new File(this.f199323b.getFilesDir() + "/.logcache");
            if (file.exists() && file.isDirectory()) {
                for (File file2 : file.listFiles()) {
                    file2.delete();
                }
            }
        } catch (NullPointerException unused) {
        }
    }

    /* JADX INFO: renamed from: j */
    private void m215536j(long j) {
        if (this.f199322a.isEmpty()) {
            return;
        }
        itq0.m138235c(new C21452b(), j);
    }

    /* JADX INFO: renamed from: k */
    private void m215537k() {
        while (!this.f199322a.isEmpty()) {
            C21454d c21454dPeek = this.f199322a.peek();
            if (c21454dPeek != null) {
                if (!c21454dPeek.m215541e() && this.f199322a.size() <= 6) {
                    return;
                }
                ilq0.m137053z("remove Expired task");
                this.f199322a.remove(c21454dPeek);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m215538d() {
        m215537k();
        m215532e(0L);
    }

    /* JADX INFO: renamed from: f */
    public void m215539f(String str, String str2, Date date, Date date2, int i, boolean z) {
        this.f199322a.add(new C21451a(i, date, date2, str, str2, z));
        m215536j(0L);
    }

    /* JADX INFO: renamed from: l.yoq0$d */
    public class C21454d extends pjq0.AbstractC19254d {

        /* JADX INFO: renamed from: b */
        long f199335b = System.currentTimeMillis();

        public C21454d() {
        }

        /* JADX INFO: renamed from: d */
        public boolean mo215540d() {
            return true;
        }

        /* JADX INFO: renamed from: e */
        public final boolean m215541e() {
            return System.currentTimeMillis() - this.f199335b > 172800000;
        }

        @Override // p149l.pjq0.AbstractC19254d
        /* JADX INFO: renamed from: b */
        public void mo86587b() {
        }
    }
}
