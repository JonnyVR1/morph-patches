package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.account.AccountModule;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.util.MediaWrapper;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class onc0 implements vrx {
    @Override // p149l.vrx
    /* JADX INFO: renamed from: a */
    public boolean mo95873a(Act act, MediaWrapper mediaWrapper, MediaPickerParamsObject mediaPickerParamsObject) {
        if (!mediaWrapper.isImageSelected() || !NullChecker.m81303a(mediaWrapper.getFirstMedia())) {
            return false;
        }
        AccountModule.m28131F().openLoginUiOptCropAct(act, rhi.m179382z(((Picture) mediaWrapper.getFirstMedia()).url), true);
        act.lambda$debugItems$19();
        act.overridePendingTransition(0, 0);
        return true;
    }
}
