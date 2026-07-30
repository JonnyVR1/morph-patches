package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.feed.p065ui.moments.MomentsInProfileViewLarge;
import p151v.VDraweeView;
import p151v.VFrame_Anim;
import p151v.VProgressBar;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class p010 {
    /* JADX INFO: renamed from: a */
    public static void m170020a(MomentsInProfileViewLarge momentsInProfileViewLarge, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        momentsInProfileViewLarge.f44804c = (VFrame_Anim) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        momentsInProfileViewLarge.f44805d = (VProgressBar) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        momentsInProfileViewLarge.f44806e = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        momentsInProfileViewLarge.f44807f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        momentsInProfileViewLarge.f44808g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        momentsInProfileViewLarge.f44809h = (LinearLayout) viewGroup.getChildAt(1);
        momentsInProfileViewLarge.f44810i = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        momentsInProfileViewLarge.f44811j = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        momentsInProfileViewLarge.f44812k = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
