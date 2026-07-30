package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.account.view.AccountViewV2;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class e10 {
    /* JADX INFO: renamed from: a */
    public static void m114357a(AccountViewV2 accountViewV2, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        accountViewV2.f28271a = (FrameLayout) viewGroup.getChildAt(0);
        accountViewV2.f28272b = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        accountViewV2.f28273c = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        accountViewV2.f28274d = (TextView) viewGroup.getChildAt(1);
        accountViewV2.f28275e = (TextView) viewGroup.getChildAt(2);
    }
}
