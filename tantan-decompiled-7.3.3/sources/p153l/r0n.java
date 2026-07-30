package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.home.bubble.internalpush.LiveInternalPushView;
import com.p051p1.mobile.putong.data.Live;
import com.p051p1.mobile.putong.live_api.api.serviceprovider.api.IntentParams;

/* JADX INFO: loaded from: classes11.dex */
public class r0n extends q0n {
    public r0n(zzm zzmVar) {
        super(zzmVar);
    }

    @Override // p153l.q0n, p153l.a0n
    /* JADX INFO: renamed from: f */
    public void mo38889f() {
        super.mo38889f();
        CoreModule.m30934Q().mo68457ne();
    }

    @Override // p153l.q0n
    /* JADX INFO: renamed from: m */
    public IntentParams mo174730m(Live live) {
        return new IntentParams.C13217a().m79958c(live).m79964i(this.f67729a.f206718j.source).m79957b(this.f67729a.f206718j.category).m79963h(true).m79956a();
    }

    @Override // p153l.q0n, p153l.a0n
    /* JADX INFO: renamed from: n */
    public void mo38892j(LiveInternalPushView liveInternalPushView) {
        liveInternalPushView.m38876k(this.f67729a.f206719k);
    }
}
