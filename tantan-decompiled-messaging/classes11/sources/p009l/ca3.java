package p009l;

import com.p1.mobile.putong.core.CoreModule;
import l.ig3;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ca3 {
    /* JADX INFO: renamed from: a */
    public static ba3 m12464a(int i, boolean z) {
        if (i == 0) {
            return new wl3(z);
        }
        if (i == 1) {
            return m12465b();
        }
        if (i == 2) {
            return new m5h0();
        }
        ig3.a("异常的BoostStyle类型！");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static ba3 m12465b() {
        return CoreModule.P().a().b9() ? m12466c() : new jti0();
    }

    /* JADX INFO: renamed from: c */
    public static ba3 m12466c() {
        return new m5h0();
    }
}
