package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Group;
import com.p046p1.mobile.putong.live.livingroom.increment.recharge.PayItemView;
import p147v.VImage;
import p147v.VRadioButton;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class kc60 {
    /* JADX INFO: renamed from: a */
    public static void m145347a(PayItemView payItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        payItemView.f50916d = (Group) viewGroup.getChildAt(0);
        payItemView.f50917e = (VImage) viewGroup.getChildAt(1);
        payItemView.f50918f = (VText) viewGroup.getChildAt(2);
        payItemView.f50919g = (VImage) viewGroup.getChildAt(3);
        payItemView.f50920h = (VRadioButton) viewGroup.getChildAt(4);
    }
}
