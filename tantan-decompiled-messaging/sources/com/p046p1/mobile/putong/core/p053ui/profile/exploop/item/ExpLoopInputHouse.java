package com.p046p1.mobile.putong.core.p053ui.profile.exploop.item;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.HometownChinaItem;
import com.p046p1.mobile.putong.core.data.ProfileLikeCategoryType;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem.ExpProfileLoopWheelTypeData;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem.ExpProfileLoopWheelTypeFrag;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopFragmentFactory;
import com.p046p1.mobile.putong.core.util.FriendPurposeHelper;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserWealth;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p149l.g30;
import p149l.vwb;

/* JADX INFO: loaded from: classes4.dex */
public class ExpLoopInputHouse extends ExpLoopInputType {
    String haveHouseStr;
    String noHouseStr;
    String notRevealStr;
    private ArrayList<String> regionList;

    public ExpLoopInputHouse() {
        super(11, "你有房产吗?", ExpLoopInputType.ICON_HOUSE, 3);
        this.haveHouseStr = CoreModule.f17544b.getString(R$string.f17603B6);
        this.noHouseStr = CoreModule.f17544b.getString(R$string.f17796Hj);
        this.notRevealStr = CoreModule.f17544b.getString(R$string.f17676Dj);
        this.regionList = new ArrayList<>();
    }

    private List<String> getSubRegionList(String str) {
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, "-") && NullChecker.m81303a(LoopFragmentFactory.m51500u())) {
            for (HometownChinaItem hometownChinaItem : LoopFragmentFactory.m51500u().china) {
                if (TextUtils.equals(hometownChinaItem.region, str) && !vwb.m200296J(hometownChinaItem.subRegion)) {
                    return hometownChinaItem.subRegion;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fillInputContentData$0(User user, ExpProfileLoopWheelTypeData expProfileLoopWheelTypeData, ExpProfileEditLoopBaseFrag expProfileEditLoopBaseFrag, Integer num, String str, Integer num2) {
        if (num.intValue() == 1) {
            setWheelData2AndData3(user, expProfileLoopWheelTypeData, str);
            ((ExpProfileLoopWheelTypeFrag) expProfileEditLoopBaseFrag).m51398c5();
        } else if (num.intValue() == 2) {
            setWheelData3(user, expProfileLoopWheelTypeData, str);
            ((ExpProfileLoopWheelTypeFrag) expProfileEditLoopBaseFrag).m51398c5();
        }
    }

    private void setWheelData3(User user, ExpProfileLoopWheelTypeData expProfileLoopWheelTypeData, String str) {
        List<String> subRegionList = getSubRegionList(str);
        if (vwb.m200296J(subRegionList)) {
            expProfileLoopWheelTypeData.selectItem3 = "-";
            expProfileLoopWheelTypeData.wheelData3 = vwb.m200324f0("-");
            return;
        }
        expProfileLoopWheelTypeData.wheelData3 = subRegionList;
        List<String> list = user.profile.extensions.wealth.houseSubRegion;
        if (vwb.m200296J(list) || TextUtils.isEmpty(list.get(0))) {
            expProfileLoopWheelTypeData.selectItem3 = subRegionList.get(0);
        } else {
            expProfileLoopWheelTypeData.selectItem3 = list.get(0);
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public void fillInputContentData(final User user, final ExpProfileEditLoopBaseFrag expProfileEditLoopBaseFrag) {
        this.regionList.clear();
        if (NullChecker.m81303a(LoopFragmentFactory.m51500u())) {
            Iterator<HometownChinaItem> it = LoopFragmentFactory.m51500u().china.iterator();
            while (it.hasNext()) {
                this.regionList.add(it.next().region);
            }
        }
        final ExpProfileLoopWheelTypeData expProfileLoopWheelTypeData = new ExpProfileLoopWheelTypeData();
        expProfileLoopWheelTypeData.fillWithEmpty(3, "-");
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.haveHouseStr);
        arrayList.add(this.noHouseStr);
        arrayList.add(this.notRevealStr);
        List<String> list = user.profile.extensions.wealth.house;
        expProfileLoopWheelTypeData.wheelData1 = arrayList;
        if (vwb.m200296J(list) || TextUtils.isEmpty(list.get(0))) {
            expProfileLoopWheelTypeData.selectItem1 = this.noHouseStr;
            setWheelData2AndData3(user, expProfileLoopWheelTypeData, null);
        } else {
            String str = list.get(0);
            expProfileLoopWheelTypeData.selectItem1 = str;
            setWheelData2AndData3(user, expProfileLoopWheelTypeData, str);
        }
        setData(expProfileLoopWheelTypeData);
        if (expProfileEditLoopBaseFrag instanceof ExpProfileLoopWheelTypeFrag) {
            ((ExpProfileLoopWheelTypeFrag) expProfileEditLoopBaseFrag).m51400e5(new g30() { // from class: l.tef
                @Override // p149l.g30
                /* JADX INFO: renamed from: a */
                public final void mo36055a(Object obj, Object obj2, Object obj3) {
                    this.f169835a.lambda$fillInputContentData$0(user, expProfileLoopWheelTypeData, expProfileEditLoopBaseFrag, (Integer) obj, (String) obj2, (Integer) obj3);
                }
            });
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public String getPageId() {
        return "p_edit_house";
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public String getPageName() {
        return ProfileLikeCategoryType.house;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public boolean hasInfoExist(User user, LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType) {
        return FriendPurposeHelper.m59431j((!NullChecker.m81303a(user.profile.extensions.wealth) || vwb.m200296J(user.profile.extensions.wealth.house)) ? "" : user.profile.extensions.wealth.house.get(0));
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public boolean hasWheelDataChanged(User user) {
        boolean zEquals;
        UserWealth userWealth = user.profile.extensions.wealth;
        List<String> list = userWealth.house;
        List<String> list2 = userWealth.houseRegion;
        List<String> list3 = userWealth.houseSubRegion;
        ExpProfileLoopWheelTypeData wheelType = getData().getWheelType();
        if (vwb.m200296J(list) || TextUtils.isEmpty(list.get(0)) || !TextUtils.equals(list.get(0), wheelType.selectItem1)) {
            return true;
        }
        if (vwb.m200296J(list2) || TextUtils.isEmpty(list2.get(0)) || !list2.get(0).equals(wheelType.selectItem2)) {
            zEquals = TextUtils.equals("-", wheelType.selectItem2);
        } else {
            zEquals = (vwb.m200296J(list3) || TextUtils.isEmpty(list3.get(0))) ? TextUtils.equals("-", wheelType.selectItem3) : TextUtils.equals(list3.get(0), wheelType.selectItem3);
        }
        return !zEquals;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public void saveUserInfo(User user) {
        super.saveUserInfo(user);
        ExpProfileLoopWheelTypeData wheelType = getData().getWheelType();
        String str = wheelType.selectItem1;
        String str2 = wheelType.selectItem2;
        String str3 = wheelType.selectItem3;
        String str4 = "";
        if (TextUtils.equals(str2, "-")) {
            str2 = "";
        }
        if (TextUtils.equals(str3, "-")) {
            str3 = "";
        }
        if (TextUtils.equals(this.noHouseStr, str) || TextUtils.equals(this.notRevealStr, str)) {
            str3 = "";
        } else {
            str4 = str2;
        }
        user.profile.extensions.wealth.house = vwb.m200324f0(str);
        user.profile.extensions.wealth.houseRegion = vwb.m200324f0(str4);
        user.profile.extensions.wealth.houseSubRegion = vwb.m200324f0(str3);
    }

    public void setWheelData2AndData3(User user, ExpProfileLoopWheelTypeData expProfileLoopWheelTypeData, String str) {
        if (!TextUtils.equals(str, this.haveHouseStr)) {
            expProfileLoopWheelTypeData.selectItem2 = "-";
            expProfileLoopWheelTypeData.wheelData2 = vwb.m200324f0("-");
            setWheelData3(user, expProfileLoopWheelTypeData, expProfileLoopWheelTypeData.selectItem2);
        } else {
            if (vwb.m200296J(this.regionList)) {
                return;
            }
            expProfileLoopWheelTypeData.wheelData2 = this.regionList;
            List<String> list = user.profile.extensions.wealth.houseRegion;
            if (vwb.m200296J(list) || TextUtils.isEmpty(list.get(0))) {
                expProfileLoopWheelTypeData.selectItem2 = this.regionList.get(0);
            } else {
                expProfileLoopWheelTypeData.selectItem2 = list.get(0);
            }
            setWheelData3(user, expProfileLoopWheelTypeData, expProfileLoopWheelTypeData.selectItem2);
        }
    }
}
