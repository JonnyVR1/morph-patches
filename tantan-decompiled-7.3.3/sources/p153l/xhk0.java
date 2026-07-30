package p153l;

import android.os.Bundle;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.bean.UserRightType;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public class xhk0 extends ar2<bik0> {
    public xhk0(Act act) {
        super(act);
    }

    /* JADX INFO: renamed from: e0 */
    public void m211050e0(Bundle bundle) {
        ArrayList arrayListM147522n = jyb.m147522n(Arrays.asList(UserRightType.values()), new qcj() { // from class: l.whk0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((UserRightType) obj).isVideoRoomRight());
            }
        });
        if (!wft.m206159b(2) || !tbs.f172989b.m203637h7()) {
            arrayListM147522n.remove(UserRightType.LIVE_NICE_NUMBER);
        }
        ((bik0) this.viewModel).m104485f(v9d0.m200426j(bundle, arrayListM147522n));
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
