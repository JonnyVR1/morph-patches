package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.core.p053ui.PictureView;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VFrame_ColorFilter;
import p147v.VImage;
import p147v.VLinear;
import p147v.VProgressBar;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class bi70 {
    /* JADX INFO: renamed from: a */
    public static void m101987a(PictureView pictureView, View view) {
        pictureView.f28070a = (VDraweeView) view.findViewById(u4c0.f173909L5);
        pictureView.f28071b = (VDraweeView) view.findViewById(u4c0.f174093W5);
        ViewGroup viewGroup = (ViewGroup) view;
        pictureView.f28072c = viewGroup.getChildAt(2);
        pictureView.f28073d = (LinearLayout) viewGroup.getChildAt(3);
        pictureView.f28074e = (VImage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        pictureView.f28075f = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        pictureView.f28076g = (VFrame_ColorFilter) view.findViewById(u4c0.f173955O0);
        pictureView.f28077h = (VImage) view.findViewById(u4c0.f174399oa);
        pictureView.f28078i = (VProgressBar) view.findViewById(u4c0.f173775D7);
        pictureView.f28079j = (VImage) view.findViewById(u4c0.f174449r9);
        pictureView.f28080k = (LinearLayout) view.findViewById(u4c0.f173995Q6);
        pictureView.f28082l = (VText) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        pictureView.f28083m = (VText) view.findViewById(u4c0.f174331ka);
        pictureView.f28084n = (VImage) view.findViewById(u4c0.f174465s8);
        pictureView.f28085o = (VText) view.findViewById(u4c0.f174398o9);
        pictureView.f28086p = (LinearLayout) view.findViewById(u4c0.f174225e5);
        pictureView.f28088q = (VText) view.findViewById(u4c0.f174259g5);
        pictureView.f28089r = (VText) view.findViewById(u4c0.f174242f5);
        pictureView.f28090s = (VLinear) viewGroup.getChildAt(7);
        pictureView.f28091t = (VImage) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(0);
        pictureView.f28092u = (VText) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(1);
        pictureView.f28093v = (VText) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(2);
        pictureView.f28094w = (VImage) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(3);
        pictureView.f28095x = (VText) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(4);
        pictureView.f28096y = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(5);
        pictureView.f28097z = (VButton) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(5)).getChildAt(0);
        pictureView.f28032A = (LinearLayout) viewGroup.getChildAt(8);
        pictureView.f28033B = ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(0);
        pictureView.f28034C = (ImageView) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(1);
        pictureView.f28035D = (VDraweeView) viewGroup.getChildAt(9);
    }
}
