package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.account.p055ui.camera.view.AccountCameraMenuView;
import com.p051p1.mobile.putong.account.p055ui.camera.view.AccountCameraPhotoControlView;
import com.p051p1.mobile.putong.account.p055ui.camera.view.AccountRecordButton;
import com.p051p1.mobile.putong.account.p055ui.camera.view.AccountRedDotView;
import p151v.VFrame;

/* JADX INFO: renamed from: l.si */
/* JADX INFO: loaded from: classes9.dex */
public class C20047si {
    /* JADX INFO: renamed from: a */
    public static void m185993a(AccountCameraPhotoControlView accountCameraPhotoControlView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        accountCameraPhotoControlView.f17491a = (AccountRecordButton) viewGroup.getChildAt(0);
        accountCameraPhotoControlView.f17492b = (VFrame) viewGroup.getChildAt(1);
        accountCameraPhotoControlView.f17493c = (AccountCameraMenuView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        accountCameraPhotoControlView.f17494d = (AccountRedDotView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        accountCameraPhotoControlView.f17495e = (AccountCameraMenuView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
    }
}
