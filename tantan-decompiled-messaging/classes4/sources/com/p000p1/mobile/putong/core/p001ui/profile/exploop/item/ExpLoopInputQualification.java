package com.p000p1.mobile.putong.core.p001ui.profile.exploop.item;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileLoopSelectTypeData;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputQualification;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopFragmentFactory;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.base.LoopSelectFillData;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.util.FriendPurposeHelper;
import com.p1.mobile.putong.data.ProfileExtensionBasic;
import com.p1.mobile.putong.data.User;
import java.util.ArrayList;
import l.ura;
import l.vwb;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ExpLoopInputQualification extends ExpLoopInputType {
    public ExpLoopInputQualification() {
        super(1, "你的最高学历是?", ExpLoopInputType.ICON_QUALIFICATION, 1);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ ExpProfileLoopSelectTypeData.ItemData m1916c(LoopSelectFillData loopSelectFillData) {
        return new ExpProfileLoopSelectTypeData.ItemData(loopSelectFillData.m2062b(), loopSelectFillData.m2061a(), loopSelectFillData.m2066f());
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType
    public void fillInputContentData(User user, ExpProfileEditLoopBaseFrag expProfileEditLoopBaseFrag) {
        ArrayList arrayListG = FriendPurposeHelper.g(user);
        if (expProfileEditLoopBaseFrag.f1106z == LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_PICKS) {
            vwb.d0(arrayListG, new w9j() { // from class: l.cff
                public final Object call(Object obj) {
                    return Boolean.valueOf("暂不透露".equals(((LoopSelectFillData) obj).m2063c()));
                }
            });
        }
        setData(new ExpProfileLoopSelectTypeData(vwb.Q(arrayListG, new w9j() { // from class: l.dff
            public final Object call(Object obj) {
                return ExpLoopInputQualification.m1916c((LoopSelectFillData) obj);
            }
        })));
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType
    public String getPageId() {
        return "p_edit_education_degree";
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType
    public String getPageName() {
        return "education_degree";
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType
    public boolean hasInfoExist(User user, LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType) {
        ProfileExtensionBasic profileExtensionBasic = user.profile.extensions.basic;
        if (profileExtensionBasic == null || vwb.J(profileExtensionBasic.qualification) || TextUtils.isEmpty((CharSequence) user.profile.extensions.basic.qualification.get(0))) {
            return false;
        }
        return (loopCreateEntryType == LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_PICKS && CoreModule.b.getString(R.string.Dj).equals(user.profile.extensions.basic.qualification.get(0))) ? false : true;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType
    public void saveUserInfo(User user) {
        super.saveUserInfo(user);
        ExpProfileLoopSelectTypeData.ItemData itemData = (ExpProfileLoopSelectTypeData.ItemData) vwb.r(getData().getSelectType().list, new w9j() { // from class: l.eff
            public final Object call(Object obj) {
                return Boolean.valueOf(((ExpProfileLoopSelectTypeData.ItemData) obj).boolValue);
            }
        });
        if (itemData == null) {
            user.profile.extensions.basic.qualification = null;
        } else {
            user.profile.extensions.basic.qualification = ura.e().d().Pi(itemData.text);
        }
    }
}
