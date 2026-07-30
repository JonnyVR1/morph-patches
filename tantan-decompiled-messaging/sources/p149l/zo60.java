package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.roundcorners.view.RoundRelativeLayout;
import com.p046p1.mobile.putong.core.p053ui.roundcorners.view.RoundView;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class zo60 {
    /* JADX INFO: renamed from: a */
    public static void m219556a(yo60 yo60Var, View view) {
        yo60Var._root_layout = (RoundRelativeLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        yo60Var._img_bg_decoration = (VDraweeView) viewGroup.getChildAt(0);
        yo60Var._top = (RoundView) viewGroup.getChildAt(1);
        yo60Var._image_container = (VFrame) viewGroup.getChildAt(2);
        yo60Var._image_container_img_bg = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        yo60Var._image_container_img = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        yo60Var._image_container_star_img = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        yo60Var._peg_tag = (VDraweeView) viewGroup.getChildAt(3);
        yo60Var._title = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        yo60Var._desc_img = (VImage) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        yo60Var._desc = (TextView) viewGroup.getChildAt(5);
        yo60Var._bt = (VButton) viewGroup.getChildAt(6);
    }
}
