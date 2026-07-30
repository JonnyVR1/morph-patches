package com.p051p1.mobile.putong.core.newui.home.bubble.internalpush;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import p153l.a0n;
import p153l.v0t;
import p153l.zzm;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.bubble.internalpush.b */
/* JADX INFO: loaded from: classes11.dex */
public final class C8092b extends a0n<LiveInternalVideoMultiCallFindPeoplePushView> {
    public C8092b(zzm zzmVar) {
        super(zzmVar);
    }

    @Override // p153l.a0n
    /* JADX INFO: renamed from: c */
    public LiveInternalPushBaseView mo38886c(Act act) {
        return new LiveInternalVideoMultiCallFindPeoplePushView(act);
    }

    @Override // p153l.a0n
    /* JADX INFO: renamed from: d */
    public boolean mo38887d() {
        return false;
    }

    @Override // p153l.a0n
    /* JADX INFO: renamed from: e */
    public void mo38888e() {
    }

    @Override // p153l.a0n
    /* JADX INFO: renamed from: f */
    public void mo38889f() {
    }

    @Override // p153l.a0n
    /* JADX INFO: renamed from: h */
    public void mo38890h() {
    }

    @Override // p153l.a0n
    /* JADX INFO: renamed from: k */
    public boolean mo38893k() {
        return !m38896m(this.f67729a.f206717i.getAct());
    }

    @Override // p153l.a0n
    /* JADX INFO: renamed from: l */
    public void mo38894l() {
    }

    /* JADX INFO: renamed from: m */
    public final boolean m38896m(Act act) {
        return (act instanceof NewMainAct) && ((NewMainAct) act).m40830p7() == TabName.Live;
    }

    @Override // p153l.a0n
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo38892j(LiveInternalVideoMultiCallFindPeoplePushView liveInternalVideoMultiCallFindPeoplePushView) {
        zzm zzmVar = this.f67729a;
        liveInternalVideoMultiCallFindPeoplePushView.mo38834b(zzmVar.f206719k, zzmVar.f206717i.getAct());
    }

    @Override // p153l.a0n
    /* JADX INFO: renamed from: i */
    public void mo38891i(v0t v0tVar) {
    }
}
