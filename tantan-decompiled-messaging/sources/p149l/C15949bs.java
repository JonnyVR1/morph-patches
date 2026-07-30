package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p046p1.mobile.putong.account.p050ui.camera.view.AccountMakeupItemView;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: renamed from: l.bs */
/* JADX INFO: loaded from: classes9.dex */
public class C15949bs {
    /* JADX INFO: renamed from: a */
    public static void m103607a(AccountMakeupItemView accountMakeupItemView, View view) {
        accountMakeupItemView.f16858a = (AccountMakeupItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        accountMakeupItemView.f16859b = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        accountMakeupItemView.f16860c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        accountMakeupItemView.f16861d = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        accountMakeupItemView.f16862e = (VText) viewGroup.getChildAt(1);
        accountMakeupItemView.f16863f = (TextView) viewGroup.getChildAt(2);
    }
}
