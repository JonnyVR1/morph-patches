package p003l;

import com.p000p1.mobile.putong.core.p001ui.marry.profile.edit.MarryEditProfileFrag;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.MarryEditProfileSeriesAct;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.bean.MarrySeriesType;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.ui.webview.WebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.juk;
import l.mkd0;
import l.roj0;
import l.ura;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class oww extends dww<zww> {

    /* JADX INFO: renamed from: a */
    public final MarryEditProfileFrag f6278a;

    public oww(MarryEditProfileFrag marryEditProfileFrag) {
        super(marryEditProfileFrag);
        this.f6278a = marryEditProfileFrag;
    }

    /* JADX INFO: renamed from: Z */
    public void m6768Z() {
        super.Z();
    }

    /* JADX INFO: renamed from: g0 */
    public void m6769g0(MarrySeriesType marrySeriesType) {
        if (NullChecker.a(this.f6278a.m456S4()) && NullChecker.a(this.f6278a.m456S4().mo478f())) {
            act().startActivityForResult(MarryEditProfileSeriesAct.m498X1(act(), this.f6278a.m456S4().mo478f(), vwb.f0(new MarrySeriesType[]{marrySeriesType}), true), 5001);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public void m6770h0() {
        if (NullChecker.a(this.f6278a.m456S4())) {
            this.f6278a.m456S4().mo474O();
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m6771i0() {
        act().startActivity(WebViewAct.Z1(act(), "个人信息收集清单", juk.g()));
    }

    /* JADX INFO: renamed from: j0 */
    public void m6772j0() {
        act().startActivity(WebViewAct.Z1(act(), "第三方信息数据共享", juk.k()));
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m6773k0(roj0 roj0Var) {
        Settings settings = CoreModule.c.e0.p9().settings;
        if (NullChecker.a(this.f6278a.m456S4()) && NullChecker.a(settings)) {
            this.f6278a.m456S4().mo475Q(settings.phoneNumber, settings.linkedPhoneNumber);
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m6774l0() {
        duringCreated(CoreModule.c.e0.W9(CoreModule.H().userId())).subscribe((m250) mkd0.G(new e30() { // from class: l.nww
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f5994a.m6773k0((roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m0 */
    public void m6775m0() {
        ura.e().d().Jo(act(), new d30() { // from class: l.mww
            @Override // p003l.d30
            public final void call() {
                this.f5791a.m6774l0();
            }
        });
    }

    /* JADX INFO: renamed from: n0 */
    public void m6776n0(List<Media> list) {
        if (NullChecker.a(this.f6278a.m456S4())) {
            this.f6278a.m456S4().mo473M(list);
        }
    }

    public void destroy() {
    }
}
