package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoChatSquareSummary;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class cwk0 {
    /* JADX INFO: renamed from: b */
    public static void m112925b(Act act, ArrayList<lbl0> arrayList) {
        d45.m114108a(act, arrayList);
    }

    /* JADX INFO: renamed from: c */
    public static void m112926c(final Act act, String str) {
        act.duringCreated(jwu.m147237L(str)).subscribe(dhw.m115829h(new y20() { // from class: l.bwk0
            @Override // p153l.y20
            public final void call(Object obj) {
                BLiveVideoChatSquareSummary bLiveVideoChatSquareSummary = (BLiveVideoChatSquareSummary) obj;
                cwk0.m112925b(act, jyb.m147507f0(new bvk0().m106577o(bLiveVideoChatSquareSummary.popupConfig), new stp0().m187892k(bLiveVideoChatSquareSummary.dialogUrl)));
            }
        }));
    }
}
