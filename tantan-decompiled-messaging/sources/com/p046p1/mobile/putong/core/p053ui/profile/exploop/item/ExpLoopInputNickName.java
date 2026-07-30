package com.p046p1.mobile.putong.core.p053ui.profile.exploop.item;

import com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem.ExpProfileLoopTextTypeData;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopFragmentFactory;
import com.p046p1.mobile.putong.data.User;
import p149l.vwb;

/* JADX INFO: loaded from: classes4.dex */
public class ExpLoopInputNickName extends ExpLoopInputType {
    public ExpLoopInputNickName() {
        super(17, "该如何称呼你?", ExpLoopInputType.ICON_NICKNAME, 5);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public void fillInputContentData(User user, ExpProfileEditLoopBaseFrag expProfileEditLoopBaseFrag) {
        setData(new ExpProfileLoopTextTypeData(user.name, "添加昵称").setMaxCount(50).setErrorTips("昵称不能为空"));
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public String getPageId() {
        return "p_edit_nickname";
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public String getPageName() {
        return "nickname";
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public boolean hasInfoExist(User user, LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType) {
        return true;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public void saveUserInfo(User user) {
        super.saveUserInfo(user);
        user.name = vwb.m200333k(getData().getTextType().text1.trim());
    }
}
