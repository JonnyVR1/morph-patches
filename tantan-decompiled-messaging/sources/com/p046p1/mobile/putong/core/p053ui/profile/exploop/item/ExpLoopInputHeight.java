package com.p046p1.mobile.putong.core.p053ui.profile.exploop.item;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.CoreStaticData;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem.ExpProfileLoopWheelTypeData;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopFragmentFactory;
import com.p046p1.mobile.putong.data.User;
import java.util.Iterator;
import java.util.List;
import p149l.vwb;
import p149l.w9j;

/* JADX INFO: loaded from: classes4.dex */
public class ExpLoopInputHeight extends ExpLoopInputType {
    public ExpLoopInputHeight() {
        super(13, "你的身高是?", ExpLoopInputType.ICON_HEIGHT, 3);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public void fillInputContentData(User user, ExpProfileEditLoopBaseFrag expProfileEditLoopBaseFrag) {
        ExpProfileLoopWheelTypeData expProfileLoopWheelTypeData = new ExpProfileLoopWheelTypeData();
        List<String> listMo33794Zg = CoreModule.f17557o.m195057d().mo33794Zg();
        if (expProfileEditLoopBaseFrag.f33284z == LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_PICKS) {
            Iterator<String> it = listMo33794Zg.iterator();
            while (it.hasNext()) {
                if (TextUtils.equals(it.next(), CoreModule.f17544b.getString(R$string.f17676Dj))) {
                    it.remove();
                }
            }
        }
        final List<String> list = user.profile.extensions.physical.height;
        expProfileLoopWheelTypeData.wheelData1 = listMo33794Zg;
        expProfileLoopWheelTypeData.selectItem1 = (String) vwb.m200346r(listMo33794Zg, new w9j() { // from class: l.qef
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((String) obj).contains("160"));
            }
        });
        if (!vwb.m200296J(list) && !TextUtils.isEmpty(list.get(0))) {
            String str = (String) vwb.m200346r(listMo33794Zg, new w9j() { // from class: l.ref
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((String) obj).contains((CharSequence) list.get(0)));
                }
            });
            if (!TextUtils.isEmpty(str)) {
                expProfileLoopWheelTypeData.selectItem1 = str;
            }
        }
        setData(expProfileLoopWheelTypeData);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public String getPageId() {
        return "p_edit_height";
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public String getPageName() {
        return "height";
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public boolean hasInfoExist(User user, LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType) {
        return (vwb.m200296J(user.profile.extensions.physical.height) || TextUtils.isEmpty(user.profile.extensions.physical.height.get(0)) || TextUtils.equals(user.profile.extensions.physical.height.get(0), CoreModule.f17544b.getString(R$string.f17676Dj))) ? false : true;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public boolean hasWheelDataChanged(User user) {
        if (vwb.m200296J(user.profile.extensions.physical.height)) {
            return true;
        }
        return !TextUtils.equals(user.profile.extensions.physical.height.get(0) + CoreStaticData.FriendPurposeDataType.HEIGHT_UNIT_STR, getData().getWheelType().selectItem1);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public void saveUserInfo(User user) {
        super.saveUserInfo(user);
        String str = getData().getWheelType().selectItem1;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strReplace = str.replace(CoreStaticData.FriendPurposeDataType.HEIGHT_UNIT_STR, "");
        user.profile.extensions.physical.height = vwb.m200324f0(strReplace);
    }
}
