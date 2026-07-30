package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.livingroom.virtual.roomInfo.view.SvgAndImageView;
import p147v.VDraweeView;
import p147v.VLinear;

/* JADX INFO: loaded from: classes4.dex */
public class ful0 {
    /* JADX INFO: renamed from: a */
    public static void m123205a(eul0 eul0Var, View view) {
        eul0Var._root = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        eul0Var._bg = viewGroup.getChildAt(0);
        eul0Var._dialog_bg = (VDraweeView) viewGroup.getChildAt(1);
        eul0Var._top_view = viewGroup.getChildAt(2);
        eul0Var._back = (ImageView) viewGroup.getChildAt(3);
        eul0Var._title = (TextView) viewGroup.getChildAt(4);
        eul0Var._scroll_view = (ScrollView) viewGroup.getChildAt(5);
        eul0Var._heat_icon = (SvgAndImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(0);
        eul0Var._heat_title = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(1);
        eul0Var._heat_speed = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(2);
        eul0Var._heat_list = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(3);
    }
}
