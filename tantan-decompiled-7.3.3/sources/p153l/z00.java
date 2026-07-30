package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.account.view.AccountView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class z00 {
    /* JADX INFO: renamed from: a */
    public static void m218098a(AccountView accountView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        accountView.f29113a = (FrameLayout) viewGroup.getChildAt(0);
        accountView.f29114b = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        accountView.f29115c = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        accountView.f29116d = (TextView) viewGroup.getChildAt(1);
        accountView.f29117e = (LinearLayout) viewGroup.getChildAt(2);
    }
}
