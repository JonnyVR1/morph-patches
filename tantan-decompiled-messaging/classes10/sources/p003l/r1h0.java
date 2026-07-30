package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.newui.supreme.SupremeUserHeaderView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class r1h0 {
    /* JADX INFO: renamed from: a */
    public static void m9071a(SupremeUserHeaderView supremeUserHeaderView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        supremeUserHeaderView.a = (RelativeLayout) viewGroup.getChildAt(0);
        supremeUserHeaderView.b = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        supremeUserHeaderView.c = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        supremeUserHeaderView.d = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        supremeUserHeaderView.e = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        supremeUserHeaderView.f = viewGroup.getChildAt(1);
        supremeUserHeaderView.g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
