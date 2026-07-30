package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.base.view.EmptyView;

/* JADX INFO: loaded from: classes4.dex */
public class uxp {
    /* JADX INFO: renamed from: a */
    public static void m196193a(txp txpVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        txpVar.f172518a = viewGroup.getChildAt(0);
        txpVar.f172519b = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        txpVar.f172520c = (RecyclerView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        txpVar.f172521d = (EmptyView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m196194b(txp txpVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168055I, viewGroup, false);
        m196193a(txpVar, viewInflate);
        return viewInflate;
    }
}
