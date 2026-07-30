package com.p000p1.mobile.putong.core.p001ui.profile.exploop.item;

import com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileLoopSelectTypeData;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputFriendPurpose;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopFragmentFactory;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.base.LoopSelectFillData;
import com.p1.mobile.putong.core.util.FriendPurposeHelper;
import com.p1.mobile.putong.data.ProfileExtensionBasic;
import com.p1.mobile.putong.data.Purpose;
import com.p1.mobile.putong.data.User;
import l.ura;
import l.vwb;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ExpLoopInputFriendPurpose extends ExpLoopInputType {
    public ExpLoopInputFriendPurpose() {
        super(7, "你想建立什么样的感情关系?", ExpLoopInputType.ICON_FRIEND_PURPOSE, 1);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ ExpProfileLoopSelectTypeData.ItemData m1892b(LoopSelectFillData loopSelectFillData) {
        return new ExpProfileLoopSelectTypeData.ItemData(loopSelectFillData.m2062b(), loopSelectFillData.m2061a(), loopSelectFillData.m2066f());
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType
    public void fillInputContentData(User user, ExpProfileEditLoopBaseFrag expProfileEditLoopBaseFrag) {
        setData(new ExpProfileLoopSelectTypeData(vwb.Q(FriendPurposeHelper.d(user), new w9j() { // from class: l.fef
            public final Object call(Object obj) {
                return ExpLoopInputFriendPurpose.m1892b((LoopSelectFillData) obj);
            }
        })));
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType
    public String getPageId() {
        return "p_edit_dating_purpose";
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType
    public String getPageName() {
        return "dating_purpose";
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType
    public boolean hasInfoExist(User user, LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType) {
        ProfileExtensionBasic profileExtensionBasic = user.profile.extensions.basic;
        return (profileExtensionBasic == null || vwb.J(profileExtensionBasic.friendPurpose)) ? false : true;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType
    public void saveUserInfo(User user) {
        super.saveUserInfo(user);
        ExpProfileLoopSelectTypeData.ItemData itemData = (ExpProfileLoopSelectTypeData.ItemData) vwb.r(getData().getSelectType().list, new w9j() { // from class: l.gef
            public final Object call(Object obj) {
                return Boolean.valueOf(((ExpProfileLoopSelectTypeData.ItemData) obj).boolValue);
            }
        });
        if (itemData != null) {
            user.profile.extensions.basic.friendPurpose = ura.e().d().nn(itemData.text);
        } else {
            user.profile.extensions.basic.friendPurpose = vwb.f0(new Purpose[0]);
        }
    }
}
