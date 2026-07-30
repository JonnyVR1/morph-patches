package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.edit.MarryEditProfileFrag;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.MarryEditProfileSeriesAct;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.bean.MarrySeriesType;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.p070ui.webview.WebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class nzw extends czw<yzw> {

    /* JADX INFO: renamed from: a */
    public final MarryEditProfileFrag f144476a;

    public nzw(MarryEditProfileFrag marryEditProfileFrag) {
        super(marryEditProfileFrag);
        this.f144476a = marryEditProfileFrag;
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
    }

    /* JADX INFO: renamed from: g0 */
    public void m165400g0(MarrySeriesType marrySeriesType) {
        if (NullChecker.m82486a(this.f144476a.m48596S4()) && NullChecker.m82486a(this.f144476a.m48596S4().mo48616f())) {
            act().startActivityForResult(MarryEditProfileSeriesAct.m48634Y1(act(), this.f144476a.m48596S4().mo48616f(), jyb.m147507f0(marrySeriesType), true), 5001);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public void m165401h0() {
        if (NullChecker.m82486a(this.f144476a.m48596S4())) {
            this.f144476a.m48596S4().mo48614O();
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m165402i0() {
        act().startActivity(WebViewAct.m81347a2(act(), "个人信息收集清单", zwk.m221907g()));
    }

    /* JADX INFO: renamed from: j0 */
    public void m165403j0() {
        act().startActivity(WebViewAct.m81347a2(act(), "第三方信息数据共享", zwk.m221911k()));
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m165404k0(uxj0 uxj0Var) {
        Settings settings = CoreModule.f18264c.f20381e0.m116600p9().settings;
        if (NullChecker.m82486a(this.f144476a.m48596S4()) && NullChecker.m82486a(settings)) {
            this.f144476a.m48596S4().mo48615Q(settings.phoneNumber, settings.linkedPhoneNumber);
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m165405l0() {
        duringCreated(CoreModule.f18264c.f20381e0.m116527W9(CoreModule.m30929H().userId())).subscribe(psd0.m173596G(new y20() { // from class: l.mzw
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f139569a.m165404k0((uxj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m0 */
    public void m165406m0() {
        gta.m132210e().m132214d().mo34715Jo(act(), new x20() { // from class: l.lzw
            @Override // p153l.x20
            public final void call() {
                this.f134281a.m165405l0();
            }
        });
    }

    /* JADX INFO: renamed from: n0 */
    public void m165407n0(List<Media> list) {
        if (NullChecker.m82486a(this.f144476a.m48596S4())) {
            this.f144476a.m48596S4().mo48613M(list);
        }
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
