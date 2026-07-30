package com.p051p1.mobile.putong.core.p058ui.profile.exploop.item;

import com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem.ExpProfileLoopSelectTypeData;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputFriendPurpose;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopFragmentFactory;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.base.LoopSelectFillData;
import com.p051p1.mobile.putong.core.util.FriendPurposeHelper;
import com.p051p1.mobile.putong.data.ProfileExtensionBasic;
import com.p051p1.mobile.putong.data.Purpose;
import com.p051p1.mobile.putong.data.User;
import p153l.gta;
import p153l.jyb;
import p153l.qcj;

/* JADX INFO: loaded from: classes4.dex */
public class ExpLoopInputFriendPurpose extends ExpLoopInputType {
    public ExpLoopInputFriendPurpose() {
        super(7, "你想建立什么样的感情关系?", ExpLoopInputType.ICON_FRIEND_PURPOSE, 1);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ ExpProfileLoopSelectTypeData.ItemData m52593b(LoopSelectFillData loopSelectFillData) {
        return new ExpProfileLoopSelectTypeData.ItemData(loopSelectFillData.m52759b(), loopSelectFillData.m52758a(), loopSelectFillData.m52763f());
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public void fillInputContentData(User user, ExpProfileEditLoopBaseFrag expProfileEditLoopBaseFrag) {
        setData(new ExpProfileLoopSelectTypeData(jyb.m147486Q(FriendPurposeHelper.m60609d(user), new qcj() { // from class: l.lff
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ExpLoopInputFriendPurpose.m52593b((LoopSelectFillData) obj);
            }
        })));
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public String getPageId() {
        return "p_edit_dating_purpose";
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public String getPageName() {
        return "dating_purpose";
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public boolean hasInfoExist(User user, LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType) {
        ProfileExtensionBasic profileExtensionBasic = user.profile.extensions.basic;
        return (profileExtensionBasic == null || jyb.m147479J(profileExtensionBasic.friendPurpose)) ? false : true;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public void saveUserInfo(User user) {
        super.saveUserInfo(user);
        ExpProfileLoopSelectTypeData.ItemData itemData = (ExpProfileLoopSelectTypeData.ItemData) jyb.m147529r(getData().getSelectType().list, new qcj() { // from class: l.mff
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((ExpProfileLoopSelectTypeData.ItemData) obj).boolValue);
            }
        });
        if (itemData != null) {
            user.profile.extensions.basic.friendPurpose = gta.m132210e().m132214d().mo34890nn(itemData.text);
        } else {
            user.profile.extensions.basic.friendPurpose = jyb.m147507f0(new Purpose[0]);
        }
    }
}
