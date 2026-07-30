package com.p046p1.mobile.putong.core.p053ui.likedusers.tablayout;

import android.content.Context;
import android.content.Intent;
import com.p046p1.mobile.putong.app.PutongMvpAct;
import com.tantanapp.common.utils.NullChecker;
import p149l.ck30;
import p149l.yj30;

/* JADX INFO: loaded from: classes12.dex */
public class NewMyLikedUsersAct extends PutongMvpAct<ck30, yj30> {
    /* JADX INFO: renamed from: Y1 */
    public static Intent m46820Y1(Context context) {
        return m46821Z1(context, "likedUser");
    }

    /* JADX INFO: renamed from: Z1 */
    public static Intent m46821Z1(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) NewMyLikedUsersAct.class);
        intent.putExtra("select_tab", str);
        return intent;
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public ck30 mo28672V1() {
        return new ck30(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public yj30 mo28673X1() {
        return new yj30(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, p149l.n3m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (!NullChecker.m81303a(this.f17172c) || ((ck30) this.f17172c).m107356g0(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }
}
