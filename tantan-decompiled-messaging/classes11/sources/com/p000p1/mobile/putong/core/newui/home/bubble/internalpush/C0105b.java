package com.p000p1.mobile.putong.core.newui.home.bubble.internalpush;

import com.p000p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView;
import com.p000p1.mobile.putong.core.newui.main.NewMainAct;
import com.p000p1.mobile.putong.newui.main.base.TabName;
import com.p1.mobile.android.app.Act;
import p009l.aym;
import p009l.uys;
import p009l.zxm;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.bubble.internalpush.b */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public final class C0105b extends aym<LiveInternalVideoMultiCallFindPeoplePushView> {
    public C0105b(zxm zxmVar) {
        super(zxmVar);
    }

    @Override // p009l.aym
    /* JADX INFO: renamed from: c */
    public LiveInternalPushBaseView mo1854c(Act act) {
        return new LiveInternalVideoMultiCallFindPeoplePushView(act);
    }

    @Override // p009l.aym
    /* JADX INFO: renamed from: d */
    public boolean mo1855d() {
        return false;
    }

    @Override // p009l.aym
    /* JADX INFO: renamed from: e */
    public void mo1856e() {
    }

    @Override // p009l.aym
    /* JADX INFO: renamed from: f */
    public void mo1857f() {
    }

    @Override // p009l.aym
    /* JADX INFO: renamed from: h */
    public void mo1858h() {
    }

    @Override // p009l.aym
    /* JADX INFO: renamed from: k */
    public boolean mo1861k() {
        return !m1864m(this.f9776a.f24023i.act());
    }

    @Override // p009l.aym
    /* JADX INFO: renamed from: l */
    public void mo1862l() {
    }

    /* JADX INFO: renamed from: m */
    public final boolean m1864m(Act act) {
        return (act instanceof NewMainAct) && ((NewMainAct) act).m3896j7() == TabName.Live;
    }

    @Override // p009l.aym
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo1860j(LiveInternalVideoMultiCallFindPeoplePushView liveInternalVideoMultiCallFindPeoplePushView) {
        zxm zxmVar = this.f9776a;
        liveInternalVideoMultiCallFindPeoplePushView.mo1802b(zxmVar.f24025k, zxmVar.f24023i.act());
    }

    @Override // p009l.aym
    /* JADX INFO: renamed from: i */
    public void mo1859i(uys uysVar) {
    }
}
