package com.p046p1.mobile.putong.core.p053ui.profile;

import android.view.KeyEvent;
import com.p046p1.mobile.putong.app.PutongMvpAct;
import p149l.iue0;
import p149l.jq2;
import p149l.s7m;
import p149l.uue0;

/* JADX INFO: loaded from: classes4.dex */
public class ShareProfileAct extends PutongMvpAct {
    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: V1 */
    public jq2 mo28672V1() {
        return new iue0(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: X1 */
    public s7m mo28673X1() {
        return new uue0(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_user_profile_share_popup";
    }
}
