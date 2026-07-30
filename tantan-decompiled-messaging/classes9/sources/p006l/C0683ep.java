package p006l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p000p1.mobile.putong.account.p002ui.mediapicker.impl.AccountFolderItemView;

/* JADX INFO: renamed from: l.ep */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0683ep {
    /* JADX INFO: renamed from: a */
    public static void m14754a(AccountFolderItemView accountFolderItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        accountFolderItemView.f989a = viewGroup.getChildAt(0);
        accountFolderItemView.f990b = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        accountFolderItemView.f991c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        accountFolderItemView.f992d = (ImageView) viewGroup.getChildAt(2);
    }
}
