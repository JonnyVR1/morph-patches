package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.base.view.EmptyView;
import p151v.VFrame;
import p151v.VSwitch;

/* JADX INFO: loaded from: classes4.dex */
public class mpk0 {
    /* JADX INFO: renamed from: a */
    public static void m159371a(lpk0 lpk0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        lpk0Var.f133068a = (TextView) viewGroup.getChildAt(0);
        lpk0Var.f133069b = (TextView) viewGroup.getChildAt(1);
        lpk0Var.f133070c = (VFrame) viewGroup.getChildAt(2);
        lpk0Var.f133071d = (VSwitch) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        lpk0Var.f133072e = (RecyclerView) viewGroup.getChildAt(3);
        lpk0Var.f133073f = (EmptyView) viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m159372b(lpk0 lpk0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199271u7, viewGroup, false);
        m159371a(lpk0Var, viewInflate);
        return viewInflate;
    }
}
