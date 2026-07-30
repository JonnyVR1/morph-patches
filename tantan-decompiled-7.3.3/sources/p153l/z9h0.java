package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.newui.supreme.SupremeUserHeaderView;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class z9h0 {
    /* JADX INFO: renamed from: a */
    public static void m219076a(SupremeUserHeaderView supremeUserHeaderView, View view) {
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
