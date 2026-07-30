package com.p051p1.mobile.putong.core.p058ui.profile.exploop.item;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem.ExpProfileLoopTextTypeData;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopFragmentFactory;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class ExpLoopInputSchoolNew extends ExpLoopInputType {
    public ExpLoopInputSchoolNew() {
        super(18, "你的学校是?", ExpLoopInputType.ICON_SCHOOL, 1018);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public void fillInputContentData(User user, ExpProfileEditLoopBaseFrag expProfileEditLoopBaseFrag) {
        setData(new ExpProfileLoopTextTypeData(user.profile.studies.school, "").setMaxCount(50));
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public String getPageId() {
        return "p_edit_school_view";
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public String getPageName() {
        return "school";
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public boolean hasInfoExist(User user, LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType) {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        return (NullChecker.m82486a(userM116600p9.settings) && NullChecker.m82487b(userM116600p9.settings.verification) && NullChecker.m82487b(userM116600p9.settings.verification.studies) && TEnum.equals(userM116600p9.settings.verification.studies.status, "pending")) || !TextUtils.isEmpty(user.profile.studies.school);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public void saveUserInfo(User user) {
        super.saveUserInfo(user);
        ExpProfileLoopTextTypeData textType = getData().getTextType();
        user.profile.studies.school = textType.text1;
    }
}
