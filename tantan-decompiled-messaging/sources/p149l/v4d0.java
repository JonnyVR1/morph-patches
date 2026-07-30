package p149l;

import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.live.base.bean.UserRightType;
import com.p046p1.mobile.putong.live.external.page.rights.list.view.RightSwitchItemView;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class v4d0 extends b1d0<RightSwitchItemView> {

    /* JADX INFO: renamed from: e */
    public UserRightType f179908e;

    /* JADX INFO: renamed from: f */
    public g1d0 f179909f;

    public v4d0(UserRightType userRightType, g1d0 g1d0Var) {
        this.f179908e = userRightType;
        this.f179909f = g1d0Var;
    }

    /* JADX INFO: renamed from: H */
    public boolean m196959H() {
        return this.f179908e == UserRightType.ENTER_ROOM_EFFECT;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo70566u(RightSwitchItemView rightSwitchItemView) {
        super.mo70566u(rightSwitchItemView);
        rightSwitchItemView.m70649j0(this, this.f179909f);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo70759v(RightSwitchItemView rightSwitchItemView, @NonNull List<Object> list) {
        if (vwb.m200296J(list)) {
            mo70566u(rightSwitchItemView);
        } else if (((Integer) list.get(0)).intValue() == 3) {
            rightSwitchItemView.m70650k0();
        }
    }

    public boolean isChecked() {
        if (m196959H()) {
            return !l9s.m149103w().live.closeEnterRoomMsg.booleanValue();
        }
        return false;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return s6c0.f162797t1;
    }
}
