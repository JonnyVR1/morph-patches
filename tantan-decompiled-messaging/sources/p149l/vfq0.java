package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.p046p1.mobile.putong.core.newui.youthvip.view.YouthVipBasePrivilegeView;
import com.p046p1.mobile.putong.core.newui.youthvip.view.YouthVipLocationView;
import com.p046p1.mobile.putong.core.newui.youthvip.view.YouthVipStudentVerifyView;
import p147v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class vfq0 {
    /* JADX INFO: renamed from: a */
    public static void m198287a(ufq0 ufq0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ufq0Var._root_view = (VLinear) viewGroup.getChildAt(0);
        ufq0Var._nested_scroll_view = (NestedScrollView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        ufq0Var._content_container = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        ufq0Var._top_texture_bg = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        ufq0Var._top_title_container = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        ufq0Var._top_title = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        ufq0Var._top_sub_title = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(2);
        ufq0Var._youthvip_student_verify = (YouthVipStudentVerifyView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        ufq0Var._youthvip_location = (YouthVipLocationView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(3);
        ufq0Var._youthvip_daizi = (YouthVipBasePrivilegeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(4)).getChildAt(0);
        ufq0Var._youthvip_blindbox = (YouthVipBasePrivilegeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(4)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m198288b(ufq0 ufq0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f121400k2, viewGroup, false);
        m198287a(ufq0Var, viewInflate);
        return viewInflate;
    }
}
