package com.p000p1.mobile.putong.core.p001ui.profile.exploop.item;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileLoopSelectTypeData;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputFitness;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopFragmentFactory;
import com.p1.mobile.putong.core.util.FriendPurposeHelper;
import com.p1.mobile.putong.data.Extensions;
import com.p1.mobile.putong.data.Physical;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.e30;
import l.vwb;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ExpLoopInputFitness extends ExpLoopInputType {
    public ExpLoopInputFitness() {
        super(2, "你平时健身吗?", ExpLoopInputType.ICON_FITNESS, 1);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m1888b(String str, ArrayList arrayList, FriendPurposeHelper.FitnessType fitnessType) {
        if (fitnessType != FriendPurposeHelper.FitnessType.not_reveal) {
            String strName = fitnessType.name();
            arrayList.add(new ExpProfileLoopSelectTypeData.ItemData(strName, FriendPurposeHelper.FitnessType.getDes(strName), TextUtils.equals(strName, str)));
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType
    public void fillInputContentData(User user, ExpProfileEditLoopBaseFrag expProfileEditLoopBaseFrag) {
        final String str = (NullChecker.a(user.profile.extensions) && NullChecker.a(user.profile.extensions.physical) && !vwb.J(user.profile.extensions.physical.fitness)) ? (String) user.profile.extensions.physical.fitness.get(0) : "";
        final ArrayList arrayList = new ArrayList();
        vwb.A(FriendPurposeHelper.FitnessType.values(), new e30() { // from class: l.cef
            public final void call(Object obj) {
                ExpLoopInputFitness.m1888b(str, arrayList, (FriendPurposeHelper.FitnessType) obj);
            }
        });
        setData(new ExpProfileLoopSelectTypeData(arrayList));
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType
    public String getPageId() {
        return "p_edit_exercise";
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType
    public String getPageName() {
        return "fitness";
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType
    public boolean hasInfoExist(User user, LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType) {
        return (!NullChecker.a(user.profile.extensions.physical) || vwb.J(user.profile.extensions.physical.fitness) || TextUtils.isEmpty((CharSequence) user.profile.extensions.physical.fitness.get(0))) ? false : true;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType
    public void saveUserInfo(User user) {
        super.saveUserInfo(user);
        ExpProfileLoopSelectTypeData.ItemData itemData = (ExpProfileLoopSelectTypeData.ItemData) vwb.r(getData().getSelectType().list, new w9j() { // from class: l.bef
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
