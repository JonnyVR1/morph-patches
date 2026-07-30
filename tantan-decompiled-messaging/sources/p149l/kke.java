package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.view.CommonLabelShowView;
import p147v.VLinear_Dividers;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class kke {
    /* JADX INFO: renamed from: a */
    public static void m146317a(jke jkeVar, View view) {
        jkeVar.f118366u = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        jkeVar.f118367v = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        jkeVar.f118368w = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        jkeVar.f118369x = (LinearLayout) viewGroup.getChildAt(1);
        jkeVar.f118370y = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        jkeVar.f118371z = (CommonLabelShowView) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m146318b(jke jkeVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95420J9, viewGroup, false);
        m146317a(jkeVar, viewInflate);
        return viewInflate;
    }
}
