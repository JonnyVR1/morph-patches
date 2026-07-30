package p149l;

import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes11.dex */
public class yi3 implements j4m {

    /* JADX INFO: renamed from: b */
    public static final j4m f198440b = new yi3();

    /* JADX INFO: renamed from: d */
    public static j4m m214881d() {
        return f198440b;
    }

    @Override // p149l.j4m
    /* JADX INFO: renamed from: a */
    public boolean mo94463a(pi6 pi6Var, Message message) {
        return User.isBusinessAI1V1(pi6Var.f149101a.f56011id);
    }

    @Override // p149l.j4m
    /* JADX INFO: renamed from: b */
    public CharSequence mo94464b(pi6 pi6Var, Message message) {
        return zz6.m221002s0("AI伴侣", pi6Var.f149124x.getResources().getColor(w0c0.f183773I));
    }
}
