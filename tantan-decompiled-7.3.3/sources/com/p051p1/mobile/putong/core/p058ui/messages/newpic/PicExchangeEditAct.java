package com.p051p1.mobile.putong.core.p058ui.messages.newpic;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.p051p1.mobile.putong.core.PutongCoreMvpAct;
import com.p051p1.mobile.putong.core.p058ui.notifications.SysnotifListener;
import com.tantanapp.common.utils.NullChecker;
import p153l.jl70;
import p153l.jyb;

/* JADX INFO: loaded from: classes4.dex */
public class PicExchangeEditAct extends PutongCoreMvpAct<PicExchangePresenter, jl70> {
    /* JADX INFO: renamed from: a2 */
    public static Intent m50704a2(Context context, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) PicExchangeEditAct.class);
        intent.putExtra("ext_uid", str);
        intent.putExtra("ext_from", str2);
        return intent;
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public PicExchangePresenter mo30949Y1() {
        return new PicExchangePresenter(this);
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public jl70 mo30950Z1() {
        return new jl70(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void initPageHelper() {
        String str;
        super.initPageHelper();
        String stringExtra = getIntent().getStringExtra("ext_from");
        if (TextUtils.equals(stringExtra, "from_entrance_type")) {
            str = "switch";
        } else {
            str = TextUtils.equals(stringExtra, "from_pic_exchange_reply_type") ? SysnotifListener.ACTION_REPLY : "";
        }
        this.pageHelper.m152781p(jyb.m147494Y("new_photo_type", str));
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (NullChecker.m82486a(intent)) {
            setResult(-1, intent);
            lambda$debugItems$19();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ((jl70) this.f18284e).m145949a();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_newphoto";
    }
}
