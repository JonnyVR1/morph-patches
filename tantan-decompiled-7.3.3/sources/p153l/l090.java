package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.newui.customized.result.PrivateCustomResultUserHeaderView;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class l090 {
    /* JADX INFO: renamed from: a */
    public static void m152324a(PrivateCustomResultUserHeaderView privateCustomResultUserHeaderView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privateCustomResultUserHeaderView._custom_layout = (RelativeLayout) viewGroup.getChildAt(0);
        privateCustomResultUserHeaderView._custom_layout_rl_content = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        privateCustomResultUserHeaderView._custom_layout_rl_content_title = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        privateCustomResultUserHeaderView._custom_layout_rl_content_subtitle = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        privateCustomResultUserHeaderView._custom_layout_image = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        privateCustomResultUserHeaderView._empty = (VLinear) viewGroup.getChildAt(1);
        privateCustomResultUserHeaderView._empty_tip = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
