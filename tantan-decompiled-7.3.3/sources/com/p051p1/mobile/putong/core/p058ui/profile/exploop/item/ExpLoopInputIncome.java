package com.p051p1.mobile.putong.core.p058ui.profile.exploop.item;

import android.util.Pair;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem.ExpProfileLoopSelectTypeData;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputIncome;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopFragmentFactory;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.base.LoopSelectFillData;
import com.p051p1.mobile.putong.core.util.FriendPurposeHelper;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserWealth;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p153l.gta;
import p153l.jyb;
import p153l.qcj;

/* JADX INFO: loaded from: classes4.dex */
public class ExpLoopInputIncome extends ExpLoopInputType {
    public ExpLoopInputIncome() {
        super(5, "你的年收入是?", ExpLoopInputType.ICON_INCOME, 1);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ ExpProfileLoopSelectTypeData.ItemData m52608b(LoopSelectFillData loopSelectFillData) {
        return new ExpProfileLoopSelectTypeData.ItemData(loopSelectFillData.m52759b(), loopSelectFillData.m52758a(), loopSelectFillData.m52763f());
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public void fillInputContentData(User user, ExpProfileEditLoopBaseFrag expProfileEditLoopBaseFrag) {
        setData(new ExpProfileLoopSelectTypeData(jyb.m147486Q(FriendPurposeHelper.m60610e(user), new qcj() { // from class: l.bgf
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ExpLoopInputIncome.m52608b((LoopSelectFillData) obj);
            }
        })));
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public String getPageId() {
        return "p_edit_income";
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public String getPageName() {
        return "income";
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public boolean hasInfoExist(User user, LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType) {
        if (!NullChecker.m82486a(user.profile.extensions.wealth)) {
            return false;
        }
        UserWealth userWealth = user.profile.extensions.wealth;
        return FriendPurposeHelper.m60616k(userWealth.upperIncome, userWealth.lowIncome);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public void saveUserInfo(User user) {
        super.saveUserInfo(user);
        ExpProfileLoopSelectTypeData.ItemData itemData = (ExpProfileLoopSelectTypeData.ItemData) jyb.m147529r(getData().getSelectType().list, new qcj() { // from class: l.agf
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((ExpProfileLoopSelectTypeData.ItemData) obj).boolValue);
            }
        });
        if (!NullChecker.m82486a(user.profile.extensions.wealth)) {
            user.profile.extensions.wealth = UserWealth.new_();
        }
        if (itemData != null) {
            Pair<List<String>, List<String>> pairMo34754T8 = gta.m132210e().m132214d().mo34754T8(itemData.text);
            UserWealth userWealth = user.profile.extensions.wealth;
            userWealth.lowIncome = (List) pairMo34754T8.first;
            userWealth.upperIncome = (List) pairMo34754T8.second;
            return;
        }
        user.profile.extensions.wealth.lowIncome = jyb.m147507f0(new String[0]);
        user.profile.extensions.wealth.upperIncome = jyb.m147507f0(new String[0]);
    }
}
