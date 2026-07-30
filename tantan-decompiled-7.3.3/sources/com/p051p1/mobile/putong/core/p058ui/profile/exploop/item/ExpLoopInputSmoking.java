package com.p051p1.mobile.putong.core.p058ui.profile.exploop.item;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem.ExpProfileLoopSelectTypeData;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputSmoking;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopFragmentFactory;
import com.p051p1.mobile.putong.core.util.FriendPurposeHelper;
import com.p051p1.mobile.putong.data.User;
import java.util.ArrayList;
import p153l.jyb;
import p153l.qcj;
import p153l.y20;

/* JADX INFO: loaded from: classes4.dex */
public class ExpLoopInputSmoking extends ExpLoopInputType {
    public ExpLoopInputSmoking() {
        super(4, "你吸烟吗?", ExpLoopInputType.ICON_SMOKING, 1);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m52618a(String str, ArrayList arrayList, FriendPurposeHelper.SmokeType smokeType) {
        if (smokeType != FriendPurposeHelper.SmokeType.not_reveal) {
            String strName = smokeType.name();
            arrayList.add(new ExpProfileLoopSelectTypeData.ItemData(strName, FriendPurposeHelper.SmokeType.getDes(strName), TextUtils.equals(strName, str)));
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public void fillInputContentData(User user, ExpProfileEditLoopBaseFrag expProfileEditLoopBaseFrag) {
        final String str = !jyb.m147479J(user.profile.extensions.physical.smoke) ? user.profile.extensions.physical.smoke.get(0) : "";
        final ArrayList arrayList = new ArrayList();
        jyb.m147470A(FriendPurposeHelper.SmokeType.values(), new y20() { // from class: l.lgf
            @Override // p153l.y20
            public final void call(Object obj) {
                ExpLoopInputSmoking.m52618a(str, arrayList, (FriendPurposeHelper.SmokeType) obj);
            }
        });
        setData(new ExpProfileLoopSelectTypeData(arrayList));
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public String getPageId() {
        return "p_edit_smoking";
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public String getPageName() {
        return "smoking";
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public boolean hasInfoExist(User user, LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType) {
        return (jyb.m147479J(user.profile.extensions.physical.smoke) || TextUtils.isEmpty(user.profile.extensions.physical.smoke.get(0))) ? false : true;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public void saveUserInfo(User user) {
        super.saveUserInfo(user);
        ExpProfileLoopSelectTypeData.ItemData itemData = (ExpProfileLoopSelectTypeData.ItemData) jyb.m147529r(getData().getSelectType().list, new qcj() { // from class: l.mgf
            @Override // p153l.qcj
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
