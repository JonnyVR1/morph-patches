package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p046p1.mobile.putong.live.base.data.BLiveBubbleConfig;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class e5o0 extends pat<ho2> {
    public e5o0(bsm bsmVar) {
        super(bsmVar);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x001a  */
    /* JADX INFO: renamed from: L3 */
    public static /* synthetic */ Boolean m114884L3(String str, BLiveBottomButton bLiveBottomButton) {
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
    private tpd0 m114885M3(String str) {
        return new tpd0("voice_no_more_show_bubble_" + str, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N3 */
    public /* synthetic */ void m114886N3(String str, BLiveBottomButton bLiveBottomButton) {
        tpd0 tpd0VarM114885M3 = m114885M3(str);
        tpd0VarM114885M3.put(Integer.valueOf(tpd0VarM114885M3.get().intValue() + 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O3 */
    public /* synthetic */ Boolean m114887O3(BLiveBubbleConfig bLiveBubbleConfig) {
        if (!bLiveBubbleConfig.disappearOnClick) {
            return Boolean.TRUE;
        }
        boolean z = m114885M3(bLiveBubbleConfig.f44340id).get().intValue() == 0;
        if (z) {
            m114888P3(bLiveBubbleConfig.buttonId, bLiveBubbleConfig.f44340id);
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: P3 */
    private void m114888P3(final String str, final String str2) {
        duringCreated(m206028F2().BottomEvent.markButtonClicked().m172460g()).filter(new w9j() { // from class: l.c5o0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return e5o0.m114884L3(str, (BLiveBottomButton) obj);
            }
        }).take(1).subscribe(ffw.m121193d(new e30() { // from class: l.d5o0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f84548a.m114886N3(str2, (BLiveBottomButton) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: R3 */
    public List<BLiveBubbleConfig> m114889R3(List<BLiveBubbleConfig> list) {
        return vwb.m200296J(list) ? list : vwb.m200339n(list, new w9j() { // from class: l.b5o0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f73685a.m114887O3((BLiveBubbleConfig) obj);
            }
        });
    }
}
