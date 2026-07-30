package p153l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class v9r implements d0l {

    /* JADX INFO: renamed from: c */
    private final Map<String, List<u9r>> f183022c;

    /* JADX INFO: renamed from: d */
    private volatile Map<String, String> f183023d;

    /* JADX INFO: renamed from: l.v9r$a */
    public static final class C20794a {

        /* JADX INFO: renamed from: d */
        private static final String f183024d;

        /* JADX INFO: renamed from: e */
        private static final Map<String, List<u9r>> f183025e;

        /* JADX INFO: renamed from: a */
        private boolean f183026a = true;

        /* JADX INFO: renamed from: b */
        private Map<String, List<u9r>> f183027b = f183025e;

        /* JADX INFO: renamed from: c */
        private boolean f183028c = true;

        static {
            String strM200455b = m200455b();
            f183024d = strM200455b;
            HashMap map = new HashMap(2);
            if (!TextUtils.isEmpty(strM200455b)) {
                map.put("User-Agent", Collections.singletonList(new C20795b(strM200455b)));
            }
            f183025e = Collections.unmodifiableMap(map);
        }

        @VisibleForTesting
        /* JADX INFO: renamed from: b */
        public static String m200455b() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i = 0; i < length; i++) {
                char cCharAt = property.charAt(i);
                if ((cCharAt > 31 || cCharAt == '\t') && cCharAt < 127) {
                    sb.append(cCharAt);
                } else {
                    sb.append('?');
                }
            }
            return sb.toString();
        }

        /* JADX INFO: renamed from: a */
        public v9r m200456a() {
            this.f183026a = true;
            return new v9r(this.f183027b);
        }
    }

    /* JADX INFO: renamed from: l.v9r$b */
    public static final class C20795b implements u9r {

        /* JADX INFO: renamed from: a */
        @NonNull
        private final String f183029a;

        public C20795b(@NonNull String str) {
            this.f183029a = str;
        }

        @Override // p153l.u9r
        /* JADX INFO: renamed from: a */
        public String mo195110a() {
            return this.f183029a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C20795b) {
                return this.f183029a.equals(((C20795b) obj).f183029a);
            }
            return false;
        }

        public int hashCode() {
            return this.f183029a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f183029a + "'}";
        }
    }

    public v9r(Map<String, List<u9r>> map) {
        this.f183022c = Collections.unmodifiableMap(map);
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    private String m200453b(@NonNull List<u9r> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String strMo195110a = list.get(i).mo195110a();
            if (!TextUtils.isEmpty(strMo195110a)) {
                sb.append(strMo195110a);
                if (i != list.size() - 1) {
                    sb.append(',');
                }
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    private Map<String, String> m200454c() {
        HashMap map = new HashMap();
        for (Map.Entry<String, List<u9r>> entry : this.f183022c.entrySet()) {
            String strM200453b = m200453b(entry.getValue());
            if (!TextUtils.isEmpty(strM200453b)) {
                map.put(entry.getKey(), strM200453b);
            }
        }
        return map;
    }

    @Override // p153l.d0l
    /* JADX INFO: renamed from: a */
    public Map<String, String> mo113410a() {
        if (this.f183023d == null) {
            synchronized (this) {
                try {
                    if (this.f183023d == null) {
                        this.f183023d = Collections.unmodifiableMap(m200454c());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f183023d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof v9r) {
            return this.f183022c.equals(((v9r) obj).f183022c);
        }
        return false;
    }

    public int hashCode() {
        return this.f183022c.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f183022c + '}';
    }
}
