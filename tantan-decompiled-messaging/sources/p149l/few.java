package p149l;

import android.graphics.Color;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class few implements j4m {

    /* JADX INFO: renamed from: b */
    public static final j4m f97162b = new few();

    /* JADX INFO: renamed from: d */
    public static j4m m121071d() {
        return f97162b;
    }

    @Override // p149l.j4m
    /* JADX INFO: renamed from: a */
    public boolean mo94463a(pi6 pi6Var, Message message) {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        return (NullChecker.m81303a(userM169527p9) && userM169527p9.isSVIP()) ? rd6.m178880s0(pi6Var.f149101a) : pi6Var.f149101a.lowPayOneSideConv();
    }

    @Override // p149l.j4m
    /* JADX INFO: renamed from: b */
    public CharSequence mo94464b(pi6 pi6Var, Message message) {
        int color = pi6Var.f149124x.getResources().getColor(w0c0.f183773I);
        if (upa.m194847z()) {
            color = Color.parseColor("#FF700A");
        }
        return zz6.m221002s0("解锁新配对", color);
    }
}
