package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.p051p1.mobile.putong.app.PutongMvpAct;
import com.tantanapp.common.utils.NullChecker;
import p153l.ar2;
import p153l.dhe0;
import p153l.iam;
import p153l.ihe0;
import p153l.jyb;

/* JADX INFO: loaded from: classes3.dex */
public class SeeLetterListAct extends PutongMvpAct {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m50185Z1(Context context, int i) {
        Intent intent = new Intent(context, (Class<?>) SeeLetterListAct.class);
        intent.putExtra("letter_count", i);
        return intent;
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: X1 */
    public ar2 mo29671X1() {
        return new ihe0(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Y1 */
    public iam mo29672Y1() {
        return new dhe0(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_letter_receive_list";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        Bundle extras = getIntent().getExtras();
        if (NullChecker.m82486a(extras)) {
            this.pageHelper.m152781p(jyb.m147494Y("greet_message", Integer.valueOf(extras.getInt("letter_count"))));
        }
        super.preCreateView(bundle);
    }
}
