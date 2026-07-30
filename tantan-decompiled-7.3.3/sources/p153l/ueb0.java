package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ueb0 {
    /* JADX INFO: renamed from: a */
    public static void m195746a(teb0 teb0Var, View view) {
        teb0Var._guide_svip_root = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        teb0Var._guide_svip_title = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        teb0Var._guide_svip_subtitle = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        teb0Var._guide_svip_button = (VText) viewGroup.getChildAt(1);
    }
}
