package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.home.bubble.internalpush.LiveInternalPushView;

/* JADX INFO: loaded from: classes11.dex */
public class zys extends aym<LiveInternalPushView> {
    public zys(zxm zxmVar) {
        super(zxmVar);
    }

    @Override // p149l.aym
    /* JADX INFO: renamed from: f */
    public void mo37886f() {
        if (TextUtils.isEmpty(this.f72298a.f205467k.link) || this.f72298a.f205469m == null) {
            return;
        }
        CoreModule.m29936Q().mo67265g6(this.f72298a.f205467k.link);
    }

    @Override // p149l.aym
    /* JADX INFO: renamed from: i */
    public void mo37888i(uys uysVar) {
        if (uysVar.isShowing()) {
            uysVar.dismiss();
        }
    }

    @Override // p149l.aym
    /* JADX INFO: renamed from: k */
    public boolean mo37890k() {
        return true;
    }

    @Override // p149l.aym
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void mo37889j(LiveInternalPushView liveInternalPushView) {
        zxm zxmVar = this.f72298a;
        liveInternalPushView.mo37831b(zxmVar.f205467k, zxmVar.f205465i.getAct());
    }

    @Override // p149l.aym
    /* JADX INFO: renamed from: e */
    public void mo37885e() {
    }

    @Override // p149l.aym
    /* JADX INFO: renamed from: l */
    public void mo37891l() {
    }
}
