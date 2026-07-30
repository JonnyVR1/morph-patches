package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.account.p055ui.camera.view.AccountCameraMenuView;
import com.p051p1.mobile.putong.account.p055ui.camera.view.AccountCameraVideoControlView;
import com.p051p1.mobile.putong.account.p055ui.camera.view.AccountRecordButton;
import com.p051p1.mobile.putong.account.p055ui.camera.view.AccountRedDotView;
import p151v.VFrame;

/* JADX INFO: renamed from: l.vj */
/* JADX INFO: loaded from: classes9.dex */
public class C20845vj {
    /* JADX INFO: renamed from: a */
    public static void m201428a(AccountCameraVideoControlView accountCameraVideoControlView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        accountCameraVideoControlView.f17497a = (AccountRecordButton) viewGroup.getChildAt(0);
        accountCameraVideoControlView.f17498b = (VFrame) viewGroup.getChildAt(1);
        accountCameraVideoControlView.f17499c = (AccountCameraMenuView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        accountCameraVideoControlView.f17500d = (AccountRedDotView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        accountCameraVideoControlView.f17501e = (AccountCameraMenuView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        accountCameraVideoControlView.f17502f = (LinearLayout) viewGroup.getChildAt(3);
        accountCameraVideoControlView.f17503g = (ImageView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        accountCameraVideoControlView.f17504h = (ImageView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
    }
}
