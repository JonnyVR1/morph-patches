package p153l;

import android.content.Intent;
import android.os.Bundle;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.act.InternationalAudioConflictAct;

/* JADX INFO: loaded from: classes4.dex */
public class c1w extends a3g0 {
    @Override // p153l.a3g0
    /* JADX INFO: renamed from: a */
    public void mo95802a(p2g0 p2g0Var) {
        d3g0 d3g0VarMo170350a = p2g0Var.mo170350a();
        if (!d3g0VarMo170350a.m113815e()) {
            p2g0Var.mo170351b(d3g0VarMo170350a);
            return;
        }
        if (!zrv.f205799a.m207631D0().equals(d3g0VarMo170350a.m113813c().live.anchor.f45267id)) {
            p2g0Var.mo170351b(d3g0VarMo170350a);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString(InternationalAudioConflictAct.f48536c, InternationalAudioConflictAct.f48537d);
        bundle.putString(InternationalAudioConflictAct.f48538e, xau.m209910t(R$string.f48328qf));
        Intent intent = new Intent(d3g0VarMo170350a.m113811a(), (Class<?>) InternationalAudioConflictAct.class);
        intent.putExtras(bundle);
        d3g0VarMo170350a.m113817g(intent);
        p2g0Var.mo170351b(d3g0VarMo170350a);
    }
}
