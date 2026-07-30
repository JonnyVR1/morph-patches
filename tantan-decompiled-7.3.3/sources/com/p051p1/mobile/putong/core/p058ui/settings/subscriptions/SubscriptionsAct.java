package com.p051p1.mobile.putong.core.p058ui.settings.subscriptions;

import com.p051p1.mobile.putong.app.PutongMvpAct;
import p153l.InterfaceC16147c;
import p153l.edg0;
import p153l.h1n;
import p153l.hdg0;

/* JADX INFO: loaded from: classes12.dex */
public class SubscriptionsAct extends PutongMvpAct<edg0, hdg0> {
    /* JADX INFO: renamed from: Z1 */
    public final InterfaceC16147c m56864Z1() {
        return new h1n();
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public edg0 mo29671X1() {
        return new edg0(this, m56864Z1());
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public hdg0 mo29672Y1() {
        return new hdg0(this, m56864Z1());
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_auto_renew_subscriptions_management_view";
    }
}
