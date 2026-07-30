package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.newmeet.header.MeetStateHeaderItem;
import p147v.VDraweeView;
import p147v.VIcon;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class z6y {
    /* JADX INFO: renamed from: a */
    public static void m217425a(MeetStateHeaderItem meetStateHeaderItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        meetStateHeaderItem.f26326c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        meetStateHeaderItem.f26327d = (VIcon) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        meetStateHeaderItem.f26328e = (VText) viewGroup.getChildAt(1);
        meetStateHeaderItem.f26329f = (VText) viewGroup.getChildAt(2);
    }
}
