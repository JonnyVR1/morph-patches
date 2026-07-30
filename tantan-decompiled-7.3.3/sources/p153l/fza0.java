package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.core.p058ui.profile.views.ProfileRecentlyNewItem;
import p151v.AutoVDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class fza0 {
    /* JADX INFO: renamed from: a */
    public static void m128147a(ProfileRecentlyNewItem profileRecentlyNewItem, View view) {
        profileRecentlyNewItem.f35056a = (ProfileRecentlyNewItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        profileRecentlyNewItem.f35057b = (RelativeLayout) viewGroup.getChildAt(0);
        profileRecentlyNewItem.f35058c = (AutoVDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        profileRecentlyNewItem.f35059d = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        profileRecentlyNewItem.f35060e = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        profileRecentlyNewItem.f35061f = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0);
        profileRecentlyNewItem.f35062g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(1);
        profileRecentlyNewItem.f35063h = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        profileRecentlyNewItem.f35064i = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
        profileRecentlyNewItem.f35065j = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7);
        profileRecentlyNewItem.f35066k = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(8);
        profileRecentlyNewItem.f35067l = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(9);
        profileRecentlyNewItem.f35068m = viewGroup.getChildAt(1);
        profileRecentlyNewItem.f35069n = (FrameLayout) viewGroup.getChildAt(2);
    }
}
