package com.p046p1.mobile.putong.live.external.voiceslipcard.activity;

import com.p046p1.mobile.putong.live.base.data.BLiveMemberActivityData;
import p149l.d1q;
import p149l.s6c0;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.external.voiceslipcard.activity.a */
/* JADX INFO: loaded from: classes13.dex */
public class C12595a extends d1q<LiveVoiceActivitiesItemView> {

    /* JADX INFO: renamed from: a */
    public final BLiveMemberActivityData f46442a;

    /* JADX INFO: renamed from: b */
    public final LiveVoiceActivitiesItemView.InterfaceC12594a f46443b;

    /* JADX INFO: renamed from: c */
    public LiveVoiceActivitiesItemView f46444c;

    /* JADX INFO: renamed from: d */
    public boolean f46445d;

    public C12595a(BLiveMemberActivityData bLiveMemberActivityData, boolean z, LiveVoiceActivitiesItemView.InterfaceC12594a interfaceC12594a) {
        this.f46442a = bLiveMemberActivityData;
        this.f46445d = z;
        this.f46443b = interfaceC12594a;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo70999m(LiveVoiceActivitiesItemView liveVoiceActivitiesItemView) {
        super.mo70999m(liveVoiceActivitiesItemView);
        this.f46444c = liveVoiceActivitiesItemView;
        liveVoiceActivitiesItemView.m70985p(this.f46445d);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo70566u(LiveVoiceActivitiesItemView liveVoiceActivitiesItemView) {
        super.mo70566u(liveVoiceActivitiesItemView);
        liveVoiceActivitiesItemView.m70987r(this.f46442a);
        liveVoiceActivitiesItemView.m70989t(this.f46443b, this.f46442a);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo71000w(LiveVoiceActivitiesItemView liveVoiceActivitiesItemView) {
        super.mo71000w(liveVoiceActivitiesItemView);
        liveVoiceActivitiesItemView.m70992w();
    }

    /* JADX INFO: renamed from: K */
    public void m70998K() {
        LiveVoiceActivitiesItemView liveVoiceActivitiesItemView = this.f46444c;
        if (liveVoiceActivitiesItemView != null) {
            liveVoiceActivitiesItemView.m70926f();
        }
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return s6c0.f162696P1;
    }
}
