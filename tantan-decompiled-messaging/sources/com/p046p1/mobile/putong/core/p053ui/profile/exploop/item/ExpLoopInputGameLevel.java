package com.p046p1.mobile.putong.core.p053ui.profile.exploop.item;

import com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem.ExpProfileLoopTextTypeData;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopFragmentFactory;
import com.p046p1.mobile.putong.data.ExtensionGame;
import com.p046p1.mobile.putong.data.Extensions;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p149l.pc8;
import p149l.vwb;

/* JADX INFO: loaded from: classes4.dex */
public class ExpLoopInputGameLevel extends ExpLoopInputType {
    public ExpLoopInputGameLevel() {
        super(16, "你的游戏段位是?", ExpLoopInputType.ICON_GAME_LEVEL, 5);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public boolean checkIfNeed(User user) {
        if (NullChecker.m81303a(user.profile.extensions.game)) {
            return pc8.m168317u0(user.profile.extensions.game.name) || pc8.m168317u0(user.profile.extensions.game.together) || pc8.m168317u0(user.profile.extensions.game.level) || pc8.m168317u0(user.profile.extensions.game.voice);
        }
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public void fillInputContentData(User user, ExpProfileEditLoopBaseFrag expProfileEditLoopBaseFrag) {
        Extensions extensions = user.profile.extensions;
        if (extensions.game == null) {
            extensions.game = ExtensionGame.new_();
        }
        user.profile.extensions.game.nullCheck();
        setData(new ExpProfileLoopTextTypeData((String) pc8.m168316t0(user.profile.extensions.game.level), "").setMaxCount(15));
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public String getPageId() {
        return "p_edit_game_level";
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public String getPageName() {
        return "game_level";
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public boolean hasInfoExist(User user, LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType) {
        return NullChecker.m81303a(user.profile.extensions.game) && pc8.m168317u0(user.profile.extensions.game.level);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public void saveUserInfo(User user) {
        super.saveUserInfo(user);
        ExpProfileLoopTextTypeData textType = getData().getTextType();
        user.profile.extensions.game.level = vwb.m200324f0(textType.text1.trim());
    }
}
