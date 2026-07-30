package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.p046p1.mobile.putong.app.PutongMvpAct;
import com.tantanapp.common.utils.NullChecker;
import p149l.d9e0;
import p149l.jq2;
import p149l.s7m;
import p149l.vwb;
import p149l.y8e0;

/* JADX INFO: loaded from: classes3.dex */
public class SeeLetterListAct extends PutongMvpAct {
    /* JADX INFO: renamed from: Y1 */
    public static Intent m49002Y1(Context context, int i) {
        Intent intent = new Intent(context, (Class<?>) SeeLetterListAct.class);
        intent.putExtra("letter_count", i);
        return intent;
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: V1 */
    public jq2 mo28672V1() {
        return new d9e0(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: X1 */
    public s7m mo28673X1() {
        return new y8e0(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_letter_receive_list";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        Bundle extras = getIntent().getExtras();
        if (NullChecker.m81303a(extras)) {
            this.pageHelper.m109040p(vwb.m200311Y("greet_message", Integer.valueOf(extras.getInt("letter_count"))));
        }
        super.preCreateView(bundle);
    }
}
