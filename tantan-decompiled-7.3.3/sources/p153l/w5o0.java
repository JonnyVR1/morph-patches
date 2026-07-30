package p153l;

import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes10.dex */
public class w5o0 extends ssm0 {
    public w5o0(dum dumVar) {
        super(dumVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2, l.vp20] */
    @Override // p153l.ssm0
    /* JADX INFO: renamed from: Z3 */
    public C22421c<uxj0> mo187738Z3(User user) {
        return VoiceRoomApiProvider.forbiddenWords(m213810E2().m202194o(), user.f56859id);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2, l.vp20] */
    @Override // p153l.ssm0
    /* JADX INFO: renamed from: a4 */
    public C22421c<uxj0> mo187739a4(User user) {
        return VoiceRoomApiProvider.kickOffPerson(m213810E2().m202194o(), user.f56859id);
    }

    @Override // p153l.ssm0
    /* JADX INFO: renamed from: g4 */
    public void mo187744g4(Throwable th) {
        super.mo187744g4(th);
    }
}
