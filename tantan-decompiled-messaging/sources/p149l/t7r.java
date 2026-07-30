package p149l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class t7r implements nxk {

    /* JADX INFO: renamed from: c */
    private final Map<String, List<s7r>> f168763c;

    /* JADX INFO: renamed from: d */
    private volatile Map<String, String> f168764d;

    /* JADX INFO: renamed from: l.t7r$a */
    public static final class C20121a {

        /* JADX INFO: renamed from: d */
        private static final String f168765d;

        /* JADX INFO: renamed from: e */
        private static final Map<String, List<s7r>> f168766e;

        /* JADX INFO: renamed from: a */
        private boolean f168767a = true;

        /* JADX INFO: renamed from: b */
        private Map<String, List<s7r>> f168768b = f168766e;

        /* JADX INFO: renamed from: c */
        private boolean f168769c = true;

        static {
            String strM187498b = m187498b();
            f168765d = strM187498b;
            HashMap map = new HashMap(2);
            if (!TextUtils.isEmpty(strM187498b)) {
                map.put("User-Agent", Collections.singletonList(new C20122b(strM187498b)));
            }
            f168766e = Collections.unmodifiableMap(map);
        }

        @VisibleForTesting
        /* JADX INFO: renamed from: b */
        public static String m187498b() {
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
        public t7r m187499a() {
            this.f168767a = true;
            return new t7r(this.f168768b);
        }
    }

    /* JADX INFO: renamed from: l.t7r$b */
    public static final class C20122b implements s7r {

        /* JADX INFO: renamed from: a */
        @NonNull
        private final String f168770a;

        public C20122b(@NonNull String str) {
            this.f168770a = str;
        }

        @Override // p149l.s7r
        /* JADX INFO: renamed from: a */
        public String mo182513a() {
            return this.f168770a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C20122b) {
                return this.f168770a.equals(((C20122b) obj).f168770a);
            }
            return false;
        }

        public int hashCode() {
            return this.f168770a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f168770a + "'}";
        }
    }

    public t7r(Map<String, List<s7r>> map) {
        this.f168763c = Collections.unmodifiableMap(map);
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    private String m187496a(@NonNull List<s7r> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String strMo182513a = list.get(i).mo182513a();
            if (!TextUtils.isEmpty(strMo182513a)) {
                sb.append(strMo182513a);
                if (i != list.size() - 1) {
                    sb.append(',');
                }
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    private Map<String, String> m187497c() {
        HashMap map = new HashMap();
        for (Map.Entry<String, List<s7r>> entry : this.f168763c.entrySet()) {
            String strM187496a = m187496a(entry.getValue());
            if (!TextUtils.isEmpty(strM187496a)) {
                map.put(entry.getKey(), strM187496a);
            }
        }
        return map;
    }

    @Override // p149l.nxk
    /* JADX INFO: renamed from: b */
    public Map<String, String> mo161948b() {
        if (this.f168764d == null) {
            synchronized (this) {
                try {
                    if (this.f168764d == null) {
                        this.f168764d = Collections.unmodifiableMap(m187497c());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f168764d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof t7r) {
            return this.f168763c.equals(((t7r) obj).f168763c);
        }
        return false;
    }

    public int hashCode() {
        return this.f168763c.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f168763c + '}';
    }
}
