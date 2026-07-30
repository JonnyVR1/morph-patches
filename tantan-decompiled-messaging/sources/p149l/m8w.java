package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.widget.LoveBuzzMatchView;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class m8w {
    /* JADX INFO: renamed from: a */
    public static void m153513a(LoveBuzzMatchView loveBuzzMatchView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        loveBuzzMatchView._match_anim = (SVGAnimationView) viewGroup.getChildAt(0);
        loveBuzzMatchView._match_title = (VText) viewGroup.getChildAt(1);
        loveBuzzMatchView._match_sub_title = (VText) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m153514b(LoveBuzzMatchView loveBuzzMatchView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(h6c0.f106041r, viewGroup, true);
        m153513a(loveBuzzMatchView, viewInflate);
        return viewInflate;
    }
}
