package com.p000p1.mobile.putong.core.p001ui.profile.loop.input;

import android.content.Context;
import android.content.Intent;
import com.p1.mobile.putong.core.PutongCoreMvpAct;
import p002l.bka0;
import p002l.cka0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ProfileLoopQuestionAct extends PutongCoreMvpAct<bka0, cka0> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m2169Z1(Context context) {
        Intent intent = new Intent();
        intent.setClass(context, ProfileLoopQuestionAct.class);
        return intent;
    }

    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public bka0 m2170X1() {
        return new bka0(this);
    }

    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public cka0 m2171Y1() {
        return new cka0(this);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super/*com.p1.mobile.putong.app.PutongAct*/.onActivityResult(i, i2, intent);
        ((bka0) ((PutongCoreMvpAct) this).d).m10413t0(i, i2, intent);
    }

    public String pageId() {
        return "p_my_question_selection";
    }
}
