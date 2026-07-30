package p009l;

import android.view.View;
import com.p000p1.mobile.putong.core.newui.home.livewindow.IntlLiveSmallWindow;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.Video;
import com.tantanapp.common.utils.NullChecker;
import l.vwb;
import l.x2c0;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class hl4 extends AbstractC0925h4 {
    public hl4(gol golVar, User user, CoreSuggested.UserInfo userInfo) {
        super(golVar, user, userInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m15873l(View view) {
        ht20.f14244a.put(Boolean.valueOf(!((Boolean) ht20.f14244a.get()).booleanValue()));
        m15874m(((Boolean) ht20.f14244a.get()).booleanValue());
        this.f13856c.setMomentCardSilent(!((Boolean) ht20.f14244a.get()).booleanValue());
    }

    @Override // p009l.AbstractC0925h4
    /* JADX INFO: renamed from: c */
    public boolean mo13954c() {
        return NullChecker.a(this.f13856c.mo887q()) && !vwb.J(this.f13856c.mo887q().media) && (this.f13856c.mo887q().media.get(0) instanceof Video);
    }

    @Override // p009l.AbstractC0925h4
    /* JADX INFO: renamed from: d */
    public String mo13955d() {
        return "mute_video";
    }

    @Override // p009l.AbstractC0925h4
    /* JADX INFO: renamed from: h */
    public boolean mo13957h() {
        boolean z = false;
        if (this.f13856c.mo768E() == null) {
            return false;
        }
        IntlLiveSmallWindow intlLiveSmallWindowMo768E = this.f13856c.mo768E();
        if (intlLiveSmallWindowMo768E != null) {
            xdl0.M(intlLiveSmallWindowMo768E, false);
        }
        xdl0.M(this.f13856c.mo826Z(), false);
        xdl0.M(this.f13856c.mo873m0(), false);
        xdl0.M(this.f13856c.mo899t0(), false);
        if (NullChecker.a(this.f13856c.m15117o())) {
            xdl0.M(this.f13856c.m15117o(), false);
        }
        if (NullChecker.a(this.f13856c.m15118w())) {
            xdl0.M(this.f13856c.m15118w(), false);
        }
        xdl0.M(this.f13856c.mo880o0(), false);
        xdl0.M(this.f13856c.mo918z0(), false);
        this.f13856c.mo857i0();
        if (this.f13856c.mo887q().media.size() > 0 && (this.f13856c.mo887q().media.get(0) instanceof Video)) {
            z = true;
        }
        xdl0.M(this.f13856c.mo915y0(), z);
        m15874m(((Boolean) ht20.f14244a.get()).booleanValue());
        xdl0.E0(this.f13856c.mo915y0(), new View.OnClickListener() { // from class: l.gl4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13639a.m15873l(view);
            }
        });
        return z;
    }

    /* JADX INFO: renamed from: m */
    public void m15874m(boolean z) {
        gol golVar = this.f13856c;
        if (z) {
            golVar.mo915y0().setImageResource(x2c0.Ne);
        } else {
            golVar.mo915y0().setImageResource(x2c0.Le);
        }
    }

    @Override // p009l.AbstractC0925h4
    /* JADX INFO: renamed from: a */
    public void mo13953a() {
    }
}
