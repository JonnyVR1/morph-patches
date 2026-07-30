package com.p051p1.mobile.putong.core.p058ui.profile.exploop.item;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem.ExpProfileLoopSelectTypeData;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputDrinking;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopFragmentFactory;
import com.p051p1.mobile.putong.core.util.FriendPurposeHelper;
import com.p051p1.mobile.putong.data.Extensions;
import com.p051p1.mobile.putong.data.Physical;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p153l.jyb;
import p153l.qcj;
import p153l.y20;

/* JADX INFO: loaded from: classes4.dex */
public class ExpLoopInputDrinking extends ExpLoopInputType {
    public ExpLoopInputDrinking() {
        super(3, "你喝酒吗?", ExpLoopInputType.ICON_DRINKING, 1);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m52586a(String str, ArrayList arrayList, FriendPurposeHelper.DrinkType drinkType) {
        if (drinkType != FriendPurposeHelper.DrinkType.not_reveal) {
            String strName = drinkType.name();
            arrayList.add(new ExpProfileLoopSelectTypeData.ItemData(strName, FriendPurposeHelper.DrinkType.getDes(strName), TextUtils.equals(strName, str)));
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public void fillInputContentData(User user, ExpProfileEditLoopBaseFrag expProfileEditLoopBaseFrag) {
        final String str = (NullChecker.m82486a(user.profile.extensions) && NullChecker.m82486a(user.profile.extensions.physical) && !jyb.m147479J(user.profile.extensions.physical.drink)) ? user.profile.extensions.physical.drink.get(0) : "";
        final ArrayList arrayList = new ArrayList();
        jyb.m147470A(FriendPurposeHelper.DrinkType.values(), new y20() { // from class: l.gff
            @Override // p153l.y20
            public final void call(Object obj) {
                ExpLoopInputDrinking.m52586a(str, arrayList, (FriendPurposeHelper.DrinkType) obj);
            }
        });
        setData(new ExpProfileLoopSelectTypeData(arrayList));
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public String getPageId() {
        return "p_edit_drinking";
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public String getPageName() {
        return "drinking";
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public boolean hasInfoExist(User user, LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType) {
        return (!NullChecker.m82486a(user.profile.extensions.physical) || jyb.m147479J(user.profile.extensions.physical.drink) || TextUtils.isEmpty(user.profile.extensions.physical.drink.get(0))) ? false : true;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public void saveUserInfo(User user) {
        super.saveUserInfo(user);
        ExpProfileLoopSelectTypeData.ItemData itemData = (ExpProfileLoopSelectTypeData.ItemData) jyb.m147529r(getData().getSelectType().list, new qcj() { // from class: l.fff
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((ExpProfileLoopSelectTypeData.ItemData) obj).boolValue);
            }
        });
        Extensions extensions = user.profile.extensions;
        if (extensions.physical == null) {
            extensions.physical = Physical.new_();
        }
        user.profile.extensions.physical.drink.clear();
        if (itemData != null) {
            user.profile.extensions.physical.drink.add(itemData.key);
        }
    }
}
