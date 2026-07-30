package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.newmeet.header.MeetStateHeaderItem;
import p151v.VDraweeView;
import p151v.VIcon;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class wfy {
    /* JADX INFO: renamed from: a */
    public static void m206173a(MeetStateHeaderItem meetStateHeaderItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        meetStateHeaderItem.f27068c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        meetStateHeaderItem.f27069d = (VIcon) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        meetStateHeaderItem.f27070e = (VText) viewGroup.getChildAt(1);
        meetStateHeaderItem.f27071f = (VText) viewGroup.getChildAt(2);
    }
}
