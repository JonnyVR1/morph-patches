package com.p051p1.mobile.putong.core.p058ui.profile.exploop.item;

import com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopFragmentFactory;
import com.p051p1.mobile.putong.data.User;
import p153l.jyb;

/* JADX INFO: loaded from: classes4.dex */
public class ExpLoopInputPet extends ExpLoopInputType {
    public ExpLoopInputPet() {
        super(21, "你有宠物吗?", ExpLoopInputType.ICON_PET, 1021);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public void fillInputContentData(User user, ExpProfileEditLoopBaseFrag expProfileEditLoopBaseFrag) {
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public String getPageId() {
        return "p_edit_pet";
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public String getPageName() {
        return "pet";
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public boolean hasInfoExist(User user, LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType) {
        return (jyb.m147479J(user.profile.extensions.wealth.pet) || "暂不透露".equals(user.profile.extensions.wealth.pet.get(0))) ? false : true;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public void saveUserInfo(User user) {
        super.saveUserInfo(user);
    }
}
