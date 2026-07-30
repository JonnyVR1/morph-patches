package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.account.p050ui.camera.view.AccountCameraMenuView;
import com.p046p1.mobile.putong.account.p050ui.camera.view.AccountCameraPhotoControlView;
import com.p046p1.mobile.putong.account.p050ui.camera.view.AccountRecordButton;
import com.p046p1.mobile.putong.account.p050ui.camera.view.AccountRedDotView;
import p147v.VFrame;

/* JADX INFO: renamed from: l.xi */
/* JADX INFO: loaded from: classes9.dex */
public class C21154xi {
    /* JADX INFO: renamed from: a */
    public static void m208909a(AccountCameraPhotoControlView accountCameraPhotoControlView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        accountCameraPhotoControlView.f16772a = (AccountRecordButton) viewGroup.getChildAt(0);
        accountCameraPhotoControlView.f16773b = (VFrame) viewGroup.getChildAt(1);
        accountCameraPhotoControlView.f16774c = (AccountCameraMenuView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        accountCameraPhotoControlView.f16775d = (AccountRedDotView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        accountCameraPhotoControlView.f16776e = (AccountCameraMenuView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
    }
}
