package com.p000p1.mobile.putong.core.p001ui.messages.newpic;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.PutongCoreMvpAct;
import com.tantanapp.common.utils.NullChecker;
import l.j760;
import l.vwb;
import p003l.dd70;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class PicExchangeEditAct extends PutongCoreMvpAct<PicExchangePresenter, dd70> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m2668Z1(Context context, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) PicExchangeEditAct.class);
        intent.putExtra("ext_uid", str);
        intent.putExtra("ext_from", str2);
        return intent;
    }

    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public PicExchangePresenter m2669X1() {
        return new PicExchangePresenter(this);
    }

    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public dd70 m2670Y1() {
        return new dd70(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initPageHelper() {
        String str;
        super/*com.p1.mobile.putong.app.PutongAct*/.initPageHelper();
        String stringExtra = getIntent().getStringExtra("ext_from");
        if (TextUtils.equals(stringExtra, "from_entrance_type")) {
            str = "switch";
        } else {
            str = TextUtils.equals(stringExtra, "from_pic_exchange_reply_type") ? "reply" : "";
        }
        ((PutongAct) this).pageHelper.p(new j760[]{vwb.Y("new_photo_type", str)});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onActivityResult(int i, int i2, Intent intent) {
        super/*com.p1.mobile.putong.app.PutongAct*/.onActivityResult(i, i2, intent);
        if (NullChecker.a(intent)) {
            setResult(-1, intent);
            finish();
        }
    }

    public void onBackPressed() {
        ((dd70) ((PutongCoreMvpAct) this).e).m3526a();
    }

    public String pageId() {
        return "p_newphoto";
    }
}
