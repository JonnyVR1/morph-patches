package com.p046p1.mobile.putong.core.p053ui.profile.exploop.item;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem.ExpProfileLoopTextTypeData;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopFragmentFactory;
import com.p046p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes4.dex */
public class ExpLoopInputHangouts extends ExpLoopInputType {
    public ExpLoopInputHangouts() {
        super(23, "你最常去的地点是?", ExpLoopInputType.ICON_HANGOUTS, 4);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public void fillInputContentData(User user, ExpProfileEditLoopBaseFrag expProfileEditLoopBaseFrag) {
        setData(new ExpProfileLoopTextTypeData(user.profile.hangouts, "填写你常去的地点...").setMaxCount(100));
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public String getPageId() {
        return "p_edit_hangouts_view";
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public String getPageName() {
        return "";
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public boolean hasInfoExist(User user, LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType) {
        return !TextUtils.isEmpty(user.profile.hangouts);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public void saveUserInfo(User user) {
        super.saveUserInfo(user);
        ExpProfileLoopTextTypeData textType = getData().getTextType();
        user.profile.hangouts = textType.text1;
    }
}
