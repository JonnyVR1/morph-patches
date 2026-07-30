package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.newui.youthvip.view.YouthVipStudentVerifyView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class ofq0 {
    /* JADX INFO: renamed from: a */
    public static void m164107a(YouthVipStudentVerifyView youthVipStudentVerifyView, View view) {
        youthVipStudentVerifyView._root_view = (YouthVipStudentVerifyView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        youthVipStudentVerifyView._user_head = (VDraweeView) viewGroup.getChildAt(0);
        youthVipStudentVerifyView._to_verify_btn = (TextView) viewGroup.getChildAt(1);
        youthVipStudentVerifyView._title = (TextView) viewGroup.getChildAt(2);
        youthVipStudentVerifyView._subtitle = (TextView) viewGroup.getChildAt(3);
    }
}
