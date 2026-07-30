package p002l;

import android.text.TextUtils;
import com.p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p1.mobile.putong.live.base.data.BLiveBubbleConfig;
import java.util.List;
import l.e30;
import l.ffw;
import l.tpd0;
import l.vwb;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ik40 extends pat<ho2> {
    public ik40(bsm bsmVar) {
        super(bsmVar);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x001a  */
    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ Boolean m15216K3(String str, BLiveBottomButton bLiveBottomButton) {
        boolean z;
        if (bLiveBottomButton != null) {
            if (TextUtils.equals("" + bLiveBottomButton.id, str)) {
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
    public final tpd0 m15218M3(String str) {
        return new tpd0("no_more_show_bubble_" + str, 0);
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ void m15219N3(String str, BLiveBottomButton bLiveBottomButton) {
        tpd0 tpd0VarM15218M3 = m15218M3(str);
        tpd0VarM15218M3.put(Integer.valueOf(((Integer) tpd0VarM15218M3.get()).intValue() + 1));
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ Boolean m15220O3(BLiveBubbleConfig bLiveBubbleConfig) {
        if (!bLiveBubbleConfig.disappearOnClick) {
            return Boolean.TRUE;
        }
        boolean z = ((Integer) m15218M3(bLiveBubbleConfig.id).get()).intValue() == 0;
        if (z) {
            m15221P3(bLiveBubbleConfig.buttonId, bLiveBubbleConfig.id);
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: P3 */
    public final void m15221P3(final String str, final String str2) {
        duringCreated((c) m25548F2().BottomEvent.markButtonClicked().g()).filter(new w9j() { // from class: l.gk40
            public final Object call(Object obj) {
                return ik40.m15216K3(str, (BLiveBottomButton) obj);
            }
        }).take(1).subscribe(ffw.d(new e30() { // from class: l.hk40
            public final void call(Object obj) {
                this.f12087a.m15219N3(str2, (BLiveBottomButton) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: R3 */
    public List<BLiveBubbleConfig> m15222R3(List<BLiveBubbleConfig> list) {
        return vwb.J(list) ? list : vwb.n(list, new w9j() { // from class: l.fk40
            public final Object call(Object obj) {
                return this.f10435a.m15220O3((BLiveBubbleConfig) obj);
            }
        });
    }
}
