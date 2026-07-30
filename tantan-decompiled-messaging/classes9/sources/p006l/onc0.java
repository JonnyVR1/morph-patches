package p006l;

import com.p000p1.mobile.putong.account.AccountModule;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.util.MediaWrapper;
import com.tantanapp.common.utils.NullChecker;
import l.rhi;
import l.vrx;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class onc0 implements vrx {
    /* JADX INFO: renamed from: a */
    public boolean m20712a(Act act, MediaWrapper mediaWrapper, MediaPickerParamsObject mediaPickerParamsObject) {
        if (!mediaWrapper.isImageSelected() || !NullChecker.a(mediaWrapper.getFirstMedia())) {
            return false;
        }
        AccountModule.m26F().openLoginUiOptCropAct(act, rhi.z(((Media) mediaWrapper.getFirstMedia()).url), true);
        act.finish();
        act.overridePendingTransition(0, 0);
        return true;
    }
}
