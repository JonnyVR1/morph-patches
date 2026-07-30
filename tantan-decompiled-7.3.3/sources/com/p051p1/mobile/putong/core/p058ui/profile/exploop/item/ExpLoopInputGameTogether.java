package com.p051p1.mobile.putong.core.p058ui.profile.exploop.item;

import com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem.ExpProfileLoopSelectTypeData;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopFragmentFactory;
import com.p051p1.mobile.putong.data.ExtensionGame;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p153l.jyb;
import p153l.qcj;
import p153l.td8;
import p153l.y20;

/* JADX INFO: loaded from: classes4.dex */
public class ExpLoopInputGameTogether extends ExpLoopInputType {
    public String selectInfoUserId;

    public ExpLoopInputGameTogether() {
        super(9, "你想找人一起?", ExpLoopInputType.ICON_GAME_TOGETHER, 2);
        this.selectInfoUserId = "";
    }

    private static ArrayList<ExpProfileLoopSelectTypeData.ItemData> getGameTogetherRenderList(User user) {
        ExtensionGame extensionGame = user.profile.extensions.game;
        final List arrayList = extensionGame == null ? new ArrayList() : extensionGame.together;
        ArrayList arrayListM147507f0 = jyb.m147507f0(new ExpProfileLoopSelectTypeData.ItemData("组队"), new ExpProfileLoopSelectTypeData.ItemData("cpdd"), new ExpProfileLoopSelectTypeData.ItemData("求大佬"), new ExpProfileLoopSelectTypeData.ItemData("找战队"), new ExpProfileLoopSelectTypeData.ItemData("其他"));
        jyb.m147537z(arrayListM147507f0, new y20() { // from class: l.sff
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
        setData(new ExpProfileLoopSelectTypeData(getGameTogetherRenderList(user)));
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public String getPageId() {
        return "p_edit_game_intention";
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public String getPageName() {
        return "game_intention";
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public boolean hasInfoExist(User user, LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType) {
        return NullChecker.m82486a(user.profile.extensions.game) && td8.m190611u0(user.profile.extensions.game.together);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public void saveUserInfo(User user) {
        super.saveUserInfo(user);
        ArrayList arrayListM147522n = jyb.m147522n(getData().getSelectType().list, new qcj() { // from class: l.qff
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((ExpProfileLoopSelectTypeData.ItemData) obj).boolValue);
            }
        });
        user.profile.extensions.game.together = jyb.m147486Q(arrayListM147522n, new qcj() { // from class: l.rff
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((ExpProfileLoopSelectTypeData.ItemData) obj).text;
            }
        });
    }

    public ExpLoopInputGameTogether setSelectInfoUserId(String str) {
        this.selectInfoUserId = str;
        return this;
    }
}
