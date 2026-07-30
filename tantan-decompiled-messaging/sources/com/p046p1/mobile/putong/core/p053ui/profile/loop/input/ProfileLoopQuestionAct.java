package com.p046p1.mobile.putong.core.p053ui.profile.loop.input;

import android.content.Context;
import android.content.Intent;
import com.p046p1.mobile.putong.core.PutongCoreMvpAct;
import p149l.bka0;
import p149l.cka0;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileLoopQuestionAct extends PutongCoreMvpAct<bka0, cka0> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m51660Z1(Context context) {
        Intent intent = new Intent();
        intent.setClass(context, ProfileLoopQuestionAct.class);
        return intent;
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public bka0 mo29951X1() {
        return new bka0(this);
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public cka0 mo29952Y1() {
        return new cka0(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ((bka0) this.f17564d).m102289t0(i, i2, intent);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_my_question_selection";
    }
}
