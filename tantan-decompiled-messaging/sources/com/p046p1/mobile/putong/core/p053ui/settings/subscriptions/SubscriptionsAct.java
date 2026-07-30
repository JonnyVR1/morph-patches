package com.p046p1.mobile.putong.core.p053ui.settings.subscriptions;

import com.p046p1.mobile.putong.app.PutongMvpAct;
import p149l.InterfaceC16030c;
import p149l.hzm;
import p149l.w4g0;
import p149l.z4g0;

/* JADX INFO: loaded from: classes9.dex */
public class SubscriptionsAct extends PutongMvpAct<w4g0, z4g0> {
    /* JADX INFO: renamed from: Y1 */
    public final InterfaceC16030c m55681Y1() {
        return new hzm();
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public w4g0 mo28672V1() {
        return new w4g0(this, m55681Y1());
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public z4g0 mo28673X1() {
        return new z4g0(this, m55681Y1());
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_auto_renew_subscriptions_management_view";
    }
}
