package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Group;
import com.p051p1.mobile.putong.live.livingroom.increment.recharge.PayItemView;
import p151v.VImage;
import p151v.VRadioButton;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class pk60 {
    /* JADX INFO: renamed from: a */
    public static void m172589a(PayItemView payItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        payItemView.f51764d = (Group) viewGroup.getChildAt(0);
        payItemView.f51765e = (VImage) viewGroup.getChildAt(1);
        payItemView.f51766f = (VText) viewGroup.getChildAt(2);
        payItemView.f51767g = (VImage) viewGroup.getChildAt(3);
        payItemView.f51768h = (VRadioButton) viewGroup.getChildAt(4);
    }
}
