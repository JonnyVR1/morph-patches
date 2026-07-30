package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.main.TitleSwitcher;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class vri0 {
    /* JADX INFO: renamed from: a */
    public static void m10270a(TitleSwitcher titleSwitcher, View view) {
        titleSwitcher.a = ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m10271b(TitleSwitcher titleSwitcher, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.H3, viewGroup, false);
        m10270a(titleSwitcher, viewInflate);
        return viewInflate;
    }
}
