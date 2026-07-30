package p153l;

import android.view.View;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.home.justreal.JustRealAvatarRootLayout;
import com.p051p1.mobile.putong.core.newui.home.justreal.JustRealHeadContentLayout;
import com.p051p1.mobile.putong.core.newui.home.justreal.JustRealHeadLayout;
import com.p051p1.mobile.putong.core.p058ui.VText_Default_Bold;
import com.p051p1.mobile.putong.data.User;
import p151v.VImage;

/* JADX INFO: loaded from: classes11.dex */
public class b230 extends AbstractC19020o4 {

    /* JADX INFO: renamed from: a */
    public VImage f74472a;

    /* JADX INFO: renamed from: b */
    public JustRealAvatarRootLayout f74473b;

    /* JADX INFO: renamed from: c */
    public JustRealHeadContentLayout f74474c;

    /* JADX INFO: renamed from: d */
    public VText_Default_Bold f74475d;

    @Override // p153l.AbstractC19020o4
    /* JADX INFO: renamed from: a */
    public JustRealAvatarRootLayout mo101613a() {
        return this.f74473b;
    }

    @Override // p153l.AbstractC19020o4
    /* JADX INFO: renamed from: b */
    public JustRealHeadContentLayout mo101614b() {
        return this.f74474c;
    }

    @Override // p153l.AbstractC19020o4
    /* JADX INFO: renamed from: c */
    public View mo101615c() {
        return this.f74474c;
    }

    @Override // p153l.AbstractC19020o4
    /* JADX INFO: renamed from: d */
    public VText_Default_Bold mo101616d() {
        return this.f74475d;
    }

    @Override // p153l.AbstractC19020o4
    /* JADX INFO: renamed from: e */
    public void mo101617e(JustRealHeadLayout justRealHeadLayout) {
        m101619h(justRealHeadLayout);
        this.f74473b.setRenderUserCall(new y20() { // from class: l.a230
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f67931a.m101620i((User) obj);
            }
        });
    }

    @Override // p153l.AbstractC19020o4
    /* JADX INFO: renamed from: f */
    public void mo101618f(boolean z) {
        if (z) {
            boolean zM147479J = jyb.m147479J(CoreModule.f18264c.f20446z2.m31247l3());
            VImage vImage = this.f74472a;
            if (zM147479J) {
                bnl0.m105524M(vImage, true);
                bnl0.m105524M(this.f74473b, false);
            } else {
                bnl0.m105524M(vImage, false);
                bnl0.m105524M(this.f74473b, true);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m101619h(View view) {
        c230.m107673a(this, view);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m101620i(User user) {
        if (bnl0.m105529O0(this.f74473b)) {
            return;
        }
        bnl0.m105524M(this.f74472a, false);
        bnl0.m105524M(this.f74473b, true);
    }
}
