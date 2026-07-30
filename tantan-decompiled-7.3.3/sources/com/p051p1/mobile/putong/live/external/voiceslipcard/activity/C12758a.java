package com.p051p1.mobile.putong.live.external.voiceslipcard.activity;

import com.p051p1.mobile.putong.live.base.data.BLiveMemberActivityData;
import p153l.d3q;
import p153l.xec0;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.external.voiceslipcard.activity.a */
/* JADX INFO: loaded from: classes9.dex */
public class C12758a extends d3q<LiveVoiceActivitiesItemView> {

    /* JADX INFO: renamed from: a */
    public final BLiveMemberActivityData f47290a;

    /* JADX INFO: renamed from: b */
    public final LiveVoiceActivitiesItemView.InterfaceC12757a f47291b;

    /* JADX INFO: renamed from: c */
    public LiveVoiceActivitiesItemView f47292c;

    /* JADX INFO: renamed from: d */
    public boolean f47293d;

    public C12758a(BLiveMemberActivityData bLiveMemberActivityData, boolean z, LiveVoiceActivitiesItemView.InterfaceC12757a interfaceC12757a) {
        this.f47290a = bLiveMemberActivityData;
        this.f47293d = z;
        this.f47291b = interfaceC12757a;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo72182m(LiveVoiceActivitiesItemView liveVoiceActivitiesItemView) {
        super.mo72182m(liveVoiceActivitiesItemView);
        this.f47292c = liveVoiceActivitiesItemView;
        liveVoiceActivitiesItemView.m72168p(this.f47293d);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo71749u(LiveVoiceActivitiesItemView liveVoiceActivitiesItemView) {
        super.mo71749u(liveVoiceActivitiesItemView);
        liveVoiceActivitiesItemView.m72170r(this.f47290a);
        liveVoiceActivitiesItemView.m72172t(this.f47291b, this.f47290a);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo72183w(LiveVoiceActivitiesItemView liveVoiceActivitiesItemView) {
        super.mo72183w(liveVoiceActivitiesItemView);
        liveVoiceActivitiesItemView.m72175w();
    }

    /* JADX INFO: renamed from: K */
    public void m72181K() {
        LiveVoiceActivitiesItemView liveVoiceActivitiesItemView = this.f47292c;
        if (liveVoiceActivitiesItemView != null) {
            liveVoiceActivitiesItemView.m72109f();
        }
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return xec0.f193810P1;
    }
}
