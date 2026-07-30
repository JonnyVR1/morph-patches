package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget.BuzzProgressBar;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class cq3 {
    /* JADX INFO: renamed from: a */
    public static void m111878a(BuzzProgressBar buzzProgressBar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        buzzProgressBar._buzz_progress = (ProgressBar) viewGroup.getChildAt(0);
        buzzProgressBar._progress_content = (VText) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m111879b(BuzzProgressBar buzzProgressBar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(mec0.f136475j, viewGroup, true);
        m111878a(buzzProgressBar, viewInflate);
        return viewInflate;
    }
}
