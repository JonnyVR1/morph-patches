package p149l;

import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.data.Medal;
import com.p046p1.mobile.putong.live.base.data.BLiveJumpInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveMedal;
import com.p046p1.mobile.putong.live.base.data.BLiveUserDressUp;
import com.p046p1.mobile.putong.live.livingroom.voice.usercard.view.VirtualVoiceUserCardMedalAndNameView;
import java.util.List;
import p149l.nnn0;

/* JADX INFO: loaded from: classes5.dex */
public class xwl0<D extends nnn0> extends wjm0<vwl0<D>, D> {
    public xwl0(bsm<D> bsmVar, VirtualVoiceUserCardMedalAndNameView virtualVoiceUserCardMedalAndNameView) {
        super(bsmVar);
        mo51532C(new vwl0(virtualVoiceUserCardMedalAndNameView));
    }

    @Override // p149l.wjm0
    /* JADX INFO: renamed from: j4 */
    public void mo123913j4(@Nullable p1k0 p1k0Var) {
        super.mo123913j4(p1k0Var);
        ((vwl0) this.viewModel).m200427f(p1k0Var);
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m211338m4(BLiveMedal bLiveMedal, List list) {
        if (!vwb.m200296J(list)) {
            vxl0.m200574d(act(), (BLiveUserDressUp) list.get(0), this);
            return;
        }
        BLiveUserDressUp bLiveUserDressUpNew_ = BLiveUserDressUp.new_();
        bLiveUserDressUpNew_.f44470id = bLiveMedal.f44397id;
        bLiveUserDressUpNew_.imageUrl = bLiveMedal.url;
        bLiveUserDressUpNew_.name = bLiveMedal.name;
        bLiveUserDressUpNew_.type = bLiveMedal.type;
        BLiveJumpInfo bLiveJumpInfoNew_ = BLiveJumpInfo.new_();
        bLiveJumpInfoNew_.text = "该装扮暂无法获取";
        bLiveJumpInfoNew_.buttonText = "知道了";
        bLiveUserDressUpNew_.jumpInfo = bLiveJumpInfoNew_;
        vxl0.m200574d(this.f188513f, bLiveUserDressUpNew_, this);
    }

    /* JADX INFO: renamed from: n4 */
    public void m211339n4(final BLiveMedal bLiveMedal) {
        duringCreated(hrv.m132721D(bLiveMedal.f44397id, Medal.TYPE)).subscribe(ffw.m121197h(new e30() { // from class: l.wwl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f188383a.m211338m4(bLiveMedal, (List) obj);
            }
        }));
    }
}
