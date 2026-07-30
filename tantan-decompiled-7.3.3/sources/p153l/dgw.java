package p153l;

import android.graphics.Color;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class dgw implements z6m {

    /* JADX INFO: renamed from: b */
    public static final z6m f88398b = new dgw();

    /* JADX INFO: renamed from: d */
    public static z6m m115757d() {
        return f88398b;
    }

    @Override // p153l.z6m
    /* JADX INFO: renamed from: a */
    public boolean mo95724a(sj6 sj6Var, Message message) {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        return (NullChecker.m82486a(userM116600p9) && userM116600p9.isSVIP()) ? ue6.m195674s0(sj6Var.f168926a) : sj6Var.f168926a.lowPayOneSideConv();
    }

    @Override // p153l.z6m
    /* JADX INFO: renamed from: b */
    public CharSequence mo95725b(sj6 sj6Var, Message message) {
        int color = sj6Var.f168949x.getResources().getColor(c9c0.f80342I);
        if (gra.m131778z()) {
            color = Color.parseColor("#FF700A");
        }
        return c17.m107526s0("解锁新配对", color);
    }
}
