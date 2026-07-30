package p006l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountMaskMenuView;

/* JADX INFO: renamed from: l.xs */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C1451xs {
    /* JADX INFO: renamed from: a */
    public static void m27601a(AccountMaskMenuView accountMaskMenuView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        accountMaskMenuView.f878a = viewGroup.getChildAt(0);
        accountMaskMenuView.f879b = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        accountMaskMenuView.f880c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        accountMaskMenuView.f881d = viewGroup.getChildAt(2);
    }
}
