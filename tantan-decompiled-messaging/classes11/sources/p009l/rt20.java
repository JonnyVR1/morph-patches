package p009l;

import android.view.View;
import com.p000p1.mobile.putong.core.newui.home.justreal.JustRealAvatarRootLayout;
import com.p000p1.mobile.putong.core.newui.home.justreal.JustRealHeadContentLayout;
import com.p000p1.mobile.putong.core.newui.home.justreal.JustRealHeadLayout;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.VText_Default_Bold;
import com.p1.mobile.putong.data.User;
import l.e30;
import l.st20;
import l.vwb;
import l.xdl0;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class rt20 extends AbstractC1100p4 {

    /* JADX INFO: renamed from: a */
    public VImage f19970a;

    /* JADX INFO: renamed from: b */
    public JustRealAvatarRootLayout f19971b;

    /* JADX INFO: renamed from: c */
    public JustRealHeadContentLayout f19972c;

    /* JADX INFO: renamed from: d */
    public VText_Default_Bold f19973d;

    @Override // p009l.AbstractC1100p4
    /* JADX INFO: renamed from: a */
    public JustRealAvatarRootLayout mo14575a() {
        return this.f19971b;
    }

    @Override // p009l.AbstractC1100p4
    /* JADX INFO: renamed from: b */
    public JustRealHeadContentLayout mo20102b() {
        return this.f19972c;
    }

    @Override // p009l.AbstractC1100p4
    /* JADX INFO: renamed from: c */
    public View mo14576c() {
        return this.f19972c;
    }

    @Override // p009l.AbstractC1100p4
    /* JADX INFO: renamed from: d */
    public VText_Default_Bold mo14577d() {
        return this.f19973d;
    }

    @Override // p009l.AbstractC1100p4
    /* JADX INFO: renamed from: e */
    public void mo14578e(JustRealHeadLayout justRealHeadLayout) {
        m21792h(justRealHeadLayout);
        this.f19971b.setRenderUserCall(new e30() { // from class: l.qt20
            public final void call(Object obj) {
                this.f19521a.m21793i((User) obj);
            }
        });
    }

    @Override // p009l.AbstractC1100p4
    /* JADX INFO: renamed from: f */
    public void mo20103f(boolean z) {
        if (z) {
            boolean zJ = vwb.J(CoreModule.c.z2.l3());
            VImage vImage = this.f19970a;
            if (zJ) {
                xdl0.M(vImage, true);
                xdl0.M(this.f19971b, false);
            } else {
                xdl0.M(vImage, false);
                xdl0.M(this.f19971b, true);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m21792h(View view) {
        st20.a(this, view);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m21793i(User user) {
        if (xdl0.O0(this.f19971b)) {
            return;
        }
        xdl0.M(this.f19970a, false);
        xdl0.M(this.f19971b, true);
    }
}
