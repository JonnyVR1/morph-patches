package p153l;

import android.text.TextUtils;
import android.view.View;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.data.Followship;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveOfficialShowListItem;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.p051p1.mobile.putong.live.livingroom.officialshow.showlist.OfficialShowPlayBillView;

/* JADX INFO: loaded from: classes5.dex */
public class pe50 extends i6t<mc50, OfficialShowPlayBillView> {
    public pe50(dum<? extends mc50> dumVar, OfficialShowPlayBillView officialShowPlayBillView, View view) {
        super(dumVar);
        mo52715C(officialShowPlayBillView);
        bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.oe50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f146971a.m171929U3(view2);
            }
        });
    }

    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ void m171922K3(Throwable th) {
        if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).isFollowForbidden()) {
            o1j0.m165649w(R$string.f47448C);
        }
    }

    /* JADX INFO: renamed from: S3 */
    private void m171928S3() {
        V v2 = this.viewModel;
        if (v2 != 0) {
            ((OfficialShowPlayBillView) v2).m76596j();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U3 */
    public /* synthetic */ void m171929U3(View view) {
        m171928S3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W3 */
    public /* synthetic */ void m171930W3(String str) {
        ((OfficialShowPlayBillView) this.viewModel).m76601q(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R3 */
    public void m171931R3(final String str) {
        User userNew_ = User.new_();
        userNew_.f56859id = str;
        wrv wrvVar = zrv.f205799a;
        duringCreated(wrvVar.m207662d(wrvVar.m207631D0(), userNew_, true, "liveRoom", ((mc50) m213810E2()).m202191k(), ((mc50) m213810E2()).m202194o(), mo78457R2(), "official_show_list")).subscribe(dhw.m115826e(new y20() { // from class: l.me50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f136436a.m171932T3(str, (Followship) obj);
            }
        }, new y20() { // from class: l.ne50
            @Override // p153l.y20
            public final void call(Object obj) {
                pe50.m171922K3((Throwable) obj);
            }
        }));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ void m171932T3(String str, Followship followship) {
        V v2 = this.viewModel;
        if (v2 != 0) {
            ((OfficialShowPlayBillView) v2).m76601q(str);
        }
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m171933V3(zc50 zc50Var) {
        ((OfficialShowPlayBillView) this.viewModel).m76600p(zc50Var, false);
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ Boolean m171934X3(final be50 be50Var) {
        return ((OfficialShowPlayBillView) this.viewModel).getInfo() != null ? Boolean.valueOf(jyb.m147520m(((OfficialShowPlayBillView) this.viewModel).getInfo().m219234b(), new qcj() { // from class: l.le50
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveOfficialShowListItem) obj).anchorId, be50Var.m103688e()));
            }
        })) : Boolean.FALSE;
    }

    /* JADX INFO: renamed from: Y3 */
    public void m171935Y3(String str) {
        m213811F2().OpenUserCardDialogEvent.show().mo199273j(UserCardData.builder(1400).userId(str).setFromIdentity("audience").setTo("audience").setScene("live").setSource("anchor").trackFrom("live").build());
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().OfficialShowEvent.updateList().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.ie50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f114553a.m171933V3((zc50) obj);
            }
        }));
        duringCreated(m213811F2().OfficialShowEvent.followOfficialAnchor().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.je50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f120393a.m171930W3((String) obj);
            }
        }));
        m138860d3(be50.class, new qcj() { // from class: l.ke50
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f125299a.m171934X3((be50) obj);
            }
        });
    }
}
