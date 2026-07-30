package com.p046p1.mobile.putong.core.p053ui.profile.exploop.item;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem.ExpProfileLoopSelectTypeData;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputSmoking;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopFragmentFactory;
import com.p046p1.mobile.putong.core.util.FriendPurposeHelper;
import com.p046p1.mobile.putong.data.User;
import java.util.ArrayList;
import p149l.e30;
import p149l.vwb;
import p149l.w9j;

/* JADX INFO: loaded from: classes4.dex */
public class ExpLoopInputSmoking extends ExpLoopInputType {
    public ExpLoopInputSmoking() {
        super(4, "你吸烟吗?", ExpLoopInputType.ICON_SMOKING, 1);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m51435a(String str, ArrayList arrayList, FriendPurposeHelper.SmokeType smokeType) {
        if (smokeType != FriendPurposeHelper.SmokeType.not_reveal) {
            String strName = smokeType.name();
            arrayList.add(new ExpProfileLoopSelectTypeData.ItemData(strName, FriendPurposeHelper.SmokeType.getDes(strName), TextUtils.equals(strName, str)));
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public void fillInputContentData(User user, ExpProfileEditLoopBaseFrag expProfileEditLoopBaseFrag) {
        final String str = !vwb.m200296J(user.profile.extensions.physical.smoke) ? user.profile.extensions.physical.smoke.get(0) : "";
        final ArrayList arrayList = new ArrayList();
        vwb.m200287A(FriendPurposeHelper.SmokeType.values(), new e30() { // from class: l.fff
            @Override // p149l.e30
            public final void call(Object obj) {
                ExpLoopInputSmoking.m51435a(str, arrayList, (FriendPurposeHelper.SmokeType) obj);
            }
        });
        setData(new ExpProfileLoopSelectTypeData(arrayList));
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public String getPageId() {
        return "p_edit_smoking";
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public String getPageName() {
        return "smoking";
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public boolean hasInfoExist(User user, LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType) {
        return (vwb.m200296J(user.profile.extensions.physical.smoke) || TextUtils.isEmpty(user.profile.extensions.physical.smoke.get(0))) ? false : true;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public void saveUserInfo(User user) {
        super.saveUserInfo(user);
        ExpProfileLoopSelectTypeData.ItemData itemData = (ExpProfileLoopSelectTypeData.ItemData) vwb.m200346r(getData().getSelectType().list, new w9j() { // from class: l.gff
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((ExpProfileLoopSelectTypeData.ItemData) obj).boolValue);
            }
        });
        user.profile.extensions.physical.smoke.clear();
        if (itemData != null) {
            user.profile.extensions.physical.smoke.add(itemData.key);
        }
    }
}
