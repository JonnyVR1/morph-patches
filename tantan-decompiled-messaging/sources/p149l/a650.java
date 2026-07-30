package p149l;

import android.text.TextUtils;
import android.view.View;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.data.Followship;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveOfficialShowListItem;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.p046p1.mobile.putong.live.livingroom.officialshow.showlist.OfficialShowPlayBillView;

/* JADX INFO: loaded from: classes4.dex */
public class a650 extends h4t<x350, OfficialShowPlayBillView> {
    public a650(bsm<? extends x350> bsmVar, OfficialShowPlayBillView officialShowPlayBillView, View view) {
        super(bsmVar);
        mo51532C(officialShowPlayBillView);
        xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.z550
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f201751a.m95117U3(view2);
            }
        });
    }

    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ void m95110K3(Throwable th) {
        if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).isFollowForbidden()) {
            lsi0.m151593w(R$string.f46600C);
        }
    }

    /* JADX INFO: renamed from: S3 */
    private void m95116S3() {
        V v2 = this.viewModel;
        if (v2 != 0) {
            ((OfficialShowPlayBillView) v2).m75413j();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U3 */
    public /* synthetic */ void m95117U3(View view) {
        m95116S3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W3 */
    public /* synthetic */ void m95118W3(String str) {
        ((OfficialShowPlayBillView) this.viewModel).m75418q(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R3 */
    public void m95119R3(final String str) {
        User userNew_ = User.new_();
        userNew_.f56011id = str;
        vpv vpvVar = ypv.f199493a;
        duringCreated(vpvVar.m199340d(vpvVar.m199309D0(), userNew_, true, "liveRoom", ((x350) m206027E2()).m149814k(), ((x350) m206027E2()).m149818o(), mo77274R2(), "official_show_list")).subscribe(ffw.m121194e(new e30() { // from class: l.x550
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f191090a.m95120T3(str, (Followship) obj);
            }
        }, new e30() { // from class: l.y550
            @Override // p149l.e30
            public final void call(Object obj) {
                a650.m95110K3((Throwable) obj);
            }
        }));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ void m95120T3(String str, Followship followship) {
        V v2 = this.viewModel;
        if (v2 != 0) {
            ((OfficialShowPlayBillView) v2).m75418q(str);
        }
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m95121V3(k450 k450Var) {
        ((OfficialShowPlayBillView) this.viewModel).m75417p(k450Var, false);
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ Boolean m95122X3(final m550 m550Var) {
        return ((OfficialShowPlayBillView) this.viewModel).getInfo() != null ? Boolean.valueOf(vwb.m200337m(((OfficialShowPlayBillView) this.viewModel).getInfo().m144477b(), new w9j() { // from class: l.w550
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveOfficialShowListItem) obj).anchorId, m550Var.m153129e()));
            }
        })) : Boolean.FALSE;
    }

    /* JADX INFO: renamed from: Y3 */
    public void m95123Y3(String str) {
        m206028F2().OpenUserCardDialogEvent.show().mo172463j(UserCardData.builder(1400).userId(str).setFromIdentity("audience").setTo("audience").setScene("live").setSource("anchor").trackFrom("live").build());
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().OfficialShowEvent.updateList().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.t550
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f167791a.m95121V3((k450) obj);
            }
        }));
        duringCreated(m206028F2().OfficialShowEvent.followOfficialAnchor().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.u550
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f174653a.m95118W3((String) obj);
            }
        }));
        m129301d3(m550.class, new w9j() { // from class: l.v550
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f180004a.m95122X3((m550) obj);
            }
        });
    }
}
