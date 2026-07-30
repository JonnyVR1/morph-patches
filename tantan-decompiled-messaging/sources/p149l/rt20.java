package p149l;

import android.view.View;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.home.justreal.JustRealAvatarRootLayout;
import com.p046p1.mobile.putong.core.newui.home.justreal.JustRealHeadContentLayout;
import com.p046p1.mobile.putong.core.newui.home.justreal.JustRealHeadLayout;
import com.p046p1.mobile.putong.core.p053ui.VText_Default_Bold;
import com.p046p1.mobile.putong.data.User;
import p147v.VImage;

/* JADX INFO: loaded from: classes11.dex */
public class rt20 extends AbstractC19126p4 {

    /* JADX INFO: renamed from: a */
    public VImage f160938a;

    /* JADX INFO: renamed from: b */
    public JustRealAvatarRootLayout f160939b;

    /* JADX INFO: renamed from: c */
    public JustRealHeadContentLayout f160940c;

    /* JADX INFO: renamed from: d */
    public VText_Default_Bold f160941d;

    @Override // p149l.AbstractC19126p4
    /* JADX INFO: renamed from: a */
    public JustRealAvatarRootLayout mo122890a() {
        return this.f160939b;
    }

    @Override // p149l.AbstractC19126p4
    /* JADX INFO: renamed from: b */
    public JustRealHeadContentLayout mo167332b() {
        return this.f160940c;
    }

    @Override // p149l.AbstractC19126p4
    /* JADX INFO: renamed from: c */
    public View mo122891c() {
        return this.f160940c;
    }

    @Override // p149l.AbstractC19126p4
    /* JADX INFO: renamed from: d */
    public VText_Default_Bold mo122892d() {
        return this.f160941d;
    }

    @Override // p149l.AbstractC19126p4
    /* JADX INFO: renamed from: e */
    public void mo122893e(JustRealHeadLayout justRealHeadLayout) {
        m180776h(justRealHeadLayout);
        this.f160939b.setRenderUserCall(new e30() { // from class: l.qt20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f156292a.m180777i((User) obj);
            }
        });
    }

    @Override // p149l.AbstractC19126p4
    /* JADX INFO: renamed from: f */
    public void mo167333f(boolean z) {
        if (z) {
            boolean zM200296J = vwb.m200296J(CoreModule.f17545c.f19704z2.m30249l3());
            VImage vImage = this.f160938a;
            if (zM200296J) {
                xdl0.m208344M(vImage, true);
                xdl0.m208344M(this.f160939b, false);
            } else {
                xdl0.m208344M(vImage, false);
                xdl0.m208344M(this.f160939b, true);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m180776h(View view) {
        st20.m185846a(this, view);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m180777i(User user) {
        if (xdl0.m208349O0(this.f160939b)) {
            return;
        }
        xdl0.m208344M(this.f160938a, false);
        xdl0.m208344M(this.f160939b, true);
    }
}
