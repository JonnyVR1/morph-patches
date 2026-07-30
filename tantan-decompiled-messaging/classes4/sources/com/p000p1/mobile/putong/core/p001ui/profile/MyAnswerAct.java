package com.p000p1.mobile.putong.core.p001ui.profile;

import android.content.Intent;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopEditInfo;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopInputType;
import com.p1.mobile.putong.app.PutongMvpAct;
import com.p1.mobile.putong.data.Answer;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import l.vwb;
import p002l.iu10;
import p002l.qu10;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class MyAnswerAct extends PutongMvpAct<iu10, qu10> {
    /* JADX INFO: renamed from: Y1, reason: merged with bridge method [inline-methods] */
    public iu10 m1154V1() {
        return new iu10(this);
    }

    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public qu10 m1155X1() {
        return new qu10(this);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Answer answer;
        super/*com.p1.mobile.putong.app.PutongAct*/.onActivityResult(i, i2, intent);
        if (NullChecker.a(intent)) {
            if (i == LoopInputType.QUESTION_CHOICE.requestCode) {
                User serializableExtra = intent.getSerializableExtra("loop_edit_user");
                if (NullChecker.a(serializableExtra)) {
                    ((iu10) ((PutongMvpAct) this).c).f13409a.profile.answers = serializableExtra.profile.answers;
                }
            } else if (i == LoopInputType.QUESTION_EDIT.requestCode) {
                String stringExtra = intent.getStringExtra("loop_result_key");
                LoopEditInfo loopEditInfo = (LoopEditInfo) intent.getSerializableExtra("loop_create_tag_info");
                if (NullChecker.a(loopEditInfo)) {
                    String str = loopEditInfo.editObjKey;
                    if (!TextUtils.isEmpty(str) && !vwb.J(((iu10) ((PutongMvpAct) this).c).f13409a.profile.answers)) {
                        Iterator it = ((iu10) ((PutongMvpAct) this).c).f13409a.profile.answers.iterator();
                        do {
                            if (!it.hasNext()) {
                                answer = null;
                                break;
                            }
                            answer = (Answer) it.next();
                        } while (!TextUtils.equals(answer.question, str));
                        if (NullChecker.a(answer)) {
                            if (vwb.L(stringExtra)) {
                                ((iu10) ((PutongMvpAct) this).c).f13409a.profile.answers.remove(answer);
                            } else {
                                answer.value = stringExtra;
                            }
                        }
                    }
                }
            }
            ((iu10) ((PutongMvpAct) this).c).m15394m0(true);
        }
    }

    public String pageId() {
        return "p_edit_answer";
    }
}
