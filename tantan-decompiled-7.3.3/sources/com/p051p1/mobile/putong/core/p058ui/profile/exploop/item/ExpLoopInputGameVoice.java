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
        ArrayList arrayListM147507f0 = jyb.m147507f0(new ExpProfileLoopSelectTypeData.ItemData("可以开麦"), new ExpProfileLoopSelectTypeData.ItemData("不开麦"));
        jyb.m147537z(arrayListM147507f0, new y20() { // from class: l.vff
            @Override // p153l.y20
            public final void call(Object obj) {
                ExpProfileLoopSelectTypeData.ItemData itemData = (ExpProfileLoopSelectTypeData.ItemData) obj;
                itemData.boolValue = arrayList.contains(itemData.text);
            }
        });
        return new ArrayList<>(arrayListM147507f0);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public boolean checkIfNeed(User user) {
        if (NullChecker.m82486a(user.profile.extensions.game)) {
            return td8.m190611u0(user.profile.extensions.game.name) || td8.m190611u0(user.profile.extensions.game.together) || td8.m190611u0(user.profile.extensions.game.level) || td8.m190611u0(user.profile.extensions.game.voice);
        }
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public void fillInputContentData(User user, ExpProfileEditLoopBaseFrag expProfileEditLoopBaseFrag) {
        setData(new ExpProfileLoopSelectTypeData(getGameVoiceList(user)));
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public String getPageId() {
        return "p_edit_microphone";
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public String getPageName() {
        return "microphone";
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public boolean hasInfoExist(User user, LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType) {
        return NullChecker.m82486a(user.profile.extensions.game) && td8.m190611u0(user.profile.extensions.game.voice);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public void saveUserInfo(User user) {
        super.saveUserInfo(user);
        ArrayList arrayListM147522n = jyb.m147522n(getData().getSelectType().list, new qcj() { // from class: l.tff
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((ExpProfileLoopSelectTypeData.ItemData) obj).boolValue);
            }
        });
        user.profile.extensions.game.voice = jyb.m147486Q(arrayListM147522n, new qcj() { // from class: l.uff
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((ExpProfileLoopSelectTypeData.ItemData) obj).text;
            }
        });
    }
}
