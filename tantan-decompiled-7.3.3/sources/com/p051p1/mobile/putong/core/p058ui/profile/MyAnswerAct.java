package com.p051p1.mobile.putong.core.p058ui.profile;

import android.content.Intent;
import android.text.TextUtils;
import com.p051p1.mobile.putong.app.PutongMvpAct;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopEditInfo;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopInputType;
import com.p051p1.mobile.putong.data.Answer;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import p153l.jyb;
import p153l.q220;
import p153l.y220;

/* JADX INFO: loaded from: classes4.dex */
public class MyAnswerAct extends PutongMvpAct<q220, y220> {
    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public q220 mo29671X1() {
        return new q220(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public y220 mo29672Y1() {
        return new y220(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Answer next;
        super.onActivityResult(i, i2, intent);
        if (NullChecker.m82486a(intent)) {
            if (i == LoopInputType.QUESTION_CHOICE.requestCode) {
                User user = (User) intent.getSerializableExtra("loop_edit_user");
                if (NullChecker.m82486a(user)) {
                    ((q220) this.f17891c).f155267a.profile.answers = user.profile.answers;
                }
            } else if (i == LoopInputType.QUESTION_EDIT.requestCode) {
                String stringExtra = intent.getStringExtra("loop_result_key");
                LoopEditInfo loopEditInfo = (LoopEditInfo) intent.getSerializableExtra("loop_create_tag_info");
                if (NullChecker.m82486a(loopEditInfo)) {
                    String str = loopEditInfo.editObjKey;
                    if (!TextUtils.isEmpty(str) && !jyb.m147479J(((q220) this.f17891c).f155267a.profile.answers)) {
                        Iterator<Answer> it = ((q220) this.f17891c).f155267a.profile.answers.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!TextUtils.equals(next.question, str));
                        if (NullChecker.m82486a(next)) {
                            if (jyb.m147481L(stringExtra)) {
                                ((q220) this.f17891c).f155267a.profile.answers.remove(next);
                            } else {
                                next.value = stringExtra;
                            }
                        }
                    }
                }
            }
            ((q220) this.f17891c).m174985m0(true);
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_edit_answer";
    }
}
