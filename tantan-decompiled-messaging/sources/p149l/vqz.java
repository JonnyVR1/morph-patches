package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class vqz {
    /* JADX INFO: renamed from: a */
    public static void m199608a(tqz tqzVar, View view) {
        tqzVar.f171717a = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        tqzVar.f171719b = (RelativeLayout) viewGroup.getChildAt(0);
        tqzVar.f171721c = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        tqzVar.f171723d = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        tqzVar.f171725e = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        tqzVar.f171727f = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        tqzVar.f171729g = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        tqzVar.f171731h = (SVGAnimationView) viewGroup.getChildAt(1);
    }
}
