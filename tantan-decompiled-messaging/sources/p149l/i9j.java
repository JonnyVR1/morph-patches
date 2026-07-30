package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Message;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class i9j implements j4m {

    /* JADX INFO: renamed from: b */
    public static final j4m f112226b = new i9j();

    /* JADX INFO: renamed from: d */
    public static j4m m135056d() {
        return f112226b;
    }

    @Override // p149l.j4m
    /* JADX INFO: renamed from: a */
    public boolean mo94463a(pi6 pi6Var, Message message) {
        if (CoreModule.f17557o.m195057d().mo33700I5() && NullChecker.m81303a(pi6Var.f149101a) && NullChecker.m81303a(pi6Var.f149101a.additional) && NullChecker.m81303a(pi6Var.f149101a.additional.greetingInfo) && pi6Var.f149101a.additional.greetingInfo.fromGreeting) {
            return true;
        }
        if (CoreModule.m29935P().m94656g().mo35085xn() && NullChecker.m81303a(pi6Var.f149101a) && pi6Var.f149101a.isConfessionFirstConv()) {
            return true;
        }
        return CoreModule.m29935P().m94651a().mo33526jj() && NullChecker.m81303a(pi6Var.f149101a) && pi6Var.f149101a.isConfessionFirstConv();
    }

    @Override // p149l.j4m
    /* JADX INFO: renamed from: b */
    public CharSequence mo94464b(pi6 pi6Var, Message message) {
        return m139684c("来自抢先告白");
    }
}
