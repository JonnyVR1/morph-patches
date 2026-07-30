package com.p046p1.mobile.putong.core.p053ui.profile.exploop.item;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem.ExpProfileLoopSelectTypeData;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputFitness;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopFragmentFactory;
import com.p046p1.mobile.putong.core.util.FriendPurposeHelper;
import com.p046p1.mobile.putong.data.Extensions;
import com.p046p1.mobile.putong.data.Physical;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p149l.e30;
import p149l.vwb;
import p149l.w9j;

/* JADX INFO: loaded from: classes4.dex */
public class ExpLoopInputFitness extends ExpLoopInputType {
    public ExpLoopInputFitness() {
        super(2, "你平时健身吗?", ExpLoopInputType.ICON_FITNESS, 1);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m51406b(String str, ArrayList arrayList, FriendPurposeHelper.FitnessType fitnessType) {
        if (fitnessType != FriendPurposeHelper.FitnessType.not_reveal) {
            String strName = fitnessType.name();
            arrayList.add(new ExpProfileLoopSelectTypeData.ItemData(strName, FriendPurposeHelper.FitnessType.getDes(strName), TextUtils.equals(strName, str)));
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public void fillInputContentData(User user, ExpProfileEditLoopBaseFrag expProfileEditLoopBaseFrag) {
        final String str = (NullChecker.m81303a(user.profile.extensions) && NullChecker.m81303a(user.profile.extensions.physical) && !vwb.m200296J(user.profile.extensions.physical.fitness)) ? user.profile.extensions.physical.fitness.get(0) : "";
        final ArrayList arrayList = new ArrayList();
        vwb.m200287A(FriendPurposeHelper.FitnessType.values(), new e30() { // from class: l.cef
            @Override // p149l.e30
            public final void call(Object obj) {
                ExpLoopInputFitness.m51406b(str, arrayList, (FriendPurposeHelper.FitnessType) obj);
            }
        });
        setData(new ExpProfileLoopSelectTypeData(arrayList));
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public String getPageId() {
        return "p_edit_exercise";
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public String getPageName() {
        return "fitness";
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public boolean hasInfoExist(User user, LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType) {
        return (!NullChecker.m81303a(user.profile.extensions.physical) || vwb.m200296J(user.profile.extensions.physical.fitness) || TextUtils.isEmpty(user.profile.extensions.physical.fitness.get(0))) ? false : true;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public void saveUserInfo(User user) {
        super.saveUserInfo(user);
        ExpProfileLoopSelectTypeData.ItemData itemData = (ExpProfileLoopSelectTypeData.ItemData) vwb.m200346r(getData().getSelectType().list, new w9j() { // from class: l.bef
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((ExpProfileLoopSelectTypeData.ItemData) obj).boolValue);
            }
        });
        Extensions extensions = user.profile.extensions;
        if (extensions.physical == null) {
            extensions.physical = Physical.new_();
        }
        user.profile.extensions.physical.fitness.clear();
        if (itemData != null) {
            user.profile.extensions.physical.fitness.add(itemData.key);
        }
    }
}
