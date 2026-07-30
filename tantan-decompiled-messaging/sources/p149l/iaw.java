package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tantan.library.svga.SVGAnimationView;

/* JADX INFO: loaded from: classes10.dex */
public class iaw {
    /* JADX INFO: renamed from: a */
    public static void m135205a(haw hawVar, View view) {
        hawVar.f106845j = (FrameLayout) view;
        hawVar.f106846k = (SVGAnimationView) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m135206b(haw hawVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95858k6, viewGroup, false);
        m135205a(hawVar, viewInflate);
        return viewInflate;
    }
}
