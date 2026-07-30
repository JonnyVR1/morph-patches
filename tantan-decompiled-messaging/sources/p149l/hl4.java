package p149l;

import android.view.View;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.ContainerLabelsType;
import com.p046p1.mobile.putong.core.newui.home.livewindow.IntlLiveSmallWindow;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Video;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class hl4 extends AbstractC17222h4 {
    public hl4(gol golVar, User user, CoreSuggested.UserInfo userInfo) {
        super(golVar, user, userInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m131639l(View view) {
        ht20.f109362a.put(Boolean.valueOf(!ht20.f109362a.get().booleanValue()));
        m131640m(ht20.f109362a.get().booleanValue());
        this.f105776c.setMomentCardSilent(!ht20.f109362a.get().booleanValue());
    }

    @Override // p149l.AbstractC17222h4
    /* JADX INFO: renamed from: c */
    public boolean mo116769c() {
        return NullChecker.m81303a(this.f105776c.mo36921q()) && !vwb.m200296J(this.f105776c.mo36921q().media) && (this.f105776c.mo36921q().media.get(0) instanceof Video);
    }

    @Override // p149l.AbstractC17222h4
    /* JADX INFO: renamed from: d */
    public String mo116770d() {
        return ContainerLabelsType.mute_video;
    }

    @Override // p149l.AbstractC17222h4
    /* JADX INFO: renamed from: h */
    public boolean mo116772h() {
        boolean z = false;
        if (this.f105776c.mo36812E() == null) {
            return false;
        }
        IntlLiveSmallWindow intlLiveSmallWindowMo36812E = this.f105776c.mo36812E();
        if (intlLiveSmallWindowMo36812E != null) {
            xdl0.m208344M(intlLiveSmallWindowMo36812E, false);
        }
        xdl0.m208344M(this.f105776c.mo36865Z(), false);
        xdl0.m208344M(this.f105776c.mo36909m0(), false);
        xdl0.m208344M(this.f105776c.mo36933t0(), false);
        if (NullChecker.m81303a(this.f105776c.m127250o())) {
            xdl0.m208344M(this.f105776c.m127250o(), false);
        }
        if (NullChecker.m81303a(this.f105776c.m127251w())) {
            xdl0.m208344M(this.f105776c.m127251w(), false);
        }
        xdl0.m208344M(this.f105776c.mo36915o0(), false);
        xdl0.m208344M(this.f105776c.mo36951z0(), false);
        this.f105776c.mo36894i0();
        if (this.f105776c.mo36921q().media.size() > 0 && (this.f105776c.mo36921q().media.get(0) instanceof Video)) {
            z = true;
        }
        xdl0.m208344M(this.f105776c.mo36948y0(), z);
        m131640m(ht20.f109362a.get().booleanValue());
        xdl0.m208329E0(this.f105776c.mo36948y0(), new View.OnClickListener() { // from class: l.gl4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f103291a.m131639l(view);
            }
        });
        return z;
    }

    /* JADX INFO: renamed from: m */
    public void m131640m(boolean z) {
        gol golVar = this.f105776c;
        if (z) {
            golVar.mo36948y0().setImageResource(x2c0.f189577Ne);
        } else {
            golVar.mo36948y0().setImageResource(x2c0.f189515Le);
        }
    }

    @Override // p149l.AbstractC17222h4
    /* JADX INFO: renamed from: a */
    public void mo116768a() {
    }
}
