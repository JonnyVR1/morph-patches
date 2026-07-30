package com.p000p1.mobile.putong.core.p002ui.intllikedusers;

import android.content.Intent;
import com.p1.mobile.putong.app.PutongMvpAct;
import p009l.crn;
import p009l.nqn;
import p009l.zqn;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class IntlLikedUsersAct extends PutongMvpAct<zqn, crn> {

    /* JADX INFO: renamed from: e */
    public nqn f6792e;

    /* JADX INFO: renamed from: Y1 */
    public nqn m8329Y1() {
        if (this.f6792e == null) {
            this.f6792e = new nqn((zqn) ((PutongMvpAct) this).c);
        }
        return this.f6792e;
    }

    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public zqn m8327V1() {
        return new zqn(this);
    }

    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public crn m8328X1() {
        return new crn(this);
    }

    public boolean isAnonymousMode() {
        return false;
    }

    public boolean needBindBillingService() {
        return true;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (((zqn) ((PutongMvpAct) this).c).m22276I0(i, i2, intent)) {
            return;
        }
        super/*com.p1.mobile.putong.app.PutongAct*/.onActivityResult(i, i2, intent);
    }

    public String pageId() {
        return "p_intl_like_i_sent";
    }
}
