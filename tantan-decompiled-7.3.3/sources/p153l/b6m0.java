package p153l;

import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.data.Medal;
import com.p051p1.mobile.putong.live.base.data.BLiveJumpInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveMedal;
import com.p051p1.mobile.putong.live.base.data.BLiveUserDressUp;
import com.p051p1.mobile.putong.live.livingroom.voice.usercard.view.VirtualVoiceUserCardMedalAndNameView;
import java.util.List;
import p153l.rwn0;

/* JADX INFO: loaded from: classes5.dex */
public class b6m0<D extends rwn0> extends atm0<z5m0<D>, D> {
    public b6m0(dum<D> dumVar, VirtualVoiceUserCardMedalAndNameView virtualVoiceUserCardMedalAndNameView) {
        super(dumVar);
        mo52715C(new z5m0(virtualVoiceUserCardMedalAndNameView));
    }

    @Override // p153l.atm0
    /* JADX INFO: renamed from: j4 */
    public void mo100222j4(@Nullable vak0 vak0Var) {
        super.mo100222j4(vak0Var);
        ((z5m0) this.viewModel).m218715f(vak0Var);
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m102771m4(BLiveMedal bLiveMedal, List list) {
        if (!jyb.m147479J(list)) {
            z6m0.m218808d(act(), (BLiveUserDressUp) list.get(0), this);
            return;
        }
        BLiveUserDressUp bLiveUserDressUpNew_ = BLiveUserDressUp.new_();
        bLiveUserDressUpNew_.f45318id = bLiveMedal.f45245id;
        bLiveUserDressUpNew_.imageUrl = bLiveMedal.url;
        bLiveUserDressUpNew_.name = bLiveMedal.name;
        bLiveUserDressUpNew_.type = bLiveMedal.type;
        BLiveJumpInfo bLiveJumpInfoNew_ = BLiveJumpInfo.new_();
        bLiveJumpInfoNew_.text = "该装扮暂无法获取";
        bLiveJumpInfoNew_.buttonText = "知道了";
        bLiveUserDressUpNew_.jumpInfo = bLiveJumpInfoNew_;
        z6m0.m218808d(this.f196919f, bLiveUserDressUpNew_, this);
    }

    /* JADX INFO: renamed from: n4 */
    public void m102772n4(final BLiveMedal bLiveMedal) {
        duringCreated(itv.m142080D(bLiveMedal.f45245id, Medal.TYPE)).subscribe(dhw.m115829h(new y20() { // from class: l.a6m0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f68739a.m102771m4(bLiveMedal, (List) obj);
            }
        }));
    }
}
