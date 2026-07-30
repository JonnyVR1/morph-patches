package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.newui.supreme.SupremeUserHeaderView;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class r1h0 {
    /* JADX INFO: renamed from: a */
    public static void m177464a(SupremeUserHeaderView supremeUserHeaderView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        supremeUserHeaderView._custom_layout = (RelativeLayout) viewGroup.getChildAt(0);
        supremeUserHeaderView._custom_layout_rl_content = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        supremeUserHeaderView._custom_layout_rl_content_title = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        supremeUserHeaderView._custom_layout_rl_content_subtitle = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        supremeUserHeaderView._custom_layout_image = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        supremeUserHeaderView._empty = (VLinear) viewGroup.getChildAt(1);
        supremeUserHeaderView._empty_tip = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
