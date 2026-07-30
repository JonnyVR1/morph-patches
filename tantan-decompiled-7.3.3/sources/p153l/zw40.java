package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.base.view.LiveFadeRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class zw40 {
    /* JADX INFO: renamed from: a */
    public static void m221855a(yw40 yw40Var, View view) {
        yw40Var._tip_and_service = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        yw40Var._input_chat_tip_list = (LiveFadeRecyclerView) viewGroup.getChildAt(0);
        yw40Var._service = (FrameLayout) viewGroup.getChildAt(1);
        yw40Var._service_text = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        yw40Var._service_red_dot = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
