package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p051p1.mobile.putong.account.p055ui.camera.view.AccountCameraMaskItemView;
import com.p051p1.mobile.putong.account.p055ui.camera.view.AccountRedDotView;
import p151v.VDraweeView;

/* JADX INFO: renamed from: l.hi */
/* JADX INFO: loaded from: classes9.dex */
public class C17464hi {
    /* JADX INFO: renamed from: a */
    public static void m135082a(AccountCameraMaskItemView accountCameraMaskItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        accountCameraMaskItemView.f17479a = (VDraweeView) viewGroup.getChildAt(0);
        accountCameraMaskItemView.f17480b = (AccountRedDotView) viewGroup.getChildAt(1);
        accountCameraMaskItemView.f17481c = viewGroup.getChildAt(2);
        accountCameraMaskItemView.f17482d = (ImageView) viewGroup.getChildAt(3);
    }
}
