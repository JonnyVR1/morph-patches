package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.newui.view.ShimmerLayout;
import com.p051p1.mobile.putong.core.p058ui.profile.MediaReorderCard;
import com.p051p1.mobile.putong.core.p058ui.profile.MediaReorderCardScaleIndependentFrame;
import p151v.VDraweeView;
import p151v.VFrame_Anim;
import p151v.VImage;
import p151v.VProgressBar;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class c5y {
    /* JADX INFO: renamed from: a */
    public static void m108085a(MediaReorderCard mediaReorderCard, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        mediaReorderCard.f33839r = (MediaReorderCardScaleIndependentFrame) viewGroup.getChildAt(0);
        mediaReorderCard.f33840s = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        mediaReorderCard.f33841t = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        mediaReorderCard.f33842u = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        mediaReorderCard.f33843v = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        mediaReorderCard.f33844w = (ShimmerLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        mediaReorderCard.f33845x = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0);
        mediaReorderCard.f33846y = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        mediaReorderCard.f33847z = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
        mediaReorderCard.f33802A = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6)).getChildAt(0)).getChildAt(0);
        mediaReorderCard.f33803B = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6)).getChildAt(2);
        mediaReorderCard.f33804C = (VFrame_Anim) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7);
        mediaReorderCard.f33805D = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7)).getChildAt(0);
        mediaReorderCard.f33806E = (VProgressBar) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7)).getChildAt(1);
        mediaReorderCard.f33808F = (VProgressBar) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7)).getChildAt(2);
        mediaReorderCard.f33810G = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7)).getChildAt(3);
        mediaReorderCard.f33812H = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(8);
    }
}
