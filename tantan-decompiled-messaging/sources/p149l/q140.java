package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.newui.NewPictureView;
import p147v.VDraweeView;
import p147v.VFrame_ColorFilter;
import p147v.VImage;
import p147v.VProgressBar;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class q140 {
    /* JADX INFO: renamed from: a */
    public static void m172372a(NewPictureView newPictureView, View view) {
        newPictureView.f21229a = (VDraweeView) view.findViewById(u4c0.f173909L5);
        newPictureView.f21230b = (VFrame_ColorFilter) view.findViewById(u4c0.f173955O0);
        newPictureView.f21231c = (ImageView) view.findViewById(u4c0.f174399oa);
        newPictureView.f21232d = (VProgressBar) view.findViewById(u4c0.f173775D7);
        newPictureView.f21233e = (ImageView) view.findViewById(u4c0.f174449r9);
        newPictureView.f21234f = (LinearLayout) view.findViewById(u4c0.f173995Q6);
        ViewGroup viewGroup = (ViewGroup) view;
        newPictureView.f21235g = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        newPictureView.f21236h = (VText) view.findViewById(u4c0.f174331ka);
        newPictureView.f21237i = (VImage) view.findViewById(u4c0.f174465s8);
        newPictureView.f21238j = (VText) view.findViewById(u4c0.f174398o9);
        newPictureView.f21239k = (LinearLayout) viewGroup.getChildAt(3);
        newPictureView.f21240l = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        newPictureView.f21241m = (VImage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
    }
}
