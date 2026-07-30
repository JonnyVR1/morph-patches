package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.bean.AnchorStartData;
import com.p051p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p051p1.mobile.putong.live.base.data.BLiveRoomInProfile;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoomInProfile;
import com.p051p1.mobile.putong.live.external.R$string;
import com.p051p1.mobile.putong.live.external.module.api.MyRoomInProfileNewApi;
import com.p051p1.mobile.putong.util.audio.AudioBusinessType;

/* JADX INFO: loaded from: classes9.dex */
public class r420 extends ar2<w420> {

    /* JADX INFO: renamed from: a */
    public final String f161136a;

    /* JADX INFO: renamed from: b */
    public final String f161137b;

    /* JADX INFO: renamed from: c */
    public final MyRoomInProfileNewApi f161138c;

    public r420(ner nerVar, String str, String str2) {
        super(nerVar);
        this.f161138c = new MyRoomInProfileNewApi();
        this.f161136a = str;
        this.f161137b = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m179733k0(Boolean bool) {
        ((w420) this.viewModel).m204809l(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m179734l0(pf60 pf60Var) {
        ((w420) this.viewModel).m204814s(pf60Var, new y20() { // from class: l.p420
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f150493a.m179736n0((BLiveRoomInProfile) obj);
            }
        }, new y20() { // from class: l.q420
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f155515a.m179737o0((BLiveVoiceRoomInProfile) obj);
            }
        }, this.f161137b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m179735m0(Throwable th) {
        ((w420) this.viewModel).m204809l(true);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        duringCreated(wya0.m208478b().m208479a()).filter(new qcj() { // from class: l.l420
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((Boolean) obj) != null);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.m420
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f134743a.m179733k0((Boolean) obj);
            }
        }));
        duringCreated(this.f161138c.getMyRoomInProfileNew(this.f161136a)).subscribe(dhw.m115826e(new y20() { // from class: l.n420
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f140163a.m179734l0((pf60) obj);
            }
        }, new y20() { // from class: l.o420
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f144913a.m179735m0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n0 */
    public final void m179736n0(BLiveRoomInProfile bLiveRoomInProfile) {
        if (mbs.m157821G().mo68436Zo().mo136897a()) {
            o1j0.m165649w(R$string.f45710B0);
            return;
        }
        AudioBusinessType audioBusinessTypeMo171474c = pb1.m171472b().mo171474c();
        if (audioBusinessTypeMo171474c == AudioBusinessType.VIDEO_CHAT) {
            o1j0.m165651y(audioBusinessTypeMo171474c.getBusinessMsg());
            return;
        }
        gfj0.m130077e(false, bLiveRoomInProfile.anchorId, bLiveRoomInProfile.liveId, bLiveRoomInProfile.status, bLiveRoomInProfile.multiCallInfo.role, this.f161137b);
        if (TextUtils.equals(this.f161136a, mbs.m157870o0())) {
            tbs.f172993f.m143699a(act(), AnchorStartData.getBuilder().m68745m(false).m68746n("my_room_in_profile").m68743k());
        } else {
            act().startActivity(tbs.f172993f.m143704f(act(), AudienceStartData.getBuilder().m68777E(bLiveRoomInProfile.liveId).m68799z(this.f161136a).m68787O("my_room_in_profile").m68794u()));
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final void m179737o0(BLiveVoiceRoomInProfile bLiveVoiceRoomInProfile) {
        if (mbs.m157821G().mo68436Zo().mo136897a()) {
            o1j0.m165649w(R$string.f45710B0);
            return;
        }
        AudioBusinessType audioBusinessTypeMo171474c = pb1.m171472b().mo171474c();
        if (audioBusinessTypeMo171474c == AudioBusinessType.VIDEO_CHAT) {
            o1j0.m165651y(audioBusinessTypeMo171474c.getBusinessMsg());
            return;
        }
        gfj0.m130080h(false, bLiveVoiceRoomInProfile.anchorId, bLiveVoiceRoomInProfile.voiceLiveId, false, bLiveVoiceRoomInProfile.topicId, true);
        if (TextUtils.equals(this.f161136a, mbs.m157870o0()) && bLiveVoiceRoomInProfile.needBuild) {
            iqn0.m141677e(act(), AnchorStartData.getBuilder().m68746n("my_room_in_profile").m68743k());
        } else if (!bLiveVoiceRoomInProfile.isPersonal || TextUtils.equals(this.f161136a, mbs.m157870o0())) {
            act().startActivity(tbs.f172993f.m143704f(act(), AudienceStartData.getBuilder().m68777E(bLiveVoiceRoomInProfile.voiceLiveId).m68787O("my_room_in_profile").m68798y("").m68789Q(true).m68799z(this.f161136a).m68794u()));
        } else {
            o1j0.m165651y("私人房暂不对外开放~");
        }
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
