package com.google.common.base;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import p149l.jfd0;
import p149l.sf80;

/* JADX INFO: renamed from: com.google.common.base.a */
/* JADX INFO: loaded from: classes7.dex */
public final class C2654a {

    /* JADX INFO: renamed from: com.google.common.base.a$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final String f10626a;

        /* JADX INFO: renamed from: b */
        public final C22676b f10627b;

        /* JADX INFO: renamed from: c */
        public C22676b f10628c;

        /* JADX INFO: renamed from: d */
        public boolean f10629d;

        /* JADX INFO: renamed from: e */
        public boolean f10630e;

        /* JADX INFO: renamed from: com.google.common.base.a$b$a */
        public static final class a extends C22676b {
            public a() {
                super();
            }
        }

        /* JADX INFO: renamed from: com.google.common.base.a$b$b, reason: collision with other inner class name */
        public static class C22676b {

            /* JADX INFO: renamed from: a */
            public String f10631a;

            /* JADX INFO: renamed from: b */
            public Object f10632b;

            /* JADX INFO: renamed from: c */
            public C22676b f10633c;

            public C22676b() {
            }
        }

        public b(String str) {
            C22676b c22676b = new C22676b();
            this.f10627b = c22676b;
            this.f10628c = c22676b;
            this.f10629d = false;
            this.f10630e = false;
            this.f10626a = (String) sf80.m183894p(str);
        }

        /* JADX INFO: renamed from: k */
        public static boolean m15428k(Object obj) {
            if (obj instanceof CharSequence) {
                return ((CharSequence) obj).length() == 0;
            }
            if (obj instanceof Collection) {
                return ((Collection) obj).isEmpty();
            }
            if (obj instanceof Map) {
                return ((Map) obj).isEmpty();
            }
            if (obj instanceof Optional) {
                return !((Optional) obj).isPresent();
            }
            return obj.getClass().isArray() && Array.getLength(obj) == 0;
        }

        /* JADX INFO: renamed from: a */
        public b m15429a(String str, double d) {
            return m15437i(str, String.valueOf(d));
        }

        /* JADX INFO: renamed from: b */
        public b m15430b(String str, int i) {
            return m15437i(str, String.valueOf(i));
        }

        /* JADX INFO: renamed from: c */
        public b m15431c(String str, long j) {
            return m15437i(str, String.valueOf(j));
        }

        /* JADX INFO: renamed from: d */
        public b m15432d(String str, Object obj) {
            return m15435g(str, obj);
        }

        /* JADX INFO: renamed from: e */
        public final C22676b m15433e() {
            C22676b c22676b = new C22676b();
            this.f10628c.f10633c = c22676b;
            this.f10628c = c22676b;
            return c22676b;
        }

        /* JADX INFO: renamed from: f */
        public final b m15434f(Object obj) {
            m15433e().f10632b = obj;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public final b m15435g(String str, Object obj) {
            C22676b c22676bM15433e = m15433e();
            c22676bM15433e.f10632b = obj;
            c22676bM15433e.f10631a = (String) sf80.m183894p(str);
            return this;
        }

        /* JADX INFO: renamed from: h */
        public final a m15436h() {
            a aVar = new a();
            this.f10628c.f10633c = aVar;
            this.f10628c = aVar;
            return aVar;
        }

        /* JADX INFO: renamed from: i */
        public final b m15437i(String str, Object obj) {
            a aVarM15436h = m15436h();
            aVarM15436h.f10632b = obj;
            aVarM15436h.f10631a = (String) sf80.m183894p(str);
            return this;
        }

        /* JADX INFO: renamed from: j */
        public b m15438j(Object obj) {
            return m15434f(obj);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0030  */
        /* JADX WARN: Code duplicated, block: B:14:0x0037  */
        /* JADX WARN: Code duplicated, block: B:16:0x0041  */
        /* JADX WARN: Code duplicated, block: B:19:0x005d  */
        public String toString() {
            String str;
            boolean z = this.f10629d;
            boolean z2 = this.f10630e;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f10626a);
            sb.append('{');
            String str2 = "";
            for (C22676b c22676b = this.f10627b.f10633c; c22676b != null; c22676b = c22676b.f10633c) {
                Object obj = c22676b.f10632b;
                if (c22676b instanceof a) {
                    sb.append(str2);
                    str = c22676b.f10631a;
                    if (str != null) {
                        sb.append(str);
                        sb.append('=');
                    }
                    if (obj == null && obj.getClass().isArray()) {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    } else {
                        sb.append(obj);
                    }
                    str2 = ", ";
                } else if (obj == null) {
                    if (!z) {
                        sb.append(str2);
                        str = c22676b.f10631a;
                        if (str != null) {
                            sb.append(str);
                            sb.append('=');
                        }
                        if (obj == null) {
                            sb.append(obj);
                        } else {
                            sb.append(obj);
                        }
                        str2 = ", ";
                    }
                } else if (!z2 || !m15428k(obj)) {
                    sb.append(str2);
                    str = c22676b.f10631a;
                    if (str != null) {
                        sb.append(str);
                        sb.append('=');
                    }
                    if (obj == null) {
                        sb.append(obj);
                    } else {
                        sb.append(obj);
                    }
                    str2 = ", ";
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: a */
    public static <T> T m15426a(T t, T t2) {
        if (t != null) {
            return t;
        }
        if (t2 != null) {
            return t2;
        }
        jfd0.m141176a("Both parameters are null");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static b m15427b(Object obj) {
        return new b(obj.getClass().getSimpleName());
    }
}
