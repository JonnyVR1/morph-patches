package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes13.dex */
public class smg {
    /* JADX INFO: renamed from: a */
    public static void m186816a(rmg rmgVar, View view) {
        rmgVar.f163867o = (LinearLayout) view;
        rmgVar.f163868p = (FrameLayout) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m186817b(rmg rmgVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173599W1, viewGroup, false);
        m186816a(rmgVar, viewInflate);
        return viewInflate;
    }
}
