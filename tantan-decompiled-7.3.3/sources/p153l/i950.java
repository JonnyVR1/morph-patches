package p153l;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class i950 {

    /* JADX INFO: renamed from: l.i950$a */
    public static final class C17670a {

        /* JADX INFO: renamed from: a */
        public final String f113421a;

        /* JADX INFO: renamed from: b */
        public final a f113422b;

        /* JADX INFO: renamed from: c */
        public a f113423c;

        /* JADX INFO: renamed from: d */
        public boolean f113424d;

        /* JADX INFO: renamed from: l.i950$a$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            public String f113425a;

            /* JADX INFO: renamed from: b */
            public Object f113426b;

            /* JADX INFO: renamed from: c */
            public a f113427c;

            public a() {
            }
        }

        public C17670a(String str) {
            a aVar = new a();
            this.f113422b = aVar;
            this.f113423c = aVar;
            this.f113424d = false;
            this.f113421a = (String) wn80.m207182g(str);
        }

        /* JADX INFO: renamed from: a */
        public C17670a m139076a(String str, int i) {
            return m139080e(str, String.valueOf(i));
        }

        /* JADX INFO: renamed from: b */
        public C17670a m139077b(String str, Object obj) {
            return m139080e(str, obj);
        }

        /* JADX INFO: renamed from: c */
        public C17670a m139078c(String str, boolean z) {
            return m139080e(str, String.valueOf(z));
        }

        /* JADX INFO: renamed from: d */
        public final a m139079d() {
            a aVar = new a();
            this.f113423c.f113427c = aVar;
            this.f113423c = aVar;
            return aVar;
        }

        /* JADX INFO: renamed from: e */
        public final C17670a m139080e(String str, Object obj) {
            a aVarM139079d = m139079d();
            aVarM139079d.f113426b = obj;
            aVarM139079d.f113425a = (String) wn80.m207182g(str);
            return this;
        }

        public String toString() {
            boolean z = this.f113424d;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f113421a);
            sb.append('{');
            String str = "";
            for (a aVar = this.f113422b.f113427c; aVar != null; aVar = aVar.f113427c) {
                Object obj = aVar.f113426b;
                if (!z || obj != null) {
                    sb.append(str);
                    String str2 = aVar.f113425a;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    str = ", ";
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m139074a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static C17670a m139075b(Object obj) {
        return new C17670a(obj.getClass().getSimpleName());
    }
}
