package p149l;

import android.text.TextUtils;
import android.view.View;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveDanmakuListItem;
import java.util.List;
import p147v.VFrame;

/* JADX INFO: loaded from: classes5.dex */
public class c7n extends x6s<nnn0, g7n> {

    /* JADX INFO: renamed from: j */
    public final e5n f79633j;

    /* JADX INFO: renamed from: k */
    public BLiveDanmakuListItem f79634k;

    /* JADX INFO: renamed from: l */
    public List<BLiveDanmakuListItem> f79635l;

    public c7n(bsm bsmVar, VFrame vFrame, View view, e5n e5nVar) {
        super(bsmVar);
        mo51532C(new g7n(vFrame, view));
        this.f79633j = e5nVar;
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: P3 */
    public void mo99576P3() {
        super.mo99576P3();
        m105614X3();
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m105612V3(List list) {
        this.f79635l = list;
        m105615Y3();
        this.f79633j.m114871V4(!vwb.m200296J(list));
        ((g7n) this.viewModel).m124725j(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W3 */
    public void m105613W3(BLiveDanmakuListItem bLiveDanmakuListItem) {
        if (TEnum.equals(bLiveDanmakuListItem.status, "locked")) {
            lsi0.m151595y(bLiveDanmakuListItem.noPermissionWarnText);
            zvf0.m220399u("e_live_bullet_icon_lock", mo77274R2(), vwb.m200311Y("anchor_id", ((nnn0) m206027E2()).m132146l0().f56011id), vwb.m200311Y("bullet_type", bLiveDanmakuListItem.type), vwb.m200311Y("live_id", ((nnn0) m206027E2()).m149814k()));
            return;
        }
        BLiveDanmakuListItem bLiveDanmakuListItem2 = this.f79634k;
        if (bLiveDanmakuListItem2 == null || !TextUtils.equals(bLiveDanmakuListItem2.f44355id, bLiveDanmakuListItem.f44355id)) {
            this.f79634k = bLiveDanmakuListItem;
            m206028F2().ChatEvent.onDanmakuSelectedItemChange().mo172463j(this.f79634k);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X3 */
    public void m105614X3() {
        duringCreated(x6n.m207183c(((nnn0) m206027E2()).m132140j0(), ((nnn0) m206027E2()).m149814k(), ((nnn0) m206027E2()).m149818o())).subscribe(ffw.m121197h(new e30() { // from class: l.z6n
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f201939a.m105612V3((List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y3 */
    public void m105615Y3() {
        BLiveDanmakuListItem bLiveDanmakuListItem = (BLiveDanmakuListItem) vwb.m200346r(this.f79635l, new w9j() { // from class: l.a7n
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveDanmakuListItem) obj).isInUse);
            }
        });
        this.f79634k = bLiveDanmakuListItem;
        if (bLiveDanmakuListItem == null) {
            this.f79634k = (BLiveDanmakuListItem) vwb.m200346r(this.f79635l, new w9j() { // from class: l.b7n
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(!TEnum.equals(((BLiveDanmakuListItem) obj).status, "locked"));
                }
            });
        }
    }
}
