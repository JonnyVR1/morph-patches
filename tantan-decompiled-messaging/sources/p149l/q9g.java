package p149l;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveMedalColorTemplate;
import com.p046p1.mobile.putong.live.base.data.BLiveMedalIcon;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.common.fansclub.widget.LiveFansClubMedalEditPanel;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.CommonH5Builder;

/* JADX INFO: loaded from: classes4.dex */
public class q9g extends h4t<ho2, LiveFansClubMedalEditPanel> {

    /* JADX INFO: renamed from: i */
    public byr f153431i;

    /* JADX INFO: renamed from: j */
    public c4g0 f153432j;

    public q9g(bsm bsmVar) {
        super(bsmVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y3 */
    public /* synthetic */ void m173614Y3(Boolean bool) {
        if (bool.booleanValue()) {
            m173623b4();
        } else {
            m173615S3();
        }
    }

    /* JADX INFO: renamed from: S3 */
    public void m173615S3() {
        byr byrVar = this.f153431i;
        if (byrVar != null) {
            byrVar.dismiss();
        }
        mkd0.m154992z(this.f153432j);
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ void m173616T3(BLiveEnvelope bLiveEnvelope) {
        ((LiveFansClubMedalEditPanel) this.viewModel).m72963Z(bLiveEnvelope.data.fanbaseMedalPanel);
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ void m173617U3(Throwable th) {
        ((LiveFansClubMedalEditPanel) this.viewModel).m72964a0();
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m173618V3(String str) {
        m206028F2().OpenH5Event.open().mo172463j(jp50.m142568c(7001).m142598B(str).m142597A(xdl0.m208412y0(), ((LiveFansClubMedalEditPanel) this.viewModel).f49109g.getHeight()).m142599p(CommonH5Builder.BgType.DEFAULT_BG).m142603t(80).m142607x().m142600q());
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m173619W3(roj0 roj0Var) {
        ((LiveFansClubMedalEditPanel) this.viewModel).m72946B("reviewing");
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m173620X3(Throwable th) {
        if ((th instanceof TantanException.Client.CoreService) && ((TantanException.Client.CoreService) th).code == 41800) {
            ((LiveFansClubMedalEditPanel) this.viewModel).m72946B("editable");
            lsi0.m151578h(R$string.f46670F3);
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m173621Z3(int i, int i2, final String str, final String str2) {
        BLiveMedalIcon bLiveMedalIcon;
        BLiveMedalColorTemplate bLiveMedalColorTemplate = (BLiveMedalColorTemplate) vwb.m200346r(zfv.m218617z0(i, null), new w9j() { // from class: l.o9g
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveMedalColorTemplate) obj).name, str));
            }
        });
        if (bLiveMedalColorTemplate == null || (bLiveMedalIcon = (BLiveMedalIcon) vwb.m200346r(bLiveMedalColorTemplate.icons, new w9j() { // from class: l.p9g
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(str2, ((BLiveMedalIcon) obj).name));
            }
        })) == null) {
            return;
        }
        ((LiveFansClubMedalEditPanel) this.viewModel).m72965b0(i2, bLiveMedalColorTemplate.backgroundLargeUrl, bLiveMedalIcon.url);
    }

    /* JADX INFO: renamed from: a4 */
    public void m173622a4(String str, String str2) {
        m173621Z3(1, 1, str, str2);
        m173621Z3(6, 2, str, str2);
        m173621Z3(11, 3, str, str2);
        m173621Z3(16, 4, str, str2);
        m173621Z3(21, 5, str, str2);
        m173621Z3(26, 6, str, str2);
        m173621Z3(30, 7, str, str2);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: b4 */
    public final void m173623b4() {
        if (this.f153431i == null) {
            LiveFansClubMedalEditPanel liveFansClubMedalEditPanel = (LiveFansClubMedalEditPanel) this.f188513f.inflater().inflate(t6c0.f168104M0, (ViewGroup) null);
            mo51532C(liveFansClubMedalEditPanel);
            this.f153431i = new byr(this, liveFansClubMedalEditPanel);
        }
        ((LiveFansClubMedalEditPanel) this.viewModel).m72962Y();
        this.f153431i.show();
        this.f153432j = duringCreated(LivingNormalApiProvider.m71274L4(m206027E2().f108741B.f116469b.f44363id, m206027E2().mo149813j().anchor.f44419id)).subscribe(ffw.m121194e(new e30() { // from class: l.j9g
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f116897a.m173616T3((BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.k9g
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f122009a.m173617U3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c4 */
    public void m173624c4() {
        final String strM195895n4 = (edg.m115798c() || edg.m115799d()) ? ddv.f85660j : ypv.m215672k().m195895n4();
        if (TextUtils.isEmpty(strM195895n4)) {
            return;
        }
        ((LiveFansClubMedalEditPanel) this.viewModel).f49109g.post(new Runnable() { // from class: l.l9g
            @Override // java.lang.Runnable
            public final void run() {
                this.f127106a.m173618V3(strM195895n4);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: d4 */
    public void m173625d4(String str, String str2, String str3) {
        duringCreated(LivingNormalApiProvider.m71295N7(m206027E2().f108741B.f116469b.f44363id, m206027E2().mo149813j().anchor.f44419id, str, str2, str3)).subscribe(ffw.m121194e(new e30() { // from class: l.m9g
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f132774a.m173619W3((roj0) obj);
            }
        }, new e30() { // from class: l.n9g
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f137805a.m173620X3((Throwable) obj);
            }
        }));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().FansClubMedalEvent.showDialog().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.i9g
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f112217a.m173614Y3((Boolean) obj);
            }
        }));
    }
}
