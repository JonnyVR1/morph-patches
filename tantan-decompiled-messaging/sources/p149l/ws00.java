package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.feed.p060ui.moments.MomentsInProfileView;
import p147v.VFrame_Anim;
import p147v.VProgressBar;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class ws00 {
    /* JADX INFO: renamed from: a */
    public static void m205336a(MomentsInProfileView momentsInProfileView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        momentsInProfileView.f43944c = (VFrame_Anim) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        momentsInProfileView.f43945d = (VProgressBar) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        momentsInProfileView.f43946e = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        momentsInProfileView.f43947f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        momentsInProfileView.f43948g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        momentsInProfileView.f43949h = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        momentsInProfileView.f43950i = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        momentsInProfileView.f43951j = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        momentsInProfileView.f43952k = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
