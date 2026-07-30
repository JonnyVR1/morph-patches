package p149l;

import android.content.Intent;
import com.p046p1.mobile.putong.live.livingroom.archi.act.LiveCheckSdkActivity;

/* JADX INFO: loaded from: classes4.dex */
public class z25 extends ruf0 {
    @Override // p149l.ruf0
    /* JADX INFO: renamed from: a */
    public void mo98305a(guf0 guf0Var) {
        uuf0 uuf0VarMo128030a = guf0Var.mo128030a();
        if (uuf0VarMo128030a.m195358b() != null) {
            guf0Var.mo128031b(uuf0VarMo128030a);
            return;
        }
        if (uuf0VarMo128030a.m195361e() && !vet.m198237u(hgt.INSTANCE.m130912S())) {
            gkh0.m126627j("[live]voicePlayer", "pre check sdk when enter room");
            uuf0VarMo128030a.m195363g(new Intent(uuf0VarMo128030a.m195357a(), (Class<?>) LiveCheckSdkActivity.class));
        } else if (!djt.m112138u() && !uuf0VarMo128030a.m195361e()) {
            Intent intent = new Intent(uuf0VarMo128030a.m195357a(), (Class<?>) LiveCheckSdkActivity.class);
            intent.putExtra("download_type", "ffmpeg_so_type");
            uuf0VarMo128030a.m195363g(intent);
        }
        guf0Var.mo128031b(uuf0VarMo128030a);
    }
}
