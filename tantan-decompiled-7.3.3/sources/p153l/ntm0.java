package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p051p1.mobile.putong.live.livingroom.voice.bottom.Area;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public class ntm0 extends qct<rwn0> {

    /* JADX INFO: renamed from: i */
    public HashMap<String, qrm0<?>> f143615i;

    /* JADX INFO: renamed from: j */
    public HashMap<String, qrm0<?>> f143616j;

    public ntm0(dum<rwn0> dumVar) {
        super(dumVar);
        this.f143615i = new HashMap<>();
        this.f143616j = new HashMap<>();
    }

    /* JADX INFO: renamed from: K3 */
    public void m164736K3() {
        jyb.m147537z(this.f143615i.values(), new y20() { // from class: l.mtm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f138641a.m164739N3((qrm0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: L3 */
    public qrm0<?> m164737L3(BLiveBottomButton bLiveBottomButton, Area area, String str) {
        BLiveButtonType bLiveButtonType = bLiveBottomButton.localType;
        String str2 = bLiveBottomButton.url;
        qrm0<?> qrm0VarRemove = this.f143615i.remove(str2);
        if (qrm0VarRemove == null) {
            qrm0VarRemove = m164738M3(bLiveButtonType, bLiveBottomButton, area, str);
            if (qrm0VarRemove != null && qrm0VarRemove.m177582f4() != null) {
                m153103z2(qrm0VarRemove.m177582f4());
            }
        } else if (qrm0VarRemove.mo105687C1(area)) {
            qrm0VarRemove.f159148m = bLiveBottomButton;
            qrm0VarRemove.f159150o = null;
        } else {
            m153097C2(qrm0VarRemove.m177582f4());
            qrm0VarRemove = m164738M3(bLiveButtonType, bLiveBottomButton, area, str);
            if (qrm0VarRemove != null) {
                m153103z2(qrm0VarRemove.m177582f4());
            }
        }
        if (qrm0VarRemove != null) {
            this.f143616j.put(str2, qrm0VarRemove);
        }
        return qrm0VarRemove;
    }

    /* JADX INFO: renamed from: M3 */
    public final qrm0<?> m164738M3(BLiveButtonType bLiveButtonType, BLiveBottomButton bLiveBottomButton, Area area, String str) {
        String string = bLiveButtonType.toString();
        string.getClass();
        switch (string) {
            case "settingButton":
                return new cso0(this.f196918e, bLiveBottomButton, area, str);
            case "lt_funFair":
                return new ocj(this.f196918e, bLiveBottomButton, area);
            case "fastGiftButton":
                return new sjg(this.f196918e, bLiveBottomButton, area);
            case "emojiPlayPanel":
            case "unknown_":
            case "gameLib":
            case "setRoomBg":
                return new oan0(this.f196918e, bLiveBottomButton, area);
            case "giftButton":
                return new boj(this.f196918e, bLiveBottomButton, area);
            case "mute":
                return new c1n0(this.f196918e, bLiveBottomButton, area);
            case "onCallPk":
                return new bc2(this.f196918e, bLiveBottomButton, area);
            case "callButton":
                return new ol0(this.f196918e, bLiveBottomButton, area);
            case "intlGamePanel":
                return new cwp(this.f196918e, bLiveBottomButton, area);
            case "luckyParadiseV2":
                return new nhw(this.f196918e, bLiveBottomButton, area);
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ void m164739N3(qrm0 qrm0Var) {
        if (qrm0Var.m177582f4() != null) {
            m153097C2(qrm0Var.m177582f4());
        }
    }

    /* JADX INFO: renamed from: O3 */
    public void m164740O3() {
        this.f143615i = this.f143616j;
        this.f143616j = new HashMap<>();
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        this.f143615i.clear();
        this.f143616j.clear();
    }
}
