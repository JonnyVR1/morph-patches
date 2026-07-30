package com.p046p1.mobile.putong.core.p053ui.profile.exploop.item;

import com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem.ExpProfileLoopSelectTypeData;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputFriendPurpose;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopFragmentFactory;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.base.LoopSelectFillData;
import com.p046p1.mobile.putong.core.util.FriendPurposeHelper;
import com.p046p1.mobile.putong.data.ProfileExtensionBasic;
import com.p046p1.mobile.putong.data.Purpose;
import com.p046p1.mobile.putong.data.User;
import p149l.ura;
import p149l.vwb;
import p149l.w9j;

/* JADX INFO: loaded from: classes4.dex */
public class ExpLoopInputFriendPurpose extends ExpLoopInputType {
    public ExpLoopInputFriendPurpose() {
        super(7, "你想建立什么样的感情关系?", ExpLoopInputType.ICON_FRIEND_PURPOSE, 1);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ ExpProfileLoopSelectTypeData.ItemData m51410b(LoopSelectFillData loopSelectFillData) {
        return new ExpProfileLoopSelectTypeData.ItemData(loopSelectFillData.m51576b(), loopSelectFillData.m51575a(), loopSelectFillData.m51580f());
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public void fillInputContentData(User user, ExpProfileEditLoopBaseFrag expProfileEditLoopBaseFrag) {
        setData(new ExpProfileLoopSelectTypeData(vwb.m200303Q(FriendPurposeHelper.m59425d(user), new w9j() { // from class: l.fef
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ExpLoopInputFriendPurpose.m51410b((LoopSelectFillData) obj);
            }
        })));
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public String getPageId() {
        return "p_edit_dating_purpose";
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public String getPageName() {
        return "dating_purpose";
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public boolean hasInfoExist(User user, LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType) {
        ProfileExtensionBasic profileExtensionBasic = user.profile.extensions.basic;
        return (profileExtensionBasic == null || vwb.m200296J(profileExtensionBasic.friendPurpose)) ? false : true;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public void saveUserInfo(User user) {
        super.saveUserInfo(user);
        ExpProfileLoopSelectTypeData.ItemData itemData = (ExpProfileLoopSelectTypeData.ItemData) vwb.m200346r(getData().getSelectType().list, new w9j() { // from class: l.gef
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((ExpProfileLoopSelectTypeData.ItemData) obj).boolValue);
            }
        });
        if (itemData != null) {
            user.profile.extensions.basic.friendPurpose = ura.m195053e().m195057d().mo33887nn(itemData.text);
        } else {
            user.profile.extensions.basic.friendPurpose = vwb.m200324f0(new Purpose[0]);
        }
    }
}
