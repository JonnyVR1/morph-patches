package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p046p1.mobile.putong.account.p050ui.camera.view.AccountMakeupDownloadItemView;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: renamed from: l.zr */
/* JADX INFO: loaded from: classes9.dex */
public class C21756zr {
    /* JADX INFO: renamed from: a */
    public static void m219914a(AccountMakeupDownloadItemView accountMakeupDownloadItemView, View view) {
        accountMakeupDownloadItemView.f16851a = (AccountMakeupDownloadItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        accountMakeupDownloadItemView.f16852b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        accountMakeupDownloadItemView.f16853c = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        accountMakeupDownloadItemView.f16854d = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        accountMakeupDownloadItemView.f16855e = (VText) viewGroup.getChildAt(1);
        accountMakeupDownloadItemView.f16856f = (VText) viewGroup.getChildAt(2);
    }
}
