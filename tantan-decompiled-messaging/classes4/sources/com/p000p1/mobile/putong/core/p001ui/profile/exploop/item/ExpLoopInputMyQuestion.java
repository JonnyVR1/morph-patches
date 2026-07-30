package com.p000p1.mobile.putong.core.p001ui.profile.exploop.item;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileLoopTextTypeData;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopFragmentFactory;
import com.p1.mobile.putong.data.Answer;
import com.p1.mobile.putong.data.User;
import l.vwb;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ExpLoopInputMyQuestion extends ExpLoopInputType {
    public ExpLoopInputMyQuestion() {
        super(20, "选择一个感兴趣的问题", ExpLoopInputType.ICON_MY_QUESTION, ExpLoopInputType.INPUT_CUSTOM_QUESTION);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType
    public void fillInputContentData(User user, ExpProfileEditLoopBaseFrag expProfileEditLoopBaseFrag) {
        if (vwb.J(user.profile.answers)) {
            setData(new ExpProfileLoopTextTypeData("", ""));
        } else {
            Answer answer = (Answer) user.profile.answers.get(0);
            setData(new ExpProfileLoopTextTypeData(answer.question, answer.value));
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType
    public String getPageId() {
        return "p_edit_my_qa";
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType
    public String getPageName() {
        return "my_question";
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType
    public boolean hasInfoExist(User user, LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType) {
        return !vwb.J(user.profile.answers);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType
    public void saveUserInfo(User user) {
        super.saveUserInfo(user);
        ExpProfileLoopTextTypeData textType = getData().getTextType();
        final Answer answerNew_ = Answer.new_();
        answerNew_.question = textType.text1;
        answerNew_.value = textType.text2;
        if (vwb.m(user.profile.answers, new w9j() { // from class: l.wef
            public final Object call(Object obj) {
                Answer answer = answerNew_;
                Answer answer2 = (Answer) obj;
                return Boolean.valueOf(TextUtils.equals(answer2.question, answer.question) && TextUtils.equals(answer2.value, answer.value));
            }
        })) {
            return;
        }
        user.profile.answers.add(answerNew_);
    }
}
