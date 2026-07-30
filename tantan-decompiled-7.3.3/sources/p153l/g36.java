package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.base.view.EmptyView;

/* JADX INFO: loaded from: classes4.dex */
public class g36 {
    /* JADX INFO: renamed from: a */
    public static void m128712a(f36 f36Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        f36Var.f96949a = viewGroup.getChildAt(0);
        f36Var.f96950b = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        f36Var.f96951c = (RecyclerView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        f36Var.f96952d = (EmptyView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m128713b(f36 f36Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f198751F, viewGroup, false);
        m128712a(f36Var, viewInflate);
        return viewInflate;
    }
}
