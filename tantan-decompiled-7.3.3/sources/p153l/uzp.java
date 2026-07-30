package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.base.view.EmptyView;

/* JADX INFO: loaded from: classes4.dex */
public class uzp {
    /* JADX INFO: renamed from: a */
    public static void m198850a(tzp tzpVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        tzpVar.f176788a = viewGroup.getChildAt(0);
        tzpVar.f176789b = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        tzpVar.f176790c = (RecyclerView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        tzpVar.f176791d = (EmptyView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m198851b(tzp tzpVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f198787I, viewGroup, false);
        m198850a(tzpVar, viewInflate);
        return viewInflate;
    }
}
