package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.base.view.EmptyView;

/* JADX INFO: loaded from: classes4.dex */
public class b26 {
    /* JADX INFO: renamed from: a */
    public static void m99898a(a26 a26Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        a26Var.f67230a = viewGroup.getChildAt(0);
        a26Var.f67231b = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        a26Var.f67232c = (RecyclerView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        a26Var.f67233d = (EmptyView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m99899b(a26 a26Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168019F, viewGroup, false);
        m99898a(a26Var, viewInflate);
        return viewInflate;
    }
}
