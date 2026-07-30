package com.p000p1.mobile.putong.core.p001ui.profile;

import android.view.KeyEvent;
import com.p1.mobile.putong.app.PutongMvpAct;
import l.jq2;
import l.s7m;
import p002l.iue0;
import p002l.uue0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ShareProfileAct extends PutongMvpAct {
    /* JADX INFO: renamed from: V1 */
    public jq2 m1214V1() {
        return new iue0(this);
    }

    /* JADX INFO: renamed from: X1 */
    public s7m m1215X1() {
        return new uue0(this);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            return true;
        }
        return super/*androidx.appcompat.app.AppCompatActivity*/.onKeyDown(i, keyEvent);
    }

    public String pageId() {
        return "p_user_profile_share_popup";
    }
}
