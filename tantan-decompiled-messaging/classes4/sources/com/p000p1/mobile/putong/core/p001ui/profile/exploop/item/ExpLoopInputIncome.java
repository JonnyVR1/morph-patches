package com.p000p1.mobile.putong.core.p001ui.profile.exploop.item;

import android.util.Pair;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileLoopSelectTypeData;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputIncome;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopFragmentFactory;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.base.LoopSelectFillData;
import com.p1.mobile.putong.core.util.FriendPurposeHelper;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserWealth;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.ura;
import l.vwb;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ExpLoopInputIncome extends ExpLoopInputType {
    public ExpLoopInputIncome() {
        super(5, "你的年收入是?", ExpLoopInputType.ICON_INCOME, 1);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ ExpProfileLoopSelectTypeData.ItemData m1907b(LoopSelectFillData loopSelectFillData) {
        return new ExpProfileLoopSelectTypeData.ItemData(loopSelectFillData.m2062b(), loopSelectFillData.m2061a(), loopSelectFillData.m2066f());
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType
    public void fillInputContentData(User user, ExpProfileEditLoopBaseFrag expProfileEditLoopBaseFrag) {
        setData(new ExpProfileLoopSelectTypeData(vwb.Q(FriendPurposeHelper.e(user), new w9j() { // from class: l.vef
            public final Object call(Object obj) {
                return ExpLoopInputIncome.m1907b((LoopSelectFillData) obj);
            }
        })));
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType
    public String getPageId() {
        return "p_edit_income";
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType
    public String getPageName() {
        return "income";
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType
    public boolean hasInfoExist(User user, LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType) {
        if (!NullChecker.a(user.profile.extensions.wealth)) {
            return false;
        }
        UserWealth userWealth = user.profile.extensions.wealth;
        return FriendPurposeHelper.k(userWealth.upperIncome, userWealth.lowIncome);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType
    public void saveUserInfo(User user) {
        super.saveUserInfo(user);
        ExpProfileLoopSelectTypeData.ItemData itemData = (ExpProfileLoopSelectTypeData.ItemData) vwb.r(getData().getSelectType().list, new w9j() { // from class: l.uef
            public final Object call(Object obj) {
                return Boolean.valueOf(((ExpProfileLoopSelectTypeData.ItemData) obj).boolValue);
            }
        });
        if (!NullChecker.a(user.profile.extensions.wealth)) {
            user.profile.extensions.wealth = UserWealth.new_();
        }
        if (itemData != null) {
            Pair pairT8 = ura.e().d().T8(itemData.text);
            UserWealth userWealth = user.profile.extensions.wealth;
            userWealth.lowIncome = (List) pairT8.first;
            userWealth.upperIncome = (List) pairT8.second;
            return;
        }
        user.profile.extensions.wealth.lowIncome = vwb.f0(new String[0]);
        user.profile.extensions.wealth.upperIncome = vwb.f0(new String[0]);
    }
}
