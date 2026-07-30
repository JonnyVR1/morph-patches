package p153l;

import android.text.TextUtils;
import android.util.Pair;
import com.p051p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerBiz;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogContentView;
import p137rx.C22421c;
import p153l.rwn0;

/* JADX INFO: loaded from: classes5.dex */
public abstract class nin0<T extends rwn0> extends bjs<T> {
    public nin0(dum<T> dumVar) {
        super(dumVar);
    }

    /* JADX INFO: renamed from: n6 */
    public static /* synthetic */ void m163292n6(coj cojVar, l6o0 l6o0Var) {
        cojVar.f82886b = l6o0Var.f130275b;
        cojVar.f82885a = l6o0Var.f130276c;
    }

    /* JADX INFO: renamed from: o6 */
    public static /* synthetic */ void m163293o6(Integer num) {
    }

    /* JADX INFO: renamed from: s6 */
    public static /* synthetic */ void m163297s6(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
    }

    /* JADX INFO: renamed from: t6 */
    public static /* synthetic */ void m163298t6(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w6 */
    public /* synthetic */ void m163299w6(vxj0 vxj0Var) {
        m163304z6();
    }

    @Override // p153l.bjs
    /* JADX INFO: renamed from: G4 */
    public Pair<String, cqj> mo104704G4(String str) {
        return !TextUtils.isEmpty(str) ? new Pair<>(this.f77009l, m163300u6(str)) : super.mo104704G4(str);
    }

    @Override // p153l.bjs
    /* JADX INFO: renamed from: P5 */
    public void mo104722P5(GiftDialogContentView giftDialogContentView) {
        super.mo104722P5(giftDialogContentView);
        m153103z2(new soc0(this.f196918e, giftDialogContentView.f51122j));
        m153103z2(new ccn0(this.f196918e));
    }

    @Override // p153l.bjs, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated((C22421c<T>) ((rwn0) m213810E2()).m183413Q2()).subscribe(dhw.m115829h(new y20() { // from class: l.ein0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f94184a.m163301v6((hrk0.C17564a) obj);
            }
        }));
        duringCreated((C22421c<T>) m213811F2().GiftDialogEventGroup.onVoicePositionChange().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.fin0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f99209a.m163299w6((vxj0) obj);
            }
        }));
        duringCreated(((rwn0) m213810E2()).m168545q1().f71671T).subscribe(dhw.m115829h(new y20() { // from class: l.gin0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f104509a.m163302x6((LongLinkLiveUserLevel.UserLiveHierarchyProgressChange) obj);
            }
        }));
        m138863h3(m213811F2().GiftDialogEventGroup.performCpGiftItemClick(), new y20() { // from class: l.hin0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f110040a.m163303y6((String) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u6 */
    public cqj m163300u6(String str) {
        BLiveVoiceCall bLiveVoiceCallM136873l = ((rwn0) m213810E2()).m183411P2().m136873l(str);
        if (bLiveVoiceCallM136873l == null) {
            h64 h64VarM136875n = ((rwn0) m213810E2()).m183411P2().m136875n(str);
            return h64VarM136875n != null ? new cqj.C16337a().m111927h(coj.m111661c(new h64(h64VarM136875n.f107997a, h64VarM136875n.f107998b, h64VarM136875n.f107999c), p54.m170591a())).m111923d() : new cqj.C16337a().m111927h(coj.m111661c(new h64(str, "", ""), p54.m170591a())).m111923d();
        }
        final coj cojVarM111661c = coj.m111661c(new h64(bLiveVoiceCallM136873l.user, bLiveVoiceCallM136873l.userName, bLiveVoiceCallM136873l.userPicture), p54.m170592b(bLiveVoiceCallM136873l.f45333id, "gift-audience-none-voiceLiveMain", bLiveVoiceCallM136873l.position));
        l6o0.m153068c(((rwn0) m213810E2()).m183411P2().m136874m(bLiveVoiceCallM136873l.user)).m153069a(new y20() { // from class: l.iin0
            @Override // p153l.y20
            public final void call(Object obj) {
                nin0.m163292n6(cojVarM111661c, (l6o0) obj);
            }
        });
        return new cqj.C16337a().m111927h(cojVarM111661c).m111923d();
    }

    /* JADX INFO: renamed from: v6 */
    public final /* synthetic */ void m163301v6(hrk0.C17564a c17564a) {
        m163304z6();
    }

    /* JADX INFO: renamed from: x6 */
    public final /* synthetic */ void m163302x6(LongLinkLiveUserLevel.UserLiveHierarchyProgressChange userLiveHierarchyProgressChange) {
        ((nhs) this.viewModel).m163220Z(userLiveHierarchyProgressChange);
    }

    /* JADX INFO: renamed from: y6 */
    public void m163303y6(String str) {
        BLiveGiftItem bLiveGiftItemM135161m = ((hiv) zrv.m221194l(htd0.f111521c)).m135161m(str);
        xoe0.m212465a(this, uoe0.m196974d(String.valueOf(bLiveGiftItemM135161m.f45225id), bLiveGiftItemM135161m, new y20() { // from class: l.jin0
            @Override // p153l.y20
            public final void call(Object obj) {
                nin0.m163297s6((BLiveGivenGiftBrief) obj);
            }
        }, new y20() { // from class: l.kin0
            @Override // p153l.y20
            public final void call(Object obj) {
                nin0.m163298t6((Throwable) obj);
            }
        }, new y20() { // from class: l.lin0
            @Override // p153l.y20
            public final void call(Object obj) {
                nin0.m163293o6((Integer) obj);
            }
        }, false, 1, this.f77009l, m104715M4(), BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerBiz.get(BLiveTraceServerBiz.f45308cp))), new y20() { // from class: l.min0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f137003a.m104734X5((uoe0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: z6 */
    public final void m163304z6() {
        if (isShowing()) {
            m213811F2().GiftDialogEventGroup.onVoiceDeputyChange().mo199273j(new scn0(mo104702F4()));
        }
    }
}
