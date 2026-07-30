package com.p051p1.mobile.putong.core.p058ui.intllikedusers;

import android.content.Intent;
import com.p051p1.mobile.putong.app.PutongMvpAct;
import p153l.ctn;
import p153l.nsn;
import p153l.zsn;

/* JADX INFO: loaded from: classes3.dex */
public class IntlLikedUsersAct extends PutongMvpAct<zsn, ctn> {

    /* JADX INFO: renamed from: e */
    public nsn f30689e;

    /* JADX INFO: renamed from: Z1 */
    public nsn m47424Z1() {
        if (this.f30689e == null) {
            this.f30689e = new nsn((zsn) this.f17891c);
        }
        return this.f30689e;
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public zsn mo29671X1() {
        return new zsn(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public ctn mo29672Y1() {
        return new ctn(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean isAnonymousMode() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean needBindBillingService() {
        return true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (((zsn) this.f17891c).m98901I0(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_intl_like_i_sent";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean shouldSwitchToTransparentStatus() {
        return true;
    }
}
