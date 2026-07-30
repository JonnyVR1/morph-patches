package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.core.p058ui.profile.views.ProfileLoopActionLayout;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class sna0 {
    /* JADX INFO: renamed from: a */
    public static void m186885a(rna0 rna0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        rna0Var.f163961a = (VLinear) viewGroup.getChildAt(0);
        rna0Var.f163962b = (VText) viewGroup.getChildAt(1);
        rna0Var.f163963c = (VText) viewGroup.getChildAt(2);
        rna0Var.f163964d = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        rna0Var.f163965e = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        rna0Var.f163966f = (ProfileLoopActionLayout) viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m186886b(rna0 rna0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(sec0.f167500A0, viewGroup, false);
        m186885a(rna0Var, viewInflate);
        return viewInflate;
    }
}
