package com.p051p1.mobile.putong.core.p058ui.profile.exploop.item;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopFragmentFactory;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;

/* JADX INFO: loaded from: classes4.dex */
public class ExpLoopInputVerification extends ExpLoopInputType {
    public ExpLoopInputVerification() {
        super(25, "头像本人认证", ExpLoopInputType.ICON_VERIFICATION, 1025);
        setSubTitle("使用五官清晰正面照完成认证，解锁专属权益");
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public boolean canExit(User user, LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType) {
        return loopCreateEntryType == LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_MY_TAB_OPT || super.canExit(user, loopCreateEntryType);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public void fillInputContentData(User user, ExpProfileEditLoopBaseFrag expProfileEditLoopBaseFrag) {
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public String getPageId() {
        return "p_avatar_verify";
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public String getPageName() {
        return "verification";
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public boolean hasInfoExist(User user, LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType) {
        VerificationCenter verificationCenterM32615k4 = CoreModule.f18264c.f20294B0.m32615k4();
        if (verificationCenterM32615k4 != null) {
            return TEnum.equals(verificationCenterM32615k4.picVerificationInfo.status, "verified") || TEnum.equals(verificationCenterM32615k4.picVerificationInfo.status, "pending");
        }
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public void saveUserInfo(User user) {
    }
}
