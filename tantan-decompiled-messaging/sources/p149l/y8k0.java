package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.livingroom.R$string;

/* JADX INFO: loaded from: classes4.dex */
public class y8k0 extends kud0<ygt> {
    /* JADX WARN: Type inference failed for: r0v11, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v3, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v6, types: [l.ho2] */
    /* JADX INFO: renamed from: b */
    public final String m213407b(c2e0 c2e0Var) {
        return (c2e0Var.m206027E2() == 0 || c2e0Var.m206027E2().m132146l0() == null || TextUtils.isEmpty(c2e0Var.m206027E2().m132146l0().f56011id)) ? "" : c2e0Var.m206027E2().m132146l0().f56011id;
    }

    @Override // p149l.kud0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo95830a(ygt ygtVar, c2e0 c2e0Var, x1e0.C21019b c21019b) {
        z8k0.C21648a c21648a = (z8k0.C21648a) c2e0Var.m129297F3(new z8k0(700));
        if (c2e0Var.m206032L2()) {
            lsi0.m151593w(R$string.f47165c7);
        } else if (c21648a != null) {
            m213407b(c2e0Var);
            ypv.f199493a.m199380x(c2e0Var.act(), c21648a);
        }
    }
}
