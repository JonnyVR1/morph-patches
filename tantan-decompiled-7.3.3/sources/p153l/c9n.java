package p153l;

import android.text.TextUtils;
import android.view.View;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveDanmakuListItem;
import java.util.List;
import p151v.VFrame;

/* JADX INFO: loaded from: classes5.dex */
public class c9n extends y8s<rwn0, g9n> {

    /* JADX INFO: renamed from: j */
    public final e7n f80505j;

    /* JADX INFO: renamed from: k */
    public BLiveDanmakuListItem f80506k;

    /* JADX INFO: renamed from: l */
    public List<BLiveDanmakuListItem> f80507l;

    public c9n(dum dumVar, VFrame vFrame, View view, e7n e7nVar) {
        super(dumVar);
        mo52715C(new g9n(vFrame, view));
        this.f80505j = e7nVar;
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: P3 */
    public void mo96837P3() {
        super.mo96837P3();
        m108452X3();
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m108450V3(List list) {
        this.f80507l = list;
        m108453Y3();
        this.f80505j.m119750V4(!jyb.m147479J(list));
        ((g9n) this.viewModel).m129597j(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W3 */
    public void m108451W3(BLiveDanmakuListItem bLiveDanmakuListItem) {
        if (TEnum.equals(bLiveDanmakuListItem.status, "locked")) {
            o1j0.m165651y(bLiveDanmakuListItem.noPermissionWarnText);
            i4g0.m138523u("e_live_bullet_icon_lock", mo78457R2(), jyb.m147494Y("anchor_id", ((rwn0) m213810E2()).m168532l0().f56859id), jyb.m147494Y("bullet_type", bLiveDanmakuListItem.type), jyb.m147494Y("live_id", ((rwn0) m213810E2()).m202191k()));
            return;
        }
        BLiveDanmakuListItem bLiveDanmakuListItem2 = this.f80506k;
        if (bLiveDanmakuListItem2 == null || !TextUtils.equals(bLiveDanmakuListItem2.f45203id, bLiveDanmakuListItem.f45203id)) {
            this.f80506k = bLiveDanmakuListItem;
            m213811F2().ChatEvent.onDanmakuSelectedItemChange().mo199273j(this.f80506k);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X3 */
    public void m108452X3() {
        duringCreated(x8n.m209742c(((rwn0) m213810E2()).m168526j0(), ((rwn0) m213810E2()).m202191k(), ((rwn0) m213810E2()).m202194o())).subscribe(dhw.m115829h(new y20() { // from class: l.z8n
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f203401a.m108450V3((List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y3 */
    public void m108453Y3() {
        BLiveDanmakuListItem bLiveDanmakuListItem = (BLiveDanmakuListItem) jyb.m147529r(this.f80507l, new qcj() { // from class: l.a9n
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveDanmakuListItem) obj).isInUse);
            }
        });
        this.f80506k = bLiveDanmakuListItem;
        if (bLiveDanmakuListItem == null) {
            this.f80506k = (BLiveDanmakuListItem) jyb.m147529r(this.f80507l, new qcj() { // from class: l.b9n
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(!TEnum.equals(((BLiveDanmakuListItem) obj).status, "locked"));
                }
            });
        }
    }
}
