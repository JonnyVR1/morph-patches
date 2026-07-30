package p009l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.newui.home.bubble.internalpush.LiveInternalPushView;
import com.p1.mobile.putong.core.CoreModule;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class zys extends aym<LiveInternalPushView> {
    public zys(zxm zxmVar) {
        super(zxmVar);
    }

    @Override // p009l.aym
    /* JADX INFO: renamed from: f */
    public void mo1857f() {
        if (TextUtils.isEmpty(this.f9776a.f24025k.link) || this.f9776a.f24027m == null) {
            return;
        }
        CoreModule.Q().m9050g6(this.f9776a.f24025k.link);
    }

    @Override // p009l.aym
    /* JADX INFO: renamed from: i */
    public void mo1859i(uys uysVar) {
        if (uysVar.isShowing()) {
            uysVar.dismiss();
        }
    }

    @Override // p009l.aym
    /* JADX INFO: renamed from: k */
    public boolean mo1861k() {
        return true;
    }

    @Override // p009l.aym
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void mo1860j(LiveInternalPushView liveInternalPushView) {
        zxm zxmVar = this.f9776a;
        liveInternalPushView.mo1802b(zxmVar.f24025k, zxmVar.f24023i.act());
    }

    @Override // p009l.aym
    /* JADX INFO: renamed from: e */
    public void mo1856e() {
    }

    @Override // p009l.aym
    /* JADX INFO: renamed from: l */
    public void mo1862l() {
    }
}
