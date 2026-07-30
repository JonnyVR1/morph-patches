package p153l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceGame;
import com.p051p1.mobile.putong.live.livingroom.virtual.ktv.member.VirtualVoiceMembersView;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class pzl0 extends d2m0 {

    /* JADX INFO: renamed from: l */
    public BLiveVoiceGame f154934l;

    public pzl0(dum dumVar, VirtualVoiceMembersView virtualVoiceMembersView) {
        super(dumVar, virtualVoiceMembersView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A4 */
    public final void m174533A4(BLiveVoiceGame bLiveVoiceGame) {
        this.f154934l = bLiveVoiceGame;
        this.f134449i.m137019l(((rwn0) m213810E2()).m183411P2().m136879r());
    }

    @Override // p153l.s7m0, p153l.m1m0
    /* JADX INFO: renamed from: X3 */
    public void mo156713X3(@NonNull ado0 ado0Var) {
        m174536z4(this.f154934l);
        super.mo156713X3(ado0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.s7m0, p153l.m1m0, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m174535y4();
        duringCreated(((rwn0) m213810E2()).m168545q1().m98236K()).subscribe(dhw.m115829h(new y20() { // from class: l.lzl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f134236a.m174534x4((LongLinkVirtualVoice.VoiceGameMessage) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ void m174534x4(LongLinkVirtualVoice.VoiceGameMessage voiceGameMessage) {
        m174535y4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y4 */
    public void m174535y4() {
        duringCreated(kzl0.m152185g(((rwn0) m213810E2()).m202191k())).subscribe(dhw.m115829h(new y20() { // from class: l.mzl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f139532a.m174533A4((BLiveVoiceGame) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z4 */
    public final void m174536z4(BLiveVoiceGame bLiveVoiceGame) {
        List<BLiveVoiceCall> listM136877p = ((rwn0) m213810E2()).m183411P2().m136877p();
        if (jyb.m147479J(listM136877p)) {
            return;
        }
        jyb.m147537z(listM136877p, new y20() { // from class: l.nzl0
            @Override // p153l.y20
            public final void call(Object obj) {
                ((BLiveVoiceCall) obj).isVoiceGaming = false;
            }
        });
        this.f154934l = bLiveVoiceGame;
        if (bLiveVoiceGame == null) {
            return;
        }
        List<String> list = bLiveVoiceGame.userIds;
        if (jyb.m147479J(list)) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            final String str = list.get(i);
            BLiveVoiceCall bLiveVoiceCall = (BLiveVoiceCall) jyb.m147529r(listM136877p, new qcj() { // from class: l.ozl0
                @Override // p153l.qcj
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
