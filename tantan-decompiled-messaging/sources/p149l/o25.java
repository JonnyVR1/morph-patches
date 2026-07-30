package p149l;

import android.content.Intent;
import com.p046p1.mobile.putong.live.livingroom.archi.act.InternationalAudioConflictAct;
import com.p046p1.mobile.putong.util.audio.AudioBusinessType;

/* JADX INFO: loaded from: classes4.dex */
public class o25 extends ruf0 {
    @Override // p149l.ruf0
    /* JADX INFO: renamed from: a */
    public void mo98305a(guf0 guf0Var) {
        AudioBusinessType audioBusinessTypeMo135235c = ib1.m135233b().mo135235c();
        uuf0 uuf0VarMo128030a = guf0Var.mo128030a();
        if (audioBusinessTypeMo135235c == null || audioBusinessTypeMo135235c == AudioBusinessType.CHAT_ROOM_WINDOW) {
            guf0Var.mo128031b(uuf0VarMo128030a);
            return;
        }
        Intent intent = new Intent(uuf0VarMo128030a.m195357a(), (Class<?>) InternationalAudioConflictAct.class);
        intent.putExtra("startData", uuf0VarMo128030a.m195359c());
        uuf0VarMo128030a.m195363g(intent);
        guf0Var.mo128031b(uuf0VarMo128030a);
    }
}
