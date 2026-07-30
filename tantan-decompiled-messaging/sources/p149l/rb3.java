package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.LongLinkBottomMenu;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomMenu;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p046p1.mobile.putong.live.base.data.BLiveOfficialShowCurrentAnchorInfo;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.NewBottomIconModuleInfo;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.areaA.view.BottomInputView;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.view.BottomView;

/* JADX INFO: loaded from: classes4.dex */
public class rb3 extends pat<ho2> {

    /* JADX INFO: renamed from: i */
    public bz0 f158578i;

    /* JADX INFO: renamed from: j */
    public kz0 f158579j;

    /* JADX INFO: renamed from: k */
    public sz0 f158580k;

    /* JADX INFO: renamed from: l */
    public hkc0 f158581l;

    /* JADX INFO: renamed from: m */
    public NewBottomIconModuleInfo f158582m;

    public rb3(bsm bsmVar, BottomInputView bottomInputView, BottomView bottomView) {
        super(bsmVar);
        this.f158582m = new NewBottomIconModuleInfo(m206032L2() || t7t.m187503c(bsmVar.f77102h));
        this.f158581l = (hkc0) m144512z2(new hkc0(bsmVar));
        this.f158578i = (bz0) m144512z2(new bz0(bsmVar, bottomInputView));
        this.f158579j = (kz0) m144512z2(new kz0(bsmVar, bottomView));
        this.f158580k = (sz0) m144512z2(new sz0(bsmVar));
        if (m206032L2() || t7t.m187503c(bsmVar.f77102h)) {
            m144512z2(new xu2(bsmVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public /* synthetic */ void m178567a4(soj0 soj0Var) {
        m178577d4();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        m129301d3(hf3.C17295b.class, new w9j() { // from class: l.hb3
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f106898a.m178571W3((hf3.C17295b) obj);
            }
        });
        m129301d3(de3.class, new w9j() { // from class: l.ib3
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f112346a.m178572X3((de3) obj);
            }
        });
    }

    /* JADX INFO: renamed from: T3 */
    public final void m178568T3() {
        this.f158578i.m194210V3();
        this.f158579j.m194210V3();
        this.f158580k.m186736N3();
    }

    /* JADX INFO: renamed from: U3 */
    public final AbstractC16991g4.a m178569U3(String str, int i) {
        AbstractC16991g4.a aVarM194213Y3 = this.f158578i.m194213Y3(String.valueOf(i));
        if (aVarM194213Y3 == null) {
            aVarM194213Y3 = this.f158579j.m194213Y3(String.valueOf(i));
        }
        if (aVarM194213Y3 != null) {
            return aVarM194213Y3;
        }
        AbstractC16991g4.a aVarM194214Z3 = this.f158578i.m194214Z3(str);
        return aVarM194214Z3 == null ? this.f158579j.m194214Z3(str) : aVarM194214Z3;
    }

    /* JADX INFO: renamed from: V3 */
    public final boolean m178570V3() {
        BLiveMultiCall bLiveMultiCallM177967B = r610.m177967B(this);
        if (((Boolean) m129297F3(new fd50(800))).booleanValue()) {
            return true;
        }
        return (bLiveMultiCallM177967B == null || m206032L2()) ? false : true;
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ AbstractC16991g4.a m178571W3(hf3.C17295b c17295b) {
        return m178569U3(c17295b.f107428c, c17295b.f107429d);
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ String m178572X3(de3 de3Var) {
        return this.f158582m.m72175n();
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ NewBottomIconModuleInfo m178573Y3(BLiveEnvelope bLiveEnvelope) {
        BLiveBottomMenu bLiveBottomMenu = bLiveEnvelope.data.bottomMenu;
        StringBuilder sb = new StringBuilder("bottom menu:");
        sb.append(bLiveBottomMenu == null ? "null" : bLiveBottomMenu.toJson());
        hfw.m130790a("[live]bottom", sb.toString());
        return this.f158582m.m72173l(bLiveBottomMenu);
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m178574Z3(Throwable th) {
        m178578e4(this.f158582m.m72172k());
        StringBuilder sb = new StringBuilder("bottom refresh error:");
        sb.append(th == null ? "null" : th.getMessage());
        hfw.m130790a("[live]bottom", sb.toString());
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m178575b4(LongLinkBottomMenu.LiveBottomMenuUpdate liveBottomMenuUpdate) {
        m178577d4();
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m178576c4(soj0 soj0Var) {
        m178577d4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r0v5, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: d4 */
    public void m178577d4() {
        BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfoM206897S2;
        duringCreated(LivingNormalApiProvider.m71455f5(m206027E2().m149818o(), m206032L2(), m178570V3(), m206027E2().mo149813j().liveMode, r610.m177979N(this), r610.m177978M(this), (!(m206027E2() instanceof x350) || (bLiveOfficialShowCurrentAnchorInfoM206897S2 = ((x350) m206027E2()).m206897S2()) == null) ? "" : bLiveOfficialShowCurrentAnchorInfoM206897S2.anchorId)).filter(new w9j() { // from class: l.nb3
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveEnvelope) obj).data.bottomMenu != null);
            }
        }).map(new w9j() { // from class: l.ob3
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f142884a.m178573Y3((BLiveEnvelope) obj);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.pb3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f148035a.m178578e4((NewBottomIconModuleInfo) obj);
            }
        }, new e30() { // from class: l.qb3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f153615a.m178574Z3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: e4 */
    public final void m178578e4(NewBottomIconModuleInfo newBottomIconModuleInfo) {
        m178568T3();
        this.f158581l.m131483e4(newBottomIconModuleInfo);
        if (newBottomIconModuleInfo.m72176o()) {
            this.f158578i.m104535f4(newBottomIconModuleInfo.m72178q());
        }
        this.f158579j.m147925o4(newBottomIconModuleInfo.m72179r());
        if (newBottomIconModuleInfo.m72177p()) {
            this.f158580k.m186740S3(newBottomIconModuleInfo.m72182u(), newBottomIconModuleInfo.m72175n());
        }
        if (newBottomIconModuleInfo.getCom.p1.mobile.putong.data.NavigationIntent.menu java.lang.String() == null || vwb.m200296J(newBottomIconModuleInfo.getCom.p1.mobile.putong.data.NavigationIntent.menu java.lang.String().chatBox)) {
            return;
        }
        m206028F2().ChatEvent.customChatInputStyle().mo172463j(newBottomIconModuleInfo.getCom.p1.mobile.putong.data.NavigationIntent.menu java.lang.String().chatBox.get(0));
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [l.ho2] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().BottomEvent.callBottomButtonApiDiffRefresh().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.jb3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f117159a.m178567a4((soj0) obj);
            }
        }));
        duringCreated(m206027E2().m132160q1().m189149v()).subscribe(ffw.m121197h(new e30() { // from class: l.kb3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f122196a.m178575b4((LongLinkBottomMenu.LiveBottomMenuUpdate) obj);
            }
        }));
        m129303g3(m206028F2().MultiCallEvent.startLiveMultiCall(), new d30() { // from class: l.lb3
            @Override // p149l.d30
            public final void call() {
                this.f127270a.m178577d4();
            }
        });
        m129304h3(m206028F2().MultiCallEvent.closeMultiCallMotion(), new e30() { // from class: l.mb3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f132984a.m178576c4((soj0) obj);
            }
        });
        m178577d4();
    }
}
