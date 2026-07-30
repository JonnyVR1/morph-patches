package com.p046p1.mobile.putong.live.external.page.setting;

import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.live.base.apibean.LivePushNoticeItemBean;
import java.util.List;
import p149l.d1q;
import p149l.oe2;
import p149l.s6c0;
import p149l.vwb;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.external.page.setting.a */
/* JADX INFO: loaded from: classes13.dex */
public class C12580a extends d1q<LiveFollowPushNoticeItemView> {

    /* JADX INFO: renamed from: a */
    public final LivePushNoticeItemBean f46178a;

    /* JADX INFO: renamed from: b */
    public C12581b.a f46179b;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.page.setting.a$a */
    public static class a extends oe2 {

        /* JADX INFO: renamed from: a */
        public final boolean f46180a;

        public a(boolean z) {
            this.f46180a = z;
        }
    }

    public C12580a(LivePushNoticeItemBean livePushNoticeItemBean) {
        this.f46178a = livePushNoticeItemBean;
    }

    /* JADX INFO: renamed from: H */
    public LivePushNoticeItemBean m70755H() {
        return this.f46178a;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo70566u(LiveFollowPushNoticeItemView liveFollowPushNoticeItemView) {
        super.mo70566u(liveFollowPushNoticeItemView);
        C12581b.a aVar = this.f46179b;
        if (aVar != null) {
            liveFollowPushNoticeItemView.m70681q(this, aVar);
        }
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo70759v(LiveFollowPushNoticeItemView liveFollowPushNoticeItemView, @NonNull List<Object> list) {
        super.mo70759v(liveFollowPushNoticeItemView, list);
        if (vwb.m200296J(list)) {
            mo70566u(liveFollowPushNoticeItemView);
            return;
        }
        Object obj = list.get(0);
        if (obj instanceof a) {
            liveFollowPushNoticeItemView.m70682z(((a) obj).f46180a);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m70758K(C12581b c12581b) {
        if (c12581b != null) {
            this.f46179b = c12581b.m70774z2();
        }
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return s6c0.f162771l;
    }
}
