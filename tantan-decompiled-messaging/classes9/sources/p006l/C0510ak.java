package p006l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountCameraMenuView;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountCameraVideoControlView;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountRecordButton;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountRedDotView;

/* JADX INFO: renamed from: l.ak */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0510ak {
    /* JADX INFO: renamed from: a */
    public static void m11875a(AccountCameraVideoControlView accountCameraVideoControlView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        accountCameraVideoControlView.f767a = (AccountRecordButton) viewGroup.getChildAt(0);
        accountCameraVideoControlView.f768b = viewGroup.getChildAt(1);
        accountCameraVideoControlView.f769c = (AccountCameraMenuView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        accountCameraVideoControlView.f770d = (AccountRedDotView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        accountCameraVideoControlView.f771e = (AccountCameraMenuView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        accountCameraVideoControlView.f772f = (LinearLayout) viewGroup.getChildAt(3);
        accountCameraVideoControlView.f773g = (ImageView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        accountCameraVideoControlView.f774h = (ImageView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
    }
}
