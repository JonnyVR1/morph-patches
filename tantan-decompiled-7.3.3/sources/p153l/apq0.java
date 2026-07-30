package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.p051p1.mobile.putong.core.newui.youthvip.view.YouthVipBasePrivilegeView;
import com.p051p1.mobile.putong.core.newui.youthvip.view.YouthVipLocationView;
import com.p051p1.mobile.putong.core.newui.youthvip.view.YouthVipStudentVerifyView;
import p151v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class apq0 {
    /* JADX INFO: renamed from: a */
    public static void m99367a(zoq0 zoq0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        zoq0Var._root_view = (VLinear) viewGroup.getChildAt(0);
        zoq0Var._nested_scroll_view = (NestedScrollView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        zoq0Var._content_container = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        zoq0Var._top_texture_bg = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        zoq0Var._top_title_container = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        zoq0Var._top_title = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        zoq0Var._top_sub_title = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(2);
        zoq0Var._youthvip_student_verify = (YouthVipStudentVerifyView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        zoq0Var._youthvip_location = (YouthVipLocationView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(3);
        zoq0Var._youthvip_daizi = (YouthVipBasePrivilegeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(4)).getChildAt(0);
        zoq0Var._youthvip_blindbox = (YouthVipBasePrivilegeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(4)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m99368b(zoq0 zoq0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(pec0.f152008k2, viewGroup, false);
        m99367a(zoq0Var, viewInflate);
        return viewInflate;
    }
}
