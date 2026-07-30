package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.core.p053ui.vip.likers.LikersBigCardItemView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear_FillerMeasure;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class dir {
    /* JADX INFO: renamed from: a */
    public static void m111908a(LikersBigCardItemView likersBigCardItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        likersBigCardItemView.f37255a = (VDraweeView) viewGroup.getChildAt(0);
        likersBigCardItemView.f37256b = (VText) viewGroup.getChildAt(1);
        likersBigCardItemView.f37257c = (LinearLayout) viewGroup.getChildAt(2);
        likersBigCardItemView.f37258d = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        likersBigCardItemView.f37259e = (VImage) viewGroup.getChildAt(3);
        likersBigCardItemView.f37260f = (VImage) viewGroup.getChildAt(4);
        likersBigCardItemView.f37261g = (ConstraintLayout) viewGroup.getChildAt(5);
        likersBigCardItemView.f37262h = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        likersBigCardItemView.f37263i = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(0);
        likersBigCardItemView.f37264j = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(1);
        likersBigCardItemView.f37265k = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1)).getChildAt(0);
        likersBigCardItemView.f37266l = (VLinear_FillerMeasure) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1)).getChildAt(1);
        likersBigCardItemView.f37267m = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        likersBigCardItemView.f37268n = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        likersBigCardItemView.f37269o = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1)).getChildAt(2);
        likersBigCardItemView.f37270p = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1)).getChildAt(3);
    }
}
