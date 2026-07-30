package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p046p1.mobile.putong.account.p050ui.mediapicker.impl.AccountFolderItemView;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: renamed from: l.ep */
/* JADX INFO: loaded from: classes9.dex */
public class C16653ep {
    /* JADX INFO: renamed from: a */
    public static void m117524a(AccountFolderItemView accountFolderItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        accountFolderItemView.f17000a = (VDraweeView) viewGroup.getChildAt(0);
        accountFolderItemView.f17001b = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        accountFolderItemView.f17002c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        accountFolderItemView.f17003d = (ImageView) viewGroup.getChildAt(2);
    }
}
