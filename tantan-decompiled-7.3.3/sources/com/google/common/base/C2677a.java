package com.google.common.base;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import p153l.mnd0;
import p153l.xn80;

/* JADX INFO: renamed from: com.google.common.base.a */
/* JADX INFO: loaded from: classes7.dex */
public final class C2677a {

    /* JADX INFO: renamed from: com.google.common.base.a$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final String f10663a;

        /* JADX INFO: renamed from: b */
        public final C22792b f10664b;

        /* JADX INFO: renamed from: c */
        public C22792b f10665c;

        /* JADX INFO: renamed from: d */
        public boolean f10666d;

        /* JADX INFO: renamed from: e */
        public boolean f10667e;

        /* JADX INFO: renamed from: com.google.common.base.a$b$a */
        public static final class a extends C22792b {
            public a() {
                super();
            }
        }

        /* JADX INFO: renamed from: com.google.common.base.a$b$b, reason: collision with other inner class name */
        public static class C22792b {

            /* JADX INFO: renamed from: a */
            public String f10668a;

            /* JADX INFO: renamed from: b */
            public Object f10669b;

            /* JADX INFO: renamed from: c */
            public C22792b f10670c;

            public C22792b() {
            }
        }

        public b(String str) {
            C22792b c22792b = new C22792b();
            this.f10664b = c22792b;
            this.f10665c = c22792b;
            this.f10666d = false;
            this.f10667e = false;
            this.f10663a = (String) xn80.m212111p(str);
        }

        /* JADX INFO: renamed from: k */
        public static boolean m15482k(Object obj) {
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
        public b m15483a(String str, double d) {
            return m15491i(str, String.valueOf(d));
        }

        /* JADX INFO: renamed from: b */
        public b m15484b(String str, int i) {
            return m15491i(str, String.valueOf(i));
        }

        /* JADX INFO: renamed from: c */
        public b m15485c(String str, long j) {
            return m15491i(str, String.valueOf(j));
        }

        /* JADX INFO: renamed from: d */
        public b m15486d(String str, Object obj) {
            return m15489g(str, obj);
        }

        /* JADX INFO: renamed from: e */
        public final C22792b m15487e() {
            C22792b c22792b = new C22792b();
            this.f10665c.f10670c = c22792b;
            this.f10665c = c22792b;
            return c22792b;
        }

        /* JADX INFO: renamed from: f */
        public final b m15488f(Object obj) {
            m15487e().f10669b = obj;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public final b m15489g(String str, Object obj) {
            C22792b c22792bM15487e = m15487e();
            c22792bM15487e.f10669b = obj;
            c22792bM15487e.f10668a = (String) xn80.m212111p(str);
            return this;
        }

        /* JADX INFO: renamed from: h */
        public final a m15490h() {
            a aVar = new a();
            this.f10665c.f10670c = aVar;
            this.f10665c = aVar;
            return aVar;
        }

        /* JADX INFO: renamed from: i */
        public final b m15491i(String str, Object obj) {
            a aVarM15490h = m15490h();
            aVarM15490h.f10669b = obj;
            aVarM15490h.f10668a = (String) xn80.m212111p(str);
            return this;
        }

        /* JADX INFO: renamed from: j */
        public b m15492j(Object obj) {
            return m15488f(obj);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0030  */
        /* JADX WARN: Code duplicated, block: B:14:0x0037  */
        /* JADX WARN: Code duplicated, block: B:16:0x0041  */
        /* JADX WARN: Code duplicated, block: B:19:0x005d  */
        public String toString() {
            String str;
            boolean z = this.f10666d;
            boolean z2 = this.f10667e;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f10663a);
            sb.append('{');
            String str2 = "";
            for (C22792b c22792b = this.f10664b.f10670c; c22792b != null; c22792b = c22792b.f10670c) {
                Object obj = c22792b.f10669b;
                if (c22792b instanceof a) {
                    sb.append(str2);
                    str = c22792b.f10668a;
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
                        str = c22792b.f10668a;
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
                } else if (!z2 || !m15482k(obj)) {
                    sb.append(str2);
                    str = c22792b.f10668a;
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
    public static <T> T m15480a(T t, T t2) {
        if (t != null) {
            return t;
        }
        if (t2 != null) {
            return t2;
        }
        mnd0.m159157a("Both parameters are null");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static b m15481b(Object obj) {
        return new b(obj.getClass().getSimpleName());
    }
}
