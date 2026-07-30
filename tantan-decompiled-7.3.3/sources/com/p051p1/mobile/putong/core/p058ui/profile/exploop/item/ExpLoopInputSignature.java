package com.p051p1.mobile.putong.core.p058ui.profile.exploop.item;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem.ExpProfileLoopTextTypeData;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopFragmentFactory;
import com.p051p1.mobile.putong.data.User;
import p153l.jyb;

/* JADX INFO: loaded from: classes4.dex */
public class ExpLoopInputSignature extends ExpLoopInputType {
    private int needCount;

    public ExpLoopInputSignature() {
        super(14, "简单介绍下自己", ExpLoopInputType.ICON_SIGNATURE, 1014);
        this.needCount = 0;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public void fillInputContentData(User user, ExpProfileEditLoopBaseFrag expProfileEditLoopBaseFrag) {
        ExpProfileLoopTextTypeData needCount = new ExpProfileLoopTextTypeData(user.description, "自我介绍一下...").setMaxCount(500).setNeedCount(this.needCount);
        if (user.isFemale()) {
            needCount.text3 = "本科重庆双非，未来四到五年会在北京读博。爱好羽毛球、桌游，偶尔晨跑或游泳。希望认识一个可以认真恋爱的男孩，一起分享美好。";
        } else {
            needCount.text3 = "情绪稳定，有事业心。平时喜欢打篮球、羽毛球，有时间会去旅游打卡。希望认识一个乐观善良、有共同话题的女孩。";
        }
        setData(needCount);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public String getPageId() {
        return "p_edit_self_introduction_view";
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public String getPageName() {
        return "self_introduction";
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public boolean hasInfoExist(User user, LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType) {
        if (loopCreateEntryType == LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_PICKS) {
            return !TextUtils.isEmpty(user.description) && user.description.length() >= this.needCount && TextUtils.isEmpty(CoreModule.f18264c.f20419q2.m197489n3());
        }
        return !TextUtils.isEmpty(user.description);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public void saveUserInfo(User user) {
        super.saveUserInfo(user);
        user.description = jyb.m147516k(getData().getTextType().text1.trim());
    }

    public ExpLoopInputSignature setNeedCount(int i) {
        this.needCount = i;
        return this;
    }
}
