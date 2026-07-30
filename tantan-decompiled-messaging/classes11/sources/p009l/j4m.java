package p009l;

import com.p1.mobile.putong.core.data.Message;
import l.jji0;
import l.upa;
import l.zz6;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public interface j4m {

    /* JADX INFO: renamed from: a */
    public static final int f14933a;

    static {
        f14933a = upa.z() ? -11711155 : -1728053248;
    }

    /* JADX INFO: renamed from: a */
    boolean mo11180a(pi6 pi6Var, Message message);

    /* JADX INFO: renamed from: b */
    CharSequence mo11181b(pi6 pi6Var, Message message);

    /* JADX INFO: renamed from: c */
    default CharSequence m16869c(String str) {
        return jji0.b(str) ? "" : zz6.s0(str, f14933a);
    }
}
