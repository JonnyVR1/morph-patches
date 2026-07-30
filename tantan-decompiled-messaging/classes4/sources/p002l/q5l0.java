package p002l;

import android.text.TextUtils;
import android.util.Pair;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogContentView;
import com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel;
import com.p1.mobile.putong.live.base.data.BLiveCall;
import com.p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import java.util.List;
import l.bkj;
import l.bwr;
import l.ckj;
import l.e30;
import l.fd50;
import l.ffw;
import l.i54;
import l.l610;
import l.r610;
import l.w9j;
import org.jetbrains.annotations.Nullable;
import p002l.ho2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class q5l0<T extends ho2> extends ahs<T> {
    public q5l0(bsm bsmVar) {
        super(bsmVar);
    }

    @Override // p002l.ahs
    @Nullable
    /* JADX INFO: renamed from: F4 */
    public List<mlj> mo9711F4() {
        ArrayList<mlj> arrayListM21032t6 = m21032t6();
        return arrayListM21032t6.isEmpty() ? m21031s6() : arrayListM21032t6;
    }

    @Override // p002l.ahs
    /* JADX INFO: renamed from: G4 */
    public Pair<String, mnj> mo9713G4(String str) {
        if (!r610.N(this) || TextUtils.isEmpty(str)) {
            return super.mo9713G4(str);
        }
        BLiveMultiCall bLiveMultiCallE = r610.E(this, str);
        return bLiveMultiCallE != null ? Pair.create(this.f7626l, l610.d(bLiveMultiCallE)) : super.mo9713G4(str);
    }

    @Override // p002l.ahs
    /* JADX INFO: renamed from: J4 */
    public mnj mo9719J4() {
        BLiveMultiCall bLiveMultiCallM21028p6 = m21028p6();
        return bLiveMultiCallM21028p6 != null ? l610.d(bLiveMultiCallM21028p6) : super.mo9719J4();
    }

    @Override // p002l.ahs
    /* JADX INFO: renamed from: K4 */
    public String mo9720K4() {
        BLiveMultiCall bLiveMultiCallM21028p6;
        String strG = (!r610.N(this) || (bLiveMultiCallM21028p6 = m21028p6()) == null) ? null : l610.g(bLiveMultiCallM21028p6);
        if (TextUtils.isEmpty(strG)) {
            return ((Boolean) m14184F3(new fd50(700))).booleanValue() ? "call-main" : "live";
        }
        return strG;
    }

    @Override // p002l.ahs
    /* JADX INFO: renamed from: P5 */
    public void mo9731P5(GiftDialogContentView giftDialogContentView) {
        super.mo9731P5(giftDialogContentView);
        z2(new e660(this.f22036e, giftDialogContentView.f6320n));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    @Override // p002l.ahs
    /* JADX INFO: renamed from: T */
    public void mo9736T() {
        super.mo9736T();
        m14188d3(z8k0.class, new w9j() { // from class: l.o5l0
            public final Object call(Object obj) {
                return this.f16372a.m21029q6((z8k0) obj);
            }
        });
        duringCreated(m25547E2().m14596q1().T).subscribe(ffw.h(new e30() { // from class: l.p5l0
            public final void call(Object obj) {
                this.f17013a.m21030r6((LongLinkLiveUserLevel.UserLiveHierarchyProgressChange) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    @Override // p002l.ahs, p002l.h4t
    /* JADX INFO: renamed from: j3 */
    public String mo9759j3() {
        return ((DbObject) m25547E2().m14582l0()).id;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    @Nullable
    /* JADX INFO: renamed from: p6 */
    public BLiveMultiCall m21028p6() {
        return r610.E(this, ((DbObject) m25547E2().m14582l0()).id);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r8v1, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r8v2, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r8v3, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r8v5, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r8v7, types: [l.ho2] */
    /* JADX INFO: renamed from: q6 */
    public final /* synthetic */ z8k0.C0938a m21029q6(z8k0 z8k0Var) {
        return new z8k0.C0938a(m25547E2().m17235k(), m25547E2().m17239o(), ((DbObject) m25547E2().m14582l0()).id, m25547E2().m14582l0().name, m25547E2().mo14489A0(), m25547E2().m17234j().liveMode);
    }

    /* JADX INFO: renamed from: r6 */
    public final /* synthetic */ void m21030r6(LongLinkLiveUserLevel.UserLiveHierarchyProgressChange userLiveHierarchyProgressChange) {
        ((mfs) ((bwr) this).viewModel).m17893Z(userLiveHierarchyProgressChange);
    }

    /* JADX INFO: renamed from: s6 */
    public final ArrayList<mlj> m21031s6() {
        return l610.a((List) m14184F3(new ckj(0)));
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [l.ho2] */
    /* JADX INFO: renamed from: t6 */
    public final ArrayList<mlj> m21032t6() {
        ArrayList<mlj> arrayList = new ArrayList<>();
        List list = (List) m14184F3(new bkj(700));
        for (int i = 0; i < list.size(); i++) {
            BLiveCall bLiveCall = (BLiveCall) list.get(i);
            mlj mljVarM18003c = mlj.m18003c(new i54(bLiveCall.user, bLiveCall.userName, bLiveCall.userPicture), q44.m21020b(bLiveCall.id, "gift-audience-none-callaudience", bLiveCall.position));
            mljVarM18003c.f15448g = TextUtils.equals(bLiveCall.user, ((DbObject) m25547E2().m14582l0()).id) ? "call-main" : "callVoiceVice";
            mljVarM18003c.f15444c = false;
            arrayList.add(mljVarM18003c);
        }
        return arrayList;
    }
}
