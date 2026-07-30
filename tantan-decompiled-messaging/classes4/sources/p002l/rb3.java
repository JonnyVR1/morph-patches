package p002l;

import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.NewBottomIconModuleInfo;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.areaA.view.BottomInputView;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.view.BottomView;
import com.p1.mobile.longlink.msg.liveroom.LongLinkBottomMenu;
import com.p1.mobile.putong.live.base.data.BLiveBottomMenu;
import com.p1.mobile.putong.live.base.data.BLiveChatBox;
import com.p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p1.mobile.putong.live.base.data.BLiveOfficialShowCurrentAnchorInfo;
import l.d30;
import l.e30;
import l.fd50;
import l.ffw;
import l.hfw;
import l.r610;
import l.soj0;
import l.vwb;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class rb3 extends pat<ho2> {

    /* JADX INFO: renamed from: i */
    public bz0 f18445i;

    /* JADX INFO: renamed from: j */
    public kz0 f18446j;

    /* JADX INFO: renamed from: k */
    public sz0 f18447k;

    /* JADX INFO: renamed from: l */
    public hkc0 f18448l;

    /* JADX INFO: renamed from: m */
    public NewBottomIconModuleInfo f18449m;

    public rb3(bsm bsmVar, BottomInputView bottomInputView, BottomView bottomView) {
        super(bsmVar);
        this.f18449m = new NewBottomIconModuleInfo(m25552L2() || t7t.m22811c(bsmVar.f8339h));
        this.f18448l = (hkc0) z2(new hkc0(bsmVar));
        this.f18445i = (bz0) z2(new bz0(bsmVar, bottomInputView));
        this.f18446j = (kz0) z2(new kz0(bsmVar, bottomView));
        this.f18447k = (sz0) z2(new sz0(bsmVar));
        if (m25552L2() || t7t.m22811c(bsmVar.f8339h)) {
            z2(new xu2(bsmVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public /* synthetic */ void m21884a4(soj0 soj0Var) {
        m21895d4();
    }

    /* JADX INFO: renamed from: T */
    public void m21885T() {
        super.T();
        m14188d3(hf3.C0604b.class, new w9j() { // from class: l.hb3
            public final Object call(Object obj) {
                return this.f11957a.m21889W3((hf3.C0604b) obj);
            }
        });
        m14188d3(de3.class, new w9j() { // from class: l.ib3
            public final Object call(Object obj) {
                return this.f13128a.m21890X3((de3) obj);
            }
        });
    }

    /* JADX INFO: renamed from: T3 */
    public final void m21886T3() {
        this.f18445i.m23513V3();
        this.f18446j.m23513V3();
        this.f18447k.m22765N3();
    }

    /* JADX INFO: renamed from: U3 */
    public final AbstractC0583g4.a m21887U3(String str, int i) {
        AbstractC0583g4.a aVarM23516Y3 = this.f18445i.m23516Y3(String.valueOf(i));
        if (aVarM23516Y3 == null) {
            aVarM23516Y3 = this.f18446j.m23516Y3(String.valueOf(i));
        }
        if (aVarM23516Y3 != null) {
            return aVarM23516Y3;
        }
        AbstractC0583g4.a aVarM23517Z3 = this.f18445i.m23517Z3(str);
        return aVarM23517Z3 == null ? this.f18446j.m23517Z3(str) : aVarM23517Z3;
    }

    /* JADX INFO: renamed from: V3 */
    public final boolean m21888V3() {
        BLiveMultiCall bLiveMultiCallB = r610.B(this);
        if (((Boolean) m14184F3(new fd50(800))).booleanValue()) {
            return true;
        }
        return (bLiveMultiCallB == null || m25552L2()) ? false : true;
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ AbstractC0583g4.a m21889W3(hf3.C0604b c0604b) {
        return m21887U3(c0604b.f12008c, c0604b.f12009d);
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ String m21890X3(de3 de3Var) {
        return this.f18449m.m5648n();
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ NewBottomIconModuleInfo m21891Y3(BLiveEnvelope bLiveEnvelope) {
        BLiveBottomMenu bLiveBottomMenu = bLiveEnvelope.data.bottomMenu;
        StringBuilder sb = new StringBuilder("bottom menu:");
        sb.append(bLiveBottomMenu == null ? "null" : bLiveBottomMenu.toJson());
        hfw.a("[live]bottom", sb.toString());
        return this.f18449m.m5646l(bLiveBottomMenu);
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m21892Z3(Throwable th) {
        m21896e4(this.f18449m.m5645k());
        StringBuilder sb = new StringBuilder("bottom refresh error:");
        sb.append(th == null ? "null" : th.getMessage());
        hfw.a("[live]bottom", sb.toString());
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m21893b4(LongLinkBottomMenu.LiveBottomMenuUpdate liveBottomMenuUpdate) {
        m21895d4();
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m21894c4(soj0 soj0Var) {
        m21895d4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r0v5, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: d4 */
    public void m21895d4() {
        BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfoM25674S2;
        duringCreated(LivingNormalApiProvider.m4821f5(m25547E2().m17239o(), m25552L2(), m21888V3(), m25547E2().m17234j().liveMode, r610.N(this), r610.M(this), (!(m25547E2() instanceof x350) || (bLiveOfficialShowCurrentAnchorInfoM25674S2 = ((x350) m25547E2()).m25674S2()) == null) ? "" : bLiveOfficialShowCurrentAnchorInfoM25674S2.anchorId)).filter(new w9j() { // from class: l.nb3
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveEnvelope) obj).data.bottomMenu != null);
            }
        }).map(new w9j() { // from class: l.ob3
            public final Object call(Object obj) {
                return this.f16478a.m21891Y3((BLiveEnvelope) obj);
            }
        }).subscribe(ffw.e(new e30() { // from class: l.pb3
            public final void call(Object obj) {
                this.f17178a.m21896e4((NewBottomIconModuleInfo) obj);
            }
        }, new e30() { // from class: l.qb3
            public final void call(Object obj) {
                this.f17885a.m21892Z3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: e4 */
    public final void m21896e4(NewBottomIconModuleInfo newBottomIconModuleInfo) {
        m21886T3();
        this.f18448l.m14437e4(newBottomIconModuleInfo);
        if (newBottomIconModuleInfo.m5649o()) {
            this.f18445i.m10690f4(newBottomIconModuleInfo.m5651q());
        }
        this.f18446j.m16880o4(newBottomIconModuleInfo.m5652r());
        if (newBottomIconModuleInfo.m5650p()) {
            this.f18447k.m22769S3(newBottomIconModuleInfo.m5655u(), newBottomIconModuleInfo.m5648n());
        }
        if (newBottomIconModuleInfo.getMenu() == null || vwb.J(newBottomIconModuleInfo.getMenu().chatBox)) {
            return;
        }
        m25548F2().ChatEvent.customChatInputStyle().j((BLiveChatBox) newBottomIconModuleInfo.getMenu().chatBox.get(0));
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [l.ho2] */
    /* JADX INFO: renamed from: t */
    public void m21897t() {
        super.t();
        duringCreated((c) m25548F2().BottomEvent.callBottomButtonApiDiffRefresh().g()).subscribe(ffw.d(new e30() { // from class: l.jb3
            public final void call(Object obj) {
                this.f13664a.m21884a4((soj0) obj);
            }
        }));
        duringCreated(m25547E2().m14596q1().v()).subscribe(ffw.h(new e30() { // from class: l.kb3
            public final void call(Object obj) {
                this.f14267a.m21893b4((LongLinkBottomMenu.LiveBottomMenuUpdate) obj);
            }
        }));
        m14190g3(m25548F2().MultiCallEvent.startLiveMultiCall(), new d30() { // from class: l.lb3
            public final void call() {
                this.f14751a.m21895d4();
            }
        });
        m14191h3(m25548F2().MultiCallEvent.closeMultiCallMotion(), new e30() { // from class: l.mb3
            public final void call(Object obj) {
                this.f15308a.m21894c4((soj0) obj);
            }
        });
        m21895d4();
    }
}
