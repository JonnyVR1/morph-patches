package p153l;

import android.content.Intent;
import com.p051p1.mobile.putong.live.livingroom.archi.act.LiveCheckSdkActivity;

/* JADX INFO: loaded from: classes4.dex */
public class a45 extends a3g0 {
    @Override // p153l.a3g0
    /* JADX INFO: renamed from: a */
    public void mo95802a(p2g0 p2g0Var) {
        d3g0 d3g0VarMo170350a = p2g0Var.mo170350a();
        if (d3g0VarMo170350a.m113812b() != null) {
            p2g0Var.mo170351b(d3g0VarMo170350a);
            return;
        }
        if (d3g0VarMo170350a.m113815e() && !wgt.m206254u(iit.INSTANCE.m140133S())) {
            nsh0.m164608j("[live]voicePlayer", "pre check sdk when enter room");
            d3g0VarMo170350a.m113817g(new Intent(d3g0VarMo170350a.m113811a(), (Class<?>) LiveCheckSdkActivity.class));
        } else if (!elt.m121283u() && !d3g0VarMo170350a.m113815e()) {
            Intent intent = new Intent(d3g0VarMo170350a.m113811a(), (Class<?>) LiveCheckSdkActivity.class);
            intent.putExtra("download_type", "ffmpeg_so_type");
            d3g0VarMo170350a.m113817g(intent);
        }
        p2g0Var.mo170351b(d3g0VarMo170350a);
    }
}
