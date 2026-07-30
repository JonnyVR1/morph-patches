package p006l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountCameraMaskItemView;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountRedDotView;

/* JADX INFO: renamed from: l.mi */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C1012mi {
    /* JADX INFO: renamed from: a */
    public static void m19262a(AccountCameraMaskItemView accountCameraMaskItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        accountCameraMaskItemView.f749a = viewGroup.getChildAt(0);
        accountCameraMaskItemView.f750b = (AccountRedDotView) viewGroup.getChildAt(1);
        accountCameraMaskItemView.f751c = viewGroup.getChildAt(2);
        accountCameraMaskItemView.f752d = (ImageView) viewGroup.getChildAt(3);
    }
}
