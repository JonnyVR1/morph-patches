package p153l;

import android.app.Dialog;
import android.content.Context;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes13.dex */
public class a0h extends w1e {

    /* JADX INFO: renamed from: l.a0h$a */
    public static class C15613a<T> {

        /* JADX INFO: renamed from: a */
        public rzg<T> f67713a;

        /* JADX INFO: renamed from: b */
        public String f67714b = "";

        /* JADX INFO: renamed from: c */
        public int f67715c;

        /* JADX INFO: renamed from: d */
        public T f67716d;

        /* JADX INFO: renamed from: e */
        public y20 f67717e;

        /* JADX INFO: renamed from: f */
        public Context f67718f;

        public C15613a(Context context) {
            this.f67718f = context;
        }

        /* JADX INFO: renamed from: a */
        public Dialog m95397a() {
            return new a0h().m95396h(this);
        }

        /* JADX INFO: renamed from: b */
        public Dialog m95398b() {
            Dialog dialogM95397a = m95397a();
            dialogM95397a.show();
            w1e.m204402f(((urg) dialogM95397a).f180614a);
            return dialogM95397a;
        }

        /* JADX INFO: renamed from: c */
        public C15613a m95399c(y20 y20Var) {
            this.f67717e = y20Var;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C15613a m95400d(int i) {
            this.f67715c = i;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C15613a m95401e(T t) {
            this.f67716d = t;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C15613a m95402f(String str) {
            this.f67714b = str;
            return this;
        }
    }

    /* JADX INFO: renamed from: i */
    public static rzg m95395i(C15613a c15613a) {
        if (NullChecker.m82486a(c15613a.f67713a)) {
            return c15613a.f67713a;
        }
        String str = c15613a.f67714b;
        int iHashCode = str.hashCode();
        if (iHashCode != -418967609) {
            if (iHashCode != 1604114787) {
                if (iHashCode == 1778595596) {
                    str.equals("TEXT_TYPE");
                }
            } else if (str.equals("SELECT_ITEM_TYPE")) {
                return new szg();
            }
        } else if (str.equals("TWO_LINKAGE_TYPE")) {
            return new vzg();
        }
        return new uzg();
    }

    /* JADX INFO: renamed from: h */
    public final Dialog m95396h(C15613a c15613a) {
        urg urgVar = new urg(c15613a.f67718f);
        m95395i(c15613a).mo183746a(c15613a.f67716d, c15613a, urgVar);
        return urgVar;
    }
}
