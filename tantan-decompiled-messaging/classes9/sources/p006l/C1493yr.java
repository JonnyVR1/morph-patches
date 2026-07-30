package p006l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountMakeUpMenuView;

/* JADX INFO: renamed from: l.yr */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C1493yr {
    /* JADX INFO: renamed from: a */
    public static void m28324a(AccountMakeUpMenuView accountMakeUpMenuView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        accountMakeUpMenuView.f812a = viewGroup.getChildAt(0);
        accountMakeUpMenuView.f813b = viewGroup.getChildAt(1);
        accountMakeUpMenuView.f814c = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        accountMakeUpMenuView.f815d = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        accountMakeUpMenuView.f816e = viewGroup.getChildAt(3);
    }
}
