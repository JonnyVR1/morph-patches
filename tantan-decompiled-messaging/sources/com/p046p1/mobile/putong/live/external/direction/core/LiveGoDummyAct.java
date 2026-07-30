package com.p046p1.mobile.putong.live.external.direction.core;

import android.content.Context;
import android.content.Intent;
import com.p046p1.mobile.putong.app.PutongAct;
import p149l.eqs;
import p149l.gld0;
import p149l.nj3;
import p149l.s9s;

/* JADX INFO: loaded from: classes13.dex */
public class LiveGoDummyAct extends PutongAct {
    /* JADX INFO: renamed from: V1 */
    public static Intent m68896V1(Context context) {
        return new Intent(context, (Class<?>) LiveGoDummyAct.class);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void onResumeLifecycle() {
        super.onResumeLifecycle();
        gld0<nj3> gld0Var = gld0.f103312b;
        nj3.C18704a c18704aM159631m = ((nj3) s9s.m182763m(gld0Var)).m159631m();
        ((nj3) s9s.m182763m(gld0Var)).m159625g();
        if (c18704aM159631m == null) {
            m66873d2();
            return;
        }
        int i = c18704aM159631m.f139201a;
        if (i == 1) {
            c18704aM159631m.f139205e.messageCustom.type = "slient";
            eqs.m117788p(act(), c18704aM159631m.f139205e, c18704aM159631m.f139206f);
        } else if (i == 2) {
            eqs.m117789q(this.act, c18704aM159631m.f139202b.toString(), c18704aM159631m.f139203c, c18704aM159631m.f139204d);
        } else {
            m66873d2();
        }
    }
}
