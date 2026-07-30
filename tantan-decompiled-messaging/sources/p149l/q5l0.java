package p149l;

import android.text.TextUtils;
import android.util.Pair;
import com.p046p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel;
import com.p046p1.mobile.putong.live.base.data.BLiveCall;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogContentView;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p149l.ho2;

/* JADX INFO: loaded from: classes4.dex */
public class q5l0<T extends ho2> extends ahs<T> {
    public q5l0(bsm bsmVar) {
        super(bsmVar);
    }

    @Override // p149l.ahs
    @Nullable
    /* JADX INFO: renamed from: F4 */
    public List<mlj> mo96615F4() {
        ArrayList<mlj> arrayListM173049t6 = m173049t6();
        return arrayListM173049t6.isEmpty() ? m173048s6() : arrayListM173049t6;
    }

    @Override // p149l.ahs
    /* JADX INFO: renamed from: G4 */
    public Pair<String, mnj> mo96617G4(String str) {
        if (!r610.m177979N(this) || TextUtils.isEmpty(str)) {
            return super.mo96617G4(str);
        }
        BLiveMultiCall bLiveMultiCallM177970E = r610.m177970E(this, str);
        return bLiveMultiCallM177970E != null ? Pair.create(this.f69688l, l610.m148687d(bLiveMultiCallM177970E)) : super.mo96617G4(str);
    }

    @Override // p149l.ahs
    /* JADX INFO: renamed from: J4 */
    public mnj mo96623J4() {
        BLiveMultiCall bLiveMultiCallM173045p6 = m173045p6();
        return bLiveMultiCallM173045p6 != null ? l610.m148687d(bLiveMultiCallM173045p6) : super.mo96623J4();
    }

    @Override // p149l.ahs
    /* JADX INFO: renamed from: K4 */
    public String mo96624K4() {
        BLiveMultiCall bLiveMultiCallM173045p6;
        String strM148690g = (!r610.m177979N(this) || (bLiveMultiCallM173045p6 = m173045p6()) == null) ? null : l610.m148690g(bLiveMultiCallM173045p6);
        if (TextUtils.isEmpty(strM148690g)) {
            return ((Boolean) m129297F3(new fd50(700))).booleanValue() ? "call-main" : "live";
        }
        return strM148690g;
    }

    @Override // p149l.ahs
    /* JADX INFO: renamed from: P5 */
    public void mo96635P5(GiftDialogContentView giftDialogContentView) {
        super.mo96635P5(giftDialogContentView);
        m144512z2(new e660(this.f188512e, giftDialogContentView.f50278n));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    @Override // p149l.ahs, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        m129301d3(z8k0.class, new w9j() { // from class: l.o5l0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f141917a.m173046q6((z8k0) obj);
            }
        });
        duringCreated(m206027E2().m132160q1().f170404T).subscribe(ffw.m121197h(new e30() { // from class: l.p5l0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f147309a.m173047r6((LongLinkLiveUserLevel.UserLiveHierarchyProgressChange) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    @Override // p149l.ahs, p149l.h4t
    /* JADX INFO: renamed from: j3 */
    public String mo96662j3() {
        return m206027E2().m132146l0().f56011id;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    @Nullable
    /* JADX INFO: renamed from: p6 */
    public BLiveMultiCall m173045p6() {
        return r610.m177970E(this, m206027E2().m132146l0().f56011id);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r8v1, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r8v2, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r8v3, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r8v5, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r8v7, types: [l.ho2] */
    /* JADX INFO: renamed from: q6 */
    public final /* synthetic */ z8k0.C21648a m173046q6(z8k0 z8k0Var) {
        return new z8k0.C21648a(m206027E2().m149814k(), m206027E2().m149818o(), m206027E2().m132146l0().f56011id, m206027E2().m132146l0().name, m206027E2().mo132054A0(), m206027E2().mo149813j().liveMode);
    }

    /* JADX INFO: renamed from: r6 */
    public final /* synthetic */ void m173047r6(LongLinkLiveUserLevel.UserLiveHierarchyProgressChange userLiveHierarchyProgressChange) {
        ((mfs) this.viewModel).m154451Z(userLiveHierarchyProgressChange);
    }

    /* JADX INFO: renamed from: s6 */
    public final ArrayList<mlj> m173048s6() {
        return l610.m148685a((List) m129297F3(new ckj(0)));
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [l.ho2] */
    /* JADX INFO: renamed from: t6 */
    public final ArrayList<mlj> m173049t6() {
        ArrayList<mlj> arrayList = new ArrayList<>();
        List list = (List) m129297F3(new bkj(700));
        for (int i = 0; i < list.size(); i++) {
            BLiveCall bLiveCall = (BLiveCall) list.get(i);
            mlj mljVarM155154c = mlj.m155154c(new i54(bLiveCall.user, bLiveCall.userName, bLiveCall.userPicture), q44.m172922b(bLiveCall.f44342id, "gift-audience-none-callaudience", bLiveCall.position));
            mljVarM155154c.f134446g = TextUtils.equals(bLiveCall.user, m206027E2().m132146l0().f56011id) ? "call-main" : "callVoiceVice";
            mljVarM155154c.f134442c = false;
            arrayList.add(mljVarM155154c);
        }
        return arrayList;
    }
}
