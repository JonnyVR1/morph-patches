package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p1.mobile.putong.core.newui.newmeet.feed.likers.MeetLikersItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class h3y {
    /* JADX INFO: renamed from: a */
    public static void m6912a(MeetLikersItemView meetLikersItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        meetLikersItemView.a = viewGroup.getChildAt(0);
        meetLikersItemView.b = (RelativeLayout) viewGroup.getChildAt(1);
        meetLikersItemView.c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        meetLikersItemView.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        meetLikersItemView.e = viewGroup.getChildAt(2);
        meetLikersItemView.f = viewGroup.getChildAt(3);
    }
}
