package com.p000p1.mobile.putong.core.p001ui.profile.exploop.item;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileLoopSelectTypeData;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputSmoking;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopFragmentFactory;
import com.p1.mobile.putong.core.util.FriendPurposeHelper;
import com.p1.mobile.putong.data.User;
import java.util.ArrayList;
import l.e30;
import l.vwb;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ExpLoopInputSmoking extends ExpLoopInputType {
    public ExpLoopInputSmoking() {
        super(4, "你吸烟吗?", ExpLoopInputType.ICON_SMOKING, 1);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m1917a(String str, ArrayList arrayList, FriendPurposeHelper.SmokeType smokeType) {
        if (smokeType != FriendPurposeHelper.SmokeType.not_reveal) {
            String strName = smokeType.name();
            arrayList.add(new ExpProfileLoopSelectTypeData.ItemData(strName, FriendPurposeHelper.SmokeType.getDes(strName), TextUtils.equals(strName, str)));
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType
    public void fillInputContentData(User user, ExpProfileEditLoopBaseFrag expProfileEditLoopBaseFrag) {
        final String str = !vwb.J(user.profile.extensions.physical.smoke) ? (String) user.profile.extensions.physical.smoke.get(0) : "";
        final ArrayList arrayList = new ArrayList();
        vwb.A(FriendPurposeHelper.SmokeType.values(), new e30() { // from class: l.fff
            public final void call(Object obj) {
                ExpLoopInputSmoking.m1917a(str, arrayList, (FriendPurposeHelper.SmokeType) obj);
            }
        });
        setData(new ExpProfileLoopSelectTypeData(arrayList));
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType
    public String getPageId() {
        return "p_edit_smoking";
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType
    public String getPageName() {
        return "smoking";
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType
    public boolean hasInfoExist(User user, LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType) {
        return (vwb.J(user.profile.extensions.physical.smoke) || TextUtils.isEmpty((CharSequence) user.profile.extensions.physical.smoke.get(0))) ? false : true;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType
    public void saveUserInfo(User user) {
        super.saveUserInfo(user);
        ExpProfileLoopSelectTypeData.ItemData itemData = (ExpProfileLoopSelectTypeData.ItemData) vwb.r(getData().getSelectType().list, new w9j() { // from class: l.gff
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
