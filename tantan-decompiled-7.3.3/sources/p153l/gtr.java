package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.external.view.widgets.LiveActivitiesInfiltrationItemPicView;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;

/* JADX INFO: loaded from: classes9.dex */
public class gtr {
    /* JADX INFO: renamed from: a */
    public static void m132255a(LiveActivitiesInfiltrationItemPicView liveActivitiesInfiltrationItemPicView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveActivitiesInfiltrationItemPicView._img = (VDraweeView) viewGroup.getChildAt(0);
        liveActivitiesInfiltrationItemPicView._cover = (VFrame) viewGroup.getChildAt(1);
        liveActivitiesInfiltrationItemPicView._follow = (VImage) viewGroup.getChildAt(2);
        liveActivitiesInfiltrationItemPicView._name = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        liveActivitiesInfiltrationItemPicView._desc = (TextView) viewGroup.getChildAt(4);
    }
}
