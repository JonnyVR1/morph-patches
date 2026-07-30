package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p1.mobile.putong.core.newui.youthvip.view.YouthVipBasePrivilegeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class deq0 {
    /* JADX INFO: renamed from: a */
    public static void m6112a(YouthVipBasePrivilegeView youthVipBasePrivilegeView, View view) {
        youthVipBasePrivilegeView.a = (YouthVipBasePrivilegeView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        youthVipBasePrivilegeView.b = viewGroup.getChildAt(0);
        youthVipBasePrivilegeView.c = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        youthVipBasePrivilegeView.d = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        youthVipBasePrivilegeView.e = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        youthVipBasePrivilegeView.f = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        youthVipBasePrivilegeView.g = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
    }
}
