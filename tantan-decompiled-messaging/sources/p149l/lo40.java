package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.base.view.LiveFadeRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class lo40 {
    /* JADX INFO: renamed from: a */
    public static void m150761a(ko40 ko40Var, View view) {
        ko40Var._tip_and_service = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ko40Var._input_chat_tip_list = (LiveFadeRecyclerView) viewGroup.getChildAt(0);
        ko40Var._service = (FrameLayout) viewGroup.getChildAt(1);
        ko40Var._service_text = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        ko40Var._service_red_dot = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
