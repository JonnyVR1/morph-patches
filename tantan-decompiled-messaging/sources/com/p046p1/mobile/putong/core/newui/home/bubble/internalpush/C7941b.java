package com.p046p1.mobile.putong.core.newui.home.bubble.internalpush;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import p149l.aym;
import p149l.uys;
import p149l.zxm;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.bubble.internalpush.b */
/* JADX INFO: loaded from: classes11.dex */
public final class C7941b extends aym<LiveInternalVideoMultiCallFindPeoplePushView> {
    public C7941b(zxm zxmVar) {
        super(zxmVar);
    }

    @Override // p149l.aym
    /* JADX INFO: renamed from: c */
    public LiveInternalPushBaseView mo37883c(Act act) {
        return new LiveInternalVideoMultiCallFindPeoplePushView(act);
    }

    @Override // p149l.aym
    /* JADX INFO: renamed from: d */
    public boolean mo37884d() {
        return false;
    }

    @Override // p149l.aym
    /* JADX INFO: renamed from: e */
    public void mo37885e() {
    }

    @Override // p149l.aym
    /* JADX INFO: renamed from: f */
    public void mo37886f() {
    }

    @Override // p149l.aym
    /* JADX INFO: renamed from: h */
    public void mo37887h() {
    }

    @Override // p149l.aym
    /* JADX INFO: renamed from: k */
    public boolean mo37890k() {
        return !m37893m(this.f72298a.f205465i.getAct());
    }

    @Override // p149l.aym
    /* JADX INFO: renamed from: l */
    public void mo37891l() {
    }

    /* JADX INFO: renamed from: m */
    public final boolean m37893m(Act act) {
        return (act instanceof NewMainAct) && ((NewMainAct) act).m39820j7() == TabName.Live;
    }

    @Override // p149l.aym
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo37889j(LiveInternalVideoMultiCallFindPeoplePushView liveInternalVideoMultiCallFindPeoplePushView) {
        zxm zxmVar = this.f72298a;
        liveInternalVideoMultiCallFindPeoplePushView.mo37831b(zxmVar.f205467k, zxmVar.f205465i.getAct());
    }

    @Override // p149l.aym
    /* JADX INFO: renamed from: i */
    public void mo37888i(uys uysVar) {
    }
}
