package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p051p1.mobile.putong.account.p055ui.camera.view.AccountMakeupDownloadItemView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: renamed from: l.tr */
/* JADX INFO: loaded from: classes9.dex */
public class C20379tr {
    /* JADX INFO: renamed from: a */
    public static void m192382a(AccountMakeupDownloadItemView accountMakeupDownloadItemView, View view) {
        accountMakeupDownloadItemView.f17570a = (AccountMakeupDownloadItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        accountMakeupDownloadItemView.f17571b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        accountMakeupDownloadItemView.f17572c = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        accountMakeupDownloadItemView.f17573d = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        accountMakeupDownloadItemView.f17574e = (VText) viewGroup.getChildAt(1);
        accountMakeupDownloadItemView.f17575f = (VText) viewGroup.getChildAt(2);
    }
}
