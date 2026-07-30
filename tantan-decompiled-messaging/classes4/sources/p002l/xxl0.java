package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.live.livingroom.virtual.userCard.dressup.VirtualUserDressUpItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class xxl0 {
    /* JADX INFO: renamed from: a */
    public static void m26175a(VirtualUserDressUpItemView virtualUserDressUpItemView, View view) {
        virtualUserDressUpItemView.a = (VirtualUserDressUpItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        virtualUserDressUpItemView.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        virtualUserDressUpItemView.c = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        virtualUserDressUpItemView.d = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        virtualUserDressUpItemView.e = (TextView) viewGroup.getChildAt(2);
    }
}
