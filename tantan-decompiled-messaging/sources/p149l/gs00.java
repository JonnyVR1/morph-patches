package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.feed.p060ui.moments.MomentsInProfileViewLarge;
import p147v.VDraweeView;
import p147v.VFrame_Anim;
import p147v.VProgressBar;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class gs00 {
    /* JADX INFO: renamed from: a */
    public static void m127776a(MomentsInProfileViewLarge momentsInProfileViewLarge, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        momentsInProfileViewLarge.f43956c = (VFrame_Anim) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        momentsInProfileViewLarge.f43957d = (VProgressBar) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        momentsInProfileViewLarge.f43958e = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        momentsInProfileViewLarge.f43959f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        momentsInProfileViewLarge.f43960g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        momentsInProfileViewLarge.f43961h = (LinearLayout) viewGroup.getChildAt(1);
        momentsInProfileViewLarge.f43962i = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        momentsInProfileViewLarge.f43963j = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        momentsInProfileViewLarge.f43964k = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
