package com.p051p1.mobile.putong.live.external.page.setting;

import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.live.base.apibean.LivePushNoticeItemBean;
import java.util.List;
import p153l.d3q;
import p153l.jyb;
import p153l.we2;
import p153l.xec0;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.external.page.setting.a */
/* JADX INFO: loaded from: classes9.dex */
public class C12743a extends d3q<LiveFollowPushNoticeItemView> {

    /* JADX INFO: renamed from: a */
    public final LivePushNoticeItemBean f47026a;

    /* JADX INFO: renamed from: b */
    public C12744b.a f47027b;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.page.setting.a$a */
    public static class a extends we2 {

        /* JADX INFO: renamed from: a */
        public final boolean f47028a;

        public a(boolean z) {
            this.f47028a = z;
        }
    }

    public C12743a(LivePushNoticeItemBean livePushNoticeItemBean) {
        this.f47026a = livePushNoticeItemBean;
    }

    /* JADX INFO: renamed from: H */
    public LivePushNoticeItemBean m71938H() {
        return this.f47026a;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo71749u(LiveFollowPushNoticeItemView liveFollowPushNoticeItemView) {
        super.mo71749u(liveFollowPushNoticeItemView);
        C12744b.a aVar = this.f47027b;
        if (aVar != null) {
            liveFollowPushNoticeItemView.m71864q(this, aVar);
        }
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo71942v(LiveFollowPushNoticeItemView liveFollowPushNoticeItemView, @NonNull List<Object> list) {
        super.mo71942v(liveFollowPushNoticeItemView, list);
        if (jyb.m147479J(list)) {
            mo71749u(liveFollowPushNoticeItemView);
            return;
        }
        Object obj = list.get(0);
        if (obj instanceof a) {
            liveFollowPushNoticeItemView.m71865z(((a) obj).f47028a);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m71941K(C12744b c12744b) {
        if (c12744b != null) {
            this.f47027b = c12744b.m71957z2();
        }
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return xec0.f193885l;
    }
}
