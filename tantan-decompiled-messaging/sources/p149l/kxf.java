package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.newui.fake.DialogC7845a;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class kxf {
    /* JADX INFO: renamed from: a */
    public static void m147746a(DialogC7845a dialogC7845a, View view) {
        dialogC7845a.f21437a = (RelativeLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        dialogC7845a.f21438b = (ImageView) viewGroup.getChildAt(0);
        dialogC7845a.f21439c = (SVGAnimationView) viewGroup.getChildAt(1);
        dialogC7845a.f21440d = (SVGAnimationView) viewGroup.getChildAt(2);
        dialogC7845a.f21441e = (SVGAnimationView) viewGroup.getChildAt(3);
        dialogC7845a.f21442f = (VText) viewGroup.getChildAt(4);
        dialogC7845a.f21443g = (TextView) viewGroup.getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m147747b(DialogC7845a dialogC7845a, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95855k3, viewGroup, false);
        m147746a(dialogC7845a, viewInflate);
        return viewInflate;
    }
}
