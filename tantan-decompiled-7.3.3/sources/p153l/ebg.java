package p153l;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveMedalColorTemplate;
import com.p051p1.mobile.putong.live.base.data.BLiveMedalIcon;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.common.fansclub.widget.LiveFansClubMedalEditPanel;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.CommonH5Builder;

/* JADX INFO: loaded from: classes4.dex */
public class ebg extends i6t<oo2, LiveFansClubMedalEditPanel> {

    /* JADX INFO: renamed from: i */
    public c0s f92923i;

    /* JADX INFO: renamed from: j */
    public kcg0 f92924j;

    public ebg(dum dumVar) {
        super(dumVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y3 */
    public /* synthetic */ void m120168Y3(Boolean bool) {
        if (bool.booleanValue()) {
            m120177b4();
        } else {
            m120169S3();
        }
    }

    /* JADX INFO: renamed from: S3 */
    public void m120169S3() {
        c0s c0sVar = this.f92923i;
        if (c0sVar != null) {
            c0sVar.dismiss();
        }
        psd0.m173633z(this.f92924j);
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ void m120170T3(BLiveEnvelope bLiveEnvelope) {
        ((LiveFansClubMedalEditPanel) this.viewModel).m74146Z(bLiveEnvelope.data.fanbaseMedalPanel);
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ void m120171U3(Throwable th) {
        ((LiveFansClubMedalEditPanel) this.viewModel).m74147a0();
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m120172V3(String str) {
        m213811F2().OpenH5Event.open().mo199273j(px50.m174112c(7001).m174141B(str).m174140A(bnl0.m105592y0(), ((LiveFansClubMedalEditPanel) this.viewModel).f49957g.getHeight()).m174142p(CommonH5Builder.BgType.DEFAULT_BG).m174146t(80).m174150x().m174143q());
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m120173W3(uxj0 uxj0Var) {
        ((LiveFansClubMedalEditPanel) this.viewModel).m74129B("reviewing");
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m120174X3(Throwable th) {
        if ((th instanceof TantanException.Client.CoreService) && ((TantanException.Client.CoreService) th).code == 41800) {
            ((LiveFansClubMedalEditPanel) this.viewModel).m74129B("editable");
            o1j0.m165634h(R$string.f47518F3);
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m120175Z3(int i, int i2, final String str, final String str2) {
        BLiveMedalIcon bLiveMedalIcon;
        BLiveMedalColorTemplate bLiveMedalColorTemplate = (BLiveMedalColorTemplate) jyb.m147529r(aiv.m98151z0(i, null), new qcj() { // from class: l.cbg
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveMedalColorTemplate) obj).name, str));
            }
        });
        if (bLiveMedalColorTemplate == null || (bLiveMedalIcon = (BLiveMedalIcon) jyb.m147529r(bLiveMedalColorTemplate.icons, new qcj() { // from class: l.dbg
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(str2, ((BLiveMedalIcon) obj).name));
            }
        })) == null) {
            return;
        }
        ((LiveFansClubMedalEditPanel) this.viewModel).m74148b0(i2, bLiveMedalColorTemplate.backgroundLargeUrl, bLiveMedalIcon.url);
    }

    /* JADX INFO: renamed from: a4 */
    public void m120176a4(String str, String str2) {
        m120175Z3(1, 1, str, str2);
        m120175Z3(6, 2, str, str2);
        m120175Z3(11, 3, str, str2);
        m120175Z3(16, 4, str, str2);
        m120175Z3(21, 5, str, str2);
        m120175Z3(26, 6, str, str2);
        m120175Z3(30, 7, str, str2);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: b4 */
    public final void m120177b4() {
        if (this.f92923i == null) {
            LiveFansClubMedalEditPanel liveFansClubMedalEditPanel = (LiveFansClubMedalEditPanel) this.f196919f.inflater().inflate(yec0.f198836M0, (ViewGroup) null);
            mo52715C(liveFansClubMedalEditPanel);
            this.f92923i = new c0s(this, liveFansClubMedalEditPanel);
        }
        ((LiveFansClubMedalEditPanel) this.viewModel).m74145Y();
        this.f92923i.show();
        this.f92924j = duringCreated(LivingNormalApiProvider.m72457L4(m213810E2().f148254B.f192716b.f45211id, m213810E2().mo183435j().anchor.f45267id)).subscribe(dhw.m115826e(new y20() { // from class: l.xag
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f193029a.m120170T3((BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.yag
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f198183a.m120171U3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c4 */
    public void m120178c4() {
        final String strM203682n4 = (seg.m185535c() || seg.m185536d()) ? efv.f93853j : zrv.m221193k().m203682n4();
        if (TextUtils.isEmpty(strM203682n4)) {
            return;
        }
        ((LiveFansClubMedalEditPanel) this.viewModel).f49957g.post(new Runnable() { // from class: l.zag
            @Override // java.lang.Runnable
            public final void run() {
                this.f203560a.m120172V3(strM203682n4);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: d4 */
    public void m120179d4(String str, String str2, String str3) {
        duringCreated(LivingNormalApiProvider.m72478N7(m213810E2().f148254B.f192716b.f45211id, m213810E2().mo183435j().anchor.f45267id, str, str2, str3)).subscribe(dhw.m115826e(new y20() { // from class: l.abg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f69619a.m120173W3((uxj0) obj);
            }
        }, new y20() { // from class: l.bbg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f75945a.m120174X3((Throwable) obj);
            }
        }));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().FansClubMedalEvent.showDialog().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.wag
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f188120a.m120168Y3((Boolean) obj);
            }
        }));
    }
}
