package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.account.view.AccountView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class f10 {
    /* JADX INFO: renamed from: a */
    public static void m119059a(AccountView accountView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        accountView.f28265a = (FrameLayout) viewGroup.getChildAt(0);
        accountView.f28266b = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        accountView.f28267c = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        accountView.f28268d = (TextView) viewGroup.getChildAt(1);
        accountView.f28269e = (LinearLayout) viewGroup.getChildAt(2);
    }
}
