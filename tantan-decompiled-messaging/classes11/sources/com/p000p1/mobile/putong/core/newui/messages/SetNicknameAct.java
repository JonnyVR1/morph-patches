package com.p000p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.content.Intent;
import android.view.inputmethod.InputMethodManager;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongMvpAct;
import p009l.bme0;
import p009l.xle0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class SetNicknameAct extends PutongMvpAct<xle0, bme0> {
    /* JADX INFO: renamed from: Y1 */
    public static Intent m5930Y1(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SetNicknameAct.class);
        intent.putExtra("user_id", str);
        return intent;
    }

    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public xle0 m5931V1() {
        return new xle0(this);
    }

    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public bme0 m5932X1() {
        return new bme0(this);
    }

    public void finish() {
        super/*com.p1.mobile.android.app.Act*/.finish();
        Act act = act();
        act().getBaseContext();
        ((InputMethodManager) act.getSystemService("input_method")).hideSoftInputFromWindow(((bme0) ((PutongMvpAct) this).d).m12135f().getWindowToken(), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initDataOnCreate() {
        super.initDataOnCreate();
        ((xle0) ((PutongMvpAct) this).c).m24936j0(getIntent().getStringExtra("user_id"));
    }

    public void onBackPressed() {
        ((xle0) ((PutongMvpAct) this).c).m24941p0();
    }

    public String pageId() {
        return "p_edit_nickname_page";
    }
}
