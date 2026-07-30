package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkBottomMenu;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomMenu;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p051p1.mobile.putong.live.base.data.BLiveOfficialShowCurrentAnchorInfo;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.NewBottomIconModuleInfo;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.areaA.view.BottomInputView;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.view.BottomView;

/* JADX INFO: loaded from: classes4.dex */
public class gc3 extends qct<oo2> {

    /* JADX INFO: renamed from: i */
    public iz0 f103518i;

    /* JADX INFO: renamed from: j */
    public rz0 f103519j;

    /* JADX INFO: renamed from: k */
    public zz0 f103520k;

    /* JADX INFO: renamed from: l */
    public osc0 f103521l;

    /* JADX INFO: renamed from: m */
    public NewBottomIconModuleInfo f103522m;

    public gc3(dum dumVar, BottomInputView bottomInputView, BottomView bottomView) {
        super(dumVar);
        this.f103522m = new NewBottomIconModuleInfo(m213815L2() || u9t.m195114c(dumVar.f90822h));
        this.f103521l = (osc0) m153103z2(new osc0(dumVar));
        this.f103518i = (iz0) m153103z2(new iz0(dumVar, bottomInputView));
        this.f103519j = (rz0) m153103z2(new rz0(dumVar, bottomView));
        this.f103520k = (zz0) m153103z2(new zz0(dumVar));
        if (m213815L2() || u9t.m195114c(dumVar.f90822h)) {
            m153103z2(new nv2(dumVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public /* synthetic */ void m129835a4(vxj0 vxj0Var) {
        m129845d4();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        m138860d3(vf3.C20826b.class, new qcj() { // from class: l.wb3
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f188199a.m129839W3((vf3.C20826b) obj);
            }
        });
        m138860d3(se3.class, new qcj() { // from class: l.xb3
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f193123a.m129840X3((se3) obj);
            }
        });
    }

    /* JADX INFO: renamed from: T3 */
    public final void m129836T3() {
        this.f103518i.m111076V3();
        this.f103519j.m111076V3();
        this.f103520k.m222209N3();
    }

    /* JADX INFO: renamed from: U3 */
    public final AbstractC17128g4.a m129837U3(String str, int i) {
        AbstractC17128g4.a aVarM111079Y3 = this.f103518i.m111079Y3(String.valueOf(i));
        if (aVarM111079Y3 == null) {
            aVarM111079Y3 = this.f103519j.m111079Y3(String.valueOf(i));
        }
        if (aVarM111079Y3 != null) {
            return aVarM111079Y3;
        }
        AbstractC17128g4.a aVarM111080Z3 = this.f103518i.m111080Z3(str);
        return aVarM111080Z3 == null ? this.f103519j.m111080Z3(str) : aVarM111080Z3;
    }

    /* JADX INFO: renamed from: V3 */
    public final boolean m129838V3() {
        BLiveMultiCall bLiveMultiCallM103796B = bf10.m103796B(this);
        if (((Boolean) m138856F3(new ml50(800))).booleanValue()) {
            return true;
        }
        return (bLiveMultiCallM103796B == null || m213815L2()) ? false : true;
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ AbstractC17128g4.a m129839W3(vf3.C20826b c20826b) {
        return m129837U3(c20826b.f183877c, c20826b.f183878d);
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ String m129840X3(se3 se3Var) {
        return this.f103522m.m73358n();
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ NewBottomIconModuleInfo m129841Y3(BLiveEnvelope bLiveEnvelope) {
        BLiveBottomMenu bLiveBottomMenu = bLiveEnvelope.data.bottomMenu;
        StringBuilder sb = new StringBuilder("bottom menu:");
        sb.append(bLiveBottomMenu == null ? "null" : bLiveBottomMenu.toJson());
        fhw.m125605a("[live]bottom", sb.toString());
        return this.f103522m.m73356l(bLiveBottomMenu);
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m129842Z3(Throwable th) {
        m129846e4(this.f103522m.m73355k());
        StringBuilder sb = new StringBuilder("bottom refresh error:");
        sb.append(th == null ? "null" : th.getMessage());
        fhw.m125605a("[live]bottom", sb.toString());
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m129843b4(LongLinkBottomMenu.LiveBottomMenuUpdate liveBottomMenuUpdate) {
        m129845d4();
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m129844c4(vxj0 vxj0Var) {
        m129845d4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r0v5, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: d4 */
    public void m129845d4() {
        BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfoM157913S2;
        duringCreated(LivingNormalApiProvider.m72638f5(m213810E2().m202194o(), m213815L2(), m129838V3(), m213810E2().mo183435j().liveMode, bf10.m103808N(this), bf10.m103807M(this), (!(m213810E2() instanceof mc50) || (bLiveOfficialShowCurrentAnchorInfoM157913S2 = ((mc50) m213810E2()).m157913S2()) == null) ? "" : bLiveOfficialShowCurrentAnchorInfoM157913S2.anchorId)).filter(new qcj() { // from class: l.cc3
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveEnvelope) obj).data.bottomMenu != null);
            }
        }).map(new qcj() { // from class: l.dc3
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f87737a.m129841Y3((BLiveEnvelope) obj);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.ec3
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f93003a.m129846e4((NewBottomIconModuleInfo) obj);
            }
        }, new y20() { // from class: l.fc3
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f98175a.m129842Z3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: e4 */
    public final void m129846e4(NewBottomIconModuleInfo newBottomIconModuleInfo) {
        m129836T3();
        this.f103521l.m168984e4(newBottomIconModuleInfo);
        if (newBottomIconModuleInfo.m73359o()) {
            this.f103518i.m142754f4(newBottomIconModuleInfo.m73361q());
        }
        this.f103519j.m183667o4(newBottomIconModuleInfo.m73362r());
        if (newBottomIconModuleInfo.m73360p()) {
            this.f103520k.m222213S3(newBottomIconModuleInfo.m73365u(), newBottomIconModuleInfo.m73358n());
        }
        if (newBottomIconModuleInfo.getCom.p1.mobile.putong.data.NavigationIntent.menu java.lang.String() == null || jyb.m147479J(newBottomIconModuleInfo.getCom.p1.mobile.putong.data.NavigationIntent.menu java.lang.String().chatBox)) {
            return;
        }
        m213811F2().ChatEvent.customChatInputStyle().mo199273j(newBottomIconModuleInfo.getCom.p1.mobile.putong.data.NavigationIntent.menu java.lang.String().chatBox.get(0));
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [l.oo2] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().BottomEvent.callBottomButtonApiDiffRefresh().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.yb3
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f198272a.m129835a4((vxj0) obj);
            }
        }));
        duringCreated(m213810E2().m168545q1().m98331v()).subscribe(dhw.m115829h(new y20() { // from class: l.zb3
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f203620a.m129843b4((LongLinkBottomMenu.LiveBottomMenuUpdate) obj);
            }
        }));
        m138862g3(m213811F2().MultiCallEvent.startLiveMultiCall(), new x20() { // from class: l.ac3
            @Override // p153l.x20
            public final void call() {
                this.f69673a.m129845d4();
            }
        });
        m138863h3(m213811F2().MultiCallEvent.closeMultiCallMotion(), new y20() { // from class: l.bc3
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f76092a.m129844c4((vxj0) obj);
            }
        });
        m129845d4();
    }
}
