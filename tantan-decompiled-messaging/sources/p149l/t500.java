package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.immomo.http.exception.BusinessException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class t500 {

    /* JADX INFO: renamed from: a */
    @NonNull
    private cll f167765a;

    /* JADX INFO: renamed from: b */
    @NonNull
    private String f167766b;

    /* JADX INFO: renamed from: c */
    @NonNull
    private Map<String, String> f167767c;

    /* JADX INFO: renamed from: d */
    private utc0 f167768d;

    /* JADX INFO: renamed from: e */
    private long f167769e;

    /* JADX INFO: renamed from: f */
    private long f167770f;

    /* JADX INFO: renamed from: g */
    private long f167771g;

    /* JADX INFO: renamed from: h */
    private InputStream f167772h;

    /* JADX INFO: renamed from: i */
    @Nullable
    private Object f167773i;

    /* JADX INFO: renamed from: j */
    @Nullable
    private Map<String, String> f167774j;

    /* JADX INFO: renamed from: l.t500$b */
    public static final class C20109b {

        /* JADX INFO: renamed from: a */
        private cll f167775a;

        /* JADX INFO: renamed from: b */
        private String f167776b = "GET";

        /* JADX INFO: renamed from: c */
        @NonNull
        private Map<String, String> f167777c = new HashMap();

        /* JADX INFO: renamed from: d */
        @Nullable
        private Map<String, String> f167778d;

        /* JADX INFO: renamed from: e */
        private utc0 f167779e;

        /* JADX INFO: renamed from: f */
        private long f167780f;

        /* JADX INFO: renamed from: g */
        private long f167781g;

        /* JADX INFO: renamed from: h */
        private long f167782h;

        /* JADX INFO: renamed from: i */
        private InputStream f167783i;

        /* JADX INFO: renamed from: j */
        @Nullable
        private Object f167784j;

        /* JADX INFO: renamed from: k */
        public t500 m187251k() {
            if (this.f167775a != null) {
                return new t500(this);
            }
            upk0.m194883a("please set url for your request");
            return null;
        }

        /* JADX INFO: renamed from: l */
        public C20109b m187252l(@Nullable Map<String, String> map) {
            this.f167777c.clear();
            if (map != null) {
                this.f167777c.putAll(map);
            }
            return this;
        }

        /* JADX INFO: renamed from: m */
        public C20109b m187253m(String str) {
            this.f167775a = cll.m107499l(str);
            return this;
        }
    }

    private t500(C20109b c20109b) {
        this.f167767c = new HashMap();
        this.f167765a = c20109b.f167775a;
        this.f167769e = c20109b.f167780f;
        this.f167770f = c20109b.f167781g;
        this.f167771g = c20109b.f167782h;
        this.f167772h = c20109b.f167783i;
        this.f167774j = c20109b.f167778d;
        this.f167766b = c20109b.f167776b;
        this.f167768d = c20109b.f167779e;
        this.f167773i = c20109b.f167784j;
        this.f167767c.putAll(c20109b.f167777c);
    }

    /* JADX INFO: renamed from: a */
    private void m187233a(stc0.C20027a c20027a, Map<String, String> map) {
        if (map != null) {
            for (String str : map.keySet()) {
                String str2 = map.get(str);
                m187234c(str, str2);
                if (str2 != null && str != null) {
                    c20027a.m185882a(str, str2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private static void m187234c(String str, Object obj) {
        if (ev0.f93301b) {
            if (str == null || !(obj == null || (obj instanceof String))) {
                throw new BusinessException("业务传参错误，请进行检查核对");
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public stc0 m187235b(@Nullable Map<String, String> map) {
        cll cllVarM107537d = this.f167765a;
        stc0.C20027a c20027a = new stc0.C20027a();
        if ("GET".equalsIgnoreCase(this.f167766b) && this.f167774j != null) {
            cll.C16188a c16188aM107524p = this.f167765a.m107524p();
            for (String str : this.f167774j.keySet()) {
                String str2 = this.f167774j.get(str);
                m187234c(str, str2);
                if (str != null) {
                    c16188aM107524p.m107534a(str, str2);
                }
            }
            cllVarM107537d = c16188aM107524p.m107537d();
        }
        c20027a.m185900s(cllVarM107537d);
        c20027a.m185897p(this.f167773i);
        m187233a(c20027a, map);
        m187233a(c20027a, this.f167767c);
        return c20027a.m185891j(this.f167766b, this.f167768d).m185883b();
    }

    /* JADX INFO: renamed from: d */
    public long m187236d() {
        return this.f167771g;
    }

    /* JADX INFO: renamed from: e */
    public InputStream m187237e() {
        return this.f167772h;
    }

    /* JADX INFO: renamed from: f */
    public boolean m187238f() {
        return this.f167769e > 0 || this.f167770f > 0 || this.f167771g > 0 || this.f167772h != null;
    }

    /* JADX INFO: renamed from: g */
    public long m187239g() {
        return this.f167769e;
    }

    /* JADX INFO: renamed from: h */
    public long m187240h() {
        return this.f167770f;
    }
}
