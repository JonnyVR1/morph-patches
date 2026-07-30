package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p051p1.mobile.putong.account.p055ui.mediapicker.impl.AccountFolderItemView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: renamed from: l.zo */
/* JADX INFO: loaded from: classes9.dex */
public class C21843zo {
    /* JADX INFO: renamed from: a */
    public static void m220686a(AccountFolderItemView accountFolderItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        accountFolderItemView.f17719a = (VDraweeView) viewGroup.getChildAt(0);
        accountFolderItemView.f17720b = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        accountFolderItemView.f17721c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        accountFolderItemView.f17722d = (ImageView) viewGroup.getChildAt(2);
    }
}
