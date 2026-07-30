package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.p058ui.vip.likers.LikersBigCardItemView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear_FillerMeasure;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ekr {
    /* JADX INFO: renamed from: a */
    public static void m121067a(LikersBigCardItemView likersBigCardItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        likersBigCardItemView.f38103a = (VDraweeView) viewGroup.getChildAt(0);
        likersBigCardItemView.f38104b = (VText) viewGroup.getChildAt(1);
        likersBigCardItemView.f38105c = (LinearLayout) viewGroup.getChildAt(2);
        likersBigCardItemView.f38106d = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        likersBigCardItemView.f38107e = (VImage) viewGroup.getChildAt(3);
        likersBigCardItemView.f38108f = (VImage) viewGroup.getChildAt(4);
        likersBigCardItemView.f38109g = (ConstraintLayout) viewGroup.getChildAt(5);
        likersBigCardItemView.f38110h = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        likersBigCardItemView.f38111i = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(0);
        likersBigCardItemView.f38112j = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(1);
        likersBigCardItemView.f38113k = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1)).getChildAt(0);
        likersBigCardItemView.f38114l = (VLinear_FillerMeasure) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1)).getChildAt(1);
        likersBigCardItemView.f38115m = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        likersBigCardItemView.f38116n = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        likersBigCardItemView.f38117o = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1)).getChildAt(2);
        likersBigCardItemView.f38118p = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1)).getChildAt(3);
    }
}
