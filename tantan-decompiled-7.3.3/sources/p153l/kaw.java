package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget.LoveBuzzMatchView;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class kaw {
    /* JADX INFO: renamed from: a */
    public static void m148995a(LoveBuzzMatchView loveBuzzMatchView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        loveBuzzMatchView._match_anim = (SVGAnimationView) viewGroup.getChildAt(0);
        loveBuzzMatchView._match_title = (VText) viewGroup.getChildAt(1);
        loveBuzzMatchView._match_sub_title = (VText) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m148996b(LoveBuzzMatchView loveBuzzMatchView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(mec0.f136483r, viewGroup, true);
        m148995a(loveBuzzMatchView, viewInflate);
        return viewInflate;
    }
}
