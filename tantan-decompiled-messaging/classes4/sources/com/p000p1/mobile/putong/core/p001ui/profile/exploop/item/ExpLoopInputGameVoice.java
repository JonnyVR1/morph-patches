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
        ArrayList arrayListF0 = vwb.f0(new ExpProfileLoopSelectTypeData.ItemData[]{new ExpProfileLoopSelectTypeData.ItemData("可以开麦"), new ExpProfileLoopSelectTypeData.ItemData("不开麦")});
        vwb.z(arrayListF0, new e30() { // from class: l.pef
            public final void call(Object obj) {
                ExpProfileLoopSelectTypeData.ItemData itemData = (ExpProfileLoopSelectTypeData.ItemData) obj;
                itemData.boolValue = arrayList.contains(itemData.text);
            }
        });
        return new ArrayList<>(arrayListF0);
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
        setData(new ExpProfileLoopSelectTypeData(getGameVoiceList(user)));
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType
    public String getPageId() {
        return "p_edit_microphone";
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType
    public String getPageName() {
        return "microphone";
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType
    public boolean hasInfoExist(User user, LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType) {
        return NullChecker.a(user.profile.extensions.game) && pc8.u0(user.profile.extensions.game.voice);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType
    public void saveUserInfo(User user) {
        super.saveUserInfo(user);
        ArrayList arrayListN = vwb.n(getData().getSelectType().list, new w9j() { // from class: l.nef
            public final Object call(Object obj) {
                return Boolean.valueOf(((ExpProfileLoopSelectTypeData.ItemData) obj).boolValue);
            }
        });
        user.profile.extensions.game.voice = vwb.Q(arrayListN, new w9j() { // from class: l.oef
            public final Object call(Object obj) {
                return ((ExpProfileLoopSelectTypeData.ItemData) obj).text;
            }
        });
    }
}
