package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import p151v.VDraweeView;
import p151v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class ge3 {
    /* JADX INFO: renamed from: a */
    public static void m129965a(fe3 fe3Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        fe3Var._shadow = viewGroup.getChildAt(0);
        fe3Var._root = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        fe3Var._content = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        fe3Var._desc = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        fe3Var._one = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        fe3Var._one_one_avatar = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        fe3Var._one_one_text = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        fe3Var._two = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(1);
        fe3Var._two_two_avatar = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(0);
        fe3Var._two_two_text = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(1);
        fe3Var._three = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(2);
        fe3Var._three_three_avatar = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(2)).getChildAt(0);
        fe3Var._three_three_text = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(2)).getChildAt(1);
        fe3Var._button = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3);
        fe3Var._avatar = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        fe3Var._close = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}
