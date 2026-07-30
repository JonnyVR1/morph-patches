package com.p046p1.mobile.putong.core.p053ui.messages.newpic;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.p046p1.mobile.putong.core.PutongCoreMvpAct;
import com.p046p1.mobile.putong.core.p053ui.notifications.SysnotifListener;
import com.tantanapp.common.utils.NullChecker;
import p149l.dd70;
import p149l.vwb;

/* JADX INFO: loaded from: classes3.dex */
public class PicExchangeEditAct extends PutongCoreMvpAct<PicExchangePresenter, dd70> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m49521Z1(Context context, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) PicExchangeEditAct.class);
        intent.putExtra("ext_uid", str);
        intent.putExtra("ext_from", str2);
        return intent;
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public PicExchangePresenter mo29951X1() {
        return new PicExchangePresenter(this);
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public dd70 mo29952Y1() {
        return new dd70(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void initPageHelper() {
        String str;
        super.initPageHelper();
        String stringExtra = getIntent().getStringExtra("ext_from");
        if (TextUtils.equals(stringExtra, "from_entrance_type")) {
            str = "switch";
        } else {
            str = TextUtils.equals(stringExtra, "from_pic_exchange_reply_type") ? SysnotifListener.ACTION_REPLY : "";
        }
        this.pageHelper.m109040p(vwb.m200311Y("new_photo_type", str));
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (NullChecker.m81303a(intent)) {
            setResult(-1, intent);
            lambda$debugItems$19();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ((dd70) this.f17565e).m110893a();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_newphoto";
    }
}
