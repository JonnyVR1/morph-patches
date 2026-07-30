package com.p046p1.mobile.putong.core.p053ui.profile.exploop.item;

import com.p046p1.mobile.putong.core.data.ProfileLikeCategoryType;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem.ExpProfileLoopSelectTypeData;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputCar;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopFragmentFactory;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.base.LoopSelectFillData;
import com.p046p1.mobile.putong.core.util.FriendPurposeHelper;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserWealth;
import com.tantanapp.common.utils.NullChecker;
import p149l.ura;
import p149l.vwb;
import p149l.w9j;

/* JADX INFO: loaded from: classes4.dex */
public class ExpLoopInputCar extends ExpLoopInputType {
    public ExpLoopInputCar() {
        super(6, "你有车产吗?", ExpLoopInputType.ICON_CAR, 1);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ ExpProfileLoopSelectTypeData.ItemData m51402b(LoopSelectFillData loopSelectFillData) {
        return new ExpProfileLoopSelectTypeData.ItemData(loopSelectFillData.m51576b(), loopSelectFillData.m51575a(), loopSelectFillData.m51580f());
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public void fillInputContentData(User user, ExpProfileEditLoopBaseFrag expProfileEditLoopBaseFrag) {
        setData(new ExpProfileLoopSelectTypeData(vwb.m200303Q(FriendPurposeHelper.m59422a(user), new w9j() { // from class: l.ydf
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ExpLoopInputCar.m51402b((LoopSelectFillData) obj);
            }
        })));
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public String getPageId() {
        return "p_edit_car";
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public String getPageName() {
        return ProfileLikeCategoryType.car;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public boolean hasInfoExist(User user, LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType) {
        UserWealth userWealth = user.profile.extensions.wealth;
        return FriendPurposeHelper.m59430i((userWealth == null || vwb.m200296J(userWealth.car)) ? "" : user.profile.extensions.wealth.car.get(0));
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public void saveUserInfo(User user) {
        super.saveUserInfo(user);
        ExpProfileLoopSelectTypeData.ItemData itemData = (ExpProfileLoopSelectTypeData.ItemData) vwb.m200346r(getData().getSelectType().list, new w9j() { // from class: l.xdf
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((ExpProfileLoopSelectTypeData.ItemData) obj).boolValue);
            }
        });
        if (!NullChecker.m81303a(user.profile.extensions.wealth)) {
            user.profile.extensions.wealth = UserWealth.new_();
        }
        Profile profile = user.profile;
        if (itemData != null) {
            profile.extensions.wealth.car = ura.m195053e().m195057d().mo33825fa(itemData.text);
        } else {
            profile.extensions.wealth.car = vwb.m200324f0(new String[0]);
        }
    }
}
