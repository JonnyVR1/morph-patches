package com.p000p1.mobile.putong.core.p001ui.profile.exploop.item;

import com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileLoopSelectTypeData;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopFragmentFactory;
import com.p1.mobile.putong.data.ExtensionGame;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.e30;
import l.pc8;
import l.vwb;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ExpLoopInputGameName extends ExpLoopInputType {
    public String selectInfoUserId;

    public ExpLoopInputGameName() {
        super(8, "你常玩的游戏是?", ExpLoopInputType.ICON_GAME_NAME, 2);
        this.selectInfoUserId = "";
    }

    private static ArrayList<ExpProfileLoopSelectTypeData.ItemData> getGameNameList(User user) {
        final ArrayList arrayList = new ArrayList();
        ExtensionGame extensionGame = user.profile.extensions.game;
        if (extensionGame != null) {
            arrayList.addAll(extensionGame.name);
        }
        ArrayList arrayListF0 = vwb.f0(new ExpProfileLoopSelectTypeData.ItemData[]{new ExpProfileLoopSelectTypeData.ItemData("王者荣耀"), new ExpProfileLoopSelectTypeData.ItemData("和平精英"), new ExpProfileLoopSelectTypeData.ItemData("蛋仔派对"), new ExpProfileLoopSelectTypeData.ItemData("原神"), new ExpProfileLoopSelectTypeData.ItemData("第五人格"), new ExpProfileLoopSelectTypeData.ItemData("英雄联盟"), new ExpProfileLoopSelectTypeData.ItemData("金铲铲之战"), new ExpProfileLoopSelectTypeData.ItemData("狼人杀")});
        vwb.z(arrayListF0, new e30() { // from class: l.hef
            public final void call(Object obj) {
                ExpProfileLoopSelectTypeData.ItemData itemData = (ExpProfileLoopSelectTypeData.ItemData) obj;
                itemData.boolValue = arrayList.contains(itemData.text);
            }
        });
        return new ArrayList<>(arrayListF0);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType
    public void fillInputContentData(User user, ExpProfileEditLoopBaseFrag expProfileEditLoopBaseFrag) {
        ExpProfileLoopSelectTypeData expProfileLoopSelectTypeData = new ExpProfileLoopSelectTypeData(getGameNameList(user));
        expProfileLoopSelectTypeData.count = 3;
        expProfileLoopSelectTypeData.text = "最多选择3款游戏";
        setData(expProfileLoopSelectTypeData);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType
    public String getPageId() {
        return "p_game_info_game_name";
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType
    public String getPageName() {
        return "game_name";
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType
    public boolean hasInfoExist(User user, LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType) {
        return NullChecker.a(user.profile.extensions.game) && pc8.u0(user.profile.extensions.game.name);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType
    public void saveUserInfo(User user) {
        super.saveUserInfo(user);
        ArrayList arrayListN = vwb.n(getData().getSelectType().list, new w9j() { // from class: l.ief
            public final Object call(Object obj) {
                return Boolean.valueOf(((ExpProfileLoopSelectTypeData.ItemData) obj).boolValue);
            }
        });
        user.profile.extensions.game.name = vwb.Q(arrayListN, new w9j() { // from class: l.jef
            public final Object call(Object obj) {
                return ((ExpProfileLoopSelectTypeData.ItemData) obj).text;
            }
        });
    }

    public ExpLoopInputGameName setSelectInfoUserId(String str) {
        this.selectInfoUserId = str;
        return this;
    }
}
