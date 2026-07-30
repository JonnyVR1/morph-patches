package p006l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountMakeupDownloadItemView;

/* JADX INFO: renamed from: l.zr */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C1539zr {
    /* JADX INFO: renamed from: a */
    public static void m28792a(AccountMakeupDownloadItemView accountMakeupDownloadItemView, View view) {
        accountMakeupDownloadItemView.f840a = (AccountMakeupDownloadItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        accountMakeupDownloadItemView.f841b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        accountMakeupDownloadItemView.f842c = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        accountMakeupDownloadItemView.f843d = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        accountMakeupDownloadItemView.f844e = viewGroup.getChildAt(1);
        accountMakeupDownloadItemView.f845f = viewGroup.getChildAt(2);
    }
}
