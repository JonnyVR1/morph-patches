package com.p051p1.mobile.putong.core.p058ui.profile.exploop.item;

import com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem.ExpProfileLoopUploadImageTypeData;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopFragmentFactory;
import com.p051p1.mobile.putong.data.User;
import p153l.jyb;

/* JADX INFO: loaded from: classes4.dex */
public class ExpLoopInputMyLife extends ExpLoopInputType {
    public ExpLoopInputMyLife() {
        super(24, "请上传至少3张照片", ExpLoopInputType.ICON_MY_LIFE, 6);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public void fillInputContentData(User user, ExpProfileEditLoopBaseFrag expProfileEditLoopBaseFrag) {
        ExpProfileLoopUploadImageTypeData expProfileLoopUploadImageTypeData = new ExpProfileLoopUploadImageTypeData();
        expProfileLoopUploadImageTypeData.pictures = user.pictures;
        expProfileLoopUploadImageTypeData.needCount = 3;
        setData(expProfileLoopUploadImageTypeData);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public String getPageId() {
        return "p_upload_photos";
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public String getPageName() {
        return "my_lift";
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public boolean hasInfoExist(User user, LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType) {
        return !jyb.m147479J(user.pictures) && user.pictures.size() >= 3;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public void saveUserInfo(User user) {
        ExpProfileLoopUploadImageTypeData imageType = getData().getImageType();
        if (imageType.getImageType().pictures.size() > 0) {
            user.pictures = imageType.pictures;
        }
    }
}
