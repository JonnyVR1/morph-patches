package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.roundcorners.view.RoundRelativeLayout;
import com.p051p1.mobile.putong.core.p058ui.roundcorners.view.RoundView;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class fx60 {
    /* JADX INFO: renamed from: a */
    public static void m127930a(ex60 ex60Var, View view) {
        ex60Var._root_layout = (RoundRelativeLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ex60Var._img_bg_decoration = (VDraweeView) viewGroup.getChildAt(0);
        ex60Var._top = (RoundView) viewGroup.getChildAt(1);
        ex60Var._image_container = (VFrame) viewGroup.getChildAt(2);
        ex60Var._image_container_img_bg = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        ex60Var._image_container_img = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        ex60Var._image_container_star_img = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        ex60Var._peg_tag = (VDraweeView) viewGroup.getChildAt(3);
        ex60Var._title = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        ex60Var._desc_img = (VImage) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        ex60Var._desc = (TextView) viewGroup.getChildAt(5);
        ex60Var._bt = (VButton) viewGroup.getChildAt(6);
    }
}
