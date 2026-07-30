package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.consumealert.ConsumeAlertDialog;
import p147v.VCheckBox;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class jz5 {
    /* JADX INFO: renamed from: a */
    public static void m143887a(ConsumeAlertDialog consumeAlertDialog, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        consumeAlertDialog._alert_root = viewGroup.getChildAt(0);
        consumeAlertDialog._alert_icon = (VImage) viewGroup.getChildAt(1);
        consumeAlertDialog._alert_title = (TextView) viewGroup.getChildAt(2);
        consumeAlertDialog._alert_sub_title = (VText) viewGroup.getChildAt(3);
        consumeAlertDialog._alert_check_box = (VCheckBox) viewGroup.getChildAt(4);
        consumeAlertDialog._alert_check_box_text = (VText) viewGroup.getChildAt(5);
        consumeAlertDialog._confirm_button = (TextView) viewGroup.getChildAt(6);
    }
}
