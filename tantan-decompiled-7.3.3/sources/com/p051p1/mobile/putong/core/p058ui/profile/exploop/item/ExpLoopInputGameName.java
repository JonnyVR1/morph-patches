package com.p051p1.mobile.putong.core.p058ui.profile.exploop.item;

import com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem.ExpProfileLoopSelectTypeData;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopFragmentFactory;
import com.p051p1.mobile.putong.data.ExtensionGame;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p153l.jyb;
import p153l.qcj;
import p153l.td8;
import p153l.y20;

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
        ArrayList arrayListM147507f0 = jyb.m147507f0(new ExpProfileLoopSelectTypeData.ItemData("王者荣耀"), new ExpProfileLoopSelectTypeData.ItemData("和平精英"), new ExpProfileLoopSelectTypeData.ItemData("蛋仔派对"), new ExpProfileLoopSelectTypeData.ItemData("原神"), new ExpProfileLoopSelectTypeData.ItemData("第五人格"), new ExpProfileLoopSelectTypeData.ItemData("英雄联盟"), new ExpProfileLoopSelectTypeData.ItemData("金铲铲之战"), new ExpProfileLoopSelectTypeData.ItemData("狼人杀"));
        jyb.m147537z(arrayListM147507f0, new y20() { // from class: l.nff
            @Override // p153l.y20
            public final void call(Object obj) {
                ExpProfileLoopSelectTypeData.ItemData itemData = (ExpProfileLoopSelectTypeData.ItemData) obj;
                itemData.boolValue = arrayList.contains(itemData.text);
            }
        });
        return new ArrayList<>(arrayListM147507f0);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public void fillInputContentData(User user, ExpProfileEditLoopBaseFrag expProfileEditLoopBaseFrag) {
        ExpProfileLoopSelectTypeData expProfileLoopSelectTypeData = new ExpProfileLoopSelectTypeData(getGameNameList(user));
        expProfileLoopSelectTypeData.count = 3;
        expProfileLoopSelectTypeData.text = "最多选择3款游戏";
        setData(expProfileLoopSelectTypeData);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public String getPageId() {
        return "p_game_info_game_name";
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public String getPageName() {
        return "game_name";
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public boolean hasInfoExist(User user, LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType) {
        return NullChecker.m82486a(user.profile.extensions.game) && td8.m190611u0(user.profile.extensions.game.name);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public void saveUserInfo(User user) {
        super.saveUserInfo(user);
        ArrayList arrayListM147522n = jyb.m147522n(getData().getSelectType().list, new qcj() { // from class: l.off
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((ExpProfileLoopSelectTypeData.ItemData) obj).boolValue);
            }
        });
        user.profile.extensions.game.name = jyb.m147486Q(arrayListM147522n, new qcj() { // from class: l.pff
            @Override // p153l.qcj
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
