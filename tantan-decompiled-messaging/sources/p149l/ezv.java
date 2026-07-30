package p149l;

import android.content.Intent;
import android.os.Bundle;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.act.InternationalAudioConflictAct;

/* JADX INFO: loaded from: classes4.dex */
public class ezv extends ruf0 {
    @Override // p149l.ruf0
    /* JADX INFO: renamed from: a */
    public void mo98305a(guf0 guf0Var) {
        uuf0 uuf0VarMo128030a = guf0Var.mo128030a();
        if (!uuf0VarMo128030a.m195361e()) {
            guf0Var.mo128031b(uuf0VarMo128030a);
            return;
        }
        if (!ypv.f199493a.m199309D0().equals(uuf0VarMo128030a.m195359c().live.anchor.f44419id)) {
            guf0Var.mo128031b(uuf0VarMo128030a);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString(InternationalAudioConflictAct.f47688c, InternationalAudioConflictAct.f47689d);
        bundle.putString(InternationalAudioConflictAct.f47690e, w8u.m202217t(R$string.f47480qf));
        Intent intent = new Intent(uuf0VarMo128030a.m195357a(), (Class<?>) InternationalAudioConflictAct.class);
        intent.putExtras(bundle);
        uuf0VarMo128030a.m195363g(intent);
        guf0Var.mo128031b(uuf0VarMo128030a);
    }
}
