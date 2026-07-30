package com.p046p1.mobile.putong.core.p053ui.intllikedusers;

import android.content.Intent;
import com.p046p1.mobile.putong.app.PutongMvpAct;
import p149l.crn;
import p149l.nqn;
import p149l.zqn;

/* JADX INFO: loaded from: classes11.dex */
public class IntlLikedUsersAct extends PutongMvpAct<zqn, crn> {

    /* JADX INFO: renamed from: e */
    public nqn f29841e;

    /* JADX INFO: renamed from: Y1 */
    public nqn m46241Y1() {
        if (this.f29841e == null) {
            this.f29841e = new nqn((zqn) this.f17172c);
        }
        return this.f29841e;
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public zqn mo28672V1() {
        return new zqn(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public crn mo28673X1() {
        return new crn(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean isAnonymousMode() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean needBindBillingService() {
        return true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (((zqn) this.f17172c).m184919I0(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_intl_like_i_sent";
    }
}
