package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.account.p050ui.camera.view.AccountCameraMenuView;
import com.p046p1.mobile.putong.account.p050ui.camera.view.AccountCameraVideoControlView;
import com.p046p1.mobile.putong.account.p050ui.camera.view.AccountRecordButton;
import com.p046p1.mobile.putong.account.p050ui.camera.view.AccountRedDotView;
import p147v.VFrame;

/* JADX INFO: renamed from: l.ak */
/* JADX INFO: loaded from: classes9.dex */
public class C15643ak {
    /* JADX INFO: renamed from: a */
    public static void m97094a(AccountCameraVideoControlView accountCameraVideoControlView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        accountCameraVideoControlView.f16778a = (AccountRecordButton) viewGroup.getChildAt(0);
        accountCameraVideoControlView.f16779b = (VFrame) viewGroup.getChildAt(1);
        accountCameraVideoControlView.f16780c = (AccountCameraMenuView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        accountCameraVideoControlView.f16781d = (AccountRedDotView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        accountCameraVideoControlView.f16782e = (AccountCameraMenuView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        accountCameraVideoControlView.f16783f = (LinearLayout) viewGroup.getChildAt(3);
        accountCameraVideoControlView.f16784g = (ImageView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        accountCameraVideoControlView.f16785h = (ImageView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
    }
}
