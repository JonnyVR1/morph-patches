package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.edit.MarryEditProfileFrag;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.MarryEditProfileSeriesAct;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.bean.MarrySeriesType;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.p065ui.webview.WebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class oww extends dww<zww> {

    /* JADX INFO: renamed from: a */
    public final MarryEditProfileFrag f146091a;

    public oww(MarryEditProfileFrag marryEditProfileFrag) {
        super(marryEditProfileFrag);
        this.f146091a = marryEditProfileFrag;
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
    }

    /* JADX INFO: renamed from: g0 */
    public void m166442g0(MarrySeriesType marrySeriesType) {
        if (NullChecker.m81303a(this.f146091a.m47413S4()) && NullChecker.m81303a(this.f146091a.m47413S4().mo47433f())) {
            act().startActivityForResult(MarryEditProfileSeriesAct.m47451X1(act(), this.f146091a.m47413S4().mo47433f(), vwb.m200324f0(marrySeriesType), true), 5001);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public void m166443h0() {
        if (NullChecker.m81303a(this.f146091a.m47413S4())) {
            this.f146091a.m47413S4().mo47431O();
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m166444i0() {
        act().startActivity(WebViewAct.m80164Z1(act(), "个人信息收集清单", juk.m143325g()));
    }

    /* JADX INFO: renamed from: j0 */
    public void m166445j0() {
        act().startActivity(WebViewAct.m80164Z1(act(), "第三方信息数据共享", juk.m143329k()));
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m166446k0(roj0 roj0Var) {
        Settings settings = CoreModule.f17545c.f19639e0.m169527p9().settings;
        if (NullChecker.m81303a(this.f146091a.m47413S4()) && NullChecker.m81303a(settings)) {
            this.f146091a.m47413S4().mo47432Q(settings.phoneNumber, settings.linkedPhoneNumber);
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m166447l0() {
        duringCreated(CoreModule.f17545c.f19639e0.m169454W9(CoreModule.m29931H().userId())).subscribe(mkd0.m154955G(new e30() { // from class: l.nww
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f140985a.m166446k0((roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m0 */
    public void m166448m0() {
        ura.m195053e().m195057d().mo33712Jo(act(), new d30() { // from class: l.mww
            @Override // p149l.d30
            public final void call() {
                this.f136095a.m166447l0();
            }
        });
    }

    /* JADX INFO: renamed from: n0 */
    public void m166449n0(List<Media> list) {
        if (NullChecker.m81303a(this.f146091a.m47413S4())) {
            this.f146091a.m47413S4().mo47430M(list);
        }
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
