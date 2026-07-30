package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.account.view.AccountViewV2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class e10 {
    /* JADX INFO: renamed from: a */
    public static void m6232a(AccountViewV2 accountViewV2, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        accountViewV2.a = (FrameLayout) viewGroup.getChildAt(0);
        accountViewV2.b = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        accountViewV2.c = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        accountViewV2.d = (TextView) viewGroup.getChildAt(1);
        accountViewV2.e = (TextView) viewGroup.getChildAt(2);
    }
}
