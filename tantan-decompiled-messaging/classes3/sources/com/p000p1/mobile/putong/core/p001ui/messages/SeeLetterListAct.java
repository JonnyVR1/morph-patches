package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.app.PutongMvpAct;
import com.tantanapp.common.utils.NullChecker;
import l.d9e0;
import l.j760;
import l.jq2;
import l.s7m;
import l.vwb;
import p003l.y8e0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class SeeLetterListAct extends PutongMvpAct {
    /* JADX INFO: renamed from: Y1 */
    public static Intent m2098Y1(Context context, int i) {
        Intent intent = new Intent(context, (Class<?>) SeeLetterListAct.class);
        intent.putExtra("letter_count", i);
        return intent;
    }

    /* JADX INFO: renamed from: V1 */
    public jq2 m2099V1() {
        return new d9e0(this);
    }

    /* JADX INFO: renamed from: X1 */
    public s7m m2100X1() {
        return new y8e0(this);
    }

    public String pageId() {
        return "p_letter_receive_list";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void preCreateView(Bundle bundle) {
        Bundle extras = getIntent().getExtras();
        if (NullChecker.a(extras)) {
            ((PutongAct) this).pageHelper.p(new j760[]{vwb.Y("greet_message", Integer.valueOf(extras.getInt("letter_count")))});
        }
        super/*com.p1.mobile.putong.app.PutongAct*/.preCreateView(bundle);
    }
}
