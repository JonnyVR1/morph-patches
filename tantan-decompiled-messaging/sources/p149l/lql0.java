package p149l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceGame;
import com.p046p1.mobile.putong.live.livingroom.virtual.ktv.member.VirtualVoiceMembersView;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class lql0 extends zsl0 {

    /* JADX INFO: renamed from: l */
    public BLiveVoiceGame f129361l;

    public lql0(bsm bsmVar, VirtualVoiceMembersView virtualVoiceMembersView) {
        super(bsmVar, virtualVoiceMembersView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A4 */
    public final void m151044A4(BLiveVoiceGame bLiveVoiceGame) {
        this.f129361l = bLiveVoiceGame;
        this.f114780i.m132487l(((nnn0) m206027E2()).m160249P2().m102069r());
    }

    @Override // p149l.oyl0, p149l.isl0
    /* JADX INFO: renamed from: X3 */
    public void mo138054X3(@NonNull w3o0 w3o0Var) {
        m151047z4(this.f129361l);
        super.mo138054X3(w3o0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.oyl0, p149l.isl0, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m151046y4();
        duringCreated(((nnn0) m206027E2()).m132160q1().m189054K()).subscribe(ffw.m121197h(new e30() { // from class: l.hql0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f109068a.m151045x4((LongLinkVirtualVoice.VoiceGameMessage) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ void m151045x4(LongLinkVirtualVoice.VoiceGameMessage voiceGameMessage) {
        m151046y4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y4 */
    public void m151046y4() {
        duringCreated(gql0.m127600g(((nnn0) m206027E2()).m149814k())).subscribe(ffw.m121197h(new e30() { // from class: l.iql0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f114519a.m151044A4((BLiveVoiceGame) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z4 */
    public final void m151047z4(BLiveVoiceGame bLiveVoiceGame) {
        List<BLiveVoiceCall> listM102067p = ((nnn0) m206027E2()).m160249P2().m102067p();
        if (vwb.m200296J(listM102067p)) {
            return;
        }
        vwb.m200354z(listM102067p, new e30() { // from class: l.jql0
            @Override // p149l.e30
            public final void call(Object obj) {
                ((BLiveVoiceCall) obj).isVoiceGaming = false;
            }
        });
        this.f129361l = bLiveVoiceGame;
        if (bLiveVoiceGame == null) {
            return;
        }
        List<String> list = bLiveVoiceGame.userIds;
        if (vwb.m200296J(list)) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            final String str = list.get(i);
            BLiveVoiceCall bLiveVoiceCall = (BLiveVoiceCall) vwb.m200346r(listM102067p, new w9j() { // from class: l.kql0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((BLiveVoiceCall) obj).user, str));
                }
            });
            if (bLiveVoiceCall != null) {
                bLiveVoiceCall.isVoiceGaming = true;
            }
        }
    }
}
