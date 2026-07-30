package p009l;

import com.p000p1.mobile.putong.core.newui.home.bubble.internalpush.LiveInternalPushView;
import com.p000p1.mobile.putong.live_api.api.serviceprovider.api.IntentParams;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.Live;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class rym extends qym {
    public rym(zxm zxmVar) {
        super(zxmVar);
    }

    @Override // p009l.qym, p009l.aym
    /* JADX INFO: renamed from: f */
    public void mo1857f() {
        super.mo1857f();
        CoreModule.Q().m9059ne();
    }

    @Override // p009l.qym
    /* JADX INFO: renamed from: m */
    public IntentParams mo21346m(Live live) {
        return new IntentParams.C0456a().m8991c(live).m8997i(this.f9776a.f24024j.source).m8990b(this.f9776a.f24024j.category).m8996h(true).m8989a();
    }

    @Override // p009l.qym, p009l.aym
    /* JADX INFO: renamed from: n */
    public void mo1860j(LiveInternalPushView liveInternalPushView) {
        liveInternalPushView.m1844k(this.f9776a.f24025k);
    }
}
