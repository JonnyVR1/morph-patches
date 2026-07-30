package p009l;

import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import com.tantanapp.common.data.DbObject;
import l.bsm;
import l.roj0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class swn0 extends ojm0 {
    public swn0(bsm bsmVar) {
        super(bsmVar);
    }

    @Override // p009l.ojm0
    /* JADX INFO: renamed from: Z3 */
    public c<roj0> mo19879Z3(User user) {
        return VoiceRoomApiProvider.forbiddenWords(E2().o(), ((DbObject) user).id);
    }

    @Override // p009l.ojm0
    /* JADX INFO: renamed from: a4 */
    public c<roj0> mo19880a4(User user) {
        return VoiceRoomApiProvider.kickOffPerson(E2().o(), ((DbObject) user).id);
    }

    @Override // p009l.ojm0
    /* JADX INFO: renamed from: g4 */
    public void mo19885g4(Throwable th) {
        super.mo19885g4(th);
    }
}
