package com.p051p1.mobile.putong.core.p058ui.profile.exploop.item;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem.ExpProfileLoopSelectTypeData;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputQualification;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopFragmentFactory;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.base.LoopSelectFillData;
import com.p051p1.mobile.putong.core.util.FriendPurposeHelper;
import com.p051p1.mobile.putong.data.ProfileExtensionBasic;
import com.p051p1.mobile.putong.data.User;
import java.util.ArrayList;
import p153l.gta;
import p153l.jyb;
import p153l.qcj;

/* JADX INFO: loaded from: classes4.dex */
public class ExpLoopInputQualification extends ExpLoopInputType {
    public ExpLoopInputQualification() {
        super(1, "你的最高学历是?", ExpLoopInputType.ICON_QUALIFICATION, 1);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ ExpProfileLoopSelectTypeData.ItemData m52617c(LoopSelectFillData loopSelectFillData) {
        return new ExpProfileLoopSelectTypeData.ItemData(loopSelectFillData.m52759b(), loopSelectFillData.m52758a(), loopSelectFillData.m52763f());
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public void fillInputContentData(User user, ExpProfileEditLoopBaseFrag expProfileEditLoopBaseFrag) {
        ArrayList<LoopSelectFillData> arrayListM60612g = FriendPurposeHelper.m60612g(user);
        if (expProfileEditLoopBaseFrag.f34132z == LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_PICKS) {
            jyb.m147503d0(arrayListM60612g, new qcj() { // from class: l.igf
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf("暂不透露".equals(((LoopSelectFillData) obj).m52760c()));
                }
            });
        }
        setData(new ExpProfileLoopSelectTypeData(jyb.m147486Q(arrayListM60612g, new qcj() { // from class: l.jgf
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ExpLoopInputQualification.m52617c((LoopSelectFillData) obj);
            }
        })));
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public String getPageId() {
        return "p_edit_education_degree";
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public String getPageName() {
        return "education_degree";
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public boolean hasInfoExist(User user, LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType) {
        ProfileExtensionBasic profileExtensionBasic = user.profile.extensions.basic;
        if (profileExtensionBasic == null || jyb.m147479J(profileExtensionBasic.qualification) || TextUtils.isEmpty(user.profile.extensions.basic.qualification.get(0))) {
            return false;
        }
        return (loopCreateEntryType == LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_PICKS && CoreModule.f18263b.getString(R$string.f19066Zj).equals(user.profile.extensions.basic.qualification.get(0))) ? false : true;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public void saveUserInfo(User user) {
        super.saveUserInfo(user);
        ExpProfileLoopSelectTypeData.ItemData itemData = (ExpProfileLoopSelectTypeData.ItemData) jyb.m147529r(getData().getSelectType().list, new qcj() { // from class: l.kgf
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((ExpProfileLoopSelectTypeData.ItemData) obj).boolValue);
            }
        });
        if (itemData == null) {
            user.profile.extensions.basic.qualification = null;
        } else {
            user.profile.extensions.basic.qualification = gta.m132210e().m132214d().mo34742Pi(itemData.text);
        }
    }
}
