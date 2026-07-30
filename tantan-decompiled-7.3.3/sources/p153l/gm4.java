package p153l;

import android.view.View;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.ContainerLabelsType;
import com.p051p1.mobile.putong.core.newui.home.livewindow.IntlLiveSmallWindow;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Video;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class gm4 extends AbstractC17382h4 {
    public gm4(rql rqlVar, User user, CoreSuggested.UserInfo userInfo) {
        super(rqlVar, user, userInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m130738l(View view) {
        r130.f160753a.put(Boolean.valueOf(!r130.f160753a.get().booleanValue()));
        m130739m(r130.f160753a.get().booleanValue());
        this.f107715c.setMomentCardSilent(!r130.f160753a.get().booleanValue());
    }

    @Override // p153l.AbstractC17382h4
    /* JADX INFO: renamed from: c */
    public boolean mo116206c() {
        return NullChecker.m82486a(this.f107715c.mo37924q()) && !jyb.m147479J(this.f107715c.mo37924q().media) && (this.f107715c.mo37924q().media.get(0) instanceof Video);
    }

    @Override // p153l.AbstractC17382h4
    /* JADX INFO: renamed from: d */
    public String mo116207d() {
        return ContainerLabelsType.mute_video;
    }

    @Override // p153l.AbstractC17382h4
    /* JADX INFO: renamed from: h */
    public boolean mo116209h() {
        boolean z = false;
        if (this.f107715c.mo37815E() == null) {
            return false;
        }
        IntlLiveSmallWindow intlLiveSmallWindowMo37815E = this.f107715c.mo37815E();
        if (intlLiveSmallWindowMo37815E != null) {
            bnl0.m105524M(intlLiveSmallWindowMo37815E, false);
        }
        bnl0.m105524M(this.f107715c.mo37868Z(), false);
        bnl0.m105524M(this.f107715c.mo37912m0(), false);
        bnl0.m105524M(this.f107715c.mo37936t0(), false);
        if (NullChecker.m82486a(this.f107715c.m182643o())) {
            bnl0.m105524M(this.f107715c.m182643o(), false);
        }
        if (NullChecker.m82486a(this.f107715c.m182644w())) {
            bnl0.m105524M(this.f107715c.m182644w(), false);
        }
        bnl0.m105524M(this.f107715c.mo37918o0(), false);
        bnl0.m105524M(this.f107715c.mo37954z0(), false);
        this.f107715c.mo37897i0();
        if (this.f107715c.mo37924q().media.size() > 0 && (this.f107715c.mo37924q().media.get(0) instanceof Video)) {
            z = true;
        }
        bnl0.m105524M(this.f107715c.mo37951y0(), z);
        m130739m(r130.f160753a.get().booleanValue());
        bnl0.m105509E0(this.f107715c.mo37951y0(), new View.OnClickListener() { // from class: l.fm4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99723a.m130738l(view);
            }
        });
        return z;
    }

    /* JADX INFO: renamed from: m */
    public void m130739m(boolean z) {
        rql rqlVar = this.f107715c;
        if (z) {
            rqlVar.mo37951y0().setImageResource(dbc0.f86056Cf);
        } else {
            rqlVar.mo37951y0().setImageResource(dbc0.f85992Af);
        }
    }

    @Override // p153l.AbstractC17382h4
    /* JADX INFO: renamed from: a */
    public void mo116205a() {
    }
}
