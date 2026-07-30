package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoChatSquareSummary;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class wmk0 {
    /* JADX INFO: renamed from: b */
    public static void m203991b(Act act, ArrayList<g2l0> arrayList) {
        c35.m104971a(act, arrayList);
    }

    /* JADX INFO: renamed from: c */
    public static void m203992c(final Act act, String str) {
        act.duringCreated(iuu.m138451L(str)).subscribe(ffw.m121197h(new e30() { // from class: l.vmk0
            @Override // p149l.e30
            public final void call(Object obj) {
                BLiveVideoChatSquareSummary bLiveVideoChatSquareSummary = (BLiveVideoChatSquareSummary) obj;
                wmk0.m203991b(act, vwb.m200324f0(new vlk0().m198807o(bLiveVideoChatSquareSummary.popupConfig), new okp0().m164889k(bLiveVideoChatSquareSummary.dialogUrl)));
            }
        }));
    }
}
