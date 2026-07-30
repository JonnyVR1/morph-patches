package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class q6b0 {
    /* JADX INFO: renamed from: a */
    public static void m173127a(p6b0 p6b0Var, View view) {
        p6b0Var._guide_svip_root = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        p6b0Var._guide_svip_title = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        p6b0Var._guide_svip_subtitle = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        p6b0Var._guide_svip_button = (VText) viewGroup.getChildAt(1);
    }
}
