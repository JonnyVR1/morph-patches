package com.p000p1.mobile.putong.core.p001ui.likedusers.tablayout;

import android.content.Context;
import android.content.Intent;
import com.p1.mobile.putong.app.PutongMvpAct;
import com.tantanapp.common.utils.NullChecker;
import p007l.ck30;
import p007l.yj30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class NewMyLikedUsersAct extends PutongMvpAct<ck30, yj30> {
    /* JADX INFO: renamed from: Y1 */
    public static Intent m498Y1(Context context) {
        return m499Z1(context, "likedUser");
    }

    /* JADX INFO: renamed from: Z1 */
    public static Intent m499Z1(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) NewMyLikedUsersAct.class);
        intent.putExtra("select_tab", str);
        return intent;
    }

    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public ck30 m500V1() {
        return new ck30(this);
    }

    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public yj30 m501X1() {
        return new yj30(this);
    }

    public boolean disableAutoPV() {
        return true;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (!NullChecker.a(((PutongMvpAct) this).c) || ((ck30) ((PutongMvpAct) this).c).m9198g0(i, i2, intent)) {
            return;
        }
        super/*com.p1.mobile.putong.app.PutongAct*/.onActivityResult(i, i2, intent);
    }
}
