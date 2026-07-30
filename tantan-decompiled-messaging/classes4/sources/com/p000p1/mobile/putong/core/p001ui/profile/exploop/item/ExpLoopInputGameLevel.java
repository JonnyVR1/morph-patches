package com.p000p1.mobile.putong.core.p001ui.profile.exploop.item;

import com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileLoopTextTypeData;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopFragmentFactory;
import com.p1.mobile.putong.data.ExtensionGame;
import com.p1.mobile.putong.data.Extensions;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.pc8;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ExpLoopInputGameLevel extends ExpLoopInputType {
    public ExpLoopInputGameLevel() {
        super(16, "你的游戏段位是?", ExpLoopInputType.ICON_GAME_LEVEL, 5);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType
    public boolean checkIfNeed(User user) {
        if (NullChecker.a(user.profile.extensions.game)) {
            return pc8.u0(user.profile.extensions.game.name) || pc8.u0(user.profile.extensions.game.together) || pc8.u0(user.profile.extensions.game.level) || pc8.u0(user.profile.extensions.game.voice);
        }
        return false;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType
    public void fillInputContentData(User user, ExpProfileEditLoopBaseFrag expProfileEditLoopBaseFrag) {
        Extensions extensions = user.profile.extensions;
        if (extensions.game == null) {
            extensions.game = ExtensionGame.new_();
        }
        user.profile.extensions.game.nullCheck();
        setData(new ExpProfileLoopTextTypeData((String) pc8.t0(user.profile.extensions.game.level), "").setMaxCount(15));
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType
    public String getPageId() {
        return "p_edit_game_level";
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType
    public String getPageName() {
        return "game_level";
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType
    public boolean hasInfoExist(User user, LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType) {
        return NullChecker.a(user.profile.extensions.game) && pc8.u0(user.profile.extensions.game.level);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType
    public void saveUserInfo(User user) {
        super.saveUserInfo(user);
        ExpProfileLoopTextTypeData textType = getData().getTextType();
        user.profile.extensions.game.level = vwb.f0(new String[]{textType.text1.trim()});
    }
}
