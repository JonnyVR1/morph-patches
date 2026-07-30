package p153l;

import com.p051p1.mobile.putong.core.data.Message;

/* JADX INFO: loaded from: classes11.dex */
public interface z6m {

    /* JADX INFO: renamed from: a */
    public static final int f203167a;

    static {
        f203167a = gra.m131778z() ? -11711155 : -1728053248;
    }

    /* JADX INFO: renamed from: a */
    boolean mo95724a(sj6 sj6Var, Message message);

    /* JADX INFO: renamed from: b */
    CharSequence mo95725b(sj6 sj6Var, Message message);

    /* JADX INFO: renamed from: c */
    default CharSequence m218804c(String str) {
        return jsi0.m146843b(str) ? "" : c17.m107526s0(str, f203167a);
    }
}
