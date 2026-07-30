package p149l;

import com.p046p1.mobile.putong.core.data.Message;

/* JADX INFO: loaded from: classes11.dex */
public interface j4m {

    /* JADX INFO: renamed from: a */
    public static final int f116204a;

    static {
        f116204a = upa.m194847z() ? -11711155 : -1728053248;
    }

    /* JADX INFO: renamed from: a */
    boolean mo94463a(pi6 pi6Var, Message message);

    /* JADX INFO: renamed from: b */
    CharSequence mo94464b(pi6 pi6Var, Message message);

    /* JADX INFO: renamed from: c */
    default CharSequence m139684c(String str) {
        return jji0.m141806b(str) ? "" : zz6.m221002s0(str, f116204a);
    }
}
