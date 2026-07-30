package p002l;

import android.text.TextUtils;
import android.view.View;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.p000p1.mobile.putong.live.livingroom.officialshow.showlist.OfficialShowPlayBillView;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.data.Followship;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BLiveOfficialShowListItem;
import com.tantanapp.common.data.DbObject;
import l.bwr;
import l.e30;
import l.ffw;
import l.lsi0;
import l.s7m;
import l.vpv;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.ypv;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class a650 extends h4t<x350, OfficialShowPlayBillView> {
    public a650(bsm<? extends x350> bsmVar, OfficialShowPlayBillView officialShowPlayBillView, View view) {
        super(bsmVar);
        C(officialShowPlayBillView);
        xdl0.E0(view, new View.OnClickListener() { // from class: l.z550
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f23253a.m9435U3(view2);
            }
        });
    }

    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ void m9428K3(Throwable th) {
        if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).isFollowForbidden()) {
            lsi0.w(R$string.f2642C);
        }
    }

    /* JADX INFO: renamed from: S3 */
    private void m9434S3() {
        s7m s7mVar = ((bwr) this).viewModel;
        if (s7mVar != null) {
            ((OfficialShowPlayBillView) s7mVar).m9044j();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U3 */
    public /* synthetic */ void m9435U3(View view) {
        m9434S3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W3 */
    public /* synthetic */ void m9436W3(String str) {
        ((OfficialShowPlayBillView) ((bwr) this).viewModel).m9049q(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R3 */
    public void m9437R3(final String str) {
        User userNew_ = User.new_();
        ((DbObject) userNew_).id = str;
        vpv vpvVar = ypv.a;
        duringCreated(vpvVar.d(vpvVar.D0(), userNew_, true, "liveRoom", ((x350) m25547E2()).m17235k(), ((x350) m25547E2()).m17239o(), mo21430R2(), "official_show_list")).subscribe(ffw.e(new e30() { // from class: l.x550
            public final void call(Object obj) {
                this.f22120a.m9439T3(str, (Followship) obj);
            }
        }, new e30() { // from class: l.y550
            public final void call(Object obj) {
                a650.m9428K3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T */
    public void m9438T() {
        super.T();
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ void m9439T3(String str, Followship followship) {
        s7m s7mVar = ((bwr) this).viewModel;
        if (s7mVar != null) {
            ((OfficialShowPlayBillView) s7mVar).m9049q(str);
        }
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m9440V3(k450 k450Var) {
        ((OfficialShowPlayBillView) ((bwr) this).viewModel).m9048p(k450Var, false);
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ Boolean m9441X3(final m550 m550Var) {
        return ((OfficialShowPlayBillView) ((bwr) this).viewModel).getInfo() != null ? Boolean.valueOf(vwb.m(((OfficialShowPlayBillView) ((bwr) this).viewModel).getInfo().m16496b(), new w9j() { // from class: l.w550
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveOfficialShowListItem) obj).anchorId, m550Var.m17720e()));
            }
        })) : Boolean.FALSE;
    }

    /* JADX INFO: renamed from: Y3 */
    public void m9442Y3(String str) {
        m25548F2().OpenUserCardDialogEvent.show().j(UserCardData.builder(1400).userId(str).setFromIdentity("audience").setTo("audience").setScene("live").setSource("anchor").trackFrom("live").build());
    }

    /* JADX INFO: renamed from: t */
    public void m9443t() {
        super.t();
        duringCreated((c) m25548F2().OfficialShowEvent.updateList().g()).subscribe(ffw.d(new e30() { // from class: l.t550
            public final void call(Object obj) {
                this.f19420a.m9440V3((k450) obj);
            }
        }));
        duringCreated((c) m25548F2().OfficialShowEvent.followOfficialAnchor().g()).subscribe(ffw.d(new e30() { // from class: l.u550
            public final void call(Object obj) {
                this.f20492a.m9436W3((String) obj);
            }
        }));
        m14188d3(m550.class, new w9j() { // from class: l.v550
            public final Object call(Object obj) {
                return this.f20976a.m9441X3((m550) obj);
            }
        });
    }
}
