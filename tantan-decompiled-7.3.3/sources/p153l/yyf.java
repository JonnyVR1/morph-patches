package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.newui.fake.DialogC7996a;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class yyf {
    /* JADX INFO: renamed from: a */
    public static void m217969a(DialogC7996a dialogC7996a, View view) {
        dialogC7996a.f22179a = (RelativeLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        dialogC7996a.f22180b = (ImageView) viewGroup.getChildAt(0);
        dialogC7996a.f22181c = (SVGAnimationView) viewGroup.getChildAt(1);
        dialogC7996a.f22182d = (SVGAnimationView) viewGroup.getChildAt(2);
        dialogC7996a.f22183e = (SVGAnimationView) viewGroup.getChildAt(3);
        dialogC7996a.f22184f = (VText) viewGroup.getChildAt(4);
        dialogC7996a.f22185g = (TextView) viewGroup.getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m217970b(DialogC7996a dialogC7996a, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125909k3, viewGroup, false);
        m217969a(dialogC7996a, viewInflate);
        return viewInflate;
    }
}
