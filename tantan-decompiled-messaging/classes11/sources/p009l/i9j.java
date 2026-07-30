package p009l;

import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Message;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class i9j implements j4m {

    /* JADX INFO: renamed from: b */
    public static final j4m f14447b = new i9j();

    /* JADX INFO: renamed from: d */
    public static j4m m16284d() {
        return f14447b;
    }

    @Override // p009l.j4m
    /* JADX INFO: renamed from: a */
    public boolean mo11180a(pi6 pi6Var, Message message) {
        if (CoreModule.o.d().I5() && NullChecker.a(pi6Var.f18622a) && NullChecker.a(pi6Var.f18622a.additional) && NullChecker.a(pi6Var.f18622a.additional.greetingInfo) && pi6Var.f18622a.additional.greetingInfo.fromGreeting) {
            return true;
        }
        if (CoreModule.P().g().xn() && NullChecker.a(pi6Var.f18622a) && pi6Var.f18622a.isConfessionFirstConv()) {
            return true;
        }
        return CoreModule.P().a().jj() && NullChecker.a(pi6Var.f18622a) && pi6Var.f18622a.isConfessionFirstConv();
    }

    @Override // p009l.j4m
    /* JADX INFO: renamed from: b */
    public CharSequence mo11181b(pi6 pi6Var, Message message) {
        return m16869c("来自抢先告白");
    }
}
