package com.p046p1.mobile.putong.core.p053ui.profile;

import android.content.Intent;
import android.text.TextUtils;
import com.p046p1.mobile.putong.app.PutongMvpAct;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopEditInfo;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopInputType;
import com.p046p1.mobile.putong.data.Answer;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import p149l.iu10;
import p149l.qu10;
import p149l.vwb;

/* JADX INFO: loaded from: classes4.dex */
public class MyAnswerAct extends PutongMvpAct<iu10, qu10> {
    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Y1, reason: merged with bridge method [inline-methods] */
    public iu10 mo28672V1() {
        return new iu10(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public qu10 mo28673X1() {
        return new qu10(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Answer next;
        super.onActivityResult(i, i2, intent);
        if (NullChecker.m81303a(intent)) {
            if (i == LoopInputType.QUESTION_CHOICE.requestCode) {
                User user = (User) intent.getSerializableExtra("loop_edit_user");
                if (NullChecker.m81303a(user)) {
                    ((iu10) this.f17172c).f114964a.profile.answers = user.profile.answers;
                }
            } else if (i == LoopInputType.QUESTION_EDIT.requestCode) {
                String stringExtra = intent.getStringExtra("loop_result_key");
                LoopEditInfo loopEditInfo = (LoopEditInfo) intent.getSerializableExtra("loop_create_tag_info");
                if (NullChecker.m81303a(loopEditInfo)) {
                    String str = loopEditInfo.editObjKey;
                    if (!TextUtils.isEmpty(str) && !vwb.m200296J(((iu10) this.f17172c).f114964a.profile.answers)) {
                        Iterator<Answer> it = ((iu10) this.f17172c).f114964a.profile.answers.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!TextUtils.equals(next.question, str));
                        if (NullChecker.m81303a(next)) {
                            if (vwb.m200298L(stringExtra)) {
                                ((iu10) this.f17172c).f114964a.profile.answers.remove(next);
                            } else {
                                next.value = stringExtra;
                            }
                        }
                    }
                }
            }
            ((iu10) this.f17172c).m138349m0(true);
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_edit_answer";
    }
}
