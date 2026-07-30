package com.p051p1.mobile.putong.live.external.direction.core;

import android.content.Context;
import android.content.Intent;
import com.p051p1.mobile.putong.app.PutongAct;
import p153l.fk3;
import p153l.fss;
import p153l.itd0;
import p153l.tbs;

/* JADX INFO: loaded from: classes9.dex */
public class LiveGoDummyAct extends PutongAct {
    /* JADX INFO: renamed from: X1 */
    public static Intent m70079X1(Context context) {
        return new Intent(context, (Class<?>) LiveGoDummyAct.class);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void onResumeLifecycle() {
        super.onResumeLifecycle();
        itd0<fk3> itd0Var = itd0.f116820b;
        fk3.C16995a c16995aM125962m = ((fk3) tbs.m190077m(itd0Var)).m125962m();
        ((fk3) tbs.m190077m(itd0Var)).m125956g();
        if (c16995aM125962m == null) {
            m68056e2();
            return;
        }
        int i = c16995aM125962m.f99474a;
        if (i == 1) {
            c16995aM125962m.f99478e.messageCustom.type = "slient";
            fss.m127253p(act(), c16995aM125962m.f99478e, c16995aM125962m.f99479f);
        } else if (i == 2) {
            fss.m127254q(this.act, c16995aM125962m.f99475b.toString(), c16995aM125962m.f99476c, c16995aM125962m.f99477d);
        } else {
            m68056e2();
        }
    }
}
