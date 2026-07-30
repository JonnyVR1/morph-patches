package com.p000p1.mobile.putong.core.p001ui.profile.exploop.item;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileLoopWheelTypeData;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileLoopWheelTypeFrag;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopFragmentFactory;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.HometownChinaItem;
import com.p1.mobile.putong.core.util.FriendPurposeHelper;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserWealth;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.g30;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ExpLoopInputHouse extends ExpLoopInputType {
    String haveHouseStr;
    String noHouseStr;
    String notRevealStr;
    private ArrayList<String> regionList;

    public ExpLoopInputHouse() {
        super(11, "你有房产吗?", ExpLoopInputType.ICON_HOUSE, 3);
        this.haveHouseStr = CoreModule.b.getString(R.string.B6);
        this.noHouseStr = CoreModule.b.getString(R.string.Hj);
        this.notRevealStr = CoreModule.b.getString(R.string.Dj);
        this.regionList = new ArrayList<>();
    }

    private List<String> getSubRegionList(String str) {
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, ExpProfileLoopWheelTypeData.NONE_STR) && NullChecker.a(LoopFragmentFactory.m1982u())) {
            for (HometownChinaItem hometownChinaItem : LoopFragmentFactory.m1982u().china) {
                if (TextUtils.equals(hometownChinaItem.region, str) && !vwb.J(hometownChinaItem.subRegion)) {
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
            ((ExpProfileLoopWheelTypeFrag) expProfileEditLoopBaseFrag).m1879c5();
        } else if (num.intValue() == 2) {
            setWheelData3(user, expProfileLoopWheelTypeData, str);
            ((ExpProfileLoopWheelTypeFrag) expProfileEditLoopBaseFrag).m1879c5();
        }
    }

    private void setWheelData3(User user, ExpProfileLoopWheelTypeData expProfileLoopWheelTypeData, String str) {
        List<String> subRegionList = getSubRegionList(str);
        if (vwb.J(subRegionList)) {
            expProfileLoopWheelTypeData.selectItem3 = ExpProfileLoopWheelTypeData.NONE_STR;
            expProfileLoopWheelTypeData.wheelData3 = vwb.f0(new String[]{ExpProfileLoopWheelTypeData.NONE_STR});
            return;
        }
        expProfileLoopWheelTypeData.wheelData3 = subRegionList;
        List list = user.profile.extensions.wealth.houseSubRegion;
        if (vwb.J(list) || TextUtils.isEmpty((CharSequence) list.get(0))) {
            expProfileLoopWheelTypeData.selectItem3 = subRegionList.get(0);
        } else {
            expProfileLoopWheelTypeData.selectItem3 = (String) list.get(0);
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType
    public void fillInputContentData(final User user, final ExpProfileEditLoopBaseFrag expProfileEditLoopBaseFrag) {
        this.regionList.clear();
        if (NullChecker.a(LoopFragmentFactory.m1982u())) {
            Iterator it = LoopFragmentFactory.m1982u().china.iterator();
            while (it.hasNext()) {
                this.regionList.add(((HometownChinaItem) it.next()).region);
            }
        }
        final ExpProfileLoopWheelTypeData expProfileLoopWheelTypeData = new ExpProfileLoopWheelTypeData();
        expProfileLoopWheelTypeData.fillWithEmpty(3, ExpProfileLoopWheelTypeData.NONE_STR);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.haveHouseStr);
        arrayList.add(this.noHouseStr);
        arrayList.add(this.notRevealStr);
        List list = user.profile.extensions.wealth.house;
        expProfileLoopWheelTypeData.wheelData1 = arrayList;
        if (vwb.J(list) || TextUtils.isEmpty((CharSequence) list.get(0))) {
            expProfileLoopWheelTypeData.selectItem1 = this.noHouseStr;
            setWheelData2AndData3(user, expProfileLoopWheelTypeData, null);
        } else {
            String str = (String) list.get(0);
            expProfileLoopWheelTypeData.selectItem1 = str;
            setWheelData2AndData3(user, expProfileLoopWheelTypeData, str);
        }
        setData(expProfileLoopWheelTypeData);
        if (expProfileEditLoopBaseFrag instanceof ExpProfileLoopWheelTypeFrag) {
            ((ExpProfileLoopWheelTypeFrag) expProfileEditLoopBaseFrag).m1881e5(new g30() { // from class: l.tef
                /* JADX INFO: renamed from: a */
                public final void m22904a(Object obj, Object obj2, Object obj3) {
                    this.f20201a.lambda$fillInputContentData$0(user, expProfileLoopWheelTypeData, expProfileEditLoopBaseFrag, (Integer) obj, (String) obj2, (Integer) obj3);
                }
            });
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType
    public String getPageId() {
        return "p_edit_house";
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType
    public String getPageName() {
        return "house";
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType
    public boolean hasInfoExist(User user, LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType) {
        return FriendPurposeHelper.j((!NullChecker.a(user.profile.extensions.wealth) || vwb.J(user.profile.extensions.wealth.house)) ? "" : (String) user.profile.extensions.wealth.house.get(0));
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType
    public boolean hasWheelDataChanged(User user) {
        boolean zEquals;
        UserWealth userWealth = user.profile.extensions.wealth;
        List list = userWealth.house;
        List list2 = userWealth.houseRegion;
        List list3 = userWealth.houseSubRegion;
        ExpProfileLoopWheelTypeData wheelType = getData().getWheelType();
        if (vwb.J(list) || TextUtils.isEmpty((CharSequence) list.get(0)) || !TextUtils.equals((CharSequence) list.get(0), wheelType.selectItem1)) {
            return true;
        }
        if (vwb.J(list2) || TextUtils.isEmpty((CharSequence) list2.get(0)) || !((String) list2.get(0)).equals(wheelType.selectItem2)) {
            zEquals = TextUtils.equals(ExpProfileLoopWheelTypeData.NONE_STR, wheelType.selectItem2);
        } else {
            zEquals = (vwb.J(list3) || TextUtils.isEmpty((CharSequence) list3.get(0))) ? TextUtils.equals(ExpProfileLoopWheelTypeData.NONE_STR, wheelType.selectItem3) : TextUtils.equals((CharSequence) list3.get(0), wheelType.selectItem3);
        }
        return !zEquals;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType
    public void saveUserInfo(User user) {
        super.saveUserInfo(user);
        ExpProfileLoopWheelTypeData wheelType = getData().getWheelType();
        String str = wheelType.selectItem1;
        String str2 = wheelType.selectItem2;
        String str3 = wheelType.selectItem3;
        String str4 = "";
        if (TextUtils.equals(str2, ExpProfileLoopWheelTypeData.NONE_STR)) {
            str2 = "";
        }
        if (TextUtils.equals(str3, ExpProfileLoopWheelTypeData.NONE_STR)) {
            str3 = "";
        }
        if (TextUtils.equals(this.noHouseStr, str) || TextUtils.equals(this.notRevealStr, str)) {
            str3 = "";
        } else {
            str4 = str2;
        }
        user.profile.extensions.wealth.house = vwb.f0(new String[]{str});
        user.profile.extensions.wealth.houseRegion = vwb.f0(new String[]{str4});
        user.profile.extensions.wealth.houseSubRegion = vwb.f0(new String[]{str3});
    }

    public void setWheelData2AndData3(User user, ExpProfileLoopWheelTypeData expProfileLoopWheelTypeData, String str) {
        if (!TextUtils.equals(str, this.haveHouseStr)) {
            expProfileLoopWheelTypeData.selectItem2 = ExpProfileLoopWheelTypeData.NONE_STR;
            expProfileLoopWheelTypeData.wheelData2 = vwb.f0(new String[]{ExpProfileLoopWheelTypeData.NONE_STR});
            setWheelData3(user, expProfileLoopWheelTypeData, expProfileLoopWheelTypeData.selectItem2);
        } else {
            if (vwb.J(this.regionList)) {
                return;
            }
            expProfileLoopWheelTypeData.wheelData2 = this.regionList;
            List list = user.profile.extensions.wealth.houseRegion;
            if (vwb.J(list) || TextUtils.isEmpty((CharSequence) list.get(0))) {
                expProfileLoopWheelTypeData.selectItem2 = this.regionList.get(0);
            } else {
                expProfileLoopWheelTypeData.selectItem2 = (String) list.get(0);
            }
            setWheelData3(user, expProfileLoopWheelTypeData, expProfileLoopWheelTypeData.selectItem2);
        }
    }
}
