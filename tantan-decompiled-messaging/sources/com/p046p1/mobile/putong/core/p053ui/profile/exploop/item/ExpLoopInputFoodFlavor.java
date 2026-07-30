package com.p046p1.mobile.putong.core.p053ui.profile.exploop.item;

import com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem.ExpProfileLoopSelectTypeData;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopFragmentFactory;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p149l.vwb;
import p149l.w9j;

/* JADX INFO: loaded from: classes4.dex */
public class ExpLoopInputFoodFlavor extends ExpLoopInputType {
    public ExpLoopInputFoodFlavor() {
        super(26, "你的风味喜好是？", ExpLoopInputType.ICON_FOOD_FLAVOR, 2);
    }

    private ArrayList<ExpProfileLoopSelectTypeData.ItemData> getGrowthFoodTags(User user) {
        List arrayList = user.profile.extensions.interest.taste;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        return vwb.m200324f0(new ExpProfileLoopSelectTypeData.ItemData("boldFlavorLover", "重口味爱好者", arrayList.contains("boldFlavorLover")), new ExpProfileLoopSelectTypeData.ItemData("mildFlavorFan", "清淡饮食", arrayList.contains("mildFlavorFan")), new ExpProfileLoopSelectTypeData.ItemData("exoticFlavorLover", "异域风情品鉴家", arrayList.contains("exoticFlavorLover")), new ExpProfileLoopSelectTypeData.ItemData("chineseFoodLover", "中华料理狂热者", arrayList.contains("chineseFoodLover")), new ExpProfileLoopSelectTypeData.ItemData("meatLover", "肉食主义", arrayList.contains("meatLover")), new ExpProfileLoopSelectTypeData.ItemData("vegetarian", "素食主义", arrayList.contains("vegetarian")));
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public void fillInputContentData(User user, ExpProfileEditLoopBaseFrag expProfileEditLoopBaseFrag) {
        setData(new ExpProfileLoopSelectTypeData(getGrowthFoodTags(user)));
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public String getPageId() {
        return "p_edit_flavor_preference";
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public String getPageName() {
        return "growth_taste";
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public boolean hasInfoExist(User user, LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType) {
        return NullChecker.m81303a(user.profile) && NullChecker.m81303a(user.profile.extensions) && NullChecker.m81303a(user.profile.extensions.interest) && !vwb.m200296J(user.profile.extensions.interest.taste);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public void saveUserInfo(User user) {
        super.saveUserInfo(user);
        ArrayList arrayListM200339n = vwb.m200339n(getData().getSelectType().list, new w9j() { // from class: l.def
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((ExpProfileLoopSelectTypeData.ItemData) obj).boolValue);
            }
        });
        user.profile.extensions.interest.taste = vwb.m200303Q(arrayListM200339n, new w9j() { // from class: l.eef
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((ExpProfileLoopSelectTypeData.ItemData) obj).key;
            }
        });
    }
}
