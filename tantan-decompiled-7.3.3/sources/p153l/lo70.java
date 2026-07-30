package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.vip.picks.view.header.PicksStateHideView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class lo70 {
    /* JADX INFO: renamed from: a */
    public static void m155042a(PicksStateHideView picksStateHideView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        picksStateHideView._avatar = (VDraweeView) viewGroup.getChildAt(0);
        picksStateHideView._title = (VText) viewGroup.getChildAt(1);
        picksStateHideView._title_icon = (VImage) viewGroup.getChildAt(2);
        picksStateHideView._subtitle = (VText) viewGroup.getChildAt(3);
        picksStateHideView._more = (VText) viewGroup.getChildAt(4);
    }
}
