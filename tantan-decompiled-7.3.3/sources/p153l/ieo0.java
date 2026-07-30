package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p051p1.mobile.putong.live.base.data.BLiveBubbleConfig;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ieo0 extends qct<oo2> {
    public ieo0(dum dumVar) {
        super(dumVar);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x001a  */
    /* JADX INFO: renamed from: L3 */
    public static /* synthetic */ Boolean m139640L3(String str, BLiveBottomButton bLiveBottomButton) {
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
    private vxd0 m139641M3(String str) {
        return new vxd0("voice_no_more_show_bubble_" + str, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N3 */
    public /* synthetic */ void m139642N3(String str, BLiveBottomButton bLiveBottomButton) {
        vxd0 vxd0VarM139641M3 = m139641M3(str);
        vxd0VarM139641M3.put(Integer.valueOf(vxd0VarM139641M3.get().intValue() + 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O3 */
    public /* synthetic */ Boolean m139643O3(BLiveBubbleConfig bLiveBubbleConfig) {
        if (!bLiveBubbleConfig.disappearOnClick) {
            return Boolean.TRUE;
        }
        boolean z = m139641M3(bLiveBubbleConfig.f45188id).get().intValue() == 0;
        if (z) {
            m139644P3(bLiveBubbleConfig.buttonId, bLiveBubbleConfig.f45188id);
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: P3 */
    private void m139644P3(final String str, final String str2) {
        duringCreated(m213811F2().BottomEvent.markButtonClicked().m199270g()).filter(new qcj() { // from class: l.geo0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ieo0.m139640L3(str, (BLiveBottomButton) obj);
            }
        }).take(1).subscribe(dhw.m115825d(new y20() { // from class: l.heo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f109179a.m139642N3(str2, (BLiveBottomButton) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: R3 */
    public List<BLiveBubbleConfig> m139645R3(List<BLiveBubbleConfig> list) {
        return jyb.m147479J(list) ? list : jyb.m147522n(list, new qcj() { // from class: l.feo0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f98697a.m139643O3((BLiveBubbleConfig) obj);
            }
        });
    }
}
