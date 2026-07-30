package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.feed.newui.mediapicker.EditTextInScrollView;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class kr20 {
    /* JADX INFO: renamed from: a */
    public static void m150974a(jr20 jr20Var, View view) {
        jr20Var.f122277a = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        jr20Var.f122278b = (EditTextInScrollView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        jr20Var.f122279c = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        jr20Var.f122280d = (RecyclerView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        jr20Var.f122281e = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        jr20Var.f122282f = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(3);
        jr20Var.f122283g = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(4);
        jr20Var.f122284h = (VText) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m150975b(jr20 jr20Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173641c5, viewGroup, false);
        m150974a(jr20Var, viewInflate);
        return viewInflate;
    }
}
