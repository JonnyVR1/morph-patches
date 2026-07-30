package p002l;

import android.content.Intent;
import com.p000p1.mobile.putong.live.livingroom.archi.act.InternationalAudioConflictAct;
import com.p1.mobile.putong.util.audio.AudioBusinessType;
import java.io.Serializable;
import l.ib1;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class o25 extends ruf0 {
    @Override // p002l.ruf0
    /* JADX INFO: renamed from: a */
    public void mo10063a(guf0 guf0Var) {
        AudioBusinessType audioBusinessTypeC = ib1.b().c();
        uuf0 uuf0VarMo14046a = guf0Var.mo14046a();
        if (audioBusinessTypeC == null || audioBusinessTypeC == AudioBusinessType.CHAT_ROOM_WINDOW) {
            guf0Var.mo14047b(uuf0VarMo14046a);
            return;
        }
        Intent intent = new Intent(uuf0VarMo14046a.m23631a(), (Class<?>) InternationalAudioConflictAct.class);
        intent.putExtra("startData", (Serializable) uuf0VarMo14046a.m23633c());
        uuf0VarMo14046a.m23637g(intent);
        guf0Var.mo14047b(uuf0VarMo14046a);
    }
}
