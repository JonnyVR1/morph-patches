package p002l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.tantanapp.common.data.DbObject;
import l.lsi0;
import l.ygt;
import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class y8k0 extends kud0<ygt> {
    /* JADX WARN: Type inference failed for: r0v11, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v3, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v6, types: [l.ho2] */
    /* JADX INFO: renamed from: b */
    public final String m26441b(c2e0 c2e0Var) {
        return (c2e0Var.m25547E2() == 0 || c2e0Var.m25547E2().m14582l0() == null || TextUtils.isEmpty(((DbObject) c2e0Var.m25547E2().m14582l0()).id)) ? "" : ((DbObject) c2e0Var.m25547E2().m14582l0()).id;
    }

    @Override // p002l.kud0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo9496a(ygt ygtVar, c2e0 c2e0Var, x1e0.C0892b c0892b) {
        z8k0.C0938a c0938a = (z8k0.C0938a) c2e0Var.m14184F3(new z8k0(700));
        if (c2e0Var.m25552L2()) {
            lsi0.w(R$string.f3207c7);
        } else if (c0938a != null) {
            m26441b(c2e0Var);
            ypv.a.x(c2e0Var.act(), c0938a);
        }
    }
}
