package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.account.AccountModule;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.util.MediaWrapper;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class tvc0 implements s0y {
    @Override // p153l.s0y
    /* JADX INFO: renamed from: a */
    public boolean mo99892a(Act act, MediaWrapper mediaWrapper, MediaPickerParamsObject mediaPickerParamsObject) {
        if (!mediaWrapper.isImageSelected() || !NullChecker.m82486a(mediaWrapper.getFirstMedia())) {
            return false;
        }
        AccountModule.m29130F().openLoginUiOptCropAct(act, oki.m168038z(((Picture) mediaWrapper.getFirstMedia()).url), true);
        act.lambda$debugItems$19();
        act.overridePendingTransition(0, 0);
        return true;
    }
}
