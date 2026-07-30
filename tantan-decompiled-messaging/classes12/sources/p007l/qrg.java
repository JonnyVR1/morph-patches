package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterForwardVideoView;
import com.p000p1.mobile.putong.feed.newui.preview.gesture.PlayerViewWithTransAnim;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class qrg {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m13697a(prg prgVar, View view) {
        prgVar.f11949a = (FeedCenterForwardVideoView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        prgVar.f11950b = viewGroup.getChildAt(0);
        prgVar.f11951c = viewGroup.getChildAt(1);
        prgVar.f11952d = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        prgVar.f11953e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        prgVar.f11954f = viewGroup.getChildAt(2);
        prgVar.f11955g = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        prgVar.f11956h = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        prgVar.f11957i = (RelativeLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0);
        prgVar.f11958j = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        prgVar.f11959k = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        prgVar.f11960l = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(1);
        prgVar.f11961m = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(1)).getChildAt(0);
        prgVar.f11962n = (PlayerViewWithTransAnim) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        prgVar.f11963o = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        prgVar.f11964p = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        prgVar.f11965q = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        prgVar.f11966r = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(2);
        prgVar.f11967s = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        prgVar.f11968t = viewGroup.getChildAt(3);
    }
}
