package p006l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountMakeupItemView;

/* JADX INFO: renamed from: l.bs */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0574bs {
    /* JADX INFO: renamed from: a */
    public static void m12896a(AccountMakeupItemView accountMakeupItemView, View view) {
        accountMakeupItemView.f847a = (AccountMakeupItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        accountMakeupItemView.f848b = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        accountMakeupItemView.f849c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        accountMakeupItemView.f850d = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        accountMakeupItemView.f851e = viewGroup.getChildAt(1);
        accountMakeupItemView.f852f = (TextView) viewGroup.getChildAt(2);
    }
}
