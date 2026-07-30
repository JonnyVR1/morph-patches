package com.p051p1.mobile.putong.core.p058ui.profile.loop.input;

import android.content.Context;
import android.content.Intent;
import com.p051p1.mobile.putong.core.PutongCoreMvpAct;
import p153l.fsa0;
import p153l.gsa0;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileLoopQuestionAct extends PutongCoreMvpAct<fsa0, gsa0> {
    /* JADX INFO: renamed from: a2 */
    public static Intent m52843a2(Context context) {
        Intent intent = new Intent();
        intent.setClass(context, ProfileLoopQuestionAct.class);
        return intent;
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public fsa0 mo30949Y1() {
        return new fsa0(this);
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public gsa0 mo30950Z1() {
        return new gsa0(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ((fsa0) this.f18283d).m127070t0(i, i2, intent);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_my_question_selection";
    }
}
