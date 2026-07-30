package com.p051p1.mobile.putong.core.p058ui.profile.exploop.item;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.CoreStaticData;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem.ExpProfileLoopWheelTypeData;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopFragmentFactory;
import com.p051p1.mobile.putong.data.User;
import java.util.Iterator;
import java.util.List;
import p153l.jyb;
import p153l.qcj;

/* JADX INFO: loaded from: classes4.dex */
public class ExpLoopInputHeight extends ExpLoopInputType {
    public ExpLoopInputHeight() {
        super(13, "你的身高是?", ExpLoopInputType.ICON_HEIGHT, 3);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public void fillInputContentData(User user, ExpProfileEditLoopBaseFrag expProfileEditLoopBaseFrag) {
        ExpProfileLoopWheelTypeData expProfileLoopWheelTypeData = new ExpProfileLoopWheelTypeData();
        List<String> listMo34797Zg = CoreModule.f18276o.m132214d().mo34797Zg();
        if (expProfileEditLoopBaseFrag.f34132z == LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_PICKS) {
            Iterator<String> it = listMo34797Zg.iterator();
            while (it.hasNext()) {
                if (TextUtils.equals(it.next(), CoreModule.f18263b.getString(R$string.f19066Zj))) {
                    it.remove();
                }
            }
        }
        final List<String> list = user.profile.extensions.physical.height;
        expProfileLoopWheelTypeData.wheelData1 = listMo34797Zg;
        expProfileLoopWheelTypeData.selectItem1 = (String) jyb.m147529r(listMo34797Zg, new qcj() { // from class: l.wff
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((String) obj).contains("160"));
            }
        });
        if (!jyb.m147479J(list) && !TextUtils.isEmpty(list.get(0))) {
            String str = (String) jyb.m147529r(listMo34797Zg, new qcj() { // from class: l.xff
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((String) obj).contains((CharSequence) list.get(0)));
                }
            });
            if (!TextUtils.isEmpty(str)) {
                expProfileLoopWheelTypeData.selectItem1 = str;
            }
        }
        setData(expProfileLoopWheelTypeData);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public String getPageId() {
        return "p_edit_height";
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public String getPageName() {
        return "height";
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public boolean hasInfoExist(User user, LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType) {
        return (jyb.m147479J(user.profile.extensions.physical.height) || TextUtils.isEmpty(user.profile.extensions.physical.height.get(0)) || TextUtils.equals(user.profile.extensions.physical.height.get(0), CoreModule.f18263b.getString(R$string.f19066Zj))) ? false : true;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public boolean hasWheelDataChanged(User user) {
        if (jyb.m147479J(user.profile.extensions.physical.height)) {
            return true;
        }
        return !TextUtils.equals(user.profile.extensions.physical.height.get(0) + CoreStaticData.FriendPurposeDataType.HEIGHT_UNIT_STR, getData().getWheelType().selectItem1);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public void saveUserInfo(User user) {
        super.saveUserInfo(user);
        String str = getData().getWheelType().selectItem1;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strReplace = str.replace(CoreStaticData.FriendPurposeDataType.HEIGHT_UNIT_STR, "");
        user.profile.extensions.physical.height = jyb.m147507f0(strReplace);
    }
}
