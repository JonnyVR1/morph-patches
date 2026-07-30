package com.p046p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.content.Intent;
import android.view.inputmethod.InputMethodManager;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongMvpAct;
import p149l.bme0;
import p149l.xle0;

/* JADX INFO: loaded from: classes11.dex */
public class SetNicknameAct extends PutongMvpAct<xle0, bme0> {
    /* JADX INFO: renamed from: Y1 */
    public static Intent m41806Y1(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SetNicknameAct.class);
        intent.putExtra("user_id", str);
        return intent;
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public xle0 mo28672V1() {
        return new xle0(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public bme0 mo28673X1() {
        return new bme0(this);
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void lambda$debugItems$19() {
        super.lambda$debugItems$19();
        Act act = act();
        act().getBaseContext();
        ((InputMethodManager) act.getSystemService("input_method")).hideSoftInputFromWindow(((bme0) this.f17173d).m102650f().getWindowToken(), 0);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        ((xle0) this.f17172c).m209878j0(getIntent().getStringExtra("user_id"));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ((xle0) this.f17172c).m209883p0();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_edit_nickname_page";
    }
}
