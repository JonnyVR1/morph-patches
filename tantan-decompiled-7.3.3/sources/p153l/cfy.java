package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.newui.newmeet.feed.seecard.MeetSeeCardItem;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class cfy {
    /* JADX INFO: renamed from: a */
    public static void m109660a(MeetSeeCardItem meetSeeCardItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        meetSeeCardItem.f27020a = (VDraweeView) viewGroup.getChildAt(0);
        meetSeeCardItem.f27021b = (LinearLayout) viewGroup.getChildAt(1);
        meetSeeCardItem.f27022c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        meetSeeCardItem.f27023d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
