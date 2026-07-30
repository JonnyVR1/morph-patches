package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p046p1.mobile.putong.live.base.data.BLiveBubbleConfig;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ik40 extends pat<ho2> {
    public ik40(bsm bsmVar) {
        super(bsmVar);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x001a  */
    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ Boolean m136758K3(String str, BLiveBottomButton bLiveBottomButton) {
        boolean z;
        if (bLiveBottomButton != null) {
            if (TextUtils.equals("" + bLiveBottomButton.f44339id, str)) {
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
    public final tpd0 m136760M3(String str) {
        return new tpd0("no_more_show_bubble_" + str, 0);
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ void m136761N3(String str, BLiveBottomButton bLiveBottomButton) {
        tpd0 tpd0VarM136760M3 = m136760M3(str);
        tpd0VarM136760M3.put(Integer.valueOf(tpd0VarM136760M3.get().intValue() + 1));
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ Boolean m136762O3(BLiveBubbleConfig bLiveBubbleConfig) {
        if (!bLiveBubbleConfig.disappearOnClick) {
            return Boolean.TRUE;
        }
        boolean z = m136760M3(bLiveBubbleConfig.f44340id).get().intValue() == 0;
        if (z) {
            m136763P3(bLiveBubbleConfig.buttonId, bLiveBubbleConfig.f44340id);
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: P3 */
    public final void m136763P3(final String str, final String str2) {
        duringCreated(m206028F2().BottomEvent.markButtonClicked().m172460g()).filter(new w9j() { // from class: l.gk40
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ik40.m136758K3(str, (BLiveBottomButton) obj);
            }
        }).take(1).subscribe(ffw.m121193d(new e30() { // from class: l.hk40
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f108151a.m136761N3(str2, (BLiveBottomButton) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: R3 */
    public List<BLiveBubbleConfig> m136764R3(List<BLiveBubbleConfig> list) {
        return vwb.m200296J(list) ? list : vwb.m200339n(list, new w9j() { // from class: l.fk40
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f98036a.m136762O3((BLiveBubbleConfig) obj);
            }
        });
    }
}
