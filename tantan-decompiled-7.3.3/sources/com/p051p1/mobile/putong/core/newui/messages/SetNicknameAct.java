package com.p051p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.content.Intent;
import android.view.inputmethod.InputMethodManager;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongMvpAct;
import p153l.cue0;
import p153l.gue0;

/* JADX INFO: loaded from: classes11.dex */
public class SetNicknameAct extends PutongMvpAct<cue0, gue0> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m42817Z1(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SetNicknameAct.class);
        intent.putExtra("user_id", str);
        return intent;
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public cue0 mo29671X1() {
        return new cue0(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public gue0 mo29672Y1() {
        return new gue0(this);
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void lambda$debugItems$19() {
        super.lambda$debugItems$19();
        Act act = act();
        act().getBaseContext();
        ((InputMethodManager) act.getSystemService("input_method")).hideSoftInputFromWindow(((gue0) this.f17892d).m132287f().getWindowToken(), 0);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        ((cue0) this.f17891c).m112674j0(getIntent().getStringExtra("user_id"));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ((cue0) this.f17891c).m112679p0();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_edit_nickname_page";
    }
}
