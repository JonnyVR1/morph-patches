package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feedbottom.insert.FeedBottomAttitudeUsersView;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class wpg {
    /* JADX INFO: renamed from: a */
    public static void m204909a(FeedBottomAttitudeUsersView feedBottomAttitudeUsersView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedBottomAttitudeUsersView.f41774a = (VLinear) viewGroup.getChildAt(0);
        feedBottomAttitudeUsersView.f41775b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedBottomAttitudeUsersView.f41776c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
