package com.p046p1.mobile.putong.core.p053ui.profile.exploop.item;

import android.util.Pair;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem.ExpProfileLoopSelectTypeData;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputIncome;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopFragmentFactory;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.base.LoopSelectFillData;
import com.p046p1.mobile.putong.core.util.FriendPurposeHelper;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserWealth;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p149l.ura;
import p149l.vwb;
import p149l.w9j;

/* JADX INFO: loaded from: classes4.dex */
public class ExpLoopInputIncome extends ExpLoopInputType {
    public ExpLoopInputIncome() {
        super(5, "你的年收入是?", ExpLoopInputType.ICON_INCOME, 1);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ ExpProfileLoopSelectTypeData.ItemData m51425b(LoopSelectFillData loopSelectFillData) {
        return new ExpProfileLoopSelectTypeData.ItemData(loopSelectFillData.m51576b(), loopSelectFillData.m51575a(), loopSelectFillData.m51580f());
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public void fillInputContentData(User user, ExpProfileEditLoopBaseFrag expProfileEditLoopBaseFrag) {
        setData(new ExpProfileLoopSelectTypeData(vwb.m200303Q(FriendPurposeHelper.m59426e(user), new w9j() { // from class: l.vef
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ExpLoopInputIncome.m51425b((LoopSelectFillData) obj);
            }
        })));
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public String getPageId() {
        return "p_edit_income";
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public String getPageName() {
        return "income";
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public boolean hasInfoExist(User user, LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType) {
        if (!NullChecker.m81303a(user.profile.extensions.wealth)) {
            return false;
        }
        UserWealth userWealth = user.profile.extensions.wealth;
        return FriendPurposeHelper.m59432k(userWealth.upperIncome, userWealth.lowIncome);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public void saveUserInfo(User user) {
        super.saveUserInfo(user);
        ExpProfileLoopSelectTypeData.ItemData itemData = (ExpProfileLoopSelectTypeData.ItemData) vwb.m200346r(getData().getSelectType().list, new w9j() { // from class: l.uef
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((ExpProfileLoopSelectTypeData.ItemData) obj).boolValue);
            }
        });
        if (!NullChecker.m81303a(user.profile.extensions.wealth)) {
            user.profile.extensions.wealth = UserWealth.new_();
        }
        if (itemData != null) {
            Pair<List<String>, List<String>> pairMo33751T8 = ura.m195053e().m195057d().mo33751T8(itemData.text);
            UserWealth userWealth = user.profile.extensions.wealth;
            userWealth.lowIncome = (List) pairMo33751T8.first;
            userWealth.upperIncome = (List) pairMo33751T8.second;
            return;
        }
        user.profile.extensions.wealth.lowIncome = vwb.m200324f0(new String[0]);
        user.profile.extensions.wealth.upperIncome = vwb.m200324f0(new String[0]);
    }
}
