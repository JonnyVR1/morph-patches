package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.account.view.AccountView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class f10 {
    /* JADX INFO: renamed from: a */
    public static void m6362a(AccountView accountView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        accountView.a = (FrameLayout) viewGroup.getChildAt(0);
        accountView.b = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        accountView.c = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        accountView.d = (TextView) viewGroup.getChildAt(1);
        accountView.e = (LinearLayout) viewGroup.getChildAt(2);
    }
}
