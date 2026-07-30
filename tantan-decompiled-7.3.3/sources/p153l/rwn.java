package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.external.intl.livesquare.fragments.followTab.IntlLiveFollowInfiltrationItemPicView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class rwn {
    /* JADX INFO: renamed from: a */
    public static void m183371a(IntlLiveFollowInfiltrationItemPicView intlLiveFollowInfiltrationItemPicView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlLiveFollowInfiltrationItemPicView._img = (VDraweeView) viewGroup.getChildAt(0);
        intlLiveFollowInfiltrationItemPicView._follow = (VImage) viewGroup.getChildAt(1);
        intlLiveFollowInfiltrationItemPicView._age = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        intlLiveFollowInfiltrationItemPicView._name = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        intlLiveFollowInfiltrationItemPicView._desc = (TextView) viewGroup.getChildAt(3);
    }
}
