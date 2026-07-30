package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.p1.mobile.putong.core.ui.lovebuzz.widget.BuzzProgressBar;
import l.h6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class cp3 {
    /* JADX INFO: renamed from: a */
    public static void m5988a(BuzzProgressBar buzzProgressBar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        buzzProgressBar.a = (ProgressBar) viewGroup.getChildAt(0);
        buzzProgressBar.b = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m5989b(BuzzProgressBar buzzProgressBar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(h6c0.j, viewGroup, true);
        m5988a(buzzProgressBar, viewInflate);
        return viewInflate;
    }
}
