package p149l;

import android.app.Dialog;
import android.content.Context;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes12.dex */
public class lyg extends i0e {

    /* JADX INFO: renamed from: l.lyg$a */
    public static class C18354a<T> {

        /* JADX INFO: renamed from: a */
        public cyg<T> f130564a;

        /* JADX INFO: renamed from: b */
        public String f130565b = "";

        /* JADX INFO: renamed from: c */
        public int f130566c;

        /* JADX INFO: renamed from: d */
        public T f130567d;

        /* JADX INFO: renamed from: e */
        public e30 f130568e;

        /* JADX INFO: renamed from: f */
        public Context f130569f;

        public C18354a(Context context) {
            this.f130569f = context;
        }

        /* JADX INFO: renamed from: a */
        public Dialog m152250a() {
            return new lyg().m152249h(this);
        }

        /* JADX INFO: renamed from: b */
        public Dialog m152251b() {
            Dialog dialogM152250a = m152250a();
            dialogM152250a.show();
            i0e.m133797f(((fqg) dialogM152250a).f98806a);
            return dialogM152250a;
        }

        /* JADX INFO: renamed from: c */
        public C18354a m152252c(e30 e30Var) {
            this.f130568e = e30Var;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C18354a m152253d(int i) {
            this.f130566c = i;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C18354a m152254e(T t) {
            this.f130567d = t;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C18354a m152255f(String str) {
            this.f130565b = str;
            return this;
        }
    }

    /* JADX INFO: renamed from: i */
    public static cyg m152248i(C18354a c18354a) {
        if (NullChecker.m81303a(c18354a.f130564a)) {
            return c18354a.f130564a;
        }
        String str = c18354a.f130565b;
        int iHashCode = str.hashCode();
        if (iHashCode != -418967609) {
            if (iHashCode != 1604114787) {
                if (iHashCode == 1778595596) {
                    str.equals("TEXT_TYPE");
                }
            } else if (str.equals("SELECT_ITEM_TYPE")) {
                return new dyg();
            }
        } else if (str.equals("TWO_LINKAGE_TYPE")) {
            return new gyg();
        }
        return new fyg();
    }

    /* JADX INFO: renamed from: h */
    public final Dialog m152249h(C18354a c18354a) {
        fqg fqgVar = new fqg(c18354a.f130569f);
        m152248i(c18354a).mo109309a(c18354a.f130567d, c18354a, fqgVar);
        return fqgVar;
    }
}
