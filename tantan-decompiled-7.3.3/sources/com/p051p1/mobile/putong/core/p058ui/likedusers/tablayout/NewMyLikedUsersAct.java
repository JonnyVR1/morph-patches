package com.p051p1.mobile.putong.core.p058ui.likedusers.tablayout;

import android.content.Context;
import android.content.Intent;
import com.p051p1.mobile.putong.app.PutongMvpAct;
import com.tantanapp.common.utils.NullChecker;
import p153l.ms30;
import p153l.qs30;

/* JADX INFO: loaded from: classes3.dex */
public class NewMyLikedUsersAct extends PutongMvpAct<qs30, ms30> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m48003Z1(Context context) {
        return m48004a2(context, "likedUser");
    }

    /* JADX INFO: renamed from: a2 */
    public static Intent m48004a2(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) NewMyLikedUsersAct.class);
        intent.putExtra("select_tab", str);
        return intent;
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public qs30 mo29671X1() {
        return new qs30(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public ms30 mo29672Y1() {
        return new ms30(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, p153l.e6m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (!NullChecker.m82486a(this.f17891c) || ((qs30) this.f17891c).m177723g0(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }
}
