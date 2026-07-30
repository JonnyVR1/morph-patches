package p002l;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p000p1.mobile.putong.live.livingroom.common.fansclub.widget.LiveFansClubMedalEditPanel;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p1.mobile.putong.live.base.data.BLiveMedalColorTemplate;
import com.p1.mobile.putong.live.base.data.BLiveMedalIcon;
import com.p1.mobile.putong.ui.webview.mk.CommonH5Builder;
import l.bwr;
import l.c4g0;
import l.ddv;
import l.e30;
import l.ffw;
import l.lsi0;
import l.mkd0;
import l.roj0;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.ypv;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class q9g extends h4t<ho2, LiveFansClubMedalEditPanel> {

    /* JADX INFO: renamed from: i */
    public byr f17878i;

    /* JADX INFO: renamed from: j */
    public c4g0 f17879j;

    public q9g(bsm bsmVar) {
        super(bsmVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y3 */
    public /* synthetic */ void m21122Y3(Boolean bool) {
        if (bool.booleanValue()) {
            m21131b4();
        } else {
            m21123S3();
        }
    }

    /* JADX INFO: renamed from: S3 */
    public void m21123S3() {
        byr byrVar = this.f17878i;
        if (byrVar != null) {
            byrVar.dismiss();
        }
        mkd0.z(this.f17879j);
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ void m21124T3(BLiveEnvelope bLiveEnvelope) {
        ((LiveFansClubMedalEditPanel) ((bwr) this).viewModel).m6483Z(bLiveEnvelope.data.fanbaseMedalPanel);
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ void m21125U3(Throwable th) {
        ((LiveFansClubMedalEditPanel) ((bwr) this).viewModel).m6484a0();
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m21126V3(String str) {
        m25548F2().OpenH5Event.open().j(jp50.m16064c(7001).m16094B(str).m16093A(xdl0.y0(), ((LiveFansClubMedalEditPanel) ((bwr) this).viewModel).f5151g.getHeight()).m16095p(CommonH5Builder.BgType.DEFAULT_BG).m16099t(80).m16103x().m16096q());
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m21127W3(roj0 roj0Var) {
        ((LiveFansClubMedalEditPanel) ((bwr) this).viewModel).m6465B("reviewing");
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m21128X3(Throwable th) {
        if ((th instanceof TantanException.Client.CoreService) && ((TantanException.Client.CoreService) th).code == 41800) {
            ((LiveFansClubMedalEditPanel) ((bwr) this).viewModel).m6465B("editable");
            lsi0.h(R$string.f2712F3);
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m21129Z3(int i, int i2, final String str, final String str2) {
        BLiveMedalIcon bLiveMedalIcon;
        BLiveMedalColorTemplate bLiveMedalColorTemplate = (BLiveMedalColorTemplate) vwb.r(zfv.m27320z0(i, null), new w9j() { // from class: l.o9g
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveMedalColorTemplate) obj).name, str));
            }
        });
        if (bLiveMedalColorTemplate == null || (bLiveMedalIcon = (BLiveMedalIcon) vwb.r(bLiveMedalColorTemplate.icons, new w9j() { // from class: l.p9g
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(str2, ((BLiveMedalIcon) obj).name));
            }
        })) == null) {
            return;
        }
        ((LiveFansClubMedalEditPanel) ((bwr) this).viewModel).m6485b0(i2, bLiveMedalColorTemplate.backgroundLargeUrl, bLiveMedalIcon.url);
    }

    /* JADX INFO: renamed from: a4 */
    public void m21130a4(String str, String str2) {
        m21129Z3(1, 1, str, str2);
        m21129Z3(6, 2, str, str2);
        m21129Z3(11, 3, str, str2);
        m21129Z3(16, 4, str, str2);
        m21129Z3(21, 5, str, str2);
        m21129Z3(26, 6, str, str2);
        m21129Z3(30, 7, str, str2);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: b4 */
    public final void m21131b4() {
        if (this.f17878i == null) {
            LiveFansClubMedalEditPanel liveFansClubMedalEditPanel = (LiveFansClubMedalEditPanel) this.f22037f.inflater().inflate(t6c0.f19600M0, (ViewGroup) null);
            C(liveFansClubMedalEditPanel);
            this.f17878i = new byr(this, liveFansClubMedalEditPanel);
        }
        ((LiveFansClubMedalEditPanel) ((bwr) this).viewModel).m6482Y();
        this.f17878i.show();
        this.f17879j = duringCreated(LivingNormalApiProvider.m4640L4(m25547E2().f12141B.f13607b.id, m25547E2().m17234j().anchor.id)).subscribe(ffw.e(new e30() { // from class: l.j9g
            public final void call(Object obj) {
                this.f13648a.m21124T3((BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.k9g
            public final void call(Object obj) {
                this.f14260a.m21125U3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c4 */
    public void m21132c4() {
        final String strN4 = (edg.m12319c() || edg.m12320d()) ? ddv.j : ypv.k().n4();
        if (TextUtils.isEmpty(strN4)) {
            return;
        }
        ((LiveFansClubMedalEditPanel) ((bwr) this).viewModel).f5151g.post(new Runnable() { // from class: l.l9g
            @Override // java.lang.Runnable
            public final void run() {
                this.f14741a.m21126V3(strN4);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: d4 */
    public void m21133d4(String str, String str2, String str3) {
        duringCreated(LivingNormalApiProvider.m4661N7(m25547E2().f12141B.f13607b.id, m25547E2().m17234j().anchor.id, str, str2, str3)).subscribe(ffw.e(new e30() { // from class: l.m9g
            public final void call(Object obj) {
                this.f15290a.m21127W3((roj0) obj);
            }
        }, new e30() { // from class: l.n9g
            public final void call(Object obj) {
                this.f15882a.m21128X3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t */
    public void m21134t() {
        super.t();
        duringCreated((c) m25548F2().FansClubMedalEvent.showDialog().g()).subscribe(ffw.d(new e30() { // from class: l.i9g
            public final void call(Object obj) {
                this.f13118a.m21122Y3((Boolean) obj);
            }
        }));
    }
}
