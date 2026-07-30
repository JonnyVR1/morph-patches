package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.consumealert.ConsumeAlertDialog;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class jz5 {
    /* JADX INFO: renamed from: a */
    public static void m16451a(ConsumeAlertDialog consumeAlertDialog, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        consumeAlertDialog._alert_root = viewGroup.getChildAt(0);
        consumeAlertDialog._alert_icon = viewGroup.getChildAt(1);
        consumeAlertDialog._alert_title = (TextView) viewGroup.getChildAt(2);
        consumeAlertDialog._alert_sub_title = viewGroup.getChildAt(3);
        consumeAlertDialog._alert_check_box = viewGroup.getChildAt(4);
        consumeAlertDialog._alert_check_box_text = viewGroup.getChildAt(5);
        consumeAlertDialog._confirm_button = (TextView) viewGroup.getChildAt(6);
    }
}
