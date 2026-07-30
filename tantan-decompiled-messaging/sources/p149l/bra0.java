package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.core.p053ui.profile.views.ProfileRecentlyNewItem;
import p147v.AutoVDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class bra0 {
    /* JADX INFO: renamed from: a */
    public static void m103526a(ProfileRecentlyNewItem profileRecentlyNewItem, View view) {
        profileRecentlyNewItem.f34208a = (ProfileRecentlyNewItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        profileRecentlyNewItem.f34209b = (RelativeLayout) viewGroup.getChildAt(0);
        profileRecentlyNewItem.f34210c = (AutoVDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        profileRecentlyNewItem.f34211d = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        profileRecentlyNewItem.f34212e = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        profileRecentlyNewItem.f34213f = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0);
        profileRecentlyNewItem.f34214g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(1);
        profileRecentlyNewItem.f34215h = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        profileRecentlyNewItem.f34216i = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
        profileRecentlyNewItem.f34217j = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7);
        profileRecentlyNewItem.f34218k = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(8);
        profileRecentlyNewItem.f34219l = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(9);
        profileRecentlyNewItem.f34220m = viewGroup.getChildAt(1);
        profileRecentlyNewItem.f34221n = (FrameLayout) viewGroup.getChildAt(2);
    }
}
