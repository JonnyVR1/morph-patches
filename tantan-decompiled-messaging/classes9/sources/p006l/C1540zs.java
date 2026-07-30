package p006l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p000p1.mobile.putong.account.p002ui.mediapicker.impl.AccountMediaItemView;

/* JADX INFO: renamed from: l.zs */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C1540zs {
    /* JADX INFO: renamed from: a */
    public static void m28813a(AccountMediaItemView accountMediaItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        accountMediaItemView.f995a = viewGroup.getChildAt(0);
        accountMediaItemView.f996b = (ImageView) viewGroup.getChildAt(1);
        accountMediaItemView.f997c = viewGroup.getChildAt(2);
        accountMediaItemView.f998d = viewGroup.getChildAt(3);
        accountMediaItemView.f999e = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
    }
}
