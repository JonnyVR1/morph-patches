package p007l;

import android.app.Dialog;
import android.content.Context;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.i0e;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class lyg extends i0e {

    /* JADX INFO: renamed from: l.lyg$a */
    public static class C2422a<T> {

        /* JADX INFO: renamed from: a */
        public cyg<T> f10156a;

        /* JADX INFO: renamed from: b */
        public String f10157b = "";

        /* JADX INFO: renamed from: c */
        public int f10158c;

        /* JADX INFO: renamed from: d */
        public T f10159d;

        /* JADX INFO: renamed from: e */
        public e30 f10160e;

        /* JADX INFO: renamed from: f */
        public Context f10161f;

        public C2422a(Context context) {
            this.f10161f = context;
        }

        /* JADX INFO: renamed from: a */
        public Dialog m11717a() {
            return new lyg().m11716h(this);
        }

        /* JADX INFO: renamed from: b */
        public Dialog m11718b() {
            Dialog dialogM11717a = m11717a();
            dialogM11717a.show();
            i0e.f(((fqg) dialogM11717a).f8191a);
            return dialogM11717a;
        }

        /* JADX INFO: renamed from: c */
        public C2422a m11719c(e30 e30Var) {
            this.f10160e = e30Var;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C2422a m11720d(int i) {
            this.f10158c = i;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C2422a m11721e(T t) {
            this.f10159d = t;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C2422a m11722f(String str) {
            this.f10157b = str;
            return this;
        }
    }

    /* JADX INFO: renamed from: i */
    public static cyg m11715i(C2422a c2422a) {
        if (NullChecker.a(c2422a.f10156a)) {
            return c2422a.f10156a;
        }
        String str = c2422a.f10157b;
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
    public final Dialog m11716h(C2422a c2422a) {
        fqg fqgVar = new fqg(c2422a.f10161f);
        m11715i(c2422a).mo9254a(c2422a.f10159d, c2422a, fqgVar);
        return fqgVar;
    }
}
