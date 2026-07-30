package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feedbottom.insert.FeedBottomAttitudeUsersView;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class lrg {
    /* JADX INFO: renamed from: a */
    public static void m155623a(FeedBottomAttitudeUsersView feedBottomAttitudeUsersView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedBottomAttitudeUsersView.f42622a = (VLinear) viewGroup.getChildAt(0);
        feedBottomAttitudeUsersView.f42623b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedBottomAttitudeUsersView.f42624c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
