package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterVideoView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.live.LiveTagView;
import com.p000p1.mobile.putong.feed.newui.preview.gesture.PlayerViewWithTransAnim;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class tsg {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m14665a(ssg ssgVar, View view) {
        ssgVar.f13046a = (FeedCenterVideoView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ssgVar.f13047b = viewGroup.getChildAt(0);
        ssgVar.f13048c = viewGroup.getChildAt(1);
        ssgVar.f13049d = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        ssgVar.f13050e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        ssgVar.f13051f = viewGroup.getChildAt(2);
        ssgVar.f13052g = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        ssgVar.f13053h = (LiveTagView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        ssgVar.f13054i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        ssgVar.f13055j = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2);
        ssgVar.f13056k = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        ssgVar.f13057l = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        ssgVar.f13058m = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        ssgVar.f13059n = (PlayerViewWithTransAnim) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4)).getChildAt(0);
        ssgVar.f13060o = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4)).getChildAt(1);
        ssgVar.f13061p = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4)).getChildAt(1)).getChildAt(0);
        ssgVar.f13062q = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4)).getChildAt(1)).getChildAt(1);
        ssgVar.f13063r = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4)).getChildAt(1)).getChildAt(2);
        ssgVar.f13064s = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4)).getChildAt(2);
        ssgVar.f13065t = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4)).getChildAt(3);
        ssgVar.f13066u = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4)).getChildAt(3)).getChildAt(1);
        ssgVar.f13067v = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4)).getChildAt(3)).getChildAt(1)).getChildAt(0);
        ssgVar.f13068w = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4)).getChildAt(3)).getChildAt(1)).getChildAt(1);
        ssgVar.f13069x = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4)).getChildAt(4);
        ssgVar.f13070y = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(5);
        ssgVar.f13071z = viewGroup.getChildAt(3);
    }
}
