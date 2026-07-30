package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.bean.AnchorStartData;
import com.p046p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p046p1.mobile.putong.live.base.data.BLiveRoomInProfile;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoomInProfile;
import com.p046p1.mobile.putong.live.external.R$string;
import com.p046p1.mobile.putong.live.external.module.api.MyRoomInProfileNewApi;
import com.p046p1.mobile.putong.util.audio.AudioBusinessType;

/* JADX INFO: loaded from: classes13.dex */
public class jw10 extends jq2<ow10> {

    /* JADX INFO: renamed from: a */
    public final String f120007a;

    /* JADX INFO: renamed from: b */
    public final String f120008b;

    /* JADX INFO: renamed from: c */
    public final MyRoomInProfileNewApi f120009c;

    public jw10(mcr mcrVar, String str, String str2) {
        super(mcrVar);
        this.f120009c = new MyRoomInProfileNewApi();
        this.f120007a = str;
        this.f120008b = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m143608k0(Boolean bool) {
        ((ow10) this.viewModel).m166222l(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m143609l0(j760 j760Var) {
        ((ow10) this.viewModel).m166227s(j760Var, new e30() { // from class: l.hw10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f109715a.m143611n0((BLiveRoomInProfile) obj);
            }
        }, new e30() { // from class: l.iw10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f115219a.m143612o0((BLiveVoiceRoomInProfile) obj);
            }
        }, this.f120008b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m143610m0(Throwable th) {
        ((ow10) this.viewModel).m166222l(true);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        duringCreated(sqa0.m185475b().m185476a()).filter(new w9j() { // from class: l.dw10
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((Boolean) obj) != null);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.ew10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f93419a.m143608k0((Boolean) obj);
            }
        }));
        duringCreated(this.f120009c.getMyRoomInProfileNew(this.f120007a)).subscribe(ffw.m121194e(new e30() { // from class: l.fw10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f99597a.m143609l0((j760) obj);
            }
        }, new e30() { // from class: l.gw10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f104652a.m143610m0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n0 */
    public final void m143611n0(BLiveRoomInProfile bLiveRoomInProfile) {
        if (l9s.m149044G().mo67253Zo().mo111890a()) {
            lsi0.m151593w(R$string.f44862B0);
            return;
        }
        AudioBusinessType audioBusinessTypeMo135235c = ib1.m135233b().mo135235c();
        if (audioBusinessTypeMo135235c == AudioBusinessType.VIDEO_CHAT) {
            lsi0.m151595y(audioBusinessTypeMo135235c.getBusinessMsg());
            return;
        }
        c6j0.m105479e(false, bLiveRoomInProfile.anchorId, bLiveRoomInProfile.liveId, bLiveRoomInProfile.status, bLiveRoomInProfile.multiCallInfo.role, this.f120008b);
        if (TextUtils.equals(this.f120007a, l9s.m149093o0())) {
            s9s.f163232f.m134368a(act(), AnchorStartData.getBuilder().m67562m(false).m67563n("my_room_in_profile").m67560k());
        } else {
            act().startActivity(s9s.f163232f.m134373f(act(), AudienceStartData.getBuilder().m67594E(bLiveRoomInProfile.liveId).m67616z(this.f120007a).m67604O("my_room_in_profile").m67611u()));
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final void m143612o0(BLiveVoiceRoomInProfile bLiveVoiceRoomInProfile) {
        if (l9s.m149044G().mo67253Zo().mo111890a()) {
            lsi0.m151593w(R$string.f44862B0);
            return;
        }
        AudioBusinessType audioBusinessTypeMo135235c = ib1.m135233b().mo135235c();
        if (audioBusinessTypeMo135235c == AudioBusinessType.VIDEO_CHAT) {
            lsi0.m151595y(audioBusinessTypeMo135235c.getBusinessMsg());
            return;
        }
        c6j0.m105482h(false, bLiveVoiceRoomInProfile.anchorId, bLiveVoiceRoomInProfile.voiceLiveId, false, bLiveVoiceRoomInProfile.topicId, true);
        if (TextUtils.equals(this.f120007a, l9s.m149093o0()) && bLiveVoiceRoomInProfile.needBuild) {
            ehn0.m116502e(act(), AnchorStartData.getBuilder().m67563n("my_room_in_profile").m67560k());
        } else if (!bLiveVoiceRoomInProfile.isPersonal || TextUtils.equals(this.f120007a, l9s.m149093o0())) {
            act().startActivity(s9s.f163232f.m134373f(act(), AudienceStartData.getBuilder().m67594E(bLiveVoiceRoomInProfile.voiceLiveId).m67604O("my_room_in_profile").m67615y("").m67606Q(true).m67616z(this.f120007a).m67611u()));
        } else {
            lsi0.m151595y("私人房暂不对外开放~");
        }
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
