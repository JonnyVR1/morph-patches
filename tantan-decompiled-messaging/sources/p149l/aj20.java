package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.feed.newui.mediapicker.EditTextInScrollView;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class aj20 {
    /* JADX INFO: renamed from: a */
    public static void m96967a(zi20 zi20Var, View view) {
        zi20Var.f203252a = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        zi20Var.f203253b = (EditTextInScrollView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        zi20Var.f203254c = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        zi20Var.f203255d = (RecyclerView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        zi20Var.f203256e = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        zi20Var.f203257f = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(3);
        zi20Var.f203258g = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(4);
        zi20Var.f203259h = (VText) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m96968b(zi20 zi20Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142172c5, viewGroup, false);
        m96967a(zi20Var, viewInflate);
        return viewInflate;
    }
}
