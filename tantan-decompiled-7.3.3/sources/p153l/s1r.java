package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.p058ui.messages.Keyboard;
import p151v.VButton_FakeShadow;
import p151v.VFrame;
import p151v.VList_Horizontal;
import p151v.VPager;
import p151v.VPagerCircleIndicator;

/* JADX INFO: loaded from: classes10.dex */
public class s1r {
    /* JADX INFO: renamed from: a */
    public static void m184056a(Keyboard keyboard, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        keyboard.f32408f = (VPager) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        keyboard.f32409g = (VPagerCircleIndicator) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        keyboard.f32410h = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        keyboard.f32411i = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        keyboard.f32412j = (VList_Horizontal) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        keyboard.f32413k = (VFrame) viewGroup.getChildAt(1);
        keyboard.f32414l = (VFrame) viewGroup.getChildAt(2);
        keyboard.f32415m = (VButton_FakeShadow) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
    }
}
