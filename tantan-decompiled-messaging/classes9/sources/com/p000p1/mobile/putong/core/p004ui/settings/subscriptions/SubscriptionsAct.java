package com.p000p1.mobile.putong.core.p004ui.settings.subscriptions;

import com.p000p1.mobile.putong.app.PutongMvpAct;
import p006l.InterfaceC0584c;
import p006l.hzm;
import p006l.w4g0;
import p006l.z4g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class SubscriptionsAct extends PutongMvpAct<w4g0, z4g0> {
    /* JADX INFO: renamed from: Y1 */
    public final InterfaceC0584c m9078Y1() {
        return new hzm();
    }

    @Override // com.p000p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public w4g0 mo571V1() {
        return new w4g0(this, m9078Y1());
    }

    @Override // com.p000p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public z4g0 mo572X1() {
        return new z4g0(this, m9078Y1());
    }

    @Override // com.p000p1.mobile.putong.app.PutongMvpAct, com.p000p1.mobile.putong.app.PutongAct
    public void initSubscription() {
        super.initSubscription();
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public String pageId() {
        return "p_auto_renew_subscriptions_management_view";
    }
}
