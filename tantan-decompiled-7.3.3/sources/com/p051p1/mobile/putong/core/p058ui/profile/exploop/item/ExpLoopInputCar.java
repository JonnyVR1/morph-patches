package com.p051p1.mobile.putong.core.p058ui.profile.exploop.item;

import com.p051p1.mobile.putong.core.data.ProfileLikeCategoryType;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem.ExpProfileLoopSelectTypeData;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputCar;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopFragmentFactory;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.base.LoopSelectFillData;
import com.p051p1.mobile.putong.core.util.FriendPurposeHelper;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserWealth;
import com.tantanapp.common.utils.NullChecker;
import p153l.gta;
import p153l.jyb;
import p153l.qcj;

/* JADX INFO: loaded from: classes4.dex */
public class ExpLoopInputCar extends ExpLoopInputType {
    public ExpLoopInputCar() {
        super(6, "你有车产吗?", ExpLoopInputType.ICON_CAR, 1);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ ExpProfileLoopSelectTypeData.ItemData m52585b(LoopSelectFillData loopSelectFillData) {
        return new ExpProfileLoopSelectTypeData.ItemData(loopSelectFillData.m52759b(), loopSelectFillData.m52758a(), loopSelectFillData.m52763f());
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public void fillInputContentData(User user, ExpProfileEditLoopBaseFrag expProfileEditLoopBaseFrag) {
        setData(new ExpProfileLoopSelectTypeData(jyb.m147486Q(FriendPurposeHelper.m60606a(user), new qcj() { // from class: l.eff
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ExpLoopInputCar.m52585b((LoopSelectFillData) obj);
            }
        })));
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public String getPageId() {
        return "p_edit_car";
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public String getPageName() {
        return ProfileLikeCategoryType.car;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public boolean hasInfoExist(User user, LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType) {
        UserWealth userWealth = user.profile.extensions.wealth;
        return FriendPurposeHelper.m60614i((userWealth == null || jyb.m147479J(userWealth.car)) ? "" : user.profile.extensions.wealth.car.get(0));
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public void saveUserInfo(User user) {
        super.saveUserInfo(user);
        ExpProfileLoopSelectTypeData.ItemData itemData = (ExpProfileLoopSelectTypeData.ItemData) jyb.m147529r(getData().getSelectType().list, new qcj() { // from class: l.dff
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((ExpProfileLoopSelectTypeData.ItemData) obj).boolValue);
            }
        });
        if (!NullChecker.m82486a(user.profile.extensions.wealth)) {
            user.profile.extensions.wealth = UserWealth.new_();
        }
        Profile profile = user.profile;
        if (itemData != null) {
            profile.extensions.wealth.car = gta.m132210e().m132214d().mo34828fa(itemData.text);
        } else {
            profile.extensions.wealth.car = jyb.m147507f0(new String[0]);
        }
    }
}
