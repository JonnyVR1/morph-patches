package com.p046p1.mobile.putong.core.p053ui.profile.exploop.item;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem.ExpProfileLoopSelectTypeData;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputQualification;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopFragmentFactory;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.base.LoopSelectFillData;
import com.p046p1.mobile.putong.core.util.FriendPurposeHelper;
import com.p046p1.mobile.putong.data.ProfileExtensionBasic;
import com.p046p1.mobile.putong.data.User;
import java.util.ArrayList;
import p149l.ura;
import p149l.vwb;
import p149l.w9j;

/* JADX INFO: loaded from: classes4.dex */
public class ExpLoopInputQualification extends ExpLoopInputType {
    public ExpLoopInputQualification() {
        super(1, "你的最高学历是?", ExpLoopInputType.ICON_QUALIFICATION, 1);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ ExpProfileLoopSelectTypeData.ItemData m51434c(LoopSelectFillData loopSelectFillData) {
        return new ExpProfileLoopSelectTypeData.ItemData(loopSelectFillData.m51576b(), loopSelectFillData.m51575a(), loopSelectFillData.m51580f());
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public void fillInputContentData(User user, ExpProfileEditLoopBaseFrag expProfileEditLoopBaseFrag) {
        ArrayList<LoopSelectFillData> arrayListM59428g = FriendPurposeHelper.m59428g(user);
        if (expProfileEditLoopBaseFrag.f33284z == LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_PICKS) {
            vwb.m200320d0(arrayListM59428g, new w9j() { // from class: l.cff
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf("暂不透露".equals(((LoopSelectFillData) obj).m51577c()));
                }
            });
        }
        setData(new ExpProfileLoopSelectTypeData(vwb.m200303Q(arrayListM59428g, new w9j() { // from class: l.dff
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ExpLoopInputQualification.m51434c((LoopSelectFillData) obj);
            }
        })));
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public String getPageId() {
        return "p_edit_education_degree";
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public String getPageName() {
        return "education_degree";
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public boolean hasInfoExist(User user, LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType) {
        ProfileExtensionBasic profileExtensionBasic = user.profile.extensions.basic;
        if (profileExtensionBasic == null || vwb.m200296J(profileExtensionBasic.qualification) || TextUtils.isEmpty(user.profile.extensions.basic.qualification.get(0))) {
            return false;
        }
        return (loopCreateEntryType == LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_PICKS && CoreModule.f17544b.getString(R$string.f17676Dj).equals(user.profile.extensions.basic.qualification.get(0))) ? false : true;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public void saveUserInfo(User user) {
        super.saveUserInfo(user);
        ExpProfileLoopSelectTypeData.ItemData itemData = (ExpProfileLoopSelectTypeData.ItemData) vwb.m200346r(getData().getSelectType().list, new w9j() { // from class: l.eff
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((ExpProfileLoopSelectTypeData.ItemData) obj).boolValue);
            }
        });
        if (itemData == null) {
            user.profile.extensions.basic.qualification = null;
        } else {
            user.profile.extensions.basic.qualification = ura.m195053e().m195057d().mo33739Pi(itemData.text);
        }
    }
}
