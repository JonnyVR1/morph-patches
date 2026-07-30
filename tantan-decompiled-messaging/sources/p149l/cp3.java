package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.widget.BuzzProgressBar;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class cp3 {
    /* JADX INFO: renamed from: a */
    public static void m108049a(BuzzProgressBar buzzProgressBar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        buzzProgressBar._buzz_progress = (ProgressBar) viewGroup.getChildAt(0);
        buzzProgressBar._progress_content = (VText) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m108050b(BuzzProgressBar buzzProgressBar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(h6c0.f106033j, viewGroup, true);
        m108049a(buzzProgressBar, viewInflate);
        return viewInflate;
    }
}
