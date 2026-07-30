package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p046p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p046p1.mobile.putong.live.livingroom.voice.bottom.Area;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public class jkm0 extends pat<nnn0> {

    /* JADX INFO: renamed from: i */
    public HashMap<String, mim0<?>> f118398i;

    /* JADX INFO: renamed from: j */
    public HashMap<String, mim0<?>> f118399j;

    public jkm0(bsm<nnn0> bsmVar) {
        super(bsmVar);
        this.f118398i = new HashMap<>();
        this.f118399j = new HashMap<>();
    }

    /* JADX INFO: renamed from: K3 */
    public void m141894K3() {
        vwb.m200354z(this.f118398i.values(), new e30() { // from class: l.ikm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f113691a.m141897N3((mim0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: L3 */
    public mim0<?> m141895L3(BLiveBottomButton bLiveBottomButton, Area area, String str) {
        BLiveButtonType bLiveButtonType = bLiveBottomButton.localType;
        String str2 = bLiveBottomButton.url;
        mim0<?> mim0VarRemove = this.f118398i.remove(str2);
        if (mim0VarRemove == null) {
            mim0VarRemove = m141896M3(bLiveButtonType, bLiveBottomButton, area, str);
            if (mim0VarRemove != null && mim0VarRemove.m154735f4() != null) {
                m144512z2(mim0VarRemove.m154735f4());
            }
        } else if (mim0VarRemove.mo116693C1(area)) {
            mim0VarRemove.f134019m = bLiveBottomButton;
            mim0VarRemove.f134021o = null;
        } else {
            m144506C2(mim0VarRemove.m154735f4());
            mim0VarRemove = m141896M3(bLiveButtonType, bLiveBottomButton, area, str);
            if (mim0VarRemove != null) {
                m144512z2(mim0VarRemove.m154735f4());
            }
        }
        if (mim0VarRemove != null) {
            this.f118399j.put(str2, mim0VarRemove);
        }
        return mim0VarRemove;
    }

    /* JADX INFO: renamed from: M3 */
    public final mim0<?> m141896M3(BLiveButtonType bLiveButtonType, BLiveBottomButton bLiveBottomButton, Area area, String str) {
        String string = bLiveButtonType.toString();
        string.getClass();
        switch (string) {
            case "settingButton":
                return new yio0(this.f188512e, bLiveBottomButton, area, str);
            case "lt_funFair":
                return new u9j(this.f188512e, bLiveBottomButton, area);
            case "fastGiftButton":
                return new eig(this.f188512e, bLiveBottomButton, area);
            case "emojiPlayPanel":
            case "unknown_":
            case "gameLib":
            case "setRoomBg":
                return new k1n0(this.f188512e, bLiveBottomButton, area);
            case "giftButton":
                return new llj(this.f188512e, bLiveBottomButton, area);
            case "mute":
                return new yrm0(this.f188512e, bLiveBottomButton, area);
            case "onCallPk":
                return new ub2(this.f188512e, bLiveBottomButton, area);
            case "callButton":
                return new sl0(this.f188512e, bLiveBottomButton, area);
            case "intlGamePanel":
                return new cup(this.f188512e, bLiveBottomButton, area);
            case "luckyParadiseV2":
                return new pfw(this.f188512e, bLiveBottomButton, area);
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ void m141897N3(mim0 mim0Var) {
        if (mim0Var.m154735f4() != null) {
            m144506C2(mim0Var.m154735f4());
        }
    }

    /* JADX INFO: renamed from: O3 */
    public void m141898O3() {
        this.f118398i = this.f118399j;
        this.f118399j = new HashMap<>();
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        this.f118398i.clear();
        this.f118399j.clear();
    }
}
