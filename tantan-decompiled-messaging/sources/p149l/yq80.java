package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.newui.customized.result.PrivateCustomResultCountDownView;

/* JADX INFO: loaded from: classes10.dex */
public class yq80 {
    /* JADX INFO: renamed from: a */
    public static void m215714a(PrivateCustomResultCountDownView privateCustomResultCountDownView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privateCustomResultCountDownView._rl_content = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        privateCustomResultCountDownView._rl_content_title = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        privateCustomResultCountDownView._rl_content_tv_hour = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        privateCustomResultCountDownView._rl_content_tv_minute = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(2);
        privateCustomResultCountDownView._rl_content_tv_second = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(4);
        privateCustomResultCountDownView._image = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
