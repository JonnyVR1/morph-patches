package p149l;

import android.os.Bundle;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.bean.UserRightType;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public class r8k0 extends jq2<v8k0> {
    public r8k0(Act act) {
        super(act);
    }

    /* JADX INFO: renamed from: e0 */
    public void m178279e0(Bundle bundle) {
        ArrayList arrayListM200339n = vwb.m200339n(Arrays.asList(UserRightType.values()), new w9j() { // from class: l.q8k0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((UserRightType) obj).isVideoRoomRight());
            }
        });
        if (!vdt.m198092b(2) || !s9s.f163228b.m195850h7()) {
            arrayListM200339n.remove(UserRightType.LIVE_NICE_NUMBER);
        }
        ((v8k0) this.viewModel).m197469f(s1d0.m181946j(bundle, arrayListM200339n));
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
