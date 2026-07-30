package p153l;

import android.text.TextUtils;
import android.util.Pair;
import com.p051p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel;
import com.p051p1.mobile.putong.live.base.data.BLiveCall;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogContentView;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
public class uel0<T extends oo2> extends bjs<T> {
    public uel0(dum dumVar) {
        super(dumVar);
    }

    @Override // p153l.bjs
    @Nullable
    /* JADX INFO: renamed from: F4 */
    public List<coj> mo104702F4() {
        ArrayList<coj> arrayListM195780t6 = m195780t6();
        return arrayListM195780t6.isEmpty() ? m195779s6() : arrayListM195780t6;
    }

    @Override // p153l.bjs
    /* JADX INFO: renamed from: G4 */
    public Pair<String, cqj> mo104704G4(String str) {
        if (!bf10.m103808N(this) || TextUtils.isEmpty(str)) {
            return super.mo104704G4(str);
        }
        BLiveMultiCall bLiveMultiCallM103799E = bf10.m103799E(this, str);
        return bLiveMultiCallM103799E != null ? Pair.create(this.f77009l, ve10.m201024d(bLiveMultiCallM103799E)) : super.mo104704G4(str);
    }

    @Override // p153l.bjs
    /* JADX INFO: renamed from: J4 */
    public cqj mo104710J4() {
        BLiveMultiCall bLiveMultiCallM195776p6 = m195776p6();
        return bLiveMultiCallM195776p6 != null ? ve10.m201024d(bLiveMultiCallM195776p6) : super.mo104710J4();
    }

    @Override // p153l.bjs
    /* JADX INFO: renamed from: K4 */
    public String mo104711K4() {
        BLiveMultiCall bLiveMultiCallM195776p6;
        String strM201027g = (!bf10.m103808N(this) || (bLiveMultiCallM195776p6 = m195776p6()) == null) ? null : ve10.m201027g(bLiveMultiCallM195776p6);
        if (TextUtils.isEmpty(strM201027g)) {
            return ((Boolean) m138856F3(new ml50(700))).booleanValue() ? "call-main" : "live";
        }
        return strM201027g;
    }

    @Override // p153l.bjs
    /* JADX INFO: renamed from: P5 */
    public void mo104722P5(GiftDialogContentView giftDialogContentView) {
        super.mo104722P5(giftDialogContentView);
        m153103z2(new ke60(this.f196918e, giftDialogContentView.f51126n));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2] */
    @Override // p153l.bjs, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        m138860d3(fik0.class, new qcj() { // from class: l.sel0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f167631a.m195777q6((fik0) obj);
            }
        });
        duringCreated(m213810E2().m168545q1().f71671T).subscribe(dhw.m115829h(new y20() { // from class: l.tel0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f173882a.m195778r6((LongLinkLiveUserLevel.UserLiveHierarchyProgressChange) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2] */
    @Override // p153l.bjs, p153l.i6t
    /* JADX INFO: renamed from: j3 */
    public String mo104749j3() {
        return m213810E2().m168532l0().f56859id;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    @Nullable
    /* JADX INFO: renamed from: p6 */
    public BLiveMultiCall m195776p6() {
        return bf10.m103799E(this, m213810E2().m168532l0().f56859id);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r8v1, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r8v2, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r8v3, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r8v5, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r8v7, types: [l.oo2] */
    /* JADX INFO: renamed from: q6 */
    public final /* synthetic */ fik0.C16979a m195777q6(fik0 fik0Var) {
        return new fik0.C16979a(m213810E2().m202191k(), m213810E2().m202194o(), m213810E2().m168532l0().f56859id, m213810E2().m168532l0().name, m213810E2().mo118362A0(), m213810E2().mo183435j().liveMode);
    }

    /* JADX INFO: renamed from: r6 */
    public final /* synthetic */ void m195778r6(LongLinkLiveUserLevel.UserLiveHierarchyProgressChange userLiveHierarchyProgressChange) {
        ((nhs) this.viewModel).m163220Z(userLiveHierarchyProgressChange);
    }

    /* JADX INFO: renamed from: s6 */
    public final ArrayList<coj> m195779s6() {
        return ve10.m201022a((List) m138856F3(new smj(0)));
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [l.oo2] */
    /* JADX INFO: renamed from: t6 */
    public final ArrayList<coj> m195780t6() {
        ArrayList<coj> arrayList = new ArrayList<>();
        List list = (List) m138856F3(new rmj(700));
        for (int i = 0; i < list.size(); i++) {
            BLiveCall bLiveCall = (BLiveCall) list.get(i);
            coj cojVarM111661c = coj.m111661c(new h64(bLiveCall.user, bLiveCall.userName, bLiveCall.userPicture), p54.m170592b(bLiveCall.f45190id, "gift-audience-none-callaudience", bLiveCall.position));
            cojVarM111661c.f82891g = TextUtils.equals(bLiveCall.user, m213810E2().m168532l0().f56859id) ? "call-main" : "callVoiceVice";
            cojVarM111661c.f82887c = false;
            arrayList.add(cojVarM111661c);
        }
        return arrayList;
    }
}
