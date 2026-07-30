package com.p051p1.mobile.putong.core.p058ui.profile;

import android.view.KeyEvent;
import com.p051p1.mobile.putong.app.PutongMvpAct;
import p153l.ar2;
import p153l.b3f0;
import p153l.iam;
import p153l.p2f0;

/* JADX INFO: loaded from: classes4.dex */
public class ShareProfileAct extends PutongMvpAct {
    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: X1 */
    public ar2 mo29671X1() {
        return new p2f0(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Y1 */
    public iam mo29672Y1() {
        return new b3f0(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_user_profile_share_popup";
    }
}
