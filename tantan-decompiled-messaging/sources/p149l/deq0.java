package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.newui.youthvip.view.YouthVipBasePrivilegeView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class deq0 {
    /* JADX INFO: renamed from: a */
    public static void m111389a(YouthVipBasePrivilegeView youthVipBasePrivilegeView, View view) {
        youthVipBasePrivilegeView._root_view = (YouthVipBasePrivilegeView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        youthVipBasePrivilegeView._texture = (VDraweeView) viewGroup.getChildAt(0);
        youthVipBasePrivilegeView._icon = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        youthVipBasePrivilegeView._title = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        youthVipBasePrivilegeView._subtitle = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        youthVipBasePrivilegeView._model_icon = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        youthVipBasePrivilegeView._go_btn = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
    }
}
