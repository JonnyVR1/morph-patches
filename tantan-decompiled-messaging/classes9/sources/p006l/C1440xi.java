package p006l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountCameraMenuView;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountCameraPhotoControlView;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountRecordButton;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountRedDotView;

/* JADX INFO: renamed from: l.xi */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C1440xi {
    /* JADX INFO: renamed from: a */
    public static void m27265a(AccountCameraPhotoControlView accountCameraPhotoControlView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        accountCameraPhotoControlView.f761a = (AccountRecordButton) viewGroup.getChildAt(0);
        accountCameraPhotoControlView.f762b = viewGroup.getChildAt(1);
        accountCameraPhotoControlView.f763c = (AccountCameraMenuView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        accountCameraPhotoControlView.f764d = (AccountRedDotView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        accountCameraPhotoControlView.f765e = (AccountCameraMenuView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
    }
}
