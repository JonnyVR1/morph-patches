package p149l;

import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
public class swn0 extends ojm0 {
    public swn0(bsm bsmVar) {
        super(bsmVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2, l.lh20] */
    @Override // p149l.ojm0
    /* JADX INFO: renamed from: Z3 */
    public C22306c<roj0> mo164698Z3(User user) {
        return VoiceRoomApiProvider.forbiddenWords(m206027E2().m149818o(), user.f56011id);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2, l.lh20] */
    @Override // p149l.ojm0
    /* JADX INFO: renamed from: a4 */
    public C22306c<roj0> mo164699a4(User user) {
        return VoiceRoomApiProvider.kickOffPerson(m206027E2().m149818o(), user.f56011id);
    }

    @Override // p149l.ojm0
    /* JADX INFO: renamed from: g4 */
    public void mo164704g4(Throwable th) {
        super.mo164704g4(th);
    }
}
