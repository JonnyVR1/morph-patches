package com.p000p1.mobile.putong.core.p001ui.profile.exploop.item;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileLoopWheelTypeData;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopFragmentFactory;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.data.User;
import java.util.Iterator;
import java.util.List;
import l.vwb;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ExpLoopInputHeight extends ExpLoopInputType {
    public ExpLoopInputHeight() {
        super(13, "你的身高是?", ExpLoopInputType.ICON_HEIGHT, 3);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType
    public void fillInputContentData(User user, ExpProfileEditLoopBaseFrag expProfileEditLoopBaseFrag) {
        ExpProfileLoopWheelTypeData expProfileLoopWheelTypeData = new ExpProfileLoopWheelTypeData();
        List<String> listZg = CoreModule.o.d().Zg();
        if (expProfileEditLoopBaseFrag.f1106z == LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_PICKS) {
            Iterator<String> it = listZg.iterator();
            while (it.hasNext()) {
                if (TextUtils.equals(it.next(), CoreModule.b.getString(R.string.Dj))) {
                    it.remove();
                }
            }
        }
        final List list = user.profile.extensions.physical.height;
        expProfileLoopWheelTypeData.wheelData1 = listZg;
        expProfileLoopWheelTypeData.selectItem1 = (String) vwb.r(listZg, new w9j() { // from class: l.qef
            public final Object call(Object obj) {
                return Boolean.valueOf(((String) obj).contains("160"));
            }
        });
        if (!vwb.J(list) && !TextUtils.isEmpty((CharSequence) list.get(0))) {
            String str = (String) vwb.r(listZg, new w9j() { // from class: l.ref
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

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType
    public String getPageId() {
        return "p_edit_height";
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType
    public String getPageName() {
        return "height";
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType
    public boolean hasInfoExist(User user, LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType) {
        return (vwb.J(user.profile.extensions.physical.height) || TextUtils.isEmpty((CharSequence) user.profile.extensions.physical.height.get(0)) || TextUtils.equals((CharSequence) user.profile.extensions.physical.height.get(0), CoreModule.b.getString(R.string.Dj))) ? false : true;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType
    public boolean hasWheelDataChanged(User user) {
        if (vwb.J(user.profile.extensions.physical.height)) {
            return true;
        }
        return !TextUtils.equals(((String) user.profile.extensions.physical.height.get(0)) + "cm", getData().getWheelType().selectItem1);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType
    public void saveUserInfo(User user) {
        super.saveUserInfo(user);
        String str = getData().getWheelType().selectItem1;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strReplace = str.replace("cm", "");
        user.profile.extensions.physical.height = vwb.f0(new String[]{strReplace});
    }
}
