package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p046p1.mobile.putong.account.p050ui.camera.view.AccountCameraMaskItemView;
import com.p046p1.mobile.putong.account.p050ui.camera.view.AccountRedDotView;
import p147v.VDraweeView;

/* JADX INFO: renamed from: l.mi */
/* JADX INFO: loaded from: classes9.dex */
public class C18459mi {
    /* JADX INFO: renamed from: a */
    public static void m154657a(AccountCameraMaskItemView accountCameraMaskItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        accountCameraMaskItemView.f16760a = (VDraweeView) viewGroup.getChildAt(0);
        accountCameraMaskItemView.f16761b = (AccountRedDotView) viewGroup.getChildAt(1);
        accountCameraMaskItemView.f16762c = viewGroup.getChildAt(2);
        accountCameraMaskItemView.f16763d = (ImageView) viewGroup.getChildAt(3);
    }
}
