package p002l;

import android.content.Intent;
import android.os.Bundle;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.archi.act.InternationalAudioConflictAct;
import l.w8u;
import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ezv extends ruf0 {
    @Override // p002l.ruf0
    /* JADX INFO: renamed from: a */
    public void mo10063a(guf0 guf0Var) {
        uuf0 uuf0VarMo14046a = guf0Var.mo14046a();
        if (!uuf0VarMo14046a.m23635e()) {
            guf0Var.mo14047b(uuf0VarMo14046a);
            return;
        }
        if (!ypv.a.D0().equals(uuf0VarMo14046a.m23633c().live.anchor.id)) {
            guf0Var.mo14047b(uuf0VarMo14046a);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString(InternationalAudioConflictAct.f3730c, InternationalAudioConflictAct.f3731d);
        bundle.putString(InternationalAudioConflictAct.f3732e, w8u.t(R$string.f3522qf));
        Intent intent = new Intent(uuf0VarMo14046a.m23631a(), (Class<?>) InternationalAudioConflictAct.class);
        intent.putExtras(bundle);
        uuf0VarMo14046a.m23637g(intent);
        guf0Var.mo14047b(uuf0VarMo14046a);
    }
}
