package p153l;

import android.content.Intent;
import com.p051p1.mobile.putong.live.livingroom.archi.act.InternationalAudioConflictAct;
import com.p051p1.mobile.putong.util.audio.AudioBusinessType;

/* JADX INFO: loaded from: classes4.dex */
public class n35 extends a3g0 {
    @Override // p153l.a3g0
    /* JADX INFO: renamed from: a */
    public void mo95802a(p2g0 p2g0Var) {
        AudioBusinessType audioBusinessTypeMo171474c = pb1.m171472b().mo171474c();
        d3g0 d3g0VarMo170350a = p2g0Var.mo170350a();
        if (audioBusinessTypeMo171474c == null || audioBusinessTypeMo171474c == AudioBusinessType.CHAT_ROOM_WINDOW) {
            p2g0Var.mo170351b(d3g0VarMo170350a);
            return;
        }
        Intent intent = new Intent(d3g0VarMo170350a.m113811a(), (Class<?>) InternationalAudioConflictAct.class);
        intent.putExtra("startData", d3g0VarMo170350a.m113813c());
        d3g0VarMo170350a.m113817g(intent);
        p2g0Var.mo170351b(d3g0VarMo170350a);
    }
}
