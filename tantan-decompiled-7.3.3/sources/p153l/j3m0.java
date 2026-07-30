package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.livingroom.virtual.roomInfo.view.SvgAndImageView;
import p151v.VDraweeView;
import p151v.VLinear;

/* JADX INFO: loaded from: classes4.dex */
public class j3m0 {
    /* JADX INFO: renamed from: a */
    public static void m143361a(i3m0 i3m0Var, View view) {
        i3m0Var._root = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        i3m0Var._bg = viewGroup.getChildAt(0);
        i3m0Var._dialog_bg = (VDraweeView) viewGroup.getChildAt(1);
        i3m0Var._top_view = viewGroup.getChildAt(2);
        i3m0Var._back = (ImageView) viewGroup.getChildAt(3);
        i3m0Var._title = (TextView) viewGroup.getChildAt(4);
        i3m0Var._scroll_view = (ScrollView) viewGroup.getChildAt(5);
        i3m0Var._heat_icon = (SvgAndImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(0);
        i3m0Var._heat_title = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(1);
        i3m0Var._heat_speed = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(2);
        i3m0Var._heat_list = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(3);
    }
}
