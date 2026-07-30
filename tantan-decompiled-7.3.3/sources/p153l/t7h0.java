package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.newui.supreme.SupremeCountDownView;

/* JADX INFO: loaded from: classes10.dex */
public class t7h0 {
    /* JADX INFO: renamed from: a */
    public static void m189574a(SupremeCountDownView supremeCountDownView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        supremeCountDownView._rl_content = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        supremeCountDownView._rl_content_title = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        supremeCountDownView._rl_content_tv_hour = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        supremeCountDownView._rl_content_tv_minute = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(2);
        supremeCountDownView._rl_content_tv_second = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(4);
        supremeCountDownView._image = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
