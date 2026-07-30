package com.p046p1.mobile.putong.core.p053ui.profile.exploop.item;

import com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem.ExpProfileLoopSelectTypeData;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopFragmentFactory;
import com.p046p1.mobile.putong.data.ExtensionGame;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p149l.e30;
import p149l.pc8;
import p149l.vwb;
import p149l.w9j;

/* JADX INFO: loaded from: classes4.dex */
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
        ArrayList arrayListM200324f0 = vwb.m200324f0(new ExpProfileLoopSelectTypeData.ItemData("王者荣耀"), new ExpProfileLoopSelectTypeData.ItemData("和平精英"), new ExpProfileLoopSelectTypeData.ItemData("蛋仔派对"), new ExpProfileLoopSelectTypeData.ItemData("原神"), new ExpProfileLoopSelectTypeData.ItemData("第五人格"), new ExpProfileLoopSelectTypeData.ItemData("英雄联盟"), new ExpProfileLoopSelectTypeData.ItemData("金铲铲之战"), new ExpProfileLoopSelectTypeData.ItemData("狼人杀"));
        vwb.m200354z(arrayListM200324f0, new e30() { // from class: l.hef
            @Override // p149l.e30
            public final void call(Object obj) {
                ExpProfileLoopSelectTypeData.ItemData itemData = (ExpProfileLoopSelectTypeData.ItemData) obj;
                itemData.boolValue = arrayList.contains(itemData.text);
            }
        });
        return new ArrayList<>(arrayListM200324f0);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public void fillInputContentData(User user, ExpProfileEditLoopBaseFrag expProfileEditLoopBaseFrag) {
        ExpProfileLoopSelectTypeData expProfileLoopSelectTypeData = new ExpProfileLoopSelectTypeData(getGameNameList(user));
        expProfileLoopSelectTypeData.count = 3;
        expProfileLoopSelectTypeData.text = "最多选择3款游戏";
        setData(expProfileLoopSelectTypeData);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public String getPageId() {
        return "p_game_info_game_name";
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public String getPageName() {
        return "game_name";
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public boolean hasInfoExist(User user, LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType) {
        return NullChecker.m81303a(user.profile.extensions.game) && pc8.m168317u0(user.profile.extensions.game.name);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public void saveUserInfo(User user) {
        super.saveUserInfo(user);
        ArrayList arrayListM200339n = vwb.m200339n(getData().getSelectType().list, new w9j() { // from class: l.ief
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((ExpProfileLoopSelectTypeData.ItemData) obj).boolValue);
            }
        });
        user.profile.extensions.game.name = vwb.m200303Q(arrayListM200339n, new w9j() { // from class: l.jef
            @Override // p149l.w9j
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
