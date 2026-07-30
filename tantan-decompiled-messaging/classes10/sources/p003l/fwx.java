package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.profile.MediaReorderCard;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class fwx {
    /* JADX INFO: renamed from: a */
    public static void m6529a(MediaReorderCard mediaReorderCard, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        mediaReorderCard.r = viewGroup.getChildAt(0);
        mediaReorderCard.s = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        mediaReorderCard.t = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        mediaReorderCard.u = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        mediaReorderCard.v = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        mediaReorderCard.w = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        mediaReorderCard.x = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0);
        mediaReorderCard.y = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        mediaReorderCard.z = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
        mediaReorderCard.A = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6)).getChildAt(0)).getChildAt(0);
        mediaReorderCard.B = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6)).getChildAt(2);
        mediaReorderCard.C = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7);
        mediaReorderCard.D = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7)).getChildAt(0);
        mediaReorderCard.E = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7)).getChildAt(1);
        mediaReorderCard.F = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7)).getChildAt(2);
        mediaReorderCard.G = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7)).getChildAt(3);
        mediaReorderCard.H = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(8);
    }
}
