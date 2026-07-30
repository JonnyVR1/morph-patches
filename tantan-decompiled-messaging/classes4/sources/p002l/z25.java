package p002l;

import android.content.Intent;
import com.p000p1.mobile.putong.live.livingroom.archi.act.LiveCheckSdkActivity;
import l.djt;
import l.gkh0;
import l.hgt;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class z25 extends ruf0 {
    @Override // p002l.ruf0
    /* JADX INFO: renamed from: a */
    public void mo10063a(guf0 guf0Var) {
        uuf0 uuf0VarMo14046a = guf0Var.mo14046a();
        if (uuf0VarMo14046a.m23632b() != null) {
            guf0Var.mo14047b(uuf0VarMo14046a);
            return;
        }
        if (uuf0VarMo14046a.m23635e() && !vet.m23929u(hgt.Companion.S())) {
            gkh0.j("[live]voicePlayer", "pre check sdk when enter room");
            uuf0VarMo14046a.m23637g(new Intent(uuf0VarMo14046a.m23631a(), (Class<?>) LiveCheckSdkActivity.class));
        } else if (!djt.u() && !uuf0VarMo14046a.m23635e()) {
            Intent intent = new Intent(uuf0VarMo14046a.m23631a(), (Class<?>) LiveCheckSdkActivity.class);
            intent.putExtra("download_type", "ffmpeg_so_type");
            uuf0VarMo14046a.m23637g(intent);
        }
        guf0Var.mo14047b(uuf0VarMo14046a);
    }
}
