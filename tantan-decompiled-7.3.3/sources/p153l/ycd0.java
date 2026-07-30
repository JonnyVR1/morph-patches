package p153l;

import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.live.base.bean.UserRightType;
import com.p051p1.mobile.putong.live.external.page.rights.list.view.RightSwitchItemView;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class ycd0 extends e9d0<RightSwitchItemView> {

    /* JADX INFO: renamed from: e */
    public UserRightType f198497e;

    /* JADX INFO: renamed from: f */
    public j9d0 f198498f;

    public ycd0(UserRightType userRightType, j9d0 j9d0Var) {
        this.f198497e = userRightType;
        this.f198498f = j9d0Var;
    }

    /* JADX INFO: renamed from: H */
    public boolean m215142H() {
        return this.f198497e == UserRightType.ENTER_ROOM_EFFECT;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo71749u(RightSwitchItemView rightSwitchItemView) {
        super.mo71749u(rightSwitchItemView);
        rightSwitchItemView.m71832j0(this, this.f198498f);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo71942v(RightSwitchItemView rightSwitchItemView, @NonNull List<Object> list) {
        if (jyb.m147479J(list)) {
            mo71749u(rightSwitchItemView);
        } else if (((Integer) list.get(0)).intValue() == 3) {
            rightSwitchItemView.m71833k0();
        }
    }

    public boolean isChecked() {
        if (m215142H()) {
            return !mbs.m157880w().live.closeEnterRoomMsg.booleanValue();
        }
        return false;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return xec0.f193911t1;
    }
}
