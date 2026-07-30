package p149l;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class t050 {

    /* JADX INFO: renamed from: l.t050$a */
    public static final class C20089a {

        /* JADX INFO: renamed from: a */
        public final String f167100a;

        /* JADX INFO: renamed from: b */
        public final a f167101b;

        /* JADX INFO: renamed from: c */
        public a f167102c;

        /* JADX INFO: renamed from: d */
        public boolean f167103d;

        /* JADX INFO: renamed from: l.t050$a$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            public String f167104a;

            /* JADX INFO: renamed from: b */
            public Object f167105b;

            /* JADX INFO: renamed from: c */
            public a f167106c;

            public a() {
            }
        }

        public C20089a(String str) {
            a aVar = new a();
            this.f167101b = aVar;
            this.f167102c = aVar;
            this.f167103d = false;
            this.f167100a = (String) rf80.m179116g(str);
        }

        /* JADX INFO: renamed from: a */
        public C20089a m186816a(String str, int i) {
            return m186820e(str, String.valueOf(i));
        }

        /* JADX INFO: renamed from: b */
        public C20089a m186817b(String str, Object obj) {
            return m186820e(str, obj);
        }

        /* JADX INFO: renamed from: c */
        public C20089a m186818c(String str, boolean z) {
            return m186820e(str, String.valueOf(z));
        }

        /* JADX INFO: renamed from: d */
        public final a m186819d() {
            a aVar = new a();
            this.f167102c.f167106c = aVar;
            this.f167102c = aVar;
            return aVar;
        }

        /* JADX INFO: renamed from: e */
        public final C20089a m186820e(String str, Object obj) {
            a aVarM186819d = m186819d();
            aVarM186819d.f167105b = obj;
            aVarM186819d.f167104a = (String) rf80.m179116g(str);
            return this;
        }

        public String toString() {
            boolean z = this.f167103d;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f167100a);
            sb.append('{');
            String str = "";
            for (a aVar = this.f167101b.f167106c; aVar != null; aVar = aVar.f167106c) {
                Object obj = aVar.f167105b;
                if (!z || obj != null) {
                    sb.append(str);
                    String str2 = aVar.f167104a;
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
    public static boolean m186814a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static C20089a m186815b(Object obj) {
        return new C20089a(obj.getClass().getSimpleName());
    }
}
