package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.external.intl.livesquare.fragments.followTab.IntlLiveFollowInfiltrationItemPicView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class run {
    /* JADX INFO: renamed from: a */
    public static void m180882a(IntlLiveFollowInfiltrationItemPicView intlLiveFollowInfiltrationItemPicView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlLiveFollowInfiltrationItemPicView._img = (VDraweeView) viewGroup.getChildAt(0);
        intlLiveFollowInfiltrationItemPicView._follow = (VImage) viewGroup.getChildAt(1);
        intlLiveFollowInfiltrationItemPicView._age = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        intlLiveFollowInfiltrationItemPicView._name = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        intlLiveFollowInfiltrationItemPicView._desc = (TextView) viewGroup.getChildAt(3);
    }
}
