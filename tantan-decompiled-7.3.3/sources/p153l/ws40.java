package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p051p1.mobile.putong.live.base.data.BLiveBubbleConfig;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ws40 extends qct<oo2> {
    public ws40(dum dumVar) {
        super(dumVar);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x001a  */
    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ Boolean m207741K3(String str, BLiveBottomButton bLiveBottomButton) {
        boolean z;
        if (bLiveBottomButton != null) {
            if (TextUtils.equals("" + bLiveBottomButton.f45187id, str)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: M3 */
    public final vxd0 m207743M3(String str) {
        return new vxd0("no_more_show_bubble_" + str, 0);
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ void m207744N3(String str, BLiveBottomButton bLiveBottomButton) {
        vxd0 vxd0VarM207743M3 = m207743M3(str);
        vxd0VarM207743M3.put(Integer.valueOf(vxd0VarM207743M3.get().intValue() + 1));
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ Boolean m207745O3(BLiveBubbleConfig bLiveBubbleConfig) {
        if (!bLiveBubbleConfig.disappearOnClick) {
            return Boolean.TRUE;
        }
        boolean z = m207743M3(bLiveBubbleConfig.f45188id).get().intValue() == 0;
        if (z) {
            m207746P3(bLiveBubbleConfig.buttonId, bLiveBubbleConfig.f45188id);
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: P3 */
    public final void m207746P3(final String str, final String str2) {
        duringCreated(m213811F2().BottomEvent.markButtonClicked().m199270g()).filter(new qcj() { // from class: l.us40
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ws40.m207741K3(str, (BLiveBottomButton) obj);
            }
        }).take(1).subscribe(dhw.m115825d(new y20() { // from class: l.vs40
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f185558a.m207744N3(str2, (BLiveBottomButton) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: R3 */
    public List<BLiveBubbleConfig> m207747R3(List<BLiveBubbleConfig> list) {
        return jyb.m147479J(list) ? list : jyb.m147522n(list, new qcj() { // from class: l.ts40
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f175962a.m207745O3((BLiveBubbleConfig) obj);
            }
        });
    }
}
