package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.home.bubble.internalpush.LiveInternalPushView;

/* JADX INFO: loaded from: classes11.dex */
public class a1t extends a0n<LiveInternalPushView> {
    public a1t(zzm zzmVar) {
        super(zzmVar);
    }

    @Override // p153l.a0n
    /* JADX INFO: renamed from: f */
    public void mo38889f() {
        if (TextUtils.isEmpty(this.f67729a.f206719k.link) || this.f67729a.f206721m == null) {
            return;
        }
        CoreModule.m30934Q().mo68448g6(this.f67729a.f206719k.link);
    }

    @Override // p153l.a0n
    /* JADX INFO: renamed from: i */
    public void mo38891i(v0t v0tVar) {
        if (v0tVar.isShowing()) {
            v0tVar.dismiss();
        }
    }

    @Override // p153l.a0n
    /* JADX INFO: renamed from: k */
    public boolean mo38893k() {
        return true;
    }

    @Override // p153l.a0n
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void mo38892j(LiveInternalPushView liveInternalPushView) {
        zzm zzmVar = this.f67729a;
        liveInternalPushView.mo38834b(zzmVar.f206719k, zzmVar.f206717i.getAct());
    }

    @Override // p153l.a0n
    /* JADX INFO: renamed from: e */
    public void mo38888e() {
    }

    @Override // p153l.a0n
    /* JADX INFO: renamed from: l */
    public void mo38894l() {
    }
}
