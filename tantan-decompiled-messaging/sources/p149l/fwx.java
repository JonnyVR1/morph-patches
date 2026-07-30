package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.newui.view.ShimmerLayout;
import com.p046p1.mobile.putong.core.p053ui.profile.MediaReorderCard;
import com.p046p1.mobile.putong.core.p053ui.profile.MediaReorderCardScaleIndependentFrame;
import p147v.VDraweeView;
import p147v.VFrame_Anim;
import p147v.VImage;
import p147v.VProgressBar;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class fwx {
    /* JADX INFO: renamed from: a */
    public static void m123577a(MediaReorderCard mediaReorderCard, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        mediaReorderCard.f32991r = (MediaReorderCardScaleIndependentFrame) viewGroup.getChildAt(0);
        mediaReorderCard.f32992s = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        mediaReorderCard.f32993t = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        mediaReorderCard.f32994u = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        mediaReorderCard.f32995v = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        mediaReorderCard.f32996w = (ShimmerLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        mediaReorderCard.f32997x = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0);
        mediaReorderCard.f32998y = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        mediaReorderCard.f32999z = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
        mediaReorderCard.f32954A = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6)).getChildAt(0)).getChildAt(0);
        mediaReorderCard.f32955B = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6)).getChildAt(2);
        mediaReorderCard.f32956C = (VFrame_Anim) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7);
        mediaReorderCard.f32957D = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7)).getChildAt(0);
        mediaReorderCard.f32958E = (VProgressBar) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7)).getChildAt(1);
        mediaReorderCard.f32960F = (VProgressBar) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7)).getChildAt(2);
        mediaReorderCard.f32962G = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7)).getChildAt(3);
        mediaReorderCard.f32964H = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(8);
    }
}
