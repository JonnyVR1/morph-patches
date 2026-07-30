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
public class ExpLoopInputGameVoice extends ExpLoopInputType {
    public ExpLoopInputGameVoice() {
        super(10, "你玩游戏开麦吗?", ExpLoopInputType.ICON_GAME_VOICE, 1);
    }

    private static ArrayList<ExpProfileLoopSelectTypeData.ItemData> getGameVoiceList(User user) {
        final ArrayList arrayList = new ArrayList();
        ExtensionGame extensionGame = user.profile.extensions.game;
        if (extensionGame != null) {
            arrayList.addAll(extensionGame.voice);
        }
        ArrayList arrayListM200324f0 = vwb.m200324f0(new ExpProfileLoopSelectTypeData.ItemData("可以开麦"), new ExpProfileLoopSelectTypeData.ItemData("不开麦"));
        vwb.m200354z(arrayListM200324f0, new e30() { // from class: l.pef
            @Override // p149l.e30
            public final void call(Object obj) {
                ExpProfileLoopSelectTypeData.ItemData itemData = (ExpProfileLoopSelectTypeData.ItemData) obj;
                itemData.boolValue = arrayList.contains(itemData.text);
            }
        });
        return new ArrayList<>(arrayListM200324f0);
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
        setData(new ExpProfileLoopSelectTypeData(getGameVoiceList(user)));
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public String getPageId() {
        return "p_edit_microphone";
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public String getPageName() {
        return "microphone";
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public boolean hasInfoExist(User user, LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType) {
        return NullChecker.m81303a(user.profile.extensions.game) && pc8.m168317u0(user.profile.extensions.game.voice);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public void saveUserInfo(User user) {
        super.saveUserInfo(user);
        ArrayList arrayListM200339n = vwb.m200339n(getData().getSelectType().list, new w9j() { // from class: l.nef
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((ExpProfileLoopSelectTypeData.ItemData) obj).boolValue);
            }
        });
        user.profile.extensions.game.voice = vwb.m200303Q(arrayListM200339n, new w9j() { // from class: l.oef
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((ExpProfileLoopSelectTypeData.ItemData) obj).text;
            }
        });
    }
}
