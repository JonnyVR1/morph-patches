package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.newui.newmeet.header.MeetStateHeaderItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class z6y {
    /* JADX INFO: renamed from: a */
    public static void m11353a(MeetStateHeaderItem meetStateHeaderItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        meetStateHeaderItem.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        meetStateHeaderItem.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        meetStateHeaderItem.e = viewGroup.getChildAt(1);
        meetStateHeaderItem.f = viewGroup.getChildAt(2);
    }
}
