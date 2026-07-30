package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.home.bubble.internalpush.LiveInternalPushView;
import com.p046p1.mobile.putong.data.Live;
import com.p046p1.mobile.putong.live_api.api.serviceprovider.api.IntentParams;

/* JADX INFO: loaded from: classes11.dex */
public class rym extends qym {
    public rym(zxm zxmVar) {
        super(zxmVar);
    }

    @Override // p149l.qym, p149l.aym
    /* JADX INFO: renamed from: f */
    public void mo37886f() {
        super.mo37886f();
        CoreModule.m29936Q().mo67274ne();
    }

    @Override // p149l.qym
    /* JADX INFO: renamed from: m */
    public IntentParams mo177043m(Live live) {
        return new IntentParams.C13054a().m78775c(live).m78781i(this.f72298a.f205466j.source).m78774b(this.f72298a.f205466j.category).m78780h(true).m78773a();
    }

    @Override // p149l.qym, p149l.aym
    /* JADX INFO: renamed from: n */
    public void mo37889j(LiveInternalPushView liveInternalPushView) {
        liveInternalPushView.m37873k(this.f72298a.f205467k);
    }
}
